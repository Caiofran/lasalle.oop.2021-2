package Semana6;

public abstract class Pessoa {
    private String nome;
    private String sexo;
    private Integer idade;

    public Pessoa() {
        this.setNome("Caio");
        this.setSexo("m");
        this.setIdade(24);
    }

    public Pessoa(String nome) {
        this.setNome(nome);
        this.setSexo("m");
        this.setIdade(24);
    }

    // 
    public abstract void saudacao();

    public void fazerAniversario()
    {
        System.out.println("OI, aqui é o " + this.getNome() + " hoje é o meu aniversário");
    }

    //Metodos acessores: getters/setters
    public String getNome() {
        if(sexo.equalsIgnoreCase("f"))
            return "Sra. " + nome;
        else
            return "Sr. " + nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    
    
}
