public class ProductInventory {
        public static void main(String[] args) {
        int[] stock = {12, 8, 15, 6};
        System.out.println("First: " + stock[0] + ", Last: " + stock[stock.length - 1]);
        stock[1] = 10;
        for (int i = 0; i < stock.length; i++) {
            System.out.println("stock[" + i + "] = " + stock[i]);
        }
        try {
            System.out.println(stock[4]);
        } catch (ArrayIndexOutOfBoundsException e) {
            // Valid indexes are 0..3 (length 4), so index 4 does not exist.
            System.out.println("Error: " + e.getMessage());
        }
    }

}
