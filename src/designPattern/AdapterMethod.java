package designPattern;

class Source{
	public void method1(){
		System.out.println("this is original method!");
	}
}

interface Targetable{
	public void method1();
	public void method2();
}

class Adapter extends Source implements Targetable{
	@Override
	public void method2() {
		// TODO Auto-generated method stub
		System.out.println("this is targetable method!");
	}
}

class Wrapper implements Targetable{
	private Source source;
	public Wrapper(Source source){
		super();
		this.source=source;
	}
	@Override
	public void method1() {
		// TODO Auto-generated method stub
		source.method1();
	}
	@Override
	public void method2() {
		// TODO Auto-generated method stub
		System.out.println("this is original method!");
	}
}

interface Sourceable{
	public void method1();
	public void method2();
}

abstract class Wrapper2 implements Sourceable{
	public void method1(){
		
	}
	public void method2(){
		
	}
}

class SourceSub1 extends Wrapper2{
	public void method1(){
		System.out.println("the sourceable interface's first Sub1!");
	}
}

class SourceSub2 extends Wrapper2{
	public void method2(){
		System.out.println("the sourceable interface's second Sub2!");
	}
}

public class AdapterMethod {
	public static void main(String[] args){
		Targetable target=new Adapter();
		target.method1();
		target.method2();
		
		Source source=new Source();
		Targetable target1=new Wrapper(source);
		target1.method1();
		target1.method2();
		
		Sourceable source1=new SourceSub1();
		Sourceable source2=new SourceSub2();
		source1.method1();
		source1.method2();
		source2.method1();
		source2.method2();
		
	}
}
