package com.company;

import javax.print.DocFlavor;

public class Main {
// Para practicar la encapsulación:
//
//Crear clase Persona.
//
//Crear variables las privadas edad, nombre y telefono de la clase Persona.
//
//Crear gets y sets de cada propiedad.
//
//Crear un objeto persona en el main.
//
//Utiliza los gets y sets para darle valores a las propiedades edad, nombre y telefono, por último muéstralas por consola.
    public static void main(String[] args) {
        // write your code here
        Persona persona = new Persona();
        persona.setEdad(24);
        persona.setNombre("Rodrigo");
        persona.setTelefono(1164414258);
        System.out.println(persona.getEdad());
        System.out.println(persona.getNombre());
        System.out.println(persona.getTelefono());
    }
static class Persona   {
private     int Edad;
private String Nombre;
private int Telefono;

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public int getEdad() {
        return this.Edad;

    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setTelefono(int telefono) {
        Telefono = telefono;
    }

    public int getTelefono() {
        return Telefono;
    }
}
}

