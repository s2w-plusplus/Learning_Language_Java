package q02;
/*
2. Create a class Circle, it will have only one constructor which accepts radius as an argument. Write two methods in the class - calcuateArea(), calculatePerimeter(). 
Write test class to test method calls.

*/

public class Circle{
	double radius;
	
	Circle(double r){
	  this.radius = r;
	}
	
	double calArea(){
		double area = Math.PI * radius * radius;
		return area;
	}
	
	double calPerimeter(){
		double prmtr = 2 * Math.PI * radius;
		return prmtr;
	}

}