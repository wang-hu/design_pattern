package state.service;

import state.service.impl.ReadyThreadStateServiceImpl;

/**
 * 〈一句话功能简述〉<br>
 * 〈功能详细描述〉
 *
 * @author wanghu
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class ThreadExecutor {

    private ThreadStateService threadState;

    public ThreadExecutor() {
        threadState = new ReadyThreadStateServiceImpl();
    }

    public void setThreadState(ThreadStateService threadState) {
        this.threadState = threadState;
    }

    public void execute() {
        threadState.changeState(this);
    }
}
