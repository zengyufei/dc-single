package com.zyf.lf.models.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 规格属性表
 * </p>
 *
 * @author zengyufei
 * @since 2018-01-24
 */
@TableName("os_specification_attribute")
public class OsSpecificationAttribute implements Serializable {

    private static final long serialVersionUID = 1L;

	/**
	 * 规格属性ID
	 */
	@TableField(value="spec_attr_id")
	private Long specAttrId;

	/**
	 * 规格ID
	 */
	@TableField(value="specification_id")
	private Long specificationId;

	/**
	 * 规格属性名称
	 */
	private String name;

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



	public Long getSpecAttrId() {
		return specAttrId;
	}

	public void setSpecAttrId(Long specAttrId) {
		this.specAttrId = specAttrId;
	}

	public Long getSpecificationId() {
		return specificationId;
	}

	public void setSpecificationId(Long specificationId) {
		this.specificationId = specificationId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
