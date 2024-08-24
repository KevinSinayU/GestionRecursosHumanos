/**
 *
 * @author ksinay
 */
// Archivo: EmpleadoPorHoras.java
public class EmpleadoPorHoras extends Empleado {
    private double tarifaPorHora;
    private int horasTrabajadas;

    // Constructor
    public EmpleadoPorHoras(String nombre, String id, double salario_base, double tarifaPorHora, int horasTrabajadas) {
        super(nombre, id, salario_base);
        this.tarifaPorHora = tarifaPorHora;
        this.horasTrabajadas = horasTrabajadas;
    }

    // Implementación del método para calcular el salario
    @Override
    public double calcularSalario() {
        // El salario es calculado en base a las horas trabajadas
        return tarifaPorHora * horasTrabajadas;
    }

    // Método para actualizar las horas trabajadas
    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }
}
