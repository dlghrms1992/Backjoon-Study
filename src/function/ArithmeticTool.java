package function;

public class ArithmeticTool implements Number {
	
	int add() {
		
		return 0;
	}
	
	int substract(int[] arr) {
		int result = 0;
		int a = 0;
		int b = 0;
		
		if(arr.length == 0) {
			System.out.println("°ª¾øÀ½");
			return 0;
		}else if(arr.length == 1) {
			result = arr[0];
		}else {
			int[] pasteArr = new int[arr.length];
			for(int i = 0 ; i < arr.length ; i++) {
				pasteArr[i] = arr[i];
			}
			
			for(int i = 0 ; i < arr.length ; i++) {
			
			}
		}
		
		return result;
	}
	
	int multiply(int[] arr) {
		return 0;
	}
	
	int divide(int[] arr) {
		
		return 0;
	}

	double add(double[] arr) {
		
		return 0;
	}
	
	double substract(double[] arr) {
		
		return 0;
	}
	
	double multiply(double[] arr) {
		return 0;
	}
	
	double divide(double[] arr) {
		
		return 0;
	}
}
