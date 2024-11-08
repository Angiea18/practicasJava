public class Main {
    public static void main(String[] args) {
        Ordenador ordenador = new Ordenador("Dell", "Inspiron", 16, 512);
        System.out.println(ordenador);

        ordenador.encender();
        System.out.println("Encendiendo el ordenador...");
        System.out.println(ordenador);

        ordenador.transferirArchivos(100);
        ordenador.transferirArchivos(50);

        ordenador.eliminarArchivos(30);
        System.out.println(ordenador);


        Ordenador otroOrdenador = new Ordenador("Lenovo", "Ideapad S340-14IIL", 8, 256);
        if (ordenador.equals(otroOrdenador)) {
            System.out.println("Los ordenadores son iguales.");
        } else {
            System.out.println("Los ordenadores son diferentes.");
        }
    }
}
