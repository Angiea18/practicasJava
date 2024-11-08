public class Circulo {
    private int numLados;
    private double diametro;

    public Circulo(double diametro) {
        this.numLados = 0;
        this.diametro = diametro;
    }

    public double calcularArea() {
        return Math.PI * Math.pow(diametro / 2, 2); // Pi * (radio^2)
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "numLados=" + numLados +
                ", diametro=" + diametro +
                ", area=" + calcularArea() +
                '}';
    }
}