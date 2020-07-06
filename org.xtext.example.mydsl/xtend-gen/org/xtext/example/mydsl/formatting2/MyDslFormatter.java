/**
 * generated by Xtext 2.21.0
 */
package org.xtext.example.mydsl.formatting2;

import com.google.inject.Inject;
import java.util.Arrays;
import musicSheetDsl.Bracket;
import musicSheetDsl.Composition;
import musicSheetDsl.Staff;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.formatting2.AbstractFormatter2;
import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.xbase.lib.Extension;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;

@SuppressWarnings("all")
public class MyDslFormatter extends AbstractFormatter2 {
  @Inject
  @Extension
  private MyDslGrammarAccess _myDslGrammarAccess;
  
  protected void _format(final Composition composition, @Extension final IFormattableDocument document) {
    EList<Bracket> _bracket = composition.getBracket();
    for (final Bracket bracket : _bracket) {
      document.<Bracket>format(bracket);
    }
    EList<Staff> _staff = composition.getStaff();
    for (final Staff staff : _staff) {
      document.<Staff>format(staff);
    }
  }
  
  protected void _format(final Bracket bracket, @Extension final IFormattableDocument document) {
    EList<Staff> _staves = bracket.getStaves();
    for (final Staff staff : _staves) {
      document.<Staff>format(staff);
    }
  }
  
  public void format(final Object bracket, final IFormattableDocument document) {
    if (bracket instanceof XtextResource) {
      _format((XtextResource)bracket, document);
      return;
    } else if (bracket instanceof Bracket) {
      _format((Bracket)bracket, document);
      return;
    } else if (bracket instanceof Composition) {
      _format((Composition)bracket, document);
      return;
    } else if (bracket instanceof EObject) {
      _format((EObject)bracket, document);
      return;
    } else if (bracket == null) {
      _format((Void)null, document);
      return;
    } else if (bracket != null) {
      _format(bracket, document);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(bracket, document).toString());
    }
  }
}
