import java.util.Scanner;
class DayBeforeNDay{
public static void main(String args[]){
Scanner sc= new Scanner (System.in);
int a= sc.nextInt();
int b= sc.nextInt();
int c= b%7;
int ans= c-a;
if(ans>0){
System.out.println(ans);
}
else{
System.out.println(ans+7);
}
}
}