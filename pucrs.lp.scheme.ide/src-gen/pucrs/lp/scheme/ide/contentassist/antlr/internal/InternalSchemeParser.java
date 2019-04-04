package pucrs.lp.scheme.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import pucrs.lp.scheme.services.SchemeGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSchemeParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_OPERATOR", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'('", "')'", "'define'", "'if'", "'='"
    };
    public static final int RULE_ID=4;
    public static final int RULE_WS=10;
    public static final int RULE_STRING=7;
    public static final int RULE_ANY_OTHER=11;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int RULE_INT=5;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_OPERATOR=6;

    // delegates
    // delegators


        public InternalSchemeParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSchemeParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSchemeParser.tokenNames; }
    public String getGrammarFileName() { return "InternalScheme.g"; }


    	private SchemeGrammarAccess grammarAccess;

    	public void setGrammarAccess(SchemeGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleModel"
    // InternalScheme.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalScheme.g:54:1: ( ruleModel EOF )
            // InternalScheme.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalScheme.g:62:1: ruleModel : ( ( rule__Model__CommandsAssignment )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScheme.g:66:2: ( ( ( rule__Model__CommandsAssignment )* ) )
            // InternalScheme.g:67:2: ( ( rule__Model__CommandsAssignment )* )
            {
            // InternalScheme.g:67:2: ( ( rule__Model__CommandsAssignment )* )
            // InternalScheme.g:68:3: ( rule__Model__CommandsAssignment )*
            {
             before(grammarAccess.getModelAccess().getCommandsAssignment()); 
            // InternalScheme.g:69:3: ( rule__Model__CommandsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_INT||LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalScheme.g:69:4: rule__Model__CommandsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Model__CommandsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getCommandsAssignment()); 

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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleCommand"
    // InternalScheme.g:78:1: entryRuleCommand : ruleCommand EOF ;
    public final void entryRuleCommand() throws RecognitionException {
        try {
            // InternalScheme.g:79:1: ( ruleCommand EOF )
            // InternalScheme.g:80:1: ruleCommand EOF
            {
             before(grammarAccess.getCommandRule()); 
            pushFollow(FOLLOW_1);
            ruleCommand();

            state._fsp--;

             after(grammarAccess.getCommandRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleCommand"


    // $ANTLR start "ruleCommand"
    // InternalScheme.g:87:1: ruleCommand : ( ( rule__Command__Alternatives ) ) ;
    public final void ruleCommand() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScheme.g:91:2: ( ( ( rule__Command__Alternatives ) ) )
            // InternalScheme.g:92:2: ( ( rule__Command__Alternatives ) )
            {
            // InternalScheme.g:92:2: ( ( rule__Command__Alternatives ) )
            // InternalScheme.g:93:3: ( rule__Command__Alternatives )
            {
             before(grammarAccess.getCommandAccess().getAlternatives()); 
            // InternalScheme.g:94:3: ( rule__Command__Alternatives )
            // InternalScheme.g:94:4: rule__Command__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Command__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getCommandAccess().getAlternatives()); 

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
    // $ANTLR end "ruleCommand"


    // $ANTLR start "entryRuleOperation"
    // InternalScheme.g:103:1: entryRuleOperation : ruleOperation EOF ;
    public final void entryRuleOperation() throws RecognitionException {
        try {
            // InternalScheme.g:104:1: ( ruleOperation EOF )
            // InternalScheme.g:105:1: ruleOperation EOF
            {
             before(grammarAccess.getOperationRule()); 
            pushFollow(FOLLOW_1);
            ruleOperation();

            state._fsp--;

             after(grammarAccess.getOperationRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleOperation"


    // $ANTLR start "ruleOperation"
    // InternalScheme.g:112:1: ruleOperation : ( ( rule__Operation__Group__0 ) ) ;
    public final void ruleOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScheme.g:116:2: ( ( ( rule__Operation__Group__0 ) ) )
            // InternalScheme.g:117:2: ( ( rule__Operation__Group__0 ) )
            {
            // InternalScheme.g:117:2: ( ( rule__Operation__Group__0 ) )
            // InternalScheme.g:118:3: ( rule__Operation__Group__0 )
            {
             before(grammarAccess.getOperationAccess().getGroup()); 
            // InternalScheme.g:119:3: ( rule__Operation__Group__0 )
            // InternalScheme.g:119:4: rule__Operation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Operation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOperationAccess().getGroup()); 

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
    // $ANTLR end "ruleOperation"


    // $ANTLR start "entryRuleSimpleOperation"
    // InternalScheme.g:128:1: entryRuleSimpleOperation : ruleSimpleOperation EOF ;
    public final void entryRuleSimpleOperation() throws RecognitionException {
        try {
            // InternalScheme.g:129:1: ( ruleSimpleOperation EOF )
            // InternalScheme.g:130:1: ruleSimpleOperation EOF
            {
             before(grammarAccess.getSimpleOperationRule()); 
            pushFollow(FOLLOW_1);
            ruleSimpleOperation();

            state._fsp--;

             after(grammarAccess.getSimpleOperationRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSimpleOperation"


    // $ANTLR start "ruleSimpleOperation"
    // InternalScheme.g:137:1: ruleSimpleOperation : ( ( rule__SimpleOperation__Group__0 ) ) ;
    public final void ruleSimpleOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScheme.g:141:2: ( ( ( rule__SimpleOperation__Group__0 ) ) )
            // InternalScheme.g:142:2: ( ( rule__SimpleOperation__Group__0 ) )
            {
            // InternalScheme.g:142:2: ( ( rule__SimpleOperation__Group__0 ) )
            // InternalScheme.g:143:3: ( rule__SimpleOperation__Group__0 )
            {
             before(grammarAccess.getSimpleOperationAccess().getGroup()); 
            // InternalScheme.g:144:3: ( rule__SimpleOperation__Group__0 )
            // InternalScheme.g:144:4: rule__SimpleOperation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SimpleOperation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSimpleOperationAccess().getGroup()); 

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
    // $ANTLR end "ruleSimpleOperation"


    // $ANTLR start "entryRuleDefine"
    // InternalScheme.g:153:1: entryRuleDefine : ruleDefine EOF ;
    public final void entryRuleDefine() throws RecognitionException {
        try {
            // InternalScheme.g:154:1: ( ruleDefine EOF )
            // InternalScheme.g:155:1: ruleDefine EOF
            {
             before(grammarAccess.getDefineRule()); 
            pushFollow(FOLLOW_1);
            ruleDefine();

            state._fsp--;

             after(grammarAccess.getDefineRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDefine"


    // $ANTLR start "ruleDefine"
    // InternalScheme.g:162:1: ruleDefine : ( ( rule__Define__Group__0 ) ) ;
    public final void ruleDefine() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScheme.g:166:2: ( ( ( rule__Define__Group__0 ) ) )
            // InternalScheme.g:167:2: ( ( rule__Define__Group__0 ) )
            {
            // InternalScheme.g:167:2: ( ( rule__Define__Group__0 ) )
            // InternalScheme.g:168:3: ( rule__Define__Group__0 )
            {
             before(grammarAccess.getDefineAccess().getGroup()); 
            // InternalScheme.g:169:3: ( rule__Define__Group__0 )
            // InternalScheme.g:169:4: rule__Define__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Define__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDefineAccess().getGroup()); 

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
    // $ANTLR end "ruleDefine"


    // $ANTLR start "entryRuleConditional"
    // InternalScheme.g:178:1: entryRuleConditional : ruleConditional EOF ;
    public final void entryRuleConditional() throws RecognitionException {
        try {
            // InternalScheme.g:179:1: ( ruleConditional EOF )
            // InternalScheme.g:180:1: ruleConditional EOF
            {
             before(grammarAccess.getConditionalRule()); 
            pushFollow(FOLLOW_1);
            ruleConditional();

            state._fsp--;

             after(grammarAccess.getConditionalRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleConditional"


    // $ANTLR start "ruleConditional"
    // InternalScheme.g:187:1: ruleConditional : ( ( rule__Conditional__Group__0 ) ) ;
    public final void ruleConditional() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScheme.g:191:2: ( ( ( rule__Conditional__Group__0 ) ) )
            // InternalScheme.g:192:2: ( ( rule__Conditional__Group__0 ) )
            {
            // InternalScheme.g:192:2: ( ( rule__Conditional__Group__0 ) )
            // InternalScheme.g:193:3: ( rule__Conditional__Group__0 )
            {
             before(grammarAccess.getConditionalAccess().getGroup()); 
            // InternalScheme.g:194:3: ( rule__Conditional__Group__0 )
            // InternalScheme.g:194:4: rule__Conditional__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Conditional__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConditionalAccess().getGroup()); 

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
    // $ANTLR end "ruleConditional"


    // $ANTLR start "entryRuleParameter"
    // InternalScheme.g:203:1: entryRuleParameter : ruleParameter EOF ;
    public final void entryRuleParameter() throws RecognitionException {
        try {
            // InternalScheme.g:204:1: ( ruleParameter EOF )
            // InternalScheme.g:205:1: ruleParameter EOF
            {
             before(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_1);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getParameterRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // InternalScheme.g:212:1: ruleParameter : ( ( rule__Parameter__Group__0 ) ) ;
    public final void ruleParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScheme.g:216:2: ( ( ( rule__Parameter__Group__0 ) ) )
            // InternalScheme.g:217:2: ( ( rule__Parameter__Group__0 ) )
            {
            // InternalScheme.g:217:2: ( ( rule__Parameter__Group__0 ) )
            // InternalScheme.g:218:3: ( rule__Parameter__Group__0 )
            {
             before(grammarAccess.getParameterAccess().getGroup()); 
            // InternalScheme.g:219:3: ( rule__Parameter__Group__0 )
            // InternalScheme.g:219:4: rule__Parameter__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getGroup()); 

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
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleAtom"
    // InternalScheme.g:228:1: entryRuleAtom : ruleAtom EOF ;
    public final void entryRuleAtom() throws RecognitionException {
        try {
            // InternalScheme.g:229:1: ( ruleAtom EOF )
            // InternalScheme.g:230:1: ruleAtom EOF
            {
             before(grammarAccess.getAtomRule()); 
            pushFollow(FOLLOW_1);
            ruleAtom();

            state._fsp--;

             after(grammarAccess.getAtomRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAtom"


    // $ANTLR start "ruleAtom"
    // InternalScheme.g:237:1: ruleAtom : ( ( rule__Atom__Alternatives ) ) ;
    public final void ruleAtom() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScheme.g:241:2: ( ( ( rule__Atom__Alternatives ) ) )
            // InternalScheme.g:242:2: ( ( rule__Atom__Alternatives ) )
            {
            // InternalScheme.g:242:2: ( ( rule__Atom__Alternatives ) )
            // InternalScheme.g:243:3: ( rule__Atom__Alternatives )
            {
             before(grammarAccess.getAtomAccess().getAlternatives()); 
            // InternalScheme.g:244:3: ( rule__Atom__Alternatives )
            // InternalScheme.g:244:4: rule__Atom__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Atom__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAtomAccess().getAlternatives()); 

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
    // $ANTLR end "ruleAtom"


    // $ANTLR start "rule__Command__Alternatives"
    // InternalScheme.g:252:1: rule__Command__Alternatives : ( ( ruleOperation ) | ( ruleDefine ) | ( ruleParameter ) | ( ruleConditional ) | ( ( rule__Command__ValueAssignment_4 ) ) );
    public final void rule__Command__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScheme.g:256:1: ( ( ruleOperation ) | ( ruleDefine ) | ( ruleParameter ) | ( ruleConditional ) | ( ( rule__Command__ValueAssignment_4 ) ) )
            int alt2=5;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==12) ) {
                switch ( input.LA(2) ) {
                case RULE_OPERATOR:
                    {
                    alt2=1;
                    }
                    break;
                case 14:
                    {
                    alt2=2;
                    }
                    break;
                case RULE_ID:
                    {
                    alt2=3;
                    }
                    break;
                case 15:
                    {
                    alt2=4;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }

            }
            else if ( (LA2_0==RULE_INT) ) {
                alt2=5;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalScheme.g:257:2: ( ruleOperation )
                    {
                    // InternalScheme.g:257:2: ( ruleOperation )
                    // InternalScheme.g:258:3: ruleOperation
                    {
                     before(grammarAccess.getCommandAccess().getOperationParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleOperation();

                    state._fsp--;

                     after(grammarAccess.getCommandAccess().getOperationParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalScheme.g:263:2: ( ruleDefine )
                    {
                    // InternalScheme.g:263:2: ( ruleDefine )
                    // InternalScheme.g:264:3: ruleDefine
                    {
                     before(grammarAccess.getCommandAccess().getDefineParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleDefine();

                    state._fsp--;

                     after(grammarAccess.getCommandAccess().getDefineParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalScheme.g:269:2: ( ruleParameter )
                    {
                    // InternalScheme.g:269:2: ( ruleParameter )
                    // InternalScheme.g:270:3: ruleParameter
                    {
                     before(grammarAccess.getCommandAccess().getParameterParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleParameter();

                    state._fsp--;

                     after(grammarAccess.getCommandAccess().getParameterParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalScheme.g:275:2: ( ruleConditional )
                    {
                    // InternalScheme.g:275:2: ( ruleConditional )
                    // InternalScheme.g:276:3: ruleConditional
                    {
                     before(grammarAccess.getCommandAccess().getConditionalParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleConditional();

                    state._fsp--;

                     after(grammarAccess.getCommandAccess().getConditionalParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalScheme.g:281:2: ( ( rule__Command__ValueAssignment_4 ) )
                    {
                    // InternalScheme.g:281:2: ( ( rule__Command__ValueAssignment_4 ) )
                    // InternalScheme.g:282:3: ( rule__Command__ValueAssignment_4 )
                    {
                     before(grammarAccess.getCommandAccess().getValueAssignment_4()); 
                    // InternalScheme.g:283:3: ( rule__Command__ValueAssignment_4 )
                    // InternalScheme.g:283:4: rule__Command__ValueAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Command__ValueAssignment_4();

                    state._fsp--;


                    }

                     after(grammarAccess.getCommandAccess().getValueAssignment_4()); 

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
    // $ANTLR end "rule__Command__Alternatives"


    // $ANTLR start "rule__Operation__Alternatives_2"
    // InternalScheme.g:291:1: rule__Operation__Alternatives_2 : ( ( ( rule__Operation__SimpleOperationAssignment_2_0 ) ) | ( ( rule__Operation__AtomAssignment_2_1 ) ) );
    public final void rule__Operation__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScheme.g:295:1: ( ( ( rule__Operation__SimpleOperationAssignment_2_0 ) ) | ( ( rule__Operation__AtomAssignment_2_1 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==12) ) {
                alt3=1;
            }
            else if ( ((LA3_0>=RULE_ID && LA3_0<=RULE_INT)) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalScheme.g:296:2: ( ( rule__Operation__SimpleOperationAssignment_2_0 ) )
                    {
                    // InternalScheme.g:296:2: ( ( rule__Operation__SimpleOperationAssignment_2_0 ) )
                    // InternalScheme.g:297:3: ( rule__Operation__SimpleOperationAssignment_2_0 )
                    {
                     before(grammarAccess.getOperationAccess().getSimpleOperationAssignment_2_0()); 
                    // InternalScheme.g:298:3: ( rule__Operation__SimpleOperationAssignment_2_0 )
                    // InternalScheme.g:298:4: rule__Operation__SimpleOperationAssignment_2_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Operation__SimpleOperationAssignment_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getOperationAccess().getSimpleOperationAssignment_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalScheme.g:302:2: ( ( rule__Operation__AtomAssignment_2_1 ) )
                    {
                    // InternalScheme.g:302:2: ( ( rule__Operation__AtomAssignment_2_1 ) )
                    // InternalScheme.g:303:3: ( rule__Operation__AtomAssignment_2_1 )
                    {
                     before(grammarAccess.getOperationAccess().getAtomAssignment_2_1()); 
                    // InternalScheme.g:304:3: ( rule__Operation__AtomAssignment_2_1 )
                    // InternalScheme.g:304:4: rule__Operation__AtomAssignment_2_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Operation__AtomAssignment_2_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getOperationAccess().getAtomAssignment_2_1()); 

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
    // $ANTLR end "rule__Operation__Alternatives_2"


    // $ANTLR start "rule__Define__Alternatives_2"
    // InternalScheme.g:312:1: rule__Define__Alternatives_2 : ( ( ( rule__Define__Name1Assignment_2_0 ) ) | ( ( rule__Define__ParametersAssignment_2_1 ) ) );
    public final void rule__Define__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScheme.g:316:1: ( ( ( rule__Define__Name1Assignment_2_0 ) ) | ( ( rule__Define__ParametersAssignment_2_1 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                alt4=1;
            }
            else if ( (LA4_0==12) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalScheme.g:317:2: ( ( rule__Define__Name1Assignment_2_0 ) )
                    {
                    // InternalScheme.g:317:2: ( ( rule__Define__Name1Assignment_2_0 ) )
                    // InternalScheme.g:318:3: ( rule__Define__Name1Assignment_2_0 )
                    {
                     before(grammarAccess.getDefineAccess().getName1Assignment_2_0()); 
                    // InternalScheme.g:319:3: ( rule__Define__Name1Assignment_2_0 )
                    // InternalScheme.g:319:4: rule__Define__Name1Assignment_2_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Define__Name1Assignment_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDefineAccess().getName1Assignment_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalScheme.g:323:2: ( ( rule__Define__ParametersAssignment_2_1 ) )
                    {
                    // InternalScheme.g:323:2: ( ( rule__Define__ParametersAssignment_2_1 ) )
                    // InternalScheme.g:324:3: ( rule__Define__ParametersAssignment_2_1 )
                    {
                     before(grammarAccess.getDefineAccess().getParametersAssignment_2_1()); 
                    // InternalScheme.g:325:3: ( rule__Define__ParametersAssignment_2_1 )
                    // InternalScheme.g:325:4: rule__Define__ParametersAssignment_2_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Define__ParametersAssignment_2_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getDefineAccess().getParametersAssignment_2_1()); 

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
    // $ANTLR end "rule__Define__Alternatives_2"


    // $ANTLR start "rule__Define__Alternatives_3"
    // InternalScheme.g:333:1: rule__Define__Alternatives_3 : ( ( ( rule__Define__Atons2Assignment_3_0 ) ) | ( ( rule__Define__ParametersAssignment_3_1 ) ) | ( ( rule__Define__OperationAssignment_3_2 ) ) );
    public final void rule__Define__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScheme.g:337:1: ( ( ( rule__Define__Atons2Assignment_3_0 ) ) | ( ( rule__Define__ParametersAssignment_3_1 ) ) | ( ( rule__Define__OperationAssignment_3_2 ) ) )
            int alt5=3;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=RULE_ID && LA5_0<=RULE_INT)) ) {
                alt5=1;
            }
            else if ( (LA5_0==12) ) {
                int LA5_2 = input.LA(2);

                if ( (LA5_2==RULE_ID) ) {
                    alt5=2;
                }
                else if ( (LA5_2==RULE_OPERATOR) ) {
                    alt5=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalScheme.g:338:2: ( ( rule__Define__Atons2Assignment_3_0 ) )
                    {
                    // InternalScheme.g:338:2: ( ( rule__Define__Atons2Assignment_3_0 ) )
                    // InternalScheme.g:339:3: ( rule__Define__Atons2Assignment_3_0 )
                    {
                     before(grammarAccess.getDefineAccess().getAtons2Assignment_3_0()); 
                    // InternalScheme.g:340:3: ( rule__Define__Atons2Assignment_3_0 )
                    // InternalScheme.g:340:4: rule__Define__Atons2Assignment_3_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Define__Atons2Assignment_3_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDefineAccess().getAtons2Assignment_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalScheme.g:344:2: ( ( rule__Define__ParametersAssignment_3_1 ) )
                    {
                    // InternalScheme.g:344:2: ( ( rule__Define__ParametersAssignment_3_1 ) )
                    // InternalScheme.g:345:3: ( rule__Define__ParametersAssignment_3_1 )
                    {
                     before(grammarAccess.getDefineAccess().getParametersAssignment_3_1()); 
                    // InternalScheme.g:346:3: ( rule__Define__ParametersAssignment_3_1 )
                    // InternalScheme.g:346:4: rule__Define__ParametersAssignment_3_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Define__ParametersAssignment_3_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getDefineAccess().getParametersAssignment_3_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalScheme.g:350:2: ( ( rule__Define__OperationAssignment_3_2 ) )
                    {
                    // InternalScheme.g:350:2: ( ( rule__Define__OperationAssignment_3_2 ) )
                    // InternalScheme.g:351:3: ( rule__Define__OperationAssignment_3_2 )
                    {
                     before(grammarAccess.getDefineAccess().getOperationAssignment_3_2()); 
                    // InternalScheme.g:352:3: ( rule__Define__OperationAssignment_3_2 )
                    // InternalScheme.g:352:4: rule__Define__OperationAssignment_3_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Define__OperationAssignment_3_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getDefineAccess().getOperationAssignment_3_2()); 

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
    // $ANTLR end "rule__Define__Alternatives_3"


    // $ANTLR start "rule__Atom__Alternatives"
    // InternalScheme.g:360:1: rule__Atom__Alternatives : ( ( RULE_ID ) | ( RULE_INT ) );
    public final void rule__Atom__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScheme.g:364:1: ( ( RULE_ID ) | ( RULE_INT ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_INT) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalScheme.g:365:2: ( RULE_ID )
                    {
                    // InternalScheme.g:365:2: ( RULE_ID )
                    // InternalScheme.g:366:3: RULE_ID
                    {
                     before(grammarAccess.getAtomAccess().getIDTerminalRuleCall_0()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getAtomAccess().getIDTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalScheme.g:371:2: ( RULE_INT )
                    {
                    // InternalScheme.g:371:2: ( RULE_INT )
                    // InternalScheme.g:372:3: RULE_INT
                    {
                     before(grammarAccess.getAtomAccess().getINTTerminalRuleCall_1()); 
                    match(input,RULE_INT,FOLLOW_2); 
                     after(grammarAccess.getAtomAccess().getINTTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__Atom__Alternatives"


    // $ANTLR start "rule__Operation__Group__0"
    // InternalScheme.g:381:1: rule__Operation__Group__0 : rule__Operation__Group__0__Impl rule__Operation__Group__1 ;
    public final void rule__Operation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScheme.g:385:1: ( rule__Operation__Group__0__Impl rule__Operation__Group__1 )
            // InternalScheme.g:386:2: rule__Operation__Group__0__Impl rule__Operation__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Operation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operation__Group__1();

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
    // $ANTLR end "rule__Operation__Group__0"


    // $ANTLR start "rule__Operation__Group__0__Impl"
    // InternalScheme.g:393:1: rule__Operation__Group__0__Impl : ( '(' ) ;
    public final void rule__Operation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScheme.g:397:1: ( ( '(' ) )
            // InternalScheme.g:398:1: ( '(' )
            {
            // InternalScheme.g:398:1: ( '(' )
            // InternalScheme.g:399:2: '('
            {
             before(grammarAccess.getOperationAccess().getLeftParenthesisKeyword_0()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getOperationAccess().getLeftParenthesisKeyword_0()); 

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
    // $ANTLR end "rule__Operation__Group__0__Impl"


    // $ANTLR start "rule__Operation__Group__1"
    // InternalScheme.g:408:1: rule__Operation__Group__1 : rule__Operation__Group__1__Impl rule__Operation__Group__2 ;
    public final void rule__Operation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScheme.g:412:1: ( rule__Operation__Group__1__Impl rule__Operation__Group__2 )
            // InternalScheme.g:413:2: rule__Operation__Group__1__Impl rule__Operation__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Operation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operation__Group__2();

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
    // $ANTLR end "rule__Operation__Group__1"


    // $ANTLR start "rule__Operation__Group__1__Impl"
    // InternalScheme.g:420:1: rule__Operation__Group__1__Impl : ( ( rule__Operation__OperatorAssignment_1 ) ) ;
    public final void rule__Operation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScheme.g:424:1: ( ( ( rule__Operation__OperatorAssignment_1 ) ) )
            // InternalScheme.g:425:1: ( ( rule__Operation__OperatorAssignment_1 ) )
            {
            // InternalScheme.g:425:1: ( ( rule__Operation__OperatorAssignment_1 ) )
            // InternalScheme.g:426:2: ( rule__Operation__OperatorAssignment_1 )
            {
             before(grammarAccess.getOperationAccess().getOperatorAssignment_1()); 
            // InternalScheme.g:427:2: ( rule__Operation__OperatorAssignment_1 )
            // InternalScheme.g:427:3: rule__Operation__OperatorAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Operation__OperatorAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getOperationAccess().getOperatorAssignment_1()); 

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
    // $ANTLR end "rule__Operation__Group__1__Impl"


    // $ANTLR start "rule__Operation__Group__2"
    // InternalScheme.g:435:1: rule__Operation__Group__2 : rule__Operation__Group__2__Impl rule__Operation__Group__3 ;
    public final void rule__Operation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScheme.g:439:1: ( rule__Operation__Group__2__Impl rule__Operation__Group__3 )
            // InternalScheme.g:440:2: rule__Operation__Group__2__Impl rule__Operation__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Operation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operation__Group__3();

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
    // $ANTLR end "rule__Operation__Group__2"


    // $ANTLR start "rule__Operation__Group__2__Impl"
    // InternalScheme.g:447:1: rule__Operation__Group__2__Impl : ( ( ( rule__Operation__Alternatives_2 ) ) ( ( rule__Operation__Alternatives_2 )* ) ) ;
    public final void rule__Operation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScheme.g:451:1: ( ( ( ( rule__Operation__Alternatives_2 ) ) ( ( rule__Operation__Alternatives_2 )* ) ) )
            // InternalScheme.g:452:1: ( ( ( rule__Operation__Alternatives_2 ) ) ( ( rule__Operation__Alternatives_2 )* ) )
            {
            // InternalScheme.g:452:1: ( ( ( rule__Operation__Alternatives_2 ) ) ( ( rule__Operation__Alternatives_2 )* ) )
            // InternalScheme.g:453:2: ( ( rule__Operation__Alternatives_2 ) ) ( ( rule__Operation__Alternatives_2 )* )
            {
            // InternalScheme.g:453:2: ( ( rule__Operation__Alternatives_2 ) )
            // InternalScheme.g:454:3: ( rule__Operation__Alternatives_2 )
            {
             before(grammarAccess.getOperationAccess().getAlternatives_2()); 
            // InternalScheme.g:455:3: ( rule__Operation__Alternatives_2 )
            // InternalScheme.g:455:4: rule__Operation__Alternatives_2
            {
            pushFollow(FOLLOW_7);
            rule__Operation__Alternatives_2();

            state._fsp--;


            }

             after(grammarAccess.getOperationAccess().getAlternatives_2()); 

            }

            // InternalScheme.g:458:2: ( ( rule__Operation__Alternatives_2 )* )
            // InternalScheme.g:459:3: ( rule__Operation__Alternatives_2 )*
            {
             before(grammarAccess.getOperationAccess().getAlternatives_2()); 
            // InternalScheme.g:460:3: ( rule__Operation__Alternatives_2 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=RULE_ID && LA7_0<=RULE_INT)||LA7_0==12) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalScheme.g:460:4: rule__Operation__Alternatives_2
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Operation__Alternatives_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getOperationAccess().getAlternatives_2()); 

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
    // $ANTLR end "rule__Operation__Group__2__Impl"


    // $ANTLR start "rule__Operation__Group__3"
    // InternalScheme.g:469:1: rule__Operation__Group__3 : rule__Operation__Group__3__Impl ;
    public final void rule__Operation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScheme.g:473:1: ( rule__Operation__Group__3__Impl )
            // InternalScheme.g:474:2: rule__Operation__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Operation__Group__3__Impl();

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
    // $ANTLR end "rule__Operation__Group__3"


    // $ANTLR start "rule__Operation__Group__3__Impl"
    // InternalScheme.g:480:1: rule__Operation__Group__3__Impl : ( ')' ) ;
    public final void rule__Operation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScheme.g:484:1: ( ( ')' ) )
            // InternalScheme.g:485:1: ( ')' )
            {
            // InternalScheme.g:485:1: ( ')' )
            // InternalScheme.g:486:2: ')'
            {
             before(grammarAccess.getOperationAccess().getRightParenthesisKeyword_3()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getOperationAccess().getRightParenthesisKeyword_3()); 

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
    // $ANTLR end "rule__Operation__Group__3__Impl"


    // $ANTLR start "rule__SimpleOperation__Group__0"
    // InternalScheme.g:496:1: rule__SimpleOperation__Group__0 : rule__SimpleOperation__Group__0__Impl rule__SimpleOperation__Group__1 ;
    public final void rule__SimpleOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScheme.g:500:1: ( rule__SimpleOperation__Group__0__Impl rule__SimpleOperation__Group__1 )
            // InternalScheme.g:501:2: rule__SimpleOperation__Group__0__Impl rule__SimpleOperation__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__SimpleOperation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SimpleOperation__Group__1();

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
    // $ANTLR end "rule__SimpleOperation__Group__0"


    // $ANTLR start "rule__SimpleOperation__Group__0__Impl"
    // InternalScheme.g:508:1: rule__SimpleOperation__Group__0__Impl : ( '(' ) ;
    public final void rule__SimpleOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScheme.g:512:1: ( ( '(' ) )
            // InternalScheme.g:513:1: ( '(' )
            {
            // InternalScheme.g:513:1: ( '(' )
            // InternalScheme.g:514:2: '('
            {
             before(grammarAccess.getSimpleOperationAccess().getLeftParenthesisKeyword_0()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getSimpleOperationAccess().getLeftParenthesisKeyword_0()); 

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
    // $ANTLR end "rule__SimpleOperation__Group__0__Impl"


    // $ANTLR start "rule__SimpleOperation__Group__1"
    // InternalScheme.g:523:1: rule__SimpleOperation__Group__1 : rule__SimpleOperation__Group__1__Impl rule__SimpleOperation__Group__2 ;
    public final void rule__SimpleOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScheme.g:527:1: ( rule__SimpleOperation__Group__1__Impl rule__SimpleOperation__Group__2 )
            // InternalScheme.g:528:2: rule__SimpleOperation__Group__1__Impl rule__SimpleOperation__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__SimpleOperation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SimpleOperation__Group__2();

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
    // $ANTLR end "rule__SimpleOperation__Group__1"


    // $ANTLR start "rule__SimpleOperation__Group__1__Impl"
    // InternalScheme.g:535:1: rule__SimpleOperation__Group__1__Impl : ( ( rule__SimpleOperation__OperatorAssignment_1 ) ) ;
    public final void rule__SimpleOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScheme.g:539:1: ( ( ( rule__SimpleOperation__OperatorAssignment_1 ) ) )
            // InternalScheme.g:540:1: ( ( rule__SimpleOperation__OperatorAssignment_1 ) )
            {
            // InternalScheme.g:540:1: ( ( rule__SimpleOperation__OperatorAssignment_1 ) )
            // InternalScheme.g:541:2: ( rule__SimpleOperation__OperatorAssignment_1 )
            {
             before(grammarAccess.getSimpleOperationAccess().getOperatorAssignment_1()); 
            // InternalScheme.g:542:2: ( rule__SimpleOperation__OperatorAssignment_1 )
            // InternalScheme.g:542:3: rule__SimpleOperation__OperatorAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SimpleOperation__OperatorAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSimpleOperationAccess().getOperatorAssignment_1()); 

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
    // $ANTLR end "rule__SimpleOperation__Group__1__Impl"


    // $ANTLR start "rule__SimpleOperation__Group__2"
    // InternalScheme.g:550:1: rule__SimpleOperation__Group__2 : rule__SimpleOperation__Group__2__Impl rule__SimpleOperation__Group__3 ;
    public final void rule__SimpleOperation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScheme.g:554:1: ( rule__SimpleOperation__Group__2__Impl rule__SimpleOperation__Group__3 )
            // InternalScheme.g:555:2: rule__SimpleOperation__Group__2__Impl rule__SimpleOperation__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__SimpleOperation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SimpleOperation__Group__3();

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
    // $ANTLR end "rule__SimpleOperation__Group__2"


    // $ANTLR start "rule__SimpleOperation__Group__2__Impl"
    // InternalScheme.g:562:1: rule__SimpleOperation__Group__2__Impl : ( ( ( rule__SimpleOperation__ValueAssignment_2 ) ) ( ( rule__SimpleOperation__ValueAssignment_2 )* ) ) ;
    public final void rule__SimpleOperation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScheme.g:566:1: ( ( ( ( rule__SimpleOperation__ValueAssignment_2 ) ) ( ( rule__SimpleOperation__ValueAssignment_2 )* ) ) )
            // InternalScheme.g:567:1: ( ( ( rule__SimpleOperation__ValueAssignment_2 ) ) ( ( rule__SimpleOperation__ValueAssignment_2 )* ) )
            {
            // InternalScheme.g:567:1: ( ( ( rule__SimpleOperation__ValueAssignment_2 ) ) ( ( rule__SimpleOperation__ValueAssignment_2 )* ) )
            // InternalScheme.g:568:2: ( ( rule__SimpleOperation__ValueAssignment_2 ) ) ( ( rule__SimpleOperation__ValueAssignment_2 )* )
            {
            // InternalScheme.g:568:2: ( ( rule__SimpleOperation__ValueAssignment_2 ) )
            // InternalScheme.g:569:3: ( rule__SimpleOperation__ValueAssignment_2 )
            {
             before(grammarAccess.getSimpleOperationAccess().getValueAssignment_2()); 
            // InternalScheme.g:570:3: ( rule__SimpleOperation__ValueAssignment_2 )
            // InternalScheme.g:570:4: rule__SimpleOperation__ValueAssignment_2
            {
            pushFollow(FOLLOW_7);
            rule__SimpleOperation__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSimpleOperationAccess().getValueAssignment_2()); 

            }

            // InternalScheme.g:573:2: ( ( rule__SimpleOperation__ValueAssignment_2 )* )
            // InternalScheme.g:574:3: ( rule__SimpleOperation__ValueAssignment_2 )*
            {
             before(grammarAccess.getSimpleOperationAccess().getValueAssignment_2()); 
            // InternalScheme.g:575:3: ( rule__SimpleOperation__ValueAssignment_2 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=RULE_ID && LA8_0<=RULE_INT)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalScheme.g:575:4: rule__SimpleOperation__ValueAssignment_2
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__SimpleOperation__ValueAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getSimpleOperationAccess().getValueAssignment_2()); 

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
    // $ANTLR end "rule__SimpleOperation__Group__2__Impl"


    // $ANTLR start "rule__SimpleOperation__Group__3"
    // InternalScheme.g:584:1: rule__SimpleOperation__Group__3 : rule__SimpleOperation__Group__3__Impl ;
    public final void rule__SimpleOperation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScheme.g:588:1: ( rule__SimpleOperation__Group__3__Impl )
            // InternalScheme.g:589:2: rule__SimpleOperation__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SimpleOperation__Group__3__Impl();

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
    // $ANTLR end "rule__SimpleOperation__Group__3"


    // $ANTLR start "rule__SimpleOperation__Group__3__Impl"
    // InternalScheme.g:595:1: rule__SimpleOperation__Group__3__Impl : ( ')' ) ;
    public final void rule__SimpleOperation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScheme.g:599:1: ( ( ')' ) )
            // InternalScheme.g:600:1: ( ')' )
            {
            // InternalScheme.g:600:1: ( ')' )
            // InternalScheme.g:601:2: ')'
            {
             before(grammarAccess.getSimpleOperationAccess().getRightParenthesisKeyword_3()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getSimpleOperationAccess().getRightParenthesisKeyword_3()); 

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
    // $ANTLR end "rule__SimpleOperation__Group__3__Impl"


    // $ANTLR start "rule__Define__Group__0"
    // InternalScheme.g:611:1: rule__Define__Group__0 : rule__Define__Group__0__Impl rule__Define__Group__1 ;
    public final void rule__Define__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScheme.g:615:1: ( rule__Define__Group__0__Impl rule__Define__Group__1 )
            // InternalScheme.g:616:2: rule__Define__Group__0__Impl rule__Define__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Define__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Define__Group__1();

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
    // $ANTLR end "rule__Define__Group__0"


    // $ANTLR start "rule__Define__Group__0__Impl"
    // InternalScheme.g:623:1: rule__Define__Group__0__Impl : ( '(' ) ;
    public final void rule__Define__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScheme.g:627:1: ( ( '(' ) )
            // InternalScheme.g:628:1: ( '(' )
            {
            // InternalScheme.g:628:1: ( '(' )
            // InternalScheme.g:629:2: '('
            {
             before(grammarAccess.getDefineAccess().getLeftParenthesisKeyword_0()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getDefineAccess().getLeftParenthesisKeyword_0()); 

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
    // $ANTLR end "rule__Define__Group__0__Impl"


    // $ANTLR start "rule__Define__Group__1"
    // InternalScheme.g:638:1: rule__Define__Group__1 : rule__Define__Group__1__Impl rule__Define__Group__2 ;
    public final void rule__Define__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScheme.g:642:1: ( rule__Define__Group__1__Impl rule__Define__Group__2 )
            // InternalScheme.g:643:2: rule__Define__Group__1__Impl rule__Define__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__Define__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Define__Group__2();

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
    // $ANTLR end "rule__Define__Group__1"


    // $ANTLR start "rule__Define__Group__1__Impl"
    // InternalScheme.g:650:1: rule__Define__Group__1__Impl : ( 'define' ) ;
    public final void rule__Define__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScheme.g:654:1: ( ( 'define' ) )
            // InternalScheme.g:655:1: ( 'define' )
            {
            // InternalScheme.g:655:1: ( 'define' )
            // InternalScheme.g:656:2: 'define'
            {
             before(grammarAccess.getDefineAccess().getDefineKeyword_1()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getDefineAccess().getDefineKeyword_1()); 

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
    // $ANTLR end "rule__Define__Group__1__Impl"


    // $ANTLR start "rule__Define__Group__2"
    // InternalScheme.g:665:1: rule__Define__Group__2 : rule__Define__Group__2__Impl rule__Define__Group__3 ;
    public final void rule__Define__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScheme.g:669:1: ( rule__Define__Group__2__Impl rule__Define__Group__3 )
            // InternalScheme.g:670:2: rule__Define__Group__2__Impl rule__Define__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Define__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Define__Group__3();

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
    // $ANTLR end "rule__Define__Group__2"


    // $ANTLR start "rule__Define__Group__2__Impl"
    // InternalScheme.g:677:1: rule__Define__Group__2__Impl : ( ( rule__Define__Alternatives_2 ) ) ;
    public final void rule__Define__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScheme.g:681:1: ( ( ( rule__Define__Alternatives_2 ) ) )
            // InternalScheme.g:682:1: ( ( rule__Define__Alternatives_2 ) )
            {
            // InternalScheme.g:682:1: ( ( rule__Define__Alternatives_2 ) )
            // InternalScheme.g:683:2: ( rule__Define__Alternatives_2 )
            {
             before(grammarAccess.getDefineAccess().getAlternatives_2()); 
            // InternalScheme.g:684:2: ( rule__Define__Alternatives_2 )
            // InternalScheme.g:684:3: rule__Define__Alternatives_2
            {
            pushFollow(FOLLOW_2);
            rule__Define__Alternatives_2();

            state._fsp--;


            }

             after(grammarAccess.getDefineAccess().getAlternatives_2()); 

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
    // $ANTLR end "rule__Define__Group__2__Impl"


    // $ANTLR start "rule__Define__Group__3"
    // InternalScheme.g:692:1: rule__Define__Group__3 : rule__Define__Group__3__Impl rule__Define__Group__4 ;
    public final void rule__Define__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScheme.g:696:1: ( rule__Define__Group__3__Impl rule__Define__Group__4 )
            // InternalScheme.g:697:2: rule__Define__Group__3__Impl rule__Define__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Define__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Define__Group__4();

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
    // $ANTLR end "rule__Define__Group__3"


    // $ANTLR start "rule__Define__Group__3__Impl"
    // InternalScheme.g:704:1: rule__Define__Group__3__Impl : ( ( rule__Define__Alternatives_3 ) ) ;
    public final void rule__Define__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScheme.g:708:1: ( ( ( rule__Define__Alternatives_3 ) ) )
            // InternalScheme.g:709:1: ( ( rule__Define__Alternatives_3 ) )
            {
            // InternalScheme.g:709:1: ( ( rule__Define__Alternatives_3 ) )
            // InternalScheme.g:710:2: ( rule__Define__Alternatives_3 )
            {
             before(grammarAccess.getDefineAccess().getAlternatives_3()); 
            // InternalScheme.g:711:2: ( rule__Define__Alternatives_3 )
            // InternalScheme.g:711:3: rule__Define__Alternatives_3
            {
            pushFollow(FOLLOW_2);
            rule__Define__Alternatives_3();

            state._fsp--;


            }

             after(grammarAccess.getDefineAccess().getAlternatives_3()); 

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
    // $ANTLR end "rule__Define__Group__3__Impl"


    // $ANTLR start "rule__Define__Group__4"
    // InternalScheme.g:719:1: rule__Define__Group__4 : rule__Define__Group__4__Impl ;
    public final void rule__Define__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScheme.g:723:1: ( rule__Define__Group__4__Impl )
            // InternalScheme.g:724:2: rule__Define__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Define__Group__4__Impl();

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
    // $ANTLR end "rule__Define__Group__4"


    // $ANTLR start "rule__Define__Group__4__Impl"
    // InternalScheme.g:730:1: rule__Define__Group__4__Impl : ( ')' ) ;
    public final void rule__Define__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScheme.g:734:1: ( ( ')' ) )
            // InternalScheme.g:735:1: ( ')' )
            {
            // InternalScheme.g:735:1: ( ')' )
            // InternalScheme.g:736:2: ')'
            {
             before(grammarAccess.getDefineAccess().getRightParenthesisKeyword_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getDefineAccess().getRightParenthesisKeyword_4()); 

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
    // $ANTLR end "rule__Define__Group__4__Impl"


    // $ANTLR start "rule__Conditional__Group__0"
    // InternalScheme.g:746:1: rule__Conditional__Group__0 : rule__Conditional__Group__0__Impl rule__Conditional__Group__1 ;
    public final void rule__Conditional__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScheme.g:750:1: ( rule__Conditional__Group__0__Impl rule__Conditional__Group__1 )
            // InternalScheme.g:751:2: rule__Conditional__Group__0__Impl rule__Conditional__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__Conditional__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Conditional__Group__1();

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
    // $ANTLR end "rule__Conditional__Group__0"


    // $ANTLR start "rule__Conditional__Group__0__Impl"
    // InternalScheme.g:758:1: rule__Conditional__Group__0__Impl : ( '(' ) ;
    public final void rule__Conditional__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScheme.g:762:1: ( ( '(' ) )
            // InternalScheme.g:763:1: ( '(' )
            {
            // InternalScheme.g:763:1: ( '(' )
            // InternalScheme.g:764:2: '('
            {
             before(grammarAccess.getConditionalAccess().getLeftParenthesisKeyword_0()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getConditionalAccess().getLeftParenthesisKeyword_0()); 

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
    // $ANTLR end "rule__Conditional__Group__0__Impl"


    // $ANTLR start "rule__Conditional__Group__1"
    // InternalScheme.g:773:1: rule__Conditional__Group__1 : rule__Conditional__Group__1__Impl rule__Conditional__Group__2 ;
    public final void rule__Conditional__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScheme.g:777:1: ( rule__Conditional__Group__1__Impl rule__Conditional__Group__2 )
            // InternalScheme.g:778:2: rule__Conditional__Group__1__Impl rule__Conditional__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__Conditional__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Conditional__Group__2();

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
    // $ANTLR end "rule__Conditional__Group__1"


    // $ANTLR start "rule__Conditional__Group__1__Impl"
    // InternalScheme.g:785:1: rule__Conditional__Group__1__Impl : ( 'if' ) ;
    public final void rule__Conditional__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScheme.g:789:1: ( ( 'if' ) )
            // InternalScheme.g:790:1: ( 'if' )
            {
            // InternalScheme.g:790:1: ( 'if' )
            // InternalScheme.g:791:2: 'if'
            {
             before(grammarAccess.getConditionalAccess().getIfKeyword_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getConditionalAccess().getIfKeyword_1()); 

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
    // $ANTLR end "rule__Conditional__Group__1__Impl"


    // $ANTLR start "rule__Conditional__Group__2"
    // InternalScheme.g:800:1: rule__Conditional__Group__2 : rule__Conditional__Group__2__Impl rule__Conditional__Group__3 ;
    public final void rule__Conditional__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScheme.g:804:1: ( rule__Conditional__Group__2__Impl rule__Conditional__Group__3 )
            // InternalScheme.g:805:2: rule__Conditional__Group__2__Impl rule__Conditional__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__Conditional__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Conditional__Group__3();

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
    // $ANTLR end "rule__Conditional__Group__2"


    // $ANTLR start "rule__Conditional__Group__2__Impl"
    // InternalScheme.g:812:1: rule__Conditional__Group__2__Impl : ( '(' ) ;
    public final void rule__Conditional__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScheme.g:816:1: ( ( '(' ) )
            // InternalScheme.g:817:1: ( '(' )
            {
            // InternalScheme.g:817:1: ( '(' )
            // InternalScheme.g:818:2: '('
            {
             before(grammarAccess.getConditionalAccess().getLeftParenthesisKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getConditionalAccess().getLeftParenthesisKeyword_2()); 

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
    // $ANTLR end "rule__Conditional__Group__2__Impl"


    // $ANTLR start "rule__Conditional__Group__3"
    // InternalScheme.g:827:1: rule__Conditional__Group__3 : rule__Conditional__Group__3__Impl rule__Conditional__Group__4 ;
    public final void rule__Conditional__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScheme.g:831:1: ( rule__Conditional__Group__3__Impl rule__Conditional__Group__4 )
            // InternalScheme.g:832:2: rule__Conditional__Group__3__Impl rule__Conditional__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__Conditional__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Conditional__Group__4();

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
    // $ANTLR end "rule__Conditional__Group__3"


    // $ANTLR start "rule__Conditional__Group__3__Impl"
    // InternalScheme.g:839:1: rule__Conditional__Group__3__Impl : ( '=' ) ;
    public final void rule__Conditional__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScheme.g:843:1: ( ( '=' ) )
            // InternalScheme.g:844:1: ( '=' )
            {
            // InternalScheme.g:844:1: ( '=' )
            // InternalScheme.g:845:2: '='
            {
             before(grammarAccess.getConditionalAccess().getEqualsSignKeyword_3()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getConditionalAccess().getEqualsSignKeyword_3()); 

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
    // $ANTLR end "rule__Conditional__Group__3__Impl"


    // $ANTLR start "rule__Conditional__Group__4"
    // InternalScheme.g:854:1: rule__Conditional__Group__4 : rule__Conditional__Group__4__Impl rule__Conditional__Group__5 ;
    public final void rule__Conditional__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScheme.g:858:1: ( rule__Conditional__Group__4__Impl rule__Conditional__Group__5 )
            // InternalScheme.g:859:2: rule__Conditional__Group__4__Impl rule__Conditional__Group__5
            {
            pushFollow(FOLLOW_13);
            rule__Conditional__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Conditional__Group__5();

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
    // $ANTLR end "rule__Conditional__Group__4"


    // $ANTLR start "rule__Conditional__Group__4__Impl"
    // InternalScheme.g:866:1: rule__Conditional__Group__4__Impl : ( ( rule__Conditional__AtAssignment_4 ) ) ;
    public final void rule__Conditional__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScheme.g:870:1: ( ( ( rule__Conditional__AtAssignment_4 ) ) )
            // InternalScheme.g:871:1: ( ( rule__Conditional__AtAssignment_4 ) )
            {
            // InternalScheme.g:871:1: ( ( rule__Conditional__AtAssignment_4 ) )
            // InternalScheme.g:872:2: ( rule__Conditional__AtAssignment_4 )
            {
             before(grammarAccess.getConditionalAccess().getAtAssignment_4()); 
            // InternalScheme.g:873:2: ( rule__Conditional__AtAssignment_4 )
            // InternalScheme.g:873:3: rule__Conditional__AtAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Conditional__AtAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getConditionalAccess().getAtAssignment_4()); 

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
    // $ANTLR end "rule__Conditional__Group__4__Impl"


    // $ANTLR start "rule__Conditional__Group__5"
    // InternalScheme.g:881:1: rule__Conditional__Group__5 : rule__Conditional__Group__5__Impl rule__Conditional__Group__6 ;
    public final void rule__Conditional__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScheme.g:885:1: ( rule__Conditional__Group__5__Impl rule__Conditional__Group__6 )
            // InternalScheme.g:886:2: rule__Conditional__Group__5__Impl rule__Conditional__Group__6
            {
            pushFollow(FOLLOW_6);
            rule__Conditional__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Conditional__Group__6();

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
    // $ANTLR end "rule__Conditional__Group__5"


    // $ANTLR start "rule__Conditional__Group__5__Impl"
    // InternalScheme.g:893:1: rule__Conditional__Group__5__Impl : ( ( rule__Conditional__Value2Assignment_5 ) ) ;
    public final void rule__Conditional__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScheme.g:897:1: ( ( ( rule__Conditional__Value2Assignment_5 ) ) )
            // InternalScheme.g:898:1: ( ( rule__Conditional__Value2Assignment_5 ) )
            {
            // InternalScheme.g:898:1: ( ( rule__Conditional__Value2Assignment_5 ) )
            // InternalScheme.g:899:2: ( rule__Conditional__Value2Assignment_5 )
            {
             before(grammarAccess.getConditionalAccess().getValue2Assignment_5()); 
            // InternalScheme.g:900:2: ( rule__Conditional__Value2Assignment_5 )
            // InternalScheme.g:900:3: rule__Conditional__Value2Assignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Conditional__Value2Assignment_5();

            state._fsp--;


            }

             after(grammarAccess.getConditionalAccess().getValue2Assignment_5()); 

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
    // $ANTLR end "rule__Conditional__Group__5__Impl"


    // $ANTLR start "rule__Conditional__Group__6"
    // InternalScheme.g:908:1: rule__Conditional__Group__6 : rule__Conditional__Group__6__Impl rule__Conditional__Group__7 ;
    public final void rule__Conditional__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScheme.g:912:1: ( rule__Conditional__Group__6__Impl rule__Conditional__Group__7 )
            // InternalScheme.g:913:2: rule__Conditional__Group__6__Impl rule__Conditional__Group__7
            {
            pushFollow(FOLLOW_13);
            rule__Conditional__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Conditional__Group__7();

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
    // $ANTLR end "rule__Conditional__Group__6"


    // $ANTLR start "rule__Conditional__Group__6__Impl"
    // InternalScheme.g:920:1: rule__Conditional__Group__6__Impl : ( ')' ) ;
    public final void rule__Conditional__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScheme.g:924:1: ( ( ')' ) )
            // InternalScheme.g:925:1: ( ')' )
            {
            // InternalScheme.g:925:1: ( ')' )
            // InternalScheme.g:926:2: ')'
            {
             before(grammarAccess.getConditionalAccess().getRightParenthesisKeyword_6()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getConditionalAccess().getRightParenthesisKeyword_6()); 

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
    // $ANTLR end "rule__Conditional__Group__6__Impl"


    // $ANTLR start "rule__Conditional__Group__7"
    // InternalScheme.g:935:1: rule__Conditional__Group__7 : rule__Conditional__Group__7__Impl rule__Conditional__Group__8 ;
    public final void rule__Conditional__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScheme.g:939:1: ( rule__Conditional__Group__7__Impl rule__Conditional__Group__8 )
            // InternalScheme.g:940:2: rule__Conditional__Group__7__Impl rule__Conditional__Group__8
            {
            pushFollow(FOLLOW_6);
            rule__Conditional__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Conditional__Group__8();

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
    // $ANTLR end "rule__Conditional__Group__7"


    // $ANTLR start "rule__Conditional__Group__7__Impl"
    // InternalScheme.g:947:1: rule__Conditional__Group__7__Impl : ( ( rule__Conditional__Value3Assignment_7 ) ) ;
    public final void rule__Conditional__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScheme.g:951:1: ( ( ( rule__Conditional__Value3Assignment_7 ) ) )
            // InternalScheme.g:952:1: ( ( rule__Conditional__Value3Assignment_7 ) )
            {
            // InternalScheme.g:952:1: ( ( rule__Conditional__Value3Assignment_7 ) )
            // InternalScheme.g:953:2: ( rule__Conditional__Value3Assignment_7 )
            {
             before(grammarAccess.getConditionalAccess().getValue3Assignment_7()); 
            // InternalScheme.g:954:2: ( rule__Conditional__Value3Assignment_7 )
            // InternalScheme.g:954:3: rule__Conditional__Value3Assignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Conditional__Value3Assignment_7();

            state._fsp--;


            }

             after(grammarAccess.getConditionalAccess().getValue3Assignment_7()); 

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
    // $ANTLR end "rule__Conditional__Group__7__Impl"


    // $ANTLR start "rule__Conditional__Group__8"
    // InternalScheme.g:962:1: rule__Conditional__Group__8 : rule__Conditional__Group__8__Impl ;
    public final void rule__Conditional__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScheme.g:966:1: ( rule__Conditional__Group__8__Impl )
            // InternalScheme.g:967:2: rule__Conditional__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Conditional__Group__8__Impl();

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
    // $ANTLR end "rule__Conditional__Group__8"


    // $ANTLR start "rule__Conditional__Group__8__Impl"
    // InternalScheme.g:973:1: rule__Conditional__Group__8__Impl : ( ( ')' )? ) ;
    public final void rule__Conditional__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScheme.g:977:1: ( ( ( ')' )? ) )
            // InternalScheme.g:978:1: ( ( ')' )? )
            {
            // InternalScheme.g:978:1: ( ( ')' )? )
            // InternalScheme.g:979:2: ( ')' )?
            {
             before(grammarAccess.getConditionalAccess().getRightParenthesisKeyword_8()); 
            // InternalScheme.g:980:2: ( ')' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==13) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalScheme.g:980:3: ')'
                    {
                    match(input,13,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getConditionalAccess().getRightParenthesisKeyword_8()); 

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
    // $ANTLR end "rule__Conditional__Group__8__Impl"


    // $ANTLR start "rule__Parameter__Group__0"
    // InternalScheme.g:989:1: rule__Parameter__Group__0 : rule__Parameter__Group__0__Impl rule__Parameter__Group__1 ;
    public final void rule__Parameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScheme.g:993:1: ( rule__Parameter__Group__0__Impl rule__Parameter__Group__1 )
            // InternalScheme.g:994:2: rule__Parameter__Group__0__Impl rule__Parameter__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__Parameter__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameter__Group__1();

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
    // $ANTLR end "rule__Parameter__Group__0"


    // $ANTLR start "rule__Parameter__Group__0__Impl"
    // InternalScheme.g:1001:1: rule__Parameter__Group__0__Impl : ( '(' ) ;
    public final void rule__Parameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScheme.g:1005:1: ( ( '(' ) )
            // InternalScheme.g:1006:1: ( '(' )
            {
            // InternalScheme.g:1006:1: ( '(' )
            // InternalScheme.g:1007:2: '('
            {
             before(grammarAccess.getParameterAccess().getLeftParenthesisKeyword_0()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getParameterAccess().getLeftParenthesisKeyword_0()); 

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
    // $ANTLR end "rule__Parameter__Group__0__Impl"


    // $ANTLR start "rule__Parameter__Group__1"
    // InternalScheme.g:1016:1: rule__Parameter__Group__1 : rule__Parameter__Group__1__Impl rule__Parameter__Group__2 ;
    public final void rule__Parameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScheme.g:1020:1: ( rule__Parameter__Group__1__Impl rule__Parameter__Group__2 )
            // InternalScheme.g:1021:2: rule__Parameter__Group__1__Impl rule__Parameter__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Parameter__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameter__Group__2();

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
    // $ANTLR end "rule__Parameter__Group__1"


    // $ANTLR start "rule__Parameter__Group__1__Impl"
    // InternalScheme.g:1028:1: rule__Parameter__Group__1__Impl : ( ( rule__Parameter__NAssignment_1 ) ) ;
    public final void rule__Parameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScheme.g:1032:1: ( ( ( rule__Parameter__NAssignment_1 ) ) )
            // InternalScheme.g:1033:1: ( ( rule__Parameter__NAssignment_1 ) )
            {
            // InternalScheme.g:1033:1: ( ( rule__Parameter__NAssignment_1 ) )
            // InternalScheme.g:1034:2: ( rule__Parameter__NAssignment_1 )
            {
             before(grammarAccess.getParameterAccess().getNAssignment_1()); 
            // InternalScheme.g:1035:2: ( rule__Parameter__NAssignment_1 )
            // InternalScheme.g:1035:3: rule__Parameter__NAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__NAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getNAssignment_1()); 

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
    // $ANTLR end "rule__Parameter__Group__1__Impl"


    // $ANTLR start "rule__Parameter__Group__2"
    // InternalScheme.g:1043:1: rule__Parameter__Group__2 : rule__Parameter__Group__2__Impl rule__Parameter__Group__3 ;
    public final void rule__Parameter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScheme.g:1047:1: ( rule__Parameter__Group__2__Impl rule__Parameter__Group__3 )
            // InternalScheme.g:1048:2: rule__Parameter__Group__2__Impl rule__Parameter__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Parameter__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameter__Group__3();

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
    // $ANTLR end "rule__Parameter__Group__2"


    // $ANTLR start "rule__Parameter__Group__2__Impl"
    // InternalScheme.g:1055:1: rule__Parameter__Group__2__Impl : ( ( rule__Parameter__AtomAssignment_2 ) ) ;
    public final void rule__Parameter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScheme.g:1059:1: ( ( ( rule__Parameter__AtomAssignment_2 ) ) )
            // InternalScheme.g:1060:1: ( ( rule__Parameter__AtomAssignment_2 ) )
            {
            // InternalScheme.g:1060:1: ( ( rule__Parameter__AtomAssignment_2 ) )
            // InternalScheme.g:1061:2: ( rule__Parameter__AtomAssignment_2 )
            {
             before(grammarAccess.getParameterAccess().getAtomAssignment_2()); 
            // InternalScheme.g:1062:2: ( rule__Parameter__AtomAssignment_2 )
            // InternalScheme.g:1062:3: rule__Parameter__AtomAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__AtomAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getAtomAssignment_2()); 

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
    // $ANTLR end "rule__Parameter__Group__2__Impl"


    // $ANTLR start "rule__Parameter__Group__3"
    // InternalScheme.g:1070:1: rule__Parameter__Group__3 : rule__Parameter__Group__3__Impl ;
    public final void rule__Parameter__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScheme.g:1074:1: ( rule__Parameter__Group__3__Impl )
            // InternalScheme.g:1075:2: rule__Parameter__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__Group__3__Impl();

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
    // $ANTLR end "rule__Parameter__Group__3"


    // $ANTLR start "rule__Parameter__Group__3__Impl"
    // InternalScheme.g:1081:1: rule__Parameter__Group__3__Impl : ( ')' ) ;
    public final void rule__Parameter__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScheme.g:1085:1: ( ( ')' ) )
            // InternalScheme.g:1086:1: ( ')' )
            {
            // InternalScheme.g:1086:1: ( ')' )
            // InternalScheme.g:1087:2: ')'
            {
             before(grammarAccess.getParameterAccess().getRightParenthesisKeyword_3()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getParameterAccess().getRightParenthesisKeyword_3()); 

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
    // $ANTLR end "rule__Parameter__Group__3__Impl"


    // $ANTLR start "rule__Model__CommandsAssignment"
    // InternalScheme.g:1097:1: rule__Model__CommandsAssignment : ( ruleCommand ) ;
    public final void rule__Model__CommandsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScheme.g:1101:1: ( ( ruleCommand ) )
            // InternalScheme.g:1102:2: ( ruleCommand )
            {
            // InternalScheme.g:1102:2: ( ruleCommand )
            // InternalScheme.g:1103:3: ruleCommand
            {
             before(grammarAccess.getModelAccess().getCommandsCommandParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleCommand();

            state._fsp--;

             after(grammarAccess.getModelAccess().getCommandsCommandParserRuleCall_0()); 

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
    // $ANTLR end "rule__Model__CommandsAssignment"


    // $ANTLR start "rule__Command__ValueAssignment_4"
    // InternalScheme.g:1112:1: rule__Command__ValueAssignment_4 : ( RULE_INT ) ;
    public final void rule__Command__ValueAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScheme.g:1116:1: ( ( RULE_INT ) )
            // InternalScheme.g:1117:2: ( RULE_INT )
            {
            // InternalScheme.g:1117:2: ( RULE_INT )
            // InternalScheme.g:1118:3: RULE_INT
            {
             before(grammarAccess.getCommandAccess().getValueINTTerminalRuleCall_4_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getCommandAccess().getValueINTTerminalRuleCall_4_0()); 

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
    // $ANTLR end "rule__Command__ValueAssignment_4"


    // $ANTLR start "rule__Operation__OperatorAssignment_1"
    // InternalScheme.g:1127:1: rule__Operation__OperatorAssignment_1 : ( RULE_OPERATOR ) ;
    public final void rule__Operation__OperatorAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScheme.g:1131:1: ( ( RULE_OPERATOR ) )
            // InternalScheme.g:1132:2: ( RULE_OPERATOR )
            {
            // InternalScheme.g:1132:2: ( RULE_OPERATOR )
            // InternalScheme.g:1133:3: RULE_OPERATOR
            {
             before(grammarAccess.getOperationAccess().getOperatorOperatorTerminalRuleCall_1_0()); 
            match(input,RULE_OPERATOR,FOLLOW_2); 
             after(grammarAccess.getOperationAccess().getOperatorOperatorTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Operation__OperatorAssignment_1"


    // $ANTLR start "rule__Operation__SimpleOperationAssignment_2_0"
    // InternalScheme.g:1142:1: rule__Operation__SimpleOperationAssignment_2_0 : ( ruleSimpleOperation ) ;
    public final void rule__Operation__SimpleOperationAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScheme.g:1146:1: ( ( ruleSimpleOperation ) )
            // InternalScheme.g:1147:2: ( ruleSimpleOperation )
            {
            // InternalScheme.g:1147:2: ( ruleSimpleOperation )
            // InternalScheme.g:1148:3: ruleSimpleOperation
            {
             before(grammarAccess.getOperationAccess().getSimpleOperationSimpleOperationParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleSimpleOperation();

            state._fsp--;

             after(grammarAccess.getOperationAccess().getSimpleOperationSimpleOperationParserRuleCall_2_0_0()); 

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
    // $ANTLR end "rule__Operation__SimpleOperationAssignment_2_0"


    // $ANTLR start "rule__Operation__AtomAssignment_2_1"
    // InternalScheme.g:1157:1: rule__Operation__AtomAssignment_2_1 : ( ruleAtom ) ;
    public final void rule__Operation__AtomAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScheme.g:1161:1: ( ( ruleAtom ) )
            // InternalScheme.g:1162:2: ( ruleAtom )
            {
            // InternalScheme.g:1162:2: ( ruleAtom )
            // InternalScheme.g:1163:3: ruleAtom
            {
             before(grammarAccess.getOperationAccess().getAtomAtomParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAtom();

            state._fsp--;

             after(grammarAccess.getOperationAccess().getAtomAtomParserRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__Operation__AtomAssignment_2_1"


    // $ANTLR start "rule__SimpleOperation__OperatorAssignment_1"
    // InternalScheme.g:1172:1: rule__SimpleOperation__OperatorAssignment_1 : ( RULE_OPERATOR ) ;
    public final void rule__SimpleOperation__OperatorAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScheme.g:1176:1: ( ( RULE_OPERATOR ) )
            // InternalScheme.g:1177:2: ( RULE_OPERATOR )
            {
            // InternalScheme.g:1177:2: ( RULE_OPERATOR )
            // InternalScheme.g:1178:3: RULE_OPERATOR
            {
             before(grammarAccess.getSimpleOperationAccess().getOperatorOperatorTerminalRuleCall_1_0()); 
            match(input,RULE_OPERATOR,FOLLOW_2); 
             after(grammarAccess.getSimpleOperationAccess().getOperatorOperatorTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__SimpleOperation__OperatorAssignment_1"


    // $ANTLR start "rule__SimpleOperation__ValueAssignment_2"
    // InternalScheme.g:1187:1: rule__SimpleOperation__ValueAssignment_2 : ( ruleAtom ) ;
    public final void rule__SimpleOperation__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScheme.g:1191:1: ( ( ruleAtom ) )
            // InternalScheme.g:1192:2: ( ruleAtom )
            {
            // InternalScheme.g:1192:2: ( ruleAtom )
            // InternalScheme.g:1193:3: ruleAtom
            {
             before(grammarAccess.getSimpleOperationAccess().getValueAtomParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAtom();

            state._fsp--;

             after(grammarAccess.getSimpleOperationAccess().getValueAtomParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__SimpleOperation__ValueAssignment_2"


    // $ANTLR start "rule__Define__Name1Assignment_2_0"
    // InternalScheme.g:1202:1: rule__Define__Name1Assignment_2_0 : ( RULE_ID ) ;
    public final void rule__Define__Name1Assignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScheme.g:1206:1: ( ( RULE_ID ) )
            // InternalScheme.g:1207:2: ( RULE_ID )
            {
            // InternalScheme.g:1207:2: ( RULE_ID )
            // InternalScheme.g:1208:3: RULE_ID
            {
             before(grammarAccess.getDefineAccess().getName1IDTerminalRuleCall_2_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDefineAccess().getName1IDTerminalRuleCall_2_0_0()); 

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
    // $ANTLR end "rule__Define__Name1Assignment_2_0"


    // $ANTLR start "rule__Define__ParametersAssignment_2_1"
    // InternalScheme.g:1217:1: rule__Define__ParametersAssignment_2_1 : ( ruleParameter ) ;
    public final void rule__Define__ParametersAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScheme.g:1221:1: ( ( ruleParameter ) )
            // InternalScheme.g:1222:2: ( ruleParameter )
            {
            // InternalScheme.g:1222:2: ( ruleParameter )
            // InternalScheme.g:1223:3: ruleParameter
            {
             before(grammarAccess.getDefineAccess().getParametersParameterParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getDefineAccess().getParametersParameterParserRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__Define__ParametersAssignment_2_1"


    // $ANTLR start "rule__Define__Atons2Assignment_3_0"
    // InternalScheme.g:1232:1: rule__Define__Atons2Assignment_3_0 : ( ruleAtom ) ;
    public final void rule__Define__Atons2Assignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScheme.g:1236:1: ( ( ruleAtom ) )
            // InternalScheme.g:1237:2: ( ruleAtom )
            {
            // InternalScheme.g:1237:2: ( ruleAtom )
            // InternalScheme.g:1238:3: ruleAtom
            {
             before(grammarAccess.getDefineAccess().getAtons2AtomParserRuleCall_3_0_0()); 
            pushFollow(FOLLOW_2);
            ruleAtom();

            state._fsp--;

             after(grammarAccess.getDefineAccess().getAtons2AtomParserRuleCall_3_0_0()); 

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
    // $ANTLR end "rule__Define__Atons2Assignment_3_0"


    // $ANTLR start "rule__Define__ParametersAssignment_3_1"
    // InternalScheme.g:1247:1: rule__Define__ParametersAssignment_3_1 : ( ruleParameter ) ;
    public final void rule__Define__ParametersAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScheme.g:1251:1: ( ( ruleParameter ) )
            // InternalScheme.g:1252:2: ( ruleParameter )
            {
            // InternalScheme.g:1252:2: ( ruleParameter )
            // InternalScheme.g:1253:3: ruleParameter
            {
             before(grammarAccess.getDefineAccess().getParametersParameterParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getDefineAccess().getParametersParameterParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__Define__ParametersAssignment_3_1"


    // $ANTLR start "rule__Define__OperationAssignment_3_2"
    // InternalScheme.g:1262:1: rule__Define__OperationAssignment_3_2 : ( ruleOperation ) ;
    public final void rule__Define__OperationAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScheme.g:1266:1: ( ( ruleOperation ) )
            // InternalScheme.g:1267:2: ( ruleOperation )
            {
            // InternalScheme.g:1267:2: ( ruleOperation )
            // InternalScheme.g:1268:3: ruleOperation
            {
             before(grammarAccess.getDefineAccess().getOperationOperationParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_2);
            ruleOperation();

            state._fsp--;

             after(grammarAccess.getDefineAccess().getOperationOperationParserRuleCall_3_2_0()); 

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
    // $ANTLR end "rule__Define__OperationAssignment_3_2"


    // $ANTLR start "rule__Conditional__AtAssignment_4"
    // InternalScheme.g:1277:1: rule__Conditional__AtAssignment_4 : ( ruleAtom ) ;
    public final void rule__Conditional__AtAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScheme.g:1281:1: ( ( ruleAtom ) )
            // InternalScheme.g:1282:2: ( ruleAtom )
            {
            // InternalScheme.g:1282:2: ( ruleAtom )
            // InternalScheme.g:1283:3: ruleAtom
            {
             before(grammarAccess.getConditionalAccess().getAtAtomParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleAtom();

            state._fsp--;

             after(grammarAccess.getConditionalAccess().getAtAtomParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Conditional__AtAssignment_4"


    // $ANTLR start "rule__Conditional__Value2Assignment_5"
    // InternalScheme.g:1292:1: rule__Conditional__Value2Assignment_5 : ( RULE_INT ) ;
    public final void rule__Conditional__Value2Assignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScheme.g:1296:1: ( ( RULE_INT ) )
            // InternalScheme.g:1297:2: ( RULE_INT )
            {
            // InternalScheme.g:1297:2: ( RULE_INT )
            // InternalScheme.g:1298:3: RULE_INT
            {
             before(grammarAccess.getConditionalAccess().getValue2INTTerminalRuleCall_5_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getConditionalAccess().getValue2INTTerminalRuleCall_5_0()); 

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
    // $ANTLR end "rule__Conditional__Value2Assignment_5"


    // $ANTLR start "rule__Conditional__Value3Assignment_7"
    // InternalScheme.g:1307:1: rule__Conditional__Value3Assignment_7 : ( RULE_INT ) ;
    public final void rule__Conditional__Value3Assignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScheme.g:1311:1: ( ( RULE_INT ) )
            // InternalScheme.g:1312:2: ( RULE_INT )
            {
            // InternalScheme.g:1312:2: ( RULE_INT )
            // InternalScheme.g:1313:3: RULE_INT
            {
             before(grammarAccess.getConditionalAccess().getValue3INTTerminalRuleCall_7_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getConditionalAccess().getValue3INTTerminalRuleCall_7_0()); 

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
    // $ANTLR end "rule__Conditional__Value3Assignment_7"


    // $ANTLR start "rule__Parameter__NAssignment_1"
    // InternalScheme.g:1322:1: rule__Parameter__NAssignment_1 : ( RULE_ID ) ;
    public final void rule__Parameter__NAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScheme.g:1326:1: ( ( RULE_ID ) )
            // InternalScheme.g:1327:2: ( RULE_ID )
            {
            // InternalScheme.g:1327:2: ( RULE_ID )
            // InternalScheme.g:1328:3: RULE_ID
            {
             before(grammarAccess.getParameterAccess().getNIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getParameterAccess().getNIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Parameter__NAssignment_1"


    // $ANTLR start "rule__Parameter__AtomAssignment_2"
    // InternalScheme.g:1337:1: rule__Parameter__AtomAssignment_2 : ( ruleAtom ) ;
    public final void rule__Parameter__AtomAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScheme.g:1341:1: ( ( ruleAtom ) )
            // InternalScheme.g:1342:2: ( ruleAtom )
            {
            // InternalScheme.g:1342:2: ( ruleAtom )
            // InternalScheme.g:1343:3: ruleAtom
            {
             before(grammarAccess.getParameterAccess().getAtomAtomParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAtom();

            state._fsp--;

             after(grammarAccess.getParameterAccess().getAtomAtomParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Parameter__AtomAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001022L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001030L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000001032L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000010L});

}