/**
 *
 * @author ksinay
 */
// Archivo: EmpleadoAsalariado.java
public class EmpleadoAsalariado extends Empleado {

    // Constructor
    public EmpleadoAsalariado(String nombre, String id, double salario_base) {
        super(nombre, id, salario_base);
    }

    // Implementación del método para calcular el salario
    @Override
    public double calcularSalario() {
        // El salario es el salario base mensual
        return salario_base;
    }
}
