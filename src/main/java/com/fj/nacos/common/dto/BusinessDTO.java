package com.fj.nacos.common.dto;

import java.io.Serializable;
import java.math.BigDecimal;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @Author: heshouyou
 * @Description
 * @Date Created in 2019/1/14 17:26
 */
@Data
@ApiModel("请求参数")
public class BusinessDTO implements Serializable {

    @ApiModelProperty("用户ID")
    private String userId;
    @ApiModelProperty("商品码")
    private String commodityCode;
    @ApiModelProperty("用户名")
    private String name;
    @ApiModelProperty("商品数量")
    private Integer count;
    @ApiModelProperty("价格")
    private BigDecimal amount;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getCommodityCode() {
        return commodityCode;
    }

    public void setCommodityCode(String commodityCode) {
        this.commodityCode = commodityCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
}
