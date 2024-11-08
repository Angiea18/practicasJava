public class Moto {
    private String marca;
    private String modelo;
    private int velocidadMaxima;
    private double cilindraje; // Cilindraje del motor
    private int llantas; // Número de llantas

    public Moto(String marca, int velocidadMaxima, String modelo, double cilindraje, int llantas) {
        this.marca = marca;
        this.velocidadMaxima = velocidadMaxima;
        this.modelo = modelo;
        this.cilindraje = cilindraje;
        this.llantas = llantas;
    }

    @Override
    public String toString() {
        return "Moto{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", velocidadMaxima=" + velocidadMaxima +
                ", cilindraje=" + cilindraje +
                ", llantas=" + llantas +
                '}';
    }
}

