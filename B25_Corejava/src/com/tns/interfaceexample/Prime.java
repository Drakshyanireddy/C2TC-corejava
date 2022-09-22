package com.tns.interfaceexample;

import com.tns.abstaction.override;

public class Prime implements Accounts {
	
	@override
	public void  deliverycharges() {
		System.out.println("there will be no deliverycharges for prime ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Prime s = new Prime();
		 Nonprime p = new Nonprime();
		 p.deliverycharges();
		 s.deliverycharges();
		 //System.out.println("end");
	}

}
