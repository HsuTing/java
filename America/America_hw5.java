
public class America_hw5 {
	public static void function(int T, int O, int G, int D){
		int sum = (T*100 + O*10 + O)*4 - (G*1000 + O*100 + O*10 + D);
		
		if(T == 0||G == 0){
			return;
		}
		if(sum == 0){
			System.out.printf("T:%d O:%d G:%d D:%d ", T, O, G, D);
			System.out.println();
			return;
		}
	}
	
	public static void main(String[] args) {
		
		for(int T = 0; T <=9; T++){
			for(int O = 0; O <=9; O++){
				for(int G = 0; G <=9; G++){
					for(int D = 0; D <=9; D++){
						function(T, O, G, D);
					}
				}
			}
		}
	}

}
