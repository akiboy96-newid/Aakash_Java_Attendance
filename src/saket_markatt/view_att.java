/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package saket_markatt;

/**
 *
 * @author Aakash
 */
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;


public class view_att {
    String Double_Arr1[][]=new String[1000][1000];
    public int cnt=0;
    
    view_att(){
        view_att_method2();
        //sortdata();
         
    }
    

void view_att_method2(){
    
    try{
        
        FileInputStream fstream= new FileInputStream("Markfile.txt");
        DataInputStream in = new DataInputStream(fstream);
        BufferedReader br= new BufferedReader(new InputStreamReader(in));
        String strLine;
        
        int x=0; 
        
        while ((strLine=br.readLine()) !=null)
        {
           
            for( int z=0;z<=4;z++)
            {
                Double_Arr1[x][z]=strLine;
                if(z<4 && strLine!=null) {
                
                    strLine=br.readLine();
                }
                
                
                System.out.println("==studata=="+z+Double_Arr1[x][z]);
            }
            x++;
            cnt++;
            }
        }
      catch(Exception e){
          
      }
    }


             
    /*          
      

public void sortdata()
{
    for(int isrt=0;isrt< cnt;isrt++)
    {
        for(int isrt2=0;isrt2< cnt-1;isrt2++)
        { String t1;
          String t2;
          String t3;
          String t4;
          //String t5; 
          
          System.out.println( Double_Arr1[isrt2][1]+ Double_Arr1[isrt2+1][1]);
          int t0=Integer.parseInt( Double_Arr1[isrt2][1]);
          int t00=Integer.parseInt( Double_Arr1[isrt2+1][1]);
          if (t0>t00)
              
          {
              t1= Double_Arr1[isrt2][0];
              t2= Double_Arr1[isrt2][1];
              t3= Double_Arr1[isrt2][2];
              t4= Double_Arr1[isrt2][3];
              //t5= Double_Arr1[isrt2][4];
              
              Double_Arr1[isrt2][0]= Double_Arr1[isrt2+1][0];
              Double_Arr1[isrt2][1]= Double_Arr1[isrt2+1][1];
              Double_Arr1[isrt2][2]= Double_Arr1[isrt2+1][2];
              Double_Arr1[isrt2][3]= Double_Arr1[isrt2+1][3];
              Double_Arr1[isrt2][4]= Double_Arr1[isrt2+1][4];
              
              Double_Arr1[isrt2+1][0]=t1;
              Double_Arr1[isrt2+1][1]=t2;
              Double_Arr1[isrt2+1][2]=t3;
              Double_Arr1[isrt2+1][3]=t4;
              //Double_Arr1[isrt2+1][4]=t5;
          }
           
        }
    }
    
    for (int t=0;t<cnt;t++)
    { for (int tt=0;tt< cnt-1;tt++)
        
    { System.out.print(Double_Arr1[t][tt]);
    
    }
    System.out.println();
    }
}
*/
}


