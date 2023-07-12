import java.util.Scanner;
Class First{
public static void main(String []args){
Scanner sc= new Scanner(Systen.in);
System.out.println("Enter number");
int a= sc.nextInt();

if(a>0){
System.out.println("positive number");
}
else if(a<0){
System.out.println("negative number");
}
else{
System.out.println("Zero");
}
}
}