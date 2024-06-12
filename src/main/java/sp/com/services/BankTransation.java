package sp.com.services;

import org.springframework.aop.framework.ProxyFactoryBean;

public class BankTransation {
	
	public void transactionUsingUPI() {
		
		System.out.println("=========Business Logic : UPI Payment==============");
	}
	/*
	public void Demo() {
		ProxyFactoryBean pfb=new ProxyFactoryBean();
		pfb.setTarget(pfb)
		pfb.setInterceptorNames(null);i
	}
*/
		public void transactionUsingInternBanking() {
				
				System.out.println("==========Business Logic : InternBanking=====");
			}
			
		public void transactionUsiwallnet() {
				
				System.out.println("==========Business Logic : Wallet Transcation========");
			}
}
