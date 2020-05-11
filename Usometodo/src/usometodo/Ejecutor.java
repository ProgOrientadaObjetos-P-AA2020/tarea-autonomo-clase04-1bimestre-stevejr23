/*
 Unos del metodo toString
.-El método toString nos permite mostrar la información completa de 
un objeto, es decir, el valor de sus atributos.*/
package usometodo;

public class Ejecutor {

    public static void main(String[] args) {
        Usometodo name = new Usometodo("Steven", "Jara", 19, "Loja");
        System.out.println(name.toString());
        //System.out.println(name);
    }

}
