package Chamadas;

public abstract class Chamada

{

    private int origem;

    private int duracao;

    private double preco; // preço por unidade.

    public Chamada(int a, int b, double c)

    { this.origem = a; this.duracao = b; this.preco = c;}

    public Chamada() {
        origem = 0;
        duracao = 0;
        preco = 0.0;
    }

    public int getOrigem()

    { return this.origem;}

    public int getDuracao()

    { return this.duracao;}

    public double getPreco()

    { return this.preco;}

    public abstract double valor();

    public abstract Chamada clone();

}