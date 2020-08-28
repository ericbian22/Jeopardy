/*This application allows the user to play a jeopardy game.  It prompt the user to choose the row and column of the question and then display the score base on the correction of the answer
 * 
 */
import java.util.Scanner;
public class jeopardyassignment {
	
public static void tableGenerating(int[][] questionValue) {
		//generate the question value 
		//Pre:Send the questionValue array as parameter
		//Post: Store all the question value into the array
		for(int i=0;i<5;i++) {
			for( int j=0;j<5;j++) {
				questionValue[i][j]=100*(i+1);
			}
		}
	}


public static void questionsStoring(String[][]question) {
			//Store the questions 
			//Pre:Send the question array as parameter
			//Post: Store all the questions into the array
    
	 question[0][0]="What is 2 to the power of 2?";
     question[0][1]="What is the first atom in the periodic table?";
     question[0][2]="Who's the founder of Apple?";
     question[0][3]="When did Canada become a country?";
     question[0][4]="How many provinces and territories in Canada?";
     
     question[1][0]="What is the greatest common factor of 122 and 64?";
     question[1][1]="What is Pb in the periodic table?";
     question[1][2]="When was the first programmable computer  invented?";
     question[1][3]="When did world war 2 start?";
     question[1][4]="What is the population of Canada? (answer in #million)";
     
     question[2][0]="3x3+0.5x9.8x3x3=";
     question[2][1]="What is the magnitude of the gravitational acceleration on surface of earth?";
     question[2][2]="How many kilobytes in a megabyte?";
     question[2][3]="Who was the first prime minister of Canada?";
     question[2][4]="How many continents in the world?";
     
     question[3][0]="What is the horziontal transformation is y=-2sin(x-60)+30?";
     question[3][1]="What is the speed of light?(include unit)";
     question[3][2]="What is the full name of RAM?";
     question[3][3]="Who became president after the assassination of Abraham Lincoln?";
     question[3][4]="What is the biggest country in Africa?";
     
     question[4][0]="log8/log2=";
     question[4][1]="what is the centripital force of a 5kg object travelling 10m/s in a 100m radius horizontal circle?";
     question[4][2]="What  year was  SpaceX founded?";
     question[4][3]="Who discorvered America?";
     question[4][4]="How long is highway 404?";
     
}


public static void answersStoring(String[][]answer) {
	//Store the answer 
	//Pre:Send the answer array as parameter
	//Post: Store all the answers into the array

	answer[0][0]="4";
	answer[0][1]="hydrogen";
	answer[0][2]="Steve Jobs";
	answer[0][3]="1867";
	answer[0][4]="13";
	
	answer[1][0]="2";
	answer[1][1]="lead";
	answer[1][2]="1943";
	answer[1][3]="1939";
	answer[1][4]="37million";
	
	answer[2][0]="53.1";
	answer[2][1]="9.8";
	answer[2][2]="1024";
	answer[2][3]="John Macdonald";
	answer[2][4]="7";
	
	answer[3][0]="60";
	answer[3][1]="300000000m/s";
	answer[3][2]="random access memory";
	answer[3][3]="Andrew Johnson";
	answer[3][4]="Algeria";
	
	answer[4][0]="3";
	answer[4][1]="5";
	answer[4][2]="2002";
	answer[4][3]="Columbus";
	answer[4][4]="50km";
	
}
public static void questionCounter(int[][] questionCounter) {
	//Set a question counter that counts all many attempts per question
	//Pre:Send the questionCounter array as a parameter 
	//Post:Store all 0 into the array 
	for(int i=0;i<5;i++) {
		for( int j=0;j<5;j++) {
			questionCounter[i][j]=0;
		}
	}
}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);

		//Variable declaration
		
		int counter=1;
		int row,column;
		String useranswer;
		int score=0;
		int[][]questionValue=new int[5][5];
		String[][]question=new String[5][5];
		String[][]answer=new String[5][5];
		int[][]questionCounter=new int[5][5];
		
		//call all the methods
		tableGenerating(questionValue);
		questionsStoring(question);
		answersStoring(answer);
		questionCounter(questionCounter);
	
		System.out.println("Welcome to Jeopardy");
		
		//Process work 
		while(counter<26) {
			
			//Display the question value table
			System.out.println("Math  Science  Computer  history  geography");
			for(int i=0; i<5;i++) {
				for( int j=0;j<5;j++) {
					System.out.print(questionValue[i][j] + "\t");
				}
				System.out.println();
			}
			
		//Prompt the user to pick the row and column 
		System.out.println();
		System.out.println("Enter the row you want to pick");
		row=input.nextInt();
		System.out.println();
		System.out.println("Enter the column you want to pick");
		column=input.nextInt();
		System.out.println();
		
	//Process whether the question as been answer already or not 
	if(questionCounter[row-1][column-1]==1) {
		System.out.println("Please pick another question!!!");
		System.out.println();
		counter--;
	
	}else {
		
		//Prompt the user to input solution
		System.out.println(question[row-1][column-1]);
				
		useranswer=input.nextLine();
		useranswer=input.nextLine();
		
		//Compare whether the user input is correct or not 
		if(useranswer.equalsIgnoreCase(answer[row-1][column-1])) {
			score=score+questionValue[row-1][column-1];
			questionValue[row-1][column-1]=0;
			System.out.println();
			System.out.println("Correct answer!");
			System.out.println();
			questionCounter[row-1][column-1]=1;
			
		}else{
			score=score-questionValue[row-1][column-1];
			questionValue[row-1][column-1]=0;
			System.out.println();
			System.out.println("Wrong answer!");
			System.out.println();
			System.out.println("The correct answer is "+ answer[row-1][column-1]);
			System.out.println();
			questionCounter[row-1][column-1]=1;
			
				}
	}	
		
		//Display the accumulate score
		System.out.println("Your Score is " + score);
		System.out.println();
		counter++;
		}
		
		//Display the user's final score when there is no more question left
		System.out.println("Game over! Your final socre is "+ score);
		
	}
}


