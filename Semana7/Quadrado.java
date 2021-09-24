package Semana7;

public class Quadrado extends Forma {

    protected Double lado;

    public Quadrado(Double param) {
        this.lado = param;
    }

    // public Double getLado() {
    // return lado;
    // }

    // public void setLado(Double lado) {
    // this.lado = lado;
    // }

    @Override
    public Double getArea() {

        return this.lado * this.lado;
    }
}
