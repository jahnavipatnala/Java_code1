public class RandomArray {
    public static void shuffle(Object[] array)
    {
        int noOfElements = array.length;
        for (int i=0; i<noOfElements; i++)
        {
            int s=i+(int)(Math.random() * (noOfElements - i));
            Object temp = array[s];
            array[s] = array[i];
            array[i] = temp;

        }

    }
    public static void main(String[]args)
    {
        Integer[] a = {1, 2, 3, 4, 5, 6, 7};
        RandomArray.shuffle(a);
        for (int i=0; i< a.length;i++)
        {
            System.out.print(a[i]+ " ");
        }
    }    
}
