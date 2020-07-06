package org.xtext.example.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Composition'", "'['", "'name:'", "'author:'", "'instrument:'", "'tonality:'", "'soundTempo:'", "','", "']'", "'Bracket'", "'Staff'", "'Clef:'", "'timeSignature:'", "'elements'", "'-'", "'beat'", "'beatType'", "'rest:'", "'accidental:'", "'repetition:'", "'note:'", "'lyrics:'", "'duration:'", "'position:'", "'dynamic:'", "'fermata'", "'dot'", "'ornament:'", "'articulation:'", "'curly'", "'square'", "'whole'", "'half'", "'quarter'", "'eighth'", "'sixteenth'", "'thirtysecond'", "'sixtyfourth'", "'sharp'", "'flat'", "'natural'", "'left'", "'right'", "'c'", "'d'", "'e'", "'f'", "'g'", "'a'", "'b'", "'slide'", "'glissando'", "'aciaccatura'", "'appoggiatura'", "'turn'", "'mordent'", "'trill'", "'detached'", "'legato'", "'staccato'", "'portato'", "'tenuto'", "'marcato'", "'violin'", "'bass'"
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

        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Composition";
       	}

       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleComposition"
    // InternalMyDsl.g:65:1: entryRuleComposition returns [EObject current=null] : iv_ruleComposition= ruleComposition EOF ;
    public final EObject entryRuleComposition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComposition = null;


        try {
            // InternalMyDsl.g:65:52: (iv_ruleComposition= ruleComposition EOF )
            // InternalMyDsl.g:66:2: iv_ruleComposition= ruleComposition EOF
            {
             newCompositeNode(grammarAccess.getCompositionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComposition=ruleComposition();

            state._fsp--;

             current =iv_ruleComposition; 
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
    // $ANTLR end "entryRuleComposition"


    // $ANTLR start "ruleComposition"
    // InternalMyDsl.g:72:1: ruleComposition returns [EObject current=null] : ( () otherlv_1= 'Composition' otherlv_2= '[' (otherlv_3= 'name:' ( (lv_name_4_0= ruleEString ) ) )? (otherlv_5= 'author:' ( (lv_author_6_0= ruleEString ) ) )? (otherlv_7= 'instrument:' ( (lv_instrument_8_0= ruleEString ) ) )? (otherlv_9= 'tonality:' ( (lv_tonality_10_0= ruleEString ) ) )? (otherlv_11= 'soundTempo:' ( (lv_soundTempo_12_0= ruleEInt ) ) )? ( ( (lv_bracket_13_0= ruleBracket ) ) (otherlv_14= ',' ( (lv_bracket_15_0= ruleBracket ) ) )* )? ( ( (lv_staff_16_0= ruleStaff ) ) (otherlv_17= ',' ( (lv_staff_18_0= ruleStaff ) ) )* )? otherlv_19= ']' ) ;
    public final EObject ruleComposition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_14=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        AntlrDatatypeRuleToken lv_name_4_0 = null;

        AntlrDatatypeRuleToken lv_author_6_0 = null;

        AntlrDatatypeRuleToken lv_instrument_8_0 = null;

        AntlrDatatypeRuleToken lv_tonality_10_0 = null;

        AntlrDatatypeRuleToken lv_soundTempo_12_0 = null;

        EObject lv_bracket_13_0 = null;

        EObject lv_bracket_15_0 = null;

        EObject lv_staff_16_0 = null;

        EObject lv_staff_18_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:78:2: ( ( () otherlv_1= 'Composition' otherlv_2= '[' (otherlv_3= 'name:' ( (lv_name_4_0= ruleEString ) ) )? (otherlv_5= 'author:' ( (lv_author_6_0= ruleEString ) ) )? (otherlv_7= 'instrument:' ( (lv_instrument_8_0= ruleEString ) ) )? (otherlv_9= 'tonality:' ( (lv_tonality_10_0= ruleEString ) ) )? (otherlv_11= 'soundTempo:' ( (lv_soundTempo_12_0= ruleEInt ) ) )? ( ( (lv_bracket_13_0= ruleBracket ) ) (otherlv_14= ',' ( (lv_bracket_15_0= ruleBracket ) ) )* )? ( ( (lv_staff_16_0= ruleStaff ) ) (otherlv_17= ',' ( (lv_staff_18_0= ruleStaff ) ) )* )? otherlv_19= ']' ) )
            // InternalMyDsl.g:79:2: ( () otherlv_1= 'Composition' otherlv_2= '[' (otherlv_3= 'name:' ( (lv_name_4_0= ruleEString ) ) )? (otherlv_5= 'author:' ( (lv_author_6_0= ruleEString ) ) )? (otherlv_7= 'instrument:' ( (lv_instrument_8_0= ruleEString ) ) )? (otherlv_9= 'tonality:' ( (lv_tonality_10_0= ruleEString ) ) )? (otherlv_11= 'soundTempo:' ( (lv_soundTempo_12_0= ruleEInt ) ) )? ( ( (lv_bracket_13_0= ruleBracket ) ) (otherlv_14= ',' ( (lv_bracket_15_0= ruleBracket ) ) )* )? ( ( (lv_staff_16_0= ruleStaff ) ) (otherlv_17= ',' ( (lv_staff_18_0= ruleStaff ) ) )* )? otherlv_19= ']' )
            {
            // InternalMyDsl.g:79:2: ( () otherlv_1= 'Composition' otherlv_2= '[' (otherlv_3= 'name:' ( (lv_name_4_0= ruleEString ) ) )? (otherlv_5= 'author:' ( (lv_author_6_0= ruleEString ) ) )? (otherlv_7= 'instrument:' ( (lv_instrument_8_0= ruleEString ) ) )? (otherlv_9= 'tonality:' ( (lv_tonality_10_0= ruleEString ) ) )? (otherlv_11= 'soundTempo:' ( (lv_soundTempo_12_0= ruleEInt ) ) )? ( ( (lv_bracket_13_0= ruleBracket ) ) (otherlv_14= ',' ( (lv_bracket_15_0= ruleBracket ) ) )* )? ( ( (lv_staff_16_0= ruleStaff ) ) (otherlv_17= ',' ( (lv_staff_18_0= ruleStaff ) ) )* )? otherlv_19= ']' )
            // InternalMyDsl.g:80:3: () otherlv_1= 'Composition' otherlv_2= '[' (otherlv_3= 'name:' ( (lv_name_4_0= ruleEString ) ) )? (otherlv_5= 'author:' ( (lv_author_6_0= ruleEString ) ) )? (otherlv_7= 'instrument:' ( (lv_instrument_8_0= ruleEString ) ) )? (otherlv_9= 'tonality:' ( (lv_tonality_10_0= ruleEString ) ) )? (otherlv_11= 'soundTempo:' ( (lv_soundTempo_12_0= ruleEInt ) ) )? ( ( (lv_bracket_13_0= ruleBracket ) ) (otherlv_14= ',' ( (lv_bracket_15_0= ruleBracket ) ) )* )? ( ( (lv_staff_16_0= ruleStaff ) ) (otherlv_17= ',' ( (lv_staff_18_0= ruleStaff ) ) )* )? otherlv_19= ']'
            {
            // InternalMyDsl.g:80:3: ()
            // InternalMyDsl.g:81:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCompositionAccess().getCompositionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getCompositionAccess().getCompositionKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getCompositionAccess().getLeftSquareBracketKeyword_2());
            		
            // InternalMyDsl.g:95:3: (otherlv_3= 'name:' ( (lv_name_4_0= ruleEString ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==13) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalMyDsl.g:96:4: otherlv_3= 'name:' ( (lv_name_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getCompositionAccess().getNameKeyword_3_0());
                    			
                    // InternalMyDsl.g:100:4: ( (lv_name_4_0= ruleEString ) )
                    // InternalMyDsl.g:101:5: (lv_name_4_0= ruleEString )
                    {
                    // InternalMyDsl.g:101:5: (lv_name_4_0= ruleEString )
                    // InternalMyDsl.g:102:6: lv_name_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getCompositionAccess().getNameEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_name_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCompositionRule());
                    						}
                    						set(
                    							current,
                    							"name",
                    							lv_name_4_0,
                    							"org.xtext.example.mydsl.MyDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:120:3: (otherlv_5= 'author:' ( (lv_author_6_0= ruleEString ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:121:4: otherlv_5= 'author:' ( (lv_author_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,14,FOLLOW_5); 

                    				newLeafNode(otherlv_5, grammarAccess.getCompositionAccess().getAuthorKeyword_4_0());
                    			
                    // InternalMyDsl.g:125:4: ( (lv_author_6_0= ruleEString ) )
                    // InternalMyDsl.g:126:5: (lv_author_6_0= ruleEString )
                    {
                    // InternalMyDsl.g:126:5: (lv_author_6_0= ruleEString )
                    // InternalMyDsl.g:127:6: lv_author_6_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getCompositionAccess().getAuthorEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_author_6_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCompositionRule());
                    						}
                    						set(
                    							current,
                    							"author",
                    							lv_author_6_0,
                    							"org.xtext.example.mydsl.MyDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:145:3: (otherlv_7= 'instrument:' ( (lv_instrument_8_0= ruleEString ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==15) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:146:4: otherlv_7= 'instrument:' ( (lv_instrument_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,15,FOLLOW_5); 

                    				newLeafNode(otherlv_7, grammarAccess.getCompositionAccess().getInstrumentKeyword_5_0());
                    			
                    // InternalMyDsl.g:150:4: ( (lv_instrument_8_0= ruleEString ) )
                    // InternalMyDsl.g:151:5: (lv_instrument_8_0= ruleEString )
                    {
                    // InternalMyDsl.g:151:5: (lv_instrument_8_0= ruleEString )
                    // InternalMyDsl.g:152:6: lv_instrument_8_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getCompositionAccess().getInstrumentEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_instrument_8_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCompositionRule());
                    						}
                    						set(
                    							current,
                    							"instrument",
                    							lv_instrument_8_0,
                    							"org.xtext.example.mydsl.MyDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:170:3: (otherlv_9= 'tonality:' ( (lv_tonality_10_0= ruleEString ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:171:4: otherlv_9= 'tonality:' ( (lv_tonality_10_0= ruleEString ) )
                    {
                    otherlv_9=(Token)match(input,16,FOLLOW_5); 

                    				newLeafNode(otherlv_9, grammarAccess.getCompositionAccess().getTonalityKeyword_6_0());
                    			
                    // InternalMyDsl.g:175:4: ( (lv_tonality_10_0= ruleEString ) )
                    // InternalMyDsl.g:176:5: (lv_tonality_10_0= ruleEString )
                    {
                    // InternalMyDsl.g:176:5: (lv_tonality_10_0= ruleEString )
                    // InternalMyDsl.g:177:6: lv_tonality_10_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getCompositionAccess().getTonalityEStringParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_tonality_10_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCompositionRule());
                    						}
                    						set(
                    							current,
                    							"tonality",
                    							lv_tonality_10_0,
                    							"org.xtext.example.mydsl.MyDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:195:3: (otherlv_11= 'soundTempo:' ( (lv_soundTempo_12_0= ruleEInt ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==17) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:196:4: otherlv_11= 'soundTempo:' ( (lv_soundTempo_12_0= ruleEInt ) )
                    {
                    otherlv_11=(Token)match(input,17,FOLLOW_10); 

                    				newLeafNode(otherlv_11, grammarAccess.getCompositionAccess().getSoundTempoKeyword_7_0());
                    			
                    // InternalMyDsl.g:200:4: ( (lv_soundTempo_12_0= ruleEInt ) )
                    // InternalMyDsl.g:201:5: (lv_soundTempo_12_0= ruleEInt )
                    {
                    // InternalMyDsl.g:201:5: (lv_soundTempo_12_0= ruleEInt )
                    // InternalMyDsl.g:202:6: lv_soundTempo_12_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getCompositionAccess().getSoundTempoEIntParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_soundTempo_12_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCompositionRule());
                    						}
                    						set(
                    							current,
                    							"soundTempo",
                    							lv_soundTempo_12_0,
                    							"org.xtext.example.mydsl.MyDsl.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:220:3: ( ( (lv_bracket_13_0= ruleBracket ) ) (otherlv_14= ',' ( (lv_bracket_15_0= ruleBracket ) ) )* )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==20) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:221:4: ( (lv_bracket_13_0= ruleBracket ) ) (otherlv_14= ',' ( (lv_bracket_15_0= ruleBracket ) ) )*
                    {
                    // InternalMyDsl.g:221:4: ( (lv_bracket_13_0= ruleBracket ) )
                    // InternalMyDsl.g:222:5: (lv_bracket_13_0= ruleBracket )
                    {
                    // InternalMyDsl.g:222:5: (lv_bracket_13_0= ruleBracket )
                    // InternalMyDsl.g:223:6: lv_bracket_13_0= ruleBracket
                    {

                    						newCompositeNode(grammarAccess.getCompositionAccess().getBracketBracketParserRuleCall_8_0_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_bracket_13_0=ruleBracket();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCompositionRule());
                    						}
                    						add(
                    							current,
                    							"bracket",
                    							lv_bracket_13_0,
                    							"org.xtext.example.mydsl.MyDsl.Bracket");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:240:4: (otherlv_14= ',' ( (lv_bracket_15_0= ruleBracket ) ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==18) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalMyDsl.g:241:5: otherlv_14= ',' ( (lv_bracket_15_0= ruleBracket ) )
                    	    {
                    	    otherlv_14=(Token)match(input,18,FOLLOW_13); 

                    	    					newLeafNode(otherlv_14, grammarAccess.getCompositionAccess().getCommaKeyword_8_1_0());
                    	    				
                    	    // InternalMyDsl.g:245:5: ( (lv_bracket_15_0= ruleBracket ) )
                    	    // InternalMyDsl.g:246:6: (lv_bracket_15_0= ruleBracket )
                    	    {
                    	    // InternalMyDsl.g:246:6: (lv_bracket_15_0= ruleBracket )
                    	    // InternalMyDsl.g:247:7: lv_bracket_15_0= ruleBracket
                    	    {

                    	    							newCompositeNode(grammarAccess.getCompositionAccess().getBracketBracketParserRuleCall_8_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
                    	    lv_bracket_15_0=ruleBracket();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getCompositionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"bracket",
                    	    								lv_bracket_15_0,
                    	    								"org.xtext.example.mydsl.MyDsl.Bracket");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalMyDsl.g:266:3: ( ( (lv_staff_16_0= ruleStaff ) ) (otherlv_17= ',' ( (lv_staff_18_0= ruleStaff ) ) )* )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==21) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalMyDsl.g:267:4: ( (lv_staff_16_0= ruleStaff ) ) (otherlv_17= ',' ( (lv_staff_18_0= ruleStaff ) ) )*
                    {
                    // InternalMyDsl.g:267:4: ( (lv_staff_16_0= ruleStaff ) )
                    // InternalMyDsl.g:268:5: (lv_staff_16_0= ruleStaff )
                    {
                    // InternalMyDsl.g:268:5: (lv_staff_16_0= ruleStaff )
                    // InternalMyDsl.g:269:6: lv_staff_16_0= ruleStaff
                    {

                    						newCompositeNode(grammarAccess.getCompositionAccess().getStaffStaffParserRuleCall_9_0_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_staff_16_0=ruleStaff();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCompositionRule());
                    						}
                    						add(
                    							current,
                    							"staff",
                    							lv_staff_16_0,
                    							"org.xtext.example.mydsl.MyDsl.Staff");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:286:4: (otherlv_17= ',' ( (lv_staff_18_0= ruleStaff ) ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==18) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalMyDsl.g:287:5: otherlv_17= ',' ( (lv_staff_18_0= ruleStaff ) )
                    	    {
                    	    otherlv_17=(Token)match(input,18,FOLLOW_15); 

                    	    					newLeafNode(otherlv_17, grammarAccess.getCompositionAccess().getCommaKeyword_9_1_0());
                    	    				
                    	    // InternalMyDsl.g:291:5: ( (lv_staff_18_0= ruleStaff ) )
                    	    // InternalMyDsl.g:292:6: (lv_staff_18_0= ruleStaff )
                    	    {
                    	    // InternalMyDsl.g:292:6: (lv_staff_18_0= ruleStaff )
                    	    // InternalMyDsl.g:293:7: lv_staff_18_0= ruleStaff
                    	    {

                    	    							newCompositeNode(grammarAccess.getCompositionAccess().getStaffStaffParserRuleCall_9_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_14);
                    	    lv_staff_18_0=ruleStaff();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getCompositionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"staff",
                    	    								lv_staff_18_0,
                    	    								"org.xtext.example.mydsl.MyDsl.Staff");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_19=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_19, grammarAccess.getCompositionAccess().getRightSquareBracketKeyword_10());
            		

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
    // $ANTLR end "ruleComposition"


    // $ANTLR start "entryRuleStaffElement"
    // InternalMyDsl.g:320:1: entryRuleStaffElement returns [EObject current=null] : iv_ruleStaffElement= ruleStaffElement EOF ;
    public final EObject entryRuleStaffElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStaffElement = null;


        try {
            // InternalMyDsl.g:320:53: (iv_ruleStaffElement= ruleStaffElement EOF )
            // InternalMyDsl.g:321:2: iv_ruleStaffElement= ruleStaffElement EOF
            {
             newCompositeNode(grammarAccess.getStaffElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStaffElement=ruleStaffElement();

            state._fsp--;

             current =iv_ruleStaffElement; 
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
    // $ANTLR end "entryRuleStaffElement"


    // $ANTLR start "ruleStaffElement"
    // InternalMyDsl.g:327:1: ruleStaffElement returns [EObject current=null] : (this_Rest_0= ruleRest | this_Accidental_1= ruleAccidental | this_Repetition_2= ruleRepetition | this_Note_3= ruleNote ) ;
    public final EObject ruleStaffElement() throws RecognitionException {
        EObject current = null;

        EObject this_Rest_0 = null;

        EObject this_Accidental_1 = null;

        EObject this_Repetition_2 = null;

        EObject this_Note_3 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:333:2: ( (this_Rest_0= ruleRest | this_Accidental_1= ruleAccidental | this_Repetition_2= ruleRepetition | this_Note_3= ruleNote ) )
            // InternalMyDsl.g:334:2: (this_Rest_0= ruleRest | this_Accidental_1= ruleAccidental | this_Repetition_2= ruleRepetition | this_Note_3= ruleNote )
            {
            // InternalMyDsl.g:334:2: (this_Rest_0= ruleRest | this_Accidental_1= ruleAccidental | this_Repetition_2= ruleRepetition | this_Note_3= ruleNote )
            int alt10=4;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt10=1;
                }
                break;
            case 29:
                {
                alt10=2;
                }
                break;
            case 30:
                {
                alt10=3;
                }
                break;
            case 31:
                {
                alt10=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalMyDsl.g:335:3: this_Rest_0= ruleRest
                    {

                    			newCompositeNode(grammarAccess.getStaffElementAccess().getRestParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Rest_0=ruleRest();

                    state._fsp--;


                    			current = this_Rest_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:344:3: this_Accidental_1= ruleAccidental
                    {

                    			newCompositeNode(grammarAccess.getStaffElementAccess().getAccidentalParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Accidental_1=ruleAccidental();

                    state._fsp--;


                    			current = this_Accidental_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:353:3: this_Repetition_2= ruleRepetition
                    {

                    			newCompositeNode(grammarAccess.getStaffElementAccess().getRepetitionParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Repetition_2=ruleRepetition();

                    state._fsp--;


                    			current = this_Repetition_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:362:3: this_Note_3= ruleNote
                    {

                    			newCompositeNode(grammarAccess.getStaffElementAccess().getNoteParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Note_3=ruleNote();

                    state._fsp--;


                    			current = this_Note_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

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
    // $ANTLR end "ruleStaffElement"


    // $ANTLR start "entryRuleBracket"
    // InternalMyDsl.g:374:1: entryRuleBracket returns [EObject current=null] : iv_ruleBracket= ruleBracket EOF ;
    public final EObject entryRuleBracket() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBracket = null;


        try {
            // InternalMyDsl.g:374:48: (iv_ruleBracket= ruleBracket EOF )
            // InternalMyDsl.g:375:2: iv_ruleBracket= ruleBracket EOF
            {
             newCompositeNode(grammarAccess.getBracketRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBracket=ruleBracket();

            state._fsp--;

             current =iv_ruleBracket; 
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
    // $ANTLR end "entryRuleBracket"


    // $ANTLR start "ruleBracket"
    // InternalMyDsl.g:381:1: ruleBracket returns [EObject current=null] : ( () otherlv_1= 'Bracket' ( (lv_type_2_0= ruleBracketType ) )? ( (lv_staves_3_0= ruleStaff ) ) (otherlv_4= ',' ( (lv_staves_5_0= ruleStaff ) ) )* ) ;
    public final EObject ruleBracket() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        Enumerator lv_type_2_0 = null;

        EObject lv_staves_3_0 = null;

        EObject lv_staves_5_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:387:2: ( ( () otherlv_1= 'Bracket' ( (lv_type_2_0= ruleBracketType ) )? ( (lv_staves_3_0= ruleStaff ) ) (otherlv_4= ',' ( (lv_staves_5_0= ruleStaff ) ) )* ) )
            // InternalMyDsl.g:388:2: ( () otherlv_1= 'Bracket' ( (lv_type_2_0= ruleBracketType ) )? ( (lv_staves_3_0= ruleStaff ) ) (otherlv_4= ',' ( (lv_staves_5_0= ruleStaff ) ) )* )
            {
            // InternalMyDsl.g:388:2: ( () otherlv_1= 'Bracket' ( (lv_type_2_0= ruleBracketType ) )? ( (lv_staves_3_0= ruleStaff ) ) (otherlv_4= ',' ( (lv_staves_5_0= ruleStaff ) ) )* )
            // InternalMyDsl.g:389:3: () otherlv_1= 'Bracket' ( (lv_type_2_0= ruleBracketType ) )? ( (lv_staves_3_0= ruleStaff ) ) (otherlv_4= ',' ( (lv_staves_5_0= ruleStaff ) ) )*
            {
            // InternalMyDsl.g:389:3: ()
            // InternalMyDsl.g:390:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBracketAccess().getBracketAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,20,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getBracketAccess().getBracketKeyword_1());
            		
            // InternalMyDsl.g:400:3: ( (lv_type_2_0= ruleBracketType ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=40 && LA11_0<=41)) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalMyDsl.g:401:4: (lv_type_2_0= ruleBracketType )
                    {
                    // InternalMyDsl.g:401:4: (lv_type_2_0= ruleBracketType )
                    // InternalMyDsl.g:402:5: lv_type_2_0= ruleBracketType
                    {

                    					newCompositeNode(grammarAccess.getBracketAccess().getTypeBracketTypeEnumRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_15);
                    lv_type_2_0=ruleBracketType();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getBracketRule());
                    					}
                    					set(
                    						current,
                    						"type",
                    						lv_type_2_0,
                    						"org.xtext.example.mydsl.MyDsl.BracketType");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalMyDsl.g:419:3: ( (lv_staves_3_0= ruleStaff ) )
            // InternalMyDsl.g:420:4: (lv_staves_3_0= ruleStaff )
            {
            // InternalMyDsl.g:420:4: (lv_staves_3_0= ruleStaff )
            // InternalMyDsl.g:421:5: lv_staves_3_0= ruleStaff
            {

            					newCompositeNode(grammarAccess.getBracketAccess().getStavesStaffParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_17);
            lv_staves_3_0=ruleStaff();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBracketRule());
            					}
            					add(
            						current,
            						"staves",
            						lv_staves_3_0,
            						"org.xtext.example.mydsl.MyDsl.Staff");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:438:3: (otherlv_4= ',' ( (lv_staves_5_0= ruleStaff ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==18) ) {
                    int LA12_1 = input.LA(2);

                    if ( (LA12_1==21) ) {
                        alt12=1;
                    }


                }


                switch (alt12) {
            	case 1 :
            	    // InternalMyDsl.g:439:4: otherlv_4= ',' ( (lv_staves_5_0= ruleStaff ) )
            	    {
            	    otherlv_4=(Token)match(input,18,FOLLOW_15); 

            	    				newLeafNode(otherlv_4, grammarAccess.getBracketAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalMyDsl.g:443:4: ( (lv_staves_5_0= ruleStaff ) )
            	    // InternalMyDsl.g:444:5: (lv_staves_5_0= ruleStaff )
            	    {
            	    // InternalMyDsl.g:444:5: (lv_staves_5_0= ruleStaff )
            	    // InternalMyDsl.g:445:6: lv_staves_5_0= ruleStaff
            	    {

            	    						newCompositeNode(grammarAccess.getBracketAccess().getStavesStaffParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_17);
            	    lv_staves_5_0=ruleStaff();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getBracketRule());
            	    						}
            	    						add(
            	    							current,
            	    							"staves",
            	    							lv_staves_5_0,
            	    							"org.xtext.example.mydsl.MyDsl.Staff");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


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
    // $ANTLR end "ruleBracket"


    // $ANTLR start "entryRuleStaff"
    // InternalMyDsl.g:467:1: entryRuleStaff returns [EObject current=null] : iv_ruleStaff= ruleStaff EOF ;
    public final EObject entryRuleStaff() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStaff = null;


        try {
            // InternalMyDsl.g:467:46: (iv_ruleStaff= ruleStaff EOF )
            // InternalMyDsl.g:468:2: iv_ruleStaff= ruleStaff EOF
            {
             newCompositeNode(grammarAccess.getStaffRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStaff=ruleStaff();

            state._fsp--;

             current =iv_ruleStaff; 
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
    // $ANTLR end "entryRuleStaff"


    // $ANTLR start "ruleStaff"
    // InternalMyDsl.g:474:1: ruleStaff returns [EObject current=null] : ( () otherlv_1= 'Staff' ( (lv_number_2_0= ruleEInt ) ) otherlv_3= '[' otherlv_4= 'Clef:' ( (lv_clef_5_0= ruleClef ) ) otherlv_6= 'timeSignature:' ( (lv_time_7_0= ruleTimeSignature ) ) otherlv_8= 'elements' otherlv_9= '[' ( (lv_elements_10_0= ruleStaffElement ) ) (otherlv_11= ',' ( (lv_elements_12_0= ruleStaffElement ) ) )* otherlv_13= ']' otherlv_14= ']' ) ;
    public final EObject ruleStaff() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        AntlrDatatypeRuleToken lv_number_2_0 = null;

        EObject lv_clef_5_0 = null;

        EObject lv_time_7_0 = null;

        EObject lv_elements_10_0 = null;

        EObject lv_elements_12_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:480:2: ( ( () otherlv_1= 'Staff' ( (lv_number_2_0= ruleEInt ) ) otherlv_3= '[' otherlv_4= 'Clef:' ( (lv_clef_5_0= ruleClef ) ) otherlv_6= 'timeSignature:' ( (lv_time_7_0= ruleTimeSignature ) ) otherlv_8= 'elements' otherlv_9= '[' ( (lv_elements_10_0= ruleStaffElement ) ) (otherlv_11= ',' ( (lv_elements_12_0= ruleStaffElement ) ) )* otherlv_13= ']' otherlv_14= ']' ) )
            // InternalMyDsl.g:481:2: ( () otherlv_1= 'Staff' ( (lv_number_2_0= ruleEInt ) ) otherlv_3= '[' otherlv_4= 'Clef:' ( (lv_clef_5_0= ruleClef ) ) otherlv_6= 'timeSignature:' ( (lv_time_7_0= ruleTimeSignature ) ) otherlv_8= 'elements' otherlv_9= '[' ( (lv_elements_10_0= ruleStaffElement ) ) (otherlv_11= ',' ( (lv_elements_12_0= ruleStaffElement ) ) )* otherlv_13= ']' otherlv_14= ']' )
            {
            // InternalMyDsl.g:481:2: ( () otherlv_1= 'Staff' ( (lv_number_2_0= ruleEInt ) ) otherlv_3= '[' otherlv_4= 'Clef:' ( (lv_clef_5_0= ruleClef ) ) otherlv_6= 'timeSignature:' ( (lv_time_7_0= ruleTimeSignature ) ) otherlv_8= 'elements' otherlv_9= '[' ( (lv_elements_10_0= ruleStaffElement ) ) (otherlv_11= ',' ( (lv_elements_12_0= ruleStaffElement ) ) )* otherlv_13= ']' otherlv_14= ']' )
            // InternalMyDsl.g:482:3: () otherlv_1= 'Staff' ( (lv_number_2_0= ruleEInt ) ) otherlv_3= '[' otherlv_4= 'Clef:' ( (lv_clef_5_0= ruleClef ) ) otherlv_6= 'timeSignature:' ( (lv_time_7_0= ruleTimeSignature ) ) otherlv_8= 'elements' otherlv_9= '[' ( (lv_elements_10_0= ruleStaffElement ) ) (otherlv_11= ',' ( (lv_elements_12_0= ruleStaffElement ) ) )* otherlv_13= ']' otherlv_14= ']'
            {
            // InternalMyDsl.g:482:3: ()
            // InternalMyDsl.g:483:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStaffAccess().getStaffAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,21,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getStaffAccess().getStaffKeyword_1());
            		
            // InternalMyDsl.g:493:3: ( (lv_number_2_0= ruleEInt ) )
            // InternalMyDsl.g:494:4: (lv_number_2_0= ruleEInt )
            {
            // InternalMyDsl.g:494:4: (lv_number_2_0= ruleEInt )
            // InternalMyDsl.g:495:5: lv_number_2_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getStaffAccess().getNumberEIntParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_number_2_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStaffRule());
            					}
            					set(
            						current,
            						"number",
            						lv_number_2_0,
            						"org.xtext.example.mydsl.MyDsl.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_18); 

            			newLeafNode(otherlv_3, grammarAccess.getStaffAccess().getLeftSquareBracketKeyword_3());
            		
            otherlv_4=(Token)match(input,22,FOLLOW_19); 

            			newLeafNode(otherlv_4, grammarAccess.getStaffAccess().getClefKeyword_4());
            		
            // InternalMyDsl.g:520:3: ( (lv_clef_5_0= ruleClef ) )
            // InternalMyDsl.g:521:4: (lv_clef_5_0= ruleClef )
            {
            // InternalMyDsl.g:521:4: (lv_clef_5_0= ruleClef )
            // InternalMyDsl.g:522:5: lv_clef_5_0= ruleClef
            {

            					newCompositeNode(grammarAccess.getStaffAccess().getClefClefParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_20);
            lv_clef_5_0=ruleClef();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStaffRule());
            					}
            					set(
            						current,
            						"clef",
            						lv_clef_5_0,
            						"org.xtext.example.mydsl.MyDsl.Clef");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,23,FOLLOW_21); 

            			newLeafNode(otherlv_6, grammarAccess.getStaffAccess().getTimeSignatureKeyword_6());
            		
            // InternalMyDsl.g:543:3: ( (lv_time_7_0= ruleTimeSignature ) )
            // InternalMyDsl.g:544:4: (lv_time_7_0= ruleTimeSignature )
            {
            // InternalMyDsl.g:544:4: (lv_time_7_0= ruleTimeSignature )
            // InternalMyDsl.g:545:5: lv_time_7_0= ruleTimeSignature
            {

            					newCompositeNode(grammarAccess.getStaffAccess().getTimeTimeSignatureParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_22);
            lv_time_7_0=ruleTimeSignature();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStaffRule());
            					}
            					set(
            						current,
            						"time",
            						lv_time_7_0,
            						"org.xtext.example.mydsl.MyDsl.TimeSignature");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,24,FOLLOW_3); 

            			newLeafNode(otherlv_8, grammarAccess.getStaffAccess().getElementsKeyword_8());
            		
            otherlv_9=(Token)match(input,12,FOLLOW_23); 

            			newLeafNode(otherlv_9, grammarAccess.getStaffAccess().getLeftSquareBracketKeyword_9());
            		
            // InternalMyDsl.g:570:3: ( (lv_elements_10_0= ruleStaffElement ) )
            // InternalMyDsl.g:571:4: (lv_elements_10_0= ruleStaffElement )
            {
            // InternalMyDsl.g:571:4: (lv_elements_10_0= ruleStaffElement )
            // InternalMyDsl.g:572:5: lv_elements_10_0= ruleStaffElement
            {

            					newCompositeNode(grammarAccess.getStaffAccess().getElementsStaffElementParserRuleCall_10_0());
            				
            pushFollow(FOLLOW_14);
            lv_elements_10_0=ruleStaffElement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStaffRule());
            					}
            					add(
            						current,
            						"elements",
            						lv_elements_10_0,
            						"org.xtext.example.mydsl.MyDsl.StaffElement");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:589:3: (otherlv_11= ',' ( (lv_elements_12_0= ruleStaffElement ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==18) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalMyDsl.g:590:4: otherlv_11= ',' ( (lv_elements_12_0= ruleStaffElement ) )
            	    {
            	    otherlv_11=(Token)match(input,18,FOLLOW_23); 

            	    				newLeafNode(otherlv_11, grammarAccess.getStaffAccess().getCommaKeyword_11_0());
            	    			
            	    // InternalMyDsl.g:594:4: ( (lv_elements_12_0= ruleStaffElement ) )
            	    // InternalMyDsl.g:595:5: (lv_elements_12_0= ruleStaffElement )
            	    {
            	    // InternalMyDsl.g:595:5: (lv_elements_12_0= ruleStaffElement )
            	    // InternalMyDsl.g:596:6: lv_elements_12_0= ruleStaffElement
            	    {

            	    						newCompositeNode(grammarAccess.getStaffAccess().getElementsStaffElementParserRuleCall_11_1_0());
            	    					
            	    pushFollow(FOLLOW_14);
            	    lv_elements_12_0=ruleStaffElement();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getStaffRule());
            	    						}
            	    						add(
            	    							current,
            	    							"elements",
            	    							lv_elements_12_0,
            	    							"org.xtext.example.mydsl.MyDsl.StaffElement");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            otherlv_13=(Token)match(input,19,FOLLOW_24); 

            			newLeafNode(otherlv_13, grammarAccess.getStaffAccess().getRightSquareBracketKeyword_12());
            		
            otherlv_14=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_14, grammarAccess.getStaffAccess().getRightSquareBracketKeyword_13());
            		

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
    // $ANTLR end "ruleStaff"


    // $ANTLR start "entryRuleEString"
    // InternalMyDsl.g:626:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalMyDsl.g:626:47: (iv_ruleEString= ruleEString EOF )
            // InternalMyDsl.g:627:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalMyDsl.g:633:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:639:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalMyDsl.g:640:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalMyDsl.g:640:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_STRING) ) {
                alt14=1;
            }
            else if ( (LA14_0==RULE_ID) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalMyDsl.g:641:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:649:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

                    }
                    break;

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
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleEInt"
    // InternalMyDsl.g:660:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalMyDsl.g:660:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalMyDsl.g:661:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
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
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalMyDsl.g:667:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:673:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalMyDsl.g:674:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalMyDsl.g:674:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalMyDsl.g:675:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalMyDsl.g:675:3: (kw= '-' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==25) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalMyDsl.g:676:4: kw= '-'
                    {
                    kw=(Token)match(input,25,FOLLOW_25); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1());
            		

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
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleClef"
    // InternalMyDsl.g:693:1: entryRuleClef returns [EObject current=null] : iv_ruleClef= ruleClef EOF ;
    public final EObject entryRuleClef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClef = null;


        try {
            // InternalMyDsl.g:693:45: (iv_ruleClef= ruleClef EOF )
            // InternalMyDsl.g:694:2: iv_ruleClef= ruleClef EOF
            {
             newCompositeNode(grammarAccess.getClefRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClef=ruleClef();

            state._fsp--;

             current =iv_ruleClef; 
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
    // $ANTLR end "entryRuleClef"


    // $ANTLR start "ruleClef"
    // InternalMyDsl.g:700:1: ruleClef returns [EObject current=null] : ( () ( (lv_type_1_0= ruleClefType ) )? ) ;
    public final EObject ruleClef() throws RecognitionException {
        EObject current = null;

        Enumerator lv_type_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:706:2: ( ( () ( (lv_type_1_0= ruleClefType ) )? ) )
            // InternalMyDsl.g:707:2: ( () ( (lv_type_1_0= ruleClefType ) )? )
            {
            // InternalMyDsl.g:707:2: ( () ( (lv_type_1_0= ruleClefType ) )? )
            // InternalMyDsl.g:708:3: () ( (lv_type_1_0= ruleClefType ) )?
            {
            // InternalMyDsl.g:708:3: ()
            // InternalMyDsl.g:709:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getClefAccess().getClefAction_0(),
            					current);
            			

            }

            // InternalMyDsl.g:715:3: ( (lv_type_1_0= ruleClefType ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=74 && LA16_0<=75)) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalMyDsl.g:716:4: (lv_type_1_0= ruleClefType )
                    {
                    // InternalMyDsl.g:716:4: (lv_type_1_0= ruleClefType )
                    // InternalMyDsl.g:717:5: lv_type_1_0= ruleClefType
                    {

                    					newCompositeNode(grammarAccess.getClefAccess().getTypeClefTypeEnumRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_type_1_0=ruleClefType();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getClefRule());
                    					}
                    					set(
                    						current,
                    						"type",
                    						lv_type_1_0,
                    						"org.xtext.example.mydsl.MyDsl.ClefType");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


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
    // $ANTLR end "ruleClef"


    // $ANTLR start "entryRuleTimeSignature"
    // InternalMyDsl.g:738:1: entryRuleTimeSignature returns [EObject current=null] : iv_ruleTimeSignature= ruleTimeSignature EOF ;
    public final EObject entryRuleTimeSignature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimeSignature = null;


        try {
            // InternalMyDsl.g:738:54: (iv_ruleTimeSignature= ruleTimeSignature EOF )
            // InternalMyDsl.g:739:2: iv_ruleTimeSignature= ruleTimeSignature EOF
            {
             newCompositeNode(grammarAccess.getTimeSignatureRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTimeSignature=ruleTimeSignature();

            state._fsp--;

             current =iv_ruleTimeSignature; 
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
    // $ANTLR end "entryRuleTimeSignature"


    // $ANTLR start "ruleTimeSignature"
    // InternalMyDsl.g:745:1: ruleTimeSignature returns [EObject current=null] : (otherlv_0= 'beat' ( (lv_beat_1_0= ruleEInt ) ) otherlv_2= 'beatType' ( (lv_beatType_3_0= ruleEInt ) ) ) ;
    public final EObject ruleTimeSignature() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_beat_1_0 = null;

        AntlrDatatypeRuleToken lv_beatType_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:751:2: ( (otherlv_0= 'beat' ( (lv_beat_1_0= ruleEInt ) ) otherlv_2= 'beatType' ( (lv_beatType_3_0= ruleEInt ) ) ) )
            // InternalMyDsl.g:752:2: (otherlv_0= 'beat' ( (lv_beat_1_0= ruleEInt ) ) otherlv_2= 'beatType' ( (lv_beatType_3_0= ruleEInt ) ) )
            {
            // InternalMyDsl.g:752:2: (otherlv_0= 'beat' ( (lv_beat_1_0= ruleEInt ) ) otherlv_2= 'beatType' ( (lv_beatType_3_0= ruleEInt ) ) )
            // InternalMyDsl.g:753:3: otherlv_0= 'beat' ( (lv_beat_1_0= ruleEInt ) ) otherlv_2= 'beatType' ( (lv_beatType_3_0= ruleEInt ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getTimeSignatureAccess().getBeatKeyword_0());
            		
            // InternalMyDsl.g:757:3: ( (lv_beat_1_0= ruleEInt ) )
            // InternalMyDsl.g:758:4: (lv_beat_1_0= ruleEInt )
            {
            // InternalMyDsl.g:758:4: (lv_beat_1_0= ruleEInt )
            // InternalMyDsl.g:759:5: lv_beat_1_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getTimeSignatureAccess().getBeatEIntParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_26);
            lv_beat_1_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTimeSignatureRule());
            					}
            					set(
            						current,
            						"beat",
            						lv_beat_1_0,
            						"org.xtext.example.mydsl.MyDsl.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,27,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getTimeSignatureAccess().getBeatTypeKeyword_2());
            		
            // InternalMyDsl.g:780:3: ( (lv_beatType_3_0= ruleEInt ) )
            // InternalMyDsl.g:781:4: (lv_beatType_3_0= ruleEInt )
            {
            // InternalMyDsl.g:781:4: (lv_beatType_3_0= ruleEInt )
            // InternalMyDsl.g:782:5: lv_beatType_3_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getTimeSignatureAccess().getBeatTypeEIntParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_beatType_3_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTimeSignatureRule());
            					}
            					set(
            						current,
            						"beatType",
            						lv_beatType_3_0,
            						"org.xtext.example.mydsl.MyDsl.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }


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
    // $ANTLR end "ruleTimeSignature"


    // $ANTLR start "entryRuleRest"
    // InternalMyDsl.g:803:1: entryRuleRest returns [EObject current=null] : iv_ruleRest= ruleRest EOF ;
    public final EObject entryRuleRest() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRest = null;


        try {
            // InternalMyDsl.g:803:45: (iv_ruleRest= ruleRest EOF )
            // InternalMyDsl.g:804:2: iv_ruleRest= ruleRest EOF
            {
             newCompositeNode(grammarAccess.getRestRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRest=ruleRest();

            state._fsp--;

             current =iv_ruleRest; 
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
    // $ANTLR end "entryRuleRest"


    // $ANTLR start "ruleRest"
    // InternalMyDsl.g:810:1: ruleRest returns [EObject current=null] : ( () otherlv_1= 'rest:' ( (lv_type_2_0= ruleRestType ) )? ) ;
    public final EObject ruleRest() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Enumerator lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:816:2: ( ( () otherlv_1= 'rest:' ( (lv_type_2_0= ruleRestType ) )? ) )
            // InternalMyDsl.g:817:2: ( () otherlv_1= 'rest:' ( (lv_type_2_0= ruleRestType ) )? )
            {
            // InternalMyDsl.g:817:2: ( () otherlv_1= 'rest:' ( (lv_type_2_0= ruleRestType ) )? )
            // InternalMyDsl.g:818:3: () otherlv_1= 'rest:' ( (lv_type_2_0= ruleRestType ) )?
            {
            // InternalMyDsl.g:818:3: ()
            // InternalMyDsl.g:819:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRestAccess().getRestAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,28,FOLLOW_27); 

            			newLeafNode(otherlv_1, grammarAccess.getRestAccess().getRestKeyword_1());
            		
            // InternalMyDsl.g:829:3: ( (lv_type_2_0= ruleRestType ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=42 && LA17_0<=48)) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalMyDsl.g:830:4: (lv_type_2_0= ruleRestType )
                    {
                    // InternalMyDsl.g:830:4: (lv_type_2_0= ruleRestType )
                    // InternalMyDsl.g:831:5: lv_type_2_0= ruleRestType
                    {

                    					newCompositeNode(grammarAccess.getRestAccess().getTypeRestTypeEnumRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_type_2_0=ruleRestType();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getRestRule());
                    					}
                    					set(
                    						current,
                    						"type",
                    						lv_type_2_0,
                    						"org.xtext.example.mydsl.MyDsl.RestType");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


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
    // $ANTLR end "ruleRest"


    // $ANTLR start "entryRuleAccidental"
    // InternalMyDsl.g:852:1: entryRuleAccidental returns [EObject current=null] : iv_ruleAccidental= ruleAccidental EOF ;
    public final EObject entryRuleAccidental() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAccidental = null;


        try {
            // InternalMyDsl.g:852:51: (iv_ruleAccidental= ruleAccidental EOF )
            // InternalMyDsl.g:853:2: iv_ruleAccidental= ruleAccidental EOF
            {
             newCompositeNode(grammarAccess.getAccidentalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAccidental=ruleAccidental();

            state._fsp--;

             current =iv_ruleAccidental; 
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
    // $ANTLR end "entryRuleAccidental"


    // $ANTLR start "ruleAccidental"
    // InternalMyDsl.g:859:1: ruleAccidental returns [EObject current=null] : ( () otherlv_1= 'accidental:' ( (lv_type_2_0= ruleAccidentalType ) )? ( (lv_position_3_0= ruleEInt ) ) ) ;
    public final EObject ruleAccidental() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Enumerator lv_type_2_0 = null;

        AntlrDatatypeRuleToken lv_position_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:865:2: ( ( () otherlv_1= 'accidental:' ( (lv_type_2_0= ruleAccidentalType ) )? ( (lv_position_3_0= ruleEInt ) ) ) )
            // InternalMyDsl.g:866:2: ( () otherlv_1= 'accidental:' ( (lv_type_2_0= ruleAccidentalType ) )? ( (lv_position_3_0= ruleEInt ) ) )
            {
            // InternalMyDsl.g:866:2: ( () otherlv_1= 'accidental:' ( (lv_type_2_0= ruleAccidentalType ) )? ( (lv_position_3_0= ruleEInt ) ) )
            // InternalMyDsl.g:867:3: () otherlv_1= 'accidental:' ( (lv_type_2_0= ruleAccidentalType ) )? ( (lv_position_3_0= ruleEInt ) )
            {
            // InternalMyDsl.g:867:3: ()
            // InternalMyDsl.g:868:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAccidentalAccess().getAccidentalAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,29,FOLLOW_28); 

            			newLeafNode(otherlv_1, grammarAccess.getAccidentalAccess().getAccidentalKeyword_1());
            		
            // InternalMyDsl.g:878:3: ( (lv_type_2_0= ruleAccidentalType ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=49 && LA18_0<=51)) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalMyDsl.g:879:4: (lv_type_2_0= ruleAccidentalType )
                    {
                    // InternalMyDsl.g:879:4: (lv_type_2_0= ruleAccidentalType )
                    // InternalMyDsl.g:880:5: lv_type_2_0= ruleAccidentalType
                    {

                    					newCompositeNode(grammarAccess.getAccidentalAccess().getTypeAccidentalTypeEnumRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_10);
                    lv_type_2_0=ruleAccidentalType();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getAccidentalRule());
                    					}
                    					set(
                    						current,
                    						"type",
                    						lv_type_2_0,
                    						"org.xtext.example.mydsl.MyDsl.AccidentalType");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalMyDsl.g:897:3: ( (lv_position_3_0= ruleEInt ) )
            // InternalMyDsl.g:898:4: (lv_position_3_0= ruleEInt )
            {
            // InternalMyDsl.g:898:4: (lv_position_3_0= ruleEInt )
            // InternalMyDsl.g:899:5: lv_position_3_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getAccidentalAccess().getPositionEIntParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_position_3_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAccidentalRule());
            					}
            					set(
            						current,
            						"position",
            						lv_position_3_0,
            						"org.xtext.example.mydsl.MyDsl.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }


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
    // $ANTLR end "ruleAccidental"


    // $ANTLR start "entryRuleRepetition"
    // InternalMyDsl.g:920:1: entryRuleRepetition returns [EObject current=null] : iv_ruleRepetition= ruleRepetition EOF ;
    public final EObject entryRuleRepetition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRepetition = null;


        try {
            // InternalMyDsl.g:920:51: (iv_ruleRepetition= ruleRepetition EOF )
            // InternalMyDsl.g:921:2: iv_ruleRepetition= ruleRepetition EOF
            {
             newCompositeNode(grammarAccess.getRepetitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRepetition=ruleRepetition();

            state._fsp--;

             current =iv_ruleRepetition; 
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
    // $ANTLR end "entryRuleRepetition"


    // $ANTLR start "ruleRepetition"
    // InternalMyDsl.g:927:1: ruleRepetition returns [EObject current=null] : ( () otherlv_1= 'repetition:' ( (lv_type_2_0= ruleRepetitionType ) )? ) ;
    public final EObject ruleRepetition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Enumerator lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:933:2: ( ( () otherlv_1= 'repetition:' ( (lv_type_2_0= ruleRepetitionType ) )? ) )
            // InternalMyDsl.g:934:2: ( () otherlv_1= 'repetition:' ( (lv_type_2_0= ruleRepetitionType ) )? )
            {
            // InternalMyDsl.g:934:2: ( () otherlv_1= 'repetition:' ( (lv_type_2_0= ruleRepetitionType ) )? )
            // InternalMyDsl.g:935:3: () otherlv_1= 'repetition:' ( (lv_type_2_0= ruleRepetitionType ) )?
            {
            // InternalMyDsl.g:935:3: ()
            // InternalMyDsl.g:936:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRepetitionAccess().getRepetitionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,30,FOLLOW_29); 

            			newLeafNode(otherlv_1, grammarAccess.getRepetitionAccess().getRepetitionKeyword_1());
            		
            // InternalMyDsl.g:946:3: ( (lv_type_2_0= ruleRepetitionType ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( ((LA19_0>=52 && LA19_0<=53)) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalMyDsl.g:947:4: (lv_type_2_0= ruleRepetitionType )
                    {
                    // InternalMyDsl.g:947:4: (lv_type_2_0= ruleRepetitionType )
                    // InternalMyDsl.g:948:5: lv_type_2_0= ruleRepetitionType
                    {

                    					newCompositeNode(grammarAccess.getRepetitionAccess().getTypeRepetitionTypeEnumRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_type_2_0=ruleRepetitionType();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getRepetitionRule());
                    					}
                    					set(
                    						current,
                    						"type",
                    						lv_type_2_0,
                    						"org.xtext.example.mydsl.MyDsl.RepetitionType");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


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
    // $ANTLR end "ruleRepetition"


    // $ANTLR start "entryRuleNote"
    // InternalMyDsl.g:969:1: entryRuleNote returns [EObject current=null] : iv_ruleNote= ruleNote EOF ;
    public final EObject entryRuleNote() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNote = null;


        try {
            // InternalMyDsl.g:969:45: (iv_ruleNote= ruleNote EOF )
            // InternalMyDsl.g:970:2: iv_ruleNote= ruleNote EOF
            {
             newCompositeNode(grammarAccess.getNoteRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNote=ruleNote();

            state._fsp--;

             current =iv_ruleNote; 
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
    // $ANTLR end "entryRuleNote"


    // $ANTLR start "ruleNote"
    // InternalMyDsl.g:976:1: ruleNote returns [EObject current=null] : ( () otherlv_1= 'note:' ( (lv_name_2_0= ruleNoteName ) ) (otherlv_3= 'lyrics:' ( (lv_lyrics_4_0= ruleEString ) ) )? (otherlv_5= 'duration:' ( (lv_duration_6_0= ruleNoteDuration ) ) )? (otherlv_7= 'position:' ( (lv_position_8_0= ruleEInt ) ) )? (otherlv_9= 'dynamic:' ( (lv_dynamic_10_0= ruleEString ) ) )? ( (lv_ornament_11_0= ruleOrnament ) )? ( (lv_accidental_12_0= ruleAccidental ) )? ( (lv_articulation_13_0= ruleArticulation ) )? ( (lv_fermata_14_0= 'fermata' ) )? ( (lv_dot_15_0= 'dot' ) )? ) ;
    public final EObject ruleNote() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token lv_fermata_14_0=null;
        Token lv_dot_15_0=null;
        Enumerator lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_lyrics_4_0 = null;

        Enumerator lv_duration_6_0 = null;

        AntlrDatatypeRuleToken lv_position_8_0 = null;

        AntlrDatatypeRuleToken lv_dynamic_10_0 = null;

        EObject lv_ornament_11_0 = null;

        EObject lv_accidental_12_0 = null;

        EObject lv_articulation_13_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:982:2: ( ( () otherlv_1= 'note:' ( (lv_name_2_0= ruleNoteName ) ) (otherlv_3= 'lyrics:' ( (lv_lyrics_4_0= ruleEString ) ) )? (otherlv_5= 'duration:' ( (lv_duration_6_0= ruleNoteDuration ) ) )? (otherlv_7= 'position:' ( (lv_position_8_0= ruleEInt ) ) )? (otherlv_9= 'dynamic:' ( (lv_dynamic_10_0= ruleEString ) ) )? ( (lv_ornament_11_0= ruleOrnament ) )? ( (lv_accidental_12_0= ruleAccidental ) )? ( (lv_articulation_13_0= ruleArticulation ) )? ( (lv_fermata_14_0= 'fermata' ) )? ( (lv_dot_15_0= 'dot' ) )? ) )
            // InternalMyDsl.g:983:2: ( () otherlv_1= 'note:' ( (lv_name_2_0= ruleNoteName ) ) (otherlv_3= 'lyrics:' ( (lv_lyrics_4_0= ruleEString ) ) )? (otherlv_5= 'duration:' ( (lv_duration_6_0= ruleNoteDuration ) ) )? (otherlv_7= 'position:' ( (lv_position_8_0= ruleEInt ) ) )? (otherlv_9= 'dynamic:' ( (lv_dynamic_10_0= ruleEString ) ) )? ( (lv_ornament_11_0= ruleOrnament ) )? ( (lv_accidental_12_0= ruleAccidental ) )? ( (lv_articulation_13_0= ruleArticulation ) )? ( (lv_fermata_14_0= 'fermata' ) )? ( (lv_dot_15_0= 'dot' ) )? )
            {
            // InternalMyDsl.g:983:2: ( () otherlv_1= 'note:' ( (lv_name_2_0= ruleNoteName ) ) (otherlv_3= 'lyrics:' ( (lv_lyrics_4_0= ruleEString ) ) )? (otherlv_5= 'duration:' ( (lv_duration_6_0= ruleNoteDuration ) ) )? (otherlv_7= 'position:' ( (lv_position_8_0= ruleEInt ) ) )? (otherlv_9= 'dynamic:' ( (lv_dynamic_10_0= ruleEString ) ) )? ( (lv_ornament_11_0= ruleOrnament ) )? ( (lv_accidental_12_0= ruleAccidental ) )? ( (lv_articulation_13_0= ruleArticulation ) )? ( (lv_fermata_14_0= 'fermata' ) )? ( (lv_dot_15_0= 'dot' ) )? )
            // InternalMyDsl.g:984:3: () otherlv_1= 'note:' ( (lv_name_2_0= ruleNoteName ) ) (otherlv_3= 'lyrics:' ( (lv_lyrics_4_0= ruleEString ) ) )? (otherlv_5= 'duration:' ( (lv_duration_6_0= ruleNoteDuration ) ) )? (otherlv_7= 'position:' ( (lv_position_8_0= ruleEInt ) ) )? (otherlv_9= 'dynamic:' ( (lv_dynamic_10_0= ruleEString ) ) )? ( (lv_ornament_11_0= ruleOrnament ) )? ( (lv_accidental_12_0= ruleAccidental ) )? ( (lv_articulation_13_0= ruleArticulation ) )? ( (lv_fermata_14_0= 'fermata' ) )? ( (lv_dot_15_0= 'dot' ) )?
            {
            // InternalMyDsl.g:984:3: ()
            // InternalMyDsl.g:985:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNoteAccess().getNoteAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,31,FOLLOW_30); 

            			newLeafNode(otherlv_1, grammarAccess.getNoteAccess().getNoteKeyword_1());
            		
            // InternalMyDsl.g:995:3: ( (lv_name_2_0= ruleNoteName ) )
            // InternalMyDsl.g:996:4: (lv_name_2_0= ruleNoteName )
            {
            // InternalMyDsl.g:996:4: (lv_name_2_0= ruleNoteName )
            // InternalMyDsl.g:997:5: lv_name_2_0= ruleNoteName
            {

            					newCompositeNode(grammarAccess.getNoteAccess().getNameNoteNameEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_31);
            lv_name_2_0=ruleNoteName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNoteRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.example.mydsl.MyDsl.NoteName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:1014:3: (otherlv_3= 'lyrics:' ( (lv_lyrics_4_0= ruleEString ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==32) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalMyDsl.g:1015:4: otherlv_3= 'lyrics:' ( (lv_lyrics_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,32,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getNoteAccess().getLyricsKeyword_3_0());
                    			
                    // InternalMyDsl.g:1019:4: ( (lv_lyrics_4_0= ruleEString ) )
                    // InternalMyDsl.g:1020:5: (lv_lyrics_4_0= ruleEString )
                    {
                    // InternalMyDsl.g:1020:5: (lv_lyrics_4_0= ruleEString )
                    // InternalMyDsl.g:1021:6: lv_lyrics_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getNoteAccess().getLyricsEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_32);
                    lv_lyrics_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNoteRule());
                    						}
                    						set(
                    							current,
                    							"lyrics",
                    							lv_lyrics_4_0,
                    							"org.xtext.example.mydsl.MyDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:1039:3: (otherlv_5= 'duration:' ( (lv_duration_6_0= ruleNoteDuration ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==33) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalMyDsl.g:1040:4: otherlv_5= 'duration:' ( (lv_duration_6_0= ruleNoteDuration ) )
                    {
                    otherlv_5=(Token)match(input,33,FOLLOW_33); 

                    				newLeafNode(otherlv_5, grammarAccess.getNoteAccess().getDurationKeyword_4_0());
                    			
                    // InternalMyDsl.g:1044:4: ( (lv_duration_6_0= ruleNoteDuration ) )
                    // InternalMyDsl.g:1045:5: (lv_duration_6_0= ruleNoteDuration )
                    {
                    // InternalMyDsl.g:1045:5: (lv_duration_6_0= ruleNoteDuration )
                    // InternalMyDsl.g:1046:6: lv_duration_6_0= ruleNoteDuration
                    {

                    						newCompositeNode(grammarAccess.getNoteAccess().getDurationNoteDurationEnumRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_34);
                    lv_duration_6_0=ruleNoteDuration();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNoteRule());
                    						}
                    						set(
                    							current,
                    							"duration",
                    							lv_duration_6_0,
                    							"org.xtext.example.mydsl.MyDsl.NoteDuration");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:1064:3: (otherlv_7= 'position:' ( (lv_position_8_0= ruleEInt ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==34) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalMyDsl.g:1065:4: otherlv_7= 'position:' ( (lv_position_8_0= ruleEInt ) )
                    {
                    otherlv_7=(Token)match(input,34,FOLLOW_10); 

                    				newLeafNode(otherlv_7, grammarAccess.getNoteAccess().getPositionKeyword_5_0());
                    			
                    // InternalMyDsl.g:1069:4: ( (lv_position_8_0= ruleEInt ) )
                    // InternalMyDsl.g:1070:5: (lv_position_8_0= ruleEInt )
                    {
                    // InternalMyDsl.g:1070:5: (lv_position_8_0= ruleEInt )
                    // InternalMyDsl.g:1071:6: lv_position_8_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getNoteAccess().getPositionEIntParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_35);
                    lv_position_8_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNoteRule());
                    						}
                    						set(
                    							current,
                    							"position",
                    							lv_position_8_0,
                    							"org.xtext.example.mydsl.MyDsl.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:1089:3: (otherlv_9= 'dynamic:' ( (lv_dynamic_10_0= ruleEString ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==35) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalMyDsl.g:1090:4: otherlv_9= 'dynamic:' ( (lv_dynamic_10_0= ruleEString ) )
                    {
                    otherlv_9=(Token)match(input,35,FOLLOW_5); 

                    				newLeafNode(otherlv_9, grammarAccess.getNoteAccess().getDynamicKeyword_6_0());
                    			
                    // InternalMyDsl.g:1094:4: ( (lv_dynamic_10_0= ruleEString ) )
                    // InternalMyDsl.g:1095:5: (lv_dynamic_10_0= ruleEString )
                    {
                    // InternalMyDsl.g:1095:5: (lv_dynamic_10_0= ruleEString )
                    // InternalMyDsl.g:1096:6: lv_dynamic_10_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getNoteAccess().getDynamicEStringParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_36);
                    lv_dynamic_10_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNoteRule());
                    						}
                    						set(
                    							current,
                    							"dynamic",
                    							lv_dynamic_10_0,
                    							"org.xtext.example.mydsl.MyDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:1114:3: ( (lv_ornament_11_0= ruleOrnament ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==38) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalMyDsl.g:1115:4: (lv_ornament_11_0= ruleOrnament )
                    {
                    // InternalMyDsl.g:1115:4: (lv_ornament_11_0= ruleOrnament )
                    // InternalMyDsl.g:1116:5: lv_ornament_11_0= ruleOrnament
                    {

                    					newCompositeNode(grammarAccess.getNoteAccess().getOrnamentOrnamentParserRuleCall_7_0());
                    				
                    pushFollow(FOLLOW_37);
                    lv_ornament_11_0=ruleOrnament();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getNoteRule());
                    					}
                    					set(
                    						current,
                    						"ornament",
                    						lv_ornament_11_0,
                    						"org.xtext.example.mydsl.MyDsl.Ornament");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalMyDsl.g:1133:3: ( (lv_accidental_12_0= ruleAccidental ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==29) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalMyDsl.g:1134:4: (lv_accidental_12_0= ruleAccidental )
                    {
                    // InternalMyDsl.g:1134:4: (lv_accidental_12_0= ruleAccidental )
                    // InternalMyDsl.g:1135:5: lv_accidental_12_0= ruleAccidental
                    {

                    					newCompositeNode(grammarAccess.getNoteAccess().getAccidentalAccidentalParserRuleCall_8_0());
                    				
                    pushFollow(FOLLOW_38);
                    lv_accidental_12_0=ruleAccidental();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getNoteRule());
                    					}
                    					set(
                    						current,
                    						"accidental",
                    						lv_accidental_12_0,
                    						"org.xtext.example.mydsl.MyDsl.Accidental");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalMyDsl.g:1152:3: ( (lv_articulation_13_0= ruleArticulation ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==39) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalMyDsl.g:1153:4: (lv_articulation_13_0= ruleArticulation )
                    {
                    // InternalMyDsl.g:1153:4: (lv_articulation_13_0= ruleArticulation )
                    // InternalMyDsl.g:1154:5: lv_articulation_13_0= ruleArticulation
                    {

                    					newCompositeNode(grammarAccess.getNoteAccess().getArticulationArticulationParserRuleCall_9_0());
                    				
                    pushFollow(FOLLOW_39);
                    lv_articulation_13_0=ruleArticulation();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getNoteRule());
                    					}
                    					set(
                    						current,
                    						"articulation",
                    						lv_articulation_13_0,
                    						"org.xtext.example.mydsl.MyDsl.Articulation");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalMyDsl.g:1171:3: ( (lv_fermata_14_0= 'fermata' ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==36) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalMyDsl.g:1172:4: (lv_fermata_14_0= 'fermata' )
                    {
                    // InternalMyDsl.g:1172:4: (lv_fermata_14_0= 'fermata' )
                    // InternalMyDsl.g:1173:5: lv_fermata_14_0= 'fermata'
                    {
                    lv_fermata_14_0=(Token)match(input,36,FOLLOW_40); 

                    					newLeafNode(lv_fermata_14_0, grammarAccess.getNoteAccess().getFermataFermataKeyword_10_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getNoteRule());
                    					}
                    					setWithLastConsumed(current, "fermata", true, "fermata");
                    				

                    }


                    }
                    break;

            }

            // InternalMyDsl.g:1185:3: ( (lv_dot_15_0= 'dot' ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==37) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalMyDsl.g:1186:4: (lv_dot_15_0= 'dot' )
                    {
                    // InternalMyDsl.g:1186:4: (lv_dot_15_0= 'dot' )
                    // InternalMyDsl.g:1187:5: lv_dot_15_0= 'dot'
                    {
                    lv_dot_15_0=(Token)match(input,37,FOLLOW_2); 

                    					newLeafNode(lv_dot_15_0, grammarAccess.getNoteAccess().getDotDotKeyword_11_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getNoteRule());
                    					}
                    					setWithLastConsumed(current, "dot", true, "dot");
                    				

                    }


                    }
                    break;

            }


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
    // $ANTLR end "ruleNote"


    // $ANTLR start "entryRuleOrnament"
    // InternalMyDsl.g:1203:1: entryRuleOrnament returns [EObject current=null] : iv_ruleOrnament= ruleOrnament EOF ;
    public final EObject entryRuleOrnament() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrnament = null;


        try {
            // InternalMyDsl.g:1203:49: (iv_ruleOrnament= ruleOrnament EOF )
            // InternalMyDsl.g:1204:2: iv_ruleOrnament= ruleOrnament EOF
            {
             newCompositeNode(grammarAccess.getOrnamentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOrnament=ruleOrnament();

            state._fsp--;

             current =iv_ruleOrnament; 
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
    // $ANTLR end "entryRuleOrnament"


    // $ANTLR start "ruleOrnament"
    // InternalMyDsl.g:1210:1: ruleOrnament returns [EObject current=null] : ( () otherlv_1= 'ornament:' ( (lv_type_2_0= ruleOrnamentType ) )? ) ;
    public final EObject ruleOrnament() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Enumerator lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1216:2: ( ( () otherlv_1= 'ornament:' ( (lv_type_2_0= ruleOrnamentType ) )? ) )
            // InternalMyDsl.g:1217:2: ( () otherlv_1= 'ornament:' ( (lv_type_2_0= ruleOrnamentType ) )? )
            {
            // InternalMyDsl.g:1217:2: ( () otherlv_1= 'ornament:' ( (lv_type_2_0= ruleOrnamentType ) )? )
            // InternalMyDsl.g:1218:3: () otherlv_1= 'ornament:' ( (lv_type_2_0= ruleOrnamentType ) )?
            {
            // InternalMyDsl.g:1218:3: ()
            // InternalMyDsl.g:1219:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getOrnamentAccess().getOrnamentAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,38,FOLLOW_41); 

            			newLeafNode(otherlv_1, grammarAccess.getOrnamentAccess().getOrnamentKeyword_1());
            		
            // InternalMyDsl.g:1229:3: ( (lv_type_2_0= ruleOrnamentType ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( ((LA29_0>=61 && LA29_0<=67)) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalMyDsl.g:1230:4: (lv_type_2_0= ruleOrnamentType )
                    {
                    // InternalMyDsl.g:1230:4: (lv_type_2_0= ruleOrnamentType )
                    // InternalMyDsl.g:1231:5: lv_type_2_0= ruleOrnamentType
                    {

                    					newCompositeNode(grammarAccess.getOrnamentAccess().getTypeOrnamentTypeEnumRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_type_2_0=ruleOrnamentType();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getOrnamentRule());
                    					}
                    					set(
                    						current,
                    						"type",
                    						lv_type_2_0,
                    						"org.xtext.example.mydsl.MyDsl.OrnamentType");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


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
    // $ANTLR end "ruleOrnament"


    // $ANTLR start "entryRuleArticulation"
    // InternalMyDsl.g:1252:1: entryRuleArticulation returns [EObject current=null] : iv_ruleArticulation= ruleArticulation EOF ;
    public final EObject entryRuleArticulation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArticulation = null;


        try {
            // InternalMyDsl.g:1252:53: (iv_ruleArticulation= ruleArticulation EOF )
            // InternalMyDsl.g:1253:2: iv_ruleArticulation= ruleArticulation EOF
            {
             newCompositeNode(grammarAccess.getArticulationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleArticulation=ruleArticulation();

            state._fsp--;

             current =iv_ruleArticulation; 
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
    // $ANTLR end "entryRuleArticulation"


    // $ANTLR start "ruleArticulation"
    // InternalMyDsl.g:1259:1: ruleArticulation returns [EObject current=null] : ( () otherlv_1= 'articulation:' ( (lv_type_2_0= ruleArticulationType ) )? ) ;
    public final EObject ruleArticulation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Enumerator lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1265:2: ( ( () otherlv_1= 'articulation:' ( (lv_type_2_0= ruleArticulationType ) )? ) )
            // InternalMyDsl.g:1266:2: ( () otherlv_1= 'articulation:' ( (lv_type_2_0= ruleArticulationType ) )? )
            {
            // InternalMyDsl.g:1266:2: ( () otherlv_1= 'articulation:' ( (lv_type_2_0= ruleArticulationType ) )? )
            // InternalMyDsl.g:1267:3: () otherlv_1= 'articulation:' ( (lv_type_2_0= ruleArticulationType ) )?
            {
            // InternalMyDsl.g:1267:3: ()
            // InternalMyDsl.g:1268:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getArticulationAccess().getArticulationAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,39,FOLLOW_42); 

            			newLeafNode(otherlv_1, grammarAccess.getArticulationAccess().getArticulationKeyword_1());
            		
            // InternalMyDsl.g:1278:3: ( (lv_type_2_0= ruleArticulationType ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( ((LA30_0>=68 && LA30_0<=73)) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalMyDsl.g:1279:4: (lv_type_2_0= ruleArticulationType )
                    {
                    // InternalMyDsl.g:1279:4: (lv_type_2_0= ruleArticulationType )
                    // InternalMyDsl.g:1280:5: lv_type_2_0= ruleArticulationType
                    {

                    					newCompositeNode(grammarAccess.getArticulationAccess().getTypeArticulationTypeEnumRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_type_2_0=ruleArticulationType();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getArticulationRule());
                    					}
                    					set(
                    						current,
                    						"type",
                    						lv_type_2_0,
                    						"org.xtext.example.mydsl.MyDsl.ArticulationType");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


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
    // $ANTLR end "ruleArticulation"


    // $ANTLR start "ruleBracketType"
    // InternalMyDsl.g:1301:1: ruleBracketType returns [Enumerator current=null] : ( (enumLiteral_0= 'curly' ) | (enumLiteral_1= 'square' ) ) ;
    public final Enumerator ruleBracketType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1307:2: ( ( (enumLiteral_0= 'curly' ) | (enumLiteral_1= 'square' ) ) )
            // InternalMyDsl.g:1308:2: ( (enumLiteral_0= 'curly' ) | (enumLiteral_1= 'square' ) )
            {
            // InternalMyDsl.g:1308:2: ( (enumLiteral_0= 'curly' ) | (enumLiteral_1= 'square' ) )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==40) ) {
                alt31=1;
            }
            else if ( (LA31_0==41) ) {
                alt31=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // InternalMyDsl.g:1309:3: (enumLiteral_0= 'curly' )
                    {
                    // InternalMyDsl.g:1309:3: (enumLiteral_0= 'curly' )
                    // InternalMyDsl.g:1310:4: enumLiteral_0= 'curly'
                    {
                    enumLiteral_0=(Token)match(input,40,FOLLOW_2); 

                    				current = grammarAccess.getBracketTypeAccess().getCurlyEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getBracketTypeAccess().getCurlyEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1317:3: (enumLiteral_1= 'square' )
                    {
                    // InternalMyDsl.g:1317:3: (enumLiteral_1= 'square' )
                    // InternalMyDsl.g:1318:4: enumLiteral_1= 'square'
                    {
                    enumLiteral_1=(Token)match(input,41,FOLLOW_2); 

                    				current = grammarAccess.getBracketTypeAccess().getSquareEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getBracketTypeAccess().getSquareEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

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
    // $ANTLR end "ruleBracketType"


    // $ANTLR start "ruleRestType"
    // InternalMyDsl.g:1328:1: ruleRestType returns [Enumerator current=null] : ( (enumLiteral_0= 'whole' ) | (enumLiteral_1= 'half' ) | (enumLiteral_2= 'quarter' ) | (enumLiteral_3= 'eighth' ) | (enumLiteral_4= 'sixteenth' ) | (enumLiteral_5= 'thirtysecond' ) | (enumLiteral_6= 'sixtyfourth' ) ) ;
    public final Enumerator ruleRestType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1334:2: ( ( (enumLiteral_0= 'whole' ) | (enumLiteral_1= 'half' ) | (enumLiteral_2= 'quarter' ) | (enumLiteral_3= 'eighth' ) | (enumLiteral_4= 'sixteenth' ) | (enumLiteral_5= 'thirtysecond' ) | (enumLiteral_6= 'sixtyfourth' ) ) )
            // InternalMyDsl.g:1335:2: ( (enumLiteral_0= 'whole' ) | (enumLiteral_1= 'half' ) | (enumLiteral_2= 'quarter' ) | (enumLiteral_3= 'eighth' ) | (enumLiteral_4= 'sixteenth' ) | (enumLiteral_5= 'thirtysecond' ) | (enumLiteral_6= 'sixtyfourth' ) )
            {
            // InternalMyDsl.g:1335:2: ( (enumLiteral_0= 'whole' ) | (enumLiteral_1= 'half' ) | (enumLiteral_2= 'quarter' ) | (enumLiteral_3= 'eighth' ) | (enumLiteral_4= 'sixteenth' ) | (enumLiteral_5= 'thirtysecond' ) | (enumLiteral_6= 'sixtyfourth' ) )
            int alt32=7;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt32=1;
                }
                break;
            case 43:
                {
                alt32=2;
                }
                break;
            case 44:
                {
                alt32=3;
                }
                break;
            case 45:
                {
                alt32=4;
                }
                break;
            case 46:
                {
                alt32=5;
                }
                break;
            case 47:
                {
                alt32=6;
                }
                break;
            case 48:
                {
                alt32=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }

            switch (alt32) {
                case 1 :
                    // InternalMyDsl.g:1336:3: (enumLiteral_0= 'whole' )
                    {
                    // InternalMyDsl.g:1336:3: (enumLiteral_0= 'whole' )
                    // InternalMyDsl.g:1337:4: enumLiteral_0= 'whole'
                    {
                    enumLiteral_0=(Token)match(input,42,FOLLOW_2); 

                    				current = grammarAccess.getRestTypeAccess().getWholeEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getRestTypeAccess().getWholeEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1344:3: (enumLiteral_1= 'half' )
                    {
                    // InternalMyDsl.g:1344:3: (enumLiteral_1= 'half' )
                    // InternalMyDsl.g:1345:4: enumLiteral_1= 'half'
                    {
                    enumLiteral_1=(Token)match(input,43,FOLLOW_2); 

                    				current = grammarAccess.getRestTypeAccess().getHalfEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getRestTypeAccess().getHalfEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1352:3: (enumLiteral_2= 'quarter' )
                    {
                    // InternalMyDsl.g:1352:3: (enumLiteral_2= 'quarter' )
                    // InternalMyDsl.g:1353:4: enumLiteral_2= 'quarter'
                    {
                    enumLiteral_2=(Token)match(input,44,FOLLOW_2); 

                    				current = grammarAccess.getRestTypeAccess().getQuarterEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getRestTypeAccess().getQuarterEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:1360:3: (enumLiteral_3= 'eighth' )
                    {
                    // InternalMyDsl.g:1360:3: (enumLiteral_3= 'eighth' )
                    // InternalMyDsl.g:1361:4: enumLiteral_3= 'eighth'
                    {
                    enumLiteral_3=(Token)match(input,45,FOLLOW_2); 

                    				current = grammarAccess.getRestTypeAccess().getEighthEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getRestTypeAccess().getEighthEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:1368:3: (enumLiteral_4= 'sixteenth' )
                    {
                    // InternalMyDsl.g:1368:3: (enumLiteral_4= 'sixteenth' )
                    // InternalMyDsl.g:1369:4: enumLiteral_4= 'sixteenth'
                    {
                    enumLiteral_4=(Token)match(input,46,FOLLOW_2); 

                    				current = grammarAccess.getRestTypeAccess().getSixteenthEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getRestTypeAccess().getSixteenthEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:1376:3: (enumLiteral_5= 'thirtysecond' )
                    {
                    // InternalMyDsl.g:1376:3: (enumLiteral_5= 'thirtysecond' )
                    // InternalMyDsl.g:1377:4: enumLiteral_5= 'thirtysecond'
                    {
                    enumLiteral_5=(Token)match(input,47,FOLLOW_2); 

                    				current = grammarAccess.getRestTypeAccess().getThirtysecondEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getRestTypeAccess().getThirtysecondEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalMyDsl.g:1384:3: (enumLiteral_6= 'sixtyfourth' )
                    {
                    // InternalMyDsl.g:1384:3: (enumLiteral_6= 'sixtyfourth' )
                    // InternalMyDsl.g:1385:4: enumLiteral_6= 'sixtyfourth'
                    {
                    enumLiteral_6=(Token)match(input,48,FOLLOW_2); 

                    				current = grammarAccess.getRestTypeAccess().getSixtyfourthEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getRestTypeAccess().getSixtyfourthEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;

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
    // $ANTLR end "ruleRestType"


    // $ANTLR start "ruleAccidentalType"
    // InternalMyDsl.g:1395:1: ruleAccidentalType returns [Enumerator current=null] : ( (enumLiteral_0= 'sharp' ) | (enumLiteral_1= 'flat' ) | (enumLiteral_2= 'natural' ) ) ;
    public final Enumerator ruleAccidentalType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1401:2: ( ( (enumLiteral_0= 'sharp' ) | (enumLiteral_1= 'flat' ) | (enumLiteral_2= 'natural' ) ) )
            // InternalMyDsl.g:1402:2: ( (enumLiteral_0= 'sharp' ) | (enumLiteral_1= 'flat' ) | (enumLiteral_2= 'natural' ) )
            {
            // InternalMyDsl.g:1402:2: ( (enumLiteral_0= 'sharp' ) | (enumLiteral_1= 'flat' ) | (enumLiteral_2= 'natural' ) )
            int alt33=3;
            switch ( input.LA(1) ) {
            case 49:
                {
                alt33=1;
                }
                break;
            case 50:
                {
                alt33=2;
                }
                break;
            case 51:
                {
                alt33=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }

            switch (alt33) {
                case 1 :
                    // InternalMyDsl.g:1403:3: (enumLiteral_0= 'sharp' )
                    {
                    // InternalMyDsl.g:1403:3: (enumLiteral_0= 'sharp' )
                    // InternalMyDsl.g:1404:4: enumLiteral_0= 'sharp'
                    {
                    enumLiteral_0=(Token)match(input,49,FOLLOW_2); 

                    				current = grammarAccess.getAccidentalTypeAccess().getSharpEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getAccidentalTypeAccess().getSharpEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1411:3: (enumLiteral_1= 'flat' )
                    {
                    // InternalMyDsl.g:1411:3: (enumLiteral_1= 'flat' )
                    // InternalMyDsl.g:1412:4: enumLiteral_1= 'flat'
                    {
                    enumLiteral_1=(Token)match(input,50,FOLLOW_2); 

                    				current = grammarAccess.getAccidentalTypeAccess().getFlatEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getAccidentalTypeAccess().getFlatEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1419:3: (enumLiteral_2= 'natural' )
                    {
                    // InternalMyDsl.g:1419:3: (enumLiteral_2= 'natural' )
                    // InternalMyDsl.g:1420:4: enumLiteral_2= 'natural'
                    {
                    enumLiteral_2=(Token)match(input,51,FOLLOW_2); 

                    				current = grammarAccess.getAccidentalTypeAccess().getNaturalEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getAccidentalTypeAccess().getNaturalEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;

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
    // $ANTLR end "ruleAccidentalType"


    // $ANTLR start "ruleRepetitionType"
    // InternalMyDsl.g:1430:1: ruleRepetitionType returns [Enumerator current=null] : ( (enumLiteral_0= 'left' ) | (enumLiteral_1= 'right' ) ) ;
    public final Enumerator ruleRepetitionType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1436:2: ( ( (enumLiteral_0= 'left' ) | (enumLiteral_1= 'right' ) ) )
            // InternalMyDsl.g:1437:2: ( (enumLiteral_0= 'left' ) | (enumLiteral_1= 'right' ) )
            {
            // InternalMyDsl.g:1437:2: ( (enumLiteral_0= 'left' ) | (enumLiteral_1= 'right' ) )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==52) ) {
                alt34=1;
            }
            else if ( (LA34_0==53) ) {
                alt34=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // InternalMyDsl.g:1438:3: (enumLiteral_0= 'left' )
                    {
                    // InternalMyDsl.g:1438:3: (enumLiteral_0= 'left' )
                    // InternalMyDsl.g:1439:4: enumLiteral_0= 'left'
                    {
                    enumLiteral_0=(Token)match(input,52,FOLLOW_2); 

                    				current = grammarAccess.getRepetitionTypeAccess().getLeftEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getRepetitionTypeAccess().getLeftEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1446:3: (enumLiteral_1= 'right' )
                    {
                    // InternalMyDsl.g:1446:3: (enumLiteral_1= 'right' )
                    // InternalMyDsl.g:1447:4: enumLiteral_1= 'right'
                    {
                    enumLiteral_1=(Token)match(input,53,FOLLOW_2); 

                    				current = grammarAccess.getRepetitionTypeAccess().getRightEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getRepetitionTypeAccess().getRightEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

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
    // $ANTLR end "ruleRepetitionType"


    // $ANTLR start "ruleNoteName"
    // InternalMyDsl.g:1457:1: ruleNoteName returns [Enumerator current=null] : ( (enumLiteral_0= 'c' ) | (enumLiteral_1= 'd' ) | (enumLiteral_2= 'e' ) | (enumLiteral_3= 'f' ) | (enumLiteral_4= 'g' ) | (enumLiteral_5= 'a' ) | (enumLiteral_6= 'b' ) ) ;
    public final Enumerator ruleNoteName() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1463:2: ( ( (enumLiteral_0= 'c' ) | (enumLiteral_1= 'd' ) | (enumLiteral_2= 'e' ) | (enumLiteral_3= 'f' ) | (enumLiteral_4= 'g' ) | (enumLiteral_5= 'a' ) | (enumLiteral_6= 'b' ) ) )
            // InternalMyDsl.g:1464:2: ( (enumLiteral_0= 'c' ) | (enumLiteral_1= 'd' ) | (enumLiteral_2= 'e' ) | (enumLiteral_3= 'f' ) | (enumLiteral_4= 'g' ) | (enumLiteral_5= 'a' ) | (enumLiteral_6= 'b' ) )
            {
            // InternalMyDsl.g:1464:2: ( (enumLiteral_0= 'c' ) | (enumLiteral_1= 'd' ) | (enumLiteral_2= 'e' ) | (enumLiteral_3= 'f' ) | (enumLiteral_4= 'g' ) | (enumLiteral_5= 'a' ) | (enumLiteral_6= 'b' ) )
            int alt35=7;
            switch ( input.LA(1) ) {
            case 54:
                {
                alt35=1;
                }
                break;
            case 55:
                {
                alt35=2;
                }
                break;
            case 56:
                {
                alt35=3;
                }
                break;
            case 57:
                {
                alt35=4;
                }
                break;
            case 58:
                {
                alt35=5;
                }
                break;
            case 59:
                {
                alt35=6;
                }
                break;
            case 60:
                {
                alt35=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }

            switch (alt35) {
                case 1 :
                    // InternalMyDsl.g:1465:3: (enumLiteral_0= 'c' )
                    {
                    // InternalMyDsl.g:1465:3: (enumLiteral_0= 'c' )
                    // InternalMyDsl.g:1466:4: enumLiteral_0= 'c'
                    {
                    enumLiteral_0=(Token)match(input,54,FOLLOW_2); 

                    				current = grammarAccess.getNoteNameAccess().getCEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getNoteNameAccess().getCEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1473:3: (enumLiteral_1= 'd' )
                    {
                    // InternalMyDsl.g:1473:3: (enumLiteral_1= 'd' )
                    // InternalMyDsl.g:1474:4: enumLiteral_1= 'd'
                    {
                    enumLiteral_1=(Token)match(input,55,FOLLOW_2); 

                    				current = grammarAccess.getNoteNameAccess().getDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getNoteNameAccess().getDEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1481:3: (enumLiteral_2= 'e' )
                    {
                    // InternalMyDsl.g:1481:3: (enumLiteral_2= 'e' )
                    // InternalMyDsl.g:1482:4: enumLiteral_2= 'e'
                    {
                    enumLiteral_2=(Token)match(input,56,FOLLOW_2); 

                    				current = grammarAccess.getNoteNameAccess().getEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getNoteNameAccess().getEEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:1489:3: (enumLiteral_3= 'f' )
                    {
                    // InternalMyDsl.g:1489:3: (enumLiteral_3= 'f' )
                    // InternalMyDsl.g:1490:4: enumLiteral_3= 'f'
                    {
                    enumLiteral_3=(Token)match(input,57,FOLLOW_2); 

                    				current = grammarAccess.getNoteNameAccess().getFEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getNoteNameAccess().getFEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:1497:3: (enumLiteral_4= 'g' )
                    {
                    // InternalMyDsl.g:1497:3: (enumLiteral_4= 'g' )
                    // InternalMyDsl.g:1498:4: enumLiteral_4= 'g'
                    {
                    enumLiteral_4=(Token)match(input,58,FOLLOW_2); 

                    				current = grammarAccess.getNoteNameAccess().getGEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getNoteNameAccess().getGEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:1505:3: (enumLiteral_5= 'a' )
                    {
                    // InternalMyDsl.g:1505:3: (enumLiteral_5= 'a' )
                    // InternalMyDsl.g:1506:4: enumLiteral_5= 'a'
                    {
                    enumLiteral_5=(Token)match(input,59,FOLLOW_2); 

                    				current = grammarAccess.getNoteNameAccess().getAEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getNoteNameAccess().getAEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalMyDsl.g:1513:3: (enumLiteral_6= 'b' )
                    {
                    // InternalMyDsl.g:1513:3: (enumLiteral_6= 'b' )
                    // InternalMyDsl.g:1514:4: enumLiteral_6= 'b'
                    {
                    enumLiteral_6=(Token)match(input,60,FOLLOW_2); 

                    				current = grammarAccess.getNoteNameAccess().getBEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getNoteNameAccess().getBEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;

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
    // $ANTLR end "ruleNoteName"


    // $ANTLR start "ruleNoteDuration"
    // InternalMyDsl.g:1524:1: ruleNoteDuration returns [Enumerator current=null] : ( (enumLiteral_0= 'whole' ) | (enumLiteral_1= 'half' ) | (enumLiteral_2= 'quarter' ) | (enumLiteral_3= 'eighth' ) | (enumLiteral_4= 'sixteenth' ) | (enumLiteral_5= 'thirtysecond' ) | (enumLiteral_6= 'sixtyfourth' ) ) ;
    public final Enumerator ruleNoteDuration() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1530:2: ( ( (enumLiteral_0= 'whole' ) | (enumLiteral_1= 'half' ) | (enumLiteral_2= 'quarter' ) | (enumLiteral_3= 'eighth' ) | (enumLiteral_4= 'sixteenth' ) | (enumLiteral_5= 'thirtysecond' ) | (enumLiteral_6= 'sixtyfourth' ) ) )
            // InternalMyDsl.g:1531:2: ( (enumLiteral_0= 'whole' ) | (enumLiteral_1= 'half' ) | (enumLiteral_2= 'quarter' ) | (enumLiteral_3= 'eighth' ) | (enumLiteral_4= 'sixteenth' ) | (enumLiteral_5= 'thirtysecond' ) | (enumLiteral_6= 'sixtyfourth' ) )
            {
            // InternalMyDsl.g:1531:2: ( (enumLiteral_0= 'whole' ) | (enumLiteral_1= 'half' ) | (enumLiteral_2= 'quarter' ) | (enumLiteral_3= 'eighth' ) | (enumLiteral_4= 'sixteenth' ) | (enumLiteral_5= 'thirtysecond' ) | (enumLiteral_6= 'sixtyfourth' ) )
            int alt36=7;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt36=1;
                }
                break;
            case 43:
                {
                alt36=2;
                }
                break;
            case 44:
                {
                alt36=3;
                }
                break;
            case 45:
                {
                alt36=4;
                }
                break;
            case 46:
                {
                alt36=5;
                }
                break;
            case 47:
                {
                alt36=6;
                }
                break;
            case 48:
                {
                alt36=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }

            switch (alt36) {
                case 1 :
                    // InternalMyDsl.g:1532:3: (enumLiteral_0= 'whole' )
                    {
                    // InternalMyDsl.g:1532:3: (enumLiteral_0= 'whole' )
                    // InternalMyDsl.g:1533:4: enumLiteral_0= 'whole'
                    {
                    enumLiteral_0=(Token)match(input,42,FOLLOW_2); 

                    				current = grammarAccess.getNoteDurationAccess().getWholeEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getNoteDurationAccess().getWholeEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1540:3: (enumLiteral_1= 'half' )
                    {
                    // InternalMyDsl.g:1540:3: (enumLiteral_1= 'half' )
                    // InternalMyDsl.g:1541:4: enumLiteral_1= 'half'
                    {
                    enumLiteral_1=(Token)match(input,43,FOLLOW_2); 

                    				current = grammarAccess.getNoteDurationAccess().getHalfEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getNoteDurationAccess().getHalfEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1548:3: (enumLiteral_2= 'quarter' )
                    {
                    // InternalMyDsl.g:1548:3: (enumLiteral_2= 'quarter' )
                    // InternalMyDsl.g:1549:4: enumLiteral_2= 'quarter'
                    {
                    enumLiteral_2=(Token)match(input,44,FOLLOW_2); 

                    				current = grammarAccess.getNoteDurationAccess().getQuarterEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getNoteDurationAccess().getQuarterEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:1556:3: (enumLiteral_3= 'eighth' )
                    {
                    // InternalMyDsl.g:1556:3: (enumLiteral_3= 'eighth' )
                    // InternalMyDsl.g:1557:4: enumLiteral_3= 'eighth'
                    {
                    enumLiteral_3=(Token)match(input,45,FOLLOW_2); 

                    				current = grammarAccess.getNoteDurationAccess().getEighthEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getNoteDurationAccess().getEighthEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:1564:3: (enumLiteral_4= 'sixteenth' )
                    {
                    // InternalMyDsl.g:1564:3: (enumLiteral_4= 'sixteenth' )
                    // InternalMyDsl.g:1565:4: enumLiteral_4= 'sixteenth'
                    {
                    enumLiteral_4=(Token)match(input,46,FOLLOW_2); 

                    				current = grammarAccess.getNoteDurationAccess().getSixteenthEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getNoteDurationAccess().getSixteenthEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:1572:3: (enumLiteral_5= 'thirtysecond' )
                    {
                    // InternalMyDsl.g:1572:3: (enumLiteral_5= 'thirtysecond' )
                    // InternalMyDsl.g:1573:4: enumLiteral_5= 'thirtysecond'
                    {
                    enumLiteral_5=(Token)match(input,47,FOLLOW_2); 

                    				current = grammarAccess.getNoteDurationAccess().getThirtysecondEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getNoteDurationAccess().getThirtysecondEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalMyDsl.g:1580:3: (enumLiteral_6= 'sixtyfourth' )
                    {
                    // InternalMyDsl.g:1580:3: (enumLiteral_6= 'sixtyfourth' )
                    // InternalMyDsl.g:1581:4: enumLiteral_6= 'sixtyfourth'
                    {
                    enumLiteral_6=(Token)match(input,48,FOLLOW_2); 

                    				current = grammarAccess.getNoteDurationAccess().getSixtyfourthEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getNoteDurationAccess().getSixtyfourthEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;

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
    // $ANTLR end "ruleNoteDuration"


    // $ANTLR start "ruleOrnamentType"
    // InternalMyDsl.g:1591:1: ruleOrnamentType returns [Enumerator current=null] : ( (enumLiteral_0= 'slide' ) | (enumLiteral_1= 'glissando' ) | (enumLiteral_2= 'aciaccatura' ) | (enumLiteral_3= 'appoggiatura' ) | (enumLiteral_4= 'turn' ) | (enumLiteral_5= 'mordent' ) | (enumLiteral_6= 'trill' ) ) ;
    public final Enumerator ruleOrnamentType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1597:2: ( ( (enumLiteral_0= 'slide' ) | (enumLiteral_1= 'glissando' ) | (enumLiteral_2= 'aciaccatura' ) | (enumLiteral_3= 'appoggiatura' ) | (enumLiteral_4= 'turn' ) | (enumLiteral_5= 'mordent' ) | (enumLiteral_6= 'trill' ) ) )
            // InternalMyDsl.g:1598:2: ( (enumLiteral_0= 'slide' ) | (enumLiteral_1= 'glissando' ) | (enumLiteral_2= 'aciaccatura' ) | (enumLiteral_3= 'appoggiatura' ) | (enumLiteral_4= 'turn' ) | (enumLiteral_5= 'mordent' ) | (enumLiteral_6= 'trill' ) )
            {
            // InternalMyDsl.g:1598:2: ( (enumLiteral_0= 'slide' ) | (enumLiteral_1= 'glissando' ) | (enumLiteral_2= 'aciaccatura' ) | (enumLiteral_3= 'appoggiatura' ) | (enumLiteral_4= 'turn' ) | (enumLiteral_5= 'mordent' ) | (enumLiteral_6= 'trill' ) )
            int alt37=7;
            switch ( input.LA(1) ) {
            case 61:
                {
                alt37=1;
                }
                break;
            case 62:
                {
                alt37=2;
                }
                break;
            case 63:
                {
                alt37=3;
                }
                break;
            case 64:
                {
                alt37=4;
                }
                break;
            case 65:
                {
                alt37=5;
                }
                break;
            case 66:
                {
                alt37=6;
                }
                break;
            case 67:
                {
                alt37=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }

            switch (alt37) {
                case 1 :
                    // InternalMyDsl.g:1599:3: (enumLiteral_0= 'slide' )
                    {
                    // InternalMyDsl.g:1599:3: (enumLiteral_0= 'slide' )
                    // InternalMyDsl.g:1600:4: enumLiteral_0= 'slide'
                    {
                    enumLiteral_0=(Token)match(input,61,FOLLOW_2); 

                    				current = grammarAccess.getOrnamentTypeAccess().getSlideEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getOrnamentTypeAccess().getSlideEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1607:3: (enumLiteral_1= 'glissando' )
                    {
                    // InternalMyDsl.g:1607:3: (enumLiteral_1= 'glissando' )
                    // InternalMyDsl.g:1608:4: enumLiteral_1= 'glissando'
                    {
                    enumLiteral_1=(Token)match(input,62,FOLLOW_2); 

                    				current = grammarAccess.getOrnamentTypeAccess().getGlissandoEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getOrnamentTypeAccess().getGlissandoEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1615:3: (enumLiteral_2= 'aciaccatura' )
                    {
                    // InternalMyDsl.g:1615:3: (enumLiteral_2= 'aciaccatura' )
                    // InternalMyDsl.g:1616:4: enumLiteral_2= 'aciaccatura'
                    {
                    enumLiteral_2=(Token)match(input,63,FOLLOW_2); 

                    				current = grammarAccess.getOrnamentTypeAccess().getAciaccaturaEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getOrnamentTypeAccess().getAciaccaturaEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:1623:3: (enumLiteral_3= 'appoggiatura' )
                    {
                    // InternalMyDsl.g:1623:3: (enumLiteral_3= 'appoggiatura' )
                    // InternalMyDsl.g:1624:4: enumLiteral_3= 'appoggiatura'
                    {
                    enumLiteral_3=(Token)match(input,64,FOLLOW_2); 

                    				current = grammarAccess.getOrnamentTypeAccess().getAppoggiaturaEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getOrnamentTypeAccess().getAppoggiaturaEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:1631:3: (enumLiteral_4= 'turn' )
                    {
                    // InternalMyDsl.g:1631:3: (enumLiteral_4= 'turn' )
                    // InternalMyDsl.g:1632:4: enumLiteral_4= 'turn'
                    {
                    enumLiteral_4=(Token)match(input,65,FOLLOW_2); 

                    				current = grammarAccess.getOrnamentTypeAccess().getTurnEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getOrnamentTypeAccess().getTurnEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:1639:3: (enumLiteral_5= 'mordent' )
                    {
                    // InternalMyDsl.g:1639:3: (enumLiteral_5= 'mordent' )
                    // InternalMyDsl.g:1640:4: enumLiteral_5= 'mordent'
                    {
                    enumLiteral_5=(Token)match(input,66,FOLLOW_2); 

                    				current = grammarAccess.getOrnamentTypeAccess().getMordentEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getOrnamentTypeAccess().getMordentEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalMyDsl.g:1647:3: (enumLiteral_6= 'trill' )
                    {
                    // InternalMyDsl.g:1647:3: (enumLiteral_6= 'trill' )
                    // InternalMyDsl.g:1648:4: enumLiteral_6= 'trill'
                    {
                    enumLiteral_6=(Token)match(input,67,FOLLOW_2); 

                    				current = grammarAccess.getOrnamentTypeAccess().getTrillEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getOrnamentTypeAccess().getTrillEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;

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
    // $ANTLR end "ruleOrnamentType"


    // $ANTLR start "ruleArticulationType"
    // InternalMyDsl.g:1658:1: ruleArticulationType returns [Enumerator current=null] : ( (enumLiteral_0= 'detached' ) | (enumLiteral_1= 'legato' ) | (enumLiteral_2= 'staccato' ) | (enumLiteral_3= 'portato' ) | (enumLiteral_4= 'tenuto' ) | (enumLiteral_5= 'marcato' ) ) ;
    public final Enumerator ruleArticulationType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1664:2: ( ( (enumLiteral_0= 'detached' ) | (enumLiteral_1= 'legato' ) | (enumLiteral_2= 'staccato' ) | (enumLiteral_3= 'portato' ) | (enumLiteral_4= 'tenuto' ) | (enumLiteral_5= 'marcato' ) ) )
            // InternalMyDsl.g:1665:2: ( (enumLiteral_0= 'detached' ) | (enumLiteral_1= 'legato' ) | (enumLiteral_2= 'staccato' ) | (enumLiteral_3= 'portato' ) | (enumLiteral_4= 'tenuto' ) | (enumLiteral_5= 'marcato' ) )
            {
            // InternalMyDsl.g:1665:2: ( (enumLiteral_0= 'detached' ) | (enumLiteral_1= 'legato' ) | (enumLiteral_2= 'staccato' ) | (enumLiteral_3= 'portato' ) | (enumLiteral_4= 'tenuto' ) | (enumLiteral_5= 'marcato' ) )
            int alt38=6;
            switch ( input.LA(1) ) {
            case 68:
                {
                alt38=1;
                }
                break;
            case 69:
                {
                alt38=2;
                }
                break;
            case 70:
                {
                alt38=3;
                }
                break;
            case 71:
                {
                alt38=4;
                }
                break;
            case 72:
                {
                alt38=5;
                }
                break;
            case 73:
                {
                alt38=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }

            switch (alt38) {
                case 1 :
                    // InternalMyDsl.g:1666:3: (enumLiteral_0= 'detached' )
                    {
                    // InternalMyDsl.g:1666:3: (enumLiteral_0= 'detached' )
                    // InternalMyDsl.g:1667:4: enumLiteral_0= 'detached'
                    {
                    enumLiteral_0=(Token)match(input,68,FOLLOW_2); 

                    				current = grammarAccess.getArticulationTypeAccess().getDetachedEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getArticulationTypeAccess().getDetachedEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1674:3: (enumLiteral_1= 'legato' )
                    {
                    // InternalMyDsl.g:1674:3: (enumLiteral_1= 'legato' )
                    // InternalMyDsl.g:1675:4: enumLiteral_1= 'legato'
                    {
                    enumLiteral_1=(Token)match(input,69,FOLLOW_2); 

                    				current = grammarAccess.getArticulationTypeAccess().getLegatoEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getArticulationTypeAccess().getLegatoEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1682:3: (enumLiteral_2= 'staccato' )
                    {
                    // InternalMyDsl.g:1682:3: (enumLiteral_2= 'staccato' )
                    // InternalMyDsl.g:1683:4: enumLiteral_2= 'staccato'
                    {
                    enumLiteral_2=(Token)match(input,70,FOLLOW_2); 

                    				current = grammarAccess.getArticulationTypeAccess().getStaccatoEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getArticulationTypeAccess().getStaccatoEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:1690:3: (enumLiteral_3= 'portato' )
                    {
                    // InternalMyDsl.g:1690:3: (enumLiteral_3= 'portato' )
                    // InternalMyDsl.g:1691:4: enumLiteral_3= 'portato'
                    {
                    enumLiteral_3=(Token)match(input,71,FOLLOW_2); 

                    				current = grammarAccess.getArticulationTypeAccess().getPortatoEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getArticulationTypeAccess().getPortatoEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:1698:3: (enumLiteral_4= 'tenuto' )
                    {
                    // InternalMyDsl.g:1698:3: (enumLiteral_4= 'tenuto' )
                    // InternalMyDsl.g:1699:4: enumLiteral_4= 'tenuto'
                    {
                    enumLiteral_4=(Token)match(input,72,FOLLOW_2); 

                    				current = grammarAccess.getArticulationTypeAccess().getTenutoEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getArticulationTypeAccess().getTenutoEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:1706:3: (enumLiteral_5= 'marcato' )
                    {
                    // InternalMyDsl.g:1706:3: (enumLiteral_5= 'marcato' )
                    // InternalMyDsl.g:1707:4: enumLiteral_5= 'marcato'
                    {
                    enumLiteral_5=(Token)match(input,73,FOLLOW_2); 

                    				current = grammarAccess.getArticulationTypeAccess().getMarcatoEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getArticulationTypeAccess().getMarcatoEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;

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
    // $ANTLR end "ruleArticulationType"


    // $ANTLR start "ruleClefType"
    // InternalMyDsl.g:1717:1: ruleClefType returns [Enumerator current=null] : ( (enumLiteral_0= 'violin' ) | (enumLiteral_1= 'bass' ) ) ;
    public final Enumerator ruleClefType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1723:2: ( ( (enumLiteral_0= 'violin' ) | (enumLiteral_1= 'bass' ) ) )
            // InternalMyDsl.g:1724:2: ( (enumLiteral_0= 'violin' ) | (enumLiteral_1= 'bass' ) )
            {
            // InternalMyDsl.g:1724:2: ( (enumLiteral_0= 'violin' ) | (enumLiteral_1= 'bass' ) )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==74) ) {
                alt39=1;
            }
            else if ( (LA39_0==75) ) {
                alt39=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }
            switch (alt39) {
                case 1 :
                    // InternalMyDsl.g:1725:3: (enumLiteral_0= 'violin' )
                    {
                    // InternalMyDsl.g:1725:3: (enumLiteral_0= 'violin' )
                    // InternalMyDsl.g:1726:4: enumLiteral_0= 'violin'
                    {
                    enumLiteral_0=(Token)match(input,74,FOLLOW_2); 

                    				current = grammarAccess.getClefTypeAccess().getViolinEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getClefTypeAccess().getViolinEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1733:3: (enumLiteral_1= 'bass' )
                    {
                    // InternalMyDsl.g:1733:3: (enumLiteral_1= 'bass' )
                    // InternalMyDsl.g:1734:4: enumLiteral_1= 'bass'
                    {
                    enumLiteral_1=(Token)match(input,75,FOLLOW_2); 

                    				current = grammarAccess.getClefTypeAccess().getBassEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getClefTypeAccess().getBassEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

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
    // $ANTLR end "ruleClefType"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x00000000003BE000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000000003BC000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000000003B8000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000003B0000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000000003A0000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000002000040L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000380000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000000002C0000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000030000200000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000800000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x00000000F0000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0001FC0000000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x000E000002000040L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0030000000000002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x1FC0000000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x000000FF20000002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x000000FE20000002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0001FC0000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x000000FC20000002L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x000000F820000002L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x000000F020000002L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x000000B020000002L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x000000B000000002L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000003000000002L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0xE000000000000002L,0x000000000000000FL});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000000002L,0x00000000000003F0L});

}