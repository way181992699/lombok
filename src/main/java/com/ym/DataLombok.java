package com.ym;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * 对象相关的注解
 */
@Data
public class DataLombok {
    /**
     * @Data
     * 该注解使用在类上，该注解会提供：无参构造，getter、setter、equals、canEqual、hashCode、toString方法。
     */

    private Integer id;

    private String userName;

    private Date birthday;

    private boolean marry;



}
