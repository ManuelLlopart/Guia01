package Models;

public class Empleado {
    private Integer dni;
    private String nombre;
    private String apellido;
    private double salario;


    public Empleado() {
    }

    public Empleado(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Empleado(String nombre, String apellido, double salario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.salario = salario;
    }

    public Empleado(String nombre, String apellido, Integer dni, double salario) {
        this.nombre = nombre;
        this.dni = dni;
        this.apellido = apellido;
        this.salario = salario;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double salarioAnual(){
        return this.salario*12;
    }
    public void aumentoSalarioPorcentual(double porcentaje){
        this.salario=this.salario+((porcentaje/100) * this.salario);
        System.out.println("El salario se aumento un " + porcentaje + "%");
        System.out.println("Quedo " + this.salario);
    }

    public double riseSalary(int porcentaje){
        return salario + (salario*((float)porcentaje/100));
    }
    public void imprimir(){
        System.out.println("Empleado " +
                "[dni=" + this.dni + " " +
                "nombre=" + this.nombre + " " +
                "apellido=" + this.apellido + " " +
                "salario=" + this.salario + "]");
    }


}
