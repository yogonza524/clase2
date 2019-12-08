package com.clase2;

import java.lang.reflect.Field;

public class Man extends Person {

    private String name = "Gonza";
    private String lastName = "Mendoza";
    private int edad = 32;

    @Override
    void saludar() {
        System.out.println("I'm a man");
    }

    void imprimirAtributos() throws IllegalAccessException {
        Field[] attributes = this.getClass().getDeclaredFields();

        for (Field field : attributes) {
            field.setAccessible(true);
            System.out.println(field.getName() + ": " + field.get(this));
        }
    }
}
