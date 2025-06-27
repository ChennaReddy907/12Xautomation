public class Students {
    String name;
    int age;
    double fees;

    Students(String n,int a,double f)
    {
        name = n;
        age = a;
        fees = f;
    }

        void display()
        {
        System.out.println("name: "+ name);
        System.out.println("age: "+ age);
        System.out.println("fees: "+ fees);
        }
        public static void main(String[] args)
        {
 Students s1 = new Students("Soham",7,100.3);
 Students s2 = new Students("Nandu",12,120.63);
 Students s3 = new Students("Yuvika",5,123.01);

 s1.display();
 s2.display();
 s3.display();

        }

}
