package com.spring.config;

import org.springframework.boot.autoconfigure.orm.jpa.HibernateProperties;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateSettings;
import org.springframework.boot.autoconfigure.orm.jpa.JpaProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import java.util.Map;

/**
 * 本地H2数据库配置
 * @since 2020/12/23
 */
@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(
        // repository包名
        basePackages = com.spring.config.LocalJpaConfig.LOCAL_PACKAGES,
        // 实体管理bean名称
        entityManagerFactoryRef = "localEntityManagerFactory",
        // 事务管理bean名称
        transactionManagerRef = "localTransactionManager"
)
public class LocalJpaConfig {

    public static final String LOCAL_PACKAGES = "com.spring.config.reppository.local";

    private static Map<String, Object> genDatasourceProperties() {

        JpaProperties jpaProperties = new JpaProperties();
        jpaProperties.setOpenInView(false);
        jpaProperties.setShowSql(false);

        HibernateProperties hibernateProperties = new HibernateProperties();
        // 每次启动都删除数据（重启后原来的Instance已经通过故障转移更换了Server，老的日志数据也没什么意义了）
        hibernateProperties.setDdlAuto("create");
        return hibernateProperties.determineHibernateProperties(jpaProperties.getProperties(), new HibernateSettings());
    }


}
