package com.zyf.lf.models.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 类型属性表
 * </p>
 *
 * @author zengyufei
 * @since 2018-01-24
 */
@TableName("os_kind_attribute")
public class OsKindAttribute implements Serializable {

    private static final long serialVersionUID = 1L;

	/**
	 * 规格属性ID
	 */
	@TableField(value="kind_attr_id")
	private Long kindAttrId;

	/**
	 * 规格ID
	 */
	@TableField(value="kind_id")
	private Long kindId;

	/**
	 * 规格属性ID
	 */
	@TableField(value="spec_attr_id")
	private Long specAttrId;

	/**
	 * 
	 */
	private String name;

	/**
	 * 状态 0=隐藏/1=显示
	 */
	private Integer status;

	/**
	 * 排序
	 */
	private Integer sort;

	/**
	 * 创建者
	 */
	@TableField(value="create_by")
	private String createBy;

	/**
	 * 创建时间
	 */
	@TableField(value="create_time")
	private Date createTime;



	public Long getKindAttrId() {
		return kindAttrId;
	}

	public void setKindAttrId(Long kindAttrId) {
		this.kindAttrId = kindAttrId;
	}

	public Long getKindId() {
		return kindId;
	}

	public void setKindId(Long kindId) {
		this.kindId = kindId;
	}

	public Long getSpecAttrId() {
		return specAttrId;
	}

	public void setSpecAttrId(Long specAttrId) {
		this.specAttrId = specAttrId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Integer getSort() {
		return sort;
	}

	public void setSort(Integer sort) {
		this.sort = sort;
	}

	public String getCreateBy() {
		return createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

}
