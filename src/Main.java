import javax.swing.JOptionPane;

//Ejercicio 1: Construir un programa que calcule el area y perimetro de un cuadrlilatero dada la
//longitud sw sus lados. Los valores de la longitud deberán introducirse por lineaa de ordenes. Si es un
//cuadrado, solo se propoecionara la longitud de uno de los lados al constructor.

public class Main{
    
    public static void main (String[] args){
        Cuadrilatero c1;

        float lado1 = Float.parseFloat(JOptionPane.showInputDialog("Lado 1: "));
        float lado2 = Float.parseFloat(JOptionPane.showInputDialog("Lado 2: "));

        if(lado1==lado2){
            c1=new Cuadrilatero(lado1);//Continuacion de linea 10
        }
        else{
            c1=new Cuadrilatero(lado1, lado2);//Continuacion de linea 10
        }

        System.out.println("El area es: "+c1.getArea());
        System.out.println("El perimetro es: "+c1.getPerimetro());
    }
}