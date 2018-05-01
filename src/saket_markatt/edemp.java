/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package saket_markatt;

/**
 *
 * @author Aakash
 */
import java.io.*;

public class edemp {

    String Arr1[]=new String [1000];
    String Arr2[]=new String [1000];
    String Arr3[]=new String [1000];
    String Arr4[]=new String [1000];
    String Arr5[]=new String [1000];
    
    
  public int cnt=0;
  
  edemp()
  {
     ediemp();
    
}
  
  
  
  void ediemp()
  {
   try{ 
       
      FileInputStream fstream = new FileInputStream ("Employeedetails.txt");
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
                               Arr1 [x] = strLine;
                               strLine = br.readLine();
                               z++;
                               }
                       if (z==2)
                       {System.out.println(z+"---"+strLine);
                               Arr2 [x] = strLine;
                               strLine = br.readLine();
                               z++;
                               }
                       if (z==3)
                       {System.out.println(z+"---"+strLine);
                               Arr3 [x] = strLine;
                              strLine = br.readLine();
                               z++;
                               }
                       if (z==4)
                       {System.out.println(z+"---"+strLine);
                               Arr4 [x] = strLine;
                               strLine = br.readLine();
                               z++;
                               }
                     if (z==5)
                       {System.out.println(z+"---"+strLine);
                               Arr5 [x] = strLine;
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
       
   
      
  
