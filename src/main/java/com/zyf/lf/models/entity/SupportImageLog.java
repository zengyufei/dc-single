package com.zyf.lf.models.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 云存储图片记录表
 * </p>
 *
 * @author zengyufei
 * @since 2018-01-24
 */
@TableName("support_image_log")
public class SupportImageLog implements Serializable {

    private static final long serialVersionUID = 1L;

	/**
	 * 图片ID
	 */
	@TableField(value="image_id")
	private Long imageId;

	/**
	 * 目标空间名
	 */
	private String bucket;

	/**
	 * 资源外链地址
	 */
	@TableField(value="image_url")
	private String imageUrl;

	/**
	 * 文件所属类
	 */
	private String belong;

	/**
	 * 资源名
	 */
	private String name;

	/**
	 * HTTPETag
	 */
	private String etag;

	/**
	 * 资源尺寸
	 */
	@TableField(value="file_size")
	private Long fileSize;

	/**
	 * 资源类型
	 */
	@TableField(value="mime_type")
	private String mimeType;

	/**
	 * 创建时间
	 */
	@TableField(value="create_time")
	private Date createTime;

	/**
	 * 云存储系统名称
	 */
	@TableField(value="cloud_name")
	private String cloudName;

	/**
	 * 资源宽度
	 */
	private Integer width;

	/**
	 * 资源高度
	 */
	private Integer height;



	public Long getImageId() {
		return imageId;
	}

	public void setImageId(Long imageId) {
		this.imageId = imageId;
	}

	public String getBucket() {
		return bucket;
	}

	public void setBucket(String bucket) {
		this.bucket = bucket;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public String getBelong() {
		return belong;
	}

	public void setBelong(String belong) {
		this.belong = belong;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEtag() {
		return etag;
	}

	public void setEtag(String etag) {
		this.etag = etag;
	}

	public Long getFileSize() {
		return fileSize;
	}

	public void setFileSize(Long fileSize) {
		this.fileSize = fileSize;
	}

	public String getMimeType() {
		return mimeType;
	}

	public void setMimeType(String mimeType) {
		this.mimeType = mimeType;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getCloudName() {
		return cloudName;
	}

	public void setCloudName(String cloudName) {
		this.cloudName = cloudName;
	}

	public Integer getWidth() {
		return width;
	}

	public void setWidth(Integer width) {
		this.width = width;
	}

	public Integer getHeight() {
		return height;
	}

	public void setHeight(Integer height) {
		this.height = height;
	}

}
