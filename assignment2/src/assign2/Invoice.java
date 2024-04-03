package assign2;

public class Invoice {
	
		
		String partno;
		String partdesc;
		int quant;
		double price;
		
		public Invoice(String partno, String partdesc, int quant, double price) 
		{
			super();
			
			this.partno = partno;
			this.partdesc = partdesc;
			this.quant = quant;
			this.price = price;
		}
		public Invoice() {
			
		}
		public String getPartno() {
			return partno;
		}
		public void setPartno(String partno) {
			this.partno = partno;
		}
		public String getPartdesc() {
			return partdesc;
		}
		public void setPartdesc(String partdesc) {
			this.partdesc = partdesc;
		}
		public int getQuant() {
			return quant;
		}
		public void setQuant(int quant) {
			this.quant = quant;
		}
		public double getPrice() {
			return price;
		}
		public void setPrice(double price) {
			this.price = price;
		}
		
		
		double Calculate() {
			
			return price*quant;
		}
		
		
		
}