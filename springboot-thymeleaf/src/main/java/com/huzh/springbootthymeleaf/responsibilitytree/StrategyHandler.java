package com.huzh.springbootthymeleaf.responsibilitytree;

/**
 * @author huzh
 * @date 2021.3.30 18:16
 */
public interface StrategyHandler<T, R> {

    @SuppressWarnings("rawtypes")
    StrategyHandler DEFAULT = t -> null;

    /**
     * apply strategy
     *
     * @param param
     * @return
     */
    R apply(T param);
}
