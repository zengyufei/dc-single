package com.zyf.lf.models.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 商品图片表
 * </p>
 *
 * @author zengyufei
 * @since 2018-01-24
 */
@TableName("os_product_image")
public class OsProductImage implements Serializable {

    private static final long serialVersionUID = 1L;

	/**
	 * 商品图片ID
	 */
	@TableField(value="pic_img_id")
	private Long picImgId;

	/**
	 * 商品ID
	 */
	@TableField(value="product_id")
	private Long productId;

	/**
	 * 展示图片
	 */
	@TableField(value="pic_img")
	private String picImg;

	/**
	 * 排序
	 */
	private Integer sort;

	/**
	 * 状态：1.显示；0.隐藏
	 */
	private Integer status;

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



	public Long getPicImgId() {
		return picImgId;
	}

	public void setPicImgId(Long picImgId) {
		this.picImgId = picImgId;
	}

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public String getPicImg() {
		return picImg;
	}

	public void setPicImg(String picImg) {
		this.picImg = picImg;
	}

	public Integer getSort() {
		return sort;
	}

	public void setSort(Integer sort) {
		this.sort = sort;
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

}
