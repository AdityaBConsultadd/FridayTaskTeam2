package a1;

public class Deepak1 {
	
	String a,b;
	
	Deepak1(String a,String b){
		
		this.a = a;
		this.b = b;
	}
	
	String  getSumString() {
		
		int intA,intB;
		
		String returnString = "##";
		
		try {
			
			 intA = Integer.parseInt(this.a);
			intA = Math.abs(intA);
			
			 intB = Integer.parseInt(this.b);
			intB = Math.abs(intB);
			
			returnString = String.valueOf(intA+intB);
			
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		
		return returnString;
		
	}

}
