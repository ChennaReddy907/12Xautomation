public class Car_Details {
    String name;
    int rate;
    String colour;

    Car_Details(String p, int s, String l){
        name =p;
        rate=s;
       colour=l;
    }

    void display(){
        System.out.println("name "+ name);
        System.out.println("rate "+ rate);
        System.out.println("colour "+ colour);
    }

    public static void main(String[] args){
        Car_Details c1= new Car_Details("Tata",600000,"Blue");
        Car_Details c2= new Car_Details("Mahindra", 500000,"Red");
        Car_Details c3= new Car_Details("Suzuki", 300000,"White");

        c1.display();
        c2.display();
        c3.display();
    }
}
