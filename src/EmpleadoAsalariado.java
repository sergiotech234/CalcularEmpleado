public class EmpleadoAsalariado extends Empleado {
    private int mes;

    public EmpleadoAsalariado(double salario,int mes) {
        super(salario);
        this.mes = mes;
    }

    @Override
    public double calcularSalario() {
        return salario*mes;
    }
}
