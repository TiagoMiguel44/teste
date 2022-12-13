package ReceitasCulinarias;

public class Ingrediente {

    private String nome;
    private int quantidade;
    private String unidade;
    private int calorias;


    public Ingrediente(String nome, int quantidade, String unidade, int calorias) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.unidade = unidade;
        this.calorias = calorias;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public String getUnidade() {
        return unidade;
    }

    public int getCalorias() {
        return calorias;
    }

    public boolean equals(Object i) {
        if (i == null) {
            return false;
        }
        Ingrediente ii = (Ingrediente) i;
        return (this.nome.equals(ii.getNome()));
    }

    public Ingrediente clone() {
        return new Ingrediente(this.nome, this.quantidade, this.unidade, this.calorias);
    }




}
