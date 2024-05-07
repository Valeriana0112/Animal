public class Animal {

    private String Nombre, tipoDeAlimentacion;
    private int edad;

    public Animal(String Nombre, String tipoDeAlimentacion, int edad) {
        this.Nombre = Nombre;
        this.tipoDeAlimentacion = tipoDeAlimentacion;
        this.edad = edad;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getTipoDeAlimentacion() {
        return tipoDeAlimentacion;
    }

    public void setTipoDeAlimentacion(String tipoDeAlimentacion) {
        this.tipoDeAlimentacion = tipoDeAlimentacion;
    }

    public int getedad() {
        return edad;
    }

    public void setedad(int edad) {
        edad = edad;
    }

    @Override
    public String toString() {

        return "Animal [Nombre=" + Nombre + ", tipoDeAlimentacion=" + tipoDeAlimentacion + ", Edad=" + edad + "]";

    }

}
