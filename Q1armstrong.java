
import java.util.Scanner;

public class Q1armstrong{

	public static void main(String[] args) {

		int num,temp , rem, sum = 0;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number");
		num=sc.nextInt();
		temp=num;
		while (temp != 0)
		{
			rem = temp % 10;
			sum = sum+rem*rem*rem;
			temp /= 10;
		}

		if(sum == num)
			System.out.println(num + " is an Armstrong number.");
		else
			System.out.println(num + " is not an Armstrong number.");
		
	}

	}

