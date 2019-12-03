
package Libreria;

public class TryParse {
    public boolean esInteger(String valor) {
        try {
            int numero=Integer.parseInt(valor);
            return true;
        } catch(NumberFormatException e) {
            return false;
        }
    }
    public boolean esFloat(String valor) {
        try {
            float numero=Float.parseFloat(valor);
            return true;
        } catch(NumberFormatException e) {
            return false;
        }
    }    
}
