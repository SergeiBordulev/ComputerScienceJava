// Программа, которая получает числа типа double x , v и t в аргументах командной строки и выводит значение x + v*t - gt^2 / 2, 
// где g - константа 9,80665.
// Примечание: Значение определяет путь в метрах, пройденный за t секунд брошенный вертикально вверх объектом, 
// из исходной позиции x со скоростью v метров в секунду.

public class Example_1_2_22 {

	public static void main(String[] args) {
		double x = Double.parseDouble(args[0]);
		double v = Double.parseDouble(args[1]);
		double t = Double.parseDouble(args[2]);
		double g = 9.80665;
		
		System.out.println(x + (v*t) - ((Math.sqrt(g * t))/2));

	}
}
