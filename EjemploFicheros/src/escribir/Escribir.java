package escribir;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Escribir {

    File fich;
    PrintWriter f = null;

    public void escribirTexto(String nombreFich) {

        try {
            fich = new File(nombreFich);
            f = new PrintWriter(fich);
            f.println("probando escribir en un fichero");
            f.println("con varias líneas");
            f.println("de texto");

        } catch (FileNotFoundException ex) {
            ex.getMessage();
        } finally {
            f.close();
        }

    }
    
    
}
