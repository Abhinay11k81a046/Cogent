import java.util.*;

public class Students {

	public static void main(String[] args) throws Exception
	{
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter the number of students to be added into database: ");
		int number = scan.nextInt();
		
		//System.out.println("Total number of students: "+number);
		
		String student[][] = new String[number][5];
		int i=0;
		for(i=0;i<number;i++)
		{
			System.out.print(
					"Student: " + (i + 1) +
					"\n   Name: ");
			student[i][0] = scan.next();
			System.out.print(
					"   DoB Year: ");
			student[i][1] = scan.next();
			System.out.print(
					"   ID: ");
			student[i][2] = scan.next();
		}	
		
		String subject[][] = new String[number][5];
		int s[] = new int[5];
		for(i=0;i<number;i++)
		{
			System.out.println("Enter the num of subjects to enroll for "+student[i][0]+": ");
			s[i] = scan.nextInt();
			for(int j=0; j<s[i];j++)
			{
				System.out.println("Subject" + (j + 1) +": ");
				subject[i][j] = scan.next();
			}
			System.out.println("The tution fee is:"+ s[i]*600+"$\n");
			student[i][3] = Integer.toString((s[i])*600);
		}		
	
		System.out.println("\n\n");
		System.out.println("Here's the list of students in our database:");
				
		for(i=0;i<number;i++)
			System.out.println(student[i][0]);
		
		System.out.println("Enter the student number to get his details:");
		int n = scan.nextInt();
		
		for(int j=0;j<5;j++)
			System.out.print(student[n-1][j]+"\t");
		System.out.println("\n"+student[n-1][0]+" enrolled in the following subjects: ");
		for(int j=0;j<s[n-1];j++)
			System.out.print(subject[n-1][j]+"\t");
	}
}

