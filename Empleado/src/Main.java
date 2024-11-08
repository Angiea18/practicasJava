public class Main {
    public static void main(String[] args) {
        Empresa empresa = new Empresa("CIF123456", "Tech Solutions");
        Empleado empleado1 = new Empleado("12345678A", "Angie Arango", 28, Departamento.INFORMATICA, true, empresa);
        Empleado empleado2 = new Empleado("87654321B", "Andrea Santiago", 25, Departamento.CONTABILIDAD, false, empresa);

        System.out.println(empleado1);
        System.out.println(empleado2);

        if (empleado1.equals(empleado2)) {
            System.out.println("Los empleados son iguales.");
        } else {
            System.out.println("Los empleados son diferentes.");
        }
    }
}
