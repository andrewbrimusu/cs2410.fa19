import java.io.File;
import java.util.*; 
import java.io.FileNotFoundException;

public class Trade {
    public static void main(String args[]) {
        boolean istrue = true;
        
        if (! true) {
            System.out.println("yo");
        }
        
        Scanner inFile1;
        // create Scanner inFile1
        try {
            inFile1 = new Scanner(new File("aapl.csv"));
        }
        catch(FileNotFoundException ex2) {
            System.err.println("File not found exception!" + ex2);
            inFile1 = null;
            
        }
        catch (Exception ex)  
        {
            System.err.println("Are you kidding me?!!! That file doesn't exist!!!!" + ex);
            inFile1 = null;
        }
        finally {
            System.out.println("finally we made it");
        }
    
    
        // Original answer used LinkedList, but probably preferable to use ArrayList in most cases
        // List<Float> temps = new LinkedList<Float>();
        List<Float> temps = new ArrayList<Float>();
    
        ArrayList<Integer> nums = new ArrayList<Integer>();
        
        // while loop
        while (inFile1.hasNext()) {
          // find next line
          float token1 = inFile1.nextFloat();
          temps.add(token1);
        }
        inFile1.close();
    
        Float[] prcs = temps.toArray(new Float[0]);
    
        int i =0;
        double av = 0.0;
        int lags = 7;
        double buy = 0.0;
        double sell = -1.0;
        double profit = 0.0;
        double initial = 0.0;
        for (Float p : prcs) {
          if (i > lags) {
              av = (prcs[i-1]+prcs[i-2]+prcs[i-3]+prcs[i-4]+prcs[i-5]+prcs[i-6]+prcs[i-7])/lags;
              if (p < av * 0.95 && buy == 0.0) {
              //if (p > av && buy == 0.0) {
                  buy = p;
                  System.out.println("Buying on day "+i+" at price: "+p);
                  sell = 0.0;
                  if (initial == 0.0) {
                      initial = p;
                  }
              }
              //else if (p < av && sell == 0.0) {
              else if (p > av * 1.05 && sell == 0.0) {
                  sell = p;
                  profit += (sell - buy);
                  System.out.println("Selling on day "+i+" at price: "+p);
                  System.out.println("Trade profit: "+(sell - buy));
                  buy = 0.0;
              }
              else {
                  //pass
              }
              
          }
          i++;
        }
        System.out.println("Total Profit: "+profit);
        System.out.println("Total Returns: "+(profit/initial));
    }
}