import java.util.Scanner;
public class LargestOfArray {
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
	public static int largest(int arr[]) {
		int max=Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		return max;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr=takeInput();
		int lar=largest(arr);
		System.out.println(lar);

	}

	
}
