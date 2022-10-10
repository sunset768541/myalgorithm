/**
 * 冒泡排序
 */
public class BubbleSort extends AbsSort{
    @Override
    void sort() {
        for (int i=0;i<array.length-1;i++){//将数组分为有序的和无序的
            for (int j=0;j<array.length-1-i;j++){//将每个无序数组部分的最大值，逐渐向后移动
                if (array[j+1]<array[j]){
                    int tmp = array[j+1];
                    array[j+1]=array[j];
                    array[j]=tmp;
                }
            }
        }
    }
}
