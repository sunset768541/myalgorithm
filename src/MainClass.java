public class MainClass {
    public static void main(String[] args){

       System.out.println("冒泡排序");
       BubbleSort bubbleSort= new BubbleSort();
       bubbleSort.printSort();

       System.out.println("快速排序");
       QuickSort quickSort=new QuickSort();
       quickSort.printSort();

        System.out.println("希尔排序");
        ShellSort shellSort= new ShellSort();
        shellSort.printSort();

        System.out.println("直接插入排序");
        DirectInsertSort directInsertSort = new DirectInsertSort();
        directInsertSort.printSort();

        System.out.println("二分插入排序");
        BinaryInsertSort binaryInsertSort= new BinaryInsertSort();
        binaryInsertSort.printSort();
    }
}
