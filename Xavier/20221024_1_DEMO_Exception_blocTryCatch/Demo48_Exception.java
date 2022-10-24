package demo_principale;

import java.io.IOException;
import java.sql.SQLException;

public class Demo48_Exception {

	public static void main(String[] args) throws IOException  {
		System.out.println("main:traitement debut main");
		
		
		try {
			System.out.println("main: premier traitement dans le try");
			
			m1();
			
			System.out.println("main: dernier traitement dans le try");

		}
		catch(NumberFormatException ex){
			System.out.println("je traite l'exception");
		}
//		catch(Exception ex){
//			System.out.println("je traite l'exception");
//		}
		catch(IOException ex){
			ex.printStackTrace();
			System.out.println("je traite l'IOException" + ex.getMessage());
			throw ex;
			//throw new BiblioException("4 eme livre emprunté");
			
		}
		finally
		{
			System.out.println("quoiqu'il arrive, je passe dans le finally");

		}

		
		System.out.println("main:traitement en fin de main");

	}

	/**
	 * @throws IOException Le fichier est absent
	 */
	private static void m1() throws IOException {
		System.out.println("m1 :traitement avant appel");
		m2();
		System.out.println("m1:traitement après appel");
		
	}

	private static void m2() throws IOException{
		System.out.println("m2 :traitement avant appel");
		throw new IOException("Une anomalie est survenue");
		//System.out.println("m2:traitement après appel");
		
	}

}
