public class Ordenador {
    private String marca;
    private String modelo;
    private int gbRam;
    private int capacidadDiscoDuro;
    private int espacioUtilizado;
    private boolean encendido;

    // Constructor vacío
    public Ordenador() {
        this.marca = "";
        this.modelo = "";
        this.gbRam = 4; // Por defecto 4GB
        this.capacidadDiscoDuro = 50; // Por defecto 50GB
        this.espacioUtilizado = 0;
        this.encendido = false; // Por defecto apagado
    }

    // Constructor solo con RAM
    public Ordenador(int gbRam) {
        setGbRam(gbRam); // Utilizar el setter para validar la RAM
        this.modelo = "";
        this.marca = "";
        this.capacidadDiscoDuro = 50; // Por defecto 50GB
        this.espacioUtilizado = 0;
        this.encendido = false; // Por defecto apagado
    }

    // Constructor con RAM y capacidad de disco duro
    public Ordenador(int gbRam, int capacidadDiscoDuro) {
        setGbRam(gbRam); // Utilizar el setter para validar la RAM
        this.capacidadDiscoDuro = capacidadDiscoDuro;
        this.modelo = "";
        this.marca = "";
        this.espacioUtilizado = 0;
        this.encendido = false; // Por defecto apagado
    }

    // Constructor completo
    public Ordenador(String marca, String modelo, int gbRam, int capacidadDiscoDuro) {
        this.marca = marca;
        this.modelo = modelo;
        setGbRam(gbRam); // Utilizar el setter para validar la RAM
        this.capacidadDiscoDuro = capacidadDiscoDuro;
        this.espacioUtilizado = 0; // Inicializado en 0
        this.encendido = false; // Por defecto apagado
    }

    // Métodos de acceso (getters y setters)
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getGbRam() {
        return gbRam;
    }

    public void setGbRam(int gbRam) {
        if ((gbRam & (gbRam - 1)) == 0) { // Verifica si gbRam es potencia de 2
            this.gbRam = gbRam;
        } else {
            throw new IllegalArgumentException("La RAM debe ser una potencia de 2.");
        }
    }

    public int getCapacidadDiscoDuro() {
        return capacidadDiscoDuro;
    }

    public void setCapacidadDiscoDuro(int capacidadDiscoDuro) {
        this.capacidadDiscoDuro = capacidadDiscoDuro;
    }

    public int getEspacioUtilizado() {
        return espacioUtilizado;
    }

    public boolean isEncendido() {
        return encendido;
    }

    // Métodos para encender y apagar
    public void encender() {
        encendido = true;
    }

    public void apagar() {
        encendido = false;
    }

    // Métodos para transferir y eliminar archivos
    public void transferirArchivos(int gb) {
        if (!encendido) {
            System.out.println("El ordenador está apagado. Enciéndalo primero.");
            return;
        }
        if (espacioUtilizado + gb > capacidadDiscoDuro) {
            System.out.println("No hay suficiente espacio en el disco duro.");
        } else {
            espacioUtilizado += gb;
            System.out.println("Archivos transferidos: " + gb + " GB.");
        }
    }

    public void eliminarArchivos(int gb) {
        if (!encendido) {
            System.out.println("El ordenador está apagado. Enciéndalo primero.");
            return;
        }
        if (gb >= espacioUtilizado) {
            espacioUtilizado = 0;
        } else {
            espacioUtilizado -= gb;
        }
        System.out.println("Archivos eliminados: " + gb + " GB.");
    }

    // Método equals mejorado
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true; // Mismo objeto
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false; // Verifica si el objeto es nulo o de otra clase
        }
        Ordenador otroOrdenador = (Ordenador) obj; // Cast a Ordenador
        return this.marca.equals(otroOrdenador.getMarca()) &&
                this.modelo.equals(otroOrdenador.getModelo()) &&
                this.gbRam == otroOrdenador.getGbRam() &&
                this.capacidadDiscoDuro == otroOrdenador.getCapacidadDiscoDuro();
    }

    // Método toString
    @Override
    public String toString() {
        return "Ordenador {" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", GB RAM=" + gbRam +
                ", Capacidad disco duro=" + capacidadDiscoDuro +
                ", Espacio utilizado=" + espacioUtilizado +
                ", Encendido=" + (encendido ? "Sí" : "No") +
                '}';
    }
}