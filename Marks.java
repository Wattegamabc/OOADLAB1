import java.util.Scanner;

public class Marks{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of students");
		int number = sc.nextInt();
		int StdList[][] = new int[number][];
		int i = 1;
		int StdNum;
		int StdMark;
		int StdMarkVal;
		float StdAvg;
		int StdTot;
		float SubAvg;
		int MarkNum;
		int MarkTot = 0;
		int result;
		
		while(i<number+1){
			StdList[i - 1] = new int[4];
			StdList[i-1][0] = i;
			StdList[i-1][1] = 0;
			StdList[i-1][2] = 0;
			StdList[i-1][3] = 0;
			i = i+1;
		}
		
		int j;
		for(j=0;j<number;j++){
			System.out.println("Student " + StdList[j][0] + " Marks " + " Mathematics " + StdList[j][1] + " Chemistry " + StdList[j][2] + " Physics " + StdList[j][3]);
		}
		
		while(true){
			System.out.println("Select your choice :\n1 to add or update/add marks\n2 to get average mark of a subject\n3 to get average mark of a student\n4 to get total mark of a student");
			int choice = sc.nextInt();
			if(choice==1){
				System.out.println("Enter student id you want to add or update marks for");
				StdNum = sc.nextInt();
				System.out.println("Enter the mark you want to update ; Mathematics: 1, Chemistry: 2, Physics: 3");
				StdMark = sc.nextInt();
				System.out.println("Enter the value you want to update;");
				StdMarkVal = sc.nextInt();
				StdList[StdNum-1][StdMark] = StdMarkVal;
			}
			
			else if(choice==2){
				System.out.println("Enter mark id you want to get the average mark of : Mathematics: 1, Chemistry: 2, Physics: 3");
				MarkNum = sc.nextInt();
				for(j=0;j<number;j++){
					MarkTot = MarkTot+ StdList[j][MarkNum];	
				}
				SubAvg = MarkTot/number;
				System.out.println("Subject's average mark : " + SubAvg);
			}
			
			else if(choice==3){
				System.out.println("Enter student id you want to get the average mark of");
				StdNum = sc.nextInt();
				StdAvg = (StdList[StdNum-1][1] + StdList[StdNum-1][2] + StdList[StdNum-1][3])/3; 
				System.out.println("Students average mark : " + StdAvg);
			}
				
			else if(choice==4){
				System.out.println("Enter student id you want to get the total mark of");
				StdNum = sc.nextInt();
				StdTot = (StdList[StdNum-1][1] + StdList[StdNum-1][2] + StdList[StdNum-1][3]);
				System.out.println("Students average mark : " + StdTot);
			}
			
		    else{
				System.out.println("Invalid Choice Try again");
		    }
			
			System.out.println("Current List : ");
			
			for(j=0;j<number;j++){
			System.out.println("Student " + StdList[j][0] + " Marks " + " Mathematics " + StdList[j][1] + " Chemistry " + StdList[j][2] + " Physics " + StdList[j][3]);
			}
			
			System.out.println("Do you want to continue ? 1 for Yes : 2 for No");
			result = sc.nextInt();
			if(result == 2){
				break;
			}
		}
			
		sc.close();			
	} 
}