import java.util.Scanner;

public class classarrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{
			int[]arr=new int[5];
			Scanner scan=new Scanner(System.in);
			for(int i=0;i<arr.length;i++)
			{
				System.out.println("Enter the marks");
				arr[i]=scan.nextInt();
			}
			System.out.println("Enter marks are");
			for(int i=0;i<arr.length;i++)
			{
				System.out.println(arr[i]);
			}
		}
		
	}

}
