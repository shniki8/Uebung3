package p2;
public class P2_main {
public static void main(String[] args) {
    int a = 1;
    int b = 3;
    int c = 4;
    int d = 69;
    int anzahlEigenschaften = 0;

    if (a == b) {
        anzahlEigenschaften++;
    }
    if (a==b || a==c) {
    anzahlEigenschaften++;
    }
    if (a+b >= c) {
        anzahlEigenschaften++;
    }
    if (a+b+c>=100) {
        anzahlEigenschaften++;
    }
    d = anzahlEigenschaften;
    System.out.println("Anzahl der Eigenschaften "+ anzahlEigenschaften);
}
}
