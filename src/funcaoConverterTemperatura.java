import javax.swing.JOptionPane;

public class funcaoConverterTemperatura {
	
	public void ConverterCelsiusParaKelvin(double valorRecebido) {
		double temperaturaKelvin = valorRecebido + 273.15;
		temperaturaKelvin = (double)Math.round(temperaturaKelvin *100d)/100;
		JOptionPane.showMessageDialog(null, "A temperatura é " + temperaturaKelvin + " K");
	}
	
	public void ConverterCelsiusParaFahrenheit(double valorRecebido) {
		double temperaturaFahrenheit = ((valorRecebido * 9) / 5) + 32;
		temperaturaFahrenheit = (double)Math.round(temperaturaFahrenheit *100d)/100;
		JOptionPane.showMessageDialog(null, "A temperatura é " + temperaturaFahrenheit + " °F");
	}

}
