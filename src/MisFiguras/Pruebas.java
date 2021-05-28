
package MisFiguras;

public class Pruebas {

    public static void main(String[] args) {
//HOLA JAJSJA
        //ACTUALIZAR FIGURAS
        Rectangulo r1 = new Rectangulo(2.0,4.0);
        System.out.println("RECTANGULOS");
        System.out.println("Perimetros");
        //Perimetro
        System.out.println("Rectangulo base " + r1.getBase() + " altura " + r1.getAltura() + " es " + r1.calcularPerimetro());
        //Area
        System.out.println("Area");
        System.out.println("Rectangulo base " + r1.getBase() + " y altura " +r1.getAltura() + " es " + r1.calcularArea());
        
        Circulo c1= new Circulo(2);
        System.out.println("CIRCULOS");
        System.out.println("Perimetros");
        System.out.println("Circulo radio: " + c1.getRadio() + " y perimetro " + c1.calcularPerimetro());
        
        System.out.println("Area: ");
        System.out.println("Circulo radio: " + c1.getRadio() + " y area " +c1.calcularArea());
        
    }
    
}
