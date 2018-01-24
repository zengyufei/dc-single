package com.zyf.lf.models.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 角色权限关联表
 * </p>
 *
 * @author zengyufei
 * @since 2018-01-24
 */
@TableName("cms_role_menu")
public class CmsRoleMenu implements Serializable {

    private static final long serialVersionUID = 1L;

	/**
	 * 角色权限编号
	 */
	@TableField(value="role_menu_id")
	private Long roleMenuId;

	/**
	 * 角色编号
	 */
	@TableField(value="role_id")
	private Long roleId;

	/**
	 * 权限编号
	 */
	@TableField(value="menu_id")
	private Long menuId;

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



	public Long getRoleMenuId() {
		return roleMenuId;
	}

	public void setRoleMenuId(Long roleMenuId) {
		this.roleMenuId = roleMenuId;
	}

	public Long getRoleId() {
		return roleId;
	}

	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}

	public Long getMenuId() {
		return menuId;
	}

	public void setMenuId(Long menuId) {
		this.menuId = menuId;
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
