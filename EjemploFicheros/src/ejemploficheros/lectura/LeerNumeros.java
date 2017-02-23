package ejemploficheros.lectura;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LeerNumeros {

    Scanner sc;
    File fich;
    int par;

    public void leerNum(String nomFich) {
        try {
            sc = new Scanner(new File(nomFich));
            while (sc.hasNextInt()) {
                System.out.println(sc.nextInt());
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Error 3: " + ex.getMessage());
        } finally {
            sc.close();
        }
    }

    public void leerNumComas(String nomFich) {
        try {
            sc = new Scanner(new File(nomFich)).useDelimiter(",\\s*");
            while (sc.hasNextInt()) {
                System.out.println(sc.nextInt());
            }
        } catch (FileNotFoundException ex) {
            ex.getMessage();
        } finally {
            sc.close();
        }
    }
}

