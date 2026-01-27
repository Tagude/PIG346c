package com.empresa.gestion.service;

import com.empresa.gestion.model.Empleado;

public class NominaService {
    public double calcularNomina(Empleado empleado) {
        return empleado.getSalario() * 12;
    }
    public double calcularTotalNomina(double[] nominas) {
        double total = 0;
        for (int i = 0; i < nominas.length; i++) {
            total += nominas[i];
        }
        return total;
    }
    public void simularPagos(int meses){
        int contador = 1;
        while (contador <= meses){
            System.out.println("Procesando pagos del mes: " + contador);
            contador++; // contador = contador +1
        }
    }
}
