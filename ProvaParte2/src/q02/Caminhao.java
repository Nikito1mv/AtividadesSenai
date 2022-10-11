/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package q02;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Micael
 */
public abstract class Caminhao {
    protected List<Pluviometro> pluviometros = new ArrayList<>();
    
    public abstract void inserePluviometro(Pluviometro p);
}
