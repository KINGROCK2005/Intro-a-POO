import java.util.Scanner;

import org.w3c.dom.UserDataHandler;
public class App {
    public static void main(String[] args) throws Exception {
        Pelicula endgame = new Pelicula();
        Scanner lector = new Scanner(System.in);

        endgame.establecerNombre("Avengers Endgame");
        endgame.establecerduracion(125);
        endgame.establecerCalidad("4K");
        endgame.establecerGenero("Ciencia ficcion");
        endgame.establecerClasificion("PG-13");

        System.out.println("Nombre: " + endgame.mostrarNombre());
        System.out.println("Duracion = " + endgame.mostrarduracion() + " minutos");
        System.out.println("Calidad: " + endgame.mostrarCalidad());
        System.out.println("Genero: " + endgame.mostrarGenero());
        System.out.println("Clasificacion: " + endgame.mostrarClasificion());
        System.out.println("******************************************");

        Pelicula justiceleague = new Pelicula(240, "PG-13", "4K", "Ciencia Ficcion", "Justice League");
        System.out.println("Nombre: " + justiceleague.mostrarNombre());
        System.out.println("Duracion = " + justiceleague.mostrarduracion() + " minutos");
        System.out.println("Calidad: " + justiceleague.mostrarCalidad());
        System.out.println("Genero: " + justiceleague.mostrarGenero());
        System.out.println("Clasificacion: " + justiceleague.mostrarClasificion());
        System.out.println("******************************************");

        Pelicula Superman = new Pelicula();
        System.out.println("Nombre: " + Superman.mostrarNombre());
        System.out.println("Duracion = " + Superman.mostrarduracion() + " minutos");
        System.out.println("Calidad: " + Superman.mostrarCalidad());
        System.out.println("Genero: " + Superman.mostrarGenero());
        System.out.println("Clasificacion: " + Superman.mostrarClasificion());
                System.out.println("******************************************");
        System.out.println("Como se llama la pelicula? ");
        String nombre = lector.nextLine();
        Superman.establecerNombre(nombre);
        System.out.println("Cual es la duracion de la pelicula? ");
        int duracion = lector.nextInt();
        Superman.establecerduracion(0);
        System.out.println("Cual es la calidad de la pelicula?");
        String calidad = lector.nextLine();
        Superman.establecerCalidad(calidad);
        System.out.println("Cual es el genero de la pelicula? ");
        String genero = lector.next();
        Superman.establecerGenero(genero);
        System.out.println("Cual es la clasificacion de la pelicula? ");
        String clasificacion= lector.nextLine();
        Superman.establecerClasificion(clasificacion);
        System.out.println("Nombre: " + Superman.mostrarNombre());
        System.out.println("Duracion = " + Superman.mostrarduracion() + " minutos");
        System.out.println("Calidad: " + Superman.mostrarCalidad());
        System.out.println("Genero: " + Superman.mostrarGenero());
        System.out.println("Clasificacion: " + Superman.mostrarClasificion());

    }
}
