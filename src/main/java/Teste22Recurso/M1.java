package Teste22Recurso;

public class M1 extends Maquina implements Tarefa {



    public M1(int n) {
        super(n);
    }



    @Override
    public double consumo(double preco) {
        for (Tarefa i: this.getListTasks()) {
            return i.duracao() + preco;
        }

        return preco;
    }

    @Override
    public Maquina clone() {
        return new M1(super.getCod()); // devolve uma cópia da maquina
    }


    @Override
    public int getNumCli() {
        return this.numTasks();
    }

    @Override
    public int duracao() {
        return this.numTasks();
    }
}
