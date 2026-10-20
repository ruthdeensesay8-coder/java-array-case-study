
public class OutputBug {
    public static void main(String[] args) {
        // buggy version
        int[] data ={1, 2, 3, 4, 5};
        for (int i = 0; i < data.length; i++) {
        data[i] = data[i] + data[data.length - 1 - i];
        }
        // i = 0: 1 + 5 = 6| i =1: 2+4=6:| i=2: 3+3=6| i=3: 4+data[1]=4+6=10| i=4: 5+data[0](now 6) = 11
        System.out.println("Buggy output:" +  java.util.Arrays.toString(data)); // [6,6,6,10,11]
        // fixed version
        int[] original = {1, 2, 3, 4, 5};
        int[] result = new int[original.length];
        for (int i = 0; i < original.length; i++)
        {
            result [i] =  original[i] + original[original.length - 1 - i];
        }
        System.out.println("Fixed output:" + java.util.Arrays.toString(result)); // [6,6,6,6,6]
    }
}
