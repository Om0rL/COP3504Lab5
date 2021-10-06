public class Analyzer {

    private static String[] data;
    private static double start;
    private static double end;

    public static void main(String[] args){
        data = StringData.getData();

        int linearIndex = Analyzer.linearSearch(data,"nothere");
        System.out.println(linearIndex);
        int binaryIndex = Analyzer.binarySearch(data,"nothere");
        System.out.println(binaryIndex);

        int linearIndex2 = Analyzer.linearSearch(data,"mzzzz");
        System.out.println(linearIndex2);
        int binaryIndex2 = Analyzer.binarySearch(data,"mzzzz");
        System.out.println(binaryIndex2);

        int linearIndex3 = Analyzer.linearSearch(data,"aaaaa");
        System.out.println(linearIndex3);
        int binaryIndex3 = Analyzer.binarySearch(data,"aaaaa");
        System.out.println(binaryIndex3);
    }

    public static int linearSearch(String[]  dataSet,  String element){
        start = System.nanoTime();
        for (int i = 0; i < dataSet.length; i++){
            if (dataSet[i].equals(element)){
                end = System.nanoTime();
                System.out.println("Element found: " + i + "\nTime used: " + (end - start));
                return i;
            }
        }
        end = System.nanoTime();
        System.out.println("No element found."+ "\nTime used: " + (end - start));
        return -1;
    }

    public static int binarySearch(String[]  dataSet,  String element){
        int middleIndex = 0;
        int startIndex = 0;
        int endIndex = dataSet.length - 1;

        start = System.nanoTime();

        while(startIndex != endIndex){
            //System.out.println(startIndex + " " + endIndex);
            middleIndex = ( startIndex + endIndex ) / 2;
            if(dataSet[middleIndex].compareTo(element) > 0){
                endIndex = middleIndex;
            }else if (dataSet[middleIndex].compareTo(element) < 0){
                startIndex = middleIndex + 1;
            }else {
                break;
            }
        }


        if(dataSet[middleIndex].equals(element)) {
            end = System.nanoTime();
            System.out.println("Element found: " + middleIndex + "\nTime used: " + (end - start));
            return middleIndex;
        }
        else{
            end = System.nanoTime();
            System.out.println("No element found."+ "\nTime used: " + (end - start));
            return -1;
        }
    }

}

/*

1) For linear search, it is the worst case because it has to iterate through the whole array.
   For binary search, it has to keep dividing the array in half until the very end.

2) It is the average case because it is in the middle of the array. It has to search through at least half the array.

3) It is the best case because it is the first element in the array. It only needs to iterate once to find it.

4) Linear search took a longer time because it is O(n) while binary search took less time because it is O(log(n)).

5) For a linear search, the time increases indefinitely at a constant rate as the input increases. This means when the
input is very large, the time will be much longer than if the input is medium-sized. For binary search the rate which time
increases actually decreases as input increases. There will be a point where the time won't increase a significant amount
As the input increases, the time plateaues off, meaning the time at a large input will be similar to the time at a
medium-sized input.




 */