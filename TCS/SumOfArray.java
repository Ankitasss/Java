//package arrayintro;
import java.util.Scanner;
public class SumOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner (System.in);
		int n= sc.nextInt();
		int [] arr= new int [n];
		
		
		for(int i=0; i<n;i++) {
			System.out.print("enter number" +i+"th index");
			arr[i]= sc.nextInt();
		}
		int sum=0;
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]);
		
                //int sum=0;
                sum=sum+arr[i];
                System.out.println(sum);
}


	}

}
