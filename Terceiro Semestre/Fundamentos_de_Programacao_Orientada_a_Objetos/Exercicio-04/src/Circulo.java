/*
    Formula para calcular a área: A = π . r²
    Formula para calcular o perímetro: P = 2 . π . r
 */
public class Circulo {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double calcularArea(){
        return Math.PI * raio * raio;
    }

    public double calcularPerimetro(){
        return 2 * Math.PI * raio;
    }

    public double getRaio() {
        return raio;
    }

    public String toString (){
        return String.format("Area: %.2f | Perimetro: %.2f | Raio: %.2f", this.calcularArea(), this.calcularPerimetro(), this.raio);
    }
}
