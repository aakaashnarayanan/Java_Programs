class MissingNumbersArray{
  public static void main(String args[])
  {
    int a[] = new int[] {1,2,3,4,5,6,7};

    int n = 7; // number needs to be searched

    for(int i = 0;i < a.length; i++)
    {
      if(a[i] == n)
      {
        System.out.println(i);
         return;
      }
    }
  }
}