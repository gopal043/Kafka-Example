package com.xtglobal.springbootkafkatutorial.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.xtglobal.springbootkafkatutorial.payload.User;

@Service
public class JsonKafkaConsumer {

	private static final Logger LOGGER = LoggerFactory.getLogger(JsonKafkaConsumer.class);

	@KafkaListener(topics = "xtglobal_json",groupId = "myGroup")
	public void consume(User user) {
		LOGGER.info(String.format("Json MEssage Recieved", user));
	}
}
