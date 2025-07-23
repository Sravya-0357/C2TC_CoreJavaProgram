package day_3.constructor;

public class Customer {

	
		private int cid;
		private String name;
		private String city;
		
		//explicit constructor
		public Customer()
		{
			this.cid=101;
			this.name="retz";
			this.city="pune";
		}
		public Customer(int cid, String name, String city)
		{
			this.cid=cid;
			this.name=name;
			this.city=city;
		}
		public Customer(String name, String city)
		{
			
			this.name=name;
			this.city=city;
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
