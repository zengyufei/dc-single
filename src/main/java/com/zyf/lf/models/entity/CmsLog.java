package com.zyf.lf.models.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 日志记录表
 * </p>
 *
 * @author zengyufei
 * @since 2018-01-24
 */
@TableName("cms_log")
public class CmsLog implements Serializable {

    private static final long serialVersionUID = 1L;

	/**
	 * 日志ID
	 */
	@TableField(value="log_id")
	private Long logId;

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
	 * 耗时
	 */
	@TableField(value="spend_time")
	private Integer spendTime;

	/**
	 * 请求类型
	 */
	private String method;

	/**
	 * 用户标识
	 */
	@TableField(value="user_agent")
	private String userAgent;

	/**
	 * 用户IP
	 */
	@TableField(value="user_ip")
	private String userIp;

	/**
	 * 请求内容
	 */
	@TableField(value="opt_content")
	private String optContent;

	/**
	 * 请求路径
	 */
	private String url;



	public Long getLogId() {
		return logId;
	}

	public void setLogId(Long logId) {
		this.logId = logId;
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

	public Integer getSpendTime() {
		return spendTime;
	}

	public void setSpendTime(Integer spendTime) {
		this.spendTime = spendTime;
	}

	public String getMethod() {
		return method;
	}

	public void setMethod(String method) {
		this.method = method;
	}

	public String getUserAgent() {
		return userAgent;
	}

	public void setUserAgent(String userAgent) {
		this.userAgent = userAgent;
	}

	public String getUserIp() {
		return userIp;
	}

	public void setUserIp(String userIp) {
		this.userIp = userIp;
	}

	public String getOptContent() {
		return optContent;
	}

	public void setOptContent(String optContent) {
		this.optContent = optContent;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}
