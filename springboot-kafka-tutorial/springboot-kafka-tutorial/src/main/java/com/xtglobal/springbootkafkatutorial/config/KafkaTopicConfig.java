package com.xtglobal.springbootkafkatutorial.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {

	@Bean
	public NewTopic xtglobalTopic() {
		return TopicBuilder
			   .name("xtglobal")
			   .build();
	}
	
	@Bean
	public NewTopic xtglobalJsonTopic() {
		return TopicBuilder
			   .name("xtglobal_json")
			   .build();
	}
}
