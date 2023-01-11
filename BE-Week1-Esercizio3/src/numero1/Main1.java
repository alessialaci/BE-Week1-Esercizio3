package numero1;

public class Main1 {

	public static void main(String[] args) {
		
		System.out.println(stringaPariDispari("ciao"));
		System.out.println(annoBisestile(2000));
	}
	
	public static boolean stringaPariDispari(String stringa) {
		
		if(stringa.length() % 2 == 0 ) {
			return true;
		} else {
			return false;
		}
		
	}
	
	public static boolean annoBisestile(int anno) {
		
		if (anno % 4 == 0) {
			return true;
		} else if(anno % 100 == 0 && anno % 400 == 0) {
			return true;
		}
		return false;
		
		/*if (anno % 4 == 0) {
			if (anno % 100 == 0) {
				if (anno % 400 == 0) {
					return true;
				} else {
					return false;
				}
			} else {
				return true;
			}
		} else {
			return false;
		}*/
	}

}
