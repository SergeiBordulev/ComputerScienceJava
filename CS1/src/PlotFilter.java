
public class PlotFilter {
	public static void main(String[] args) {
		// Масштабирование по первым четырем значениям
		double x0 = StdIn.readDouble();
		double y0 = StdIn.readDouble();
		double x1 = StdIn.readDouble();
		double y1 = StdIn.readDouble();
		StdDraw.setXscale(x0, x1);
		StdDraw.setXscale(y0, y1);
		// Чтение координат и вывод точек средствами стандартной графики
		while(!StdIn.isEmpty()) {
			double x = StdIn.readDouble();
			double y = StdIn.readDouble();
			StdDraw.point(x, y);
		}
	}
}
