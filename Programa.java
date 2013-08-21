public class Programa implements Runnable {

	public void run() {
		System.out.println("Inicio do run");
		String fruta[] = new String[10];
		fruta[0] = "Banana";
		fruta[1] = "Laranja";
		fruta[2] = "Maça";
		fruta[3] = "Uva";
		fruta[4] = "Pera";
		fruta[5] = "Açai";
		fruta[6] = "Abacaxi";
		fruta[7] = "Abacate";
		fruta[8] = "Carombola";
		fruta[9] = "Acerola";

		for (String fru : fruta) {

			System.out.println(fru);
			try {
				Thread.sleep(3 * 1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Fim do run()");
	}

}
