package pucrs.lp.scheme.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import pucrs.lp.scheme.services.SchemeGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSchemeParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_OPERATOR", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'('", "')'", "'define'", "'if'", "'='"
    };
    public static final int RULE_ID=6;
    public static final int RULE_WS=10;
    public static final int RULE_STRING=7;
    public static final int RULE_ANY_OTHER=11;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int RULE_INT=4;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_OPERATOR=5;

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

        public InternalSchemeParser(TokenStream input, SchemeGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected SchemeGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalScheme.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalScheme.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalScheme.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalScheme.g:71:1: ruleModel returns [EObject current=null] : ( (lv_commands_0_0= ruleCommand ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_commands_0_0 = null;



        	enterRule();

        try {
            // InternalScheme.g:77:2: ( ( (lv_commands_0_0= ruleCommand ) )* )
            // InternalScheme.g:78:2: ( (lv_commands_0_0= ruleCommand ) )*
            {
            // InternalScheme.g:78:2: ( (lv_commands_0_0= ruleCommand ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_INT||LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalScheme.g:79:3: (lv_commands_0_0= ruleCommand )
            	    {
            	    // InternalScheme.g:79:3: (lv_commands_0_0= ruleCommand )
            	    // InternalScheme.g:80:4: lv_commands_0_0= ruleCommand
            	    {

            	    				newCompositeNode(grammarAccess.getModelAccess().getCommandsCommandParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_commands_0_0=ruleCommand();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"commands",
            	    					lv_commands_0_0,
            	    					"pucrs.lp.scheme.Scheme.Command");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleCommand"
    // InternalScheme.g:100:1: entryRuleCommand returns [EObject current=null] : iv_ruleCommand= ruleCommand EOF ;
    public final EObject entryRuleCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommand = null;


        try {
            // InternalScheme.g:100:48: (iv_ruleCommand= ruleCommand EOF )
            // InternalScheme.g:101:2: iv_ruleCommand= ruleCommand EOF
            {
             newCompositeNode(grammarAccess.getCommandRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCommand=ruleCommand();

            state._fsp--;

             current =iv_ruleCommand; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleCommand"


    // $ANTLR start "ruleCommand"
    // InternalScheme.g:107:1: ruleCommand returns [EObject current=null] : (this_Operation_0= ruleOperation | this_Define_1= ruleDefine | this_Parameter_2= ruleParameter | this_Conditional_3= ruleConditional | ( (lv_value_4_0= RULE_INT ) ) ) ;
    public final EObject ruleCommand() throws RecognitionException {
        EObject current = null;

        Token lv_value_4_0=null;
        EObject this_Operation_0 = null;

        EObject this_Define_1 = null;

        EObject this_Parameter_2 = null;

        EObject this_Conditional_3 = null;



        	enterRule();

        try {
            // InternalScheme.g:113:2: ( (this_Operation_0= ruleOperation | this_Define_1= ruleDefine | this_Parameter_2= ruleParameter | this_Conditional_3= ruleConditional | ( (lv_value_4_0= RULE_INT ) ) ) )
            // InternalScheme.g:114:2: (this_Operation_0= ruleOperation | this_Define_1= ruleDefine | this_Parameter_2= ruleParameter | this_Conditional_3= ruleConditional | ( (lv_value_4_0= RULE_INT ) ) )
            {
            // InternalScheme.g:114:2: (this_Operation_0= ruleOperation | this_Define_1= ruleDefine | this_Parameter_2= ruleParameter | this_Conditional_3= ruleConditional | ( (lv_value_4_0= RULE_INT ) ) )
            int alt2=5;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==12) ) {
                switch ( input.LA(2) ) {
                case 14:
                    {
                    alt2=2;
                    }
                    break;
                case RULE_OPERATOR:
                    {
                    alt2=1;
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
                    // InternalScheme.g:115:3: this_Operation_0= ruleOperation
                    {

                    			newCompositeNode(grammarAccess.getCommandAccess().getOperationParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Operation_0=ruleOperation();

                    state._fsp--;


                    			current = this_Operation_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalScheme.g:124:3: this_Define_1= ruleDefine
                    {

                    			newCompositeNode(grammarAccess.getCommandAccess().getDefineParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Define_1=ruleDefine();

                    state._fsp--;


                    			current = this_Define_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalScheme.g:133:3: this_Parameter_2= ruleParameter
                    {

                    			newCompositeNode(grammarAccess.getCommandAccess().getParameterParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Parameter_2=ruleParameter();

                    state._fsp--;


                    			current = this_Parameter_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalScheme.g:142:3: this_Conditional_3= ruleConditional
                    {

                    			newCompositeNode(grammarAccess.getCommandAccess().getConditionalParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Conditional_3=ruleConditional();

                    state._fsp--;


                    			current = this_Conditional_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalScheme.g:151:3: ( (lv_value_4_0= RULE_INT ) )
                    {
                    // InternalScheme.g:151:3: ( (lv_value_4_0= RULE_INT ) )
                    // InternalScheme.g:152:4: (lv_value_4_0= RULE_INT )
                    {
                    // InternalScheme.g:152:4: (lv_value_4_0= RULE_INT )
                    // InternalScheme.g:153:5: lv_value_4_0= RULE_INT
                    {
                    lv_value_4_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    					newLeafNode(lv_value_4_0, grammarAccess.getCommandAccess().getValueINTTerminalRuleCall_4_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getCommandRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"value",
                    						lv_value_4_0,
                    						"org.eclipse.xtext.common.Terminals.INT");
                    				

                    }


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
    // $ANTLR end "ruleCommand"


    // $ANTLR start "entryRuleOperation"
    // InternalScheme.g:173:1: entryRuleOperation returns [EObject current=null] : iv_ruleOperation= ruleOperation EOF ;
    public final EObject entryRuleOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperation = null;


        try {
            // InternalScheme.g:173:50: (iv_ruleOperation= ruleOperation EOF )
            // InternalScheme.g:174:2: iv_ruleOperation= ruleOperation EOF
            {
             newCompositeNode(grammarAccess.getOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOperation=ruleOperation();

            state._fsp--;

             current =iv_ruleOperation; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleOperation"


    // $ANTLR start "ruleOperation"
    // InternalScheme.g:180:1: ruleOperation returns [EObject current=null] : (otherlv_0= '(' ( (lv_operator_1_0= RULE_OPERATOR ) ) ( ( (lv_simpleOperation_2_0= ruleSimpleOperation ) ) | ( (lv_atom_3_0= ruleAtom ) ) )+ otherlv_4= ')' ) ;
    public final EObject ruleOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_operator_1_0=null;
        Token otherlv_4=null;
        EObject lv_simpleOperation_2_0 = null;

        AntlrDatatypeRuleToken lv_atom_3_0 = null;



        	enterRule();

        try {
            // InternalScheme.g:186:2: ( (otherlv_0= '(' ( (lv_operator_1_0= RULE_OPERATOR ) ) ( ( (lv_simpleOperation_2_0= ruleSimpleOperation ) ) | ( (lv_atom_3_0= ruleAtom ) ) )+ otherlv_4= ')' ) )
            // InternalScheme.g:187:2: (otherlv_0= '(' ( (lv_operator_1_0= RULE_OPERATOR ) ) ( ( (lv_simpleOperation_2_0= ruleSimpleOperation ) ) | ( (lv_atom_3_0= ruleAtom ) ) )+ otherlv_4= ')' )
            {
            // InternalScheme.g:187:2: (otherlv_0= '(' ( (lv_operator_1_0= RULE_OPERATOR ) ) ( ( (lv_simpleOperation_2_0= ruleSimpleOperation ) ) | ( (lv_atom_3_0= ruleAtom ) ) )+ otherlv_4= ')' )
            // InternalScheme.g:188:3: otherlv_0= '(' ( (lv_operator_1_0= RULE_OPERATOR ) ) ( ( (lv_simpleOperation_2_0= ruleSimpleOperation ) ) | ( (lv_atom_3_0= ruleAtom ) ) )+ otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getOperationAccess().getLeftParenthesisKeyword_0());
            		
            // InternalScheme.g:192:3: ( (lv_operator_1_0= RULE_OPERATOR ) )
            // InternalScheme.g:193:4: (lv_operator_1_0= RULE_OPERATOR )
            {
            // InternalScheme.g:193:4: (lv_operator_1_0= RULE_OPERATOR )
            // InternalScheme.g:194:5: lv_operator_1_0= RULE_OPERATOR
            {
            lv_operator_1_0=(Token)match(input,RULE_OPERATOR,FOLLOW_5); 

            					newLeafNode(lv_operator_1_0, grammarAccess.getOperationAccess().getOperatorOperatorTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOperationRule());
            					}
            					addWithLastConsumed(
            						current,
            						"operator",
            						lv_operator_1_0,
            						"pucrs.lp.scheme.Scheme.Operator");
            				

            }


            }

            // InternalScheme.g:210:3: ( ( (lv_simpleOperation_2_0= ruleSimpleOperation ) ) | ( (lv_atom_3_0= ruleAtom ) ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=3;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==12) ) {
                    alt3=1;
                }
                else if ( (LA3_0==RULE_INT||LA3_0==RULE_ID) ) {
                    alt3=2;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalScheme.g:211:4: ( (lv_simpleOperation_2_0= ruleSimpleOperation ) )
            	    {
            	    // InternalScheme.g:211:4: ( (lv_simpleOperation_2_0= ruleSimpleOperation ) )
            	    // InternalScheme.g:212:5: (lv_simpleOperation_2_0= ruleSimpleOperation )
            	    {
            	    // InternalScheme.g:212:5: (lv_simpleOperation_2_0= ruleSimpleOperation )
            	    // InternalScheme.g:213:6: lv_simpleOperation_2_0= ruleSimpleOperation
            	    {

            	    						newCompositeNode(grammarAccess.getOperationAccess().getSimpleOperationSimpleOperationParserRuleCall_2_0_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_simpleOperation_2_0=ruleSimpleOperation();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getOperationRule());
            	    						}
            	    						add(
            	    							current,
            	    							"simpleOperation",
            	    							lv_simpleOperation_2_0,
            	    							"pucrs.lp.scheme.Scheme.SimpleOperation");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalScheme.g:231:4: ( (lv_atom_3_0= ruleAtom ) )
            	    {
            	    // InternalScheme.g:231:4: ( (lv_atom_3_0= ruleAtom ) )
            	    // InternalScheme.g:232:5: (lv_atom_3_0= ruleAtom )
            	    {
            	    // InternalScheme.g:232:5: (lv_atom_3_0= ruleAtom )
            	    // InternalScheme.g:233:6: lv_atom_3_0= ruleAtom
            	    {

            	    						newCompositeNode(grammarAccess.getOperationAccess().getAtomAtomParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_atom_3_0=ruleAtom();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getOperationRule());
            	    						}
            	    						add(
            	    							current,
            	    							"atom",
            	    							lv_atom_3_0,
            	    							"pucrs.lp.scheme.Scheme.Atom");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getOperationAccess().getRightParenthesisKeyword_3());
            		

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
    // $ANTLR end "ruleOperation"


    // $ANTLR start "entryRuleSimpleOperation"
    // InternalScheme.g:259:1: entryRuleSimpleOperation returns [EObject current=null] : iv_ruleSimpleOperation= ruleSimpleOperation EOF ;
    public final EObject entryRuleSimpleOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleOperation = null;


        try {
            // InternalScheme.g:259:56: (iv_ruleSimpleOperation= ruleSimpleOperation EOF )
            // InternalScheme.g:260:2: iv_ruleSimpleOperation= ruleSimpleOperation EOF
            {
             newCompositeNode(grammarAccess.getSimpleOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSimpleOperation=ruleSimpleOperation();

            state._fsp--;

             current =iv_ruleSimpleOperation; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSimpleOperation"


    // $ANTLR start "ruleSimpleOperation"
    // InternalScheme.g:266:1: ruleSimpleOperation returns [EObject current=null] : (otherlv_0= '(' ( (lv_operator_1_0= RULE_OPERATOR ) ) ( (lv_value_2_0= ruleAtom ) )+ otherlv_3= ')' ) ;
    public final EObject ruleSimpleOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_operator_1_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalScheme.g:272:2: ( (otherlv_0= '(' ( (lv_operator_1_0= RULE_OPERATOR ) ) ( (lv_value_2_0= ruleAtom ) )+ otherlv_3= ')' ) )
            // InternalScheme.g:273:2: (otherlv_0= '(' ( (lv_operator_1_0= RULE_OPERATOR ) ) ( (lv_value_2_0= ruleAtom ) )+ otherlv_3= ')' )
            {
            // InternalScheme.g:273:2: (otherlv_0= '(' ( (lv_operator_1_0= RULE_OPERATOR ) ) ( (lv_value_2_0= ruleAtom ) )+ otherlv_3= ')' )
            // InternalScheme.g:274:3: otherlv_0= '(' ( (lv_operator_1_0= RULE_OPERATOR ) ) ( (lv_value_2_0= ruleAtom ) )+ otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getSimpleOperationAccess().getLeftParenthesisKeyword_0());
            		
            // InternalScheme.g:278:3: ( (lv_operator_1_0= RULE_OPERATOR ) )
            // InternalScheme.g:279:4: (lv_operator_1_0= RULE_OPERATOR )
            {
            // InternalScheme.g:279:4: (lv_operator_1_0= RULE_OPERATOR )
            // InternalScheme.g:280:5: lv_operator_1_0= RULE_OPERATOR
            {
            lv_operator_1_0=(Token)match(input,RULE_OPERATOR,FOLLOW_5); 

            					newLeafNode(lv_operator_1_0, grammarAccess.getSimpleOperationAccess().getOperatorOperatorTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSimpleOperationRule());
            					}
            					addWithLastConsumed(
            						current,
            						"operator",
            						lv_operator_1_0,
            						"pucrs.lp.scheme.Scheme.Operator");
            				

            }


            }

            // InternalScheme.g:296:3: ( (lv_value_2_0= ruleAtom ) )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_INT||LA4_0==RULE_ID) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalScheme.g:297:4: (lv_value_2_0= ruleAtom )
            	    {
            	    // InternalScheme.g:297:4: (lv_value_2_0= ruleAtom )
            	    // InternalScheme.g:298:5: lv_value_2_0= ruleAtom
            	    {

            	    					newCompositeNode(grammarAccess.getSimpleOperationAccess().getValueAtomParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_value_2_0=ruleAtom();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSimpleOperationRule());
            	    					}
            	    					add(
            	    						current,
            	    						"value",
            	    						lv_value_2_0,
            	    						"pucrs.lp.scheme.Scheme.Atom");
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

            otherlv_3=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getSimpleOperationAccess().getRightParenthesisKeyword_3());
            		

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
    // $ANTLR end "ruleSimpleOperation"


    // $ANTLR start "entryRuleDefine"
    // InternalScheme.g:323:1: entryRuleDefine returns [EObject current=null] : iv_ruleDefine= ruleDefine EOF ;
    public final EObject entryRuleDefine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefine = null;


        try {
            // InternalScheme.g:323:47: (iv_ruleDefine= ruleDefine EOF )
            // InternalScheme.g:324:2: iv_ruleDefine= ruleDefine EOF
            {
             newCompositeNode(grammarAccess.getDefineRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDefine=ruleDefine();

            state._fsp--;

             current =iv_ruleDefine; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDefine"


    // $ANTLR start "ruleDefine"
    // InternalScheme.g:330:1: ruleDefine returns [EObject current=null] : (otherlv_0= '(' otherlv_1= 'define' ( ( (lv_name1_2_0= RULE_ID ) ) | ( (lv_parameters_3_0= ruleParameter ) ) ) ( ( (lv_atons2_4_0= ruleAtom ) ) | ( (lv_parameters_5_0= ruleParameter ) ) | ( (lv_operation_6_0= ruleOperation ) ) ) otherlv_7= ')' ) ;
    public final EObject ruleDefine() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name1_2_0=null;
        Token otherlv_7=null;
        EObject lv_parameters_3_0 = null;

        AntlrDatatypeRuleToken lv_atons2_4_0 = null;

        EObject lv_parameters_5_0 = null;

        EObject lv_operation_6_0 = null;



        	enterRule();

        try {
            // InternalScheme.g:336:2: ( (otherlv_0= '(' otherlv_1= 'define' ( ( (lv_name1_2_0= RULE_ID ) ) | ( (lv_parameters_3_0= ruleParameter ) ) ) ( ( (lv_atons2_4_0= ruleAtom ) ) | ( (lv_parameters_5_0= ruleParameter ) ) | ( (lv_operation_6_0= ruleOperation ) ) ) otherlv_7= ')' ) )
            // InternalScheme.g:337:2: (otherlv_0= '(' otherlv_1= 'define' ( ( (lv_name1_2_0= RULE_ID ) ) | ( (lv_parameters_3_0= ruleParameter ) ) ) ( ( (lv_atons2_4_0= ruleAtom ) ) | ( (lv_parameters_5_0= ruleParameter ) ) | ( (lv_operation_6_0= ruleOperation ) ) ) otherlv_7= ')' )
            {
            // InternalScheme.g:337:2: (otherlv_0= '(' otherlv_1= 'define' ( ( (lv_name1_2_0= RULE_ID ) ) | ( (lv_parameters_3_0= ruleParameter ) ) ) ( ( (lv_atons2_4_0= ruleAtom ) ) | ( (lv_parameters_5_0= ruleParameter ) ) | ( (lv_operation_6_0= ruleOperation ) ) ) otherlv_7= ')' )
            // InternalScheme.g:338:3: otherlv_0= '(' otherlv_1= 'define' ( ( (lv_name1_2_0= RULE_ID ) ) | ( (lv_parameters_3_0= ruleParameter ) ) ) ( ( (lv_atons2_4_0= ruleAtom ) ) | ( (lv_parameters_5_0= ruleParameter ) ) | ( (lv_operation_6_0= ruleOperation ) ) ) otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getDefineAccess().getLeftParenthesisKeyword_0());
            		
            otherlv_1=(Token)match(input,14,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getDefineAccess().getDefineKeyword_1());
            		
            // InternalScheme.g:346:3: ( ( (lv_name1_2_0= RULE_ID ) ) | ( (lv_parameters_3_0= ruleParameter ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                alt5=1;
            }
            else if ( (LA5_0==12) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalScheme.g:347:4: ( (lv_name1_2_0= RULE_ID ) )
                    {
                    // InternalScheme.g:347:4: ( (lv_name1_2_0= RULE_ID ) )
                    // InternalScheme.g:348:5: (lv_name1_2_0= RULE_ID )
                    {
                    // InternalScheme.g:348:5: (lv_name1_2_0= RULE_ID )
                    // InternalScheme.g:349:6: lv_name1_2_0= RULE_ID
                    {
                    lv_name1_2_0=(Token)match(input,RULE_ID,FOLLOW_5); 

                    						newLeafNode(lv_name1_2_0, grammarAccess.getDefineAccess().getName1IDTerminalRuleCall_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDefineRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name1",
                    							lv_name1_2_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalScheme.g:366:4: ( (lv_parameters_3_0= ruleParameter ) )
                    {
                    // InternalScheme.g:366:4: ( (lv_parameters_3_0= ruleParameter ) )
                    // InternalScheme.g:367:5: (lv_parameters_3_0= ruleParameter )
                    {
                    // InternalScheme.g:367:5: (lv_parameters_3_0= ruleParameter )
                    // InternalScheme.g:368:6: lv_parameters_3_0= ruleParameter
                    {

                    						newCompositeNode(grammarAccess.getDefineAccess().getParametersParameterParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_5);
                    lv_parameters_3_0=ruleParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDefineRule());
                    						}
                    						add(
                    							current,
                    							"parameters",
                    							lv_parameters_3_0,
                    							"pucrs.lp.scheme.Scheme.Parameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalScheme.g:386:3: ( ( (lv_atons2_4_0= ruleAtom ) ) | ( (lv_parameters_5_0= ruleParameter ) ) | ( (lv_operation_6_0= ruleOperation ) ) )
            int alt6=3;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_INT||LA6_0==RULE_ID) ) {
                alt6=1;
            }
            else if ( (LA6_0==12) ) {
                int LA6_2 = input.LA(2);

                if ( (LA6_2==RULE_ID) ) {
                    alt6=2;
                }
                else if ( (LA6_2==RULE_OPERATOR) ) {
                    alt6=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalScheme.g:387:4: ( (lv_atons2_4_0= ruleAtom ) )
                    {
                    // InternalScheme.g:387:4: ( (lv_atons2_4_0= ruleAtom ) )
                    // InternalScheme.g:388:5: (lv_atons2_4_0= ruleAtom )
                    {
                    // InternalScheme.g:388:5: (lv_atons2_4_0= ruleAtom )
                    // InternalScheme.g:389:6: lv_atons2_4_0= ruleAtom
                    {

                    						newCompositeNode(grammarAccess.getDefineAccess().getAtons2AtomParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_atons2_4_0=ruleAtom();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDefineRule());
                    						}
                    						add(
                    							current,
                    							"atons2",
                    							lv_atons2_4_0,
                    							"pucrs.lp.scheme.Scheme.Atom");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalScheme.g:407:4: ( (lv_parameters_5_0= ruleParameter ) )
                    {
                    // InternalScheme.g:407:4: ( (lv_parameters_5_0= ruleParameter ) )
                    // InternalScheme.g:408:5: (lv_parameters_5_0= ruleParameter )
                    {
                    // InternalScheme.g:408:5: (lv_parameters_5_0= ruleParameter )
                    // InternalScheme.g:409:6: lv_parameters_5_0= ruleParameter
                    {

                    						newCompositeNode(grammarAccess.getDefineAccess().getParametersParameterParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_parameters_5_0=ruleParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDefineRule());
                    						}
                    						add(
                    							current,
                    							"parameters",
                    							lv_parameters_5_0,
                    							"pucrs.lp.scheme.Scheme.Parameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalScheme.g:427:4: ( (lv_operation_6_0= ruleOperation ) )
                    {
                    // InternalScheme.g:427:4: ( (lv_operation_6_0= ruleOperation ) )
                    // InternalScheme.g:428:5: (lv_operation_6_0= ruleOperation )
                    {
                    // InternalScheme.g:428:5: (lv_operation_6_0= ruleOperation )
                    // InternalScheme.g:429:6: lv_operation_6_0= ruleOperation
                    {

                    						newCompositeNode(grammarAccess.getDefineAccess().getOperationOperationParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_operation_6_0=ruleOperation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDefineRule());
                    						}
                    						set(
                    							current,
                    							"operation",
                    							lv_operation_6_0,
                    							"pucrs.lp.scheme.Scheme.Operation");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getDefineAccess().getRightParenthesisKeyword_4());
            		

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
    // $ANTLR end "ruleDefine"


    // $ANTLR start "entryRuleConditional"
    // InternalScheme.g:455:1: entryRuleConditional returns [EObject current=null] : iv_ruleConditional= ruleConditional EOF ;
    public final EObject entryRuleConditional() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditional = null;


        try {
            // InternalScheme.g:455:52: (iv_ruleConditional= ruleConditional EOF )
            // InternalScheme.g:456:2: iv_ruleConditional= ruleConditional EOF
            {
             newCompositeNode(grammarAccess.getConditionalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConditional=ruleConditional();

            state._fsp--;

             current =iv_ruleConditional; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleConditional"


    // $ANTLR start "ruleConditional"
    // InternalScheme.g:462:1: ruleConditional returns [EObject current=null] : (otherlv_0= '(' otherlv_1= 'if' otherlv_2= '(' otherlv_3= '=' ( (lv_at_4_0= ruleAtom ) ) ( (lv_value2_5_0= RULE_INT ) ) otherlv_6= ')' ( (lv_value3_7_0= RULE_INT ) ) (otherlv_8= ')' )? ) ;
    public final EObject ruleConditional() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_value2_5_0=null;
        Token otherlv_6=null;
        Token lv_value3_7_0=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_at_4_0 = null;



        	enterRule();

        try {
            // InternalScheme.g:468:2: ( (otherlv_0= '(' otherlv_1= 'if' otherlv_2= '(' otherlv_3= '=' ( (lv_at_4_0= ruleAtom ) ) ( (lv_value2_5_0= RULE_INT ) ) otherlv_6= ')' ( (lv_value3_7_0= RULE_INT ) ) (otherlv_8= ')' )? ) )
            // InternalScheme.g:469:2: (otherlv_0= '(' otherlv_1= 'if' otherlv_2= '(' otherlv_3= '=' ( (lv_at_4_0= ruleAtom ) ) ( (lv_value2_5_0= RULE_INT ) ) otherlv_6= ')' ( (lv_value3_7_0= RULE_INT ) ) (otherlv_8= ')' )? )
            {
            // InternalScheme.g:469:2: (otherlv_0= '(' otherlv_1= 'if' otherlv_2= '(' otherlv_3= '=' ( (lv_at_4_0= ruleAtom ) ) ( (lv_value2_5_0= RULE_INT ) ) otherlv_6= ')' ( (lv_value3_7_0= RULE_INT ) ) (otherlv_8= ')' )? )
            // InternalScheme.g:470:3: otherlv_0= '(' otherlv_1= 'if' otherlv_2= '(' otherlv_3= '=' ( (lv_at_4_0= ruleAtom ) ) ( (lv_value2_5_0= RULE_INT ) ) otherlv_6= ')' ( (lv_value3_7_0= RULE_INT ) ) (otherlv_8= ')' )?
            {
            otherlv_0=(Token)match(input,12,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getConditionalAccess().getLeftParenthesisKeyword_0());
            		
            otherlv_1=(Token)match(input,15,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getConditionalAccess().getIfKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getConditionalAccess().getLeftParenthesisKeyword_2());
            		
            otherlv_3=(Token)match(input,16,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getConditionalAccess().getEqualsSignKeyword_3());
            		
            // InternalScheme.g:486:3: ( (lv_at_4_0= ruleAtom ) )
            // InternalScheme.g:487:4: (lv_at_4_0= ruleAtom )
            {
            // InternalScheme.g:487:4: (lv_at_4_0= ruleAtom )
            // InternalScheme.g:488:5: lv_at_4_0= ruleAtom
            {

            					newCompositeNode(grammarAccess.getConditionalAccess().getAtAtomParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_13);
            lv_at_4_0=ruleAtom();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConditionalRule());
            					}
            					add(
            						current,
            						"at",
            						lv_at_4_0,
            						"pucrs.lp.scheme.Scheme.Atom");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalScheme.g:505:3: ( (lv_value2_5_0= RULE_INT ) )
            // InternalScheme.g:506:4: (lv_value2_5_0= RULE_INT )
            {
            // InternalScheme.g:506:4: (lv_value2_5_0= RULE_INT )
            // InternalScheme.g:507:5: lv_value2_5_0= RULE_INT
            {
            lv_value2_5_0=(Token)match(input,RULE_INT,FOLLOW_9); 

            					newLeafNode(lv_value2_5_0, grammarAccess.getConditionalAccess().getValue2INTTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConditionalRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value2",
            						lv_value2_5_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_6=(Token)match(input,13,FOLLOW_13); 

            			newLeafNode(otherlv_6, grammarAccess.getConditionalAccess().getRightParenthesisKeyword_6());
            		
            // InternalScheme.g:527:3: ( (lv_value3_7_0= RULE_INT ) )
            // InternalScheme.g:528:4: (lv_value3_7_0= RULE_INT )
            {
            // InternalScheme.g:528:4: (lv_value3_7_0= RULE_INT )
            // InternalScheme.g:529:5: lv_value3_7_0= RULE_INT
            {
            lv_value3_7_0=(Token)match(input,RULE_INT,FOLLOW_14); 

            					newLeafNode(lv_value3_7_0, grammarAccess.getConditionalAccess().getValue3INTTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConditionalRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value3",
            						lv_value3_7_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalScheme.g:545:3: (otherlv_8= ')' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==13) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalScheme.g:546:4: otherlv_8= ')'
                    {
                    otherlv_8=(Token)match(input,13,FOLLOW_2); 

                    				newLeafNode(otherlv_8, grammarAccess.getConditionalAccess().getRightParenthesisKeyword_8());
                    			

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
    // $ANTLR end "ruleConditional"


    // $ANTLR start "entryRuleParameter"
    // InternalScheme.g:555:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalScheme.g:555:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalScheme.g:556:2: iv_ruleParameter= ruleParameter EOF
            {
             newCompositeNode(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameter=ruleParameter();

            state._fsp--;

             current =iv_ruleParameter; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // InternalScheme.g:562:1: ruleParameter returns [EObject current=null] : (otherlv_0= '(' ( (lv_n_1_0= RULE_ID ) ) ( (lv_atom_2_0= ruleAtom ) ) otherlv_3= ')' ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_n_1_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_atom_2_0 = null;



        	enterRule();

        try {
            // InternalScheme.g:568:2: ( (otherlv_0= '(' ( (lv_n_1_0= RULE_ID ) ) ( (lv_atom_2_0= ruleAtom ) ) otherlv_3= ')' ) )
            // InternalScheme.g:569:2: (otherlv_0= '(' ( (lv_n_1_0= RULE_ID ) ) ( (lv_atom_2_0= ruleAtom ) ) otherlv_3= ')' )
            {
            // InternalScheme.g:569:2: (otherlv_0= '(' ( (lv_n_1_0= RULE_ID ) ) ( (lv_atom_2_0= ruleAtom ) ) otherlv_3= ')' )
            // InternalScheme.g:570:3: otherlv_0= '(' ( (lv_n_1_0= RULE_ID ) ) ( (lv_atom_2_0= ruleAtom ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getParameterAccess().getLeftParenthesisKeyword_0());
            		
            // InternalScheme.g:574:3: ( (lv_n_1_0= RULE_ID ) )
            // InternalScheme.g:575:4: (lv_n_1_0= RULE_ID )
            {
            // InternalScheme.g:575:4: (lv_n_1_0= RULE_ID )
            // InternalScheme.g:576:5: lv_n_1_0= RULE_ID
            {
            lv_n_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_n_1_0, grammarAccess.getParameterAccess().getNIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getParameterRule());
            					}
            					setWithLastConsumed(
            						current,
            						"n",
            						lv_n_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalScheme.g:592:3: ( (lv_atom_2_0= ruleAtom ) )
            // InternalScheme.g:593:4: (lv_atom_2_0= ruleAtom )
            {
            // InternalScheme.g:593:4: (lv_atom_2_0= ruleAtom )
            // InternalScheme.g:594:5: lv_atom_2_0= ruleAtom
            {

            					newCompositeNode(grammarAccess.getParameterAccess().getAtomAtomParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_9);
            lv_atom_2_0=ruleAtom();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParameterRule());
            					}
            					set(
            						current,
            						"atom",
            						lv_atom_2_0,
            						"pucrs.lp.scheme.Scheme.Atom");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getParameterAccess().getRightParenthesisKeyword_3());
            		

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
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleAtom"
    // InternalScheme.g:619:1: entryRuleAtom returns [String current=null] : iv_ruleAtom= ruleAtom EOF ;
    public final String entryRuleAtom() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAtom = null;


        try {
            // InternalScheme.g:619:44: (iv_ruleAtom= ruleAtom EOF )
            // InternalScheme.g:620:2: iv_ruleAtom= ruleAtom EOF
            {
             newCompositeNode(grammarAccess.getAtomRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAtom=ruleAtom();

            state._fsp--;

             current =iv_ruleAtom.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAtom"


    // $ANTLR start "ruleAtom"
    // InternalScheme.g:626:1: ruleAtom returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleAtom() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalScheme.g:632:2: ( (this_ID_0= RULE_ID | this_INT_1= RULE_INT ) )
            // InternalScheme.g:633:2: (this_ID_0= RULE_ID | this_INT_1= RULE_INT )
            {
            // InternalScheme.g:633:2: (this_ID_0= RULE_ID | this_INT_1= RULE_INT )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_INT) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalScheme.g:634:3: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_0);
                    		

                    			newLeafNode(this_ID_0, grammarAccess.getAtomAccess().getIDTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalScheme.g:642:3: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

                    			current.merge(this_INT_1);
                    		

                    			newLeafNode(this_INT_1, grammarAccess.getAtomAccess().getINTTerminalRuleCall_1());
                    		

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
    // $ANTLR end "ruleAtom"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001012L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001050L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000003050L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000001040L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000040L});

}