package com.empresa.gestion.app;

import com.empresa.gestion.model.*;
import com.empresa.gestion.service.NominaService;

public class Main {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Ana", 28, 3000.00);
        Gerente gerente1 = new Gerente("Luis", 40, 6000.00, "Ventas");
        empleado1.presentarse();
        gerente1.presentarse();
        NominaService nominaService = new NominaService();
        System.out.println("Nómina anual de " + empleado1.getNombre() + ": " + nominaService.calcularNomina(empleado1));
        System.out.println("Nomina anual de " + gerente1.getNombre() + ": " + nominaService.calcularNomina(gerente1));
    }
}