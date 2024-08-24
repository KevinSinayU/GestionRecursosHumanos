/**
 *
 * @author ksinay
 */
// Archivo: Empleado.java
public abstract class Empleado {
    protected String nombre;
    protected String id;
    protected double salario_base;

    // Constructor
    public Empleado(String nombre, String id, double salario_base) {
        this.nombre = nombre;
        this.id = id;
        this.salario_base = salario_base;
    }

    // Método abstracto para calcular el salario
    public abstract double calcularSalario();

    // Método concreto para mostrar la información del empleado
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("ID: " + id);
        System.out.println("Salario Base: " + salario_base);
    }
}
