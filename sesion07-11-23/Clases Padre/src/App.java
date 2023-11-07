
public class App {
    public static void main(String[] args) throws Exception {
        //VAmos a crear objetos de ambas clases
        Animal animal = new Animal("Dragon de Komodo", 400.00, true, true);
        Perro yupi = new Perro("Sasha", 50.00, true, true, true, true, "Chow chow");
    
        animal.comer();
        yupi.comer();
    }
}
