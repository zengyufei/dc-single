package com.zyf.lf.models.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 商品推荐表
 * </p>
 *
 * @author zengyufei
 * @since 2018-01-24
 */
@TableName("os_product_recommend")
public class OsProductRecommend implements Serializable {

    private static final long serialVersionUID = 1L;

	/**
	 * 产品推荐ID
	 */
	@TableField(value="recommend_product_id")
	private Long recommendProductId;

	/**
	 * 推荐位ID
	 */
	@TableField(value="recommend_id")
	private Long recommendId;

	/**
	 * 商品ID
	 */
	@TableField(value="product_id")
	private Long productId;

	/**
	 * 排序
	 */
	private Integer sort;

	/**
	 * 状态 1=显示/0=隐藏
	 */
	private Integer status;

	/**
	 * 推荐起始时间
	 */
	@TableField(value="begin_time")
	private Date beginTime;

	/**
	 * 推荐结束时间
	 */
	@TableField(value="end_time")
	private Date endTime;

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

	/**
	 * 更新时间
	 */
	@TableField(value="update_time")
	private Date updateTime;

	/**
	 * 更新者
	 */
	@TableField(value="update_by")
	private String updateBy;



	public Long getRecommendProductId() {
		return recommendProductId;
	}

	public void setRecommendProductId(Long recommendProductId) {
		this.recommendProductId = recommendProductId;
	}

	public Long getRecommendId() {
		return recommendId;
	}

	public void setRecommendId(Long recommendId) {
		this.recommendId = recommendId;
	}

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
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

	public Date getBeginTime() {
		return beginTime;
	}

	public void setBeginTime(Date beginTime) {
		this.beginTime = beginTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
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
