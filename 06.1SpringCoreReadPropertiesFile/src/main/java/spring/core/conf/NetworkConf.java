package spring.core.conf;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

@ComponentScan("spring.core")
@PropertySource("classpath:conf.properties")
public class NetworkConf {

	
}
