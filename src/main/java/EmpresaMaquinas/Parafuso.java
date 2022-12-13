package EmpresaMaquinas;

public class Parafuso implements Componente {


    private double preco;


    public Parafuso(double preco) {
        this.preco = preco;
    }


    public double getPreco() {
        return preco;
    }


    public double custo() {
        return this.getPreco() * 2.0;
    } // retorna o custo do parafuso

    @Override
    public int getCod() {
        return this.getCod();
    }









}
