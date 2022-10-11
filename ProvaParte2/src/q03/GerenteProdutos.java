/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package q03;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Micael
 */
public class GerenteProdutos{
    private List<IProduto> produtosComprados;
    private List<IProdutoFabricado> produtosFabricados;
    
    public List<String> ingredientes(String nomeProduto){
        List<String> ingredientes = new ArrayList<>();
        for (IProdutoFabricado a:produtosFabricados){
            if(a.getNome().equals(nomeProduto)) {
                for(int i = 0; i < a.getNumeroIngredientes(); i++) {
                    ingredientes.add(a.getIngrediente(i).getNome());
                }
            }
        }
        return ingredientes;
    }
    
    public float custoProduto(String nomeProduto) {
        for (IProduto a:produtosComprados) {
            if (a.getNome().equals(nomeProduto)) {
                 return a.getCusto();
            }
        }
        return 0;
    }
}
