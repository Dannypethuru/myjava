package practice.learnning;

public class Bank {
	private long AccNo;
	private String Name;
	private float Amount;
	public long getAccNo()
	{
		return AccNo;
	}
	public void setAccNo( long Acc_no) {
		this.AccNo=Acc_no;
	}
public String getName()
{
	return Name;
}
public void setName(String name)
{
	this.Name=name;
}
public float getAmount() {
	return Amount;
}
public void setAmount(float amount)
{
	this.Amount=amount;
}
}
