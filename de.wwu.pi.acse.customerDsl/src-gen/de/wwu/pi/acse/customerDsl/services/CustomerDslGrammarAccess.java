/*
 * generated by Xtext
 */
package de.wwu.pi.acse.customerDsl.services;

import com.google.inject.Singleton;
import com.google.inject.Inject;

import java.util.List;

import org.eclipse.xtext.*;
import org.eclipse.xtext.service.GrammarProvider;
import org.eclipse.xtext.service.AbstractElementFinder.*;

import org.eclipse.xtext.common.services.TerminalsGrammarAccess;

@Singleton
public class CustomerDslGrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class CustomerDbElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "CustomerDb");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cCustomersAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cCustomersCustomerParserRuleCall_0_0 = (RuleCall)cCustomersAssignment_0.eContents().get(0);
		private final Assignment cOrdersAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cOrdersOrderParserRuleCall_1_0 = (RuleCall)cOrdersAssignment_1.eContents().get(0);
		private final Assignment cProductsAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cProductsProductParserRuleCall_2_0 = (RuleCall)cProductsAssignment_2.eContents().get(0);
		
		//CustomerDb:
		//	customers+=Customer* orders+=Order* products+=Product*;
		@Override public ParserRule getRule() { return rule; }

		//customers+=Customer* orders+=Order* products+=Product*
		public Group getGroup() { return cGroup; }

		//customers+=Customer*
		public Assignment getCustomersAssignment_0() { return cCustomersAssignment_0; }

		//Customer
		public RuleCall getCustomersCustomerParserRuleCall_0_0() { return cCustomersCustomerParserRuleCall_0_0; }

		//orders+=Order*
		public Assignment getOrdersAssignment_1() { return cOrdersAssignment_1; }

		//Order
		public RuleCall getOrdersOrderParserRuleCall_1_0() { return cOrdersOrderParserRuleCall_1_0; }

		//products+=Product*
		public Assignment getProductsAssignment_2() { return cProductsAssignment_2; }

		//Product
		public RuleCall getProductsProductParserRuleCall_2_0() { return cProductsProductParserRuleCall_2_0; }
	}

	public class CustomerElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Customer");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cCustomerKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cNameKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cFullNameAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cFullNameSTRINGTerminalRuleCall_4_0 = (RuleCall)cFullNameAssignment_4.eContents().get(0);
		private final Assignment cAddressesAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cAddressesAddressParserRuleCall_5_0 = (RuleCall)cAddressesAssignment_5.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//Customer:
		//	"Customer" name=ID "{" "name" fullName=STRING addresses+=Address+ "}";
		@Override public ParserRule getRule() { return rule; }

		//"Customer" name=ID "{" "name" fullName=STRING addresses+=Address+ "}"
		public Group getGroup() { return cGroup; }

		//"Customer"
		public Keyword getCustomerKeyword_0() { return cCustomerKeyword_0; }

		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }

		//"name"
		public Keyword getNameKeyword_3() { return cNameKeyword_3; }

		//fullName=STRING
		public Assignment getFullNameAssignment_4() { return cFullNameAssignment_4; }

		//STRING
		public RuleCall getFullNameSTRINGTerminalRuleCall_4_0() { return cFullNameSTRINGTerminalRuleCall_4_0; }

		//addresses+=Address+
		public Assignment getAddressesAssignment_5() { return cAddressesAssignment_5; }

		//Address
		public RuleCall getAddressesAddressParserRuleCall_5_0() { return cAddressesAddressParserRuleCall_5_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_6() { return cRightCurlyBracketKeyword_6; }
	}

	public class AddressElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Address");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cStreetAddressParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cPOBoxParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//Address:
		//	StreetAddress | POBox;
		@Override public ParserRule getRule() { return rule; }

		//StreetAddress | POBox
		public Alternatives getAlternatives() { return cAlternatives; }

		//StreetAddress
		public RuleCall getStreetAddressParserRuleCall_0() { return cStreetAddressParserRuleCall_0; }

		//POBox
		public RuleCall getPOBoxParserRuleCall_1() { return cPOBoxParserRuleCall_1; }
	}

	public class StreetAddressElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "StreetAddress");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cAddressKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final UnorderedGroup cUnorderedGroup_3 = (UnorderedGroup)cGroup.eContents().get(3);
		private final Group cGroup_3_0 = (Group)cUnorderedGroup_3.eContents().get(0);
		private final Keyword cStreetKeyword_3_0_0 = (Keyword)cGroup_3_0.eContents().get(0);
		private final Assignment cStreetAssignment_3_0_1 = (Assignment)cGroup_3_0.eContents().get(1);
		private final RuleCall cStreetSTRINGTerminalRuleCall_3_0_1_0 = (RuleCall)cStreetAssignment_3_0_1.eContents().get(0);
		private final Group cGroup_3_1 = (Group)cUnorderedGroup_3.eContents().get(1);
		private final Keyword cCityKeyword_3_1_0 = (Keyword)cGroup_3_1.eContents().get(0);
		private final Assignment cCityAssignment_3_1_1 = (Assignment)cGroup_3_1.eContents().get(1);
		private final RuleCall cCitySTRINGTerminalRuleCall_3_1_1_0 = (RuleCall)cCityAssignment_3_1_1.eContents().get(0);
		private final Group cGroup_3_2 = (Group)cUnorderedGroup_3.eContents().get(2);
		private final Keyword cZipKeyword_3_2_0 = (Keyword)cGroup_3_2.eContents().get(0);
		private final Assignment cZipAssignment_3_2_1 = (Assignment)cGroup_3_2.eContents().get(1);
		private final RuleCall cZipSTRINGTerminalRuleCall_3_2_1_0 = (RuleCall)cZipAssignment_3_2_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//StreetAddress:
		//	"Address" name=ID "{" ("street" street=STRING & "city" city=STRING & "zip" zip=STRING) "}";
		@Override public ParserRule getRule() { return rule; }

		//"Address" name=ID "{" ("street" street=STRING & "city" city=STRING & "zip" zip=STRING) "}"
		public Group getGroup() { return cGroup; }

		//"Address"
		public Keyword getAddressKeyword_0() { return cAddressKeyword_0; }

		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }

		//"street" street=STRING & "city" city=STRING & "zip" zip=STRING
		public UnorderedGroup getUnorderedGroup_3() { return cUnorderedGroup_3; }

		//"street" street=STRING
		public Group getGroup_3_0() { return cGroup_3_0; }

		//"street"
		public Keyword getStreetKeyword_3_0_0() { return cStreetKeyword_3_0_0; }

		//street=STRING
		public Assignment getStreetAssignment_3_0_1() { return cStreetAssignment_3_0_1; }

		//STRING
		public RuleCall getStreetSTRINGTerminalRuleCall_3_0_1_0() { return cStreetSTRINGTerminalRuleCall_3_0_1_0; }

		//"city" city=STRING
		public Group getGroup_3_1() { return cGroup_3_1; }

		//"city"
		public Keyword getCityKeyword_3_1_0() { return cCityKeyword_3_1_0; }

		//city=STRING
		public Assignment getCityAssignment_3_1_1() { return cCityAssignment_3_1_1; }

		//STRING
		public RuleCall getCitySTRINGTerminalRuleCall_3_1_1_0() { return cCitySTRINGTerminalRuleCall_3_1_1_0; }

		//"zip" zip=STRING
		public Group getGroup_3_2() { return cGroup_3_2; }

		//"zip"
		public Keyword getZipKeyword_3_2_0() { return cZipKeyword_3_2_0; }

		//zip=STRING
		public Assignment getZipAssignment_3_2_1() { return cZipAssignment_3_2_1; }

		//STRING
		public RuleCall getZipSTRINGTerminalRuleCall_3_2_1_0() { return cZipSTRINGTerminalRuleCall_3_2_1_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
	}

	public class POBoxElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "POBox");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cPOBoxKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cNumberKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cNumberAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cNumberINTTerminalRuleCall_4_0 = (RuleCall)cNumberAssignment_4.eContents().get(0);
		private final Keyword cZipKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Assignment cZipAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cZipSTRINGTerminalRuleCall_6_0 = (RuleCall)cZipAssignment_6.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_7 = (Keyword)cGroup.eContents().get(7);
		
		//POBox:
		//	"POBox" name=ID "{" "number" number=INT "zip" zip=STRING "}";
		@Override public ParserRule getRule() { return rule; }

		//"POBox" name=ID "{" "number" number=INT "zip" zip=STRING "}"
		public Group getGroup() { return cGroup; }

		//"POBox"
		public Keyword getPOBoxKeyword_0() { return cPOBoxKeyword_0; }

		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }

		//"number"
		public Keyword getNumberKeyword_3() { return cNumberKeyword_3; }

		//number=INT
		public Assignment getNumberAssignment_4() { return cNumberAssignment_4; }

		//INT
		public RuleCall getNumberINTTerminalRuleCall_4_0() { return cNumberINTTerminalRuleCall_4_0; }

		//"zip"
		public Keyword getZipKeyword_5() { return cZipKeyword_5; }

		//zip=STRING
		public Assignment getZipAssignment_6() { return cZipAssignment_6; }

		//STRING
		public RuleCall getZipSTRINGTerminalRuleCall_6_0() { return cZipSTRINGTerminalRuleCall_6_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_7() { return cRightCurlyBracketKeyword_7; }
	}

	public class OrderElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Order");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cOrderKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cByKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cCustomerAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final CrossReference cCustomerCustomerCrossReference_4_0 = (CrossReference)cCustomerAssignment_4.eContents().get(0);
		private final RuleCall cCustomerCustomerIDTerminalRuleCall_4_0_1 = (RuleCall)cCustomerCustomerCrossReference_4_0.eContents().get(1);
		private final Keyword cToKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Assignment cAddressAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final CrossReference cAddressAddressCrossReference_6_0 = (CrossReference)cAddressAssignment_6.eContents().get(0);
		private final RuleCall cAddressAddressIDTerminalRuleCall_6_0_1 = (RuleCall)cAddressAddressCrossReference_6_0.eContents().get(1);
		private final Group cGroup_7 = (Group)cGroup.eContents().get(7);
		private final Keyword cViaKeyword_7_0 = (Keyword)cGroup_7.eContents().get(0);
		private final Assignment cChannelAssignment_7_1 = (Assignment)cGroup_7.eContents().get(1);
		private final RuleCall cChannelOrderChannelEnumRuleCall_7_1_0 = (RuleCall)cChannelAssignment_7_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_8 = (Keyword)cGroup.eContents().get(8);
		
		//Order:
		//	"Order" name=ID "{" "by" customer=[Customer] "to" address=[Address] ("via" channel=OrderChannel)? "}";
		@Override public ParserRule getRule() { return rule; }

		//"Order" name=ID "{" "by" customer=[Customer] "to" address=[Address] ("via" channel=OrderChannel)? "}"
		public Group getGroup() { return cGroup; }

		//"Order"
		public Keyword getOrderKeyword_0() { return cOrderKeyword_0; }

		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }

		//"by"
		public Keyword getByKeyword_3() { return cByKeyword_3; }

		//customer=[Customer]
		public Assignment getCustomerAssignment_4() { return cCustomerAssignment_4; }

		//[Customer]
		public CrossReference getCustomerCustomerCrossReference_4_0() { return cCustomerCustomerCrossReference_4_0; }

		//ID
		public RuleCall getCustomerCustomerIDTerminalRuleCall_4_0_1() { return cCustomerCustomerIDTerminalRuleCall_4_0_1; }

		//"to"
		public Keyword getToKeyword_5() { return cToKeyword_5; }

		//address=[Address]
		public Assignment getAddressAssignment_6() { return cAddressAssignment_6; }

		//[Address]
		public CrossReference getAddressAddressCrossReference_6_0() { return cAddressAddressCrossReference_6_0; }

		//ID
		public RuleCall getAddressAddressIDTerminalRuleCall_6_0_1() { return cAddressAddressIDTerminalRuleCall_6_0_1; }

		//("via" channel=OrderChannel)?
		public Group getGroup_7() { return cGroup_7; }

		//"via"
		public Keyword getViaKeyword_7_0() { return cViaKeyword_7_0; }

		//channel=OrderChannel
		public Assignment getChannelAssignment_7_1() { return cChannelAssignment_7_1; }

		//OrderChannel
		public RuleCall getChannelOrderChannelEnumRuleCall_7_1_0() { return cChannelOrderChannelEnumRuleCall_7_1_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_8() { return cRightCurlyBracketKeyword_8; }
	}

	public class ProductElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Product");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cProductKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameSTRINGTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Assignment cPriceAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cPriceINTTerminalRuleCall_2_0 = (RuleCall)cPriceAssignment_2.eContents().get(0);
		
		//Product:
		//	"Product" name=STRING? price=INT?;
		@Override public ParserRule getRule() { return rule; }

		//"Product" name=STRING? price=INT?
		public Group getGroup() { return cGroup; }

		//"Product"
		public Keyword getProductKeyword_0() { return cProductKeyword_0; }

		//name=STRING?
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//STRING
		public RuleCall getNameSTRINGTerminalRuleCall_1_0() { return cNameSTRINGTerminalRuleCall_1_0; }

		//price=INT?
		public Assignment getPriceAssignment_2() { return cPriceAssignment_2; }

		//INT
		public RuleCall getPriceINTTerminalRuleCall_2_0() { return cPriceINTTerminalRuleCall_2_0; }
	}
	
	
	public class OrderChannelElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "OrderChannel");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cWEBEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cWEBWebKeyword_0_0 = (Keyword)cWEBEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cMAILEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cMAILMailKeyword_1_0 = (Keyword)cMAILEnumLiteralDeclaration_1.eContents().get(0);
		private final EnumLiteralDeclaration cPHONEEnumLiteralDeclaration_2 = (EnumLiteralDeclaration)cAlternatives.eContents().get(2);
		private final Keyword cPHONEPhoneKeyword_2_0 = (Keyword)cPHONEEnumLiteralDeclaration_2.eContents().get(0);
		
		//enum OrderChannel:
		//	WEB="web" //default
		//	| MAIL="mail" | PHONE="phone";
		public EnumRule getRule() { return rule; }

		//WEB="web" //default
		//| MAIL="mail" | PHONE="phone"
		public Alternatives getAlternatives() { return cAlternatives; }

		//WEB="web"
		public EnumLiteralDeclaration getWEBEnumLiteralDeclaration_0() { return cWEBEnumLiteralDeclaration_0; }

		//"web"
		public Keyword getWEBWebKeyword_0_0() { return cWEBWebKeyword_0_0; }

		//MAIL="mail"
		public EnumLiteralDeclaration getMAILEnumLiteralDeclaration_1() { return cMAILEnumLiteralDeclaration_1; }

		//"mail"
		public Keyword getMAILMailKeyword_1_0() { return cMAILMailKeyword_1_0; }

		//PHONE="phone"
		public EnumLiteralDeclaration getPHONEEnumLiteralDeclaration_2() { return cPHONEEnumLiteralDeclaration_2; }

		//"phone"
		public Keyword getPHONEPhoneKeyword_2_0() { return cPHONEPhoneKeyword_2_0; }
	}
	
	private final CustomerDbElements pCustomerDb;
	private final CustomerElements pCustomer;
	private final AddressElements pAddress;
	private final StreetAddressElements pStreetAddress;
	private final POBoxElements pPOBox;
	private final OrderElements pOrder;
	private final OrderChannelElements unknownRuleOrderChannel;
	private final ProductElements pProduct;
	
	private final Grammar grammar;

	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public CustomerDslGrammarAccess(GrammarProvider grammarProvider,
		TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pCustomerDb = new CustomerDbElements();
		this.pCustomer = new CustomerElements();
		this.pAddress = new AddressElements();
		this.pStreetAddress = new StreetAddressElements();
		this.pPOBox = new POBoxElements();
		this.pOrder = new OrderElements();
		this.unknownRuleOrderChannel = new OrderChannelElements();
		this.pProduct = new ProductElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("de.wwu.pi.acse.customerDsl.CustomerDsl".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	

	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//CustomerDb:
	//	customers+=Customer* orders+=Order* products+=Product*;
	public CustomerDbElements getCustomerDbAccess() {
		return pCustomerDb;
	}
	
	public ParserRule getCustomerDbRule() {
		return getCustomerDbAccess().getRule();
	}

	//Customer:
	//	"Customer" name=ID "{" "name" fullName=STRING addresses+=Address+ "}";
	public CustomerElements getCustomerAccess() {
		return pCustomer;
	}
	
	public ParserRule getCustomerRule() {
		return getCustomerAccess().getRule();
	}

	//Address:
	//	StreetAddress | POBox;
	public AddressElements getAddressAccess() {
		return pAddress;
	}
	
	public ParserRule getAddressRule() {
		return getAddressAccess().getRule();
	}

	//StreetAddress:
	//	"Address" name=ID "{" ("street" street=STRING & "city" city=STRING & "zip" zip=STRING) "}";
	public StreetAddressElements getStreetAddressAccess() {
		return pStreetAddress;
	}
	
	public ParserRule getStreetAddressRule() {
		return getStreetAddressAccess().getRule();
	}

	//POBox:
	//	"POBox" name=ID "{" "number" number=INT "zip" zip=STRING "}";
	public POBoxElements getPOBoxAccess() {
		return pPOBox;
	}
	
	public ParserRule getPOBoxRule() {
		return getPOBoxAccess().getRule();
	}

	//Order:
	//	"Order" name=ID "{" "by" customer=[Customer] "to" address=[Address] ("via" channel=OrderChannel)? "}";
	public OrderElements getOrderAccess() {
		return pOrder;
	}
	
	public ParserRule getOrderRule() {
		return getOrderAccess().getRule();
	}

	//enum OrderChannel:
	//	WEB="web" //default
	//	| MAIL="mail" | PHONE="phone";
	public OrderChannelElements getOrderChannelAccess() {
		return unknownRuleOrderChannel;
	}
	
	public EnumRule getOrderChannelRule() {
		return getOrderChannelAccess().getRule();
	}

	//Product:
	//	"Product" name=STRING? price=INT?;
	public ProductElements getProductAccess() {
		return pProduct;
	}
	
	public ParserRule getProductRule() {
		return getProductAccess().getRule();
	}

	//terminal ID:
	//	"^"? ("a".."z" | "A".."Z" | "_") ("a".."z" | "A".."Z" | "_" | "0".."9")*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	} 

	//terminal INT returns ecore::EInt:
	//	"0".."9"+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	} 

	//terminal STRING:
	//	"\"" ("\\" . / * 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' * / | !("\\" | "\""))* "\"" | "\'" ("\\" .
	//	/ * 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' * / | !("\\" | "\'"))* "\'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	} 

	//terminal ML_COMMENT:
	//	"/ *"->"* /";
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	} 

	//terminal SL_COMMENT:
	//	"//" !("\n" | "\r")* ("\r"? "\n")?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	} 

	//terminal WS:
	//	(" " | "\t" | "\r" | "\n")+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	} 

	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	} 
}
