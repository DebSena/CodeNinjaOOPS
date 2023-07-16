package Codes;
import java.util.* ;
import java.io.*; 

class Fraction {

	int numerator;
	int denominator;
	
	public Fraction(int numerator,int denominator){
		this.numerator=numerator;
		this.denominator=denominator;
	}
	public void add(Fraction f){
		this.numerator=(this.numerator*f.denominator)+(this.denominator*f.numerator);
		this.denominator=this.denominator*f.denominator;
	}

	public void multiply(Fraction f){
		this.numerator=(this.numerator*f.numerator);
		this.denominator=(this.denominator*f.denominator);
	}

	public int findGCD(int a,int b){
		while(b!=0){
			if(a>b){
				a=a-b;
			}
			else{
				b=b-a;
			}
		}
		return a;
	}

	public void simplify(){
		int gcd=findGCD(this.numerator, this.denominator);
		this.numerator=this.numerator/gcd;
		this.denominator=this.denominator/gcd;
	}

	public void print(){
		System.out.println(this.numerator+"/"+this.denominator);
	}
}

public class solution1 {
    public static void main(String args[]) {

		// Write your code here
		Scanner scanner=new Scanner(System.in);
		int num=scanner.nextInt();
		int den=scanner.nextInt();
		Fraction f1=new Fraction(num,den);
		int n=scanner.nextInt();

		for(int i=0;i<n;i++){
			int choice=scanner.nextInt();
			int a=scanner.nextInt();
			int b=scanner.nextInt();
			Fraction f2=new Fraction(a,b);
			
			switch(choice){
				case 1:
					f1.add(f2);
					f1.simplify();
					f1.print();
					break;
				case 2:
					f1.multiply(f2);
					f1.simplify();
					f1.print();
					break;
			}
		}
	} 
}
