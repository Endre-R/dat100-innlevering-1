package no.hvl.dat100;

import static javax.swing.JOptionPane.showInputDialog;

import static javax.swing.JOptionPane.showMessageDialog;

public class O3 {

	public static void main(String[] args) {

		String nTxt = showInputDialog("Gi et tall");
		int n = Integer.parseInt(nTxt);

		int fakultet = 1;
		for (int i = 1; i <= n; i++) {
			fakultet = i * fakultet;
		}

		showMessageDialog(null, "Fakultet av  " + n + "  er: " + fakultet);

	}
}
