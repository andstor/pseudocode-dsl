/*
 * generated by Xtext 2.23.0
 */
package tdt4250.pseudocode.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class PcodeAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("tdt4250/pseudocode/parser/antlr/internal/InternalPcodeParser.tokens");
	}
}
