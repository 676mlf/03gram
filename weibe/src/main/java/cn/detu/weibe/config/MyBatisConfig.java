package cn.detu.weibe.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("cn.detu.weibe.mapper")
public class MyBatisConfig {
}
