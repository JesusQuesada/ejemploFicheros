package ejemploficheros.lectura;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LeerPalabras {

    Scanner sc;
    File fich;

    public void leerPal(String nombreFich){
        fich = new File(nombreFich);
        try {
            sc = new Scanner(fich);
            while(sc.hasNext())
                System.out.println(sc.next());
        } catch (FileNotFoundException ex) {
            ex.getMessage();
        }
        finally{
            sc.close();
        }
    }
}
