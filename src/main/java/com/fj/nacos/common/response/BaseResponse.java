package com.fj.nacos.common.response;

import java.io.Serializable;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 基本返回
 *
 * @author: heshouyou
 * @date: 2018-07-03 16:46
 */
@Data
public class BaseResponse implements Serializable {

    @ApiModelProperty("状态吗")
    private int status = 200;

    @ApiModelProperty("消息")
    private String message;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
