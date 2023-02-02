public class Circle extends Polygon{
    int side;

    public Circle(int side) {
        super();

        this.side = side;
    }

    public int getArea(int side){
        return (int) (3.14*side);
    }

    public int getperimeter(int side){
        return (int) (2*3.14*side);
    }
}
