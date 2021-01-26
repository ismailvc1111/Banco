

import java.util.*;
import java.util.regex.Pattern;
public class banckcompte {
    private String titular ;
    private String nombre;
    private String apellido;
     String iban ;
    private int saldo; 
    private int k;
    private  int[] historial = new int[10];
    public banckcompte(String titular , int saldo ,String nombre , String apellido , String iban) {
	this.titular = titular;
	this.nombre = nombre;
	this.apellido = apellido;
	this.iban = iban;
	this.saldo = saldo;
	
}
  public void imprimir() {
	System.out.println("*********************************");
	System.out.println("**********Datos*******************");
	System.out.println("El titular ; "+ titular);
	System.out.println("El nombre ; "+ nombre);
	System.out.println("El apellido ; " + apellido);
	System.out.println("Iban ; " + iban);
	System.out.println("Saldo ;" + saldo);
	
	
	
}


public void validariban( String iban) {
     boolean condicion = true;
        String titularRegexp = "[ES]{2}[0..9]{22}";

      if(Pattern.matches(titularRegexp, iban) == false){
          //errori();   
        }
    }

    public void Imprimirmovimetnto() {
	int g = 0;
	while(g<9) {
		++g;
		System.out.println("Movimientos " + g +" ;" + historial[g]);
	}
   };
  public void menu() {
	System.out.println("*********************************");
	System.out.println("****************Menu************");
	System.out.println("1-Imprimir datos");
	System.out.println("2-Retirar");
	System.out.println("3-Historial");
    System.out.println("4-Ingresar");
    System.out.println("5-Salir");
    
}
public void  opcionesdemenu(int h) {
	Scanner sc = new Scanner(System.in);
	switch (h) {
	  case 1:
		  imprimir();
	    break;
	  case 2:
	    System.out.println("retirar");
	   int  teclado1 = sc.nextInt();;
	    retirar(teclado1);
	    break;
	  case 3:
		 Imprimirmovimetnto();
		  
		 break;
	  case 4:
	    System.out.println("ingresar");
	    int teclado = sc.nextInt();
	    
	    ingresar(teclado);
	    break;
	  case 5:
	    System.out.println("salir");
	    System.exit(0);
	    break;
	    }

	 
}
public boolean comprovacion() {
	boolean crear = false;
	if (titular.length()> 0 |nombre.length() >0 | apellido.length()>0 ) {
		crear = true;
		
      }else {
		System.err.println("lo siento la cuenta no se puede crear");
		crear = false;
	  }
      return crear ;
     }
   public int getslado() {
	return saldo;
    }
   
   
   public String  gettitularr() {
    return titular;	
    }
   
   
   public int movimientos(int l) {
	
	 
	   ++k;
     if(k>=11){
       error();

     }
	   historial[k]= l;
    return historial[k];    	
}
   
  public int retirar(int y ) {
	  
	if (saldo > y){
		saldo -= y;
		movimientos(y);
  } 
	return y;
	
}


  public void avisohaciendo() {
	  System.out.println("Aviso a Hacienda");
  }
  public void error() {
	  System.err.println("lo siento no se puede realizar esta operacion;");
  }
   public void errori() {
	  System.err.println("lo siento no se hay un error en el iban");
    System.exit(0);
  }
  
   public int ingresar(int i ) {
	    saldo += i;
		movimientos(i);
		if(i <= -50) {
			error();
		}
		if(i>=3000) {
		avisohaciendo();
		}
       return i;
	}


}