package com.hcl.beans;

public class SearchStock {
		private String stockid;

		public String getStockid() {
			return stockid;
		}

		public void setStockid(String stockid) {
			this.stockid = stockid;
		}
		
		public Stock searchStock() {
			return StockBAL.searchStockBal(stockid);
		}
}
