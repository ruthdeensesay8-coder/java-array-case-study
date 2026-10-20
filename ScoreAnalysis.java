public class ScoreAnalysis {
    public static void main(String[] args) {
        int[] scores = {75, 80, 65, 90, 55, 85, 70, 95};
        int sum = 0;
        for (int s : scores) sum += s;
        double avg = (double) sum / scores.length;
        System.out.println("Average: " + avg);                 
 
        System.out.print("Above average: ");
        int pass = 0;
        for (int s : scores) {
            if (s > avg) System.out.print(s + " ");           
            if (s >= 70) pass++;
        }
        System.out.println();
        System.out.println("Passed: " + pass);                 
        System.out.println("Pass %: " + (pass * 100.0 / scores.length) + "%"); 
}
}