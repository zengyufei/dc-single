package com.zyf.lf.models.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

/**
 * <p>
 * 用户表
 * </p>
 * @author zengyufei
 * @since 2018-01-24
 */
@TableName("os_user")
public class OsUser implements Serializable, UserDetails {

    private static final long serialVersionUID = 1L;

    /**
     * 用户ID
     */
    @TableField(value = "user_id")
    private Long userId;

    /**
     * 用户编号
     */
    @TableField(value = "user_number")
    private Long userNumber;

    /**
     * 昵称
     */
    @TableField(value = "user_name")
    private String username;

    /**
     * 登录密码
     */
    @TableField(value = "login_password")
    private String password;

    /**
     * 加密密码的盐
     */
    private String salt;

    /**
     * 真实姓名
     */
    @TableField(value = "real_name")
    private String name;

    /**
     * 性别 0=保密/1=男/2=女
     */
    private Integer sex;

    /**
     * 年龄
     */
    private Integer age;

    /**
     * 用户头像
     */
    @TableField(value = "pic_img")
    private String picImg;

    /**
     * 状态 0=冻结/1=正常
     */
    private Integer status;

    /**
     * 邮箱激活 0=未激活/1=已激活
     */
    @TableField(value = "email_is_active")
    private Integer emailIsActive;

    /**
     * 电子邮箱
     */
    private String email;

    /**
     * 手机号码
     */
    private String telephone;

    /**
     * 最后登录时间
     */
    @TableField(value = "last_login_time")
    private Date lastLoginTime;

    /**
     * 最后登录IP
     */
    @TableField(value = "last_login_ip")
    private String lastLoginIp;

    /**
     * 登录次数
     */
    @TableField(value = "login_number")
    private Long loginNumber;

    /**
     * 注册时间
     */
    @TableField(value = "regeist_time")
    private Date regeistTime;

    /**
     * 创建者
     */
    @TableField(value = "create_by")
    private String createBy;

    /**
     * 更新时间
     */
    @TableField(value = "update_time")
    private Date updateTime;

    /**
     * 更新者
     */
    @TableField(value = "update_by")
    private String updateBy;

    /**
     * 消费额
     */
    private BigDecimal amount;

    /**
     * 会员等级ID
     */
    @TableField(value = "rank_id")
    private Long rankId;

    /**
     * 会员积分
     */
    private Integer score;

    private boolean enabled;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getUserNumber() {
        return userNumber;
    }

    public void setUserNumber(Long userNumber) {
        this.userNumber = userNumber;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getPicImg() {
        return picImg;
    }

    public void setPicImg(String picImg) {
        this.picImg = picImg;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getEmailIsActive() {
        return emailIsActive;
    }

    public void setEmailIsActive(Integer emailIsActive) {
        this.emailIsActive = emailIsActive;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public String getLastLoginIp() {
        return lastLoginIp;
    }

    public void setLastLoginIp(String lastLoginIp) {
        this.lastLoginIp = lastLoginIp;
    }

    public Long getLoginNumber() {
        return loginNumber;
    }

    public void setLoginNumber(Long loginNumber) {
        this.loginNumber = loginNumber;
    }

    public Date getRegeistTime() {
        return regeistTime;
    }

    public void setRegeistTime(Date regeistTime) {
        this.regeistTime = regeistTime;
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

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Long getRankId() {
        return rankId;
    }

    public void setRankId(Long rankId) {
        this.rankId = rankId;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    @Override
    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    @Override
    public String getUsername() {
        return username;
    }

    @JsonIgnore
    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @JsonIgnore
    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @JsonIgnore
    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @JsonIgnore
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        List<GrantedAuthority> authorities = new ArrayList<>();
       /* for (Role role : roles) {
            authorities.add(new SimpleGrantedAuthority(role.getName()));
        }*/
        return authorities;
    }

    @JsonIgnore
    @Override
    public String getPassword() {
        return password;
    }
}
