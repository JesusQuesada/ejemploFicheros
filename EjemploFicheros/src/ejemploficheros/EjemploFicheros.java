package ejemploficheros;

import ejemploficheros.lectura.LeerLinea;
import ejemploficheros.lectura.LeerNumeros;
import ejemploficheros.lectura.LeerObjetos;
import ejemploficheros.lectura.LeerPalabras;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class EjemploFicheros {

    public static void main(String[] args) {
        //LeerLinea objFicher = new LeerLinea();
        //objFicher.leer("/home/local/DANIELCASTELAO/jquesadaabeijon/Escritorio/fichero.txt");
        //LeerNumeros objNum = new LeerNumeros();
        //objNum.leerNum("/home/local/DANIELCASTELAO/jquesadaabeijon/Escritorio/numeros.txt");
        //objNum.leerNumComas("/home/local/DANIELCASTELAO/jquesadaabeijon/Escritorio/numeroscomas.txt");
        //LeerPalabras objPal = new LeerPalabras();
        //objPal.leerPal("/home/local/DANIELCASTELAO/jquesadaabeijon/Escritorio/dorsal.txt");
        LeerObjetos obj = new LeerObjetos();
        obj.leerObjetos("/home/local/DANIELCASTELAO/jquesadaabeijon/Escritorio/dorsal.txt");
        obj.visualizar();
    }
}

