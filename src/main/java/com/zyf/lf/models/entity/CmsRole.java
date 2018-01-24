package com.zyf.lf.models.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 角色表
 * </p>
 *
 * @author zengyufei
 * @since 2018-01-24
 */
@TableName("cms_role")
public class CmsRole implements Serializable {

    private static final long serialVersionUID = 1L;

	/**
	 * 角色ID
	 */
	@TableField(value="role_id")
	private Long roleId;

	/**
	 * 角色名称
	 */
	@TableField(value="role_name")
	private String roleName;

	/**
	 * 角色标志
	 */
	@TableField(value="role_sign")
	private String roleSign;

	/**
	 * 系统数据 1=是,只有超级管理员能修改/0=否,拥有角色修改人员的权限能都修改
	 */
	@TableField(value="is_system")
	private Integer isSystem;

	/**
	 * 状态 0=冻结/1=正常
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



	public Long getRoleId() {
		return roleId;
	}

	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getRoleSign() {
		return roleSign;
	}

	public void setRoleSign(String roleSign) {
		this.roleSign = roleSign;
	}

	public Integer getIsSystem() {
		return isSystem;
	}

	public void setIsSystem(Integer isSystem) {
		this.isSystem = isSystem;
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
