public class Empleado {
    private String dni;
    private String nombre;
    private int edad;
    private Departamento departamento;
    private boolean teletrabajo;
    private Empresa empresa;
    private static final double SALARIO_BASE = 1000; // Salario base

    public Empleado(String dni, String nombre, int edad, Departamento departamento, boolean teletrabajo, Empresa empresa) {
        if (!validarDni(dni)) {
            throw new IllegalArgumentException("DNI inválido.");
        }
        if (empresa == null) {
            throw new IllegalArgumentException("La empresa es obligatoria.");
        }
        this.dni = dni;
        this.nombre = nombre;
        this.edad = edad;
        this.departamento = departamento;
        this.teletrabajo = teletrabajo;
        this.empresa = empresa;
    }

    private boolean validarDni(String dni) {
        return dni.matches("\\d{8}[A-Za-z]"); // Validación simple
    }

    public double calcularSueldo() {
        double sueldo = SALARIO_BASE;

        if (edad > 30) sueldo += 200;
        switch (departamento) {
            case CONTABILIDAD -> sueldo += 50;
            case INFORMATICA -> sueldo += 80;
            case DIRECCION -> sueldo += 100;
        }
        if (teletrabajo) sueldo += 30;

        return sueldo;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", departamento=" + departamento +
                ", teletrabajo=" + teletrabajo +
                ", empresa=" + empresa +
                ", salario=" + calcularSueldo() +
                '}';
    }

    public boolean equals(Empleado otroEmpleado) {
        return this.dni.equals(otroEmpleado.dni);
    }
}
