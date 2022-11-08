package org.tnsindia.client;

import org.tnsindia.application.GSNormalAcc;
import org.tnsindia.application.GSPrimeAcc;
import org.tnsindia.application.GSShopFactory;
import org.tnsindia.framework.NormalAcc;
import org.tnsindia.framework.PrimeAcc;
import org.tnsindia.framework.ShopFactory;

public class Client {

	public static void main(String[] args) {
		ShopFactory s=new GSShopFactory();
		PrimeAcc p=new GSPrimeAcc(12121, "VIDYA PAYGUDE", 840, true);
		NormalAcc n=new GSNormalAcc(13281, "VEENA DONHE", 840,50 );
		System.out.println("PRIME ACCOUNT DETAILS: ");
		p.bookProduct(p.getCharges());
		
		System.out.println();
		System.out.println("NORMAL ACCOUNT DETAILS: ");
		n.bookProduct(n.getCharges());
		
		//System.out.println(p);
		//System.out.println(n);


	}
	
}
