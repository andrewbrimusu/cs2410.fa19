public class StockMarketStrategy {
    StockDataLoader stockMarketData;
    double firstBuy;
    double buy;
    double profit;
    int numDays;
    StockMarketStrategy(){
        numDays = 7;
        firstBuy = 0.0;
        buy = 0.0;
        profit = 0.0;
        stockMarketData = new StockDataLoader("null");
    }

    //starts setters
    public void setFirstBuy(double firstBuy) {
        this.firstBuy = firstBuy;
    }
    public void setBuy(double buy) {
        this.buy = buy;
    }
    public void setProfit(double profit) {
        this.profit = profit;
    }
    public void setNumDays(int numDays) {
        this.numDays = numDays;
    }
    public void setStockMarketData(StockDataLoader stockMarketData) {
        this.stockMarketData = stockMarketData;
    }
    //starts getters
    public double getFirstBuy() {
        return firstBuy;
    }
    public double getBuy() {
        return buy;
    }
    public double getProfit() {
        return profit;
    }
    public int getNumDays() {
        return numDays;
    }
    public StockDataLoader getstockMarketData() {
        return stockMarketData;
    }
    // end getters
    public void runStrategy(StockMarketStrategy account) {
        System.out.println("this method is meant to be run by child classes");
    }

    public void printProfit() {
        double profit = getProfit();
        double firstBuy = getFirstBuy();
        double returns = profit / firstBuy;
        System.out.println("-----Algorithm Profits-----");
        if (profit > 0) { // checks to see if profit has been positive
            System.out.println("The algorithim has made $" + profit + ".");
        } else if (profit < 0) { // checks to see if profit has been negative
            profit = profit * -1;
            System.out.println("The algorithim has lost -$" + profit + ".");
        } else { //should only be reached if money hasn't been made or lost
            System.out.println("The algorithim has not lost or made any money.");
        }
        System.out.println("returns: " + returns);
    }
}

