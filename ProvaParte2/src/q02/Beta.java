/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package q02;

/**
 *
 * @author Micael
 */
public class Beta extends Caminhao{

    @Override
    public void inserePluviometro(Pluviometro p) {
        for (Pluviometro a: pluviometros) {
            if(!a.getTipo().equals(p.getTipo())) {
                pluviometros.add(p);
                break;
            }
        }
        System.out.println("Não foi possivel adicionar o pulviometro");
    }
    
}
