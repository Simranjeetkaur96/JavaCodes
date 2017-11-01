import java.util.*;
public class DecimalFormat {
 
	public double Average(int array[],int n)
	{ 
	  int sum=0;
	  double avg=0;
		for(int i=0;i<n;i++)
		{
			sum=sum+array[i];
		}
		avg=sum/n;
		
		return avg;
	}

	public static void main(String[] args){
		
	int array[] = new int[20];
	System.out.println("Enter 20 integers into the array:");
	Scanner sc =  new Scanner(System.in);
     int input = sc.nextInt();
     int i = 0;
	while(input!= -1)
	{
		
		array[i] = input;
		i++;
		input = sc.nextInt();
		}
	DecimalFormat obj = new DecimalFormat();
    double var = obj.Average(array,i);
    System.out.println("THE AVERAGE OF THE INTEGERS IN THE ARRAY IS:"+var);
	}

}
