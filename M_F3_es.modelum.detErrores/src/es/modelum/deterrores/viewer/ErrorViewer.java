package es.modelum.deterrores.viewer;

public class ErrorViewer {

	private int id;	
	private String type;
	private boolean apply;
	private String syntax;
	private String data;
	
	public ErrorViewer(int id, boolean apply) {
		this.id = id;
		type = "";
		this.apply = apply;
		syntax = "";
		data = "";
	}

	public int getId() { return id; }
	public void setId(int id) { this.id = id; }

	public String getType() { return type; }
	public void setType(String type) { this.type = type; }

	public boolean isApply() { return apply; }
	public void setApply(boolean apply) { this.apply = apply; }
	
	public String getSyntax() { return syntax; }
	public void setSyntax(String syntax) { this.syntax = syntax; }

	public String getData() { return data; }

	public void setData(String data) { this.data = data; }
}
