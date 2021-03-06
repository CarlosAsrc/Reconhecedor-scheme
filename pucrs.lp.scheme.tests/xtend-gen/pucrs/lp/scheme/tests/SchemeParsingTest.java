/**
 * generated by Xtext 2.15.0
 */
package pucrs.lp.scheme.tests;

import com.google.inject.Inject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.extensions.InjectionExtension;
import org.eclipse.xtext.testing.util.ParseHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import pucrs.lp.scheme.scheme.Model;
import pucrs.lp.scheme.tests.SchemeInjectorProvider;

@ExtendWith(InjectionExtension.class)
@InjectWith(SchemeInjectorProvider.class)
@SuppressWarnings("all")
public class SchemeParsingTest {
  @Inject
  private ParseHelper<Model> parseHelper;
  
  /**
   * Alguns dos testes abaixo foram baseados em estudos e pesquisas feitas nos respectivos links:
   * 
   * 	Scheme - Expressions (https://www.cs.cmu.edu/Groups/AI/html/r4rs/r4rs_6.html);
   *  Using 'Define' in Scheme (https://stackoverflow.com/questions/15959319/using-define-in-scheme);
   *  Scheme (https://www.csc.lsu.edu/~gb/csc4101/Slides/Scheme.pdf);
   *  Scheme Basics (https://courses.cs.washington.edu/courses/cse341/03wi/scheme/basics.html);
   */
  @Test
  public void loadModel() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("10");
      _builder.newLine();
      final Model result = this.parseHelper.parse(_builder);
      Assertions.assertNotNull(result);
      Assertions.assertTrue(result.eResource().getErrors().isEmpty());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void loadModel1() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("(- n 1)");
      _builder.newLine();
      final Model result = this.parseHelper.parse(_builder);
      Assertions.assertNotNull(result);
      Assertions.assertTrue(result.eResource().getErrors().isEmpty());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void operacaoAritmeticaTest() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("(+ 2 3)");
      _builder.newLine();
      final Model result = this.parseHelper.parse(_builder);
      Assertions.assertNotNull(result);
      final EList<Resource.Diagnostic> errors = result.eResource().getErrors();
      boolean _isEmpty = errors.isEmpty();
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("Unexpected errors: ");
      String _join = IterableExtensions.join(errors, ", ");
      _builder_1.append(_join);
      Assertions.assertTrue(_isEmpty, _builder_1.toString());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void defineTest() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("(define x 10)");
      _builder.newLine();
      final Model result = this.parseHelper.parse(_builder);
      Assertions.assertNotNull(result);
      final EList<Resource.Diagnostic> errors = result.eResource().getErrors();
      boolean _isEmpty = errors.isEmpty();
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("Unexpected errors: ");
      String _join = IterableExtensions.join(errors, ", ");
      _builder_1.append(_join);
      Assertions.assertTrue(_isEmpty, _builder_1.toString());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void defineComParametroTest() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("(define (f x)");
      _builder.newLine();
      _builder.append("  ");
      _builder.append("(+ x 1))");
      _builder.newLine();
      final Model result = this.parseHelper.parse(_builder);
      Assertions.assertNotNull(result);
      final EList<Resource.Diagnostic> errors = result.eResource().getErrors();
      boolean _isEmpty = errors.isEmpty();
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("Unexpected errors: ");
      String _join = IterableExtensions.join(errors, ", ");
      _builder_1.append(_join);
      Assertions.assertTrue(_isEmpty, _builder_1.toString());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void condicionalTest() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("(if (= 1 2) ");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("1 ");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("0");
      _builder.newLine();
      _builder.append(")");
      _builder.newLine();
      final Model result = this.parseHelper.parse(_builder);
      Assertions.assertNotNull(result);
      final EList<Resource.Diagnostic> errors = result.eResource().getErrors();
      boolean _isEmpty = errors.isEmpty();
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("Unexpected errors: ");
      String _join = IterableExtensions.join(errors, ", ");
      _builder_1.append(_join);
      Assertions.assertTrue(_isEmpty, _builder_1.toString());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void condicionalAninhadoTest() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("(if (= 1 2) ");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("1 ");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("(if (= 3 3) ");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("11 ");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("00");
      _builder.newLine();
      _builder.append("\t");
      _builder.append(")");
      _builder.newLine();
      _builder.append(")");
      _builder.newLine();
      final Model result = this.parseHelper.parse(_builder);
      Assertions.assertNotNull(result);
      final EList<Resource.Diagnostic> errors = result.eResource().getErrors();
      boolean _isEmpty = errors.isEmpty();
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("Unexpected errors: ");
      String _join = IterableExtensions.join(errors, ", ");
      _builder_1.append(_join);
      Assertions.assertTrue(_isEmpty, _builder_1.toString());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
