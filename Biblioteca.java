import java.time.Year;

public class Biblioteca {
    private String titulo;
    private String autor;
    private int anospublicacion;
    private int numeropaginas;
    private boolean disponibleParaPrestamo;
    private boolean dañado;

    // constructor
    public Biblioteca(String titulo, String autor, int añospublicacion, int numeropaginas, boolean disponibleParaPrestamo, boolean dañado) {
        this.titulo = titulo;
        this.autor = autor;
        this.anospublicacion = añospublicacion;
        this.numeropaginas = numeropaginas;
        this.disponibleParaPrestamo = disponibleParaPrestamo;
        this.dañado = dañado;
    }
    public void setDañado(boolean dañado) {
        this.dañado = dañado;
        if (dañado) {
            this.disponibleParaPrestamo = false;
        }
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getañospublicacion() {
        return anospublicacion;
    }

    public int getNumeropaginas() {
        return numeropaginas;
    }

    public boolean isDisponibleParaPrestamo() {
        return disponibleParaPrestamo && !dañado;
    }
    //Método para establecer el estado de daño del libro
    public void setDisponibleParaPrestamo(boolean disponibleParaPrestamo) {
        this.disponibleParaPrestamo = disponibleParaPrestamo;
    }

    }
    public boolean isDañado() {
       return false;
    }
//devuelve verdadero si el libro es más antiguo que 50 años.
    public boolean esAntiguoLibro() {
        int anospublicacion;
        return Year.now().getValue() - anospublicacion > 0;

    }