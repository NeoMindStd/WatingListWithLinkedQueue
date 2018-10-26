package watingListWithLinkedQueue;

public class WatingListWithLinkedQueue {
	public static void main(String[] args) {
		CDLList list = new CDLList();
		list.addLastNode("1");
		list.getFirstNode().printData();
		list.getFirstNode().nodeR.printData();
		list.getFirstNode().nodeR.nodeR.printData();
		list.getFirstNode().nodeR.nodeR.nodeR.printData();
		list.getFirstNode().nodeL.printData();
		list.getFirstNode().nodeL.nodeL.printData();
		list.getFirstNode().nodeL.nodeL.nodeL.printData();
		System.out.println();
		
		list.addLastNode("2");
		list.getFirstNode().printData();
		list.getFirstNode().nodeR.printData();
		list.getFirstNode().nodeR.nodeR.printData();
		list.getFirstNode().nodeR.nodeR.nodeR.printData();
		list.getFirstNode().nodeL.printData();
		list.getFirstNode().nodeL.nodeL.printData();
		list.getFirstNode().nodeL.nodeL.nodeL.printData();
		System.out.println();
		
		list.addLastNode("3");
		list.getFirstNode().printData();
		list.getFirstNode().nodeR.printData();
		list.getFirstNode().nodeR.nodeR.printData();
		list.getFirstNode().nodeR.nodeR.nodeR.printData();
		list.getFirstNode().nodeL.printData();
		list.getFirstNode().nodeL.nodeL.printData();
		list.getFirstNode().nodeL.nodeL.nodeL.printData();
		System.out.println();
		
		list.addLastNode("4");
		list.getFirstNode().printData();
		list.getFirstNode().nodeR.printData();
		list.getFirstNode().nodeR.nodeR.printData();
		list.getFirstNode().nodeR.nodeR.nodeR.printData();
		list.getFirstNode().nodeL.printData();
		list.getFirstNode().nodeL.nodeL.printData();
		list.getFirstNode().nodeL.nodeL.nodeL.printData();
		System.out.println();
	}
}
