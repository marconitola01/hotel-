
package datos;
 
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class CrearArchivo {
//Marco Nitola, poo, uniminuto

//el archivo con los datos se guarda en la carpeta del proyecto con el nombre de hotel(es un txt)
    
public static void main(String [] arg) {
   File archivo = null;
   FileReader fr = null;
   ArrayList lineas = new ArrayList();
   Escribir iniciar = new Escribir();
   iniciar.escribir();
   
 try {
       archivo = new File ("hotel.txt");
      String linea;
      fr = new FileReader (archivo);
      BufferedReader br = new BufferedReader(fr);
    while((linea=br.readLine())!=null){
lineas.add(linea);
}
System.out.print ("\n\n  LA INFORMACION BASICA ES : \n ");
           for (int j = 0 ; j < lineas.size() ; j++){
           linea = (String)lineas.get(j);
           System.out.print ( linea + "\n" );
     }
}
   catch(IOException e){
     System.out.println(e);
}
   finally{
     try{ 
        if( fr != null){ 
        fr.close(); 
} 
}   catch (IOException e){ 
}
}
System.exit(0);}}


