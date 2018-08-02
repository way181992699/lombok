package com.ym;


public class LombokAnnotation {
    /**
     * Lombok注解类
     * 定义：在项目中使用Lombok可以减少很多重复代码的书写。比如说getter/setter/toString等方法的编写。
     *
     * IDEA中的安装
     * 打开IDEA的Setting –> 选择Plugins选项 –> 选择Browse repositories –> 搜索lombok –> 点击安装 –> 安装完成重启IDEA –> 安装成功
     *
     * maven依赖
     * <!-- https://mvnrepository.com/artifact/org.projectlombok/lombok -->
     * <dependency>
     *     <groupId>org.projectlombok</groupId>
     *     <artifactId>lombok</artifactId>
     *     <version>1.16.18</version>
     *     <scope>provided</scope>
     * </dependency>
     *
     *
     * Lombok有哪些注解
     * @Setter
     * @Getter
     * @Data
     * @Log(这是一个泛型注解，具体有很多种形式)
     * @AllArgsConstructor
     * @NoArgsConstructor
     * @EqualsAndHashCode
     * @NonNull
     * @Cleanup
     * @ToString
     * @RequiredArgsConstructor
     * @Value
     * @SneakyThrows
     * @Synchronized
     *
     * //@CommonsLog
     * private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(LogExample.class);
     * //@JBossLog
     * private static final org.jboss.logging.Logger log = org.jboss.logging.Logger.getLogger(LogExample.class);
     * //@Log
     * private static final java.util.logging.Logger log = java.util.logging.Logger.getLogger(LogExample.class.getName());
     * //@Log4j
     * private static final org.apache.log4j.Logger log = org.apache.log4j.Logger.getLogger(LogExample.class);
     * //@Log4j2
     * private static final org.apache.logging.log4j.Logger log = org.apache.logging.log4j.LogManager.getLogger(LogExample.class);
     * //@Slf4j
     * private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(LogExample.class);
     * //@XSlf4j
     * private static final org.slf4j.ext.XLogger log = org.slf4j.ext.XLoggerFactory.getXLogger(LogExample.class);
     *
     *
     *
     */
}
