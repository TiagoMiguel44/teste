package EmpresaMaquinas;

import java.util.ArrayList;

public abstract class Maquina

{ private int codigo; // código

    private int tempo; // tempo de vida da máquina

    private ArrayList<Componente> lista; // lista de componentes

    Maquina(int c, int t)

    { this.codigo = c; this.tempo = t; this.lista = new ArrayList<Componente>();}

    public int getCodigo()

    { return this.codigo;}

    public int getTempo()

    { return this.tempo;}

    public void gastaHoras(int t)

    { this.tempo = this.tempo - t;}

    public ArrayList<Componente> getLista()

    { ArrayList<Componente> temp = new ArrayList<Componente>();

        for(Componente c: this.lista)

            temp.add(c);

        return temp;

    }

    public int tam_lista()

    { return lista.size(); }

    public void add(Componente c)

    { this.lista.add(c); } // componente é imutável!

    public abstract double valor();

    public abstract Maquina clone();

}


