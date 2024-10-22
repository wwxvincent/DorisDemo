package com.vincent.dorisdemo.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import javax.sql.DataSource;

/**
 * @Author: Vincent(Wenxuan) Wang
 * @Date: 10/21/24
 * @Description:
 */
@Configuration
@MapperScan(basePackages  = "com.vincent.dorisdemo.mapper" , sqlSessionFactoryRef = "dorisSqlSessionFactory")
public class DorisConfig {
    private static final String MAPPER_LOCATION = "classpath*:mapper/doris/*.xml";
    private static final String TYPE_ALIASES_PACKAGE = "com.vincent.dorisdemo.entity.*";

    @Bean("dorisDataSource")
    @ConfigurationProperties(prefix = "spring.datasource.doris")
    public DataSource getDb1DataSource(){
        return DataSourceBuilder.create().build();
    }

    @Bean("dorisSqlSessionFactory")
    public SqlSessionFactory dorisSqlSessionFactory(@Qualifier("dorisDataSource") DataSource dataSource) throws Exception {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(dataSource);
        bean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources(MAPPER_LOCATION));
        bean.setTypeAliasesPackage(TYPE_ALIASES_PACKAGE);
        return bean.getObject();
    }


    //Doris是否需要配置事务
    /*@Bean(name = "dorisTransactionManager")
    public DataSourceTransactionManager dorisTransactionManager(@Qualifier("dorisDataSource") DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }*/


    @Bean("dorisSqlSessionTemplate")
    public SqlSessionTemplate dorisSqlSessionTemplate(@Qualifier("dorisSqlSessionFactory") SqlSessionFactory sqlSessionFactory){
        return new SqlSessionTemplate(sqlSessionFactory);
    }
}