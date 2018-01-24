package com.zyf.lf.models.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 分类表
 * </p>
 *
 * @author zengyufei
 * @since 2018-01-24
 */
@TableName("os_category")
public class OsCategory implements Serializable {

    private static final long serialVersionUID = 1L;

	/**
	 * 分类ID
	 */
	@TableField(value="category_id")
	private Long categoryId;

	/**
	 * 父分类ID
	 */
	@TableField(value="parent_id")
	private Long parentId;

	/**
	 * 分类名称
	 */
	private String name;

	/**
	 * 排序
	 */
	private Integer sort;

	/**
	 * 目录类型 2=二级目录/1=一级目录/0=总目录
	 */
	private Integer type;

	/**
	 * 状态 1=显示/0=隐藏
	 */
	private Integer status;

	/**
	 * 是否导航栏 1=显示/0=隐藏
	 */
	@TableField(value="show_in_nav")
	private Integer showInNav;

	/**
	 * 是否置顶 1=置顶/0=默认
	 */
	@TableField(value="show_in_top")
	private Integer showInTop;

	/**
	 * 是否热门 1=热门/0=默认
	 */
	@TableField(value="show_in_hot")
	private Integer showInHot;

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
	 * 页面标题
	 */
	@TableField(value="page_title")
	private String pageTitle;

	/**
	 * 页面描述
	 */
	@TableField(value="page_description")
	private String pageDescription;

	/**
	 * 页面关键词
	 */
	@TableField(value="page_keyword")
	private String pageKeyword;

	/**
	 * 备注信息
	 */
	private String remarks;



	public Long getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}

	public Long getParentId() {
		return parentId;
	}

	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getSort() {
		return sort;
	}

	public void setSort(Integer sort) {
		this.sort = sort;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Integer getShowInNav() {
		return showInNav;
	}

	public void setShowInNav(Integer showInNav) {
		this.showInNav = showInNav;
	}

	public Integer getShowInTop() {
		return showInTop;
	}

	public void setShowInTop(Integer showInTop) {
		this.showInTop = showInTop;
	}

	public Integer getShowInHot() {
		return showInHot;
	}

	public void setShowInHot(Integer showInHot) {
		this.showInHot = showInHot;
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
