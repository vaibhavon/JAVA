class ArrayDemoc{
	public static void main(String[] args) {
		int[] arr;
		arr=new int[6];
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		arr[4]=50;
		arr[5]=70;
		 for (int i=0;i<arr.length ;i++ ) {
		 	System.out.println("Elements at index "+i+" : "+arr[i]);
		 }
	}
}