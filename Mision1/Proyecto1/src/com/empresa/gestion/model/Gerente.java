package com.empresa.gestion.model;

public class Gerente extends Empleado {
    private String departamento;

    public Gerente(String nombre, int edad, double salario, String departamento) {
        super(nombre, edad, salario);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    //Sobrescritura de método, polimorfismo
    @Override
    public void presentarse() {
        super.presentarse();
        System.out.println("Soy el gerente del departamento de: " + departamento);
    }
    
}
