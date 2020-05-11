/*
 Unos del metodo toString
.-El método toString nos permite mostrar la información completa de 
un objeto, es decir, el valor de sus atributos.*/
package usometodo;

public class Usometodo {

    private String nombre;
    private String apellido;
    private int edad;
    private String origen;

    public Usometodo(String nombre, String apellido, int edad, String origen) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.origen = origen;
    }

    @Override
    public String toString() {
        String mensaje = ("Mi nombre es " + nombre +" "+ apellido + " tengo la edad de " + edad + " años y soy de " + origen);
        return mensaje;
    }
}
