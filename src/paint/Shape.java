package paint;

public abstract class Shape implements Drawable {
	private String lineColor;
	private String FillColor;
	
	public String getLineColor() {
		return lineColor;
	}

	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
	}

	public String getFillColor() {
		return FillColor;
	}

	public void setFillColor(String fillColor) {
		FillColor = fillColor;
	}
	
}