package tw.lazycat.line_message_keep.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

@Configuration
public class LineBotConfig {
	
	@Autowired
	private Environment environment;
	
	@Bean
	public String channelAccessToken() {
		return environment.getProperty("CHANNEL_ACCESS_TOKEN");
	}
}
