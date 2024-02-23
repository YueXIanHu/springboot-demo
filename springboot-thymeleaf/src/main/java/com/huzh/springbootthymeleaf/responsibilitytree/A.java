package com.huzh.springbootthymeleaf.responsibilitytree;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * @author huzh
 * @date 2021.3.30 19:28
 */
@Component
public class A extends AbstractStrategyRouter<String, Boolean>
        implements StrategyHandler<String, Boolean> {

    /**
     * 定义用来存储执行策略的map集合
     */
    private Map<String, StrategyHandler> strategyMap = new HashMap();

    @Override
    protected StrategyMapper<String, Boolean> registerStrategyMapper() {
        strategyMap.put(StrategyEnum.A1.name(), new A1());
        strategyMap.put(StrategyEnum.A2.name(), new A2());
        return new AStrategyMapperImpl(strategyMap);
    }

    /**
     * 实现自己获取 对应的策略信息
     */
    class AStrategyMapperImpl implements StrategyMapper<String, Boolean> {

        private Map<String, StrategyHandler> strategyMap1;

        AStrategyMapperImpl(Map map) {
            strategyMap1 = map;
        }

        @Override
        public StrategyHandler<String, Boolean> get(String param) {
            return strategyMap1.get(param);
        }
    }

    @Override
    public Boolean apply(String param) {
        System.out.println("A执行。。。。");
        System.out.println("A执行完毕");
        //用于责任链调用，传递执行A1策略
        this.applyStrategy("A1");
        return true;
    }
}
