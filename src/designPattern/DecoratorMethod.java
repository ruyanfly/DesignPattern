package designPattern;

interface DecoratorSourceable{
	public void method();
}

class DecoratorSource implements DecoratorSourceable{
	@Override
	public void method() {
		// TODO Auto-generated method stub
		System.out.println("the original method!");
	}
}

class Decorator implements DecoratorSourceable{
	private DecoratorSourceable source;
	public Decorator(DecoratorSourceable source){
		super();
		this.source=source;
	}
	@Override
	public void method() {
		// TODO Auto-generated method stub
		System.out.println("before decorator!");
		source.method();
		System.out.println("after decorator!");
	}
}

public class DecoratorMethod {
	public static void main(String[] args){
		DecoratorSourceable source=new DecoratorSource();
		DecoratorSourceable obj=new Decorator(source);
		obj.method();
	}
}
