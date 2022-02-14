package homeworkComputer;

public class Starter {

	public static void main(String[] args) {
		
		// POJO creation
		
		Computer c1 = new Computer();
		Computer c2 = new Computer();
		Computer c3 = new Computer();
		
		//property setting
		
		c1.setName("Computron");
		c1.setCost(1234);
		c1.setYear(1980);
		c1.setSelfaware('N');
		
		c2.setName("Destructo");
		c2.setCost(2345);
		c2.setYear(1990);
		c2.setSelfaware('N');
		
		c3.setName("Futurebot");
		c3.setCost(10000);
		c3.setYear(30000);
		c3.setSelfaware('Y');
		
		
		
		
		System.out.println(c1.getName());
		System.out.println(c1.getCost());
		System.out.println(c1.getYear());
		System.out.println(c1.getSelfaware());
		System.out.println();
		
		System.out.println(c2.getName());
		System.out.println(c2.getCost());
		System.out.println(c2.getYear());
		System.out.println(c2.getSelfaware());
		System.out.println();
		
		System.out.println(c3.getName());
		System.out.println(c3.getCost());
		System.out.println(c3.getYear());
		System.out.println(c3.getSelfaware());
		System.out.println();
		
		
		
		
		
		

	}

}
