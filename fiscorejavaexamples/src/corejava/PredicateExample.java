package corejava;

import java.util.function.Predicate;

class User{
	String username;
	String password;
	public User(String username, String password) {
		this.username=username;
		this.password=password;
	}
}
// if username and password are both admin, then return true else return false;
public class PredicateExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Predicate<Integer> p1 = x->x%2==0;
		Predicate<Integer> p4= x->x>=10;
		Predicate<String> p2 = str -> str.length()>=5;
		Predicate<User> p3 = user -> user.username=="admin" && user.password=="admin" ;
		
		User user1 = new User("admin","admin");
		User user2 = new User("admin","1234");
		
		System.out.println(p1.test(54));  // true
		System.out.println(p1.test(5));   // false
		System.out.println(p2.test("Hello World"));  // true
		System.out.println(p2.test("Sai"));  //false
		
		if(p3.test(user2))
			System.out.println("Authorized user");
		else
			System.out.println("UnAuthorized User");
		
		System.out.println(p1.and(p4).test(4));
		System.out.println(p1.or(p4).test(4));
		System.out.println(p1.negate().test(5));

	}
	
}
