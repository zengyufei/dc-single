package com.zyf.lf.service.impl;

import com.zyf.lf.models.entity.CmsUser;
import com.zyf.lf.mapper.CmsUserMapper;
import com.zyf.lf.service.ICmsUserService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 管理员表  服务实现类
 * </p>
 *
 * @author zengyufei
 * @since 2018-01-24
 */
@Service
public class CmsUserServiceImpl extends ServiceImpl<CmsUserMapper, CmsUser> implements ICmsUserService {
	
}
