package strategy.service.impl;

import strategy.bean.ServerType;
import strategy.service.ExecuteStrategy;

/**
 *  redis 算法实现类
 *
 * @author wanghu
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class RedisExecuteStrategy implements ExecuteStrategy{
    @Override
    public void execute() {
        System.out.println("redis 连通性测试算法");
    }

    @Override
    public ServerType getType() {
        return ServerType.REDIS;
    }
}
