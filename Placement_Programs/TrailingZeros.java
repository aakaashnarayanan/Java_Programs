class solution {
  int i, fact = 1, count;

  void countZero(int n) {
    for (int i = 1; i <= n; i++) {
      fact *= i;
    }

    String s = Integer.toString(fact);
  
    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      if(c == '0')
      {
        count++;
      }
    }

    System.out.println(fact);
    System.out.println(count);

  }
}

class TrailingZeros {
  public static void main(String args[]) {
    int n = 5;
    solution s = new solution();
    s.countZero(n);
  }
}