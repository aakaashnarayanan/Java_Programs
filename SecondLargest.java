class SecondLargest{
  public static void main(String args[])
  {
    int arr[] = new int[] {20,123,45,23,67,45,7,1};

    int first = 0; 
    int second = 0;

    for(int  j  = 0; j < arr.length;j++)
    {
      if(arr[j] > first)
      {
        second = first;
        first = arr[j];
      }
      else if(arr[j] < second)
      {
        second = arr[j];
      }
    }
    System.out.println(second);
    System.out.println(first);
  }
}