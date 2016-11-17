package sar.drone.generator

import org.eclipse.xtend.lib.macro.AbstractClassProcessor
import java.util.List
import org.eclipse.xtend.lib.macro.declaration.ClassDeclaration
import org.eclipse.xtend.lib.macro.CodeGenerationContext

class ExternalizedProcessor extends AbstractClassProcessor {
	
      override doGenerateCode(List<? extends ClassDeclaration> annotatedSourceElements, extension CodeGenerationContext context) {
        for (clazz : annotatedSourceElements) {
          val filePath = clazz.compilationUnit.filePath
          val file = filePath.targetFolder.append(clazz.qualifiedName.replace('.', '/') + ".properties")
          file.contents = '''
            «FOR field : clazz.declaredFields»
              «field.simpleName» = «field.toString»
            «ENDFOR»
          '''
        }
      }

}