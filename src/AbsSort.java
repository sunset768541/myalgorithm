public abstract class AbsSort {
    public int[] array = new int[]{3, 4, 1, 5, 6, 2, 0, 53, 11, 55, 23};

    abstract void sort();

    public void printSort() {
        sort();
        for (int i : array) {
            System.out.print(" " + i);
        }
        System.out.println("");
    }
}
