public class Main {
	
	static int equilibrium_index(int[] arr) {
		int ans=0;
		int sum=0;
		int rightsum=0;
		
		for(int i =0;i<arr.length;i++) {
			sum=sum+arr[i];
		}
		
		for(int i=0;i<arr.length;i++) {
			sum = sum - arr[i];
			if(sum==rightsum) {
				ans=i;
				break;
			}
			rightsum = rightsum + arr[i];
		}
		
		if(ans<0) {
			return -1;
		}else {
			return ans;
		}
		
	}
	
	public static void main(String[] args) {
		int arr[] = {5,2,5,1,6};
		System.out.println(equilibrium_index(arr));
	}
	

}
