import java.util.Scanner;

public class Marks{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of students");
		int number = sc.nextInt();
		int StdList[][];
		var StdList = new int[number][3];
		int i = 1;
		while(i<number+1){
			StdList[i-1] = i;
			StdList[i-1][0] = 0;
			StdList[i-1][1] = 0;
			StdList[i-1][2] = 0;
			i = i+1;
		}
		
		int j;
		for(j=0;j<number;j++){
			System.out.println("Student " + StdList[j] + " Marks " + " " + StdList[j][0] + " " + StdList[j][1] + " " + StdList[j][2]);
		
		while(1){
			System.out.println("Select your choice");
			int choice = sc.nextInt();
			if (choice==1){
				System.out.println("Enter student id you want to update marks for");
				int StdNum = sc.nextInt();
				System.out.println("Enter the mark you want to update ; 1,2,3");
				int StdMark = sc.nextInt();
				System.out.println("Enter the value you want to update ; 1,2,3");
				int StdMarkVal = sc.nextInt();
				
	} 
}