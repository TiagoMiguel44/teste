package Chamadas;

public class SMS extends Chamada {

    public String texto;

    // construtores
    public SMS() {
        super();
        texto = "";
    }

    public SMS(int a, int b, double c, String texto) {
        super(a, b, c);
        this.texto = texto;
    }


    public SMS(SMS ss) {
        super(ss.getOrigem(), ss.getDuracao(), ss.getPreco());
        texto = ss.isTexto();
    }

    // metodos
    public String isTexto() {
        return texto;
    }

    @Override
    public double valor() {
        return this.texto.length() * 0.001;
    } // retorna o valor da chamada

    @Override
    public Chamada clone() {
        return new SMS(this);
    }
}
