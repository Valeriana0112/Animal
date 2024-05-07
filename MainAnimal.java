public class MainAnimal {
    public static void main(String[] args) {
        Perro perro = new Perro("Toby", "Croquetas", 12, "pitbulll");
        Gato gato = new Gato("Manchas", "pezcado", 3, "mestiza");
        perro.mostrar();
        System.out.println();
        gato.mostrar();

    }
}