package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

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
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'curly'", "'square'", "'whole'", "'half'", "'quarter'", "'eighth'", "'sixteenth'", "'thirtysecond'", "'sixtyfourth'", "'sharp'", "'flat'", "'natural'", "'left'", "'right'", "'c'", "'d'", "'e'", "'f'", "'g'", "'a'", "'b'", "'slide'", "'glissando'", "'aciaccatura'", "'appoggiatura'", "'turn'", "'mordent'", "'trill'", "'detached'", "'legato'", "'staccato'", "'portato'", "'tenuto'", "'marcato'", "'violin'", "'bass'", "'Composition'", "'['", "']'", "'name:'", "'author:'", "'instrument:'", "'tonality:'", "'soundTempo:'", "','", "'Bracket'", "'Staff'", "'Clef:'", "'timeSignature:'", "'elements'", "'-'", "'beat'", "'beatType'", "'rest:'", "'accidental:'", "'repetition:'", "'note:'", "'lyrics:'", "'duration:'", "'position:'", "'dynamic:'", "'ornament:'", "'articulation:'", "'fermata'", "'dot'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__74=74;
    public static final int T__31=31;
    public static final int T__75=75;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }


    	private MyDslGrammarAccess grammarAccess;

    	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleComposition"
    // InternalMyDsl.g:53:1: entryRuleComposition : ruleComposition EOF ;
    public final void entryRuleComposition() throws RecognitionException {
        try {
            // InternalMyDsl.g:54:1: ( ruleComposition EOF )
            // InternalMyDsl.g:55:1: ruleComposition EOF
            {
             before(grammarAccess.getCompositionRule()); 
            pushFollow(FOLLOW_1);
            ruleComposition();

            state._fsp--;

             after(grammarAccess.getCompositionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleComposition"


    // $ANTLR start "ruleComposition"
    // InternalMyDsl.g:62:1: ruleComposition : ( ( rule__Composition__Group__0 ) ) ;
    public final void ruleComposition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:66:2: ( ( ( rule__Composition__Group__0 ) ) )
            // InternalMyDsl.g:67:2: ( ( rule__Composition__Group__0 ) )
            {
            // InternalMyDsl.g:67:2: ( ( rule__Composition__Group__0 ) )
            // InternalMyDsl.g:68:3: ( rule__Composition__Group__0 )
            {
             before(grammarAccess.getCompositionAccess().getGroup()); 
            // InternalMyDsl.g:69:3: ( rule__Composition__Group__0 )
            // InternalMyDsl.g:69:4: rule__Composition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Composition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCompositionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComposition"


    // $ANTLR start "entryRuleStaffElement"
    // InternalMyDsl.g:78:1: entryRuleStaffElement : ruleStaffElement EOF ;
    public final void entryRuleStaffElement() throws RecognitionException {
        try {
            // InternalMyDsl.g:79:1: ( ruleStaffElement EOF )
            // InternalMyDsl.g:80:1: ruleStaffElement EOF
            {
             before(grammarAccess.getStaffElementRule()); 
            pushFollow(FOLLOW_1);
            ruleStaffElement();

            state._fsp--;

             after(grammarAccess.getStaffElementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStaffElement"


    // $ANTLR start "ruleStaffElement"
    // InternalMyDsl.g:87:1: ruleStaffElement : ( ( rule__StaffElement__Alternatives ) ) ;
    public final void ruleStaffElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:91:2: ( ( ( rule__StaffElement__Alternatives ) ) )
            // InternalMyDsl.g:92:2: ( ( rule__StaffElement__Alternatives ) )
            {
            // InternalMyDsl.g:92:2: ( ( rule__StaffElement__Alternatives ) )
            // InternalMyDsl.g:93:3: ( rule__StaffElement__Alternatives )
            {
             before(grammarAccess.getStaffElementAccess().getAlternatives()); 
            // InternalMyDsl.g:94:3: ( rule__StaffElement__Alternatives )
            // InternalMyDsl.g:94:4: rule__StaffElement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__StaffElement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getStaffElementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStaffElement"


    // $ANTLR start "entryRuleBracket"
    // InternalMyDsl.g:103:1: entryRuleBracket : ruleBracket EOF ;
    public final void entryRuleBracket() throws RecognitionException {
        try {
            // InternalMyDsl.g:104:1: ( ruleBracket EOF )
            // InternalMyDsl.g:105:1: ruleBracket EOF
            {
             before(grammarAccess.getBracketRule()); 
            pushFollow(FOLLOW_1);
            ruleBracket();

            state._fsp--;

             after(grammarAccess.getBracketRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBracket"


    // $ANTLR start "ruleBracket"
    // InternalMyDsl.g:112:1: ruleBracket : ( ( rule__Bracket__Group__0 ) ) ;
    public final void ruleBracket() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:116:2: ( ( ( rule__Bracket__Group__0 ) ) )
            // InternalMyDsl.g:117:2: ( ( rule__Bracket__Group__0 ) )
            {
            // InternalMyDsl.g:117:2: ( ( rule__Bracket__Group__0 ) )
            // InternalMyDsl.g:118:3: ( rule__Bracket__Group__0 )
            {
             before(grammarAccess.getBracketAccess().getGroup()); 
            // InternalMyDsl.g:119:3: ( rule__Bracket__Group__0 )
            // InternalMyDsl.g:119:4: rule__Bracket__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Bracket__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBracketAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBracket"


    // $ANTLR start "entryRuleStaff"
    // InternalMyDsl.g:128:1: entryRuleStaff : ruleStaff EOF ;
    public final void entryRuleStaff() throws RecognitionException {
        try {
            // InternalMyDsl.g:129:1: ( ruleStaff EOF )
            // InternalMyDsl.g:130:1: ruleStaff EOF
            {
             before(grammarAccess.getStaffRule()); 
            pushFollow(FOLLOW_1);
            ruleStaff();

            state._fsp--;

             after(grammarAccess.getStaffRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStaff"


    // $ANTLR start "ruleStaff"
    // InternalMyDsl.g:137:1: ruleStaff : ( ( rule__Staff__Group__0 ) ) ;
    public final void ruleStaff() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:141:2: ( ( ( rule__Staff__Group__0 ) ) )
            // InternalMyDsl.g:142:2: ( ( rule__Staff__Group__0 ) )
            {
            // InternalMyDsl.g:142:2: ( ( rule__Staff__Group__0 ) )
            // InternalMyDsl.g:143:3: ( rule__Staff__Group__0 )
            {
             before(grammarAccess.getStaffAccess().getGroup()); 
            // InternalMyDsl.g:144:3: ( rule__Staff__Group__0 )
            // InternalMyDsl.g:144:4: rule__Staff__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Staff__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStaffAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStaff"


    // $ANTLR start "entryRuleEString"
    // InternalMyDsl.g:153:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalMyDsl.g:154:1: ( ruleEString EOF )
            // InternalMyDsl.g:155:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalMyDsl.g:162:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:166:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalMyDsl.g:167:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalMyDsl.g:167:2: ( ( rule__EString__Alternatives ) )
            // InternalMyDsl.g:168:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalMyDsl.g:169:3: ( rule__EString__Alternatives )
            // InternalMyDsl.g:169:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleEInt"
    // InternalMyDsl.g:178:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalMyDsl.g:179:1: ( ruleEInt EOF )
            // InternalMyDsl.g:180:1: ruleEInt EOF
            {
             before(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getEIntRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalMyDsl.g:187:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:191:2: ( ( ( rule__EInt__Group__0 ) ) )
            // InternalMyDsl.g:192:2: ( ( rule__EInt__Group__0 ) )
            {
            // InternalMyDsl.g:192:2: ( ( rule__EInt__Group__0 ) )
            // InternalMyDsl.g:193:3: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // InternalMyDsl.g:194:3: ( rule__EInt__Group__0 )
            // InternalMyDsl.g:194:4: rule__EInt__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEIntAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleClef"
    // InternalMyDsl.g:203:1: entryRuleClef : ruleClef EOF ;
    public final void entryRuleClef() throws RecognitionException {
        try {
            // InternalMyDsl.g:204:1: ( ruleClef EOF )
            // InternalMyDsl.g:205:1: ruleClef EOF
            {
             before(grammarAccess.getClefRule()); 
            pushFollow(FOLLOW_1);
            ruleClef();

            state._fsp--;

             after(grammarAccess.getClefRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleClef"


    // $ANTLR start "ruleClef"
    // InternalMyDsl.g:212:1: ruleClef : ( ( rule__Clef__Group__0 ) ) ;
    public final void ruleClef() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:216:2: ( ( ( rule__Clef__Group__0 ) ) )
            // InternalMyDsl.g:217:2: ( ( rule__Clef__Group__0 ) )
            {
            // InternalMyDsl.g:217:2: ( ( rule__Clef__Group__0 ) )
            // InternalMyDsl.g:218:3: ( rule__Clef__Group__0 )
            {
             before(grammarAccess.getClefAccess().getGroup()); 
            // InternalMyDsl.g:219:3: ( rule__Clef__Group__0 )
            // InternalMyDsl.g:219:4: rule__Clef__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Clef__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getClefAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleClef"


    // $ANTLR start "entryRuleTimeSignature"
    // InternalMyDsl.g:228:1: entryRuleTimeSignature : ruleTimeSignature EOF ;
    public final void entryRuleTimeSignature() throws RecognitionException {
        try {
            // InternalMyDsl.g:229:1: ( ruleTimeSignature EOF )
            // InternalMyDsl.g:230:1: ruleTimeSignature EOF
            {
             before(grammarAccess.getTimeSignatureRule()); 
            pushFollow(FOLLOW_1);
            ruleTimeSignature();

            state._fsp--;

             after(grammarAccess.getTimeSignatureRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTimeSignature"


    // $ANTLR start "ruleTimeSignature"
    // InternalMyDsl.g:237:1: ruleTimeSignature : ( ( rule__TimeSignature__Group__0 ) ) ;
    public final void ruleTimeSignature() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:241:2: ( ( ( rule__TimeSignature__Group__0 ) ) )
            // InternalMyDsl.g:242:2: ( ( rule__TimeSignature__Group__0 ) )
            {
            // InternalMyDsl.g:242:2: ( ( rule__TimeSignature__Group__0 ) )
            // InternalMyDsl.g:243:3: ( rule__TimeSignature__Group__0 )
            {
             before(grammarAccess.getTimeSignatureAccess().getGroup()); 
            // InternalMyDsl.g:244:3: ( rule__TimeSignature__Group__0 )
            // InternalMyDsl.g:244:4: rule__TimeSignature__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TimeSignature__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTimeSignatureAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTimeSignature"


    // $ANTLR start "entryRuleRest"
    // InternalMyDsl.g:253:1: entryRuleRest : ruleRest EOF ;
    public final void entryRuleRest() throws RecognitionException {
        try {
            // InternalMyDsl.g:254:1: ( ruleRest EOF )
            // InternalMyDsl.g:255:1: ruleRest EOF
            {
             before(grammarAccess.getRestRule()); 
            pushFollow(FOLLOW_1);
            ruleRest();

            state._fsp--;

             after(grammarAccess.getRestRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRest"


    // $ANTLR start "ruleRest"
    // InternalMyDsl.g:262:1: ruleRest : ( ( rule__Rest__Group__0 ) ) ;
    public final void ruleRest() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:266:2: ( ( ( rule__Rest__Group__0 ) ) )
            // InternalMyDsl.g:267:2: ( ( rule__Rest__Group__0 ) )
            {
            // InternalMyDsl.g:267:2: ( ( rule__Rest__Group__0 ) )
            // InternalMyDsl.g:268:3: ( rule__Rest__Group__0 )
            {
             before(grammarAccess.getRestAccess().getGroup()); 
            // InternalMyDsl.g:269:3: ( rule__Rest__Group__0 )
            // InternalMyDsl.g:269:4: rule__Rest__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Rest__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRestAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRest"


    // $ANTLR start "entryRuleAccidental"
    // InternalMyDsl.g:278:1: entryRuleAccidental : ruleAccidental EOF ;
    public final void entryRuleAccidental() throws RecognitionException {
        try {
            // InternalMyDsl.g:279:1: ( ruleAccidental EOF )
            // InternalMyDsl.g:280:1: ruleAccidental EOF
            {
             before(grammarAccess.getAccidentalRule()); 
            pushFollow(FOLLOW_1);
            ruleAccidental();

            state._fsp--;

             after(grammarAccess.getAccidentalRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAccidental"


    // $ANTLR start "ruleAccidental"
    // InternalMyDsl.g:287:1: ruleAccidental : ( ( rule__Accidental__Group__0 ) ) ;
    public final void ruleAccidental() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:291:2: ( ( ( rule__Accidental__Group__0 ) ) )
            // InternalMyDsl.g:292:2: ( ( rule__Accidental__Group__0 ) )
            {
            // InternalMyDsl.g:292:2: ( ( rule__Accidental__Group__0 ) )
            // InternalMyDsl.g:293:3: ( rule__Accidental__Group__0 )
            {
             before(grammarAccess.getAccidentalAccess().getGroup()); 
            // InternalMyDsl.g:294:3: ( rule__Accidental__Group__0 )
            // InternalMyDsl.g:294:4: rule__Accidental__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Accidental__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAccidentalAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAccidental"


    // $ANTLR start "entryRuleRepetition"
    // InternalMyDsl.g:303:1: entryRuleRepetition : ruleRepetition EOF ;
    public final void entryRuleRepetition() throws RecognitionException {
        try {
            // InternalMyDsl.g:304:1: ( ruleRepetition EOF )
            // InternalMyDsl.g:305:1: ruleRepetition EOF
            {
             before(grammarAccess.getRepetitionRule()); 
            pushFollow(FOLLOW_1);
            ruleRepetition();

            state._fsp--;

             after(grammarAccess.getRepetitionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRepetition"


    // $ANTLR start "ruleRepetition"
    // InternalMyDsl.g:312:1: ruleRepetition : ( ( rule__Repetition__Group__0 ) ) ;
    public final void ruleRepetition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:316:2: ( ( ( rule__Repetition__Group__0 ) ) )
            // InternalMyDsl.g:317:2: ( ( rule__Repetition__Group__0 ) )
            {
            // InternalMyDsl.g:317:2: ( ( rule__Repetition__Group__0 ) )
            // InternalMyDsl.g:318:3: ( rule__Repetition__Group__0 )
            {
             before(grammarAccess.getRepetitionAccess().getGroup()); 
            // InternalMyDsl.g:319:3: ( rule__Repetition__Group__0 )
            // InternalMyDsl.g:319:4: rule__Repetition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Repetition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRepetitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRepetition"


    // $ANTLR start "entryRuleNote"
    // InternalMyDsl.g:328:1: entryRuleNote : ruleNote EOF ;
    public final void entryRuleNote() throws RecognitionException {
        try {
            // InternalMyDsl.g:329:1: ( ruleNote EOF )
            // InternalMyDsl.g:330:1: ruleNote EOF
            {
             before(grammarAccess.getNoteRule()); 
            pushFollow(FOLLOW_1);
            ruleNote();

            state._fsp--;

             after(grammarAccess.getNoteRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNote"


    // $ANTLR start "ruleNote"
    // InternalMyDsl.g:337:1: ruleNote : ( ( rule__Note__Group__0 ) ) ;
    public final void ruleNote() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:341:2: ( ( ( rule__Note__Group__0 ) ) )
            // InternalMyDsl.g:342:2: ( ( rule__Note__Group__0 ) )
            {
            // InternalMyDsl.g:342:2: ( ( rule__Note__Group__0 ) )
            // InternalMyDsl.g:343:3: ( rule__Note__Group__0 )
            {
             before(grammarAccess.getNoteAccess().getGroup()); 
            // InternalMyDsl.g:344:3: ( rule__Note__Group__0 )
            // InternalMyDsl.g:344:4: rule__Note__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Note__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNoteAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNote"


    // $ANTLR start "entryRuleOrnament"
    // InternalMyDsl.g:353:1: entryRuleOrnament : ruleOrnament EOF ;
    public final void entryRuleOrnament() throws RecognitionException {
        try {
            // InternalMyDsl.g:354:1: ( ruleOrnament EOF )
            // InternalMyDsl.g:355:1: ruleOrnament EOF
            {
             before(grammarAccess.getOrnamentRule()); 
            pushFollow(FOLLOW_1);
            ruleOrnament();

            state._fsp--;

             after(grammarAccess.getOrnamentRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOrnament"


    // $ANTLR start "ruleOrnament"
    // InternalMyDsl.g:362:1: ruleOrnament : ( ( rule__Ornament__Group__0 ) ) ;
    public final void ruleOrnament() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:366:2: ( ( ( rule__Ornament__Group__0 ) ) )
            // InternalMyDsl.g:367:2: ( ( rule__Ornament__Group__0 ) )
            {
            // InternalMyDsl.g:367:2: ( ( rule__Ornament__Group__0 ) )
            // InternalMyDsl.g:368:3: ( rule__Ornament__Group__0 )
            {
             before(grammarAccess.getOrnamentAccess().getGroup()); 
            // InternalMyDsl.g:369:3: ( rule__Ornament__Group__0 )
            // InternalMyDsl.g:369:4: rule__Ornament__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Ornament__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOrnamentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOrnament"


    // $ANTLR start "entryRuleArticulation"
    // InternalMyDsl.g:378:1: entryRuleArticulation : ruleArticulation EOF ;
    public final void entryRuleArticulation() throws RecognitionException {
        try {
            // InternalMyDsl.g:379:1: ( ruleArticulation EOF )
            // InternalMyDsl.g:380:1: ruleArticulation EOF
            {
             before(grammarAccess.getArticulationRule()); 
            pushFollow(FOLLOW_1);
            ruleArticulation();

            state._fsp--;

             after(grammarAccess.getArticulationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleArticulation"


    // $ANTLR start "ruleArticulation"
    // InternalMyDsl.g:387:1: ruleArticulation : ( ( rule__Articulation__Group__0 ) ) ;
    public final void ruleArticulation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:391:2: ( ( ( rule__Articulation__Group__0 ) ) )
            // InternalMyDsl.g:392:2: ( ( rule__Articulation__Group__0 ) )
            {
            // InternalMyDsl.g:392:2: ( ( rule__Articulation__Group__0 ) )
            // InternalMyDsl.g:393:3: ( rule__Articulation__Group__0 )
            {
             before(grammarAccess.getArticulationAccess().getGroup()); 
            // InternalMyDsl.g:394:3: ( rule__Articulation__Group__0 )
            // InternalMyDsl.g:394:4: rule__Articulation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Articulation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getArticulationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleArticulation"


    // $ANTLR start "ruleBracketType"
    // InternalMyDsl.g:403:1: ruleBracketType : ( ( rule__BracketType__Alternatives ) ) ;
    public final void ruleBracketType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:407:1: ( ( ( rule__BracketType__Alternatives ) ) )
            // InternalMyDsl.g:408:2: ( ( rule__BracketType__Alternatives ) )
            {
            // InternalMyDsl.g:408:2: ( ( rule__BracketType__Alternatives ) )
            // InternalMyDsl.g:409:3: ( rule__BracketType__Alternatives )
            {
             before(grammarAccess.getBracketTypeAccess().getAlternatives()); 
            // InternalMyDsl.g:410:3: ( rule__BracketType__Alternatives )
            // InternalMyDsl.g:410:4: rule__BracketType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__BracketType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBracketTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBracketType"


    // $ANTLR start "ruleRestType"
    // InternalMyDsl.g:419:1: ruleRestType : ( ( rule__RestType__Alternatives ) ) ;
    public final void ruleRestType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:423:1: ( ( ( rule__RestType__Alternatives ) ) )
            // InternalMyDsl.g:424:2: ( ( rule__RestType__Alternatives ) )
            {
            // InternalMyDsl.g:424:2: ( ( rule__RestType__Alternatives ) )
            // InternalMyDsl.g:425:3: ( rule__RestType__Alternatives )
            {
             before(grammarAccess.getRestTypeAccess().getAlternatives()); 
            // InternalMyDsl.g:426:3: ( rule__RestType__Alternatives )
            // InternalMyDsl.g:426:4: rule__RestType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__RestType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getRestTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRestType"


    // $ANTLR start "ruleAccidentalType"
    // InternalMyDsl.g:435:1: ruleAccidentalType : ( ( rule__AccidentalType__Alternatives ) ) ;
    public final void ruleAccidentalType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:439:1: ( ( ( rule__AccidentalType__Alternatives ) ) )
            // InternalMyDsl.g:440:2: ( ( rule__AccidentalType__Alternatives ) )
            {
            // InternalMyDsl.g:440:2: ( ( rule__AccidentalType__Alternatives ) )
            // InternalMyDsl.g:441:3: ( rule__AccidentalType__Alternatives )
            {
             before(grammarAccess.getAccidentalTypeAccess().getAlternatives()); 
            // InternalMyDsl.g:442:3: ( rule__AccidentalType__Alternatives )
            // InternalMyDsl.g:442:4: rule__AccidentalType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__AccidentalType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAccidentalTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAccidentalType"


    // $ANTLR start "ruleRepetitionType"
    // InternalMyDsl.g:451:1: ruleRepetitionType : ( ( rule__RepetitionType__Alternatives ) ) ;
    public final void ruleRepetitionType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:455:1: ( ( ( rule__RepetitionType__Alternatives ) ) )
            // InternalMyDsl.g:456:2: ( ( rule__RepetitionType__Alternatives ) )
            {
            // InternalMyDsl.g:456:2: ( ( rule__RepetitionType__Alternatives ) )
            // InternalMyDsl.g:457:3: ( rule__RepetitionType__Alternatives )
            {
             before(grammarAccess.getRepetitionTypeAccess().getAlternatives()); 
            // InternalMyDsl.g:458:3: ( rule__RepetitionType__Alternatives )
            // InternalMyDsl.g:458:4: rule__RepetitionType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__RepetitionType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getRepetitionTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRepetitionType"


    // $ANTLR start "ruleNoteName"
    // InternalMyDsl.g:467:1: ruleNoteName : ( ( rule__NoteName__Alternatives ) ) ;
    public final void ruleNoteName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:471:1: ( ( ( rule__NoteName__Alternatives ) ) )
            // InternalMyDsl.g:472:2: ( ( rule__NoteName__Alternatives ) )
            {
            // InternalMyDsl.g:472:2: ( ( rule__NoteName__Alternatives ) )
            // InternalMyDsl.g:473:3: ( rule__NoteName__Alternatives )
            {
             before(grammarAccess.getNoteNameAccess().getAlternatives()); 
            // InternalMyDsl.g:474:3: ( rule__NoteName__Alternatives )
            // InternalMyDsl.g:474:4: rule__NoteName__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__NoteName__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getNoteNameAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNoteName"


    // $ANTLR start "ruleNoteDuration"
    // InternalMyDsl.g:483:1: ruleNoteDuration : ( ( rule__NoteDuration__Alternatives ) ) ;
    public final void ruleNoteDuration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:487:1: ( ( ( rule__NoteDuration__Alternatives ) ) )
            // InternalMyDsl.g:488:2: ( ( rule__NoteDuration__Alternatives ) )
            {
            // InternalMyDsl.g:488:2: ( ( rule__NoteDuration__Alternatives ) )
            // InternalMyDsl.g:489:3: ( rule__NoteDuration__Alternatives )
            {
             before(grammarAccess.getNoteDurationAccess().getAlternatives()); 
            // InternalMyDsl.g:490:3: ( rule__NoteDuration__Alternatives )
            // InternalMyDsl.g:490:4: rule__NoteDuration__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__NoteDuration__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getNoteDurationAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNoteDuration"


    // $ANTLR start "ruleOrnamentType"
    // InternalMyDsl.g:499:1: ruleOrnamentType : ( ( rule__OrnamentType__Alternatives ) ) ;
    public final void ruleOrnamentType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:503:1: ( ( ( rule__OrnamentType__Alternatives ) ) )
            // InternalMyDsl.g:504:2: ( ( rule__OrnamentType__Alternatives ) )
            {
            // InternalMyDsl.g:504:2: ( ( rule__OrnamentType__Alternatives ) )
            // InternalMyDsl.g:505:3: ( rule__OrnamentType__Alternatives )
            {
             before(grammarAccess.getOrnamentTypeAccess().getAlternatives()); 
            // InternalMyDsl.g:506:3: ( rule__OrnamentType__Alternatives )
            // InternalMyDsl.g:506:4: rule__OrnamentType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__OrnamentType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getOrnamentTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOrnamentType"


    // $ANTLR start "ruleArticulationType"
    // InternalMyDsl.g:515:1: ruleArticulationType : ( ( rule__ArticulationType__Alternatives ) ) ;
    public final void ruleArticulationType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:519:1: ( ( ( rule__ArticulationType__Alternatives ) ) )
            // InternalMyDsl.g:520:2: ( ( rule__ArticulationType__Alternatives ) )
            {
            // InternalMyDsl.g:520:2: ( ( rule__ArticulationType__Alternatives ) )
            // InternalMyDsl.g:521:3: ( rule__ArticulationType__Alternatives )
            {
             before(grammarAccess.getArticulationTypeAccess().getAlternatives()); 
            // InternalMyDsl.g:522:3: ( rule__ArticulationType__Alternatives )
            // InternalMyDsl.g:522:4: rule__ArticulationType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ArticulationType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getArticulationTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleArticulationType"


    // $ANTLR start "ruleClefType"
    // InternalMyDsl.g:531:1: ruleClefType : ( ( rule__ClefType__Alternatives ) ) ;
    public final void ruleClefType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:535:1: ( ( ( rule__ClefType__Alternatives ) ) )
            // InternalMyDsl.g:536:2: ( ( rule__ClefType__Alternatives ) )
            {
            // InternalMyDsl.g:536:2: ( ( rule__ClefType__Alternatives ) )
            // InternalMyDsl.g:537:3: ( rule__ClefType__Alternatives )
            {
             before(grammarAccess.getClefTypeAccess().getAlternatives()); 
            // InternalMyDsl.g:538:3: ( rule__ClefType__Alternatives )
            // InternalMyDsl.g:538:4: rule__ClefType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ClefType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getClefTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleClefType"


    // $ANTLR start "rule__StaffElement__Alternatives"
    // InternalMyDsl.g:546:1: rule__StaffElement__Alternatives : ( ( ruleRest ) | ( ruleAccidental ) | ( ruleRepetition ) | ( ruleNote ) );
    public final void rule__StaffElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:550:1: ( ( ruleRest ) | ( ruleAccidental ) | ( ruleRepetition ) | ( ruleNote ) )
            int alt1=4;
            switch ( input.LA(1) ) {
            case 64:
                {
                alt1=1;
                }
                break;
            case 65:
                {
                alt1=2;
                }
                break;
            case 66:
                {
                alt1=3;
                }
                break;
            case 67:
                {
                alt1=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalMyDsl.g:551:2: ( ruleRest )
                    {
                    // InternalMyDsl.g:551:2: ( ruleRest )
                    // InternalMyDsl.g:552:3: ruleRest
                    {
                     before(grammarAccess.getStaffElementAccess().getRestParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleRest();

                    state._fsp--;

                     after(grammarAccess.getStaffElementAccess().getRestParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:557:2: ( ruleAccidental )
                    {
                    // InternalMyDsl.g:557:2: ( ruleAccidental )
                    // InternalMyDsl.g:558:3: ruleAccidental
                    {
                     before(grammarAccess.getStaffElementAccess().getAccidentalParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleAccidental();

                    state._fsp--;

                     after(grammarAccess.getStaffElementAccess().getAccidentalParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:563:2: ( ruleRepetition )
                    {
                    // InternalMyDsl.g:563:2: ( ruleRepetition )
                    // InternalMyDsl.g:564:3: ruleRepetition
                    {
                     before(grammarAccess.getStaffElementAccess().getRepetitionParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleRepetition();

                    state._fsp--;

                     after(grammarAccess.getStaffElementAccess().getRepetitionParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:569:2: ( ruleNote )
                    {
                    // InternalMyDsl.g:569:2: ( ruleNote )
                    // InternalMyDsl.g:570:3: ruleNote
                    {
                     before(grammarAccess.getStaffElementAccess().getNoteParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleNote();

                    state._fsp--;

                     after(grammarAccess.getStaffElementAccess().getNoteParserRuleCall_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StaffElement__Alternatives"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalMyDsl.g:579:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:583:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_STRING) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:584:2: ( RULE_STRING )
                    {
                    // InternalMyDsl.g:584:2: ( RULE_STRING )
                    // InternalMyDsl.g:585:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:590:2: ( RULE_ID )
                    {
                    // InternalMyDsl.g:590:2: ( RULE_ID )
                    // InternalMyDsl.g:591:3: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__BracketType__Alternatives"
    // InternalMyDsl.g:600:1: rule__BracketType__Alternatives : ( ( ( 'curly' ) ) | ( ( 'square' ) ) );
    public final void rule__BracketType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:604:1: ( ( ( 'curly' ) ) | ( ( 'square' ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==11) ) {
                alt3=1;
            }
            else if ( (LA3_0==12) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:605:2: ( ( 'curly' ) )
                    {
                    // InternalMyDsl.g:605:2: ( ( 'curly' ) )
                    // InternalMyDsl.g:606:3: ( 'curly' )
                    {
                     before(grammarAccess.getBracketTypeAccess().getCurlyEnumLiteralDeclaration_0()); 
                    // InternalMyDsl.g:607:3: ( 'curly' )
                    // InternalMyDsl.g:607:4: 'curly'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getBracketTypeAccess().getCurlyEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:611:2: ( ( 'square' ) )
                    {
                    // InternalMyDsl.g:611:2: ( ( 'square' ) )
                    // InternalMyDsl.g:612:3: ( 'square' )
                    {
                     before(grammarAccess.getBracketTypeAccess().getSquareEnumLiteralDeclaration_1()); 
                    // InternalMyDsl.g:613:3: ( 'square' )
                    // InternalMyDsl.g:613:4: 'square'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getBracketTypeAccess().getSquareEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BracketType__Alternatives"


    // $ANTLR start "rule__RestType__Alternatives"
    // InternalMyDsl.g:621:1: rule__RestType__Alternatives : ( ( ( 'whole' ) ) | ( ( 'half' ) ) | ( ( 'quarter' ) ) | ( ( 'eighth' ) ) | ( ( 'sixteenth' ) ) | ( ( 'thirtysecond' ) ) | ( ( 'sixtyfourth' ) ) );
    public final void rule__RestType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:625:1: ( ( ( 'whole' ) ) | ( ( 'half' ) ) | ( ( 'quarter' ) ) | ( ( 'eighth' ) ) | ( ( 'sixteenth' ) ) | ( ( 'thirtysecond' ) ) | ( ( 'sixtyfourth' ) ) )
            int alt4=7;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt4=1;
                }
                break;
            case 14:
                {
                alt4=2;
                }
                break;
            case 15:
                {
                alt4=3;
                }
                break;
            case 16:
                {
                alt4=4;
                }
                break;
            case 17:
                {
                alt4=5;
                }
                break;
            case 18:
                {
                alt4=6;
                }
                break;
            case 19:
                {
                alt4=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:626:2: ( ( 'whole' ) )
                    {
                    // InternalMyDsl.g:626:2: ( ( 'whole' ) )
                    // InternalMyDsl.g:627:3: ( 'whole' )
                    {
                     before(grammarAccess.getRestTypeAccess().getWholeEnumLiteralDeclaration_0()); 
                    // InternalMyDsl.g:628:3: ( 'whole' )
                    // InternalMyDsl.g:628:4: 'whole'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getRestTypeAccess().getWholeEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:632:2: ( ( 'half' ) )
                    {
                    // InternalMyDsl.g:632:2: ( ( 'half' ) )
                    // InternalMyDsl.g:633:3: ( 'half' )
                    {
                     before(grammarAccess.getRestTypeAccess().getHalfEnumLiteralDeclaration_1()); 
                    // InternalMyDsl.g:634:3: ( 'half' )
                    // InternalMyDsl.g:634:4: 'half'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getRestTypeAccess().getHalfEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:638:2: ( ( 'quarter' ) )
                    {
                    // InternalMyDsl.g:638:2: ( ( 'quarter' ) )
                    // InternalMyDsl.g:639:3: ( 'quarter' )
                    {
                     before(grammarAccess.getRestTypeAccess().getQuarterEnumLiteralDeclaration_2()); 
                    // InternalMyDsl.g:640:3: ( 'quarter' )
                    // InternalMyDsl.g:640:4: 'quarter'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getRestTypeAccess().getQuarterEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:644:2: ( ( 'eighth' ) )
                    {
                    // InternalMyDsl.g:644:2: ( ( 'eighth' ) )
                    // InternalMyDsl.g:645:3: ( 'eighth' )
                    {
                     before(grammarAccess.getRestTypeAccess().getEighthEnumLiteralDeclaration_3()); 
                    // InternalMyDsl.g:646:3: ( 'eighth' )
                    // InternalMyDsl.g:646:4: 'eighth'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getRestTypeAccess().getEighthEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:650:2: ( ( 'sixteenth' ) )
                    {
                    // InternalMyDsl.g:650:2: ( ( 'sixteenth' ) )
                    // InternalMyDsl.g:651:3: ( 'sixteenth' )
                    {
                     before(grammarAccess.getRestTypeAccess().getSixteenthEnumLiteralDeclaration_4()); 
                    // InternalMyDsl.g:652:3: ( 'sixteenth' )
                    // InternalMyDsl.g:652:4: 'sixteenth'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getRestTypeAccess().getSixteenthEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:656:2: ( ( 'thirtysecond' ) )
                    {
                    // InternalMyDsl.g:656:2: ( ( 'thirtysecond' ) )
                    // InternalMyDsl.g:657:3: ( 'thirtysecond' )
                    {
                     before(grammarAccess.getRestTypeAccess().getThirtysecondEnumLiteralDeclaration_5()); 
                    // InternalMyDsl.g:658:3: ( 'thirtysecond' )
                    // InternalMyDsl.g:658:4: 'thirtysecond'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getRestTypeAccess().getThirtysecondEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalMyDsl.g:662:2: ( ( 'sixtyfourth' ) )
                    {
                    // InternalMyDsl.g:662:2: ( ( 'sixtyfourth' ) )
                    // InternalMyDsl.g:663:3: ( 'sixtyfourth' )
                    {
                     before(grammarAccess.getRestTypeAccess().getSixtyfourthEnumLiteralDeclaration_6()); 
                    // InternalMyDsl.g:664:3: ( 'sixtyfourth' )
                    // InternalMyDsl.g:664:4: 'sixtyfourth'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getRestTypeAccess().getSixtyfourthEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestType__Alternatives"


    // $ANTLR start "rule__AccidentalType__Alternatives"
    // InternalMyDsl.g:672:1: rule__AccidentalType__Alternatives : ( ( ( 'sharp' ) ) | ( ( 'flat' ) ) | ( ( 'natural' ) ) );
    public final void rule__AccidentalType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:676:1: ( ( ( 'sharp' ) ) | ( ( 'flat' ) ) | ( ( 'natural' ) ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt5=1;
                }
                break;
            case 21:
                {
                alt5=2;
                }
                break;
            case 22:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:677:2: ( ( 'sharp' ) )
                    {
                    // InternalMyDsl.g:677:2: ( ( 'sharp' ) )
                    // InternalMyDsl.g:678:3: ( 'sharp' )
                    {
                     before(grammarAccess.getAccidentalTypeAccess().getSharpEnumLiteralDeclaration_0()); 
                    // InternalMyDsl.g:679:3: ( 'sharp' )
                    // InternalMyDsl.g:679:4: 'sharp'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getAccidentalTypeAccess().getSharpEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:683:2: ( ( 'flat' ) )
                    {
                    // InternalMyDsl.g:683:2: ( ( 'flat' ) )
                    // InternalMyDsl.g:684:3: ( 'flat' )
                    {
                     before(grammarAccess.getAccidentalTypeAccess().getFlatEnumLiteralDeclaration_1()); 
                    // InternalMyDsl.g:685:3: ( 'flat' )
                    // InternalMyDsl.g:685:4: 'flat'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getAccidentalTypeAccess().getFlatEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:689:2: ( ( 'natural' ) )
                    {
                    // InternalMyDsl.g:689:2: ( ( 'natural' ) )
                    // InternalMyDsl.g:690:3: ( 'natural' )
                    {
                     before(grammarAccess.getAccidentalTypeAccess().getNaturalEnumLiteralDeclaration_2()); 
                    // InternalMyDsl.g:691:3: ( 'natural' )
                    // InternalMyDsl.g:691:4: 'natural'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getAccidentalTypeAccess().getNaturalEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccidentalType__Alternatives"


    // $ANTLR start "rule__RepetitionType__Alternatives"
    // InternalMyDsl.g:699:1: rule__RepetitionType__Alternatives : ( ( ( 'left' ) ) | ( ( 'right' ) ) );
    public final void rule__RepetitionType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:703:1: ( ( ( 'left' ) ) | ( ( 'right' ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==23) ) {
                alt6=1;
            }
            else if ( (LA6_0==24) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:704:2: ( ( 'left' ) )
                    {
                    // InternalMyDsl.g:704:2: ( ( 'left' ) )
                    // InternalMyDsl.g:705:3: ( 'left' )
                    {
                     before(grammarAccess.getRepetitionTypeAccess().getLeftEnumLiteralDeclaration_0()); 
                    // InternalMyDsl.g:706:3: ( 'left' )
                    // InternalMyDsl.g:706:4: 'left'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getRepetitionTypeAccess().getLeftEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:710:2: ( ( 'right' ) )
                    {
                    // InternalMyDsl.g:710:2: ( ( 'right' ) )
                    // InternalMyDsl.g:711:3: ( 'right' )
                    {
                     before(grammarAccess.getRepetitionTypeAccess().getRightEnumLiteralDeclaration_1()); 
                    // InternalMyDsl.g:712:3: ( 'right' )
                    // InternalMyDsl.g:712:4: 'right'
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getRepetitionTypeAccess().getRightEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepetitionType__Alternatives"


    // $ANTLR start "rule__NoteName__Alternatives"
    // InternalMyDsl.g:720:1: rule__NoteName__Alternatives : ( ( ( 'c' ) ) | ( ( 'd' ) ) | ( ( 'e' ) ) | ( ( 'f' ) ) | ( ( 'g' ) ) | ( ( 'a' ) ) | ( ( 'b' ) ) );
    public final void rule__NoteName__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:724:1: ( ( ( 'c' ) ) | ( ( 'd' ) ) | ( ( 'e' ) ) | ( ( 'f' ) ) | ( ( 'g' ) ) | ( ( 'a' ) ) | ( ( 'b' ) ) )
            int alt7=7;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt7=1;
                }
                break;
            case 26:
                {
                alt7=2;
                }
                break;
            case 27:
                {
                alt7=3;
                }
                break;
            case 28:
                {
                alt7=4;
                }
                break;
            case 29:
                {
                alt7=5;
                }
                break;
            case 30:
                {
                alt7=6;
                }
                break;
            case 31:
                {
                alt7=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:725:2: ( ( 'c' ) )
                    {
                    // InternalMyDsl.g:725:2: ( ( 'c' ) )
                    // InternalMyDsl.g:726:3: ( 'c' )
                    {
                     before(grammarAccess.getNoteNameAccess().getCEnumLiteralDeclaration_0()); 
                    // InternalMyDsl.g:727:3: ( 'c' )
                    // InternalMyDsl.g:727:4: 'c'
                    {
                    match(input,25,FOLLOW_2); 

                    }

                     after(grammarAccess.getNoteNameAccess().getCEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:731:2: ( ( 'd' ) )
                    {
                    // InternalMyDsl.g:731:2: ( ( 'd' ) )
                    // InternalMyDsl.g:732:3: ( 'd' )
                    {
                     before(grammarAccess.getNoteNameAccess().getDEnumLiteralDeclaration_1()); 
                    // InternalMyDsl.g:733:3: ( 'd' )
                    // InternalMyDsl.g:733:4: 'd'
                    {
                    match(input,26,FOLLOW_2); 

                    }

                     after(grammarAccess.getNoteNameAccess().getDEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:737:2: ( ( 'e' ) )
                    {
                    // InternalMyDsl.g:737:2: ( ( 'e' ) )
                    // InternalMyDsl.g:738:3: ( 'e' )
                    {
                     before(grammarAccess.getNoteNameAccess().getEEnumLiteralDeclaration_2()); 
                    // InternalMyDsl.g:739:3: ( 'e' )
                    // InternalMyDsl.g:739:4: 'e'
                    {
                    match(input,27,FOLLOW_2); 

                    }

                     after(grammarAccess.getNoteNameAccess().getEEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:743:2: ( ( 'f' ) )
                    {
                    // InternalMyDsl.g:743:2: ( ( 'f' ) )
                    // InternalMyDsl.g:744:3: ( 'f' )
                    {
                     before(grammarAccess.getNoteNameAccess().getFEnumLiteralDeclaration_3()); 
                    // InternalMyDsl.g:745:3: ( 'f' )
                    // InternalMyDsl.g:745:4: 'f'
                    {
                    match(input,28,FOLLOW_2); 

                    }

                     after(grammarAccess.getNoteNameAccess().getFEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:749:2: ( ( 'g' ) )
                    {
                    // InternalMyDsl.g:749:2: ( ( 'g' ) )
                    // InternalMyDsl.g:750:3: ( 'g' )
                    {
                     before(grammarAccess.getNoteNameAccess().getGEnumLiteralDeclaration_4()); 
                    // InternalMyDsl.g:751:3: ( 'g' )
                    // InternalMyDsl.g:751:4: 'g'
                    {
                    match(input,29,FOLLOW_2); 

                    }

                     after(grammarAccess.getNoteNameAccess().getGEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:755:2: ( ( 'a' ) )
                    {
                    // InternalMyDsl.g:755:2: ( ( 'a' ) )
                    // InternalMyDsl.g:756:3: ( 'a' )
                    {
                     before(grammarAccess.getNoteNameAccess().getAEnumLiteralDeclaration_5()); 
                    // InternalMyDsl.g:757:3: ( 'a' )
                    // InternalMyDsl.g:757:4: 'a'
                    {
                    match(input,30,FOLLOW_2); 

                    }

                     after(grammarAccess.getNoteNameAccess().getAEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalMyDsl.g:761:2: ( ( 'b' ) )
                    {
                    // InternalMyDsl.g:761:2: ( ( 'b' ) )
                    // InternalMyDsl.g:762:3: ( 'b' )
                    {
                     before(grammarAccess.getNoteNameAccess().getBEnumLiteralDeclaration_6()); 
                    // InternalMyDsl.g:763:3: ( 'b' )
                    // InternalMyDsl.g:763:4: 'b'
                    {
                    match(input,31,FOLLOW_2); 

                    }

                     after(grammarAccess.getNoteNameAccess().getBEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NoteName__Alternatives"


    // $ANTLR start "rule__NoteDuration__Alternatives"
    // InternalMyDsl.g:771:1: rule__NoteDuration__Alternatives : ( ( ( 'whole' ) ) | ( ( 'half' ) ) | ( ( 'quarter' ) ) | ( ( 'eighth' ) ) | ( ( 'sixteenth' ) ) | ( ( 'thirtysecond' ) ) | ( ( 'sixtyfourth' ) ) );
    public final void rule__NoteDuration__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:775:1: ( ( ( 'whole' ) ) | ( ( 'half' ) ) | ( ( 'quarter' ) ) | ( ( 'eighth' ) ) | ( ( 'sixteenth' ) ) | ( ( 'thirtysecond' ) ) | ( ( 'sixtyfourth' ) ) )
            int alt8=7;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt8=1;
                }
                break;
            case 14:
                {
                alt8=2;
                }
                break;
            case 15:
                {
                alt8=3;
                }
                break;
            case 16:
                {
                alt8=4;
                }
                break;
            case 17:
                {
                alt8=5;
                }
                break;
            case 18:
                {
                alt8=6;
                }
                break;
            case 19:
                {
                alt8=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalMyDsl.g:776:2: ( ( 'whole' ) )
                    {
                    // InternalMyDsl.g:776:2: ( ( 'whole' ) )
                    // InternalMyDsl.g:777:3: ( 'whole' )
                    {
                     before(grammarAccess.getNoteDurationAccess().getWholeEnumLiteralDeclaration_0()); 
                    // InternalMyDsl.g:778:3: ( 'whole' )
                    // InternalMyDsl.g:778:4: 'whole'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getNoteDurationAccess().getWholeEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:782:2: ( ( 'half' ) )
                    {
                    // InternalMyDsl.g:782:2: ( ( 'half' ) )
                    // InternalMyDsl.g:783:3: ( 'half' )
                    {
                     before(grammarAccess.getNoteDurationAccess().getHalfEnumLiteralDeclaration_1()); 
                    // InternalMyDsl.g:784:3: ( 'half' )
                    // InternalMyDsl.g:784:4: 'half'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getNoteDurationAccess().getHalfEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:788:2: ( ( 'quarter' ) )
                    {
                    // InternalMyDsl.g:788:2: ( ( 'quarter' ) )
                    // InternalMyDsl.g:789:3: ( 'quarter' )
                    {
                     before(grammarAccess.getNoteDurationAccess().getQuarterEnumLiteralDeclaration_2()); 
                    // InternalMyDsl.g:790:3: ( 'quarter' )
                    // InternalMyDsl.g:790:4: 'quarter'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getNoteDurationAccess().getQuarterEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:794:2: ( ( 'eighth' ) )
                    {
                    // InternalMyDsl.g:794:2: ( ( 'eighth' ) )
                    // InternalMyDsl.g:795:3: ( 'eighth' )
                    {
                     before(grammarAccess.getNoteDurationAccess().getEighthEnumLiteralDeclaration_3()); 
                    // InternalMyDsl.g:796:3: ( 'eighth' )
                    // InternalMyDsl.g:796:4: 'eighth'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getNoteDurationAccess().getEighthEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:800:2: ( ( 'sixteenth' ) )
                    {
                    // InternalMyDsl.g:800:2: ( ( 'sixteenth' ) )
                    // InternalMyDsl.g:801:3: ( 'sixteenth' )
                    {
                     before(grammarAccess.getNoteDurationAccess().getSixteenthEnumLiteralDeclaration_4()); 
                    // InternalMyDsl.g:802:3: ( 'sixteenth' )
                    // InternalMyDsl.g:802:4: 'sixteenth'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getNoteDurationAccess().getSixteenthEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:806:2: ( ( 'thirtysecond' ) )
                    {
                    // InternalMyDsl.g:806:2: ( ( 'thirtysecond' ) )
                    // InternalMyDsl.g:807:3: ( 'thirtysecond' )
                    {
                     before(grammarAccess.getNoteDurationAccess().getThirtysecondEnumLiteralDeclaration_5()); 
                    // InternalMyDsl.g:808:3: ( 'thirtysecond' )
                    // InternalMyDsl.g:808:4: 'thirtysecond'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getNoteDurationAccess().getThirtysecondEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalMyDsl.g:812:2: ( ( 'sixtyfourth' ) )
                    {
                    // InternalMyDsl.g:812:2: ( ( 'sixtyfourth' ) )
                    // InternalMyDsl.g:813:3: ( 'sixtyfourth' )
                    {
                     before(grammarAccess.getNoteDurationAccess().getSixtyfourthEnumLiteralDeclaration_6()); 
                    // InternalMyDsl.g:814:3: ( 'sixtyfourth' )
                    // InternalMyDsl.g:814:4: 'sixtyfourth'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getNoteDurationAccess().getSixtyfourthEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NoteDuration__Alternatives"


    // $ANTLR start "rule__OrnamentType__Alternatives"
    // InternalMyDsl.g:822:1: rule__OrnamentType__Alternatives : ( ( ( 'slide' ) ) | ( ( 'glissando' ) ) | ( ( 'aciaccatura' ) ) | ( ( 'appoggiatura' ) ) | ( ( 'turn' ) ) | ( ( 'mordent' ) ) | ( ( 'trill' ) ) );
    public final void rule__OrnamentType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:826:1: ( ( ( 'slide' ) ) | ( ( 'glissando' ) ) | ( ( 'aciaccatura' ) ) | ( ( 'appoggiatura' ) ) | ( ( 'turn' ) ) | ( ( 'mordent' ) ) | ( ( 'trill' ) ) )
            int alt9=7;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt9=1;
                }
                break;
            case 33:
                {
                alt9=2;
                }
                break;
            case 34:
                {
                alt9=3;
                }
                break;
            case 35:
                {
                alt9=4;
                }
                break;
            case 36:
                {
                alt9=5;
                }
                break;
            case 37:
                {
                alt9=6;
                }
                break;
            case 38:
                {
                alt9=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalMyDsl.g:827:2: ( ( 'slide' ) )
                    {
                    // InternalMyDsl.g:827:2: ( ( 'slide' ) )
                    // InternalMyDsl.g:828:3: ( 'slide' )
                    {
                     before(grammarAccess.getOrnamentTypeAccess().getSlideEnumLiteralDeclaration_0()); 
                    // InternalMyDsl.g:829:3: ( 'slide' )
                    // InternalMyDsl.g:829:4: 'slide'
                    {
                    match(input,32,FOLLOW_2); 

                    }

                     after(grammarAccess.getOrnamentTypeAccess().getSlideEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:833:2: ( ( 'glissando' ) )
                    {
                    // InternalMyDsl.g:833:2: ( ( 'glissando' ) )
                    // InternalMyDsl.g:834:3: ( 'glissando' )
                    {
                     before(grammarAccess.getOrnamentTypeAccess().getGlissandoEnumLiteralDeclaration_1()); 
                    // InternalMyDsl.g:835:3: ( 'glissando' )
                    // InternalMyDsl.g:835:4: 'glissando'
                    {
                    match(input,33,FOLLOW_2); 

                    }

                     after(grammarAccess.getOrnamentTypeAccess().getGlissandoEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:839:2: ( ( 'aciaccatura' ) )
                    {
                    // InternalMyDsl.g:839:2: ( ( 'aciaccatura' ) )
                    // InternalMyDsl.g:840:3: ( 'aciaccatura' )
                    {
                     before(grammarAccess.getOrnamentTypeAccess().getAciaccaturaEnumLiteralDeclaration_2()); 
                    // InternalMyDsl.g:841:3: ( 'aciaccatura' )
                    // InternalMyDsl.g:841:4: 'aciaccatura'
                    {
                    match(input,34,FOLLOW_2); 

                    }

                     after(grammarAccess.getOrnamentTypeAccess().getAciaccaturaEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:845:2: ( ( 'appoggiatura' ) )
                    {
                    // InternalMyDsl.g:845:2: ( ( 'appoggiatura' ) )
                    // InternalMyDsl.g:846:3: ( 'appoggiatura' )
                    {
                     before(grammarAccess.getOrnamentTypeAccess().getAppoggiaturaEnumLiteralDeclaration_3()); 
                    // InternalMyDsl.g:847:3: ( 'appoggiatura' )
                    // InternalMyDsl.g:847:4: 'appoggiatura'
                    {
                    match(input,35,FOLLOW_2); 

                    }

                     after(grammarAccess.getOrnamentTypeAccess().getAppoggiaturaEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:851:2: ( ( 'turn' ) )
                    {
                    // InternalMyDsl.g:851:2: ( ( 'turn' ) )
                    // InternalMyDsl.g:852:3: ( 'turn' )
                    {
                     before(grammarAccess.getOrnamentTypeAccess().getTurnEnumLiteralDeclaration_4()); 
                    // InternalMyDsl.g:853:3: ( 'turn' )
                    // InternalMyDsl.g:853:4: 'turn'
                    {
                    match(input,36,FOLLOW_2); 

                    }

                     after(grammarAccess.getOrnamentTypeAccess().getTurnEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:857:2: ( ( 'mordent' ) )
                    {
                    // InternalMyDsl.g:857:2: ( ( 'mordent' ) )
                    // InternalMyDsl.g:858:3: ( 'mordent' )
                    {
                     before(grammarAccess.getOrnamentTypeAccess().getMordentEnumLiteralDeclaration_5()); 
                    // InternalMyDsl.g:859:3: ( 'mordent' )
                    // InternalMyDsl.g:859:4: 'mordent'
                    {
                    match(input,37,FOLLOW_2); 

                    }

                     after(grammarAccess.getOrnamentTypeAccess().getMordentEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalMyDsl.g:863:2: ( ( 'trill' ) )
                    {
                    // InternalMyDsl.g:863:2: ( ( 'trill' ) )
                    // InternalMyDsl.g:864:3: ( 'trill' )
                    {
                     before(grammarAccess.getOrnamentTypeAccess().getTrillEnumLiteralDeclaration_6()); 
                    // InternalMyDsl.g:865:3: ( 'trill' )
                    // InternalMyDsl.g:865:4: 'trill'
                    {
                    match(input,38,FOLLOW_2); 

                    }

                     after(grammarAccess.getOrnamentTypeAccess().getTrillEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrnamentType__Alternatives"


    // $ANTLR start "rule__ArticulationType__Alternatives"
    // InternalMyDsl.g:873:1: rule__ArticulationType__Alternatives : ( ( ( 'detached' ) ) | ( ( 'legato' ) ) | ( ( 'staccato' ) ) | ( ( 'portato' ) ) | ( ( 'tenuto' ) ) | ( ( 'marcato' ) ) );
    public final void rule__ArticulationType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:877:1: ( ( ( 'detached' ) ) | ( ( 'legato' ) ) | ( ( 'staccato' ) ) | ( ( 'portato' ) ) | ( ( 'tenuto' ) ) | ( ( 'marcato' ) ) )
            int alt10=6;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt10=1;
                }
                break;
            case 40:
                {
                alt10=2;
                }
                break;
            case 41:
                {
                alt10=3;
                }
                break;
            case 42:
                {
                alt10=4;
                }
                break;
            case 43:
                {
                alt10=5;
                }
                break;
            case 44:
                {
                alt10=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalMyDsl.g:878:2: ( ( 'detached' ) )
                    {
                    // InternalMyDsl.g:878:2: ( ( 'detached' ) )
                    // InternalMyDsl.g:879:3: ( 'detached' )
                    {
                     before(grammarAccess.getArticulationTypeAccess().getDetachedEnumLiteralDeclaration_0()); 
                    // InternalMyDsl.g:880:3: ( 'detached' )
                    // InternalMyDsl.g:880:4: 'detached'
                    {
                    match(input,39,FOLLOW_2); 

                    }

                     after(grammarAccess.getArticulationTypeAccess().getDetachedEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:884:2: ( ( 'legato' ) )
                    {
                    // InternalMyDsl.g:884:2: ( ( 'legato' ) )
                    // InternalMyDsl.g:885:3: ( 'legato' )
                    {
                     before(grammarAccess.getArticulationTypeAccess().getLegatoEnumLiteralDeclaration_1()); 
                    // InternalMyDsl.g:886:3: ( 'legato' )
                    // InternalMyDsl.g:886:4: 'legato'
                    {
                    match(input,40,FOLLOW_2); 

                    }

                     after(grammarAccess.getArticulationTypeAccess().getLegatoEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:890:2: ( ( 'staccato' ) )
                    {
                    // InternalMyDsl.g:890:2: ( ( 'staccato' ) )
                    // InternalMyDsl.g:891:3: ( 'staccato' )
                    {
                     before(grammarAccess.getArticulationTypeAccess().getStaccatoEnumLiteralDeclaration_2()); 
                    // InternalMyDsl.g:892:3: ( 'staccato' )
                    // InternalMyDsl.g:892:4: 'staccato'
                    {
                    match(input,41,FOLLOW_2); 

                    }

                     after(grammarAccess.getArticulationTypeAccess().getStaccatoEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:896:2: ( ( 'portato' ) )
                    {
                    // InternalMyDsl.g:896:2: ( ( 'portato' ) )
                    // InternalMyDsl.g:897:3: ( 'portato' )
                    {
                     before(grammarAccess.getArticulationTypeAccess().getPortatoEnumLiteralDeclaration_3()); 
                    // InternalMyDsl.g:898:3: ( 'portato' )
                    // InternalMyDsl.g:898:4: 'portato'
                    {
                    match(input,42,FOLLOW_2); 

                    }

                     after(grammarAccess.getArticulationTypeAccess().getPortatoEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:902:2: ( ( 'tenuto' ) )
                    {
                    // InternalMyDsl.g:902:2: ( ( 'tenuto' ) )
                    // InternalMyDsl.g:903:3: ( 'tenuto' )
                    {
                     before(grammarAccess.getArticulationTypeAccess().getTenutoEnumLiteralDeclaration_4()); 
                    // InternalMyDsl.g:904:3: ( 'tenuto' )
                    // InternalMyDsl.g:904:4: 'tenuto'
                    {
                    match(input,43,FOLLOW_2); 

                    }

                     after(grammarAccess.getArticulationTypeAccess().getTenutoEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:908:2: ( ( 'marcato' ) )
                    {
                    // InternalMyDsl.g:908:2: ( ( 'marcato' ) )
                    // InternalMyDsl.g:909:3: ( 'marcato' )
                    {
                     before(grammarAccess.getArticulationTypeAccess().getMarcatoEnumLiteralDeclaration_5()); 
                    // InternalMyDsl.g:910:3: ( 'marcato' )
                    // InternalMyDsl.g:910:4: 'marcato'
                    {
                    match(input,44,FOLLOW_2); 

                    }

                     after(grammarAccess.getArticulationTypeAccess().getMarcatoEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArticulationType__Alternatives"


    // $ANTLR start "rule__ClefType__Alternatives"
    // InternalMyDsl.g:918:1: rule__ClefType__Alternatives : ( ( ( 'violin' ) ) | ( ( 'bass' ) ) );
    public final void rule__ClefType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:922:1: ( ( ( 'violin' ) ) | ( ( 'bass' ) ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==45) ) {
                alt11=1;
            }
            else if ( (LA11_0==46) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalMyDsl.g:923:2: ( ( 'violin' ) )
                    {
                    // InternalMyDsl.g:923:2: ( ( 'violin' ) )
                    // InternalMyDsl.g:924:3: ( 'violin' )
                    {
                     before(grammarAccess.getClefTypeAccess().getViolinEnumLiteralDeclaration_0()); 
                    // InternalMyDsl.g:925:3: ( 'violin' )
                    // InternalMyDsl.g:925:4: 'violin'
                    {
                    match(input,45,FOLLOW_2); 

                    }

                     after(grammarAccess.getClefTypeAccess().getViolinEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:929:2: ( ( 'bass' ) )
                    {
                    // InternalMyDsl.g:929:2: ( ( 'bass' ) )
                    // InternalMyDsl.g:930:3: ( 'bass' )
                    {
                     before(grammarAccess.getClefTypeAccess().getBassEnumLiteralDeclaration_1()); 
                    // InternalMyDsl.g:931:3: ( 'bass' )
                    // InternalMyDsl.g:931:4: 'bass'
                    {
                    match(input,46,FOLLOW_2); 

                    }

                     after(grammarAccess.getClefTypeAccess().getBassEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClefType__Alternatives"


    // $ANTLR start "rule__Composition__Group__0"
    // InternalMyDsl.g:939:1: rule__Composition__Group__0 : rule__Composition__Group__0__Impl rule__Composition__Group__1 ;
    public final void rule__Composition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:943:1: ( rule__Composition__Group__0__Impl rule__Composition__Group__1 )
            // InternalMyDsl.g:944:2: rule__Composition__Group__0__Impl rule__Composition__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Composition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Composition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composition__Group__0"


    // $ANTLR start "rule__Composition__Group__0__Impl"
    // InternalMyDsl.g:951:1: rule__Composition__Group__0__Impl : ( () ) ;
    public final void rule__Composition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:955:1: ( ( () ) )
            // InternalMyDsl.g:956:1: ( () )
            {
            // InternalMyDsl.g:956:1: ( () )
            // InternalMyDsl.g:957:2: ()
            {
             before(grammarAccess.getCompositionAccess().getCompositionAction_0()); 
            // InternalMyDsl.g:958:2: ()
            // InternalMyDsl.g:958:3: 
            {
            }

             after(grammarAccess.getCompositionAccess().getCompositionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composition__Group__0__Impl"


    // $ANTLR start "rule__Composition__Group__1"
    // InternalMyDsl.g:966:1: rule__Composition__Group__1 : rule__Composition__Group__1__Impl rule__Composition__Group__2 ;
    public final void rule__Composition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:970:1: ( rule__Composition__Group__1__Impl rule__Composition__Group__2 )
            // InternalMyDsl.g:971:2: rule__Composition__Group__1__Impl rule__Composition__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Composition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Composition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composition__Group__1"


    // $ANTLR start "rule__Composition__Group__1__Impl"
    // InternalMyDsl.g:978:1: rule__Composition__Group__1__Impl : ( 'Composition' ) ;
    public final void rule__Composition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:982:1: ( ( 'Composition' ) )
            // InternalMyDsl.g:983:1: ( 'Composition' )
            {
            // InternalMyDsl.g:983:1: ( 'Composition' )
            // InternalMyDsl.g:984:2: 'Composition'
            {
             before(grammarAccess.getCompositionAccess().getCompositionKeyword_1()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getCompositionAccess().getCompositionKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composition__Group__1__Impl"


    // $ANTLR start "rule__Composition__Group__2"
    // InternalMyDsl.g:993:1: rule__Composition__Group__2 : rule__Composition__Group__2__Impl rule__Composition__Group__3 ;
    public final void rule__Composition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:997:1: ( rule__Composition__Group__2__Impl rule__Composition__Group__3 )
            // InternalMyDsl.g:998:2: rule__Composition__Group__2__Impl rule__Composition__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Composition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Composition__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composition__Group__2"


    // $ANTLR start "rule__Composition__Group__2__Impl"
    // InternalMyDsl.g:1005:1: rule__Composition__Group__2__Impl : ( '[' ) ;
    public final void rule__Composition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1009:1: ( ( '[' ) )
            // InternalMyDsl.g:1010:1: ( '[' )
            {
            // InternalMyDsl.g:1010:1: ( '[' )
            // InternalMyDsl.g:1011:2: '['
            {
             before(grammarAccess.getCompositionAccess().getLeftSquareBracketKeyword_2()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getCompositionAccess().getLeftSquareBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composition__Group__2__Impl"


    // $ANTLR start "rule__Composition__Group__3"
    // InternalMyDsl.g:1020:1: rule__Composition__Group__3 : rule__Composition__Group__3__Impl rule__Composition__Group__4 ;
    public final void rule__Composition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1024:1: ( rule__Composition__Group__3__Impl rule__Composition__Group__4 )
            // InternalMyDsl.g:1025:2: rule__Composition__Group__3__Impl rule__Composition__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__Composition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Composition__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composition__Group__3"


    // $ANTLR start "rule__Composition__Group__3__Impl"
    // InternalMyDsl.g:1032:1: rule__Composition__Group__3__Impl : ( ( rule__Composition__Group_3__0 )? ) ;
    public final void rule__Composition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1036:1: ( ( ( rule__Composition__Group_3__0 )? ) )
            // InternalMyDsl.g:1037:1: ( ( rule__Composition__Group_3__0 )? )
            {
            // InternalMyDsl.g:1037:1: ( ( rule__Composition__Group_3__0 )? )
            // InternalMyDsl.g:1038:2: ( rule__Composition__Group_3__0 )?
            {
             before(grammarAccess.getCompositionAccess().getGroup_3()); 
            // InternalMyDsl.g:1039:2: ( rule__Composition__Group_3__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==50) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalMyDsl.g:1039:3: rule__Composition__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Composition__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCompositionAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composition__Group__3__Impl"


    // $ANTLR start "rule__Composition__Group__4"
    // InternalMyDsl.g:1047:1: rule__Composition__Group__4 : rule__Composition__Group__4__Impl rule__Composition__Group__5 ;
    public final void rule__Composition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1051:1: ( rule__Composition__Group__4__Impl rule__Composition__Group__5 )
            // InternalMyDsl.g:1052:2: rule__Composition__Group__4__Impl rule__Composition__Group__5
            {
            pushFollow(FOLLOW_5);
            rule__Composition__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Composition__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composition__Group__4"


    // $ANTLR start "rule__Composition__Group__4__Impl"
    // InternalMyDsl.g:1059:1: rule__Composition__Group__4__Impl : ( ( rule__Composition__Group_4__0 )? ) ;
    public final void rule__Composition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1063:1: ( ( ( rule__Composition__Group_4__0 )? ) )
            // InternalMyDsl.g:1064:1: ( ( rule__Composition__Group_4__0 )? )
            {
            // InternalMyDsl.g:1064:1: ( ( rule__Composition__Group_4__0 )? )
            // InternalMyDsl.g:1065:2: ( rule__Composition__Group_4__0 )?
            {
             before(grammarAccess.getCompositionAccess().getGroup_4()); 
            // InternalMyDsl.g:1066:2: ( rule__Composition__Group_4__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==51) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalMyDsl.g:1066:3: rule__Composition__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Composition__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCompositionAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composition__Group__4__Impl"


    // $ANTLR start "rule__Composition__Group__5"
    // InternalMyDsl.g:1074:1: rule__Composition__Group__5 : rule__Composition__Group__5__Impl rule__Composition__Group__6 ;
    public final void rule__Composition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1078:1: ( rule__Composition__Group__5__Impl rule__Composition__Group__6 )
            // InternalMyDsl.g:1079:2: rule__Composition__Group__5__Impl rule__Composition__Group__6
            {
            pushFollow(FOLLOW_5);
            rule__Composition__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Composition__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composition__Group__5"


    // $ANTLR start "rule__Composition__Group__5__Impl"
    // InternalMyDsl.g:1086:1: rule__Composition__Group__5__Impl : ( ( rule__Composition__Group_5__0 )? ) ;
    public final void rule__Composition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1090:1: ( ( ( rule__Composition__Group_5__0 )? ) )
            // InternalMyDsl.g:1091:1: ( ( rule__Composition__Group_5__0 )? )
            {
            // InternalMyDsl.g:1091:1: ( ( rule__Composition__Group_5__0 )? )
            // InternalMyDsl.g:1092:2: ( rule__Composition__Group_5__0 )?
            {
             before(grammarAccess.getCompositionAccess().getGroup_5()); 
            // InternalMyDsl.g:1093:2: ( rule__Composition__Group_5__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==52) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalMyDsl.g:1093:3: rule__Composition__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Composition__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCompositionAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composition__Group__5__Impl"


    // $ANTLR start "rule__Composition__Group__6"
    // InternalMyDsl.g:1101:1: rule__Composition__Group__6 : rule__Composition__Group__6__Impl rule__Composition__Group__7 ;
    public final void rule__Composition__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1105:1: ( rule__Composition__Group__6__Impl rule__Composition__Group__7 )
            // InternalMyDsl.g:1106:2: rule__Composition__Group__6__Impl rule__Composition__Group__7
            {
            pushFollow(FOLLOW_5);
            rule__Composition__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Composition__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composition__Group__6"


    // $ANTLR start "rule__Composition__Group__6__Impl"
    // InternalMyDsl.g:1113:1: rule__Composition__Group__6__Impl : ( ( rule__Composition__Group_6__0 )? ) ;
    public final void rule__Composition__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1117:1: ( ( ( rule__Composition__Group_6__0 )? ) )
            // InternalMyDsl.g:1118:1: ( ( rule__Composition__Group_6__0 )? )
            {
            // InternalMyDsl.g:1118:1: ( ( rule__Composition__Group_6__0 )? )
            // InternalMyDsl.g:1119:2: ( rule__Composition__Group_6__0 )?
            {
             before(grammarAccess.getCompositionAccess().getGroup_6()); 
            // InternalMyDsl.g:1120:2: ( rule__Composition__Group_6__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==53) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalMyDsl.g:1120:3: rule__Composition__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Composition__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCompositionAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composition__Group__6__Impl"


    // $ANTLR start "rule__Composition__Group__7"
    // InternalMyDsl.g:1128:1: rule__Composition__Group__7 : rule__Composition__Group__7__Impl rule__Composition__Group__8 ;
    public final void rule__Composition__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1132:1: ( rule__Composition__Group__7__Impl rule__Composition__Group__8 )
            // InternalMyDsl.g:1133:2: rule__Composition__Group__7__Impl rule__Composition__Group__8
            {
            pushFollow(FOLLOW_5);
            rule__Composition__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Composition__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composition__Group__7"


    // $ANTLR start "rule__Composition__Group__7__Impl"
    // InternalMyDsl.g:1140:1: rule__Composition__Group__7__Impl : ( ( rule__Composition__Group_7__0 )? ) ;
    public final void rule__Composition__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1144:1: ( ( ( rule__Composition__Group_7__0 )? ) )
            // InternalMyDsl.g:1145:1: ( ( rule__Composition__Group_7__0 )? )
            {
            // InternalMyDsl.g:1145:1: ( ( rule__Composition__Group_7__0 )? )
            // InternalMyDsl.g:1146:2: ( rule__Composition__Group_7__0 )?
            {
             before(grammarAccess.getCompositionAccess().getGroup_7()); 
            // InternalMyDsl.g:1147:2: ( rule__Composition__Group_7__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==54) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalMyDsl.g:1147:3: rule__Composition__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Composition__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCompositionAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composition__Group__7__Impl"


    // $ANTLR start "rule__Composition__Group__8"
    // InternalMyDsl.g:1155:1: rule__Composition__Group__8 : rule__Composition__Group__8__Impl rule__Composition__Group__9 ;
    public final void rule__Composition__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1159:1: ( rule__Composition__Group__8__Impl rule__Composition__Group__9 )
            // InternalMyDsl.g:1160:2: rule__Composition__Group__8__Impl rule__Composition__Group__9
            {
            pushFollow(FOLLOW_5);
            rule__Composition__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Composition__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composition__Group__8"


    // $ANTLR start "rule__Composition__Group__8__Impl"
    // InternalMyDsl.g:1167:1: rule__Composition__Group__8__Impl : ( ( rule__Composition__Group_8__0 )? ) ;
    public final void rule__Composition__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1171:1: ( ( ( rule__Composition__Group_8__0 )? ) )
            // InternalMyDsl.g:1172:1: ( ( rule__Composition__Group_8__0 )? )
            {
            // InternalMyDsl.g:1172:1: ( ( rule__Composition__Group_8__0 )? )
            // InternalMyDsl.g:1173:2: ( rule__Composition__Group_8__0 )?
            {
             before(grammarAccess.getCompositionAccess().getGroup_8()); 
            // InternalMyDsl.g:1174:2: ( rule__Composition__Group_8__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==56) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalMyDsl.g:1174:3: rule__Composition__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Composition__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCompositionAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composition__Group__8__Impl"


    // $ANTLR start "rule__Composition__Group__9"
    // InternalMyDsl.g:1182:1: rule__Composition__Group__9 : rule__Composition__Group__9__Impl rule__Composition__Group__10 ;
    public final void rule__Composition__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1186:1: ( rule__Composition__Group__9__Impl rule__Composition__Group__10 )
            // InternalMyDsl.g:1187:2: rule__Composition__Group__9__Impl rule__Composition__Group__10
            {
            pushFollow(FOLLOW_5);
            rule__Composition__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Composition__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composition__Group__9"


    // $ANTLR start "rule__Composition__Group__9__Impl"
    // InternalMyDsl.g:1194:1: rule__Composition__Group__9__Impl : ( ( rule__Composition__Group_9__0 )? ) ;
    public final void rule__Composition__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1198:1: ( ( ( rule__Composition__Group_9__0 )? ) )
            // InternalMyDsl.g:1199:1: ( ( rule__Composition__Group_9__0 )? )
            {
            // InternalMyDsl.g:1199:1: ( ( rule__Composition__Group_9__0 )? )
            // InternalMyDsl.g:1200:2: ( rule__Composition__Group_9__0 )?
            {
             before(grammarAccess.getCompositionAccess().getGroup_9()); 
            // InternalMyDsl.g:1201:2: ( rule__Composition__Group_9__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==57) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalMyDsl.g:1201:3: rule__Composition__Group_9__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Composition__Group_9__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCompositionAccess().getGroup_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composition__Group__9__Impl"


    // $ANTLR start "rule__Composition__Group__10"
    // InternalMyDsl.g:1209:1: rule__Composition__Group__10 : rule__Composition__Group__10__Impl ;
    public final void rule__Composition__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1213:1: ( rule__Composition__Group__10__Impl )
            // InternalMyDsl.g:1214:2: rule__Composition__Group__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Composition__Group__10__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composition__Group__10"


    // $ANTLR start "rule__Composition__Group__10__Impl"
    // InternalMyDsl.g:1220:1: rule__Composition__Group__10__Impl : ( ']' ) ;
    public final void rule__Composition__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1224:1: ( ( ']' ) )
            // InternalMyDsl.g:1225:1: ( ']' )
            {
            // InternalMyDsl.g:1225:1: ( ']' )
            // InternalMyDsl.g:1226:2: ']'
            {
             before(grammarAccess.getCompositionAccess().getRightSquareBracketKeyword_10()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getCompositionAccess().getRightSquareBracketKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composition__Group__10__Impl"


    // $ANTLR start "rule__Composition__Group_3__0"
    // InternalMyDsl.g:1236:1: rule__Composition__Group_3__0 : rule__Composition__Group_3__0__Impl rule__Composition__Group_3__1 ;
    public final void rule__Composition__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1240:1: ( rule__Composition__Group_3__0__Impl rule__Composition__Group_3__1 )
            // InternalMyDsl.g:1241:2: rule__Composition__Group_3__0__Impl rule__Composition__Group_3__1
            {
            pushFollow(FOLLOW_6);
            rule__Composition__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Composition__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composition__Group_3__0"


    // $ANTLR start "rule__Composition__Group_3__0__Impl"
    // InternalMyDsl.g:1248:1: rule__Composition__Group_3__0__Impl : ( 'name:' ) ;
    public final void rule__Composition__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1252:1: ( ( 'name:' ) )
            // InternalMyDsl.g:1253:1: ( 'name:' )
            {
            // InternalMyDsl.g:1253:1: ( 'name:' )
            // InternalMyDsl.g:1254:2: 'name:'
            {
             before(grammarAccess.getCompositionAccess().getNameKeyword_3_0()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getCompositionAccess().getNameKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composition__Group_3__0__Impl"


    // $ANTLR start "rule__Composition__Group_3__1"
    // InternalMyDsl.g:1263:1: rule__Composition__Group_3__1 : rule__Composition__Group_3__1__Impl ;
    public final void rule__Composition__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1267:1: ( rule__Composition__Group_3__1__Impl )
            // InternalMyDsl.g:1268:2: rule__Composition__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Composition__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composition__Group_3__1"


    // $ANTLR start "rule__Composition__Group_3__1__Impl"
    // InternalMyDsl.g:1274:1: rule__Composition__Group_3__1__Impl : ( ( rule__Composition__NameAssignment_3_1 ) ) ;
    public final void rule__Composition__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1278:1: ( ( ( rule__Composition__NameAssignment_3_1 ) ) )
            // InternalMyDsl.g:1279:1: ( ( rule__Composition__NameAssignment_3_1 ) )
            {
            // InternalMyDsl.g:1279:1: ( ( rule__Composition__NameAssignment_3_1 ) )
            // InternalMyDsl.g:1280:2: ( rule__Composition__NameAssignment_3_1 )
            {
             before(grammarAccess.getCompositionAccess().getNameAssignment_3_1()); 
            // InternalMyDsl.g:1281:2: ( rule__Composition__NameAssignment_3_1 )
            // InternalMyDsl.g:1281:3: rule__Composition__NameAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Composition__NameAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getCompositionAccess().getNameAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composition__Group_3__1__Impl"


    // $ANTLR start "rule__Composition__Group_4__0"
    // InternalMyDsl.g:1290:1: rule__Composition__Group_4__0 : rule__Composition__Group_4__0__Impl rule__Composition__Group_4__1 ;
    public final void rule__Composition__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1294:1: ( rule__Composition__Group_4__0__Impl rule__Composition__Group_4__1 )
            // InternalMyDsl.g:1295:2: rule__Composition__Group_4__0__Impl rule__Composition__Group_4__1
            {
            pushFollow(FOLLOW_6);
            rule__Composition__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Composition__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composition__Group_4__0"


    // $ANTLR start "rule__Composition__Group_4__0__Impl"
    // InternalMyDsl.g:1302:1: rule__Composition__Group_4__0__Impl : ( 'author:' ) ;
    public final void rule__Composition__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1306:1: ( ( 'author:' ) )
            // InternalMyDsl.g:1307:1: ( 'author:' )
            {
            // InternalMyDsl.g:1307:1: ( 'author:' )
            // InternalMyDsl.g:1308:2: 'author:'
            {
             before(grammarAccess.getCompositionAccess().getAuthorKeyword_4_0()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getCompositionAccess().getAuthorKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composition__Group_4__0__Impl"


    // $ANTLR start "rule__Composition__Group_4__1"
    // InternalMyDsl.g:1317:1: rule__Composition__Group_4__1 : rule__Composition__Group_4__1__Impl ;
    public final void rule__Composition__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1321:1: ( rule__Composition__Group_4__1__Impl )
            // InternalMyDsl.g:1322:2: rule__Composition__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Composition__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composition__Group_4__1"


    // $ANTLR start "rule__Composition__Group_4__1__Impl"
    // InternalMyDsl.g:1328:1: rule__Composition__Group_4__1__Impl : ( ( rule__Composition__AuthorAssignment_4_1 ) ) ;
    public final void rule__Composition__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1332:1: ( ( ( rule__Composition__AuthorAssignment_4_1 ) ) )
            // InternalMyDsl.g:1333:1: ( ( rule__Composition__AuthorAssignment_4_1 ) )
            {
            // InternalMyDsl.g:1333:1: ( ( rule__Composition__AuthorAssignment_4_1 ) )
            // InternalMyDsl.g:1334:2: ( rule__Composition__AuthorAssignment_4_1 )
            {
             before(grammarAccess.getCompositionAccess().getAuthorAssignment_4_1()); 
            // InternalMyDsl.g:1335:2: ( rule__Composition__AuthorAssignment_4_1 )
            // InternalMyDsl.g:1335:3: rule__Composition__AuthorAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Composition__AuthorAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getCompositionAccess().getAuthorAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composition__Group_4__1__Impl"


    // $ANTLR start "rule__Composition__Group_5__0"
    // InternalMyDsl.g:1344:1: rule__Composition__Group_5__0 : rule__Composition__Group_5__0__Impl rule__Composition__Group_5__1 ;
    public final void rule__Composition__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1348:1: ( rule__Composition__Group_5__0__Impl rule__Composition__Group_5__1 )
            // InternalMyDsl.g:1349:2: rule__Composition__Group_5__0__Impl rule__Composition__Group_5__1
            {
            pushFollow(FOLLOW_6);
            rule__Composition__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Composition__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composition__Group_5__0"


    // $ANTLR start "rule__Composition__Group_5__0__Impl"
    // InternalMyDsl.g:1356:1: rule__Composition__Group_5__0__Impl : ( 'instrument:' ) ;
    public final void rule__Composition__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1360:1: ( ( 'instrument:' ) )
            // InternalMyDsl.g:1361:1: ( 'instrument:' )
            {
            // InternalMyDsl.g:1361:1: ( 'instrument:' )
            // InternalMyDsl.g:1362:2: 'instrument:'
            {
             before(grammarAccess.getCompositionAccess().getInstrumentKeyword_5_0()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getCompositionAccess().getInstrumentKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composition__Group_5__0__Impl"


    // $ANTLR start "rule__Composition__Group_5__1"
    // InternalMyDsl.g:1371:1: rule__Composition__Group_5__1 : rule__Composition__Group_5__1__Impl ;
    public final void rule__Composition__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1375:1: ( rule__Composition__Group_5__1__Impl )
            // InternalMyDsl.g:1376:2: rule__Composition__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Composition__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composition__Group_5__1"


    // $ANTLR start "rule__Composition__Group_5__1__Impl"
    // InternalMyDsl.g:1382:1: rule__Composition__Group_5__1__Impl : ( ( rule__Composition__InstrumentAssignment_5_1 ) ) ;
    public final void rule__Composition__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1386:1: ( ( ( rule__Composition__InstrumentAssignment_5_1 ) ) )
            // InternalMyDsl.g:1387:1: ( ( rule__Composition__InstrumentAssignment_5_1 ) )
            {
            // InternalMyDsl.g:1387:1: ( ( rule__Composition__InstrumentAssignment_5_1 ) )
            // InternalMyDsl.g:1388:2: ( rule__Composition__InstrumentAssignment_5_1 )
            {
             before(grammarAccess.getCompositionAccess().getInstrumentAssignment_5_1()); 
            // InternalMyDsl.g:1389:2: ( rule__Composition__InstrumentAssignment_5_1 )
            // InternalMyDsl.g:1389:3: rule__Composition__InstrumentAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Composition__InstrumentAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getCompositionAccess().getInstrumentAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composition__Group_5__1__Impl"


    // $ANTLR start "rule__Composition__Group_6__0"
    // InternalMyDsl.g:1398:1: rule__Composition__Group_6__0 : rule__Composition__Group_6__0__Impl rule__Composition__Group_6__1 ;
    public final void rule__Composition__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1402:1: ( rule__Composition__Group_6__0__Impl rule__Composition__Group_6__1 )
            // InternalMyDsl.g:1403:2: rule__Composition__Group_6__0__Impl rule__Composition__Group_6__1
            {
            pushFollow(FOLLOW_6);
            rule__Composition__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Composition__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composition__Group_6__0"


    // $ANTLR start "rule__Composition__Group_6__0__Impl"
    // InternalMyDsl.g:1410:1: rule__Composition__Group_6__0__Impl : ( 'tonality:' ) ;
    public final void rule__Composition__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1414:1: ( ( 'tonality:' ) )
            // InternalMyDsl.g:1415:1: ( 'tonality:' )
            {
            // InternalMyDsl.g:1415:1: ( 'tonality:' )
            // InternalMyDsl.g:1416:2: 'tonality:'
            {
             before(grammarAccess.getCompositionAccess().getTonalityKeyword_6_0()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getCompositionAccess().getTonalityKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composition__Group_6__0__Impl"


    // $ANTLR start "rule__Composition__Group_6__1"
    // InternalMyDsl.g:1425:1: rule__Composition__Group_6__1 : rule__Composition__Group_6__1__Impl ;
    public final void rule__Composition__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1429:1: ( rule__Composition__Group_6__1__Impl )
            // InternalMyDsl.g:1430:2: rule__Composition__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Composition__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composition__Group_6__1"


    // $ANTLR start "rule__Composition__Group_6__1__Impl"
    // InternalMyDsl.g:1436:1: rule__Composition__Group_6__1__Impl : ( ( rule__Composition__TonalityAssignment_6_1 ) ) ;
    public final void rule__Composition__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1440:1: ( ( ( rule__Composition__TonalityAssignment_6_1 ) ) )
            // InternalMyDsl.g:1441:1: ( ( rule__Composition__TonalityAssignment_6_1 ) )
            {
            // InternalMyDsl.g:1441:1: ( ( rule__Composition__TonalityAssignment_6_1 ) )
            // InternalMyDsl.g:1442:2: ( rule__Composition__TonalityAssignment_6_1 )
            {
             before(grammarAccess.getCompositionAccess().getTonalityAssignment_6_1()); 
            // InternalMyDsl.g:1443:2: ( rule__Composition__TonalityAssignment_6_1 )
            // InternalMyDsl.g:1443:3: rule__Composition__TonalityAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Composition__TonalityAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getCompositionAccess().getTonalityAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composition__Group_6__1__Impl"


    // $ANTLR start "rule__Composition__Group_7__0"
    // InternalMyDsl.g:1452:1: rule__Composition__Group_7__0 : rule__Composition__Group_7__0__Impl rule__Composition__Group_7__1 ;
    public final void rule__Composition__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1456:1: ( rule__Composition__Group_7__0__Impl rule__Composition__Group_7__1 )
            // InternalMyDsl.g:1457:2: rule__Composition__Group_7__0__Impl rule__Composition__Group_7__1
            {
            pushFollow(FOLLOW_7);
            rule__Composition__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Composition__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composition__Group_7__0"


    // $ANTLR start "rule__Composition__Group_7__0__Impl"
    // InternalMyDsl.g:1464:1: rule__Composition__Group_7__0__Impl : ( 'soundTempo:' ) ;
    public final void rule__Composition__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1468:1: ( ( 'soundTempo:' ) )
            // InternalMyDsl.g:1469:1: ( 'soundTempo:' )
            {
            // InternalMyDsl.g:1469:1: ( 'soundTempo:' )
            // InternalMyDsl.g:1470:2: 'soundTempo:'
            {
             before(grammarAccess.getCompositionAccess().getSoundTempoKeyword_7_0()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getCompositionAccess().getSoundTempoKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composition__Group_7__0__Impl"


    // $ANTLR start "rule__Composition__Group_7__1"
    // InternalMyDsl.g:1479:1: rule__Composition__Group_7__1 : rule__Composition__Group_7__1__Impl ;
    public final void rule__Composition__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1483:1: ( rule__Composition__Group_7__1__Impl )
            // InternalMyDsl.g:1484:2: rule__Composition__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Composition__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composition__Group_7__1"


    // $ANTLR start "rule__Composition__Group_7__1__Impl"
    // InternalMyDsl.g:1490:1: rule__Composition__Group_7__1__Impl : ( ( rule__Composition__SoundTempoAssignment_7_1 ) ) ;
    public final void rule__Composition__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1494:1: ( ( ( rule__Composition__SoundTempoAssignment_7_1 ) ) )
            // InternalMyDsl.g:1495:1: ( ( rule__Composition__SoundTempoAssignment_7_1 ) )
            {
            // InternalMyDsl.g:1495:1: ( ( rule__Composition__SoundTempoAssignment_7_1 ) )
            // InternalMyDsl.g:1496:2: ( rule__Composition__SoundTempoAssignment_7_1 )
            {
             before(grammarAccess.getCompositionAccess().getSoundTempoAssignment_7_1()); 
            // InternalMyDsl.g:1497:2: ( rule__Composition__SoundTempoAssignment_7_1 )
            // InternalMyDsl.g:1497:3: rule__Composition__SoundTempoAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__Composition__SoundTempoAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getCompositionAccess().getSoundTempoAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composition__Group_7__1__Impl"


    // $ANTLR start "rule__Composition__Group_8__0"
    // InternalMyDsl.g:1506:1: rule__Composition__Group_8__0 : rule__Composition__Group_8__0__Impl rule__Composition__Group_8__1 ;
    public final void rule__Composition__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1510:1: ( rule__Composition__Group_8__0__Impl rule__Composition__Group_8__1 )
            // InternalMyDsl.g:1511:2: rule__Composition__Group_8__0__Impl rule__Composition__Group_8__1
            {
            pushFollow(FOLLOW_8);
            rule__Composition__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Composition__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composition__Group_8__0"


    // $ANTLR start "rule__Composition__Group_8__0__Impl"
    // InternalMyDsl.g:1518:1: rule__Composition__Group_8__0__Impl : ( ( rule__Composition__BracketAssignment_8_0 ) ) ;
    public final void rule__Composition__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1522:1: ( ( ( rule__Composition__BracketAssignment_8_0 ) ) )
            // InternalMyDsl.g:1523:1: ( ( rule__Composition__BracketAssignment_8_0 ) )
            {
            // InternalMyDsl.g:1523:1: ( ( rule__Composition__BracketAssignment_8_0 ) )
            // InternalMyDsl.g:1524:2: ( rule__Composition__BracketAssignment_8_0 )
            {
             before(grammarAccess.getCompositionAccess().getBracketAssignment_8_0()); 
            // InternalMyDsl.g:1525:2: ( rule__Composition__BracketAssignment_8_0 )
            // InternalMyDsl.g:1525:3: rule__Composition__BracketAssignment_8_0
            {
            pushFollow(FOLLOW_2);
            rule__Composition__BracketAssignment_8_0();

            state._fsp--;


            }

             after(grammarAccess.getCompositionAccess().getBracketAssignment_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composition__Group_8__0__Impl"


    // $ANTLR start "rule__Composition__Group_8__1"
    // InternalMyDsl.g:1533:1: rule__Composition__Group_8__1 : rule__Composition__Group_8__1__Impl ;
    public final void rule__Composition__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1537:1: ( rule__Composition__Group_8__1__Impl )
            // InternalMyDsl.g:1538:2: rule__Composition__Group_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Composition__Group_8__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composition__Group_8__1"


    // $ANTLR start "rule__Composition__Group_8__1__Impl"
    // InternalMyDsl.g:1544:1: rule__Composition__Group_8__1__Impl : ( ( rule__Composition__Group_8_1__0 )* ) ;
    public final void rule__Composition__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1548:1: ( ( ( rule__Composition__Group_8_1__0 )* ) )
            // InternalMyDsl.g:1549:1: ( ( rule__Composition__Group_8_1__0 )* )
            {
            // InternalMyDsl.g:1549:1: ( ( rule__Composition__Group_8_1__0 )* )
            // InternalMyDsl.g:1550:2: ( rule__Composition__Group_8_1__0 )*
            {
             before(grammarAccess.getCompositionAccess().getGroup_8_1()); 
            // InternalMyDsl.g:1551:2: ( rule__Composition__Group_8_1__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==55) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalMyDsl.g:1551:3: rule__Composition__Group_8_1__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Composition__Group_8_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getCompositionAccess().getGroup_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composition__Group_8__1__Impl"


    // $ANTLR start "rule__Composition__Group_8_1__0"
    // InternalMyDsl.g:1560:1: rule__Composition__Group_8_1__0 : rule__Composition__Group_8_1__0__Impl rule__Composition__Group_8_1__1 ;
    public final void rule__Composition__Group_8_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1564:1: ( rule__Composition__Group_8_1__0__Impl rule__Composition__Group_8_1__1 )
            // InternalMyDsl.g:1565:2: rule__Composition__Group_8_1__0__Impl rule__Composition__Group_8_1__1
            {
            pushFollow(FOLLOW_10);
            rule__Composition__Group_8_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Composition__Group_8_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composition__Group_8_1__0"


    // $ANTLR start "rule__Composition__Group_8_1__0__Impl"
    // InternalMyDsl.g:1572:1: rule__Composition__Group_8_1__0__Impl : ( ',' ) ;
    public final void rule__Composition__Group_8_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1576:1: ( ( ',' ) )
            // InternalMyDsl.g:1577:1: ( ',' )
            {
            // InternalMyDsl.g:1577:1: ( ',' )
            // InternalMyDsl.g:1578:2: ','
            {
             before(grammarAccess.getCompositionAccess().getCommaKeyword_8_1_0()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getCompositionAccess().getCommaKeyword_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composition__Group_8_1__0__Impl"


    // $ANTLR start "rule__Composition__Group_8_1__1"
    // InternalMyDsl.g:1587:1: rule__Composition__Group_8_1__1 : rule__Composition__Group_8_1__1__Impl ;
    public final void rule__Composition__Group_8_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1591:1: ( rule__Composition__Group_8_1__1__Impl )
            // InternalMyDsl.g:1592:2: rule__Composition__Group_8_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Composition__Group_8_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composition__Group_8_1__1"


    // $ANTLR start "rule__Composition__Group_8_1__1__Impl"
    // InternalMyDsl.g:1598:1: rule__Composition__Group_8_1__1__Impl : ( ( rule__Composition__BracketAssignment_8_1_1 ) ) ;
    public final void rule__Composition__Group_8_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1602:1: ( ( ( rule__Composition__BracketAssignment_8_1_1 ) ) )
            // InternalMyDsl.g:1603:1: ( ( rule__Composition__BracketAssignment_8_1_1 ) )
            {
            // InternalMyDsl.g:1603:1: ( ( rule__Composition__BracketAssignment_8_1_1 ) )
            // InternalMyDsl.g:1604:2: ( rule__Composition__BracketAssignment_8_1_1 )
            {
             before(grammarAccess.getCompositionAccess().getBracketAssignment_8_1_1()); 
            // InternalMyDsl.g:1605:2: ( rule__Composition__BracketAssignment_8_1_1 )
            // InternalMyDsl.g:1605:3: rule__Composition__BracketAssignment_8_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Composition__BracketAssignment_8_1_1();

            state._fsp--;


            }

             after(grammarAccess.getCompositionAccess().getBracketAssignment_8_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composition__Group_8_1__1__Impl"


    // $ANTLR start "rule__Composition__Group_9__0"
    // InternalMyDsl.g:1614:1: rule__Composition__Group_9__0 : rule__Composition__Group_9__0__Impl rule__Composition__Group_9__1 ;
    public final void rule__Composition__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1618:1: ( rule__Composition__Group_9__0__Impl rule__Composition__Group_9__1 )
            // InternalMyDsl.g:1619:2: rule__Composition__Group_9__0__Impl rule__Composition__Group_9__1
            {
            pushFollow(FOLLOW_8);
            rule__Composition__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Composition__Group_9__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composition__Group_9__0"


    // $ANTLR start "rule__Composition__Group_9__0__Impl"
    // InternalMyDsl.g:1626:1: rule__Composition__Group_9__0__Impl : ( ( rule__Composition__StaffAssignment_9_0 ) ) ;
    public final void rule__Composition__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1630:1: ( ( ( rule__Composition__StaffAssignment_9_0 ) ) )
            // InternalMyDsl.g:1631:1: ( ( rule__Composition__StaffAssignment_9_0 ) )
            {
            // InternalMyDsl.g:1631:1: ( ( rule__Composition__StaffAssignment_9_0 ) )
            // InternalMyDsl.g:1632:2: ( rule__Composition__StaffAssignment_9_0 )
            {
             before(grammarAccess.getCompositionAccess().getStaffAssignment_9_0()); 
            // InternalMyDsl.g:1633:2: ( rule__Composition__StaffAssignment_9_0 )
            // InternalMyDsl.g:1633:3: rule__Composition__StaffAssignment_9_0
            {
            pushFollow(FOLLOW_2);
            rule__Composition__StaffAssignment_9_0();

            state._fsp--;


            }

             after(grammarAccess.getCompositionAccess().getStaffAssignment_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composition__Group_9__0__Impl"


    // $ANTLR start "rule__Composition__Group_9__1"
    // InternalMyDsl.g:1641:1: rule__Composition__Group_9__1 : rule__Composition__Group_9__1__Impl ;
    public final void rule__Composition__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1645:1: ( rule__Composition__Group_9__1__Impl )
            // InternalMyDsl.g:1646:2: rule__Composition__Group_9__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Composition__Group_9__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composition__Group_9__1"


    // $ANTLR start "rule__Composition__Group_9__1__Impl"
    // InternalMyDsl.g:1652:1: rule__Composition__Group_9__1__Impl : ( ( rule__Composition__Group_9_1__0 )* ) ;
    public final void rule__Composition__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1656:1: ( ( ( rule__Composition__Group_9_1__0 )* ) )
            // InternalMyDsl.g:1657:1: ( ( rule__Composition__Group_9_1__0 )* )
            {
            // InternalMyDsl.g:1657:1: ( ( rule__Composition__Group_9_1__0 )* )
            // InternalMyDsl.g:1658:2: ( rule__Composition__Group_9_1__0 )*
            {
             before(grammarAccess.getCompositionAccess().getGroup_9_1()); 
            // InternalMyDsl.g:1659:2: ( rule__Composition__Group_9_1__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==55) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalMyDsl.g:1659:3: rule__Composition__Group_9_1__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Composition__Group_9_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getCompositionAccess().getGroup_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composition__Group_9__1__Impl"


    // $ANTLR start "rule__Composition__Group_9_1__0"
    // InternalMyDsl.g:1668:1: rule__Composition__Group_9_1__0 : rule__Composition__Group_9_1__0__Impl rule__Composition__Group_9_1__1 ;
    public final void rule__Composition__Group_9_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1672:1: ( rule__Composition__Group_9_1__0__Impl rule__Composition__Group_9_1__1 )
            // InternalMyDsl.g:1673:2: rule__Composition__Group_9_1__0__Impl rule__Composition__Group_9_1__1
            {
            pushFollow(FOLLOW_11);
            rule__Composition__Group_9_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Composition__Group_9_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composition__Group_9_1__0"


    // $ANTLR start "rule__Composition__Group_9_1__0__Impl"
    // InternalMyDsl.g:1680:1: rule__Composition__Group_9_1__0__Impl : ( ',' ) ;
    public final void rule__Composition__Group_9_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1684:1: ( ( ',' ) )
            // InternalMyDsl.g:1685:1: ( ',' )
            {
            // InternalMyDsl.g:1685:1: ( ',' )
            // InternalMyDsl.g:1686:2: ','
            {
             before(grammarAccess.getCompositionAccess().getCommaKeyword_9_1_0()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getCompositionAccess().getCommaKeyword_9_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composition__Group_9_1__0__Impl"


    // $ANTLR start "rule__Composition__Group_9_1__1"
    // InternalMyDsl.g:1695:1: rule__Composition__Group_9_1__1 : rule__Composition__Group_9_1__1__Impl ;
    public final void rule__Composition__Group_9_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1699:1: ( rule__Composition__Group_9_1__1__Impl )
            // InternalMyDsl.g:1700:2: rule__Composition__Group_9_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Composition__Group_9_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composition__Group_9_1__1"


    // $ANTLR start "rule__Composition__Group_9_1__1__Impl"
    // InternalMyDsl.g:1706:1: rule__Composition__Group_9_1__1__Impl : ( ( rule__Composition__StaffAssignment_9_1_1 ) ) ;
    public final void rule__Composition__Group_9_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1710:1: ( ( ( rule__Composition__StaffAssignment_9_1_1 ) ) )
            // InternalMyDsl.g:1711:1: ( ( rule__Composition__StaffAssignment_9_1_1 ) )
            {
            // InternalMyDsl.g:1711:1: ( ( rule__Composition__StaffAssignment_9_1_1 ) )
            // InternalMyDsl.g:1712:2: ( rule__Composition__StaffAssignment_9_1_1 )
            {
             before(grammarAccess.getCompositionAccess().getStaffAssignment_9_1_1()); 
            // InternalMyDsl.g:1713:2: ( rule__Composition__StaffAssignment_9_1_1 )
            // InternalMyDsl.g:1713:3: rule__Composition__StaffAssignment_9_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Composition__StaffAssignment_9_1_1();

            state._fsp--;


            }

             after(grammarAccess.getCompositionAccess().getStaffAssignment_9_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composition__Group_9_1__1__Impl"


    // $ANTLR start "rule__Bracket__Group__0"
    // InternalMyDsl.g:1722:1: rule__Bracket__Group__0 : rule__Bracket__Group__0__Impl rule__Bracket__Group__1 ;
    public final void rule__Bracket__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1726:1: ( rule__Bracket__Group__0__Impl rule__Bracket__Group__1 )
            // InternalMyDsl.g:1727:2: rule__Bracket__Group__0__Impl rule__Bracket__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__Bracket__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Bracket__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bracket__Group__0"


    // $ANTLR start "rule__Bracket__Group__0__Impl"
    // InternalMyDsl.g:1734:1: rule__Bracket__Group__0__Impl : ( () ) ;
    public final void rule__Bracket__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1738:1: ( ( () ) )
            // InternalMyDsl.g:1739:1: ( () )
            {
            // InternalMyDsl.g:1739:1: ( () )
            // InternalMyDsl.g:1740:2: ()
            {
             before(grammarAccess.getBracketAccess().getBracketAction_0()); 
            // InternalMyDsl.g:1741:2: ()
            // InternalMyDsl.g:1741:3: 
            {
            }

             after(grammarAccess.getBracketAccess().getBracketAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bracket__Group__0__Impl"


    // $ANTLR start "rule__Bracket__Group__1"
    // InternalMyDsl.g:1749:1: rule__Bracket__Group__1 : rule__Bracket__Group__1__Impl rule__Bracket__Group__2 ;
    public final void rule__Bracket__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1753:1: ( rule__Bracket__Group__1__Impl rule__Bracket__Group__2 )
            // InternalMyDsl.g:1754:2: rule__Bracket__Group__1__Impl rule__Bracket__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__Bracket__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Bracket__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bracket__Group__1"


    // $ANTLR start "rule__Bracket__Group__1__Impl"
    // InternalMyDsl.g:1761:1: rule__Bracket__Group__1__Impl : ( 'Bracket' ) ;
    public final void rule__Bracket__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1765:1: ( ( 'Bracket' ) )
            // InternalMyDsl.g:1766:1: ( 'Bracket' )
            {
            // InternalMyDsl.g:1766:1: ( 'Bracket' )
            // InternalMyDsl.g:1767:2: 'Bracket'
            {
             before(grammarAccess.getBracketAccess().getBracketKeyword_1()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getBracketAccess().getBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bracket__Group__1__Impl"


    // $ANTLR start "rule__Bracket__Group__2"
    // InternalMyDsl.g:1776:1: rule__Bracket__Group__2 : rule__Bracket__Group__2__Impl rule__Bracket__Group__3 ;
    public final void rule__Bracket__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1780:1: ( rule__Bracket__Group__2__Impl rule__Bracket__Group__3 )
            // InternalMyDsl.g:1781:2: rule__Bracket__Group__2__Impl rule__Bracket__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__Bracket__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Bracket__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bracket__Group__2"


    // $ANTLR start "rule__Bracket__Group__2__Impl"
    // InternalMyDsl.g:1788:1: rule__Bracket__Group__2__Impl : ( ( rule__Bracket__TypeAssignment_2 )? ) ;
    public final void rule__Bracket__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1792:1: ( ( ( rule__Bracket__TypeAssignment_2 )? ) )
            // InternalMyDsl.g:1793:1: ( ( rule__Bracket__TypeAssignment_2 )? )
            {
            // InternalMyDsl.g:1793:1: ( ( rule__Bracket__TypeAssignment_2 )? )
            // InternalMyDsl.g:1794:2: ( rule__Bracket__TypeAssignment_2 )?
            {
             before(grammarAccess.getBracketAccess().getTypeAssignment_2()); 
            // InternalMyDsl.g:1795:2: ( rule__Bracket__TypeAssignment_2 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>=11 && LA21_0<=12)) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalMyDsl.g:1795:3: rule__Bracket__TypeAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Bracket__TypeAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBracketAccess().getTypeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bracket__Group__2__Impl"


    // $ANTLR start "rule__Bracket__Group__3"
    // InternalMyDsl.g:1803:1: rule__Bracket__Group__3 : rule__Bracket__Group__3__Impl rule__Bracket__Group__4 ;
    public final void rule__Bracket__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1807:1: ( rule__Bracket__Group__3__Impl rule__Bracket__Group__4 )
            // InternalMyDsl.g:1808:2: rule__Bracket__Group__3__Impl rule__Bracket__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__Bracket__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Bracket__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bracket__Group__3"


    // $ANTLR start "rule__Bracket__Group__3__Impl"
    // InternalMyDsl.g:1815:1: rule__Bracket__Group__3__Impl : ( ( rule__Bracket__StavesAssignment_3 ) ) ;
    public final void rule__Bracket__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1819:1: ( ( ( rule__Bracket__StavesAssignment_3 ) ) )
            // InternalMyDsl.g:1820:1: ( ( rule__Bracket__StavesAssignment_3 ) )
            {
            // InternalMyDsl.g:1820:1: ( ( rule__Bracket__StavesAssignment_3 ) )
            // InternalMyDsl.g:1821:2: ( rule__Bracket__StavesAssignment_3 )
            {
             before(grammarAccess.getBracketAccess().getStavesAssignment_3()); 
            // InternalMyDsl.g:1822:2: ( rule__Bracket__StavesAssignment_3 )
            // InternalMyDsl.g:1822:3: rule__Bracket__StavesAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Bracket__StavesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getBracketAccess().getStavesAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bracket__Group__3__Impl"


    // $ANTLR start "rule__Bracket__Group__4"
    // InternalMyDsl.g:1830:1: rule__Bracket__Group__4 : rule__Bracket__Group__4__Impl ;
    public final void rule__Bracket__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1834:1: ( rule__Bracket__Group__4__Impl )
            // InternalMyDsl.g:1835:2: rule__Bracket__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Bracket__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bracket__Group__4"


    // $ANTLR start "rule__Bracket__Group__4__Impl"
    // InternalMyDsl.g:1841:1: rule__Bracket__Group__4__Impl : ( ( rule__Bracket__Group_4__0 )* ) ;
    public final void rule__Bracket__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1845:1: ( ( ( rule__Bracket__Group_4__0 )* ) )
            // InternalMyDsl.g:1846:1: ( ( rule__Bracket__Group_4__0 )* )
            {
            // InternalMyDsl.g:1846:1: ( ( rule__Bracket__Group_4__0 )* )
            // InternalMyDsl.g:1847:2: ( rule__Bracket__Group_4__0 )*
            {
             before(grammarAccess.getBracketAccess().getGroup_4()); 
            // InternalMyDsl.g:1848:2: ( rule__Bracket__Group_4__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==55) ) {
                    int LA22_2 = input.LA(2);

                    if ( (LA22_2==57) ) {
                        alt22=1;
                    }


                }


                switch (alt22) {
            	case 1 :
            	    // InternalMyDsl.g:1848:3: rule__Bracket__Group_4__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Bracket__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getBracketAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bracket__Group__4__Impl"


    // $ANTLR start "rule__Bracket__Group_4__0"
    // InternalMyDsl.g:1857:1: rule__Bracket__Group_4__0 : rule__Bracket__Group_4__0__Impl rule__Bracket__Group_4__1 ;
    public final void rule__Bracket__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1861:1: ( rule__Bracket__Group_4__0__Impl rule__Bracket__Group_4__1 )
            // InternalMyDsl.g:1862:2: rule__Bracket__Group_4__0__Impl rule__Bracket__Group_4__1
            {
            pushFollow(FOLLOW_11);
            rule__Bracket__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Bracket__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bracket__Group_4__0"


    // $ANTLR start "rule__Bracket__Group_4__0__Impl"
    // InternalMyDsl.g:1869:1: rule__Bracket__Group_4__0__Impl : ( ',' ) ;
    public final void rule__Bracket__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1873:1: ( ( ',' ) )
            // InternalMyDsl.g:1874:1: ( ',' )
            {
            // InternalMyDsl.g:1874:1: ( ',' )
            // InternalMyDsl.g:1875:2: ','
            {
             before(grammarAccess.getBracketAccess().getCommaKeyword_4_0()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getBracketAccess().getCommaKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bracket__Group_4__0__Impl"


    // $ANTLR start "rule__Bracket__Group_4__1"
    // InternalMyDsl.g:1884:1: rule__Bracket__Group_4__1 : rule__Bracket__Group_4__1__Impl ;
    public final void rule__Bracket__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1888:1: ( rule__Bracket__Group_4__1__Impl )
            // InternalMyDsl.g:1889:2: rule__Bracket__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Bracket__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bracket__Group_4__1"


    // $ANTLR start "rule__Bracket__Group_4__1__Impl"
    // InternalMyDsl.g:1895:1: rule__Bracket__Group_4__1__Impl : ( ( rule__Bracket__StavesAssignment_4_1 ) ) ;
    public final void rule__Bracket__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1899:1: ( ( ( rule__Bracket__StavesAssignment_4_1 ) ) )
            // InternalMyDsl.g:1900:1: ( ( rule__Bracket__StavesAssignment_4_1 ) )
            {
            // InternalMyDsl.g:1900:1: ( ( rule__Bracket__StavesAssignment_4_1 ) )
            // InternalMyDsl.g:1901:2: ( rule__Bracket__StavesAssignment_4_1 )
            {
             before(grammarAccess.getBracketAccess().getStavesAssignment_4_1()); 
            // InternalMyDsl.g:1902:2: ( rule__Bracket__StavesAssignment_4_1 )
            // InternalMyDsl.g:1902:3: rule__Bracket__StavesAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Bracket__StavesAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getBracketAccess().getStavesAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bracket__Group_4__1__Impl"


    // $ANTLR start "rule__Staff__Group__0"
    // InternalMyDsl.g:1911:1: rule__Staff__Group__0 : rule__Staff__Group__0__Impl rule__Staff__Group__1 ;
    public final void rule__Staff__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1915:1: ( rule__Staff__Group__0__Impl rule__Staff__Group__1 )
            // InternalMyDsl.g:1916:2: rule__Staff__Group__0__Impl rule__Staff__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__Staff__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Staff__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Staff__Group__0"


    // $ANTLR start "rule__Staff__Group__0__Impl"
    // InternalMyDsl.g:1923:1: rule__Staff__Group__0__Impl : ( () ) ;
    public final void rule__Staff__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1927:1: ( ( () ) )
            // InternalMyDsl.g:1928:1: ( () )
            {
            // InternalMyDsl.g:1928:1: ( () )
            // InternalMyDsl.g:1929:2: ()
            {
             before(grammarAccess.getStaffAccess().getStaffAction_0()); 
            // InternalMyDsl.g:1930:2: ()
            // InternalMyDsl.g:1930:3: 
            {
            }

             after(grammarAccess.getStaffAccess().getStaffAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Staff__Group__0__Impl"


    // $ANTLR start "rule__Staff__Group__1"
    // InternalMyDsl.g:1938:1: rule__Staff__Group__1 : rule__Staff__Group__1__Impl rule__Staff__Group__2 ;
    public final void rule__Staff__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1942:1: ( rule__Staff__Group__1__Impl rule__Staff__Group__2 )
            // InternalMyDsl.g:1943:2: rule__Staff__Group__1__Impl rule__Staff__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__Staff__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Staff__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Staff__Group__1"


    // $ANTLR start "rule__Staff__Group__1__Impl"
    // InternalMyDsl.g:1950:1: rule__Staff__Group__1__Impl : ( 'Staff' ) ;
    public final void rule__Staff__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1954:1: ( ( 'Staff' ) )
            // InternalMyDsl.g:1955:1: ( 'Staff' )
            {
            // InternalMyDsl.g:1955:1: ( 'Staff' )
            // InternalMyDsl.g:1956:2: 'Staff'
            {
             before(grammarAccess.getStaffAccess().getStaffKeyword_1()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getStaffAccess().getStaffKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Staff__Group__1__Impl"


    // $ANTLR start "rule__Staff__Group__2"
    // InternalMyDsl.g:1965:1: rule__Staff__Group__2 : rule__Staff__Group__2__Impl rule__Staff__Group__3 ;
    public final void rule__Staff__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1969:1: ( rule__Staff__Group__2__Impl rule__Staff__Group__3 )
            // InternalMyDsl.g:1970:2: rule__Staff__Group__2__Impl rule__Staff__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Staff__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Staff__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Staff__Group__2"


    // $ANTLR start "rule__Staff__Group__2__Impl"
    // InternalMyDsl.g:1977:1: rule__Staff__Group__2__Impl : ( ( rule__Staff__NumberAssignment_2 ) ) ;
    public final void rule__Staff__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1981:1: ( ( ( rule__Staff__NumberAssignment_2 ) ) )
            // InternalMyDsl.g:1982:1: ( ( rule__Staff__NumberAssignment_2 ) )
            {
            // InternalMyDsl.g:1982:1: ( ( rule__Staff__NumberAssignment_2 ) )
            // InternalMyDsl.g:1983:2: ( rule__Staff__NumberAssignment_2 )
            {
             before(grammarAccess.getStaffAccess().getNumberAssignment_2()); 
            // InternalMyDsl.g:1984:2: ( rule__Staff__NumberAssignment_2 )
            // InternalMyDsl.g:1984:3: rule__Staff__NumberAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Staff__NumberAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getStaffAccess().getNumberAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Staff__Group__2__Impl"


    // $ANTLR start "rule__Staff__Group__3"
    // InternalMyDsl.g:1992:1: rule__Staff__Group__3 : rule__Staff__Group__3__Impl rule__Staff__Group__4 ;
    public final void rule__Staff__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1996:1: ( rule__Staff__Group__3__Impl rule__Staff__Group__4 )
            // InternalMyDsl.g:1997:2: rule__Staff__Group__3__Impl rule__Staff__Group__4
            {
            pushFollow(FOLLOW_13);
            rule__Staff__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Staff__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Staff__Group__3"


    // $ANTLR start "rule__Staff__Group__3__Impl"
    // InternalMyDsl.g:2004:1: rule__Staff__Group__3__Impl : ( '[' ) ;
    public final void rule__Staff__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2008:1: ( ( '[' ) )
            // InternalMyDsl.g:2009:1: ( '[' )
            {
            // InternalMyDsl.g:2009:1: ( '[' )
            // InternalMyDsl.g:2010:2: '['
            {
             before(grammarAccess.getStaffAccess().getLeftSquareBracketKeyword_3()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getStaffAccess().getLeftSquareBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Staff__Group__3__Impl"


    // $ANTLR start "rule__Staff__Group__4"
    // InternalMyDsl.g:2019:1: rule__Staff__Group__4 : rule__Staff__Group__4__Impl rule__Staff__Group__5 ;
    public final void rule__Staff__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2023:1: ( rule__Staff__Group__4__Impl rule__Staff__Group__5 )
            // InternalMyDsl.g:2024:2: rule__Staff__Group__4__Impl rule__Staff__Group__5
            {
            pushFollow(FOLLOW_14);
            rule__Staff__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Staff__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Staff__Group__4"


    // $ANTLR start "rule__Staff__Group__4__Impl"
    // InternalMyDsl.g:2031:1: rule__Staff__Group__4__Impl : ( 'Clef:' ) ;
    public final void rule__Staff__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2035:1: ( ( 'Clef:' ) )
            // InternalMyDsl.g:2036:1: ( 'Clef:' )
            {
            // InternalMyDsl.g:2036:1: ( 'Clef:' )
            // InternalMyDsl.g:2037:2: 'Clef:'
            {
             before(grammarAccess.getStaffAccess().getClefKeyword_4()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getStaffAccess().getClefKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Staff__Group__4__Impl"


    // $ANTLR start "rule__Staff__Group__5"
    // InternalMyDsl.g:2046:1: rule__Staff__Group__5 : rule__Staff__Group__5__Impl rule__Staff__Group__6 ;
    public final void rule__Staff__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2050:1: ( rule__Staff__Group__5__Impl rule__Staff__Group__6 )
            // InternalMyDsl.g:2051:2: rule__Staff__Group__5__Impl rule__Staff__Group__6
            {
            pushFollow(FOLLOW_15);
            rule__Staff__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Staff__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Staff__Group__5"


    // $ANTLR start "rule__Staff__Group__5__Impl"
    // InternalMyDsl.g:2058:1: rule__Staff__Group__5__Impl : ( ( rule__Staff__ClefAssignment_5 ) ) ;
    public final void rule__Staff__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2062:1: ( ( ( rule__Staff__ClefAssignment_5 ) ) )
            // InternalMyDsl.g:2063:1: ( ( rule__Staff__ClefAssignment_5 ) )
            {
            // InternalMyDsl.g:2063:1: ( ( rule__Staff__ClefAssignment_5 ) )
            // InternalMyDsl.g:2064:2: ( rule__Staff__ClefAssignment_5 )
            {
             before(grammarAccess.getStaffAccess().getClefAssignment_5()); 
            // InternalMyDsl.g:2065:2: ( rule__Staff__ClefAssignment_5 )
            // InternalMyDsl.g:2065:3: rule__Staff__ClefAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Staff__ClefAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getStaffAccess().getClefAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Staff__Group__5__Impl"


    // $ANTLR start "rule__Staff__Group__6"
    // InternalMyDsl.g:2073:1: rule__Staff__Group__6 : rule__Staff__Group__6__Impl rule__Staff__Group__7 ;
    public final void rule__Staff__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2077:1: ( rule__Staff__Group__6__Impl rule__Staff__Group__7 )
            // InternalMyDsl.g:2078:2: rule__Staff__Group__6__Impl rule__Staff__Group__7
            {
            pushFollow(FOLLOW_16);
            rule__Staff__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Staff__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Staff__Group__6"


    // $ANTLR start "rule__Staff__Group__6__Impl"
    // InternalMyDsl.g:2085:1: rule__Staff__Group__6__Impl : ( 'timeSignature:' ) ;
    public final void rule__Staff__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2089:1: ( ( 'timeSignature:' ) )
            // InternalMyDsl.g:2090:1: ( 'timeSignature:' )
            {
            // InternalMyDsl.g:2090:1: ( 'timeSignature:' )
            // InternalMyDsl.g:2091:2: 'timeSignature:'
            {
             before(grammarAccess.getStaffAccess().getTimeSignatureKeyword_6()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getStaffAccess().getTimeSignatureKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Staff__Group__6__Impl"


    // $ANTLR start "rule__Staff__Group__7"
    // InternalMyDsl.g:2100:1: rule__Staff__Group__7 : rule__Staff__Group__7__Impl rule__Staff__Group__8 ;
    public final void rule__Staff__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2104:1: ( rule__Staff__Group__7__Impl rule__Staff__Group__8 )
            // InternalMyDsl.g:2105:2: rule__Staff__Group__7__Impl rule__Staff__Group__8
            {
            pushFollow(FOLLOW_17);
            rule__Staff__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Staff__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Staff__Group__7"


    // $ANTLR start "rule__Staff__Group__7__Impl"
    // InternalMyDsl.g:2112:1: rule__Staff__Group__7__Impl : ( ( rule__Staff__TimeAssignment_7 ) ) ;
    public final void rule__Staff__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2116:1: ( ( ( rule__Staff__TimeAssignment_7 ) ) )
            // InternalMyDsl.g:2117:1: ( ( rule__Staff__TimeAssignment_7 ) )
            {
            // InternalMyDsl.g:2117:1: ( ( rule__Staff__TimeAssignment_7 ) )
            // InternalMyDsl.g:2118:2: ( rule__Staff__TimeAssignment_7 )
            {
             before(grammarAccess.getStaffAccess().getTimeAssignment_7()); 
            // InternalMyDsl.g:2119:2: ( rule__Staff__TimeAssignment_7 )
            // InternalMyDsl.g:2119:3: rule__Staff__TimeAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Staff__TimeAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getStaffAccess().getTimeAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Staff__Group__7__Impl"


    // $ANTLR start "rule__Staff__Group__8"
    // InternalMyDsl.g:2127:1: rule__Staff__Group__8 : rule__Staff__Group__8__Impl rule__Staff__Group__9 ;
    public final void rule__Staff__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2131:1: ( rule__Staff__Group__8__Impl rule__Staff__Group__9 )
            // InternalMyDsl.g:2132:2: rule__Staff__Group__8__Impl rule__Staff__Group__9
            {
            pushFollow(FOLLOW_4);
            rule__Staff__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Staff__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Staff__Group__8"


    // $ANTLR start "rule__Staff__Group__8__Impl"
    // InternalMyDsl.g:2139:1: rule__Staff__Group__8__Impl : ( 'elements' ) ;
    public final void rule__Staff__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2143:1: ( ( 'elements' ) )
            // InternalMyDsl.g:2144:1: ( 'elements' )
            {
            // InternalMyDsl.g:2144:1: ( 'elements' )
            // InternalMyDsl.g:2145:2: 'elements'
            {
             before(grammarAccess.getStaffAccess().getElementsKeyword_8()); 
            match(input,60,FOLLOW_2); 
             after(grammarAccess.getStaffAccess().getElementsKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Staff__Group__8__Impl"


    // $ANTLR start "rule__Staff__Group__9"
    // InternalMyDsl.g:2154:1: rule__Staff__Group__9 : rule__Staff__Group__9__Impl rule__Staff__Group__10 ;
    public final void rule__Staff__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2158:1: ( rule__Staff__Group__9__Impl rule__Staff__Group__10 )
            // InternalMyDsl.g:2159:2: rule__Staff__Group__9__Impl rule__Staff__Group__10
            {
            pushFollow(FOLLOW_18);
            rule__Staff__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Staff__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Staff__Group__9"


    // $ANTLR start "rule__Staff__Group__9__Impl"
    // InternalMyDsl.g:2166:1: rule__Staff__Group__9__Impl : ( '[' ) ;
    public final void rule__Staff__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2170:1: ( ( '[' ) )
            // InternalMyDsl.g:2171:1: ( '[' )
            {
            // InternalMyDsl.g:2171:1: ( '[' )
            // InternalMyDsl.g:2172:2: '['
            {
             before(grammarAccess.getStaffAccess().getLeftSquareBracketKeyword_9()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getStaffAccess().getLeftSquareBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Staff__Group__9__Impl"


    // $ANTLR start "rule__Staff__Group__10"
    // InternalMyDsl.g:2181:1: rule__Staff__Group__10 : rule__Staff__Group__10__Impl rule__Staff__Group__11 ;
    public final void rule__Staff__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2185:1: ( rule__Staff__Group__10__Impl rule__Staff__Group__11 )
            // InternalMyDsl.g:2186:2: rule__Staff__Group__10__Impl rule__Staff__Group__11
            {
            pushFollow(FOLLOW_19);
            rule__Staff__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Staff__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Staff__Group__10"


    // $ANTLR start "rule__Staff__Group__10__Impl"
    // InternalMyDsl.g:2193:1: rule__Staff__Group__10__Impl : ( ( rule__Staff__ElementsAssignment_10 ) ) ;
    public final void rule__Staff__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2197:1: ( ( ( rule__Staff__ElementsAssignment_10 ) ) )
            // InternalMyDsl.g:2198:1: ( ( rule__Staff__ElementsAssignment_10 ) )
            {
            // InternalMyDsl.g:2198:1: ( ( rule__Staff__ElementsAssignment_10 ) )
            // InternalMyDsl.g:2199:2: ( rule__Staff__ElementsAssignment_10 )
            {
             before(grammarAccess.getStaffAccess().getElementsAssignment_10()); 
            // InternalMyDsl.g:2200:2: ( rule__Staff__ElementsAssignment_10 )
            // InternalMyDsl.g:2200:3: rule__Staff__ElementsAssignment_10
            {
            pushFollow(FOLLOW_2);
            rule__Staff__ElementsAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getStaffAccess().getElementsAssignment_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Staff__Group__10__Impl"


    // $ANTLR start "rule__Staff__Group__11"
    // InternalMyDsl.g:2208:1: rule__Staff__Group__11 : rule__Staff__Group__11__Impl rule__Staff__Group__12 ;
    public final void rule__Staff__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2212:1: ( rule__Staff__Group__11__Impl rule__Staff__Group__12 )
            // InternalMyDsl.g:2213:2: rule__Staff__Group__11__Impl rule__Staff__Group__12
            {
            pushFollow(FOLLOW_19);
            rule__Staff__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Staff__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Staff__Group__11"


    // $ANTLR start "rule__Staff__Group__11__Impl"
    // InternalMyDsl.g:2220:1: rule__Staff__Group__11__Impl : ( ( rule__Staff__Group_11__0 )* ) ;
    public final void rule__Staff__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2224:1: ( ( ( rule__Staff__Group_11__0 )* ) )
            // InternalMyDsl.g:2225:1: ( ( rule__Staff__Group_11__0 )* )
            {
            // InternalMyDsl.g:2225:1: ( ( rule__Staff__Group_11__0 )* )
            // InternalMyDsl.g:2226:2: ( rule__Staff__Group_11__0 )*
            {
             before(grammarAccess.getStaffAccess().getGroup_11()); 
            // InternalMyDsl.g:2227:2: ( rule__Staff__Group_11__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==55) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalMyDsl.g:2227:3: rule__Staff__Group_11__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Staff__Group_11__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getStaffAccess().getGroup_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Staff__Group__11__Impl"


    // $ANTLR start "rule__Staff__Group__12"
    // InternalMyDsl.g:2235:1: rule__Staff__Group__12 : rule__Staff__Group__12__Impl rule__Staff__Group__13 ;
    public final void rule__Staff__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2239:1: ( rule__Staff__Group__12__Impl rule__Staff__Group__13 )
            // InternalMyDsl.g:2240:2: rule__Staff__Group__12__Impl rule__Staff__Group__13
            {
            pushFollow(FOLLOW_20);
            rule__Staff__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Staff__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Staff__Group__12"


    // $ANTLR start "rule__Staff__Group__12__Impl"
    // InternalMyDsl.g:2247:1: rule__Staff__Group__12__Impl : ( ']' ) ;
    public final void rule__Staff__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2251:1: ( ( ']' ) )
            // InternalMyDsl.g:2252:1: ( ']' )
            {
            // InternalMyDsl.g:2252:1: ( ']' )
            // InternalMyDsl.g:2253:2: ']'
            {
             before(grammarAccess.getStaffAccess().getRightSquareBracketKeyword_12()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getStaffAccess().getRightSquareBracketKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Staff__Group__12__Impl"


    // $ANTLR start "rule__Staff__Group__13"
    // InternalMyDsl.g:2262:1: rule__Staff__Group__13 : rule__Staff__Group__13__Impl ;
    public final void rule__Staff__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2266:1: ( rule__Staff__Group__13__Impl )
            // InternalMyDsl.g:2267:2: rule__Staff__Group__13__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Staff__Group__13__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Staff__Group__13"


    // $ANTLR start "rule__Staff__Group__13__Impl"
    // InternalMyDsl.g:2273:1: rule__Staff__Group__13__Impl : ( ']' ) ;
    public final void rule__Staff__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2277:1: ( ( ']' ) )
            // InternalMyDsl.g:2278:1: ( ']' )
            {
            // InternalMyDsl.g:2278:1: ( ']' )
            // InternalMyDsl.g:2279:2: ']'
            {
             before(grammarAccess.getStaffAccess().getRightSquareBracketKeyword_13()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getStaffAccess().getRightSquareBracketKeyword_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Staff__Group__13__Impl"


    // $ANTLR start "rule__Staff__Group_11__0"
    // InternalMyDsl.g:2289:1: rule__Staff__Group_11__0 : rule__Staff__Group_11__0__Impl rule__Staff__Group_11__1 ;
    public final void rule__Staff__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2293:1: ( rule__Staff__Group_11__0__Impl rule__Staff__Group_11__1 )
            // InternalMyDsl.g:2294:2: rule__Staff__Group_11__0__Impl rule__Staff__Group_11__1
            {
            pushFollow(FOLLOW_18);
            rule__Staff__Group_11__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Staff__Group_11__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Staff__Group_11__0"


    // $ANTLR start "rule__Staff__Group_11__0__Impl"
    // InternalMyDsl.g:2301:1: rule__Staff__Group_11__0__Impl : ( ',' ) ;
    public final void rule__Staff__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2305:1: ( ( ',' ) )
            // InternalMyDsl.g:2306:1: ( ',' )
            {
            // InternalMyDsl.g:2306:1: ( ',' )
            // InternalMyDsl.g:2307:2: ','
            {
             before(grammarAccess.getStaffAccess().getCommaKeyword_11_0()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getStaffAccess().getCommaKeyword_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Staff__Group_11__0__Impl"


    // $ANTLR start "rule__Staff__Group_11__1"
    // InternalMyDsl.g:2316:1: rule__Staff__Group_11__1 : rule__Staff__Group_11__1__Impl ;
    public final void rule__Staff__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2320:1: ( rule__Staff__Group_11__1__Impl )
            // InternalMyDsl.g:2321:2: rule__Staff__Group_11__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Staff__Group_11__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Staff__Group_11__1"


    // $ANTLR start "rule__Staff__Group_11__1__Impl"
    // InternalMyDsl.g:2327:1: rule__Staff__Group_11__1__Impl : ( ( rule__Staff__ElementsAssignment_11_1 ) ) ;
    public final void rule__Staff__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2331:1: ( ( ( rule__Staff__ElementsAssignment_11_1 ) ) )
            // InternalMyDsl.g:2332:1: ( ( rule__Staff__ElementsAssignment_11_1 ) )
            {
            // InternalMyDsl.g:2332:1: ( ( rule__Staff__ElementsAssignment_11_1 ) )
            // InternalMyDsl.g:2333:2: ( rule__Staff__ElementsAssignment_11_1 )
            {
             before(grammarAccess.getStaffAccess().getElementsAssignment_11_1()); 
            // InternalMyDsl.g:2334:2: ( rule__Staff__ElementsAssignment_11_1 )
            // InternalMyDsl.g:2334:3: rule__Staff__ElementsAssignment_11_1
            {
            pushFollow(FOLLOW_2);
            rule__Staff__ElementsAssignment_11_1();

            state._fsp--;


            }

             after(grammarAccess.getStaffAccess().getElementsAssignment_11_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Staff__Group_11__1__Impl"


    // $ANTLR start "rule__EInt__Group__0"
    // InternalMyDsl.g:2343:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2347:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalMyDsl.g:2348:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__EInt__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EInt__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0"


    // $ANTLR start "rule__EInt__Group__0__Impl"
    // InternalMyDsl.g:2355:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2359:1: ( ( ( '-' )? ) )
            // InternalMyDsl.g:2360:1: ( ( '-' )? )
            {
            // InternalMyDsl.g:2360:1: ( ( '-' )? )
            // InternalMyDsl.g:2361:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalMyDsl.g:2362:2: ( '-' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==61) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalMyDsl.g:2362:3: '-'
                    {
                    match(input,61,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0__Impl"


    // $ANTLR start "rule__EInt__Group__1"
    // InternalMyDsl.g:2370:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2374:1: ( rule__EInt__Group__1__Impl )
            // InternalMyDsl.g:2375:2: rule__EInt__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1"


    // $ANTLR start "rule__EInt__Group__1__Impl"
    // InternalMyDsl.g:2381:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2385:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:2386:1: ( RULE_INT )
            {
            // InternalMyDsl.g:2386:1: ( RULE_INT )
            // InternalMyDsl.g:2387:2: RULE_INT
            {
             before(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1__Impl"


    // $ANTLR start "rule__Clef__Group__0"
    // InternalMyDsl.g:2397:1: rule__Clef__Group__0 : rule__Clef__Group__0__Impl rule__Clef__Group__1 ;
    public final void rule__Clef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2401:1: ( rule__Clef__Group__0__Impl rule__Clef__Group__1 )
            // InternalMyDsl.g:2402:2: rule__Clef__Group__0__Impl rule__Clef__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__Clef__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Clef__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clef__Group__0"


    // $ANTLR start "rule__Clef__Group__0__Impl"
    // InternalMyDsl.g:2409:1: rule__Clef__Group__0__Impl : ( () ) ;
    public final void rule__Clef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2413:1: ( ( () ) )
            // InternalMyDsl.g:2414:1: ( () )
            {
            // InternalMyDsl.g:2414:1: ( () )
            // InternalMyDsl.g:2415:2: ()
            {
             before(grammarAccess.getClefAccess().getClefAction_0()); 
            // InternalMyDsl.g:2416:2: ()
            // InternalMyDsl.g:2416:3: 
            {
            }

             after(grammarAccess.getClefAccess().getClefAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clef__Group__0__Impl"


    // $ANTLR start "rule__Clef__Group__1"
    // InternalMyDsl.g:2424:1: rule__Clef__Group__1 : rule__Clef__Group__1__Impl ;
    public final void rule__Clef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2428:1: ( rule__Clef__Group__1__Impl )
            // InternalMyDsl.g:2429:2: rule__Clef__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Clef__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clef__Group__1"


    // $ANTLR start "rule__Clef__Group__1__Impl"
    // InternalMyDsl.g:2435:1: rule__Clef__Group__1__Impl : ( ( rule__Clef__TypeAssignment_1 )? ) ;
    public final void rule__Clef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2439:1: ( ( ( rule__Clef__TypeAssignment_1 )? ) )
            // InternalMyDsl.g:2440:1: ( ( rule__Clef__TypeAssignment_1 )? )
            {
            // InternalMyDsl.g:2440:1: ( ( rule__Clef__TypeAssignment_1 )? )
            // InternalMyDsl.g:2441:2: ( rule__Clef__TypeAssignment_1 )?
            {
             before(grammarAccess.getClefAccess().getTypeAssignment_1()); 
            // InternalMyDsl.g:2442:2: ( rule__Clef__TypeAssignment_1 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( ((LA25_0>=45 && LA25_0<=46)) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalMyDsl.g:2442:3: rule__Clef__TypeAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Clef__TypeAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getClefAccess().getTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clef__Group__1__Impl"


    // $ANTLR start "rule__TimeSignature__Group__0"
    // InternalMyDsl.g:2451:1: rule__TimeSignature__Group__0 : rule__TimeSignature__Group__0__Impl rule__TimeSignature__Group__1 ;
    public final void rule__TimeSignature__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2455:1: ( rule__TimeSignature__Group__0__Impl rule__TimeSignature__Group__1 )
            // InternalMyDsl.g:2456:2: rule__TimeSignature__Group__0__Impl rule__TimeSignature__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__TimeSignature__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TimeSignature__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeSignature__Group__0"


    // $ANTLR start "rule__TimeSignature__Group__0__Impl"
    // InternalMyDsl.g:2463:1: rule__TimeSignature__Group__0__Impl : ( 'beat' ) ;
    public final void rule__TimeSignature__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2467:1: ( ( 'beat' ) )
            // InternalMyDsl.g:2468:1: ( 'beat' )
            {
            // InternalMyDsl.g:2468:1: ( 'beat' )
            // InternalMyDsl.g:2469:2: 'beat'
            {
             before(grammarAccess.getTimeSignatureAccess().getBeatKeyword_0()); 
            match(input,62,FOLLOW_2); 
             after(grammarAccess.getTimeSignatureAccess().getBeatKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeSignature__Group__0__Impl"


    // $ANTLR start "rule__TimeSignature__Group__1"
    // InternalMyDsl.g:2478:1: rule__TimeSignature__Group__1 : rule__TimeSignature__Group__1__Impl rule__TimeSignature__Group__2 ;
    public final void rule__TimeSignature__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2482:1: ( rule__TimeSignature__Group__1__Impl rule__TimeSignature__Group__2 )
            // InternalMyDsl.g:2483:2: rule__TimeSignature__Group__1__Impl rule__TimeSignature__Group__2
            {
            pushFollow(FOLLOW_21);
            rule__TimeSignature__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TimeSignature__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeSignature__Group__1"


    // $ANTLR start "rule__TimeSignature__Group__1__Impl"
    // InternalMyDsl.g:2490:1: rule__TimeSignature__Group__1__Impl : ( ( rule__TimeSignature__BeatAssignment_1 ) ) ;
    public final void rule__TimeSignature__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2494:1: ( ( ( rule__TimeSignature__BeatAssignment_1 ) ) )
            // InternalMyDsl.g:2495:1: ( ( rule__TimeSignature__BeatAssignment_1 ) )
            {
            // InternalMyDsl.g:2495:1: ( ( rule__TimeSignature__BeatAssignment_1 ) )
            // InternalMyDsl.g:2496:2: ( rule__TimeSignature__BeatAssignment_1 )
            {
             before(grammarAccess.getTimeSignatureAccess().getBeatAssignment_1()); 
            // InternalMyDsl.g:2497:2: ( rule__TimeSignature__BeatAssignment_1 )
            // InternalMyDsl.g:2497:3: rule__TimeSignature__BeatAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__TimeSignature__BeatAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTimeSignatureAccess().getBeatAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeSignature__Group__1__Impl"


    // $ANTLR start "rule__TimeSignature__Group__2"
    // InternalMyDsl.g:2505:1: rule__TimeSignature__Group__2 : rule__TimeSignature__Group__2__Impl rule__TimeSignature__Group__3 ;
    public final void rule__TimeSignature__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2509:1: ( rule__TimeSignature__Group__2__Impl rule__TimeSignature__Group__3 )
            // InternalMyDsl.g:2510:2: rule__TimeSignature__Group__2__Impl rule__TimeSignature__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__TimeSignature__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TimeSignature__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeSignature__Group__2"


    // $ANTLR start "rule__TimeSignature__Group__2__Impl"
    // InternalMyDsl.g:2517:1: rule__TimeSignature__Group__2__Impl : ( 'beatType' ) ;
    public final void rule__TimeSignature__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2521:1: ( ( 'beatType' ) )
            // InternalMyDsl.g:2522:1: ( 'beatType' )
            {
            // InternalMyDsl.g:2522:1: ( 'beatType' )
            // InternalMyDsl.g:2523:2: 'beatType'
            {
             before(grammarAccess.getTimeSignatureAccess().getBeatTypeKeyword_2()); 
            match(input,63,FOLLOW_2); 
             after(grammarAccess.getTimeSignatureAccess().getBeatTypeKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeSignature__Group__2__Impl"


    // $ANTLR start "rule__TimeSignature__Group__3"
    // InternalMyDsl.g:2532:1: rule__TimeSignature__Group__3 : rule__TimeSignature__Group__3__Impl ;
    public final void rule__TimeSignature__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2536:1: ( rule__TimeSignature__Group__3__Impl )
            // InternalMyDsl.g:2537:2: rule__TimeSignature__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TimeSignature__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeSignature__Group__3"


    // $ANTLR start "rule__TimeSignature__Group__3__Impl"
    // InternalMyDsl.g:2543:1: rule__TimeSignature__Group__3__Impl : ( ( rule__TimeSignature__BeatTypeAssignment_3 ) ) ;
    public final void rule__TimeSignature__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2547:1: ( ( ( rule__TimeSignature__BeatTypeAssignment_3 ) ) )
            // InternalMyDsl.g:2548:1: ( ( rule__TimeSignature__BeatTypeAssignment_3 ) )
            {
            // InternalMyDsl.g:2548:1: ( ( rule__TimeSignature__BeatTypeAssignment_3 ) )
            // InternalMyDsl.g:2549:2: ( rule__TimeSignature__BeatTypeAssignment_3 )
            {
             before(grammarAccess.getTimeSignatureAccess().getBeatTypeAssignment_3()); 
            // InternalMyDsl.g:2550:2: ( rule__TimeSignature__BeatTypeAssignment_3 )
            // InternalMyDsl.g:2550:3: rule__TimeSignature__BeatTypeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__TimeSignature__BeatTypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getTimeSignatureAccess().getBeatTypeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeSignature__Group__3__Impl"


    // $ANTLR start "rule__Rest__Group__0"
    // InternalMyDsl.g:2559:1: rule__Rest__Group__0 : rule__Rest__Group__0__Impl rule__Rest__Group__1 ;
    public final void rule__Rest__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2563:1: ( rule__Rest__Group__0__Impl rule__Rest__Group__1 )
            // InternalMyDsl.g:2564:2: rule__Rest__Group__0__Impl rule__Rest__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__Rest__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rest__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rest__Group__0"


    // $ANTLR start "rule__Rest__Group__0__Impl"
    // InternalMyDsl.g:2571:1: rule__Rest__Group__0__Impl : ( () ) ;
    public final void rule__Rest__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2575:1: ( ( () ) )
            // InternalMyDsl.g:2576:1: ( () )
            {
            // InternalMyDsl.g:2576:1: ( () )
            // InternalMyDsl.g:2577:2: ()
            {
             before(grammarAccess.getRestAccess().getRestAction_0()); 
            // InternalMyDsl.g:2578:2: ()
            // InternalMyDsl.g:2578:3: 
            {
            }

             after(grammarAccess.getRestAccess().getRestAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rest__Group__0__Impl"


    // $ANTLR start "rule__Rest__Group__1"
    // InternalMyDsl.g:2586:1: rule__Rest__Group__1 : rule__Rest__Group__1__Impl rule__Rest__Group__2 ;
    public final void rule__Rest__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2590:1: ( rule__Rest__Group__1__Impl rule__Rest__Group__2 )
            // InternalMyDsl.g:2591:2: rule__Rest__Group__1__Impl rule__Rest__Group__2
            {
            pushFollow(FOLLOW_23);
            rule__Rest__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rest__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rest__Group__1"


    // $ANTLR start "rule__Rest__Group__1__Impl"
    // InternalMyDsl.g:2598:1: rule__Rest__Group__1__Impl : ( 'rest:' ) ;
    public final void rule__Rest__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2602:1: ( ( 'rest:' ) )
            // InternalMyDsl.g:2603:1: ( 'rest:' )
            {
            // InternalMyDsl.g:2603:1: ( 'rest:' )
            // InternalMyDsl.g:2604:2: 'rest:'
            {
             before(grammarAccess.getRestAccess().getRestKeyword_1()); 
            match(input,64,FOLLOW_2); 
             after(grammarAccess.getRestAccess().getRestKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rest__Group__1__Impl"


    // $ANTLR start "rule__Rest__Group__2"
    // InternalMyDsl.g:2613:1: rule__Rest__Group__2 : rule__Rest__Group__2__Impl ;
    public final void rule__Rest__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2617:1: ( rule__Rest__Group__2__Impl )
            // InternalMyDsl.g:2618:2: rule__Rest__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Rest__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rest__Group__2"


    // $ANTLR start "rule__Rest__Group__2__Impl"
    // InternalMyDsl.g:2624:1: rule__Rest__Group__2__Impl : ( ( rule__Rest__TypeAssignment_2 )? ) ;
    public final void rule__Rest__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2628:1: ( ( ( rule__Rest__TypeAssignment_2 )? ) )
            // InternalMyDsl.g:2629:1: ( ( rule__Rest__TypeAssignment_2 )? )
            {
            // InternalMyDsl.g:2629:1: ( ( rule__Rest__TypeAssignment_2 )? )
            // InternalMyDsl.g:2630:2: ( rule__Rest__TypeAssignment_2 )?
            {
             before(grammarAccess.getRestAccess().getTypeAssignment_2()); 
            // InternalMyDsl.g:2631:2: ( rule__Rest__TypeAssignment_2 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( ((LA26_0>=13 && LA26_0<=19)) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalMyDsl.g:2631:3: rule__Rest__TypeAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Rest__TypeAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRestAccess().getTypeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rest__Group__2__Impl"


    // $ANTLR start "rule__Accidental__Group__0"
    // InternalMyDsl.g:2640:1: rule__Accidental__Group__0 : rule__Accidental__Group__0__Impl rule__Accidental__Group__1 ;
    public final void rule__Accidental__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2644:1: ( rule__Accidental__Group__0__Impl rule__Accidental__Group__1 )
            // InternalMyDsl.g:2645:2: rule__Accidental__Group__0__Impl rule__Accidental__Group__1
            {
            pushFollow(FOLLOW_24);
            rule__Accidental__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Accidental__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Accidental__Group__0"


    // $ANTLR start "rule__Accidental__Group__0__Impl"
    // InternalMyDsl.g:2652:1: rule__Accidental__Group__0__Impl : ( () ) ;
    public final void rule__Accidental__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2656:1: ( ( () ) )
            // InternalMyDsl.g:2657:1: ( () )
            {
            // InternalMyDsl.g:2657:1: ( () )
            // InternalMyDsl.g:2658:2: ()
            {
             before(grammarAccess.getAccidentalAccess().getAccidentalAction_0()); 
            // InternalMyDsl.g:2659:2: ()
            // InternalMyDsl.g:2659:3: 
            {
            }

             after(grammarAccess.getAccidentalAccess().getAccidentalAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Accidental__Group__0__Impl"


    // $ANTLR start "rule__Accidental__Group__1"
    // InternalMyDsl.g:2667:1: rule__Accidental__Group__1 : rule__Accidental__Group__1__Impl rule__Accidental__Group__2 ;
    public final void rule__Accidental__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2671:1: ( rule__Accidental__Group__1__Impl rule__Accidental__Group__2 )
            // InternalMyDsl.g:2672:2: rule__Accidental__Group__1__Impl rule__Accidental__Group__2
            {
            pushFollow(FOLLOW_25);
            rule__Accidental__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Accidental__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Accidental__Group__1"


    // $ANTLR start "rule__Accidental__Group__1__Impl"
    // InternalMyDsl.g:2679:1: rule__Accidental__Group__1__Impl : ( 'accidental:' ) ;
    public final void rule__Accidental__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2683:1: ( ( 'accidental:' ) )
            // InternalMyDsl.g:2684:1: ( 'accidental:' )
            {
            // InternalMyDsl.g:2684:1: ( 'accidental:' )
            // InternalMyDsl.g:2685:2: 'accidental:'
            {
             before(grammarAccess.getAccidentalAccess().getAccidentalKeyword_1()); 
            match(input,65,FOLLOW_2); 
             after(grammarAccess.getAccidentalAccess().getAccidentalKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Accidental__Group__1__Impl"


    // $ANTLR start "rule__Accidental__Group__2"
    // InternalMyDsl.g:2694:1: rule__Accidental__Group__2 : rule__Accidental__Group__2__Impl rule__Accidental__Group__3 ;
    public final void rule__Accidental__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2698:1: ( rule__Accidental__Group__2__Impl rule__Accidental__Group__3 )
            // InternalMyDsl.g:2699:2: rule__Accidental__Group__2__Impl rule__Accidental__Group__3
            {
            pushFollow(FOLLOW_25);
            rule__Accidental__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Accidental__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Accidental__Group__2"


    // $ANTLR start "rule__Accidental__Group__2__Impl"
    // InternalMyDsl.g:2706:1: rule__Accidental__Group__2__Impl : ( ( rule__Accidental__TypeAssignment_2 )? ) ;
    public final void rule__Accidental__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2710:1: ( ( ( rule__Accidental__TypeAssignment_2 )? ) )
            // InternalMyDsl.g:2711:1: ( ( rule__Accidental__TypeAssignment_2 )? )
            {
            // InternalMyDsl.g:2711:1: ( ( rule__Accidental__TypeAssignment_2 )? )
            // InternalMyDsl.g:2712:2: ( rule__Accidental__TypeAssignment_2 )?
            {
             before(grammarAccess.getAccidentalAccess().getTypeAssignment_2()); 
            // InternalMyDsl.g:2713:2: ( rule__Accidental__TypeAssignment_2 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( ((LA27_0>=20 && LA27_0<=22)) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalMyDsl.g:2713:3: rule__Accidental__TypeAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Accidental__TypeAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAccidentalAccess().getTypeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Accidental__Group__2__Impl"


    // $ANTLR start "rule__Accidental__Group__3"
    // InternalMyDsl.g:2721:1: rule__Accidental__Group__3 : rule__Accidental__Group__3__Impl ;
    public final void rule__Accidental__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2725:1: ( rule__Accidental__Group__3__Impl )
            // InternalMyDsl.g:2726:2: rule__Accidental__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Accidental__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Accidental__Group__3"


    // $ANTLR start "rule__Accidental__Group__3__Impl"
    // InternalMyDsl.g:2732:1: rule__Accidental__Group__3__Impl : ( ( rule__Accidental__PositionAssignment_3 ) ) ;
    public final void rule__Accidental__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2736:1: ( ( ( rule__Accidental__PositionAssignment_3 ) ) )
            // InternalMyDsl.g:2737:1: ( ( rule__Accidental__PositionAssignment_3 ) )
            {
            // InternalMyDsl.g:2737:1: ( ( rule__Accidental__PositionAssignment_3 ) )
            // InternalMyDsl.g:2738:2: ( rule__Accidental__PositionAssignment_3 )
            {
             before(grammarAccess.getAccidentalAccess().getPositionAssignment_3()); 
            // InternalMyDsl.g:2739:2: ( rule__Accidental__PositionAssignment_3 )
            // InternalMyDsl.g:2739:3: rule__Accidental__PositionAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Accidental__PositionAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAccidentalAccess().getPositionAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Accidental__Group__3__Impl"


    // $ANTLR start "rule__Repetition__Group__0"
    // InternalMyDsl.g:2748:1: rule__Repetition__Group__0 : rule__Repetition__Group__0__Impl rule__Repetition__Group__1 ;
    public final void rule__Repetition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2752:1: ( rule__Repetition__Group__0__Impl rule__Repetition__Group__1 )
            // InternalMyDsl.g:2753:2: rule__Repetition__Group__0__Impl rule__Repetition__Group__1
            {
            pushFollow(FOLLOW_26);
            rule__Repetition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Repetition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Repetition__Group__0"


    // $ANTLR start "rule__Repetition__Group__0__Impl"
    // InternalMyDsl.g:2760:1: rule__Repetition__Group__0__Impl : ( () ) ;
    public final void rule__Repetition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2764:1: ( ( () ) )
            // InternalMyDsl.g:2765:1: ( () )
            {
            // InternalMyDsl.g:2765:1: ( () )
            // InternalMyDsl.g:2766:2: ()
            {
             before(grammarAccess.getRepetitionAccess().getRepetitionAction_0()); 
            // InternalMyDsl.g:2767:2: ()
            // InternalMyDsl.g:2767:3: 
            {
            }

             after(grammarAccess.getRepetitionAccess().getRepetitionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Repetition__Group__0__Impl"


    // $ANTLR start "rule__Repetition__Group__1"
    // InternalMyDsl.g:2775:1: rule__Repetition__Group__1 : rule__Repetition__Group__1__Impl rule__Repetition__Group__2 ;
    public final void rule__Repetition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2779:1: ( rule__Repetition__Group__1__Impl rule__Repetition__Group__2 )
            // InternalMyDsl.g:2780:2: rule__Repetition__Group__1__Impl rule__Repetition__Group__2
            {
            pushFollow(FOLLOW_27);
            rule__Repetition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Repetition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Repetition__Group__1"


    // $ANTLR start "rule__Repetition__Group__1__Impl"
    // InternalMyDsl.g:2787:1: rule__Repetition__Group__1__Impl : ( 'repetition:' ) ;
    public final void rule__Repetition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2791:1: ( ( 'repetition:' ) )
            // InternalMyDsl.g:2792:1: ( 'repetition:' )
            {
            // InternalMyDsl.g:2792:1: ( 'repetition:' )
            // InternalMyDsl.g:2793:2: 'repetition:'
            {
             before(grammarAccess.getRepetitionAccess().getRepetitionKeyword_1()); 
            match(input,66,FOLLOW_2); 
             after(grammarAccess.getRepetitionAccess().getRepetitionKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Repetition__Group__1__Impl"


    // $ANTLR start "rule__Repetition__Group__2"
    // InternalMyDsl.g:2802:1: rule__Repetition__Group__2 : rule__Repetition__Group__2__Impl ;
    public final void rule__Repetition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2806:1: ( rule__Repetition__Group__2__Impl )
            // InternalMyDsl.g:2807:2: rule__Repetition__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Repetition__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Repetition__Group__2"


    // $ANTLR start "rule__Repetition__Group__2__Impl"
    // InternalMyDsl.g:2813:1: rule__Repetition__Group__2__Impl : ( ( rule__Repetition__TypeAssignment_2 )? ) ;
    public final void rule__Repetition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2817:1: ( ( ( rule__Repetition__TypeAssignment_2 )? ) )
            // InternalMyDsl.g:2818:1: ( ( rule__Repetition__TypeAssignment_2 )? )
            {
            // InternalMyDsl.g:2818:1: ( ( rule__Repetition__TypeAssignment_2 )? )
            // InternalMyDsl.g:2819:2: ( rule__Repetition__TypeAssignment_2 )?
            {
             before(grammarAccess.getRepetitionAccess().getTypeAssignment_2()); 
            // InternalMyDsl.g:2820:2: ( rule__Repetition__TypeAssignment_2 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( ((LA28_0>=23 && LA28_0<=24)) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalMyDsl.g:2820:3: rule__Repetition__TypeAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Repetition__TypeAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRepetitionAccess().getTypeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Repetition__Group__2__Impl"


    // $ANTLR start "rule__Note__Group__0"
    // InternalMyDsl.g:2829:1: rule__Note__Group__0 : rule__Note__Group__0__Impl rule__Note__Group__1 ;
    public final void rule__Note__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2833:1: ( rule__Note__Group__0__Impl rule__Note__Group__1 )
            // InternalMyDsl.g:2834:2: rule__Note__Group__0__Impl rule__Note__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__Note__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Note__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Note__Group__0"


    // $ANTLR start "rule__Note__Group__0__Impl"
    // InternalMyDsl.g:2841:1: rule__Note__Group__0__Impl : ( () ) ;
    public final void rule__Note__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2845:1: ( ( () ) )
            // InternalMyDsl.g:2846:1: ( () )
            {
            // InternalMyDsl.g:2846:1: ( () )
            // InternalMyDsl.g:2847:2: ()
            {
             before(grammarAccess.getNoteAccess().getNoteAction_0()); 
            // InternalMyDsl.g:2848:2: ()
            // InternalMyDsl.g:2848:3: 
            {
            }

             after(grammarAccess.getNoteAccess().getNoteAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Note__Group__0__Impl"


    // $ANTLR start "rule__Note__Group__1"
    // InternalMyDsl.g:2856:1: rule__Note__Group__1 : rule__Note__Group__1__Impl rule__Note__Group__2 ;
    public final void rule__Note__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2860:1: ( rule__Note__Group__1__Impl rule__Note__Group__2 )
            // InternalMyDsl.g:2861:2: rule__Note__Group__1__Impl rule__Note__Group__2
            {
            pushFollow(FOLLOW_28);
            rule__Note__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Note__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Note__Group__1"


    // $ANTLR start "rule__Note__Group__1__Impl"
    // InternalMyDsl.g:2868:1: rule__Note__Group__1__Impl : ( 'note:' ) ;
    public final void rule__Note__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2872:1: ( ( 'note:' ) )
            // InternalMyDsl.g:2873:1: ( 'note:' )
            {
            // InternalMyDsl.g:2873:1: ( 'note:' )
            // InternalMyDsl.g:2874:2: 'note:'
            {
             before(grammarAccess.getNoteAccess().getNoteKeyword_1()); 
            match(input,67,FOLLOW_2); 
             after(grammarAccess.getNoteAccess().getNoteKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Note__Group__1__Impl"


    // $ANTLR start "rule__Note__Group__2"
    // InternalMyDsl.g:2883:1: rule__Note__Group__2 : rule__Note__Group__2__Impl rule__Note__Group__3 ;
    public final void rule__Note__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2887:1: ( rule__Note__Group__2__Impl rule__Note__Group__3 )
            // InternalMyDsl.g:2888:2: rule__Note__Group__2__Impl rule__Note__Group__3
            {
            pushFollow(FOLLOW_29);
            rule__Note__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Note__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Note__Group__2"


    // $ANTLR start "rule__Note__Group__2__Impl"
    // InternalMyDsl.g:2895:1: rule__Note__Group__2__Impl : ( ( rule__Note__NameAssignment_2 ) ) ;
    public final void rule__Note__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2899:1: ( ( ( rule__Note__NameAssignment_2 ) ) )
            // InternalMyDsl.g:2900:1: ( ( rule__Note__NameAssignment_2 ) )
            {
            // InternalMyDsl.g:2900:1: ( ( rule__Note__NameAssignment_2 ) )
            // InternalMyDsl.g:2901:2: ( rule__Note__NameAssignment_2 )
            {
             before(grammarAccess.getNoteAccess().getNameAssignment_2()); 
            // InternalMyDsl.g:2902:2: ( rule__Note__NameAssignment_2 )
            // InternalMyDsl.g:2902:3: rule__Note__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Note__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getNoteAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Note__Group__2__Impl"


    // $ANTLR start "rule__Note__Group__3"
    // InternalMyDsl.g:2910:1: rule__Note__Group__3 : rule__Note__Group__3__Impl rule__Note__Group__4 ;
    public final void rule__Note__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2914:1: ( rule__Note__Group__3__Impl rule__Note__Group__4 )
            // InternalMyDsl.g:2915:2: rule__Note__Group__3__Impl rule__Note__Group__4
            {
            pushFollow(FOLLOW_29);
            rule__Note__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Note__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Note__Group__3"


    // $ANTLR start "rule__Note__Group__3__Impl"
    // InternalMyDsl.g:2922:1: rule__Note__Group__3__Impl : ( ( rule__Note__Group_3__0 )? ) ;
    public final void rule__Note__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2926:1: ( ( ( rule__Note__Group_3__0 )? ) )
            // InternalMyDsl.g:2927:1: ( ( rule__Note__Group_3__0 )? )
            {
            // InternalMyDsl.g:2927:1: ( ( rule__Note__Group_3__0 )? )
            // InternalMyDsl.g:2928:2: ( rule__Note__Group_3__0 )?
            {
             before(grammarAccess.getNoteAccess().getGroup_3()); 
            // InternalMyDsl.g:2929:2: ( rule__Note__Group_3__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==68) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalMyDsl.g:2929:3: rule__Note__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Note__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNoteAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Note__Group__3__Impl"


    // $ANTLR start "rule__Note__Group__4"
    // InternalMyDsl.g:2937:1: rule__Note__Group__4 : rule__Note__Group__4__Impl rule__Note__Group__5 ;
    public final void rule__Note__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2941:1: ( rule__Note__Group__4__Impl rule__Note__Group__5 )
            // InternalMyDsl.g:2942:2: rule__Note__Group__4__Impl rule__Note__Group__5
            {
            pushFollow(FOLLOW_29);
            rule__Note__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Note__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Note__Group__4"


    // $ANTLR start "rule__Note__Group__4__Impl"
    // InternalMyDsl.g:2949:1: rule__Note__Group__4__Impl : ( ( rule__Note__Group_4__0 )? ) ;
    public final void rule__Note__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2953:1: ( ( ( rule__Note__Group_4__0 )? ) )
            // InternalMyDsl.g:2954:1: ( ( rule__Note__Group_4__0 )? )
            {
            // InternalMyDsl.g:2954:1: ( ( rule__Note__Group_4__0 )? )
            // InternalMyDsl.g:2955:2: ( rule__Note__Group_4__0 )?
            {
             before(grammarAccess.getNoteAccess().getGroup_4()); 
            // InternalMyDsl.g:2956:2: ( rule__Note__Group_4__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==69) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalMyDsl.g:2956:3: rule__Note__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Note__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNoteAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Note__Group__4__Impl"


    // $ANTLR start "rule__Note__Group__5"
    // InternalMyDsl.g:2964:1: rule__Note__Group__5 : rule__Note__Group__5__Impl rule__Note__Group__6 ;
    public final void rule__Note__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2968:1: ( rule__Note__Group__5__Impl rule__Note__Group__6 )
            // InternalMyDsl.g:2969:2: rule__Note__Group__5__Impl rule__Note__Group__6
            {
            pushFollow(FOLLOW_29);
            rule__Note__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Note__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Note__Group__5"


    // $ANTLR start "rule__Note__Group__5__Impl"
    // InternalMyDsl.g:2976:1: rule__Note__Group__5__Impl : ( ( rule__Note__Group_5__0 )? ) ;
    public final void rule__Note__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2980:1: ( ( ( rule__Note__Group_5__0 )? ) )
            // InternalMyDsl.g:2981:1: ( ( rule__Note__Group_5__0 )? )
            {
            // InternalMyDsl.g:2981:1: ( ( rule__Note__Group_5__0 )? )
            // InternalMyDsl.g:2982:2: ( rule__Note__Group_5__0 )?
            {
             before(grammarAccess.getNoteAccess().getGroup_5()); 
            // InternalMyDsl.g:2983:2: ( rule__Note__Group_5__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==70) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalMyDsl.g:2983:3: rule__Note__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Note__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNoteAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Note__Group__5__Impl"


    // $ANTLR start "rule__Note__Group__6"
    // InternalMyDsl.g:2991:1: rule__Note__Group__6 : rule__Note__Group__6__Impl rule__Note__Group__7 ;
    public final void rule__Note__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2995:1: ( rule__Note__Group__6__Impl rule__Note__Group__7 )
            // InternalMyDsl.g:2996:2: rule__Note__Group__6__Impl rule__Note__Group__7
            {
            pushFollow(FOLLOW_29);
            rule__Note__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Note__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Note__Group__6"


    // $ANTLR start "rule__Note__Group__6__Impl"
    // InternalMyDsl.g:3003:1: rule__Note__Group__6__Impl : ( ( rule__Note__Group_6__0 )? ) ;
    public final void rule__Note__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3007:1: ( ( ( rule__Note__Group_6__0 )? ) )
            // InternalMyDsl.g:3008:1: ( ( rule__Note__Group_6__0 )? )
            {
            // InternalMyDsl.g:3008:1: ( ( rule__Note__Group_6__0 )? )
            // InternalMyDsl.g:3009:2: ( rule__Note__Group_6__0 )?
            {
             before(grammarAccess.getNoteAccess().getGroup_6()); 
            // InternalMyDsl.g:3010:2: ( rule__Note__Group_6__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==71) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalMyDsl.g:3010:3: rule__Note__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Note__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNoteAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Note__Group__6__Impl"


    // $ANTLR start "rule__Note__Group__7"
    // InternalMyDsl.g:3018:1: rule__Note__Group__7 : rule__Note__Group__7__Impl rule__Note__Group__8 ;
    public final void rule__Note__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3022:1: ( rule__Note__Group__7__Impl rule__Note__Group__8 )
            // InternalMyDsl.g:3023:2: rule__Note__Group__7__Impl rule__Note__Group__8
            {
            pushFollow(FOLLOW_29);
            rule__Note__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Note__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Note__Group__7"


    // $ANTLR start "rule__Note__Group__7__Impl"
    // InternalMyDsl.g:3030:1: rule__Note__Group__7__Impl : ( ( rule__Note__OrnamentAssignment_7 )? ) ;
    public final void rule__Note__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3034:1: ( ( ( rule__Note__OrnamentAssignment_7 )? ) )
            // InternalMyDsl.g:3035:1: ( ( rule__Note__OrnamentAssignment_7 )? )
            {
            // InternalMyDsl.g:3035:1: ( ( rule__Note__OrnamentAssignment_7 )? )
            // InternalMyDsl.g:3036:2: ( rule__Note__OrnamentAssignment_7 )?
            {
             before(grammarAccess.getNoteAccess().getOrnamentAssignment_7()); 
            // InternalMyDsl.g:3037:2: ( rule__Note__OrnamentAssignment_7 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==72) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalMyDsl.g:3037:3: rule__Note__OrnamentAssignment_7
                    {
                    pushFollow(FOLLOW_2);
                    rule__Note__OrnamentAssignment_7();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNoteAccess().getOrnamentAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Note__Group__7__Impl"


    // $ANTLR start "rule__Note__Group__8"
    // InternalMyDsl.g:3045:1: rule__Note__Group__8 : rule__Note__Group__8__Impl rule__Note__Group__9 ;
    public final void rule__Note__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3049:1: ( rule__Note__Group__8__Impl rule__Note__Group__9 )
            // InternalMyDsl.g:3050:2: rule__Note__Group__8__Impl rule__Note__Group__9
            {
            pushFollow(FOLLOW_29);
            rule__Note__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Note__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Note__Group__8"


    // $ANTLR start "rule__Note__Group__8__Impl"
    // InternalMyDsl.g:3057:1: rule__Note__Group__8__Impl : ( ( rule__Note__AccidentalAssignment_8 )? ) ;
    public final void rule__Note__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3061:1: ( ( ( rule__Note__AccidentalAssignment_8 )? ) )
            // InternalMyDsl.g:3062:1: ( ( rule__Note__AccidentalAssignment_8 )? )
            {
            // InternalMyDsl.g:3062:1: ( ( rule__Note__AccidentalAssignment_8 )? )
            // InternalMyDsl.g:3063:2: ( rule__Note__AccidentalAssignment_8 )?
            {
             before(grammarAccess.getNoteAccess().getAccidentalAssignment_8()); 
            // InternalMyDsl.g:3064:2: ( rule__Note__AccidentalAssignment_8 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==65) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalMyDsl.g:3064:3: rule__Note__AccidentalAssignment_8
                    {
                    pushFollow(FOLLOW_2);
                    rule__Note__AccidentalAssignment_8();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNoteAccess().getAccidentalAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Note__Group__8__Impl"


    // $ANTLR start "rule__Note__Group__9"
    // InternalMyDsl.g:3072:1: rule__Note__Group__9 : rule__Note__Group__9__Impl rule__Note__Group__10 ;
    public final void rule__Note__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3076:1: ( rule__Note__Group__9__Impl rule__Note__Group__10 )
            // InternalMyDsl.g:3077:2: rule__Note__Group__9__Impl rule__Note__Group__10
            {
            pushFollow(FOLLOW_29);
            rule__Note__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Note__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Note__Group__9"


    // $ANTLR start "rule__Note__Group__9__Impl"
    // InternalMyDsl.g:3084:1: rule__Note__Group__9__Impl : ( ( rule__Note__ArticulationAssignment_9 )? ) ;
    public final void rule__Note__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3088:1: ( ( ( rule__Note__ArticulationAssignment_9 )? ) )
            // InternalMyDsl.g:3089:1: ( ( rule__Note__ArticulationAssignment_9 )? )
            {
            // InternalMyDsl.g:3089:1: ( ( rule__Note__ArticulationAssignment_9 )? )
            // InternalMyDsl.g:3090:2: ( rule__Note__ArticulationAssignment_9 )?
            {
             before(grammarAccess.getNoteAccess().getArticulationAssignment_9()); 
            // InternalMyDsl.g:3091:2: ( rule__Note__ArticulationAssignment_9 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==73) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalMyDsl.g:3091:3: rule__Note__ArticulationAssignment_9
                    {
                    pushFollow(FOLLOW_2);
                    rule__Note__ArticulationAssignment_9();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNoteAccess().getArticulationAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Note__Group__9__Impl"


    // $ANTLR start "rule__Note__Group__10"
    // InternalMyDsl.g:3099:1: rule__Note__Group__10 : rule__Note__Group__10__Impl rule__Note__Group__11 ;
    public final void rule__Note__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3103:1: ( rule__Note__Group__10__Impl rule__Note__Group__11 )
            // InternalMyDsl.g:3104:2: rule__Note__Group__10__Impl rule__Note__Group__11
            {
            pushFollow(FOLLOW_29);
            rule__Note__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Note__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Note__Group__10"


    // $ANTLR start "rule__Note__Group__10__Impl"
    // InternalMyDsl.g:3111:1: rule__Note__Group__10__Impl : ( ( rule__Note__FermataAssignment_10 )? ) ;
    public final void rule__Note__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3115:1: ( ( ( rule__Note__FermataAssignment_10 )? ) )
            // InternalMyDsl.g:3116:1: ( ( rule__Note__FermataAssignment_10 )? )
            {
            // InternalMyDsl.g:3116:1: ( ( rule__Note__FermataAssignment_10 )? )
            // InternalMyDsl.g:3117:2: ( rule__Note__FermataAssignment_10 )?
            {
             before(grammarAccess.getNoteAccess().getFermataAssignment_10()); 
            // InternalMyDsl.g:3118:2: ( rule__Note__FermataAssignment_10 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==74) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalMyDsl.g:3118:3: rule__Note__FermataAssignment_10
                    {
                    pushFollow(FOLLOW_2);
                    rule__Note__FermataAssignment_10();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNoteAccess().getFermataAssignment_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Note__Group__10__Impl"


    // $ANTLR start "rule__Note__Group__11"
    // InternalMyDsl.g:3126:1: rule__Note__Group__11 : rule__Note__Group__11__Impl ;
    public final void rule__Note__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3130:1: ( rule__Note__Group__11__Impl )
            // InternalMyDsl.g:3131:2: rule__Note__Group__11__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Note__Group__11__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Note__Group__11"


    // $ANTLR start "rule__Note__Group__11__Impl"
    // InternalMyDsl.g:3137:1: rule__Note__Group__11__Impl : ( ( rule__Note__DotAssignment_11 )? ) ;
    public final void rule__Note__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3141:1: ( ( ( rule__Note__DotAssignment_11 )? ) )
            // InternalMyDsl.g:3142:1: ( ( rule__Note__DotAssignment_11 )? )
            {
            // InternalMyDsl.g:3142:1: ( ( rule__Note__DotAssignment_11 )? )
            // InternalMyDsl.g:3143:2: ( rule__Note__DotAssignment_11 )?
            {
             before(grammarAccess.getNoteAccess().getDotAssignment_11()); 
            // InternalMyDsl.g:3144:2: ( rule__Note__DotAssignment_11 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==75) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalMyDsl.g:3144:3: rule__Note__DotAssignment_11
                    {
                    pushFollow(FOLLOW_2);
                    rule__Note__DotAssignment_11();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNoteAccess().getDotAssignment_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Note__Group__11__Impl"


    // $ANTLR start "rule__Note__Group_3__0"
    // InternalMyDsl.g:3153:1: rule__Note__Group_3__0 : rule__Note__Group_3__0__Impl rule__Note__Group_3__1 ;
    public final void rule__Note__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3157:1: ( rule__Note__Group_3__0__Impl rule__Note__Group_3__1 )
            // InternalMyDsl.g:3158:2: rule__Note__Group_3__0__Impl rule__Note__Group_3__1
            {
            pushFollow(FOLLOW_6);
            rule__Note__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Note__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Note__Group_3__0"


    // $ANTLR start "rule__Note__Group_3__0__Impl"
    // InternalMyDsl.g:3165:1: rule__Note__Group_3__0__Impl : ( 'lyrics:' ) ;
    public final void rule__Note__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3169:1: ( ( 'lyrics:' ) )
            // InternalMyDsl.g:3170:1: ( 'lyrics:' )
            {
            // InternalMyDsl.g:3170:1: ( 'lyrics:' )
            // InternalMyDsl.g:3171:2: 'lyrics:'
            {
             before(grammarAccess.getNoteAccess().getLyricsKeyword_3_0()); 
            match(input,68,FOLLOW_2); 
             after(grammarAccess.getNoteAccess().getLyricsKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Note__Group_3__0__Impl"


    // $ANTLR start "rule__Note__Group_3__1"
    // InternalMyDsl.g:3180:1: rule__Note__Group_3__1 : rule__Note__Group_3__1__Impl ;
    public final void rule__Note__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3184:1: ( rule__Note__Group_3__1__Impl )
            // InternalMyDsl.g:3185:2: rule__Note__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Note__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Note__Group_3__1"


    // $ANTLR start "rule__Note__Group_3__1__Impl"
    // InternalMyDsl.g:3191:1: rule__Note__Group_3__1__Impl : ( ( rule__Note__LyricsAssignment_3_1 ) ) ;
    public final void rule__Note__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3195:1: ( ( ( rule__Note__LyricsAssignment_3_1 ) ) )
            // InternalMyDsl.g:3196:1: ( ( rule__Note__LyricsAssignment_3_1 ) )
            {
            // InternalMyDsl.g:3196:1: ( ( rule__Note__LyricsAssignment_3_1 ) )
            // InternalMyDsl.g:3197:2: ( rule__Note__LyricsAssignment_3_1 )
            {
             before(grammarAccess.getNoteAccess().getLyricsAssignment_3_1()); 
            // InternalMyDsl.g:3198:2: ( rule__Note__LyricsAssignment_3_1 )
            // InternalMyDsl.g:3198:3: rule__Note__LyricsAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Note__LyricsAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getNoteAccess().getLyricsAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Note__Group_3__1__Impl"


    // $ANTLR start "rule__Note__Group_4__0"
    // InternalMyDsl.g:3207:1: rule__Note__Group_4__0 : rule__Note__Group_4__0__Impl rule__Note__Group_4__1 ;
    public final void rule__Note__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3211:1: ( rule__Note__Group_4__0__Impl rule__Note__Group_4__1 )
            // InternalMyDsl.g:3212:2: rule__Note__Group_4__0__Impl rule__Note__Group_4__1
            {
            pushFollow(FOLLOW_23);
            rule__Note__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Note__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Note__Group_4__0"


    // $ANTLR start "rule__Note__Group_4__0__Impl"
    // InternalMyDsl.g:3219:1: rule__Note__Group_4__0__Impl : ( 'duration:' ) ;
    public final void rule__Note__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3223:1: ( ( 'duration:' ) )
            // InternalMyDsl.g:3224:1: ( 'duration:' )
            {
            // InternalMyDsl.g:3224:1: ( 'duration:' )
            // InternalMyDsl.g:3225:2: 'duration:'
            {
             before(grammarAccess.getNoteAccess().getDurationKeyword_4_0()); 
            match(input,69,FOLLOW_2); 
             after(grammarAccess.getNoteAccess().getDurationKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Note__Group_4__0__Impl"


    // $ANTLR start "rule__Note__Group_4__1"
    // InternalMyDsl.g:3234:1: rule__Note__Group_4__1 : rule__Note__Group_4__1__Impl ;
    public final void rule__Note__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3238:1: ( rule__Note__Group_4__1__Impl )
            // InternalMyDsl.g:3239:2: rule__Note__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Note__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Note__Group_4__1"


    // $ANTLR start "rule__Note__Group_4__1__Impl"
    // InternalMyDsl.g:3245:1: rule__Note__Group_4__1__Impl : ( ( rule__Note__DurationAssignment_4_1 ) ) ;
    public final void rule__Note__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3249:1: ( ( ( rule__Note__DurationAssignment_4_1 ) ) )
            // InternalMyDsl.g:3250:1: ( ( rule__Note__DurationAssignment_4_1 ) )
            {
            // InternalMyDsl.g:3250:1: ( ( rule__Note__DurationAssignment_4_1 ) )
            // InternalMyDsl.g:3251:2: ( rule__Note__DurationAssignment_4_1 )
            {
             before(grammarAccess.getNoteAccess().getDurationAssignment_4_1()); 
            // InternalMyDsl.g:3252:2: ( rule__Note__DurationAssignment_4_1 )
            // InternalMyDsl.g:3252:3: rule__Note__DurationAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Note__DurationAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getNoteAccess().getDurationAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Note__Group_4__1__Impl"


    // $ANTLR start "rule__Note__Group_5__0"
    // InternalMyDsl.g:3261:1: rule__Note__Group_5__0 : rule__Note__Group_5__0__Impl rule__Note__Group_5__1 ;
    public final void rule__Note__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3265:1: ( rule__Note__Group_5__0__Impl rule__Note__Group_5__1 )
            // InternalMyDsl.g:3266:2: rule__Note__Group_5__0__Impl rule__Note__Group_5__1
            {
            pushFollow(FOLLOW_7);
            rule__Note__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Note__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Note__Group_5__0"


    // $ANTLR start "rule__Note__Group_5__0__Impl"
    // InternalMyDsl.g:3273:1: rule__Note__Group_5__0__Impl : ( 'position:' ) ;
    public final void rule__Note__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3277:1: ( ( 'position:' ) )
            // InternalMyDsl.g:3278:1: ( 'position:' )
            {
            // InternalMyDsl.g:3278:1: ( 'position:' )
            // InternalMyDsl.g:3279:2: 'position:'
            {
             before(grammarAccess.getNoteAccess().getPositionKeyword_5_0()); 
            match(input,70,FOLLOW_2); 
             after(grammarAccess.getNoteAccess().getPositionKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Note__Group_5__0__Impl"


    // $ANTLR start "rule__Note__Group_5__1"
    // InternalMyDsl.g:3288:1: rule__Note__Group_5__1 : rule__Note__Group_5__1__Impl ;
    public final void rule__Note__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3292:1: ( rule__Note__Group_5__1__Impl )
            // InternalMyDsl.g:3293:2: rule__Note__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Note__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Note__Group_5__1"


    // $ANTLR start "rule__Note__Group_5__1__Impl"
    // InternalMyDsl.g:3299:1: rule__Note__Group_5__1__Impl : ( ( rule__Note__PositionAssignment_5_1 ) ) ;
    public final void rule__Note__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3303:1: ( ( ( rule__Note__PositionAssignment_5_1 ) ) )
            // InternalMyDsl.g:3304:1: ( ( rule__Note__PositionAssignment_5_1 ) )
            {
            // InternalMyDsl.g:3304:1: ( ( rule__Note__PositionAssignment_5_1 ) )
            // InternalMyDsl.g:3305:2: ( rule__Note__PositionAssignment_5_1 )
            {
             before(grammarAccess.getNoteAccess().getPositionAssignment_5_1()); 
            // InternalMyDsl.g:3306:2: ( rule__Note__PositionAssignment_5_1 )
            // InternalMyDsl.g:3306:3: rule__Note__PositionAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Note__PositionAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getNoteAccess().getPositionAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Note__Group_5__1__Impl"


    // $ANTLR start "rule__Note__Group_6__0"
    // InternalMyDsl.g:3315:1: rule__Note__Group_6__0 : rule__Note__Group_6__0__Impl rule__Note__Group_6__1 ;
    public final void rule__Note__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3319:1: ( rule__Note__Group_6__0__Impl rule__Note__Group_6__1 )
            // InternalMyDsl.g:3320:2: rule__Note__Group_6__0__Impl rule__Note__Group_6__1
            {
            pushFollow(FOLLOW_6);
            rule__Note__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Note__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Note__Group_6__0"


    // $ANTLR start "rule__Note__Group_6__0__Impl"
    // InternalMyDsl.g:3327:1: rule__Note__Group_6__0__Impl : ( 'dynamic:' ) ;
    public final void rule__Note__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3331:1: ( ( 'dynamic:' ) )
            // InternalMyDsl.g:3332:1: ( 'dynamic:' )
            {
            // InternalMyDsl.g:3332:1: ( 'dynamic:' )
            // InternalMyDsl.g:3333:2: 'dynamic:'
            {
             before(grammarAccess.getNoteAccess().getDynamicKeyword_6_0()); 
            match(input,71,FOLLOW_2); 
             after(grammarAccess.getNoteAccess().getDynamicKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Note__Group_6__0__Impl"


    // $ANTLR start "rule__Note__Group_6__1"
    // InternalMyDsl.g:3342:1: rule__Note__Group_6__1 : rule__Note__Group_6__1__Impl ;
    public final void rule__Note__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3346:1: ( rule__Note__Group_6__1__Impl )
            // InternalMyDsl.g:3347:2: rule__Note__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Note__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Note__Group_6__1"


    // $ANTLR start "rule__Note__Group_6__1__Impl"
    // InternalMyDsl.g:3353:1: rule__Note__Group_6__1__Impl : ( ( rule__Note__DynamicAssignment_6_1 ) ) ;
    public final void rule__Note__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3357:1: ( ( ( rule__Note__DynamicAssignment_6_1 ) ) )
            // InternalMyDsl.g:3358:1: ( ( rule__Note__DynamicAssignment_6_1 ) )
            {
            // InternalMyDsl.g:3358:1: ( ( rule__Note__DynamicAssignment_6_1 ) )
            // InternalMyDsl.g:3359:2: ( rule__Note__DynamicAssignment_6_1 )
            {
             before(grammarAccess.getNoteAccess().getDynamicAssignment_6_1()); 
            // InternalMyDsl.g:3360:2: ( rule__Note__DynamicAssignment_6_1 )
            // InternalMyDsl.g:3360:3: rule__Note__DynamicAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Note__DynamicAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getNoteAccess().getDynamicAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Note__Group_6__1__Impl"


    // $ANTLR start "rule__Ornament__Group__0"
    // InternalMyDsl.g:3369:1: rule__Ornament__Group__0 : rule__Ornament__Group__0__Impl rule__Ornament__Group__1 ;
    public final void rule__Ornament__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3373:1: ( rule__Ornament__Group__0__Impl rule__Ornament__Group__1 )
            // InternalMyDsl.g:3374:2: rule__Ornament__Group__0__Impl rule__Ornament__Group__1
            {
            pushFollow(FOLLOW_30);
            rule__Ornament__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ornament__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ornament__Group__0"


    // $ANTLR start "rule__Ornament__Group__0__Impl"
    // InternalMyDsl.g:3381:1: rule__Ornament__Group__0__Impl : ( () ) ;
    public final void rule__Ornament__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3385:1: ( ( () ) )
            // InternalMyDsl.g:3386:1: ( () )
            {
            // InternalMyDsl.g:3386:1: ( () )
            // InternalMyDsl.g:3387:2: ()
            {
             before(grammarAccess.getOrnamentAccess().getOrnamentAction_0()); 
            // InternalMyDsl.g:3388:2: ()
            // InternalMyDsl.g:3388:3: 
            {
            }

             after(grammarAccess.getOrnamentAccess().getOrnamentAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ornament__Group__0__Impl"


    // $ANTLR start "rule__Ornament__Group__1"
    // InternalMyDsl.g:3396:1: rule__Ornament__Group__1 : rule__Ornament__Group__1__Impl rule__Ornament__Group__2 ;
    public final void rule__Ornament__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3400:1: ( rule__Ornament__Group__1__Impl rule__Ornament__Group__2 )
            // InternalMyDsl.g:3401:2: rule__Ornament__Group__1__Impl rule__Ornament__Group__2
            {
            pushFollow(FOLLOW_31);
            rule__Ornament__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ornament__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ornament__Group__1"


    // $ANTLR start "rule__Ornament__Group__1__Impl"
    // InternalMyDsl.g:3408:1: rule__Ornament__Group__1__Impl : ( 'ornament:' ) ;
    public final void rule__Ornament__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3412:1: ( ( 'ornament:' ) )
            // InternalMyDsl.g:3413:1: ( 'ornament:' )
            {
            // InternalMyDsl.g:3413:1: ( 'ornament:' )
            // InternalMyDsl.g:3414:2: 'ornament:'
            {
             before(grammarAccess.getOrnamentAccess().getOrnamentKeyword_1()); 
            match(input,72,FOLLOW_2); 
             after(grammarAccess.getOrnamentAccess().getOrnamentKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ornament__Group__1__Impl"


    // $ANTLR start "rule__Ornament__Group__2"
    // InternalMyDsl.g:3423:1: rule__Ornament__Group__2 : rule__Ornament__Group__2__Impl ;
    public final void rule__Ornament__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3427:1: ( rule__Ornament__Group__2__Impl )
            // InternalMyDsl.g:3428:2: rule__Ornament__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Ornament__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ornament__Group__2"


    // $ANTLR start "rule__Ornament__Group__2__Impl"
    // InternalMyDsl.g:3434:1: rule__Ornament__Group__2__Impl : ( ( rule__Ornament__TypeAssignment_2 )? ) ;
    public final void rule__Ornament__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3438:1: ( ( ( rule__Ornament__TypeAssignment_2 )? ) )
            // InternalMyDsl.g:3439:1: ( ( rule__Ornament__TypeAssignment_2 )? )
            {
            // InternalMyDsl.g:3439:1: ( ( rule__Ornament__TypeAssignment_2 )? )
            // InternalMyDsl.g:3440:2: ( rule__Ornament__TypeAssignment_2 )?
            {
             before(grammarAccess.getOrnamentAccess().getTypeAssignment_2()); 
            // InternalMyDsl.g:3441:2: ( rule__Ornament__TypeAssignment_2 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( ((LA38_0>=32 && LA38_0<=38)) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalMyDsl.g:3441:3: rule__Ornament__TypeAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Ornament__TypeAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOrnamentAccess().getTypeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ornament__Group__2__Impl"


    // $ANTLR start "rule__Articulation__Group__0"
    // InternalMyDsl.g:3450:1: rule__Articulation__Group__0 : rule__Articulation__Group__0__Impl rule__Articulation__Group__1 ;
    public final void rule__Articulation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3454:1: ( rule__Articulation__Group__0__Impl rule__Articulation__Group__1 )
            // InternalMyDsl.g:3455:2: rule__Articulation__Group__0__Impl rule__Articulation__Group__1
            {
            pushFollow(FOLLOW_32);
            rule__Articulation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Articulation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Articulation__Group__0"


    // $ANTLR start "rule__Articulation__Group__0__Impl"
    // InternalMyDsl.g:3462:1: rule__Articulation__Group__0__Impl : ( () ) ;
    public final void rule__Articulation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3466:1: ( ( () ) )
            // InternalMyDsl.g:3467:1: ( () )
            {
            // InternalMyDsl.g:3467:1: ( () )
            // InternalMyDsl.g:3468:2: ()
            {
             before(grammarAccess.getArticulationAccess().getArticulationAction_0()); 
            // InternalMyDsl.g:3469:2: ()
            // InternalMyDsl.g:3469:3: 
            {
            }

             after(grammarAccess.getArticulationAccess().getArticulationAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Articulation__Group__0__Impl"


    // $ANTLR start "rule__Articulation__Group__1"
    // InternalMyDsl.g:3477:1: rule__Articulation__Group__1 : rule__Articulation__Group__1__Impl rule__Articulation__Group__2 ;
    public final void rule__Articulation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3481:1: ( rule__Articulation__Group__1__Impl rule__Articulation__Group__2 )
            // InternalMyDsl.g:3482:2: rule__Articulation__Group__1__Impl rule__Articulation__Group__2
            {
            pushFollow(FOLLOW_33);
            rule__Articulation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Articulation__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Articulation__Group__1"


    // $ANTLR start "rule__Articulation__Group__1__Impl"
    // InternalMyDsl.g:3489:1: rule__Articulation__Group__1__Impl : ( 'articulation:' ) ;
    public final void rule__Articulation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3493:1: ( ( 'articulation:' ) )
            // InternalMyDsl.g:3494:1: ( 'articulation:' )
            {
            // InternalMyDsl.g:3494:1: ( 'articulation:' )
            // InternalMyDsl.g:3495:2: 'articulation:'
            {
             before(grammarAccess.getArticulationAccess().getArticulationKeyword_1()); 
            match(input,73,FOLLOW_2); 
             after(grammarAccess.getArticulationAccess().getArticulationKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Articulation__Group__1__Impl"


    // $ANTLR start "rule__Articulation__Group__2"
    // InternalMyDsl.g:3504:1: rule__Articulation__Group__2 : rule__Articulation__Group__2__Impl ;
    public final void rule__Articulation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3508:1: ( rule__Articulation__Group__2__Impl )
            // InternalMyDsl.g:3509:2: rule__Articulation__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Articulation__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Articulation__Group__2"


    // $ANTLR start "rule__Articulation__Group__2__Impl"
    // InternalMyDsl.g:3515:1: rule__Articulation__Group__2__Impl : ( ( rule__Articulation__TypeAssignment_2 )? ) ;
    public final void rule__Articulation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3519:1: ( ( ( rule__Articulation__TypeAssignment_2 )? ) )
            // InternalMyDsl.g:3520:1: ( ( rule__Articulation__TypeAssignment_2 )? )
            {
            // InternalMyDsl.g:3520:1: ( ( rule__Articulation__TypeAssignment_2 )? )
            // InternalMyDsl.g:3521:2: ( rule__Articulation__TypeAssignment_2 )?
            {
             before(grammarAccess.getArticulationAccess().getTypeAssignment_2()); 
            // InternalMyDsl.g:3522:2: ( rule__Articulation__TypeAssignment_2 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( ((LA39_0>=39 && LA39_0<=44)) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalMyDsl.g:3522:3: rule__Articulation__TypeAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Articulation__TypeAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getArticulationAccess().getTypeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Articulation__Group__2__Impl"


    // $ANTLR start "rule__Composition__NameAssignment_3_1"
    // InternalMyDsl.g:3531:1: rule__Composition__NameAssignment_3_1 : ( ruleEString ) ;
    public final void rule__Composition__NameAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3535:1: ( ( ruleEString ) )
            // InternalMyDsl.g:3536:2: ( ruleEString )
            {
            // InternalMyDsl.g:3536:2: ( ruleEString )
            // InternalMyDsl.g:3537:3: ruleEString
            {
             before(grammarAccess.getCompositionAccess().getNameEStringParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCompositionAccess().getNameEStringParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composition__NameAssignment_3_1"


    // $ANTLR start "rule__Composition__AuthorAssignment_4_1"
    // InternalMyDsl.g:3546:1: rule__Composition__AuthorAssignment_4_1 : ( ruleEString ) ;
    public final void rule__Composition__AuthorAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3550:1: ( ( ruleEString ) )
            // InternalMyDsl.g:3551:2: ( ruleEString )
            {
            // InternalMyDsl.g:3551:2: ( ruleEString )
            // InternalMyDsl.g:3552:3: ruleEString
            {
             before(grammarAccess.getCompositionAccess().getAuthorEStringParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCompositionAccess().getAuthorEStringParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composition__AuthorAssignment_4_1"


    // $ANTLR start "rule__Composition__InstrumentAssignment_5_1"
    // InternalMyDsl.g:3561:1: rule__Composition__InstrumentAssignment_5_1 : ( ruleEString ) ;
    public final void rule__Composition__InstrumentAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3565:1: ( ( ruleEString ) )
            // InternalMyDsl.g:3566:2: ( ruleEString )
            {
            // InternalMyDsl.g:3566:2: ( ruleEString )
            // InternalMyDsl.g:3567:3: ruleEString
            {
             before(grammarAccess.getCompositionAccess().getInstrumentEStringParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCompositionAccess().getInstrumentEStringParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composition__InstrumentAssignment_5_1"


    // $ANTLR start "rule__Composition__TonalityAssignment_6_1"
    // InternalMyDsl.g:3576:1: rule__Composition__TonalityAssignment_6_1 : ( ruleEString ) ;
    public final void rule__Composition__TonalityAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3580:1: ( ( ruleEString ) )
            // InternalMyDsl.g:3581:2: ( ruleEString )
            {
            // InternalMyDsl.g:3581:2: ( ruleEString )
            // InternalMyDsl.g:3582:3: ruleEString
            {
             before(grammarAccess.getCompositionAccess().getTonalityEStringParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCompositionAccess().getTonalityEStringParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composition__TonalityAssignment_6_1"


    // $ANTLR start "rule__Composition__SoundTempoAssignment_7_1"
    // InternalMyDsl.g:3591:1: rule__Composition__SoundTempoAssignment_7_1 : ( ruleEInt ) ;
    public final void rule__Composition__SoundTempoAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3595:1: ( ( ruleEInt ) )
            // InternalMyDsl.g:3596:2: ( ruleEInt )
            {
            // InternalMyDsl.g:3596:2: ( ruleEInt )
            // InternalMyDsl.g:3597:3: ruleEInt
            {
             before(grammarAccess.getCompositionAccess().getSoundTempoEIntParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getCompositionAccess().getSoundTempoEIntParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composition__SoundTempoAssignment_7_1"


    // $ANTLR start "rule__Composition__BracketAssignment_8_0"
    // InternalMyDsl.g:3606:1: rule__Composition__BracketAssignment_8_0 : ( ruleBracket ) ;
    public final void rule__Composition__BracketAssignment_8_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3610:1: ( ( ruleBracket ) )
            // InternalMyDsl.g:3611:2: ( ruleBracket )
            {
            // InternalMyDsl.g:3611:2: ( ruleBracket )
            // InternalMyDsl.g:3612:3: ruleBracket
            {
             before(grammarAccess.getCompositionAccess().getBracketBracketParserRuleCall_8_0_0()); 
            pushFollow(FOLLOW_2);
            ruleBracket();

            state._fsp--;

             after(grammarAccess.getCompositionAccess().getBracketBracketParserRuleCall_8_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composition__BracketAssignment_8_0"


    // $ANTLR start "rule__Composition__BracketAssignment_8_1_1"
    // InternalMyDsl.g:3621:1: rule__Composition__BracketAssignment_8_1_1 : ( ruleBracket ) ;
    public final void rule__Composition__BracketAssignment_8_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3625:1: ( ( ruleBracket ) )
            // InternalMyDsl.g:3626:2: ( ruleBracket )
            {
            // InternalMyDsl.g:3626:2: ( ruleBracket )
            // InternalMyDsl.g:3627:3: ruleBracket
            {
             before(grammarAccess.getCompositionAccess().getBracketBracketParserRuleCall_8_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBracket();

            state._fsp--;

             after(grammarAccess.getCompositionAccess().getBracketBracketParserRuleCall_8_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composition__BracketAssignment_8_1_1"


    // $ANTLR start "rule__Composition__StaffAssignment_9_0"
    // InternalMyDsl.g:3636:1: rule__Composition__StaffAssignment_9_0 : ( ruleStaff ) ;
    public final void rule__Composition__StaffAssignment_9_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3640:1: ( ( ruleStaff ) )
            // InternalMyDsl.g:3641:2: ( ruleStaff )
            {
            // InternalMyDsl.g:3641:2: ( ruleStaff )
            // InternalMyDsl.g:3642:3: ruleStaff
            {
             before(grammarAccess.getCompositionAccess().getStaffStaffParserRuleCall_9_0_0()); 
            pushFollow(FOLLOW_2);
            ruleStaff();

            state._fsp--;

             after(grammarAccess.getCompositionAccess().getStaffStaffParserRuleCall_9_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composition__StaffAssignment_9_0"


    // $ANTLR start "rule__Composition__StaffAssignment_9_1_1"
    // InternalMyDsl.g:3651:1: rule__Composition__StaffAssignment_9_1_1 : ( ruleStaff ) ;
    public final void rule__Composition__StaffAssignment_9_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3655:1: ( ( ruleStaff ) )
            // InternalMyDsl.g:3656:2: ( ruleStaff )
            {
            // InternalMyDsl.g:3656:2: ( ruleStaff )
            // InternalMyDsl.g:3657:3: ruleStaff
            {
             before(grammarAccess.getCompositionAccess().getStaffStaffParserRuleCall_9_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleStaff();

            state._fsp--;

             after(grammarAccess.getCompositionAccess().getStaffStaffParserRuleCall_9_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composition__StaffAssignment_9_1_1"


    // $ANTLR start "rule__Bracket__TypeAssignment_2"
    // InternalMyDsl.g:3666:1: rule__Bracket__TypeAssignment_2 : ( ruleBracketType ) ;
    public final void rule__Bracket__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3670:1: ( ( ruleBracketType ) )
            // InternalMyDsl.g:3671:2: ( ruleBracketType )
            {
            // InternalMyDsl.g:3671:2: ( ruleBracketType )
            // InternalMyDsl.g:3672:3: ruleBracketType
            {
             before(grammarAccess.getBracketAccess().getTypeBracketTypeEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleBracketType();

            state._fsp--;

             after(grammarAccess.getBracketAccess().getTypeBracketTypeEnumRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bracket__TypeAssignment_2"


    // $ANTLR start "rule__Bracket__StavesAssignment_3"
    // InternalMyDsl.g:3681:1: rule__Bracket__StavesAssignment_3 : ( ruleStaff ) ;
    public final void rule__Bracket__StavesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3685:1: ( ( ruleStaff ) )
            // InternalMyDsl.g:3686:2: ( ruleStaff )
            {
            // InternalMyDsl.g:3686:2: ( ruleStaff )
            // InternalMyDsl.g:3687:3: ruleStaff
            {
             before(grammarAccess.getBracketAccess().getStavesStaffParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleStaff();

            state._fsp--;

             after(grammarAccess.getBracketAccess().getStavesStaffParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bracket__StavesAssignment_3"


    // $ANTLR start "rule__Bracket__StavesAssignment_4_1"
    // InternalMyDsl.g:3696:1: rule__Bracket__StavesAssignment_4_1 : ( ruleStaff ) ;
    public final void rule__Bracket__StavesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3700:1: ( ( ruleStaff ) )
            // InternalMyDsl.g:3701:2: ( ruleStaff )
            {
            // InternalMyDsl.g:3701:2: ( ruleStaff )
            // InternalMyDsl.g:3702:3: ruleStaff
            {
             before(grammarAccess.getBracketAccess().getStavesStaffParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleStaff();

            state._fsp--;

             after(grammarAccess.getBracketAccess().getStavesStaffParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bracket__StavesAssignment_4_1"


    // $ANTLR start "rule__Staff__NumberAssignment_2"
    // InternalMyDsl.g:3711:1: rule__Staff__NumberAssignment_2 : ( ruleEInt ) ;
    public final void rule__Staff__NumberAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3715:1: ( ( ruleEInt ) )
            // InternalMyDsl.g:3716:2: ( ruleEInt )
            {
            // InternalMyDsl.g:3716:2: ( ruleEInt )
            // InternalMyDsl.g:3717:3: ruleEInt
            {
             before(grammarAccess.getStaffAccess().getNumberEIntParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getStaffAccess().getNumberEIntParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Staff__NumberAssignment_2"


    // $ANTLR start "rule__Staff__ClefAssignment_5"
    // InternalMyDsl.g:3726:1: rule__Staff__ClefAssignment_5 : ( ruleClef ) ;
    public final void rule__Staff__ClefAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3730:1: ( ( ruleClef ) )
            // InternalMyDsl.g:3731:2: ( ruleClef )
            {
            // InternalMyDsl.g:3731:2: ( ruleClef )
            // InternalMyDsl.g:3732:3: ruleClef
            {
             before(grammarAccess.getStaffAccess().getClefClefParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleClef();

            state._fsp--;

             after(grammarAccess.getStaffAccess().getClefClefParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Staff__ClefAssignment_5"


    // $ANTLR start "rule__Staff__TimeAssignment_7"
    // InternalMyDsl.g:3741:1: rule__Staff__TimeAssignment_7 : ( ruleTimeSignature ) ;
    public final void rule__Staff__TimeAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3745:1: ( ( ruleTimeSignature ) )
            // InternalMyDsl.g:3746:2: ( ruleTimeSignature )
            {
            // InternalMyDsl.g:3746:2: ( ruleTimeSignature )
            // InternalMyDsl.g:3747:3: ruleTimeSignature
            {
             before(grammarAccess.getStaffAccess().getTimeTimeSignatureParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleTimeSignature();

            state._fsp--;

             after(grammarAccess.getStaffAccess().getTimeTimeSignatureParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Staff__TimeAssignment_7"


    // $ANTLR start "rule__Staff__ElementsAssignment_10"
    // InternalMyDsl.g:3756:1: rule__Staff__ElementsAssignment_10 : ( ruleStaffElement ) ;
    public final void rule__Staff__ElementsAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3760:1: ( ( ruleStaffElement ) )
            // InternalMyDsl.g:3761:2: ( ruleStaffElement )
            {
            // InternalMyDsl.g:3761:2: ( ruleStaffElement )
            // InternalMyDsl.g:3762:3: ruleStaffElement
            {
             before(grammarAccess.getStaffAccess().getElementsStaffElementParserRuleCall_10_0()); 
            pushFollow(FOLLOW_2);
            ruleStaffElement();

            state._fsp--;

             after(grammarAccess.getStaffAccess().getElementsStaffElementParserRuleCall_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Staff__ElementsAssignment_10"


    // $ANTLR start "rule__Staff__ElementsAssignment_11_1"
    // InternalMyDsl.g:3771:1: rule__Staff__ElementsAssignment_11_1 : ( ruleStaffElement ) ;
    public final void rule__Staff__ElementsAssignment_11_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3775:1: ( ( ruleStaffElement ) )
            // InternalMyDsl.g:3776:2: ( ruleStaffElement )
            {
            // InternalMyDsl.g:3776:2: ( ruleStaffElement )
            // InternalMyDsl.g:3777:3: ruleStaffElement
            {
             before(grammarAccess.getStaffAccess().getElementsStaffElementParserRuleCall_11_1_0()); 
            pushFollow(FOLLOW_2);
            ruleStaffElement();

            state._fsp--;

             after(grammarAccess.getStaffAccess().getElementsStaffElementParserRuleCall_11_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Staff__ElementsAssignment_11_1"


    // $ANTLR start "rule__Clef__TypeAssignment_1"
    // InternalMyDsl.g:3786:1: rule__Clef__TypeAssignment_1 : ( ruleClefType ) ;
    public final void rule__Clef__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3790:1: ( ( ruleClefType ) )
            // InternalMyDsl.g:3791:2: ( ruleClefType )
            {
            // InternalMyDsl.g:3791:2: ( ruleClefType )
            // InternalMyDsl.g:3792:3: ruleClefType
            {
             before(grammarAccess.getClefAccess().getTypeClefTypeEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleClefType();

            state._fsp--;

             after(grammarAccess.getClefAccess().getTypeClefTypeEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clef__TypeAssignment_1"


    // $ANTLR start "rule__TimeSignature__BeatAssignment_1"
    // InternalMyDsl.g:3801:1: rule__TimeSignature__BeatAssignment_1 : ( ruleEInt ) ;
    public final void rule__TimeSignature__BeatAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3805:1: ( ( ruleEInt ) )
            // InternalMyDsl.g:3806:2: ( ruleEInt )
            {
            // InternalMyDsl.g:3806:2: ( ruleEInt )
            // InternalMyDsl.g:3807:3: ruleEInt
            {
             before(grammarAccess.getTimeSignatureAccess().getBeatEIntParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getTimeSignatureAccess().getBeatEIntParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeSignature__BeatAssignment_1"


    // $ANTLR start "rule__TimeSignature__BeatTypeAssignment_3"
    // InternalMyDsl.g:3816:1: rule__TimeSignature__BeatTypeAssignment_3 : ( ruleEInt ) ;
    public final void rule__TimeSignature__BeatTypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3820:1: ( ( ruleEInt ) )
            // InternalMyDsl.g:3821:2: ( ruleEInt )
            {
            // InternalMyDsl.g:3821:2: ( ruleEInt )
            // InternalMyDsl.g:3822:3: ruleEInt
            {
             before(grammarAccess.getTimeSignatureAccess().getBeatTypeEIntParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getTimeSignatureAccess().getBeatTypeEIntParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeSignature__BeatTypeAssignment_3"


    // $ANTLR start "rule__Rest__TypeAssignment_2"
    // InternalMyDsl.g:3831:1: rule__Rest__TypeAssignment_2 : ( ruleRestType ) ;
    public final void rule__Rest__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3835:1: ( ( ruleRestType ) )
            // InternalMyDsl.g:3836:2: ( ruleRestType )
            {
            // InternalMyDsl.g:3836:2: ( ruleRestType )
            // InternalMyDsl.g:3837:3: ruleRestType
            {
             before(grammarAccess.getRestAccess().getTypeRestTypeEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleRestType();

            state._fsp--;

             after(grammarAccess.getRestAccess().getTypeRestTypeEnumRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rest__TypeAssignment_2"


    // $ANTLR start "rule__Accidental__TypeAssignment_2"
    // InternalMyDsl.g:3846:1: rule__Accidental__TypeAssignment_2 : ( ruleAccidentalType ) ;
    public final void rule__Accidental__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3850:1: ( ( ruleAccidentalType ) )
            // InternalMyDsl.g:3851:2: ( ruleAccidentalType )
            {
            // InternalMyDsl.g:3851:2: ( ruleAccidentalType )
            // InternalMyDsl.g:3852:3: ruleAccidentalType
            {
             before(grammarAccess.getAccidentalAccess().getTypeAccidentalTypeEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAccidentalType();

            state._fsp--;

             after(grammarAccess.getAccidentalAccess().getTypeAccidentalTypeEnumRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Accidental__TypeAssignment_2"


    // $ANTLR start "rule__Accidental__PositionAssignment_3"
    // InternalMyDsl.g:3861:1: rule__Accidental__PositionAssignment_3 : ( ruleEInt ) ;
    public final void rule__Accidental__PositionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3865:1: ( ( ruleEInt ) )
            // InternalMyDsl.g:3866:2: ( ruleEInt )
            {
            // InternalMyDsl.g:3866:2: ( ruleEInt )
            // InternalMyDsl.g:3867:3: ruleEInt
            {
             before(grammarAccess.getAccidentalAccess().getPositionEIntParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getAccidentalAccess().getPositionEIntParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Accidental__PositionAssignment_3"


    // $ANTLR start "rule__Repetition__TypeAssignment_2"
    // InternalMyDsl.g:3876:1: rule__Repetition__TypeAssignment_2 : ( ruleRepetitionType ) ;
    public final void rule__Repetition__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3880:1: ( ( ruleRepetitionType ) )
            // InternalMyDsl.g:3881:2: ( ruleRepetitionType )
            {
            // InternalMyDsl.g:3881:2: ( ruleRepetitionType )
            // InternalMyDsl.g:3882:3: ruleRepetitionType
            {
             before(grammarAccess.getRepetitionAccess().getTypeRepetitionTypeEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleRepetitionType();

            state._fsp--;

             after(grammarAccess.getRepetitionAccess().getTypeRepetitionTypeEnumRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Repetition__TypeAssignment_2"


    // $ANTLR start "rule__Note__NameAssignment_2"
    // InternalMyDsl.g:3891:1: rule__Note__NameAssignment_2 : ( ruleNoteName ) ;
    public final void rule__Note__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3895:1: ( ( ruleNoteName ) )
            // InternalMyDsl.g:3896:2: ( ruleNoteName )
            {
            // InternalMyDsl.g:3896:2: ( ruleNoteName )
            // InternalMyDsl.g:3897:3: ruleNoteName
            {
             before(grammarAccess.getNoteAccess().getNameNoteNameEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleNoteName();

            state._fsp--;

             after(grammarAccess.getNoteAccess().getNameNoteNameEnumRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Note__NameAssignment_2"


    // $ANTLR start "rule__Note__LyricsAssignment_3_1"
    // InternalMyDsl.g:3906:1: rule__Note__LyricsAssignment_3_1 : ( ruleEString ) ;
    public final void rule__Note__LyricsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3910:1: ( ( ruleEString ) )
            // InternalMyDsl.g:3911:2: ( ruleEString )
            {
            // InternalMyDsl.g:3911:2: ( ruleEString )
            // InternalMyDsl.g:3912:3: ruleEString
            {
             before(grammarAccess.getNoteAccess().getLyricsEStringParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getNoteAccess().getLyricsEStringParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Note__LyricsAssignment_3_1"


    // $ANTLR start "rule__Note__DurationAssignment_4_1"
    // InternalMyDsl.g:3921:1: rule__Note__DurationAssignment_4_1 : ( ruleNoteDuration ) ;
    public final void rule__Note__DurationAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3925:1: ( ( ruleNoteDuration ) )
            // InternalMyDsl.g:3926:2: ( ruleNoteDuration )
            {
            // InternalMyDsl.g:3926:2: ( ruleNoteDuration )
            // InternalMyDsl.g:3927:3: ruleNoteDuration
            {
             before(grammarAccess.getNoteAccess().getDurationNoteDurationEnumRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleNoteDuration();

            state._fsp--;

             after(grammarAccess.getNoteAccess().getDurationNoteDurationEnumRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Note__DurationAssignment_4_1"


    // $ANTLR start "rule__Note__PositionAssignment_5_1"
    // InternalMyDsl.g:3936:1: rule__Note__PositionAssignment_5_1 : ( ruleEInt ) ;
    public final void rule__Note__PositionAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3940:1: ( ( ruleEInt ) )
            // InternalMyDsl.g:3941:2: ( ruleEInt )
            {
            // InternalMyDsl.g:3941:2: ( ruleEInt )
            // InternalMyDsl.g:3942:3: ruleEInt
            {
             before(grammarAccess.getNoteAccess().getPositionEIntParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getNoteAccess().getPositionEIntParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Note__PositionAssignment_5_1"


    // $ANTLR start "rule__Note__DynamicAssignment_6_1"
    // InternalMyDsl.g:3951:1: rule__Note__DynamicAssignment_6_1 : ( ruleEString ) ;
    public final void rule__Note__DynamicAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3955:1: ( ( ruleEString ) )
            // InternalMyDsl.g:3956:2: ( ruleEString )
            {
            // InternalMyDsl.g:3956:2: ( ruleEString )
            // InternalMyDsl.g:3957:3: ruleEString
            {
             before(grammarAccess.getNoteAccess().getDynamicEStringParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getNoteAccess().getDynamicEStringParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Note__DynamicAssignment_6_1"


    // $ANTLR start "rule__Note__OrnamentAssignment_7"
    // InternalMyDsl.g:3966:1: rule__Note__OrnamentAssignment_7 : ( ruleOrnament ) ;
    public final void rule__Note__OrnamentAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3970:1: ( ( ruleOrnament ) )
            // InternalMyDsl.g:3971:2: ( ruleOrnament )
            {
            // InternalMyDsl.g:3971:2: ( ruleOrnament )
            // InternalMyDsl.g:3972:3: ruleOrnament
            {
             before(grammarAccess.getNoteAccess().getOrnamentOrnamentParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleOrnament();

            state._fsp--;

             after(grammarAccess.getNoteAccess().getOrnamentOrnamentParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Note__OrnamentAssignment_7"


    // $ANTLR start "rule__Note__AccidentalAssignment_8"
    // InternalMyDsl.g:3981:1: rule__Note__AccidentalAssignment_8 : ( ruleAccidental ) ;
    public final void rule__Note__AccidentalAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3985:1: ( ( ruleAccidental ) )
            // InternalMyDsl.g:3986:2: ( ruleAccidental )
            {
            // InternalMyDsl.g:3986:2: ( ruleAccidental )
            // InternalMyDsl.g:3987:3: ruleAccidental
            {
             before(grammarAccess.getNoteAccess().getAccidentalAccidentalParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleAccidental();

            state._fsp--;

             after(grammarAccess.getNoteAccess().getAccidentalAccidentalParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Note__AccidentalAssignment_8"


    // $ANTLR start "rule__Note__ArticulationAssignment_9"
    // InternalMyDsl.g:3996:1: rule__Note__ArticulationAssignment_9 : ( ruleArticulation ) ;
    public final void rule__Note__ArticulationAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4000:1: ( ( ruleArticulation ) )
            // InternalMyDsl.g:4001:2: ( ruleArticulation )
            {
            // InternalMyDsl.g:4001:2: ( ruleArticulation )
            // InternalMyDsl.g:4002:3: ruleArticulation
            {
             before(grammarAccess.getNoteAccess().getArticulationArticulationParserRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            ruleArticulation();

            state._fsp--;

             after(grammarAccess.getNoteAccess().getArticulationArticulationParserRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Note__ArticulationAssignment_9"


    // $ANTLR start "rule__Note__FermataAssignment_10"
    // InternalMyDsl.g:4011:1: rule__Note__FermataAssignment_10 : ( ( 'fermata' ) ) ;
    public final void rule__Note__FermataAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4015:1: ( ( ( 'fermata' ) ) )
            // InternalMyDsl.g:4016:2: ( ( 'fermata' ) )
            {
            // InternalMyDsl.g:4016:2: ( ( 'fermata' ) )
            // InternalMyDsl.g:4017:3: ( 'fermata' )
            {
             before(grammarAccess.getNoteAccess().getFermataFermataKeyword_10_0()); 
            // InternalMyDsl.g:4018:3: ( 'fermata' )
            // InternalMyDsl.g:4019:4: 'fermata'
            {
             before(grammarAccess.getNoteAccess().getFermataFermataKeyword_10_0()); 
            match(input,74,FOLLOW_2); 
             after(grammarAccess.getNoteAccess().getFermataFermataKeyword_10_0()); 

            }

             after(grammarAccess.getNoteAccess().getFermataFermataKeyword_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Note__FermataAssignment_10"


    // $ANTLR start "rule__Note__DotAssignment_11"
    // InternalMyDsl.g:4030:1: rule__Note__DotAssignment_11 : ( ( 'dot' ) ) ;
    public final void rule__Note__DotAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4034:1: ( ( ( 'dot' ) ) )
            // InternalMyDsl.g:4035:2: ( ( 'dot' ) )
            {
            // InternalMyDsl.g:4035:2: ( ( 'dot' ) )
            // InternalMyDsl.g:4036:3: ( 'dot' )
            {
             before(grammarAccess.getNoteAccess().getDotDotKeyword_11_0()); 
            // InternalMyDsl.g:4037:3: ( 'dot' )
            // InternalMyDsl.g:4038:4: 'dot'
            {
             before(grammarAccess.getNoteAccess().getDotDotKeyword_11_0()); 
            match(input,75,FOLLOW_2); 
             after(grammarAccess.getNoteAccess().getDotDotKeyword_11_0()); 

            }

             after(grammarAccess.getNoteAccess().getDotDotKeyword_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Note__DotAssignment_11"


    // $ANTLR start "rule__Ornament__TypeAssignment_2"
    // InternalMyDsl.g:4049:1: rule__Ornament__TypeAssignment_2 : ( ruleOrnamentType ) ;
    public final void rule__Ornament__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4053:1: ( ( ruleOrnamentType ) )
            // InternalMyDsl.g:4054:2: ( ruleOrnamentType )
            {
            // InternalMyDsl.g:4054:2: ( ruleOrnamentType )
            // InternalMyDsl.g:4055:3: ruleOrnamentType
            {
             before(grammarAccess.getOrnamentAccess().getTypeOrnamentTypeEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleOrnamentType();

            state._fsp--;

             after(grammarAccess.getOrnamentAccess().getTypeOrnamentTypeEnumRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ornament__TypeAssignment_2"


    // $ANTLR start "rule__Articulation__TypeAssignment_2"
    // InternalMyDsl.g:4064:1: rule__Articulation__TypeAssignment_2 : ( ruleArticulationType ) ;
    public final void rule__Articulation__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4068:1: ( ( ruleArticulationType ) )
            // InternalMyDsl.g:4069:2: ( ruleArticulationType )
            {
            // InternalMyDsl.g:4069:2: ( ruleArticulationType )
            // InternalMyDsl.g:4070:3: ruleArticulationType
            {
             before(grammarAccess.getArticulationAccess().getTypeArticulationTypeEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleArticulationType();

            state._fsp--;

             after(grammarAccess.getArticulationAccess().getTypeArticulationTypeEnumRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Articulation__TypeAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x037E000000000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x2000000000000040L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0200000000001800L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000600000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000000L,0x000000000000000FL});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0082000000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x00000000000FE000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x2000000000700040L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x00000000FE000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000FF2L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000007F00000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x00001F8000000000L});

}