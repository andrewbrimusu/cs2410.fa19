public class MRStrategy extends StockMarketStrategy {
    String strategyName;
    MRStrategy(String account) {
        strategyName = "MRStrategy";
        numDays = 7;
        firstBuy = 0.0;
        buy = 0.0;
        profit = 0.0;
        stockMarketData = new StockDataLoader(account);
    }
    //start getters
    public String getStrategyName() {
        return strategyName;
    }
    @Override
    public double getBuy() {
        return super.getBuy();
    }
    @Override
    public double getFirstBuy() {
        return super.getFirstBuy();
    }
    @Override
    public double getProfit() {
        return super.getProfit();
    }
    @Override
    public int getNumDays() {
        return super.getNumDays();
    }
    @Override
    public StockDataLoader getstockMarketData() {
        return super.getstockMarketData();
    }
    //start setters
    @Override
    public void setBuy(double buy) {
        super.setBuy(buy);
    }
    @Override
    public void setFirstBuy(double firstBuy) {
        super.setFirstBuy(firstBuy);
    }
    @Override
    public void setNumDays(int numDays) {
        super.setNumDays(numDays);
    }
    @Override
    public void setProfit(double profit) {
        super.setProfit(profit);
    }
    @Override
    public void setStockMarketData(StockDataLoader stockMarketData) {
        super.setStockMarketData(stockMarketData);
    }
    public void setStrategyName(String strategyName) {
        this.strategyName = strategyName;
    }
    @Override
    public void runStrategy(StockMarketStrategy account) {
        double prc;
        double meanPrc;
        double tot = 0;
        boolean hasStock = false;
        boolean hasBoughtStock = false;
        double profit = 0;
        for (int day = numDays; day < stockMarketData.getNumStocks(); day++){ //loops through process for amount of stocks
            prc = stockMarketData.getPrices(day);
            for (int i = day - numDays; i < day; i++) {
                tot += stockMarketData.getPrices(i);
            }
            meanPrc = tot / numDays; // tot / number days gives the average of the last x days
            if( prc <  (meanPrc * 0.95) && !hasStock){ // buys stock
                account.setBuy(prc);
                System.out.println("Day " + (day + 1) + " buy at price: " + prc);
                hasStock = true;
                if (!hasBoughtStock){ // sets the first buy
                    setFirstBuy(prc);
                    hasBoughtStock = true; //makes this chain inaccessible for the object

                }
            } else if(prc > (meanPrc * 1.05) && hasStock){ //sells stock
                profit = profit + (prc - account.getBuy());
                account.setProfit(profit);
                System.out.println("Day " + (day + 1) + " sell at price: " + prc + " profit: " + (prc - account.getBuy()) +
                        "\n Total profit = " + account.getProfit());
                account.setBuy(0);
                hasStock = false;
            }
            tot = 0;
        }
        printProfit();
    }
}
