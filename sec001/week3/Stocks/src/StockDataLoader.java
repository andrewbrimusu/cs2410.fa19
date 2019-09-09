import java.io.File;
import java.util.Scanner;

public class StockDataLoader {
    private int numStocks = 250;
    private double[] prices = new double[numStocks];
    private String fileName;

    StockDataLoader(String fileName){
        this.fileName = fileName;
    }
    // Starts setters
    public void setNumStocks(int numStocks) {
        this.numStocks = numStocks;
    }
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
    public void setPrices() throws Exception{
        loadData();
    }
    // end setters
    //starts getters
    public int getNumStocks() {
        return numStocks;
    }
    public double getPrices(int i) {
        return prices[i];
    }
    public String getFileName() {
        return fileName;
    }
    //end getters
    public void loadData() throws Exception{
        int incrementer = 0; //incrementer moves the pointer for setting prices
        Scanner csvFile = new Scanner((new File(this.fileName)));
        while (csvFile.hasNextDouble()){
            this.prices[incrementer] = csvFile.nextDouble();
            incrementer++;
        }
    }
    public void printPrices(){
        for(int i = 0; i< prices.length; i++){
            System.out.println(prices[i]);
        }
    }
}
