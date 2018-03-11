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
        int sum = arr[av];
        i = av + 1;

        while (i < n) {
            sum += arr[i];
            value[i] = sum;
            i++;

        }

        sum = arr[av];
        i = av - 1;

        while (i >= 0) {
            sum += arr[i];
            value[i] = sum;
            i--;
        }

        for(int x =0;x<value.length;x++){

            System.out.print(value[x]+",");
        }
        System.out.println();

        int max = Integer.MIN_VALUE;

        for (int k = 0; k < n; k++) {
            if (value[k] > max) {
                a = k;
                max = value[k];
            }
        }

        value[a] = Integer.MIN_VALUE / 2;

        max = Integer.MIN_VALUE;
        for (int k = av+1; k < n; k++) {
            if (value[k] > max) {
                b = k;
                max = value[k];
            }
        }

        System.out.println(a + " " + b);
    }
}
