package itemorcamento;

public class ItemOrcamentoComplexo extends ItemOrcamento{
    
    private ItemOrcamento[] subItens; 
    
    public ItemOrcamentoComplexo(String historico, float valor, ItemOrcamento[] subItens) {
        super(historico, valor);
        this.subItens = subItens;
    }

    @Override
    public float getValor() {
        float valorTotal = 0;
        for (ItemOrcamento i :subItens) {
            valorTotal += i.getValor();
        }
        return valorTotal;
    }
    
    public ItemOrcamento encontrarItem(String historico) {
        for (ItemOrcamento i :subItens) {
            if(i.getHistorico().equals(historico)){
                return i;
            }
        }
        return null;
    }
    
}
