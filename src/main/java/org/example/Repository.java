package org.example;

import java.util.ArrayList;

public abstract class Repository {
    ArrayList<User> users = new ArrayList<>();

    public void add(User user){
        users.add(user);
    }

    public ArrayList<User> getAll(){
        return users;
    }
}
