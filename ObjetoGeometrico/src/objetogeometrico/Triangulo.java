package objetogeometrico;
public class Triangulo implements IObjetoGeometrico {
    
    // Atribultos
	
    private float lado1;
    private float lado2;
    private float lado3;

    // Métodos especiais

    public Triangulo(float lado1, float lado2, float lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public float getLado1() {
        return lado1;
    }

    public void setLado1(float lado1) {
        this.lado1 = lado1;
    }

    public float getLado2() {
        return lado2;
    }

    public void setLado2(float lado2) {
        this.lado2 = lado2;
    }

    public float getLado3() {
        return lado3;
    }

    public void setLado3(float lado3) {
        this.lado3 = lado3;
    }

    // Métodos
    
    float s = this.calcularPerimetro() / 2;

    @Override
    public float calcularArea() {
        return (float) Math.sqrt(s*(s-lado1)*(s-lado2)*(s-lado3));
    }

    @Override
    public float calcularPerimetro() {
        return (lado1 + lado2 + lado3);
    }
    
}
