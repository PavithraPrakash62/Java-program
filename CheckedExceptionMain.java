package com.Monday;
    import java.io.BufferedReader;
	import java.io.IOException;
	import java.io.InputStreamReader;

	public class CheckedExceptionMain {

		public static void main(String[] args) throws IOException  {
			int age;
			String name;
			
			//InputStreamReader is=new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println("Enter name");
		
				name= br.readLine();
			System.out.println("Name="+name);
			
		}
	}

