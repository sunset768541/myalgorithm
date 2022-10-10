/**
 * 简单选择排序
 */
public class SimpleChooseSort extends AbsSort{
    @Override
    void sort() {//
        for (int i=0;i< array.length;i++){
            int index=i;
            for (int j=i+1;j<array.length;j++){//将数组分为已排序和未排序的，每次在未排序的部分中找最小的值索引，然后将最小值放到当前位置i上
                if (array[index]>array[j]){
                    index=j;
                }
            }
            if (index != i){
                int tmp=array[i];
                array[i]=array[index];
                array[index]=tmp;
            }
        }
    }
}
