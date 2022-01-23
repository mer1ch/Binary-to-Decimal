package binary.to.decimal;

import java.util.Scanner;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class binary_to_decimal{
    public static void main(String[] args) throws InterruptedException {
        Random p=new Random();
        int [] a=new int[10];
        double decimal=0;
// Computer selects 0 or 1 for binary code.
        for(int i=0;i<9;i++){
            a[i]=p.nextInt(2);
            System.out.print(a[i]);
        }
        a[9]=p.nextInt(2);
        System.out.println(a[9]);
        TimeUnit.SECONDS.sleep(1);
// Then shows the binary number. I used TimeUnit for let you see it.
        for(int i=0;i<10;i++){
            if(a[i]==1){
// You can do without Math but this way is easier.
                decimal=decimal+Math.pow(2, 9-i);
            }
            if(a[i]==0){
            }
        }
        System.out.println(decimal);
    }    
}

