package practice.learnning;

public class BankMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank bk = new Bank();
		bk.setAccNo(778478222);
        bk.setName("Danny");
        bk.setAmount(50000f);
        System.out.println("Account No:" + bk.getAccNo()+" "+"Account Name:"
                + bk.getName()+" \n"+" \n "
                + "Amount in Account:" + bk.getAmount());  
	}
	
}
