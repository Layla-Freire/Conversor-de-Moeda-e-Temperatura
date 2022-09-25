import javax.swing.JOptionPane;

public class funcaoConverter {
		
	public void ConverterReaisParaDolar(double valorRecebido) {
		double moedaDolar = valorRecebido / 5.24;
		moedaDolar = (double)Math.round(moedaDolar *100d)/100;
		JOptionPane.showMessageDialog(null, "Você tem $ " + moedaDolar + " Dolares");
	}
	
	public void ConverterReaisParaEuro(double valorRecebidoEuro) {
		double moedaEuro = valorRecebidoEuro / 5.09;
		moedaEuro = (double)Math.round(moedaEuro *100d)/100;
		JOptionPane.showMessageDialog(null, "Você tem € " + moedaEuro + " Euros");
	}
	
	public void ConverterReaisParaLibrasEsterlinas(double valorRecebidoLibras) {
		double moedaLibras = valorRecebidoLibras / 5.70;
		moedaLibras = (double)Math.round(moedaLibras *100d)/100;
		JOptionPane.showMessageDialog(null, "Você tem £ " + moedaLibras + " Libras Esterlinas");
	}
	
	public void ConverterReaisParaPesoArgentino(double valorRecebidoPesoArgentino) {
		double moedaPesoArgentino = valorRecebidoPesoArgentino / 0.04;
		moedaPesoArgentino = (double)Math.round(moedaPesoArgentino *100d)/100;
		JOptionPane.showMessageDialog(null, "Você tem $ " + moedaPesoArgentino + " Peso Argentino");
	}
	
	public void ConverterReaisParaPesoChileno(double valorRecebidoPesoChileno) {
		double moedaPesoChileno = valorRecebidoPesoChileno / 0.005;
		moedaPesoChileno = (double)Math.round(moedaPesoChileno *100d)/100;
		JOptionPane.showMessageDialog(null, "Você tem CLP$ " + moedaPesoChileno + " Peso Chileno");
	}
	
}
