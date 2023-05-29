
public class Puzzels 
{

	public static void main(String[] args) 
{
		Puzzels puzzelsobj= new Puzzels();
		puzzelsobj.dPlan();
		

	}

	private void dPlan() 
{
		// TODO Auto-generated method stub
int day=1;
int pm=5;
int savings=0;
while (day<=10) {
	savings= savings + pm;
	day=day+1;
	}
   
 System.out.println("savings is "+savings);
 }	
}
	
	
