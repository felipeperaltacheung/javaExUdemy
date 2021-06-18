package entities;

public class CalcRectangle {
	
	public double height; //atrib
	public double width;
	
	
	public double area () {    // met
		return height * width;
	}

	public double perimeter () {
		return 2 *(height + width);
	}
	
	public double diagonal () {
		return Math.sqrt((width * width + height * height ));
	}
}
