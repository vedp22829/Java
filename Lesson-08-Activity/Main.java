class Main {

	public static void main(String[] args) {
    	(new Main()).init();
	}

  void init(){
		print("Hello from the print function!");
		System.out.println("32 degrees Fahrenheit = " + ftoc(32) + " degrees Celsius");
		System.out.println("Sphere volume with radius 3 = " + sphereVolume(3));
		System.out.println("Cone volume with radius 3 and height 5 = " + coneVolume(3, 5));
		System.out.println("Distance from (1, 2) to (4, 6) = " + distance(1, 2, 4, 6));
  }

	void print(String message){
		System.out.println(message);
	}

	double ftoc(double fahrenheit){
		return (fahrenheit - 32) * 5 / 9;
	}

	double sphereVolume(double rad){
		return (4.0 / 3) * Math.PI * rad * rad * rad;
	}

	double coneVolume(double rad, double height){
		return (1.0 / 3) * Math.PI * rad * rad * height;
	}

	double distance(double x1, double y1, double x2, double y2){
		return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
	}

}