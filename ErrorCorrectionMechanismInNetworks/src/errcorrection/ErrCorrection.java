package errCorrection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class ErrCorrection {

    
    public static void main(String args[]) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner (System.in);
        int[] data;
        int[] div;
        int[] divisor;
        int[] rem;
        int[] crc;
        int data_bits, divisor_bits, tot_length;
        int test = 0;
        int inversion = 0;
        
//        System.out.print("Enter number of data bits : ");
//        data_bits=Integer.parseInt(br.readLine());
        

        System.out.print("Enter data bits : ");
        String input = sc.nextLine();
            String[] split = input.split("\\s+");
            data=new int[split.length];
            int j=0;
            for (String string : split) 
                data[j++] = Integer.parseInt(string);
         
            

//        System.out.print("Enter number of bits in polynomial : ");
//        divisor_bits=Integer.parseInt(br.readLine());
//        divisor=new int[divisor_bits];
        
        int k = 0;
        System.out.print("Enter polynomial bits : ");
        String input1 = sc.nextLine();
        String[] split1 = input1.split("\\s+");
        divisor=new int[split1.length];
        for (String string : split1) 
                divisor[k++] = Integer.parseInt(string);


/*       System.out.print("Data bits are : ");
        for(int i=0; i< data_bits; i++)
            System.out.print(data[i]);        
        System.out.println();
        */ 
       
        System.out.println();
        //appedning the zeros
       tot_length=split.length+split1.length-1;
        
        div=new int[tot_length];
        rem=new int[tot_length];
        crc=new int[tot_length];
    /*------------------ CRC GENERATION-----------------------*/    
        for(int i=0;i<data.length;i++)
            div[i]=data[i];
        
        /*System.out.print("Dividend (after appending 0's) are : ");
        for(int i=0; i< div.length; i++)
            System.out.print(div[i]);        
        System.out.println();
        */
        
            /*  System.out.print("divisor bits are : ");
        for(int i=0; i< split1.length; i++)
            System.out.print(divisor[i]);   */
        
        for(int i=0; i<div.length; i++){
              rem[i] = div[i];
        }
    
        rem=divide(div, divisor, rem);
        
        for(int i=0;i<div.length;i++)           //append dividend and ramainder
        {
            crc[i]=(div[i]^rem[i]);
        }
        
        System.out.println();
        System.out.println("Message to be transmitted : ");    
        for(int i=0;i<crc.length;i++)
            System.out.print(crc[i]);
            
    /*-------------------ERROR DETECTION---------------------*/    
        
        
        
/*        System.out.print("crc bits are : ");
        for(int i=0; i< crc.length; i++)
            System.out.print(crc[i]);        
        System.out.println();
*/        
        for(int i=0; i<crc.length; i++){
              rem[i] = crc[i];
        }
    
        rem=divide(crc, divisor, rem);
        
        for(int i=0; i< rem.length; i++)
        {
            if(rem[i]!=0)
            {
                System.out.println("Error");
                break;
            }
            if(i==rem.length-1)
                System.out.println("No Error");
        }
        
        System.out.println("Enter 1 for inversion or 0 for no inversion");
        inversion = Integer.parseInt(br.readLine());
        if (inversion == 0){
            
        } else 
            if (inversion == 1){
                System.out.print("Enter a position of a bit to be inverted : ");
        test = Integer.parseInt(br.readLine());
         if (data[test-1] == 0){
             data[test-1] = 1;
         }
         else {
             data[test-1] = 0;
         }
         System.out.print("After reversing the bit at position "+ test+ ": ");
          for(int i=0; i<split.length; i++) {
              System.out.print(data[i]);
            
        }
                
            }
            else{
                 System.out.println("Only 1 or 0 allowed. Abborting !");
                
            }
        
        System.out.println();
        System.out.print("Enter the transmited message of "+tot_length+" bits "
                + "for verification: ");
        
        int f = 0;
        String input2 = sc.nextLine();
        String[] split2 = input2.split("\\s+");
        
        for (String string : split2) 
                crc[f++] = Integer.parseInt(string);
        
        
        
        
        System.out.println();
        System.out.println("Job Done !");
    }
    
    static int[] divide(int div[],int divisor[], int rem[])
    {
        int cur=0;
        while(true)
        {
            for(int i=0;i<divisor.length;i++)
                rem[cur+i]=(rem[cur+i]^divisor[i]);
            
            while(rem[cur]==0 && cur!=rem.length-1)
                cur++;
    
            if((rem.length-cur)<divisor.length)
                break;
        }
        return rem;
    }
}

