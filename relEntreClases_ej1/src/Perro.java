/*Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de
dos clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase
Persona con atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener
que pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo,
mostrar desde la clase Persona, la información del Perro y de la Persona.*/



public class Perro {
    private String nombre;
    private String raza;
    private int edad;
    private String tamaño;
    Persona persona;
    
    // Constructor con parametros 

    public Perro(String nombre, String raza, int edad, String tamaño, Persona persona ) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.tamaño = tamaño;
        this.persona=persona;
        persona.setPerro(this);
    }
    // Getters para Perro

    public String getNombre() {
        return nombre;
    }

    public String getRaza() {
        return raza;
    }

    public Integer getEdad() {
        return edad;
    }

    public String getTamaño() {
        return tamaño;
    }
    
    
    
    public void datosPerro(){
        System.out.println(" Perro : " + nombre + ",  Raza: " + raza + ",  edad: " + edad + " , tamaño : " + tamaño );
    }
}
