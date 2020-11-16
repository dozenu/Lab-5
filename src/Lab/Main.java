package Lab;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        Stock[] stocks;
        stocks=new Stock[3];
        for (int i=0; i<3; i++)
            stocks[i]=new Stock();
        for(int i=0;i<3;i++)
            stocks[i].InputInFile();
        Stock.OutputOfFile();
    }
}
