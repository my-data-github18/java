package com.sunbeam;

public class Labour implements Emp {
	double hrs, rate;

	public Labour(double hrs, double rate) {
		super();
		this.hrs = hrs;
		this.rate = rate;
	}

	@Override
	public double getsal() {
		// TODO Auto-generated method stub
		return hrs * rate;
	}

	public double calcInce() {
		if (hrs > 300)
			return 0.05 * hrs * rate;

		return 0.0;
	}

}
