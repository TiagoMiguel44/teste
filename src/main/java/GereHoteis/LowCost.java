package GereHoteis;

public class LowCost extends Hotel {

    private boolean promo;

    public LowCost(String nome, String localidade, double PrecoBase, int num, boolean promo) {
        super(nome, localidade, PrecoBase, num);
        this.promo = promo;
    }

    @Override
    public double dormida(int mes) {
        double pfinal = this.getPrecoBase();
        if (mes >= 10 || mes <= 4) { // se o mes for outubro, novembro, dezembro, janeiro, fevereiro ou março
            pfinal = pfinal - getPrecoBase() * 0.25; // desconto de 25%
        }
        if (this.promo) { // se o hotel estiver em promoção
            pfinal = pfinal - getPrecoBase() * 0.15; // desconto de 15%
        }
        return pfinal; // retorna o preco final
    }


    public LowCost clone() {
        return new LowCost(super.getNome(), super.getLocalidade(), super.getPrecoBase(), super.getNum(), this.promo);
    }

}
