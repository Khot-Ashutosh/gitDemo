class Array
{
	public static void main(String args[])
	{
		int n;
		int arr = new int[n];
		
		System.out.println("Enter the size of Array");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		System.out.println("Enter the elements of Array");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Display the Array  /////")
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}

