import java.util.Arrays;

public class task2 {
    public static void main(String[] args) {
        int[] nums = new int[] { 5, 4, 3, 2, 1 };
        mergSort(nums, 0, nums.length - 1);
        System.out.println(Arrays.toString(nums));
    }

    static void mergSort(int[] nums, int start, int end) {
        if (start >= end)
            return;
        int mid = (start + end) / 2;
        mergSort(nums, start, mid);
        mergSort(nums, mid + 1, end);
        merg(nums, start, mid, end);
    }

    static void merg(int[] nums, int start, int mid, int end) {
        int[] temp = new int[end - start + 1];
        int left = start;
        int rigth = mid + 1;
        int k = 0;
        while (left <= mid && rigth <= end) {
            if (nums[left] < nums[rigth]) {
                temp[k++] = nums[start++];
            } else {
                temp[k++] = nums[rigth++];
            }
        }
        while (left <= mid)
            temp[k++] = nums[left++];
        while (rigth <= end)
            temp[k++] = nums[rigth++];
        for (int i = start; i <= end; i++)
            System.arraycopy(temp, 0, nums, start, end + 1 - start);
    }
}
