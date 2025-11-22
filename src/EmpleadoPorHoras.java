//Creamos la calse EmpleadoPorHoras y lo anexamos con la clase abastarcta Empleado
public class EmpleadoPorHoras extends Empleado {
    private double horas;
    //Creamos el constructor 
    public EmpleadoPorHoras(double salario,double horas) {
        super(salario);
        this.horas = horas;
    }
    //Creamos el metodo calcular salario
    @Override
    public double calcularSalario() {
        return salario * horas;
    }
}
