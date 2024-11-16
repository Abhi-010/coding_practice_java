class Solution {
    public int longestSubarray(int[] nums) {

        int len = nums.length;

        if(len == 1){
            return 0;
        }

        int[] pf_left = new int[len];
        int[] pf_right = new int[len];

        // 0 1 0
        // 0 1 0
        // 0 1 0

        pf_left[0] = nums[0];
        for(int i = 1 ; i < len ; i++){
            if(nums[i] != 0){
                pf_left[i] = pf_left[i-1] + nums[i];
            }
        }
        pf_right[len-1] = nums[len-1];
        for(int i = len-2 ; i >= 0 ; i--){
            if(nums[i] != 0){
                pf_right[i] = pf_right[i+1] + nums[i];
            }
        }
        System.out.println("Print left Array");
        printArray(pf_left);

        System.out.println("Print right Array");
        printArray(pf_right);

        int ans = 0;
        boolean isZero = false;

        for(int i = 0 ; i < len ;i++){
            if(i==0 && nums[i] == 0){
                if(len > 1){
                    ans = Math.max(ans,pf_right[1]);
                }
            }
            else if(i == len-1 && nums[len-1] == 0){
                if(len > 1){
                    ans = Math.max(ans,pf_left[len-2]);
                }
            }
            else{
                if(nums[i] == 0){
                    isZero = true;
                    ans = Math.max( ans,(pf_left[i-1] + pf_right[i+1]) );
                    System.out.println("You are in else...");
                }
            }
            System.out.println("Ans " + i + "th iteration --> " + ans);
        }
        if(!isZero && (nums[0] != 0 && nums[len-1]!=0)){
            return len-1;
        }
        return ans;
    }

    static void printArray(int[] A){
        int l = A.length;
        for(int i = 0 ; i< l ; i++){
            System.out.print(A[i] + " " );
        }
        System.out.println();
    }
}