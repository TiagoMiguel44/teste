package Teste1718;

public class Lavagem extends Servico {

    private static final double valor = 1.5;

    private int agua;
    private int tempo;


    public Lavagem(int codigo, int codClic, int agua, int tempo) {
        super(codigo,codClic);
        this.agua = agua;
        this.tempo = tempo;
    }


    public int getAgua() {
        return agua;
    }

    public static double getValor() {
        return valor;
    }

    public int getTempo() {
        return tempo;
    }

    public double custo() {
        return this.getAgua() * Lavagem.getValor();
    }

    public Lavagem clone() {
        return new Lavagem(super.getCodigo(),super.getCodClic(),this.agua, this.tempo);
    }


}
