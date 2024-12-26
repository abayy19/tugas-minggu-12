public class fungsirekursi {
    public static void sumOfThree (int n, int a, int b, int c) {
        System.out.print(a+ " ");
        if (n == 1){
            return;
        }
        sumOfThree(n - 1,b,c,a+ b + c);
    }
    public static void printReverse(int n){
        if (n<1) {
            return;
        }
        System.out.print(n + " ");
        printReverse(n-1);
    }

    public static boolean isPalindrome(String str, int start, int end) {
        if (start == end) {
            return true;
        }
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }
        return isPalindrome(str, start + 1, end - 1); 
}
public static boolean contains(int[] arr, int n, int target){
    if (n == 0) {
        return false;
    }
    if (arr[n - 1]== target){
        return true;
    }
    return contains(arr, n - 1, target);
}

public static int findMax(int[] arr, int n) {
    if (n == 1){
        return arr[0];
    }
    return Math.max(arr[n - 1], findMax(arr, n-1));
}
public static void main(String[] args){
    int n = 5;
    int a = 2;
    int b = 2;
    int c = 2;
    System.out.println("1. sumOfThree :");
    sumOfThree(n, a, b, c);

    System.out.println();
    System.out.println("2. Agak Maju dari 3 : ");
    printReverse(3);
    System.out.println();

    String str = "mabam";
    System.out.println("3. kata "+str + " adalah palindrome :" + isPalindrome(str, 0, str.length()-1));

    int [] arr = {
        1,2,3,4,5
    };
    System.out.println("4. apakah 2 ada di array? " + contains(arr, arr.length, 2));

    System.out.println("5. Nilai maksimum dalam Array: " + findMax(arr, arr.length));
}
}