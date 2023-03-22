package LeetCode;

public class Q34_查找排序数组第一个和最后一个位置 {
    public int[] searchRange(int[] nums, int target) {
        int leftbound = findLeftBound(nums,target);
        int rightbound= findRightBound(nums,target);

        if(leftbound==-2||rightbound==-2) return new int[]{-1,-1};
        if(rightbound-leftbound>1)return new int[]{leftbound+1,rightbound-1};
        return new int[]{-1,-1};

    }


//    找到左边界-1
//    当前中点大于等于目标值，把待定返回值定为新的右查找边界
//
    int findLeftBound(int[] nums,int target){
        int left=0,right=nums.length-1;
        int leftBound = -2;
        while(left<=right)
        {
            int mid = (left+right)/2;
            if(nums[mid]>=target)
            {
                right=mid-1;
                leftBound = right;
            }
            else left= mid+1;
        }
        return leftBound;
    }
    int findRightBound(int[] nums,int target){
        int left=0,right=nums.length-1;
        int rightBound = -2;
        while(left<=right)
        {
            int mid = (left+right)/2;
            if(nums[mid]<=target)
            {
                left=mid+1;
                rightBound=left;
            }
            else right=mid-1;
        }
        return rightBound;
    }
}
