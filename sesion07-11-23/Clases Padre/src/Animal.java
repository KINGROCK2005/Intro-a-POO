public class Animal {

    //clase padre
    private String nombre;
    private double peso;
    private boolean tienePiernas;
    private boolean tieneOjos;
    //Metodo constructor
    public Animal(String nombre, double peso, boolean tienePiernas, boolean tieneOjos) {
        this.nombre = nombre;
        this.peso = peso;
        this.tienePiernas = tienePiernas;
        this.tieneOjos = tieneOjos;
    }

    //Metodos getters
    public String mostrarNombre() {
        return nombre;
    }
    public double getPeso() {
        return peso;
    }
    public boolean isTienePiernas() {
        return tienePiernas;
    }
    public boolean isTieneOjos() {
        return tieneOjos;
    }

    //metodos setters
    public void ponerNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public void setTienePiernas(boolean tienePiernas) {
        this.tienePiernas = tienePiernas;
    }
    public void setTieneOjos(boolean tieneOjos) {
        this.tieneOjos = tieneOjos;
    }

    //Metodo funcional
    public void comer(){
        System.out.println("El animal esta comiendo!");
    }
    public void moverse(){
        System.out.println("El animal esta comiendo!");
    }
    
}
