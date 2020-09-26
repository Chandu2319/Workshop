package classes;

import java.io.*;
import java.util.Scanner;

//package classes;

public class Tic_tac_toe {
	
	char[] board;
	char player;
	char computer;
	
	public void Tic_tac_toe() {
		char[] board = new char[10];
	}
	
	void Initialize_board() {
		// UC1
		for(int i=1; i<=10; i++){
			this.board[i] = '0';
		}
	}
	
	void choose_symbol(){
		String input;
		System.out.println("Choose your symbol(X or O) :");
		Scanner scan = new Scanner(System.in);
        input = scan.next();
        while(input.isEmpty()){
        	if(input == "X"){
        		this.player = input.charAt(0);
        		this.computer = 'O';
        	}
        	else if(input == "O"){
        		this.player = input.charAt(0);
        		this.computer = 'X';
        	}
        	else{
        		System.out.println("Enter characters either X or O only");
        		input="";
        	}
        	scan.close();
        }
	}
	
	public static void main(String args[]){
		Tic_tac_toe game1 = new Tic_tac_toe();
		game1.Initialize_board();		//UC1
		game1.choose_symbol(); 			//UC2
	}
}
