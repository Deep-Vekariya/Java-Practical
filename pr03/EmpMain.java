public class EmpMain{
	public static void main(String[] args){
		Employe employe =new Employe("Mayank",240000,74);
		employe.CalSal();
		employe.DisplaySal();
	}
}

class Employe{
	String name;
	double bas_sal,gross_sal,net_sal;
	double da;
	double tds;

	Employe(String name,double bas_sal, double da){
		this.name=name;
		this.bas_sal= bas_sal;
		this.da=da;
	}


	void  CalSal(){
		// gross salary calculation
		gross_sal = bas_sal + (bas_sal * (da/100));

		//TDS calculation
		if(gross_sal > 100000)
			tds= 0.1;
		else
		tds=0;

		net_sal = gross_sal - (gross_sal * tds);
	}


	// Display Detail
	void DisplaySal(){
		System.out.println("Name : "+name);
		System.out.println("Basic Salary(yearly) : "+bas_sal);
		System.out.println("Dearness Allowance : "+da +"%");
		System.out.println("Gross Salary : "+gross_sal);
		System.out.println("TDS : "+tds);
		System.out.println("Net Salary : "+net_sal);
	}

}
