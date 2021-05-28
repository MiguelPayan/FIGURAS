
package MisFiguras;

public class Circulo {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }
    //2 radio x PI
    public double calcularPerimetro(){
        return 2*Math.PI*radio;
        
    }
    
    public double calcularArea(){
        
        return Math.PI*(radio*radio);
        
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    
    
    
}
