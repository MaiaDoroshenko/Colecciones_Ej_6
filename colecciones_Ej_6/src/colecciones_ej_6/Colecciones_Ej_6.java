/*
6. Se necesita una aplicación para una tienda en la cual queremos almacenar los
distintos productos que venderemos y el precio que tendrán. Además, se necesita
que la aplicación cuente con las funciones básicas.
Estas las realizaremos en el main. Como, introducir un elemento, modificar su precio,
eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
Realizar un menú para lograr todas las acciones previamente mencionadas.
 */
package colecciones_ej_6;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Colecciones_Ej_6 {

    public static void main(String[] args) {

        HashMap<String, Integer> Producto = new HashMap<>();// Creo el HasMap
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int opcion;
         
        // Ingreso los productos dentro del HashMap
        System.out.println("_____PRODUCTOS_____");
        System.out.println(" ");
        Producto.put("Pantalon", 2900);
        Producto.put("Remera", 800);
        Producto.put("Short", 1900);
        Producto.put("Campera", 3600);
        Producto.put("Body", 1800);
        Producto.put("Falda", 1500);
        Producto.put("Calza", 3000);
        Producto.put("Top", 900);
        for (Map.Entry<String, Integer> aux : Producto.entrySet()) {// recorro el HashMap
            String key = aux.getKey();
            Integer value = aux.getValue();
            
            System.out.println(" Producto : " +key+ ", Precio : " +value);// Muestro la lista de los produtros con sus precios 
        }
        System.out.println(" ");
        System.out.println("______ MENU______ ");
        do {
           System.out.println(" QUE DESEA REALIZAR? : ");
            System.out.println("1: AGREGAR UN PRODUCTO ");
            System.out.println("2: MODIFICAR UN PRECIO ");
            System.out.println("3: ELIMINAR UN PRODUCTO ");
            System.out.println("4: MOSTRAR TODOS LOS PRODUCTOS DISPONIBLES CON SU PRECIO ");
            System.out.println("5: SALIR DEL MENU  ");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1: 

                    break;
                
                }
                
            
                 
        }while (opcion!=5);
            
                
            

        } 

    }

