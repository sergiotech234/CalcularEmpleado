import com.sun.source.tree.ReturnTree;

public class EmpleadoPorHoras extends Empleado {
    private double horas;
    public EmpleadoPorHoras(double salario,double horas) {
        super(salario);
        this.horas = horas;
    }
    @Override
    public double calcularSalario() {
        return salario * horas;
    }
}
