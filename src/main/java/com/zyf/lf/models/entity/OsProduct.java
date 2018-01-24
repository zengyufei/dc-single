package com.zyf.lf.models.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * <p>
 * 商品表
 * </p>
 * @author zengyufei
 * @since 2018-01-24
 */
@TableName("os_product")
public class OsProduct implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 商品ID
     */
    @TableField(value = "product_id")
    private Long productId;

    /**
     * 商品编号
     */
    @TableField(value = "product_number")
    private Long productNumber;

    /**
     * 标签ID
     */
    @TableField(value = "label_id")
    private Integer labelId;

    /**
     * 商品名称
     */
    private String name;

    /**
     * 显示积分
     */
    @TableField(value = "show_score")
    private Integer showScore;

    /**
     * 显示价格
     */
    @TableField(value = "show_price")
    private BigDecimal showPrice;

    /**
     * 商品简介
     */
    private String introduce;

    /**
     * 展示图片
     */
    @TableField(value = "pic_img")
    private String picImg;

    /**
     * 是否置顶 1=置顶/0=默认
     */
    @TableField(value = "show_in_top")
    private Integer showInTop;

    /**
     * 是否导航栏 1=显示/0=隐藏
     */
    @TableField(value = "show_in_nav")
    private Integer showInNav;

    /**
     * 是否热门 1=热门/0=默认
     */
    @TableField(value = "show_in_hot")
    private Integer showInHot;

    /**
     * 是否上架：1=上架/0=下架
     */
    @TableField(value = "show_in_shelve")
    private Integer showInShelve;

    /**
     * 创建时间
     */
    @TableField(value = "create_time")
    private Date createTime;

    /**
     * 创建者
     */
    @TableField(value = "create_by")
    private String createBy;

    /**
     * 上架时间
     */
    @TableField(value = "shelve_time")
    private Date shelveTime;

    /**
     * 上架人
     */
    @TableField(value = "shelve_by")
    private String shelveBy;

    /**
     * 更新时间
     */
    @TableField(value = "update_time")
    private Date updateTime;

    /**
     * 更新者
     */
    @TableField(value = "update_by")
    private String updateBy;

    /**
     * 搜索关键词
     */
    @TableField(value = "search_key")
    private String searchKey;

    /**
     * 页面标题
     */
    @TableField(value = "page_title")
    private String pageTitle;

    /**
     * 页面描述
     */
    @TableField(value = "page_description")
    private String pageDescription;

    /**
     * 页面关键词
     */
    @TableField(value = "page_keyword")
    private String pageKeyword;

    /**
     * 备注
     */
    private String remarks;


    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Long getProductNumber() {
        return productNumber;
    }

    public void setProductNumber(Long productNumber) {
        this.productNumber = productNumber;
    }

    public Integer getLabelId() {
        return labelId;
    }

    public void setLabelId(Integer labelId) {
        this.labelId = labelId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getShowScore() {
        return showScore;
    }

    public void setShowScore(Integer showScore) {
        this.showScore = showScore;
    }

    public BigDecimal getShowPrice() {
        return showPrice;
    }

    public void setShowPrice(BigDecimal showPrice) {
        this.showPrice = showPrice;
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }

    public String getPicImg() {
        return picImg;
    }

    public void setPicImg(String picImg) {
        this.picImg = picImg;
    }

    public Integer getShowInTop() {
        return showInTop;
    }

    public void setShowInTop(Integer showInTop) {
        this.showInTop = showInTop;
    }

    public Integer getShowInNav() {
        return showInNav;
    }

    public void setShowInNav(Integer showInNav) {
        this.showInNav = showInNav;
    }

    public Integer getShowInHot() {
        return showInHot;
    }

    public void setShowInHot(Integer showInHot) {
        this.showInHot = showInHot;
    }

    public Integer getShowInShelve() {
        return showInShelve;
    }

    public void setShowInShelve(Integer showInShelve) {
        this.showInShelve = showInShelve;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public Date getShelveTime() {
        return shelveTime;
    }

    public void setShelveTime(Date shelveTime) {
        this.shelveTime = shelveTime;
    }

    public String getShelveBy() {
        return shelveBy;
    }

    public void setShelveBy(String shelveBy) {
        this.shelveBy = shelveBy;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public String getSearchKey() {
        return searchKey;
    }

    public void setSearchKey(String searchKey) {
        this.searchKey = searchKey;
    }

    public String getPageTitle() {
        return pageTitle;
    }

    public void setPageTitle(String pageTitle) {
        this.pageTitle = pageTitle;
    }

    public String getPageDescription() {
        return pageDescription;
    }

    public void setPageDescription(String pageDescription) {
        this.pageDescription = pageDescription;
    }

    public String getPageKeyword() {
        return pageKeyword;
    }

    public void setPageKeyword(String pageKeyword) {
        this.pageKeyword = pageKeyword;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

}
