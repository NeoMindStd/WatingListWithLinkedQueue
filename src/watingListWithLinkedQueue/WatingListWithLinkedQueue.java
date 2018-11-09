package watingListWithLinkedQueue;

import java.util.ArrayList;
import java.util.Random;

public class WatingListWithLinkedQueue {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		DataQueue q = new DataQueue();

		String[] movies = {"�͹̳�����", "���־� ������Ʈ", "��Ʈ����"};
		String[] names = {"ö��", "����", "¯��", "�ͱ�", "����", "�⿵��", "��ö��", "������"};
		Random r = new Random();

		System.out.println("�մ� ��⿭(����;� �ϴ� ��ȭ���) �ʱ�ȭ : ");
		int numCustomer = Math.abs(r.nextInt())%100+1;
		for(int i = 0; i < numCustomer; i++) {
			Customer customer = new Customer(names[Math.abs(r.nextInt())%names.length],
					Math.abs(r.nextInt())%60+10, 
					movies[Math.abs(r.nextInt())%movies.length]);
			if(i % 4 == 0) System.out.println();
			System.out.print((i+1)+". " + customer + ((i<numCustomer-1) ? ", " : ""));
			q.enQueue(customer);
		}
		System.out.println("\n");

		ArrayList<Customer>[] customers = new ArrayList[movies.length];
		for(int i = 0; i < customers.length; i++)
			customers[i] = new ArrayList<>();
		
		while(!q.isEmpty()) {
			Customer customer = q.deQueue();
			for(int i = 0; i < movies.length; i++) 
				if(customer.movieChoice.equals(movies[i])) 
					customers[i].add(customers[i].size(), customer);
		}
		
		for(int i = 0; i < movies.length; i++) 
			System.out.println("��ȭ <" + movies[i] + ">��"
					+ "���� �� : " + customers[i].size());
		System.out.println();
		
		for(int i = 0; i < movies.length; i++) {
			System.out.print("��ȭ <" + movies[i] + "> : \n");
			for(int j = 0; j < customers[i].size(); j++) {
				System.out.print(customers[i].get(j).toString() + ((j<customers[i].size()-1) ? ", " : ""));
				if((j+1) % 3 == 0)
					System.out.println();
			}
			System.out.println("\n");
		}
	}
}
