class Static4{
	static int i=12;
	static public void show(){
		System.out.println(i);
	}

	static{
		show();
	}
	public static void main(String[] args) {
		i++;
		System.out.println(i);
	}
}