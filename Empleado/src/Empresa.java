public class Empresa {
    private String cif;
    private String nombre;

    public Empresa(String cif, String nombre) {
        this.cif = cif;
        this.nombre = nombre;
    }

    public String getCif() {
        return cif;
    }

    public String getNombre() {
        return nombre;
    }
}
