package Semana3.atividade;

public class Bike {
    //Atributos
    public String marca;
    public Integer qtdMarchas;
    public String cor;

    //metodos
    public void andar()
    {
        System.out.println("\nAndando na Bike. " + "A" + this.marca + "" + this.qtdMarchas + "" + this.cor);
    }

    public void frear()
    {
        System.out.println("\nFreiando a Bike. " + "A" + this.marca + "" + this.qtdMarchas + "" + this.cor);
    }
}
