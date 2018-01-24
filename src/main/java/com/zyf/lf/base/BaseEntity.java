/**
 * Copyright (C): 恒大集团©版权所有 Evergrande Group
 * FileName: BaseEntity
 * Author:   zengyufei
 * Date:     2018/01/12
 * Description: TODO
 */
package com.zyf.lf.base;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableLogic;
import com.baomidou.mybatisplus.annotations.Version;
import com.baomidou.mybatisplus.enums.FieldFill;

import java.util.Date;

public class BaseEntity {

    protected Long id;

    @TableField(fill = FieldFill.INSERT)
    protected Long createId;

    @TableField(fill = FieldFill.INSERT_UPDATE)
    protected Long modifyId;

    @TableField(fill = FieldFill.INSERT)
    protected Date createTime;

    @TableField(fill = FieldFill.INSERT_UPDATE)
    protected Date updateTime;

    @TableField(fill = FieldFill.INSERT)
    @TableLogic
    protected Boolean deleteFlag;

    @Version
    private Integer version;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCreateId() {
        return createId;
    }

    public void setCreateId(Long createId) {
        this.createId = createId;
    }

    public Long getModifyId() {
        return modifyId;
    }

    public void setModifyId(Long modifyId) {
        this.modifyId = modifyId;
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

    public Boolean isDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(Boolean deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }
}
