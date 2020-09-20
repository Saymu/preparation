package h_generic;

public class GenericBox<ELEMENT /* extends Person  -Restriction de typage- */> {

	private ELEMENT element;

	public GenericBox(ELEMENT element) {
		this.setElement(element);
	}

	public ELEMENT getElement() {
		return element;
	}

	public void setElement(ELEMENT element) {
		if (element == null)
			throw new NullPointerException("null is not permit");
		this.element = element;
	}

}
