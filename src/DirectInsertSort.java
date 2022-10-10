public class DirectInsertSort extends AbsSort {


    @Override
    void sort() {
        for (int i=1;i<array.length;i++){
            int tmp,j,k;
            tmp=array[i];
            for ( j=i-1;j>=0;j--){
                if (tmp>array[j]){
                    break;
                }
            }
            if (j!=i-1){
                for (k=i-1;k>j;k--){
                    array[k+1]=array[k];
                }
            }
            array[j+1]=tmp;
        }
    }
}








