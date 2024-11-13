package src;

public class Cargo {
    
    private String nome;
    private String salarioBase;
    private String hierarquia;
    private String requisitos;
    private String cod_setor;

    public Cargo(String nome, String salarioBase, String hierarquia, String requisitos, String cod_setor){
        this.nome = nome;
        this.salarioBase = salarioBase;
        this.hierarquia = hierarquia;
        this.requisitos = requisitos;
        this.cod_setor = cod_setor;
    }

    public String getNome() {
        return nome;
    }

    public String getSalarioBase() {
        return salarioBase;
    }

    public String getHierarquia() {
        return hierarquia;
    }

    public String getRequisitos() {
        return requisitos;
    }

    public String getCod_setor() {
        return cod_setor;
    }

}

    