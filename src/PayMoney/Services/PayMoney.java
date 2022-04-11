package PayMoney.Services;

public class PayMoney {

	//Method to check if the target is reached
	public String isTargetReached(int arr[], int n, int target) {
		//Initialization of variables
		int pos=0,sum=0;
		boolean flag = false;

		for(int i=0; i<n;i++) {
			sum+=arr[i];
			if(sum>=target) {
				flag = true;
				pos=i;
				break;
			}
		}
		if(flag) 
			return ("Target Achieved after "+(pos+1)+" transactions");
		else
			return "Given Target is not achieved";

	}
}
