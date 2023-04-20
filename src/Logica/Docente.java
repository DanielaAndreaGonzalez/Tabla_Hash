/**
 * 
 */
package Logica;

/**
 * @author GonzalezHDanielaA
 *
 */
public class Docente {
	
	private int idDocente;
    private String nombre;
    public static int dimension;

    public Docente(int idDocente, String nombre) {
        this.idDocente = idDocente;
        this.nombre = nombre;
    }

    public int getIdDocente() {
        return idDocente;
    }

    public void setIdDocente(int idDocente) {
        this.idDocente = idDocente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    @Override
    public int  hashCode()
    {
        return idDocente % dimension;
    }
}
