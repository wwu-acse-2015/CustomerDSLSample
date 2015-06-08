package de.wwu.pi.acse.customerDsl.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import de.wwu.pi.acse.customerDsl.services.CustomerDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCustomerDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'web'", "'mail'", "'phone'", "'Customer'", "'{'", "'name'", "'}'", "'Address'", "'street'", "'city'", "'zip'", "'POBox'", "'number'", "'Order'", "'by'", "'to'", "'via'", "'Product'"
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
    public String getGrammarFileName() { return "../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g"; }


     
     	private CustomerDslGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(CustomerDslGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleCustomerDb"
    // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:60:1: entryRuleCustomerDb : ruleCustomerDb EOF ;
    public final void entryRuleCustomerDb() throws RecognitionException {
        try {
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:61:1: ( ruleCustomerDb EOF )
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:62:1: ruleCustomerDb EOF
            {
             before(grammarAccess.getCustomerDbRule()); 
            pushFollow(FOLLOW_ruleCustomerDb_in_entryRuleCustomerDb61);
            ruleCustomerDb();

            state._fsp--;

             after(grammarAccess.getCustomerDbRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCustomerDb68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCustomerDb"


    // $ANTLR start "ruleCustomerDb"
    // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:69:1: ruleCustomerDb : ( ( rule__CustomerDb__Group__0 ) ) ;
    public final void ruleCustomerDb() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:73:2: ( ( ( rule__CustomerDb__Group__0 ) ) )
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:74:1: ( ( rule__CustomerDb__Group__0 ) )
            {
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:74:1: ( ( rule__CustomerDb__Group__0 ) )
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:75:1: ( rule__CustomerDb__Group__0 )
            {
             before(grammarAccess.getCustomerDbAccess().getGroup()); 
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:76:1: ( rule__CustomerDb__Group__0 )
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:76:2: rule__CustomerDb__Group__0
            {
            pushFollow(FOLLOW_rule__CustomerDb__Group__0_in_ruleCustomerDb94);
            rule__CustomerDb__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCustomerDbAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCustomerDb"


    // $ANTLR start "entryRuleCustomer"
    // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:88:1: entryRuleCustomer : ruleCustomer EOF ;
    public final void entryRuleCustomer() throws RecognitionException {
        try {
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:89:1: ( ruleCustomer EOF )
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:90:1: ruleCustomer EOF
            {
             before(grammarAccess.getCustomerRule()); 
            pushFollow(FOLLOW_ruleCustomer_in_entryRuleCustomer121);
            ruleCustomer();

            state._fsp--;

             after(grammarAccess.getCustomerRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCustomer128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCustomer"


    // $ANTLR start "ruleCustomer"
    // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:97:1: ruleCustomer : ( ( rule__Customer__Group__0 ) ) ;
    public final void ruleCustomer() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:101:2: ( ( ( rule__Customer__Group__0 ) ) )
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:102:1: ( ( rule__Customer__Group__0 ) )
            {
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:102:1: ( ( rule__Customer__Group__0 ) )
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:103:1: ( rule__Customer__Group__0 )
            {
             before(grammarAccess.getCustomerAccess().getGroup()); 
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:104:1: ( rule__Customer__Group__0 )
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:104:2: rule__Customer__Group__0
            {
            pushFollow(FOLLOW_rule__Customer__Group__0_in_ruleCustomer154);
            rule__Customer__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCustomerAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCustomer"


    // $ANTLR start "entryRuleAddress"
    // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:116:1: entryRuleAddress : ruleAddress EOF ;
    public final void entryRuleAddress() throws RecognitionException {
        try {
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:117:1: ( ruleAddress EOF )
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:118:1: ruleAddress EOF
            {
             before(grammarAccess.getAddressRule()); 
            pushFollow(FOLLOW_ruleAddress_in_entryRuleAddress181);
            ruleAddress();

            state._fsp--;

             after(grammarAccess.getAddressRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAddress188); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAddress"


    // $ANTLR start "ruleAddress"
    // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:125:1: ruleAddress : ( ( rule__Address__Alternatives ) ) ;
    public final void ruleAddress() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:129:2: ( ( ( rule__Address__Alternatives ) ) )
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:130:1: ( ( rule__Address__Alternatives ) )
            {
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:130:1: ( ( rule__Address__Alternatives ) )
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:131:1: ( rule__Address__Alternatives )
            {
             before(grammarAccess.getAddressAccess().getAlternatives()); 
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:132:1: ( rule__Address__Alternatives )
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:132:2: rule__Address__Alternatives
            {
            pushFollow(FOLLOW_rule__Address__Alternatives_in_ruleAddress214);
            rule__Address__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAddressAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAddress"


    // $ANTLR start "entryRuleStreetAddress"
    // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:144:1: entryRuleStreetAddress : ruleStreetAddress EOF ;
    public final void entryRuleStreetAddress() throws RecognitionException {
        try {
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:145:1: ( ruleStreetAddress EOF )
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:146:1: ruleStreetAddress EOF
            {
             before(grammarAccess.getStreetAddressRule()); 
            pushFollow(FOLLOW_ruleStreetAddress_in_entryRuleStreetAddress241);
            ruleStreetAddress();

            state._fsp--;

             after(grammarAccess.getStreetAddressRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStreetAddress248); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStreetAddress"


    // $ANTLR start "ruleStreetAddress"
    // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:153:1: ruleStreetAddress : ( ( rule__StreetAddress__Group__0 ) ) ;
    public final void ruleStreetAddress() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:157:2: ( ( ( rule__StreetAddress__Group__0 ) ) )
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:158:1: ( ( rule__StreetAddress__Group__0 ) )
            {
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:158:1: ( ( rule__StreetAddress__Group__0 ) )
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:159:1: ( rule__StreetAddress__Group__0 )
            {
             before(grammarAccess.getStreetAddressAccess().getGroup()); 
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:160:1: ( rule__StreetAddress__Group__0 )
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:160:2: rule__StreetAddress__Group__0
            {
            pushFollow(FOLLOW_rule__StreetAddress__Group__0_in_ruleStreetAddress274);
            rule__StreetAddress__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStreetAddressAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStreetAddress"


    // $ANTLR start "entryRulePOBox"
    // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:172:1: entryRulePOBox : rulePOBox EOF ;
    public final void entryRulePOBox() throws RecognitionException {
        try {
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:173:1: ( rulePOBox EOF )
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:174:1: rulePOBox EOF
            {
             before(grammarAccess.getPOBoxRule()); 
            pushFollow(FOLLOW_rulePOBox_in_entryRulePOBox301);
            rulePOBox();

            state._fsp--;

             after(grammarAccess.getPOBoxRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePOBox308); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePOBox"


    // $ANTLR start "rulePOBox"
    // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:181:1: rulePOBox : ( ( rule__POBox__Group__0 ) ) ;
    public final void rulePOBox() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:185:2: ( ( ( rule__POBox__Group__0 ) ) )
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:186:1: ( ( rule__POBox__Group__0 ) )
            {
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:186:1: ( ( rule__POBox__Group__0 ) )
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:187:1: ( rule__POBox__Group__0 )
            {
             before(grammarAccess.getPOBoxAccess().getGroup()); 
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:188:1: ( rule__POBox__Group__0 )
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:188:2: rule__POBox__Group__0
            {
            pushFollow(FOLLOW_rule__POBox__Group__0_in_rulePOBox334);
            rule__POBox__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPOBoxAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePOBox"


    // $ANTLR start "entryRuleOrder"
    // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:200:1: entryRuleOrder : ruleOrder EOF ;
    public final void entryRuleOrder() throws RecognitionException {
        try {
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:201:1: ( ruleOrder EOF )
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:202:1: ruleOrder EOF
            {
             before(grammarAccess.getOrderRule()); 
            pushFollow(FOLLOW_ruleOrder_in_entryRuleOrder361);
            ruleOrder();

            state._fsp--;

             after(grammarAccess.getOrderRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrder368); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOrder"


    // $ANTLR start "ruleOrder"
    // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:209:1: ruleOrder : ( ( rule__Order__Group__0 ) ) ;
    public final void ruleOrder() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:213:2: ( ( ( rule__Order__Group__0 ) ) )
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:214:1: ( ( rule__Order__Group__0 ) )
            {
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:214:1: ( ( rule__Order__Group__0 ) )
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:215:1: ( rule__Order__Group__0 )
            {
             before(grammarAccess.getOrderAccess().getGroup()); 
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:216:1: ( rule__Order__Group__0 )
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:216:2: rule__Order__Group__0
            {
            pushFollow(FOLLOW_rule__Order__Group__0_in_ruleOrder394);
            rule__Order__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOrderAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOrder"


    // $ANTLR start "entryRuleProduct"
    // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:228:1: entryRuleProduct : ruleProduct EOF ;
    public final void entryRuleProduct() throws RecognitionException {
        try {
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:229:1: ( ruleProduct EOF )
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:230:1: ruleProduct EOF
            {
             before(grammarAccess.getProductRule()); 
            pushFollow(FOLLOW_ruleProduct_in_entryRuleProduct421);
            ruleProduct();

            state._fsp--;

             after(grammarAccess.getProductRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProduct428); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProduct"


    // $ANTLR start "ruleProduct"
    // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:237:1: ruleProduct : ( ( rule__Product__Group__0 ) ) ;
    public final void ruleProduct() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:241:2: ( ( ( rule__Product__Group__0 ) ) )
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:242:1: ( ( rule__Product__Group__0 ) )
            {
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:242:1: ( ( rule__Product__Group__0 ) )
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:243:1: ( rule__Product__Group__0 )
            {
             before(grammarAccess.getProductAccess().getGroup()); 
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:244:1: ( rule__Product__Group__0 )
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:244:2: rule__Product__Group__0
            {
            pushFollow(FOLLOW_rule__Product__Group__0_in_ruleProduct454);
            rule__Product__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProductAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProduct"


    // $ANTLR start "ruleOrderChannel"
    // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:257:1: ruleOrderChannel : ( ( rule__OrderChannel__Alternatives ) ) ;
    public final void ruleOrderChannel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:261:1: ( ( ( rule__OrderChannel__Alternatives ) ) )
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:262:1: ( ( rule__OrderChannel__Alternatives ) )
            {
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:262:1: ( ( rule__OrderChannel__Alternatives ) )
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:263:1: ( rule__OrderChannel__Alternatives )
            {
             before(grammarAccess.getOrderChannelAccess().getAlternatives()); 
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:264:1: ( rule__OrderChannel__Alternatives )
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:264:2: rule__OrderChannel__Alternatives
            {
            pushFollow(FOLLOW_rule__OrderChannel__Alternatives_in_ruleOrderChannel491);
            rule__OrderChannel__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getOrderChannelAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOrderChannel"


    // $ANTLR start "rule__Address__Alternatives"
    // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:275:1: rule__Address__Alternatives : ( ( ruleStreetAddress ) | ( rulePOBox ) );
    public final void rule__Address__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:279:1: ( ( ruleStreetAddress ) | ( rulePOBox ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==18) ) {
                alt1=1;
            }
            else if ( (LA1_0==22) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:280:1: ( ruleStreetAddress )
                    {
                    // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:280:1: ( ruleStreetAddress )
                    // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:281:1: ruleStreetAddress
                    {
                     before(grammarAccess.getAddressAccess().getStreetAddressParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleStreetAddress_in_rule__Address__Alternatives526);
                    ruleStreetAddress();

                    state._fsp--;

                     after(grammarAccess.getAddressAccess().getStreetAddressParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:286:6: ( rulePOBox )
                    {
                    // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:286:6: ( rulePOBox )
                    // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:287:1: rulePOBox
                    {
                     before(grammarAccess.getAddressAccess().getPOBoxParserRuleCall_1()); 
                    pushFollow(FOLLOW_rulePOBox_in_rule__Address__Alternatives543);
                    rulePOBox();

                    state._fsp--;

                     after(grammarAccess.getAddressAccess().getPOBoxParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Address__Alternatives"


    // $ANTLR start "rule__OrderChannel__Alternatives"
    // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:297:1: rule__OrderChannel__Alternatives : ( ( ( 'web' ) ) | ( ( 'mail' ) ) | ( ( 'phone' ) ) );
    public final void rule__OrderChannel__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:301:1: ( ( ( 'web' ) ) | ( ( 'mail' ) ) | ( ( 'phone' ) ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt2=1;
                }
                break;
            case 12:
                {
                alt2=2;
                }
                break;
            case 13:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:302:1: ( ( 'web' ) )
                    {
                    // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:302:1: ( ( 'web' ) )
                    // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:303:1: ( 'web' )
                    {
                     before(grammarAccess.getOrderChannelAccess().getWEBEnumLiteralDeclaration_0()); 
                    // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:304:1: ( 'web' )
                    // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:304:3: 'web'
                    {
                    match(input,11,FOLLOW_11_in_rule__OrderChannel__Alternatives576); 

                    }

                     after(grammarAccess.getOrderChannelAccess().getWEBEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:309:6: ( ( 'mail' ) )
                    {
                    // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:309:6: ( ( 'mail' ) )
                    // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:310:1: ( 'mail' )
                    {
                     before(grammarAccess.getOrderChannelAccess().getMAILEnumLiteralDeclaration_1()); 
                    // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:311:1: ( 'mail' )
                    // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:311:3: 'mail'
                    {
                    match(input,12,FOLLOW_12_in_rule__OrderChannel__Alternatives597); 

                    }

                     after(grammarAccess.getOrderChannelAccess().getMAILEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:316:6: ( ( 'phone' ) )
                    {
                    // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:316:6: ( ( 'phone' ) )
                    // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:317:1: ( 'phone' )
                    {
                     before(grammarAccess.getOrderChannelAccess().getPHONEEnumLiteralDeclaration_2()); 
                    // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:318:1: ( 'phone' )
                    // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:318:3: 'phone'
                    {
                    match(input,13,FOLLOW_13_in_rule__OrderChannel__Alternatives618); 

                    }

                     after(grammarAccess.getOrderChannelAccess().getPHONEEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderChannel__Alternatives"


    // $ANTLR start "rule__CustomerDb__Group__0"
    // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:330:1: rule__CustomerDb__Group__0 : rule__CustomerDb__Group__0__Impl rule__CustomerDb__Group__1 ;
    public final void rule__CustomerDb__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:334:1: ( rule__CustomerDb__Group__0__Impl rule__CustomerDb__Group__1 )
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:335:2: rule__CustomerDb__Group__0__Impl rule__CustomerDb__Group__1
            {
            pushFollow(FOLLOW_rule__CustomerDb__Group__0__Impl_in_rule__CustomerDb__Group__0651);
            rule__CustomerDb__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CustomerDb__Group__1_in_rule__CustomerDb__Group__0654);
            rule__CustomerDb__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomerDb__Group__0"


    // $ANTLR start "rule__CustomerDb__Group__0__Impl"
    // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:342:1: rule__CustomerDb__Group__0__Impl : ( ( rule__CustomerDb__CustomersAssignment_0 )* ) ;
    public final void rule__CustomerDb__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:346:1: ( ( ( rule__CustomerDb__CustomersAssignment_0 )* ) )
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:347:1: ( ( rule__CustomerDb__CustomersAssignment_0 )* )
            {
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:347:1: ( ( rule__CustomerDb__CustomersAssignment_0 )* )
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:348:1: ( rule__CustomerDb__CustomersAssignment_0 )*
            {
             before(grammarAccess.getCustomerDbAccess().getCustomersAssignment_0()); 
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:349:1: ( rule__CustomerDb__CustomersAssignment_0 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==14) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:349:2: rule__CustomerDb__CustomersAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__CustomerDb__CustomersAssignment_0_in_rule__CustomerDb__Group__0__Impl681);
            	    rule__CustomerDb__CustomersAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getCustomerDbAccess().getCustomersAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomerDb__Group__0__Impl"


    // $ANTLR start "rule__CustomerDb__Group__1"
    // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:359:1: rule__CustomerDb__Group__1 : rule__CustomerDb__Group__1__Impl rule__CustomerDb__Group__2 ;
    public final void rule__CustomerDb__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:363:1: ( rule__CustomerDb__Group__1__Impl rule__CustomerDb__Group__2 )
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:364:2: rule__CustomerDb__Group__1__Impl rule__CustomerDb__Group__2
            {
            pushFollow(FOLLOW_rule__CustomerDb__Group__1__Impl_in_rule__CustomerDb__Group__1712);
            rule__CustomerDb__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CustomerDb__Group__2_in_rule__CustomerDb__Group__1715);
            rule__CustomerDb__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomerDb__Group__1"


    // $ANTLR start "rule__CustomerDb__Group__1__Impl"
    // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:371:1: rule__CustomerDb__Group__1__Impl : ( ( rule__CustomerDb__OrdersAssignment_1 )* ) ;
    public final void rule__CustomerDb__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:375:1: ( ( ( rule__CustomerDb__OrdersAssignment_1 )* ) )
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:376:1: ( ( rule__CustomerDb__OrdersAssignment_1 )* )
            {
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:376:1: ( ( rule__CustomerDb__OrdersAssignment_1 )* )
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:377:1: ( rule__CustomerDb__OrdersAssignment_1 )*
            {
             before(grammarAccess.getCustomerDbAccess().getOrdersAssignment_1()); 
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:378:1: ( rule__CustomerDb__OrdersAssignment_1 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==24) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:378:2: rule__CustomerDb__OrdersAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__CustomerDb__OrdersAssignment_1_in_rule__CustomerDb__Group__1__Impl742);
            	    rule__CustomerDb__OrdersAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getCustomerDbAccess().getOrdersAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomerDb__Group__1__Impl"


    // $ANTLR start "rule__CustomerDb__Group__2"
    // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:388:1: rule__CustomerDb__Group__2 : rule__CustomerDb__Group__2__Impl ;
    public final void rule__CustomerDb__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:392:1: ( rule__CustomerDb__Group__2__Impl )
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:393:2: rule__CustomerDb__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__CustomerDb__Group__2__Impl_in_rule__CustomerDb__Group__2773);
            rule__CustomerDb__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomerDb__Group__2"


    // $ANTLR start "rule__CustomerDb__Group__2__Impl"
    // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:399:1: rule__CustomerDb__Group__2__Impl : ( ( rule__CustomerDb__ProductsAssignment_2 )* ) ;
    public final void rule__CustomerDb__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:403:1: ( ( ( rule__CustomerDb__ProductsAssignment_2 )* ) )
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:404:1: ( ( rule__CustomerDb__ProductsAssignment_2 )* )
            {
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:404:1: ( ( rule__CustomerDb__ProductsAssignment_2 )* )
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:405:1: ( rule__CustomerDb__ProductsAssignment_2 )*
            {
             before(grammarAccess.getCustomerDbAccess().getProductsAssignment_2()); 
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:406:1: ( rule__CustomerDb__ProductsAssignment_2 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==28) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:406:2: rule__CustomerDb__ProductsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__CustomerDb__ProductsAssignment_2_in_rule__CustomerDb__Group__2__Impl800);
            	    rule__CustomerDb__ProductsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getCustomerDbAccess().getProductsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomerDb__Group__2__Impl"


    // $ANTLR start "rule__Customer__Group__0"
    // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:422:1: rule__Customer__Group__0 : rule__Customer__Group__0__Impl rule__Customer__Group__1 ;
    public final void rule__Customer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:426:1: ( rule__Customer__Group__0__Impl rule__Customer__Group__1 )
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:427:2: rule__Customer__Group__0__Impl rule__Customer__Group__1
            {
            pushFollow(FOLLOW_rule__Customer__Group__0__Impl_in_rule__Customer__Group__0837);
            rule__Customer__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Customer__Group__1_in_rule__Customer__Group__0840);
            rule__Customer__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Customer__Group__0"


    // $ANTLR start "rule__Customer__Group__0__Impl"
    // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:434:1: rule__Customer__Group__0__Impl : ( 'Customer' ) ;
    public final void rule__Customer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:438:1: ( ( 'Customer' ) )
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:439:1: ( 'Customer' )
            {
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:439:1: ( 'Customer' )
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:440:1: 'Customer'
            {
             before(grammarAccess.getCustomerAccess().getCustomerKeyword_0()); 
            match(input,14,FOLLOW_14_in_rule__Customer__Group__0__Impl868); 
             after(grammarAccess.getCustomerAccess().getCustomerKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Customer__Group__0__Impl"


    // $ANTLR start "rule__Customer__Group__1"
    // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:453:1: rule__Customer__Group__1 : rule__Customer__Group__1__Impl rule__Customer__Group__2 ;
    public final void rule__Customer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:457:1: ( rule__Customer__Group__1__Impl rule__Customer__Group__2 )
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:458:2: rule__Customer__Group__1__Impl rule__Customer__Group__2
            {
            pushFollow(FOLLOW_rule__Customer__Group__1__Impl_in_rule__Customer__Group__1899);
            rule__Customer__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Customer__Group__2_in_rule__Customer__Group__1902);
            rule__Customer__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Customer__Group__1"


    // $ANTLR start "rule__Customer__Group__1__Impl"
    // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:465:1: rule__Customer__Group__1__Impl : ( ( rule__Customer__NameAssignment_1 ) ) ;
    public final void rule__Customer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:469:1: ( ( ( rule__Customer__NameAssignment_1 ) ) )
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:470:1: ( ( rule__Customer__NameAssignment_1 ) )
            {
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:470:1: ( ( rule__Customer__NameAssignment_1 ) )
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:471:1: ( rule__Customer__NameAssignment_1 )
            {
             before(grammarAccess.getCustomerAccess().getNameAssignment_1()); 
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:472:1: ( rule__Customer__NameAssignment_1 )
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:472:2: rule__Customer__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Customer__NameAssignment_1_in_rule__Customer__Group__1__Impl929);
            rule__Customer__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCustomerAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Customer__Group__1__Impl"


    // $ANTLR start "rule__Customer__Group__2"
    // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:482:1: rule__Customer__Group__2 : rule__Customer__Group__2__Impl rule__Customer__Group__3 ;
    public final void rule__Customer__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:486:1: ( rule__Customer__Group__2__Impl rule__Customer__Group__3 )
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:487:2: rule__Customer__Group__2__Impl rule__Customer__Group__3
            {
            pushFollow(FOLLOW_rule__Customer__Group__2__Impl_in_rule__Customer__Group__2959);
            rule__Customer__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Customer__Group__3_in_rule__Customer__Group__2962);
            rule__Customer__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Customer__Group__2"


    // $ANTLR start "rule__Customer__Group__2__Impl"
    // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:494:1: rule__Customer__Group__2__Impl : ( '{' ) ;
    public final void rule__Customer__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:498:1: ( ( '{' ) )
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:499:1: ( '{' )
            {
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:499:1: ( '{' )
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:500:1: '{'
            {
             before(grammarAccess.getCustomerAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,15,FOLLOW_15_in_rule__Customer__Group__2__Impl990); 
             after(grammarAccess.getCustomerAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Customer__Group__2__Impl"


    // $ANTLR start "rule__Customer__Group__3"
    // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:513:1: rule__Customer__Group__3 : rule__Customer__Group__3__Impl rule__Customer__Group__4 ;
    public final void rule__Customer__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:517:1: ( rule__Customer__Group__3__Impl rule__Customer__Group__4 )
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:518:2: rule__Customer__Group__3__Impl rule__Customer__Group__4
            {
            pushFollow(FOLLOW_rule__Customer__Group__3__Impl_in_rule__Customer__Group__31021);
            rule__Customer__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Customer__Group__4_in_rule__Customer__Group__31024);
            rule__Customer__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Customer__Group__3"


    // $ANTLR start "rule__Customer__Group__3__Impl"
    // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:525:1: rule__Customer__Group__3__Impl : ( 'name' ) ;
    public final void rule__Customer__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:529:1: ( ( 'name' ) )
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:530:1: ( 'name' )
            {
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:530:1: ( 'name' )
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:531:1: 'name'
            {
             before(grammarAccess.getCustomerAccess().getNameKeyword_3()); 
            match(input,16,FOLLOW_16_in_rule__Customer__Group__3__Impl1052); 
             after(grammarAccess.getCustomerAccess().getNameKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Customer__Group__3__Impl"


    // $ANTLR start "rule__Customer__Group__4"
    // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:544:1: rule__Customer__Group__4 : rule__Customer__Group__4__Impl rule__Customer__Group__5 ;
    public final void rule__Customer__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:548:1: ( rule__Customer__Group__4__Impl rule__Customer__Group__5 )
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:549:2: rule__Customer__Group__4__Impl rule__Customer__Group__5
            {
            pushFollow(FOLLOW_rule__Customer__Group__4__Impl_in_rule__Customer__Group__41083);
            rule__Customer__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Customer__Group__5_in_rule__Customer__Group__41086);
            rule__Customer__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Customer__Group__4"


    // $ANTLR start "rule__Customer__Group__4__Impl"
    // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:556:1: rule__Customer__Group__4__Impl : ( ( rule__Customer__FullNameAssignment_4 ) ) ;
    public final void rule__Customer__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:560:1: ( ( ( rule__Customer__FullNameAssignment_4 ) ) )
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:561:1: ( ( rule__Customer__FullNameAssignment_4 ) )
            {
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:561:1: ( ( rule__Customer__FullNameAssignment_4 ) )
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:562:1: ( rule__Customer__FullNameAssignment_4 )
            {
             before(grammarAccess.getCustomerAccess().getFullNameAssignment_4()); 
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:563:1: ( rule__Customer__FullNameAssignment_4 )
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:563:2: rule__Customer__FullNameAssignment_4
            {
            pushFollow(FOLLOW_rule__Customer__FullNameAssignment_4_in_rule__Customer__Group__4__Impl1113);
            rule__Customer__FullNameAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getCustomerAccess().getFullNameAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Customer__Group__4__Impl"


    // $ANTLR start "rule__Customer__Group__5"
    // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:573:1: rule__Customer__Group__5 : rule__Customer__Group__5__Impl rule__Customer__Group__6 ;
    public final void rule__Customer__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:577:1: ( rule__Customer__Group__5__Impl rule__Customer__Group__6 )
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:578:2: rule__Customer__Group__5__Impl rule__Customer__Group__6
            {
            pushFollow(FOLLOW_rule__Customer__Group__5__Impl_in_rule__Customer__Group__51143);
            rule__Customer__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Customer__Group__6_in_rule__Customer__Group__51146);
            rule__Customer__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Customer__Group__5"


    // $ANTLR start "rule__Customer__Group__5__Impl"
    // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:585:1: rule__Customer__Group__5__Impl : ( ( ( rule__Customer__AddressesAssignment_5 ) ) ( ( rule__Customer__AddressesAssignment_5 )* ) ) ;
    public final void rule__Customer__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:589:1: ( ( ( ( rule__Customer__AddressesAssignment_5 ) ) ( ( rule__Customer__AddressesAssignment_5 )* ) ) )
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:590:1: ( ( ( rule__Customer__AddressesAssignment_5 ) ) ( ( rule__Customer__AddressesAssignment_5 )* ) )
            {
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:590:1: ( ( ( rule__Customer__AddressesAssignment_5 ) ) ( ( rule__Customer__AddressesAssignment_5 )* ) )
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:591:1: ( ( rule__Customer__AddressesAssignment_5 ) ) ( ( rule__Customer__AddressesAssignment_5 )* )
            {
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:591:1: ( ( rule__Customer__AddressesAssignment_5 ) )
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:592:1: ( rule__Customer__AddressesAssignment_5 )
            {
             before(grammarAccess.getCustomerAccess().getAddressesAssignment_5()); 
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:593:1: ( rule__Customer__AddressesAssignment_5 )
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:593:2: rule__Customer__AddressesAssignment_5
            {
            pushFollow(FOLLOW_rule__Customer__AddressesAssignment_5_in_rule__Customer__Group__5__Impl1175);
            rule__Customer__AddressesAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getCustomerAccess().getAddressesAssignment_5()); 

            }

            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:596:1: ( ( rule__Customer__AddressesAssignment_5 )* )
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:597:1: ( rule__Customer__AddressesAssignment_5 )*
            {
             before(grammarAccess.getCustomerAccess().getAddressesAssignment_5()); 
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:598:1: ( rule__Customer__AddressesAssignment_5 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==18||LA6_0==22) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:598:2: rule__Customer__AddressesAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__Customer__AddressesAssignment_5_in_rule__Customer__Group__5__Impl1187);
            	    rule__Customer__AddressesAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getCustomerAccess().getAddressesAssignment_5()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Customer__Group__5__Impl"


    // $ANTLR start "rule__Customer__Group__6"
    // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:609:1: rule__Customer__Group__6 : rule__Customer__Group__6__Impl ;
    public final void rule__Customer__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:613:1: ( rule__Customer__Group__6__Impl )
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:614:2: rule__Customer__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Customer__Group__6__Impl_in_rule__Customer__Group__61220);
            rule__Customer__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Customer__Group__6"


    // $ANTLR start "rule__Customer__Group__6__Impl"
    // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:620:1: rule__Customer__Group__6__Impl : ( '}' ) ;
    public final void rule__Customer__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:624:1: ( ( '}' ) )
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:625:1: ( '}' )
            {
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:625:1: ( '}' )
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:626:1: '}'
            {
             before(grammarAccess.getCustomerAccess().getRightCurlyBracketKeyword_6()); 
            match(input,17,FOLLOW_17_in_rule__Customer__Group__6__Impl1248); 
             after(grammarAccess.getCustomerAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Customer__Group__6__Impl"


    // $ANTLR start "rule__StreetAddress__Group__0"
    // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:653:1: rule__StreetAddress__Group__0 : rule__StreetAddress__Group__0__Impl rule__StreetAddress__Group__1 ;
    public final void rule__StreetAddress__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:657:1: ( rule__StreetAddress__Group__0__Impl rule__StreetAddress__Group__1 )
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:658:2: rule__StreetAddress__Group__0__Impl rule__StreetAddress__Group__1
            {
            pushFollow(FOLLOW_rule__StreetAddress__Group__0__Impl_in_rule__StreetAddress__Group__01293);
            rule__StreetAddress__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StreetAddress__Group__1_in_rule__StreetAddress__Group__01296);
            rule__StreetAddress__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StreetAddress__Group__0"


    // $ANTLR start "rule__StreetAddress__Group__0__Impl"
    // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:665:1: rule__StreetAddress__Group__0__Impl : ( 'Address' ) ;
    public final void rule__StreetAddress__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:669:1: ( ( 'Address' ) )
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:670:1: ( 'Address' )
            {
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:670:1: ( 'Address' )
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:671:1: 'Address'
            {
             before(grammarAccess.getStreetAddressAccess().getAddressKeyword_0()); 
            match(input,18,FOLLOW_18_in_rule__StreetAddress__Group__0__Impl1324); 
             after(grammarAccess.getStreetAddressAccess().getAddressKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StreetAddress__Group__0__Impl"


    // $ANTLR start "rule__StreetAddress__Group__1"
    // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:684:1: rule__StreetAddress__Group__1 : rule__StreetAddress__Group__1__Impl rule__StreetAddress__Group__2 ;
    public final void rule__StreetAddress__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:688:1: ( rule__StreetAddress__Group__1__Impl rule__StreetAddress__Group__2 )
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:689:2: rule__StreetAddress__Group__1__Impl rule__StreetAddress__Group__2
            {
            pushFollow(FOLLOW_rule__StreetAddress__Group__1__Impl_in_rule__StreetAddress__Group__11355);
            rule__StreetAddress__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StreetAddress__Group__2_in_rule__StreetAddress__Group__11358);
            rule__StreetAddress__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StreetAddress__Group__1"


    // $ANTLR start "rule__StreetAddress__Group__1__Impl"
    // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:696:1: rule__StreetAddress__Group__1__Impl : ( ( rule__StreetAddress__NameAssignment_1 ) ) ;
    public final void rule__StreetAddress__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:700:1: ( ( ( rule__StreetAddress__NameAssignment_1 ) ) )
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:701:1: ( ( rule__StreetAddress__NameAssignment_1 ) )
            {
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:701:1: ( ( rule__StreetAddress__NameAssignment_1 ) )
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:702:1: ( rule__StreetAddress__NameAssignment_1 )
            {
             before(grammarAccess.getStreetAddressAccess().getNameAssignment_1()); 
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:703:1: ( rule__StreetAddress__NameAssignment_1 )
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:703:2: rule__StreetAddress__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__StreetAddress__NameAssignment_1_in_rule__StreetAddress__Group__1__Impl1385);
            rule__StreetAddress__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getStreetAddressAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StreetAddress__Group__1__Impl"


    // $ANTLR start "rule__StreetAddress__Group__2"
    // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:713:1: rule__StreetAddress__Group__2 : rule__StreetAddress__Group__2__Impl rule__StreetAddress__Group__3 ;
    public final void rule__StreetAddress__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:717:1: ( rule__StreetAddress__Group__2__Impl rule__StreetAddress__Group__3 )
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:718:2: rule__StreetAddress__Group__2__Impl rule__StreetAddress__Group__3
            {
            pushFollow(FOLLOW_rule__StreetAddress__Group__2__Impl_in_rule__StreetAddress__Group__21415);
            rule__StreetAddress__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StreetAddress__Group__3_in_rule__StreetAddress__Group__21418);
            rule__StreetAddress__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StreetAddress__Group__2"


    // $ANTLR start "rule__StreetAddress__Group__2__Impl"
    // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:725:1: rule__StreetAddress__Group__2__Impl : ( '{' ) ;
    public final void rule__StreetAddress__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:729:1: ( ( '{' ) )
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:730:1: ( '{' )
            {
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:730:1: ( '{' )
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:731:1: '{'
            {
             before(grammarAccess.getStreetAddressAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,15,FOLLOW_15_in_rule__StreetAddress__Group__2__Impl1446); 
             after(grammarAccess.getStreetAddressAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StreetAddress__Group__2__Impl"


    // $ANTLR start "rule__StreetAddress__Group__3"
    // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:744:1: rule__StreetAddress__Group__3 : rule__StreetAddress__Group__3__Impl rule__StreetAddress__Group__4 ;
    public final void rule__StreetAddress__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:748:1: ( rule__StreetAddress__Group__3__Impl rule__StreetAddress__Group__4 )
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:749:2: rule__StreetAddress__Group__3__Impl rule__StreetAddress__Group__4
            {
            pushFollow(FOLLOW_rule__StreetAddress__Group__3__Impl_in_rule__StreetAddress__Group__31477);
            rule__StreetAddress__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StreetAddress__Group__4_in_rule__StreetAddress__Group__31480);
            rule__StreetAddress__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StreetAddress__Group__3"


    // $ANTLR start "rule__StreetAddress__Group__3__Impl"
    // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:756:1: rule__StreetAddress__Group__3__Impl : ( ( rule__StreetAddress__UnorderedGroup_3 ) ) ;
    public final void rule__StreetAddress__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:760:1: ( ( ( rule__StreetAddress__UnorderedGroup_3 ) ) )
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:761:1: ( ( rule__StreetAddress__UnorderedGroup_3 ) )
            {
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:761:1: ( ( rule__StreetAddress__UnorderedGroup_3 ) )
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:762:1: ( rule__StreetAddress__UnorderedGroup_3 )
            {
             before(grammarAccess.getStreetAddressAccess().getUnorderedGroup_3()); 
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:763:1: ( rule__StreetAddress__UnorderedGroup_3 )
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:763:2: rule__StreetAddress__UnorderedGroup_3
            {
            pushFollow(FOLLOW_rule__StreetAddress__UnorderedGroup_3_in_rule__StreetAddress__Group__3__Impl1507);
            rule__StreetAddress__UnorderedGroup_3();

            state._fsp--;


            }

             after(grammarAccess.getStreetAddressAccess().getUnorderedGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StreetAddress__Group__3__Impl"


    // $ANTLR start "rule__StreetAddress__Group__4"
    // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:773:1: rule__StreetAddress__Group__4 : rule__StreetAddress__Group__4__Impl ;
    public final void rule__StreetAddress__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:777:1: ( rule__StreetAddress__Group__4__Impl )
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:778:2: rule__StreetAddress__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__StreetAddress__Group__4__Impl_in_rule__StreetAddress__Group__41537);
            rule__StreetAddress__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StreetAddress__Group__4"


    // $ANTLR start "rule__StreetAddress__Group__4__Impl"
    // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:784:1: rule__StreetAddress__Group__4__Impl : ( '}' ) ;
    public final void rule__StreetAddress__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:788:1: ( ( '}' ) )
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:789:1: ( '}' )
            {
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:789:1: ( '}' )
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:790:1: '}'
            {
             before(grammarAccess.getStreetAddressAccess().getRightCurlyBracketKeyword_4()); 
            match(input,17,FOLLOW_17_in_rule__StreetAddress__Group__4__Impl1565); 
             after(grammarAccess.getStreetAddressAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StreetAddress__Group__4__Impl"


    // $ANTLR start "rule__StreetAddress__Group_3_0__0"
    // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:813:1: rule__StreetAddress__Group_3_0__0 : rule__StreetAddress__Group_3_0__0__Impl rule__StreetAddress__Group_3_0__1 ;
    public final void rule__StreetAddress__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:817:1: ( rule__StreetAddress__Group_3_0__0__Impl rule__StreetAddress__Group_3_0__1 )
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:818:2: rule__StreetAddress__Group_3_0__0__Impl rule__StreetAddress__Group_3_0__1
            {
            pushFollow(FOLLOW_rule__StreetAddress__Group_3_0__0__Impl_in_rule__StreetAddress__Group_3_0__01606);
            rule__StreetAddress__Group_3_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StreetAddress__Group_3_0__1_in_rule__StreetAddress__Group_3_0__01609);
            rule__StreetAddress__Group_3_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StreetAddress__Group_3_0__0"


    // $ANTLR start "rule__StreetAddress__Group_3_0__0__Impl"
    // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:825:1: rule__StreetAddress__Group_3_0__0__Impl : ( 'street' ) ;
    public final void rule__StreetAddress__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:829:1: ( ( 'street' ) )
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:830:1: ( 'street' )
            {
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:830:1: ( 'street' )
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:831:1: 'street'
            {
             before(grammarAccess.getStreetAddressAccess().getStreetKeyword_3_0_0()); 
            match(input,19,FOLLOW_19_in_rule__StreetAddress__Group_3_0__0__Impl1637); 
             after(grammarAccess.getStreetAddressAccess().getStreetKeyword_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StreetAddress__Group_3_0__0__Impl"


    // $ANTLR start "rule__StreetAddress__Group_3_0__1"
    // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:844:1: rule__StreetAddress__Group_3_0__1 : rule__StreetAddress__Group_3_0__1__Impl ;
    public final void rule__StreetAddress__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:848:1: ( rule__StreetAddress__Group_3_0__1__Impl )
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:849:2: rule__StreetAddress__Group_3_0__1__Impl
            {
            pushFollow(FOLLOW_rule__StreetAddress__Group_3_0__1__Impl_in_rule__StreetAddress__Group_3_0__11668);
            rule__StreetAddress__Group_3_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StreetAddress__Group_3_0__1"


    // $ANTLR start "rule__StreetAddress__Group_3_0__1__Impl"
    // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:855:1: rule__StreetAddress__Group_3_0__1__Impl : ( ( rule__StreetAddress__StreetAssignment_3_0_1 ) ) ;
    public final void rule__StreetAddress__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:859:1: ( ( ( rule__StreetAddress__StreetAssignment_3_0_1 ) ) )
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:860:1: ( ( rule__StreetAddress__StreetAssignment_3_0_1 ) )
            {
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:860:1: ( ( rule__StreetAddress__StreetAssignment_3_0_1 ) )
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:861:1: ( rule__StreetAddress__StreetAssignment_3_0_1 )
            {
             before(grammarAccess.getStreetAddressAccess().getStreetAssignment_3_0_1()); 
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:862:1: ( rule__StreetAddress__StreetAssignment_3_0_1 )
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:862:2: rule__StreetAddress__StreetAssignment_3_0_1
            {
            pushFollow(FOLLOW_rule__StreetAddress__StreetAssignment_3_0_1_in_rule__StreetAddress__Group_3_0__1__Impl1695);
            rule__StreetAddress__StreetAssignment_3_0_1();

            state._fsp--;


            }

             after(grammarAccess.getStreetAddressAccess().getStreetAssignment_3_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StreetAddress__Group_3_0__1__Impl"


    // $ANTLR start "rule__StreetAddress__Group_3_1__0"
    // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:876:1: rule__StreetAddress__Group_3_1__0 : rule__StreetAddress__Group_3_1__0__Impl rule__StreetAddress__Group_3_1__1 ;
    public final void rule__StreetAddress__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:880:1: ( rule__StreetAddress__Group_3_1__0__Impl rule__StreetAddress__Group_3_1__1 )
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:881:2: rule__StreetAddress__Group_3_1__0__Impl rule__StreetAddress__Group_3_1__1
            {
            pushFollow(FOLLOW_rule__StreetAddress__Group_3_1__0__Impl_in_rule__StreetAddress__Group_3_1__01729);
            rule__StreetAddress__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StreetAddress__Group_3_1__1_in_rule__StreetAddress__Group_3_1__01732);
            rule__StreetAddress__Group_3_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StreetAddress__Group_3_1__0"


    // $ANTLR start "rule__StreetAddress__Group_3_1__0__Impl"
    // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:888:1: rule__StreetAddress__Group_3_1__0__Impl : ( 'city' ) ;
    public final void rule__StreetAddress__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:892:1: ( ( 'city' ) )
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:893:1: ( 'city' )
            {
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:893:1: ( 'city' )
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:894:1: 'city'
            {
             before(grammarAccess.getStreetAddressAccess().getCityKeyword_3_1_0()); 
            match(input,20,FOLLOW_20_in_rule__StreetAddress__Group_3_1__0__Impl1760); 
             after(grammarAccess.getStreetAddressAccess().getCityKeyword_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StreetAddress__Group_3_1__0__Impl"


    // $ANTLR start "rule__StreetAddress__Group_3_1__1"
    // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:907:1: rule__StreetAddress__Group_3_1__1 : rule__StreetAddress__Group_3_1__1__Impl ;
    public final void rule__StreetAddress__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:911:1: ( rule__StreetAddress__Group_3_1__1__Impl )
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:912:2: rule__StreetAddress__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_rule__StreetAddress__Group_3_1__1__Impl_in_rule__StreetAddress__Group_3_1__11791);
            rule__StreetAddress__Group_3_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StreetAddress__Group_3_1__1"


    // $ANTLR start "rule__StreetAddress__Group_3_1__1__Impl"
    // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:918:1: rule__StreetAddress__Group_3_1__1__Impl : ( ( rule__StreetAddress__CityAssignment_3_1_1 ) ) ;
    public final void rule__StreetAddress__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:922:1: ( ( ( rule__StreetAddress__CityAssignment_3_1_1 ) ) )
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:923:1: ( ( rule__StreetAddress__CityAssignment_3_1_1 ) )
            {
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:923:1: ( ( rule__StreetAddress__CityAssignment_3_1_1 ) )
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:924:1: ( rule__StreetAddress__CityAssignment_3_1_1 )
            {
             before(grammarAccess.getStreetAddressAccess().getCityAssignment_3_1_1()); 
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:925:1: ( rule__StreetAddress__CityAssignment_3_1_1 )
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:925:2: rule__StreetAddress__CityAssignment_3_1_1
            {
            pushFollow(FOLLOW_rule__StreetAddress__CityAssignment_3_1_1_in_rule__StreetAddress__Group_3_1__1__Impl1818);
            rule__StreetAddress__CityAssignment_3_1_1();

            state._fsp--;


            }

             after(grammarAccess.getStreetAddressAccess().getCityAssignment_3_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StreetAddress__Group_3_1__1__Impl"


    // $ANTLR start "rule__StreetAddress__Group_3_2__0"
    // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:939:1: rule__StreetAddress__Group_3_2__0 : rule__StreetAddress__Group_3_2__0__Impl rule__StreetAddress__Group_3_2__1 ;
    public final void rule__StreetAddress__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:943:1: ( rule__StreetAddress__Group_3_2__0__Impl rule__StreetAddress__Group_3_2__1 )
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:944:2: rule__StreetAddress__Group_3_2__0__Impl rule__StreetAddress__Group_3_2__1
            {
            pushFollow(FOLLOW_rule__StreetAddress__Group_3_2__0__Impl_in_rule__StreetAddress__Group_3_2__01852);
            rule__StreetAddress__Group_3_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StreetAddress__Group_3_2__1_in_rule__StreetAddress__Group_3_2__01855);
            rule__StreetAddress__Group_3_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StreetAddress__Group_3_2__0"


    // $ANTLR start "rule__StreetAddress__Group_3_2__0__Impl"
    // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:951:1: rule__StreetAddress__Group_3_2__0__Impl : ( 'zip' ) ;
    public final void rule__StreetAddress__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:955:1: ( ( 'zip' ) )
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:956:1: ( 'zip' )
            {
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:956:1: ( 'zip' )
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:957:1: 'zip'
            {
             before(grammarAccess.getStreetAddressAccess().getZipKeyword_3_2_0()); 
            match(input,21,FOLLOW_21_in_rule__StreetAddress__Group_3_2__0__Impl1883); 
             after(grammarAccess.getStreetAddressAccess().getZipKeyword_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StreetAddress__Group_3_2__0__Impl"


    // $ANTLR start "rule__StreetAddress__Group_3_2__1"
    // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:970:1: rule__StreetAddress__Group_3_2__1 : rule__StreetAddress__Group_3_2__1__Impl ;
    public final void rule__StreetAddress__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:974:1: ( rule__StreetAddress__Group_3_2__1__Impl )
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:975:2: rule__StreetAddress__Group_3_2__1__Impl
            {
            pushFollow(FOLLOW_rule__StreetAddress__Group_3_2__1__Impl_in_rule__StreetAddress__Group_3_2__11914);
            rule__StreetAddress__Group_3_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StreetAddress__Group_3_2__1"


    // $ANTLR start "rule__StreetAddress__Group_3_2__1__Impl"
    // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:981:1: rule__StreetAddress__Group_3_2__1__Impl : ( ( rule__StreetAddress__ZipAssignment_3_2_1 ) ) ;
    public final void rule__StreetAddress__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:985:1: ( ( ( rule__StreetAddress__ZipAssignment_3_2_1 ) ) )
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:986:1: ( ( rule__StreetAddress__ZipAssignment_3_2_1 ) )
            {
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:986:1: ( ( rule__StreetAddress__ZipAssignment_3_2_1 ) )
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:987:1: ( rule__StreetAddress__ZipAssignment_3_2_1 )
            {
             before(grammarAccess.getStreetAddressAccess().getZipAssignment_3_2_1()); 
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:988:1: ( rule__StreetAddress__ZipAssignment_3_2_1 )
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:988:2: rule__StreetAddress__ZipAssignment_3_2_1
            {
            pushFollow(FOLLOW_rule__StreetAddress__ZipAssignment_3_2_1_in_rule__StreetAddress__Group_3_2__1__Impl1941);
            rule__StreetAddress__ZipAssignment_3_2_1();

            state._fsp--;


            }

             after(grammarAccess.getStreetAddressAccess().getZipAssignment_3_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StreetAddress__Group_3_2__1__Impl"


    // $ANTLR start "rule__POBox__Group__0"
    // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1002:1: rule__POBox__Group__0 : rule__POBox__Group__0__Impl rule__POBox__Group__1 ;
    public final void rule__POBox__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1006:1: ( rule__POBox__Group__0__Impl rule__POBox__Group__1 )
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1007:2: rule__POBox__Group__0__Impl rule__POBox__Group__1
            {
            pushFollow(FOLLOW_rule__POBox__Group__0__Impl_in_rule__POBox__Group__01975);
            rule__POBox__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__POBox__Group__1_in_rule__POBox__Group__01978);
            rule__POBox__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__POBox__Group__0"


    // $ANTLR start "rule__POBox__Group__0__Impl"
    // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1014:1: rule__POBox__Group__0__Impl : ( 'POBox' ) ;
    public final void rule__POBox__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1018:1: ( ( 'POBox' ) )
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1019:1: ( 'POBox' )
            {
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1019:1: ( 'POBox' )
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1020:1: 'POBox'
            {
             before(grammarAccess.getPOBoxAccess().getPOBoxKeyword_0()); 
            match(input,22,FOLLOW_22_in_rule__POBox__Group__0__Impl2006); 
             after(grammarAccess.getPOBoxAccess().getPOBoxKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__POBox__Group__0__Impl"


    // $ANTLR start "rule__POBox__Group__1"
    // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1033:1: rule__POBox__Group__1 : rule__POBox__Group__1__Impl rule__POBox__Group__2 ;
    public final void rule__POBox__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1037:1: ( rule__POBox__Group__1__Impl rule__POBox__Group__2 )
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1038:2: rule__POBox__Group__1__Impl rule__POBox__Group__2
            {
            pushFollow(FOLLOW_rule__POBox__Group__1__Impl_in_rule__POBox__Group__12037);
            rule__POBox__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__POBox__Group__2_in_rule__POBox__Group__12040);
            rule__POBox__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__POBox__Group__1"


    // $ANTLR start "rule__POBox__Group__1__Impl"
    // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1045:1: rule__POBox__Group__1__Impl : ( ( rule__POBox__NameAssignment_1 ) ) ;
    public final void rule__POBox__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1049:1: ( ( ( rule__POBox__NameAssignment_1 ) ) )
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1050:1: ( ( rule__POBox__NameAssignment_1 ) )
            {
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1050:1: ( ( rule__POBox__NameAssignment_1 ) )
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1051:1: ( rule__POBox__NameAssignment_1 )
            {
             before(grammarAccess.getPOBoxAccess().getNameAssignment_1()); 
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1052:1: ( rule__POBox__NameAssignment_1 )
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1052:2: rule__POBox__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__POBox__NameAssignment_1_in_rule__POBox__Group__1__Impl2067);
            rule__POBox__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPOBoxAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__POBox__Group__1__Impl"


    // $ANTLR start "rule__POBox__Group__2"
    // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1062:1: rule__POBox__Group__2 : rule__POBox__Group__2__Impl rule__POBox__Group__3 ;
    public final void rule__POBox__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1066:1: ( rule__POBox__Group__2__Impl rule__POBox__Group__3 )
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1067:2: rule__POBox__Group__2__Impl rule__POBox__Group__3
            {
            pushFollow(FOLLOW_rule__POBox__Group__2__Impl_in_rule__POBox__Group__22097);
            rule__POBox__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__POBox__Group__3_in_rule__POBox__Group__22100);
            rule__POBox__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__POBox__Group__2"


    // $ANTLR start "rule__POBox__Group__2__Impl"
    // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1074:1: rule__POBox__Group__2__Impl : ( '{' ) ;
    public final void rule__POBox__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1078:1: ( ( '{' ) )
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1079:1: ( '{' )
            {
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1079:1: ( '{' )
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1080:1: '{'
            {
             before(grammarAccess.getPOBoxAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,15,FOLLOW_15_in_rule__POBox__Group__2__Impl2128); 
             after(grammarAccess.getPOBoxAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__POBox__Group__2__Impl"


    // $ANTLR start "rule__POBox__Group__3"
    // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1093:1: rule__POBox__Group__3 : rule__POBox__Group__3__Impl rule__POBox__Group__4 ;
    public final void rule__POBox__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1097:1: ( rule__POBox__Group__3__Impl rule__POBox__Group__4 )
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1098:2: rule__POBox__Group__3__Impl rule__POBox__Group__4
            {
            pushFollow(FOLLOW_rule__POBox__Group__3__Impl_in_rule__POBox__Group__32159);
            rule__POBox__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__POBox__Group__4_in_rule__POBox__Group__32162);
            rule__POBox__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__POBox__Group__3"


    // $ANTLR start "rule__POBox__Group__3__Impl"
    // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1105:1: rule__POBox__Group__3__Impl : ( 'number' ) ;
    public final void rule__POBox__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1109:1: ( ( 'number' ) )
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1110:1: ( 'number' )
            {
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1110:1: ( 'number' )
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1111:1: 'number'
            {
             before(grammarAccess.getPOBoxAccess().getNumberKeyword_3()); 
            match(input,23,FOLLOW_23_in_rule__POBox__Group__3__Impl2190); 
             after(grammarAccess.getPOBoxAccess().getNumberKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__POBox__Group__3__Impl"


    // $ANTLR start "rule__POBox__Group__4"
    // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1124:1: rule__POBox__Group__4 : rule__POBox__Group__4__Impl rule__POBox__Group__5 ;
    public final void rule__POBox__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1128:1: ( rule__POBox__Group__4__Impl rule__POBox__Group__5 )
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1129:2: rule__POBox__Group__4__Impl rule__POBox__Group__5
            {
            pushFollow(FOLLOW_rule__POBox__Group__4__Impl_in_rule__POBox__Group__42221);
            rule__POBox__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__POBox__Group__5_in_rule__POBox__Group__42224);
            rule__POBox__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__POBox__Group__4"


    // $ANTLR start "rule__POBox__Group__4__Impl"
    // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1136:1: rule__POBox__Group__4__Impl : ( ( rule__POBox__NumberAssignment_4 ) ) ;
    public final void rule__POBox__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1140:1: ( ( ( rule__POBox__NumberAssignment_4 ) ) )
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1141:1: ( ( rule__POBox__NumberAssignment_4 ) )
            {
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1141:1: ( ( rule__POBox__NumberAssignment_4 ) )
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1142:1: ( rule__POBox__NumberAssignment_4 )
            {
             before(grammarAccess.getPOBoxAccess().getNumberAssignment_4()); 
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1143:1: ( rule__POBox__NumberAssignment_4 )
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1143:2: rule__POBox__NumberAssignment_4
            {
            pushFollow(FOLLOW_rule__POBox__NumberAssignment_4_in_rule__POBox__Group__4__Impl2251);
            rule__POBox__NumberAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getPOBoxAccess().getNumberAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__POBox__Group__4__Impl"


    // $ANTLR start "rule__POBox__Group__5"
    // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1153:1: rule__POBox__Group__5 : rule__POBox__Group__5__Impl rule__POBox__Group__6 ;
    public final void rule__POBox__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1157:1: ( rule__POBox__Group__5__Impl rule__POBox__Group__6 )
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1158:2: rule__POBox__Group__5__Impl rule__POBox__Group__6
            {
            pushFollow(FOLLOW_rule__POBox__Group__5__Impl_in_rule__POBox__Group__52281);
            rule__POBox__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__POBox__Group__6_in_rule__POBox__Group__52284);
            rule__POBox__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__POBox__Group__5"


    // $ANTLR start "rule__POBox__Group__5__Impl"
    // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1165:1: rule__POBox__Group__5__Impl : ( 'zip' ) ;
    public final void rule__POBox__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1169:1: ( ( 'zip' ) )
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1170:1: ( 'zip' )
            {
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1170:1: ( 'zip' )
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1171:1: 'zip'
            {
             before(grammarAccess.getPOBoxAccess().getZipKeyword_5()); 
            match(input,21,FOLLOW_21_in_rule__POBox__Group__5__Impl2312); 
             after(grammarAccess.getPOBoxAccess().getZipKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__POBox__Group__5__Impl"


    // $ANTLR start "rule__POBox__Group__6"
    // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1184:1: rule__POBox__Group__6 : rule__POBox__Group__6__Impl rule__POBox__Group__7 ;
    public final void rule__POBox__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1188:1: ( rule__POBox__Group__6__Impl rule__POBox__Group__7 )
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1189:2: rule__POBox__Group__6__Impl rule__POBox__Group__7
            {
            pushFollow(FOLLOW_rule__POBox__Group__6__Impl_in_rule__POBox__Group__62343);
            rule__POBox__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__POBox__Group__7_in_rule__POBox__Group__62346);
            rule__POBox__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__POBox__Group__6"


    // $ANTLR start "rule__POBox__Group__6__Impl"
    // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1196:1: rule__POBox__Group__6__Impl : ( ( rule__POBox__ZipAssignment_6 ) ) ;
    public final void rule__POBox__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1200:1: ( ( ( rule__POBox__ZipAssignment_6 ) ) )
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1201:1: ( ( rule__POBox__ZipAssignment_6 ) )
            {
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1201:1: ( ( rule__POBox__ZipAssignment_6 ) )
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1202:1: ( rule__POBox__ZipAssignment_6 )
            {
             before(grammarAccess.getPOBoxAccess().getZipAssignment_6()); 
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1203:1: ( rule__POBox__ZipAssignment_6 )
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1203:2: rule__POBox__ZipAssignment_6
            {
            pushFollow(FOLLOW_rule__POBox__ZipAssignment_6_in_rule__POBox__Group__6__Impl2373);
            rule__POBox__ZipAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getPOBoxAccess().getZipAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__POBox__Group__6__Impl"


    // $ANTLR start "rule__POBox__Group__7"
    // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1213:1: rule__POBox__Group__7 : rule__POBox__Group__7__Impl ;
    public final void rule__POBox__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1217:1: ( rule__POBox__Group__7__Impl )
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1218:2: rule__POBox__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__POBox__Group__7__Impl_in_rule__POBox__Group__72403);
            rule__POBox__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__POBox__Group__7"


    // $ANTLR start "rule__POBox__Group__7__Impl"
    // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1224:1: rule__POBox__Group__7__Impl : ( '}' ) ;
    public final void rule__POBox__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1228:1: ( ( '}' ) )
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1229:1: ( '}' )
            {
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1229:1: ( '}' )
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1230:1: '}'
            {
             before(grammarAccess.getPOBoxAccess().getRightCurlyBracketKeyword_7()); 
            match(input,17,FOLLOW_17_in_rule__POBox__Group__7__Impl2431); 
             after(grammarAccess.getPOBoxAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__POBox__Group__7__Impl"


    // $ANTLR start "rule__Order__Group__0"
    // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1259:1: rule__Order__Group__0 : rule__Order__Group__0__Impl rule__Order__Group__1 ;
    public final void rule__Order__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1263:1: ( rule__Order__Group__0__Impl rule__Order__Group__1 )
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1264:2: rule__Order__Group__0__Impl rule__Order__Group__1
            {
            pushFollow(FOLLOW_rule__Order__Group__0__Impl_in_rule__Order__Group__02478);
            rule__Order__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Order__Group__1_in_rule__Order__Group__02481);
            rule__Order__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Order__Group__0"


    // $ANTLR start "rule__Order__Group__0__Impl"
    // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1271:1: rule__Order__Group__0__Impl : ( 'Order' ) ;
    public final void rule__Order__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1275:1: ( ( 'Order' ) )
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1276:1: ( 'Order' )
            {
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1276:1: ( 'Order' )
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1277:1: 'Order'
            {
             before(grammarAccess.getOrderAccess().getOrderKeyword_0()); 
            match(input,24,FOLLOW_24_in_rule__Order__Group__0__Impl2509); 
             after(grammarAccess.getOrderAccess().getOrderKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Order__Group__0__Impl"


    // $ANTLR start "rule__Order__Group__1"
    // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1290:1: rule__Order__Group__1 : rule__Order__Group__1__Impl rule__Order__Group__2 ;
    public final void rule__Order__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1294:1: ( rule__Order__Group__1__Impl rule__Order__Group__2 )
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1295:2: rule__Order__Group__1__Impl rule__Order__Group__2
            {
            pushFollow(FOLLOW_rule__Order__Group__1__Impl_in_rule__Order__Group__12540);
            rule__Order__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Order__Group__2_in_rule__Order__Group__12543);
            rule__Order__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Order__Group__1"


    // $ANTLR start "rule__Order__Group__1__Impl"
    // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1302:1: rule__Order__Group__1__Impl : ( ( rule__Order__NameAssignment_1 ) ) ;
    public final void rule__Order__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1306:1: ( ( ( rule__Order__NameAssignment_1 ) ) )
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1307:1: ( ( rule__Order__NameAssignment_1 ) )
            {
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1307:1: ( ( rule__Order__NameAssignment_1 ) )
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1308:1: ( rule__Order__NameAssignment_1 )
            {
             before(grammarAccess.getOrderAccess().getNameAssignment_1()); 
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1309:1: ( rule__Order__NameAssignment_1 )
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1309:2: rule__Order__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Order__NameAssignment_1_in_rule__Order__Group__1__Impl2570);
            rule__Order__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getOrderAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Order__Group__1__Impl"


    // $ANTLR start "rule__Order__Group__2"
    // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1319:1: rule__Order__Group__2 : rule__Order__Group__2__Impl rule__Order__Group__3 ;
    public final void rule__Order__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1323:1: ( rule__Order__Group__2__Impl rule__Order__Group__3 )
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1324:2: rule__Order__Group__2__Impl rule__Order__Group__3
            {
            pushFollow(FOLLOW_rule__Order__Group__2__Impl_in_rule__Order__Group__22600);
            rule__Order__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Order__Group__3_in_rule__Order__Group__22603);
            rule__Order__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Order__Group__2"


    // $ANTLR start "rule__Order__Group__2__Impl"
    // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1331:1: rule__Order__Group__2__Impl : ( '{' ) ;
    public final void rule__Order__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1335:1: ( ( '{' ) )
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1336:1: ( '{' )
            {
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1336:1: ( '{' )
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1337:1: '{'
            {
             before(grammarAccess.getOrderAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,15,FOLLOW_15_in_rule__Order__Group__2__Impl2631); 
             after(grammarAccess.getOrderAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Order__Group__2__Impl"


    // $ANTLR start "rule__Order__Group__3"
    // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1350:1: rule__Order__Group__3 : rule__Order__Group__3__Impl rule__Order__Group__4 ;
    public final void rule__Order__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1354:1: ( rule__Order__Group__3__Impl rule__Order__Group__4 )
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1355:2: rule__Order__Group__3__Impl rule__Order__Group__4
            {
            pushFollow(FOLLOW_rule__Order__Group__3__Impl_in_rule__Order__Group__32662);
            rule__Order__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Order__Group__4_in_rule__Order__Group__32665);
            rule__Order__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Order__Group__3"


    // $ANTLR start "rule__Order__Group__3__Impl"
    // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1362:1: rule__Order__Group__3__Impl : ( 'by' ) ;
    public final void rule__Order__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1366:1: ( ( 'by' ) )
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1367:1: ( 'by' )
            {
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1367:1: ( 'by' )
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1368:1: 'by'
            {
             before(grammarAccess.getOrderAccess().getByKeyword_3()); 
            match(input,25,FOLLOW_25_in_rule__Order__Group__3__Impl2693); 
             after(grammarAccess.getOrderAccess().getByKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Order__Group__3__Impl"


    // $ANTLR start "rule__Order__Group__4"
    // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1381:1: rule__Order__Group__4 : rule__Order__Group__4__Impl rule__Order__Group__5 ;
    public final void rule__Order__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1385:1: ( rule__Order__Group__4__Impl rule__Order__Group__5 )
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1386:2: rule__Order__Group__4__Impl rule__Order__Group__5
            {
            pushFollow(FOLLOW_rule__Order__Group__4__Impl_in_rule__Order__Group__42724);
            rule__Order__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Order__Group__5_in_rule__Order__Group__42727);
            rule__Order__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Order__Group__4"


    // $ANTLR start "rule__Order__Group__4__Impl"
    // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1393:1: rule__Order__Group__4__Impl : ( ( rule__Order__CustomerAssignment_4 ) ) ;
    public final void rule__Order__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1397:1: ( ( ( rule__Order__CustomerAssignment_4 ) ) )
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1398:1: ( ( rule__Order__CustomerAssignment_4 ) )
            {
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1398:1: ( ( rule__Order__CustomerAssignment_4 ) )
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1399:1: ( rule__Order__CustomerAssignment_4 )
            {
             before(grammarAccess.getOrderAccess().getCustomerAssignment_4()); 
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1400:1: ( rule__Order__CustomerAssignment_4 )
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1400:2: rule__Order__CustomerAssignment_4
            {
            pushFollow(FOLLOW_rule__Order__CustomerAssignment_4_in_rule__Order__Group__4__Impl2754);
            rule__Order__CustomerAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getOrderAccess().getCustomerAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Order__Group__4__Impl"


    // $ANTLR start "rule__Order__Group__5"
    // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1410:1: rule__Order__Group__5 : rule__Order__Group__5__Impl rule__Order__Group__6 ;
    public final void rule__Order__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1414:1: ( rule__Order__Group__5__Impl rule__Order__Group__6 )
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1415:2: rule__Order__Group__5__Impl rule__Order__Group__6
            {
            pushFollow(FOLLOW_rule__Order__Group__5__Impl_in_rule__Order__Group__52784);
            rule__Order__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Order__Group__6_in_rule__Order__Group__52787);
            rule__Order__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Order__Group__5"


    // $ANTLR start "rule__Order__Group__5__Impl"
    // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1422:1: rule__Order__Group__5__Impl : ( 'to' ) ;
    public final void rule__Order__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1426:1: ( ( 'to' ) )
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1427:1: ( 'to' )
            {
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1427:1: ( 'to' )
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1428:1: 'to'
            {
             before(grammarAccess.getOrderAccess().getToKeyword_5()); 
            match(input,26,FOLLOW_26_in_rule__Order__Group__5__Impl2815); 
             after(grammarAccess.getOrderAccess().getToKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Order__Group__5__Impl"


    // $ANTLR start "rule__Order__Group__6"
    // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1441:1: rule__Order__Group__6 : rule__Order__Group__6__Impl rule__Order__Group__7 ;
    public final void rule__Order__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1445:1: ( rule__Order__Group__6__Impl rule__Order__Group__7 )
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1446:2: rule__Order__Group__6__Impl rule__Order__Group__7
            {
            pushFollow(FOLLOW_rule__Order__Group__6__Impl_in_rule__Order__Group__62846);
            rule__Order__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Order__Group__7_in_rule__Order__Group__62849);
            rule__Order__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Order__Group__6"


    // $ANTLR start "rule__Order__Group__6__Impl"
    // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1453:1: rule__Order__Group__6__Impl : ( ( rule__Order__AddressAssignment_6 ) ) ;
    public final void rule__Order__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1457:1: ( ( ( rule__Order__AddressAssignment_6 ) ) )
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1458:1: ( ( rule__Order__AddressAssignment_6 ) )
            {
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1458:1: ( ( rule__Order__AddressAssignment_6 ) )
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1459:1: ( rule__Order__AddressAssignment_6 )
            {
             before(grammarAccess.getOrderAccess().getAddressAssignment_6()); 
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1460:1: ( rule__Order__AddressAssignment_6 )
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1460:2: rule__Order__AddressAssignment_6
            {
            pushFollow(FOLLOW_rule__Order__AddressAssignment_6_in_rule__Order__Group__6__Impl2876);
            rule__Order__AddressAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getOrderAccess().getAddressAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Order__Group__6__Impl"


    // $ANTLR start "rule__Order__Group__7"
    // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1470:1: rule__Order__Group__7 : rule__Order__Group__7__Impl rule__Order__Group__8 ;
    public final void rule__Order__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1474:1: ( rule__Order__Group__7__Impl rule__Order__Group__8 )
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1475:2: rule__Order__Group__7__Impl rule__Order__Group__8
            {
            pushFollow(FOLLOW_rule__Order__Group__7__Impl_in_rule__Order__Group__72906);
            rule__Order__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Order__Group__8_in_rule__Order__Group__72909);
            rule__Order__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Order__Group__7"


    // $ANTLR start "rule__Order__Group__7__Impl"
    // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1482:1: rule__Order__Group__7__Impl : ( ( rule__Order__Group_7__0 )? ) ;
    public final void rule__Order__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1486:1: ( ( ( rule__Order__Group_7__0 )? ) )
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1487:1: ( ( rule__Order__Group_7__0 )? )
            {
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1487:1: ( ( rule__Order__Group_7__0 )? )
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1488:1: ( rule__Order__Group_7__0 )?
            {
             before(grammarAccess.getOrderAccess().getGroup_7()); 
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1489:1: ( rule__Order__Group_7__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==27) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1489:2: rule__Order__Group_7__0
                    {
                    pushFollow(FOLLOW_rule__Order__Group_7__0_in_rule__Order__Group__7__Impl2936);
                    rule__Order__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOrderAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Order__Group__7__Impl"


    // $ANTLR start "rule__Order__Group__8"
    // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1499:1: rule__Order__Group__8 : rule__Order__Group__8__Impl ;
    public final void rule__Order__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1503:1: ( rule__Order__Group__8__Impl )
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1504:2: rule__Order__Group__8__Impl
            {
            pushFollow(FOLLOW_rule__Order__Group__8__Impl_in_rule__Order__Group__82967);
            rule__Order__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Order__Group__8"


    // $ANTLR start "rule__Order__Group__8__Impl"
    // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1510:1: rule__Order__Group__8__Impl : ( '}' ) ;
    public final void rule__Order__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1514:1: ( ( '}' ) )
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1515:1: ( '}' )
            {
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1515:1: ( '}' )
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1516:1: '}'
            {
             before(grammarAccess.getOrderAccess().getRightCurlyBracketKeyword_8()); 
            match(input,17,FOLLOW_17_in_rule__Order__Group__8__Impl2995); 
             after(grammarAccess.getOrderAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Order__Group__8__Impl"


    // $ANTLR start "rule__Order__Group_7__0"
    // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1547:1: rule__Order__Group_7__0 : rule__Order__Group_7__0__Impl rule__Order__Group_7__1 ;
    public final void rule__Order__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1551:1: ( rule__Order__Group_7__0__Impl rule__Order__Group_7__1 )
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1552:2: rule__Order__Group_7__0__Impl rule__Order__Group_7__1
            {
            pushFollow(FOLLOW_rule__Order__Group_7__0__Impl_in_rule__Order__Group_7__03044);
            rule__Order__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Order__Group_7__1_in_rule__Order__Group_7__03047);
            rule__Order__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Order__Group_7__0"


    // $ANTLR start "rule__Order__Group_7__0__Impl"
    // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1559:1: rule__Order__Group_7__0__Impl : ( 'via' ) ;
    public final void rule__Order__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1563:1: ( ( 'via' ) )
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1564:1: ( 'via' )
            {
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1564:1: ( 'via' )
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1565:1: 'via'
            {
             before(grammarAccess.getOrderAccess().getViaKeyword_7_0()); 
            match(input,27,FOLLOW_27_in_rule__Order__Group_7__0__Impl3075); 
             after(grammarAccess.getOrderAccess().getViaKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Order__Group_7__0__Impl"


    // $ANTLR start "rule__Order__Group_7__1"
    // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1578:1: rule__Order__Group_7__1 : rule__Order__Group_7__1__Impl ;
    public final void rule__Order__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1582:1: ( rule__Order__Group_7__1__Impl )
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1583:2: rule__Order__Group_7__1__Impl
            {
            pushFollow(FOLLOW_rule__Order__Group_7__1__Impl_in_rule__Order__Group_7__13106);
            rule__Order__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Order__Group_7__1"


    // $ANTLR start "rule__Order__Group_7__1__Impl"
    // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1589:1: rule__Order__Group_7__1__Impl : ( ( rule__Order__ChannelAssignment_7_1 ) ) ;
    public final void rule__Order__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1593:1: ( ( ( rule__Order__ChannelAssignment_7_1 ) ) )
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1594:1: ( ( rule__Order__ChannelAssignment_7_1 ) )
            {
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1594:1: ( ( rule__Order__ChannelAssignment_7_1 ) )
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1595:1: ( rule__Order__ChannelAssignment_7_1 )
            {
             before(grammarAccess.getOrderAccess().getChannelAssignment_7_1()); 
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1596:1: ( rule__Order__ChannelAssignment_7_1 )
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1596:2: rule__Order__ChannelAssignment_7_1
            {
            pushFollow(FOLLOW_rule__Order__ChannelAssignment_7_1_in_rule__Order__Group_7__1__Impl3133);
            rule__Order__ChannelAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getOrderAccess().getChannelAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Order__Group_7__1__Impl"


    // $ANTLR start "rule__Product__Group__0"
    // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1610:1: rule__Product__Group__0 : rule__Product__Group__0__Impl rule__Product__Group__1 ;
    public final void rule__Product__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1614:1: ( rule__Product__Group__0__Impl rule__Product__Group__1 )
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1615:2: rule__Product__Group__0__Impl rule__Product__Group__1
            {
            pushFollow(FOLLOW_rule__Product__Group__0__Impl_in_rule__Product__Group__03167);
            rule__Product__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Product__Group__1_in_rule__Product__Group__03170);
            rule__Product__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Product__Group__0"


    // $ANTLR start "rule__Product__Group__0__Impl"
    // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1622:1: rule__Product__Group__0__Impl : ( 'Product' ) ;
    public final void rule__Product__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1626:1: ( ( 'Product' ) )
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1627:1: ( 'Product' )
            {
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1627:1: ( 'Product' )
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1628:1: 'Product'
            {
             before(grammarAccess.getProductAccess().getProductKeyword_0()); 
            match(input,28,FOLLOW_28_in_rule__Product__Group__0__Impl3198); 
             after(grammarAccess.getProductAccess().getProductKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Product__Group__0__Impl"


    // $ANTLR start "rule__Product__Group__1"
    // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1641:1: rule__Product__Group__1 : rule__Product__Group__1__Impl rule__Product__Group__2 ;
    public final void rule__Product__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1645:1: ( rule__Product__Group__1__Impl rule__Product__Group__2 )
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1646:2: rule__Product__Group__1__Impl rule__Product__Group__2
            {
            pushFollow(FOLLOW_rule__Product__Group__1__Impl_in_rule__Product__Group__13229);
            rule__Product__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Product__Group__2_in_rule__Product__Group__13232);
            rule__Product__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Product__Group__1"


    // $ANTLR start "rule__Product__Group__1__Impl"
    // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1653:1: rule__Product__Group__1__Impl : ( ( rule__Product__NameAssignment_1 )? ) ;
    public final void rule__Product__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1657:1: ( ( ( rule__Product__NameAssignment_1 )? ) )
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1658:1: ( ( rule__Product__NameAssignment_1 )? )
            {
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1658:1: ( ( rule__Product__NameAssignment_1 )? )
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1659:1: ( rule__Product__NameAssignment_1 )?
            {
             before(grammarAccess.getProductAccess().getNameAssignment_1()); 
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1660:1: ( rule__Product__NameAssignment_1 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_STRING) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1660:2: rule__Product__NameAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Product__NameAssignment_1_in_rule__Product__Group__1__Impl3259);
                    rule__Product__NameAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getProductAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Product__Group__1__Impl"


    // $ANTLR start "rule__Product__Group__2"
    // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1670:1: rule__Product__Group__2 : rule__Product__Group__2__Impl ;
    public final void rule__Product__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1674:1: ( rule__Product__Group__2__Impl )
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1675:2: rule__Product__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Product__Group__2__Impl_in_rule__Product__Group__23290);
            rule__Product__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Product__Group__2"


    // $ANTLR start "rule__Product__Group__2__Impl"
    // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1681:1: rule__Product__Group__2__Impl : ( ( rule__Product__PriceAssignment_2 )? ) ;
    public final void rule__Product__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1685:1: ( ( ( rule__Product__PriceAssignment_2 )? ) )
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1686:1: ( ( rule__Product__PriceAssignment_2 )? )
            {
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1686:1: ( ( rule__Product__PriceAssignment_2 )? )
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1687:1: ( rule__Product__PriceAssignment_2 )?
            {
             before(grammarAccess.getProductAccess().getPriceAssignment_2()); 
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1688:1: ( rule__Product__PriceAssignment_2 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_INT) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1688:2: rule__Product__PriceAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Product__PriceAssignment_2_in_rule__Product__Group__2__Impl3317);
                    rule__Product__PriceAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getProductAccess().getPriceAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Product__Group__2__Impl"


    // $ANTLR start "rule__StreetAddress__UnorderedGroup_3"
    // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1705:1: rule__StreetAddress__UnorderedGroup_3 : rule__StreetAddress__UnorderedGroup_3__0 {...}?;
    public final void rule__StreetAddress__UnorderedGroup_3() throws RecognitionException {

            	int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getStreetAddressAccess().getUnorderedGroup_3());
            
        try {
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1710:1: ( rule__StreetAddress__UnorderedGroup_3__0 {...}?)
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1711:2: rule__StreetAddress__UnorderedGroup_3__0 {...}?
            {
            pushFollow(FOLLOW_rule__StreetAddress__UnorderedGroup_3__0_in_rule__StreetAddress__UnorderedGroup_33355);
            rule__StreetAddress__UnorderedGroup_3__0();

            state._fsp--;

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getStreetAddressAccess().getUnorderedGroup_3()) ) {
                throw new FailedPredicateException(input, "rule__StreetAddress__UnorderedGroup_3", "getUnorderedGroupHelper().canLeave(grammarAccess.getStreetAddressAccess().getUnorderedGroup_3())");
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getStreetAddressAccess().getUnorderedGroup_3());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StreetAddress__UnorderedGroup_3"


    // $ANTLR start "rule__StreetAddress__UnorderedGroup_3__Impl"
    // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1722:1: rule__StreetAddress__UnorderedGroup_3__Impl : ( ({...}? => ( ( ( rule__StreetAddress__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__StreetAddress__Group_3_1__0 ) ) ) ) | ({...}? => ( ( ( rule__StreetAddress__Group_3_2__0 ) ) ) ) ) ;
    public final void rule__StreetAddress__UnorderedGroup_3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
            
        try {
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1727:1: ( ( ({...}? => ( ( ( rule__StreetAddress__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__StreetAddress__Group_3_1__0 ) ) ) ) | ({...}? => ( ( ( rule__StreetAddress__Group_3_2__0 ) ) ) ) ) )
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1728:3: ( ({...}? => ( ( ( rule__StreetAddress__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__StreetAddress__Group_3_1__0 ) ) ) ) | ({...}? => ( ( ( rule__StreetAddress__Group_3_2__0 ) ) ) ) )
            {
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1728:3: ( ({...}? => ( ( ( rule__StreetAddress__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__StreetAddress__Group_3_1__0 ) ) ) ) | ({...}? => ( ( ( rule__StreetAddress__Group_3_2__0 ) ) ) ) )
            int alt10=3;
            int LA10_0 = input.LA(1);

            if ( LA10_0 ==19 && getUnorderedGroupHelper().canSelect(grammarAccess.getStreetAddressAccess().getUnorderedGroup_3(), 0) ) {
                alt10=1;
            }
            else if ( LA10_0 ==20 && getUnorderedGroupHelper().canSelect(grammarAccess.getStreetAddressAccess().getUnorderedGroup_3(), 1) ) {
                alt10=2;
            }
            else if ( LA10_0 ==21 && getUnorderedGroupHelper().canSelect(grammarAccess.getStreetAddressAccess().getUnorderedGroup_3(), 2) ) {
                alt10=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1730:4: ({...}? => ( ( ( rule__StreetAddress__Group_3_0__0 ) ) ) )
                    {
                    // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1730:4: ({...}? => ( ( ( rule__StreetAddress__Group_3_0__0 ) ) ) )
                    // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1731:5: {...}? => ( ( ( rule__StreetAddress__Group_3_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getStreetAddressAccess().getUnorderedGroup_3(), 0) ) {
                        throw new FailedPredicateException(input, "rule__StreetAddress__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getStreetAddressAccess().getUnorderedGroup_3(), 0)");
                    }
                    // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1731:110: ( ( ( rule__StreetAddress__Group_3_0__0 ) ) )
                    // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1732:6: ( ( rule__StreetAddress__Group_3_0__0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getStreetAddressAccess().getUnorderedGroup_3(), 0);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1738:6: ( ( rule__StreetAddress__Group_3_0__0 ) )
                    // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1740:7: ( rule__StreetAddress__Group_3_0__0 )
                    {
                     before(grammarAccess.getStreetAddressAccess().getGroup_3_0()); 
                    // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1741:7: ( rule__StreetAddress__Group_3_0__0 )
                    // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1741:8: rule__StreetAddress__Group_3_0__0
                    {
                    pushFollow(FOLLOW_rule__StreetAddress__Group_3_0__0_in_rule__StreetAddress__UnorderedGroup_3__Impl3444);
                    rule__StreetAddress__Group_3_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getStreetAddressAccess().getGroup_3_0()); 

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1747:4: ({...}? => ( ( ( rule__StreetAddress__Group_3_1__0 ) ) ) )
                    {
                    // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1747:4: ({...}? => ( ( ( rule__StreetAddress__Group_3_1__0 ) ) ) )
                    // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1748:5: {...}? => ( ( ( rule__StreetAddress__Group_3_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getStreetAddressAccess().getUnorderedGroup_3(), 1) ) {
                        throw new FailedPredicateException(input, "rule__StreetAddress__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getStreetAddressAccess().getUnorderedGroup_3(), 1)");
                    }
                    // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1748:110: ( ( ( rule__StreetAddress__Group_3_1__0 ) ) )
                    // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1749:6: ( ( rule__StreetAddress__Group_3_1__0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getStreetAddressAccess().getUnorderedGroup_3(), 1);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1755:6: ( ( rule__StreetAddress__Group_3_1__0 ) )
                    // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1757:7: ( rule__StreetAddress__Group_3_1__0 )
                    {
                     before(grammarAccess.getStreetAddressAccess().getGroup_3_1()); 
                    // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1758:7: ( rule__StreetAddress__Group_3_1__0 )
                    // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1758:8: rule__StreetAddress__Group_3_1__0
                    {
                    pushFollow(FOLLOW_rule__StreetAddress__Group_3_1__0_in_rule__StreetAddress__UnorderedGroup_3__Impl3535);
                    rule__StreetAddress__Group_3_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getStreetAddressAccess().getGroup_3_1()); 

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1764:4: ({...}? => ( ( ( rule__StreetAddress__Group_3_2__0 ) ) ) )
                    {
                    // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1764:4: ({...}? => ( ( ( rule__StreetAddress__Group_3_2__0 ) ) ) )
                    // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1765:5: {...}? => ( ( ( rule__StreetAddress__Group_3_2__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getStreetAddressAccess().getUnorderedGroup_3(), 2) ) {
                        throw new FailedPredicateException(input, "rule__StreetAddress__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getStreetAddressAccess().getUnorderedGroup_3(), 2)");
                    }
                    // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1765:110: ( ( ( rule__StreetAddress__Group_3_2__0 ) ) )
                    // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1766:6: ( ( rule__StreetAddress__Group_3_2__0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getStreetAddressAccess().getUnorderedGroup_3(), 2);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1772:6: ( ( rule__StreetAddress__Group_3_2__0 ) )
                    // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1774:7: ( rule__StreetAddress__Group_3_2__0 )
                    {
                     before(grammarAccess.getStreetAddressAccess().getGroup_3_2()); 
                    // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1775:7: ( rule__StreetAddress__Group_3_2__0 )
                    // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1775:8: rule__StreetAddress__Group_3_2__0
                    {
                    pushFollow(FOLLOW_rule__StreetAddress__Group_3_2__0_in_rule__StreetAddress__UnorderedGroup_3__Impl3626);
                    rule__StreetAddress__Group_3_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getStreetAddressAccess().getGroup_3_2()); 

                    }


                    }


                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	if (selected)
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getStreetAddressAccess().getUnorderedGroup_3());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StreetAddress__UnorderedGroup_3__Impl"


    // $ANTLR start "rule__StreetAddress__UnorderedGroup_3__0"
    // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1790:1: rule__StreetAddress__UnorderedGroup_3__0 : rule__StreetAddress__UnorderedGroup_3__Impl ( rule__StreetAddress__UnorderedGroup_3__1 )? ;
    public final void rule__StreetAddress__UnorderedGroup_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1794:1: ( rule__StreetAddress__UnorderedGroup_3__Impl ( rule__StreetAddress__UnorderedGroup_3__1 )? )
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1795:2: rule__StreetAddress__UnorderedGroup_3__Impl ( rule__StreetAddress__UnorderedGroup_3__1 )?
            {
            pushFollow(FOLLOW_rule__StreetAddress__UnorderedGroup_3__Impl_in_rule__StreetAddress__UnorderedGroup_3__03685);
            rule__StreetAddress__UnorderedGroup_3__Impl();

            state._fsp--;

            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1796:2: ( rule__StreetAddress__UnorderedGroup_3__1 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( LA11_0 ==19 && getUnorderedGroupHelper().canSelect(grammarAccess.getStreetAddressAccess().getUnorderedGroup_3(), 0) ) {
                alt11=1;
            }
            else if ( LA11_0 ==20 && getUnorderedGroupHelper().canSelect(grammarAccess.getStreetAddressAccess().getUnorderedGroup_3(), 1) ) {
                alt11=1;
            }
            else if ( LA11_0 ==21 && getUnorderedGroupHelper().canSelect(grammarAccess.getStreetAddressAccess().getUnorderedGroup_3(), 2) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1796:2: rule__StreetAddress__UnorderedGroup_3__1
                    {
                    pushFollow(FOLLOW_rule__StreetAddress__UnorderedGroup_3__1_in_rule__StreetAddress__UnorderedGroup_3__03688);
                    rule__StreetAddress__UnorderedGroup_3__1();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StreetAddress__UnorderedGroup_3__0"


    // $ANTLR start "rule__StreetAddress__UnorderedGroup_3__1"
    // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1803:1: rule__StreetAddress__UnorderedGroup_3__1 : rule__StreetAddress__UnorderedGroup_3__Impl ( rule__StreetAddress__UnorderedGroup_3__2 )? ;
    public final void rule__StreetAddress__UnorderedGroup_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1807:1: ( rule__StreetAddress__UnorderedGroup_3__Impl ( rule__StreetAddress__UnorderedGroup_3__2 )? )
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1808:2: rule__StreetAddress__UnorderedGroup_3__Impl ( rule__StreetAddress__UnorderedGroup_3__2 )?
            {
            pushFollow(FOLLOW_rule__StreetAddress__UnorderedGroup_3__Impl_in_rule__StreetAddress__UnorderedGroup_3__13713);
            rule__StreetAddress__UnorderedGroup_3__Impl();

            state._fsp--;

            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1809:2: ( rule__StreetAddress__UnorderedGroup_3__2 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( LA12_0 ==19 && getUnorderedGroupHelper().canSelect(grammarAccess.getStreetAddressAccess().getUnorderedGroup_3(), 0) ) {
                alt12=1;
            }
            else if ( LA12_0 ==20 && getUnorderedGroupHelper().canSelect(grammarAccess.getStreetAddressAccess().getUnorderedGroup_3(), 1) ) {
                alt12=1;
            }
            else if ( LA12_0 ==21 && getUnorderedGroupHelper().canSelect(grammarAccess.getStreetAddressAccess().getUnorderedGroup_3(), 2) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1809:2: rule__StreetAddress__UnorderedGroup_3__2
                    {
                    pushFollow(FOLLOW_rule__StreetAddress__UnorderedGroup_3__2_in_rule__StreetAddress__UnorderedGroup_3__13716);
                    rule__StreetAddress__UnorderedGroup_3__2();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StreetAddress__UnorderedGroup_3__1"


    // $ANTLR start "rule__StreetAddress__UnorderedGroup_3__2"
    // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1816:1: rule__StreetAddress__UnorderedGroup_3__2 : rule__StreetAddress__UnorderedGroup_3__Impl ;
    public final void rule__StreetAddress__UnorderedGroup_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1820:1: ( rule__StreetAddress__UnorderedGroup_3__Impl )
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1821:2: rule__StreetAddress__UnorderedGroup_3__Impl
            {
            pushFollow(FOLLOW_rule__StreetAddress__UnorderedGroup_3__Impl_in_rule__StreetAddress__UnorderedGroup_3__23741);
            rule__StreetAddress__UnorderedGroup_3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StreetAddress__UnorderedGroup_3__2"


    // $ANTLR start "rule__CustomerDb__CustomersAssignment_0"
    // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1834:1: rule__CustomerDb__CustomersAssignment_0 : ( ruleCustomer ) ;
    public final void rule__CustomerDb__CustomersAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1838:1: ( ( ruleCustomer ) )
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1839:1: ( ruleCustomer )
            {
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1839:1: ( ruleCustomer )
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1840:1: ruleCustomer
            {
             before(grammarAccess.getCustomerDbAccess().getCustomersCustomerParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleCustomer_in_rule__CustomerDb__CustomersAssignment_03775);
            ruleCustomer();

            state._fsp--;

             after(grammarAccess.getCustomerDbAccess().getCustomersCustomerParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomerDb__CustomersAssignment_0"


    // $ANTLR start "rule__CustomerDb__OrdersAssignment_1"
    // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1849:1: rule__CustomerDb__OrdersAssignment_1 : ( ruleOrder ) ;
    public final void rule__CustomerDb__OrdersAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1853:1: ( ( ruleOrder ) )
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1854:1: ( ruleOrder )
            {
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1854:1: ( ruleOrder )
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1855:1: ruleOrder
            {
             before(grammarAccess.getCustomerDbAccess().getOrdersOrderParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleOrder_in_rule__CustomerDb__OrdersAssignment_13806);
            ruleOrder();

            state._fsp--;

             after(grammarAccess.getCustomerDbAccess().getOrdersOrderParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomerDb__OrdersAssignment_1"


    // $ANTLR start "rule__CustomerDb__ProductsAssignment_2"
    // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1864:1: rule__CustomerDb__ProductsAssignment_2 : ( ruleProduct ) ;
    public final void rule__CustomerDb__ProductsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1868:1: ( ( ruleProduct ) )
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1869:1: ( ruleProduct )
            {
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1869:1: ( ruleProduct )
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1870:1: ruleProduct
            {
             before(grammarAccess.getCustomerDbAccess().getProductsProductParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleProduct_in_rule__CustomerDb__ProductsAssignment_23837);
            ruleProduct();

            state._fsp--;

             after(grammarAccess.getCustomerDbAccess().getProductsProductParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomerDb__ProductsAssignment_2"


    // $ANTLR start "rule__Customer__NameAssignment_1"
    // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1879:1: rule__Customer__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Customer__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1883:1: ( ( RULE_ID ) )
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1884:1: ( RULE_ID )
            {
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1884:1: ( RULE_ID )
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1885:1: RULE_ID
            {
             before(grammarAccess.getCustomerAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Customer__NameAssignment_13868); 
             after(grammarAccess.getCustomerAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Customer__NameAssignment_1"


    // $ANTLR start "rule__Customer__FullNameAssignment_4"
    // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1894:1: rule__Customer__FullNameAssignment_4 : ( RULE_STRING ) ;
    public final void rule__Customer__FullNameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1898:1: ( ( RULE_STRING ) )
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1899:1: ( RULE_STRING )
            {
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1899:1: ( RULE_STRING )
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1900:1: RULE_STRING
            {
             before(grammarAccess.getCustomerAccess().getFullNameSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Customer__FullNameAssignment_43899); 
             after(grammarAccess.getCustomerAccess().getFullNameSTRINGTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Customer__FullNameAssignment_4"


    // $ANTLR start "rule__Customer__AddressesAssignment_5"
    // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1909:1: rule__Customer__AddressesAssignment_5 : ( ruleAddress ) ;
    public final void rule__Customer__AddressesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1913:1: ( ( ruleAddress ) )
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1914:1: ( ruleAddress )
            {
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1914:1: ( ruleAddress )
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1915:1: ruleAddress
            {
             before(grammarAccess.getCustomerAccess().getAddressesAddressParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleAddress_in_rule__Customer__AddressesAssignment_53930);
            ruleAddress();

            state._fsp--;

             after(grammarAccess.getCustomerAccess().getAddressesAddressParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Customer__AddressesAssignment_5"


    // $ANTLR start "rule__StreetAddress__NameAssignment_1"
    // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1924:1: rule__StreetAddress__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__StreetAddress__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1928:1: ( ( RULE_ID ) )
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1929:1: ( RULE_ID )
            {
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1929:1: ( RULE_ID )
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1930:1: RULE_ID
            {
             before(grammarAccess.getStreetAddressAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__StreetAddress__NameAssignment_13961); 
             after(grammarAccess.getStreetAddressAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StreetAddress__NameAssignment_1"


    // $ANTLR start "rule__StreetAddress__StreetAssignment_3_0_1"
    // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1939:1: rule__StreetAddress__StreetAssignment_3_0_1 : ( RULE_STRING ) ;
    public final void rule__StreetAddress__StreetAssignment_3_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1943:1: ( ( RULE_STRING ) )
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1944:1: ( RULE_STRING )
            {
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1944:1: ( RULE_STRING )
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1945:1: RULE_STRING
            {
             before(grammarAccess.getStreetAddressAccess().getStreetSTRINGTerminalRuleCall_3_0_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__StreetAddress__StreetAssignment_3_0_13992); 
             after(grammarAccess.getStreetAddressAccess().getStreetSTRINGTerminalRuleCall_3_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StreetAddress__StreetAssignment_3_0_1"


    // $ANTLR start "rule__StreetAddress__CityAssignment_3_1_1"
    // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1954:1: rule__StreetAddress__CityAssignment_3_1_1 : ( RULE_STRING ) ;
    public final void rule__StreetAddress__CityAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1958:1: ( ( RULE_STRING ) )
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1959:1: ( RULE_STRING )
            {
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1959:1: ( RULE_STRING )
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1960:1: RULE_STRING
            {
             before(grammarAccess.getStreetAddressAccess().getCitySTRINGTerminalRuleCall_3_1_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__StreetAddress__CityAssignment_3_1_14023); 
             after(grammarAccess.getStreetAddressAccess().getCitySTRINGTerminalRuleCall_3_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StreetAddress__CityAssignment_3_1_1"


    // $ANTLR start "rule__StreetAddress__ZipAssignment_3_2_1"
    // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1969:1: rule__StreetAddress__ZipAssignment_3_2_1 : ( RULE_STRING ) ;
    public final void rule__StreetAddress__ZipAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1973:1: ( ( RULE_STRING ) )
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1974:1: ( RULE_STRING )
            {
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1974:1: ( RULE_STRING )
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1975:1: RULE_STRING
            {
             before(grammarAccess.getStreetAddressAccess().getZipSTRINGTerminalRuleCall_3_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__StreetAddress__ZipAssignment_3_2_14054); 
             after(grammarAccess.getStreetAddressAccess().getZipSTRINGTerminalRuleCall_3_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StreetAddress__ZipAssignment_3_2_1"


    // $ANTLR start "rule__POBox__NameAssignment_1"
    // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1984:1: rule__POBox__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__POBox__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1988:1: ( ( RULE_ID ) )
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1989:1: ( RULE_ID )
            {
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1989:1: ( RULE_ID )
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1990:1: RULE_ID
            {
             before(grammarAccess.getPOBoxAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__POBox__NameAssignment_14085); 
             after(grammarAccess.getPOBoxAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__POBox__NameAssignment_1"


    // $ANTLR start "rule__POBox__NumberAssignment_4"
    // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:1999:1: rule__POBox__NumberAssignment_4 : ( RULE_INT ) ;
    public final void rule__POBox__NumberAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:2003:1: ( ( RULE_INT ) )
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:2004:1: ( RULE_INT )
            {
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:2004:1: ( RULE_INT )
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:2005:1: RULE_INT
            {
             before(grammarAccess.getPOBoxAccess().getNumberINTTerminalRuleCall_4_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__POBox__NumberAssignment_44116); 
             after(grammarAccess.getPOBoxAccess().getNumberINTTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__POBox__NumberAssignment_4"


    // $ANTLR start "rule__POBox__ZipAssignment_6"
    // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:2014:1: rule__POBox__ZipAssignment_6 : ( RULE_STRING ) ;
    public final void rule__POBox__ZipAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:2018:1: ( ( RULE_STRING ) )
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:2019:1: ( RULE_STRING )
            {
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:2019:1: ( RULE_STRING )
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:2020:1: RULE_STRING
            {
             before(grammarAccess.getPOBoxAccess().getZipSTRINGTerminalRuleCall_6_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__POBox__ZipAssignment_64147); 
             after(grammarAccess.getPOBoxAccess().getZipSTRINGTerminalRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__POBox__ZipAssignment_6"


    // $ANTLR start "rule__Order__NameAssignment_1"
    // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:2029:1: rule__Order__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Order__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:2033:1: ( ( RULE_ID ) )
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:2034:1: ( RULE_ID )
            {
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:2034:1: ( RULE_ID )
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:2035:1: RULE_ID
            {
             before(grammarAccess.getOrderAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Order__NameAssignment_14178); 
             after(grammarAccess.getOrderAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Order__NameAssignment_1"


    // $ANTLR start "rule__Order__CustomerAssignment_4"
    // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:2044:1: rule__Order__CustomerAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__Order__CustomerAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:2048:1: ( ( ( RULE_ID ) ) )
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:2049:1: ( ( RULE_ID ) )
            {
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:2049:1: ( ( RULE_ID ) )
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:2050:1: ( RULE_ID )
            {
             before(grammarAccess.getOrderAccess().getCustomerCustomerCrossReference_4_0()); 
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:2051:1: ( RULE_ID )
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:2052:1: RULE_ID
            {
             before(grammarAccess.getOrderAccess().getCustomerCustomerIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Order__CustomerAssignment_44213); 
             after(grammarAccess.getOrderAccess().getCustomerCustomerIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getOrderAccess().getCustomerCustomerCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Order__CustomerAssignment_4"


    // $ANTLR start "rule__Order__AddressAssignment_6"
    // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:2063:1: rule__Order__AddressAssignment_6 : ( ( RULE_ID ) ) ;
    public final void rule__Order__AddressAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:2067:1: ( ( ( RULE_ID ) ) )
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:2068:1: ( ( RULE_ID ) )
            {
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:2068:1: ( ( RULE_ID ) )
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:2069:1: ( RULE_ID )
            {
             before(grammarAccess.getOrderAccess().getAddressAddressCrossReference_6_0()); 
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:2070:1: ( RULE_ID )
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:2071:1: RULE_ID
            {
             before(grammarAccess.getOrderAccess().getAddressAddressIDTerminalRuleCall_6_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Order__AddressAssignment_64252); 
             after(grammarAccess.getOrderAccess().getAddressAddressIDTerminalRuleCall_6_0_1()); 

            }

             after(grammarAccess.getOrderAccess().getAddressAddressCrossReference_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Order__AddressAssignment_6"


    // $ANTLR start "rule__Order__ChannelAssignment_7_1"
    // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:2082:1: rule__Order__ChannelAssignment_7_1 : ( ruleOrderChannel ) ;
    public final void rule__Order__ChannelAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:2086:1: ( ( ruleOrderChannel ) )
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:2087:1: ( ruleOrderChannel )
            {
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:2087:1: ( ruleOrderChannel )
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:2088:1: ruleOrderChannel
            {
             before(grammarAccess.getOrderAccess().getChannelOrderChannelEnumRuleCall_7_1_0()); 
            pushFollow(FOLLOW_ruleOrderChannel_in_rule__Order__ChannelAssignment_7_14287);
            ruleOrderChannel();

            state._fsp--;

             after(grammarAccess.getOrderAccess().getChannelOrderChannelEnumRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Order__ChannelAssignment_7_1"


    // $ANTLR start "rule__Product__NameAssignment_1"
    // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:2097:1: rule__Product__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Product__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:2101:1: ( ( RULE_STRING ) )
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:2102:1: ( RULE_STRING )
            {
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:2102:1: ( RULE_STRING )
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:2103:1: RULE_STRING
            {
             before(grammarAccess.getProductAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Product__NameAssignment_14318); 
             after(grammarAccess.getProductAccess().getNameSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Product__NameAssignment_1"


    // $ANTLR start "rule__Product__PriceAssignment_2"
    // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:2112:1: rule__Product__PriceAssignment_2 : ( RULE_INT ) ;
    public final void rule__Product__PriceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:2116:1: ( ( RULE_INT ) )
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:2117:1: ( RULE_INT )
            {
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:2117:1: ( RULE_INT )
            // ../de.wwu.pi.acse.customerDsl.ui/src-gen/de/wwu/pi/acse/customerDsl/ui/contentassist/antlr/internal/InternalCustomerDsl.g:2118:1: RULE_INT
            {
             before(grammarAccess.getProductAccess().getPriceINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Product__PriceAssignment_24349); 
             after(grammarAccess.getProductAccess().getPriceINTTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Product__PriceAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleCustomerDb_in_entryRuleCustomerDb61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCustomerDb68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomerDb__Group__0_in_ruleCustomerDb94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCustomer_in_entryRuleCustomer121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCustomer128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Customer__Group__0_in_ruleCustomer154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddress_in_entryRuleAddress181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAddress188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Address__Alternatives_in_ruleAddress214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStreetAddress_in_entryRuleStreetAddress241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStreetAddress248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StreetAddress__Group__0_in_ruleStreetAddress274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePOBox_in_entryRulePOBox301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePOBox308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__POBox__Group__0_in_rulePOBox334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrder_in_entryRuleOrder361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrder368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Order__Group__0_in_ruleOrder394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProduct_in_entryRuleProduct421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProduct428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Product__Group__0_in_ruleProduct454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrderChannel__Alternatives_in_ruleOrderChannel491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStreetAddress_in_rule__Address__Alternatives526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePOBox_in_rule__Address__Alternatives543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__OrderChannel__Alternatives576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__OrderChannel__Alternatives597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__OrderChannel__Alternatives618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomerDb__Group__0__Impl_in_rule__CustomerDb__Group__0651 = new BitSet(new long[]{0x0000000011000000L});
    public static final BitSet FOLLOW_rule__CustomerDb__Group__1_in_rule__CustomerDb__Group__0654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomerDb__CustomersAssignment_0_in_rule__CustomerDb__Group__0__Impl681 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_rule__CustomerDb__Group__1__Impl_in_rule__CustomerDb__Group__1712 = new BitSet(new long[]{0x0000000011000000L});
    public static final BitSet FOLLOW_rule__CustomerDb__Group__2_in_rule__CustomerDb__Group__1715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomerDb__OrdersAssignment_1_in_rule__CustomerDb__Group__1__Impl742 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_rule__CustomerDb__Group__2__Impl_in_rule__CustomerDb__Group__2773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomerDb__ProductsAssignment_2_in_rule__CustomerDb__Group__2__Impl800 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_rule__Customer__Group__0__Impl_in_rule__Customer__Group__0837 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Customer__Group__1_in_rule__Customer__Group__0840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Customer__Group__0__Impl868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Customer__Group__1__Impl_in_rule__Customer__Group__1899 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Customer__Group__2_in_rule__Customer__Group__1902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Customer__NameAssignment_1_in_rule__Customer__Group__1__Impl929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Customer__Group__2__Impl_in_rule__Customer__Group__2959 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Customer__Group__3_in_rule__Customer__Group__2962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Customer__Group__2__Impl990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Customer__Group__3__Impl_in_rule__Customer__Group__31021 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Customer__Group__4_in_rule__Customer__Group__31024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Customer__Group__3__Impl1052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Customer__Group__4__Impl_in_rule__Customer__Group__41083 = new BitSet(new long[]{0x0000000000440000L});
    public static final BitSet FOLLOW_rule__Customer__Group__5_in_rule__Customer__Group__41086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Customer__FullNameAssignment_4_in_rule__Customer__Group__4__Impl1113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Customer__Group__5__Impl_in_rule__Customer__Group__51143 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Customer__Group__6_in_rule__Customer__Group__51146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Customer__AddressesAssignment_5_in_rule__Customer__Group__5__Impl1175 = new BitSet(new long[]{0x0000000000440002L});
    public static final BitSet FOLLOW_rule__Customer__AddressesAssignment_5_in_rule__Customer__Group__5__Impl1187 = new BitSet(new long[]{0x0000000000440002L});
    public static final BitSet FOLLOW_rule__Customer__Group__6__Impl_in_rule__Customer__Group__61220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Customer__Group__6__Impl1248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StreetAddress__Group__0__Impl_in_rule__StreetAddress__Group__01293 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__StreetAddress__Group__1_in_rule__StreetAddress__Group__01296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__StreetAddress__Group__0__Impl1324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StreetAddress__Group__1__Impl_in_rule__StreetAddress__Group__11355 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__StreetAddress__Group__2_in_rule__StreetAddress__Group__11358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StreetAddress__NameAssignment_1_in_rule__StreetAddress__Group__1__Impl1385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StreetAddress__Group__2__Impl_in_rule__StreetAddress__Group__21415 = new BitSet(new long[]{0x0000000000380000L});
    public static final BitSet FOLLOW_rule__StreetAddress__Group__3_in_rule__StreetAddress__Group__21418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__StreetAddress__Group__2__Impl1446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StreetAddress__Group__3__Impl_in_rule__StreetAddress__Group__31477 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__StreetAddress__Group__4_in_rule__StreetAddress__Group__31480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StreetAddress__UnorderedGroup_3_in_rule__StreetAddress__Group__3__Impl1507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StreetAddress__Group__4__Impl_in_rule__StreetAddress__Group__41537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__StreetAddress__Group__4__Impl1565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StreetAddress__Group_3_0__0__Impl_in_rule__StreetAddress__Group_3_0__01606 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__StreetAddress__Group_3_0__1_in_rule__StreetAddress__Group_3_0__01609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__StreetAddress__Group_3_0__0__Impl1637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StreetAddress__Group_3_0__1__Impl_in_rule__StreetAddress__Group_3_0__11668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StreetAddress__StreetAssignment_3_0_1_in_rule__StreetAddress__Group_3_0__1__Impl1695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StreetAddress__Group_3_1__0__Impl_in_rule__StreetAddress__Group_3_1__01729 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__StreetAddress__Group_3_1__1_in_rule__StreetAddress__Group_3_1__01732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__StreetAddress__Group_3_1__0__Impl1760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StreetAddress__Group_3_1__1__Impl_in_rule__StreetAddress__Group_3_1__11791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StreetAddress__CityAssignment_3_1_1_in_rule__StreetAddress__Group_3_1__1__Impl1818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StreetAddress__Group_3_2__0__Impl_in_rule__StreetAddress__Group_3_2__01852 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__StreetAddress__Group_3_2__1_in_rule__StreetAddress__Group_3_2__01855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__StreetAddress__Group_3_2__0__Impl1883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StreetAddress__Group_3_2__1__Impl_in_rule__StreetAddress__Group_3_2__11914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StreetAddress__ZipAssignment_3_2_1_in_rule__StreetAddress__Group_3_2__1__Impl1941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__POBox__Group__0__Impl_in_rule__POBox__Group__01975 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__POBox__Group__1_in_rule__POBox__Group__01978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__POBox__Group__0__Impl2006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__POBox__Group__1__Impl_in_rule__POBox__Group__12037 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__POBox__Group__2_in_rule__POBox__Group__12040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__POBox__NameAssignment_1_in_rule__POBox__Group__1__Impl2067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__POBox__Group__2__Impl_in_rule__POBox__Group__22097 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__POBox__Group__3_in_rule__POBox__Group__22100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__POBox__Group__2__Impl2128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__POBox__Group__3__Impl_in_rule__POBox__Group__32159 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__POBox__Group__4_in_rule__POBox__Group__32162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__POBox__Group__3__Impl2190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__POBox__Group__4__Impl_in_rule__POBox__Group__42221 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__POBox__Group__5_in_rule__POBox__Group__42224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__POBox__NumberAssignment_4_in_rule__POBox__Group__4__Impl2251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__POBox__Group__5__Impl_in_rule__POBox__Group__52281 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__POBox__Group__6_in_rule__POBox__Group__52284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__POBox__Group__5__Impl2312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__POBox__Group__6__Impl_in_rule__POBox__Group__62343 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__POBox__Group__7_in_rule__POBox__Group__62346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__POBox__ZipAssignment_6_in_rule__POBox__Group__6__Impl2373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__POBox__Group__7__Impl_in_rule__POBox__Group__72403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__POBox__Group__7__Impl2431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Order__Group__0__Impl_in_rule__Order__Group__02478 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Order__Group__1_in_rule__Order__Group__02481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Order__Group__0__Impl2509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Order__Group__1__Impl_in_rule__Order__Group__12540 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Order__Group__2_in_rule__Order__Group__12543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Order__NameAssignment_1_in_rule__Order__Group__1__Impl2570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Order__Group__2__Impl_in_rule__Order__Group__22600 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Order__Group__3_in_rule__Order__Group__22603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Order__Group__2__Impl2631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Order__Group__3__Impl_in_rule__Order__Group__32662 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Order__Group__4_in_rule__Order__Group__32665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Order__Group__3__Impl2693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Order__Group__4__Impl_in_rule__Order__Group__42724 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Order__Group__5_in_rule__Order__Group__42727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Order__CustomerAssignment_4_in_rule__Order__Group__4__Impl2754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Order__Group__5__Impl_in_rule__Order__Group__52784 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Order__Group__6_in_rule__Order__Group__52787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Order__Group__5__Impl2815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Order__Group__6__Impl_in_rule__Order__Group__62846 = new BitSet(new long[]{0x0000000008020000L});
    public static final BitSet FOLLOW_rule__Order__Group__7_in_rule__Order__Group__62849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Order__AddressAssignment_6_in_rule__Order__Group__6__Impl2876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Order__Group__7__Impl_in_rule__Order__Group__72906 = new BitSet(new long[]{0x0000000008020000L});
    public static final BitSet FOLLOW_rule__Order__Group__8_in_rule__Order__Group__72909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Order__Group_7__0_in_rule__Order__Group__7__Impl2936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Order__Group__8__Impl_in_rule__Order__Group__82967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Order__Group__8__Impl2995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Order__Group_7__0__Impl_in_rule__Order__Group_7__03044 = new BitSet(new long[]{0x0000000000003800L});
    public static final BitSet FOLLOW_rule__Order__Group_7__1_in_rule__Order__Group_7__03047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Order__Group_7__0__Impl3075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Order__Group_7__1__Impl_in_rule__Order__Group_7__13106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Order__ChannelAssignment_7_1_in_rule__Order__Group_7__1__Impl3133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Product__Group__0__Impl_in_rule__Product__Group__03167 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_rule__Product__Group__1_in_rule__Product__Group__03170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Product__Group__0__Impl3198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Product__Group__1__Impl_in_rule__Product__Group__13229 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_rule__Product__Group__2_in_rule__Product__Group__13232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Product__NameAssignment_1_in_rule__Product__Group__1__Impl3259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Product__Group__2__Impl_in_rule__Product__Group__23290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Product__PriceAssignment_2_in_rule__Product__Group__2__Impl3317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StreetAddress__UnorderedGroup_3__0_in_rule__StreetAddress__UnorderedGroup_33355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StreetAddress__Group_3_0__0_in_rule__StreetAddress__UnorderedGroup_3__Impl3444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StreetAddress__Group_3_1__0_in_rule__StreetAddress__UnorderedGroup_3__Impl3535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StreetAddress__Group_3_2__0_in_rule__StreetAddress__UnorderedGroup_3__Impl3626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StreetAddress__UnorderedGroup_3__Impl_in_rule__StreetAddress__UnorderedGroup_3__03685 = new BitSet(new long[]{0x0000000000380002L});
    public static final BitSet FOLLOW_rule__StreetAddress__UnorderedGroup_3__1_in_rule__StreetAddress__UnorderedGroup_3__03688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StreetAddress__UnorderedGroup_3__Impl_in_rule__StreetAddress__UnorderedGroup_3__13713 = new BitSet(new long[]{0x0000000000380002L});
    public static final BitSet FOLLOW_rule__StreetAddress__UnorderedGroup_3__2_in_rule__StreetAddress__UnorderedGroup_3__13716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StreetAddress__UnorderedGroup_3__Impl_in_rule__StreetAddress__UnorderedGroup_3__23741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCustomer_in_rule__CustomerDb__CustomersAssignment_03775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrder_in_rule__CustomerDb__OrdersAssignment_13806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProduct_in_rule__CustomerDb__ProductsAssignment_23837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Customer__NameAssignment_13868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Customer__FullNameAssignment_43899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddress_in_rule__Customer__AddressesAssignment_53930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__StreetAddress__NameAssignment_13961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__StreetAddress__StreetAssignment_3_0_13992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__StreetAddress__CityAssignment_3_1_14023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__StreetAddress__ZipAssignment_3_2_14054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__POBox__NameAssignment_14085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__POBox__NumberAssignment_44116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__POBox__ZipAssignment_64147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Order__NameAssignment_14178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Order__CustomerAssignment_44213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Order__AddressAssignment_64252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrderChannel_in_rule__Order__ChannelAssignment_7_14287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Product__NameAssignment_14318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Product__PriceAssignment_24349 = new BitSet(new long[]{0x0000000000000002L});

}
