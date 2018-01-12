
public class Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] test1 = {1,2,3,4,5,6,7,8,9,10};
		int[] test2= {0,4,5,6,12,15,17,23,29};
		//System.out.println(binSearch(test1,3)); //2
		System.out.println(linSearch(test1,3)); //2
	}
	
	public static int linSearch(int[] nums, int position)
	{ 
		for(int i=0;i<nums.length;i++)
		{
			if(nums[i]==position)
			{
				return i;
			}
		}
		return -1;
	}
	
	public static int binSearch(int[] nums, int position)
	{
		
		int L=0;
		int R=nums.length-1;
		while(L<=R)
		{
			int mid = (L+(R-L))/2;
			if(nums[mid]==position)
			{
				return mid;
			}
			if(nums[mid]>position)
			{
				L= mid+1;
			}
			if (nums[mid]<position)
			{
				R= mid-1;
			}
		}
		return -1;
	}
	
}
