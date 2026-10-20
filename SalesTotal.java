public class SalesTotal {
      public static void main(String[] args) {
        int[] sales = {100000, 150000, 125000, 200000, 175000};
        int total = 0;
        for (int i = 0; i < sales.length; i++) {
            total += sales[i];
        }
        System.out.println("Elements: " + sales.length);   
        System.out.println("Total sales: Rp" + total);     
    }
}
