import java.util.*;

public class Property{
	public static void main(String[] args){
		Banglow banglow = new Banglow();
		System.out.println("Total cost of banglow : " + banglow.ComputePrice());
		System.out.println();

		Flat flat = new Flat();
		System.out.println("Total cost of flat : " + flat.ComputePrice());
	}
}

interface PropertyDemo {
	public double ComputePrice();
}

class Banglow implements PropertyDemo{
	String name;
	double constructorArea,landArea,totalCost;

	public double ComputePrice(){
		try{
			Scanner scanner = new Scanner(System.in);

			System.out.print("Enter Name of banglow : ");
			name = scanner.nextLine();

			System.out.print("Enter Land Area Of Banglow: ");
			landArea = scanner.nextDouble();

			System.out.print("Enter Constructon Area Of Banglow : ");
			constructorArea = scanner.nextDouble();
		}catch(Exception e){}

		double constructorCost = 500 * constructorArea;
		double landCost = 400 * landArea;
		double additionalCost = 200 * landArea;

		totalCost = landCost + constructorCost + additionalCost;
		return totalCost;
	}
}

class Flat implements PropertyDemo{
	String name;
	double constructorArea,totalCost;

	public double ComputePrice(){
		try{
			Scanner scanner = new Scanner(System.in);

			System.out.print("Enter Name of Flat : ");
			name = scanner.nextLine();

			System.out.print("Enter Constructon Area Of Flat : ");
			constructorArea = scanner.nextDouble();
			}catch(Exception e){}

		double constructorCost = 500 * constructorArea;
		double additionalCost = 200000;
		
		totalCost = constructorCost + additionalCost;
		return totalCost;
	}
}

