package day8;

import java.util.Scanner;

//1 ....
//2 ..
//3...
public class Switchexample 
{
 void add() {System.out.println("add employee");}
 
 void display() {System.out.println("display employee");}
 
 void update() {System.out.println("update employee");}
	
	
	public static void main(String[] args) {

		System.out.println(" 1  add employee");
		System.out.println(" 2  display employee");
		System.out.println(" 3  update employee");
		System.out.println(" 4  exit");
		System.out.println(" enter your choice");
		Scanner s= new Scanner(System.in);
		int choice=s.nextInt();
		//int/char/string 
		//==
		//replacement of if else
		Switchexample e= new Switchexample();
		switch(choice)
		{
		case 1:    e.add();
		         break;//terminate switch
		case 2: e.display();
		         break;
		case 3:
		case 4:
		case 5:
		case 6: 
			   e.update();
		       break;
		default: System.out.println("wrong choice");
        break;	
		
		}
		}
		
	}


