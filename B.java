class B extends A
{
public void display()
{

System.out.println("display child");
super.display();
}
public static void main(String[] args)
{
B b = new B();
b.display();
b.main();

} 
}
