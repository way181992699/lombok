package com.ym;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

public class NonNullLombok {
    /**
     * 该注解使用在属性上，该注解用于属的非空检查，当放在setter方法的字段上，将生成一个空检查，如果为空，则抛出NullPointerException。
     * 该注解会默认是生成一个无参构造。
     */
    @NonNull
    private String id;
    @Getter
    @Setter
    @NonNull
    private String name;


}
