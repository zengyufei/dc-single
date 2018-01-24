package com.zyf.lf.service;

import com.baomidou.mybatisplus.service.IService;
import com.zyf.lf.models.entity.OsUser;
import org.springframework.security.core.userdetails.UserDetailsService;

/**
 * <p>
 * 服务类
 * </p>
 * @author zengyufei
 * @since 2018-01-24
 */
public interface IOsUserService extends IService<OsUser>, UserDetailsService {

}
