package com.tnsif.dayfive.firstpackage;

public class Executor {

	public static void main(String[] args) {

      Base b = new Base();
      b.varDefault();
      b.varPublic();
      b.varProtecetd();
     
      b.defaultvar=100;
      b.publicvar=200;
      b.protectedvar=300;
      b.varDefault();
      b.varPublic();
      b.varProtecetd();

	}

}
