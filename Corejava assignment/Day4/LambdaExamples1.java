package lambdaexamples;
interface Operationable{
	int operation(int a,int b);
}

public class LambdaExamples1 {

	public static void main(String[] args) {
		
		Operationable add =(a,b)-> (a+b);
		System.out.println("Adding values "+add.operation(10,12));
		Operationable sub =(a,b) -> (a-b);
		System.out.println("Subtracting values "+sub.operation(25, 6));
		Operationable multi =(a,b) -> (a*b);
		System.out.println("Multiplying values "+multi.operation(6, 5));
		Operationable div =(a,b) -> (a/b);
		System.out.println("Dividing values "+div.operation(100, 3));
		

	}

}
