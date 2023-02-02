public class Square extends Rectangle {
    int side;


    public int getPerimeter(int side){
        System.out.println("Using square getPerimeter method");
        return super.getPerimeter(side,side);

    }


    public int getArea(int side){
        System.out.println("Using area getArea method");
        return super.getArea(side,side);
    }
}
