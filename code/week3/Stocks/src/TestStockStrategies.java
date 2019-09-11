public class TestStockStrategies {
    private StockMarketStrategy[] strats;
    private Double[] returns;
    TestStockStrategies(){
        strats = new StockMarketStrategy[8];
        // starts MACD init
        strats[0] = new MACDStrategy("AltabaPrices.csv");
        strats[1] = new MACDStrategy("LockheedMartinPrices.csv");
        strats[2] = new MACDStrategy("REKRPrices.csv");
        strats[3] = new MACDStrategy("SpotifyPrices.csv");
        // starts MRS init
        strats[4] = new MRStrategy("AltabaPrices.csv");
        strats[5] = new MRStrategy("LockheedMartinPrices.csv");
        strats[6] = new MRStrategy("REKRPrices.csv");
        strats[7] = new MRStrategy("SpotifyPrices.csv");

        returns = new Double[8];
    }
    public void runStrategies() throws Exception{
        for (int i = 0;i < strats.length; i++){
            strats[i].stockMarketData.loadData();
            System.out.println("------" + strats[i].getClass() + " for " + strats[i].getstockMarketData().getFileName() + "------");
            strats[i].runStrategy(strats[i]);
            returns[i] = strats[i].getProfit() / strats[i].getFirstBuy();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
        }
    }
    public void printReturns(){
        System.out.println("MACD for Altaba returns: " + returns[0]);
        System.out.println("MACD for Lockheed returns: " +returns[1]);
        System.out.println("MACD for REKR returns: " + returns[2]);
        System.out.println("MACD for Spotify returns: " + returns[3]);
        System.out.println("Mean Reversion for Altaba returns: " + returns[4]);
        System.out.println("Mean Reversion for Lockheed returns: " + returns[5]);
        System.out.println("Mean Reversion for REKR returns: " + returns[6]);
        System.out.println("Mean Reversion for Spotify returns: " + returns[7]);
    }
    public static void main(String[] args) throws Exception{
        TestStockStrategies obj = new TestStockStrategies();
        obj.runStrategies();
        obj.printReturns();

    }
}
