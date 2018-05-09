package yyl.springcloud.configuration;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class BeanConfiguration {

	@Bean
	@LoadBalanced // 开启负载均衡
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
}
