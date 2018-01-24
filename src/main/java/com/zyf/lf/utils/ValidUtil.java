/**
 * Copyright (C): 恒大集团©版权所有 Evergrande Group
 * FileName: EnumUtils
 * Author:   zengyufei
 * Date:     2017-11-6 19:11
 * Description: jsr 303 验证的工具类
 */


package com.zyf.lf.utils;


import com.zyf.lf.config.exceptions.ValidError;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;
import java.util.Set;


/**
 * jsr 303 验证的工具类
 * @author zengyufei
 * @create 2017-11-6
 * @since 1.0.0
 */
@Component
public class ValidUtil {

    @Autowired
    private Validator validator;

    public <T> Set<ConstraintViolation<T>> validate(T object, Class<?>... groups) {
        return validator.validate(object, groups);
    }

    public <T> Set<ConstraintViolation<T>> validateValue(Class<T> beanType, String propertyName, Object value, Class<?>... groups) {
        return validator.validateValue(beanType, propertyName, value, groups);
    }

    /**
     * 校验参数，并返回第一个错误提示
     * @param t 验证的对象
     * @param groups 验证的组别
     * @param <T> 对象擦除前原类型
     * @return 第一个错误提示
     */
    public <T> void validAndReturnFirstErrorTips(T t, Class<?>... groups) {
        Set<ConstraintViolation<T>> validate = validator.validate(t, groups);
        if (validate.size() > 0) {
            ConstraintViolation<T> next = validate.iterator().next();
            String message = next.getRootBeanClass().getName() + "-" + next.getPropertyPath() + "-" + next.getMessage();
            throw new ValidError(message);
        }
    }

    /**
     * 校验参数，并返回第一个错误提示
     * @param targetClass 验证的对象的 class 类型
     * @param fieldName 需要验证的名字
     * @param obj 需要属性值
     * @param groups 验证的组别
     * @param <T> 对象擦除前原类型
     * @return 第一个错误提示
     */
    public <T> void validAndReturnFirstErrorTips(Class targetClass, String fieldName, Object obj, Class<?>... groups) {
        Set<ConstraintViolation<T>> validate = validator.validateValue(targetClass, fieldName, obj, groups);
        if (validate.size() > 0) {
            String message = targetClass.getName() + "-" + fieldName + "-" + validate.iterator().next().getMessage();
            throw new ValidError(message);
        }
    }
}
