package Teste1718;

public class Revisao extends Servico {

    private static final double valor = 10.0;

    private int tempo; // tempo de oficina // numero de horas

    public Revisao(int codigo, int codClic, int temp) {
        super(codigo,codClic);
        this.tempo = temp;
    }


    public static double getValor() {
        return valor;
    }

    public int getTempo() {
        return tempo;
    }

    public double custo() {
        return this.tempo * Revisao.getValor() * tam_presta();
    }



    public Revisao clone() {
        return new Revisao(super.getCodigo(),super.getCodClic(),this.tempo);
    }



}
