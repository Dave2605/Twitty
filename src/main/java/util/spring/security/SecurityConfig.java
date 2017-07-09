package util.spring.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.method.configuration.GlobalMethodSecurityConfiguration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import util.spring.RootConfig;

import javax.sql.DataSource;

/**
 * Created by dave on 14.05.17.
 */
@Configuration
@EnableWebSecurity
@Import(RootConfig.class)
// annotation-based method security in Spring
@EnableGlobalMethodSecurity(securedEnabled = true)
public class SecurityConfig extends GlobalMethodSecurityConfiguration {

    @Autowired
    DataSource dataSource;
//
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        // in-memory auth
//        auth.inMemoryAuthentication().withUser("user").password("user").roles("USER")
//                .and().withUser("admin").password("admin").roles("USER", "ADMIN");
//    }
//
    @Autowired
    public void configAuthentication(AuthenticationManagerBuilder auth) throws Exception {
        auth.jdbcAuthentication().dataSource(dataSource)
        .usersByUsernameQuery("select username,password,enabled from users where username=?")
        .authoritiesByUsernameQuery("select username,role from user_roles where username=?");
    }


//    // для каждого запроса отдельная конфигурация
//    protected void configure(HttpSecurity http) throws Exception {
//            http
//                    .formLogin().and()
//                    .authorizeRequests()
//                    .anyRequest().permitAll().and().csrf().disable();
//    }
}
