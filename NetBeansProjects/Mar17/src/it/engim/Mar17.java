//lezioni sulle eccezioni
//l eccezioni sono degli oggetti ...quando va tutto bene nel codice
//non ci sono eccezioni   le ecezioni possono essere (gettate :drow)
//java interrompe il programma  quando viene lanciata eccezione e viene fatta
//ripartire dalla priam catch che trova di IOException  
package it.engim;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Mar17 
{
    
   
    
 public static void main(String[] args) 
    {
        try
        {
                    elaboraFile();
        }
        //va a controllare se il file non esiste 
        catch(FileNotFoundException fnfe)
        {
            System.err.println("File non Trovato");
            fnfe.printStackTrace();
        }   
        //questa eccezione esce se mancano i permessi di lettura dei file (o se il hard disk e danneggiato)
        catch(IOException ioe)
        {
            System.err.println("File non leggibile");
            ioe.printStackTrace();
        }
        finally
        {
        
            System.out.println("da qui ci paasso sempre");
        
        }
             System.out.println("da qui ci paasso forse");
    }
    
    
public static void elaboraFile()throws IOException
    {
      
        File f=new File("/etc/passwod");
        InputStream is=new FileInputStream(f);
        is.close();  
        
      
        
    }
    

}
