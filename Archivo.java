
package estructuradatos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;
import java.util.StringTokenizer;


public class Archivo {
    public static void main (String[] args) throws java.io.IOException{
 
        String a1;
        String a2;
 
        // Cargamos el buffer con el contenido del archivo
        FileReader fr = new FileReader("C:\\Users\\BOG-A409-E-003\\Documents\\Datos.txt");
        BufferedReader br = new BufferedReader(fr);
 
        // Leemos la primera linea
        a1 = br.readLine();
 
        System.out.println ("La primera linea del archivo es: " + a1);
        System.out.println ("La linea tiene " + a1.length() + " caracteres");
 
        System.out.println ();
        System.out.println ("Separando la linea tenemos las siguientes palabras:");
 
        int numTokens = 0;
        StringTokenizer st = new StringTokenizer (a1);
 
        // bucle por todas las palabras
        while (st.hasMoreTokens())
        {
            a2 = st.nextToken();
            numTokens++;
            System.out.println ("    Palabra " + numTokens + " es: " + a2);
        }
    }
}



