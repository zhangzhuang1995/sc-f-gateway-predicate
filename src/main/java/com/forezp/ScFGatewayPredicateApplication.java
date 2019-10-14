package com.forezp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScFGatewayPredicateApplication {

	public static void main(String[] args) {
		SpringApplication.run(ScFGatewayPredicateApplication.class, args);
	}

	/**
	 * 客户端向Spring Cloud Gateway发出请求。
	 * 如果Gateway Handler Mapping确定请求与路由匹配（这个时候就用到predicate），则将其发送到Gateway web handler处理。
	 * Gateway web handler处理请求时会经过一系列的过滤器链。 过滤器链可以在发送代理请求之前或之后执行过滤逻辑。
	 * 先执行所有“pre”过滤器逻辑，然后进行代理请求。
	 *
	 * http://localhost:8081
	 */

}
