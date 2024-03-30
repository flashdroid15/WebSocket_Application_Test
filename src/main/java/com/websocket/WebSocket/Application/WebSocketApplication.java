package com.websocket.WebSocket.Application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
/** A convenient annotation that adds
 * @Configuration, @EnableAutoConfiguration, and @ComponentScan
 */
public class WebSocketApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebSocketApplication.class, args);
	}

}
