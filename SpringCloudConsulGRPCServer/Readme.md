# Consul
## 概念
* Client
    * 客户端模式，所有注册到Client节点的服务会被转发到Server。本身无状态，不持久化数据。Client通过HTTP、DNS、GRPC接口请求转发给局域网内的服务端集群。
* Server
    * 服务端模式，和Client功能一样，不同的是Server持久化数据到本地。在局域网内与本地Client通讯，通过广域网与其他数据中心通讯。每个数据中心的Server数量推荐为3个或是5个。
* Server-Leader
    * Server领导者，负责同步注册信息给其它的Server节点，同时也要负责各个节点的健康监测。如果Leader宕机了，通数据中心的所有Server内部会使用Raft算法来在其中选取一个Leader出来。
* Agent
    * Consul的核心进程，负责维护成员关系信息、注册服务、健康检查、响应查询等等。Consul集群的每一个节点都必须运行agent进程。
## 安装
### 1.拉取镜像
`sudo docker pull consul`
### 2.启动Consul
`sudo docker run -d -p 8500:8500 -v /data/consul:/consul/data -e CONSUL_BIND_INTERFACE='eth0' --name=consul_server_1 consul:latest agent -server -bootstrap -ui -node=1 -client='0.0.0.0'`
* `-v /data/consul:/consul/data`：指定Consul数据持久化目录
* `agent`：启动Agent进程
* `-server`：启动Consul Server模式
* `-client`：启动Consul Client模式
* `-bootstrap`：表示这个节点是Server-Leader，每个数据中心只能运行一台服务器。技术角度上讲Leader是通过Raft算法选举的，但是集群第一次启动时需要一个引导Leader，在引导群集后，建议不要使用此标志。
* `-ui`：启动Web UI管理器，默认开放端口8500，所以上面使用Docker命令把8500端口对外开放。
* `-node`：节点的名称，集群中必须是唯一的。
* `-client`：Consul将绑定客户端接口的地址，0.0.0.0表示所有地址都可以访问。
* `-join`：表示加入到某一个集群中去。如：-json=192.168.1.23
### 3.启动Web管理器
>Http://{serverIp}:8500
### 4.Server加入集群
* 查看当前运行Consul集群信息   
`sudo docker exec consul_server_1 consul members`   
* 加入集群，命名为-node=2、-node=3。上面通过命令获取到引导Consul的Ip地址172.17.0.2   
`sudo docker run -d -e CONSUL_BIND_INTERFACE='eth0' --name=consul_server_2 consul:latest agent -server -node=2  -join='172.17.0.2'`   
`sudo docker run -d -e CONSUL_BIND_INTERFACE='eth0' --name=consul_server_3 consul:latest agent -server -node=3  -join='172.17.0.2'`   
### 4.Client加入集群
* 加入集群  
`sudo docker run -d -e CONSUL_BIND_INTERFACE='eth0' --name=consul_server_4 consul:latest agent -client -node=4 -join='172.17.0.2' -client='0.0.0.0'`   
`sudo docker run -d -e CONSUL_BIND_INTERFACE='eth0' --name=consul_server_5 consul:latest agent -client -node=5 -join='172.17.0.2' -client='0.0.0.0'`   
`sudo docker run -d -e CONSUL_BIND_INTERFACE='eth0' --name=consul_server_6 consul:latest agent -client -node=5 -join='172.17.0.2' -client='0.0.0.0'`   
* 检查Client是否加入集群中  
`sudo docker exec consul_server_1 consul members Node Address Status Type Build Protocol DC Segment 1 `