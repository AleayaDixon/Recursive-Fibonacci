/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursive.methods;

/**
 *
 * @author Aleaya
 */
public class RecursiveMethods {


    public static int fib(int x) {
       if(x <= 1) 
       {
           return x;
           //System.out.println(x);
       }
       else
       {
           int next = fib(x-1) + fib (x-2);
           return next;
       }
    }
    public static void main(String[] args)
    {
        for(int i = 0; i<20; i++)
        {
            System.out.println(fib(i));
        }
    }
    
}
