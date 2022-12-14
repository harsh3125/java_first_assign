class Bound<T extends A>
{
	
	private T objRef;
	
	public Bound(T obj){
		this.objRef = obj;
	}
	
	public void doRunTest(){
		this.objRef.displayClass();
	}
}

class A
{
	public void displayClass()
	{
		System.out.println("Welcome to super class A");
	}
}

class B extends A
{
	public void displayClass()
	{
		System.out.println("welcome to sub class B");
	}
}

class C extends A
{
	public void displayClass()
	{
		System.out.println("welcome to sub class C");
	}
}

public class bounded
{
	public static void main(String a[])
	{
		Bound<C> bec = new Bound<C>(new C());
		bec.doRunTest();
		Bound<B> beb = new Bound<B>(new B());
		beb.doRunTest();
		Bound<A> bea = new Bound<A>(new A());
		bea.doRunTest();
		
	}
}
