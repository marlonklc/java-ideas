package com.marlonklc.ideas.fluentinterface.domain;

public class Client {

    private String name;

    private Client(String name) {
        this.name = name;
    }

    public static Client of(String name) {
        return new Client(name);
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                '}';
    }
}
