package com.zyf.lf.models.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 评论回复表
 * </p>
 *
 * @author zengyufei
 * @since 2018-01-24
 */
@TableName("os_comment_reply")
public class OsCommentReply implements Serializable {

    private static final long serialVersionUID = 1L;

	/**
	 * 评论回复ID
	 */
	@TableField(value="comment_reply_id")
	private Long commentReplyId;

	/**
	 * 评论ID
	 */
	@TableField(value="comment_id")
	private Long commentId;

	/**
	 * 用户ID
	 */
	@TableField(value="user_id")
	private Long userId;

	/**
	 * 昵称
	 */
	@TableField(value="user_name")
	private String userName;

	/**
	 * 用户头像
	 */
	@TableField(value="pic_img")
	private String picImg;

	/**
	 * 评论内容
	 */
	private String content;

	/**
	 * 好评数
	 */
	@TableField(value="good_count")
	private Integer goodCount;

	/**
	 * 状态：1.显示；0.隐藏
	 */
	private Integer status;

	/**
	 * 评论类型：1,官方回复；0,用户回复
	 */
	private Integer type;

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



	public Long getCommentReplyId() {
		return commentReplyId;
	}

	public void setCommentReplyId(Long commentReplyId) {
		this.commentReplyId = commentReplyId;
	}

	public Long getCommentId() {
		return commentId;
	}

	public void setCommentId(Long commentId) {
		this.commentId = commentId;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPicImg() {
		return picImg;
	}

	public void setPicImg(String picImg) {
		this.picImg = picImg;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Integer getGoodCount() {
		return goodCount;
	}

	public void setGoodCount(Integer goodCount) {
		this.goodCount = goodCount;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
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
