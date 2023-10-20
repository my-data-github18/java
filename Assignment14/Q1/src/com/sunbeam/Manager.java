package com.sunbeam;

public class Manager implements Emp{
	
	double da,bs;

	
	public Manager(double da, double bs) {
		super();
		this.da = da;
		this.bs = bs;
	}
	@Override
	public double getsal() {
		// TODO Auto-generated method stub
		return bs + bs;
	}
	
	public double calcInce()
	{
		return 0.2 * bs;
	}
	
}
