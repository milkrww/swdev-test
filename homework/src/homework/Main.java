package homework;
import java.util.ArrayList;
public class Main {
	public static void main(String[] args) {
		
		 ArrayList<BankAccount> BA = new ArrayList<BankAccount>();
		 BA.add(new BankAccount(11,"Lisa"));
		 BA.add(new BankAccount(22,"Jisoo"));
		 BA.add(new BankAccount(33,"Rose"));
		 BA.add(new BankAccount(44,"Jennie"));
		 BA.add(new BankAccount(55,"BLINK"));
		 
		 BA.get(0).deposit(500);
		 BA.get(0).deposit(1000);
		 BA.get(0).withdraw(620);
		 BA.get(0).withdraw(280);
		 
		 BA.get(1).deposit(6000);
		 BA.get(1).withdraw(3000);
		 BA.get(1).withdraw(500);
		 BA.get(1).deposit(100);
		 
		 BA.get(2).deposit(3000);
		 BA.get(2).withdraw(1000);
		 BA.get(2).withdraw(1000);
		 BA.get(2).deposit(500);
		 BA.get(2).addInterest(1);
		 
		 BA.get(3).deposit(500);
		 BA.get(3).withdraw(200);
		 BA.get(3).deposit(500);
		 BA.get(3).withdraw(1000);
		 
		 BA.get(4).deposit(1000);
		 BA.get(4).deposit(1000);
		 BA.get(4).deposit(1000);
		 BA.get(4).deposit(2000);
		 BA.get(4).addInterest(1);
		 
		double n = BA.get(0).getBalance(); 
		 
		 for (int i = 0; i < BA.size(); i++) {
			 if(n < BA.get(i).getBalance()) {
		           n = BA.get(i).getBalance();
			 }
		 }	
		 
		 for (int i = 0; i < BA.size(); i++) {
			 if(n==BA.get(i).getBalance()) {
				 System.out.printf("The person with highest account balance is %s ($%.2f)\n",BA.get(i).customerName,n);
			 }
		 }
		 
		 for (int i = 0; i < BA.size(); i++) {
			 if(n > BA.get(i).getBalance()) {
		           n = BA.get(i).getBalance();
			 }
		 }
		 
		 for (int i = 0; i < BA.size(); i++) {
			 if(n==BA.get(i).getBalance()) {
				 System.out.printf("The person with lowest account balance is %s ($%.2f)\n",BA.get(i).customerName,n);
			 }
		 }
		 
		 String Deposit = "D",Withdraw = "W";
		 int[] Dtimes,Wtimes;
		 Dtimes = new int[10];
		 Wtimes = new int[10];
	        for (int j = 0; j < BA.size();j++) {
	        	for (int i = 0; i < BA.get(j).getTransactions().length(); i++) {
		            if (BA.get(j).getTransactions().substring(i).startsWith(Deposit)) {
		                Dtimes[j] ++;
		                Wtimes[j] --;
		                if(Wtimes[j] == -1) {
		                	Wtimes[j]++;
		                }
		            }
		            else {
		            	Dtimes[j] --;
		            	Wtimes[j] ++;
		            	if(Dtimes[j] == -1) {
		            		Dtimes[j]++;
		            }
		        }
	        }
	        }
         	
	        for (int i = 0; i < BA.size(); i++) {
	        	if(Dtimes[i]>Wtimes[i]) {
	        		System.out.println(BA.get(i).customerName + " : Longest repeating activity : Deposit (" + Dtimes[i] +"times)" );
	        	}
	        	else if(Dtimes[i]<Wtimes[i]) {
	        		System.out.println(BA.get(i).customerName + " : Longest repeating activity : Withdraw (" + Wtimes[i] +"times)" );
	        	}	
	        }
		
	}
}