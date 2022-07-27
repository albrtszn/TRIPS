package org.sazonov.trips.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@EnableWebMvc
public class WebConfig extends WebMvcConfigurerAdapter {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler(
                        "/media/**"
                )
                .addResourceLocations(
                        "classpath:/templates/media//");
    }

//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//
//        http.csrf().disable();
//        http.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.ALWAYS);
//
//        http.authorizeRequests().antMatchers(HttpMethod.GET, "/js/**", "/css/**", "/img/**", "/pressiplus", "/public/**", "/index", "/", "/login").permitAll();
//        http.authorizeRequests()
//                .antMatchers("/secure/admin/**").hasAnyRole("ADMIN", "USER")
//                .antMatchers("/secure/admin/**").hasAnyRole("ADMIN")
//                .and()
//                .formLogin()  //login configuration
//                .loginPage("/login")
//                .failureUrl("/login-error")
//                .loginProcessingUrl("/login")
//                .usernameParameter("email")
//                .passwordParameter("password")
//                .successHandler(myAuthenticationSuccessHandler())
//                .and()
//                .logout()    //logout configuration
//                .logoutUrl("/logout")
//                .logoutSuccessHandler(myLogoutSuccessHandler)
//                .and()
//                .rememberMe()
//                .tokenRepository(persistentTokenRepository())
//                .tokenValiditySeconds(7 * 24 * 60 * 60) // expires in 7 days
//                .and()
//                .exceptionHandling() //exception handling configuration
//                .accessDeniedHandler(accessDeniedHandler());
//    }
}