package com.techcourse.aspectj;

import com.techcourse.sample.World;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy(proxyTargetClass = true)  // AspectJ AOP 활성화. proxyTargetClass = true로 설정하면 CGLIB 프록시를 사용
@ComponentScan(basePackages = {"com.techcourse.aspectj", "com.techcourse.sample"})
public class AopConfig {

    @Bean
    public World world() {
        return new World();
    }
}
