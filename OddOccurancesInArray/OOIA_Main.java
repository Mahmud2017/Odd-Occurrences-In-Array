package OddOccurancesInArray;

import java.util.ArrayList;

public class OOIA_Main {

	public static void main(String[] args) {

		int[] myOddArray = {1,2,1,2,4,4,5};
		int answer = solution(myOddArray);
		System.out.println(answer);
	}
	
	public static int solution(int[] A) 
	{
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		for(int i = 0; i < A.length; i++ )
		{
			int count = 1;
			if(!al.contains(A[i])) {
				for(int j = i + 1; j < A.length; j++ )
				{
					if(A[i] == A[j]) {
						count++;
					}
				}
				
				if(count % 2 != 0)
					return A[i];
				
				al.add(A[i]);
			}
		}
		
		return 0;
	}

}
