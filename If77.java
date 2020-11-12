import java.util.*;
public class If77{
	public static void main(String[] args){
		int[] nums = new int[100];
		for(int i=0;i<nums.length;i++){
			int n=new Random().nextInt(100);
			System.out.print(n+",");
			nums[i]=n;
		}
		System.out.println();
//		int target=77;
		int i=0;
		for(;i<nums.length;i++){
				if(nums[i]==77){
					System.out.printf("最初の%dのindexは%dです%n",77,i);
					break;
			}
		}
		if(i==nums.length){
			System.out.println("77はありませんでした");
		}
	}
}
