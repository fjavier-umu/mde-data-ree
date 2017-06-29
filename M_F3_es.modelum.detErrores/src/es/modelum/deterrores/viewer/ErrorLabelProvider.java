package es.modelum.deterrores.viewer;

import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Image;

import es.modelum.deterrores.viewer.ErrorViewer;

public class ErrorLabelProvider extends LabelProvider implements ITableLabelProvider {

	@Override
	public Image getColumnImage(Object element, int columnIndex) {
		return null;
	}

	@Override
	public String getColumnText(Object element, int columnIndex) {
		ErrorViewer error = (ErrorViewer) element;
		switch (columnIndex) {
		case 0:
			return String.valueOf(error.getId());
		case 1:
			return error.getType();
		case 2:
			return String.valueOf(error.isApply());
		default:
			throw new RuntimeException("Should not happen");
		}

	}

}

