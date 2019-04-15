package Association;

public class Driver extends CarClass {
	String driverName;

	Driver(String name, String cname, int cid) {
		super(cname, cid);
		this.driverName = name;
	}
}
