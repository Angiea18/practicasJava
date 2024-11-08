public class Carro {
    private String marca;
    private String modelo;
    private int velocidadMaxima;
    private boolean es4x4; // Si el carro es 4x4
    private double cilindraje; // Cilindraje del motor
    private int llantas; // Número de llantas
    private int puertas; // Número de puertas

    public Carro(String marca, String modelo, int velocidadMaxima, boolean es4x4, double cilindraje, int llantas, int puertas) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadMaxima = velocidadMaxima;
        this.es4x4 = es4x4;
        this.cilindraje = cilindraje;
        this.llantas = llantas;
        this.puertas = puertas;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", velocidadMaxima=" + velocidadMaxima +
                ", es4x4=" + es4x4 +
                ", cilindraje=" + cilindraje +
                ", llantas=" + llantas +
                ", puertas=" + puertas +
                '}';
    }
}

