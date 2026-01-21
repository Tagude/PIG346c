package com.empresa.gestion.service;

import com.empresa.gestion.model.Empleado;

public class NominaService {
    public double calcularNomina(Empleado empleado) {
        return empleado.getSalario() * 12;
    }
}
