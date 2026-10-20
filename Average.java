public class Average {
     public static void main(String[] args) {
    
        int[] scores = {80, 70, 90, 60};
 
        //buggy version
        try {
            int total = 0;
            for (int i = 0; i <= scores.length; i++) {   // BUG 1: <= goes to index 4
                total += scores[i];
            }
            double average = total / scores.length;      // BUG 2: integer division
            System.out.println(average);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Buggy version crashed: " + e.getMessage());
        }
 
        // fixed version
        int total = 0;
        for (int i = 0; i < scores.length; i++) {        // fix 1: < instead of <=
            total += scores[i];
        }
        double average = (double) total / scores.length; // fix 2: cast before dividing
        System.out.println("Fixed average: " + average); // 75.0
 
        // Changing only total to double fixes BUG 2 but NOT BUG 1 (the crash).
    }
}
