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
	
	void chooseSymbol(){ 		//UC2
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
	
	void insertSymbol() { 		//UC4 and UC5
		int input = 0;
		System.out.println("Enter the position(1-9) at which you place your symbol : ");
		Scanner scan = new Scanner(System.in);
        while(true){
        	input = scan.nextInt();
        	if(isvalid(input)){
        		break;
        	} else {
        		System.out.println("Enter a position which is available");
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
	
	public static void main(String args[]){
		Tic_tac_toe game1 = new Tic_tac_toe();
		game1.initializeBoard();		//UC1
		game1.chooseSymbol(); 			//UC2
		game1.displayBoard();			//UC3
		game1.insertSymbol(); 			//UC4
		game1.displayBoard(); 			//UC5
	}
}
