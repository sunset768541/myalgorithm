public class QuickSort extends AbsSort{

    @Override
    void sort() {
        quickSort(array,0,array.length-1);
    }


    void quickSort(int[] array ,int left ,int right){
        if (left<right){
            int partition=partition(array,left,right);
            quickSort(array,left,partition-1);
            quickSort(array,partition+1,right);
        }
    }


    int partition(int[] array ,int left,int right){
        int pivot=array[left];//设置参考值pivot为数组序列的最左侧值
        while (left<right){//找到left=right的位置
            while (left<right&&array[right]>pivot){//首先从右向左找，找到第一个比pivot小的数
                right--;
            }
            array[left]=array[right];//将第一个比pivot小的数放在左边
            while (left<right&&array[left]<pivot){//从左向右找，找到第一个比pivot大的值
                left++;
            }
            array[right]=array[left];
        }
        array[left]=pivot;
        return left;
    }
}
