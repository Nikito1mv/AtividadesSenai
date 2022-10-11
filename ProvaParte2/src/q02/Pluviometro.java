/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package q02;

/**
 *
 * @author Micael
 */
public class Pluviometro {
    private String tipo;
    private int peso;
    private int capacidade;

    public Pluviometro(String tipo) {
        this.tipo = tipo;
        if ("Convencional".equals(this.tipo)) {
            this.peso = 1000;
            this.capacidade = 1000000;
        } else if ("Semiautomatico".equals(this.tipo)) {
            this.peso = 750;
            this.capacidade = 750000;
        } else if ("Automatico".equals(this.tipo)) {
            this.peso = 500;
            this.capacidade = 500000;
        }
    }

    public String getTipo() {
        return tipo;
    }

    public int getPeso() {
        return peso;
    }
    
    public int getCapacidade() {
        return capacidade;
    }
}
