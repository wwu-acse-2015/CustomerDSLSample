package de.wwu.pi.acse.customerDsl.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import de.wwu.pi.acse.customerDsl.services.CustomerDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCustomerDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Customer'", "'{'", "'name'", "'}'", "'Address'", "'street'", "'city'", "'zip'", "'POBox'", "'number'", "'Order'", "'by'", "'to'", "'via'", "'Product'", "'web'", "'mail'", "'phone'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalCustomerDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalCustomerDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalCustomerDslParser.tokenNames; }
    public String getGrammarFileName() { return "../de.wwu.pi.acse.customerDsl/src-gen/de/wwu/pi/acse/customerDsl/parser/antlr/internal/InternalCustomerDsl.g"; }



     	private CustomerDslGrammarAccess grammarAccess;
     	
        public InternalCustomerDslParser(TokenStream input, CustomerDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "CustomerDb";	
       	}
       	
       	@Override
       	protected CustomerDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleCustomerDb"
    // ../de.wwu.pi.acse.customerDsl/src-gen/de/wwu/pi/acse/customerDsl/parser/antlr/internal/InternalCustomerDsl.g:68:1: entryRuleCustomerDb returns [EObject current=null] : iv_ruleCustomerDb= ruleCustomerDb EOF ;
    public final EObject entryRuleCustomerDb() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCustomerDb = null;


        try {
            // ../de.wwu.pi.acse.customerDsl/src-gen/de/wwu/pi/acse/customerDsl/parser/antlr/internal/InternalCustomerDsl.g:69:2: (iv_ruleCustomerDb= ruleCustomerDb EOF )
            // ../de.wwu.pi.acse.customerDsl/src-gen/de/wwu/pi/acse/customerDsl/parser/antlr/internal/InternalCustomerDsl.g:70:2: iv_ruleCustomerDb= ruleCustomerDb EOF
            {
             newCompositeNode(grammarAccess.getCustomerDbRule()); 
            pushFollow(FOLLOW_ruleCustomerDb_in_entryRuleCustomerDb75);
            iv_ruleCustomerDb=ruleCustomerDb();

            state._fsp--;

             current =iv_ruleCustomerDb; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCustomerDb85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCustomerDb"


    // $ANTLR start "ruleCustomerDb"
    // ../de.wwu.pi.acse.customerDsl/src-gen/de/wwu/pi/acse/customerDsl/parser/antlr/internal/InternalCustomerDsl.g:77:1: ruleCustomerDb returns [EObject current=null] : ( ( (lv_customers_0_0= ruleCustomer ) )* ( (lv_orders_1_0= ruleOrder ) )* ( (lv_products_2_0= ruleProduct ) )* ) ;
    public final EObject ruleCustomerDb() throws RecognitionException {
        EObject current = null;

        EObject lv_customers_0_0 = null;

        EObject lv_orders_1_0 = null;

        EObject lv_products_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.wwu.pi.acse.customerDsl/src-gen/de/wwu/pi/acse/customerDsl/parser/antlr/internal/InternalCustomerDsl.g:80:28: ( ( ( (lv_customers_0_0= ruleCustomer ) )* ( (lv_orders_1_0= ruleOrder ) )* ( (lv_products_2_0= ruleProduct ) )* ) )
            // ../de.wwu.pi.acse.customerDsl/src-gen/de/wwu/pi/acse/customerDsl/parser/antlr/internal/InternalCustomerDsl.g:81:1: ( ( (lv_customers_0_0= ruleCustomer ) )* ( (lv_orders_1_0= ruleOrder ) )* ( (lv_products_2_0= ruleProduct ) )* )
            {
            // ../de.wwu.pi.acse.customerDsl/src-gen/de/wwu/pi/acse/customerDsl/parser/antlr/internal/InternalCustomerDsl.g:81:1: ( ( (lv_customers_0_0= ruleCustomer ) )* ( (lv_orders_1_0= ruleOrder ) )* ( (lv_products_2_0= ruleProduct ) )* )
            // ../de.wwu.pi.acse.customerDsl/src-gen/de/wwu/pi/acse/customerDsl/parser/antlr/internal/InternalCustomerDsl.g:81:2: ( (lv_customers_0_0= ruleCustomer ) )* ( (lv_orders_1_0= ruleOrder ) )* ( (lv_products_2_0= ruleProduct ) )*
            {
            // ../de.wwu.pi.acse.customerDsl/src-gen/de/wwu/pi/acse/customerDsl/parser/antlr/internal/InternalCustomerDsl.g:81:2: ( (lv_customers_0_0= ruleCustomer ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../de.wwu.pi.acse.customerDsl/src-gen/de/wwu/pi/acse/customerDsl/parser/antlr/internal/InternalCustomerDsl.g:82:1: (lv_customers_0_0= ruleCustomer )
            	    {
            	    // ../de.wwu.pi.acse.customerDsl/src-gen/de/wwu/pi/acse/customerDsl/parser/antlr/internal/InternalCustomerDsl.g:82:1: (lv_customers_0_0= ruleCustomer )
            	    // ../de.wwu.pi.acse.customerDsl/src-gen/de/wwu/pi/acse/customerDsl/parser/antlr/internal/InternalCustomerDsl.g:83:3: lv_customers_0_0= ruleCustomer
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getCustomerDbAccess().getCustomersCustomerParserRuleCall_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleCustomer_in_ruleCustomerDb131);
            	    lv_customers_0_0=ruleCustomer();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getCustomerDbRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"customers",
            	            		lv_customers_0_0, 
            	            		"Customer");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../de.wwu.pi.acse.customerDsl/src-gen/de/wwu/pi/acse/customerDsl/parser/antlr/internal/InternalCustomerDsl.g:99:3: ( (lv_orders_1_0= ruleOrder ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==21) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../de.wwu.pi.acse.customerDsl/src-gen/de/wwu/pi/acse/customerDsl/parser/antlr/internal/InternalCustomerDsl.g:100:1: (lv_orders_1_0= ruleOrder )
            	    {
            	    // ../de.wwu.pi.acse.customerDsl/src-gen/de/wwu/pi/acse/customerDsl/parser/antlr/internal/InternalCustomerDsl.g:100:1: (lv_orders_1_0= ruleOrder )
            	    // ../de.wwu.pi.acse.customerDsl/src-gen/de/wwu/pi/acse/customerDsl/parser/antlr/internal/InternalCustomerDsl.g:101:3: lv_orders_1_0= ruleOrder
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getCustomerDbAccess().getOrdersOrderParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleOrder_in_ruleCustomerDb153);
            	    lv_orders_1_0=ruleOrder();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getCustomerDbRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"orders",
            	            		lv_orders_1_0, 
            	            		"Order");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // ../de.wwu.pi.acse.customerDsl/src-gen/de/wwu/pi/acse/customerDsl/parser/antlr/internal/InternalCustomerDsl.g:117:3: ( (lv_products_2_0= ruleProduct ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==25) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../de.wwu.pi.acse.customerDsl/src-gen/de/wwu/pi/acse/customerDsl/parser/antlr/internal/InternalCustomerDsl.g:118:1: (lv_products_2_0= ruleProduct )
            	    {
            	    // ../de.wwu.pi.acse.customerDsl/src-gen/de/wwu/pi/acse/customerDsl/parser/antlr/internal/InternalCustomerDsl.g:118:1: (lv_products_2_0= ruleProduct )
            	    // ../de.wwu.pi.acse.customerDsl/src-gen/de/wwu/pi/acse/customerDsl/parser/antlr/internal/InternalCustomerDsl.g:119:3: lv_products_2_0= ruleProduct
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getCustomerDbAccess().getProductsProductParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleProduct_in_ruleCustomerDb175);
            	    lv_products_2_0=ruleProduct();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getCustomerDbRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"products",
            	            		lv_products_2_0, 
            	            		"Product");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCustomerDb"


    // $ANTLR start "entryRuleCustomer"
    // ../de.wwu.pi.acse.customerDsl/src-gen/de/wwu/pi/acse/customerDsl/parser/antlr/internal/InternalCustomerDsl.g:143:1: entryRuleCustomer returns [EObject current=null] : iv_ruleCustomer= ruleCustomer EOF ;
    public final EObject entryRuleCustomer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCustomer = null;


        try {
            // ../de.wwu.pi.acse.customerDsl/src-gen/de/wwu/pi/acse/customerDsl/parser/antlr/internal/InternalCustomerDsl.g:144:2: (iv_ruleCustomer= ruleCustomer EOF )
            // ../de.wwu.pi.acse.customerDsl/src-gen/de/wwu/pi/acse/customerDsl/parser/antlr/internal/InternalCustomerDsl.g:145:2: iv_ruleCustomer= ruleCustomer EOF
            {
             newCompositeNode(grammarAccess.getCustomerRule()); 
            pushFollow(FOLLOW_ruleCustomer_in_entryRuleCustomer212);
            iv_ruleCustomer=ruleCustomer();

            state._fsp--;

             current =iv_ruleCustomer; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCustomer222); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCustomer"


    // $ANTLR start "ruleCustomer"
    // ../de.wwu.pi.acse.customerDsl/src-gen/de/wwu/pi/acse/customerDsl/parser/antlr/internal/InternalCustomerDsl.g:152:1: ruleCustomer returns [EObject current=null] : (otherlv_0= 'Customer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'name' ( (lv_fullName_4_0= RULE_STRING ) ) ( (lv_addresses_5_0= ruleAddress ) )+ otherlv_6= '}' ) ;
    public final EObject ruleCustomer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_fullName_4_0=null;
        Token otherlv_6=null;
        EObject lv_addresses_5_0 = null;


         enterRule(); 
            
        try {
            // ../de.wwu.pi.acse.customerDsl/src-gen/de/wwu/pi/acse/customerDsl/parser/antlr/internal/InternalCustomerDsl.g:155:28: ( (otherlv_0= 'Customer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'name' ( (lv_fullName_4_0= RULE_STRING ) ) ( (lv_addresses_5_0= ruleAddress ) )+ otherlv_6= '}' ) )
            // ../de.wwu.pi.acse.customerDsl/src-gen/de/wwu/pi/acse/customerDsl/parser/antlr/internal/InternalCustomerDsl.g:156:1: (otherlv_0= 'Customer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'name' ( (lv_fullName_4_0= RULE_STRING ) ) ( (lv_addresses_5_0= ruleAddress ) )+ otherlv_6= '}' )
            {
            // ../de.wwu.pi.acse.customerDsl/src-gen/de/wwu/pi/acse/customerDsl/parser/antlr/internal/InternalCustomerDsl.g:156:1: (otherlv_0= 'Customer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'name' ( (lv_fullName_4_0= RULE_STRING ) ) ( (lv_addresses_5_0= ruleAddress ) )+ otherlv_6= '}' )
            // ../de.wwu.pi.acse.customerDsl/src-gen/de/wwu/pi/acse/customerDsl/parser/antlr/internal/InternalCustomerDsl.g:156:3: otherlv_0= 'Customer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'name' ( (lv_fullName_4_0= RULE_STRING ) ) ( (lv_addresses_5_0= ruleAddress ) )+ otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleCustomer259); 

                	newLeafNode(otherlv_0, grammarAccess.getCustomerAccess().getCustomerKeyword_0());
                
            // ../de.wwu.pi.acse.customerDsl/src-gen/de/wwu/pi/acse/customerDsl/parser/antlr/internal/InternalCustomerDsl.g:160:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.wwu.pi.acse.customerDsl/src-gen/de/wwu/pi/acse/customerDsl/parser/antlr/internal/InternalCustomerDsl.g:161:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.wwu.pi.acse.customerDsl/src-gen/de/wwu/pi/acse/customerDsl/parser/antlr/internal/InternalCustomerDsl.g:161:1: (lv_name_1_0= RULE_ID )
            // ../de.wwu.pi.acse.customerDsl/src-gen/de/wwu/pi/acse/customerDsl/parser/antlr/internal/InternalCustomerDsl.g:162:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCustomer276); 

            			newLeafNode(lv_name_1_0, grammarAccess.getCustomerAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCustomerRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleCustomer293); 

                	newLeafNode(otherlv_2, grammarAccess.getCustomerAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleCustomer305); 

                	newLeafNode(otherlv_3, grammarAccess.getCustomerAccess().getNameKeyword_3());
                
            // ../de.wwu.pi.acse.customerDsl/src-gen/de/wwu/pi/acse/customerDsl/parser/antlr/internal/InternalCustomerDsl.g:186:1: ( (lv_fullName_4_0= RULE_STRING ) )
            // ../de.wwu.pi.acse.customerDsl/src-gen/de/wwu/pi/acse/customerDsl/parser/antlr/internal/InternalCustomerDsl.g:187:1: (lv_fullName_4_0= RULE_STRING )
            {
            // ../de.wwu.pi.acse.customerDsl/src-gen/de/wwu/pi/acse/customerDsl/parser/antlr/internal/InternalCustomerDsl.g:187:1: (lv_fullName_4_0= RULE_STRING )
            // ../de.wwu.pi.acse.customerDsl/src-gen/de/wwu/pi/acse/customerDsl/parser/antlr/internal/InternalCustomerDsl.g:188:3: lv_fullName_4_0= RULE_STRING
            {
            lv_fullName_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCustomer322); 

            			newLeafNode(lv_fullName_4_0, grammarAccess.getCustomerAccess().getFullNameSTRINGTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCustomerRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"fullName",
                    		lv_fullName_4_0, 
                    		"STRING");
            	    

            }


            }

            // ../de.wwu.pi.acse.customerDsl/src-gen/de/wwu/pi/acse/customerDsl/parser/antlr/internal/InternalCustomerDsl.g:204:2: ( (lv_addresses_5_0= ruleAddress ) )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==15||LA4_0==19) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../de.wwu.pi.acse.customerDsl/src-gen/de/wwu/pi/acse/customerDsl/parser/antlr/internal/InternalCustomerDsl.g:205:1: (lv_addresses_5_0= ruleAddress )
            	    {
            	    // ../de.wwu.pi.acse.customerDsl/src-gen/de/wwu/pi/acse/customerDsl/parser/antlr/internal/InternalCustomerDsl.g:205:1: (lv_addresses_5_0= ruleAddress )
            	    // ../de.wwu.pi.acse.customerDsl/src-gen/de/wwu/pi/acse/customerDsl/parser/antlr/internal/InternalCustomerDsl.g:206:3: lv_addresses_5_0= ruleAddress
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getCustomerAccess().getAddressesAddressParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAddress_in_ruleCustomer348);
            	    lv_addresses_5_0=ruleAddress();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getCustomerRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"addresses",
            	            		lv_addresses_5_0, 
            	            		"Address");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);

            otherlv_6=(Token)match(input,14,FOLLOW_14_in_ruleCustomer361); 

                	newLeafNode(otherlv_6, grammarAccess.getCustomerAccess().getRightCurlyBracketKeyword_6());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCustomer"


    // $ANTLR start "entryRuleAddress"
    // ../de.wwu.pi.acse.customerDsl/src-gen/de/wwu/pi/acse/customerDsl/parser/antlr/internal/InternalCustomerDsl.g:234:1: entryRuleAddress returns [EObject current=null] : iv_ruleAddress= ruleAddress EOF ;
    public final EObject entryRuleAddress() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddress = null;


        try {
            // ../de.wwu.pi.acse.customerDsl/src-gen/de/wwu/pi/acse/customerDsl/parser/antlr/internal/InternalCustomerDsl.g:235:2: (iv_ruleAddress= ruleAddress EOF )
            // ../de.wwu.pi.acse.customerDsl/src-gen/de/wwu/pi/acse/customerDsl/parser/antlr/internal/InternalCustomerDsl.g:236:2: iv_ruleAddress= ruleAddress EOF
            {
             newCompositeNode(grammarAccess.getAddressRule()); 
            pushFollow(FOLLOW_ruleAddress_in_entryRuleAddress397);
            iv_ruleAddress=ruleAddress();

            state._fsp--;

             current =iv_ruleAddress; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAddress407); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAddress"


    // $ANTLR start "ruleAddress"
    // ../de.wwu.pi.acse.customerDsl/src-gen/de/wwu/pi/acse/customerDsl/parser/antlr/internal/InternalCustomerDsl.g:243:1: ruleAddress returns [EObject current=null] : (this_StreetAddress_0= ruleStreetAddress | this_POBox_1= rulePOBox ) ;
    public final EObject ruleAddress() throws RecognitionException {
        EObject current = null;

        EObject this_StreetAddress_0 = null;

        EObject this_POBox_1 = null;


         enterRule(); 
            
        try {
            // ../de.wwu.pi.acse.customerDsl/src-gen/de/wwu/pi/acse/customerDsl/parser/antlr/internal/InternalCustomerDsl.g:246:28: ( (this_StreetAddress_0= ruleStreetAddress | this_POBox_1= rulePOBox ) )
            // ../de.wwu.pi.acse.customerDsl/src-gen/de/wwu/pi/acse/customerDsl/parser/antlr/internal/InternalCustomerDsl.g:247:1: (this_StreetAddress_0= ruleStreetAddress | this_POBox_1= rulePOBox )
            {
            // ../de.wwu.pi.acse.customerDsl/src-gen/de/wwu/pi/acse/customerDsl/parser/antlr/internal/InternalCustomerDsl.g:247:1: (this_StreetAddress_0= ruleStreetAddress | this_POBox_1= rulePOBox )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==15) ) {
                alt5=1;
            }
            else if ( (LA5_0==19) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../de.wwu.pi.acse.customerDsl/src-gen/de/wwu/pi/acse/customerDsl/parser/antlr/internal/InternalCustomerDsl.g:248:5: this_StreetAddress_0= ruleStreetAddress
                    {
                     
                            newCompositeNode(grammarAccess.getAddressAccess().getStreetAddressParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleStreetAddress_in_ruleAddress454);
                    this_StreetAddress_0=ruleStreetAddress();

                    state._fsp--;

                     
                            current = this_StreetAddress_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.wwu.pi.acse.customerDsl/src-gen/de/wwu/pi/acse/customerDsl/parser/antlr/internal/InternalCustomerDsl.g:258:5: this_POBox_1= rulePOBox
                    {
                     
                            newCompositeNode(grammarAccess.getAddressAccess().getPOBoxParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_rulePOBox_in_ruleAddress481);
                    this_POBox_1=rulePOBox();

                    state._fsp--;

                     
                            current = this_POBox_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAddress"


    // $ANTLR start "entryRuleStreetAddress"
    // ../de.wwu.pi.acse.customerDsl/src-gen/de/wwu/pi/acse/customerDsl/parser/antlr/internal/InternalCustomerDsl.g:274:1: entryRuleStreetAddress returns [EObject current=null] : iv_ruleStreetAddress= ruleStreetAddress EOF ;
    public final EObject entryRuleStreetAddress() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStreetAddress = null;


        try {
            // ../de.wwu.pi.acse.customerDsl/src-gen/de/wwu/pi/acse/customerDsl/parser/antlr/internal/InternalCustomerDsl.g:275:2: (iv_ruleStreetAddress= ruleStreetAddress EOF )
            // ../de.wwu.pi.acse.customerDsl/src-gen/de/wwu/pi/acse/customerDsl/parser/antlr/internal/InternalCustomerDsl.g:276:2: iv_ruleStreetAddress= ruleStreetAddress EOF
            {
             newCompositeNode(grammarAccess.getStreetAddressRule()); 
            pushFollow(FOLLOW_ruleStreetAddress_in_entryRuleStreetAddress516);
            iv_ruleStreetAddress=ruleStreetAddress();

            state._fsp--;

             current =iv_ruleStreetAddress; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStreetAddress526); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStreetAddress"


    // $ANTLR start "ruleStreetAddress"
    // ../de.wwu.pi.acse.customerDsl/src-gen/de/wwu/pi/acse/customerDsl/parser/antlr/internal/InternalCustomerDsl.g:283:1: ruleStreetAddress returns [EObject current=null] : (otherlv_0= 'Address' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'street' ( (lv_street_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'city' ( (lv_city_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'zip' ( (lv_zip_9_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) ) otherlv_10= '}' ) ;
    public final EObject ruleStreetAddress() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_street_5_0=null;
        Token otherlv_6=null;
        Token lv_city_7_0=null;
        Token otherlv_8=null;
        Token lv_zip_9_0=null;
        Token otherlv_10=null;

         enterRule(); 
            
        try {
            // ../de.wwu.pi.acse.customerDsl/src-gen/de/wwu/pi/acse/customerDsl/parser/antlr/internal/InternalCustomerDsl.g:286:28: ( (otherlv_0= 'Address' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'street' ( (lv_street_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'city' ( (lv_city_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'zip' ( (lv_zip_9_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) ) otherlv_10= '}' ) )
            // ../de.wwu.pi.acse.customerDsl/src-gen/de/wwu/pi/acse/customerDsl/parser/antlr/internal/InternalCustomerDsl.g:287:1: (otherlv_0= 'Address' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'street' ( (lv_street_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'city' ( (lv_city_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'zip' ( (lv_zip_9_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) ) otherlv_10= '}' )
            {
            // ../de.wwu.pi.acse.customerDsl/src-gen/de/wwu/pi/acse/customerDsl/parser/antlr/internal/InternalCustomerDsl.g:287:1: (otherlv_0= 'Address' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'street' ( (lv_street_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'city' ( (lv_city_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'zip' ( (lv_zip_9_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) ) otherlv_10= '}' )
            // ../de.wwu.pi.acse.customerDsl/src-gen/de/wwu/pi/acse/customerDsl/parser/antlr/internal/InternalCustomerDsl.g:287:3: otherlv_0= 'Address' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'street' ( (lv_street_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'city' ( (lv_city_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'zip' ( (lv_zip_9_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) ) otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleStreetAddress563); 

                	newLeafNode(otherlv_0, grammarAccess.getStreetAddressAccess().getAddressKeyword_0());
                
            // ../de.wwu.pi.acse.customerDsl/src-gen/de/wwu/pi/acse/customerDsl/parser/antlr/internal/InternalCustomerDsl.g:291:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.wwu.pi.acse.customerDsl/src-gen/de/wwu/pi/acse/customerDsl/parser/antlr/internal/InternalCustomerDsl.g:292:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.wwu.pi.acse.customerDsl/src-gen/de/wwu/pi/acse/customerDsl/parser/antlr/internal/InternalCustomerDsl.g:292:1: (lv_name_1_0= RULE_ID )
            // ../de.wwu.pi.acse.customerDsl/src-gen/de/wwu/pi/acse/customerDsl/parser/antlr/internal/InternalCustomerDsl.g:293:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStreetAddress580); 

            			newLeafNode(lv_name_1_0, grammarAccess.getStreetAddressAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getStreetAddressRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleStreetAddress597); 

                	newLeafNode(otherlv_2, grammarAccess.getStreetAddressAccess().getLeftCurlyBracketKeyword_2());
                
            // ../de.wwu.pi.acse.customerDsl/src-gen/de/wwu/pi/acse/customerDsl/parser/antlr/internal/InternalCustomerDsl.g:313:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'street' ( (lv_street_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'city' ( (lv_city_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'zip' ( (lv_zip_9_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) )
            // ../de.wwu.pi.acse.customerDsl/src-gen/de/wwu/pi/acse/customerDsl/parser/antlr/internal/InternalCustomerDsl.g:315:1: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'street' ( (lv_street_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'city' ( (lv_city_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'zip' ( (lv_zip_9_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) )
            {
            // ../de.wwu.pi.acse.customerDsl/src-gen/de/wwu/pi/acse/customerDsl/parser/antlr/internal/InternalCustomerDsl.g:315:1: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'street' ( (lv_street_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'city' ( (lv_city_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'zip' ( (lv_zip_9_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) )
            // ../de.wwu.pi.acse.customerDsl/src-gen/de/wwu/pi/acse/customerDsl/parser/antlr/internal/InternalCustomerDsl.g:316:2: ( ( ({...}? => ( ({...}? => (otherlv_4= 'street' ( (lv_street_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'city' ( (lv_city_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'zip' ( (lv_zip_9_0= RULE_STRING ) ) ) ) ) ) )+ {...}?)
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getStreetAddressAccess().getUnorderedGroup_3());
            	
            // ../de.wwu.pi.acse.customerDsl/src-gen/de/wwu/pi/acse/customerDsl/parser/antlr/internal/InternalCustomerDsl.g:319:2: ( ( ({...}? => ( ({...}? => (otherlv_4= 'street' ( (lv_street_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'city' ( (lv_city_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'zip' ( (lv_zip_9_0= RULE_STRING ) ) ) ) ) ) )+ {...}?)
            // ../de.wwu.pi.acse.customerDsl/src-gen/de/wwu/pi/acse/customerDsl/parser/antlr/internal/InternalCustomerDsl.g:320:3: ( ({...}? => ( ({...}? => (otherlv_4= 'street' ( (lv_street_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'city' ( (lv_city_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'zip' ( (lv_zip_9_0= RULE_STRING ) ) ) ) ) ) )+ {...}?
            {
            // ../de.wwu.pi.acse.customerDsl/src-gen/de/wwu/pi/acse/customerDsl/parser/antlr/internal/InternalCustomerDsl.g:320:3: ( ({...}? => ( ({...}? => (otherlv_4= 'street' ( (lv_street_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'city' ( (lv_city_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'zip' ( (lv_zip_9_0= RULE_STRING ) ) ) ) ) ) )+
            int cnt6=0;
            loop6:
            do {
                int alt6=4;
                int LA6_0 = input.LA(1);

                if ( LA6_0 ==16 && getUnorderedGroupHelper().canSelect(grammarAccess.getStreetAddressAccess().getUnorderedGroup_3(), 0) ) {
                    alt6=1;
                }
                else if ( LA6_0 ==17 && getUnorderedGroupHelper().canSelect(grammarAccess.getStreetAddressAccess().getUnorderedGroup_3(), 1) ) {
                    alt6=2;
                }
                else if ( LA6_0 ==18 && getUnorderedGroupHelper().canSelect(grammarAccess.getStreetAddressAccess().getUnorderedGroup_3(), 2) ) {
                    alt6=3;
                }


                switch (alt6) {
            	case 1 :
            	    // ../de.wwu.pi.acse.customerDsl/src-gen/de/wwu/pi/acse/customerDsl/parser/antlr/internal/InternalCustomerDsl.g:322:4: ({...}? => ( ({...}? => (otherlv_4= 'street' ( (lv_street_5_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // ../de.wwu.pi.acse.customerDsl/src-gen/de/wwu/pi/acse/customerDsl/parser/antlr/internal/InternalCustomerDsl.g:322:4: ({...}? => ( ({...}? => (otherlv_4= 'street' ( (lv_street_5_0= RULE_STRING ) ) ) ) ) )
            	    // ../de.wwu.pi.acse.customerDsl/src-gen/de/wwu/pi/acse/customerDsl/parser/antlr/internal/InternalCustomerDsl.g:323:5: {...}? => ( ({...}? => (otherlv_4= 'street' ( (lv_street_5_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getStreetAddressAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleStreetAddress", "getUnorderedGroupHelper().canSelect(grammarAccess.getStreetAddressAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // ../de.wwu.pi.acse.customerDsl/src-gen/de/wwu/pi/acse/customerDsl/parser/antlr/internal/InternalCustomerDsl.g:323:110: ( ({...}? => (otherlv_4= 'street' ( (lv_street_5_0= RULE_STRING ) ) ) ) )
            	    // ../de.wwu.pi.acse.customerDsl/src-gen/de/wwu/pi/acse/customerDsl/parser/antlr/internal/InternalCustomerDsl.g:324:6: ({...}? => (otherlv_4= 'street' ( (lv_street_5_0= RULE_STRING ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getStreetAddressAccess().getUnorderedGroup_3(), 0);
            	    	 				
            	    // ../de.wwu.pi.acse.customerDsl/src-gen/de/wwu/pi/acse/customerDsl/parser/antlr/internal/InternalCustomerDsl.g:327:6: ({...}? => (otherlv_4= 'street' ( (lv_street_5_0= RULE_STRING ) ) ) )
            	    // ../de.wwu.pi.acse.customerDsl/src-gen/de/wwu/pi/acse/customerDsl/parser/antlr/internal/InternalCustomerDsl.g:327:7: {...}? => (otherlv_4= 'street' ( (lv_street_5_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleStreetAddress", "true");
            	    }
            	    // ../de.wwu.pi.acse.customerDsl/src-gen/de/wwu/pi/acse/customerDsl/parser/antlr/internal/InternalCustomerDsl.g:327:16: (otherlv_4= 'street' ( (lv_street_5_0= RULE_STRING ) ) )
            	    // ../de.wwu.pi.acse.customerDsl/src-gen/de/wwu/pi/acse/customerDsl/parser/antlr/internal/InternalCustomerDsl.g:327:18: otherlv_4= 'street' ( (lv_street_5_0= RULE_STRING ) )
            	    {
            	    otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleStreetAddress655); 

            	        	newLeafNode(otherlv_4, grammarAccess.getStreetAddressAccess().getStreetKeyword_3_0_0());
            	        
            	    // ../de.wwu.pi.acse.customerDsl/src-gen/de/wwu/pi/acse/customerDsl/parser/antlr/internal/InternalCustomerDsl.g:331:1: ( (lv_street_5_0= RULE_STRING ) )
            	    // ../de.wwu.pi.acse.customerDsl/src-gen/de/wwu/pi/acse/customerDsl/parser/antlr/internal/InternalCustomerDsl.g:332:1: (lv_street_5_0= RULE_STRING )
            	    {
            	    // ../de.wwu.pi.acse.customerDsl/src-gen/de/wwu/pi/acse/customerDsl/parser/antlr/internal/InternalCustomerDsl.g:332:1: (lv_street_5_0= RULE_STRING )
            	    // ../de.wwu.pi.acse.customerDsl/src-gen/de/wwu/pi/acse/customerDsl/parser/antlr/internal/InternalCustomerDsl.g:333:3: lv_street_5_0= RULE_STRING
            	    {
            	    lv_street_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStreetAddress672); 

            	    			newLeafNode(lv_street_5_0, grammarAccess.getStreetAddressAccess().getStreetSTRINGTerminalRuleCall_3_0_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getStreetAddressRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"street",
            	            		lv_street_5_0, 
            	            		"STRING");
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getStreetAddressAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../de.wwu.pi.acse.customerDsl/src-gen/de/wwu/pi/acse/customerDsl/parser/antlr/internal/InternalCustomerDsl.g:356:4: ({...}? => ( ({...}? => (otherlv_6= 'city' ( (lv_city_7_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // ../de.wwu.pi.acse.customerDsl/src-gen/de/wwu/pi/acse/customerDsl/parser/antlr/internal/InternalCustomerDsl.g:356:4: ({...}? => ( ({...}? => (otherlv_6= 'city' ( (lv_city_7_0= RULE_STRING ) ) ) ) ) )
            	    // ../de.wwu.pi.acse.customerDsl/src-gen/de/wwu/pi/acse/customerDsl/parser/antlr/internal/InternalCustomerDsl.g:357:5: {...}? => ( ({...}? => (otherlv_6= 'city' ( (lv_city_7_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getStreetAddressAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleStreetAddress", "getUnorderedGroupHelper().canSelect(grammarAccess.getStreetAddressAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // ../de.wwu.pi.acse.customerDsl/src-gen/de/wwu/pi/acse/customerDsl/parser/antlr/internal/InternalCustomerDsl.g:357:110: ( ({...}? => (otherlv_6= 'city' ( (lv_city_7_0= RULE_STRING ) ) ) ) )
            	    // ../de.wwu.pi.acse.customerDsl/src-gen/de/wwu/pi/acse/customerDsl/parser/antlr/internal/InternalCustomerDsl.g:358:6: ({...}? => (otherlv_6= 'city' ( (lv_city_7_0= RULE_STRING ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getStreetAddressAccess().getUnorderedGroup_3(), 1);
            	    	 				
            	    // ../de.wwu.pi.acse.customerDsl/src-gen/de/wwu/pi/acse/customerDsl/parser/antlr/internal/InternalCustomerDsl.g:361:6: ({...}? => (otherlv_6= 'city' ( (lv_city_7_0= RULE_STRING ) ) ) )
            	    // ../de.wwu.pi.acse.customerDsl/src-gen/de/wwu/pi/acse/customerDsl/parser/antlr/internal/InternalCustomerDsl.g:361:7: {...}? => (otherlv_6= 'city' ( (lv_city_7_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleStreetAddress", "true");
            	    }
            	    // ../de.wwu.pi.acse.customerDsl/src-gen/de/wwu/pi/acse/customerDsl/parser/antlr/internal/InternalCustomerDsl.g:361:16: (otherlv_6= 'city' ( (lv_city_7_0= RULE_STRING ) ) )
            	    // ../de.wwu.pi.acse.customerDsl/src-gen/de/wwu/pi/acse/customerDsl/parser/antlr/internal/InternalCustomerDsl.g:361:18: otherlv_6= 'city' ( (lv_city_7_0= RULE_STRING ) )
            	    {
            	    otherlv_6=(Token)match(input,17,FOLLOW_17_in_ruleStreetAddress745); 

            	        	newLeafNode(otherlv_6, grammarAccess.getStreetAddressAccess().getCityKeyword_3_1_0());
            	        
            	    // ../de.wwu.pi.acse.customerDsl/src-gen/de/wwu/pi/acse/customerDsl/parser/antlr/internal/InternalCustomerDsl.g:365:1: ( (lv_city_7_0= RULE_STRING ) )
            	    // ../de.wwu.pi.acse.customerDsl/src-gen/de/wwu/pi/acse/customerDsl/parser/antlr/internal/InternalCustomerDsl.g:366:1: (lv_city_7_0= RULE_STRING )
            	    {
            	    // ../de.wwu.pi.acse.customerDsl/src-gen/de/wwu/pi/acse/customerDsl/parser/antlr/internal/InternalCustomerDsl.g:366:1: (lv_city_7_0= RULE_STRING )
            	    // ../de.wwu.pi.acse.customerDsl/src-gen/de/wwu/pi/acse/customerDsl/parser/antlr/internal/InternalCustomerDsl.g:367:3: lv_city_7_0= RULE_STRING
            	    {
            	    lv_city_7_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStreetAddress762); 

            	    			newLeafNode(lv_city_7_0, grammarAccess.getStreetAddressAccess().getCitySTRINGTerminalRuleCall_3_1_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getStreetAddressRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"city",
            	            		lv_city_7_0, 
            	            		"STRING");
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getStreetAddressAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../de.wwu.pi.acse.customerDsl/src-gen/de/wwu/pi/acse/customerDsl/parser/antlr/internal/InternalCustomerDsl.g:390:4: ({...}? => ( ({...}? => (otherlv_8= 'zip' ( (lv_zip_9_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // ../de.wwu.pi.acse.customerDsl/src-gen/de/wwu/pi/acse/customerDsl/parser/antlr/internal/InternalCustomerDsl.g:390:4: ({...}? => ( ({...}? => (otherlv_8= 'zip' ( (lv_zip_9_0= RULE_STRING ) ) ) ) ) )
            	    // ../de.wwu.pi.acse.customerDsl/src-gen/de/wwu/pi/acse/customerDsl/parser/antlr/internal/InternalCustomerDsl.g:391:5: {...}? => ( ({...}? => (otherlv_8= 'zip' ( (lv_zip_9_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getStreetAddressAccess().getUnorderedGroup_3(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleStreetAddress", "getUnorderedGroupHelper().canSelect(grammarAccess.getStreetAddressAccess().getUnorderedGroup_3(), 2)");
            	    }
            	    // ../de.wwu.pi.acse.customerDsl/src-gen/de/wwu/pi/acse/customerDsl/parser/antlr/internal/InternalCustomerDsl.g:391:110: ( ({...}? => (otherlv_8= 'zip' ( (lv_zip_9_0= RULE_STRING ) ) ) ) )
            	    // ../de.wwu.pi.acse.customerDsl/src-gen/de/wwu/pi/acse/customerDsl/parser/antlr/internal/InternalCustomerDsl.g:392:6: ({...}? => (otherlv_8= 'zip' ( (lv_zip_9_0= RULE_STRING ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getStreetAddressAccess().getUnorderedGroup_3(), 2);
            	    	 				
            	    // ../de.wwu.pi.acse.customerDsl/src-gen/de/wwu/pi/acse/customerDsl/parser/antlr/internal/InternalCustomerDsl.g:395:6: ({...}? => (otherlv_8= 'zip' ( (lv_zip_9_0= RULE_STRING ) ) ) )
            	    // ../de.wwu.pi.acse.customerDsl/src-gen/de/wwu/pi/acse/customerDsl/parser/antlr/internal/InternalCustomerDsl.g:395:7: {...}? => (otherlv_8= 'zip' ( (lv_zip_9_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleStreetAddress", "true");
            	    }
            	    // ../de.wwu.pi.acse.customerDsl/src-gen/de/wwu/pi/acse/customerDsl/parser/antlr/internal/InternalCustomerDsl.g:395:16: (otherlv_8= 'zip' ( (lv_zip_9_0= RULE_STRING ) ) )
            	    // ../de.wwu.pi.acse.customerDsl/src-gen/de/wwu/pi/acse/customerDsl/parser/antlr/internal/InternalCustomerDsl.g:395:18: otherlv_8= 'zip' ( (lv_zip_9_0= RULE_STRING ) )
            	    {
            	    otherlv_8=(Token)match(input,18,FOLLOW_18_in_ruleStreetAddress835); 

            	        	newLeafNode(otherlv_8, grammarAccess.getStreetAddressAccess().getZipKeyword_3_2_0());
            	        
            	    // ../de.wwu.pi.acse.customerDsl/src-gen/de/wwu/pi/acse/customerDsl/parser/antlr/internal/InternalCustomerDsl.g:399:1: ( (lv_zip_9_0= RULE_STRING ) )
            	    // ../de.wwu.pi.acse.customerDsl/src-gen/de/wwu/pi/acse/customerDsl/parser/antlr/internal/InternalCustomerDsl.g:400:1: (lv_zip_9_0= RULE_STRING )
            	    {
            	    // ../de.wwu.pi.acse.customerDsl/src-gen/de/wwu/pi/acse/customerDsl/parser/antlr/internal/InternalCustomerDsl.g:400:1: (lv_zip_9_0= RULE_STRING )
            	    // ../de.wwu.pi.acse.customerDsl/src-gen/de/wwu/pi/acse/customerDsl/parser/antlr/internal/InternalCustomerDsl.g:401:3: lv_zip_9_0= RULE_STRING
            	    {
            	    lv_zip_9_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStreetAddress852); 

            	    			newLeafNode(lv_zip_9_0, grammarAccess.getStreetAddressAccess().getZipSTRINGTerminalRuleCall_3_2_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getStreetAddressRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"zip",
            	            		lv_zip_9_0, 
            	            		"STRING");
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getStreetAddressAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getStreetAddressAccess().getUnorderedGroup_3()) ) {
                throw new FailedPredicateException(input, "ruleStreetAddress", "getUnorderedGroupHelper().canLeave(grammarAccess.getStreetAddressAccess().getUnorderedGroup_3())");
            }

            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getStreetAddressAccess().getUnorderedGroup_3());
            	

            }

            otherlv_10=(Token)match(input,14,FOLLOW_14_in_ruleStreetAddress916); 

                	newLeafNode(otherlv_10, grammarAccess.getStreetAddressAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStreetAddress"


    // $ANTLR start "entryRulePOBox"
    // ../de.wwu.pi.acse.customerDsl/src-gen/de/wwu/pi/acse/customerDsl/parser/antlr/internal/InternalCustomerDsl.g:444:1: entryRulePOBox returns [EObject current=null] : iv_rulePOBox= rulePOBox EOF ;
    public final EObject entryRulePOBox() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePOBox = null;


        try {
            // ../de.wwu.pi.acse.customerDsl/src-gen/de/wwu/pi/acse/customerDsl/parser/antlr/internal/InternalCustomerDsl.g:445:2: (iv_rulePOBox= rulePOBox EOF )
            // ../de.wwu.pi.acse.customerDsl/src-gen/de/wwu/pi/acse/customerDsl/parser/antlr/internal/InternalCustomerDsl.g:446:2: iv_rulePOBox= rulePOBox EOF
            {
             newCompositeNode(grammarAccess.getPOBoxRule()); 
            pushFollow(FOLLOW_rulePOBox_in_entryRulePOBox952);
            iv_rulePOBox=rulePOBox();

            state._fsp--;

             current =iv_rulePOBox; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePOBox962); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePOBox"


    // $ANTLR start "rulePOBox"
    // ../de.wwu.pi.acse.customerDsl/src-gen/de/wwu/pi/acse/customerDsl/parser/antlr/internal/InternalCustomerDsl.g:453:1: rulePOBox returns [EObject current=null] : (otherlv_0= 'POBox' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'number' ( (lv_number_4_0= RULE_INT ) ) otherlv_5= 'zip' ( (lv_zip_6_0= RULE_STRING ) ) otherlv_7= '}' ) ;
    public final EObject rulePOBox() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_number_4_0=null;
        Token otherlv_5=null;
        Token lv_zip_6_0=null;
        Token otherlv_7=null;

         enterRule(); 
            
        try {
            // ../de.wwu.pi.acse.customerDsl/src-gen/de/wwu/pi/acse/customerDsl/parser/antlr/internal/InternalCustomerDsl.g:456:28: ( (otherlv_0= 'POBox' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'number' ( (lv_number_4_0= RULE_INT ) ) otherlv_5= 'zip' ( (lv_zip_6_0= RULE_STRING ) ) otherlv_7= '}' ) )
            // ../de.wwu.pi.acse.customerDsl/src-gen/de/wwu/pi/acse/customerDsl/parser/antlr/internal/InternalCustomerDsl.g:457:1: (otherlv_0= 'POBox' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'number' ( (lv_number_4_0= RULE_INT ) ) otherlv_5= 'zip' ( (lv_zip_6_0= RULE_STRING ) ) otherlv_7= '}' )
            {
            // ../de.wwu.pi.acse.customerDsl/src-gen/de/wwu/pi/acse/customerDsl/parser/antlr/internal/InternalCustomerDsl.g:457:1: (otherlv_0= 'POBox' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'number' ( (lv_number_4_0= RULE_INT ) ) otherlv_5= 'zip' ( (lv_zip_6_0= RULE_STRING ) ) otherlv_7= '}' )
            // ../de.wwu.pi.acse.customerDsl/src-gen/de/wwu/pi/acse/customerDsl/parser/antlr/internal/InternalCustomerDsl.g:457:3: otherlv_0= 'POBox' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'number' ( (lv_number_4_0= RULE_INT ) ) otherlv_5= 'zip' ( (lv_zip_6_0= RULE_STRING ) ) otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_rulePOBox999); 

                	newLeafNode(otherlv_0, grammarAccess.getPOBoxAccess().getPOBoxKeyword_0());
                
            // ../de.wwu.pi.acse.customerDsl/src-gen/de/wwu/pi/acse/customerDsl/parser/antlr/internal/InternalCustomerDsl.g:461:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.wwu.pi.acse.customerDsl/src-gen/de/wwu/pi/acse/customerDsl/parser/antlr/internal/InternalCustomerDsl.g:462:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.wwu.pi.acse.customerDsl/src-gen/de/wwu/pi/acse/customerDsl/parser/antlr/internal/InternalCustomerDsl.g:462:1: (lv_name_1_0= RULE_ID )
            // ../de.wwu.pi.acse.customerDsl/src-gen/de/wwu/pi/acse/customerDsl/parser/antlr/internal/InternalCustomerDsl.g:463:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePOBox1016); 

            			newLeafNode(lv_name_1_0, grammarAccess.getPOBoxAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPOBoxRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_rulePOBox1033); 

                	newLeafNode(otherlv_2, grammarAccess.getPOBoxAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,20,FOLLOW_20_in_rulePOBox1045); 

                	newLeafNode(otherlv_3, grammarAccess.getPOBoxAccess().getNumberKeyword_3());
                
            // ../de.wwu.pi.acse.customerDsl/src-gen/de/wwu/pi/acse/customerDsl/parser/antlr/internal/InternalCustomerDsl.g:487:1: ( (lv_number_4_0= RULE_INT ) )
            // ../de.wwu.pi.acse.customerDsl/src-gen/de/wwu/pi/acse/customerDsl/parser/antlr/internal/InternalCustomerDsl.g:488:1: (lv_number_4_0= RULE_INT )
            {
            // ../de.wwu.pi.acse.customerDsl/src-gen/de/wwu/pi/acse/customerDsl/parser/antlr/internal/InternalCustomerDsl.g:488:1: (lv_number_4_0= RULE_INT )
            // ../de.wwu.pi.acse.customerDsl/src-gen/de/wwu/pi/acse/customerDsl/parser/antlr/internal/InternalCustomerDsl.g:489:3: lv_number_4_0= RULE_INT
            {
            lv_number_4_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_rulePOBox1062); 

            			newLeafNode(lv_number_4_0, grammarAccess.getPOBoxAccess().getNumberINTTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPOBoxRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"number",
                    		lv_number_4_0, 
                    		"INT");
            	    

            }


            }

            otherlv_5=(Token)match(input,18,FOLLOW_18_in_rulePOBox1079); 

                	newLeafNode(otherlv_5, grammarAccess.getPOBoxAccess().getZipKeyword_5());
                
            // ../de.wwu.pi.acse.customerDsl/src-gen/de/wwu/pi/acse/customerDsl/parser/antlr/internal/InternalCustomerDsl.g:509:1: ( (lv_zip_6_0= RULE_STRING ) )
            // ../de.wwu.pi.acse.customerDsl/src-gen/de/wwu/pi/acse/customerDsl/parser/antlr/internal/InternalCustomerDsl.g:510:1: (lv_zip_6_0= RULE_STRING )
            {
            // ../de.wwu.pi.acse.customerDsl/src-gen/de/wwu/pi/acse/customerDsl/parser/antlr/internal/InternalCustomerDsl.g:510:1: (lv_zip_6_0= RULE_STRING )
            // ../de.wwu.pi.acse.customerDsl/src-gen/de/wwu/pi/acse/customerDsl/parser/antlr/internal/InternalCustomerDsl.g:511:3: lv_zip_6_0= RULE_STRING
            {
            lv_zip_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePOBox1096); 

            			newLeafNode(lv_zip_6_0, grammarAccess.getPOBoxAccess().getZipSTRINGTerminalRuleCall_6_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPOBoxRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"zip",
                    		lv_zip_6_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_7=(Token)match(input,14,FOLLOW_14_in_rulePOBox1113); 

                	newLeafNode(otherlv_7, grammarAccess.getPOBoxAccess().getRightCurlyBracketKeyword_7());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePOBox"


    // $ANTLR start "entryRuleOrder"
    // ../de.wwu.pi.acse.customerDsl/src-gen/de/wwu/pi/acse/customerDsl/parser/antlr/internal/InternalCustomerDsl.g:539:1: entryRuleOrder returns [EObject current=null] : iv_ruleOrder= ruleOrder EOF ;
    public final EObject entryRuleOrder() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrder = null;


        try {
            // ../de.wwu.pi.acse.customerDsl/src-gen/de/wwu/pi/acse/customerDsl/parser/antlr/internal/InternalCustomerDsl.g:540:2: (iv_ruleOrder= ruleOrder EOF )
            // ../de.wwu.pi.acse.customerDsl/src-gen/de/wwu/pi/acse/customerDsl/parser/antlr/internal/InternalCustomerDsl.g:541:2: iv_ruleOrder= ruleOrder EOF
            {
             newCompositeNode(grammarAccess.getOrderRule()); 
            pushFollow(FOLLOW_ruleOrder_in_entryRuleOrder1149);
            iv_ruleOrder=ruleOrder();

            state._fsp--;

             current =iv_ruleOrder; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrder1159); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOrder"


    // $ANTLR start "ruleOrder"
    // ../de.wwu.pi.acse.customerDsl/src-gen/de/wwu/pi/acse/customerDsl/parser/antlr/internal/InternalCustomerDsl.g:548:1: ruleOrder returns [EObject current=null] : (otherlv_0= 'Order' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'by' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'to' ( (otherlv_6= RULE_ID ) ) (otherlv_7= 'via' ( (lv_channel_8_0= ruleOrderChannel ) ) )? otherlv_9= '}' ) ;
    public final EObject ruleOrder() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Enumerator lv_channel_8_0 = null;


         enterRule(); 
            
        try {
            // ../de.wwu.pi.acse.customerDsl/src-gen/de/wwu/pi/acse/customerDsl/parser/antlr/internal/InternalCustomerDsl.g:551:28: ( (otherlv_0= 'Order' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'by' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'to' ( (otherlv_6= RULE_ID ) ) (otherlv_7= 'via' ( (lv_channel_8_0= ruleOrderChannel ) ) )? otherlv_9= '}' ) )
            // ../de.wwu.pi.acse.customerDsl/src-gen/de/wwu/pi/acse/customerDsl/parser/antlr/internal/InternalCustomerDsl.g:552:1: (otherlv_0= 'Order' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'by' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'to' ( (otherlv_6= RULE_ID ) ) (otherlv_7= 'via' ( (lv_channel_8_0= ruleOrderChannel ) ) )? otherlv_9= '}' )
            {
            // ../de.wwu.pi.acse.customerDsl/src-gen/de/wwu/pi/acse/customerDsl/parser/antlr/internal/InternalCustomerDsl.g:552:1: (otherlv_0= 'Order' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'by' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'to' ( (otherlv_6= RULE_ID ) ) (otherlv_7= 'via' ( (lv_channel_8_0= ruleOrderChannel ) ) )? otherlv_9= '}' )
            // ../de.wwu.pi.acse.customerDsl/src-gen/de/wwu/pi/acse/customerDsl/parser/antlr/internal/InternalCustomerDsl.g:552:3: otherlv_0= 'Order' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'by' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'to' ( (otherlv_6= RULE_ID ) ) (otherlv_7= 'via' ( (lv_channel_8_0= ruleOrderChannel ) ) )? otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_21_in_ruleOrder1196); 

                	newLeafNode(otherlv_0, grammarAccess.getOrderAccess().getOrderKeyword_0());
                
            // ../de.wwu.pi.acse.customerDsl/src-gen/de/wwu/pi/acse/customerDsl/parser/antlr/internal/InternalCustomerDsl.g:556:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.wwu.pi.acse.customerDsl/src-gen/de/wwu/pi/acse/customerDsl/parser/antlr/internal/InternalCustomerDsl.g:557:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.wwu.pi.acse.customerDsl/src-gen/de/wwu/pi/acse/customerDsl/parser/antlr/internal/InternalCustomerDsl.g:557:1: (lv_name_1_0= RULE_ID )
            // ../de.wwu.pi.acse.customerDsl/src-gen/de/wwu/pi/acse/customerDsl/parser/antlr/internal/InternalCustomerDsl.g:558:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleOrder1213); 

            			newLeafNode(lv_name_1_0, grammarAccess.getOrderAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getOrderRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleOrder1230); 

                	newLeafNode(otherlv_2, grammarAccess.getOrderAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,22,FOLLOW_22_in_ruleOrder1242); 

                	newLeafNode(otherlv_3, grammarAccess.getOrderAccess().getByKeyword_3());
                
            // ../de.wwu.pi.acse.customerDsl/src-gen/de/wwu/pi/acse/customerDsl/parser/antlr/internal/InternalCustomerDsl.g:582:1: ( (otherlv_4= RULE_ID ) )
            // ../de.wwu.pi.acse.customerDsl/src-gen/de/wwu/pi/acse/customerDsl/parser/antlr/internal/InternalCustomerDsl.g:583:1: (otherlv_4= RULE_ID )
            {
            // ../de.wwu.pi.acse.customerDsl/src-gen/de/wwu/pi/acse/customerDsl/parser/antlr/internal/InternalCustomerDsl.g:583:1: (otherlv_4= RULE_ID )
            // ../de.wwu.pi.acse.customerDsl/src-gen/de/wwu/pi/acse/customerDsl/parser/antlr/internal/InternalCustomerDsl.g:584:3: otherlv_4= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getOrderRule());
            	        }
                    
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleOrder1262); 

            		newLeafNode(otherlv_4, grammarAccess.getOrderAccess().getCustomerCustomerCrossReference_4_0()); 
            	

            }


            }

            otherlv_5=(Token)match(input,23,FOLLOW_23_in_ruleOrder1274); 

                	newLeafNode(otherlv_5, grammarAccess.getOrderAccess().getToKeyword_5());
                
            // ../de.wwu.pi.acse.customerDsl/src-gen/de/wwu/pi/acse/customerDsl/parser/antlr/internal/InternalCustomerDsl.g:599:1: ( (otherlv_6= RULE_ID ) )
            // ../de.wwu.pi.acse.customerDsl/src-gen/de/wwu/pi/acse/customerDsl/parser/antlr/internal/InternalCustomerDsl.g:600:1: (otherlv_6= RULE_ID )
            {
            // ../de.wwu.pi.acse.customerDsl/src-gen/de/wwu/pi/acse/customerDsl/parser/antlr/internal/InternalCustomerDsl.g:600:1: (otherlv_6= RULE_ID )
            // ../de.wwu.pi.acse.customerDsl/src-gen/de/wwu/pi/acse/customerDsl/parser/antlr/internal/InternalCustomerDsl.g:601:3: otherlv_6= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getOrderRule());
            	        }
                    
            otherlv_6=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleOrder1294); 

            		newLeafNode(otherlv_6, grammarAccess.getOrderAccess().getAddressAddressCrossReference_6_0()); 
            	

            }


            }

            // ../de.wwu.pi.acse.customerDsl/src-gen/de/wwu/pi/acse/customerDsl/parser/antlr/internal/InternalCustomerDsl.g:612:2: (otherlv_7= 'via' ( (lv_channel_8_0= ruleOrderChannel ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==24) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../de.wwu.pi.acse.customerDsl/src-gen/de/wwu/pi/acse/customerDsl/parser/antlr/internal/InternalCustomerDsl.g:612:4: otherlv_7= 'via' ( (lv_channel_8_0= ruleOrderChannel ) )
                    {
                    otherlv_7=(Token)match(input,24,FOLLOW_24_in_ruleOrder1307); 

                        	newLeafNode(otherlv_7, grammarAccess.getOrderAccess().getViaKeyword_7_0());
                        
                    // ../de.wwu.pi.acse.customerDsl/src-gen/de/wwu/pi/acse/customerDsl/parser/antlr/internal/InternalCustomerDsl.g:616:1: ( (lv_channel_8_0= ruleOrderChannel ) )
                    // ../de.wwu.pi.acse.customerDsl/src-gen/de/wwu/pi/acse/customerDsl/parser/antlr/internal/InternalCustomerDsl.g:617:1: (lv_channel_8_0= ruleOrderChannel )
                    {
                    // ../de.wwu.pi.acse.customerDsl/src-gen/de/wwu/pi/acse/customerDsl/parser/antlr/internal/InternalCustomerDsl.g:617:1: (lv_channel_8_0= ruleOrderChannel )
                    // ../de.wwu.pi.acse.customerDsl/src-gen/de/wwu/pi/acse/customerDsl/parser/antlr/internal/InternalCustomerDsl.g:618:3: lv_channel_8_0= ruleOrderChannel
                    {
                     
                    	        newCompositeNode(grammarAccess.getOrderAccess().getChannelOrderChannelEnumRuleCall_7_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleOrderChannel_in_ruleOrder1328);
                    lv_channel_8_0=ruleOrderChannel();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getOrderRule());
                    	        }
                           		set(
                           			current, 
                           			"channel",
                            		lv_channel_8_0, 
                            		"OrderChannel");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,14,FOLLOW_14_in_ruleOrder1342); 

                	newLeafNode(otherlv_9, grammarAccess.getOrderAccess().getRightCurlyBracketKeyword_8());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOrder"


    // $ANTLR start "entryRuleProduct"
    // ../de.wwu.pi.acse.customerDsl/src-gen/de/wwu/pi/acse/customerDsl/parser/antlr/internal/InternalCustomerDsl.g:646:1: entryRuleProduct returns [EObject current=null] : iv_ruleProduct= ruleProduct EOF ;
    public final EObject entryRuleProduct() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProduct = null;


        try {
            // ../de.wwu.pi.acse.customerDsl/src-gen/de/wwu/pi/acse/customerDsl/parser/antlr/internal/InternalCustomerDsl.g:647:2: (iv_ruleProduct= ruleProduct EOF )
            // ../de.wwu.pi.acse.customerDsl/src-gen/de/wwu/pi/acse/customerDsl/parser/antlr/internal/InternalCustomerDsl.g:648:2: iv_ruleProduct= ruleProduct EOF
            {
             newCompositeNode(grammarAccess.getProductRule()); 
            pushFollow(FOLLOW_ruleProduct_in_entryRuleProduct1378);
            iv_ruleProduct=ruleProduct();

            state._fsp--;

             current =iv_ruleProduct; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProduct1388); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProduct"


    // $ANTLR start "ruleProduct"
    // ../de.wwu.pi.acse.customerDsl/src-gen/de/wwu/pi/acse/customerDsl/parser/antlr/internal/InternalCustomerDsl.g:655:1: ruleProduct returns [EObject current=null] : (otherlv_0= 'Product' ( (lv_name_1_0= RULE_STRING ) )? ( (lv_price_2_0= RULE_INT ) )? ) ;
    public final EObject ruleProduct() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_price_2_0=null;

         enterRule(); 
            
        try {
            // ../de.wwu.pi.acse.customerDsl/src-gen/de/wwu/pi/acse/customerDsl/parser/antlr/internal/InternalCustomerDsl.g:658:28: ( (otherlv_0= 'Product' ( (lv_name_1_0= RULE_STRING ) )? ( (lv_price_2_0= RULE_INT ) )? ) )
            // ../de.wwu.pi.acse.customerDsl/src-gen/de/wwu/pi/acse/customerDsl/parser/antlr/internal/InternalCustomerDsl.g:659:1: (otherlv_0= 'Product' ( (lv_name_1_0= RULE_STRING ) )? ( (lv_price_2_0= RULE_INT ) )? )
            {
            // ../de.wwu.pi.acse.customerDsl/src-gen/de/wwu/pi/acse/customerDsl/parser/antlr/internal/InternalCustomerDsl.g:659:1: (otherlv_0= 'Product' ( (lv_name_1_0= RULE_STRING ) )? ( (lv_price_2_0= RULE_INT ) )? )
            // ../de.wwu.pi.acse.customerDsl/src-gen/de/wwu/pi/acse/customerDsl/parser/antlr/internal/InternalCustomerDsl.g:659:3: otherlv_0= 'Product' ( (lv_name_1_0= RULE_STRING ) )? ( (lv_price_2_0= RULE_INT ) )?
            {
            otherlv_0=(Token)match(input,25,FOLLOW_25_in_ruleProduct1425); 

                	newLeafNode(otherlv_0, grammarAccess.getProductAccess().getProductKeyword_0());
                
            // ../de.wwu.pi.acse.customerDsl/src-gen/de/wwu/pi/acse/customerDsl/parser/antlr/internal/InternalCustomerDsl.g:663:1: ( (lv_name_1_0= RULE_STRING ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_STRING) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../de.wwu.pi.acse.customerDsl/src-gen/de/wwu/pi/acse/customerDsl/parser/antlr/internal/InternalCustomerDsl.g:664:1: (lv_name_1_0= RULE_STRING )
                    {
                    // ../de.wwu.pi.acse.customerDsl/src-gen/de/wwu/pi/acse/customerDsl/parser/antlr/internal/InternalCustomerDsl.g:664:1: (lv_name_1_0= RULE_STRING )
                    // ../de.wwu.pi.acse.customerDsl/src-gen/de/wwu/pi/acse/customerDsl/parser/antlr/internal/InternalCustomerDsl.g:665:3: lv_name_1_0= RULE_STRING
                    {
                    lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleProduct1442); 

                    			newLeafNode(lv_name_1_0, grammarAccess.getProductAccess().getNameSTRINGTerminalRuleCall_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getProductRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_1_0, 
                            		"STRING");
                    	    

                    }


                    }
                    break;

            }

            // ../de.wwu.pi.acse.customerDsl/src-gen/de/wwu/pi/acse/customerDsl/parser/antlr/internal/InternalCustomerDsl.g:681:3: ( (lv_price_2_0= RULE_INT ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_INT) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../de.wwu.pi.acse.customerDsl/src-gen/de/wwu/pi/acse/customerDsl/parser/antlr/internal/InternalCustomerDsl.g:682:1: (lv_price_2_0= RULE_INT )
                    {
                    // ../de.wwu.pi.acse.customerDsl/src-gen/de/wwu/pi/acse/customerDsl/parser/antlr/internal/InternalCustomerDsl.g:682:1: (lv_price_2_0= RULE_INT )
                    // ../de.wwu.pi.acse.customerDsl/src-gen/de/wwu/pi/acse/customerDsl/parser/antlr/internal/InternalCustomerDsl.g:683:3: lv_price_2_0= RULE_INT
                    {
                    lv_price_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleProduct1465); 

                    			newLeafNode(lv_price_2_0, grammarAccess.getProductAccess().getPriceINTTerminalRuleCall_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getProductRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"price",
                            		lv_price_2_0, 
                            		"INT");
                    	    

                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProduct"


    // $ANTLR start "ruleOrderChannel"
    // ../de.wwu.pi.acse.customerDsl/src-gen/de/wwu/pi/acse/customerDsl/parser/antlr/internal/InternalCustomerDsl.g:707:1: ruleOrderChannel returns [Enumerator current=null] : ( (enumLiteral_0= 'web' ) | (enumLiteral_1= 'mail' ) | (enumLiteral_2= 'phone' ) ) ;
    public final Enumerator ruleOrderChannel() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../de.wwu.pi.acse.customerDsl/src-gen/de/wwu/pi/acse/customerDsl/parser/antlr/internal/InternalCustomerDsl.g:709:28: ( ( (enumLiteral_0= 'web' ) | (enumLiteral_1= 'mail' ) | (enumLiteral_2= 'phone' ) ) )
            // ../de.wwu.pi.acse.customerDsl/src-gen/de/wwu/pi/acse/customerDsl/parser/antlr/internal/InternalCustomerDsl.g:710:1: ( (enumLiteral_0= 'web' ) | (enumLiteral_1= 'mail' ) | (enumLiteral_2= 'phone' ) )
            {
            // ../de.wwu.pi.acse.customerDsl/src-gen/de/wwu/pi/acse/customerDsl/parser/antlr/internal/InternalCustomerDsl.g:710:1: ( (enumLiteral_0= 'web' ) | (enumLiteral_1= 'mail' ) | (enumLiteral_2= 'phone' ) )
            int alt10=3;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt10=1;
                }
                break;
            case 27:
                {
                alt10=2;
                }
                break;
            case 28:
                {
                alt10=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../de.wwu.pi.acse.customerDsl/src-gen/de/wwu/pi/acse/customerDsl/parser/antlr/internal/InternalCustomerDsl.g:710:2: (enumLiteral_0= 'web' )
                    {
                    // ../de.wwu.pi.acse.customerDsl/src-gen/de/wwu/pi/acse/customerDsl/parser/antlr/internal/InternalCustomerDsl.g:710:2: (enumLiteral_0= 'web' )
                    // ../de.wwu.pi.acse.customerDsl/src-gen/de/wwu/pi/acse/customerDsl/parser/antlr/internal/InternalCustomerDsl.g:710:4: enumLiteral_0= 'web'
                    {
                    enumLiteral_0=(Token)match(input,26,FOLLOW_26_in_ruleOrderChannel1521); 

                            current = grammarAccess.getOrderChannelAccess().getWEBEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getOrderChannelAccess().getWEBEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.wwu.pi.acse.customerDsl/src-gen/de/wwu/pi/acse/customerDsl/parser/antlr/internal/InternalCustomerDsl.g:716:6: (enumLiteral_1= 'mail' )
                    {
                    // ../de.wwu.pi.acse.customerDsl/src-gen/de/wwu/pi/acse/customerDsl/parser/antlr/internal/InternalCustomerDsl.g:716:6: (enumLiteral_1= 'mail' )
                    // ../de.wwu.pi.acse.customerDsl/src-gen/de/wwu/pi/acse/customerDsl/parser/antlr/internal/InternalCustomerDsl.g:716:8: enumLiteral_1= 'mail'
                    {
                    enumLiteral_1=(Token)match(input,27,FOLLOW_27_in_ruleOrderChannel1538); 

                            current = grammarAccess.getOrderChannelAccess().getMAILEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getOrderChannelAccess().getMAILEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../de.wwu.pi.acse.customerDsl/src-gen/de/wwu/pi/acse/customerDsl/parser/antlr/internal/InternalCustomerDsl.g:722:6: (enumLiteral_2= 'phone' )
                    {
                    // ../de.wwu.pi.acse.customerDsl/src-gen/de/wwu/pi/acse/customerDsl/parser/antlr/internal/InternalCustomerDsl.g:722:6: (enumLiteral_2= 'phone' )
                    // ../de.wwu.pi.acse.customerDsl/src-gen/de/wwu/pi/acse/customerDsl/parser/antlr/internal/InternalCustomerDsl.g:722:8: enumLiteral_2= 'phone'
                    {
                    enumLiteral_2=(Token)match(input,28,FOLLOW_28_in_ruleOrderChannel1555); 

                            current = grammarAccess.getOrderChannelAccess().getPHONEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getOrderChannelAccess().getPHONEEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOrderChannel"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleCustomerDb_in_entryRuleCustomerDb75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCustomerDb85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCustomer_in_ruleCustomerDb131 = new BitSet(new long[]{0x0000000002200802L});
    public static final BitSet FOLLOW_ruleOrder_in_ruleCustomerDb153 = new BitSet(new long[]{0x0000000002200002L});
    public static final BitSet FOLLOW_ruleProduct_in_ruleCustomerDb175 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_ruleCustomer_in_entryRuleCustomer212 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCustomer222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleCustomer259 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCustomer276 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleCustomer293 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleCustomer305 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCustomer322 = new BitSet(new long[]{0x0000000000088000L});
    public static final BitSet FOLLOW_ruleAddress_in_ruleCustomer348 = new BitSet(new long[]{0x000000000008C000L});
    public static final BitSet FOLLOW_14_in_ruleCustomer361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddress_in_entryRuleAddress397 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAddress407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStreetAddress_in_ruleAddress454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePOBox_in_ruleAddress481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStreetAddress_in_entryRuleStreetAddress516 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStreetAddress526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleStreetAddress563 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStreetAddress580 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleStreetAddress597 = new BitSet(new long[]{0x0000000000070000L});
    public static final BitSet FOLLOW_16_in_ruleStreetAddress655 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStreetAddress672 = new BitSet(new long[]{0x0000000000074000L});
    public static final BitSet FOLLOW_17_in_ruleStreetAddress745 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStreetAddress762 = new BitSet(new long[]{0x0000000000074000L});
    public static final BitSet FOLLOW_18_in_ruleStreetAddress835 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStreetAddress852 = new BitSet(new long[]{0x0000000000074000L});
    public static final BitSet FOLLOW_14_in_ruleStreetAddress916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePOBox_in_entryRulePOBox952 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePOBox962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rulePOBox999 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePOBox1016 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_rulePOBox1033 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_rulePOBox1045 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_rulePOBox1062 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_rulePOBox1079 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePOBox1096 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_rulePOBox1113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrder_in_entryRuleOrder1149 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrder1159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleOrder1196 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleOrder1213 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleOrder1230 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleOrder1242 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleOrder1262 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleOrder1274 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleOrder1294 = new BitSet(new long[]{0x0000000001004000L});
    public static final BitSet FOLLOW_24_in_ruleOrder1307 = new BitSet(new long[]{0x000000001C000000L});
    public static final BitSet FOLLOW_ruleOrderChannel_in_ruleOrder1328 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleOrder1342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProduct_in_entryRuleProduct1378 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProduct1388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleProduct1425 = new BitSet(new long[]{0x0000000000000062L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleProduct1442 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleProduct1465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleOrderChannel1521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleOrderChannel1538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleOrderChannel1555 = new BitSet(new long[]{0x0000000000000002L});

}
