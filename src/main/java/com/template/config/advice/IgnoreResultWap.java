package com.template.config.advice;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 忽略返回
 *
 * @author Doug Liu
 * @since 2022-06-10
 */
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface IgnoreResultWap {

    boolean value() default true;
    String message() default "忽略返回";

    String code() default "200";

    String description() default "忽略返回";
}
