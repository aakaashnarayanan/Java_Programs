package Ans;

public class solution {
  public void getMaxProfit(int[] stockPrices) {

    if (stockPrices.length < 2) {
      throw new IllegalArgumentException("requries 2 day");
    }

    int minPrice = stockPrices[0];
    int maxProfit = stockPrices[1] - stockPrices[0];

    for (int i = 1; i < stockPrices.length; i++) {
      int currentPrice = stockPrices[i];

      int potentialPrice = currentPrice - minPrice;

      maxProfit = Math.max(maxProfit, potentialPrice);
      minPrice = Math.max(minPrice, potentialPrice);
    }
    System.out.println(maxProfit);
  }
}