package week2.day1;

public class Mobile {
	
public void makecall()
{
	String mobilemodel="poco";
	float mobileWeight=110.9f;
	System.out.println("mobile model"+mobilemodel+ "mobile weight"+mobileWeight);
	
}
public void sendmsg() {
	boolean isfullycharged= true;
	int mobilecost=15000;
	System.out.println("is fully charged"+isfullycharged+ "mobilecost"+mobilecost);
}
public static void main(String[] args) {
	Mobile mob=new Mobile();
	mob.makecall();
	mob.sendmsg();
}
}
