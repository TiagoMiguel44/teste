package Chamadas;

import Chamadas.Chamada;

import java.util.ArrayList;

public class Mbox {

    public int num;
    public ArrayList<Chamada> lista; // lista de chamadas


    // construtores

    public Mbox() {
        num = 0;
        lista = new ArrayList<>();
    }

    public Mbox(int n) {
        num = n; // numero de chamadas
        lista = new ArrayList<Chamada>(); // lista de chamadas
    }


    public void add(Chamada m) { // adiciona uma chamada à lista
        if (m != null) {
            this.lista.add(m.clone()); // adiciona uma cópia da chamada à lista
        }
    }

    public int tamanho() {
        return this.lista.size();
    }


    public double valor_total(int org) { // devolve o valor total das chamadas de uma dada origem
        double total = 0.0; // valor total das chamadas
        for (Chamada c : this.lista) { // percorre a lista de chamadas
            if (c.getOrigem() == org) { // se a origem da chamada for igual à origem passada como parâmetro
                total = total + c.valor(); // adiciona o valor da chamada ao total
            }

        }
        return total;
    }

    public int conta_SMS(int origem) { // devolve o número de SMS de uma dada origem
        int conta = 0; // número de SMS
        for (Chamada c : this.lista) { // percorre a lista de chamadas
            if (c.getOrigem() == origem) { // se a origem da chamada for igual à origem passada como parâmetro
                if (c instanceof SMS) { // se a chamada for do tipo SMS
                    conta++; // incrementa o contador
                }

            }


        }
        return conta;
    }
}