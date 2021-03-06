/*
 * generated by Xtext 2.17.0
 */
grammar InternalScheme;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package pucrs.lp.scheme.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
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

}

@parser::members {

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

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleModel
entryRuleModel returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getModelRule()); }
	iv_ruleModel=ruleModel
	{ $current=$iv_ruleModel.current; }
	EOF;

// Rule Model
ruleModel returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getModelAccess().getCommandsCommandParserRuleCall_0());
			}
			lv_commands_0_0=ruleCommand
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getModelRule());
				}
				add(
					$current,
					"commands",
					lv_commands_0_0,
					"pucrs.lp.scheme.Scheme.Command");
				afterParserOrEnumRuleCall();
			}
		)
	)*
;

// Entry rule entryRuleCommand
entryRuleCommand returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCommandRule()); }
	iv_ruleCommand=ruleCommand
	{ $current=$iv_ruleCommand.current; }
	EOF;

// Rule Command
ruleCommand returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getCommandAccess().getOperationParserRuleCall_0());
		}
		this_Operation_0=ruleOperation
		{
			$current = $this_Operation_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getCommandAccess().getDefineParserRuleCall_1());
		}
		this_Define_1=ruleDefine
		{
			$current = $this_Define_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getCommandAccess().getParameterParserRuleCall_2());
		}
		this_Parameter_2=ruleParameter
		{
			$current = $this_Parameter_2.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getCommandAccess().getConditionalParserRuleCall_3());
		}
		this_Conditional_3=ruleConditional
		{
			$current = $this_Conditional_3.current;
			afterParserOrEnumRuleCall();
		}
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getCommandAccess().getAtomAtomParserRuleCall_4_0());
				}
				lv_atom_4_0=ruleAtom
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getCommandRule());
					}
					set(
						$current,
						"atom",
						lv_atom_4_0,
						"pucrs.lp.scheme.Scheme.Atom");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleOperation
entryRuleOperation returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getOperationRule()); }
	iv_ruleOperation=ruleOperation
	{ $current=$iv_ruleOperation.current; }
	EOF;

// Rule Operation
ruleOperation returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='('
		{
			newLeafNode(otherlv_0, grammarAccess.getOperationAccess().getLeftParenthesisKeyword_0());
		}
		(
			(
				lv_operator_1_0=RULE_OPERATOR
				{
					newLeafNode(lv_operator_1_0, grammarAccess.getOperationAccess().getOperatorOperatorTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getOperationRule());
					}
					addWithLastConsumed(
						$current,
						"operator",
						lv_operator_1_0,
						"pucrs.lp.scheme.Scheme.Operator");
				}
			)
		)
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getOperationAccess().getSimpleOperationSimpleOperationParserRuleCall_2_0_0());
					}
					lv_simpleOperation_2_0=ruleSimpleOperation
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getOperationRule());
						}
						add(
							$current,
							"simpleOperation",
							lv_simpleOperation_2_0,
							"pucrs.lp.scheme.Scheme.SimpleOperation");
						afterParserOrEnumRuleCall();
					}
				)
			)
			    |
			(
				(
					{
						newCompositeNode(grammarAccess.getOperationAccess().getAtom2AtomParserRuleCall_2_1_0());
					}
					lv_atom2_3_0=ruleAtom
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getOperationRule());
						}
						add(
							$current,
							"atom2",
							lv_atom2_3_0,
							"pucrs.lp.scheme.Scheme.Atom");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)+
		otherlv_4=')'
		{
			newLeafNode(otherlv_4, grammarAccess.getOperationAccess().getRightParenthesisKeyword_3());
		}
	)
;

// Entry rule entryRuleSimpleOperation
entryRuleSimpleOperation returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSimpleOperationRule()); }
	iv_ruleSimpleOperation=ruleSimpleOperation
	{ $current=$iv_ruleSimpleOperation.current; }
	EOF;

// Rule SimpleOperation
ruleSimpleOperation returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='('
		{
			newLeafNode(otherlv_0, grammarAccess.getSimpleOperationAccess().getLeftParenthesisKeyword_0());
		}
		(
			(
				lv_operator_1_0=RULE_OPERATOR
				{
					newLeafNode(lv_operator_1_0, grammarAccess.getSimpleOperationAccess().getOperatorOperatorTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getSimpleOperationRule());
					}
					addWithLastConsumed(
						$current,
						"operator",
						lv_operator_1_0,
						"pucrs.lp.scheme.Scheme.Operator");
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getSimpleOperationAccess().getValueAtomParserRuleCall_2_0());
				}
				lv_value_2_0=ruleAtom
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSimpleOperationRule());
					}
					add(
						$current,
						"value",
						lv_value_2_0,
						"pucrs.lp.scheme.Scheme.Atom");
					afterParserOrEnumRuleCall();
				}
			)
		)+
		otherlv_3=')'
		{
			newLeafNode(otherlv_3, grammarAccess.getSimpleOperationAccess().getRightParenthesisKeyword_3());
		}
	)
;

// Entry rule entryRuleDefine
entryRuleDefine returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDefineRule()); }
	iv_ruleDefine=ruleDefine
	{ $current=$iv_ruleDefine.current; }
	EOF;

// Rule Define
ruleDefine returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='('
		{
			newLeafNode(otherlv_0, grammarAccess.getDefineAccess().getLeftParenthesisKeyword_0());
		}
		otherlv_1='define'
		{
			newLeafNode(otherlv_1, grammarAccess.getDefineAccess().getDefineKeyword_1());
		}
		(
			(
				(
					lv_name1_2_0=RULE_ID
					{
						newLeafNode(lv_name1_2_0, grammarAccess.getDefineAccess().getName1IDTerminalRuleCall_2_0_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getDefineRule());
						}
						setWithLastConsumed(
							$current,
							"name1",
							lv_name1_2_0,
							"org.eclipse.xtext.common.Terminals.ID");
					}
				)
			)
			    |
			(
				(
					{
						newCompositeNode(grammarAccess.getDefineAccess().getParametersParameterParserRuleCall_2_1_0());
					}
					lv_parameters_3_0=ruleParameter
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getDefineRule());
						}
						add(
							$current,
							"parameters",
							lv_parameters_3_0,
							"pucrs.lp.scheme.Scheme.Parameter");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getDefineAccess().getCommandCommandParserRuleCall_3_0());
				}
				lv_command_4_0=ruleCommand
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDefineRule());
					}
					set(
						$current,
						"command",
						lv_command_4_0,
						"pucrs.lp.scheme.Scheme.Command");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5=')'
		{
			newLeafNode(otherlv_5, grammarAccess.getDefineAccess().getRightParenthesisKeyword_4());
		}
	)
;

// Entry rule entryRuleConditional
entryRuleConditional returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getConditionalRule()); }
	iv_ruleConditional=ruleConditional
	{ $current=$iv_ruleConditional.current; }
	EOF;

// Rule Conditional
ruleConditional returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='('
		{
			newLeafNode(otherlv_0, grammarAccess.getConditionalAccess().getLeftParenthesisKeyword_0());
		}
		otherlv_1='if'
		{
			newLeafNode(otherlv_1, grammarAccess.getConditionalAccess().getIfKeyword_1());
		}
		otherlv_2='('
		{
			newLeafNode(otherlv_2, grammarAccess.getConditionalAccess().getLeftParenthesisKeyword_2());
		}
		otherlv_3='='
		{
			newLeafNode(otherlv_3, grammarAccess.getConditionalAccess().getEqualsSignKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getConditionalAccess().getAtAtomParserRuleCall_4_0());
				}
				lv_at_4_0=ruleAtom
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getConditionalRule());
					}
					add(
						$current,
						"at",
						lv_at_4_0,
						"pucrs.lp.scheme.Scheme.Atom");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				lv_value2_5_0=RULE_INT
				{
					newLeafNode(lv_value2_5_0, grammarAccess.getConditionalAccess().getValue2INTTerminalRuleCall_5_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getConditionalRule());
					}
					setWithLastConsumed(
						$current,
						"value2",
						lv_value2_5_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
		otherlv_6=')'
		{
			newLeafNode(otherlv_6, grammarAccess.getConditionalAccess().getRightParenthesisKeyword_6());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getConditionalAccess().getCommandsCommandParserRuleCall_7_0());
				}
				lv_commands_7_0=ruleCommand
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getConditionalRule());
					}
					add(
						$current,
						"commands",
						lv_commands_7_0,
						"pucrs.lp.scheme.Scheme.Command");
					afterParserOrEnumRuleCall();
				}
			)
		)+
		(
			otherlv_8=')'
			{
				newLeafNode(otherlv_8, grammarAccess.getConditionalAccess().getRightParenthesisKeyword_8());
			}
		)?
	)
;

// Entry rule entryRuleParameter
entryRuleParameter returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getParameterRule()); }
	iv_ruleParameter=ruleParameter
	{ $current=$iv_ruleParameter.current; }
	EOF;

// Rule Parameter
ruleParameter returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='('
		{
			newLeafNode(otherlv_0, grammarAccess.getParameterAccess().getLeftParenthesisKeyword_0());
		}
		(
			(
				lv_n_1_0=RULE_ID
				{
					newLeafNode(lv_n_1_0, grammarAccess.getParameterAccess().getNIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getParameterRule());
					}
					setWithLastConsumed(
						$current,
						"n",
						lv_n_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getParameterAccess().getAtomAtomParserRuleCall_2_0());
				}
				lv_atom_2_0=ruleAtom
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getParameterRule());
					}
					set(
						$current,
						"atom",
						lv_atom_2_0,
						"pucrs.lp.scheme.Scheme.Atom");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3=')'
		{
			newLeafNode(otherlv_3, grammarAccess.getParameterAccess().getRightParenthesisKeyword_3());
		}
	)
;

// Entry rule entryRuleAtom
entryRuleAtom returns [String current=null]:
	{ newCompositeNode(grammarAccess.getAtomRule()); }
	iv_ruleAtom=ruleAtom
	{ $current=$iv_ruleAtom.current.getText(); }
	EOF;

// Rule Atom
ruleAtom returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_ID_0=RULE_ID
		{
			$current.merge(this_ID_0);
		}
		{
			newLeafNode(this_ID_0, grammarAccess.getAtomAccess().getIDTerminalRuleCall_0());
		}
		    |
		this_INT_1=RULE_INT
		{
			$current.merge(this_INT_1);
		}
		{
			newLeafNode(this_INT_1, grammarAccess.getAtomAccess().getINTTerminalRuleCall_1());
		}
	)
;

RULE_OPERATOR : ('+'|'-'|'/'|'*');

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
