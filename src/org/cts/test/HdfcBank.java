package org.cts.test;

public class HdfcBank extends Bank{
@Override
public void depositAcc() {
	System.out.println("4%");
}
@Override
	public void fixedAcc() {
		System.out.println("8%");
	}

public static void main(String[] args) {
	HdfcBank h=new HdfcBank();
	h.depositAcc();
	h.fixedAcc();
	h.current();

}
}
