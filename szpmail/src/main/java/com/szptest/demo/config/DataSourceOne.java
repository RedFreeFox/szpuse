package com.szptest.demo.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;

//@Configuration//注册到Spring容器中
//@MapperScan(basePackages="com.szptest.demo.service",sqlSessionFactoryRef="db1SqlSessionFactory")
public class DataSourceOne {

    //private DataSource1(){}

    /**
     * 配置db1数据库
     * @return
     */
   /* @Bean(name="db1Datasource")
    @ConfigurationProperties(prefix="spring.datasource")
    public DataSource testDatasource() {
        return DataSourceBuilder.create().build();
    }
    *//**
     * 创建SqlSessionFactory
     * @param dataSource
     * @return
     * @throws Exception
     *//*
    @Bean(name="db1SqlSessionFactory")
    @Primary
    public SqlSessionFactory testSqlSessionFactory(@Qualifier("db1Datasource")DataSource dataSource)
            throws Exception {
        SqlSessionFactoryBean bean=new SqlSessionFactoryBean();
        bean.setDataSource(dataSource);
        return bean.getObject();
    }
    *//**
     * 配置事务管理
     * @param dataSource
     * @return
     *//*
    @Bean(name="db1TransactionManager")
    public DataSourceTransactionManager testTransactionManager(
            @Qualifier("db1Datasource")DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }

    @Bean(name="db1SqlSessionTemplate")
    public SqlSessionTemplate testSqlSessionTemplate(@Qualifier("db1SqlSessionFactory")
                                                             SqlSessionFactory sqlSessionFactory) {
        return new SqlSessionTemplate(sqlSessionFactory);
    }*/
}
