package watingListWithLinkedQueue;

public class Customer {
	String name;
	int age;
	String movieChoice;
	
	public Customer(String name, int age, String movieChoice) {
		this.name = name;
		this.age = age;
		this.movieChoice = movieChoice;
	}
	
	public String toString() {
		return "<" + "이름 : " + name + 
				", 나이 : " + age + ", 구매 영화 티켓 : " + movieChoice + ">";
	}
}
