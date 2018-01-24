package com.zyf.lf.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.zyf.lf.mapper.OsUserMapper;
import com.zyf.lf.models.entity.OsUser;
import com.zyf.lf.service.IOsUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

/**
 * <p>
 * 用户表  服务实现类
 * </p>
 * @author zengyufei
 * @since 2018-01-24
 */
@Service
public class OsUserServiceImpl extends ServiceImpl<OsUserMapper, OsUser> implements IOsUserService {

    @Autowired
    private OsUserMapper osUserMapper;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        List<OsUser> osUsers = osUserMapper.selectByMap(new HashMap<String, Object>() {{
            put("user_name", username);
        }});
        if (osUsers.isEmpty()) {
            throw new UsernameNotFoundException("用户名不对");
        }
        return osUsers.get(0);
    }
}
