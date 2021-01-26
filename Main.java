
import java.util.Scanner;
public class Main {
public static void main(String args[]) {
Scanner sc = new Scanner(System.in);
System.out.println("Introduce el nombre del titular;");
String nombre = sc.nextLine();
banckcompte p1 = new banckcompte( nombre, 1200 ,"osamq" ,  "faroq" , "ES80423100001180000012345");
p1.validariban(p1.iban);
while(0<1){
p1.menu();
int teclado = sc.nextInt();
p1.opcionesdemenu(teclado);
}
}
}
