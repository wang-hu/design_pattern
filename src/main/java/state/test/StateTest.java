package state.test;

import state.service.ThreadExecutor;
import state.service.impl.ReadyThreadStateServiceImpl;

/**
 *  状态模式测试
 *
 * @author wanghu
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class StateTest {

    public static void main(String[] args) {
        ThreadExecutor executor = new ThreadExecutor();
        executor.setThreadState(new ReadyThreadStateServiceImpl());
        executor.execute();
        executor.execute();
        executor.execute();
    }
}
