package objetogeometrico;
public class Circulo implements IObjetoGeometrico {
    // Atribultos
	
    private float raio;

    // Métodos especiais

    public Circulo(float raio) {
        this.raio = raio;
    }

    public float getRaio() {
        return raio;
    }

    public void setRaio(float raio) {
        this.raio = raio;
    }
    
    // Métodos

    @Override
    public float calcularArea() {
        return (float) (Math.PI*this.getRaio()*this.getRaio());
    }

    @Override
    public float calcularPerimetro() {
        return (float) (2*Math.PI*this.getRaio());
    }
}
