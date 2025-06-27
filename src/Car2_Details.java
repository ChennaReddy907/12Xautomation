public class Car2_Details {
    String brand;
    String model;
    int price;

    Car2_Details(String b, String m, int p) {
        brand = b;
        model = m;
        price = p;
    }

    void display() {
        System.out.println("Brand " + brand);
        System.out.println("Model " + model);
        System.out.println("Price " + price);
    }

    public static void main(String[] args) {
        Car2_Details cr1 = new Car2_Details("Tata", "Nexton", 2000);
        Car2_Details cr2 = new Car2_Details("Mahindra", "Xuv300", 3000);
        Car2_Details cr3 = new Car2_Details("Suzuki","Zen",600);

        cr1.display();
        cr2.display();
        cr3.display();
    }
}


