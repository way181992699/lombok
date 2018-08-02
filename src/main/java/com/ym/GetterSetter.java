package com.ym;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * 对象相关的注解
 */
@Getter
@Setter
public class GetterSetter {
    /**
     * @Getter和@Setter
     * 该注解使用在类或者属性上，该注解可以使用在类上也可以使用在属性上。生成的getter遵循布尔属性的约定。例如：boolean类型的sex,getter方法为isSex而不是getSex
     *
     * 在使用该注解时，会默认生成一个无参构造。和对应的getterhe setter方法
     *
     * 该注解也可以使用在单个属性上，会默认生成一个无参构造：
     */

    private Integer id;
//    @Getter
//    @Setter
    private String userName;

    private Date birthday;

    private boolean marry;



}
