/**
 * 
 */
package Logica;

/**
 * @author GonzalezHDanielaA
 *
 */
public class NuevaHash {
	
	/**
     * @param args the command line arguments
     */
   private int[] arreglo= new int[10];
   private int cantidad =0;
    public static void main(String[] args) {
        // TODO code application logic here
        //Creo un arreglo
    	Docente.dimension=25;
    	Docente []arrDocente=new Docente[Docente.dimension];
    	Docente Doc= new Docente(1231,"Julian Perez");
        System.out.println(Doc.hashCode());
        arrDocente [Doc.hashCode()]=Doc;
        Doc= new Docente(4561,"Juliana Perez");
        System.out.println(Doc.hashCode());
        arrDocente [Doc.hashCode()]=Doc;
        Doc= new Docente(5432,"PepitoPerez");
        System.out.println(Doc.hashCode());
        arrDocente [Doc.hashCode()]=Doc;
        
    }

}
