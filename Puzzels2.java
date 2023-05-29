public class Puzzels2 {

	public static void main(String[] args) {
	Puzzels2 puzzelsboj=new Puzzels2();
	puzzelsboj.fPlan();
	}
	private void fPlan() {
		// TODO Auto-generated method stub
int day=1;
int savings=0;
while(day<=10)
{
savings=savings+day;
System.out.println("daily"+savings);
	day=day+1;
	
}
	System.out.println("savings"+savings);
	}
}


