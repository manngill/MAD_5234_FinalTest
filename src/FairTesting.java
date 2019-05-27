public class FairTesting{
	
	public String calculateTotal(double price , double totalfair) {
		double fair = (price + totalfair);
		System.out.println("Total Fair is: " + fair);
		
		if (fair > 3 ) {
			return "one trip";
		}
		else if (fair > 5) {
			return "Daily maximum";
		}
		else if (fair < 3) {
			return "Two way trip";
		}
		// test comment
		return "wrong information";
		
	}
}

