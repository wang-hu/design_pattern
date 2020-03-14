package strategy.service.impl;

import strategy.bean.ServerType;
import strategy.service.ExecuteStrategy;

/**
 *  mysql执行策略
 *
 *
 * @author wanghu
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class MysqlExecuteStrategy implements ExecuteStrategy{
    @Override
    public void execute() {
        System.out.println("执行 Mysql 连通性测试");
    }

    @Override
    public ServerType getType() {
        return ServerType.MYSQL;
    }
}
