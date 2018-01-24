package com.zyf.lf.service.impl;

import com.zyf.lf.models.entity.CmsLog;
import com.zyf.lf.mapper.CmsLogMapper;
import com.zyf.lf.service.ICmsLogService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 日志记录表  服务实现类
 * </p>
 *
 * @author zengyufei
 * @since 2018-01-24
 */
@Service
public class CmsLogServiceImpl extends ServiceImpl<CmsLogMapper, CmsLog> implements ICmsLogService {
	
}
