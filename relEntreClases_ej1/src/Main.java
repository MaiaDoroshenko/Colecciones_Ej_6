/*Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de
dos clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase
Persona con atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener
que pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo,
mostrar desde la clase Persona, la información del Perro y de la Persona.*/

public class Main {

    public static void main(String[] args) {
        Persona p1 = new Persona("Matias", " Gutierrez", 41, "28659874");
        Persona p2 = new Persona("Pablo", "Peralta", 28, "35689547");
        Perro perro_1 = new Perro("Luna", "Caniche ", 2, "mini ", p1);
        Perro perro_2 = new Perro("Zeus", " Callejero ", 5, " grande ", p2);
        p1.datos();
        p2.datos();
        p1.relacion();
        p2.relacion();

    }
}
