package com.zyf.lf.models.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 用户登录表
 * </p>
 *
 * @author zengyufei
 * @since 2018-01-24
 */
@TableName("os_user_login_log")
public class OsUserLoginLog implements Serializable {

    private static final long serialVersionUID = 1L;

	/**
	 * 登录日志ID
	 */
	@TableField(value="log_id")
	private Long logId;

	/**
	 * 登录时间
	 */
	@TableField(value="login_time")
	private Date loginTime;

	/**
	 * 登录IP
	 */
	@TableField(value="user_ip")
	private String userIp;

	/**
	 * 用户ID
	 */
	@TableField(value="user_id")
	private Long userId;

	/**
	 * 操作系统
	 */
	@TableField(value="operating_system")
	private String operatingSystem;

	/**
	 * 浏览器
	 */
	private String browser;



	public Long getLogId() {
		return logId;
	}

	public void setLogId(Long logId) {
		this.logId = logId;
	}

	public Date getLoginTime() {
		return loginTime;
	}

	public void setLoginTime(Date loginTime) {
		this.loginTime = loginTime;
	}

	public String getUserIp() {
		return userIp;
	}

	public void setUserIp(String userIp) {
		this.userIp = userIp;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getOperatingSystem() {
		return operatingSystem;
	}

	public void setOperatingSystem(String operatingSystem) {
		this.operatingSystem = operatingSystem;
	}

	public String getBrowser() {
		return browser;
	}

	public void setBrowser(String browser) {
		this.browser = browser;
	}

}
