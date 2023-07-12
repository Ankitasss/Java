import java.util.Scanner;
class LastDigit{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int a= sc.nextInt();
int b=Math.abs(a);
int c=a%10;
System.out.println(c);
}
}