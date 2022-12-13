package EmpresaMaquinas;

import java.util.ArrayList;

public class Empresa {

    private ArrayList<Maquina> lista; // lista de máquinas da empresa


    public Empresa() {
        this.lista = new ArrayList<Maquina>();
    }

    public void add(Maquina m) { // adiciona uma máquina à empresa
        if (m != null) {
            this.lista.add(m);
        }
    }

    public int maisValor() { // devolve o código da máquina mais valiosa
        if (this.lista.size() > 0) { // se a lista não estiver vazia
            Maquina m = this.lista.get(0); // m é a primeira máquina da lista
            for (Maquina x : this.lista) { // percorre a lista
                if (x.valor() > m.valor()) { // se o valor da máquina x for maior que o da máquina m
                    m = x; // m passa a ser a máquina x
                }
            }
            return m.getCodigo(); // devolve o código da máquina m
        } else {
            return -1; // se a lista estiver vazia devolve -1
        }
    }




}
