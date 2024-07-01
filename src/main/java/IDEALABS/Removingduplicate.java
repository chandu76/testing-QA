package IDEALABS;

public class Removingduplicate {

	
		public static void main(String[] args) {
			int arr[]= {1,3,45,5,4,2,3,2,2};
			
			
			
			for (int i=0;i<arr.length;i++)
			{
				for (int j=i+1;j<arr.length;j++)
				{
					if(arr[i]==arr[j]) 
				
						
				System.out.println("duplicate number:"+arr[j]);
				
			}
		}

	}
	}
/*
		String str= "chanduu";
		int len=str.length();
		for (int i=len-1;i<len;i++)
		{
			for (int j=i+1;j<len;i++)
			{
				if (len[i]==len[j])
			}
		}
		System.out.println();

	}

}*/
