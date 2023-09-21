package cn.detu.weibe.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@Configuration
public class SecurityConfig  extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
//        super.configure(http);
//        配置白名单
        String[] urls={"/reg.html","/login.html","/v1/users/reg","/v1/users/login"};
        http.authorizeHttpRequests()// 请求认证管理
                .mvcMatchers(urls).permitAll() //匹配上面所有路径
                .anyRequest().authenticated(); //其他路径必须通过验证

//        http.formLogin();//调用框架登录页面
        //没登陆跳自己的页面
        http.exceptionHandling().authenticationEntryPoint(new AuthenticationEntryPoint() {
            @Override
            public void commence(HttpServletRequest request, HttpServletResponse response, AuthenticationException authException) throws IOException, ServletException {
                response.sendRedirect("/login.html");
            }
        });




    }
}
