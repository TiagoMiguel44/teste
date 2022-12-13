package Estufas;

public class Legumes extends Estufa {

    // variaveis de instancia
    private String nome;
    private double altura;

    public static int valor = 5;

    // construtores
    public Legumes() {
        nome = "";
        altura = 0.0;
    }


    public Legumes(int codigo, double area, int max, int min, String nome, double altura) {
        super(codigo, area, max, min);
        this.nome = nome;
        this.altura = altura;
    }


// metodos

    public String getNome() {
        return nome;
    }

    public double getAltura() {
        return altura;
    }

    public static int getValor() {
        return valor;
    }


    @Override
    public double ValorTotal() {
        return this.getArea() * Legumes.getValor();
    }

    @Override
    public Legumes clone() {
        return new Legumes(super.getCodigo(), super.getArea(), super.getMax(), super.getMin(), this.nome, this.altura);
    }


}
