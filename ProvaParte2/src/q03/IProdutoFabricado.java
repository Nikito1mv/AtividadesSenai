/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package q03;

/**
 *
 * @author Micael
 */
public interface IProdutoFabricado extends IProduto{
    public int getNumeroIngredientes();
    public IProduto getIngrediente(int numero);
}
