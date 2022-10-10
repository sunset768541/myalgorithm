/**
 * 希尔排序
 */
public class ShellSort extends AbsSort {
    @Override
    void sort() {
        for (int step = array.length / 2; step > 0; step /= 2) {
            for (int i = step; i < array.length; i++) {
                int tmp = array[i];
                int j = i - step;
                while (j >= 0 && tmp < array[j]) {
                    array[j + step] = array[j];
                    j -= step;
                }
                array[j + step] = tmp;
            }
        }
    }
}
