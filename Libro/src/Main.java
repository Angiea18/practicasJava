public class Main {
    public static void main(String[] args) {
        Libro libro = new Libro("123-456-789", "El Quijote", 500, "Miguel de Cervantes", false);
        System.out.println(libro);

        libro.prestar();
        System.out.println(libro);

        libro.devolver();
        System.out.println(libro);

        double costeImpresion = libro.imprimir(0.05);
        System.out.println("El costo de imprimir el libro es: $" + costeImpresion);

        Libro otroLibro = new Libro("123-456-789", "El Quijote", 500, "Miguel de Cervantes", false);
        if (libro.equals(otroLibro)) {
            System.out.println("Los libros son iguales.");
        } else {
            System.out.println("Los libros son diferentes.");
        }
    }
}
