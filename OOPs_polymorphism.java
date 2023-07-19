public class OOPs_polymorphism {
    public static void main(String[] args) {
        student s1 = new student();
        s1.name = "Manoj";
        s1.age = 21;
        s1.branch = "IT";

        s1.printInfo(s1.branch, s1.age);
    }
}

class student {
    String name;
    String branch;
    int age;

    // overloading

    public void printInfo(String name) {
        System.out.println(name);
    }

    public void printInfo(String branch, int age) {
        System.out.println(branch + " " + age);
    }

    public void printInfo(int age) {
        System.out.println(age);
    }
}
