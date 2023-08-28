package com.edu;

class Student5{  
    int id;  
    String name;  
    int age;  
    int phoneno;
    //creating two arg constructor  
    Student5(int i,String n){  
    id = i;  
    name = n;  
    }  
    //creating three arg constructor  
    Student5(int i,String n,int a){  
    id = i;  
    name = n;  
    age=a;  
    }
    Student5(int i,String n,int a,int b){  
        id = i;  
        name = n;  
        age=a;
        phoneno = b;
    
    }  
    void display(){System.out.println(id+" "+name+" "+age);}  
    public class FunctionOverLoading {
    public static void main(String args[]){  
    Student5 s1 = new Student5(111,"Karan");  
    Student5 s2 = new Student5(222,"Aryan",25);
    Student5 s3 = new Student5(222,"Aryan",25,944);
    
    s1.display();  
    s2.display();  
    s3.display();
   }  
    }
}
