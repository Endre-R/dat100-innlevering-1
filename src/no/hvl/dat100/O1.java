package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class O1 {

	public static void main(String[] args) {

		String lønnTxt = showInputDialog("Brutto Lønn");
		int lønn = Integer.parseInt(lønnTxt);

		while (lønn < 0) {
			showMessageDialog(null, "Ugyldig lønn. Prøv igjen.");
			lønnTxt = showInputDialog("Brutto Lønn:");
			lønn = Integer.parseInt(lønnTxt);

		}

		if (lønn >= 0 && lønn <= 208050) {
			showMessageDialog(null, "Skatt å betale: " + (lønn * 0));
		} else if (lønn >= 208051 && lønn <= 292850) {
			long x = Math.round(lønn * 0.017);
			showMessageDialog(null, "Skatt å betale: " + x);
		} else if (lønn >= 292851 && lønn <= 670000) {
			long x1 = Math.round(lønn * 0.04);
			showMessageDialog(null, "Skatt å betale: " + x1);
		} else if (lønn >= 670001 && lønn <= 937900) {
			long x2 = Math.round(lønn * 0.136);
			showMessageDialog(null, "Skatt å betale: " + x2);
		} else if (lønn >= 937901 && lønn <= 1350000) {
			long x3 = Math.round(lønn * 0.166);
			showMessageDialog(null, "Skatt å betale: " + x3);
		} else if (lønn >= 1350001) {
			long x4 = Math.round(lønn * 0.176);
			showMessageDialog(null, "Skatt å betale: " + x4);
		}

	}
}
