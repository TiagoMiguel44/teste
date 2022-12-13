package EmpresaMaquinas;

public class Costura extends Maquina implements Componente {


    private double preco;


    public Costura(int c, int t, double preco) {
        super(c, t);
        this.preco = preco;
    }


    @Override
    public double valor() { // retorna o valor da maquina
        double tot = 0; // total
        for (Componente c : this.getLista()) { // percorre a lista de componentes
            tot = c.custo() + tot; // soma o custo de cada componente à variavel tot
        }
        return this.getPreco() + 0.5 * tot; // retorna o valor da maquina
    }


    public double getPreco() {
        return preco;
    }

    @Override
    public double custo() {
        return this.valor();
    }

    @Override
    public int getCod() {
        return super.getCodigo();
    }

    @Override
    public Costura clone() { // devolve uma cópia da maquina
        Costura temp = new Costura(super.getCodigo(), super.getTempo(), this.preco); // cria uma maquina temporária
        for (Componente c : this.getLista()) { // percorre a lista de componentes
            temp.add(c);
        }
        return temp;
    }


}
