package ru.otus.java.basic.homeworks.homework13;

public class Human {
    private String name;
    private Transport currentTransport;

    public Human(String name) {
        this.name = name;
        this.currentTransport = null;
    }

    public void sit(Transport transport) {
        this.currentTransport = transport;
        System.out.println(name + " сул на " + transport.getName());
    }

    public void getOff() {
        if (currentTransport != null) {
            System.out.println(name + " сзел с " + currentTransport.getName());
            currentTransport = null;
        } else {
            System.out.println(name + " и так не использует транспорт");
        }
    }

    public boolean move(String terrain, int distance) {
        if (currentTransport == null) {
            System.out.println(name + " идет пешком " + distance + " км по " + terrain);
            return true;
        }
        return currentTransport.move(distance, terrain);
    }
}
