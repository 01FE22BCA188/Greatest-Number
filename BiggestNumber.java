public class BiggestNumber {

    public int findBiggestNumber(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array cannot be null or empty");
        }

        int biggestNumber = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > biggestNumber) {
                biggestNumber = array[i];
            }
        }

        return biggestNumber;
    }

    public static void main(String[] args) {
        int[] array = {5, 2, 9, 1, 7};
        BiggestNumber finder = new BiggestNumber();
        int result = finder.findBiggestNumber(array);
        System.out.println("The biggest number in the array is: " + result);
    }
}
