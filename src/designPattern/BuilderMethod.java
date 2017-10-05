package designPattern;

import java.util.ArrayList;
import java.util.List;

class Builder{
	private List<Sender> list=new ArrayList<Sender>();
	public void produceMailSender(int count){
		for(int i=0;i<count;i++){
			list.add(new MailSender());
		}
		System.out.println("this is mail sender!");
	}
	public void produceSmsSender(int count){
		for(int i=0;i<count;i++){
			list.add(new SmsSender());
		}
		System.out.print("this is sms sender!");
	}
}

public class BuilderMethod {
	public static void main(String[] args){
		Builder builder=new Builder();
		builder.produceMailSender(10);
	}
}
