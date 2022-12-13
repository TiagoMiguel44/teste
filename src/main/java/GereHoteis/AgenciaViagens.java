package GereHoteis;

import java.util.ArrayList;
import java.util.HashMap;

public class AgenciaViagens {
    // instance variables - replace the example below with your own
    private HashMap<Integer, Hotel> hoteis;
    private HashMap<Integer, ArrayList<Integer>> tabela;


    public AgenciaViagens() {
        // initialise instance variables
        this.hoteis = new HashMap<Integer, Hotel>();
        this.tabela = new HashMap<Integer, ArrayList<Integer>>();
    }

    public void add(int id, Hotel h) {
        this.hoteis.put(id, h.clone());
    }

    public void checkin(int id, int room) {
        if (this.hoteis.containsKey(id))
            this.hoteis.get(id).in(room);
    }

    public void checkout(int id, int room) {
        if (this.hoteis.containsKey(id))
            this.hoteis.get(id).out(room);
    }


    public int mais_barato(int mes, String local) {
        double min = 0;
        int id = 0;
        for (Integer i: this.hoteis.keySet()) { // percorrer o hashmap
            Hotel h = this.hoteis.get(i); // obter o hotel
            if (local.equals(h.getLocalidade())) { // se o hotel estiver na localidade pretendida
               if (h.dormida(mes) < min) { // se o preço da dormida for menor que o minimo
                   min = h.dormida(mes); // atualizar o minimo
                   id = i; // atualizar o id
               }

            }
        }
        return id;
    }



}