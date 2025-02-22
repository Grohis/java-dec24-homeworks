package ru.otus.java.basic.homeworks.homework13;

class Human {
    private String name;
    private Transport currentTransport;

    public Human(String name) {
        this.name = name;
        this.currentTransport = null;
    }

    public void sit(Transport transport) {
        this.currentTransport = transport;
        System.out.println(name + " сел на " + transport.getName());
    }

    public void getOff() {
        if (currentTransport != null) {
            System.out.println(name + " слез с " + currentTransport.getName());
            currentTransport = null;
        }
    }

    public boolean move(Terrain terrain, int distance) {
        if (currentTransport == null) {
            System.out.println(name + " идет пешком " + distance + " км по " + terrain);
            return true;
        }
        return currentTransport.move(distance, terrain);
    }
}