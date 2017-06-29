package es.modelum.deterrores.viewer;

import java.util.ArrayList;
import java.util.List;

import es.modelum.deterrores.viewer.ErrorViewer;

public class ErrorsViewer {

	private static ErrorsViewer content;
	private List<ErrorViewer> errors;

	private ErrorsViewer() {
		errors = new ArrayList<ErrorViewer>();
	}

	public static synchronized ErrorsViewer getInstance() {
		if (content != null) {
			return content;
		}
		content = new ErrorsViewer();
		return content;
	}

	public List<ErrorViewer> getErrors() {
		return errors;
	}
	
	public void addError(ErrorViewer error) {
		errors.add(error);
	}
	
	public void remove() {
		errors.clear();
	}
}
