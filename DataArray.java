public class DataArray {
    public static void main(String[] args) {
        int[] ids = {101, 102, 101, 103, 102, 104, 105, 103};
        int n = ids.length;
        // 1. Find duplicated IDs ( print each one once)
        System.out.print("Duplicated IDs: ");
        for (int i = 0; i < n; i++)
        {
            boolean seenBefore = false, appearslater = false;
            for (int a = 0; a < i; a++){
                if (ids[a] == ids[i]) seenBefore = true;

            }
            for(int a = i + 1; a < n; a++)
            { 
                if (ids[a] == ids[i]) appearslater = true;
            }
            if( !seenBefore && appearslater) System.out.print(ids[i] + " ");

        }
    //2. Build a unique array , keeping the first occurrence order
    int[] unique = new int[n];
    int u = 0;
    for(int i = 0; i < n; i++)
    {
        boolean found = false;
        for (int a = 0; a < u; a++){
            if (unique[a] == ids[i]) found = true;

        }
        if(!found) unique[u++] = ids[i];
      
    }
    //3, display the result
    System.out.print("\nUnique IDs: ");
    for(int i = 0; i < u; i++) System.out.print(unique[i] + " ");
    System.out.println("\nNumber of unique participants: " + u);
}
}