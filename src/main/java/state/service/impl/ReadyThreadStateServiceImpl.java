package state.service.impl;

import state.service.ThreadExecutor;
import state.service.ThreadStateService;

/**
 * 〈状态实现接口
 *
 * @author wanghu
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class ReadyThreadStateServiceImpl implements ThreadStateService {

    @Override
    public void changeState(ThreadExecutor executor) {
        System.out.println("当前线程已就绪");
        executor.setThreadState(new RunThreadStateServiceImpl() );
    }
}
