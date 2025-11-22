//Creamos la clase con la union de la clase abstracta
public class EmpleadoAsalariado extends Empleado {
    private int mes;
//Creamos el constructor 
    public EmpleadoAsalariado(double salario,int mes) {
        super(salario);
        this.mes = mes;
    }
//Creamos el metodo calcularsalario
    @Override
    public double calcularSalario() {
        return salario*mes;
    }
}
