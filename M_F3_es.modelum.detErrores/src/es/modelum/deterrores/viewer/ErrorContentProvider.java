package es.modelum.deterrores.viewer;

import java.util.List;

import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.Viewer;

import es.modelum.deterrores.viewer.ErrorViewer;

public class ErrorContentProvider implements IStructuredContentProvider {

	@Override
	public Object[] getElements(Object inputElement) {
		@SuppressWarnings("unchecked")
		List<ErrorViewer> errors = (List<ErrorViewer>) inputElement;
		return errors.toArray();
	}

	@Override
	public void dispose() {
	}

	@Override
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
	}

}

