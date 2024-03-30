package com.websocket.WebSocket.Application;

/** Create a Resource Representation Class **/

public class HelloMessage {
    private String name;

    // No-Argument Constructor
    public HelloMessage() {
    }
    // Constructor
    public HelloMessage(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
        }
}