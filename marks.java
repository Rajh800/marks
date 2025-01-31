import java.util.Scanner;
public class marks{
public static void main (String args[]) {
float a,b,c,d;
Scanner ap=new Scanner(System.in);
System.out.println("physics");
a= ap.nextInt();
System.out.println("math");
b= ap.nextInt();
System.out.println("chemistry");
c= ap.nextInt();

d=a+b+c;
if (d/300*100 >=40 && a/100*100>=33 && b/100*100>=33 && c/100*100>=33) {
System.out.println("pass");
}
else {
System.out.println("Fail");
}




}
}