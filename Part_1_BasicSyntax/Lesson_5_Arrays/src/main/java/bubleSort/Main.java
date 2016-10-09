package bubleSort;

class Main {
    public static void main(String[] args) {

        // Making the array
        int array[] = new int[10];

        System.out.print("Input array:\n\t ");
        for(int i = 0; i < array.length; i++) {
            array[i] = (int) Math.round( Math.random()*100 );
            System.out.print(array[i] + ", ");
        }

        // Sorting
        BubleSorter sorter = new BubleSorter(array);

        sorter.bubleSorting();
        array = sorter.getArray();

//        System.out.println(array.length);
        System.out.print("\n\nOutput array:\n\t ");
        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
    }

}
