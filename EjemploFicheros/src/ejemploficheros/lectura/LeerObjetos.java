package ejemploficheros.lectura;

import ejemploficheros.jugadores.Jugador;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LeerObjetos {

    Scanner sc;
    File fich;
    ArrayList<Jugador> lista;

    public void leerObj(String nombreFich) {
        fich = new File(nombreFich);
        try {
            sc = new Scanner(fich);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        } catch (FileNotFoundException ex) {
            ex.getMessage();
        } finally {
            sc.close();
        }
    }

    public void leerObjetos(String nombreFich) {
        lista = new ArrayList<Jugador>();
        try {
            sc = new Scanner(new File(nombreFich));
            while (sc.hasNextLine()) {
                String[] aux = sc.nextLine().split(",");
                Jugador o = new Jugador(aux[0], Integer.parseInt(aux[1]));
                lista.add(o);
            }
        } catch (FileNotFoundException ex) {
            ex.getMessage();
        } finally {
            sc.close();
        }

    }
    
    public void visualizar() {
        for(int i=0;i<lista.size(); i++)
            System.out.println(lista.get(i));
    }
}
