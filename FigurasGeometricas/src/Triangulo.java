public class Triangulo {
    private int numLados;
    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        this.numLados = 3;
        this.base = base;
        this.altura = altura;
    }

    public double calcularArea() {
        return (base * altura) / 2;
    }

    @Override
    public String toString() {
        return "Triangulo{" +
                "numLados=" + numLados +
                ", base=" + base +
                ", altura=" + altura +
                ", area=" + calcularArea() +
                '}';
    }
}
