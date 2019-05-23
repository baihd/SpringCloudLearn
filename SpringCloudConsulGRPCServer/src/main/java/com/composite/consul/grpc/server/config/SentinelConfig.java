package com.composite.consul.grpc.server.config;

import com.alibaba.csp.sentinel.annotation.aspectj.SentinelResourceAspect;
import com.alibaba.csp.sentinel.init.InitExecutor;
import com.alibaba.csp.sentinel.slots.block.RuleConstant;
import com.alibaba.csp.sentinel.slots.block.degrade.DegradeRule;
import com.alibaba.csp.sentinel.slots.block.degrade.DegradeRuleManager;
import com.alibaba.csp.sentinel.slots.block.flow.FlowRule;
import com.alibaba.csp.sentinel.slots.block.flow.FlowRuleManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Configuration
public class SentinelConfig {

    private static final String RES_KEY = "getUser";

    @Bean
    public SentinelResourceAspect sentinelResourceAspect() {
        return new SentinelResourceAspect();
    }

    @PostConstruct
    public void init(){
//        initFlowRule();
        initDegradeRule();
    }

    private static void initFlowRule() {
        List<FlowRule> flowRules = new ArrayList<>();
        FlowRule flowRule = new FlowRule();
        //设置资源名，即限流规则的作用对象
        flowRule.setResource(RES_KEY);
        //设置限流阈值，当我们定义的是流量控制规则是根据QPS进行限流时，它表示QPS的阈值；如果是根据线程数限流，它表示线程数
        flowRule.setCount(2);
        //设置限流阈值类型，是QPS还是线程数
        flowRule.setGrade(RuleConstant.FLOW_GRADE_QPS);
        flowRule.setLimitApp("default");
        //流量控制模式，默认超过阈值是直接拒绝，如果设置为匀速器模式等待则还需要设置maxQueueingTimeMs（最大排队时间）。
        flowRule.setControlBehavior(RuleConstant.CONTROL_BEHAVIOR_DEFAULT);
        flowRules.add(flowRule);
        FlowRuleManager.loadRules(flowRules);
    }
    //降级策略
    //平均响应时间(DEGRADE_GRADE_RT)：当资源的平均响应时间超过阈值（DegradeRule中的count，以ms为单位）之后，资源进入准降级状态。
    //接下来如果持续进入5个请求，它们的RT都持续超过这个阈值，那么在接下的时间窗口（DegradeRule中的timeWindow，以s为单位）之内，
    // 对这个方法的调用都会自动地返回（抛出 DegradeException）

    //异常比例(DEGRADE_GRADE_EXCEPTION_RATIO)：当资源的每秒异常总数占通过量的比值超过阈值（DegradeRule中的count）之后，
    //资源进入降级状态，即在接下的时间窗口（DegradeRule中的timeWindow，以s为单位）之内，对这个方法的调用都会自动地返回。
    //异常比率的阈值范围是 [0.0, 1.0]，代表 0% - 100%。

    //异常数(DEGRADE_GRADE_EXCEPTION_COUNT)：当资源近1分钟的异常数目超过阈值之后会进行熔断。
    //注意：异常降级仅针对业务异常，对Sentinel限流降级本身的异常（BlockException）不生效。
    //为了统计异常比例或异常数，需要通过Tracer.trace(ex)记录业务异常。
    private static void initDegradeRule() {
        List<DegradeRule> degradeRules = new ArrayList<>();
        DegradeRule degradeRule = new DegradeRule();
        degradeRule.setResource(RES_KEY);
        //降级阈值
        degradeRule.setCount(1000);
        //设置降级阈值类型，是QPS还是线程数
        degradeRule.setGrade(RuleConstant.DEGRADE_GRADE_RT);
        //在接下的时间窗口（以s为单位）之内对这个方法的调用都会自动地返回
        degradeRule.setTimeWindow(20);
        degradeRules.add(degradeRule);
        DegradeRuleManager.loadRules(degradeRules);
    }
}
