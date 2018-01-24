package com.zyf.lf.models.vo.sys;

import com.baomidou.mybatisplus.annotations.TableName;
import com.zyf.lf.base.BaseEntity;

@TableName(value = "user")
public class UserVo extends BaseEntity {

    private String username;

    private Boolean enabled;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }
}
