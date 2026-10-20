public class RankingSystem {
    public static void main(String[] args) {
        int[] scores = {78, 90, 65, 90, 85, 72, 95, 85};
        int n = scores.length;
 
        int[] sorted = scores.clone();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (sorted[j] < sorted[j + 1]) {
                    int tmp = sorted[j];
                    sorted[j] = sorted[j + 1];
                    sorted[j + 1] = tmp;
                }
            }
        }
        System.out.print("Sorted (high to low): ");
        for (int s : sorted) System.out.print(s + " ");
        System.out.println();
 
        System.out.print("Top 3 distinct: ");
        int printed = 0;
        for (int i = 0; i < n && printed < 3; i++) {
            if (i == 0 || sorted[i] != sorted[i - 1]) {
                System.out.print(sorted[i] + " ");
                printed++;
            }
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            int rank = 1;
            for (int j = 0; j < n; j++) {
                if (scores[j] > scores[i]) rank++;
            }
            System.out.println("Student " + (i + 1) + " score " + scores[i] + " -> rank " + rank);
        }
    }
}
