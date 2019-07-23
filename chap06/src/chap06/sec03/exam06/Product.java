package chap06.sec03.exam06;

public class Product {
	int pNum;
	String pName; 
	int stock;
	int cost;
	String company; 
	
	Product() {
		
	}
	
	Product(int pNum, String pName, int stock, int cost) {
		this (pNum, pName, stock, cost, null);
	}
	
	Product(int pNum, String pName, int stock, int cost, String company) {
		this.pNum = pNum; 
		this.pName = pName;
		this.stock = stock; 
		this.cost = cost; 
		this.company = company;
	}

	Product(int pNum, char[] pName, int stock, int cost, String company) {
		this(pNum, new String(pName), stock, cost, company);
	}
	
	Product(int pNum, char[] pName, int stock, int cost, char[] company) {
		this(pNum, new String(pName), stock, cost, new String(company));
	}

	
	
}