package com.company;

import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) 
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Задание №1");
        
        for (int n = 2; n <10 ; n++) 
        {
            for (int i = 1; i <100 ; i++) 
            {
                for (int j = 1; j <100 ; j++) 
                {
                    for (int k = 1; k <100 ; k++) 
                    {
                        if  (Math.pow(i,n)==Math.pow(j,n)+Math.pow(k,n) )
                            System.out.println("n="+n+"\t"+Math.pow(j,n)+"+"+Math.pow(k,n)+"="+Math.pow(i,n));
                    }
                }
            }
        }
    }
}

