package ru.otus.java.basic.homeworks;

public class User {
    private String lastName;   // Фамилия
    private String firstName;  // Имя
    private String middleName; // Отчество
    private int birthYear;
    private String email;

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public String getEmail() {
        return email;
    }

    public User(String lastName, String firstName, String middleName, int birthYear, String mail){
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.birthYear = birthYear;
        this.email = mail;
    }

    public void info(){
        System.out.println("ФИО: " + lastName+ " " + firstName + " " + middleName);
        System.out.println("Год рождения: " + birthYear);
        System.out.println("e-mail: " + email);
    }
}
