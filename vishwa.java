import java.util.Arrays;

class vishwa{
    public static void main(String[] args) {
        int[]arr={10,20,30,40,50};
        int k=30;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==k){
                System.out.println(arr);
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}