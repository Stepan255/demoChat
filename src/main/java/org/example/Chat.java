package org.example;

interface Chat {
    void sendMessage(String msg, User client);

    void appendClient(User client);
}
