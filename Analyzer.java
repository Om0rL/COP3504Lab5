import java.util.Arrays;
public class Analyzer {

    public static void main(String[] args) {
//        String[] test_data = data;
//        System.out.println(test_data[(test_data.length - 1) /2].compareTo("zzzzz")); //mzzzz
        long begin;
        long time_taken;
        int result;
        String[] data = StringData.getData();

        begin = System.nanoTime();
        result = binarySearch(data, "aaaaa");
        time_taken = (System.nanoTime() - begin);
        System.out.println("aaaaa, binary: " + time_taken + ", result: " + result);

        begin = System.nanoTime();
        result = linearSearch(data, "aaaaa");
        time_taken = (System.nanoTime() - begin);
        System.out.println("aaaaa, linear: " + time_taken + ", result: " + result);

        begin = System.nanoTime();
        result = binarySearch(data, "mzzzz");
        time_taken = (System.nanoTime() - begin);
        System.out.println("mzzzz, binary: " + time_taken + ", result: " + result);

        begin = System.nanoTime();
        result = linearSearch(data, "mzzzz");
        time_taken = (System.nanoTime() - begin);
        System.out.println("mzzzz, linear: " + time_taken + ", result: " + result);

        begin = System.nanoTime();
        result = binarySearch(data, "not_here");
        time_taken = (System.nanoTime() - begin);
        System.out.println("not_here, binary: " + time_taken + ", result: " + result);

        begin = System.nanoTime();
        result = linearSearch(data, "not_here");
        time_taken = (System.nanoTime() - begin);
        System.out.println("not_here, linear: " + time_taken + ", result: " + result);

        begin = System.nanoTime();
        result = binarySearch(data, "aaaaa");
        time_taken = (System.nanoTime() - begin);
        System.out.println("aaaaa, binary: " + time_taken + ", result: " + result);
    }

    public static int linearSearch(String[] dataSet, String element)
    {
        for(int i = 0; i < dataSet.length; i++)
        {
            if(dataSet[i].equals(element))
            {
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(String[] dataSet, String element)
    {
        int lower_bound = 0;
        int higher_bound = dataSet.length - 1;
        int middle;

        while (lower_bound <= higher_bound)
        {
            middle = (lower_bound + higher_bound) / 2;
            if(dataSet[middle].compareTo(element) > 0)
            {
                higher_bound = middle - 1;
            }
            else if(dataSet[middle].compareTo(element) < 0)
            {
                lower_bound = middle + 1;
            }
            else
            {
                return middle;
            }
        }
        return -1;
    }
}
