package com.empresa.gestion.app;
import com.empresa.gestion.model.Empleado;
import com.empresa.gestion.service.EmpleadoService;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        // Aquí puedes agregar código para probar las funcionalidades de las clases Persona, Empleado, Gerente y NominaService
        Scanner scanner = new Scanner(System.in);
        EmpleadoService service = new EmpleadoService();
        int opcion;

        do {
            System.out.println("\n === Menú de Gestión de Empleados ===");
            System.out.println("\n 1. Agregar Empleado");
            System.out.println("\n 2. Listar Empleados");
            System.out.println("\n 3. Eliminar Empleado");
            System.out.println("\n 4. Buscar Empleado");
            System.out.println("\n 5. Salir");
            System.out.print("\n Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("id: ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); // Consumir el salto de línea
                    System.out.println("Nombre: ");
                    String nombre = scanner.nextLine();
                    System.out.println("Edad: ");
                    int edad = scanner.nextInt();
                    System.out.println("Activo: ");
                    boolean activo = scanner.nextBoolean();
                    System.out.println("Género: ");
                    char genero = scanner.next().charAt(0);
                    System.out.println("Salario: ");
                    double salario = scanner.nextDouble();
                    System.out.println("Horas Trabajadas: ");
                    int horasTrabajadas = scanner.nextInt();
                    Empleado empleado = new Empleado(id, nombre, edad, activo, genero, salario, horasTrabajadas);
                    service.agregarEmpleado(empleado);
                    System.out.println("Empleado agregado exitosamente.");
                    break;
                case 2:
                    service.listarEmpleados();
                    break;
                case 3:
                    System.out.println("Ingrese el ID del empleado a eliminar: ");
                    service.eliminarEmpleado(scanner.nextInt());
                    System.out.println("Empleado eliminado exitosamente.");
                    break;
                case 4:
                    System.out.println("Ingrese el ID del empleado a buscar: ");
                    service.buscarEmpleado(scanner.nextInt());
                    break;
                case 5:
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, intente de nuevo.");
            }   
            
            }while (opcion != 0);
                scanner.close();
    }
}
