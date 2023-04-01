package org.example;

public abstract class User {
    String name;
    private Chat chatroom;
    public User(String name, Chat chatroom) {
        this.name = name;
        this.chatroom = chatroom;
    }

    void printMessage(String msg) {
        System.out.printf("Р§Р°С‚ %s: %s\n", name, msg);
    }

    void sendMsg(String text) {
        chatroom.sendMessage(text, this);
    }

    public void setChatroom(Chat chatroom) {
        this.chatroom = chatroom;
    }
}
