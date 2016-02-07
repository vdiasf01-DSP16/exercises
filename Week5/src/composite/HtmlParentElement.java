package composite;

import java.util.ArrayList;
import java.util.List;

/**
 * The Html Parent Element
 * 
 * @author Vasco
 *
 */
public class HtmlParentElement extends HtmlTag {
	
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
	 * The children list.
	 */
	private ArrayList<HtmlTag> list;

	/**
	 * Constructor.
	 * 
	 * @param tagName
	 */
	public HtmlParentElement(String tagName) {
		this.tagName = tagName;
		this.list = new ArrayList<>();
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
	public void addChildTag(HtmlTag htmlTag) { 
		list.add(htmlTag);
	}

	/**
	 * {@inheritDoc}
	 */
	public void removeChildTag(HtmlTag htmlTag) { 
		list.remove(htmlTag);
	}
	
	/**
	 * {@inheritDoc}
	 */
	public List<HtmlTag> getChildren() { 
		return list;
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public void generateHtml() {
		System.out.println(startTagName);
		
		for( HtmlTag tag : list ) {
			tag.generateHtml();
		}
		
		System.out.println(endTagName);
    }
}
