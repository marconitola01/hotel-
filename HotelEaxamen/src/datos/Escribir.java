package datos;
import java.io.*;
import java.util.Scanner;

public class Escribir
{
    public void escribir(){
        Scanner sc = new Scanner(System.in);
        
        FileWriter fichero = null;
        PrintWriter pw = null;
        try
        {
            fichero = new FileWriter("hotel.txt");
            pw = new PrintWriter(fichero);
     
       Romanos inicio=new Romanos();
                
        } catch (Exception excepcion) {
            excepcion.printStackTrace();
        } finally {
           try {
       
           if (null != fichero)
              fichero.close();
           } catch (Exception excepcion2) {
              excepcion2.printStackTrace();
           }
        }
    }
}