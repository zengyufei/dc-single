package com.zyf.lf.models.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 导航栏表
 * </p>
 *
 * @author zengyufei
 * @since 2018-01-24
 */
@TableName("os_navigation_bar")
public class OsNavigationBar implements Serializable {

    private static final long serialVersionUID = 1L;

	/**
	 * 导航栏ID
	 */
	@TableField(value="navigation_bar_id")
	private Long navigationBarId;

	/**
	 * 导航ID
	 */
	@TableField(value="navigation_id")
	private Long navigationId;

	/**
	 * 名称
	 */
	private String name;

	/**
	 * 打开方式：_blank；_parent；_self；_top
	 */
	private String target;

	/**
	 * 排序
	 */
	private Integer sort;

	/**
	 * 链接地址
	 */
	private String href;

	/**
	 * 状态 1=显示/0=隐藏
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

	/**
	 * 备注信息
	 */
	private String remarks;



	public Long getNavigationBarId() {
		return navigationBarId;
	}

	public void setNavigationBarId(Long navigationBarId) {
		this.navigationBarId = navigationBarId;
	}

	public Long getNavigationId() {
		return navigationId;
	}

	public void setNavigationId(Long navigationId) {
		this.navigationId = navigationId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTarget() {
		return target;
	}

	public void setTarget(String target) {
		this.target = target;
	}

	public Integer getSort() {
		return sort;
	}

	public void setSort(Integer sort) {
		this.sort = sort;
	}

	public String getHref() {
		return href;
	}

	public void setHref(String href) {
		this.href = href;
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

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

}
