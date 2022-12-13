package Teste22Recurso;

import java.util.ArrayList;
import java.util.List;

public abstract class Maquina {

    private int cod;
    private ArrayList<Tarefa> jobs;

    Maquina(int n) {
        this.cod = n;
        this.jobs = new ArrayList<Tarefa>();
    }

    public int getCod() {
        return cod;
    }

    public List<Tarefa> getListTasks() {
        ArrayList<Tarefa> temp = new ArrayList<Tarefa>();
        for (Tarefa t : jobs) {
            temp.add(t);
        }
        return temp;
    }


    public void add(Tarefa c) {
        this.jobs.add(c);
    }


    public int numTasks() { // numero de tarefas
        return jobs.size(); // devolve o numero de tarefas
    }

    public abstract double consumo(double preco); // preco por hora
    public abstract Maquina clone();




}
