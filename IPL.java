

public class IPL {
 

	public static void main(String[] args) {
	
IPL ipl = new IPL();
int mi =200, gt =190;
 
ipl.play_qualifier(mi, gt);
ipl.play_qualifier2(mi, gt);
	}
	 void play_qualifier2(int mi,int gt)
 {
		if(mi>gt) 
		{
			int csk =210;
			mi= 205;
			if (csk>mi)
			{
			System.out.println("dhoni gets trophy");
			
			
		}
			else {
				System.out.println("rohit gets trophy");
			}
		}
		
		else
		{
		  int csk = 180; 
		   gt = 165; 
		   if(csk>gt)
		   {
		     System.out.println("Dhoni gets Trophy");
		   }
		   else
		   {
		     System.out.println("Pandya gets trophy");
		 
		   }

		} 
		}
	
  void play_qualifier(int team1,int team2) 
{
	
	if(team1>team2)
	{
		System.out.println("MI Enters finals");
		
	}
	else
	{
		System.out.println("GT Enters finals");
	}
} 
}
