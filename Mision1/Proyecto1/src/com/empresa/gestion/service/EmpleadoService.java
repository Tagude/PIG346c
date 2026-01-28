package com.empresa.gestion.service;
import com.empresa.gestion.model.Empleado;
import java.util.ArrayList;

public class EmpleadoService {
    private ArrayList<Empleado> empleados = new ArrayList<>();

    // Método para agregar un empleado a la lista
    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
        System.out.println("Empleado agregado: " + empleado.getNombre());
    }
    // Método para listar todos los empleados
    public void listarEmpleados() {
        if(empleados.isEmpty()) {
            System.out.println("No hay empleados registrados.");
            return;
        } 
            for (Empleado emp : empleados) {
                System.out.println(emp.resumen());
            }
    }

    // Método para eliminar un empleado por ID
    public void eliminarEmpleado(int id) {
        for (int i = 0; i < empleados.size(); i++) {
            if (empleados.get(i).getId() == id) {
                empleados.remove(i);
                System.out.println("Empleado con ID " + id + " eliminado.");
                return;
            }
        }
        System.out.println("Empleado con ID " + id + " no encontrado.");
    }
}
