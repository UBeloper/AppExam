import java.io.FileReader;

public class Ex1228_4 {

	public static void main(String[] args) {
		FileReader fis = null;		

		// FileReader 연습!! 가장 많이 쓰는거!!
		try {
			fis = new FileReader("./bin/reader.txt"); 
														   
			int i; 
			while ((i = fis.read()) != -1) {  
				System.out.println((char)i); 
			}
			// 
			
			
		} catch(Exception e) {
			System.out.println("1 : " + e);
		} finally {
			if(fis != null) { 
				try {
					fis.close();			
				} catch(Exception e) {
					
					System.out.println("2 : " + e);
				}
				
			}
		}
		
		
		//★★★★★★ ?븞?뀞?븯?꽭?슂
		// 설정 변경!!! preference - General - workspace - text file encoding - other + UTF-8
		
		
		
		
	}

}
