/*
 * generated by Xtext 2.17.0
 */
package pucrs.lp.scheme.ui.tests;

import com.google.inject.Injector;
import org.eclipse.xtext.testing.IInjectorProvider;
import pucrs.lp.scheme.ui.internal.SchemeActivator;

public class SchemeUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return SchemeActivator.getInstance().getInjector("pucrs.lp.scheme.Scheme");
	}

}
