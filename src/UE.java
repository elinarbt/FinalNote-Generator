import java.util.Scanner;

public class UE {

	String nomUE;
	
	public static void main(String[] args) {

		int exec = 0;
		while (exec < 1) {

			int saisie = 0;
			while (saisie < 1) {
				Scanner sc = new Scanner(System.in);
				System.out.println("Choisis une UE (en majuscule) :");
				String str = sc.nextLine();

				String newLine = System.getProperty("line.separator");

				switch (str) {
				case "MATH02":
					saisie = 1;
					System.out.println("Quelle est ta note au partiel 1 ?");
					double notePartielUnMath02 = (sc.nextDouble()) * 0.30;
					System.out.println("Quelle est ta note au partiel 2 ?");
					double notePartielDeuxMath02 = (sc.nextDouble()) * 0.30;
					System.out.println("Quelle est ta note moyenne des TP ?");
					double noteTPMath02 = (sc.nextDouble()) * 0.10;
					double noteTotalMath02 = 10;
					double noteFinalMath02 = (noteTotalMath02 - noteTPMath02 - notePartielUnMath02 - notePartielDeuxMath02) / 0.5;
					if (noteFinalMath02 > 5) {
						System.out.println("Tu dois avoir au moins " + noteFinalMath02 + " au final pour valider l'UE...");
					System.out.println("Bon courage !" + newLine);
					}
					else {
						System.out.println("Tu dois avoir au moins 5 au final pour valider l'UE...");
						System.out.println("Soit la note éliminatoire. T'es tranquille si tu fais pas n'importe quoi !" + newLine);
					}
					break;

				case "SY01":
					saisie = 1;
					System.out.println("Quelle est ta note au partiel 1 ?");
					double notePartielUnSY01 = (sc.nextDouble()) * 0.25;
					System.out.println("Quelle est ta note au partiel 2 ?");
					double notePartielDeuxSY01 = (sc.nextDouble()) * 0.35;
					double noteTotalSY01 = 10;
					double noteFinalSY01 = (noteTotalSY01 - notePartielUnSY01 - notePartielDeuxSY01) / 0.4;
					if (noteFinalSY01 > 7) {
						System.out
								.println("Tu dois avoir au moins " + noteFinalSY01 + " au final pour valider l'UE...");
						System.out.println("Allez tu peux le faire !" + newLine);
					} else {
						System.out.println("Tu dois avoir au moins 7 au final pour valider l'UE...");
						System.out.println("Soit la note éliminatoire. Easy." + newLine);
					}
					break;

				case "LO02":
					saisie = 1;
					System.out.println("Quelle est ta note au médian ?");
					double noteMedianLO02 = (sc.nextDouble()) * 0.2;
					System.out.println("Quelle est ta note au projet ?");
					double noteProjetLO02 = (sc.nextDouble()) * 0.3;
					System.out.println("Quelle est ta note au TP noté ?");
					double noteTPLO02 = (sc.nextDouble()) * 0.2;
					double noteTotalLO02 = 10;
					double noteFinalLO02 = (noteTotalLO02 - noteMedianLO02 - noteProjetLO02 - noteTPLO02) / 0.3;
					if (noteFinalLO02 > 6) {
						System.out
								.println("Tu dois avoir au moins " + noteFinalLO02 + " au final pour valider l'UE...");
						System.out.println("Allez tu peux le faire !" + newLine);
					} else {
						System.out.println("Tu dois avoir au moins 6 au final pour valider l'UE...");
						System.out.println("Soit la note éliminatoire. Reste focus et ça passe !	" + newLine);
					}
					break;
				default:
					System.out.println(
							"En fait t'as le choix que entre MATH02, SY01 et LO02. Oublie pas les majuscules.");
				}
			}
			Scanner newsc = new Scanner(System.in);
			System.out.println("Tu veux estimer une autre UE ? (oui/non)");
			String another = newsc.nextLine();
			
			if (another.equals("non")) {
				exec = 1;
				System.out.println("FIN DU PROGRAMME");
			}
		}
	}
}
