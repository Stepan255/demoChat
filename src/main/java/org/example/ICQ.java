package org.example;

import java.util.ArrayList;

class ICQ extends AbstractChat {

    public ICQ(RepositoryClient repositoryClient) {
        this.repositoryClient = repositoryClient;
    }

    RepositoryClient repositoryClient;

    @Override
    public void sendMessage(String text, User me) {

        for (User user : repositoryClient.getAll()) {
            if (user.name != me.name) {
                user.printMessage(text);
            }
        }
    }

    @Override
    public void appendClient(User user) {
        System.out.println("\n >>> РґРѕР±Р°РІРёР»СЃСЏ " + user.name);
        repositoryClient.add(user);

    }
}
