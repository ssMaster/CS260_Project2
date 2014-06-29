/*
 * Simon Sharudin
 * CS260 - Data Structures
 * Project2 - Traverse the Maze
 * November 10, 2013
 */

/*
 * This program uses Stacks and Sets to search for a path for a maze application.
 */

import java.io.*;
import java.util.*;

public class MazeApplication {
	private static int counter;
	
	public static void main(String[] args) throws IOException{
		/////////////////////////////
		
		// local variables
		String nsFile = "",
			   ewFile = "";
		String input, 
			   input2;
		
		int rowSize,
			colSize;
		
		counter = 0;	// hold the number of solutions for a maze based on their dimensions
		
		int probability1 = 0, // for the (T, F) probability of (0.9, 0.1)
			probability2 = 0, // for the (T, F) probability of (0.8, 0.2)
			probability3 = 0, // for the (T, F) probability of (0.7, 0.3)
			probability4 = 0, // for the (T, F) probability of (0.6, 0.4)
			probability5 = 0, // for the (T, F) probability of (0.5, 0.5)
			probability6 = 0, // for the (T, F) probability of (0.4, 0.6)
			probability7 = 0, // for the (T, F) probability of (0.3, 0.7)
			probability8 = 0, // for the (T, F) probability of (0.2, 0.8)
			probability9 = 0; // for the (T, F) probability of (0.1, 0.9)
		
		/////////////////////////////
		
		// --------------------------------------------------- 10 x 10 maze
		nsFile = "northSouth1.txt";
		ewFile = "eastWest1.txt";
		readMaze(nsFile, ewFile);	
		System.out.println("\n----------------------- New Maze\n");
		
		// --------------------------------------------------- 4 x 4 maze
		nsFile = "north-south.txt";
		ewFile = "east-west.txt";
		readMaze(nsFile, ewFile);	
		System.out.println("\n----------------------- New Maze\n");
		
		// ----------------------------------------------------
	
		// create the random 6 x 6 maze
		double p = Math.random();
		String value = "";
		
		// -------------------------------------------------------- for the 6 x 6 maze with probability (0.9, 0.1)
		counter = 0;
		for(int index = 0; index < 10; index++){
			input = "northSouth2.txt";
			input2 = "eastWest2.txt";
			
			PrintWriter northSouthWriter = new PrintWriter(input);
			PrintWriter eastWestWriter = new PrintWriter(input2);
			
			rowSize = 6;
			colSize = 6;
			
			northSouthWriter.println(rowSize + " " + colSize);
			
			// for the north-south file
			for(int i = 0; i < rowSize; i++){
				for(int j = 0; j < colSize; j++){
					if(i < rowSize-1){
						p = Math.random();
						value = "";
						if(p <= .9){
							value = "T";
						}
						else{
							value = "F";
						}
						northSouthWriter.print(value + " ");
					}
					else{
						northSouthWriter.print("F ");
					}
				}
				northSouthWriter.println();
			}
			
			northSouthWriter.close();
			
			// for the east-west file
			for(int i = 0; i < rowSize; i++){
				for(int j = 0; j < colSize; j++){
					if(j < colSize-1){
						p = Math.random();
						value = "";
						if(p <= .9){
							value = "T";
						}
						else{
							value = "F";
						}
						eastWestWriter.print(value + " ");
					}
					else{
						eastWestWriter.print("F");
					}
				}
				eastWestWriter.println();
			}
			
			eastWestWriter.close();
			
			// ----------
			
			nsFile = "northSouth2.txt";
			ewFile = "eastWest2.txt";
			readMaze(nsFile, ewFile);	
			System.out.println("\n----------------------- New Maze\n");
		}
		
		probability1 = getNumberOfNoSolutions();	// store the number of solutions for the maze based on the first probability test
		
		// -------------------------------------------------------- for the 6 x 6 maze with probability (0.8, 0.2)
		counter = 0;
		for(int index = 0; index < 10; index++){
			input = "northSouth2.txt";
			input2 = "eastWest2.txt";
			
			PrintWriter northSouthWriter = new PrintWriter(input);
			PrintWriter eastWestWriter = new PrintWriter(input2);
			
			rowSize = 6;
			colSize = 6;
			
			northSouthWriter.println(rowSize + " " + colSize);
			
			// for the north-south file
			for(int i = 0; i < rowSize; i++){
				for(int j = 0; j < colSize; j++){
					if(i < rowSize-1){
						p = Math.random();
						value = "";
						if(p <= .8){
							value = "T";
						}
						else{
							value = "F";
						}
						northSouthWriter.print(value + " ");
					}
					else{
						northSouthWriter.print("F ");
					}
				}
				northSouthWriter.println();
			}
			
			northSouthWriter.close();
			
			// for the east-west file
			for(int i = 0; i < rowSize; i++){
				for(int j = 0; j < colSize; j++){
					if(j < colSize-1){
						p = Math.random();
						value = "";
						if(p <= .8){
							value = "T";
						}
						else{
							value = "F";
						}
						eastWestWriter.print(value + " ");
					}
					else{
						eastWestWriter.print("F");
					}
				}
				eastWestWriter.println();
			}
			
			eastWestWriter.close();
			
			// ----------
			
			nsFile = "northSouth2.txt";
			ewFile = "eastWest2.txt";
			readMaze(nsFile, ewFile);	
			System.out.println("\n----------------------- New Maze\n");
		}
		
		probability2 = getNumberOfNoSolutions();	// store the number of solutions for the maze based on the second probability test
		
		// -------------------------------------------------------- for the 6 x 6 maze with probability (0.7, 0.3)
		counter = 0;
		for(int index = 0; index < 10; index++){
			input = "northSouth2.txt";
			input2 = "eastWest2.txt";
			
			PrintWriter northSouthWriter = new PrintWriter(input);
			PrintWriter eastWestWriter = new PrintWriter(input2);
			
			rowSize = 6;
			colSize = 6;
			
			northSouthWriter.println(rowSize + " " + colSize);
			
			// for the north-south file
			for(int i = 0; i < rowSize; i++){
				for(int j = 0; j < colSize; j++){
					if(i < rowSize-1){
						p = Math.random();
						value = "";
						if(p <= .7){
							value = "T";
						}
						else{
							value = "F";
						}
						northSouthWriter.print(value + " ");
					}
					else{
						northSouthWriter.print("F ");
					}
				}
				northSouthWriter.println();
			}
			
			northSouthWriter.close();
			
			// for the east-west file
			for(int i = 0; i < rowSize; i++){
				for(int j = 0; j < colSize; j++){
					if(j < colSize-1){
						p = Math.random();
						value = "";
						if(p <= .7){
							value = "T";
						}
						else{
							value = "F";
						}
						eastWestWriter.print(value + " ");
					}
					else{
						eastWestWriter.print("F");
					}
				}
				eastWestWriter.println();
			}
			
			eastWestWriter.close();
			
			// ----------
			
			nsFile = "northSouth2.txt";
			ewFile = "eastWest2.txt";
			readMaze(nsFile, ewFile);	
			System.out.println("\n----------------------- New Maze\n");
		}
		
		probability3 = getNumberOfNoSolutions();	// store the number of solutions for the maze based on the third probability test
		
		// -------------------------------------------------------- for the 6 x 6 maze with probability (0.6, 0.4)
		counter = 0;
		for(int index = 0; index < 10; index++){
			input = "northSouth2.txt";
			input2 = "eastWest2.txt";
			
			PrintWriter northSouthWriter = new PrintWriter(input);
			PrintWriter eastWestWriter = new PrintWriter(input2);
			
			rowSize = 6;
			colSize = 6;
			
			northSouthWriter.println(rowSize + " " + colSize);
			
			// for the north-south file
			for(int i = 0; i < rowSize; i++){
				for(int j = 0; j < colSize; j++){
					if(i < rowSize-1){
						p = Math.random();
						value = "";
						if(p <= .6){
							value = "T";
						}
						else{
							value = "F";
						}
						northSouthWriter.print(value + " ");
					}
					else{
						northSouthWriter.print("F ");
					}
				}
				northSouthWriter.println();
			}
			
			northSouthWriter.close();
			
			// for the east-west file
			for(int i = 0; i < rowSize; i++){
				for(int j = 0; j < colSize; j++){
					if(j < colSize-1){
						p = Math.random();
						value = "";
						if(p <= .6){
							value = "T";
						}
						else{
							value = "F";
						}
						eastWestWriter.print(value + " ");
					}
					else{
						eastWestWriter.print("F");
					}
				}
				eastWestWriter.println();
			}
			
			eastWestWriter.close();
			
			// ----------
			
			nsFile = "northSouth2.txt";
			ewFile = "eastWest2.txt";
			readMaze(nsFile, ewFile);	
			System.out.println("\n----------------------- New Maze\n");
		}
		
		probability4 = getNumberOfNoSolutions();	// store the number of solutions for the maze based on the fourth probability test
		
		// -------------------------------------------------------- for the 6 x 6 maze with probability (0.5, 0.5)
		counter = 0;
		for(int index = 0; index < 10; index++){
			input = "northSouth2.txt";
			input2 = "eastWest2.txt";
			
			PrintWriter northSouthWriter = new PrintWriter(input);
			PrintWriter eastWestWriter = new PrintWriter(input2);
			
			rowSize = 6;
			colSize = 6;
			
			northSouthWriter.println(rowSize + " " + colSize);
			
			// for the north-south file
			for(int i = 0; i < rowSize; i++){
				for(int j = 0; j < colSize; j++){
					if(i < rowSize-1){
						p = Math.random();
						value = "";
						if(p <= .5){
							value = "T";
						}
						else{
							value = "F";
						}
						northSouthWriter.print(value + " ");
					}
					else{
						northSouthWriter.print("F ");
					}
				}
				northSouthWriter.println();
			}
			
			northSouthWriter.close();
			
			// for the east-west file
			for(int i = 0; i < rowSize; i++){
				for(int j = 0; j < colSize; j++){
					if(j < colSize-1){
						p = Math.random();
						value = "";
						if(p <= .5){
							value = "T";
						}
						else{
							value = "F";
						}
						eastWestWriter.print(value + " ");
					}
					else{
						eastWestWriter.print("F");
					}
				}
				eastWestWriter.println();
			}
			
			eastWestWriter.close();
			
			// ----------
			
			nsFile = "northSouth2.txt";
			ewFile = "eastWest2.txt";
			readMaze(nsFile, ewFile);	
			System.out.println("\n----------------------- New Maze\n");
		}
		
		probability5 = getNumberOfNoSolutions();	// store the number of solutions for the maze based on the fifth probability test
		
		// -------------------------------------------------------- for the 6 x 6 maze with probability (0.4, 0.6)
		counter = 0;
		for(int index = 0; index < 10; index++){
			input = "northSouth2.txt";
			input2 = "eastWest2.txt";
			
			PrintWriter northSouthWriter = new PrintWriter(input);
			PrintWriter eastWestWriter = new PrintWriter(input2);
			
			rowSize = 6;
			colSize = 6;
			
			northSouthWriter.println(rowSize + " " + colSize);
			
			// for the north-south file
			for(int i = 0; i < rowSize; i++){
				for(int j = 0; j < colSize; j++){
					if(i < rowSize-1){
						p = Math.random();
						value = "";
						if(p <= .4){
							value = "T";
						}
						else{
							value = "F";
						}
						northSouthWriter.print(value + " ");
					}
					else{
						northSouthWriter.print("F ");
					}
				}
				northSouthWriter.println();
			}
			
			northSouthWriter.close();
			
			// for the east-west file
			for(int i = 0; i < rowSize; i++){
				for(int j = 0; j < colSize; j++){
					if(j < colSize-1){
						p = Math.random();
						value = "";
						if(p <= .4){
							value = "T";
						}
						else{
							value = "F";
						}
						eastWestWriter.print(value + " ");
					}
					else{
						eastWestWriter.print("F");
					}
				}
				eastWestWriter.println();
			}
			
			eastWestWriter.close();
			
			// ----------
			
			nsFile = "northSouth2.txt";
			ewFile = "eastWest2.txt";
			readMaze(nsFile, ewFile);	
			System.out.println("\n----------------------- New Maze\n");
		}
		
		probability6 = getNumberOfNoSolutions();	// store the number of solutions for the maze based on the sixth probability test
		
		// -------------------------------------------------------- for the 6 x 6 maze with probability (0.3, 0.7)
		counter = 0;
		for(int index = 0; index < 10; index++){
			input = "northSouth2.txt";
			input2 = "eastWest2.txt";
			
			PrintWriter northSouthWriter = new PrintWriter(input);
			PrintWriter eastWestWriter = new PrintWriter(input2);
			
			rowSize = 6;
			colSize = 6;
			
			northSouthWriter.println(rowSize + " " + colSize);
			
			// for the north-south file
			for(int i = 0; i < rowSize; i++){
				for(int j = 0; j < colSize; j++){
					if(i < rowSize-1){
						p = Math.random();
						value = "";
						if(p <= .3){
							value = "T";
						}
						else{
							value = "F";
						}
						northSouthWriter.print(value + " ");
					}
					else{
						northSouthWriter.print("F ");
					}
				}
				northSouthWriter.println();
			}
			
			northSouthWriter.close();
			
			// for the east-west file
			for(int i = 0; i < rowSize; i++){
				for(int j = 0; j < colSize; j++){
					if(j < colSize-1){
						p = Math.random();
						value = "";
						if(p <= .3){
							value = "T";
						}
						else{
							value = "F";
						}
						eastWestWriter.print(value + " ");
					}
					else{
						eastWestWriter.print("F");
					}
				}
				eastWestWriter.println();
			}
			
			eastWestWriter.close();
			
			// ----------
			
			nsFile = "northSouth2.txt";
			ewFile = "eastWest2.txt";
			readMaze(nsFile, ewFile);	
			System.out.println("\n----------------------- New Maze\n");
		}
		
		probability7 = getNumberOfNoSolutions();	// store the number of solutions for the maze based on the seventh probability test
		
		// -------------------------------------------------------- for the 6 x 6 maze with probability (0.2, 0.8)
		counter = 0;
		for(int index = 0; index < 10; index++){
			input = "northSouth2.txt";
			input2 = "eastWest2.txt";
			
			PrintWriter northSouthWriter = new PrintWriter(input);
			PrintWriter eastWestWriter = new PrintWriter(input2);
			
			rowSize = 6;
			colSize = 6;
			
			northSouthWriter.println(rowSize + " " + colSize);
			
			// for the north-south file
			for(int i = 0; i < rowSize; i++){
				for(int j = 0; j < colSize; j++){
					if(i < rowSize-1){
						p = Math.random();
						value = "";
						if(p <= .2){
							value = "T";
						}
						else{
							value = "F";
						}
						northSouthWriter.print(value + " ");
					}
					else{
						northSouthWriter.print("F ");
					}
				}
				northSouthWriter.println();
			}
			
			northSouthWriter.close();
			
			// for the east-west file
			for(int i = 0; i < rowSize; i++){
				for(int j = 0; j < colSize; j++){
					if(j < colSize-1){
						p = Math.random();
						value = "";
						if(p <= .2){
							value = "T";
						}
						else{
							value = "F";
						}
						eastWestWriter.print(value + " ");
					}
					else{
						eastWestWriter.print("F");
					}
				}
				eastWestWriter.println();
			}
			
			eastWestWriter.close();
			
			// ----------
			
			nsFile = "northSouth2.txt";
			ewFile = "eastWest2.txt";
			readMaze(nsFile, ewFile);	
			System.out.println("\n----------------------- New Maze\n");
		}
		
		probability8 = getNumberOfNoSolutions();	// store the number of solutions for the maze based on the eighth probability test
		
		// -------------------------------------------------------- for the 6 x 6 maze with probability (0.1, 0.9)
		counter = 0;
		for(int index = 0; index < 10; index++){
			input = "northSouth2.txt";
			input2 = "eastWest2.txt";
			
			PrintWriter northSouthWriter = new PrintWriter(input);
			PrintWriter eastWestWriter = new PrintWriter(input2);
			
			rowSize = 6;
			colSize = 6;
			
			northSouthWriter.println(rowSize + " " + colSize);
			
			// for the north-south file
			for(int i = 0; i < rowSize; i++){
				for(int j = 0; j < colSize; j++){
					if(i < rowSize-1){
						p = Math.random();
						value = "";
						if(p <= .1){
							value = "T";
						}
						else{
							value = "F";
						}
						northSouthWriter.print(value + " ");
					}
					else{
						northSouthWriter.print("F ");
					}
				}
				northSouthWriter.println();
			}
			
			northSouthWriter.close();
			
			// for the east-west file
			for(int i = 0; i < rowSize; i++){
				for(int j = 0; j < colSize; j++){
					if(j < colSize-1){
						p = Math.random();
						value = "";
						if(p <= .1){
							value = "T";
						}
						else{
							value = "F";
						}
						eastWestWriter.print(value + " ");
					}
					else{
						eastWestWriter.print("F");
					}
				}
				eastWestWriter.println();
			}
			
			eastWestWriter.close();
			
			// ----------
			
			nsFile = "northSouth2.txt";
			ewFile = "eastWest2.txt";
			readMaze(nsFile, ewFile);	
			System.out.println("\n----------------------- \n");
		}
		
		probability9 = getNumberOfNoSolutions();	// store the number of solutions for the maze based on the ninth probability test
		
		// ------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		
		System.out.println("Test Results for the 6 x 6 Mazes:\n");
		System.out.println("The probability of (0.9, 0.1) resulted in " + probability1 + " no solution mazes.");
		System.out.println("The probability of (0.8, 0.2) resulted in " + probability2 + " no solution mazes.");
		System.out.println("The probability of (0.7, 0.3) resulted in " + probability3 + " no solution mazes.");
		System.out.println("The probability of (0.6, 0.4) resulted in " + probability4 + " no solution mazes.");
		System.out.println("The probability of (0.5, 0.5) resulted in " + probability5 + " no solution mazes.");
		System.out.println("The probability of (0.4, 0.6) resulted in " + probability6 + " no solution mazes.");
		System.out.println("The probability of (0.3, 0.7) resulted in " + probability7 + " no solution mazes.");
		System.out.println("The probability of (0.2, 0.8) resulted in " + probability8 + " no solution mazes.");
		System.out.println("The probability of (0.1, 0.9) resulted in " + probability9 + " no solution mazes.");
		
		// ------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		 
		// -------------------------------------------------------- for the 60 x 60 maze with probability (0.9, 0.1)
		counter = 0;
		for(int index = 0; index < 10; index++){
			input = "northSouth3.txt";
			input2 = "eastWest3.txt";
			
			PrintWriter northSouthWriter = new PrintWriter(input);
			PrintWriter eastWestWriter = new PrintWriter(input2);
			
			rowSize = 60;
			colSize = 60;
			
			northSouthWriter.println(rowSize + " " + colSize);
			
			// for the north-south file
			for(int i = 0; i < rowSize; i++){
				for(int j = 0; j < colSize; j++){
					if(i < rowSize-1){
						p = Math.random();
						value = "";
						if(p <= .9){
							value = "T";
						}
						else{
							value = "F";
						}
						northSouthWriter.print(value + " ");
					}
					else{
						northSouthWriter.print("F ");
					}
				}
				northSouthWriter.println();
			}
			
			northSouthWriter.close();
			
			// for the east-west file
			for(int i = 0; i < rowSize; i++){
				for(int j = 0; j < colSize; j++){
					if(j < colSize-1){
						p = Math.random();
						value = "";
						if(p <= .9){
							value = "T";
						}
						else{
							value = "F";
						}
						eastWestWriter.print(value + " ");
					}
					else{
						eastWestWriter.print("F");
					}
				}
				eastWestWriter.println();
			}
			
			eastWestWriter.close();
			
			// ----------
			
			nsFile = "northSouth3.txt";
			ewFile = "eastWest3.txt";
			readMaze(nsFile, ewFile);	
			System.out.println("\n----------------------- New Maze\n");
		}
		
		probability1 = getNumberOfNoSolutions();	// store the number of no-solutions for the maze based on the first probability test
		
		// -------------------------------------------------------- for the 60 x 60 maze with probability (0.8, 0.2)
		counter = 0;
		for(int index = 0; index < 10; index++){
			input = "northSouth3.txt";
			input2 = "eastWest3.txt";
			
			PrintWriter northSouthWriter = new PrintWriter(input);
			PrintWriter eastWestWriter = new PrintWriter(input2);
			
			rowSize = 60;
			colSize = 60;
			
			northSouthWriter.println(rowSize + " " + colSize);
			
			// for the north-south file
			for(int i = 0; i < rowSize; i++){
				for(int j = 0; j < colSize; j++){
					if(i < rowSize-1){
						p = Math.random();
						value = "";
						if(p <= .8){
							value = "T";
						}
						else{
							value = "F";
						}
						northSouthWriter.print(value + " ");
					}
					else{
						northSouthWriter.print("F ");
					}
				}
				northSouthWriter.println();
			}
			
			northSouthWriter.close();
			
			// for the east-west file
			for(int i = 0; i < rowSize; i++){
				for(int j = 0; j < colSize; j++){
					if(j < colSize-1){
						p = Math.random();
						value = "";
						if(p <= .8){
							value = "T";
						}
						else{
							value = "F";
						}
						eastWestWriter.print(value + " ");
					}
					else{
						eastWestWriter.print("F");
					}
				}
				eastWestWriter.println();
			}
			
			eastWestWriter.close();
			
			// ----------
			
			nsFile = "northSouth3.txt";
			ewFile = "eastWest3.txt";
			readMaze(nsFile, ewFile);	
			System.out.println("\n----------------------- New Maze\n");
		}
		
		probability2 = getNumberOfNoSolutions();	// store the number of no-solutions for the maze based on the second probability test
		
		// -------------------------------------------------------- for the 60 x 60 maze with probability (0.7, 0.3)
		counter = 0;
		for(int index = 0; index < 10; index++){
			input = "northSouth3.txt";
			input2 = "eastWest3.txt";
			
			PrintWriter northSouthWriter = new PrintWriter(input);
			PrintWriter eastWestWriter = new PrintWriter(input2);
			
			rowSize = 60;
			colSize = 60;
			
			northSouthWriter.println(rowSize + " " + colSize);
			
			// for the north-south file
			for(int i = 0; i < rowSize; i++){
				for(int j = 0; j < colSize; j++){
					if(i < rowSize-1){
						p = Math.random();
						value = "";
						if(p <= .7){
							value = "T";
						}
						else{
							value = "F";
						}
						northSouthWriter.print(value + " ");
					}
					else{
						northSouthWriter.print("F ");
					}
				}
				northSouthWriter.println();
			}
			
			northSouthWriter.close();
			
			// for the east-west file
			for(int i = 0; i < rowSize; i++){
				for(int j = 0; j < colSize; j++){
					if(j < colSize-1){
						p = Math.random();
						value = "";
						if(p <= .7){
							value = "T";
						}
						else{
							value = "F";
						}
						eastWestWriter.print(value + " ");
					}
					else{
						eastWestWriter.print("F");
					}
				}
				eastWestWriter.println();
			}
			
			eastWestWriter.close();
			
			// ----------
			
			nsFile = "northSouth3.txt";
			ewFile = "eastWest3.txt";
			readMaze(nsFile, ewFile);	
			System.out.println("\n----------------------- New Maze\n");
		}
		
		probability3 = getNumberOfNoSolutions();	// store the number of no-solutions for the maze based on the third probability test
		
		// -------------------------------------------------------- for the 60 x 60 maze with probability (0.6, 0.4)
		counter = 0;
		for(int index = 0; index < 10; index++){
			input = "northSouth3.txt";
			input2 = "eastWest3.txt";
			
			PrintWriter northSouthWriter = new PrintWriter(input);
			PrintWriter eastWestWriter = new PrintWriter(input2);
			
			rowSize = 60;
			colSize = 60;
			
			northSouthWriter.println(rowSize + " " + colSize);
			
			// for the north-south file
			for(int i = 0; i < rowSize; i++){
				for(int j = 0; j < colSize; j++){
					if(i < rowSize-1){
						p = Math.random();
						value = "";
						if(p <= .6){
							value = "T";
						}
						else{
							value = "F";
						}
						northSouthWriter.print(value + " ");
					}
					else{
						northSouthWriter.print("F ");
					}
				}
				northSouthWriter.println();
			}
			
			northSouthWriter.close();
			
			// for the east-west file
			for(int i = 0; i < rowSize; i++){
				for(int j = 0; j < colSize; j++){
					if(j < colSize-1){
						p = Math.random();
						value = "";
						if(p <= .6){
							value = "T";
						}
						else{
							value = "F";
						}
						eastWestWriter.print(value + " ");
					}
					else{
						eastWestWriter.print("F");
					}
				}
				eastWestWriter.println();
			}
			
			eastWestWriter.close();
			
			// ----------
			
			nsFile = "northSouth3.txt";
			ewFile = "eastWest3.txt";
			readMaze(nsFile, ewFile);	
			System.out.println("\n----------------------- New Maze\n");
		}
		
		probability4 = getNumberOfNoSolutions();	// store the number of no-solutions for the maze based on the fourth probability test
		
		// -------------------------------------------------------- for the 60 x 60 maze with probability (0.5, 0.5)
		counter = 0;
		for(int index = 0; index < 10; index++){
			input = "northSouth3.txt";
			input2 = "eastWest3.txt";
			
			PrintWriter northSouthWriter = new PrintWriter(input);
			PrintWriter eastWestWriter = new PrintWriter(input2);
			
			rowSize = 60;
			colSize = 60;
			
			northSouthWriter.println(rowSize + " " + colSize);
			
			// for the north-south file
			for(int i = 0; i < rowSize; i++){
				for(int j = 0; j < colSize; j++){
					if(i < rowSize-1){
						p = Math.random();
						value = "";
						if(p <= .5){
							value = "T";
						}
						else{
							value = "F";
						}
						northSouthWriter.print(value + " ");
					}
					else{
						northSouthWriter.print("F ");
					}
				}
				northSouthWriter.println();
			}
			
			northSouthWriter.close();
			
			// for the east-west file
			for(int i = 0; i < rowSize; i++){
				for(int j = 0; j < colSize; j++){
					if(j < colSize-1){
						p = Math.random();
						value = "";
						if(p <= .5){
							value = "T";
						}
						else{
							value = "F";
						}
						eastWestWriter.print(value + " ");
					}
					else{
						eastWestWriter.print("F");
					}
				}
				eastWestWriter.println();
			}
			
			eastWestWriter.close();
			
			// ----------
			
			nsFile = "northSouth3.txt";
			ewFile = "eastWest3.txt";
			readMaze(nsFile, ewFile);	
			System.out.println("\n----------------------- New Maze\n");
		}
		
		probability5 = getNumberOfNoSolutions();	// store the number of no-solutions for the maze based on the fifth probability test
		
		// -------------------------------------------------------- for the 60 x 60 maze with probability (0.4, 0.6)
		counter = 0;
		for(int index = 0; index < 10; index++){
			input = "northSouth3.txt";
			input2 = "eastWest3.txt";
			
			PrintWriter northSouthWriter = new PrintWriter(input);
			PrintWriter eastWestWriter = new PrintWriter(input2);
			
			rowSize = 60;
			colSize = 60;
			
			northSouthWriter.println(rowSize + " " + colSize);
			
			// for the north-south file
			for(int i = 0; i < rowSize; i++){
				for(int j = 0; j < colSize; j++){
					if(i < rowSize-1){
						p = Math.random();
						value = "";
						if(p <= .4){
							value = "T";
						}
						else{
							value = "F";
						}
						northSouthWriter.print(value + " ");
					}
					else{
						northSouthWriter.print("F ");
					}
				}
				northSouthWriter.println();
			}
			
			northSouthWriter.close();
			
			// for the east-west file
			for(int i = 0; i < rowSize; i++){
				for(int j = 0; j < colSize; j++){
					if(j < colSize-1){
						p = Math.random();
						value = "";
						if(p <= .4){
							value = "T";
						}
						else{
							value = "F";
						}
						eastWestWriter.print(value + " ");
					}
					else{
						eastWestWriter.print("F");
					}
				}
				eastWestWriter.println();
			}
			
			eastWestWriter.close();
			
			// ----------
			
			nsFile = "northSouth3.txt";
			ewFile = "eastWest3.txt";
			readMaze(nsFile, ewFile);	
			System.out.println("\n----------------------- New Maze\n");
		}
		
		probability6 = getNumberOfNoSolutions();	// store the number of no-solutions for the maze based on the sixth probability test
		
		// -------------------------------------------------------- for the 60 x 60 maze with probability (0.3, 0.7)
		counter = 0;
		for(int index = 0; index < 10; index++){
			input = "northSouth3.txt";
			input2 = "eastWest3.txt";
			
			PrintWriter northSouthWriter = new PrintWriter(input);
			PrintWriter eastWestWriter = new PrintWriter(input2);
			
			rowSize = 60;
			colSize = 60;
			
			northSouthWriter.println(rowSize + " " + colSize);
			
			// for the north-south file
			for(int i = 0; i < rowSize; i++){
				for(int j = 0; j < colSize; j++){
					if(i < rowSize-1){
						p = Math.random();
						value = "";
						if(p <= .3){
							value = "T";
						}
						else{
							value = "F";
						}
						northSouthWriter.print(value + " ");
					}
					else{
						northSouthWriter.print("F ");
					}
				}
				northSouthWriter.println();
			}
			
			northSouthWriter.close();
			
			// for the east-west file
			for(int i = 0; i < rowSize; i++){
				for(int j = 0; j < colSize; j++){
					if(j < colSize-1){
						p = Math.random();
						value = "";
						if(p <= .3){
							value = "T";
						}
						else{
							value = "F";
						}
						eastWestWriter.print(value + " ");
					}
					else{
						eastWestWriter.print("F");
					}
				}
				eastWestWriter.println();
			}
			
			eastWestWriter.close();
			
			// ----------
			
			nsFile = "northSouth3.txt";
			ewFile = "eastWest3.txt";
			readMaze(nsFile, ewFile);	
			System.out.println("\n----------------------- New Maze\n");
		}
		
		probability7 = getNumberOfNoSolutions();	// store the number of no-solutions for the maze based on the seventh probability test
		
		// -------------------------------------------------------- for the 60 x 60 maze with probability (0.2, 0.8)
		counter = 0;
		for(int index = 0; index < 10; index++){
			input = "northSouth3.txt";
			input2 = "eastWest3.txt";
			
			PrintWriter northSouthWriter = new PrintWriter(input);
			PrintWriter eastWestWriter = new PrintWriter(input2);
			
			rowSize = 60;
			colSize = 60;
			
			northSouthWriter.println(rowSize + " " + colSize);
			
			// for the north-south file
			for(int i = 0; i < rowSize; i++){
				for(int j = 0; j < colSize; j++){
					if(i < rowSize-1){
						p = Math.random();
						value = "";
						if(p <= .2){
							value = "T";
						}
						else{
							value = "F";
						}
						northSouthWriter.print(value + " ");
					}
					else{
						northSouthWriter.print("F ");
					}
				}
				northSouthWriter.println();
			}
			
			northSouthWriter.close();
			
			// for the east-west file
			for(int i = 0; i < rowSize; i++){
				for(int j = 0; j < colSize; j++){
					if(j < colSize-1){
						p = Math.random();
						value = "";
						if(p <= .2){
							value = "T";
						}
						else{
							value = "F";
						}
						eastWestWriter.print(value + " ");
					}
					else{
						eastWestWriter.print("F");
					}
				}
				eastWestWriter.println();
			}
			
			eastWestWriter.close();
			
			// ----------
			
			nsFile = "northSouth3.txt";
			ewFile = "eastWest3.txt";
			readMaze(nsFile, ewFile);	
			System.out.println("\n----------------------- New Maze\n");
		}
		
		probability8 = getNumberOfNoSolutions();	// store the number of no-solutions for the maze based on the eighth probability test
		
		// -------------------------------------------------------- for the 60 x 60 maze with probability (0.1, 0.9)
		counter = 0;
		for(int index = 0; index < 10; index++){
			input = "northSouth3.txt";
			input2 = "eastWest3.txt";
			
			PrintWriter northSouthWriter = new PrintWriter(input);
			PrintWriter eastWestWriter = new PrintWriter(input2);
			
			rowSize = 60;
			colSize = 60;
			
			northSouthWriter.println(rowSize + " " + colSize);
			
			// for the north-south file
			for(int i = 0; i < rowSize; i++){
				for(int j = 0; j < colSize; j++){
					if(i < rowSize-1){
						p = Math.random();
						value = "";
						if(p <= .1){
							value = "T";
						}
						else{
							value = "F";
						}
						northSouthWriter.print(value + " ");
					}
					else{
						northSouthWriter.print("F ");
					}
				}
				northSouthWriter.println();
			}
			
			northSouthWriter.close();
			
			// for the east-west file
			for(int i = 0; i < rowSize; i++){
				for(int j = 0; j < colSize; j++){
					if(j < colSize-1){
						p = Math.random();
						value = "";
						if(p <= .1){
							value = "T";
						}
						else{
							value = "F";
						}
						eastWestWriter.print(value + " ");
					}
					else{
						eastWestWriter.print("F");
					}
				}
				eastWestWriter.println();
			}
			
			eastWestWriter.close();
			
			// ----------
			
			nsFile = "northSouth3.txt";
			ewFile = "eastWest3.txt";
			readMaze(nsFile, ewFile);	
			System.out.println("\n----------------------- \n");
		}
		
		probability9 = getNumberOfNoSolutions();	// store the number of no-solutions for the maze based on the ninth probability test
		
		// ------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		
		System.out.println("Test Results for the 60 x 60 Mazes:\n");
		System.out.println("The probability of (0.9, 0.1) resulted in " + probability1 + " no solution mazes.");
		System.out.println("The probability of (0.8, 0.2) resulted in " + probability2 + " no solution mazes.");
		System.out.println("The probability of (0.7, 0.3) resulted in " + probability3 + " no solution mazes.");
		System.out.println("The probability of (0.6, 0.4) resulted in " + probability4 + " no solution mazes.");
		System.out.println("The probability of (0.5, 0.5) resulted in " + probability5 + " no solution mazes.");
		System.out.println("The probability of (0.4, 0.6) resulted in " + probability6 + " no solution mazes.");
		System.out.println("The probability of (0.3, 0.7) resulted in " + probability7 + " no solution mazes.");
		System.out.println("The probability of (0.2, 0.8) resulted in " + probability8 + " no solution mazes.");
		System.out.println("The probability of (0.1, 0.9) resulted in " + probability9 + " no solution mazes.");
		
		// ------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	}
	
	/**
	 * Given the two files, read the maze and search for a path if there is one
	 * @param file1 - The north-south file
	 * @param file2 - The east-west file
	 * @throws IOException
	 */
	public static void readMaze(String file1, String file2) throws IOException{
		Maze maze;
		
		int row = 0,
			column = 0;
		
		//String input;	// for getting the names of the files
		
		// get the north-south file
		File nsFile = new File(file1);
		
		// get the east-west file
		File ewFile = new File(file2);
		
		Scanner nsScanner = new Scanner(nsFile);
		Scanner ewScanner = new Scanner(ewFile);
		
		row = nsScanner.nextInt();
		column = nsScanner.nextInt();
		
		// create a new maze object
		maze = new Maze(row, column);
		
		// instantiate the cells
		for(int i = 0; i < row; i++){
			for(int j = 0; j < column; j++){
				maze.getCells()[i][j] = new Cell();
			}
		}
		
		// ----------------
		
		// configure maze
		for(int i = 0; i < row; i++){
			for(int j = 0; j < column; j++){
				if(nsScanner.next().equalsIgnoreCase("T")){
					maze.getCells()[i][j].setSouth(true);
					maze.getCells()[i+1][j].setNorth(true);
				}
				if(ewScanner.next().equalsIgnoreCase("T")){
					maze.getCells()[i][j].setEast(true);
					maze.getCells()[i][j+1].setWest(true);
				}
			}
		}
		
		// ----------------------------
		System.out.println("This maze has dimensions:\nRows: " + row + "\tColumns: " + column);
		Location finish = new Location(row - 1, column - 1);	// create the finish location
		maze.setFinish(finish);		// set the finish location
		maze.findPath();			// search for a path
		maze.displayPathLocations();	// display the path if there is one
		
		// close the scanners
		nsScanner.close();
		ewScanner.close();	
		
		if(!maze.getPathFound()){
			counter++;
		}
	}
	
	/**
	 * Convenience method to return the number of non solution mazes
	 * @return - The number of mazes with no solutions
	 */
	public static int getNumberOfNoSolutions(){
		return counter;
	}
}

/*
 * 			
  					  - Report -
  			
  			Test Results for the 6 x 6 Mazes:
   Number of non-solution mazes with the probability of (0.9, 0.1) - 2
   Number of non-solution mazes with the probability of (0.8, 0.2) - 5
   Number of non-solution mazes with the probability of (0.7, 0.3) - 2 
   Number of non-solution mazes with the probability of (0.6, 0.4) - 7 
   Number of non-solution mazes with the probability of (0.5, 0.5) - 9
   Number of non-solution mazes with the probability of (0.4, 0.6) - 10
   Number of non-solution mazes with the probability of (0.3, 0.7) - 10 
   Number of non-solution mazes with the probability of (0.2, 0.8) - 10
   Number of non-solution mazes with the probability of (0.1, 0.9) - 10
   
     		Test Results for the 60 x 60 Mazes:
   Number of non-solution mazes with the probability of (0.9, 0.1) - 0 
   Number of non-solution mazes with the probability of (0.8, 0.2) - 4
   Number of non-solution mazes with the probability of (0.7, 0.3) - 7
   Number of non-solution mazes with the probability of (0.6, 0.4) - 7 
   Number of non-solution mazes with the probability of (0.5, 0.5) - 10
   Number of non-solution mazes with the probability of (0.4, 0.6) - 10
   Number of non-solution mazes with the probability of (0.3, 0.7) - 10 
   Number of non-solution mazes with the probability of (0.2, 0.8) - 10
   Number of non-solution mazes with the probability of (0.1, 0.9) - 10
 */
