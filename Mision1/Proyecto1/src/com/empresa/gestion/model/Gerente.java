package com.empresa.gestion.model;

public class Gerente extends Empleado {
    private String departamento;
    private double bono;

    public Gerente(String nombre, int edad, boolean activo, char genero, double salario, int horasTrabajadas, String departamento, double bono) {
        super(nombre, edad, activo, genero, salario, horasTrabajadas);
        this.departamento = departamento;
        this.bono = bono;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public double getBono() {
        return bono;
    }

    public void setBono(double bono) {
        this.bono = bono;
    }

    //Sobrescritura de método, polimorfismo
    @Override
    public void presentarse() {
        super.presentarse();
        System.out.println("Soy el gerente del departamento de: " + departamento);
    }

    @Override
    public double calcularSalarioMensual() {
        double salarioBase = super.calcularSalarioMensual();
        return salarioBase + bono;
    }
}
