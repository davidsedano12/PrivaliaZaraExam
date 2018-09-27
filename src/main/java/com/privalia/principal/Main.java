package com.privalia.principal;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import com.privalia.util.LastThursday;
import com.privalia.stocks.Stocks;
import com.privalia.util.CsvReader;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int month=12, year=2018;
		
		CsvReader reader = new CsvReader();
		LastThursday lastthursday = new LastThursday();

		List<Stocks> itx = reader.readCsv();

		Date date = lastthursday.getLastThursday(month, year);

		System.out.println(date);
	}

}
