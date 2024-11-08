public class Main {
    public static void main(String[] args) {
        // Crear una Moto
        Moto moto = new Moto("Yamaha", 200, "MT-07", 689, 2);
        System.out.println(moto);

        // Crear un Carro
        Carro carro = new Carro("Mazda", "CX-5", 210, true, 2.5, 4, 5);
        System.out.println(carro);
    }
}