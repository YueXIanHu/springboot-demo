package com.huzh.springbootthymeleaf.responsibilitytree;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description TODO
 * @Date 2021.4.6 17:24
 * @Created by huzh
 */
@Component
public class B extends AbstractStrategyRouter<String, Boolean>
        implements StrategyHandler<String, Boolean> {

    /**
     * 定义用来存储执行策略的map集合
     */
    private Map<String, StrategyHandler> strategyMap = new HashMap();

    @Override
    protected StrategyMapper<String, Boolean> registerStrategyMapper() {
        strategyMap.put(StrategyEnum.B1.name(), new B1());
        strategyMap.put(StrategyEnum.B2.name(), new B2());
        return new BStrategyMapperImpl(strategyMap);
    }

    /**
     * 实现自己获取 对应的策略信息
     */
    class BStrategyMapperImpl implements StrategyMapper<String, Boolean> {

        private Map<String, StrategyHandler> strategyMap1;

        BStrategyMapperImpl(Map map) {
            strategyMap1 = map;
        }

        @Override
        public StrategyHandler<String, Boolean> get(String param) {
            return strategyMap1.get(param);
        }
    }

    @Override
    public Boolean apply(String param) {
        System.out.println("B执行。。。。");
        System.out.println("B执行完毕");
        //用于责任链调用，传递执行A1策略
        this.applyStrategy("B1");
        return true;
    }
}
