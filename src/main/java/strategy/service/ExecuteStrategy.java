package strategy.service;

import strategy.bean.ServerType;

/**
 * 策略接口
 *
 * @author wanghu
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public interface ExecuteStrategy {

    /**
     * 算法核心接口
     */
    void execute();

    /**
     * 类型
     * @return
     */
    ServerType getType();
}
