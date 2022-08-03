package Day5.FunctionalPrograms;

public class ThreeIntegerZero{
    static void threeInteger(int[] array, int n)
    {
        boolean found = false;
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (array[i] + array[j] + array[k] == 0) {
                        System.out.println(array[i]+" "+array[j]+" "+array[k]);
                        found = true;
                    }
                }
            }
        }
        if (!found)
            System.out.println("Does not exist");
    }
    public static void main(String[] args)
    {
        int array[] = { 0, -1, 2, -3, 1 };
        int n = array.length;
        threeInteger(array,n);
    }
}
