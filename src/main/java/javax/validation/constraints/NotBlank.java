/**
 * Copyright (C): 恒大集团©版权所有 Evergrande Group
 * FileName: NotBlank
 * Author:   zengyufei
 * Date:     2017/12/13
 * Description: 字符串判空验证
 */
package javax.validation.constraints;


import javax.validation.Constraint;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import javax.validation.Payload;
import java.lang.annotation.*;

/**
 * 字符串判空验证
 * @author zengyufei
 * @create 2017/12/13
 * @since 1.0.0
 */
@Documented
@Constraint(
        validatedBy = {NotBlank.NotBlankValidator.class}
)
@Target({ElementType.FIELD, ElementType.ANNOTATION_TYPE, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
public @interface NotBlank {

    Class<?>[] groups() default {};

    String message() default "{notBlank}";

    Class<? extends Payload>[] payload() default {};

    class NotBlankValidator implements ConstraintValidator<NotBlank, Object> {
        public NotBlankValidator() {
        }

        @Override
        public void initialize(NotBlank constraintAnnotation) {
        }

        @Override
        public boolean isValid(Object value, ConstraintValidatorContext context) {
            return value != null && !value.toString().isEmpty();
        }
    }
}