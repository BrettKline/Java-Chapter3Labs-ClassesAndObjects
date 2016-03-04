
public class Widget {
	private int numWidgets;
	private double widgetDays;

	public Widget(int numWidgets) {
		final double WIDGETS_PER_DAY = 160;
		this.numWidgets = numWidgets;
		widgetDays = numWidgets / WIDGETS_PER_DAY;
	}

	public int getNumWidgets() {
		return numWidgets;
	}

	public double getWidgetDays() {
		return widgetDays;
	}
}
