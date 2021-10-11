import java.lang.reflect.Array;
import java.util.Arrays;

public class Ex1 {
    public static void main(String[] args) {
        int[] Arr = {5,7,8,9,3,1,5,2,8,1};
        System.out.println(Sort(Arr, 0, Arr.length-1));
        System.out.println(Arrays.toString(Arr));
    }
  
    public static int Sort(int[] arr, int low, int high) {
        int count =0;
        //תנאי עצירה
        if (low>=high) {
            return 0;
        }
        //נשים את הפיבוט הגדול בצד ימין
        if (arr[low] > arr[high]) {
            Swap(arr, low, high);
        }
        //נגדיר שני אינדקסים לפיבוטים
        int left = low+1;
        int right = high-1;
        //נסדר את המערך
        for (int i = left; i <= right; i++) {
            if (arr[i] < arr[low]) {
                Swap(arr, i, left);
                left++;
            }
            else if (arr[i] > arr[high]) {
                while (arr[right] > arr[high] && i < right) {
                    right--;
                }
                Swap(arr, i, right);
                right--;
                i--;
            }
            count++;
        }
        //נשים את הפיבוטים במקום
        left--;
        right++;
        Swap(arr, left, low);
        Swap(arr, right, high);
        //נקרא לפונקציה בצורה רקורסיבית
        count += Sort(arr, low, left - 1);
        count += Sort(arr, left + 1, right -1);
        count += Sort(arr, right + 1, high);
        return count;
    }
    //המקרה הגרוע שמערך כבר ממוין מדומה ל מיון המהיר O(n^2).
    //במקרה הטוב ביותר שבו כל פעם נחלק את המערך לשלושה קטעים שווים O(nlog(n))


    public static void Swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}