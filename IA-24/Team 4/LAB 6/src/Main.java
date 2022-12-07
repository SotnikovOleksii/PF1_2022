import java.util.*;
public class Main {

    public static void bubbleSort(){
        System.out.println("Insert count of elem: ");
        int N;
        Scanner in = new Scanner(System.in);
        N = in.nextInt();
        float [] nums = new float[N];
        System.out.println("Insert elements of your array: ");
        for (int i = 0; i < N; i++) {
            nums[i] = in.nextFloat();
        }
        //sorting
        for(int i = 1; i < N; i++)
        {
            for(int r = 0; r < N-i; r++)
            {
                if(nums[r] < nums[r+1])
                {
                    // Обмен местами
                    float temp = nums[r];
                    nums[r] = nums[r+1];
                    nums[r+1] = temp;
                }
            }
        }
        //Output
        for (int i = 0; i < N; i++) System.out.print(nums[i] + " ");
    }
    public static void selectionSort() {
        System.out.println("Insert count of elem: ");
        int N;
        Scanner in = new Scanner(System.in);
        N = in.nextInt();
        float [] nums = new float[N];
        System.out.println("Insert elements of your array: ");
        for (int i = 0; i < N; i++) {
            nums[i] = in.nextFloat();
        }
        //sorting
        int min = 0;
        float buf = 0;

        for (int i = 0; i < N; i++)
        {
            min = i;
            for (int j = i + 1; j < N; j++)
                min = ( nums[j] > nums[min] ) ? j : min;
            if (i != min)
            {
                buf = nums[i];
                nums[i] = nums[min];
                nums[min] = buf;
            }
        }
        //Output
        for (int i = 0; i < N; i++) System.out.print(nums[i] + " ");
    }
    public static void main(String[] args) {
        System.out.println("Choice method: 1. Bubble, 2. Selection\n");
        int choice = 0;
        Scanner in = new Scanner(System.in);
        choice = in.nextInt();
        switch (choice) {
            case 1:
                bubbleSort();
                break;
            case 2:
                selectionSort();
                break;
        }
    }
}