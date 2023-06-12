public class watertank
{
public static void main(String[] args)
{
watertank wt=new watertank();
wt.find_values(16,27);
}
private void find_values(int a,int b)
{
a=a+b;
System.out.println("Enter the value of a is" + a);
b=a-b;
System.out.println("Enter the value of b is" + b);
a=a-b;
System.out.println("Enter the value of a is" + a);
}
}

