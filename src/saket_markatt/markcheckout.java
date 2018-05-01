/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package saket_markatt;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;
 import java.io.*;
/**
 *
 * @author Aakash
 */
public class markcheckout {
    
   



    String Date1[]=new String [1000];
    String Name1[]=new String [1000];
    String Atte1[]=new String [1000];
    String Checkintime[]=new String [1000];
   
    
    
  public int cnt=0;
  
  markcheckout()
  {
     mcout();
    
}
  
  
  
  void mcout()
  {
   try{ 
       
      FileInputStream fstream = new FileInputStream ("Markcheckin.txt");
           // Get the object of data input stream
           DataInputStream in = new DataInputStream (fstream);
           BufferedReader br = new BufferedReader (new InputStreamReader (in));
           String strLine;
                   // Read file line by line
                   int x =0; int z =1;
                   while ((strLine = br.readLine ()) != null)
                   { //for (int i = 0; (i<14); i++)
                       if (z==1)
                       {System.out.println(z+"---"+strLine);
                               Date1 [x] = strLine;
                               strLine = br.readLine();
                               z++;
                               }
                       if (z==2)
                       {System.out.println(z+"---"+strLine);
                               Name1 [x] = strLine;
                               strLine = br.readLine();
                               z++;
                               }
                       if (z==3)
                       {System.out.println(z+"---"+strLine);
                               Atte1 [x] = strLine;
                              strLine = br.readLine();
                               z++;
                               }
                       if (z==4)
                       {System.out.println(z+"---"+strLine);
                               Checkintime [x] = strLine;
                            
                               z++;x++;z=1;
                               }
                    
                       cnt++;
                       System.out.println("===="+cnt);
                       //}
                       System.out.println("c"+cnt);
                   }
       }//end of try
       
       catch (Exception e){
   }
  
} 
}//end of method
    

