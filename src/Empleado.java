public abstract class Empleado {
    protected double salario;

    public Empleado(double salario) {
        this.salario = salario;
    }

    public abstract double calcularSalario();

    public void mostrarInformacion() {;
        System.out.println("Salario: $" + calcularSalario());

    }
}

