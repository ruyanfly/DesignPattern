package designPattern;

/**
 * normal factory method
 * @author yanru02
 *
 */
/*
 * begin
 */
interface Sender{
	public void Send();
}

class MailSender implements Sender{
	@Override
	public void Send() {
		// TODO Auto-generated method stub
		System.out.println("this is mailsender!");
	}
}

class SmsSender implements Sender{
	@Override
	public void Send() {
		// TODO Auto-generated method stub
		System.out.println("this is sms sender!");
	}
}

class SendFactory{
	public Sender produce(String type){
		if("mail".equals(type)){
			return new MailSender();
		}else if("sms".equals(type)){
			return new SmsSender();
		}else{
			System.out.println("please input the right type");
			return null;
		}
	}
	/**
	 * multi-factory method
	 * @author yanru02
	 *
	 */
	/*
	 * begin
	 */
	Sender produceMail(){
		return new MailSender();
	}
	Sender produceSms(){
		return new SmsSender();
	}
	/*
	 * end
	 */
	/**
	 * static-factory method
	 * @author yanru02
	 *
	 */
	/*
	 * begin
	 */
	static Sender produceStaticMail(){
		return new MailSender();
	}
	static Sender produceStaticSms(){
		return new SmsSender();
	}
	/*
	 * end
	 */
}
/*
 * end
 */

public class FactoryMethod {
	void multifactory(){
		SendFactory factory=new SendFactory();
		Sender sender=factory.produceMail();
		sender.Send();
	}
	void staticfactory(){
		Sender sender=SendFactory.produceStaticMail();
		sender.Send();
	}
	public static void main(String[] args){
		SendFactory factory=new SendFactory();
		Sender sender=factory.produce("sms");
		sender.Send();
	}
}
