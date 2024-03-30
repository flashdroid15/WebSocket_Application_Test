package com.websocket.WebSocket.Application;

/** Create a Resource Representation Class **/

 public class Greeting {
    private String content;

    // No-Argument Constructor
    public Greeting() {
    }
    // Constructor
    public Greeting(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}
