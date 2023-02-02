import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        char k = 'Y';
        while (k=='Y') {

            System.out.println("Enter the sides of the polygon: ");
            System.out.println("For Circle Enter 0: ");
            System.out.println("For Quadrilateral Enter 1: ");
            System.out.println("For Rectangle Enter2: ");
            System.out.println("For Square Enter3: ");
            Scanner sc = new Scanner(System.in);

            int i = sc.nextInt();

            if (i == 0) {
                System.out.println("Enter the radius of a circle: ");
                int value = sc.nextInt();
                Circle c = new Circle(value);

                System.out.println("Area of circle: " + c.getArea(value));
                System.out.println("Perimeter of cirlce: " + c.getperimeter(value));

            } else if (i == 1) {
                System.out.println("Enter the Side1: ");
                int s1 = sc.nextInt();
                System.out.println("Enter the Side2: ");
                int s2 = sc.nextInt();
                System.out.println("Enter the Side 3: ");
                int s3 = sc.nextInt();
                System.out.println("Enter the Side 4: ");
                int s4 = sc.nextInt();

                Polygon p = new Polygon();
                System.out.println("Perimeter of Quadrilateral: " + p.getPerimeter(s1, s2, s3, s4));
                System.out.println("Sum of internal Angles: " + p.getAngles());
            } else if (i == 2) {
                System.out.println("Enter the Length: ");
                int s1 = sc.nextInt();
                System.out.println("Enter the Breadth: ");
                int s2 = sc.nextInt();
                Rectangle r = new Rectangle();
                System.out.println("Enter the color: ");
                String s3 = sc.next();
                r.setColor(s3);


                System.out.println("Sum of internal Angles: " + r.getAngles());
                System.out.println("Perimeter of Rectangle: " + r.getPerimeter(s1, s2));
                System.out.println("Area of Rectangle " + r.getArea(s1, s2));
                System.out.println("Color of Rectangle: " + r.getColor());


            } else if (i == 3) {
                System.out.println("Enter the side: ");
                int s1 = sc.nextInt();
                Square s = new Square();
                System.out.println("Sum of internal Angles: " + s.getAngles());
                System.out.println("Perimeter of Square: " + s.getPerimeter(s1));
                System.out.println("Area of Square " + s.getArea(s1));
            } else {
                System.out.println("You entered a wrong number");
            }
            System.out.println("Do you want to continue: Press Y: or Press N: ");
            char ch  = sc.next().charAt(0);
            if(ch=='Y')
                continue;
            else break;
        }
    }

}