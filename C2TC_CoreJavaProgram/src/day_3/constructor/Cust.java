package day_3.constructor;

public class Cust {

	
		private int cid;
		private String name;
		private String city;
		
		//explicit constructor
		public Cust()
		{
			System.out.println("default");
		}
		public Cust(int cid, String name, String city)
		{
			this("he","sd");
			this.cid=cid;
			this.name=name;
			this.city=city;
		}
		public Cust(String name, String city)
		{
			
			this.name=name;
			this.city=city;
			System.out.println("para");
		}
		public int getCid() {
			return cid;
		}
		public void setCid(int cid) {
			this.cid = cid;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		@Override
		public String toString() {
			return "Customer [cid=" + cid + ", name=" + name + ", city=" + city + "]";
		}
		

}
