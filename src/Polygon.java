public class Polygon {
    String color;
    int area;
    int perimeter;
    int side1, side2,side3,side4;

    public int getPerimeter(int side1, int side2, int side3, int side4) {
        return side1 + side2 + side3 + side4;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAngles(){
        return 360;
    }

}
