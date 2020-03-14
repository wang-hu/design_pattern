package strategy.service;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.ServiceLoader;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 环境类
 *
 * @author wanghu
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class StrategyExecutor {
    private ExecuteStrategy executeStrategy;

    private static final Map<String,ExecuteStrategy> strategyMap = new ConcurrentHashMap<>();

    static {
        //将具体执行器注入进来
        register();
    }

    /**
     * 通过加载META-INF下的配置文件加载service
     */
    private static synchronized void register() {
        ServiceLoader<ExecuteStrategy> loader = ServiceLoader.load(ExecuteStrategy.class);
        Iterator<ExecuteStrategy> iterator = loader.iterator();
        while (iterator.hasNext()) {
            ExecuteStrategy service = iterator.next();
            if (Objects.isNull(service) || Objects.isNull(service.getType())) {
                throw new RuntimeException("register service fail.");
            }
            strategyMap.putIfAbsent(service.getType().name().toLowerCase(), service);
        }
    }

    public StrategyExecutor(ExecuteStrategy executeStrategy) {
        this.executeStrategy = executeStrategy;
    }

    public static void doStrategy(String type) {
        if (type == null || "".equalsIgnoreCase(type)) {
            //todo 处理具体异常
            throw new RuntimeException("type can not null.");
        }

        //获取实际策略算法
        ExecuteStrategy strategy = strategyMap.get(type.toLowerCase());

        if (Objects.isNull(strategy)) {
            //todo 处理具体异常
            throw new RuntimeException("strategy can not null.");
        }

        try {
            strategy.execute();
        } catch (Exception e) {
            //todo 处理具体异常
            e.printStackTrace();
        }
    }


}
