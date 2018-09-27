package com.privalia.util;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import com.privalia.stocks.Stocks;

public class CsvReader {

	String csvFile = "C:\\Users\\david.sedano\\Documents\\Projects Privalia\\examen JAVA\\stocks-ITX.csv";
	BufferedReader br = null;
	String line = "";
	String CsvSplitter = ";";
    List<Stocks> stock_list = new ArrayList<Stocks>();
	
	public CsvReader() {
	}

	public List<Stocks> readCsv() {
		
		Stocks stock = null;
				
		try {
			br = new BufferedReader(new FileReader(csvFile));
			while ((line = br.readLine()) != null) {
				String[] itx = line.split(CsvSplitter);
			//	stock.setDate(itx[0]);
				
				if(!itx[0].equals("Fecha")) {
				stock = new Stocks(itx[0],new BigDecimal(itx[2]),new BigDecimal(itx[1]));
				stock_list.add(stock);

				}
				
				//stock.setApertura(new BigDecimal(itx[2]));
				
			//	stock.setCierre(new BigDecimal(itx[1]));
			//	System.out.println("day " + days);
			//	System.out.println("apertura " + apertura_values);
			//	System.out.println("day " + cierre_values);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		System.out.println(stock_list.get(0).getDate());
		System.out.println(stock_list.get(0).getApertura());
		System.out.println(stock_list.get(0).getCierre());
			
		return stock_list;

	}
}
