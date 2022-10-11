/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package q03;

import java.util.List;

/**
 *
 * @author Micael
 */
public class ProdutosFabricados implements IProdutoFabricado{
    
    protected String nome;
    public List<IProduto> ingredientes;

    @Override
    public int getNumeroIngredientes() {
        return ingredientes.size();
    }

    @Override
    public IProduto getIngrediente(int numero) {
        return ingredientes.get(numero);
    }

    @Override
    public String getNome() {
        return this.nome;
    }

    @Override
    public float getCusto() {
        float total = 0;
        for (IProduto a:ingredientes){
            total += a.getCusto();
        }
        return total;
    }
    
}
