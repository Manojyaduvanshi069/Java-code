import java.util.*;

public class Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // string declaration

        // String name = sc.nextLine();
        // System.out.println("I am : " + name);

        // concatination

        String firstname = "Manoj";
        String lastname = "Madhav";
        String fullname = firstname + " " + lastname;
        System.out.println(fullname);
        System.out.println(fullname.length());

        // charAt

        // for (int i = 0; i < fullname.length(); i++) {
        // System.out.println(fullname.charAt(i));
        // }

        // compare

        // if (firstname.compareTo(lastname) == 0) {
        // System.out.println("Strings are equal");
        // } else {
        // System.out.println("Strings are not equal");
        // }

        // substring

        String sentence = "My name is Manoj Yadav";
        String name = sentence.substring(11, 16);
        System.out.println(name);

        sc.close();

    }

}
