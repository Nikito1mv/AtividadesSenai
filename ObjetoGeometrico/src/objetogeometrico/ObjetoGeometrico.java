package objetogeometrico;
public class ObjetoGeometrico {
    public static void main(String[] args) {
        Circulo c1 = new Circulo(6);
        System.out.println("Um circulo com raio " + c1.getRaio() + " tem perimetro equivalente a " + c1.calcularPerimetro());
        c1.setRaio(4);
        System.out.println("Um circulo com raio " + c1.getRaio() + " tem perimetro equivalente a " + c1.calcularPerimetro());
        c1.setRaio(9);
        System.out.println("Um circulo com raio " + c1.getRaio() + " tem perimetro equivalente a " + c1.calcularPerimetro());
        c1.setRaio(30);
        float c30 = c1.calcularArea();
        System.out.println("Um circulo com raio " + c1.getRaio() + " tem perimetro equivalente a " + c30);
        c1.setRaio(50);
        float c50 = c1.calcularArea();
        System.out.println("Um circulo com raio " + c1.getRaio() + " tem perimetro equivalente a " + c50);
        System.out.println(c50-c30);
    }
}
