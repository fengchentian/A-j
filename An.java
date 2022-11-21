package an;
import java.util.Scanner;
import java.util.Arrays;

public class An {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
	   int []shuz=new int[5];
	   Scanner sc=new Scanner (System.in);
	   shuz[0]=sc.nextInt(); 	 
	   shuz[1]=sc.nextInt(); 
	   shuz[2]=sc.nextInt(); 
	   shuz[3]=sc.nextInt(); 
	   shuz[4]=sc.nextInt(); 
	   System.out.println(Arrays.toString(shuz));
	   Arrays.sort(shuz);
	   System.out.println(Arrays.toString(shuz));
	   System.out.println("最小值："+shuz[0]);
	   
		
}
}