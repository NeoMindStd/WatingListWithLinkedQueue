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
		return "<" + "�̸� : " + name + 
				", ���� : " + age + ", ���� ��ȭ Ƽ�� : " + movieChoice + ">";
	}
}
