package view;
import javax.swing.JOptionPane;

import controller.FatController;
public class main {

	public static void main(String[] args) throws Exception {
		FatController fatController = new FatController();
		
		int num =Integer.parseInt(JOptionPane.showInputDialog("Calcular o fatorial de: "));
		
		while (num < 0 || num > 10) {
			 num =Integer.parseInt(JOptionPane.showInputDialog("Insira um núemero de 0 a 10 "));
		}
		System.out.println(fatController.fatorial(num) );
	}

}
