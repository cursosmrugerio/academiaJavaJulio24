package com.enthu.rad;

import com.*;
import com.enthu.*;
import java.io.*;

class StockQuote {
    Stock stock;

    public StockQuote(Stock s) {
        stock = s;
    }

    public void store() throws IOException {
        Util.store(stock);
    }

    public double computePrice() {
        return (double) Helper.getPricer(stock);
    }
}
