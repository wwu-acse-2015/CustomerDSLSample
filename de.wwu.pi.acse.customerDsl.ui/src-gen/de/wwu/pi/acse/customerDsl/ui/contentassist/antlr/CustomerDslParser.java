/*
 * generated by Xtext
 */
package de.wwu.pi.acse.customerDsl.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import de.wwu.pi.acse.customerDsl.services.CustomerDslGrammarAccess;

public class CustomerDslParser extends AbstractContentAssistParser {
	
	@Inject
	private CustomerDslGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected de.wwu.pi.acse.customerDsl.ui.contentassist.antlr.internal.InternalCustomerDslParser createParser() {
		de.wwu.pi.acse.customerDsl.ui.contentassist.antlr.internal.InternalCustomerDslParser result = new de.wwu.pi.acse.customerDsl.ui.contentassist.antlr.internal.InternalCustomerDslParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getAddressAccess().getAlternatives(), "rule__Address__Alternatives");
					put(grammarAccess.getOrderChannelAccess().getAlternatives(), "rule__OrderChannel__Alternatives");
					put(grammarAccess.getCustomerDbAccess().getGroup(), "rule__CustomerDb__Group__0");
					put(grammarAccess.getCustomerAccess().getGroup(), "rule__Customer__Group__0");
					put(grammarAccess.getStreetAddressAccess().getGroup(), "rule__StreetAddress__Group__0");
					put(grammarAccess.getStreetAddressAccess().getGroup_3_0(), "rule__StreetAddress__Group_3_0__0");
					put(grammarAccess.getStreetAddressAccess().getGroup_3_1(), "rule__StreetAddress__Group_3_1__0");
					put(grammarAccess.getStreetAddressAccess().getGroup_3_2(), "rule__StreetAddress__Group_3_2__0");
					put(grammarAccess.getPOBoxAccess().getGroup(), "rule__POBox__Group__0");
					put(grammarAccess.getOrderAccess().getGroup(), "rule__Order__Group__0");
					put(grammarAccess.getOrderAccess().getGroup_7(), "rule__Order__Group_7__0");
					put(grammarAccess.getProductAccess().getGroup(), "rule__Product__Group__0");
					put(grammarAccess.getCustomerDbAccess().getCustomersAssignment_0(), "rule__CustomerDb__CustomersAssignment_0");
					put(grammarAccess.getCustomerDbAccess().getOrdersAssignment_1(), "rule__CustomerDb__OrdersAssignment_1");
					put(grammarAccess.getCustomerDbAccess().getProductsAssignment_2(), "rule__CustomerDb__ProductsAssignment_2");
					put(grammarAccess.getCustomerAccess().getNameAssignment_1(), "rule__Customer__NameAssignment_1");
					put(grammarAccess.getCustomerAccess().getFullNameAssignment_4(), "rule__Customer__FullNameAssignment_4");
					put(grammarAccess.getCustomerAccess().getAddressesAssignment_5(), "rule__Customer__AddressesAssignment_5");
					put(grammarAccess.getStreetAddressAccess().getNameAssignment_1(), "rule__StreetAddress__NameAssignment_1");
					put(grammarAccess.getStreetAddressAccess().getStreetAssignment_3_0_1(), "rule__StreetAddress__StreetAssignment_3_0_1");
					put(grammarAccess.getStreetAddressAccess().getCityAssignment_3_1_1(), "rule__StreetAddress__CityAssignment_3_1_1");
					put(grammarAccess.getStreetAddressAccess().getZipAssignment_3_2_1(), "rule__StreetAddress__ZipAssignment_3_2_1");
					put(grammarAccess.getPOBoxAccess().getNameAssignment_1(), "rule__POBox__NameAssignment_1");
					put(grammarAccess.getPOBoxAccess().getNumberAssignment_4(), "rule__POBox__NumberAssignment_4");
					put(grammarAccess.getPOBoxAccess().getZipAssignment_6(), "rule__POBox__ZipAssignment_6");
					put(grammarAccess.getOrderAccess().getNameAssignment_1(), "rule__Order__NameAssignment_1");
					put(grammarAccess.getOrderAccess().getCustomerAssignment_4(), "rule__Order__CustomerAssignment_4");
					put(grammarAccess.getOrderAccess().getAddressAssignment_6(), "rule__Order__AddressAssignment_6");
					put(grammarAccess.getOrderAccess().getChannelAssignment_7_1(), "rule__Order__ChannelAssignment_7_1");
					put(grammarAccess.getProductAccess().getNameAssignment_1(), "rule__Product__NameAssignment_1");
					put(grammarAccess.getProductAccess().getPriceAssignment_2(), "rule__Product__PriceAssignment_2");
					put(grammarAccess.getStreetAddressAccess().getUnorderedGroup_3(), "rule__StreetAddress__UnorderedGroup_3");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			de.wwu.pi.acse.customerDsl.ui.contentassist.antlr.internal.InternalCustomerDslParser typedParser = (de.wwu.pi.acse.customerDsl.ui.contentassist.antlr.internal.InternalCustomerDslParser) parser;
			typedParser.entryRuleCustomerDb();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public CustomerDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(CustomerDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}