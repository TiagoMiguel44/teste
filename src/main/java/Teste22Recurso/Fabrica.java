package Teste22Recurso;

import java.util.*;

public class Fabrica {

    ArrayList<Maquina> lista;

    public Fabrica() {
        lista = new ArrayList<Maquina>();
    }


    public void add(Maquina m) {
        this.lista.add(m);
    }


    public Map<Integer, List<Integer>> mapdoCli() { // Q: O que faz isto? A: Devolve um map com o código do cliente e a lista de códigos das maquinas
        HashMap<Integer,ArrayList<Integer>> temp = new HashMap<Integer,ArrayList<Integer>>(); // Q: O que faz isto? A: Cria um map com o código do cliente e a lista de maquinas
        for (Maquina r : this.lista) { // Q: O que faz isto? A: Percorre a lista de maquinas
            for (Tarefa t : r.getListTasks()) {  // Q: O que faz isto? A: Percorre a lista de tarefas de cada maquina
                if (temp.containsKey(t.getNumCli())) { // Q: O que faz isto? A: Verifica se o cliente já existe na lista
                    temp.get(t.getNumCli()).add(r.getCod()); // Q: O que faz isto? A: Adiciona o código da maquina à lista de tarefas do cliente
                } else { //
                    ArrayList<Integer> temp1 = new ArrayList<Integer>(); // Q: O que faz isto? A: Cria uma lista de maquinas
                    temp1.add(r.getCod());
                    temp.put(t.getNumCli(), temp1); // Q: O que faz isto? A: Adiciona o cliente à lista de clientes
                }
            }
        }
        return temp;
    }

    public int maior_clientesdistintos() {
      HashMap<Integer, TreeSet<Integer>> temp = new HashMap<Integer,TreeSet<Integer>>();
        for (Maquina r : this.lista) {
            for (Tarefa t : r.getListTasks()) {
                if (temp.containsKey(t.getNumCli())) {
                    temp.get(t.getNumCli()).add(r.getCod());
                } else {
                    TreeSet<Integer> temp1 = new TreeSet<Integer>();
                    temp1.add(r.getCod());
                    temp.put(t.getNumCli(), temp1);
                }
            }
        }

        int max = 0;
        int mm = 0;
        for (Integer i : temp.keySet()) {
            if (temp.get(i).size() > max) {
                max = temp.get(i).size();
                mm = i;
            }
        }
        return mm;
    }


    public int maior_cliente() {
        int max=0;
        int total=0;
        int codigo=0;
        HashSet<Integer> clientes_distintos= new HashSet<>();
        HashMap<Integer,ArrayList<Integer>> temp= new HashMap<Integer,ArrayList<Integer>>();
        for (Maquina r : this.lista) {
            for (Tarefa t : r.getListTasks()) {
                if (temp.containsKey(t.getNumCli())) { // Q: O que faz isto? A: Verifica se o cliente já existe na lista
                    clientes_distintos.add(t.getNumCli()); // Q: O que faz isto? A: Adiciona o cliente à lista de clientes
                    total = clientes_distintos.size(); // Q: O que faz isto? A: Devolve o número de clientes distintos
                }
                if (max < total) { // Q: O que faz isto? A: Verifica se o total de clientes é maior que o maximo
                    max = total; // Q: O que faz isto? A: Guarda o maior total de clientes
                    codigo = r.getCod(); // Q: O que faz isto? A: Devolve o código da maquina
                }

            }
            clientes_distintos.clear();
        }
        return codigo;

    }





}
