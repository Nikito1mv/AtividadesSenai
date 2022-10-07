/*
 Escreva uma classe VeiculoAVenda 
    Escreva uma classe AutomovelAVenda que herde de VeiculoAVenda e
que inicialize o campo tipo com o valor constante “Automovel”, e uma classe
MotocicletaAVenda que herde de VeiculoAVenda e que inicialize o campo tipo com o valor
constante “Motocicleta”. Escreva também um programa que demonstre o uso das diversas
classes
 */
package veiculoavenda;
public class VeiculoAVenda {
    
    // Atribultos
        
    protected String tipo;
    protected int ano;
    protected float precoDeVenda;
    
    // Métodos especiais

    public VeiculoAVenda(String tipo, int ano, float precoDeVenda) {
        this.tipo = tipo;
        this.ano = ano;
        this.precoDeVenda = precoDeVenda;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public float getPrecoDeVenda() {
        return precoDeVenda;
    }

    public void setPrecoDeVenda(float precoDeVenda) {
        this.precoDeVenda = precoDeVenda;
    }
    
    // Métodos
    
}
