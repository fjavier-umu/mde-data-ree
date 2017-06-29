package es.modelum.deterrores.viewer;

import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.CheckboxCellEditor;
import org.eclipse.jface.viewers.ColumnViewer;
import org.eclipse.jface.viewers.EditingSupport;
import org.eclipse.swt.SWT;

import es.modelum.deterrores.viewer.ErrorViewer;

public class ErrorEditor extends EditingSupport {
	private CellEditor editor;
	private int column;

	public ErrorEditor(ColumnViewer viewer, int column) {
		super(viewer);

		// Create the correct editor based on the column index
		switch (column) {
		case 2:
			editor = new CheckboxCellEditor(null, SWT.CHECK | SWT.READ_ONLY);
			break;
		default:
			break;
		}
		this.column = column;
	}

	@Override
	protected boolean canEdit(Object element) {
		return true;
	}

	@Override
	protected CellEditor getCellEditor(Object element) {
		return editor;
	}

	@Override
	protected Object getValue(Object element) {
		ErrorViewer error = (ErrorViewer) element;

		switch (this.column) {
		/*case 0:
			return error.getId();
		case 1:
			return error.getType();*/
		case 2:
			return error.isApply();
		default:
			break;
		}
		return null;
	}

	@Override
	protected void setValue(Object object, Object value) {
		ErrorViewer error = (ErrorViewer) object;

		switch (this.column) {
		/*case 0:
			error.setId((Integer)value);
			break;
		case 1:
			error.setType(String.valueOf(value));
			break;*/
		case 2:
			error.setApply((Boolean)value);
			break;
		default:
			break;
		}
		getViewer().update(object, null);
	}

}
