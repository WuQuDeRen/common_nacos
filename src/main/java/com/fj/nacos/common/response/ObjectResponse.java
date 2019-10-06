package com.fj.nacos.common.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * @author: heshouyou
 * @date: 2018-07-03 16:55
 */
@ApiModel(description = "返回值描述")
public class ObjectResponse<T> extends BaseResponse implements Serializable {

    @ApiModelProperty("数据")
    private T data;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
