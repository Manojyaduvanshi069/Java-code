public class Recursion_3 {

    // (1) Permutation;
    // public static void printpermutation(String str, String permutation) {
    // if (str.length() == 0) {
    // System.out.println(permutation);
    // }
    // for (int i = 0; i < str.length(); i++) {
    // char currchar = str.charAt(i);
    // String newString = str.substring(0, i) + str.substring(i + 1);
    // printpermutation(newString, permutation + currchar);
    // }
    // }

    // public static void main(String[] args) {
    // String str = "abc";
    // printpermutation(str, "");
    // }

    // (2) paths in metrix;

    // public static int countpath(int i, int j, int m, int n) {
    // if (i == m || j == n) {
    // return 0;
    // }
    // if (i == m - 1 || j == n - 1) {
    // return 1;
    // }
    // int downpaths = countpath(i + 1, j, m, n);
    // int rightpaths = countpath(i, j + 1, m, n);
    // return downpaths + rightpaths;

    // }

    // public static void main(String[] args) {
    // int m = 3;
    // int n = 3;
    // int totalpaths = countpath(0, 0, m, n);
    // System.out.println(totalpaths);
    // }

    // (3) place tiles of size 1xm in a floor of size nxm;

    // public static int placeTiles(int n, int m) {
    // if (n == m) {
    // return 2;
    // }
    // if (n < m) {
    // return 1;
    // }
    // int vertPlacements = placeTiles(n - m, m);
    // int horzPlacements = placeTiles(n - 1, m);
    // return vertPlacements + horzPlacements;
    // }

    // public static void main(String[] args) {
    // int n = 4, m = 2;
    // System.out.println(placeTiles(n, m));
    // }

    // (4)

    public static int callGuests(int n) {
        if (n <= 1) {
            return 1;
        }
        int way1 = callGuests(n - 1);
        int way2 = (n - 1) * callGuests(n - 2);
        return way1 + way2;
    }

    public static void main(String[] args) {
        int n = 4;
        System.out.println(callGuests(n));
    }

}
