package basicOOPs;
public class ForEachLoop 
{
	public static int maximum(int[] numbers)
    {
	int maxscore=numbers[0];
	//for each loop
	for(int num:numbers)
	{
		if(num>maxscore) 
		{
			maxscore=num;
			
		}
	}
	return maxscore;
	
     }

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int[] marks = { 125, 132, 95, 116, 110 };
			int highMark = maximum(marks);
			System.out.println("The highest Score is" + highMark);

		}

}
