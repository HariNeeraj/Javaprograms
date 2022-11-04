package Programs;

import java.util.Scanner;

public class Programspractice {
	
	
	
	public static void main(String[] args) {
		
		Programspractice test = new Programspractice();
		
		//test.printNumber();
		//test.printString();
		//test.printascii();
		//test.printQuotientandRemainder();
		//test.swappingNumbers(20,35);
		//test.OddorEven();
		//test.countEvenandOdd();
		//test.countAlphabets();
		//test.reverseString();
		//test.countDigits();
		//test.reverseNumber();
		//test.palindromeNumber();
		//test.primeorNot();
		//test.countvowels();
		test.duplicatecharacterscheck();
	}
	
	
	
	
	public void printNumber() {
		
		Scanner reader = new Scanner(System.in);
		System.out.println("Enetr a number");
		int num = reader.nextInt();
		System.out.println("Entered number is "+ num);
	}
	
	public void printString() {
		
		Scanner reader = new Scanner(System.in);
		System.out.println("Enetr a string");
		String str = reader.next();
		System.out.println("Entered String is "+ str);
		String str1 = "Tester";
		if(str.equals(str1)) {
			System.out.println("strings matched");
		}
		if(str.equalsIgnoreCase(str1)) {
			System.out.println("strings matched with ignored case");
		}
		
	}
	
	
	public  void printascii(){
		char c = 'z';
		int ascii = c;//Direct ascii value
		int asciinumber = (int)c; //Converting char into int
		System.out.println(ascii);
		System.out.println(asciinumber);
		}
	
	public void printQuotientandRemainder() {
		
		int dividend=55;
		int divisor = 9;
		
		int quotient = dividend/divisor;
		int reminder = dividend%divisor;
		
		System.out.println("Quotient is "+ quotient+" "+"reminder is "+ reminder);
		
		
	}
	
	public void swappingNumbers(int a,int b) {
		
		int temp;
		
	/*	temp=a;
		a=b;
		b=temp;
		
		System.out.println("a is "+ a+" "+"b is " +b);*/
		
		a=a-b;
		b=a+b;
		a=b-a;
		
		System.out.println("a is "+ a+" "+"b is " +b);
	}
	
	public void OddorEven() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num= sc.nextInt();
		
		if(num%2==0) {
			System.out.println("Given number is Even");
		}
		else {
			System.out.println("Given number is odd");
		}
		
		
	}
	
	public void countEvenandOdd() {
		
		int a[]= {10,32,21,25,32,57};
		int even=0;
		int odd=0;
		
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				even++;
			}else {
				odd++;
			}
		}
		System.out.println("Count of even is "+even+" "
				+"Count of odd is "+odd);
	}
	
	public void countAlphabets() {
		
		String str = "Selected for check";
		int count=0;
		
		for(int i=0;i<str.length();i++) {
			
			count++;
		}
		System.out.println("Count is "+ count);
	}
	
	public void reverseString() {
		
		String str = "Testing the check";
		String expected=" ";
		char ch;
		
		for(int i=0; i<str.length();i++) {
			
			ch =str.charAt(i);
			expected = ch+expected;
		}
		System.out.println(expected);
		
	}
	
	public void countDigits() {
		Scanner sc1= new Scanner(System.in);
		System.out.println("Enter a number");
		
		int num =sc1.nextInt();
		int count=0;
		
		while(num!=0) {
			num =num/10;
			count++;
		}
		System.out.println("Count is "+ count);
	}
	
	public void reverseNumber() {
		
		Scanner sc1= new Scanner(System.in);
		System.out.println("Enter a number");
		
		int num =sc1.nextInt();
		int rev=0;
		
		while(num!=0) {
			int n = num%10;
			rev= rev*10+n;
			num = num/10;
			
			
		}
		System.out.println("reversed number is"+ rev);
		
	}
	
	public void palindromeNumber() {
		
		Scanner sc1= new Scanner(System.in);
		System.out.println("Enter a number");
		
		int num =sc1.nextInt();
		int acnumb=num;
		int rev=0;
		
		while(num!=0) {
			int n = num%10;
			rev= rev*10+n;
			num = num/10;
			
			
		}
		System.out.println(rev);
		System.out.println(num);
		if(acnumb==rev) {
			System.out.println("palindrome number");
		}else
			System.out.println("Not a palindrome number");
		
	}
	
	public void primeorNot() {
		Scanner sc1= new Scanner(System.in);
		System.out.println("Enter a number");
		
		int num =sc1.nextInt();
		int count=0;
		
		if(num>1) {
			for(int i=1;i<=num;i++) {
				if(num%i==0)
					count++;
			}
			if(count==2) {
				System.out.println("prime number");
				}
			
				else 
				System.out.println("Not a prime number");
			
			
			
		}else {
			System.out.println("Not a prime number");
		}
		
		
	}
	
	public void countvowels() {
		
		
		String str="welcome to Google";
		
		int count=0;
		
		for(int i=0;i<str.length();i++) {
			
			
			if (str.charAt(i) == 'a' || str.charAt(i) == 'e'
	                || str.charAt(i) == 'i'
	                || str.charAt(i) == 'o'
	                || str.charAt(i) == 'u') {
				
				System.out.println("Given string contains  "+ str.charAt(i)+ "  at the index of " +i);
				
				 count++;
				
				
			}
		}
		System.out.println(count);
		
		
	}
	
	public void duplicatecharacterscheck() {
		
		String str="welcome to the parkhayath";
		
		 str =str.replaceAll(" ", "");
		System.out.println(str);
		int count=0;
		char letters[]= str.toCharArray();
		
		for(int i=0;i<str.length();i++) {
			for(int j=i+1;j<str.length();j++) {
				if(letters[i]==letters[j]) {
					count++;
					System.out.println("Print the duplicate character   "+ letters[i]);
				}
			}
		}
		System.out.println(count);
	}
	

}
