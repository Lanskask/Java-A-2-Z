package bubleSort;

class Main {
    public static void main(String[] args) {
        int array[] = new int[10];

        System.out.print("Input array:\n\t ");

        for(int i = 0; i < array.length; i++) {
            array[i] = (int) Math.round( Math.random()*100 );
            System.out.print(array[i] + ", ");
        }

        BubleSorter sorter = new BubleSorter(array);

        array = sorter.bubleSorting();

        System.out.print("\n\nOutput array:\n\t ");
        for(int i = 0; i < array.length; i++) {
//            array[i] = (int) Math.round( Math.random()*100 );
            System.out.print(array[i] + ", ");
        }
    }
}
