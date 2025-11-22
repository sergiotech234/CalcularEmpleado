//Creamos la clase abstracta empleado
public abstract class Empleado {
    protected double salario;
//Creamos un constructor con la variable creada 
    public Empleado(double salario) {
        this.salario = salario;
    }
//creamos el metodo de calcular salaraio
    public abstract double calcularSalario();
//Creamos el metodo de mostararInformacion
    public void mostrarInformacion() {;
        System.out.println("Salario: $" + calcularSalario());

    }
}

