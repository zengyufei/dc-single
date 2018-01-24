package com.zyf.lf.models.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * <p>
 * 商品规格表
 * </p>
 * @author zengyufei
 * @since 2018-01-24
 */
@TableName("os_product_specification")
public class OsProductSpecification implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 商品规格ID
     */
    @TableField(value = "product_spec_id")
    private Long productSpecId;

    /**
     * 商品规格编号
     */
    @TableField(value = "product_spec_number")
    private Long productSpecNumber;

    /**
     * 商品ID
     */
    @TableField(value = "product_id")
    private Long productId;

    /**
     * 规格：规格ID，以“,”相隔
     */
    private String spec;

    /**
     * 库存
     */
    private Integer stock;

    /**
     * 销售量
     */
    @TableField(value = "sales_volume")
    private Integer salesVolume;

    /**
     * 价格
     */
    private BigDecimal price;

    /**
     * 积分
     */
    private Integer score;

    /**
     * 是否默认状态：0,不默认；1,默认
     */
    @TableField(value = "default_status")
    private Integer defaultStatus;

    /**
     * 商品状态：0,新增；1,上架；2,下架
     */
    private Integer status;

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
     * 更新时间
     */
    @TableField(value = "update_time")
    private Date updateTime;

    /**
     * 更新者
     */
    @TableField(value = "update_by")
    private String updateBy;


    public Long getProductSpecId() {
        return productSpecId;
    }

    public void setProductSpecId(Long productSpecId) {
        this.productSpecId = productSpecId;
    }

    public Long getProductSpecNumber() {
        return productSpecNumber;
    }

    public void setProductSpecNumber(Long productSpecNumber) {
        this.productSpecNumber = productSpecNumber;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getSpec() {
        return spec;
    }

    public void setSpec(String spec) {
        this.spec = spec;
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

    public Integer getDefaultStatus() {
        return defaultStatus;
    }

    public void setDefaultStatus(Integer defaultStatus) {
        this.defaultStatus = defaultStatus;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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

}
