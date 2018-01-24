package com.zyf.lf.models.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 商品分类关联表
 * </p>
 *
 * @author zengyufei
 * @since 2018-01-24
 */
@TableName("os_product_category")
public class OsProductCategory implements Serializable {

    private static final long serialVersionUID = 1L;

	/**
	 * 商品分类ID
	 */
	@TableField(value="product_category_id")
	private Long productCategoryId;

	/**
	 * 商品ID
	 */
	@TableField(value="product_id")
	private Long productId;

	/**
	 * 分类ID
	 */
	@TableField(value="category_id")
	private Long categoryId;

	/**
	 * 创建时间
	 */
	@TableField(value="create_time")
	private Date createTime;

	/**
	 * 创建者
	 */
	@TableField(value="create_by")
	private String createBy;



	public Long getProductCategoryId() {
		return productCategoryId;
	}

	public void setProductCategoryId(Long productCategoryId) {
		this.productCategoryId = productCategoryId;
	}

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public Long getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
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

}
