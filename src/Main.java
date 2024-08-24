/**
 *
 * @author ksinay
 */
// Archivo: Main.java
public class Main {
    public static void main(String[] args) {
        // Crear una instancia de EmpleadoAsalariado
        Empleado empleado1 = new EmpleadoAsalariado("Juan Pérez", "001", 1500.00);

        // Crear una instancia de EmpleadoPorHoras
        Empleado empleado2 = new EmpleadoPorHoras("Ana López", "002", 0, 20.00, 80);

        // Mostrar información de los empleados y calcular sus salarios
        empleado1.mostrarInformacion();
        System.out.println("Salario Calculado: " + empleado1.calcularSalario());
        System.out.println();

        empleado2.mostrarInformacion();
        System.out.println("Salario Calculado: " + empleado2.calcularSalario());
    }
}

