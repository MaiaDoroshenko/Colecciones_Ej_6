/*Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de
dos clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase
Persona con atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener
que pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo,
mostrar desde la clase Persona, la información del Perro y de la Persona.*/


public class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    private String dni;
    Perro perro;
   
    
    //Constructor con parametros

    public Persona(String nombre, String apellido, int edad, String dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.dni = dni;
    }
    
    // Setter
    
    public void setPerro(Perro perro){
        this.perro = perro;
        
        
    }

    public void datos() {
        System.out.println("nombre: "+nombre+ " , apellido: "+apellido+ " , edad :" + edad + "  años , Dni : "+ dni);
        perro.datosPerro();
    }
    
    public void relacion (){
        System.out.println(nombre + apellido + ", adopto a : " + perro.getNombre() + " raza : " + perro.getRaza());
    }
    
}
