package state.service.impl;

import state.service.ThreadExecutor;
import state.service.ThreadStateService;

/**
 * 〈一句话功能简述〉<br>
 * 〈功能详细描述〉
 *
 * @author wanghu
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class BlockThreadStateServiceImpl implements ThreadStateService {


    @Override
    public void changeState(ThreadExecutor executor) {
        System.out.println("当前线程已经阻塞");
        executor.setThreadState(new BlockThreadStateServiceImpl() );
    }
}
