package api

import springfox.documentation.swagger2.annotations.EnableSwagger2

@Grab(group='org.springframework.boot', module='spring-boot-starter-web', version='1.3.2.RELEASE')
@Grab(group='org.springframework.boot', module='spring-boot-starter-redis', version='1.3.2.RELEASE')
@Grab(group='org.springframework.boot', module='spring-boot-starter-actuator', version='1.3.2.RELEASE')
@Grab(group='io.springfox', module='springfox-swagger2', version='2.3.1')
@Grab(group='io.springfox', module='springfox-swagger-ui', version='2.3.1')


@EnableSwagger2
class Config {
}
