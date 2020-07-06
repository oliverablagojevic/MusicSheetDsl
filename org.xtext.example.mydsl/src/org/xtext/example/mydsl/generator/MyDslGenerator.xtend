/*
 * generated by Xtext 2.21.0
 */
package org.xtext.example.mydsl.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import musicSheetDsl.Composition

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class MyDslGenerator extends AbstractGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
 	var composition = resource.allContents.toIterable.filter(Composition).get(0);
 	var dsl = new CompositionDsl(composition);
 	fsa.generateFile(composition.name + ".musicxml", dsl.compositionToXml);
	}
}