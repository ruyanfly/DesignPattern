package designPattern;

interface AbstractSender{
	public void Send();
}

class AbstractMailSender implements AbstractSender{
	@Override
	public void Send() {
		// TODO Auto-generated method stub
		System.out.println("this is mailsender!");
	}
}

class AbstractSmsSender implements AbstractSender{
	@Override
	public void Send() {
		// TODO Auto-generated method stub
		System.out.println("this is sms sender!");
	}
}

interface Provider{
	public AbstractSender produce();
}

class SendMailFactory implements Provider{
	@Override
	public AbstractSender produce() {
		// TODO Auto-generated method stub
		return new AbstractMailSender();
	}
}

class SendSmsFactory implements Provider{
	@Override
	public AbstractSender produce() {
		// TODO Auto-generated method stub
		return new AbstractSmsSender();
	}
}

public class AbstractFactoryMethod {
	public static void main(String[] args){
		Provider provider=new SendMailFactory();
		AbstractSender sender=provider.produce();
		sender.Send();
	}
}
