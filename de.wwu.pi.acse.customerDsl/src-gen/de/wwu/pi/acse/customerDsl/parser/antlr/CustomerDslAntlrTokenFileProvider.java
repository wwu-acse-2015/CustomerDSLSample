/*
 * generated by Xtext
 */
package de.wwu.pi.acse.customerDsl.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class CustomerDslAntlrTokenFileProvider implements IAntlrTokenFileProvider {
	
	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
    	return classLoader.getResourceAsStream("de/wwu/pi/acse/customerDsl/parser/antlr/internal/InternalCustomerDsl.tokens");
	}
}
