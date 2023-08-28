package com.Monday;

public class MultipleCatch{
    public static void main(String args[]){
           int a=10, b=2, c=0;
           int ar[]=new int[4];
           
             System.out.println("Before division");
             try {
                c=a/b;
                ar[4]=9;
             }catch(ArithmeticException e) {
            	 
            System.out.println(e); 
            e.printStackTrace();
            System.out.println("Catch will execute only when there is exception");
            }
             catch(ArrayIndexOutOfBoundsException e) {
            	 e.printStackTrace();
             }
            finally {
            	System.out.println("finally block" );
            }
            
    
    }
}