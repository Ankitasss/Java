import java.util.Scanner;
public class SumOfArray1 {

	public static void printArray(int[] arr) {
			int n= arr.length;
			for(int i=0;i<n;i++) {
				System.out.println(arr[i]);
				int sum=0;
				sum=sum+arr[i];
                                System.out.println(sum);
			}
	
	
		}
		public static int[] takeInput() {
			Scanner sc= new Scanner(System.in);
			int n= sc.nextInt();
			int [] arr= new int[n];
			
			
			for(int i=0;i<n;i++) {
				System.out.println("enter number"+i+"th index");
				arr[i]=sc.nextInt();
			}
			return arr;
		}
		public static void main(String args[]) {
			int [] arr=takeInput();
			printArray(arr);

		}
	
	}
