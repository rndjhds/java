package homework;

import java.text.DecimalFormat;

class Cal {
	int radius;

	public Cal(int radius) {
		this.radius = radius;
	}

	double circle1() { // 원주
		double c1 = 2 * radius * Math.PI;
		return c1;
	}

	double circle2() { // 원의 면적
		double c2 = Math.PI * radius * radius;
		return c2;
	}

	double sphere1() { // 구의 표면적
		double s1 = Math.PI * 4 * radius * radius;
		return s1;
	}

	double sphere2() {
		double s2 = (4 * Math.PI * radius * radius * radius) / 3.0;
		return s2;
	}

}

public class RadiusEx {

	public static void main(String[] args) {

		Cal ca = new Cal(5);
		DecimalFormat rad = new DecimalFormat("#.##");
		
		System.out.println(rad.format(ca.circle1()));
		System.out.println(rad.format(ca.circle2()));
		System.out.println(rad.format(ca.sphere1()));
		System.out.println(rad.format(ca.sphere2()));
		

	}

}
