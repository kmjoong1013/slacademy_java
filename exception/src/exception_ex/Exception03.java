package exception_ex;

public class Exception03 {

	public void compute(int a, int b)throws ArithmeticException, Exception{
		
		int tot = 0;
		tot = a/b;
		if (b<0) {
			throw new Exception("음수로 나눌수 없습니다");
		}
		System.out.println("tot = "+tot);
	}
	
	public static void main(String[] args) {
		Exception03 obj = new Exception03();
		try{
			obj.compute(10,0);
			obj.compute(10,-1);
		}catch(ArithmeticException e) {
			System.out.println("0으로 나눌수 없습니다.");
			//System.out.println(e.getMessage());
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
}
