package entities;

public class ConversorTemperatura {

	public static void celsiusParaOutrosValores(Double temp) {
		Double convertidoFahrenheit = (temp * (9.0 / 5.0)) + 32.0;
		Double convertidoKelvin = temp + 273.15;
		System.out.println("Temperatura em Fahrenheit: " + convertidoFahrenheit);
		System.out.println("Temperatura em Kelvin: " + convertidoKelvin);

	}

	public static void fahrenheitParaOutrosValores(Double temp) {
		Double convertidoCelsius = (temp - 32.0) * (5.0 / 9.0);
		Double convertidoKelvin = (temp - 32.0) * (5.0 / 9.0) + 273.15;
		System.out.println("Temperatura em Celsius: " + convertidoCelsius);
		System.out.println("Temperatura em Kelvin: " + convertidoKelvin);
	}

	public static void kelvinParaOutrosValores(Double temp) {
		Double convertidoCelsius = temp - 273.15;
		Double convertidoFahrenheit = (temp - 273.15) * (9.0 / 5.0) + 32.0;
		System.out.println("Temperatura em Celsius: " + convertidoCelsius);
		System.out.println("Temperatura em Fahrenheit: " + convertidoFahrenheit);
	}
}
