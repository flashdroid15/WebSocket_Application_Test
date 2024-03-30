package com.websocket.WebSocket.Application;

/** Configure Spring for STOMP messaging **/

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;

@Configuration
// Indicates it's a Spring configuration class
@EnableWebSocketMessageBroker
// Enables WebSocket message handling
public class WebSocketConfig implements WebSocketMessageBrokerConfigurer {

    @Override
    public void configureMessageBroker(MessageBrokerRegistry config) {
        // Implements default method to configure the message broker

        config.enableSimpleBroker("/topic");
        // Clients can subscribe to topics starting with /topic to receive messages
        // Carries messages to the client on destinations starting with /topic
        config.setApplicationDestinationPrefixes("/app");
        // Clients can send messages to destinations starting with /app
        // Triggers methods annotated with @MessageMapping
    }

    public void registerStompEndpoints(StompEndpointRegistry registry) {
        // This method configures the WebSocket endpoint that clients can connect to

        registry.addEndpoint("/gs-guide-websocket");
        // The endpoint for WebSocket connections
        // Clients can connect to this endpoint using a WebSocket client
    }

}
