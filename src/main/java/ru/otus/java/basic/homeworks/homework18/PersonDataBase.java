package ru.otus.java.basic.homeworks.homework18;

import java.util.HashMap;
import java.util.Set;

public class PersonDataBase {
    private final HashMap<Long, Person> personMap = new HashMap<Long, Person>();
    private static final Set<Position> MANAGER_POSITION = Set.of(Position.MANAGER, Position.DIRECTOR, Position.BRANCH_DIRECTOR, Position.SENIOR_MANAGER);

    public void add(Person person){
        personMap.put(person.id, person);
    }

    public Person findById(Long id){
        return personMap.get(id);
    }

    public boolean isManager(Person person){
        return MANAGER_POSITION.contains(person.position);
    }

    public boolean isEmployee(Long id){
        Person person = personMap.get(id);
        return person != null && !MANAGER_POSITION.contains(person.position);
    }
}
