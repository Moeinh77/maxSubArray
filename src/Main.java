public class Main {

    private static int a = 0, b = 0;

    public static void main(String[] args) {

        int arr[] = {-12, 1, 4, 6, 3, 5, 2, 9, -2, -7};
        for (int anArr : arr) {
            System.out.print(" ," + anArr);
        }

        int n=arr.length;

        System.out.println("\n"+"mid is "+n/2+"\n");


        System.out.println("Crossing sum is "+findSubArr(arr,0,n));
        System.out.println("Right sum is "+findSubArr(arr,n/2,n));
        System.out.println("Left sum is "+findSubArr(arr,0,n/2));

//        System.out.println();
//        for(int x=a;x<=b;x++){
//            System.out.print(" ,"+arr[x]);
//        }
    }

    private static int findSubArr(int arr[],int s,int e) {

        int av = (e-s)/2+s;
        int i = 0;
        int sum = 0;
        int sum_R=Integer.MIN_VALUE,sum_L=Integer.MIN_VALUE;
        i = av ;

        while (i < e) {
            sum += arr[i];
            if(sum>sum_R) {
                sum_R = sum;
               b=i;
            }
            i++;
        }

        sum = 0;
        i = av - 1;

        while (i >= s) {
            sum += arr[i];
            if(sum>sum_L) {
                sum_L= sum;
               a=i;
            }
            i--;
        }


        return sum_R+sum_L;
    }
}
