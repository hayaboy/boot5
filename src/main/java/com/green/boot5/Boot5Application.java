package com.green.boot5;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/* @SpringBootConfiguration
@Configuration 포함, @Configuration이 정의된 클래스는 자바 설정 클래스라고 함
자바 설정 클래스는 스프링 부트 애플리케이션을 설정할 수 있고, 별도의 스프링 빈을 정의할 수 있다.

@EnableAutoConfiguration
@Configuration와 같이 사용하면 스프링 부트 프레임워크의 자동 설정 기능 활성화


@ComponentScan
 클래스패스에 포함되어 있는  @Configuration으로 정의된 자바 설정 클래스와 스테레오 타입 어노테이션(컨서레컴)
 으로 정의된 클래스를 스캔함, 찾아낸 것들은 스프링 빈 컨테이너가 스프링 빈으로 로딩하고 관리함

 */
@SpringBootApplication
public class Boot5Application {

	public static void main(String[] args) {
		SpringApplication.run(Boot5Application.class, args);
	}

}
