/*
 * generated by Xtext 2.15.0
 */
grammar InternalScheme;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package pucrs.lp.scheme.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
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

}
@parser::members {
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
}

// Entry rule entryRuleModel
entryRuleModel
:
{ before(grammarAccess.getModelRule()); }
	 ruleModel
{ after(grammarAccess.getModelRule()); } 
	 EOF 
;

// Rule Model
ruleModel 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getModelAccess().getCommandsAssignment()); }
		(rule__Model__CommandsAssignment)*
		{ after(grammarAccess.getModelAccess().getCommandsAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleCommand
entryRuleCommand
:
{ before(grammarAccess.getCommandRule()); }
	 ruleCommand
{ after(grammarAccess.getCommandRule()); } 
	 EOF 
;

// Rule Command
ruleCommand 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getCommandAccess().getOperationParserRuleCall()); }
		ruleOperation
		{ after(grammarAccess.getCommandAccess().getOperationParserRuleCall()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleOperation
entryRuleOperation
:
{ before(grammarAccess.getOperationRule()); }
	 ruleOperation
{ after(grammarAccess.getOperationRule()); } 
	 EOF 
;

// Rule Operation
ruleOperation 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getOperationAccess().getGroup()); }
		(rule__Operation__Group__0)
		{ after(grammarAccess.getOperationAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Operation__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Operation__Group__0__Impl
	rule__Operation__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Operation__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOperationAccess().getLeftParenthesisKeyword_0()); }
	'('
	{ after(grammarAccess.getOperationAccess().getLeftParenthesisKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Operation__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Operation__Group__1__Impl
	rule__Operation__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Operation__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOperationAccess().getOperatorAssignment_1()); }
	(rule__Operation__OperatorAssignment_1)
	{ after(grammarAccess.getOperationAccess().getOperatorAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Operation__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Operation__Group__2__Impl
	rule__Operation__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Operation__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOperationAccess().getValueAssignment_2()); }
	(rule__Operation__ValueAssignment_2)
	{ after(grammarAccess.getOperationAccess().getValueAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Operation__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Operation__Group__3__Impl
	rule__Operation__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Operation__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOperationAccess().getValue2Assignment_3()); }
	(rule__Operation__Value2Assignment_3)
	{ after(grammarAccess.getOperationAccess().getValue2Assignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Operation__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Operation__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Operation__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOperationAccess().getRightParenthesisKeyword_4()); }
	')'
	{ after(grammarAccess.getOperationAccess().getRightParenthesisKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Model__CommandsAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getModelAccess().getCommandsCommandParserRuleCall_0()); }
		ruleCommand
		{ after(grammarAccess.getModelAccess().getCommandsCommandParserRuleCall_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Operation__OperatorAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getOperationAccess().getOperatorOperatorTerminalRuleCall_1_0()); }
		RULE_OPERATOR
		{ after(grammarAccess.getOperationAccess().getOperatorOperatorTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Operation__ValueAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getOperationAccess().getValueINTTerminalRuleCall_2_0()); }
		RULE_INT
		{ after(grammarAccess.getOperationAccess().getValueINTTerminalRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Operation__Value2Assignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getOperationAccess().getValue2INTTerminalRuleCall_3_0()); }
		RULE_INT
		{ after(grammarAccess.getOperationAccess().getValue2INTTerminalRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

RULE_OPERATOR : ('+'|'-'|'/'|'*');

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;