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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_OPERATOR", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'('", "')'"
    };
    public static final int RULE_ID=6;
    public static final int RULE_WS=10;
    public static final int RULE_STRING=7;
    public static final int RULE_ANY_OTHER=11;
    public static final int RULE_SL_COMMENT=9;
    public static final int RULE_INT=5;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int EOF=-1;
    public static final int RULE_OPERATOR=4;

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

                if ( (LA1_0==12) ) {
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
    // InternalScheme.g:107:1: ruleCommand returns [EObject current=null] : this_Operation_0= ruleOperation ;
    public final EObject ruleCommand() throws RecognitionException {
        EObject current = null;

        EObject this_Operation_0 = null;



        	enterRule();

        try {
            // InternalScheme.g:113:2: (this_Operation_0= ruleOperation )
            // InternalScheme.g:114:2: this_Operation_0= ruleOperation
            {

            		newCompositeNode(grammarAccess.getCommandAccess().getOperationParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_Operation_0=ruleOperation();

            state._fsp--;


            		current = this_Operation_0;
            		afterParserOrEnumRuleCall();
            	

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
    // InternalScheme.g:125:1: entryRuleOperation returns [EObject current=null] : iv_ruleOperation= ruleOperation EOF ;
    public final EObject entryRuleOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperation = null;


        try {
            // InternalScheme.g:125:50: (iv_ruleOperation= ruleOperation EOF )
            // InternalScheme.g:126:2: iv_ruleOperation= ruleOperation EOF
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
    // InternalScheme.g:132:1: ruleOperation returns [EObject current=null] : (otherlv_0= '(' ( (lv_operator_1_0= RULE_OPERATOR ) ) ( (lv_value_2_0= RULE_INT ) ) ( (lv_value2_3_0= RULE_INT ) ) otherlv_4= ')' ) ;
    public final EObject ruleOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_operator_1_0=null;
        Token lv_value_2_0=null;
        Token lv_value2_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalScheme.g:138:2: ( (otherlv_0= '(' ( (lv_operator_1_0= RULE_OPERATOR ) ) ( (lv_value_2_0= RULE_INT ) ) ( (lv_value2_3_0= RULE_INT ) ) otherlv_4= ')' ) )
            // InternalScheme.g:139:2: (otherlv_0= '(' ( (lv_operator_1_0= RULE_OPERATOR ) ) ( (lv_value_2_0= RULE_INT ) ) ( (lv_value2_3_0= RULE_INT ) ) otherlv_4= ')' )
            {
            // InternalScheme.g:139:2: (otherlv_0= '(' ( (lv_operator_1_0= RULE_OPERATOR ) ) ( (lv_value_2_0= RULE_INT ) ) ( (lv_value2_3_0= RULE_INT ) ) otherlv_4= ')' )
            // InternalScheme.g:140:3: otherlv_0= '(' ( (lv_operator_1_0= RULE_OPERATOR ) ) ( (lv_value_2_0= RULE_INT ) ) ( (lv_value2_3_0= RULE_INT ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getOperationAccess().getLeftParenthesisKeyword_0());
            		
            // InternalScheme.g:144:3: ( (lv_operator_1_0= RULE_OPERATOR ) )
            // InternalScheme.g:145:4: (lv_operator_1_0= RULE_OPERATOR )
            {
            // InternalScheme.g:145:4: (lv_operator_1_0= RULE_OPERATOR )
            // InternalScheme.g:146:5: lv_operator_1_0= RULE_OPERATOR
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

            // InternalScheme.g:162:3: ( (lv_value_2_0= RULE_INT ) )
            // InternalScheme.g:163:4: (lv_value_2_0= RULE_INT )
            {
            // InternalScheme.g:163:4: (lv_value_2_0= RULE_INT )
            // InternalScheme.g:164:5: lv_value_2_0= RULE_INT
            {
            lv_value_2_0=(Token)match(input,RULE_INT,FOLLOW_5); 

            					newLeafNode(lv_value_2_0, grammarAccess.getOperationAccess().getValueINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOperationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalScheme.g:180:3: ( (lv_value2_3_0= RULE_INT ) )
            // InternalScheme.g:181:4: (lv_value2_3_0= RULE_INT )
            {
            // InternalScheme.g:181:4: (lv_value2_3_0= RULE_INT )
            // InternalScheme.g:182:5: lv_value2_3_0= RULE_INT
            {
            lv_value2_3_0=(Token)match(input,RULE_INT,FOLLOW_6); 

            					newLeafNode(lv_value2_3_0, grammarAccess.getOperationAccess().getValue2INTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOperationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value2",
            						lv_value2_3_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getOperationAccess().getRightParenthesisKeyword_4());
            		

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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});

}