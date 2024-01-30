public class Circle {
     public static void main(String [] args) {
        double radius = 7.5; //arbitrary radius, value can be changed
  	    
  	    double area = Math.PI * radius * radius; //(πr^2) OR Math.PI * Math.pow(radius,2)
  	    
        double circumference = 2 * Math.PI * radius; //(2πr) 

        System.out.println("Radius: " + radius);
        System.out.printf("Area: %.3f\n", area);
        System.out.printf("Circumference: %.3f\n", circumference);
     }
}
