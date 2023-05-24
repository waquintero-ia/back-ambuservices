package com.example.myapplication.model;

public class Empleado {

    private long id;
    private String password;
    private String email;

    public Empleado(){
    }

    public  Empleado (Long id, String password, String email){
        this.password = password;
        this.email = email;
    }

    public long getId(int i){
        return id;
    }

    public void setId (Long id){
        this.id = id;
    }

    public String getPassword(){
        return password;
    }

    public void setPassword(String password){
        this.password =password;
    }

    public String getEmail(){return email;}

    public void setEmail (String email){ this.email=email;}

    public  String toString(){
        return "Empleado(" +
                "id=" + id +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

}
