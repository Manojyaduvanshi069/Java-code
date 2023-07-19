class pen {
    String color;
    String type;

    public void Write() {
        System.out.println("Write something");
    }

    public void printcolor() {
        System.out.println(this.color); // this keyword;

    }

    public void printType() {
        System.out.println(this.type);

    }

}

class student {
    String name;
    String branch;
    int age;

    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.branch);
        System.out.println(this.age);

    }

}

public class OOPS {
    public static void main(String[] args) {
        // pen pen1 = new pen();
        // pen1.color = "blue";
        // pen1.type = "gel";

        // pen pen2 = new pen();
        // pen2.color = "black";
        // pen2.type = "ball";

        // pen1.printcolor();
        // pen2.printcolor();

        // pen1.printType();
        // pen2.printType();

        // pen1.Write();

        student s1 = new student();
        student s2 = new student();

        s1.name = "Manoj";
        s1.branch = "IT";
        s1.age = 21;

        s2.name = "Shivam";
        s2.branch = "CSE";
        s2.age = 21;

        s1.printInfo();
        System.out.println();
        s2.printInfo();

    }

}
