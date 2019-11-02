package btc.controller;

public class SplitExample3 {

	public static void main(String args[]){
		
		String st="-0.00006175";
		
		String[] coinPair = st.split("-");
		String currency = coinPair[1].trim();
		System.out.println(currency);
		
		
		
		
	}
}
