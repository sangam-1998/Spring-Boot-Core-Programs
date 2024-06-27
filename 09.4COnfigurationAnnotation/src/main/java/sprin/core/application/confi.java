
package sprin.core.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class confi {

	 @Bean("w") // Define a bean named "w"
	 public Watch getWatch() {
	   return new Watch(); // Create and return a new Watch instance
	 }
	 
	 @Bean("sm")
	 public SmartWatch getSW() {
		return new SmartWatch(getWatch());
	 }
}
