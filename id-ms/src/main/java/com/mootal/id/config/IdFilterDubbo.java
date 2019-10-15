package com.mootal.id.config;

import com.alibaba.dubbo.common.extension.Activate;
import com.alibaba.dubbo.rpc.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author li tong
 * @date 2019/10/15 16:03
 * @see Object
 * @since 1.0
 */
@Activate
public class IdFilterDubbo implements Filter {

    private static final Logger logger = LoggerFactory.getLogger(IdFilterDubbo.class);

    @Override
    public Result invoke(Invoker<?> invoker, Invocation invocation) throws RpcException {
        RpcContext context = RpcContext.getContext();
        logger.info("【DUBBO访问】服务者地址为 {}，调用者地址为 {}，调用方法为 {}，调用入参为 {}",
                context.getLocalAddressString(),
                context.getRemoteAddress(),
                context.getMethodName(),
                invocation.getArguments());
        return invoker.invoke(invocation);
    }
}
