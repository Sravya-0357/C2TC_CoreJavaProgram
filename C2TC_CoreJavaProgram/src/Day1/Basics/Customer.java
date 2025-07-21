package Day1.Basics;

public class Customer {
		private  int cid;
		private String cname;
		private String ccity;
		
		public int getcid()
		{
			return cid;
		}

		public void setCid(int cid) {
			this.cid = cid;
		}

		public String getCname() {
			return cname;
		}

		public void setCname(String cname) {
			this.cname = cname;
		}

		public String getCcity() {
			return ccity;
		}

		public void setCcity(String ccity) {
			this.ccity = ccity;
		}

		@Override
		public String toString() {
			return "Customer id=" + cid + ",  name=" + cname + ", city=" + ccity;
		}
		
	

}
