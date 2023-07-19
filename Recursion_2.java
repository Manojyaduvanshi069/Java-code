
public class Recursion_2 {

    // (1) TOWER OF HANOI
    // public static void towerOfHanoi(int n, String BEG, String AUX, String END) {
    // if (n == 1) {
    // System.out.println("Transfer disk " + n + " from " + BEG + " to " + END);
    // return;
    // }
    // towerOfHanoi(n - 1, BEG, END, AUX);
    // System.out.println("Transfer disk " + n + " from " + BEG + " to " + END);
    // towerOfHanoi(n - 1, AUX, BEG, END);
    // }

    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // towerOfHanoi(4, "A", "B", "C");
    // }

    // (2) palindrome

    // public static void printStr(String str, int idx) {
    // if (idx == 0) {
    // System.out.println(str.charAt(idx));
    // return;
    // }
    // System.out.print(str.charAt(idx));
    // printStr(str, idx - 1);
    // }

    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // String str = "hello";
    // printStr(str, str.length() - 1);
    // }

    // (3) first and the last occurance of an element in the string

    // public static int first = -1;
    // public static int last = -1;

    // public static void occurance(String str, int indx, char element) {
    // if (indx == str.length()) {
    // System.out.println(first);
    // System.out.println(last);
    // return;
    // }
    // char currchar = str.charAt(indx);
    // if (currchar == element) {
    // if (first == -1) {
    // first = indx;
    // } else {
    // last = indx;
    // }
    // }
    // occurance(str, indx + 1, element);
    // }

    // public static void main(String[] args) {
    // String str = "jbaacdaefaph";
    // occurance(str, 0, 'a');
    // }

    // (4) strictly sorted?

    // public static Boolean issoretd(int arr[], int indx) {
    // if (indx == arr.length - 1) {
    // return true;
    // }
    // if (arr[indx] < arr[indx + 1]) {
    // return issoretd(arr, indx + 1);
    // } else {
    // return false;
    // }
    // }

    // public static void main(String[] args) {
    // int arr[] = { 1, 2, 3, 4, 5, 7 };
    // System.out.println(issoretd(arr, 0));
    // }

    // (5) moveAll x in the given string;

    // public static void moveAllX(String str, int count, int indx, String
    // newString) {
    // if (indx == str.length()) {
    // for (int i = 0; i < count; i++) {
    // newString += 'x';
    // }
    // System.out.println(newString);
    // return;
    // }

    // char currchar = str.charAt(indx);
    // if (currchar == 'x') {
    // count++;
    // moveAllX(str, count, indx + 1, newString);
    // } else {
    // newString += currchar;
    // moveAllX(str, count, indx + 1, newString);
    // }
    // }

    // public static void main(String[] args) {
    // String str = "axbcxxd";
    // moveAllX(str, 0, 0, "");
    // }

    // (6) Remove duplicate in a String;

    // public static boolean[] map = new boolean[26];

    // public static void removeDuplicte(String str, int indx, String newString) {
    // if (indx == str.length()) {
    // System.out.println(newString);
    // return;
    // }

    // char currchar = str.charAt(indx);
    // if (map[currchar - 'a']) {
    // removeDuplicte(str, indx + 1, newString);
    // } else {
    // newString += currchar;
    // map[currchar - 'a'] = true;
    // removeDuplicte(str, indx + 1, newString);
    // }
    // }

    // public static void main(String[] args) {
    // String str = "abbcccd";
    // removeDuplicte(str, 0, "");
    // }

    // (7) Subsequences;

    // public static void subsequences(String str, int indx, String newString) {

    // if (indx == str.length()) {
    // System.out.println(newString);
    // return;
    // }

    // char currchar = str.charAt(indx);

    // subsequences(str, indx + 1, newString + currchar);

    // subsequences(str, indx + 1, newString);
    // }

    // public static void main(String[] args) {
    // String str = "abc";
    // subsequences(str, 0, "");
    // }

    // public static void subsequences(String str, int indx, String newString,
    // HashSet<String> set) {

    // if (indx == str.length()) {
    // if (set.contains(newString)) {
    // return;
    // } else {
    // System.out.println(newString);
    // set.add(newString);
    // return;
    // }
    // }

    // char currchar = str.charAt(indx);

    // subsequences(str, indx + 1, newString + currchar, set);

    // subsequences(str, indx + 1, newString, set);
    // }

    // public static void main(String[] args) {
    // String str = "aaa";
    // HashSet<String> set = new HashSet<>();
    // subsequences(str, 0, "", set);
    // }

    // (8) keypad combinations;

    public static String[] keypad = { ".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz" };

    public static void printComb(String str, int indx, String combination) {
        if (indx == str.length()) {
            System.out.println(combination);
            return;
        }

        char currchar = str.charAt(indx);
        String mapping = keypad[currchar - '0'];

        for (int i = 0; i < mapping.length(); i++) {
            printComb(str, indx + 1, combination + mapping.charAt(i));
        }
    }

    public static void main(String[] args) {
        String str = "12";
        printComb(str, 0, "");

    }

}
