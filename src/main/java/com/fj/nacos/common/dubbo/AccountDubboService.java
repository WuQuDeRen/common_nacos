package com.fj.nacos.common.dubbo;

import com.fj.nacos.common.dto.AccountDTO;
import com.fj.nacos.common.response.ObjectResponse;

/**
 * @Author: lidong
 * @Description  账户服务接口
 * @Date Created in 2019/9/5 16:37
 */
public interface AccountDubboService {

    /**
     * 从账户扣钱
     */
    ObjectResponse decreaseAccount(AccountDTO accountDTO);
}
