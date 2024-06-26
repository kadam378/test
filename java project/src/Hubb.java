 class Hubb{
 
	void meth(int a){
		System.out.println(a);
	}
	void meth(int a, int b){
		System.out.println(a+b);
	}
	public static void main(String[] args) {
		Hubb h = new Hubb();
		h.meth(3);
		h.meth(3,4);;
	}
}
