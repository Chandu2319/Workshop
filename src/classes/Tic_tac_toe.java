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
	
	
	
	public static void main(String args[]){
		Tic_tac_toe game1 = new Tic_tac_toe();
		game1.Initialize_board();		//UC1
		
	}
}
