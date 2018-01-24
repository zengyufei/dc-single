package com.zyf.lf.models.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 收获地址表
 * </p>
 *
 * @author zengyufei
 * @since 2018-01-24
 */
@TableName("os_address")
public class OsAddress implements Serializable {

    private static final long serialVersionUID = 1L;

	/**
	 * 收获地址ID
	 */
	@TableField(value="address_id")
	private Long addressId;

	/**
	 * 用户ID
	 */
	@TableField(value="user_id")
	private Long userId;

	/**
	 * 姓名
	 */
	@TableField(value="user_name")
	private String userName;

	/**
	 * 地址标签
	 */
	@TableField(value="user_tag")
	private String userTag;

	/**
	 * 手机号码
	 */
	@TableField(value="user_phone")
	private String userPhone;

	/**
	 * 省份ID
	 */
	@TableField(value="province_id")
	private Integer provinceId;

	/**
	 * 省份名字
	 */
	@TableField(value="province_name")
	private String provinceName;

	/**
	 * 城市ID
	 */
	@TableField(value="city_id")
	private Integer cityId;

	/**
	 * 城市名字
	 */
	@TableField(value="city_name")
	private String cityName;

	/**
	 * 区域ID
	 */
	@TableField(value="district_id")
	private Integer districtId;

	/**
	 * 区域名字
	 */
	@TableField(value="district_name")
	private String districtName;

	/**
	 * 详细地址
	 */
	@TableField(value="user_adress")
	private String userAdress;

	/**
	 * 邮政编码
	 */
	@TableField(value="user_zipcode")
	private Integer userZipcode;

	/**
	 * 创建时间
	 */
	@TableField(value="create_time")
	private Date createTime;

	/**
	 * 更新时间
	 */
	@TableField(value="update_time")
	private Date updateTime;



	public Long getAddressId() {
		return addressId;
	}

	public void setAddressId(Long addressId) {
		this.addressId = addressId;
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

	public String getUserTag() {
		return userTag;
	}

	public void setUserTag(String userTag) {
		this.userTag = userTag;
	}

	public String getUserPhone() {
		return userPhone;
	}

	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}

	public Integer getProvinceId() {
		return provinceId;
	}

	public void setProvinceId(Integer provinceId) {
		this.provinceId = provinceId;
	}

	public String getProvinceName() {
		return provinceName;
	}

	public void setProvinceName(String provinceName) {
		this.provinceName = provinceName;
	}

	public Integer getCityId() {
		return cityId;
	}

	public void setCityId(Integer cityId) {
		this.cityId = cityId;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public Integer getDistrictId() {
		return districtId;
	}

	public void setDistrictId(Integer districtId) {
		this.districtId = districtId;
	}

	public String getDistrictName() {
		return districtName;
	}

	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}

	public String getUserAdress() {
		return userAdress;
	}

	public void setUserAdress(String userAdress) {
		this.userAdress = userAdress;
	}

	public Integer getUserZipcode() {
		return userZipcode;
	}

	public void setUserZipcode(Integer userZipcode) {
		this.userZipcode = userZipcode;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

}
