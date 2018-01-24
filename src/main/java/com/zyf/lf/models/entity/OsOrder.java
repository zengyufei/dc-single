package com.zyf.lf.models.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * <p>
 * 订单表
 * </p>
 * @author zengyufei
 * @since 2018-01-24
 */
@TableName("os_order")
public class OsOrder implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 订单ID
     */
    @TableField(value = "order_id")
    private Long orderId;

    /**
     * 订单编号,系统生成
     */
    @TableField(value = "order_number")
    private Long orderNumber;

    /**
     * 用户ID
     */
    @TableField(value = "user_id")
    private Long userId;

    /**
     * 支付方式 0=线下支付，1=在线支付
     */
    @TableField(value = "pay_type")
    private Integer payType;

    /**
     * 配送时间 1=不限送货时间，2=工作日送货，3=双休日、假日送货
     */
    @TableField(value = "shipment_time")
    private Integer shipmentTime;

    /**
     * 配送方式 0=快递配送（免运费），1=快递配送（运费）
     */
    @TableField(value = "shipment_type")
    private Integer shipmentType;

    /**
     * 快递费
     */
    @TableField(value = "shipment_amount")
    private BigDecimal shipmentAmount;

    /**
     * 支付方式 1=不开发票，2=电子发票，3=普通发票
     */
    @TableField(value = "invoice_type")
    private Integer invoiceType;

    /**
     * 发票抬头
     */
    @TableField(value = "invoice_title")
    private String invoiceTitle;

    /**
     * 订单状态
     */
    @TableField(value = "order_status")
    private Integer orderStatus;

    /**
     * 创建时间
     */
    @TableField(value = "create_time")
    private Date createTime;

    /**
     * 更新时间
     */
    @TableField(value = "update_time")
    private Date updateTime;

    /**
     * 订单金额
     */
    @TableField(value = "order_amount")
    private BigDecimal orderAmount;

    /**
     * 订单积分
     */
    @TableField(value = "order_score")
    private Integer orderScore;

    /**
     * 支付金额 = 订单金额 + 快递费
     */
    @TableField(value = "pay_amount")
    private BigDecimal payAmount;

    /**
     * 商品总数量
     */
    @TableField(value = "buy_number")
    private Integer buyNumber;


    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Long getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(Long orderNumber) {
        this.orderNumber = orderNumber;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Integer getPayType() {
        return payType;
    }

    public void setPayType(Integer payType) {
        this.payType = payType;
    }

    public Integer getShipmentTime() {
        return shipmentTime;
    }

    public void setShipmentTime(Integer shipmentTime) {
        this.shipmentTime = shipmentTime;
    }

    public Integer getShipmentType() {
        return shipmentType;
    }

    public void setShipmentType(Integer shipmentType) {
        this.shipmentType = shipmentType;
    }

    public BigDecimal getShipmentAmount() {
        return shipmentAmount;
    }

    public void setShipmentAmount(BigDecimal shipmentAmount) {
        this.shipmentAmount = shipmentAmount;
    }

    public Integer getInvoiceType() {
        return invoiceType;
    }

    public void setInvoiceType(Integer invoiceType) {
        this.invoiceType = invoiceType;
    }

    public String getInvoiceTitle() {
        return invoiceTitle;
    }

    public void setInvoiceTitle(String invoiceTitle) {
        this.invoiceTitle = invoiceTitle;
    }

    public Integer getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public BigDecimal getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(BigDecimal orderAmount) {
        this.orderAmount = orderAmount;
    }

    public Integer getOrderScore() {
        return orderScore;
    }

    public void setOrderScore(Integer orderScore) {
        this.orderScore = orderScore;
    }

    public BigDecimal getPayAmount() {
        return payAmount;
    }

    public void setPayAmount(BigDecimal payAmount) {
        this.payAmount = payAmount;
    }

    public Integer getBuyNumber() {
        return buyNumber;
    }

    public void setBuyNumber(Integer buyNumber) {
        this.buyNumber = buyNumber;
    }

}
