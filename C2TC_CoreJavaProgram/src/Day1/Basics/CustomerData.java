package Day1.Basics;

public class CustomerData {

		public static void main(String[] args) {
			
			Customer c1=new Customer();
			c1.setCid(100);
			c1.setCname("Anya");
			c1.setCcity("Germany");
			System.out.println(c1);
			
			Customer c2=new Customer();
			c2.setCid(101);
			c2.setCname("Naruto");
			c2.setCcity("Hidden Leaf");
			System.out.println(c2);
			
			Customer c3=new Customer();
			c3.setCid(102);
			c3.setCname("Gaara");
			c3.setCcity("Hidden Sand");
			System.out.println(c3);
			
			Customer c4=new Customer();
			c4.setCid(103);
			c4.setCname("Killer Bee");
			c4.setCcity("Hidden Cloud");
			System.out.println(c4);
			
		}
	
}
