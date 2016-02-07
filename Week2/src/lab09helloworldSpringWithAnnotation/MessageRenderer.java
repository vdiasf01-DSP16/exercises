package lab09helloworldSpringWithAnnotation;

/**
 * The MessageRender interface.
 * 
 * @author Vasco
 *
 */
public interface MessageRenderer {
	/**
	 * The Render method.
	 */
    void render();
    
    // The set and get messageProvider will be done by using autowire. 
}
