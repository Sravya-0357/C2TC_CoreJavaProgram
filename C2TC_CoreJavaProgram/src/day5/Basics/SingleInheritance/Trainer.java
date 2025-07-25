package day5.Basics.SingleInheritance;

public class Trainer extends Person {
	private String session;
	private String desig;
	private String batchno;
	
	public String getSession() {
		return session;
	}
	public void setSession(String session) {
		this.session = session;
	}
	public String getDesig() {
		return desig;
	}
	public void setDesig(String desig) {
		this.desig = desig;
	}
	public String getBatchno() {
		return batchno;
	}
	public void setBatchno(String batchno) {
		this.batchno = batchno;
	}
	
		public Trainer(int pid, String name, String city, String session, String desig, String batchno) {
		super(pid, name, city);
		this.session = session;
		this.desig = desig;
		this.batchno = batchno;
		
	}
		@Override
		public String toString() {
			return "Trainer id: " + super.getPid() + " Name: " + super.getName() + " City: " + super.getCity()+ "session=" + session + ", desig=" + desig + ", batchno=" + batchno;
		}
	
	
}
