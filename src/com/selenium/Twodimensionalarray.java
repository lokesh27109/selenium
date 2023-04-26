package com.selenium;

public class Twodimensionalarray {
	
	public static void main(String[] args) {
		
		String name[] [] = new String[5] [2];
		name[0][0] = "loki";
		name[0][1] = "loki@gmail.com";
		name[1][0] = "raj";
		name[1][1] = "raj@gmail";
		name[2][0] = "mahesh";
		name[2][1] ="mahesh@gmail.com";
		name[3][0] = "arun";
		name[3][1] = "arun@gmail";
		name[4][0] = "john";
		name[4][1] = "john@gmail";
		
		for(int i =0;i<name.length;i++) {
			for(int j= 0;j<name[i].length;j++) {
				System.out.println(name[i][j]);
			}
		}
			
		
		
		
		
	}
	
	
	
	
	
	
	

}
