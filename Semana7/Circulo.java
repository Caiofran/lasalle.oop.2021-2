package Semana7;

public class Circulo extends Forma {

    private Double raio;

    // construtor
    public Circulo() {

    }

    public Circulo(Double param) {
        this.raio = param;
    }

    // Metodos getters/setters
    public Double getRaio() {
        return raio;
    }

    public void setRaio(Double raio) {
        this.raio = raio;
    }

    @Override
    public Double getArea() {
        // Math.pow(base, expoente)
        return Math.PI * this.raio * this.raio;
    }
}