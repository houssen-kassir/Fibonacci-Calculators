import java.util.Scanner;
public class question1 {

	
	
	public static void main(String[] args) {
		int i;
		Scanner kb = new Scanner(System.in);
		System.out.print("Please enter a number:");
		int n = kb.nextInt();
		int[] array ={22, 61,-10, 21, 0, 9, 50, 17, 35, 81,-46, 19, 5, 77 };	
		int j=array.length;
		
		for(i=0;i<j;i++) {
			
			if(array[i]% n==0) {
			
			System.out.println("The elements of the array A that are multiples of"+ n + "are:");
			System.out.println("Index "+i+" with value "+ array[i]+".");
			}
			
		}
		
		
		kb.close();
		
		
	}
}
