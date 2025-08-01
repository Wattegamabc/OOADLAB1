import java.util.Scanner;

public class Grades{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of students");
		int number = sc.nextInt();
		int StdList[][] = new int[number][];
		char GrdList[] = new char[3];
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
		int c;
		char mGrade;
		char cGrade;
		char pGrade;
		char StdGrd;
		int GradeVal;
		
		while(i<number+1){
			StdList[i - 1] = new int[7];
			StdList[i-1][0] = i;
			for(c=1;c<7;c++){
				StdList[i-1][c] = 0;
			}
			i = i+1;
		}
		
		int j;
		System.out.println("    ------------------------------------------------------------------------------------------------------------");
		System.out.println("    | "+"Student ID | " + "Math Marks | " + "Math Grade | " +  "Chemistry Marks | " +  "Chemistry Grade | " +  "Physics Marks | " +  "Physics Grade |" );
		System.out.println("    ------------------------------------------------------------------------------------------------------------");
		for(j=0;j<number;j++){
			GrdList[0] = 'F';
			GrdList[1] = 'F';
			GrdList[2] = 'F';
			System.out.println("    |      " + StdList[j][0] + "     |     " + StdList[j][1] + "      |     " + GrdList[0] + "      |        " + StdList[j][2] + "        |        " + GrdList[1] +  "        |       " + StdList[j][3] + "       |       " + GrdList[2] + "       |");
			System.out.println("    ------------------------------------------------------------------------------------------------------------");
		}
		
		while(true){
			System.out.println("Select your choice :\n1 to add or update/add marks\n2 to get average mark of a subject\n3 to get average mark of a student\n4 to get total mark of a student\n5 to check the grades of a student");
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
				SubAvg = (float)MarkTot/number;
				System.out.println("Subject's average mark : " + SubAvg);
			}
			
			else if(choice==3){
				System.out.println("Enter student id you want to get the average mark of");
				StdNum = sc.nextInt();
				StdAvg = (float)(StdList[StdNum-1][1] + StdList[StdNum-1][2] + StdList[StdNum-1][3])/3; 
				System.out.println("Students average mark : " + StdAvg);
			}
				
			else if(choice==4){
				System.out.println("Enter student id you want to get the total mark of");
				StdNum = sc.nextInt();
				StdTot = (StdList[StdNum-1][1] + StdList[StdNum-1][2] + StdList[StdNum-1][3]);
				System.out.println("Students average mark : " + StdTot);
			}
			
			else if(choice==5){
				System.out.println("Enter student id you want to get the grades of");
				StdNum = sc.nextInt();
				for(c=0;c<3;c++){
					GradeVal = StdList[StdNum-1][c+4];
					switch(GradeVal){
						case 1:
							GrdList[c] = 'A';
							break;
						case 2:
							GrdList[c] = 'B';
							break;
						case 3:
							GrdList[c] = 'C';
							break;
						case 4:
							GrdList[c] = 'D';
							break;
						case 5:
							GrdList[c] = 'F';
							break;
					}
				}
				System.out.println("Student " + StdNum + " ;\nMath Grade : " + GrdList[0] + "\nChemistry Grade : " + GrdList[1] + "\nPhysics Grade : " + GrdList[2]);
			}
			
		    else{
				System.out.println("Invalid Choice Try again");
		    }
			
			System.out.println("Current List : ");
			
			System.out.println("    ------------------------------------------------------------------------------------------------------------");
			System.out.println("    | "+"Student ID | " + "Math Marks | " + "Math Grade | " +  "Chemistry Marks | " +  "Chemistry Grade | " +  "Physics Marks | " +  "Physics Grade |" );
			System.out.println("    ------------------------------------------------------------------------------------------------------------");
			
			for(j=0;j<number;j++){
				for(c=0;c<3;c++){
					if(StdList[j][c+1] >= 90){
						GrdList[c] = 'A';
						StdList[j][c+4] = 1;
					}else if(StdList[j][c+1] < 90 && StdList[j][c+1] >= 80){
						GrdList[c] = 'B';
						StdList[j][c+4] = 2;
					}else if(StdList[j][c+1] < 80 && StdList[j][c+1] >= 70){
						GrdList[c] = 'C';
						StdList[j][c+4] = 3;
					}else if(StdList[j][c+1] < 70 && StdList[j][c+1] >= 60){
						GrdList[c] = 'D';
						StdList[j][c+4] = 4;
					}else{
						GrdList[c] = 'F';
						StdList[j][c+4] = 5;	
					}
				}
				System.out.println("    |      " + StdList[j][0] + "     |     " + StdList[j][1] + "      |     " + GrdList[0] + "      |        " + StdList[j][2] + "        |        " + GrdList[1]  +  "        |       " + StdList[j][3] + "       |       " + GrdList[2] + "       |");
				System.out.println("    ------------------------------------------------------------------------------------------------------------");
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

