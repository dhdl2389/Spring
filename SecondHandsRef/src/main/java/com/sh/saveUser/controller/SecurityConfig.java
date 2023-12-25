package com.sh.saveUser.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.session.SessionRegistry;
import org.springframework.security.core.session.SessionRegistryImpl;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    // 비밀번호 인코더 빈 등록
    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    // 세션 관리를 위한 빈 등록
    @Bean
    public SessionRegistry sessionRegistry() {
        return new SessionRegistryImpl();
    }

    // Spring Security 설정
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
            // 요청에 대한 권한 설정
            .authorizeRequests()
                // "/secondHands/**" 경로는 모든 사용자에게 허용
                .antMatchers("/secondHands/**").permitAll()
                // 나머지 모든 요청은 인증된 사용자에게만 허용
                .anyRequest().authenticated()
            .and()
            // 폼 로그인 구성
            .formLogin()
                // 로그인 페이지 URL 설정
                .loginPage("/login")
                // 로그인 페이지는 모든 사용자에게 허용
                .permitAll()
                // 로그인 성공 시 기본적으로 "/homePage"로 이동
                .defaultSuccessUrl("/homePage")
            .and()
            // 로그아웃 구성
            .logout()
                // 로그아웃은 모든 사용자에게 허용
                .permitAll()
            .and()
            // 세션 관리 구성
            .sessionManagement()
                // 세션 필요 시 생성하도록 설정
                .sessionCreationPolicy(SessionCreationPolicy.IF_REQUIRED)
                // 동시에 하나의 세션만 허용
                .maximumSessions(1)
                // 세션이 만료된 경우 "/login"로 이동
                .expiredUrl("/login")
                // 세션 관리를 위해 정의한 빈 사용
                .sessionRegistry(sessionRegistry());
    }
}