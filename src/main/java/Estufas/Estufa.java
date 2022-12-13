package Estufas;

public abstract class Estufa {

    // variaveis de instancia
    private int codigo; // codigo da estufa
    private double area; // area da estufa
    private int max;
    private int min;

    // construtores


    public Estufa() {
        codigo = 0;
        area = 0.0;
        max = 0;
        min = 0;
    }
    public Estufa(int codigo, double area, int max, int min) {
        this.codigo = codigo;
        this.area = area;
        this.max = max;
        this.min = min;
    }



    // metodos
    public int getCodigo() {
        return codigo;
    }

    public double getArea() {
        return area;
    }

    public int getMax() {
        return max;
    }

    public int getMin() {
        return min;
    }


    public boolean emRisco(int temp) {
        return (temp < min || temp > max);
    } // retorna true se a temperatura estiver fora dos limites

    public abstract double ValorTotal(); // retorna o valor total da estufa
    public abstract Estufa clone();




}
