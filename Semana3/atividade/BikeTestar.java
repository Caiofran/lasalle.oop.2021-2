package Semana3.atividade;

public class BikeTestar {
    public static void main(String[] args) {
        Bike bike = new Bike();

        bike.marca = " Caloi ";
        bike.qtdMarchas = 6;
        bike.cor = " Azul";

        bike.andar();
        bike.frear();
    }
}
