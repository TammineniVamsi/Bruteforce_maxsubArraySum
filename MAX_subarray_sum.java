public class subarraysum {
    public static void subarrsum(int arr[]){
        //int currsum=0;
        int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                int currsum=0;
                for(int k=i;k<=j;k++){
                   //subarray sum 
                   currsum=currsum+arr[k];
                }
                System.out.println("current sum is "+ currsum);
                if(currsum>maxsum){
                    maxsum=currsum;
                }
            }
    
        }
        System.out.println("maxsum of subarray is "+ maxsum);
    }
    public static void main(String args[]){
        int arr[]={1,-2,6,-1,3};
        subarrsum(arr);
    }

    
}
