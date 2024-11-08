public class Trapecio {
    private int numLados;
    private double baseMayor;
    private double baseMenor;
    private double altura;

    public Trapecio(double baseMayor, double baseMenor, double altura) {
        this.numLados = 4; // Un trapecio tiene 4 lados
        this.baseMayor = baseMayor;
        this.baseMenor = baseMenor;
        this.altura = altura;
    }

    public double calcularArea() {
        return (baseMayor + baseMenor) * altura / 2;
    }

    @Override
    public String toString() {
        return "Trapecio{" +
                "numLados=" + numLados +
                ", baseMayor=" + baseMayor +
                ", baseMenor=" + baseMenor +
                ", altura=" + altura +
                ", area=" + calcularArea() +
                '}';
    }
}