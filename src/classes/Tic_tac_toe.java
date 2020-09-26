package classes;

import java.io.*;
import java.util.Scanner;

//package classes;

public class Tic_tac_toe {
	
	char[] board;
	char playersymbol;
	char computersymbol;
	
	public Tic_tac_toe() {
		board = new char[10];
	}
	
	void initializeBoard() {
		// UC1
		for(int i=1; i<10; i++){
			this.board[i] = '0';
		}
	}
	
	void choosePlayerByToss(){
		int input;
		System.out.println("Choose Heads or Tails:\n1.Heads\n2.Tails" );
		Scanner scan = new Scanner(System.in);
		while(true){
			input = scan.nextInt();
			if(input == 1 || input == 2 ){
				break;
			}else {
				System.out.println("Enter either 1 or 2 only");
			}
		}
		int toss = playToss();
		if(input == toss){
			System.out.println("Player wins and has the first move");
		} else {
			System.out.println("Computer wins and has the first move");
		}
	}
	
	int playToss(){
		int output;
		if(Math.random()%2 == 0){
			output = 1;
		}else {output = 2;}
		return output;
	}
	
	void chooseSymbol() throws IOException{ 		//UC2
		String input = new String();
		System.out.println("Choose your symbol(X or O) :");
		Scanner scan = new Scanner(System.in);
        while(input.isEmpty()){
            input = scan.next();
        	if(input.equalsIgnoreCase("X")){
        		this.playersymbol = 'X';
        		this.computersymbol = 'O';
        	}else if(input.equalsIgnoreCase("O")){
        		this.playersymbol = 'O';
        		this.computersymbol = 'X';
        	}else{
        		System.out.println("Enter characters either X or O only");
        		input="";
        	}
        }
        scan.reset();
	}
	
	void displayBoard() {		//UC3
		System.out.println(board[1]+"|"+board[2]+"|"+board[3]);
		System.out.println(board[4]+"|"+board[5]+"|"+board[6]);
		System.out.println(board[7]+"|"+board[8]+"|"+board[9]);
	}
	
	void insertSymbol() throws IOException{ 		//UC4 and UC5
		int input = 0;
		System.out.println("Enter the position(1-9) at which you want to place your symbol : ");
		Scanner scan = new Scanner(System.in);
        while(true){
        	input = scan.nextInt();
        	if(isvalid(input)){
        		break;
        	} else {
        		System.out.println("Enter a valid position which is available\n(numbering is done horizontal first)");
        	}
        }
        scan.reset();
        board[input] = playersymbol;
	}
	
	boolean isvalid(int input){
		// To check if the entered input is free(available) or not
		boolean output = false;
		if(input>0 && input<10){
			if(board[input] == '0'){
				output = true;
			}
		}
		return output;
	}
	
	public static void main(String args[]) throws IOException{
		Tic_tac_toe game1 = new Tic_tac_toe();
		game1.initializeBoard();		//UC1
		game1.chooseSymbol(); 			//UC2
		game1.choosePlayerByToss(); 	//UC6
		game1.displayBoard();			//UC3
		game1.insertSymbol(); 			//UC4&5
		game1.displayBoard(); 			//UC4&5
		
	}
}
