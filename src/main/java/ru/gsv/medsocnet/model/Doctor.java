package ru.gsv.medsocnet.model;

/**
 * Created by user on 02.10.2016.
 */
public class Doctor {
    private int id;
    private String login;
    private String password;
    private String name;
    private String surname;
    private Specialization spec;

    public Doctor(String name, String surname, Specialization spec, String login, String password){
        this.name = name;
        this.surname = surname;
        this.spec = spec;
        this.login = login;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Specialization getSpec() {
        return spec;
    }

    public void setSpec(Specialization spec) {
        this.spec = spec;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
