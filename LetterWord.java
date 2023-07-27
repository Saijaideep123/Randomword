package com.techlabs.array;

import java.util.Scanner;

public class LetterWord {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the random word");
		String a=sc.nextLine();
		int stringlength=a.length();
		String restr=new String(new char[a.length()]).replace('\0', '-');
		System.out.println("initial String"+restr);
		while(restr.contains("-")) {
			System.out.println("enter the character");
			char ch=sc.nextLine().charAt(0);
			boolean status=false;
		for(int i=0;i<stringlength;i++)
		{
			if(a.charAt(i)==ch)
			{
				if(restr.charAt(i)=='-')
				{
					restr=restr.substring(0,i)+ch+restr.substring(i+1);
					status=true;
					break;
				}
				
			}
	
		}
		if(!status)
		{
			System.out.println("Char"+ch+"doesnot match the string");
		}
		System.out.println("restr:"+restr);
		}
		System.out.println("Final string:"+restr);
		
	         
		}
		}
	
	


