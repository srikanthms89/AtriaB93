package com.tnsif.day2;

public class Identofiers {

	public static void main(String[] args) {

      int a=10, b=20, c=30;
      
      a++;
      
      int d= a ++ + -- b + c;
      
      System.out.println(d);
      System.out.println(a);
      System.out.println(b);
      System.out.println(c);
      
      
      d++;
      
      int e= -- d + --a + c++ ;
      
      System.out.println(e);
      
      
      --e;
      int f = -- e + d++ + --c ;
      
      System.out.println(f);
      
		
		  

	}

}
