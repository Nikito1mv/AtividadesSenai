/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package q01;

/**
 *
 * @author Micael
 */
public class Contador implements IResetavel, IModificavel{
    
    public int valor;
    
    @Override
    public void reseta() {
        valor = 1;
    }

    @Override
    public void reseta(int origem) {
        valor = origem;
    }

    @Override
    public void modifica(int tamanho) {
        valor = tamanho;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
    
}
