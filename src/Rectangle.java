public class Rectangle {
    int length;
    int breadth;

    Rectangle(int l, int b) {
        length = l;
        breadth = b;
    }

    void calculatedArea() {
        int area = length * breadth;
        System.out.println(area);

}

    public static void main(String[] args){

        Rectangle R1 =new Rectangle(7,8);
        Rectangle R2 =new Rectangle(8,3);

        R1.calculatedArea();
        R2.calculatedArea();
    }

}
