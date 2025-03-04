package ru.otus.java.basic.homeworks.homeworks17;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {
    private final Map<String, List<String>> contacts;

    public PhoneBook() {
        this.contacts = new HashMap<>();
    }

    public void add(String name, String phoneNumber) {
        contacts.putIfAbsent(name, new ArrayList<>());
        contacts.get(name).add(phoneNumber);
    }

    public List<String> find(String name) {
        return contacts.getOrDefault(name, new ArrayList<>());
    }

    public boolean containsPhoneNumber(String phoneNumber) {
        for (List<String> numbers : contacts.values()) {
            if (numbers.contains(phoneNumber)) {
                return true;
            }
        }
        return false;
    }
}
