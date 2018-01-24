package com.zyf.lf.models.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * <p>
 * 商品属性表
 * </p>
 * @author zengyufei
 * @since 2018-01-24
 */
@TableName("os_product_attribute")
public class OsProductAttribute implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 属性ID
     */
    @TableField(value = "attribute_id")
    private Long attributeId;

    /**
     * 商品ID
     */
    @TableField(value = "product_id")
    private Long productId;

    /**
     * 总库存
     */
    private Integer stock;

    /**
     * 销售量
     */
    @TableField(value = "sales_volume")
    private Integer salesVolume;

    /**
     * 游览量
     */
    @TableField(value = "page_views")
    private Integer pageViews;

    /**
     * 评论数量
     */
    @TableField(value = "comment_number")
    private Integer commentNumber;

    /**
     * 累计评价
     */
    @TableField(value = "comment_total")
    private Integer commentTotal;

    /**
     * 平均评价
     */
    @TableField(value = "comment_average")
    private BigDecimal commentAverage;

    /**
     * 收藏数
     */
    @TableField(value = "favorite_number")
    private Integer favoriteNumber;

    /**
     * 提问数
     */
    @TableField(value = "question_number")
    private Integer questionNumber;


    public Long getAttributeId() {
        return attributeId;
    }

    public void setAttributeId(Long attributeId) {
        this.attributeId = attributeId;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Integer getSalesVolume() {
        return salesVolume;
    }

    public void setSalesVolume(Integer salesVolume) {
        this.salesVolume = salesVolume;
    }

    public Integer getPageViews() {
        return pageViews;
    }

    public void setPageViews(Integer pageViews) {
        this.pageViews = pageViews;
    }

    public Integer getCommentNumber() {
        return commentNumber;
    }

    public void setCommentNumber(Integer commentNumber) {
        this.commentNumber = commentNumber;
    }

    public Integer getCommentTotal() {
        return commentTotal;
    }

    public void setCommentTotal(Integer commentTotal) {
        this.commentTotal = commentTotal;
    }

    public BigDecimal getCommentAverage() {
        return commentAverage;
    }

    public void setCommentAverage(BigDecimal commentAverage) {
        this.commentAverage = commentAverage;
    }

    public Integer getFavoriteNumber() {
        return favoriteNumber;
    }

    public void setFavoriteNumber(Integer favoriteNumber) {
        this.favoriteNumber = favoriteNumber;
    }

    public Integer getQuestionNumber() {
        return questionNumber;
    }

    public void setQuestionNumber(Integer questionNumber) {
        this.questionNumber = questionNumber;
    }

}
