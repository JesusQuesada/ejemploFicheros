
package escribir;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AddDatos {
    
    PrintWriter ad;
    FileWriter fich;
    
    public void addTexto(String nombreFich, String dato) {
        try {
            ad = new PrintWriter(new FileWriter(nombreFich, true));
            ad.println(dato);
        } catch (IOException ex) {
            ex.getMessage();
        }
        finally{
            ad.close();
        }
        
        
        
    }
}
