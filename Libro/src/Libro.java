public class Libro {

    private String isbn;
    private String titulo;
    private int numPaginas;
    private String autor;
    private boolean prestado;

    public Libro(String isbn, String titulo, int numPaginas, String autor, boolean prestado) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.numPaginas = numPaginas;
        this.autor = autor;
        this.prestado = prestado;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public boolean isPrestado() {
        return prestado;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }

    @Override
    public String toString() {
        String estadoPrestamo = prestado ? "prestado" : "no prestado";
        return "El libro (" + isbn + ") con título \"" + titulo + "\" y autor " + autor +
                " tiene " + numPaginas + " páginas y " + estadoPrestamo + ".";
    }

    public void prestar() {
        if (!prestado) {
            prestado = true;
        }
    }

    public void devolver() {
        if (prestado) {
            prestado = false;
        }
    }

    public double imprimir(double costePorPagina) {
        return numPaginas * costePorPagina;
    }

    public boolean equals(Libro otroLibro) {
        return this.isbn.equals(otroLibro.getIsbn());
    }
}

