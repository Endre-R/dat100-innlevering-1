package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class O2 {

	public static void main(String[] args) {

		for (int i = 1; i <= 3; i++) {

			String poengTxt = showInputDialog("Angi poengsum for student nr.:" + i);
			int p = Integer.parseInt(poengTxt);

			while (p < 0 || p > 100) {
				showMessageDialog(null, "Ugyldig poengsum. Prøv igjen.");
				poengTxt = showInputDialog("Angi poengsum for student nr.: " + i);
				p = Integer.parseInt(poengTxt);
			}

			if (p >= 90 && p <= 100)
				showMessageDialog(null, "Karakter for student " + i + " er: A");
			else if (p >= 80)
				showMessageDialog(null, "Karakter for student " + i + " er: B");
			else if (p >= 60)
				showMessageDialog(null, "Karakter for student " + i + " er: C");
			else if (p >= 50)
				showMessageDialog(null, "Karakter for student " + i + " er: D");
			else if (p >= 40)
				showMessageDialog(null, "Karakter for student " + i + " er: E");
			else
				showMessageDialog(null, "Karakter for student " + i + " er: F");
		}
	}
}
