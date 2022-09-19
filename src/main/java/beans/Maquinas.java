
package beans;


public class Maquinas {
    private int id ;
    private String titulo;
    private String categoria;
    private String marca;
    private int unidadesDisponibles;
    private boolean novedad;

    public Maquinas(int id, String titulo, String categoria, String marca, int unidadesDisponibles, boolean novedad) {
        this.id = id;
        this.titulo = titulo;
        this.categoria = categoria;
        this.marca = marca;
        this.unidadesDisponibles = unidadesDisponibles;
        this.novedad = novedad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getUnidadesDisponibles() {
        return unidadesDisponibles;
    }

    public void setUnidadesDisponibles(int unidadesDisponibles) {
        this.unidadesDisponibles = unidadesDisponibles;
    }

    public boolean isNovedad() {
        return novedad;
    }

    public void setNovedad(boolean novedad) {
        this.novedad = novedad;
    }

    @Override
    public String toString() {
        return "Maquinas{" + "id=" + id + ", titulo=" + titulo + ", categoria=" + categoria + ", marca=" + marca + ", unidadesDisponibles=" + unidadesDisponibles + ", novedad=" + novedad + '}';
    }
    
    
}
