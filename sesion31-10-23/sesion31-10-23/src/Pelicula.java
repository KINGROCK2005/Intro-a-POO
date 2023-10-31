public class Pelicula {
    //atributos
    private String nombre;
    private int duracion;
    private String genero;
    private String calidad;
    private String clasificion;
    //Metodos constructores
    public Pelicula(){
        this(0, "No disponible", "No disponible", "No disponible", "No disponible");

    }
    //Metodo constructor con todos los parametros
    public Pelicula(int duracion, String genero, String calidad, String clasificacion, String nombre){
        this.calidad = calidad;
        this.clasificion = clasificacion;
        this.duracion = duracion;
        this.genero = genero;
        this.nombre = nombre;
    }
    //Metodos getters y setters
    //Los metodos getters son para mostrar los valores de los atributos
    public String mostrarNombre(){//get nombre
        return this.nombre;
    } 
    public int mostrarduracion(){//get duracion
        return this.duracion;
    } 

    public String mostrarGenero() {
        return this.genero;
    }
    
    public String mostrarCalidad() {
        return this.calidad;
    }
    
    public String mostrarClasificion() {
        return this.clasificion;
    }
    
    //Los metoods setters son para modificar los valores de los atributos
    public void establecerNombre(String nombre){//Set nombre
        this.nombre = nombre;
    }
    public void establecerduracion(int duracion){//Set duracion
        if(duracion < 0){
            this.duracion = 0;
        }else {
            this.duracion = duracion;
        }
    }
    public void establecerGenero(String genero) {
                this.genero = genero;
            }
    public void establecerCalidad(String calidad) {
        this.calidad = calidad;
    }
    public void establecerClasificion(String clasificion) {
            this.clasificion = clasificion;
        }

}
