package org.example;

public class Admin extends User {

    public Admin(String name, Chat chatroom) {
        super(name, chatroom);
    }

    public void del(Client client, Chat chatRoom) {
        client.setChatroom(null);
    }
}
