package com.zyf.lf.models.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * <p>
 * 订单明细表
 * </p>
 * @author zengyufei
 * @since 2018-01-24
 */
@TableName("os_order_product")
public class OsOrderProduct implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 订单商品ID
     */
    @TableField(value = "order_product_id")
    private Long orderProductId;

    /**
     * 订单ID
     */
    @TableField(value = "order_id")
    private Long orderId;

    /**
     * 商品编号
     */
    @TableField(value = "product_number")
    private Long productNumber;

    /**
     * 商品名称
     */
    private String name;

    /**
     * 展示图片
     */
    @TableField(value = "pic_img")
    private String picImg;

    /**
     * 商品规格编号
     */
    @TableField(value = "product_spec_number")
    private Long productSpecNumber;

    /**
     * 商品规格名称
     */
    @TableField(value = "product_spec_name")
    private String productSpecName;

    /**
     * 价格
     */
    private BigDecimal price;

    /**
     * 积分
     */
    private Integer score;

    /**
     * 商品总数量
     */
    @TableField(value = "buy_number")
    private Integer buyNumber;

    /**
     * 商品总积分
     */
    @TableField(value = "product_score")
    private Integer productScore;

    /**
     * 商品总金额
     */
    @TableField(value = "product_amount")
    private BigDecimal productAmount;

    /**
     * 评论状态 0=未评论，1=已评论
     */
    @TableField(value = "comment_status")
    private Integer commentStatus;


    public Long getOrderProductId() {
        return orderProductId;
    }

    public void setOrderProductId(Long orderProductId) {
        this.orderProductId = orderProductId;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Long getProductNumber() {
        return productNumber;
    }

    public void setProductNumber(Long productNumber) {
        this.productNumber = productNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPicImg() {
        return picImg;
    }

    public void setPicImg(String picImg) {
        this.picImg = picImg;
    }

    public Long getProductSpecNumber() {
        return productSpecNumber;
    }

    public void setProductSpecNumber(Long productSpecNumber) {
        this.productSpecNumber = productSpecNumber;
    }

    public String getProductSpecName() {
        return productSpecName;
    }

    public void setProductSpecName(String productSpecName) {
        this.productSpecName = productSpecName;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Integer getBuyNumber() {
        return buyNumber;
    }

    public void setBuyNumber(Integer buyNumber) {
        this.buyNumber = buyNumber;
    }

    public Integer getProductScore() {
        return productScore;
    }

    public void setProductScore(Integer productScore) {
        this.productScore = productScore;
    }

    public BigDecimal getProductAmount() {
        return productAmount;
    }

    public void setProductAmount(BigDecimal productAmount) {
        this.productAmount = productAmount;
    }

    public Integer getCommentStatus() {
        return commentStatus;
    }

    public void setCommentStatus(Integer commentStatus) {
        this.commentStatus = commentStatus;
    }

}
