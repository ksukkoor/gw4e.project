/*
 * generated by Xtext 2.12.0
 */
package gw4e.eclipse.dsl.ide

import com.google.inject.Guice
import gw4e.eclipse.dsl.DSLPoliciesRuntimeModule
import gw4e.eclipse.dsl.DSLPoliciesStandaloneSetup
import org.eclipse.xtext.util.Modules2

/**
 * Initialization support for running Xtext languages as language servers.
 */
class DSLPoliciesIdeSetup extends DSLPoliciesStandaloneSetup {

	override createInjector() {
		Guice.createInjector(Modules2.mixin(new DSLPoliciesRuntimeModule, new DSLPoliciesIdeModule))
	}
	
}
