package com.empresa.gestion.model;

public class Empleado extends Persona{
    private double salario;
    private int horasTrabajadas;

    public Empleado(int id, String nombre, int edad, boolean activo, char genero, double salario, int horasTrabajadas) {
        super(id, nombre, edad, activo, genero);
        this.salario = salario;
        this.horasTrabajadas = horasTrabajadas;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }
    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    //Sobrescritura de método, polimorfismo
    @Override
    public void presentarse() {
        super.presentarse();
        System.out.println("Mi salario es: " + salario);
    }

    public double calcularSalarioMensual() {
        double valorHora = salario / 160; // Suponiendo 160 horas trabajadas al mes
        double salarioFinal = valorHora * horasTrabajadas;
        return salarioFinal;
    }
    //Agregamos reglas de negocio
    public boolean esMayorDeEdad() {
        return getEdad() >= 18;
    }
    public boolean puedeTrabajar() {
        return esMayorDeEdad() && activo == true;
    }
    public String clasificarEmpleado(){
        if (edad < 18){
            return "Menor de edad (No puede trabajar)";
        }
        else if (edad <= 60)
            return "Empleado activo";
        else
            return "Empleado en edad de retiro";
    }
    public String obtenerTipoEmpleado() {
        // switch se usa cuando hay opciones definidas
        switch (genero) {
            case 'M':
                return "Masculino";
            case 'F':
                return "Femenino";
            default:
                return "No especificado";
        }

    }
    public String resumen(){
        return "ID: " + id + 
                ", Nombre: " + nombre + 
                ", Edad: " + edad + 
                ", Activo: " + activo +
                ", Género: " + genero +
                ", Salario: " + salario +
                ", Horas Trabajadas: " + horasTrabajadas;
    }
}