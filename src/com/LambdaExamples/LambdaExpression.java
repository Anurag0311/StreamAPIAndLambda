package com.LambdaExamples;

interface FuncInterface{
	
	int substract(int i1, int i2);
	
}


public class LambdaExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FuncInterface funcIterface = (i1, i2)->{
			if(i2 < i1 ) {
				throw new RuntimeException("message");
			}
			else {
			return i2 - i1;
			}
		};
		
		System.out.print(funcIterface.substract(8, 20));
	}

}
