package com.company;

public class Task2 {
    public static void main(String[] arcs){
        float number=0;
        for (int  i= 1;  i<10000 ; i++) {
            if (i %2==0) {
                number-=1f/i;
            }else if(i==1){
                number+=i;
            }
            else{
                number+=1f/i;

            }

        }

        System.out.println(number);
    }



}

