package com.empresa.gestion.app;

import com.empresa.gestion.model.*;
import com.empresa.gestion.service.NominaService;

public class Main {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Ana", 28, true, 'F', 3000.00, 160);
        Gerente gerente1 = new Gerente("Luis", 40, true, 'M', 6000.00, 180, "Ventas", 500.0);
        empleado1.presentarse();
        gerente1.presentarse();
        NominaService nominaService = new NominaService();
        System.out.println("====EMPLEADO====");
        empleado1.mostrarInformacionBasica();
        System.out.println("Salario mensual de " + empleado1.getNombre() + ": " + empleado1.calcularSalarioMensual());
        System.out.println("Nómina anual de " + empleado1.getNombre() + ": " + nominaService.calcularNomina(empleado1));
        System.out.println("Puede trabajar? " + empleado1.getNombre() + ": " + empleado1.puedeTrabajar());
        System.out.println("====GERENTE====");
        gerente1.mostrarInformacionBasica();
        System.out.println("Salario mensual de " + gerente1.getNombre() + ": " + gerente1.calcularSalarioMensual());
        System.out.println("Nomina anual de " + gerente1.getNombre() + ": " + nominaService.calcularNomina(gerente1));
        System.out.println("Puede trabajar? " + gerente1.getNombre() + ": " + gerente1.puedeTrabajar());
    }
}