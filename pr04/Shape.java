class Shape{
	public static void main(String[] args){
		Cone c = new Cone(10,3);
		System.out.println("Volume of cone is : "+c.Volume());
		c.Describe();

		Ractangle r = new Ractangle(5,3);
		System.out.println("Area of ractangle is : "+r.Area());
		r.Perimeter();
		r.Describe();

		Sphere s = new Sphere(10);
		System.out.println("Volume of sphere is : "+s.Volume());
		s.Describe();
	}
}

// Create GeomatricShape interface
 interface GeometricShape{
	public void Describe();
}

// Inherite TwoDShape interface from GeometricShape interface
 interface TwoDShape extends GeometricShape{
	public double Area();
}

// Inherite ThreeDShape interface from GeometricShape interface
 interface ThreeDShape extends GeometricShape{
	public double Volume();
}

// implements class Cone from ThreeDShape interface
 class Cone implements ThreeDShape{
	double radious,height;
	
	Cone(double radious, double height){
		this.radious = radious;
		this.height = height;
	}

	public double Volume(){
		double volume;
		volume = (1.0/3) * Math.PI * Math.pow(radious, 2) * height;
		return volume;
	}

	public void Describe(){
		System.out.println("This is a cone of radious "+ radious +", height "+ height);
	}
}

// implements class Cone from TwoDShape interface
class Ractangle implements TwoDShape{
	private double width,height;
	
	public Ractangle(double width, double height){
		this.width = width;
		this.height = height;
	}

	public double Area(){
		double area;
		area = width * height;
		return area;
	}

	public void Perimeter(){
		double perimeter = 2 * (width + height);
		System.out.println("Perimeter Of Ractangle : " + perimeter);
	}

	public void Describe(){
		System.out.println("This is a Ractangle of height "+ height + ", width "+ width);
	}
}

// implements class Cone from ThreeDShape interface
class Sphere implements ThreeDShape{
	private double radious;

	public Sphere(double radious){
		this.radious = radious;
	}

	public double Volume(){
		double volume;
		volume = (4.0/3) * Math.PI * Math.pow(radious,3); 
		return volume;
	}

	public void Describe(){
		System.out.println("This is a Sphere of Radious "+ radious);
	}
}
