package GereHoteis;

public class Premium extends Hotel {

    private int estrelas;

    public Premium(String nome, String localidade, double PrecoBase, int num, int estrelas) {
        super(nome, localidade, PrecoBase, num);
        this.estrelas = estrelas;
    }

    @Override
    public double dormida(int mes) { // metodo que calcula o preco da estadia
        double pfinal = this.getPrecoBase(); // preco final
        if (mes >= 7 || mes <= 9) { // se o mes for julho, agosto ou setembro
            pfinal = pfinal + getPrecoBase() * 0.3; // acrescenta 30%
        }
        if (this.estrelas == 5) { // se o hotel for de 5 estrelas
            pfinal = pfinal + getPrecoBase() * 0.1; // acrescenta 10%

        }
        return pfinal; // retorna o preco final
    }

    public Premium clone() {
        return new Premium(super.getNome(), super.getLocalidade(), super.getPrecoBase(), super.getNum(), this.estrelas);
    }


}