package composite;

import java.util.List;

/**
 * The HtmlTag abstract class.
 * 
 * @author Vasco
 *
 */
public abstract class HtmlTag {

	/**
	 * The tag name.
	 * 
	 * @return name String
	 */
	public abstract String getTagName();
	
	/**
	 * Setting the staring tag name.
	 * 
	 * @param tag String
	 */
	public abstract void setStartTag(String tag);
	
	/**
	 * Setting the ending tag name.
	 * 
	 * @param tag String
	 */
	public abstract void setEndTag(String tag);

	/**
	 * Setting the tag body name.
	 * 
	 * @param tagBody String
	 */
	public void setTagBody(String tagBody) { 
		throw new UnsupportedOperationException("Current operation is not support - for this object"); 
    }

	/**
	 * Adding a child tag.
	 * 
	 * @param htmlTag HtmlTag
	 */
	public void addChildTag(HtmlTag htmlTag) { 
		throw new UnsupportedOperationException("Current operation is not support - for this object"); 
	}

	/**
	 * Removing a child tag
	 * 
	 * @param htmlTag HtmlTag
	 */
	public void removeChildTag(HtmlTag htmlTag) { 
		throw new UnsupportedOperationException("Current operation is not support - for this object"); 
	}
	
	/**
	 * Retrieving the list of HtmlTag children.
	 * 
	 * @return List HtmlTag
	 */
	public List<HtmlTag> getChildren() { 
		throw new UnsupportedOperationException("Current operation is not support - for this object"); 
	}

	/**
	 * Generating the html.
	 */
	public abstract void generateHtml();

}
