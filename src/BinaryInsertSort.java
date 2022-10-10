public class BinaryInsertSort extends AbsSort {

    @Override
    void sort() {
        for (int i = 1; i < array.length; i++) {

            int tmp = array[i];
            int left = 0;
            int right = i - 1;
            int m=-1;
            while (left <= right) {
                 m = left  +(right-left) / 2;
                if (array[m] > tmp) {
                    right = m - 1;
                } else {left = m + 1;}
            }
            for(int j = i - 1; j >= left; j--) {
                array[j + 1] = array[j];
            }
            array[left] = tmp;

        }
    }
}
