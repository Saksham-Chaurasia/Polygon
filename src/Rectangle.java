public class Rectangle extends Polygon {
    int length;
    int breadth;

    public int getPerimeter(int l, int b){
        return 2*(l+b);
    }

    public int getArea(int l, int b){
        return l*b;
    }


}
