public class MainEmpleado {
    public static void main(String[] args) {
        EmpleadoAsalariado meses= new EmpleadoAsalariado(700,8);
        EmpleadoPorHoras porHoras= new EmpleadoPorHoras(700,9);

        System.out.println("Salario mensual");
        meses.mostrarInformacion();
        System.out.println();
        System.out.println("Salario por horas");
        porHoras.mostrarInformacion();
    }
}