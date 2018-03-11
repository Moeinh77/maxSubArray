public class Main {

    private static int a = 0, b = 0;

    public static void main(String[] args) {
        int arr[] = {-12, 1, 4, 6, 3, 5, 2, 9, -2, -7};
        for (int anArr : arr) {
            System.out.print(" ," + anArr);
        }
        System.out.println("\n");

        findSubArr(arr);

        System.out.println();
        for(int x=a;x<=b;x++){
            System.out.print(" ,"+arr[x]);
        }
    }

    private static void findSubArr(int arr[]) {

        int n = arr.length;

        int[] value = new int[n];

        int av = n / 2;
        int i = 0;
        int sum = 0;
        int sum_R=Integer.MIN_VALUE,sum_L=Integer.MIN_VALUE;
        i = av + 1;

        while (i < n) {
            sum += arr[i];
            if(sum>sum_R) {
                sum_R = sum;
               b=i;
            }
            i++;
        }

        sum = 0;
        i = av - 1;

        while (i >= 0) {
            sum += arr[i];
            if(sum>sum_L) {
                sum_L= sum;
               a=i;
            }
            i--;
        }

        System.out.println(a + " " + b);
    }
}
