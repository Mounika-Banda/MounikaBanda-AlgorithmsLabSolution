package CurrencyDenominations.Services;

public class CurrencyDenominations {

	public void paymentApproach(int[] array, int n, int amt) {

		int no;
		for(int i=n-1;i>=0;i--) {
			if(amt>=array[i]) {
				no=amt/array[i];
				System.out.println(array[i]+":"+no);
				amt=amt-(no*array[i]);
			}
		}	
	}


}
