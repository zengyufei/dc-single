package com.zyf.lf.models.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 管理员角色关联表
 * </p>
 *
 * @author zengyufei
 * @since 2018-01-24
 */
@TableName("cms_user_role")
public class CmsUserRole implements Serializable {

    private static final long serialVersionUID = 1L;

	/**
	 * 用户角色ID
	 */
	@TableField(value="user_role_id")
	private Long userRoleId;

	/**
	 * 角色ID
	 */
	@TableField(value="role_id")
	private Long roleId;

	/**
	 * 管理员ID
	 */
	@TableField(value="user_id")
	private Long userId;

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



	public Long getUserRoleId() {
		return userRoleId;
	}

	public void setUserRoleId(Long userRoleId) {
		this.userRoleId = userRoleId;
	}

	public Long getRoleId() {
		return roleId;
	}

	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
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
