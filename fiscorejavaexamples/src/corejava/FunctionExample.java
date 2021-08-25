package corejava;

import java.util.function.Function;

public class FunctionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Function<Integer,Integer> f1 = x->x*x;
		Function<String,Integer> f2 = str->{
			int count=0;
			for(int i=0;i<str.length();i++) {
				if(  str.charAt(i)=='a' || str.charAt(i)=='e'|| str.charAt(i)=='i' || str.charAt(i)=='o' ||str.charAt(i)=='u' )
					count++;
			}
			return count++;
		};
		
		System.out.println(f1.apply(4));
		System.out.println("The total vowels in hello programming is :"+f2.apply("hello programming"));

	}

}
