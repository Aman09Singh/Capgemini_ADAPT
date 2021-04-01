import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;
import java.util.TreeSet;

class SavingAccount {

    private double acc_balance;
    private int acc_ID;
    private String accountHolderName;
    private boolean isSalaryAccount;
    public SavingAccount() {
    	
    }
	public SavingAccount(double acc_balance, int acc_ID, String accountHolderName, boolean isSalaryAccount) {
		super();
		this.acc_balance = acc_balance;
		this.acc_ID = acc_ID;
		this.accountHolderName = accountHolderName;
		this.isSalaryAccount = isSalaryAccount;
	}
	public double getAcc_balance() {
		return acc_balance;
	}
	public void setAcc_balance(double acc_balance) {
		this.acc_balance = acc_balance;
	}
	public int getAcc_ID() {
		return acc_ID;
	}
	public void setAcc_ID(int acc_ID) {
		this.acc_ID = acc_ID;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public boolean isSalaryAccount() {
		return isSalaryAccount;
	}
	public void setSalaryAccount(boolean isSalaryAccount) {
		this.isSalaryAccount = isSalaryAccount;
	}
    public void withdraw(int amount) {
    	if(this.acc_balance>=amount) {
    		this.acc_balance -= amount;
    	}
    }
    public void deposit(int amount) {
    	this.acc_balance += amount;
    }
}
class compareAID implements Comparator<SavingAccount>{

	@Override
	public int compare(SavingAccount s1, SavingAccount s2) {
		// TODO Auto-generated method stub
		if(s2.getAcc_ID()>s1.getAcc_ID()) {
			return 1;
		}else
			return -1;}}

class BankAccountList{

    private TreeSet<SavingAccount> savingAccounts = new TreeSet<>(new compareAID());

    public boolean addSavingAccount(SavingAccount savingAccount) {
    	savingAccounts.add(savingAccount);
    	return true;
    }

    public List<Integer> displaySavingAccountIds() {
    	List<Integer> ids = new ArrayList<>();
    	for(SavingAccount s : savingAccounts) {
    		ids.add(s.getAcc_ID());
    	}
    	//List is changing the actual order as it follows insertion order, so reversing the results and sending back
    	List<Integer> idz = new ArrayList<>();
    	ListIterator<Integer> lit = ids.listIterator(ids.size());
    	while(lit.hasPrevious()) {
    		idz.add(lit.previous());
    	}
    	return idz;
    }

	
}

public class Assignment3Q9 {
    public static void main(String[] args) {
    	
    	SavingAccount ac1 = new SavingAccount(1000,12,"Kesav",true);
    	SavingAccount ac2 = new SavingAccount(1000,13,"kino",true);
    	SavingAccount ac3 = new SavingAccount(1000,8,"wake",true);
    	SavingAccount ac4 = new SavingAccount(1300,10,"wesly",true);
    	SavingAccount ac5 = new SavingAccount(1600,30,"paul",true);
    	SavingAccount ac6 = new SavingAccount(1000,20,"beta",true);
    	SavingAccount ac7 = new SavingAccount(1000,11,"arnav",true);
    	SavingAccount ac8 = new SavingAccount(1000,50,"abhi",true);
    	BankAccountList li = new BankAccountList();
    	li.addSavingAccount(ac1);
    	li.addSavingAccount(ac2);
    	li.addSavingAccount(ac3);
    	li.addSavingAccount(ac4);
    	li.addSavingAccount(ac5);
    	li.addSavingAccount(ac6);
    	li.addSavingAccount(ac7);
    	li.addSavingAccount(ac8);
    	List<Integer> list = li.displaySavingAccountIds();
    	for(Integer i: list) {
    		System.out.println(i);
    	}
    	
    }
}