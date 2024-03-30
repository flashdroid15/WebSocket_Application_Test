package com.websocket.WebSocket.Application;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.util.HtmlUtils;

/** Create a Message-handling Controller **/

@Controller
// @Controller annotation is used to mark a class as a Spring MVC controller
public class GreetingController {

    @MessageMapping("/hello")   /*
    @MessageMapping annotation is used to map a message to a method
    "/hello" is a destination
    A message to this destination calls the greeting() method
    */
    @SendTo("/topic/greetings") /*
    @SendTo annotation is used to send a message to a client
    */
    public Greeting greeting(HelloMessage message) throws Exception {
        Thread.sleep(300);
        // simulated delay of 0.3 seconds

        return new Greeting("YO YO WHAT'S POPPIN, " + HtmlUtils.htmlEscape(message.getName()) + "!");
        // Use HtmlUtils.htmlEscape() to make it safe for use in HTML
    }

}
