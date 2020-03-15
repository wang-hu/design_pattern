package state.service;

/**
 *
 * 状态类 State
 * @author wanghu
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public interface ThreadStateService {

    void changeState(ThreadExecutor executor);

}
