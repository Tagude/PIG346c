package com.empresa.gestion.model;

public class Persona {
    //🔐 Encapsulación
    private String nombre;
    protected int edad;
    protected boolean activo; //true o false
    protected char genero;  //'M' o 'F'

    //🧱 Constructor
    public Persona(String nombre, int edad, boolean activo, char genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.activo = activo;
        this.genero = genero;
    }
    //🔧 Getters y Setters
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public char getGenero() {
        return genero;
    }
    public void setGenero(char genero) {
        this.genero = genero;
    }

    //📝 Método
    public void presentarse() {
        System.out.println("Hola, mi nombre es " + nombre + " y tengo " + edad + " años.");
    }

    public void mostrarInformacionBasica() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Genero: " + genero);
        System.out.println("Activo: " + activo);
    }
}
