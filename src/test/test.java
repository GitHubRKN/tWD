package test;

public class test {
public static void main(String[] args) {
	Bathroom b = new Bathroom();
	House h1 = new House();
	//b.setMirrors(3);
	House h = new House(b);
	h.Colour();
	
	//Bathroom b = new Bathroom();
	h.b.setMirrors(3);
	System.out.println(h.b.getMirrors());
}
}
