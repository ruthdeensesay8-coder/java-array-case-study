public class DimensionalArrays {
     public static void main(String[] args) {
        int[][] scores = {
            {80, 75, 90},
            {65, 70, 85},
            {90, 95, 88},
            {72, 68, 78}
        };
        String[] courses = {"Course 1", "Course 2", "Course 3"};
 
        // 1. Table
        System.out.println("Student\t" + String.join("\t", courses));
        for (int i = 0; i < scores.length; i++) {
            System.out.print("S" + (i + 1) + "\t");
            for (int j = 0; j < scores[i].length; j++) {
                System.out.print(scores[i][j] + "\t\t");
            }
            System.out.println();
        }
 
        // 2 & 4. Student averages + highest
        int bestStudent = 0;
        double bestAvg = -1;
        for (int i = 0; i < scores.length; i++) {
            int sum = 0;
            for (int j = 0; j < scores[i].length; j++) sum += scores[i][j];
            double avg = (double) sum / scores[i].length;   // row length: supports jagged arrays
            System.out.printf("Student %d average: %.2f%n", i + 1, avg);
            if (avg > bestAvg) { bestAvg = avg; bestStudent = i; }
        }
        System.out.printf("Highest average: Student %d (%.2f)%n", bestStudent + 1, bestAvg);
 
        // 3 & 5. Course averages + lowest
        int worstCourse = 0;
        double worstAvg = Double.MAX_VALUE;
        for (int j = 0; j < scores[0].length; j++) {
            int sum = 0;
            for (int i = 0; i < scores.length; i++) sum += scores[i][j];
            double avg = (double) sum / scores.length;
            System.out.printf("%s average: %.2f%n", courses[j], avg);
            if (avg < worstAvg) { worstAvg = avg; worstCourse = j; }
        }
        System.out.printf("Lowest course: %s (%.2f)%n", courses[worstCourse], worstAvg);
    }
}
