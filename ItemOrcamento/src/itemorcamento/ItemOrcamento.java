package itemorcamento;
public class ItemOrcamento {
    
    // Atribultos
    
    protected String historico; // histórico do item
    protected float valor; // valor do item
    
    // Métodos especiais

    public ItemOrcamento(String historico, float valor) {
        this.historico = historico;
        this.valor = valor;
    }

    public String getHistorico() {
        return historico;
    }

    public void setHistorico(String historico) {
        this.historico = historico;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
    
    
}
