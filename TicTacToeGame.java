package p2;

import java.util.Scanner;

public class TicTacToeGame {

	public static void main(String args[]){
		
		char[] Board = new char[10];
		int n = Board.length;
		char[] board =  CreateBord(n, Board);
		char input = UserInput();
		switch(input)
		{
		 case '0':
			   System.out.println(input);
		      break; 
		   
		 case 'X':
			   System.out.println(input);
		      break; 
		   
		   default :
			   System.out.println("Please select X or 0");
		}
	}
	private static char UserInput() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Select X or 0");
		String str=scan.next();    
		char ch=str.charAt(0);  
		return ch;
	}
	private static char[] CreateBord(int n, char[] Board) {
		for (int i=1;i<=n-1;i++)
		{
			Board[i] = ' ';
		}
		return Board;		
	}
}
