package br.com.kimae.usermanager.config.rabbitmq;

import java.lang.annotation.*;

@Target({ElementType.METHOD, ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface CalculateBillTemplate {
}
