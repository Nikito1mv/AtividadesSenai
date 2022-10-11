/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package q02;

/**
 *
 * @author Micael
 */
public class Alfa extends Caminhao {

    @Override
    public void inserePluviometro(Pluviometro p) {
        // Descobrir o peso que já existe na lista
        int pesoTotal = 0;
        for (Pluviometro a: pluviometros) {
            pesoTotal += a.getPeso();
        }
        
        // Descobrir se o peso total + o peso do novo pluviometro ultrapassa o máximo do caminhão
        int novoPesoTotal = pesoTotal + p.getPeso();
        
        if (novoPesoTotal <= p.getCapacidade()) {
            pluviometros.add(p);
            System.out.println("Novo pluviometro adicionado");
        } else {
            System.out.println("Não foi possivel adcionar um pluviometro");
        }
    }
    
}
