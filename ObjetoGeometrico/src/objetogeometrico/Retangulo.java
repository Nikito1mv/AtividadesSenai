package objetogeometrico;
public class Retangulo implements IObjetoGeometrico {
    
    // Atribultos
	
    protected float base;
    protected float altura;

    // Métodos especiais

    public Retangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
	
    // Métodos

    @Override

    public float calcularArea() {
	return base * altura;
    }

    @Override

    public float calcularPerimetro() {
	return 2*base + 2*altura;
    }
}
