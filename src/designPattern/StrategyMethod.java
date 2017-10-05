package designPattern;

interface ICalculator{
	public int calculate(String exp);
}

abstract class AbstractCalculator {
	public int[] split(String exp,String opt){
		String array[]=exp.split(opt);
		int arrayInt[]=new int[2];
		arrayInt[0]=Integer.parseInt(array[0]);
		arrayInt[1]=Integer.parseInt(array[1]);
		return arrayInt;
	}
}

class StrategyPlus extends AbstractCalculator implements ICalculator{
	@Override
	public int calculate(String exp) {
		// TODO Auto-generated method stub
		int arrayInt[]=split(exp,"\\+");
		return arrayInt[0]+arrayInt[1];
	}
}

class StrategyMinus extends AbstractCalculator implements ICalculator{
	@Override
	public int calculate(String exp) {
		// TODO Auto-generated method stub
		int arrayInt[]=split(exp,"-");
		return arrayInt[0]-arrayInt[1];
	}
}

class StrategyMultiply extends AbstractCalculator implements ICalculator{
	@Override
	public int calculate(String exp) {
		// TODO Auto-generated method stub
		int arrayInt[]=split(exp,"\\*");
		return arrayInt[0]*arrayInt[1];
	}
}

public class StrategyMethod {
	public static void main(String[] args){
		String exp="2+8";
		ICalculator cal=new StrategyPlus();
		int result=cal.calculate(exp);
		System.out.println(result);
	}
}
