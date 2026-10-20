public class NumberFrequence {
    public static void main(String[] args) {
        int[] rolls = {3, 5, 2, 3, 6, 5, 3, 1, 2, 3};
        int[] freq = new int[7];            
        for (int r : rolls) freq[r]++;
 
        int max = 0;
        for (int v = 1; v <= 6; v++) {
            System.out.println(v + " appears " + freq[v] + " times");
            if (freq[v] > max) max = freq[v];
        }
        System.out.print("Most frequent (max=" + max + "): ");
        for (int v = 1; v <= 6; v++) {      
            if (freq[v] == max) System.out.print(v + " ");
        }
        System.out.println();
    }
}
