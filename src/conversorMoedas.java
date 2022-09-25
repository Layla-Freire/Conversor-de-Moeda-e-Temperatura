
import javax.swing.JOptionPane;

public class conversorMoedas {
	public static void main(String[] args) {
		
		funcaoConverter converter = new funcaoConverter();
		funcaoConverterTemperatura converterTemperatura = new funcaoConverterTemperatura();
		
		while (true) {
			String opcao = JOptionPane.showInputDialog(null, "Escolha uma opção", "Menu", JOptionPane.PLAIN_MESSAGE, null, new Object[] { "Conversor de Moeda", "Conversor de Temperatura" }, "Escolha").toString();
			switch(opcao) {
				case "Conversor de Moeda":
					String opcaoMoeda = JOptionPane.showInputDialog(null, "Escolha uma opção", "Menu", JOptionPane.PLAIN_MESSAGE, null, new Object[] { "Converter de Reais Para Dólar", "Converter de Reais para Euro", "Converter de Reais para Libras Esterlinas", "Converter de Reais para Peso Argentino", "Converter de Reais para Peso Chileno" }, "Escolha").toString();
					switch(opcaoMoeda) {
					case "Converter de Reais Para Dólar":
						String input = JOptionPane.showInputDialog("Insira um valor em Reais");
						double valorRecebido = Double.parseDouble(input);
						converter.ConverterReaisParaDolar(valorRecebido);
						
						int valorMoedaDolar = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
						
						if (valorMoedaDolar == JOptionPane.YES_OPTION) {

							break; // volta para as opçoes

						} else if (valorMoedaDolar == JOptionPane.NO_OPTION) {

							JOptionPane.showMessageDialog(null, "O programa será finalizado!");

							System.exit(valorMoedaDolar);
							break;


						} else if (valorMoedaDolar == JOptionPane.CANCEL_OPTION) {

							JOptionPane.showMessageDialog(null, "Programa concluido!");
							System.exit(valorMoedaDolar);
							break;
							
						}
						
					case "Converter de Reais para Euro": 
						String inputEuro = JOptionPane.showInputDialog("Insira um valor em Reais");
						double valorRecebidoEuro = Double.parseDouble(inputEuro);
						converter.ConverterReaisParaEuro(valorRecebidoEuro);
						
						int valorMoedaEuro = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
						
						if (valorMoedaEuro == JOptionPane.YES_OPTION) {

							break; // volta para as opçoes

						} else if (valorMoedaEuro == JOptionPane.NO_OPTION) {

							JOptionPane.showMessageDialog(null, "O programa será finalizado!");

							System.exit(valorMoedaEuro);
							break;


						} else if (valorMoedaEuro == JOptionPane.CANCEL_OPTION) {

							JOptionPane.showMessageDialog(null, "Programa concluido!");
							System.exit(valorMoedaEuro);
							break;
							
						}
						
					case "Converter de Reais para Libras Esterlinas": 
						String inputLibras = JOptionPane.showInputDialog("Insira um valor em Reais");
						double valorRecebidoLibras = Double.parseDouble(inputLibras);
						converter.ConverterReaisParaLibrasEsterlinas(valorRecebidoLibras);
						
						int valorMoedaLibras = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
						
						if (valorMoedaLibras == JOptionPane.YES_OPTION) {

							break; // volta para as opçoes

						} else if (valorMoedaLibras == JOptionPane.NO_OPTION) {

							JOptionPane.showMessageDialog(null, "O programa será finalizado!");

							System.exit(valorMoedaLibras);
							break;


						} else if (valorMoedaLibras == JOptionPane.CANCEL_OPTION) {

							JOptionPane.showMessageDialog(null, "Programa concluido!");
							System.exit(valorMoedaLibras);
							break;
							
						}
					
					case "Converter de Reais para Peso Argentino": 
						String inputPesoArgentino = JOptionPane.showInputDialog("Insira um valor em Reais");
						double valorRecebidoPesoArgentino = Double.parseDouble(inputPesoArgentino);
						converter.ConverterReaisParaPesoArgentino(valorRecebidoPesoArgentino);
						
						int valorMoedaPeso = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
						
						if (valorMoedaPeso == JOptionPane.YES_OPTION) {

							break; // volta para as opçoes

						} else if (valorMoedaPeso == JOptionPane.NO_OPTION) {

							JOptionPane.showMessageDialog(null, "O programa será finalizado!");

							System.exit(valorMoedaPeso);
							break;


						} else if (valorMoedaPeso == JOptionPane.CANCEL_OPTION) {

							JOptionPane.showMessageDialog(null, "Programa concluido!");
							System.exit(valorMoedaPeso);
							break;
							
						}
						
					case "Converter de Reais para Peso Chileno": 
						String inputPesoChileno = JOptionPane.showInputDialog("Insira um valor em Reais");
						double valorRecebidoPesoChileno = Double.parseDouble(inputPesoChileno);
						converter.ConverterReaisParaPesoChileno(valorRecebidoPesoChileno);
						
						int valorMoedaPesoChileno = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
						
						if (valorMoedaPesoChileno == JOptionPane.YES_OPTION) {

							break; // volta para as opçoes

						} else if (valorMoedaPesoChileno == JOptionPane.NO_OPTION) {

							JOptionPane.showMessageDialog(null, "O programa será finalizado!");

							System.exit(valorMoedaPesoChileno);
							break;


						} else if (valorMoedaPesoChileno == JOptionPane.CANCEL_OPTION) {

							JOptionPane.showMessageDialog(null, "Programa concluido!");
							System.exit(valorMoedaPesoChileno);
							break;
							
						}
					}
				case "Conversor de Temperatura":
					String opcaoTemperatura = JOptionPane.showInputDialog(null, "Escolha uma opção", "Menu", JOptionPane.PLAIN_MESSAGE, null, new Object[] { "Converter de Celsius Para Kelvin", "Converter de Celsius para Fahrenheit" }, "Escolha").toString();
					switch(opcaoTemperatura) {
					case "Converter de Celsius Para Kelvin": 
						String inputTemperaturaKelvin = JOptionPane.showInputDialog("Insira um valor em Celsius");
						double valorRecebidoKelvin = Double.parseDouble(inputTemperaturaKelvin);
						converterTemperatura.ConverterCelsiusParaKelvin(valorRecebidoKelvin);
						
						int valorTemperaturaKelvin = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
						
						if (valorTemperaturaKelvin == JOptionPane.YES_OPTION) {

							break; // volta para as opçoes

						} else if (valorTemperaturaKelvin == JOptionPane.NO_OPTION) {

							JOptionPane.showMessageDialog(null, "O programa será finalizado!");

							System.exit(valorTemperaturaKelvin);
							break;


						} else if (valorTemperaturaKelvin == JOptionPane.CANCEL_OPTION) {

							JOptionPane.showMessageDialog(null, "Programa concluido!");
							System.exit(valorTemperaturaKelvin);
							break;
							
						} 
					
						
					case "Converter de Celsius para Fahrenheit": 
						String inputTemperaturaFahrenheit = JOptionPane.showInputDialog("Insira um valor em Reais");
						double valorRecebidoFahrenheit = Double.parseDouble(inputTemperaturaFahrenheit);
						converterTemperatura.ConverterCelsiusParaFahrenheit(valorRecebidoFahrenheit);
						
						int valorTemperaturaFahrenheit = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
						
						if (valorTemperaturaFahrenheit == JOptionPane.YES_OPTION) {

							break; // volta para as opçoes

						} else if (valorTemperaturaFahrenheit == JOptionPane.NO_OPTION) {

							JOptionPane.showMessageDialog(null, "O programa será finalizado!");

							System.exit(valorTemperaturaFahrenheit);
							break;


						} else if (valorTemperaturaFahrenheit == JOptionPane.CANCEL_OPTION) {

							JOptionPane.showMessageDialog(null, "Programa concluido!");
							System.exit(valorTemperaturaFahrenheit);
							break;
							
						} 
					}
					
			}
		}	
	}
}
