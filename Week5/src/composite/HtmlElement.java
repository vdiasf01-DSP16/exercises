package composite;

/**
 * The Html Element.
 * 
 * @author Vasco
 *
 */
public class HtmlElement extends HtmlTag {

	/**
	 * The tag name.
	 */
	private String tagName;
	
	/**
	 * The start tag name.
	 */
	private String startTagName;
	
	/**
	 * The end tag name.
	 */
	private String endTagName;

	/**
	 * The tag body.
	 */
	private String tagBody;
	
	/**
	 * Constructor.
	 * 
	 * @param tag String
	 */
	public HtmlElement(String tagName) {
		this.tagName = tagName;
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public String getTagName() {
		return tagName;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void setStartTag(String tag) {
		this.startTagName = tag;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void setEndTag(String tag) {
		this.endTagName = tag;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void setTagBody(String tag) {
		this.tagBody = tag;
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public void generateHtml() {
		System.out.println(startTagName+tagBody+endTagName);
	}
}
