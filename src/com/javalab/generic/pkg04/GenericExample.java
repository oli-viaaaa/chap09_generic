package com.javalab.generic.pkg04;

public class GenericExample {
	public static void main(String[] args) {
		
		HomeAgency homeAgency = new HomeAgency();// HomeAgency 객체 생성
			Home home = homeAgency.rent();
			home.turnOnLight();
			
			CarAgency carAgency = new CarAgency();
			Car car = carAgency.rent();
			car.run();
		

	}

}
