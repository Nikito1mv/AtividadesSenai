package veiculoavenda;
public class Main {
    public static void main(String[] args) {
        VeiculoAVenda v1 = new VeiculoAVenda("Veiculo", 1999, 20000);
        AutomovelAVenda a1 = new AutomovelAVenda(2000, 30000);
        MotocicletaAVenda m1 = new MotocicletaAVenda(2001,15000);
        System.out.println("tipo: " + v1.getTipo());
        System.out.println("ano: " + v1.getAno());
        System.out.println("preço: " + v1.getPrecoDeVenda());
        System.out.println("tipo: " + a1.getTipo());
        System.out.println("ano: " + a1.getAno());
        System.out.println("preço: " + a1.getPrecoDeVenda());
        System.out.println("tipo: " + m1.getTipo());
        System.out.println("ano: " + m1.getAno());
        System.out.println("preço: " + m1.getPrecoDeVenda());
    }
}
