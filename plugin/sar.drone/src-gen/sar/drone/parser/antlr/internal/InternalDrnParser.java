package sar.drone.parser.antlr.internal;

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
import sar.drone.services.DrnGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDrnParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'CHOREOGRAPHY'", "'{'", "'import'", "'start'", "'='", "';'", "'}'", "'LIBRARY'", "'CONTEXT'", "'initialDirection'", "'positionX'", "'positionY'", "'maxLength'", "'maxWidth'", "'maxSpeed'", "'maxHeight'", "'X'", "'('", "'then'", "')'", "'.'", "'merge'", "','", "'forward'", "'distance'", "'temps'", "'backward'", "'left'", "'right'", "'up'", "'down'", "'cercleXY'", "'rayon'", "'carreXY'", "'cote'", "'cercleYZ'", "'carreYZ'", "'cercleXZ'", "'carreXZ'", "'flip'", "'rotate'", "'angle'", "'wait'", "'takeoff'", "'land'", "'DEVICE'", "'type'", "'with'", "'mode'", "'attribute'", "'led'", "'color'", "'ledBlink'", "'blink_per_sec'", "'camera'", "'id'", "'Type'", "'element'", "'-'", "'BLUE'", "'RED'", "'YELLOW'", "'GREEN'", "'WHITE'", "'OFF'", "'ON'", "'TRUE'", "'FALSE'", "'FRONT'", "'BEHIND'", "'LEFT'", "'RIGHT'"
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
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
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
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__77=77;
    public static final int T__34=34;
    public static final int T__78=78;
    public static final int T__35=35;
    public static final int T__79=79;
    public static final int T__36=36;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__74=74;
    public static final int T__31=31;
    public static final int T__75=75;
    public static final int T__32=32;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
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


        public InternalDrnParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDrnParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDrnParser.tokenNames; }
    public String getGrammarFileName() { return "InternalDrn.g"; }



     	private DrnGrammarAccess grammarAccess;

        public InternalDrnParser(TokenStream input, DrnGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Root";
       	}

       	@Override
       	protected DrnGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleRoot"
    // InternalDrn.g:65:1: entryRuleRoot returns [EObject current=null] : iv_ruleRoot= ruleRoot EOF ;
    public final EObject entryRuleRoot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRoot = null;


        try {
            // InternalDrn.g:65:45: (iv_ruleRoot= ruleRoot EOF )
            // InternalDrn.g:66:2: iv_ruleRoot= ruleRoot EOF
            {
             newCompositeNode(grammarAccess.getRootRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRoot=ruleRoot();

            state._fsp--;

             current =iv_ruleRoot; 
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
    // $ANTLR end "entryRuleRoot"


    // $ANTLR start "ruleRoot"
    // InternalDrn.g:72:1: ruleRoot returns [EObject current=null] : (this_Library_0= ruleLibrary | this_Model_1= ruleModel ) ;
    public final EObject ruleRoot() throws RecognitionException {
        EObject current = null;

        EObject this_Library_0 = null;

        EObject this_Model_1 = null;



        	enterRule();

        try {
            // InternalDrn.g:78:2: ( (this_Library_0= ruleLibrary | this_Model_1= ruleModel ) )
            // InternalDrn.g:79:2: (this_Library_0= ruleLibrary | this_Model_1= ruleModel )
            {
            // InternalDrn.g:79:2: (this_Library_0= ruleLibrary | this_Model_1= ruleModel )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==18) ) {
                alt1=1;
            }
            else if ( (LA1_0==11) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalDrn.g:80:3: this_Library_0= ruleLibrary
                    {

                    			newCompositeNode(grammarAccess.getRootAccess().getLibraryParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Library_0=ruleLibrary();

                    state._fsp--;


                    			current = this_Library_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDrn.g:89:3: this_Model_1= ruleModel
                    {

                    			newCompositeNode(grammarAccess.getRootAccess().getModelParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Model_1=ruleModel();

                    state._fsp--;


                    			current = this_Model_1;
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
    // $ANTLR end "ruleRoot"


    // $ANTLR start "entryRuleModel"
    // InternalDrn.g:101:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalDrn.g:101:46: (iv_ruleModel= ruleModel EOF )
            // InternalDrn.g:102:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalDrn.g:108:1: ruleModel returns [EObject current=null] : (otherlv_0= 'CHOREOGRAPHY' otherlv_1= '{' (otherlv_2= 'import' ( (otherlv_3= RULE_ID ) ) )* ( (lv_context_4_0= ruleContext ) )? ( (lv_types_5_0= ruleTypeGeneric ) )* ( (lv_devices_6_0= ruleDevice ) )* ( (lv_assignement_7_0= ruleAssignement ) ) ( (lv_assignement_8_0= ruleAssignement ) )* otherlv_9= 'start' otherlv_10= '=' ( (lv_main_11_0= ruleRefPart ) ) otherlv_12= ';' otherlv_13= '}' ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        EObject lv_context_4_0 = null;

        EObject lv_types_5_0 = null;

        EObject lv_devices_6_0 = null;

        EObject lv_assignement_7_0 = null;

        EObject lv_assignement_8_0 = null;

        EObject lv_main_11_0 = null;



        	enterRule();

        try {
            // InternalDrn.g:114:2: ( (otherlv_0= 'CHOREOGRAPHY' otherlv_1= '{' (otherlv_2= 'import' ( (otherlv_3= RULE_ID ) ) )* ( (lv_context_4_0= ruleContext ) )? ( (lv_types_5_0= ruleTypeGeneric ) )* ( (lv_devices_6_0= ruleDevice ) )* ( (lv_assignement_7_0= ruleAssignement ) ) ( (lv_assignement_8_0= ruleAssignement ) )* otherlv_9= 'start' otherlv_10= '=' ( (lv_main_11_0= ruleRefPart ) ) otherlv_12= ';' otherlv_13= '}' ) )
            // InternalDrn.g:115:2: (otherlv_0= 'CHOREOGRAPHY' otherlv_1= '{' (otherlv_2= 'import' ( (otherlv_3= RULE_ID ) ) )* ( (lv_context_4_0= ruleContext ) )? ( (lv_types_5_0= ruleTypeGeneric ) )* ( (lv_devices_6_0= ruleDevice ) )* ( (lv_assignement_7_0= ruleAssignement ) ) ( (lv_assignement_8_0= ruleAssignement ) )* otherlv_9= 'start' otherlv_10= '=' ( (lv_main_11_0= ruleRefPart ) ) otherlv_12= ';' otherlv_13= '}' )
            {
            // InternalDrn.g:115:2: (otherlv_0= 'CHOREOGRAPHY' otherlv_1= '{' (otherlv_2= 'import' ( (otherlv_3= RULE_ID ) ) )* ( (lv_context_4_0= ruleContext ) )? ( (lv_types_5_0= ruleTypeGeneric ) )* ( (lv_devices_6_0= ruleDevice ) )* ( (lv_assignement_7_0= ruleAssignement ) ) ( (lv_assignement_8_0= ruleAssignement ) )* otherlv_9= 'start' otherlv_10= '=' ( (lv_main_11_0= ruleRefPart ) ) otherlv_12= ';' otherlv_13= '}' )
            // InternalDrn.g:116:3: otherlv_0= 'CHOREOGRAPHY' otherlv_1= '{' (otherlv_2= 'import' ( (otherlv_3= RULE_ID ) ) )* ( (lv_context_4_0= ruleContext ) )? ( (lv_types_5_0= ruleTypeGeneric ) )* ( (lv_devices_6_0= ruleDevice ) )* ( (lv_assignement_7_0= ruleAssignement ) ) ( (lv_assignement_8_0= ruleAssignement ) )* otherlv_9= 'start' otherlv_10= '=' ( (lv_main_11_0= ruleRefPart ) ) otherlv_12= ';' otherlv_13= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getModelAccess().getCHOREOGRAPHYKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalDrn.g:124:3: (otherlv_2= 'import' ( (otherlv_3= RULE_ID ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==13) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalDrn.g:125:4: otherlv_2= 'import' ( (otherlv_3= RULE_ID ) )
            	    {
            	    otherlv_2=(Token)match(input,13,FOLLOW_5); 

            	    				newLeafNode(otherlv_2, grammarAccess.getModelAccess().getImportKeyword_2_0());
            	    			
            	    // InternalDrn.g:129:4: ( (otherlv_3= RULE_ID ) )
            	    // InternalDrn.g:130:5: (otherlv_3= RULE_ID )
            	    {
            	    // InternalDrn.g:130:5: (otherlv_3= RULE_ID )
            	    // InternalDrn.g:131:6: otherlv_3= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getModelRule());
            	    						}
            	    					
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_4); 

            	    						newLeafNode(otherlv_3, grammarAccess.getModelAccess().getLibrariesLibraryCrossReference_2_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // InternalDrn.g:143:3: ( (lv_context_4_0= ruleContext ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==19) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalDrn.g:144:4: (lv_context_4_0= ruleContext )
                    {
                    // InternalDrn.g:144:4: (lv_context_4_0= ruleContext )
                    // InternalDrn.g:145:5: lv_context_4_0= ruleContext
                    {

                    					newCompositeNode(grammarAccess.getModelAccess().getContextContextParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_4);
                    lv_context_4_0=ruleContext();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getModelRule());
                    					}
                    					set(
                    						current,
                    						"context",
                    						lv_context_4_0,
                    						"sar.drone.Drn.Context");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalDrn.g:162:3: ( (lv_types_5_0= ruleTypeGeneric ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==67) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalDrn.g:163:4: (lv_types_5_0= ruleTypeGeneric )
            	    {
            	    // InternalDrn.g:163:4: (lv_types_5_0= ruleTypeGeneric )
            	    // InternalDrn.g:164:5: lv_types_5_0= ruleTypeGeneric
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getTypesTypeGenericParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_types_5_0=ruleTypeGeneric();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"types",
            	    						lv_types_5_0,
            	    						"sar.drone.Drn.TypeGeneric");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // InternalDrn.g:181:3: ( (lv_devices_6_0= ruleDevice ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==56) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalDrn.g:182:4: (lv_devices_6_0= ruleDevice )
            	    {
            	    // InternalDrn.g:182:4: (lv_devices_6_0= ruleDevice )
            	    // InternalDrn.g:183:5: lv_devices_6_0= ruleDevice
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getDevicesDeviceParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_devices_6_0=ruleDevice();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"devices",
            	    						lv_devices_6_0,
            	    						"sar.drone.Drn.Device");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            // InternalDrn.g:200:3: ( (lv_assignement_7_0= ruleAssignement ) )
            // InternalDrn.g:201:4: (lv_assignement_7_0= ruleAssignement )
            {
            // InternalDrn.g:201:4: (lv_assignement_7_0= ruleAssignement )
            // InternalDrn.g:202:5: lv_assignement_7_0= ruleAssignement
            {

            					newCompositeNode(grammarAccess.getModelAccess().getAssignementAssignementParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_6);
            lv_assignement_7_0=ruleAssignement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModelRule());
            					}
            					add(
            						current,
            						"assignement",
            						lv_assignement_7_0,
            						"sar.drone.Drn.Assignement");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDrn.g:219:3: ( (lv_assignement_8_0= ruleAssignement ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalDrn.g:220:4: (lv_assignement_8_0= ruleAssignement )
            	    {
            	    // InternalDrn.g:220:4: (lv_assignement_8_0= ruleAssignement )
            	    // InternalDrn.g:221:5: lv_assignement_8_0= ruleAssignement
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getAssignementAssignementParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_assignement_8_0=ruleAssignement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"assignement",
            	    						lv_assignement_8_0,
            	    						"sar.drone.Drn.Assignement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_9=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_9, grammarAccess.getModelAccess().getStartKeyword_8());
            		
            otherlv_10=(Token)match(input,15,FOLLOW_5); 

            			newLeafNode(otherlv_10, grammarAccess.getModelAccess().getEqualsSignKeyword_9());
            		
            // InternalDrn.g:246:3: ( (lv_main_11_0= ruleRefPart ) )
            // InternalDrn.g:247:4: (lv_main_11_0= ruleRefPart )
            {
            // InternalDrn.g:247:4: (lv_main_11_0= ruleRefPart )
            // InternalDrn.g:248:5: lv_main_11_0= ruleRefPart
            {

            					newCompositeNode(grammarAccess.getModelAccess().getMainRefPartParserRuleCall_10_0());
            				
            pushFollow(FOLLOW_8);
            lv_main_11_0=ruleRefPart();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModelRule());
            					}
            					set(
            						current,
            						"main",
            						lv_main_11_0,
            						"sar.drone.Drn.RefPart");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_12=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_12, grammarAccess.getModelAccess().getSemicolonKeyword_11());
            		
            otherlv_13=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getModelAccess().getRightCurlyBracketKeyword_12());
            		

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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleLibrary"
    // InternalDrn.g:277:1: entryRuleLibrary returns [EObject current=null] : iv_ruleLibrary= ruleLibrary EOF ;
    public final EObject entryRuleLibrary() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLibrary = null;


        try {
            // InternalDrn.g:277:48: (iv_ruleLibrary= ruleLibrary EOF )
            // InternalDrn.g:278:2: iv_ruleLibrary= ruleLibrary EOF
            {
             newCompositeNode(grammarAccess.getLibraryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLibrary=ruleLibrary();

            state._fsp--;

             current =iv_ruleLibrary; 
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
    // $ANTLR end "entryRuleLibrary"


    // $ANTLR start "ruleLibrary"
    // InternalDrn.g:284:1: ruleLibrary returns [EObject current=null] : (otherlv_0= 'LIBRARY' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'import' ( (otherlv_4= RULE_ID ) ) )* ( (lv_context_5_0= ruleContext ) )? ( (lv_types_6_0= ruleTypeGeneric ) )* ( (lv_devices_7_0= ruleDevice ) )* ( (lv_assignement_8_0= ruleAssignement ) ) ( (lv_assignement_9_0= ruleAssignement ) )* otherlv_10= '}' ) ;
    public final EObject ruleLibrary() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_10=null;
        EObject lv_context_5_0 = null;

        EObject lv_types_6_0 = null;

        EObject lv_devices_7_0 = null;

        EObject lv_assignement_8_0 = null;

        EObject lv_assignement_9_0 = null;



        	enterRule();

        try {
            // InternalDrn.g:290:2: ( (otherlv_0= 'LIBRARY' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'import' ( (otherlv_4= RULE_ID ) ) )* ( (lv_context_5_0= ruleContext ) )? ( (lv_types_6_0= ruleTypeGeneric ) )* ( (lv_devices_7_0= ruleDevice ) )* ( (lv_assignement_8_0= ruleAssignement ) ) ( (lv_assignement_9_0= ruleAssignement ) )* otherlv_10= '}' ) )
            // InternalDrn.g:291:2: (otherlv_0= 'LIBRARY' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'import' ( (otherlv_4= RULE_ID ) ) )* ( (lv_context_5_0= ruleContext ) )? ( (lv_types_6_0= ruleTypeGeneric ) )* ( (lv_devices_7_0= ruleDevice ) )* ( (lv_assignement_8_0= ruleAssignement ) ) ( (lv_assignement_9_0= ruleAssignement ) )* otherlv_10= '}' )
            {
            // InternalDrn.g:291:2: (otherlv_0= 'LIBRARY' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'import' ( (otherlv_4= RULE_ID ) ) )* ( (lv_context_5_0= ruleContext ) )? ( (lv_types_6_0= ruleTypeGeneric ) )* ( (lv_devices_7_0= ruleDevice ) )* ( (lv_assignement_8_0= ruleAssignement ) ) ( (lv_assignement_9_0= ruleAssignement ) )* otherlv_10= '}' )
            // InternalDrn.g:292:3: otherlv_0= 'LIBRARY' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'import' ( (otherlv_4= RULE_ID ) ) )* ( (lv_context_5_0= ruleContext ) )? ( (lv_types_6_0= ruleTypeGeneric ) )* ( (lv_devices_7_0= ruleDevice ) )* ( (lv_assignement_8_0= ruleAssignement ) ) ( (lv_assignement_9_0= ruleAssignement ) )* otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getLibraryAccess().getLIBRARYKeyword_0());
            		
            // InternalDrn.g:296:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDrn.g:297:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDrn.g:297:4: (lv_name_1_0= RULE_ID )
            // InternalDrn.g:298:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(lv_name_1_0, grammarAccess.getLibraryAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLibraryRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getLibraryAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalDrn.g:318:3: (otherlv_3= 'import' ( (otherlv_4= RULE_ID ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==13) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalDrn.g:319:4: otherlv_3= 'import' ( (otherlv_4= RULE_ID ) )
            	    {
            	    otherlv_3=(Token)match(input,13,FOLLOW_5); 

            	    				newLeafNode(otherlv_3, grammarAccess.getLibraryAccess().getImportKeyword_3_0());
            	    			
            	    // InternalDrn.g:323:4: ( (otherlv_4= RULE_ID ) )
            	    // InternalDrn.g:324:5: (otherlv_4= RULE_ID )
            	    {
            	    // InternalDrn.g:324:5: (otherlv_4= RULE_ID )
            	    // InternalDrn.g:325:6: otherlv_4= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getLibraryRule());
            	    						}
            	    					
            	    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_4); 

            	    						newLeafNode(otherlv_4, grammarAccess.getLibraryAccess().getLibrariesLibraryCrossReference_3_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            // InternalDrn.g:337:3: ( (lv_context_5_0= ruleContext ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==19) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalDrn.g:338:4: (lv_context_5_0= ruleContext )
                    {
                    // InternalDrn.g:338:4: (lv_context_5_0= ruleContext )
                    // InternalDrn.g:339:5: lv_context_5_0= ruleContext
                    {

                    					newCompositeNode(grammarAccess.getLibraryAccess().getContextContextParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_4);
                    lv_context_5_0=ruleContext();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getLibraryRule());
                    					}
                    					set(
                    						current,
                    						"context",
                    						lv_context_5_0,
                    						"sar.drone.Drn.Context");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalDrn.g:356:3: ( (lv_types_6_0= ruleTypeGeneric ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==67) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalDrn.g:357:4: (lv_types_6_0= ruleTypeGeneric )
            	    {
            	    // InternalDrn.g:357:4: (lv_types_6_0= ruleTypeGeneric )
            	    // InternalDrn.g:358:5: lv_types_6_0= ruleTypeGeneric
            	    {

            	    					newCompositeNode(grammarAccess.getLibraryAccess().getTypesTypeGenericParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_types_6_0=ruleTypeGeneric();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getLibraryRule());
            	    					}
            	    					add(
            	    						current,
            	    						"types",
            	    						lv_types_6_0,
            	    						"sar.drone.Drn.TypeGeneric");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            // InternalDrn.g:375:3: ( (lv_devices_7_0= ruleDevice ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==56) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalDrn.g:376:4: (lv_devices_7_0= ruleDevice )
            	    {
            	    // InternalDrn.g:376:4: (lv_devices_7_0= ruleDevice )
            	    // InternalDrn.g:377:5: lv_devices_7_0= ruleDevice
            	    {

            	    					newCompositeNode(grammarAccess.getLibraryAccess().getDevicesDeviceParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_devices_7_0=ruleDevice();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getLibraryRule());
            	    					}
            	    					add(
            	    						current,
            	    						"devices",
            	    						lv_devices_7_0,
            	    						"sar.drone.Drn.Device");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            // InternalDrn.g:394:3: ( (lv_assignement_8_0= ruleAssignement ) )
            // InternalDrn.g:395:4: (lv_assignement_8_0= ruleAssignement )
            {
            // InternalDrn.g:395:4: (lv_assignement_8_0= ruleAssignement )
            // InternalDrn.g:396:5: lv_assignement_8_0= ruleAssignement
            {

            					newCompositeNode(grammarAccess.getLibraryAccess().getAssignementAssignementParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_10);
            lv_assignement_8_0=ruleAssignement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLibraryRule());
            					}
            					add(
            						current,
            						"assignement",
            						lv_assignement_8_0,
            						"sar.drone.Drn.Assignement");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDrn.g:413:3: ( (lv_assignement_9_0= ruleAssignement ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalDrn.g:414:4: (lv_assignement_9_0= ruleAssignement )
            	    {
            	    // InternalDrn.g:414:4: (lv_assignement_9_0= ruleAssignement )
            	    // InternalDrn.g:415:5: lv_assignement_9_0= ruleAssignement
            	    {

            	    					newCompositeNode(grammarAccess.getLibraryAccess().getAssignementAssignementParserRuleCall_8_0());
            	    				
            	    pushFollow(FOLLOW_10);
            	    lv_assignement_9_0=ruleAssignement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getLibraryRule());
            	    					}
            	    					add(
            	    						current,
            	    						"assignement",
            	    						lv_assignement_9_0,
            	    						"sar.drone.Drn.Assignement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            otherlv_10=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getLibraryAccess().getRightCurlyBracketKeyword_9());
            		

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
    // $ANTLR end "ruleLibrary"


    // $ANTLR start "entryRuleContext"
    // InternalDrn.g:440:1: entryRuleContext returns [EObject current=null] : iv_ruleContext= ruleContext EOF ;
    public final EObject entryRuleContext() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContext = null;


        try {
            // InternalDrn.g:440:48: (iv_ruleContext= ruleContext EOF )
            // InternalDrn.g:441:2: iv_ruleContext= ruleContext EOF
            {
             newCompositeNode(grammarAccess.getContextRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleContext=ruleContext();

            state._fsp--;

             current =iv_ruleContext; 
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
    // $ANTLR end "entryRuleContext"


    // $ANTLR start "ruleContext"
    // InternalDrn.g:447:1: ruleContext returns [EObject current=null] : ( ( (lv_name_0_0= 'CONTEXT' ) ) otherlv_1= '{' ( (lv_limit_2_0= ruleLimit ) ) otherlv_3= ';' ( ( (lv_limit_4_0= ruleLimit ) ) otherlv_5= ';' )* otherlv_6= '}' ) ;
    public final EObject ruleContext() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        EObject lv_limit_2_0 = null;

        EObject lv_limit_4_0 = null;



        	enterRule();

        try {
            // InternalDrn.g:453:2: ( ( ( (lv_name_0_0= 'CONTEXT' ) ) otherlv_1= '{' ( (lv_limit_2_0= ruleLimit ) ) otherlv_3= ';' ( ( (lv_limit_4_0= ruleLimit ) ) otherlv_5= ';' )* otherlv_6= '}' ) )
            // InternalDrn.g:454:2: ( ( (lv_name_0_0= 'CONTEXT' ) ) otherlv_1= '{' ( (lv_limit_2_0= ruleLimit ) ) otherlv_3= ';' ( ( (lv_limit_4_0= ruleLimit ) ) otherlv_5= ';' )* otherlv_6= '}' )
            {
            // InternalDrn.g:454:2: ( ( (lv_name_0_0= 'CONTEXT' ) ) otherlv_1= '{' ( (lv_limit_2_0= ruleLimit ) ) otherlv_3= ';' ( ( (lv_limit_4_0= ruleLimit ) ) otherlv_5= ';' )* otherlv_6= '}' )
            // InternalDrn.g:455:3: ( (lv_name_0_0= 'CONTEXT' ) ) otherlv_1= '{' ( (lv_limit_2_0= ruleLimit ) ) otherlv_3= ';' ( ( (lv_limit_4_0= ruleLimit ) ) otherlv_5= ';' )* otherlv_6= '}'
            {
            // InternalDrn.g:455:3: ( (lv_name_0_0= 'CONTEXT' ) )
            // InternalDrn.g:456:4: (lv_name_0_0= 'CONTEXT' )
            {
            // InternalDrn.g:456:4: (lv_name_0_0= 'CONTEXT' )
            // InternalDrn.g:457:5: lv_name_0_0= 'CONTEXT'
            {
            lv_name_0_0=(Token)match(input,19,FOLLOW_3); 

            					newLeafNode(lv_name_0_0, grammarAccess.getContextAccess().getNameCONTEXTKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getContextRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "CONTEXT");
            				

            }


            }

            otherlv_1=(Token)match(input,12,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getContextAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalDrn.g:473:3: ( (lv_limit_2_0= ruleLimit ) )
            // InternalDrn.g:474:4: (lv_limit_2_0= ruleLimit )
            {
            // InternalDrn.g:474:4: (lv_limit_2_0= ruleLimit )
            // InternalDrn.g:475:5: lv_limit_2_0= ruleLimit
            {

            					newCompositeNode(grammarAccess.getContextAccess().getLimitLimitParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_8);
            lv_limit_2_0=ruleLimit();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getContextRule());
            					}
            					add(
            						current,
            						"limit",
            						lv_limit_2_0,
            						"sar.drone.Drn.Limit");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,16,FOLLOW_12); 

            			newLeafNode(otherlv_3, grammarAccess.getContextAccess().getSemicolonKeyword_3());
            		
            // InternalDrn.g:496:3: ( ( (lv_limit_4_0= ruleLimit ) ) otherlv_5= ';' )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=20 && LA12_0<=26)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalDrn.g:497:4: ( (lv_limit_4_0= ruleLimit ) ) otherlv_5= ';'
            	    {
            	    // InternalDrn.g:497:4: ( (lv_limit_4_0= ruleLimit ) )
            	    // InternalDrn.g:498:5: (lv_limit_4_0= ruleLimit )
            	    {
            	    // InternalDrn.g:498:5: (lv_limit_4_0= ruleLimit )
            	    // InternalDrn.g:499:6: lv_limit_4_0= ruleLimit
            	    {

            	    						newCompositeNode(grammarAccess.getContextAccess().getLimitLimitParserRuleCall_4_0_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_limit_4_0=ruleLimit();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getContextRule());
            	    						}
            	    						add(
            	    							current,
            	    							"limit",
            	    							lv_limit_4_0,
            	    							"sar.drone.Drn.Limit");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_5=(Token)match(input,16,FOLLOW_12); 

            	    				newLeafNode(otherlv_5, grammarAccess.getContextAccess().getSemicolonKeyword_4_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            otherlv_6=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getContextAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleContext"


    // $ANTLR start "entryRuleLimit"
    // InternalDrn.g:529:1: entryRuleLimit returns [EObject current=null] : iv_ruleLimit= ruleLimit EOF ;
    public final EObject entryRuleLimit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLimit = null;


        try {
            // InternalDrn.g:529:46: (iv_ruleLimit= ruleLimit EOF )
            // InternalDrn.g:530:2: iv_ruleLimit= ruleLimit EOF
            {
             newCompositeNode(grammarAccess.getLimitRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLimit=ruleLimit();

            state._fsp--;

             current =iv_ruleLimit; 
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
    // $ANTLR end "entryRuleLimit"


    // $ANTLR start "ruleLimit"
    // InternalDrn.g:536:1: ruleLimit returns [EObject current=null] : (this_MaxSpeed_0= ruleMaxSpeed | this_Surface_1= ruleSurface | this_InitialPosition_2= ruleInitialPosition ) ;
    public final EObject ruleLimit() throws RecognitionException {
        EObject current = null;

        EObject this_MaxSpeed_0 = null;

        EObject this_Surface_1 = null;

        EObject this_InitialPosition_2 = null;



        	enterRule();

        try {
            // InternalDrn.g:542:2: ( (this_MaxSpeed_0= ruleMaxSpeed | this_Surface_1= ruleSurface | this_InitialPosition_2= ruleInitialPosition ) )
            // InternalDrn.g:543:2: (this_MaxSpeed_0= ruleMaxSpeed | this_Surface_1= ruleSurface | this_InitialPosition_2= ruleInitialPosition )
            {
            // InternalDrn.g:543:2: (this_MaxSpeed_0= ruleMaxSpeed | this_Surface_1= ruleSurface | this_InitialPosition_2= ruleInitialPosition )
            int alt13=3;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt13=1;
                }
                break;
            case 23:
            case 24:
            case 26:
                {
                alt13=2;
                }
                break;
            case 20:
            case 21:
            case 22:
                {
                alt13=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalDrn.g:544:3: this_MaxSpeed_0= ruleMaxSpeed
                    {

                    			newCompositeNode(grammarAccess.getLimitAccess().getMaxSpeedParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_MaxSpeed_0=ruleMaxSpeed();

                    state._fsp--;


                    			current = this_MaxSpeed_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDrn.g:553:3: this_Surface_1= ruleSurface
                    {

                    			newCompositeNode(grammarAccess.getLimitAccess().getSurfaceParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Surface_1=ruleSurface();

                    state._fsp--;


                    			current = this_Surface_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalDrn.g:562:3: this_InitialPosition_2= ruleInitialPosition
                    {

                    			newCompositeNode(grammarAccess.getLimitAccess().getInitialPositionParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_InitialPosition_2=ruleInitialPosition();

                    state._fsp--;


                    			current = this_InitialPosition_2;
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
    // $ANTLR end "ruleLimit"


    // $ANTLR start "entryRuleSurface"
    // InternalDrn.g:574:1: entryRuleSurface returns [EObject current=null] : iv_ruleSurface= ruleSurface EOF ;
    public final EObject entryRuleSurface() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSurface = null;


        try {
            // InternalDrn.g:574:48: (iv_ruleSurface= ruleSurface EOF )
            // InternalDrn.g:575:2: iv_ruleSurface= ruleSurface EOF
            {
             newCompositeNode(grammarAccess.getSurfaceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSurface=ruleSurface();

            state._fsp--;

             current =iv_ruleSurface; 
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
    // $ANTLR end "entryRuleSurface"


    // $ANTLR start "ruleSurface"
    // InternalDrn.g:581:1: ruleSurface returns [EObject current=null] : (this_MaxHeight_0= ruleMaxHeight | this_MaxLength_1= ruleMaxLength | this_MaxWidth_2= ruleMaxWidth ) ;
    public final EObject ruleSurface() throws RecognitionException {
        EObject current = null;

        EObject this_MaxHeight_0 = null;

        EObject this_MaxLength_1 = null;

        EObject this_MaxWidth_2 = null;



        	enterRule();

        try {
            // InternalDrn.g:587:2: ( (this_MaxHeight_0= ruleMaxHeight | this_MaxLength_1= ruleMaxLength | this_MaxWidth_2= ruleMaxWidth ) )
            // InternalDrn.g:588:2: (this_MaxHeight_0= ruleMaxHeight | this_MaxLength_1= ruleMaxLength | this_MaxWidth_2= ruleMaxWidth )
            {
            // InternalDrn.g:588:2: (this_MaxHeight_0= ruleMaxHeight | this_MaxLength_1= ruleMaxLength | this_MaxWidth_2= ruleMaxWidth )
            int alt14=3;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt14=1;
                }
                break;
            case 23:
                {
                alt14=2;
                }
                break;
            case 24:
                {
                alt14=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalDrn.g:589:3: this_MaxHeight_0= ruleMaxHeight
                    {

                    			newCompositeNode(grammarAccess.getSurfaceAccess().getMaxHeightParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_MaxHeight_0=ruleMaxHeight();

                    state._fsp--;


                    			current = this_MaxHeight_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDrn.g:598:3: this_MaxLength_1= ruleMaxLength
                    {

                    			newCompositeNode(grammarAccess.getSurfaceAccess().getMaxLengthParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_MaxLength_1=ruleMaxLength();

                    state._fsp--;


                    			current = this_MaxLength_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalDrn.g:607:3: this_MaxWidth_2= ruleMaxWidth
                    {

                    			newCompositeNode(grammarAccess.getSurfaceAccess().getMaxWidthParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_MaxWidth_2=ruleMaxWidth();

                    state._fsp--;


                    			current = this_MaxWidth_2;
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
    // $ANTLR end "ruleSurface"


    // $ANTLR start "entryRuleInitialPosition"
    // InternalDrn.g:619:1: entryRuleInitialPosition returns [EObject current=null] : iv_ruleInitialPosition= ruleInitialPosition EOF ;
    public final EObject entryRuleInitialPosition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInitialPosition = null;


        try {
            // InternalDrn.g:619:56: (iv_ruleInitialPosition= ruleInitialPosition EOF )
            // InternalDrn.g:620:2: iv_ruleInitialPosition= ruleInitialPosition EOF
            {
             newCompositeNode(grammarAccess.getInitialPositionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInitialPosition=ruleInitialPosition();

            state._fsp--;

             current =iv_ruleInitialPosition; 
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
    // $ANTLR end "entryRuleInitialPosition"


    // $ANTLR start "ruleInitialPosition"
    // InternalDrn.g:626:1: ruleInitialPosition returns [EObject current=null] : (this_InitialPositionX_0= ruleInitialPositionX | this_InitialPositionY_1= ruleInitialPositionY | this_InitialDirection_2= ruleInitialDirection ) ;
    public final EObject ruleInitialPosition() throws RecognitionException {
        EObject current = null;

        EObject this_InitialPositionX_0 = null;

        EObject this_InitialPositionY_1 = null;

        EObject this_InitialDirection_2 = null;



        	enterRule();

        try {
            // InternalDrn.g:632:2: ( (this_InitialPositionX_0= ruleInitialPositionX | this_InitialPositionY_1= ruleInitialPositionY | this_InitialDirection_2= ruleInitialDirection ) )
            // InternalDrn.g:633:2: (this_InitialPositionX_0= ruleInitialPositionX | this_InitialPositionY_1= ruleInitialPositionY | this_InitialDirection_2= ruleInitialDirection )
            {
            // InternalDrn.g:633:2: (this_InitialPositionX_0= ruleInitialPositionX | this_InitialPositionY_1= ruleInitialPositionY | this_InitialDirection_2= ruleInitialDirection )
            int alt15=3;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt15=1;
                }
                break;
            case 22:
                {
                alt15=2;
                }
                break;
            case 20:
                {
                alt15=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalDrn.g:634:3: this_InitialPositionX_0= ruleInitialPositionX
                    {

                    			newCompositeNode(grammarAccess.getInitialPositionAccess().getInitialPositionXParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_InitialPositionX_0=ruleInitialPositionX();

                    state._fsp--;


                    			current = this_InitialPositionX_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDrn.g:643:3: this_InitialPositionY_1= ruleInitialPositionY
                    {

                    			newCompositeNode(grammarAccess.getInitialPositionAccess().getInitialPositionYParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_InitialPositionY_1=ruleInitialPositionY();

                    state._fsp--;


                    			current = this_InitialPositionY_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalDrn.g:652:3: this_InitialDirection_2= ruleInitialDirection
                    {

                    			newCompositeNode(grammarAccess.getInitialPositionAccess().getInitialDirectionParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_InitialDirection_2=ruleInitialDirection();

                    state._fsp--;


                    			current = this_InitialDirection_2;
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
    // $ANTLR end "ruleInitialPosition"


    // $ANTLR start "entryRuleInitialDirection"
    // InternalDrn.g:664:1: entryRuleInitialDirection returns [EObject current=null] : iv_ruleInitialDirection= ruleInitialDirection EOF ;
    public final EObject entryRuleInitialDirection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInitialDirection = null;


        try {
            // InternalDrn.g:664:57: (iv_ruleInitialDirection= ruleInitialDirection EOF )
            // InternalDrn.g:665:2: iv_ruleInitialDirection= ruleInitialDirection EOF
            {
             newCompositeNode(grammarAccess.getInitialDirectionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInitialDirection=ruleInitialDirection();

            state._fsp--;

             current =iv_ruleInitialDirection; 
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
    // $ANTLR end "entryRuleInitialDirection"


    // $ANTLR start "ruleInitialDirection"
    // InternalDrn.g:671:1: ruleInitialDirection returns [EObject current=null] : ( ( (lv_name_0_0= 'initialDirection' ) ) otherlv_1= '=' ( (lv_value_2_0= ruleDirectionType ) ) ) ;
    public final EObject ruleInitialDirection() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Enumerator lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalDrn.g:677:2: ( ( ( (lv_name_0_0= 'initialDirection' ) ) otherlv_1= '=' ( (lv_value_2_0= ruleDirectionType ) ) ) )
            // InternalDrn.g:678:2: ( ( (lv_name_0_0= 'initialDirection' ) ) otherlv_1= '=' ( (lv_value_2_0= ruleDirectionType ) ) )
            {
            // InternalDrn.g:678:2: ( ( (lv_name_0_0= 'initialDirection' ) ) otherlv_1= '=' ( (lv_value_2_0= ruleDirectionType ) ) )
            // InternalDrn.g:679:3: ( (lv_name_0_0= 'initialDirection' ) ) otherlv_1= '=' ( (lv_value_2_0= ruleDirectionType ) )
            {
            // InternalDrn.g:679:3: ( (lv_name_0_0= 'initialDirection' ) )
            // InternalDrn.g:680:4: (lv_name_0_0= 'initialDirection' )
            {
            // InternalDrn.g:680:4: (lv_name_0_0= 'initialDirection' )
            // InternalDrn.g:681:5: lv_name_0_0= 'initialDirection'
            {
            lv_name_0_0=(Token)match(input,20,FOLLOW_7); 

            					newLeafNode(lv_name_0_0, grammarAccess.getInitialDirectionAccess().getNameInitialDirectionKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInitialDirectionRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "initialDirection");
            				

            }


            }

            otherlv_1=(Token)match(input,15,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getInitialDirectionAccess().getEqualsSignKeyword_1());
            		
            // InternalDrn.g:697:3: ( (lv_value_2_0= ruleDirectionType ) )
            // InternalDrn.g:698:4: (lv_value_2_0= ruleDirectionType )
            {
            // InternalDrn.g:698:4: (lv_value_2_0= ruleDirectionType )
            // InternalDrn.g:699:5: lv_value_2_0= ruleDirectionType
            {

            					newCompositeNode(grammarAccess.getInitialDirectionAccess().getValueDirectionTypeEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_2_0=ruleDirectionType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInitialDirectionRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_2_0,
            						"sar.drone.Drn.DirectionType");
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
    // $ANTLR end "ruleInitialDirection"


    // $ANTLR start "entryRuleInitialPositionX"
    // InternalDrn.g:720:1: entryRuleInitialPositionX returns [EObject current=null] : iv_ruleInitialPositionX= ruleInitialPositionX EOF ;
    public final EObject entryRuleInitialPositionX() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInitialPositionX = null;


        try {
            // InternalDrn.g:720:57: (iv_ruleInitialPositionX= ruleInitialPositionX EOF )
            // InternalDrn.g:721:2: iv_ruleInitialPositionX= ruleInitialPositionX EOF
            {
             newCompositeNode(grammarAccess.getInitialPositionXRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInitialPositionX=ruleInitialPositionX();

            state._fsp--;

             current =iv_ruleInitialPositionX; 
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
    // $ANTLR end "entryRuleInitialPositionX"


    // $ANTLR start "ruleInitialPositionX"
    // InternalDrn.g:727:1: ruleInitialPositionX returns [EObject current=null] : ( ( (lv_name_0_0= 'positionX' ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_INT ) ) ) ;
    public final EObject ruleInitialPositionX() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;


        	enterRule();

        try {
            // InternalDrn.g:733:2: ( ( ( (lv_name_0_0= 'positionX' ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_INT ) ) ) )
            // InternalDrn.g:734:2: ( ( (lv_name_0_0= 'positionX' ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_INT ) ) )
            {
            // InternalDrn.g:734:2: ( ( (lv_name_0_0= 'positionX' ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_INT ) ) )
            // InternalDrn.g:735:3: ( (lv_name_0_0= 'positionX' ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_INT ) )
            {
            // InternalDrn.g:735:3: ( (lv_name_0_0= 'positionX' ) )
            // InternalDrn.g:736:4: (lv_name_0_0= 'positionX' )
            {
            // InternalDrn.g:736:4: (lv_name_0_0= 'positionX' )
            // InternalDrn.g:737:5: lv_name_0_0= 'positionX'
            {
            lv_name_0_0=(Token)match(input,21,FOLLOW_7); 

            					newLeafNode(lv_name_0_0, grammarAccess.getInitialPositionXAccess().getNamePositionXKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInitialPositionXRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "positionX");
            				

            }


            }

            otherlv_1=(Token)match(input,15,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getInitialPositionXAccess().getEqualsSignKeyword_1());
            		
            // InternalDrn.g:753:3: ( (lv_value_2_0= RULE_INT ) )
            // InternalDrn.g:754:4: (lv_value_2_0= RULE_INT )
            {
            // InternalDrn.g:754:4: (lv_value_2_0= RULE_INT )
            // InternalDrn.g:755:5: lv_value_2_0= RULE_INT
            {
            lv_value_2_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_value_2_0, grammarAccess.getInitialPositionXAccess().getValueINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInitialPositionXRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

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
    // $ANTLR end "ruleInitialPositionX"


    // $ANTLR start "entryRuleInitialPositionY"
    // InternalDrn.g:775:1: entryRuleInitialPositionY returns [EObject current=null] : iv_ruleInitialPositionY= ruleInitialPositionY EOF ;
    public final EObject entryRuleInitialPositionY() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInitialPositionY = null;


        try {
            // InternalDrn.g:775:57: (iv_ruleInitialPositionY= ruleInitialPositionY EOF )
            // InternalDrn.g:776:2: iv_ruleInitialPositionY= ruleInitialPositionY EOF
            {
             newCompositeNode(grammarAccess.getInitialPositionYRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInitialPositionY=ruleInitialPositionY();

            state._fsp--;

             current =iv_ruleInitialPositionY; 
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
    // $ANTLR end "entryRuleInitialPositionY"


    // $ANTLR start "ruleInitialPositionY"
    // InternalDrn.g:782:1: ruleInitialPositionY returns [EObject current=null] : ( ( (lv_name_0_0= 'positionY' ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_INT ) ) ) ;
    public final EObject ruleInitialPositionY() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;


        	enterRule();

        try {
            // InternalDrn.g:788:2: ( ( ( (lv_name_0_0= 'positionY' ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_INT ) ) ) )
            // InternalDrn.g:789:2: ( ( (lv_name_0_0= 'positionY' ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_INT ) ) )
            {
            // InternalDrn.g:789:2: ( ( (lv_name_0_0= 'positionY' ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_INT ) ) )
            // InternalDrn.g:790:3: ( (lv_name_0_0= 'positionY' ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_INT ) )
            {
            // InternalDrn.g:790:3: ( (lv_name_0_0= 'positionY' ) )
            // InternalDrn.g:791:4: (lv_name_0_0= 'positionY' )
            {
            // InternalDrn.g:791:4: (lv_name_0_0= 'positionY' )
            // InternalDrn.g:792:5: lv_name_0_0= 'positionY'
            {
            lv_name_0_0=(Token)match(input,22,FOLLOW_7); 

            					newLeafNode(lv_name_0_0, grammarAccess.getInitialPositionYAccess().getNamePositionYKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInitialPositionYRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "positionY");
            				

            }


            }

            otherlv_1=(Token)match(input,15,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getInitialPositionYAccess().getEqualsSignKeyword_1());
            		
            // InternalDrn.g:808:3: ( (lv_value_2_0= RULE_INT ) )
            // InternalDrn.g:809:4: (lv_value_2_0= RULE_INT )
            {
            // InternalDrn.g:809:4: (lv_value_2_0= RULE_INT )
            // InternalDrn.g:810:5: lv_value_2_0= RULE_INT
            {
            lv_value_2_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_value_2_0, grammarAccess.getInitialPositionYAccess().getValueINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInitialPositionYRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

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
    // $ANTLR end "ruleInitialPositionY"


    // $ANTLR start "entryRuleMaxLength"
    // InternalDrn.g:830:1: entryRuleMaxLength returns [EObject current=null] : iv_ruleMaxLength= ruleMaxLength EOF ;
    public final EObject entryRuleMaxLength() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMaxLength = null;


        try {
            // InternalDrn.g:830:50: (iv_ruleMaxLength= ruleMaxLength EOF )
            // InternalDrn.g:831:2: iv_ruleMaxLength= ruleMaxLength EOF
            {
             newCompositeNode(grammarAccess.getMaxLengthRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMaxLength=ruleMaxLength();

            state._fsp--;

             current =iv_ruleMaxLength; 
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
    // $ANTLR end "entryRuleMaxLength"


    // $ANTLR start "ruleMaxLength"
    // InternalDrn.g:837:1: ruleMaxLength returns [EObject current=null] : ( ( (lv_name_0_0= 'maxLength' ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_INT ) ) ) ;
    public final EObject ruleMaxLength() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;


        	enterRule();

        try {
            // InternalDrn.g:843:2: ( ( ( (lv_name_0_0= 'maxLength' ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_INT ) ) ) )
            // InternalDrn.g:844:2: ( ( (lv_name_0_0= 'maxLength' ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_INT ) ) )
            {
            // InternalDrn.g:844:2: ( ( (lv_name_0_0= 'maxLength' ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_INT ) ) )
            // InternalDrn.g:845:3: ( (lv_name_0_0= 'maxLength' ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_INT ) )
            {
            // InternalDrn.g:845:3: ( (lv_name_0_0= 'maxLength' ) )
            // InternalDrn.g:846:4: (lv_name_0_0= 'maxLength' )
            {
            // InternalDrn.g:846:4: (lv_name_0_0= 'maxLength' )
            // InternalDrn.g:847:5: lv_name_0_0= 'maxLength'
            {
            lv_name_0_0=(Token)match(input,23,FOLLOW_7); 

            					newLeafNode(lv_name_0_0, grammarAccess.getMaxLengthAccess().getNameMaxLengthKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMaxLengthRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "maxLength");
            				

            }


            }

            otherlv_1=(Token)match(input,15,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getMaxLengthAccess().getEqualsSignKeyword_1());
            		
            // InternalDrn.g:863:3: ( (lv_value_2_0= RULE_INT ) )
            // InternalDrn.g:864:4: (lv_value_2_0= RULE_INT )
            {
            // InternalDrn.g:864:4: (lv_value_2_0= RULE_INT )
            // InternalDrn.g:865:5: lv_value_2_0= RULE_INT
            {
            lv_value_2_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_value_2_0, grammarAccess.getMaxLengthAccess().getValueINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMaxLengthRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

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
    // $ANTLR end "ruleMaxLength"


    // $ANTLR start "entryRuleMaxWidth"
    // InternalDrn.g:885:1: entryRuleMaxWidth returns [EObject current=null] : iv_ruleMaxWidth= ruleMaxWidth EOF ;
    public final EObject entryRuleMaxWidth() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMaxWidth = null;


        try {
            // InternalDrn.g:885:49: (iv_ruleMaxWidth= ruleMaxWidth EOF )
            // InternalDrn.g:886:2: iv_ruleMaxWidth= ruleMaxWidth EOF
            {
             newCompositeNode(grammarAccess.getMaxWidthRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMaxWidth=ruleMaxWidth();

            state._fsp--;

             current =iv_ruleMaxWidth; 
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
    // $ANTLR end "entryRuleMaxWidth"


    // $ANTLR start "ruleMaxWidth"
    // InternalDrn.g:892:1: ruleMaxWidth returns [EObject current=null] : ( ( (lv_name_0_0= 'maxWidth' ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_INT ) ) ) ;
    public final EObject ruleMaxWidth() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;


        	enterRule();

        try {
            // InternalDrn.g:898:2: ( ( ( (lv_name_0_0= 'maxWidth' ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_INT ) ) ) )
            // InternalDrn.g:899:2: ( ( (lv_name_0_0= 'maxWidth' ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_INT ) ) )
            {
            // InternalDrn.g:899:2: ( ( (lv_name_0_0= 'maxWidth' ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_INT ) ) )
            // InternalDrn.g:900:3: ( (lv_name_0_0= 'maxWidth' ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_INT ) )
            {
            // InternalDrn.g:900:3: ( (lv_name_0_0= 'maxWidth' ) )
            // InternalDrn.g:901:4: (lv_name_0_0= 'maxWidth' )
            {
            // InternalDrn.g:901:4: (lv_name_0_0= 'maxWidth' )
            // InternalDrn.g:902:5: lv_name_0_0= 'maxWidth'
            {
            lv_name_0_0=(Token)match(input,24,FOLLOW_7); 

            					newLeafNode(lv_name_0_0, grammarAccess.getMaxWidthAccess().getNameMaxWidthKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMaxWidthRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "maxWidth");
            				

            }


            }

            otherlv_1=(Token)match(input,15,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getMaxWidthAccess().getEqualsSignKeyword_1());
            		
            // InternalDrn.g:918:3: ( (lv_value_2_0= RULE_INT ) )
            // InternalDrn.g:919:4: (lv_value_2_0= RULE_INT )
            {
            // InternalDrn.g:919:4: (lv_value_2_0= RULE_INT )
            // InternalDrn.g:920:5: lv_value_2_0= RULE_INT
            {
            lv_value_2_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_value_2_0, grammarAccess.getMaxWidthAccess().getValueINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMaxWidthRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

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
    // $ANTLR end "ruleMaxWidth"


    // $ANTLR start "entryRuleMaxSpeed"
    // InternalDrn.g:940:1: entryRuleMaxSpeed returns [EObject current=null] : iv_ruleMaxSpeed= ruleMaxSpeed EOF ;
    public final EObject entryRuleMaxSpeed() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMaxSpeed = null;


        try {
            // InternalDrn.g:940:49: (iv_ruleMaxSpeed= ruleMaxSpeed EOF )
            // InternalDrn.g:941:2: iv_ruleMaxSpeed= ruleMaxSpeed EOF
            {
             newCompositeNode(grammarAccess.getMaxSpeedRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMaxSpeed=ruleMaxSpeed();

            state._fsp--;

             current =iv_ruleMaxSpeed; 
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
    // $ANTLR end "entryRuleMaxSpeed"


    // $ANTLR start "ruleMaxSpeed"
    // InternalDrn.g:947:1: ruleMaxSpeed returns [EObject current=null] : ( ( (lv_name_0_0= 'maxSpeed' ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_INT ) ) ) ;
    public final EObject ruleMaxSpeed() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;


        	enterRule();

        try {
            // InternalDrn.g:953:2: ( ( ( (lv_name_0_0= 'maxSpeed' ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_INT ) ) ) )
            // InternalDrn.g:954:2: ( ( (lv_name_0_0= 'maxSpeed' ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_INT ) ) )
            {
            // InternalDrn.g:954:2: ( ( (lv_name_0_0= 'maxSpeed' ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_INT ) ) )
            // InternalDrn.g:955:3: ( (lv_name_0_0= 'maxSpeed' ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_INT ) )
            {
            // InternalDrn.g:955:3: ( (lv_name_0_0= 'maxSpeed' ) )
            // InternalDrn.g:956:4: (lv_name_0_0= 'maxSpeed' )
            {
            // InternalDrn.g:956:4: (lv_name_0_0= 'maxSpeed' )
            // InternalDrn.g:957:5: lv_name_0_0= 'maxSpeed'
            {
            lv_name_0_0=(Token)match(input,25,FOLLOW_7); 

            					newLeafNode(lv_name_0_0, grammarAccess.getMaxSpeedAccess().getNameMaxSpeedKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMaxSpeedRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "maxSpeed");
            				

            }


            }

            otherlv_1=(Token)match(input,15,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getMaxSpeedAccess().getEqualsSignKeyword_1());
            		
            // InternalDrn.g:973:3: ( (lv_value_2_0= RULE_INT ) )
            // InternalDrn.g:974:4: (lv_value_2_0= RULE_INT )
            {
            // InternalDrn.g:974:4: (lv_value_2_0= RULE_INT )
            // InternalDrn.g:975:5: lv_value_2_0= RULE_INT
            {
            lv_value_2_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_value_2_0, grammarAccess.getMaxSpeedAccess().getValueINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMaxSpeedRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

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
    // $ANTLR end "ruleMaxSpeed"


    // $ANTLR start "entryRuleMaxHeight"
    // InternalDrn.g:995:1: entryRuleMaxHeight returns [EObject current=null] : iv_ruleMaxHeight= ruleMaxHeight EOF ;
    public final EObject entryRuleMaxHeight() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMaxHeight = null;


        try {
            // InternalDrn.g:995:50: (iv_ruleMaxHeight= ruleMaxHeight EOF )
            // InternalDrn.g:996:2: iv_ruleMaxHeight= ruleMaxHeight EOF
            {
             newCompositeNode(grammarAccess.getMaxHeightRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMaxHeight=ruleMaxHeight();

            state._fsp--;

             current =iv_ruleMaxHeight; 
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
    // $ANTLR end "entryRuleMaxHeight"


    // $ANTLR start "ruleMaxHeight"
    // InternalDrn.g:1002:1: ruleMaxHeight returns [EObject current=null] : ( ( (lv_name_0_0= 'maxHeight' ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_INT ) ) ) ;
    public final EObject ruleMaxHeight() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;


        	enterRule();

        try {
            // InternalDrn.g:1008:2: ( ( ( (lv_name_0_0= 'maxHeight' ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_INT ) ) ) )
            // InternalDrn.g:1009:2: ( ( (lv_name_0_0= 'maxHeight' ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_INT ) ) )
            {
            // InternalDrn.g:1009:2: ( ( (lv_name_0_0= 'maxHeight' ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_INT ) ) )
            // InternalDrn.g:1010:3: ( (lv_name_0_0= 'maxHeight' ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_INT ) )
            {
            // InternalDrn.g:1010:3: ( (lv_name_0_0= 'maxHeight' ) )
            // InternalDrn.g:1011:4: (lv_name_0_0= 'maxHeight' )
            {
            // InternalDrn.g:1011:4: (lv_name_0_0= 'maxHeight' )
            // InternalDrn.g:1012:5: lv_name_0_0= 'maxHeight'
            {
            lv_name_0_0=(Token)match(input,26,FOLLOW_7); 

            					newLeafNode(lv_name_0_0, grammarAccess.getMaxHeightAccess().getNameMaxHeightKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMaxHeightRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "maxHeight");
            				

            }


            }

            otherlv_1=(Token)match(input,15,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getMaxHeightAccess().getEqualsSignKeyword_1());
            		
            // InternalDrn.g:1028:3: ( (lv_value_2_0= RULE_INT ) )
            // InternalDrn.g:1029:4: (lv_value_2_0= RULE_INT )
            {
            // InternalDrn.g:1029:4: (lv_value_2_0= RULE_INT )
            // InternalDrn.g:1030:5: lv_value_2_0= RULE_INT
            {
            lv_value_2_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_value_2_0, grammarAccess.getMaxHeightAccess().getValueINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMaxHeightRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

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
    // $ANTLR end "ruleMaxHeight"


    // $ANTLR start "entryRuleAssignement"
    // InternalDrn.g:1050:1: entryRuleAssignement returns [EObject current=null] : iv_ruleAssignement= ruleAssignement EOF ;
    public final EObject entryRuleAssignement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignement = null;


        try {
            // InternalDrn.g:1050:52: (iv_ruleAssignement= ruleAssignement EOF )
            // InternalDrn.g:1051:2: iv_ruleAssignement= ruleAssignement EOF
            {
             newCompositeNode(grammarAccess.getAssignementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAssignement=ruleAssignement();

            state._fsp--;

             current =iv_ruleAssignement; 
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
    // $ANTLR end "entryRuleAssignement"


    // $ANTLR start "ruleAssignement"
    // InternalDrn.g:1057:1: ruleAssignement returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_operandes_2_0= ruleExpression ) ) otherlv_3= ';' ( ( (lv_operandes_4_0= ruleExpression ) ) otherlv_5= ';' )* otherlv_6= '}' ) ;
    public final EObject ruleAssignement() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        EObject lv_operandes_2_0 = null;

        EObject lv_operandes_4_0 = null;



        	enterRule();

        try {
            // InternalDrn.g:1063:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_operandes_2_0= ruleExpression ) ) otherlv_3= ';' ( ( (lv_operandes_4_0= ruleExpression ) ) otherlv_5= ';' )* otherlv_6= '}' ) )
            // InternalDrn.g:1064:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_operandes_2_0= ruleExpression ) ) otherlv_3= ';' ( ( (lv_operandes_4_0= ruleExpression ) ) otherlv_5= ';' )* otherlv_6= '}' )
            {
            // InternalDrn.g:1064:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_operandes_2_0= ruleExpression ) ) otherlv_3= ';' ( ( (lv_operandes_4_0= ruleExpression ) ) otherlv_5= ';' )* otherlv_6= '}' )
            // InternalDrn.g:1065:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_operandes_2_0= ruleExpression ) ) otherlv_3= ';' ( ( (lv_operandes_4_0= ruleExpression ) ) otherlv_5= ';' )* otherlv_6= '}'
            {
            // InternalDrn.g:1065:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalDrn.g:1066:4: (lv_name_0_0= RULE_ID )
            {
            // InternalDrn.g:1066:4: (lv_name_0_0= RULE_ID )
            // InternalDrn.g:1067:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(lv_name_0_0, grammarAccess.getAssignementAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAssignementRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,12,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getAssignementAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalDrn.g:1087:3: ( (lv_operandes_2_0= ruleExpression ) )
            // InternalDrn.g:1088:4: (lv_operandes_2_0= ruleExpression )
            {
            // InternalDrn.g:1088:4: (lv_operandes_2_0= ruleExpression )
            // InternalDrn.g:1089:5: lv_operandes_2_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getAssignementAccess().getOperandesExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_8);
            lv_operandes_2_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAssignementRule());
            					}
            					add(
            						current,
            						"operandes",
            						lv_operandes_2_0,
            						"sar.drone.Drn.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,16,FOLLOW_16); 

            			newLeafNode(otherlv_3, grammarAccess.getAssignementAccess().getSemicolonKeyword_3());
            		
            // InternalDrn.g:1110:3: ( ( (lv_operandes_4_0= ruleExpression ) ) otherlv_5= ';' )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_ID||LA16_0==28||LA16_0==32||LA16_0==34||(LA16_0>=37 && LA16_0<=42)||LA16_0==44||(LA16_0>=46 && LA16_0<=51)||(LA16_0>=53 && LA16_0<=55)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalDrn.g:1111:4: ( (lv_operandes_4_0= ruleExpression ) ) otherlv_5= ';'
            	    {
            	    // InternalDrn.g:1111:4: ( (lv_operandes_4_0= ruleExpression ) )
            	    // InternalDrn.g:1112:5: (lv_operandes_4_0= ruleExpression )
            	    {
            	    // InternalDrn.g:1112:5: (lv_operandes_4_0= ruleExpression )
            	    // InternalDrn.g:1113:6: lv_operandes_4_0= ruleExpression
            	    {

            	    						newCompositeNode(grammarAccess.getAssignementAccess().getOperandesExpressionParserRuleCall_4_0_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_operandes_4_0=ruleExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAssignementRule());
            	    						}
            	    						add(
            	    							current,
            	    							"operandes",
            	    							lv_operandes_4_0,
            	    							"sar.drone.Drn.Expression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_5=(Token)match(input,16,FOLLOW_16); 

            	    				newLeafNode(otherlv_5, grammarAccess.getAssignementAccess().getSemicolonKeyword_4_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            otherlv_6=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getAssignementAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleAssignement"


    // $ANTLR start "entryRuleExpression"
    // InternalDrn.g:1143:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalDrn.g:1143:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalDrn.g:1144:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
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
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalDrn.g:1150:1: ruleExpression returns [EObject current=null] : ( ( ( (lv_move_0_0= ruleMovement ) ) (otherlv_1= 'X' ( (lv_repeatCST_2_0= RULE_INT ) ) )? ( (lv_with_3_0= ruleWith ) )? ) | (otherlv_4= '(' ( (lv_move_5_0= ruleMovement ) ) (otherlv_6= 'then' ( (lv_then_7_0= ruleExpression ) ) ) (otherlv_8= 'then' ( (lv_then_9_0= ruleExpression ) ) )* otherlv_10= ')' (otherlv_11= 'X' ( (lv_repeatCST_12_0= RULE_INT ) ) )? ( (lv_with_13_0= ruleWith ) )? ) ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_repeatCST_2_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token lv_repeatCST_12_0=null;
        EObject lv_move_0_0 = null;

        EObject lv_with_3_0 = null;

        EObject lv_move_5_0 = null;

        EObject lv_then_7_0 = null;

        EObject lv_then_9_0 = null;

        EObject lv_with_13_0 = null;



        	enterRule();

        try {
            // InternalDrn.g:1156:2: ( ( ( ( (lv_move_0_0= ruleMovement ) ) (otherlv_1= 'X' ( (lv_repeatCST_2_0= RULE_INT ) ) )? ( (lv_with_3_0= ruleWith ) )? ) | (otherlv_4= '(' ( (lv_move_5_0= ruleMovement ) ) (otherlv_6= 'then' ( (lv_then_7_0= ruleExpression ) ) ) (otherlv_8= 'then' ( (lv_then_9_0= ruleExpression ) ) )* otherlv_10= ')' (otherlv_11= 'X' ( (lv_repeatCST_12_0= RULE_INT ) ) )? ( (lv_with_13_0= ruleWith ) )? ) ) )
            // InternalDrn.g:1157:2: ( ( ( (lv_move_0_0= ruleMovement ) ) (otherlv_1= 'X' ( (lv_repeatCST_2_0= RULE_INT ) ) )? ( (lv_with_3_0= ruleWith ) )? ) | (otherlv_4= '(' ( (lv_move_5_0= ruleMovement ) ) (otherlv_6= 'then' ( (lv_then_7_0= ruleExpression ) ) ) (otherlv_8= 'then' ( (lv_then_9_0= ruleExpression ) ) )* otherlv_10= ')' (otherlv_11= 'X' ( (lv_repeatCST_12_0= RULE_INT ) ) )? ( (lv_with_13_0= ruleWith ) )? ) )
            {
            // InternalDrn.g:1157:2: ( ( ( (lv_move_0_0= ruleMovement ) ) (otherlv_1= 'X' ( (lv_repeatCST_2_0= RULE_INT ) ) )? ( (lv_with_3_0= ruleWith ) )? ) | (otherlv_4= '(' ( (lv_move_5_0= ruleMovement ) ) (otherlv_6= 'then' ( (lv_then_7_0= ruleExpression ) ) ) (otherlv_8= 'then' ( (lv_then_9_0= ruleExpression ) ) )* otherlv_10= ')' (otherlv_11= 'X' ( (lv_repeatCST_12_0= RULE_INT ) ) )? ( (lv_with_13_0= ruleWith ) )? ) )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_ID||LA22_0==32||LA22_0==34||(LA22_0>=37 && LA22_0<=42)||LA22_0==44||(LA22_0>=46 && LA22_0<=51)||(LA22_0>=53 && LA22_0<=55)) ) {
                alt22=1;
            }
            else if ( (LA22_0==28) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // InternalDrn.g:1158:3: ( ( (lv_move_0_0= ruleMovement ) ) (otherlv_1= 'X' ( (lv_repeatCST_2_0= RULE_INT ) ) )? ( (lv_with_3_0= ruleWith ) )? )
                    {
                    // InternalDrn.g:1158:3: ( ( (lv_move_0_0= ruleMovement ) ) (otherlv_1= 'X' ( (lv_repeatCST_2_0= RULE_INT ) ) )? ( (lv_with_3_0= ruleWith ) )? )
                    // InternalDrn.g:1159:4: ( (lv_move_0_0= ruleMovement ) ) (otherlv_1= 'X' ( (lv_repeatCST_2_0= RULE_INT ) ) )? ( (lv_with_3_0= ruleWith ) )?
                    {
                    // InternalDrn.g:1159:4: ( (lv_move_0_0= ruleMovement ) )
                    // InternalDrn.g:1160:5: (lv_move_0_0= ruleMovement )
                    {
                    // InternalDrn.g:1160:5: (lv_move_0_0= ruleMovement )
                    // InternalDrn.g:1161:6: lv_move_0_0= ruleMovement
                    {

                    						newCompositeNode(grammarAccess.getExpressionAccess().getMoveMovementParserRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_17);
                    lv_move_0_0=ruleMovement();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExpressionRule());
                    						}
                    						set(
                    							current,
                    							"move",
                    							lv_move_0_0,
                    							"sar.drone.Drn.Movement");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDrn.g:1178:4: (otherlv_1= 'X' ( (lv_repeatCST_2_0= RULE_INT ) ) )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==27) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // InternalDrn.g:1179:5: otherlv_1= 'X' ( (lv_repeatCST_2_0= RULE_INT ) )
                            {
                            otherlv_1=(Token)match(input,27,FOLLOW_14); 

                            					newLeafNode(otherlv_1, grammarAccess.getExpressionAccess().getXKeyword_0_1_0());
                            				
                            // InternalDrn.g:1183:5: ( (lv_repeatCST_2_0= RULE_INT ) )
                            // InternalDrn.g:1184:6: (lv_repeatCST_2_0= RULE_INT )
                            {
                            // InternalDrn.g:1184:6: (lv_repeatCST_2_0= RULE_INT )
                            // InternalDrn.g:1185:7: lv_repeatCST_2_0= RULE_INT
                            {
                            lv_repeatCST_2_0=(Token)match(input,RULE_INT,FOLLOW_18); 

                            							newLeafNode(lv_repeatCST_2_0, grammarAccess.getExpressionAccess().getRepeatCSTINTTerminalRuleCall_0_1_1_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getExpressionRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"repeatCST",
                            								lv_repeatCST_2_0,
                            								"org.eclipse.xtext.common.Terminals.INT");
                            						

                            }


                            }


                            }
                            break;

                    }

                    // InternalDrn.g:1202:4: ( (lv_with_3_0= ruleWith ) )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==58) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // InternalDrn.g:1203:5: (lv_with_3_0= ruleWith )
                            {
                            // InternalDrn.g:1203:5: (lv_with_3_0= ruleWith )
                            // InternalDrn.g:1204:6: lv_with_3_0= ruleWith
                            {

                            						newCompositeNode(grammarAccess.getExpressionAccess().getWithWithParserRuleCall_0_2_0());
                            					
                            pushFollow(FOLLOW_2);
                            lv_with_3_0=ruleWith();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getExpressionRule());
                            						}
                            						add(
                            							current,
                            							"with",
                            							lv_with_3_0,
                            							"sar.drone.Drn.With");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDrn.g:1223:3: (otherlv_4= '(' ( (lv_move_5_0= ruleMovement ) ) (otherlv_6= 'then' ( (lv_then_7_0= ruleExpression ) ) ) (otherlv_8= 'then' ( (lv_then_9_0= ruleExpression ) ) )* otherlv_10= ')' (otherlv_11= 'X' ( (lv_repeatCST_12_0= RULE_INT ) ) )? ( (lv_with_13_0= ruleWith ) )? )
                    {
                    // InternalDrn.g:1223:3: (otherlv_4= '(' ( (lv_move_5_0= ruleMovement ) ) (otherlv_6= 'then' ( (lv_then_7_0= ruleExpression ) ) ) (otherlv_8= 'then' ( (lv_then_9_0= ruleExpression ) ) )* otherlv_10= ')' (otherlv_11= 'X' ( (lv_repeatCST_12_0= RULE_INT ) ) )? ( (lv_with_13_0= ruleWith ) )? )
                    // InternalDrn.g:1224:4: otherlv_4= '(' ( (lv_move_5_0= ruleMovement ) ) (otherlv_6= 'then' ( (lv_then_7_0= ruleExpression ) ) ) (otherlv_8= 'then' ( (lv_then_9_0= ruleExpression ) ) )* otherlv_10= ')' (otherlv_11= 'X' ( (lv_repeatCST_12_0= RULE_INT ) ) )? ( (lv_with_13_0= ruleWith ) )?
                    {
                    otherlv_4=(Token)match(input,28,FOLLOW_19); 

                    				newLeafNode(otherlv_4, grammarAccess.getExpressionAccess().getLeftParenthesisKeyword_1_0());
                    			
                    // InternalDrn.g:1228:4: ( (lv_move_5_0= ruleMovement ) )
                    // InternalDrn.g:1229:5: (lv_move_5_0= ruleMovement )
                    {
                    // InternalDrn.g:1229:5: (lv_move_5_0= ruleMovement )
                    // InternalDrn.g:1230:6: lv_move_5_0= ruleMovement
                    {

                    						newCompositeNode(grammarAccess.getExpressionAccess().getMoveMovementParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_20);
                    lv_move_5_0=ruleMovement();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExpressionRule());
                    						}
                    						set(
                    							current,
                    							"move",
                    							lv_move_5_0,
                    							"sar.drone.Drn.Movement");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDrn.g:1247:4: (otherlv_6= 'then' ( (lv_then_7_0= ruleExpression ) ) )
                    // InternalDrn.g:1248:5: otherlv_6= 'then' ( (lv_then_7_0= ruleExpression ) )
                    {
                    otherlv_6=(Token)match(input,29,FOLLOW_15); 

                    					newLeafNode(otherlv_6, grammarAccess.getExpressionAccess().getThenKeyword_1_2_0());
                    				
                    // InternalDrn.g:1252:5: ( (lv_then_7_0= ruleExpression ) )
                    // InternalDrn.g:1253:6: (lv_then_7_0= ruleExpression )
                    {
                    // InternalDrn.g:1253:6: (lv_then_7_0= ruleExpression )
                    // InternalDrn.g:1254:7: lv_then_7_0= ruleExpression
                    {

                    							newCompositeNode(grammarAccess.getExpressionAccess().getThenExpressionParserRuleCall_1_2_1_0());
                    						
                    pushFollow(FOLLOW_21);
                    lv_then_7_0=ruleExpression();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getExpressionRule());
                    							}
                    							add(
                    								current,
                    								"then",
                    								lv_then_7_0,
                    								"sar.drone.Drn.Expression");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }

                    // InternalDrn.g:1272:4: (otherlv_8= 'then' ( (lv_then_9_0= ruleExpression ) ) )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==29) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // InternalDrn.g:1273:5: otherlv_8= 'then' ( (lv_then_9_0= ruleExpression ) )
                    	    {
                    	    otherlv_8=(Token)match(input,29,FOLLOW_15); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getExpressionAccess().getThenKeyword_1_3_0());
                    	    				
                    	    // InternalDrn.g:1277:5: ( (lv_then_9_0= ruleExpression ) )
                    	    // InternalDrn.g:1278:6: (lv_then_9_0= ruleExpression )
                    	    {
                    	    // InternalDrn.g:1278:6: (lv_then_9_0= ruleExpression )
                    	    // InternalDrn.g:1279:7: lv_then_9_0= ruleExpression
                    	    {

                    	    							newCompositeNode(grammarAccess.getExpressionAccess().getThenExpressionParserRuleCall_1_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_21);
                    	    lv_then_9_0=ruleExpression();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getExpressionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"then",
                    	    								lv_then_9_0,
                    	    								"sar.drone.Drn.Expression");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,30,FOLLOW_17); 

                    				newLeafNode(otherlv_10, grammarAccess.getExpressionAccess().getRightParenthesisKeyword_1_4());
                    			
                    // InternalDrn.g:1301:4: (otherlv_11= 'X' ( (lv_repeatCST_12_0= RULE_INT ) ) )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==27) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // InternalDrn.g:1302:5: otherlv_11= 'X' ( (lv_repeatCST_12_0= RULE_INT ) )
                            {
                            otherlv_11=(Token)match(input,27,FOLLOW_14); 

                            					newLeafNode(otherlv_11, grammarAccess.getExpressionAccess().getXKeyword_1_5_0());
                            				
                            // InternalDrn.g:1306:5: ( (lv_repeatCST_12_0= RULE_INT ) )
                            // InternalDrn.g:1307:6: (lv_repeatCST_12_0= RULE_INT )
                            {
                            // InternalDrn.g:1307:6: (lv_repeatCST_12_0= RULE_INT )
                            // InternalDrn.g:1308:7: lv_repeatCST_12_0= RULE_INT
                            {
                            lv_repeatCST_12_0=(Token)match(input,RULE_INT,FOLLOW_18); 

                            							newLeafNode(lv_repeatCST_12_0, grammarAccess.getExpressionAccess().getRepeatCSTINTTerminalRuleCall_1_5_1_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getExpressionRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"repeatCST",
                            								lv_repeatCST_12_0,
                            								"org.eclipse.xtext.common.Terminals.INT");
                            						

                            }


                            }


                            }
                            break;

                    }

                    // InternalDrn.g:1325:4: ( (lv_with_13_0= ruleWith ) )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==58) ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // InternalDrn.g:1326:5: (lv_with_13_0= ruleWith )
                            {
                            // InternalDrn.g:1326:5: (lv_with_13_0= ruleWith )
                            // InternalDrn.g:1327:6: lv_with_13_0= ruleWith
                            {

                            						newCompositeNode(grammarAccess.getExpressionAccess().getWithWithParserRuleCall_1_6_0());
                            					
                            pushFollow(FOLLOW_2);
                            lv_with_13_0=ruleWith();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getExpressionRule());
                            						}
                            						add(
                            							current,
                            							"with",
                            							lv_with_13_0,
                            							"sar.drone.Drn.With");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }


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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleMovement"
    // InternalDrn.g:1349:1: entryRuleMovement returns [EObject current=null] : iv_ruleMovement= ruleMovement EOF ;
    public final EObject entryRuleMovement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMovement = null;


        try {
            // InternalDrn.g:1349:49: (iv_ruleMovement= ruleMovement EOF )
            // InternalDrn.g:1350:2: iv_ruleMovement= ruleMovement EOF
            {
             newCompositeNode(grammarAccess.getMovementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMovement=ruleMovement();

            state._fsp--;

             current =iv_ruleMovement; 
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
    // $ANTLR end "entryRuleMovement"


    // $ANTLR start "ruleMovement"
    // InternalDrn.g:1356:1: ruleMovement returns [EObject current=null] : (this_And_0= ruleAnd | this_RefPart_1= ruleRefPart | this_RefPartLib_2= ruleRefPartLib | this_DepX_Impl_3= ruleDepX_Impl | this_DepY_Impl_4= ruleDepY_Impl | this_DepZ_Impl_5= ruleDepZ_Impl | this_DepXY_IMPL_6= ruleDepXY_IMPL | this_DepXZ_IMPL_7= ruleDepXZ_IMPL | this_DepYZ_IMPL_8= ruleDepYZ_IMPL | this_DepXYZ_IMPL_9= ruleDepXYZ_IMPL | this_TakeOff_10= ruleTakeOff | this_Wait_11= ruleWait | this_Rotate_12= ruleRotate | this_Land_13= ruleLand ) ;
    public final EObject ruleMovement() throws RecognitionException {
        EObject current = null;

        EObject this_And_0 = null;

        EObject this_RefPart_1 = null;

        EObject this_RefPartLib_2 = null;

        EObject this_DepX_Impl_3 = null;

        EObject this_DepY_Impl_4 = null;

        EObject this_DepZ_Impl_5 = null;

        EObject this_DepXY_IMPL_6 = null;

        EObject this_DepXZ_IMPL_7 = null;

        EObject this_DepYZ_IMPL_8 = null;

        EObject this_DepXYZ_IMPL_9 = null;

        EObject this_TakeOff_10 = null;

        EObject this_Wait_11 = null;

        EObject this_Rotate_12 = null;

        EObject this_Land_13 = null;



        	enterRule();

        try {
            // InternalDrn.g:1362:2: ( (this_And_0= ruleAnd | this_RefPart_1= ruleRefPart | this_RefPartLib_2= ruleRefPartLib | this_DepX_Impl_3= ruleDepX_Impl | this_DepY_Impl_4= ruleDepY_Impl | this_DepZ_Impl_5= ruleDepZ_Impl | this_DepXY_IMPL_6= ruleDepXY_IMPL | this_DepXZ_IMPL_7= ruleDepXZ_IMPL | this_DepYZ_IMPL_8= ruleDepYZ_IMPL | this_DepXYZ_IMPL_9= ruleDepXYZ_IMPL | this_TakeOff_10= ruleTakeOff | this_Wait_11= ruleWait | this_Rotate_12= ruleRotate | this_Land_13= ruleLand ) )
            // InternalDrn.g:1363:2: (this_And_0= ruleAnd | this_RefPart_1= ruleRefPart | this_RefPartLib_2= ruleRefPartLib | this_DepX_Impl_3= ruleDepX_Impl | this_DepY_Impl_4= ruleDepY_Impl | this_DepZ_Impl_5= ruleDepZ_Impl | this_DepXY_IMPL_6= ruleDepXY_IMPL | this_DepXZ_IMPL_7= ruleDepXZ_IMPL | this_DepYZ_IMPL_8= ruleDepYZ_IMPL | this_DepXYZ_IMPL_9= ruleDepXYZ_IMPL | this_TakeOff_10= ruleTakeOff | this_Wait_11= ruleWait | this_Rotate_12= ruleRotate | this_Land_13= ruleLand )
            {
            // InternalDrn.g:1363:2: (this_And_0= ruleAnd | this_RefPart_1= ruleRefPart | this_RefPartLib_2= ruleRefPartLib | this_DepX_Impl_3= ruleDepX_Impl | this_DepY_Impl_4= ruleDepY_Impl | this_DepZ_Impl_5= ruleDepZ_Impl | this_DepXY_IMPL_6= ruleDepXY_IMPL | this_DepXZ_IMPL_7= ruleDepXZ_IMPL | this_DepYZ_IMPL_8= ruleDepYZ_IMPL | this_DepXYZ_IMPL_9= ruleDepXYZ_IMPL | this_TakeOff_10= ruleTakeOff | this_Wait_11= ruleWait | this_Rotate_12= ruleRotate | this_Land_13= ruleLand )
            int alt23=14;
            alt23 = dfa23.predict(input);
            switch (alt23) {
                case 1 :
                    // InternalDrn.g:1364:3: this_And_0= ruleAnd
                    {

                    			newCompositeNode(grammarAccess.getMovementAccess().getAndParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_And_0=ruleAnd();

                    state._fsp--;


                    			current = this_And_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDrn.g:1373:3: this_RefPart_1= ruleRefPart
                    {

                    			newCompositeNode(grammarAccess.getMovementAccess().getRefPartParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_RefPart_1=ruleRefPart();

                    state._fsp--;


                    			current = this_RefPart_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalDrn.g:1382:3: this_RefPartLib_2= ruleRefPartLib
                    {

                    			newCompositeNode(grammarAccess.getMovementAccess().getRefPartLibParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_RefPartLib_2=ruleRefPartLib();

                    state._fsp--;


                    			current = this_RefPartLib_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalDrn.g:1391:3: this_DepX_Impl_3= ruleDepX_Impl
                    {

                    			newCompositeNode(grammarAccess.getMovementAccess().getDepX_ImplParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_DepX_Impl_3=ruleDepX_Impl();

                    state._fsp--;


                    			current = this_DepX_Impl_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalDrn.g:1400:3: this_DepY_Impl_4= ruleDepY_Impl
                    {

                    			newCompositeNode(grammarAccess.getMovementAccess().getDepY_ImplParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_DepY_Impl_4=ruleDepY_Impl();

                    state._fsp--;


                    			current = this_DepY_Impl_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalDrn.g:1409:3: this_DepZ_Impl_5= ruleDepZ_Impl
                    {

                    			newCompositeNode(grammarAccess.getMovementAccess().getDepZ_ImplParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_DepZ_Impl_5=ruleDepZ_Impl();

                    state._fsp--;


                    			current = this_DepZ_Impl_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalDrn.g:1418:3: this_DepXY_IMPL_6= ruleDepXY_IMPL
                    {

                    			newCompositeNode(grammarAccess.getMovementAccess().getDepXY_IMPLParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_DepXY_IMPL_6=ruleDepXY_IMPL();

                    state._fsp--;


                    			current = this_DepXY_IMPL_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalDrn.g:1427:3: this_DepXZ_IMPL_7= ruleDepXZ_IMPL
                    {

                    			newCompositeNode(grammarAccess.getMovementAccess().getDepXZ_IMPLParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_DepXZ_IMPL_7=ruleDepXZ_IMPL();

                    state._fsp--;


                    			current = this_DepXZ_IMPL_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalDrn.g:1436:3: this_DepYZ_IMPL_8= ruleDepYZ_IMPL
                    {

                    			newCompositeNode(grammarAccess.getMovementAccess().getDepYZ_IMPLParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_DepYZ_IMPL_8=ruleDepYZ_IMPL();

                    state._fsp--;


                    			current = this_DepYZ_IMPL_8;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 10 :
                    // InternalDrn.g:1445:3: this_DepXYZ_IMPL_9= ruleDepXYZ_IMPL
                    {

                    			newCompositeNode(grammarAccess.getMovementAccess().getDepXYZ_IMPLParserRuleCall_9());
                    		
                    pushFollow(FOLLOW_2);
                    this_DepXYZ_IMPL_9=ruleDepXYZ_IMPL();

                    state._fsp--;


                    			current = this_DepXYZ_IMPL_9;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 11 :
                    // InternalDrn.g:1454:3: this_TakeOff_10= ruleTakeOff
                    {

                    			newCompositeNode(grammarAccess.getMovementAccess().getTakeOffParserRuleCall_10());
                    		
                    pushFollow(FOLLOW_2);
                    this_TakeOff_10=ruleTakeOff();

                    state._fsp--;


                    			current = this_TakeOff_10;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 12 :
                    // InternalDrn.g:1463:3: this_Wait_11= ruleWait
                    {

                    			newCompositeNode(grammarAccess.getMovementAccess().getWaitParserRuleCall_11());
                    		
                    pushFollow(FOLLOW_2);
                    this_Wait_11=ruleWait();

                    state._fsp--;


                    			current = this_Wait_11;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 13 :
                    // InternalDrn.g:1472:3: this_Rotate_12= ruleRotate
                    {

                    			newCompositeNode(grammarAccess.getMovementAccess().getRotateParserRuleCall_12());
                    		
                    pushFollow(FOLLOW_2);
                    this_Rotate_12=ruleRotate();

                    state._fsp--;


                    			current = this_Rotate_12;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 14 :
                    // InternalDrn.g:1481:3: this_Land_13= ruleLand
                    {

                    			newCompositeNode(grammarAccess.getMovementAccess().getLandParserRuleCall_13());
                    		
                    pushFollow(FOLLOW_2);
                    this_Land_13=ruleLand();

                    state._fsp--;


                    			current = this_Land_13;
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
    // $ANTLR end "ruleMovement"


    // $ANTLR start "entryRuleRefPart"
    // InternalDrn.g:1493:1: entryRuleRefPart returns [EObject current=null] : iv_ruleRefPart= ruleRefPart EOF ;
    public final EObject entryRuleRefPart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRefPart = null;


        try {
            // InternalDrn.g:1493:48: (iv_ruleRefPart= ruleRefPart EOF )
            // InternalDrn.g:1494:2: iv_ruleRefPart= ruleRefPart EOF
            {
             newCompositeNode(grammarAccess.getRefPartRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRefPart=ruleRefPart();

            state._fsp--;

             current =iv_ruleRefPart; 
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
    // $ANTLR end "entryRuleRefPart"


    // $ANTLR start "ruleRefPart"
    // InternalDrn.g:1500:1: ruleRefPart returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleRefPart() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalDrn.g:1506:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalDrn.g:1507:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalDrn.g:1507:2: ( (otherlv_0= RULE_ID ) )
            // InternalDrn.g:1508:3: (otherlv_0= RULE_ID )
            {
            // InternalDrn.g:1508:3: (otherlv_0= RULE_ID )
            // InternalDrn.g:1509:4: otherlv_0= RULE_ID
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getRefPartRule());
            				}
            			
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(otherlv_0, grammarAccess.getRefPartAccess().getVariable_partieAssignementCrossReference_0());
            			

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
    // $ANTLR end "ruleRefPart"


    // $ANTLR start "entryRuleRefPartLib"
    // InternalDrn.g:1523:1: entryRuleRefPartLib returns [EObject current=null] : iv_ruleRefPartLib= ruleRefPartLib EOF ;
    public final EObject entryRuleRefPartLib() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRefPartLib = null;


        try {
            // InternalDrn.g:1523:51: (iv_ruleRefPartLib= ruleRefPartLib EOF )
            // InternalDrn.g:1524:2: iv_ruleRefPartLib= ruleRefPartLib EOF
            {
             newCompositeNode(grammarAccess.getRefPartLibRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRefPartLib=ruleRefPartLib();

            state._fsp--;

             current =iv_ruleRefPartLib; 
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
    // $ANTLR end "entryRuleRefPartLib"


    // $ANTLR start "ruleRefPartLib"
    // InternalDrn.g:1530:1: ruleRefPartLib returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleRefPartLib() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalDrn.g:1536:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) ) )
            // InternalDrn.g:1537:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) )
            {
            // InternalDrn.g:1537:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) )
            // InternalDrn.g:1538:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) )
            {
            // InternalDrn.g:1538:3: ( (otherlv_0= RULE_ID ) )
            // InternalDrn.g:1539:4: (otherlv_0= RULE_ID )
            {
            // InternalDrn.g:1539:4: (otherlv_0= RULE_ID )
            // InternalDrn.g:1540:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRefPartLibRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_22); 

            					newLeafNode(otherlv_0, grammarAccess.getRefPartLibAccess().getLibsLibraryCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,31,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getRefPartLibAccess().getFullStopKeyword_1());
            		
            // InternalDrn.g:1555:3: ( (otherlv_2= RULE_ID ) )
            // InternalDrn.g:1556:4: (otherlv_2= RULE_ID )
            {
            // InternalDrn.g:1556:4: (otherlv_2= RULE_ID )
            // InternalDrn.g:1557:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRefPartLibRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_2, grammarAccess.getRefPartLibAccess().getAssignementsAssignementCrossReference_2_0());
            				

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
    // $ANTLR end "ruleRefPartLib"


    // $ANTLR start "entryRuleAnd"
    // InternalDrn.g:1572:1: entryRuleAnd returns [EObject current=null] : iv_ruleAnd= ruleAnd EOF ;
    public final EObject entryRuleAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnd = null;


        try {
            // InternalDrn.g:1572:44: (iv_ruleAnd= ruleAnd EOF )
            // InternalDrn.g:1573:2: iv_ruleAnd= ruleAnd EOF
            {
             newCompositeNode(grammarAccess.getAndRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAnd=ruleAnd();

            state._fsp--;

             current =iv_ruleAnd; 
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
    // $ANTLR end "entryRuleAnd"


    // $ANTLR start "ruleAnd"
    // InternalDrn.g:1579:1: ruleAnd returns [EObject current=null] : ( () ( (lv_name_1_0= 'merge' ) ) otherlv_2= '(' ( ( (lv_rotate_3_0= ruleRotate ) ) | ( (lv_depx_4_0= ruleDepX_Impl ) ) | ( (lv_depy_5_0= ruleDepY_Impl ) ) | ( (lv_depz_6_0= ruleDepZ_Impl ) ) | ( (lv_depxz_7_0= ruleDepXZ_IMPL ) ) | ( (lv_depxy_8_0= ruleDepXY_IMPL ) ) | ( (lv_depyz_9_0= ruleDepYZ_IMPL ) ) ) otherlv_10= ',' ( ( (lv_rotate_11_0= ruleRotate ) ) | ( (lv_depx_12_0= ruleDepX_Impl ) ) | ( (lv_depy_13_0= ruleDepY_Impl ) ) | ( (lv_depz_14_0= ruleDepZ_Impl ) ) | ( (lv_depxz_15_0= ruleDepXZ_IMPL ) ) | ( (lv_depxy_16_0= ruleDepXY_IMPL ) ) | ( (lv_depyz_17_0= ruleDepYZ_IMPL ) ) ) (otherlv_18= ',' ( ( (lv_rotate_19_0= ruleRotate ) ) | ( (lv_depx_20_0= ruleDepX_Impl ) ) | ( (lv_depy_21_0= ruleDepY_Impl ) ) | ( (lv_depz_22_0= ruleDepZ_Impl ) ) | ( (lv_depxz_23_0= ruleDepXZ_IMPL ) ) | ( (lv_depxy_24_0= ruleDepXY_IMPL ) ) | ( (lv_depyz_25_0= ruleDepYZ_IMPL ) ) ) )* otherlv_26= ')' ) ;
    public final EObject ruleAnd() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_10=null;
        Token otherlv_18=null;
        Token otherlv_26=null;
        EObject lv_rotate_3_0 = null;

        EObject lv_depx_4_0 = null;

        EObject lv_depy_5_0 = null;

        EObject lv_depz_6_0 = null;

        EObject lv_depxz_7_0 = null;

        EObject lv_depxy_8_0 = null;

        EObject lv_depyz_9_0 = null;

        EObject lv_rotate_11_0 = null;

        EObject lv_depx_12_0 = null;

        EObject lv_depy_13_0 = null;

        EObject lv_depz_14_0 = null;

        EObject lv_depxz_15_0 = null;

        EObject lv_depxy_16_0 = null;

        EObject lv_depyz_17_0 = null;

        EObject lv_rotate_19_0 = null;

        EObject lv_depx_20_0 = null;

        EObject lv_depy_21_0 = null;

        EObject lv_depz_22_0 = null;

        EObject lv_depxz_23_0 = null;

        EObject lv_depxy_24_0 = null;

        EObject lv_depyz_25_0 = null;



        	enterRule();

        try {
            // InternalDrn.g:1585:2: ( ( () ( (lv_name_1_0= 'merge' ) ) otherlv_2= '(' ( ( (lv_rotate_3_0= ruleRotate ) ) | ( (lv_depx_4_0= ruleDepX_Impl ) ) | ( (lv_depy_5_0= ruleDepY_Impl ) ) | ( (lv_depz_6_0= ruleDepZ_Impl ) ) | ( (lv_depxz_7_0= ruleDepXZ_IMPL ) ) | ( (lv_depxy_8_0= ruleDepXY_IMPL ) ) | ( (lv_depyz_9_0= ruleDepYZ_IMPL ) ) ) otherlv_10= ',' ( ( (lv_rotate_11_0= ruleRotate ) ) | ( (lv_depx_12_0= ruleDepX_Impl ) ) | ( (lv_depy_13_0= ruleDepY_Impl ) ) | ( (lv_depz_14_0= ruleDepZ_Impl ) ) | ( (lv_depxz_15_0= ruleDepXZ_IMPL ) ) | ( (lv_depxy_16_0= ruleDepXY_IMPL ) ) | ( (lv_depyz_17_0= ruleDepYZ_IMPL ) ) ) (otherlv_18= ',' ( ( (lv_rotate_19_0= ruleRotate ) ) | ( (lv_depx_20_0= ruleDepX_Impl ) ) | ( (lv_depy_21_0= ruleDepY_Impl ) ) | ( (lv_depz_22_0= ruleDepZ_Impl ) ) | ( (lv_depxz_23_0= ruleDepXZ_IMPL ) ) | ( (lv_depxy_24_0= ruleDepXY_IMPL ) ) | ( (lv_depyz_25_0= ruleDepYZ_IMPL ) ) ) )* otherlv_26= ')' ) )
            // InternalDrn.g:1586:2: ( () ( (lv_name_1_0= 'merge' ) ) otherlv_2= '(' ( ( (lv_rotate_3_0= ruleRotate ) ) | ( (lv_depx_4_0= ruleDepX_Impl ) ) | ( (lv_depy_5_0= ruleDepY_Impl ) ) | ( (lv_depz_6_0= ruleDepZ_Impl ) ) | ( (lv_depxz_7_0= ruleDepXZ_IMPL ) ) | ( (lv_depxy_8_0= ruleDepXY_IMPL ) ) | ( (lv_depyz_9_0= ruleDepYZ_IMPL ) ) ) otherlv_10= ',' ( ( (lv_rotate_11_0= ruleRotate ) ) | ( (lv_depx_12_0= ruleDepX_Impl ) ) | ( (lv_depy_13_0= ruleDepY_Impl ) ) | ( (lv_depz_14_0= ruleDepZ_Impl ) ) | ( (lv_depxz_15_0= ruleDepXZ_IMPL ) ) | ( (lv_depxy_16_0= ruleDepXY_IMPL ) ) | ( (lv_depyz_17_0= ruleDepYZ_IMPL ) ) ) (otherlv_18= ',' ( ( (lv_rotate_19_0= ruleRotate ) ) | ( (lv_depx_20_0= ruleDepX_Impl ) ) | ( (lv_depy_21_0= ruleDepY_Impl ) ) | ( (lv_depz_22_0= ruleDepZ_Impl ) ) | ( (lv_depxz_23_0= ruleDepXZ_IMPL ) ) | ( (lv_depxy_24_0= ruleDepXY_IMPL ) ) | ( (lv_depyz_25_0= ruleDepYZ_IMPL ) ) ) )* otherlv_26= ')' )
            {
            // InternalDrn.g:1586:2: ( () ( (lv_name_1_0= 'merge' ) ) otherlv_2= '(' ( ( (lv_rotate_3_0= ruleRotate ) ) | ( (lv_depx_4_0= ruleDepX_Impl ) ) | ( (lv_depy_5_0= ruleDepY_Impl ) ) | ( (lv_depz_6_0= ruleDepZ_Impl ) ) | ( (lv_depxz_7_0= ruleDepXZ_IMPL ) ) | ( (lv_depxy_8_0= ruleDepXY_IMPL ) ) | ( (lv_depyz_9_0= ruleDepYZ_IMPL ) ) ) otherlv_10= ',' ( ( (lv_rotate_11_0= ruleRotate ) ) | ( (lv_depx_12_0= ruleDepX_Impl ) ) | ( (lv_depy_13_0= ruleDepY_Impl ) ) | ( (lv_depz_14_0= ruleDepZ_Impl ) ) | ( (lv_depxz_15_0= ruleDepXZ_IMPL ) ) | ( (lv_depxy_16_0= ruleDepXY_IMPL ) ) | ( (lv_depyz_17_0= ruleDepYZ_IMPL ) ) ) (otherlv_18= ',' ( ( (lv_rotate_19_0= ruleRotate ) ) | ( (lv_depx_20_0= ruleDepX_Impl ) ) | ( (lv_depy_21_0= ruleDepY_Impl ) ) | ( (lv_depz_22_0= ruleDepZ_Impl ) ) | ( (lv_depxz_23_0= ruleDepXZ_IMPL ) ) | ( (lv_depxy_24_0= ruleDepXY_IMPL ) ) | ( (lv_depyz_25_0= ruleDepYZ_IMPL ) ) ) )* otherlv_26= ')' )
            // InternalDrn.g:1587:3: () ( (lv_name_1_0= 'merge' ) ) otherlv_2= '(' ( ( (lv_rotate_3_0= ruleRotate ) ) | ( (lv_depx_4_0= ruleDepX_Impl ) ) | ( (lv_depy_5_0= ruleDepY_Impl ) ) | ( (lv_depz_6_0= ruleDepZ_Impl ) ) | ( (lv_depxz_7_0= ruleDepXZ_IMPL ) ) | ( (lv_depxy_8_0= ruleDepXY_IMPL ) ) | ( (lv_depyz_9_0= ruleDepYZ_IMPL ) ) ) otherlv_10= ',' ( ( (lv_rotate_11_0= ruleRotate ) ) | ( (lv_depx_12_0= ruleDepX_Impl ) ) | ( (lv_depy_13_0= ruleDepY_Impl ) ) | ( (lv_depz_14_0= ruleDepZ_Impl ) ) | ( (lv_depxz_15_0= ruleDepXZ_IMPL ) ) | ( (lv_depxy_16_0= ruleDepXY_IMPL ) ) | ( (lv_depyz_17_0= ruleDepYZ_IMPL ) ) ) (otherlv_18= ',' ( ( (lv_rotate_19_0= ruleRotate ) ) | ( (lv_depx_20_0= ruleDepX_Impl ) ) | ( (lv_depy_21_0= ruleDepY_Impl ) ) | ( (lv_depz_22_0= ruleDepZ_Impl ) ) | ( (lv_depxz_23_0= ruleDepXZ_IMPL ) ) | ( (lv_depxy_24_0= ruleDepXY_IMPL ) ) | ( (lv_depyz_25_0= ruleDepYZ_IMPL ) ) ) )* otherlv_26= ')'
            {
            // InternalDrn.g:1587:3: ()
            // InternalDrn.g:1588:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAndAccess().getAndAction_0(),
            					current);
            			

            }

            // InternalDrn.g:1594:3: ( (lv_name_1_0= 'merge' ) )
            // InternalDrn.g:1595:4: (lv_name_1_0= 'merge' )
            {
            // InternalDrn.g:1595:4: (lv_name_1_0= 'merge' )
            // InternalDrn.g:1596:5: lv_name_1_0= 'merge'
            {
            lv_name_1_0=(Token)match(input,32,FOLLOW_23); 

            					newLeafNode(lv_name_1_0, grammarAccess.getAndAccess().getNameMergeKeyword_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAndRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_1_0, "merge");
            				

            }


            }

            otherlv_2=(Token)match(input,28,FOLLOW_24); 

            			newLeafNode(otherlv_2, grammarAccess.getAndAccess().getLeftParenthesisKeyword_2());
            		
            // InternalDrn.g:1612:3: ( ( (lv_rotate_3_0= ruleRotate ) ) | ( (lv_depx_4_0= ruleDepX_Impl ) ) | ( (lv_depy_5_0= ruleDepY_Impl ) ) | ( (lv_depz_6_0= ruleDepZ_Impl ) ) | ( (lv_depxz_7_0= ruleDepXZ_IMPL ) ) | ( (lv_depxy_8_0= ruleDepXY_IMPL ) ) | ( (lv_depyz_9_0= ruleDepYZ_IMPL ) ) )
            int alt24=7;
            switch ( input.LA(1) ) {
            case 51:
                {
                alt24=1;
                }
                break;
            case 38:
            case 39:
                {
                alt24=2;
                }
                break;
            case 34:
            case 37:
                {
                alt24=3;
                }
                break;
            case 40:
            case 41:
                {
                alt24=4;
                }
                break;
            case 48:
            case 49:
                {
                alt24=5;
                }
                break;
            case 42:
            case 44:
                {
                alt24=6;
                }
                break;
            case 46:
            case 47:
                {
                alt24=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // InternalDrn.g:1613:4: ( (lv_rotate_3_0= ruleRotate ) )
                    {
                    // InternalDrn.g:1613:4: ( (lv_rotate_3_0= ruleRotate ) )
                    // InternalDrn.g:1614:5: (lv_rotate_3_0= ruleRotate )
                    {
                    // InternalDrn.g:1614:5: (lv_rotate_3_0= ruleRotate )
                    // InternalDrn.g:1615:6: lv_rotate_3_0= ruleRotate
                    {

                    						newCompositeNode(grammarAccess.getAndAccess().getRotateRotateParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_25);
                    lv_rotate_3_0=ruleRotate();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAndRule());
                    						}
                    						add(
                    							current,
                    							"rotate",
                    							lv_rotate_3_0,
                    							"sar.drone.Drn.Rotate");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDrn.g:1633:4: ( (lv_depx_4_0= ruleDepX_Impl ) )
                    {
                    // InternalDrn.g:1633:4: ( (lv_depx_4_0= ruleDepX_Impl ) )
                    // InternalDrn.g:1634:5: (lv_depx_4_0= ruleDepX_Impl )
                    {
                    // InternalDrn.g:1634:5: (lv_depx_4_0= ruleDepX_Impl )
                    // InternalDrn.g:1635:6: lv_depx_4_0= ruleDepX_Impl
                    {

                    						newCompositeNode(grammarAccess.getAndAccess().getDepxDepX_ImplParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_25);
                    lv_depx_4_0=ruleDepX_Impl();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAndRule());
                    						}
                    						add(
                    							current,
                    							"depx",
                    							lv_depx_4_0,
                    							"sar.drone.Drn.DepX_Impl");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalDrn.g:1653:4: ( (lv_depy_5_0= ruleDepY_Impl ) )
                    {
                    // InternalDrn.g:1653:4: ( (lv_depy_5_0= ruleDepY_Impl ) )
                    // InternalDrn.g:1654:5: (lv_depy_5_0= ruleDepY_Impl )
                    {
                    // InternalDrn.g:1654:5: (lv_depy_5_0= ruleDepY_Impl )
                    // InternalDrn.g:1655:6: lv_depy_5_0= ruleDepY_Impl
                    {

                    						newCompositeNode(grammarAccess.getAndAccess().getDepyDepY_ImplParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_25);
                    lv_depy_5_0=ruleDepY_Impl();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAndRule());
                    						}
                    						add(
                    							current,
                    							"depy",
                    							lv_depy_5_0,
                    							"sar.drone.Drn.DepY_Impl");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalDrn.g:1673:4: ( (lv_depz_6_0= ruleDepZ_Impl ) )
                    {
                    // InternalDrn.g:1673:4: ( (lv_depz_6_0= ruleDepZ_Impl ) )
                    // InternalDrn.g:1674:5: (lv_depz_6_0= ruleDepZ_Impl )
                    {
                    // InternalDrn.g:1674:5: (lv_depz_6_0= ruleDepZ_Impl )
                    // InternalDrn.g:1675:6: lv_depz_6_0= ruleDepZ_Impl
                    {

                    						newCompositeNode(grammarAccess.getAndAccess().getDepzDepZ_ImplParserRuleCall_3_3_0());
                    					
                    pushFollow(FOLLOW_25);
                    lv_depz_6_0=ruleDepZ_Impl();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAndRule());
                    						}
                    						add(
                    							current,
                    							"depz",
                    							lv_depz_6_0,
                    							"sar.drone.Drn.DepZ_Impl");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalDrn.g:1693:4: ( (lv_depxz_7_0= ruleDepXZ_IMPL ) )
                    {
                    // InternalDrn.g:1693:4: ( (lv_depxz_7_0= ruleDepXZ_IMPL ) )
                    // InternalDrn.g:1694:5: (lv_depxz_7_0= ruleDepXZ_IMPL )
                    {
                    // InternalDrn.g:1694:5: (lv_depxz_7_0= ruleDepXZ_IMPL )
                    // InternalDrn.g:1695:6: lv_depxz_7_0= ruleDepXZ_IMPL
                    {

                    						newCompositeNode(grammarAccess.getAndAccess().getDepxzDepXZ_IMPLParserRuleCall_3_4_0());
                    					
                    pushFollow(FOLLOW_25);
                    lv_depxz_7_0=ruleDepXZ_IMPL();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAndRule());
                    						}
                    						add(
                    							current,
                    							"depxz",
                    							lv_depxz_7_0,
                    							"sar.drone.Drn.DepXZ_IMPL");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalDrn.g:1713:4: ( (lv_depxy_8_0= ruleDepXY_IMPL ) )
                    {
                    // InternalDrn.g:1713:4: ( (lv_depxy_8_0= ruleDepXY_IMPL ) )
                    // InternalDrn.g:1714:5: (lv_depxy_8_0= ruleDepXY_IMPL )
                    {
                    // InternalDrn.g:1714:5: (lv_depxy_8_0= ruleDepXY_IMPL )
                    // InternalDrn.g:1715:6: lv_depxy_8_0= ruleDepXY_IMPL
                    {

                    						newCompositeNode(grammarAccess.getAndAccess().getDepxyDepXY_IMPLParserRuleCall_3_5_0());
                    					
                    pushFollow(FOLLOW_25);
                    lv_depxy_8_0=ruleDepXY_IMPL();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAndRule());
                    						}
                    						add(
                    							current,
                    							"depxy",
                    							lv_depxy_8_0,
                    							"sar.drone.Drn.DepXY_IMPL");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 7 :
                    // InternalDrn.g:1733:4: ( (lv_depyz_9_0= ruleDepYZ_IMPL ) )
                    {
                    // InternalDrn.g:1733:4: ( (lv_depyz_9_0= ruleDepYZ_IMPL ) )
                    // InternalDrn.g:1734:5: (lv_depyz_9_0= ruleDepYZ_IMPL )
                    {
                    // InternalDrn.g:1734:5: (lv_depyz_9_0= ruleDepYZ_IMPL )
                    // InternalDrn.g:1735:6: lv_depyz_9_0= ruleDepYZ_IMPL
                    {

                    						newCompositeNode(grammarAccess.getAndAccess().getDepyzDepYZ_IMPLParserRuleCall_3_6_0());
                    					
                    pushFollow(FOLLOW_25);
                    lv_depyz_9_0=ruleDepYZ_IMPL();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAndRule());
                    						}
                    						add(
                    							current,
                    							"depyz",
                    							lv_depyz_9_0,
                    							"sar.drone.Drn.DepYZ_IMPL");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,33,FOLLOW_24); 

            			newLeafNode(otherlv_10, grammarAccess.getAndAccess().getCommaKeyword_4());
            		
            // InternalDrn.g:1757:3: ( ( (lv_rotate_11_0= ruleRotate ) ) | ( (lv_depx_12_0= ruleDepX_Impl ) ) | ( (lv_depy_13_0= ruleDepY_Impl ) ) | ( (lv_depz_14_0= ruleDepZ_Impl ) ) | ( (lv_depxz_15_0= ruleDepXZ_IMPL ) ) | ( (lv_depxy_16_0= ruleDepXY_IMPL ) ) | ( (lv_depyz_17_0= ruleDepYZ_IMPL ) ) )
            int alt25=7;
            switch ( input.LA(1) ) {
            case 51:
                {
                alt25=1;
                }
                break;
            case 38:
            case 39:
                {
                alt25=2;
                }
                break;
            case 34:
            case 37:
                {
                alt25=3;
                }
                break;
            case 40:
            case 41:
                {
                alt25=4;
                }
                break;
            case 48:
            case 49:
                {
                alt25=5;
                }
                break;
            case 42:
            case 44:
                {
                alt25=6;
                }
                break;
            case 46:
            case 47:
                {
                alt25=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // InternalDrn.g:1758:4: ( (lv_rotate_11_0= ruleRotate ) )
                    {
                    // InternalDrn.g:1758:4: ( (lv_rotate_11_0= ruleRotate ) )
                    // InternalDrn.g:1759:5: (lv_rotate_11_0= ruleRotate )
                    {
                    // InternalDrn.g:1759:5: (lv_rotate_11_0= ruleRotate )
                    // InternalDrn.g:1760:6: lv_rotate_11_0= ruleRotate
                    {

                    						newCompositeNode(grammarAccess.getAndAccess().getRotateRotateParserRuleCall_5_0_0());
                    					
                    pushFollow(FOLLOW_26);
                    lv_rotate_11_0=ruleRotate();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAndRule());
                    						}
                    						add(
                    							current,
                    							"rotate",
                    							lv_rotate_11_0,
                    							"sar.drone.Drn.Rotate");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDrn.g:1778:4: ( (lv_depx_12_0= ruleDepX_Impl ) )
                    {
                    // InternalDrn.g:1778:4: ( (lv_depx_12_0= ruleDepX_Impl ) )
                    // InternalDrn.g:1779:5: (lv_depx_12_0= ruleDepX_Impl )
                    {
                    // InternalDrn.g:1779:5: (lv_depx_12_0= ruleDepX_Impl )
                    // InternalDrn.g:1780:6: lv_depx_12_0= ruleDepX_Impl
                    {

                    						newCompositeNode(grammarAccess.getAndAccess().getDepxDepX_ImplParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_26);
                    lv_depx_12_0=ruleDepX_Impl();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAndRule());
                    						}
                    						add(
                    							current,
                    							"depx",
                    							lv_depx_12_0,
                    							"sar.drone.Drn.DepX_Impl");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalDrn.g:1798:4: ( (lv_depy_13_0= ruleDepY_Impl ) )
                    {
                    // InternalDrn.g:1798:4: ( (lv_depy_13_0= ruleDepY_Impl ) )
                    // InternalDrn.g:1799:5: (lv_depy_13_0= ruleDepY_Impl )
                    {
                    // InternalDrn.g:1799:5: (lv_depy_13_0= ruleDepY_Impl )
                    // InternalDrn.g:1800:6: lv_depy_13_0= ruleDepY_Impl
                    {

                    						newCompositeNode(grammarAccess.getAndAccess().getDepyDepY_ImplParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_26);
                    lv_depy_13_0=ruleDepY_Impl();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAndRule());
                    						}
                    						add(
                    							current,
                    							"depy",
                    							lv_depy_13_0,
                    							"sar.drone.Drn.DepY_Impl");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalDrn.g:1818:4: ( (lv_depz_14_0= ruleDepZ_Impl ) )
                    {
                    // InternalDrn.g:1818:4: ( (lv_depz_14_0= ruleDepZ_Impl ) )
                    // InternalDrn.g:1819:5: (lv_depz_14_0= ruleDepZ_Impl )
                    {
                    // InternalDrn.g:1819:5: (lv_depz_14_0= ruleDepZ_Impl )
                    // InternalDrn.g:1820:6: lv_depz_14_0= ruleDepZ_Impl
                    {

                    						newCompositeNode(grammarAccess.getAndAccess().getDepzDepZ_ImplParserRuleCall_5_3_0());
                    					
                    pushFollow(FOLLOW_26);
                    lv_depz_14_0=ruleDepZ_Impl();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAndRule());
                    						}
                    						add(
                    							current,
                    							"depz",
                    							lv_depz_14_0,
                    							"sar.drone.Drn.DepZ_Impl");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalDrn.g:1838:4: ( (lv_depxz_15_0= ruleDepXZ_IMPL ) )
                    {
                    // InternalDrn.g:1838:4: ( (lv_depxz_15_0= ruleDepXZ_IMPL ) )
                    // InternalDrn.g:1839:5: (lv_depxz_15_0= ruleDepXZ_IMPL )
                    {
                    // InternalDrn.g:1839:5: (lv_depxz_15_0= ruleDepXZ_IMPL )
                    // InternalDrn.g:1840:6: lv_depxz_15_0= ruleDepXZ_IMPL
                    {

                    						newCompositeNode(grammarAccess.getAndAccess().getDepxzDepXZ_IMPLParserRuleCall_5_4_0());
                    					
                    pushFollow(FOLLOW_26);
                    lv_depxz_15_0=ruleDepXZ_IMPL();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAndRule());
                    						}
                    						add(
                    							current,
                    							"depxz",
                    							lv_depxz_15_0,
                    							"sar.drone.Drn.DepXZ_IMPL");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalDrn.g:1858:4: ( (lv_depxy_16_0= ruleDepXY_IMPL ) )
                    {
                    // InternalDrn.g:1858:4: ( (lv_depxy_16_0= ruleDepXY_IMPL ) )
                    // InternalDrn.g:1859:5: (lv_depxy_16_0= ruleDepXY_IMPL )
                    {
                    // InternalDrn.g:1859:5: (lv_depxy_16_0= ruleDepXY_IMPL )
                    // InternalDrn.g:1860:6: lv_depxy_16_0= ruleDepXY_IMPL
                    {

                    						newCompositeNode(grammarAccess.getAndAccess().getDepxyDepXY_IMPLParserRuleCall_5_5_0());
                    					
                    pushFollow(FOLLOW_26);
                    lv_depxy_16_0=ruleDepXY_IMPL();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAndRule());
                    						}
                    						add(
                    							current,
                    							"depxy",
                    							lv_depxy_16_0,
                    							"sar.drone.Drn.DepXY_IMPL");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 7 :
                    // InternalDrn.g:1878:4: ( (lv_depyz_17_0= ruleDepYZ_IMPL ) )
                    {
                    // InternalDrn.g:1878:4: ( (lv_depyz_17_0= ruleDepYZ_IMPL ) )
                    // InternalDrn.g:1879:5: (lv_depyz_17_0= ruleDepYZ_IMPL )
                    {
                    // InternalDrn.g:1879:5: (lv_depyz_17_0= ruleDepYZ_IMPL )
                    // InternalDrn.g:1880:6: lv_depyz_17_0= ruleDepYZ_IMPL
                    {

                    						newCompositeNode(grammarAccess.getAndAccess().getDepyzDepYZ_IMPLParserRuleCall_5_6_0());
                    					
                    pushFollow(FOLLOW_26);
                    lv_depyz_17_0=ruleDepYZ_IMPL();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAndRule());
                    						}
                    						add(
                    							current,
                    							"depyz",
                    							lv_depyz_17_0,
                    							"sar.drone.Drn.DepYZ_IMPL");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDrn.g:1898:3: (otherlv_18= ',' ( ( (lv_rotate_19_0= ruleRotate ) ) | ( (lv_depx_20_0= ruleDepX_Impl ) ) | ( (lv_depy_21_0= ruleDepY_Impl ) ) | ( (lv_depz_22_0= ruleDepZ_Impl ) ) | ( (lv_depxz_23_0= ruleDepXZ_IMPL ) ) | ( (lv_depxy_24_0= ruleDepXY_IMPL ) ) | ( (lv_depyz_25_0= ruleDepYZ_IMPL ) ) ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==33) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalDrn.g:1899:4: otherlv_18= ',' ( ( (lv_rotate_19_0= ruleRotate ) ) | ( (lv_depx_20_0= ruleDepX_Impl ) ) | ( (lv_depy_21_0= ruleDepY_Impl ) ) | ( (lv_depz_22_0= ruleDepZ_Impl ) ) | ( (lv_depxz_23_0= ruleDepXZ_IMPL ) ) | ( (lv_depxy_24_0= ruleDepXY_IMPL ) ) | ( (lv_depyz_25_0= ruleDepYZ_IMPL ) ) )
            	    {
            	    otherlv_18=(Token)match(input,33,FOLLOW_24); 

            	    				newLeafNode(otherlv_18, grammarAccess.getAndAccess().getCommaKeyword_6_0());
            	    			
            	    // InternalDrn.g:1903:4: ( ( (lv_rotate_19_0= ruleRotate ) ) | ( (lv_depx_20_0= ruleDepX_Impl ) ) | ( (lv_depy_21_0= ruleDepY_Impl ) ) | ( (lv_depz_22_0= ruleDepZ_Impl ) ) | ( (lv_depxz_23_0= ruleDepXZ_IMPL ) ) | ( (lv_depxy_24_0= ruleDepXY_IMPL ) ) | ( (lv_depyz_25_0= ruleDepYZ_IMPL ) ) )
            	    int alt26=7;
            	    switch ( input.LA(1) ) {
            	    case 51:
            	        {
            	        alt26=1;
            	        }
            	        break;
            	    case 38:
            	    case 39:
            	        {
            	        alt26=2;
            	        }
            	        break;
            	    case 34:
            	    case 37:
            	        {
            	        alt26=3;
            	        }
            	        break;
            	    case 40:
            	    case 41:
            	        {
            	        alt26=4;
            	        }
            	        break;
            	    case 48:
            	    case 49:
            	        {
            	        alt26=5;
            	        }
            	        break;
            	    case 42:
            	    case 44:
            	        {
            	        alt26=6;
            	        }
            	        break;
            	    case 46:
            	    case 47:
            	        {
            	        alt26=7;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 26, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt26) {
            	        case 1 :
            	            // InternalDrn.g:1904:5: ( (lv_rotate_19_0= ruleRotate ) )
            	            {
            	            // InternalDrn.g:1904:5: ( (lv_rotate_19_0= ruleRotate ) )
            	            // InternalDrn.g:1905:6: (lv_rotate_19_0= ruleRotate )
            	            {
            	            // InternalDrn.g:1905:6: (lv_rotate_19_0= ruleRotate )
            	            // InternalDrn.g:1906:7: lv_rotate_19_0= ruleRotate
            	            {

            	            							newCompositeNode(grammarAccess.getAndAccess().getRotateRotateParserRuleCall_6_1_0_0());
            	            						
            	            pushFollow(FOLLOW_26);
            	            lv_rotate_19_0=ruleRotate();

            	            state._fsp--;


            	            							if (current==null) {
            	            								current = createModelElementForParent(grammarAccess.getAndRule());
            	            							}
            	            							add(
            	            								current,
            	            								"rotate",
            	            								lv_rotate_19_0,
            	            								"sar.drone.Drn.Rotate");
            	            							afterParserOrEnumRuleCall();
            	            						

            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalDrn.g:1924:5: ( (lv_depx_20_0= ruleDepX_Impl ) )
            	            {
            	            // InternalDrn.g:1924:5: ( (lv_depx_20_0= ruleDepX_Impl ) )
            	            // InternalDrn.g:1925:6: (lv_depx_20_0= ruleDepX_Impl )
            	            {
            	            // InternalDrn.g:1925:6: (lv_depx_20_0= ruleDepX_Impl )
            	            // InternalDrn.g:1926:7: lv_depx_20_0= ruleDepX_Impl
            	            {

            	            							newCompositeNode(grammarAccess.getAndAccess().getDepxDepX_ImplParserRuleCall_6_1_1_0());
            	            						
            	            pushFollow(FOLLOW_26);
            	            lv_depx_20_0=ruleDepX_Impl();

            	            state._fsp--;


            	            							if (current==null) {
            	            								current = createModelElementForParent(grammarAccess.getAndRule());
            	            							}
            	            							add(
            	            								current,
            	            								"depx",
            	            								lv_depx_20_0,
            	            								"sar.drone.Drn.DepX_Impl");
            	            							afterParserOrEnumRuleCall();
            	            						

            	            }


            	            }


            	            }
            	            break;
            	        case 3 :
            	            // InternalDrn.g:1944:5: ( (lv_depy_21_0= ruleDepY_Impl ) )
            	            {
            	            // InternalDrn.g:1944:5: ( (lv_depy_21_0= ruleDepY_Impl ) )
            	            // InternalDrn.g:1945:6: (lv_depy_21_0= ruleDepY_Impl )
            	            {
            	            // InternalDrn.g:1945:6: (lv_depy_21_0= ruleDepY_Impl )
            	            // InternalDrn.g:1946:7: lv_depy_21_0= ruleDepY_Impl
            	            {

            	            							newCompositeNode(grammarAccess.getAndAccess().getDepyDepY_ImplParserRuleCall_6_1_2_0());
            	            						
            	            pushFollow(FOLLOW_26);
            	            lv_depy_21_0=ruleDepY_Impl();

            	            state._fsp--;


            	            							if (current==null) {
            	            								current = createModelElementForParent(grammarAccess.getAndRule());
            	            							}
            	            							add(
            	            								current,
            	            								"depy",
            	            								lv_depy_21_0,
            	            								"sar.drone.Drn.DepY_Impl");
            	            							afterParserOrEnumRuleCall();
            	            						

            	            }


            	            }


            	            }
            	            break;
            	        case 4 :
            	            // InternalDrn.g:1964:5: ( (lv_depz_22_0= ruleDepZ_Impl ) )
            	            {
            	            // InternalDrn.g:1964:5: ( (lv_depz_22_0= ruleDepZ_Impl ) )
            	            // InternalDrn.g:1965:6: (lv_depz_22_0= ruleDepZ_Impl )
            	            {
            	            // InternalDrn.g:1965:6: (lv_depz_22_0= ruleDepZ_Impl )
            	            // InternalDrn.g:1966:7: lv_depz_22_0= ruleDepZ_Impl
            	            {

            	            							newCompositeNode(grammarAccess.getAndAccess().getDepzDepZ_ImplParserRuleCall_6_1_3_0());
            	            						
            	            pushFollow(FOLLOW_26);
            	            lv_depz_22_0=ruleDepZ_Impl();

            	            state._fsp--;


            	            							if (current==null) {
            	            								current = createModelElementForParent(grammarAccess.getAndRule());
            	            							}
            	            							add(
            	            								current,
            	            								"depz",
            	            								lv_depz_22_0,
            	            								"sar.drone.Drn.DepZ_Impl");
            	            							afterParserOrEnumRuleCall();
            	            						

            	            }


            	            }


            	            }
            	            break;
            	        case 5 :
            	            // InternalDrn.g:1984:5: ( (lv_depxz_23_0= ruleDepXZ_IMPL ) )
            	            {
            	            // InternalDrn.g:1984:5: ( (lv_depxz_23_0= ruleDepXZ_IMPL ) )
            	            // InternalDrn.g:1985:6: (lv_depxz_23_0= ruleDepXZ_IMPL )
            	            {
            	            // InternalDrn.g:1985:6: (lv_depxz_23_0= ruleDepXZ_IMPL )
            	            // InternalDrn.g:1986:7: lv_depxz_23_0= ruleDepXZ_IMPL
            	            {

            	            							newCompositeNode(grammarAccess.getAndAccess().getDepxzDepXZ_IMPLParserRuleCall_6_1_4_0());
            	            						
            	            pushFollow(FOLLOW_26);
            	            lv_depxz_23_0=ruleDepXZ_IMPL();

            	            state._fsp--;


            	            							if (current==null) {
            	            								current = createModelElementForParent(grammarAccess.getAndRule());
            	            							}
            	            							add(
            	            								current,
            	            								"depxz",
            	            								lv_depxz_23_0,
            	            								"sar.drone.Drn.DepXZ_IMPL");
            	            							afterParserOrEnumRuleCall();
            	            						

            	            }


            	            }


            	            }
            	            break;
            	        case 6 :
            	            // InternalDrn.g:2004:5: ( (lv_depxy_24_0= ruleDepXY_IMPL ) )
            	            {
            	            // InternalDrn.g:2004:5: ( (lv_depxy_24_0= ruleDepXY_IMPL ) )
            	            // InternalDrn.g:2005:6: (lv_depxy_24_0= ruleDepXY_IMPL )
            	            {
            	            // InternalDrn.g:2005:6: (lv_depxy_24_0= ruleDepXY_IMPL )
            	            // InternalDrn.g:2006:7: lv_depxy_24_0= ruleDepXY_IMPL
            	            {

            	            							newCompositeNode(grammarAccess.getAndAccess().getDepxyDepXY_IMPLParserRuleCall_6_1_5_0());
            	            						
            	            pushFollow(FOLLOW_26);
            	            lv_depxy_24_0=ruleDepXY_IMPL();

            	            state._fsp--;


            	            							if (current==null) {
            	            								current = createModelElementForParent(grammarAccess.getAndRule());
            	            							}
            	            							add(
            	            								current,
            	            								"depxy",
            	            								lv_depxy_24_0,
            	            								"sar.drone.Drn.DepXY_IMPL");
            	            							afterParserOrEnumRuleCall();
            	            						

            	            }


            	            }


            	            }
            	            break;
            	        case 7 :
            	            // InternalDrn.g:2024:5: ( (lv_depyz_25_0= ruleDepYZ_IMPL ) )
            	            {
            	            // InternalDrn.g:2024:5: ( (lv_depyz_25_0= ruleDepYZ_IMPL ) )
            	            // InternalDrn.g:2025:6: (lv_depyz_25_0= ruleDepYZ_IMPL )
            	            {
            	            // InternalDrn.g:2025:6: (lv_depyz_25_0= ruleDepYZ_IMPL )
            	            // InternalDrn.g:2026:7: lv_depyz_25_0= ruleDepYZ_IMPL
            	            {

            	            							newCompositeNode(grammarAccess.getAndAccess().getDepyzDepYZ_IMPLParserRuleCall_6_1_6_0());
            	            						
            	            pushFollow(FOLLOW_26);
            	            lv_depyz_25_0=ruleDepYZ_IMPL();

            	            state._fsp--;


            	            							if (current==null) {
            	            								current = createModelElementForParent(grammarAccess.getAndRule());
            	            							}
            	            							add(
            	            								current,
            	            								"depyz",
            	            								lv_depyz_25_0,
            	            								"sar.drone.Drn.DepYZ_IMPL");
            	            							afterParserOrEnumRuleCall();
            	            						

            	            }


            	            }


            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

            otherlv_26=(Token)match(input,30,FOLLOW_2); 

            			newLeafNode(otherlv_26, grammarAccess.getAndAccess().getRightParenthesisKeyword_7());
            		

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
    // $ANTLR end "ruleAnd"


    // $ANTLR start "entryRuleDepY_Impl"
    // InternalDrn.g:2053:1: entryRuleDepY_Impl returns [EObject current=null] : iv_ruleDepY_Impl= ruleDepY_Impl EOF ;
    public final EObject entryRuleDepY_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDepY_Impl = null;


        try {
            // InternalDrn.g:2053:50: (iv_ruleDepY_Impl= ruleDepY_Impl EOF )
            // InternalDrn.g:2054:2: iv_ruleDepY_Impl= ruleDepY_Impl EOF
            {
             newCompositeNode(grammarAccess.getDepY_ImplRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDepY_Impl=ruleDepY_Impl();

            state._fsp--;

             current =iv_ruleDepY_Impl; 
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
    // $ANTLR end "entryRuleDepY_Impl"


    // $ANTLR start "ruleDepY_Impl"
    // InternalDrn.g:2060:1: ruleDepY_Impl returns [EObject current=null] : (this_FORWARD_0= ruleFORWARD | this_BACKWARD_1= ruleBACKWARD ) ;
    public final EObject ruleDepY_Impl() throws RecognitionException {
        EObject current = null;

        EObject this_FORWARD_0 = null;

        EObject this_BACKWARD_1 = null;



        	enterRule();

        try {
            // InternalDrn.g:2066:2: ( (this_FORWARD_0= ruleFORWARD | this_BACKWARD_1= ruleBACKWARD ) )
            // InternalDrn.g:2067:2: (this_FORWARD_0= ruleFORWARD | this_BACKWARD_1= ruleBACKWARD )
            {
            // InternalDrn.g:2067:2: (this_FORWARD_0= ruleFORWARD | this_BACKWARD_1= ruleBACKWARD )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==34) ) {
                alt28=1;
            }
            else if ( (LA28_0==37) ) {
                alt28=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // InternalDrn.g:2068:3: this_FORWARD_0= ruleFORWARD
                    {

                    			newCompositeNode(grammarAccess.getDepY_ImplAccess().getFORWARDParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_FORWARD_0=ruleFORWARD();

                    state._fsp--;


                    			current = this_FORWARD_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDrn.g:2077:3: this_BACKWARD_1= ruleBACKWARD
                    {

                    			newCompositeNode(grammarAccess.getDepY_ImplAccess().getBACKWARDParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_BACKWARD_1=ruleBACKWARD();

                    state._fsp--;


                    			current = this_BACKWARD_1;
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
    // $ANTLR end "ruleDepY_Impl"


    // $ANTLR start "entryRuleFORWARD"
    // InternalDrn.g:2089:1: entryRuleFORWARD returns [EObject current=null] : iv_ruleFORWARD= ruleFORWARD EOF ;
    public final EObject entryRuleFORWARD() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFORWARD = null;


        try {
            // InternalDrn.g:2089:48: (iv_ruleFORWARD= ruleFORWARD EOF )
            // InternalDrn.g:2090:2: iv_ruleFORWARD= ruleFORWARD EOF
            {
             newCompositeNode(grammarAccess.getFORWARDRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFORWARD=ruleFORWARD();

            state._fsp--;

             current =iv_ruleFORWARD; 
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
    // $ANTLR end "entryRuleFORWARD"


    // $ANTLR start "ruleFORWARD"
    // InternalDrn.g:2096:1: ruleFORWARD returns [EObject current=null] : ( ( (lv_name_0_0= 'forward' ) ) otherlv_1= '(' otherlv_2= 'distance' otherlv_3= '=' ( (lv_distanceCST_4_0= RULE_INT ) ) otherlv_5= 'temps' otherlv_6= '=' ( (lv_tempsCST_7_0= RULE_INT ) ) otherlv_8= ')' ) ;
    public final EObject ruleFORWARD() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_distanceCST_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_tempsCST_7_0=null;
        Token otherlv_8=null;


        	enterRule();

        try {
            // InternalDrn.g:2102:2: ( ( ( (lv_name_0_0= 'forward' ) ) otherlv_1= '(' otherlv_2= 'distance' otherlv_3= '=' ( (lv_distanceCST_4_0= RULE_INT ) ) otherlv_5= 'temps' otherlv_6= '=' ( (lv_tempsCST_7_0= RULE_INT ) ) otherlv_8= ')' ) )
            // InternalDrn.g:2103:2: ( ( (lv_name_0_0= 'forward' ) ) otherlv_1= '(' otherlv_2= 'distance' otherlv_3= '=' ( (lv_distanceCST_4_0= RULE_INT ) ) otherlv_5= 'temps' otherlv_6= '=' ( (lv_tempsCST_7_0= RULE_INT ) ) otherlv_8= ')' )
            {
            // InternalDrn.g:2103:2: ( ( (lv_name_0_0= 'forward' ) ) otherlv_1= '(' otherlv_2= 'distance' otherlv_3= '=' ( (lv_distanceCST_4_0= RULE_INT ) ) otherlv_5= 'temps' otherlv_6= '=' ( (lv_tempsCST_7_0= RULE_INT ) ) otherlv_8= ')' )
            // InternalDrn.g:2104:3: ( (lv_name_0_0= 'forward' ) ) otherlv_1= '(' otherlv_2= 'distance' otherlv_3= '=' ( (lv_distanceCST_4_0= RULE_INT ) ) otherlv_5= 'temps' otherlv_6= '=' ( (lv_tempsCST_7_0= RULE_INT ) ) otherlv_8= ')'
            {
            // InternalDrn.g:2104:3: ( (lv_name_0_0= 'forward' ) )
            // InternalDrn.g:2105:4: (lv_name_0_0= 'forward' )
            {
            // InternalDrn.g:2105:4: (lv_name_0_0= 'forward' )
            // InternalDrn.g:2106:5: lv_name_0_0= 'forward'
            {
            lv_name_0_0=(Token)match(input,34,FOLLOW_23); 

            					newLeafNode(lv_name_0_0, grammarAccess.getFORWARDAccess().getNameForwardKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFORWARDRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "forward");
            				

            }


            }

            otherlv_1=(Token)match(input,28,FOLLOW_27); 

            			newLeafNode(otherlv_1, grammarAccess.getFORWARDAccess().getLeftParenthesisKeyword_1());
            		
            otherlv_2=(Token)match(input,35,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getFORWARDAccess().getDistanceKeyword_2());
            		
            otherlv_3=(Token)match(input,15,FOLLOW_14); 

            			newLeafNode(otherlv_3, grammarAccess.getFORWARDAccess().getEqualsSignKeyword_3());
            		
            // InternalDrn.g:2130:3: ( (lv_distanceCST_4_0= RULE_INT ) )
            // InternalDrn.g:2131:4: (lv_distanceCST_4_0= RULE_INT )
            {
            // InternalDrn.g:2131:4: (lv_distanceCST_4_0= RULE_INT )
            // InternalDrn.g:2132:5: lv_distanceCST_4_0= RULE_INT
            {
            lv_distanceCST_4_0=(Token)match(input,RULE_INT,FOLLOW_28); 

            					newLeafNode(lv_distanceCST_4_0, grammarAccess.getFORWARDAccess().getDistanceCSTINTTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFORWARDRule());
            					}
            					setWithLastConsumed(
            						current,
            						"distanceCST",
            						lv_distanceCST_4_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_5=(Token)match(input,36,FOLLOW_7); 

            			newLeafNode(otherlv_5, grammarAccess.getFORWARDAccess().getTempsKeyword_5());
            		
            otherlv_6=(Token)match(input,15,FOLLOW_14); 

            			newLeafNode(otherlv_6, grammarAccess.getFORWARDAccess().getEqualsSignKeyword_6());
            		
            // InternalDrn.g:2156:3: ( (lv_tempsCST_7_0= RULE_INT ) )
            // InternalDrn.g:2157:4: (lv_tempsCST_7_0= RULE_INT )
            {
            // InternalDrn.g:2157:4: (lv_tempsCST_7_0= RULE_INT )
            // InternalDrn.g:2158:5: lv_tempsCST_7_0= RULE_INT
            {
            lv_tempsCST_7_0=(Token)match(input,RULE_INT,FOLLOW_29); 

            					newLeafNode(lv_tempsCST_7_0, grammarAccess.getFORWARDAccess().getTempsCSTINTTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFORWARDRule());
            					}
            					setWithLastConsumed(
            						current,
            						"tempsCST",
            						lv_tempsCST_7_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_8=(Token)match(input,30,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getFORWARDAccess().getRightParenthesisKeyword_8());
            		

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
    // $ANTLR end "ruleFORWARD"


    // $ANTLR start "entryRuleBACKWARD"
    // InternalDrn.g:2182:1: entryRuleBACKWARD returns [EObject current=null] : iv_ruleBACKWARD= ruleBACKWARD EOF ;
    public final EObject entryRuleBACKWARD() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBACKWARD = null;


        try {
            // InternalDrn.g:2182:49: (iv_ruleBACKWARD= ruleBACKWARD EOF )
            // InternalDrn.g:2183:2: iv_ruleBACKWARD= ruleBACKWARD EOF
            {
             newCompositeNode(grammarAccess.getBACKWARDRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBACKWARD=ruleBACKWARD();

            state._fsp--;

             current =iv_ruleBACKWARD; 
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
    // $ANTLR end "entryRuleBACKWARD"


    // $ANTLR start "ruleBACKWARD"
    // InternalDrn.g:2189:1: ruleBACKWARD returns [EObject current=null] : ( ( (lv_name_0_0= 'backward' ) ) otherlv_1= '(' otherlv_2= 'distance' otherlv_3= '=' ( (lv_distanceCST_4_0= RULE_INT ) ) otherlv_5= 'temps' otherlv_6= '=' ( (lv_tempsCST_7_0= RULE_INT ) ) otherlv_8= ')' ) ;
    public final EObject ruleBACKWARD() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_distanceCST_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_tempsCST_7_0=null;
        Token otherlv_8=null;


        	enterRule();

        try {
            // InternalDrn.g:2195:2: ( ( ( (lv_name_0_0= 'backward' ) ) otherlv_1= '(' otherlv_2= 'distance' otherlv_3= '=' ( (lv_distanceCST_4_0= RULE_INT ) ) otherlv_5= 'temps' otherlv_6= '=' ( (lv_tempsCST_7_0= RULE_INT ) ) otherlv_8= ')' ) )
            // InternalDrn.g:2196:2: ( ( (lv_name_0_0= 'backward' ) ) otherlv_1= '(' otherlv_2= 'distance' otherlv_3= '=' ( (lv_distanceCST_4_0= RULE_INT ) ) otherlv_5= 'temps' otherlv_6= '=' ( (lv_tempsCST_7_0= RULE_INT ) ) otherlv_8= ')' )
            {
            // InternalDrn.g:2196:2: ( ( (lv_name_0_0= 'backward' ) ) otherlv_1= '(' otherlv_2= 'distance' otherlv_3= '=' ( (lv_distanceCST_4_0= RULE_INT ) ) otherlv_5= 'temps' otherlv_6= '=' ( (lv_tempsCST_7_0= RULE_INT ) ) otherlv_8= ')' )
            // InternalDrn.g:2197:3: ( (lv_name_0_0= 'backward' ) ) otherlv_1= '(' otherlv_2= 'distance' otherlv_3= '=' ( (lv_distanceCST_4_0= RULE_INT ) ) otherlv_5= 'temps' otherlv_6= '=' ( (lv_tempsCST_7_0= RULE_INT ) ) otherlv_8= ')'
            {
            // InternalDrn.g:2197:3: ( (lv_name_0_0= 'backward' ) )
            // InternalDrn.g:2198:4: (lv_name_0_0= 'backward' )
            {
            // InternalDrn.g:2198:4: (lv_name_0_0= 'backward' )
            // InternalDrn.g:2199:5: lv_name_0_0= 'backward'
            {
            lv_name_0_0=(Token)match(input,37,FOLLOW_23); 

            					newLeafNode(lv_name_0_0, grammarAccess.getBACKWARDAccess().getNameBackwardKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBACKWARDRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "backward");
            				

            }


            }

            otherlv_1=(Token)match(input,28,FOLLOW_27); 

            			newLeafNode(otherlv_1, grammarAccess.getBACKWARDAccess().getLeftParenthesisKeyword_1());
            		
            otherlv_2=(Token)match(input,35,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getBACKWARDAccess().getDistanceKeyword_2());
            		
            otherlv_3=(Token)match(input,15,FOLLOW_14); 

            			newLeafNode(otherlv_3, grammarAccess.getBACKWARDAccess().getEqualsSignKeyword_3());
            		
            // InternalDrn.g:2223:3: ( (lv_distanceCST_4_0= RULE_INT ) )
            // InternalDrn.g:2224:4: (lv_distanceCST_4_0= RULE_INT )
            {
            // InternalDrn.g:2224:4: (lv_distanceCST_4_0= RULE_INT )
            // InternalDrn.g:2225:5: lv_distanceCST_4_0= RULE_INT
            {
            lv_distanceCST_4_0=(Token)match(input,RULE_INT,FOLLOW_28); 

            					newLeafNode(lv_distanceCST_4_0, grammarAccess.getBACKWARDAccess().getDistanceCSTINTTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBACKWARDRule());
            					}
            					setWithLastConsumed(
            						current,
            						"distanceCST",
            						lv_distanceCST_4_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_5=(Token)match(input,36,FOLLOW_7); 

            			newLeafNode(otherlv_5, grammarAccess.getBACKWARDAccess().getTempsKeyword_5());
            		
            otherlv_6=(Token)match(input,15,FOLLOW_14); 

            			newLeafNode(otherlv_6, grammarAccess.getBACKWARDAccess().getEqualsSignKeyword_6());
            		
            // InternalDrn.g:2249:3: ( (lv_tempsCST_7_0= RULE_INT ) )
            // InternalDrn.g:2250:4: (lv_tempsCST_7_0= RULE_INT )
            {
            // InternalDrn.g:2250:4: (lv_tempsCST_7_0= RULE_INT )
            // InternalDrn.g:2251:5: lv_tempsCST_7_0= RULE_INT
            {
            lv_tempsCST_7_0=(Token)match(input,RULE_INT,FOLLOW_29); 

            					newLeafNode(lv_tempsCST_7_0, grammarAccess.getBACKWARDAccess().getTempsCSTINTTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBACKWARDRule());
            					}
            					setWithLastConsumed(
            						current,
            						"tempsCST",
            						lv_tempsCST_7_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_8=(Token)match(input,30,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getBACKWARDAccess().getRightParenthesisKeyword_8());
            		

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
    // $ANTLR end "ruleBACKWARD"


    // $ANTLR start "entryRuleDepX_Impl"
    // InternalDrn.g:2275:1: entryRuleDepX_Impl returns [EObject current=null] : iv_ruleDepX_Impl= ruleDepX_Impl EOF ;
    public final EObject entryRuleDepX_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDepX_Impl = null;


        try {
            // InternalDrn.g:2275:50: (iv_ruleDepX_Impl= ruleDepX_Impl EOF )
            // InternalDrn.g:2276:2: iv_ruleDepX_Impl= ruleDepX_Impl EOF
            {
             newCompositeNode(grammarAccess.getDepX_ImplRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDepX_Impl=ruleDepX_Impl();

            state._fsp--;

             current =iv_ruleDepX_Impl; 
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
    // $ANTLR end "entryRuleDepX_Impl"


    // $ANTLR start "ruleDepX_Impl"
    // InternalDrn.g:2282:1: ruleDepX_Impl returns [EObject current=null] : (this_LEFT_0= ruleLEFT | this_RIGHT_1= ruleRIGHT ) ;
    public final EObject ruleDepX_Impl() throws RecognitionException {
        EObject current = null;

        EObject this_LEFT_0 = null;

        EObject this_RIGHT_1 = null;



        	enterRule();

        try {
            // InternalDrn.g:2288:2: ( (this_LEFT_0= ruleLEFT | this_RIGHT_1= ruleRIGHT ) )
            // InternalDrn.g:2289:2: (this_LEFT_0= ruleLEFT | this_RIGHT_1= ruleRIGHT )
            {
            // InternalDrn.g:2289:2: (this_LEFT_0= ruleLEFT | this_RIGHT_1= ruleRIGHT )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==38) ) {
                alt29=1;
            }
            else if ( (LA29_0==39) ) {
                alt29=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // InternalDrn.g:2290:3: this_LEFT_0= ruleLEFT
                    {

                    			newCompositeNode(grammarAccess.getDepX_ImplAccess().getLEFTParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_LEFT_0=ruleLEFT();

                    state._fsp--;


                    			current = this_LEFT_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDrn.g:2299:3: this_RIGHT_1= ruleRIGHT
                    {

                    			newCompositeNode(grammarAccess.getDepX_ImplAccess().getRIGHTParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_RIGHT_1=ruleRIGHT();

                    state._fsp--;


                    			current = this_RIGHT_1;
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
    // $ANTLR end "ruleDepX_Impl"


    // $ANTLR start "entryRuleLEFT"
    // InternalDrn.g:2311:1: entryRuleLEFT returns [EObject current=null] : iv_ruleLEFT= ruleLEFT EOF ;
    public final EObject entryRuleLEFT() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLEFT = null;


        try {
            // InternalDrn.g:2311:45: (iv_ruleLEFT= ruleLEFT EOF )
            // InternalDrn.g:2312:2: iv_ruleLEFT= ruleLEFT EOF
            {
             newCompositeNode(grammarAccess.getLEFTRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLEFT=ruleLEFT();

            state._fsp--;

             current =iv_ruleLEFT; 
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
    // $ANTLR end "entryRuleLEFT"


    // $ANTLR start "ruleLEFT"
    // InternalDrn.g:2318:1: ruleLEFT returns [EObject current=null] : ( ( (lv_name_0_0= 'left' ) ) otherlv_1= '(' otherlv_2= 'distance' otherlv_3= '=' ( (lv_distanceCST_4_0= RULE_INT ) ) otherlv_5= 'temps' otherlv_6= '=' ( (lv_tempsCST_7_0= RULE_INT ) ) otherlv_8= ')' ) ;
    public final EObject ruleLEFT() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_distanceCST_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_tempsCST_7_0=null;
        Token otherlv_8=null;


        	enterRule();

        try {
            // InternalDrn.g:2324:2: ( ( ( (lv_name_0_0= 'left' ) ) otherlv_1= '(' otherlv_2= 'distance' otherlv_3= '=' ( (lv_distanceCST_4_0= RULE_INT ) ) otherlv_5= 'temps' otherlv_6= '=' ( (lv_tempsCST_7_0= RULE_INT ) ) otherlv_8= ')' ) )
            // InternalDrn.g:2325:2: ( ( (lv_name_0_0= 'left' ) ) otherlv_1= '(' otherlv_2= 'distance' otherlv_3= '=' ( (lv_distanceCST_4_0= RULE_INT ) ) otherlv_5= 'temps' otherlv_6= '=' ( (lv_tempsCST_7_0= RULE_INT ) ) otherlv_8= ')' )
            {
            // InternalDrn.g:2325:2: ( ( (lv_name_0_0= 'left' ) ) otherlv_1= '(' otherlv_2= 'distance' otherlv_3= '=' ( (lv_distanceCST_4_0= RULE_INT ) ) otherlv_5= 'temps' otherlv_6= '=' ( (lv_tempsCST_7_0= RULE_INT ) ) otherlv_8= ')' )
            // InternalDrn.g:2326:3: ( (lv_name_0_0= 'left' ) ) otherlv_1= '(' otherlv_2= 'distance' otherlv_3= '=' ( (lv_distanceCST_4_0= RULE_INT ) ) otherlv_5= 'temps' otherlv_6= '=' ( (lv_tempsCST_7_0= RULE_INT ) ) otherlv_8= ')'
            {
            // InternalDrn.g:2326:3: ( (lv_name_0_0= 'left' ) )
            // InternalDrn.g:2327:4: (lv_name_0_0= 'left' )
            {
            // InternalDrn.g:2327:4: (lv_name_0_0= 'left' )
            // InternalDrn.g:2328:5: lv_name_0_0= 'left'
            {
            lv_name_0_0=(Token)match(input,38,FOLLOW_23); 

            					newLeafNode(lv_name_0_0, grammarAccess.getLEFTAccess().getNameLeftKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLEFTRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "left");
            				

            }


            }

            otherlv_1=(Token)match(input,28,FOLLOW_27); 

            			newLeafNode(otherlv_1, grammarAccess.getLEFTAccess().getLeftParenthesisKeyword_1());
            		
            otherlv_2=(Token)match(input,35,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getLEFTAccess().getDistanceKeyword_2());
            		
            otherlv_3=(Token)match(input,15,FOLLOW_14); 

            			newLeafNode(otherlv_3, grammarAccess.getLEFTAccess().getEqualsSignKeyword_3());
            		
            // InternalDrn.g:2352:3: ( (lv_distanceCST_4_0= RULE_INT ) )
            // InternalDrn.g:2353:4: (lv_distanceCST_4_0= RULE_INT )
            {
            // InternalDrn.g:2353:4: (lv_distanceCST_4_0= RULE_INT )
            // InternalDrn.g:2354:5: lv_distanceCST_4_0= RULE_INT
            {
            lv_distanceCST_4_0=(Token)match(input,RULE_INT,FOLLOW_28); 

            					newLeafNode(lv_distanceCST_4_0, grammarAccess.getLEFTAccess().getDistanceCSTINTTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLEFTRule());
            					}
            					setWithLastConsumed(
            						current,
            						"distanceCST",
            						lv_distanceCST_4_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_5=(Token)match(input,36,FOLLOW_7); 

            			newLeafNode(otherlv_5, grammarAccess.getLEFTAccess().getTempsKeyword_5());
            		
            otherlv_6=(Token)match(input,15,FOLLOW_14); 

            			newLeafNode(otherlv_6, grammarAccess.getLEFTAccess().getEqualsSignKeyword_6());
            		
            // InternalDrn.g:2378:3: ( (lv_tempsCST_7_0= RULE_INT ) )
            // InternalDrn.g:2379:4: (lv_tempsCST_7_0= RULE_INT )
            {
            // InternalDrn.g:2379:4: (lv_tempsCST_7_0= RULE_INT )
            // InternalDrn.g:2380:5: lv_tempsCST_7_0= RULE_INT
            {
            lv_tempsCST_7_0=(Token)match(input,RULE_INT,FOLLOW_29); 

            					newLeafNode(lv_tempsCST_7_0, grammarAccess.getLEFTAccess().getTempsCSTINTTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLEFTRule());
            					}
            					setWithLastConsumed(
            						current,
            						"tempsCST",
            						lv_tempsCST_7_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_8=(Token)match(input,30,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getLEFTAccess().getRightParenthesisKeyword_8());
            		

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
    // $ANTLR end "ruleLEFT"


    // $ANTLR start "entryRuleRIGHT"
    // InternalDrn.g:2404:1: entryRuleRIGHT returns [EObject current=null] : iv_ruleRIGHT= ruleRIGHT EOF ;
    public final EObject entryRuleRIGHT() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRIGHT = null;


        try {
            // InternalDrn.g:2404:46: (iv_ruleRIGHT= ruleRIGHT EOF )
            // InternalDrn.g:2405:2: iv_ruleRIGHT= ruleRIGHT EOF
            {
             newCompositeNode(grammarAccess.getRIGHTRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRIGHT=ruleRIGHT();

            state._fsp--;

             current =iv_ruleRIGHT; 
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
    // $ANTLR end "entryRuleRIGHT"


    // $ANTLR start "ruleRIGHT"
    // InternalDrn.g:2411:1: ruleRIGHT returns [EObject current=null] : ( ( (lv_name_0_0= 'right' ) ) otherlv_1= '(' otherlv_2= 'distance' otherlv_3= '=' ( (lv_distanceCST_4_0= RULE_INT ) ) otherlv_5= 'temps' otherlv_6= '=' ( (lv_tempsCST_7_0= RULE_INT ) ) otherlv_8= ')' ) ;
    public final EObject ruleRIGHT() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_distanceCST_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_tempsCST_7_0=null;
        Token otherlv_8=null;


        	enterRule();

        try {
            // InternalDrn.g:2417:2: ( ( ( (lv_name_0_0= 'right' ) ) otherlv_1= '(' otherlv_2= 'distance' otherlv_3= '=' ( (lv_distanceCST_4_0= RULE_INT ) ) otherlv_5= 'temps' otherlv_6= '=' ( (lv_tempsCST_7_0= RULE_INT ) ) otherlv_8= ')' ) )
            // InternalDrn.g:2418:2: ( ( (lv_name_0_0= 'right' ) ) otherlv_1= '(' otherlv_2= 'distance' otherlv_3= '=' ( (lv_distanceCST_4_0= RULE_INT ) ) otherlv_5= 'temps' otherlv_6= '=' ( (lv_tempsCST_7_0= RULE_INT ) ) otherlv_8= ')' )
            {
            // InternalDrn.g:2418:2: ( ( (lv_name_0_0= 'right' ) ) otherlv_1= '(' otherlv_2= 'distance' otherlv_3= '=' ( (lv_distanceCST_4_0= RULE_INT ) ) otherlv_5= 'temps' otherlv_6= '=' ( (lv_tempsCST_7_0= RULE_INT ) ) otherlv_8= ')' )
            // InternalDrn.g:2419:3: ( (lv_name_0_0= 'right' ) ) otherlv_1= '(' otherlv_2= 'distance' otherlv_3= '=' ( (lv_distanceCST_4_0= RULE_INT ) ) otherlv_5= 'temps' otherlv_6= '=' ( (lv_tempsCST_7_0= RULE_INT ) ) otherlv_8= ')'
            {
            // InternalDrn.g:2419:3: ( (lv_name_0_0= 'right' ) )
            // InternalDrn.g:2420:4: (lv_name_0_0= 'right' )
            {
            // InternalDrn.g:2420:4: (lv_name_0_0= 'right' )
            // InternalDrn.g:2421:5: lv_name_0_0= 'right'
            {
            lv_name_0_0=(Token)match(input,39,FOLLOW_23); 

            					newLeafNode(lv_name_0_0, grammarAccess.getRIGHTAccess().getNameRightKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRIGHTRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "right");
            				

            }


            }

            otherlv_1=(Token)match(input,28,FOLLOW_27); 

            			newLeafNode(otherlv_1, grammarAccess.getRIGHTAccess().getLeftParenthesisKeyword_1());
            		
            otherlv_2=(Token)match(input,35,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getRIGHTAccess().getDistanceKeyword_2());
            		
            otherlv_3=(Token)match(input,15,FOLLOW_14); 

            			newLeafNode(otherlv_3, grammarAccess.getRIGHTAccess().getEqualsSignKeyword_3());
            		
            // InternalDrn.g:2445:3: ( (lv_distanceCST_4_0= RULE_INT ) )
            // InternalDrn.g:2446:4: (lv_distanceCST_4_0= RULE_INT )
            {
            // InternalDrn.g:2446:4: (lv_distanceCST_4_0= RULE_INT )
            // InternalDrn.g:2447:5: lv_distanceCST_4_0= RULE_INT
            {
            lv_distanceCST_4_0=(Token)match(input,RULE_INT,FOLLOW_28); 

            					newLeafNode(lv_distanceCST_4_0, grammarAccess.getRIGHTAccess().getDistanceCSTINTTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRIGHTRule());
            					}
            					setWithLastConsumed(
            						current,
            						"distanceCST",
            						lv_distanceCST_4_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_5=(Token)match(input,36,FOLLOW_7); 

            			newLeafNode(otherlv_5, grammarAccess.getRIGHTAccess().getTempsKeyword_5());
            		
            otherlv_6=(Token)match(input,15,FOLLOW_14); 

            			newLeafNode(otherlv_6, grammarAccess.getRIGHTAccess().getEqualsSignKeyword_6());
            		
            // InternalDrn.g:2471:3: ( (lv_tempsCST_7_0= RULE_INT ) )
            // InternalDrn.g:2472:4: (lv_tempsCST_7_0= RULE_INT )
            {
            // InternalDrn.g:2472:4: (lv_tempsCST_7_0= RULE_INT )
            // InternalDrn.g:2473:5: lv_tempsCST_7_0= RULE_INT
            {
            lv_tempsCST_7_0=(Token)match(input,RULE_INT,FOLLOW_29); 

            					newLeafNode(lv_tempsCST_7_0, grammarAccess.getRIGHTAccess().getTempsCSTINTTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRIGHTRule());
            					}
            					setWithLastConsumed(
            						current,
            						"tempsCST",
            						lv_tempsCST_7_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_8=(Token)match(input,30,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getRIGHTAccess().getRightParenthesisKeyword_8());
            		

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
    // $ANTLR end "ruleRIGHT"


    // $ANTLR start "entryRuleDepZ_Impl"
    // InternalDrn.g:2497:1: entryRuleDepZ_Impl returns [EObject current=null] : iv_ruleDepZ_Impl= ruleDepZ_Impl EOF ;
    public final EObject entryRuleDepZ_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDepZ_Impl = null;


        try {
            // InternalDrn.g:2497:50: (iv_ruleDepZ_Impl= ruleDepZ_Impl EOF )
            // InternalDrn.g:2498:2: iv_ruleDepZ_Impl= ruleDepZ_Impl EOF
            {
             newCompositeNode(grammarAccess.getDepZ_ImplRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDepZ_Impl=ruleDepZ_Impl();

            state._fsp--;

             current =iv_ruleDepZ_Impl; 
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
    // $ANTLR end "entryRuleDepZ_Impl"


    // $ANTLR start "ruleDepZ_Impl"
    // InternalDrn.g:2504:1: ruleDepZ_Impl returns [EObject current=null] : (this_UP_0= ruleUP | this_DOWN_1= ruleDOWN ) ;
    public final EObject ruleDepZ_Impl() throws RecognitionException {
        EObject current = null;

        EObject this_UP_0 = null;

        EObject this_DOWN_1 = null;



        	enterRule();

        try {
            // InternalDrn.g:2510:2: ( (this_UP_0= ruleUP | this_DOWN_1= ruleDOWN ) )
            // InternalDrn.g:2511:2: (this_UP_0= ruleUP | this_DOWN_1= ruleDOWN )
            {
            // InternalDrn.g:2511:2: (this_UP_0= ruleUP | this_DOWN_1= ruleDOWN )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==40) ) {
                alt30=1;
            }
            else if ( (LA30_0==41) ) {
                alt30=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // InternalDrn.g:2512:3: this_UP_0= ruleUP
                    {

                    			newCompositeNode(grammarAccess.getDepZ_ImplAccess().getUPParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_UP_0=ruleUP();

                    state._fsp--;


                    			current = this_UP_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDrn.g:2521:3: this_DOWN_1= ruleDOWN
                    {

                    			newCompositeNode(grammarAccess.getDepZ_ImplAccess().getDOWNParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_DOWN_1=ruleDOWN();

                    state._fsp--;


                    			current = this_DOWN_1;
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
    // $ANTLR end "ruleDepZ_Impl"


    // $ANTLR start "entryRuleUP"
    // InternalDrn.g:2533:1: entryRuleUP returns [EObject current=null] : iv_ruleUP= ruleUP EOF ;
    public final EObject entryRuleUP() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUP = null;


        try {
            // InternalDrn.g:2533:43: (iv_ruleUP= ruleUP EOF )
            // InternalDrn.g:2534:2: iv_ruleUP= ruleUP EOF
            {
             newCompositeNode(grammarAccess.getUPRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUP=ruleUP();

            state._fsp--;

             current =iv_ruleUP; 
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
    // $ANTLR end "entryRuleUP"


    // $ANTLR start "ruleUP"
    // InternalDrn.g:2540:1: ruleUP returns [EObject current=null] : ( ( (lv_name_0_0= 'up' ) ) otherlv_1= '(' otherlv_2= 'distance' otherlv_3= '=' ( (lv_distanceCST_4_0= RULE_INT ) ) otherlv_5= 'temps' otherlv_6= '=' ( (lv_tempsCST_7_0= RULE_INT ) ) otherlv_8= ')' ) ;
    public final EObject ruleUP() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_distanceCST_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_tempsCST_7_0=null;
        Token otherlv_8=null;


        	enterRule();

        try {
            // InternalDrn.g:2546:2: ( ( ( (lv_name_0_0= 'up' ) ) otherlv_1= '(' otherlv_2= 'distance' otherlv_3= '=' ( (lv_distanceCST_4_0= RULE_INT ) ) otherlv_5= 'temps' otherlv_6= '=' ( (lv_tempsCST_7_0= RULE_INT ) ) otherlv_8= ')' ) )
            // InternalDrn.g:2547:2: ( ( (lv_name_0_0= 'up' ) ) otherlv_1= '(' otherlv_2= 'distance' otherlv_3= '=' ( (lv_distanceCST_4_0= RULE_INT ) ) otherlv_5= 'temps' otherlv_6= '=' ( (lv_tempsCST_7_0= RULE_INT ) ) otherlv_8= ')' )
            {
            // InternalDrn.g:2547:2: ( ( (lv_name_0_0= 'up' ) ) otherlv_1= '(' otherlv_2= 'distance' otherlv_3= '=' ( (lv_distanceCST_4_0= RULE_INT ) ) otherlv_5= 'temps' otherlv_6= '=' ( (lv_tempsCST_7_0= RULE_INT ) ) otherlv_8= ')' )
            // InternalDrn.g:2548:3: ( (lv_name_0_0= 'up' ) ) otherlv_1= '(' otherlv_2= 'distance' otherlv_3= '=' ( (lv_distanceCST_4_0= RULE_INT ) ) otherlv_5= 'temps' otherlv_6= '=' ( (lv_tempsCST_7_0= RULE_INT ) ) otherlv_8= ')'
            {
            // InternalDrn.g:2548:3: ( (lv_name_0_0= 'up' ) )
            // InternalDrn.g:2549:4: (lv_name_0_0= 'up' )
            {
            // InternalDrn.g:2549:4: (lv_name_0_0= 'up' )
            // InternalDrn.g:2550:5: lv_name_0_0= 'up'
            {
            lv_name_0_0=(Token)match(input,40,FOLLOW_23); 

            					newLeafNode(lv_name_0_0, grammarAccess.getUPAccess().getNameUpKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUPRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "up");
            				

            }


            }

            otherlv_1=(Token)match(input,28,FOLLOW_27); 

            			newLeafNode(otherlv_1, grammarAccess.getUPAccess().getLeftParenthesisKeyword_1());
            		
            otherlv_2=(Token)match(input,35,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getUPAccess().getDistanceKeyword_2());
            		
            otherlv_3=(Token)match(input,15,FOLLOW_14); 

            			newLeafNode(otherlv_3, grammarAccess.getUPAccess().getEqualsSignKeyword_3());
            		
            // InternalDrn.g:2574:3: ( (lv_distanceCST_4_0= RULE_INT ) )
            // InternalDrn.g:2575:4: (lv_distanceCST_4_0= RULE_INT )
            {
            // InternalDrn.g:2575:4: (lv_distanceCST_4_0= RULE_INT )
            // InternalDrn.g:2576:5: lv_distanceCST_4_0= RULE_INT
            {
            lv_distanceCST_4_0=(Token)match(input,RULE_INT,FOLLOW_28); 

            					newLeafNode(lv_distanceCST_4_0, grammarAccess.getUPAccess().getDistanceCSTINTTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUPRule());
            					}
            					setWithLastConsumed(
            						current,
            						"distanceCST",
            						lv_distanceCST_4_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_5=(Token)match(input,36,FOLLOW_7); 

            			newLeafNode(otherlv_5, grammarAccess.getUPAccess().getTempsKeyword_5());
            		
            otherlv_6=(Token)match(input,15,FOLLOW_14); 

            			newLeafNode(otherlv_6, grammarAccess.getUPAccess().getEqualsSignKeyword_6());
            		
            // InternalDrn.g:2600:3: ( (lv_tempsCST_7_0= RULE_INT ) )
            // InternalDrn.g:2601:4: (lv_tempsCST_7_0= RULE_INT )
            {
            // InternalDrn.g:2601:4: (lv_tempsCST_7_0= RULE_INT )
            // InternalDrn.g:2602:5: lv_tempsCST_7_0= RULE_INT
            {
            lv_tempsCST_7_0=(Token)match(input,RULE_INT,FOLLOW_29); 

            					newLeafNode(lv_tempsCST_7_0, grammarAccess.getUPAccess().getTempsCSTINTTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUPRule());
            					}
            					setWithLastConsumed(
            						current,
            						"tempsCST",
            						lv_tempsCST_7_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_8=(Token)match(input,30,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getUPAccess().getRightParenthesisKeyword_8());
            		

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
    // $ANTLR end "ruleUP"


    // $ANTLR start "entryRuleDOWN"
    // InternalDrn.g:2626:1: entryRuleDOWN returns [EObject current=null] : iv_ruleDOWN= ruleDOWN EOF ;
    public final EObject entryRuleDOWN() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDOWN = null;


        try {
            // InternalDrn.g:2626:45: (iv_ruleDOWN= ruleDOWN EOF )
            // InternalDrn.g:2627:2: iv_ruleDOWN= ruleDOWN EOF
            {
             newCompositeNode(grammarAccess.getDOWNRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDOWN=ruleDOWN();

            state._fsp--;

             current =iv_ruleDOWN; 
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
    // $ANTLR end "entryRuleDOWN"


    // $ANTLR start "ruleDOWN"
    // InternalDrn.g:2633:1: ruleDOWN returns [EObject current=null] : ( ( (lv_name_0_0= 'down' ) ) otherlv_1= '(' otherlv_2= 'distance' otherlv_3= '=' ( (lv_distanceCST_4_0= RULE_INT ) ) otherlv_5= 'temps' otherlv_6= '=' ( (lv_tempsCST_7_0= RULE_INT ) ) otherlv_8= ')' ) ;
    public final EObject ruleDOWN() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_distanceCST_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_tempsCST_7_0=null;
        Token otherlv_8=null;


        	enterRule();

        try {
            // InternalDrn.g:2639:2: ( ( ( (lv_name_0_0= 'down' ) ) otherlv_1= '(' otherlv_2= 'distance' otherlv_3= '=' ( (lv_distanceCST_4_0= RULE_INT ) ) otherlv_5= 'temps' otherlv_6= '=' ( (lv_tempsCST_7_0= RULE_INT ) ) otherlv_8= ')' ) )
            // InternalDrn.g:2640:2: ( ( (lv_name_0_0= 'down' ) ) otherlv_1= '(' otherlv_2= 'distance' otherlv_3= '=' ( (lv_distanceCST_4_0= RULE_INT ) ) otherlv_5= 'temps' otherlv_6= '=' ( (lv_tempsCST_7_0= RULE_INT ) ) otherlv_8= ')' )
            {
            // InternalDrn.g:2640:2: ( ( (lv_name_0_0= 'down' ) ) otherlv_1= '(' otherlv_2= 'distance' otherlv_3= '=' ( (lv_distanceCST_4_0= RULE_INT ) ) otherlv_5= 'temps' otherlv_6= '=' ( (lv_tempsCST_7_0= RULE_INT ) ) otherlv_8= ')' )
            // InternalDrn.g:2641:3: ( (lv_name_0_0= 'down' ) ) otherlv_1= '(' otherlv_2= 'distance' otherlv_3= '=' ( (lv_distanceCST_4_0= RULE_INT ) ) otherlv_5= 'temps' otherlv_6= '=' ( (lv_tempsCST_7_0= RULE_INT ) ) otherlv_8= ')'
            {
            // InternalDrn.g:2641:3: ( (lv_name_0_0= 'down' ) )
            // InternalDrn.g:2642:4: (lv_name_0_0= 'down' )
            {
            // InternalDrn.g:2642:4: (lv_name_0_0= 'down' )
            // InternalDrn.g:2643:5: lv_name_0_0= 'down'
            {
            lv_name_0_0=(Token)match(input,41,FOLLOW_23); 

            					newLeafNode(lv_name_0_0, grammarAccess.getDOWNAccess().getNameDownKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDOWNRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "down");
            				

            }


            }

            otherlv_1=(Token)match(input,28,FOLLOW_27); 

            			newLeafNode(otherlv_1, grammarAccess.getDOWNAccess().getLeftParenthesisKeyword_1());
            		
            otherlv_2=(Token)match(input,35,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getDOWNAccess().getDistanceKeyword_2());
            		
            otherlv_3=(Token)match(input,15,FOLLOW_14); 

            			newLeafNode(otherlv_3, grammarAccess.getDOWNAccess().getEqualsSignKeyword_3());
            		
            // InternalDrn.g:2667:3: ( (lv_distanceCST_4_0= RULE_INT ) )
            // InternalDrn.g:2668:4: (lv_distanceCST_4_0= RULE_INT )
            {
            // InternalDrn.g:2668:4: (lv_distanceCST_4_0= RULE_INT )
            // InternalDrn.g:2669:5: lv_distanceCST_4_0= RULE_INT
            {
            lv_distanceCST_4_0=(Token)match(input,RULE_INT,FOLLOW_28); 

            					newLeafNode(lv_distanceCST_4_0, grammarAccess.getDOWNAccess().getDistanceCSTINTTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDOWNRule());
            					}
            					setWithLastConsumed(
            						current,
            						"distanceCST",
            						lv_distanceCST_4_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_5=(Token)match(input,36,FOLLOW_7); 

            			newLeafNode(otherlv_5, grammarAccess.getDOWNAccess().getTempsKeyword_5());
            		
            otherlv_6=(Token)match(input,15,FOLLOW_14); 

            			newLeafNode(otherlv_6, grammarAccess.getDOWNAccess().getEqualsSignKeyword_6());
            		
            // InternalDrn.g:2693:3: ( (lv_tempsCST_7_0= RULE_INT ) )
            // InternalDrn.g:2694:4: (lv_tempsCST_7_0= RULE_INT )
            {
            // InternalDrn.g:2694:4: (lv_tempsCST_7_0= RULE_INT )
            // InternalDrn.g:2695:5: lv_tempsCST_7_0= RULE_INT
            {
            lv_tempsCST_7_0=(Token)match(input,RULE_INT,FOLLOW_29); 

            					newLeafNode(lv_tempsCST_7_0, grammarAccess.getDOWNAccess().getTempsCSTINTTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDOWNRule());
            					}
            					setWithLastConsumed(
            						current,
            						"tempsCST",
            						lv_tempsCST_7_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_8=(Token)match(input,30,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getDOWNAccess().getRightParenthesisKeyword_8());
            		

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
    // $ANTLR end "ruleDOWN"


    // $ANTLR start "entryRuleDepXY_IMPL"
    // InternalDrn.g:2719:1: entryRuleDepXY_IMPL returns [EObject current=null] : iv_ruleDepXY_IMPL= ruleDepXY_IMPL EOF ;
    public final EObject entryRuleDepXY_IMPL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDepXY_IMPL = null;


        try {
            // InternalDrn.g:2719:51: (iv_ruleDepXY_IMPL= ruleDepXY_IMPL EOF )
            // InternalDrn.g:2720:2: iv_ruleDepXY_IMPL= ruleDepXY_IMPL EOF
            {
             newCompositeNode(grammarAccess.getDepXY_IMPLRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDepXY_IMPL=ruleDepXY_IMPL();

            state._fsp--;

             current =iv_ruleDepXY_IMPL; 
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
    // $ANTLR end "entryRuleDepXY_IMPL"


    // $ANTLR start "ruleDepXY_IMPL"
    // InternalDrn.g:2726:1: ruleDepXY_IMPL returns [EObject current=null] : (this_CERCLEXY_0= ruleCERCLEXY | this_CARREXY_1= ruleCARREXY ) ;
    public final EObject ruleDepXY_IMPL() throws RecognitionException {
        EObject current = null;

        EObject this_CERCLEXY_0 = null;

        EObject this_CARREXY_1 = null;



        	enterRule();

        try {
            // InternalDrn.g:2732:2: ( (this_CERCLEXY_0= ruleCERCLEXY | this_CARREXY_1= ruleCARREXY ) )
            // InternalDrn.g:2733:2: (this_CERCLEXY_0= ruleCERCLEXY | this_CARREXY_1= ruleCARREXY )
            {
            // InternalDrn.g:2733:2: (this_CERCLEXY_0= ruleCERCLEXY | this_CARREXY_1= ruleCARREXY )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==42) ) {
                alt31=1;
            }
            else if ( (LA31_0==44) ) {
                alt31=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // InternalDrn.g:2734:3: this_CERCLEXY_0= ruleCERCLEXY
                    {

                    			newCompositeNode(grammarAccess.getDepXY_IMPLAccess().getCERCLEXYParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_CERCLEXY_0=ruleCERCLEXY();

                    state._fsp--;


                    			current = this_CERCLEXY_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDrn.g:2743:3: this_CARREXY_1= ruleCARREXY
                    {

                    			newCompositeNode(grammarAccess.getDepXY_IMPLAccess().getCARREXYParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_CARREXY_1=ruleCARREXY();

                    state._fsp--;


                    			current = this_CARREXY_1;
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
    // $ANTLR end "ruleDepXY_IMPL"


    // $ANTLR start "entryRuleCERCLEXY"
    // InternalDrn.g:2755:1: entryRuleCERCLEXY returns [EObject current=null] : iv_ruleCERCLEXY= ruleCERCLEXY EOF ;
    public final EObject entryRuleCERCLEXY() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCERCLEXY = null;


        try {
            // InternalDrn.g:2755:49: (iv_ruleCERCLEXY= ruleCERCLEXY EOF )
            // InternalDrn.g:2756:2: iv_ruleCERCLEXY= ruleCERCLEXY EOF
            {
             newCompositeNode(grammarAccess.getCERCLEXYRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCERCLEXY=ruleCERCLEXY();

            state._fsp--;

             current =iv_ruleCERCLEXY; 
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
    // $ANTLR end "entryRuleCERCLEXY"


    // $ANTLR start "ruleCERCLEXY"
    // InternalDrn.g:2762:1: ruleCERCLEXY returns [EObject current=null] : ( ( (lv_name_0_0= 'cercleXY' ) ) otherlv_1= '(' otherlv_2= 'rayon' otherlv_3= '=' ( (lv_rayonCST_4_0= RULE_INT ) ) otherlv_5= 'temps' otherlv_6= '=' ( (lv_tempsCST_7_0= RULE_INT ) ) otherlv_8= ')' ) ;
    public final EObject ruleCERCLEXY() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_rayonCST_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_tempsCST_7_0=null;
        Token otherlv_8=null;


        	enterRule();

        try {
            // InternalDrn.g:2768:2: ( ( ( (lv_name_0_0= 'cercleXY' ) ) otherlv_1= '(' otherlv_2= 'rayon' otherlv_3= '=' ( (lv_rayonCST_4_0= RULE_INT ) ) otherlv_5= 'temps' otherlv_6= '=' ( (lv_tempsCST_7_0= RULE_INT ) ) otherlv_8= ')' ) )
            // InternalDrn.g:2769:2: ( ( (lv_name_0_0= 'cercleXY' ) ) otherlv_1= '(' otherlv_2= 'rayon' otherlv_3= '=' ( (lv_rayonCST_4_0= RULE_INT ) ) otherlv_5= 'temps' otherlv_6= '=' ( (lv_tempsCST_7_0= RULE_INT ) ) otherlv_8= ')' )
            {
            // InternalDrn.g:2769:2: ( ( (lv_name_0_0= 'cercleXY' ) ) otherlv_1= '(' otherlv_2= 'rayon' otherlv_3= '=' ( (lv_rayonCST_4_0= RULE_INT ) ) otherlv_5= 'temps' otherlv_6= '=' ( (lv_tempsCST_7_0= RULE_INT ) ) otherlv_8= ')' )
            // InternalDrn.g:2770:3: ( (lv_name_0_0= 'cercleXY' ) ) otherlv_1= '(' otherlv_2= 'rayon' otherlv_3= '=' ( (lv_rayonCST_4_0= RULE_INT ) ) otherlv_5= 'temps' otherlv_6= '=' ( (lv_tempsCST_7_0= RULE_INT ) ) otherlv_8= ')'
            {
            // InternalDrn.g:2770:3: ( (lv_name_0_0= 'cercleXY' ) )
            // InternalDrn.g:2771:4: (lv_name_0_0= 'cercleXY' )
            {
            // InternalDrn.g:2771:4: (lv_name_0_0= 'cercleXY' )
            // InternalDrn.g:2772:5: lv_name_0_0= 'cercleXY'
            {
            lv_name_0_0=(Token)match(input,42,FOLLOW_23); 

            					newLeafNode(lv_name_0_0, grammarAccess.getCERCLEXYAccess().getNameCercleXYKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCERCLEXYRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "cercleXY");
            				

            }


            }

            otherlv_1=(Token)match(input,28,FOLLOW_30); 

            			newLeafNode(otherlv_1, grammarAccess.getCERCLEXYAccess().getLeftParenthesisKeyword_1());
            		
            otherlv_2=(Token)match(input,43,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getCERCLEXYAccess().getRayonKeyword_2());
            		
            otherlv_3=(Token)match(input,15,FOLLOW_14); 

            			newLeafNode(otherlv_3, grammarAccess.getCERCLEXYAccess().getEqualsSignKeyword_3());
            		
            // InternalDrn.g:2796:3: ( (lv_rayonCST_4_0= RULE_INT ) )
            // InternalDrn.g:2797:4: (lv_rayonCST_4_0= RULE_INT )
            {
            // InternalDrn.g:2797:4: (lv_rayonCST_4_0= RULE_INT )
            // InternalDrn.g:2798:5: lv_rayonCST_4_0= RULE_INT
            {
            lv_rayonCST_4_0=(Token)match(input,RULE_INT,FOLLOW_28); 

            					newLeafNode(lv_rayonCST_4_0, grammarAccess.getCERCLEXYAccess().getRayonCSTINTTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCERCLEXYRule());
            					}
            					setWithLastConsumed(
            						current,
            						"rayonCST",
            						lv_rayonCST_4_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_5=(Token)match(input,36,FOLLOW_7); 

            			newLeafNode(otherlv_5, grammarAccess.getCERCLEXYAccess().getTempsKeyword_5());
            		
            otherlv_6=(Token)match(input,15,FOLLOW_14); 

            			newLeafNode(otherlv_6, grammarAccess.getCERCLEXYAccess().getEqualsSignKeyword_6());
            		
            // InternalDrn.g:2822:3: ( (lv_tempsCST_7_0= RULE_INT ) )
            // InternalDrn.g:2823:4: (lv_tempsCST_7_0= RULE_INT )
            {
            // InternalDrn.g:2823:4: (lv_tempsCST_7_0= RULE_INT )
            // InternalDrn.g:2824:5: lv_tempsCST_7_0= RULE_INT
            {
            lv_tempsCST_7_0=(Token)match(input,RULE_INT,FOLLOW_29); 

            					newLeafNode(lv_tempsCST_7_0, grammarAccess.getCERCLEXYAccess().getTempsCSTINTTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCERCLEXYRule());
            					}
            					setWithLastConsumed(
            						current,
            						"tempsCST",
            						lv_tempsCST_7_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_8=(Token)match(input,30,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getCERCLEXYAccess().getRightParenthesisKeyword_8());
            		

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
    // $ANTLR end "ruleCERCLEXY"


    // $ANTLR start "entryRuleCARREXY"
    // InternalDrn.g:2848:1: entryRuleCARREXY returns [EObject current=null] : iv_ruleCARREXY= ruleCARREXY EOF ;
    public final EObject entryRuleCARREXY() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCARREXY = null;


        try {
            // InternalDrn.g:2848:48: (iv_ruleCARREXY= ruleCARREXY EOF )
            // InternalDrn.g:2849:2: iv_ruleCARREXY= ruleCARREXY EOF
            {
             newCompositeNode(grammarAccess.getCARREXYRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCARREXY=ruleCARREXY();

            state._fsp--;

             current =iv_ruleCARREXY; 
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
    // $ANTLR end "entryRuleCARREXY"


    // $ANTLR start "ruleCARREXY"
    // InternalDrn.g:2855:1: ruleCARREXY returns [EObject current=null] : ( ( (lv_name_0_0= 'carreXY' ) ) otherlv_1= '(' otherlv_2= 'cote' otherlv_3= '=' ( (lv_coteCST_4_0= RULE_INT ) ) otherlv_5= 'temps' otherlv_6= '=' ( (lv_tempsCST_7_0= RULE_INT ) ) otherlv_8= ')' ) ;
    public final EObject ruleCARREXY() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_coteCST_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_tempsCST_7_0=null;
        Token otherlv_8=null;


        	enterRule();

        try {
            // InternalDrn.g:2861:2: ( ( ( (lv_name_0_0= 'carreXY' ) ) otherlv_1= '(' otherlv_2= 'cote' otherlv_3= '=' ( (lv_coteCST_4_0= RULE_INT ) ) otherlv_5= 'temps' otherlv_6= '=' ( (lv_tempsCST_7_0= RULE_INT ) ) otherlv_8= ')' ) )
            // InternalDrn.g:2862:2: ( ( (lv_name_0_0= 'carreXY' ) ) otherlv_1= '(' otherlv_2= 'cote' otherlv_3= '=' ( (lv_coteCST_4_0= RULE_INT ) ) otherlv_5= 'temps' otherlv_6= '=' ( (lv_tempsCST_7_0= RULE_INT ) ) otherlv_8= ')' )
            {
            // InternalDrn.g:2862:2: ( ( (lv_name_0_0= 'carreXY' ) ) otherlv_1= '(' otherlv_2= 'cote' otherlv_3= '=' ( (lv_coteCST_4_0= RULE_INT ) ) otherlv_5= 'temps' otherlv_6= '=' ( (lv_tempsCST_7_0= RULE_INT ) ) otherlv_8= ')' )
            // InternalDrn.g:2863:3: ( (lv_name_0_0= 'carreXY' ) ) otherlv_1= '(' otherlv_2= 'cote' otherlv_3= '=' ( (lv_coteCST_4_0= RULE_INT ) ) otherlv_5= 'temps' otherlv_6= '=' ( (lv_tempsCST_7_0= RULE_INT ) ) otherlv_8= ')'
            {
            // InternalDrn.g:2863:3: ( (lv_name_0_0= 'carreXY' ) )
            // InternalDrn.g:2864:4: (lv_name_0_0= 'carreXY' )
            {
            // InternalDrn.g:2864:4: (lv_name_0_0= 'carreXY' )
            // InternalDrn.g:2865:5: lv_name_0_0= 'carreXY'
            {
            lv_name_0_0=(Token)match(input,44,FOLLOW_23); 

            					newLeafNode(lv_name_0_0, grammarAccess.getCARREXYAccess().getNameCarreXYKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCARREXYRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "carreXY");
            				

            }


            }

            otherlv_1=(Token)match(input,28,FOLLOW_31); 

            			newLeafNode(otherlv_1, grammarAccess.getCARREXYAccess().getLeftParenthesisKeyword_1());
            		
            otherlv_2=(Token)match(input,45,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getCARREXYAccess().getCoteKeyword_2());
            		
            otherlv_3=(Token)match(input,15,FOLLOW_14); 

            			newLeafNode(otherlv_3, grammarAccess.getCARREXYAccess().getEqualsSignKeyword_3());
            		
            // InternalDrn.g:2889:3: ( (lv_coteCST_4_0= RULE_INT ) )
            // InternalDrn.g:2890:4: (lv_coteCST_4_0= RULE_INT )
            {
            // InternalDrn.g:2890:4: (lv_coteCST_4_0= RULE_INT )
            // InternalDrn.g:2891:5: lv_coteCST_4_0= RULE_INT
            {
            lv_coteCST_4_0=(Token)match(input,RULE_INT,FOLLOW_28); 

            					newLeafNode(lv_coteCST_4_0, grammarAccess.getCARREXYAccess().getCoteCSTINTTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCARREXYRule());
            					}
            					setWithLastConsumed(
            						current,
            						"coteCST",
            						lv_coteCST_4_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_5=(Token)match(input,36,FOLLOW_7); 

            			newLeafNode(otherlv_5, grammarAccess.getCARREXYAccess().getTempsKeyword_5());
            		
            otherlv_6=(Token)match(input,15,FOLLOW_14); 

            			newLeafNode(otherlv_6, grammarAccess.getCARREXYAccess().getEqualsSignKeyword_6());
            		
            // InternalDrn.g:2915:3: ( (lv_tempsCST_7_0= RULE_INT ) )
            // InternalDrn.g:2916:4: (lv_tempsCST_7_0= RULE_INT )
            {
            // InternalDrn.g:2916:4: (lv_tempsCST_7_0= RULE_INT )
            // InternalDrn.g:2917:5: lv_tempsCST_7_0= RULE_INT
            {
            lv_tempsCST_7_0=(Token)match(input,RULE_INT,FOLLOW_29); 

            					newLeafNode(lv_tempsCST_7_0, grammarAccess.getCARREXYAccess().getTempsCSTINTTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCARREXYRule());
            					}
            					setWithLastConsumed(
            						current,
            						"tempsCST",
            						lv_tempsCST_7_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_8=(Token)match(input,30,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getCARREXYAccess().getRightParenthesisKeyword_8());
            		

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
    // $ANTLR end "ruleCARREXY"


    // $ANTLR start "entryRuleDepYZ_IMPL"
    // InternalDrn.g:2941:1: entryRuleDepYZ_IMPL returns [EObject current=null] : iv_ruleDepYZ_IMPL= ruleDepYZ_IMPL EOF ;
    public final EObject entryRuleDepYZ_IMPL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDepYZ_IMPL = null;


        try {
            // InternalDrn.g:2941:51: (iv_ruleDepYZ_IMPL= ruleDepYZ_IMPL EOF )
            // InternalDrn.g:2942:2: iv_ruleDepYZ_IMPL= ruleDepYZ_IMPL EOF
            {
             newCompositeNode(grammarAccess.getDepYZ_IMPLRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDepYZ_IMPL=ruleDepYZ_IMPL();

            state._fsp--;

             current =iv_ruleDepYZ_IMPL; 
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
    // $ANTLR end "entryRuleDepYZ_IMPL"


    // $ANTLR start "ruleDepYZ_IMPL"
    // InternalDrn.g:2948:1: ruleDepYZ_IMPL returns [EObject current=null] : (this_CERCLEYZ_0= ruleCERCLEYZ | this_CARREYZ_1= ruleCARREYZ ) ;
    public final EObject ruleDepYZ_IMPL() throws RecognitionException {
        EObject current = null;

        EObject this_CERCLEYZ_0 = null;

        EObject this_CARREYZ_1 = null;



        	enterRule();

        try {
            // InternalDrn.g:2954:2: ( (this_CERCLEYZ_0= ruleCERCLEYZ | this_CARREYZ_1= ruleCARREYZ ) )
            // InternalDrn.g:2955:2: (this_CERCLEYZ_0= ruleCERCLEYZ | this_CARREYZ_1= ruleCARREYZ )
            {
            // InternalDrn.g:2955:2: (this_CERCLEYZ_0= ruleCERCLEYZ | this_CARREYZ_1= ruleCARREYZ )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==46) ) {
                alt32=1;
            }
            else if ( (LA32_0==47) ) {
                alt32=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // InternalDrn.g:2956:3: this_CERCLEYZ_0= ruleCERCLEYZ
                    {

                    			newCompositeNode(grammarAccess.getDepYZ_IMPLAccess().getCERCLEYZParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_CERCLEYZ_0=ruleCERCLEYZ();

                    state._fsp--;


                    			current = this_CERCLEYZ_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDrn.g:2965:3: this_CARREYZ_1= ruleCARREYZ
                    {

                    			newCompositeNode(grammarAccess.getDepYZ_IMPLAccess().getCARREYZParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_CARREYZ_1=ruleCARREYZ();

                    state._fsp--;


                    			current = this_CARREYZ_1;
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
    // $ANTLR end "ruleDepYZ_IMPL"


    // $ANTLR start "entryRuleCERCLEYZ"
    // InternalDrn.g:2977:1: entryRuleCERCLEYZ returns [EObject current=null] : iv_ruleCERCLEYZ= ruleCERCLEYZ EOF ;
    public final EObject entryRuleCERCLEYZ() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCERCLEYZ = null;


        try {
            // InternalDrn.g:2977:49: (iv_ruleCERCLEYZ= ruleCERCLEYZ EOF )
            // InternalDrn.g:2978:2: iv_ruleCERCLEYZ= ruleCERCLEYZ EOF
            {
             newCompositeNode(grammarAccess.getCERCLEYZRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCERCLEYZ=ruleCERCLEYZ();

            state._fsp--;

             current =iv_ruleCERCLEYZ; 
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
    // $ANTLR end "entryRuleCERCLEYZ"


    // $ANTLR start "ruleCERCLEYZ"
    // InternalDrn.g:2984:1: ruleCERCLEYZ returns [EObject current=null] : ( ( (lv_name_0_0= 'cercleYZ' ) ) otherlv_1= '(' otherlv_2= 'rayon' otherlv_3= '=' ( (lv_rayonCST_4_0= RULE_INT ) ) otherlv_5= 'temps' otherlv_6= '=' ( (lv_tempsCST_7_0= RULE_INT ) ) otherlv_8= ')' ) ;
    public final EObject ruleCERCLEYZ() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_rayonCST_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_tempsCST_7_0=null;
        Token otherlv_8=null;


        	enterRule();

        try {
            // InternalDrn.g:2990:2: ( ( ( (lv_name_0_0= 'cercleYZ' ) ) otherlv_1= '(' otherlv_2= 'rayon' otherlv_3= '=' ( (lv_rayonCST_4_0= RULE_INT ) ) otherlv_5= 'temps' otherlv_6= '=' ( (lv_tempsCST_7_0= RULE_INT ) ) otherlv_8= ')' ) )
            // InternalDrn.g:2991:2: ( ( (lv_name_0_0= 'cercleYZ' ) ) otherlv_1= '(' otherlv_2= 'rayon' otherlv_3= '=' ( (lv_rayonCST_4_0= RULE_INT ) ) otherlv_5= 'temps' otherlv_6= '=' ( (lv_tempsCST_7_0= RULE_INT ) ) otherlv_8= ')' )
            {
            // InternalDrn.g:2991:2: ( ( (lv_name_0_0= 'cercleYZ' ) ) otherlv_1= '(' otherlv_2= 'rayon' otherlv_3= '=' ( (lv_rayonCST_4_0= RULE_INT ) ) otherlv_5= 'temps' otherlv_6= '=' ( (lv_tempsCST_7_0= RULE_INT ) ) otherlv_8= ')' )
            // InternalDrn.g:2992:3: ( (lv_name_0_0= 'cercleYZ' ) ) otherlv_1= '(' otherlv_2= 'rayon' otherlv_3= '=' ( (lv_rayonCST_4_0= RULE_INT ) ) otherlv_5= 'temps' otherlv_6= '=' ( (lv_tempsCST_7_0= RULE_INT ) ) otherlv_8= ')'
            {
            // InternalDrn.g:2992:3: ( (lv_name_0_0= 'cercleYZ' ) )
            // InternalDrn.g:2993:4: (lv_name_0_0= 'cercleYZ' )
            {
            // InternalDrn.g:2993:4: (lv_name_0_0= 'cercleYZ' )
            // InternalDrn.g:2994:5: lv_name_0_0= 'cercleYZ'
            {
            lv_name_0_0=(Token)match(input,46,FOLLOW_23); 

            					newLeafNode(lv_name_0_0, grammarAccess.getCERCLEYZAccess().getNameCercleYZKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCERCLEYZRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "cercleYZ");
            				

            }


            }

            otherlv_1=(Token)match(input,28,FOLLOW_30); 

            			newLeafNode(otherlv_1, grammarAccess.getCERCLEYZAccess().getLeftParenthesisKeyword_1());
            		
            otherlv_2=(Token)match(input,43,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getCERCLEYZAccess().getRayonKeyword_2());
            		
            otherlv_3=(Token)match(input,15,FOLLOW_14); 

            			newLeafNode(otherlv_3, grammarAccess.getCERCLEYZAccess().getEqualsSignKeyword_3());
            		
            // InternalDrn.g:3018:3: ( (lv_rayonCST_4_0= RULE_INT ) )
            // InternalDrn.g:3019:4: (lv_rayonCST_4_0= RULE_INT )
            {
            // InternalDrn.g:3019:4: (lv_rayonCST_4_0= RULE_INT )
            // InternalDrn.g:3020:5: lv_rayonCST_4_0= RULE_INT
            {
            lv_rayonCST_4_0=(Token)match(input,RULE_INT,FOLLOW_28); 

            					newLeafNode(lv_rayonCST_4_0, grammarAccess.getCERCLEYZAccess().getRayonCSTINTTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCERCLEYZRule());
            					}
            					setWithLastConsumed(
            						current,
            						"rayonCST",
            						lv_rayonCST_4_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_5=(Token)match(input,36,FOLLOW_7); 

            			newLeafNode(otherlv_5, grammarAccess.getCERCLEYZAccess().getTempsKeyword_5());
            		
            otherlv_6=(Token)match(input,15,FOLLOW_14); 

            			newLeafNode(otherlv_6, grammarAccess.getCERCLEYZAccess().getEqualsSignKeyword_6());
            		
            // InternalDrn.g:3044:3: ( (lv_tempsCST_7_0= RULE_INT ) )
            // InternalDrn.g:3045:4: (lv_tempsCST_7_0= RULE_INT )
            {
            // InternalDrn.g:3045:4: (lv_tempsCST_7_0= RULE_INT )
            // InternalDrn.g:3046:5: lv_tempsCST_7_0= RULE_INT
            {
            lv_tempsCST_7_0=(Token)match(input,RULE_INT,FOLLOW_29); 

            					newLeafNode(lv_tempsCST_7_0, grammarAccess.getCERCLEYZAccess().getTempsCSTINTTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCERCLEYZRule());
            					}
            					setWithLastConsumed(
            						current,
            						"tempsCST",
            						lv_tempsCST_7_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_8=(Token)match(input,30,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getCERCLEYZAccess().getRightParenthesisKeyword_8());
            		

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
    // $ANTLR end "ruleCERCLEYZ"


    // $ANTLR start "entryRuleCARREYZ"
    // InternalDrn.g:3070:1: entryRuleCARREYZ returns [EObject current=null] : iv_ruleCARREYZ= ruleCARREYZ EOF ;
    public final EObject entryRuleCARREYZ() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCARREYZ = null;


        try {
            // InternalDrn.g:3070:48: (iv_ruleCARREYZ= ruleCARREYZ EOF )
            // InternalDrn.g:3071:2: iv_ruleCARREYZ= ruleCARREYZ EOF
            {
             newCompositeNode(grammarAccess.getCARREYZRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCARREYZ=ruleCARREYZ();

            state._fsp--;

             current =iv_ruleCARREYZ; 
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
    // $ANTLR end "entryRuleCARREYZ"


    // $ANTLR start "ruleCARREYZ"
    // InternalDrn.g:3077:1: ruleCARREYZ returns [EObject current=null] : ( ( (lv_name_0_0= 'carreYZ' ) ) otherlv_1= '(' otherlv_2= 'cote' otherlv_3= '=' ( (lv_coteCST_4_0= RULE_INT ) ) otherlv_5= 'temps' otherlv_6= '=' ( (lv_tempsCST_7_0= RULE_INT ) ) otherlv_8= ')' ) ;
    public final EObject ruleCARREYZ() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_coteCST_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_tempsCST_7_0=null;
        Token otherlv_8=null;


        	enterRule();

        try {
            // InternalDrn.g:3083:2: ( ( ( (lv_name_0_0= 'carreYZ' ) ) otherlv_1= '(' otherlv_2= 'cote' otherlv_3= '=' ( (lv_coteCST_4_0= RULE_INT ) ) otherlv_5= 'temps' otherlv_6= '=' ( (lv_tempsCST_7_0= RULE_INT ) ) otherlv_8= ')' ) )
            // InternalDrn.g:3084:2: ( ( (lv_name_0_0= 'carreYZ' ) ) otherlv_1= '(' otherlv_2= 'cote' otherlv_3= '=' ( (lv_coteCST_4_0= RULE_INT ) ) otherlv_5= 'temps' otherlv_6= '=' ( (lv_tempsCST_7_0= RULE_INT ) ) otherlv_8= ')' )
            {
            // InternalDrn.g:3084:2: ( ( (lv_name_0_0= 'carreYZ' ) ) otherlv_1= '(' otherlv_2= 'cote' otherlv_3= '=' ( (lv_coteCST_4_0= RULE_INT ) ) otherlv_5= 'temps' otherlv_6= '=' ( (lv_tempsCST_7_0= RULE_INT ) ) otherlv_8= ')' )
            // InternalDrn.g:3085:3: ( (lv_name_0_0= 'carreYZ' ) ) otherlv_1= '(' otherlv_2= 'cote' otherlv_3= '=' ( (lv_coteCST_4_0= RULE_INT ) ) otherlv_5= 'temps' otherlv_6= '=' ( (lv_tempsCST_7_0= RULE_INT ) ) otherlv_8= ')'
            {
            // InternalDrn.g:3085:3: ( (lv_name_0_0= 'carreYZ' ) )
            // InternalDrn.g:3086:4: (lv_name_0_0= 'carreYZ' )
            {
            // InternalDrn.g:3086:4: (lv_name_0_0= 'carreYZ' )
            // InternalDrn.g:3087:5: lv_name_0_0= 'carreYZ'
            {
            lv_name_0_0=(Token)match(input,47,FOLLOW_23); 

            					newLeafNode(lv_name_0_0, grammarAccess.getCARREYZAccess().getNameCarreYZKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCARREYZRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "carreYZ");
            				

            }


            }

            otherlv_1=(Token)match(input,28,FOLLOW_31); 

            			newLeafNode(otherlv_1, grammarAccess.getCARREYZAccess().getLeftParenthesisKeyword_1());
            		
            otherlv_2=(Token)match(input,45,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getCARREYZAccess().getCoteKeyword_2());
            		
            otherlv_3=(Token)match(input,15,FOLLOW_14); 

            			newLeafNode(otherlv_3, grammarAccess.getCARREYZAccess().getEqualsSignKeyword_3());
            		
            // InternalDrn.g:3111:3: ( (lv_coteCST_4_0= RULE_INT ) )
            // InternalDrn.g:3112:4: (lv_coteCST_4_0= RULE_INT )
            {
            // InternalDrn.g:3112:4: (lv_coteCST_4_0= RULE_INT )
            // InternalDrn.g:3113:5: lv_coteCST_4_0= RULE_INT
            {
            lv_coteCST_4_0=(Token)match(input,RULE_INT,FOLLOW_28); 

            					newLeafNode(lv_coteCST_4_0, grammarAccess.getCARREYZAccess().getCoteCSTINTTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCARREYZRule());
            					}
            					setWithLastConsumed(
            						current,
            						"coteCST",
            						lv_coteCST_4_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_5=(Token)match(input,36,FOLLOW_7); 

            			newLeafNode(otherlv_5, grammarAccess.getCARREYZAccess().getTempsKeyword_5());
            		
            otherlv_6=(Token)match(input,15,FOLLOW_14); 

            			newLeafNode(otherlv_6, grammarAccess.getCARREYZAccess().getEqualsSignKeyword_6());
            		
            // InternalDrn.g:3137:3: ( (lv_tempsCST_7_0= RULE_INT ) )
            // InternalDrn.g:3138:4: (lv_tempsCST_7_0= RULE_INT )
            {
            // InternalDrn.g:3138:4: (lv_tempsCST_7_0= RULE_INT )
            // InternalDrn.g:3139:5: lv_tempsCST_7_0= RULE_INT
            {
            lv_tempsCST_7_0=(Token)match(input,RULE_INT,FOLLOW_29); 

            					newLeafNode(lv_tempsCST_7_0, grammarAccess.getCARREYZAccess().getTempsCSTINTTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCARREYZRule());
            					}
            					setWithLastConsumed(
            						current,
            						"tempsCST",
            						lv_tempsCST_7_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_8=(Token)match(input,30,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getCARREYZAccess().getRightParenthesisKeyword_8());
            		

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
    // $ANTLR end "ruleCARREYZ"


    // $ANTLR start "entryRuleDepXZ_IMPL"
    // InternalDrn.g:3163:1: entryRuleDepXZ_IMPL returns [EObject current=null] : iv_ruleDepXZ_IMPL= ruleDepXZ_IMPL EOF ;
    public final EObject entryRuleDepXZ_IMPL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDepXZ_IMPL = null;


        try {
            // InternalDrn.g:3163:51: (iv_ruleDepXZ_IMPL= ruleDepXZ_IMPL EOF )
            // InternalDrn.g:3164:2: iv_ruleDepXZ_IMPL= ruleDepXZ_IMPL EOF
            {
             newCompositeNode(grammarAccess.getDepXZ_IMPLRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDepXZ_IMPL=ruleDepXZ_IMPL();

            state._fsp--;

             current =iv_ruleDepXZ_IMPL; 
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
    // $ANTLR end "entryRuleDepXZ_IMPL"


    // $ANTLR start "ruleDepXZ_IMPL"
    // InternalDrn.g:3170:1: ruleDepXZ_IMPL returns [EObject current=null] : (this_CERCLEXZ_0= ruleCERCLEXZ | this_CARREXZ_1= ruleCARREXZ ) ;
    public final EObject ruleDepXZ_IMPL() throws RecognitionException {
        EObject current = null;

        EObject this_CERCLEXZ_0 = null;

        EObject this_CARREXZ_1 = null;



        	enterRule();

        try {
            // InternalDrn.g:3176:2: ( (this_CERCLEXZ_0= ruleCERCLEXZ | this_CARREXZ_1= ruleCARREXZ ) )
            // InternalDrn.g:3177:2: (this_CERCLEXZ_0= ruleCERCLEXZ | this_CARREXZ_1= ruleCARREXZ )
            {
            // InternalDrn.g:3177:2: (this_CERCLEXZ_0= ruleCERCLEXZ | this_CARREXZ_1= ruleCARREXZ )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==48) ) {
                alt33=1;
            }
            else if ( (LA33_0==49) ) {
                alt33=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // InternalDrn.g:3178:3: this_CERCLEXZ_0= ruleCERCLEXZ
                    {

                    			newCompositeNode(grammarAccess.getDepXZ_IMPLAccess().getCERCLEXZParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_CERCLEXZ_0=ruleCERCLEXZ();

                    state._fsp--;


                    			current = this_CERCLEXZ_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDrn.g:3187:3: this_CARREXZ_1= ruleCARREXZ
                    {

                    			newCompositeNode(grammarAccess.getDepXZ_IMPLAccess().getCARREXZParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_CARREXZ_1=ruleCARREXZ();

                    state._fsp--;


                    			current = this_CARREXZ_1;
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
    // $ANTLR end "ruleDepXZ_IMPL"


    // $ANTLR start "entryRuleCERCLEXZ"
    // InternalDrn.g:3199:1: entryRuleCERCLEXZ returns [EObject current=null] : iv_ruleCERCLEXZ= ruleCERCLEXZ EOF ;
    public final EObject entryRuleCERCLEXZ() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCERCLEXZ = null;


        try {
            // InternalDrn.g:3199:49: (iv_ruleCERCLEXZ= ruleCERCLEXZ EOF )
            // InternalDrn.g:3200:2: iv_ruleCERCLEXZ= ruleCERCLEXZ EOF
            {
             newCompositeNode(grammarAccess.getCERCLEXZRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCERCLEXZ=ruleCERCLEXZ();

            state._fsp--;

             current =iv_ruleCERCLEXZ; 
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
    // $ANTLR end "entryRuleCERCLEXZ"


    // $ANTLR start "ruleCERCLEXZ"
    // InternalDrn.g:3206:1: ruleCERCLEXZ returns [EObject current=null] : ( ( (lv_name_0_0= 'cercleXZ' ) ) otherlv_1= '(' otherlv_2= 'rayon' otherlv_3= '=' ( (lv_rayonCST_4_0= RULE_INT ) ) otherlv_5= 'temps' otherlv_6= '=' ( (lv_tempsCST_7_0= RULE_INT ) ) otherlv_8= ')' ) ;
    public final EObject ruleCERCLEXZ() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_rayonCST_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_tempsCST_7_0=null;
        Token otherlv_8=null;


        	enterRule();

        try {
            // InternalDrn.g:3212:2: ( ( ( (lv_name_0_0= 'cercleXZ' ) ) otherlv_1= '(' otherlv_2= 'rayon' otherlv_3= '=' ( (lv_rayonCST_4_0= RULE_INT ) ) otherlv_5= 'temps' otherlv_6= '=' ( (lv_tempsCST_7_0= RULE_INT ) ) otherlv_8= ')' ) )
            // InternalDrn.g:3213:2: ( ( (lv_name_0_0= 'cercleXZ' ) ) otherlv_1= '(' otherlv_2= 'rayon' otherlv_3= '=' ( (lv_rayonCST_4_0= RULE_INT ) ) otherlv_5= 'temps' otherlv_6= '=' ( (lv_tempsCST_7_0= RULE_INT ) ) otherlv_8= ')' )
            {
            // InternalDrn.g:3213:2: ( ( (lv_name_0_0= 'cercleXZ' ) ) otherlv_1= '(' otherlv_2= 'rayon' otherlv_3= '=' ( (lv_rayonCST_4_0= RULE_INT ) ) otherlv_5= 'temps' otherlv_6= '=' ( (lv_tempsCST_7_0= RULE_INT ) ) otherlv_8= ')' )
            // InternalDrn.g:3214:3: ( (lv_name_0_0= 'cercleXZ' ) ) otherlv_1= '(' otherlv_2= 'rayon' otherlv_3= '=' ( (lv_rayonCST_4_0= RULE_INT ) ) otherlv_5= 'temps' otherlv_6= '=' ( (lv_tempsCST_7_0= RULE_INT ) ) otherlv_8= ')'
            {
            // InternalDrn.g:3214:3: ( (lv_name_0_0= 'cercleXZ' ) )
            // InternalDrn.g:3215:4: (lv_name_0_0= 'cercleXZ' )
            {
            // InternalDrn.g:3215:4: (lv_name_0_0= 'cercleXZ' )
            // InternalDrn.g:3216:5: lv_name_0_0= 'cercleXZ'
            {
            lv_name_0_0=(Token)match(input,48,FOLLOW_23); 

            					newLeafNode(lv_name_0_0, grammarAccess.getCERCLEXZAccess().getNameCercleXZKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCERCLEXZRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "cercleXZ");
            				

            }


            }

            otherlv_1=(Token)match(input,28,FOLLOW_30); 

            			newLeafNode(otherlv_1, grammarAccess.getCERCLEXZAccess().getLeftParenthesisKeyword_1());
            		
            otherlv_2=(Token)match(input,43,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getCERCLEXZAccess().getRayonKeyword_2());
            		
            otherlv_3=(Token)match(input,15,FOLLOW_14); 

            			newLeafNode(otherlv_3, grammarAccess.getCERCLEXZAccess().getEqualsSignKeyword_3());
            		
            // InternalDrn.g:3240:3: ( (lv_rayonCST_4_0= RULE_INT ) )
            // InternalDrn.g:3241:4: (lv_rayonCST_4_0= RULE_INT )
            {
            // InternalDrn.g:3241:4: (lv_rayonCST_4_0= RULE_INT )
            // InternalDrn.g:3242:5: lv_rayonCST_4_0= RULE_INT
            {
            lv_rayonCST_4_0=(Token)match(input,RULE_INT,FOLLOW_28); 

            					newLeafNode(lv_rayonCST_4_0, grammarAccess.getCERCLEXZAccess().getRayonCSTINTTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCERCLEXZRule());
            					}
            					setWithLastConsumed(
            						current,
            						"rayonCST",
            						lv_rayonCST_4_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_5=(Token)match(input,36,FOLLOW_7); 

            			newLeafNode(otherlv_5, grammarAccess.getCERCLEXZAccess().getTempsKeyword_5());
            		
            otherlv_6=(Token)match(input,15,FOLLOW_14); 

            			newLeafNode(otherlv_6, grammarAccess.getCERCLEXZAccess().getEqualsSignKeyword_6());
            		
            // InternalDrn.g:3266:3: ( (lv_tempsCST_7_0= RULE_INT ) )
            // InternalDrn.g:3267:4: (lv_tempsCST_7_0= RULE_INT )
            {
            // InternalDrn.g:3267:4: (lv_tempsCST_7_0= RULE_INT )
            // InternalDrn.g:3268:5: lv_tempsCST_7_0= RULE_INT
            {
            lv_tempsCST_7_0=(Token)match(input,RULE_INT,FOLLOW_29); 

            					newLeafNode(lv_tempsCST_7_0, grammarAccess.getCERCLEXZAccess().getTempsCSTINTTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCERCLEXZRule());
            					}
            					setWithLastConsumed(
            						current,
            						"tempsCST",
            						lv_tempsCST_7_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_8=(Token)match(input,30,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getCERCLEXZAccess().getRightParenthesisKeyword_8());
            		

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
    // $ANTLR end "ruleCERCLEXZ"


    // $ANTLR start "entryRuleCARREXZ"
    // InternalDrn.g:3292:1: entryRuleCARREXZ returns [EObject current=null] : iv_ruleCARREXZ= ruleCARREXZ EOF ;
    public final EObject entryRuleCARREXZ() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCARREXZ = null;


        try {
            // InternalDrn.g:3292:48: (iv_ruleCARREXZ= ruleCARREXZ EOF )
            // InternalDrn.g:3293:2: iv_ruleCARREXZ= ruleCARREXZ EOF
            {
             newCompositeNode(grammarAccess.getCARREXZRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCARREXZ=ruleCARREXZ();

            state._fsp--;

             current =iv_ruleCARREXZ; 
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
    // $ANTLR end "entryRuleCARREXZ"


    // $ANTLR start "ruleCARREXZ"
    // InternalDrn.g:3299:1: ruleCARREXZ returns [EObject current=null] : ( ( (lv_name_0_0= 'carreXZ' ) ) otherlv_1= '(' otherlv_2= 'cote' otherlv_3= '=' ( (lv_coteCST_4_0= RULE_INT ) ) otherlv_5= 'temps' otherlv_6= '=' ( (lv_tempsCST_7_0= RULE_INT ) ) otherlv_8= ')' ) ;
    public final EObject ruleCARREXZ() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_coteCST_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_tempsCST_7_0=null;
        Token otherlv_8=null;


        	enterRule();

        try {
            // InternalDrn.g:3305:2: ( ( ( (lv_name_0_0= 'carreXZ' ) ) otherlv_1= '(' otherlv_2= 'cote' otherlv_3= '=' ( (lv_coteCST_4_0= RULE_INT ) ) otherlv_5= 'temps' otherlv_6= '=' ( (lv_tempsCST_7_0= RULE_INT ) ) otherlv_8= ')' ) )
            // InternalDrn.g:3306:2: ( ( (lv_name_0_0= 'carreXZ' ) ) otherlv_1= '(' otherlv_2= 'cote' otherlv_3= '=' ( (lv_coteCST_4_0= RULE_INT ) ) otherlv_5= 'temps' otherlv_6= '=' ( (lv_tempsCST_7_0= RULE_INT ) ) otherlv_8= ')' )
            {
            // InternalDrn.g:3306:2: ( ( (lv_name_0_0= 'carreXZ' ) ) otherlv_1= '(' otherlv_2= 'cote' otherlv_3= '=' ( (lv_coteCST_4_0= RULE_INT ) ) otherlv_5= 'temps' otherlv_6= '=' ( (lv_tempsCST_7_0= RULE_INT ) ) otherlv_8= ')' )
            // InternalDrn.g:3307:3: ( (lv_name_0_0= 'carreXZ' ) ) otherlv_1= '(' otherlv_2= 'cote' otherlv_3= '=' ( (lv_coteCST_4_0= RULE_INT ) ) otherlv_5= 'temps' otherlv_6= '=' ( (lv_tempsCST_7_0= RULE_INT ) ) otherlv_8= ')'
            {
            // InternalDrn.g:3307:3: ( (lv_name_0_0= 'carreXZ' ) )
            // InternalDrn.g:3308:4: (lv_name_0_0= 'carreXZ' )
            {
            // InternalDrn.g:3308:4: (lv_name_0_0= 'carreXZ' )
            // InternalDrn.g:3309:5: lv_name_0_0= 'carreXZ'
            {
            lv_name_0_0=(Token)match(input,49,FOLLOW_23); 

            					newLeafNode(lv_name_0_0, grammarAccess.getCARREXZAccess().getNameCarreXZKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCARREXZRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "carreXZ");
            				

            }


            }

            otherlv_1=(Token)match(input,28,FOLLOW_31); 

            			newLeafNode(otherlv_1, grammarAccess.getCARREXZAccess().getLeftParenthesisKeyword_1());
            		
            otherlv_2=(Token)match(input,45,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getCARREXZAccess().getCoteKeyword_2());
            		
            otherlv_3=(Token)match(input,15,FOLLOW_14); 

            			newLeafNode(otherlv_3, grammarAccess.getCARREXZAccess().getEqualsSignKeyword_3());
            		
            // InternalDrn.g:3333:3: ( (lv_coteCST_4_0= RULE_INT ) )
            // InternalDrn.g:3334:4: (lv_coteCST_4_0= RULE_INT )
            {
            // InternalDrn.g:3334:4: (lv_coteCST_4_0= RULE_INT )
            // InternalDrn.g:3335:5: lv_coteCST_4_0= RULE_INT
            {
            lv_coteCST_4_0=(Token)match(input,RULE_INT,FOLLOW_28); 

            					newLeafNode(lv_coteCST_4_0, grammarAccess.getCARREXZAccess().getCoteCSTINTTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCARREXZRule());
            					}
            					setWithLastConsumed(
            						current,
            						"coteCST",
            						lv_coteCST_4_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_5=(Token)match(input,36,FOLLOW_7); 

            			newLeafNode(otherlv_5, grammarAccess.getCARREXZAccess().getTempsKeyword_5());
            		
            otherlv_6=(Token)match(input,15,FOLLOW_14); 

            			newLeafNode(otherlv_6, grammarAccess.getCARREXZAccess().getEqualsSignKeyword_6());
            		
            // InternalDrn.g:3359:3: ( (lv_tempsCST_7_0= RULE_INT ) )
            // InternalDrn.g:3360:4: (lv_tempsCST_7_0= RULE_INT )
            {
            // InternalDrn.g:3360:4: (lv_tempsCST_7_0= RULE_INT )
            // InternalDrn.g:3361:5: lv_tempsCST_7_0= RULE_INT
            {
            lv_tempsCST_7_0=(Token)match(input,RULE_INT,FOLLOW_29); 

            					newLeafNode(lv_tempsCST_7_0, grammarAccess.getCARREXZAccess().getTempsCSTINTTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCARREXZRule());
            					}
            					setWithLastConsumed(
            						current,
            						"tempsCST",
            						lv_tempsCST_7_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_8=(Token)match(input,30,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getCARREXZAccess().getRightParenthesisKeyword_8());
            		

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
    // $ANTLR end "ruleCARREXZ"


    // $ANTLR start "entryRuleDepXYZ_IMPL"
    // InternalDrn.g:3385:1: entryRuleDepXYZ_IMPL returns [EObject current=null] : iv_ruleDepXYZ_IMPL= ruleDepXYZ_IMPL EOF ;
    public final EObject entryRuleDepXYZ_IMPL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDepXYZ_IMPL = null;


        try {
            // InternalDrn.g:3385:52: (iv_ruleDepXYZ_IMPL= ruleDepXYZ_IMPL EOF )
            // InternalDrn.g:3386:2: iv_ruleDepXYZ_IMPL= ruleDepXYZ_IMPL EOF
            {
             newCompositeNode(grammarAccess.getDepXYZ_IMPLRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDepXYZ_IMPL=ruleDepXYZ_IMPL();

            state._fsp--;

             current =iv_ruleDepXYZ_IMPL; 
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
    // $ANTLR end "entryRuleDepXYZ_IMPL"


    // $ANTLR start "ruleDepXYZ_IMPL"
    // InternalDrn.g:3392:1: ruleDepXYZ_IMPL returns [EObject current=null] : this_Flip_0= ruleFlip ;
    public final EObject ruleDepXYZ_IMPL() throws RecognitionException {
        EObject current = null;

        EObject this_Flip_0 = null;



        	enterRule();

        try {
            // InternalDrn.g:3398:2: (this_Flip_0= ruleFlip )
            // InternalDrn.g:3399:2: this_Flip_0= ruleFlip
            {

            		newCompositeNode(grammarAccess.getDepXYZ_IMPLAccess().getFlipParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_Flip_0=ruleFlip();

            state._fsp--;


            		current = this_Flip_0;
            		afterParserOrEnumRuleCall();
            	

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
    // $ANTLR end "ruleDepXYZ_IMPL"


    // $ANTLR start "entryRuleFlip"
    // InternalDrn.g:3410:1: entryRuleFlip returns [EObject current=null] : iv_ruleFlip= ruleFlip EOF ;
    public final EObject entryRuleFlip() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFlip = null;


        try {
            // InternalDrn.g:3410:45: (iv_ruleFlip= ruleFlip EOF )
            // InternalDrn.g:3411:2: iv_ruleFlip= ruleFlip EOF
            {
             newCompositeNode(grammarAccess.getFlipRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFlip=ruleFlip();

            state._fsp--;

             current =iv_ruleFlip; 
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
    // $ANTLR end "entryRuleFlip"


    // $ANTLR start "ruleFlip"
    // InternalDrn.g:3417:1: ruleFlip returns [EObject current=null] : ( ( (lv_name_0_0= 'flip' ) ) otherlv_1= '(' otherlv_2= ')' ) ;
    public final EObject ruleFlip() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalDrn.g:3423:2: ( ( ( (lv_name_0_0= 'flip' ) ) otherlv_1= '(' otherlv_2= ')' ) )
            // InternalDrn.g:3424:2: ( ( (lv_name_0_0= 'flip' ) ) otherlv_1= '(' otherlv_2= ')' )
            {
            // InternalDrn.g:3424:2: ( ( (lv_name_0_0= 'flip' ) ) otherlv_1= '(' otherlv_2= ')' )
            // InternalDrn.g:3425:3: ( (lv_name_0_0= 'flip' ) ) otherlv_1= '(' otherlv_2= ')'
            {
            // InternalDrn.g:3425:3: ( (lv_name_0_0= 'flip' ) )
            // InternalDrn.g:3426:4: (lv_name_0_0= 'flip' )
            {
            // InternalDrn.g:3426:4: (lv_name_0_0= 'flip' )
            // InternalDrn.g:3427:5: lv_name_0_0= 'flip'
            {
            lv_name_0_0=(Token)match(input,50,FOLLOW_23); 

            					newLeafNode(lv_name_0_0, grammarAccess.getFlipAccess().getNameFlipKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFlipRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "flip");
            				

            }


            }

            otherlv_1=(Token)match(input,28,FOLLOW_29); 

            			newLeafNode(otherlv_1, grammarAccess.getFlipAccess().getLeftParenthesisKeyword_1());
            		
            otherlv_2=(Token)match(input,30,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getFlipAccess().getRightParenthesisKeyword_2());
            		

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
    // $ANTLR end "ruleFlip"


    // $ANTLR start "entryRuleRotate"
    // InternalDrn.g:3451:1: entryRuleRotate returns [EObject current=null] : iv_ruleRotate= ruleRotate EOF ;
    public final EObject entryRuleRotate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRotate = null;


        try {
            // InternalDrn.g:3451:47: (iv_ruleRotate= ruleRotate EOF )
            // InternalDrn.g:3452:2: iv_ruleRotate= ruleRotate EOF
            {
             newCompositeNode(grammarAccess.getRotateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRotate=ruleRotate();

            state._fsp--;

             current =iv_ruleRotate; 
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
    // $ANTLR end "entryRuleRotate"


    // $ANTLR start "ruleRotate"
    // InternalDrn.g:3458:1: ruleRotate returns [EObject current=null] : ( ( (lv_name_0_0= 'rotate' ) ) otherlv_1= '(' otherlv_2= 'angle' otherlv_3= '=' ( (lv_angleCST_4_0= ruleEInt ) ) otherlv_5= 'temps' otherlv_6= '=' ( (lv_tempsCST_7_0= RULE_INT ) ) otherlv_8= ')' ) ;
    public final EObject ruleRotate() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_tempsCST_7_0=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_angleCST_4_0 = null;



        	enterRule();

        try {
            // InternalDrn.g:3464:2: ( ( ( (lv_name_0_0= 'rotate' ) ) otherlv_1= '(' otherlv_2= 'angle' otherlv_3= '=' ( (lv_angleCST_4_0= ruleEInt ) ) otherlv_5= 'temps' otherlv_6= '=' ( (lv_tempsCST_7_0= RULE_INT ) ) otherlv_8= ')' ) )
            // InternalDrn.g:3465:2: ( ( (lv_name_0_0= 'rotate' ) ) otherlv_1= '(' otherlv_2= 'angle' otherlv_3= '=' ( (lv_angleCST_4_0= ruleEInt ) ) otherlv_5= 'temps' otherlv_6= '=' ( (lv_tempsCST_7_0= RULE_INT ) ) otherlv_8= ')' )
            {
            // InternalDrn.g:3465:2: ( ( (lv_name_0_0= 'rotate' ) ) otherlv_1= '(' otherlv_2= 'angle' otherlv_3= '=' ( (lv_angleCST_4_0= ruleEInt ) ) otherlv_5= 'temps' otherlv_6= '=' ( (lv_tempsCST_7_0= RULE_INT ) ) otherlv_8= ')' )
            // InternalDrn.g:3466:3: ( (lv_name_0_0= 'rotate' ) ) otherlv_1= '(' otherlv_2= 'angle' otherlv_3= '=' ( (lv_angleCST_4_0= ruleEInt ) ) otherlv_5= 'temps' otherlv_6= '=' ( (lv_tempsCST_7_0= RULE_INT ) ) otherlv_8= ')'
            {
            // InternalDrn.g:3466:3: ( (lv_name_0_0= 'rotate' ) )
            // InternalDrn.g:3467:4: (lv_name_0_0= 'rotate' )
            {
            // InternalDrn.g:3467:4: (lv_name_0_0= 'rotate' )
            // InternalDrn.g:3468:5: lv_name_0_0= 'rotate'
            {
            lv_name_0_0=(Token)match(input,51,FOLLOW_23); 

            					newLeafNode(lv_name_0_0, grammarAccess.getRotateAccess().getNameRotateKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRotateRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "rotate");
            				

            }


            }

            otherlv_1=(Token)match(input,28,FOLLOW_32); 

            			newLeafNode(otherlv_1, grammarAccess.getRotateAccess().getLeftParenthesisKeyword_1());
            		
            otherlv_2=(Token)match(input,52,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getRotateAccess().getAngleKeyword_2());
            		
            otherlv_3=(Token)match(input,15,FOLLOW_33); 

            			newLeafNode(otherlv_3, grammarAccess.getRotateAccess().getEqualsSignKeyword_3());
            		
            // InternalDrn.g:3492:3: ( (lv_angleCST_4_0= ruleEInt ) )
            // InternalDrn.g:3493:4: (lv_angleCST_4_0= ruleEInt )
            {
            // InternalDrn.g:3493:4: (lv_angleCST_4_0= ruleEInt )
            // InternalDrn.g:3494:5: lv_angleCST_4_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getRotateAccess().getAngleCSTEIntParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_28);
            lv_angleCST_4_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRotateRule());
            					}
            					set(
            						current,
            						"angleCST",
            						lv_angleCST_4_0,
            						"sar.drone.Drn.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,36,FOLLOW_7); 

            			newLeafNode(otherlv_5, grammarAccess.getRotateAccess().getTempsKeyword_5());
            		
            otherlv_6=(Token)match(input,15,FOLLOW_14); 

            			newLeafNode(otherlv_6, grammarAccess.getRotateAccess().getEqualsSignKeyword_6());
            		
            // InternalDrn.g:3519:3: ( (lv_tempsCST_7_0= RULE_INT ) )
            // InternalDrn.g:3520:4: (lv_tempsCST_7_0= RULE_INT )
            {
            // InternalDrn.g:3520:4: (lv_tempsCST_7_0= RULE_INT )
            // InternalDrn.g:3521:5: lv_tempsCST_7_0= RULE_INT
            {
            lv_tempsCST_7_0=(Token)match(input,RULE_INT,FOLLOW_29); 

            					newLeafNode(lv_tempsCST_7_0, grammarAccess.getRotateAccess().getTempsCSTINTTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRotateRule());
            					}
            					setWithLastConsumed(
            						current,
            						"tempsCST",
            						lv_tempsCST_7_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_8=(Token)match(input,30,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getRotateAccess().getRightParenthesisKeyword_8());
            		

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
    // $ANTLR end "ruleRotate"


    // $ANTLR start "entryRuleWait"
    // InternalDrn.g:3545:1: entryRuleWait returns [EObject current=null] : iv_ruleWait= ruleWait EOF ;
    public final EObject entryRuleWait() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWait = null;


        try {
            // InternalDrn.g:3545:45: (iv_ruleWait= ruleWait EOF )
            // InternalDrn.g:3546:2: iv_ruleWait= ruleWait EOF
            {
             newCompositeNode(grammarAccess.getWaitRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWait=ruleWait();

            state._fsp--;

             current =iv_ruleWait; 
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
    // $ANTLR end "entryRuleWait"


    // $ANTLR start "ruleWait"
    // InternalDrn.g:3552:1: ruleWait returns [EObject current=null] : ( ( (lv_name_0_0= 'wait' ) ) otherlv_1= '(' otherlv_2= 'temps' otherlv_3= '=' ( (lv_tempsCST_4_0= RULE_INT ) ) otherlv_5= ')' ) ;
    public final EObject ruleWait() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_tempsCST_4_0=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalDrn.g:3558:2: ( ( ( (lv_name_0_0= 'wait' ) ) otherlv_1= '(' otherlv_2= 'temps' otherlv_3= '=' ( (lv_tempsCST_4_0= RULE_INT ) ) otherlv_5= ')' ) )
            // InternalDrn.g:3559:2: ( ( (lv_name_0_0= 'wait' ) ) otherlv_1= '(' otherlv_2= 'temps' otherlv_3= '=' ( (lv_tempsCST_4_0= RULE_INT ) ) otherlv_5= ')' )
            {
            // InternalDrn.g:3559:2: ( ( (lv_name_0_0= 'wait' ) ) otherlv_1= '(' otherlv_2= 'temps' otherlv_3= '=' ( (lv_tempsCST_4_0= RULE_INT ) ) otherlv_5= ')' )
            // InternalDrn.g:3560:3: ( (lv_name_0_0= 'wait' ) ) otherlv_1= '(' otherlv_2= 'temps' otherlv_3= '=' ( (lv_tempsCST_4_0= RULE_INT ) ) otherlv_5= ')'
            {
            // InternalDrn.g:3560:3: ( (lv_name_0_0= 'wait' ) )
            // InternalDrn.g:3561:4: (lv_name_0_0= 'wait' )
            {
            // InternalDrn.g:3561:4: (lv_name_0_0= 'wait' )
            // InternalDrn.g:3562:5: lv_name_0_0= 'wait'
            {
            lv_name_0_0=(Token)match(input,53,FOLLOW_23); 

            					newLeafNode(lv_name_0_0, grammarAccess.getWaitAccess().getNameWaitKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getWaitRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "wait");
            				

            }


            }

            otherlv_1=(Token)match(input,28,FOLLOW_28); 

            			newLeafNode(otherlv_1, grammarAccess.getWaitAccess().getLeftParenthesisKeyword_1());
            		
            otherlv_2=(Token)match(input,36,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getWaitAccess().getTempsKeyword_2());
            		
            otherlv_3=(Token)match(input,15,FOLLOW_14); 

            			newLeafNode(otherlv_3, grammarAccess.getWaitAccess().getEqualsSignKeyword_3());
            		
            // InternalDrn.g:3586:3: ( (lv_tempsCST_4_0= RULE_INT ) )
            // InternalDrn.g:3587:4: (lv_tempsCST_4_0= RULE_INT )
            {
            // InternalDrn.g:3587:4: (lv_tempsCST_4_0= RULE_INT )
            // InternalDrn.g:3588:5: lv_tempsCST_4_0= RULE_INT
            {
            lv_tempsCST_4_0=(Token)match(input,RULE_INT,FOLLOW_29); 

            					newLeafNode(lv_tempsCST_4_0, grammarAccess.getWaitAccess().getTempsCSTINTTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getWaitRule());
            					}
            					setWithLastConsumed(
            						current,
            						"tempsCST",
            						lv_tempsCST_4_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_5=(Token)match(input,30,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getWaitAccess().getRightParenthesisKeyword_5());
            		

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
    // $ANTLR end "ruleWait"


    // $ANTLR start "entryRuleTakeOff"
    // InternalDrn.g:3612:1: entryRuleTakeOff returns [EObject current=null] : iv_ruleTakeOff= ruleTakeOff EOF ;
    public final EObject entryRuleTakeOff() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTakeOff = null;


        try {
            // InternalDrn.g:3612:48: (iv_ruleTakeOff= ruleTakeOff EOF )
            // InternalDrn.g:3613:2: iv_ruleTakeOff= ruleTakeOff EOF
            {
             newCompositeNode(grammarAccess.getTakeOffRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTakeOff=ruleTakeOff();

            state._fsp--;

             current =iv_ruleTakeOff; 
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
    // $ANTLR end "entryRuleTakeOff"


    // $ANTLR start "ruleTakeOff"
    // InternalDrn.g:3619:1: ruleTakeOff returns [EObject current=null] : ( ( (lv_name_0_0= 'takeoff' ) ) otherlv_1= '(' otherlv_2= ')' ) ;
    public final EObject ruleTakeOff() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalDrn.g:3625:2: ( ( ( (lv_name_0_0= 'takeoff' ) ) otherlv_1= '(' otherlv_2= ')' ) )
            // InternalDrn.g:3626:2: ( ( (lv_name_0_0= 'takeoff' ) ) otherlv_1= '(' otherlv_2= ')' )
            {
            // InternalDrn.g:3626:2: ( ( (lv_name_0_0= 'takeoff' ) ) otherlv_1= '(' otherlv_2= ')' )
            // InternalDrn.g:3627:3: ( (lv_name_0_0= 'takeoff' ) ) otherlv_1= '(' otherlv_2= ')'
            {
            // InternalDrn.g:3627:3: ( (lv_name_0_0= 'takeoff' ) )
            // InternalDrn.g:3628:4: (lv_name_0_0= 'takeoff' )
            {
            // InternalDrn.g:3628:4: (lv_name_0_0= 'takeoff' )
            // InternalDrn.g:3629:5: lv_name_0_0= 'takeoff'
            {
            lv_name_0_0=(Token)match(input,54,FOLLOW_23); 

            					newLeafNode(lv_name_0_0, grammarAccess.getTakeOffAccess().getNameTakeoffKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTakeOffRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "takeoff");
            				

            }


            }

            otherlv_1=(Token)match(input,28,FOLLOW_29); 

            			newLeafNode(otherlv_1, grammarAccess.getTakeOffAccess().getLeftParenthesisKeyword_1());
            		
            otherlv_2=(Token)match(input,30,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getTakeOffAccess().getRightParenthesisKeyword_2());
            		

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
    // $ANTLR end "ruleTakeOff"


    // $ANTLR start "entryRuleLand"
    // InternalDrn.g:3653:1: entryRuleLand returns [EObject current=null] : iv_ruleLand= ruleLand EOF ;
    public final EObject entryRuleLand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLand = null;


        try {
            // InternalDrn.g:3653:45: (iv_ruleLand= ruleLand EOF )
            // InternalDrn.g:3654:2: iv_ruleLand= ruleLand EOF
            {
             newCompositeNode(grammarAccess.getLandRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLand=ruleLand();

            state._fsp--;

             current =iv_ruleLand; 
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
    // $ANTLR end "entryRuleLand"


    // $ANTLR start "ruleLand"
    // InternalDrn.g:3660:1: ruleLand returns [EObject current=null] : ( ( (lv_name_0_0= 'land' ) ) otherlv_1= '(' otherlv_2= ')' ) ;
    public final EObject ruleLand() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalDrn.g:3666:2: ( ( ( (lv_name_0_0= 'land' ) ) otherlv_1= '(' otherlv_2= ')' ) )
            // InternalDrn.g:3667:2: ( ( (lv_name_0_0= 'land' ) ) otherlv_1= '(' otherlv_2= ')' )
            {
            // InternalDrn.g:3667:2: ( ( (lv_name_0_0= 'land' ) ) otherlv_1= '(' otherlv_2= ')' )
            // InternalDrn.g:3668:3: ( (lv_name_0_0= 'land' ) ) otherlv_1= '(' otherlv_2= ')'
            {
            // InternalDrn.g:3668:3: ( (lv_name_0_0= 'land' ) )
            // InternalDrn.g:3669:4: (lv_name_0_0= 'land' )
            {
            // InternalDrn.g:3669:4: (lv_name_0_0= 'land' )
            // InternalDrn.g:3670:5: lv_name_0_0= 'land'
            {
            lv_name_0_0=(Token)match(input,55,FOLLOW_23); 

            					newLeafNode(lv_name_0_0, grammarAccess.getLandAccess().getNameLandKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLandRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "land");
            				

            }


            }

            otherlv_1=(Token)match(input,28,FOLLOW_29); 

            			newLeafNode(otherlv_1, grammarAccess.getLandAccess().getLeftParenthesisKeyword_1());
            		
            otherlv_2=(Token)match(input,30,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getLandAccess().getRightParenthesisKeyword_2());
            		

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
    // $ANTLR end "ruleLand"


    // $ANTLR start "entryRuleDevice"
    // InternalDrn.g:3694:1: entryRuleDevice returns [EObject current=null] : iv_ruleDevice= ruleDevice EOF ;
    public final EObject entryRuleDevice() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDevice = null;


        try {
            // InternalDrn.g:3694:47: (iv_ruleDevice= ruleDevice EOF )
            // InternalDrn.g:3695:2: iv_ruleDevice= ruleDevice EOF
            {
             newCompositeNode(grammarAccess.getDeviceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDevice=ruleDevice();

            state._fsp--;

             current =iv_ruleDevice; 
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
    // $ANTLR end "entryRuleDevice"


    // $ANTLR start "ruleDevice"
    // InternalDrn.g:3701:1: ruleDevice returns [EObject current=null] : (otherlv_0= 'DEVICE' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_declarations_3_0= ruleDeclaration ) ) (otherlv_4= ';' ( (lv_declarations_5_0= ruleDeclaration ) ) )* otherlv_6= '}' ) ;
    public final EObject ruleDevice() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_declarations_3_0 = null;

        EObject lv_declarations_5_0 = null;



        	enterRule();

        try {
            // InternalDrn.g:3707:2: ( (otherlv_0= 'DEVICE' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_declarations_3_0= ruleDeclaration ) ) (otherlv_4= ';' ( (lv_declarations_5_0= ruleDeclaration ) ) )* otherlv_6= '}' ) )
            // InternalDrn.g:3708:2: (otherlv_0= 'DEVICE' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_declarations_3_0= ruleDeclaration ) ) (otherlv_4= ';' ( (lv_declarations_5_0= ruleDeclaration ) ) )* otherlv_6= '}' )
            {
            // InternalDrn.g:3708:2: (otherlv_0= 'DEVICE' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_declarations_3_0= ruleDeclaration ) ) (otherlv_4= ';' ( (lv_declarations_5_0= ruleDeclaration ) ) )* otherlv_6= '}' )
            // InternalDrn.g:3709:3: otherlv_0= 'DEVICE' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_declarations_3_0= ruleDeclaration ) ) (otherlv_4= ';' ( (lv_declarations_5_0= ruleDeclaration ) ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,56,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getDeviceAccess().getDEVICEKeyword_0());
            		
            // InternalDrn.g:3713:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDrn.g:3714:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDrn.g:3714:4: (lv_name_1_0= RULE_ID )
            // InternalDrn.g:3715:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(lv_name_1_0, grammarAccess.getDeviceAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDeviceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_34); 

            			newLeafNode(otherlv_2, grammarAccess.getDeviceAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalDrn.g:3735:3: ( (lv_declarations_3_0= ruleDeclaration ) )
            // InternalDrn.g:3736:4: (lv_declarations_3_0= ruleDeclaration )
            {
            // InternalDrn.g:3736:4: (lv_declarations_3_0= ruleDeclaration )
            // InternalDrn.g:3737:5: lv_declarations_3_0= ruleDeclaration
            {

            					newCompositeNode(grammarAccess.getDeviceAccess().getDeclarationsDeclarationParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_35);
            lv_declarations_3_0=ruleDeclaration();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDeviceRule());
            					}
            					add(
            						current,
            						"declarations",
            						lv_declarations_3_0,
            						"sar.drone.Drn.Declaration");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDrn.g:3754:3: (otherlv_4= ';' ( (lv_declarations_5_0= ruleDeclaration ) ) )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==16) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalDrn.g:3755:4: otherlv_4= ';' ( (lv_declarations_5_0= ruleDeclaration ) )
            	    {
            	    otherlv_4=(Token)match(input,16,FOLLOW_34); 

            	    				newLeafNode(otherlv_4, grammarAccess.getDeviceAccess().getSemicolonKeyword_4_0());
            	    			
            	    // InternalDrn.g:3759:4: ( (lv_declarations_5_0= ruleDeclaration ) )
            	    // InternalDrn.g:3760:5: (lv_declarations_5_0= ruleDeclaration )
            	    {
            	    // InternalDrn.g:3760:5: (lv_declarations_5_0= ruleDeclaration )
            	    // InternalDrn.g:3761:6: lv_declarations_5_0= ruleDeclaration
            	    {

            	    						newCompositeNode(grammarAccess.getDeviceAccess().getDeclarationsDeclarationParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_35);
            	    lv_declarations_5_0=ruleDeclaration();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getDeviceRule());
            	    						}
            	    						add(
            	    							current,
            	    							"declarations",
            	    							lv_declarations_5_0,
            	    							"sar.drone.Drn.Declaration");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

            otherlv_6=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getDeviceAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleDevice"


    // $ANTLR start "entryRuleDeclaration"
    // InternalDrn.g:3787:1: entryRuleDeclaration returns [EObject current=null] : iv_ruleDeclaration= ruleDeclaration EOF ;
    public final EObject entryRuleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaration = null;


        try {
            // InternalDrn.g:3787:52: (iv_ruleDeclaration= ruleDeclaration EOF )
            // InternalDrn.g:3788:2: iv_ruleDeclaration= ruleDeclaration EOF
            {
             newCompositeNode(grammarAccess.getDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDeclaration=ruleDeclaration();

            state._fsp--;

             current =iv_ruleDeclaration; 
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
    // $ANTLR end "entryRuleDeclaration"


    // $ANTLR start "ruleDeclaration"
    // InternalDrn.g:3794:1: ruleDeclaration returns [EObject current=null] : (otherlv_0= 'type' ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;


        	enterRule();

        try {
            // InternalDrn.g:3800:2: ( (otherlv_0= 'type' ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) ) )
            // InternalDrn.g:3801:2: (otherlv_0= 'type' ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) )
            {
            // InternalDrn.g:3801:2: (otherlv_0= 'type' ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) )
            // InternalDrn.g:3802:3: otherlv_0= 'type' ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,57,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getDeclarationAccess().getTypeKeyword_0());
            		
            // InternalDrn.g:3806:3: ( (otherlv_1= RULE_ID ) )
            // InternalDrn.g:3807:4: (otherlv_1= RULE_ID )
            {
            // InternalDrn.g:3807:4: (otherlv_1= RULE_ID )
            // InternalDrn.g:3808:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDeclarationRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(otherlv_1, grammarAccess.getDeclarationAccess().getTypeTypeGenericCrossReference_1_0());
            				

            }


            }

            // InternalDrn.g:3819:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalDrn.g:3820:4: (lv_name_2_0= RULE_ID )
            {
            // InternalDrn.g:3820:4: (lv_name_2_0= RULE_ID )
            // InternalDrn.g:3821:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_2_0, grammarAccess.getDeclarationAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDeclarationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

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
    // $ANTLR end "ruleDeclaration"


    // $ANTLR start "entryRuleDefinition"
    // InternalDrn.g:3841:1: entryRuleDefinition returns [EObject current=null] : iv_ruleDefinition= ruleDefinition EOF ;
    public final EObject entryRuleDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefinition = null;


        try {
            // InternalDrn.g:3841:51: (iv_ruleDefinition= ruleDefinition EOF )
            // InternalDrn.g:3842:2: iv_ruleDefinition= ruleDefinition EOF
            {
             newCompositeNode(grammarAccess.getDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDefinition=ruleDefinition();

            state._fsp--;

             current =iv_ruleDefinition; 
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
    // $ANTLR end "entryRuleDefinition"


    // $ANTLR start "ruleDefinition"
    // InternalDrn.g:3848:1: ruleDefinition returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalDrn.g:3854:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (otherlv_2= RULE_ID ) ) ) )
            // InternalDrn.g:3855:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (otherlv_2= RULE_ID ) ) )
            {
            // InternalDrn.g:3855:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (otherlv_2= RULE_ID ) ) )
            // InternalDrn.g:3856:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (otherlv_2= RULE_ID ) )
            {
            // InternalDrn.g:3856:3: ( (otherlv_0= RULE_ID ) )
            // InternalDrn.g:3857:4: (otherlv_0= RULE_ID )
            {
            // InternalDrn.g:3857:4: (otherlv_0= RULE_ID )
            // InternalDrn.g:3858:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDefinitionRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(otherlv_0, grammarAccess.getDefinitionAccess().getLeftDeclarationCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,15,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getDefinitionAccess().getEqualsSignKeyword_1());
            		
            // InternalDrn.g:3873:3: ( (otherlv_2= RULE_ID ) )
            // InternalDrn.g:3874:4: (otherlv_2= RULE_ID )
            {
            // InternalDrn.g:3874:4: (otherlv_2= RULE_ID )
            // InternalDrn.g:3875:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDefinitionRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_2, grammarAccess.getDefinitionAccess().getRightElementCrossReference_2_0());
            				

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
    // $ANTLR end "ruleDefinition"


    // $ANTLR start "entryRuleWith"
    // InternalDrn.g:3890:1: entryRuleWith returns [EObject current=null] : iv_ruleWith= ruleWith EOF ;
    public final EObject entryRuleWith() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWith = null;


        try {
            // InternalDrn.g:3890:45: (iv_ruleWith= ruleWith EOF )
            // InternalDrn.g:3891:2: iv_ruleWith= ruleWith EOF
            {
             newCompositeNode(grammarAccess.getWithRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWith=ruleWith();

            state._fsp--;

             current =iv_ruleWith; 
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
    // $ANTLR end "entryRuleWith"


    // $ANTLR start "ruleWith"
    // InternalDrn.g:3897:1: ruleWith returns [EObject current=null] : ( ( (lv_name_0_0= 'with' ) ) ( (lv_option_1_0= ruleOption ) ) (otherlv_2= ',' ( (lv_option_3_0= ruleOption ) ) )* ) ;
    public final EObject ruleWith() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_2=null;
        EObject lv_option_1_0 = null;

        EObject lv_option_3_0 = null;



        	enterRule();

        try {
            // InternalDrn.g:3903:2: ( ( ( (lv_name_0_0= 'with' ) ) ( (lv_option_1_0= ruleOption ) ) (otherlv_2= ',' ( (lv_option_3_0= ruleOption ) ) )* ) )
            // InternalDrn.g:3904:2: ( ( (lv_name_0_0= 'with' ) ) ( (lv_option_1_0= ruleOption ) ) (otherlv_2= ',' ( (lv_option_3_0= ruleOption ) ) )* )
            {
            // InternalDrn.g:3904:2: ( ( (lv_name_0_0= 'with' ) ) ( (lv_option_1_0= ruleOption ) ) (otherlv_2= ',' ( (lv_option_3_0= ruleOption ) ) )* )
            // InternalDrn.g:3905:3: ( (lv_name_0_0= 'with' ) ) ( (lv_option_1_0= ruleOption ) ) (otherlv_2= ',' ( (lv_option_3_0= ruleOption ) ) )*
            {
            // InternalDrn.g:3905:3: ( (lv_name_0_0= 'with' ) )
            // InternalDrn.g:3906:4: (lv_name_0_0= 'with' )
            {
            // InternalDrn.g:3906:4: (lv_name_0_0= 'with' )
            // InternalDrn.g:3907:5: lv_name_0_0= 'with'
            {
            lv_name_0_0=(Token)match(input,58,FOLLOW_36); 

            					newLeafNode(lv_name_0_0, grammarAccess.getWithAccess().getNameWithKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getWithRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "with");
            				

            }


            }

            // InternalDrn.g:3919:3: ( (lv_option_1_0= ruleOption ) )
            // InternalDrn.g:3920:4: (lv_option_1_0= ruleOption )
            {
            // InternalDrn.g:3920:4: (lv_option_1_0= ruleOption )
            // InternalDrn.g:3921:5: lv_option_1_0= ruleOption
            {

            					newCompositeNode(grammarAccess.getWithAccess().getOptionOptionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_37);
            lv_option_1_0=ruleOption();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWithRule());
            					}
            					add(
            						current,
            						"option",
            						lv_option_1_0,
            						"sar.drone.Drn.Option");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDrn.g:3938:3: (otherlv_2= ',' ( (lv_option_3_0= ruleOption ) ) )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==33) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalDrn.g:3939:4: otherlv_2= ',' ( (lv_option_3_0= ruleOption ) )
            	    {
            	    otherlv_2=(Token)match(input,33,FOLLOW_36); 

            	    				newLeafNode(otherlv_2, grammarAccess.getWithAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalDrn.g:3943:4: ( (lv_option_3_0= ruleOption ) )
            	    // InternalDrn.g:3944:5: (lv_option_3_0= ruleOption )
            	    {
            	    // InternalDrn.g:3944:5: (lv_option_3_0= ruleOption )
            	    // InternalDrn.g:3945:6: lv_option_3_0= ruleOption
            	    {

            	    						newCompositeNode(grammarAccess.getWithAccess().getOptionOptionParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_37);
            	    lv_option_3_0=ruleOption();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getWithRule());
            	    						}
            	    						add(
            	    							current,
            	    							"option",
            	    							lv_option_3_0,
            	    							"sar.drone.Drn.Option");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop35;
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
    // $ANTLR end "ruleWith"


    // $ANTLR start "entryRuleOption"
    // InternalDrn.g:3967:1: entryRuleOption returns [EObject current=null] : iv_ruleOption= ruleOption EOF ;
    public final EObject entryRuleOption() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOption = null;


        try {
            // InternalDrn.g:3967:47: (iv_ruleOption= ruleOption EOF )
            // InternalDrn.g:3968:2: iv_ruleOption= ruleOption EOF
            {
             newCompositeNode(grammarAccess.getOptionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOption=ruleOption();

            state._fsp--;

             current =iv_ruleOption; 
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
    // $ANTLR end "entryRuleOption"


    // $ANTLR start "ruleOption"
    // InternalDrn.g:3974:1: ruleOption returns [EObject current=null] : (this_Led_Impl_0= ruleLed_Impl | this_LedBlink_1= ruleLedBlink | this_Camera_2= ruleCamera | this_RefDevice_3= ruleRefDevice ) ;
    public final EObject ruleOption() throws RecognitionException {
        EObject current = null;

        EObject this_Led_Impl_0 = null;

        EObject this_LedBlink_1 = null;

        EObject this_Camera_2 = null;

        EObject this_RefDevice_3 = null;



        	enterRule();

        try {
            // InternalDrn.g:3980:2: ( (this_Led_Impl_0= ruleLed_Impl | this_LedBlink_1= ruleLedBlink | this_Camera_2= ruleCamera | this_RefDevice_3= ruleRefDevice ) )
            // InternalDrn.g:3981:2: (this_Led_Impl_0= ruleLed_Impl | this_LedBlink_1= ruleLedBlink | this_Camera_2= ruleCamera | this_RefDevice_3= ruleRefDevice )
            {
            // InternalDrn.g:3981:2: (this_Led_Impl_0= ruleLed_Impl | this_LedBlink_1= ruleLedBlink | this_Camera_2= ruleCamera | this_RefDevice_3= ruleRefDevice )
            int alt36=4;
            switch ( input.LA(1) ) {
            case 61:
                {
                alt36=1;
                }
                break;
            case 63:
                {
                alt36=2;
                }
                break;
            case 65:
                {
                alt36=3;
                }
                break;
            case RULE_ID:
                {
                alt36=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }

            switch (alt36) {
                case 1 :
                    // InternalDrn.g:3982:3: this_Led_Impl_0= ruleLed_Impl
                    {

                    			newCompositeNode(grammarAccess.getOptionAccess().getLed_ImplParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Led_Impl_0=ruleLed_Impl();

                    state._fsp--;


                    			current = this_Led_Impl_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDrn.g:3991:3: this_LedBlink_1= ruleLedBlink
                    {

                    			newCompositeNode(grammarAccess.getOptionAccess().getLedBlinkParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_LedBlink_1=ruleLedBlink();

                    state._fsp--;


                    			current = this_LedBlink_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalDrn.g:4000:3: this_Camera_2= ruleCamera
                    {

                    			newCompositeNode(grammarAccess.getOptionAccess().getCameraParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Camera_2=ruleCamera();

                    state._fsp--;


                    			current = this_Camera_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalDrn.g:4009:3: this_RefDevice_3= ruleRefDevice
                    {

                    			newCompositeNode(grammarAccess.getOptionAccess().getRefDeviceParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_RefDevice_3=ruleRefDevice();

                    state._fsp--;


                    			current = this_RefDevice_3;
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
    // $ANTLR end "ruleOption"


    // $ANTLR start "entryRuleRefDevice"
    // InternalDrn.g:4021:1: entryRuleRefDevice returns [EObject current=null] : iv_ruleRefDevice= ruleRefDevice EOF ;
    public final EObject entryRuleRefDevice() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRefDevice = null;


        try {
            // InternalDrn.g:4021:50: (iv_ruleRefDevice= ruleRefDevice EOF )
            // InternalDrn.g:4022:2: iv_ruleRefDevice= ruleRefDevice EOF
            {
             newCompositeNode(grammarAccess.getRefDeviceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRefDevice=ruleRefDevice();

            state._fsp--;

             current =iv_ruleRefDevice; 
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
    // $ANTLR end "entryRuleRefDevice"


    // $ANTLR start "ruleRefDevice"
    // InternalDrn.g:4028:1: ruleRefDevice returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' otherlv_2= 'mode' ( (lv_mode_3_0= ruleMode ) ) (otherlv_4= ',' ( (lv_definitions_5_0= ruleDefinition ) ) )* otherlv_6= ')' ) ;
    public final EObject ruleRefDevice() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Enumerator lv_mode_3_0 = null;

        EObject lv_definitions_5_0 = null;



        	enterRule();

        try {
            // InternalDrn.g:4034:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' otherlv_2= 'mode' ( (lv_mode_3_0= ruleMode ) ) (otherlv_4= ',' ( (lv_definitions_5_0= ruleDefinition ) ) )* otherlv_6= ')' ) )
            // InternalDrn.g:4035:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' otherlv_2= 'mode' ( (lv_mode_3_0= ruleMode ) ) (otherlv_4= ',' ( (lv_definitions_5_0= ruleDefinition ) ) )* otherlv_6= ')' )
            {
            // InternalDrn.g:4035:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' otherlv_2= 'mode' ( (lv_mode_3_0= ruleMode ) ) (otherlv_4= ',' ( (lv_definitions_5_0= ruleDefinition ) ) )* otherlv_6= ')' )
            // InternalDrn.g:4036:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' otherlv_2= 'mode' ( (lv_mode_3_0= ruleMode ) ) (otherlv_4= ',' ( (lv_definitions_5_0= ruleDefinition ) ) )* otherlv_6= ')'
            {
            // InternalDrn.g:4036:3: ( (otherlv_0= RULE_ID ) )
            // InternalDrn.g:4037:4: (otherlv_0= RULE_ID )
            {
            // InternalDrn.g:4037:4: (otherlv_0= RULE_ID )
            // InternalDrn.g:4038:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRefDeviceRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_23); 

            					newLeafNode(otherlv_0, grammarAccess.getRefDeviceAccess().getDevDeviceCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,28,FOLLOW_38); 

            			newLeafNode(otherlv_1, grammarAccess.getRefDeviceAccess().getLeftParenthesisKeyword_1());
            		
            otherlv_2=(Token)match(input,59,FOLLOW_39); 

            			newLeafNode(otherlv_2, grammarAccess.getRefDeviceAccess().getModeKeyword_2());
            		
            // InternalDrn.g:4057:3: ( (lv_mode_3_0= ruleMode ) )
            // InternalDrn.g:4058:4: (lv_mode_3_0= ruleMode )
            {
            // InternalDrn.g:4058:4: (lv_mode_3_0= ruleMode )
            // InternalDrn.g:4059:5: lv_mode_3_0= ruleMode
            {

            					newCompositeNode(grammarAccess.getRefDeviceAccess().getModeModeEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_26);
            lv_mode_3_0=ruleMode();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRefDeviceRule());
            					}
            					set(
            						current,
            						"mode",
            						lv_mode_3_0,
            						"sar.drone.Drn.Mode");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDrn.g:4076:3: (otherlv_4= ',' ( (lv_definitions_5_0= ruleDefinition ) ) )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==33) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalDrn.g:4077:4: otherlv_4= ',' ( (lv_definitions_5_0= ruleDefinition ) )
            	    {
            	    otherlv_4=(Token)match(input,33,FOLLOW_5); 

            	    				newLeafNode(otherlv_4, grammarAccess.getRefDeviceAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalDrn.g:4081:4: ( (lv_definitions_5_0= ruleDefinition ) )
            	    // InternalDrn.g:4082:5: (lv_definitions_5_0= ruleDefinition )
            	    {
            	    // InternalDrn.g:4082:5: (lv_definitions_5_0= ruleDefinition )
            	    // InternalDrn.g:4083:6: lv_definitions_5_0= ruleDefinition
            	    {

            	    						newCompositeNode(grammarAccess.getRefDeviceAccess().getDefinitionsDefinitionParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_26);
            	    lv_definitions_5_0=ruleDefinition();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getRefDeviceRule());
            	    						}
            	    						add(
            	    							current,
            	    							"definitions",
            	    							lv_definitions_5_0,
            	    							"sar.drone.Drn.Definition");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);

            otherlv_6=(Token)match(input,30,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getRefDeviceAccess().getRightParenthesisKeyword_5());
            		

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
    // $ANTLR end "ruleRefDevice"


    // $ANTLR start "entryRuleAttribut"
    // InternalDrn.g:4109:1: entryRuleAttribut returns [EObject current=null] : iv_ruleAttribut= ruleAttribut EOF ;
    public final EObject entryRuleAttribut() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribut = null;


        try {
            // InternalDrn.g:4109:49: (iv_ruleAttribut= ruleAttribut EOF )
            // InternalDrn.g:4110:2: iv_ruleAttribut= ruleAttribut EOF
            {
             newCompositeNode(grammarAccess.getAttributRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttribut=ruleAttribut();

            state._fsp--;

             current =iv_ruleAttribut; 
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
    // $ANTLR end "entryRuleAttribut"


    // $ANTLR start "ruleAttribut"
    // InternalDrn.g:4116:1: ruleAttribut returns [EObject current=null] : ( (otherlv_0= 'attribute' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( ( (otherlv_3= RULE_ID ) ) otherlv_4= '.' ( (otherlv_5= RULE_ID ) ) ) ) | ( (lv_mode_6_0= ruleMode ) ) | ( (lv_int_7_0= ruleEInt ) ) | ( (lv_bool_8_0= ruleEBool ) ) ) ;
    public final EObject ruleAttribut() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Enumerator lv_mode_6_0 = null;

        AntlrDatatypeRuleToken lv_int_7_0 = null;

        Enumerator lv_bool_8_0 = null;



        	enterRule();

        try {
            // InternalDrn.g:4122:2: ( ( (otherlv_0= 'attribute' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( ( (otherlv_3= RULE_ID ) ) otherlv_4= '.' ( (otherlv_5= RULE_ID ) ) ) ) | ( (lv_mode_6_0= ruleMode ) ) | ( (lv_int_7_0= ruleEInt ) ) | ( (lv_bool_8_0= ruleEBool ) ) ) )
            // InternalDrn.g:4123:2: ( (otherlv_0= 'attribute' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( ( (otherlv_3= RULE_ID ) ) otherlv_4= '.' ( (otherlv_5= RULE_ID ) ) ) ) | ( (lv_mode_6_0= ruleMode ) ) | ( (lv_int_7_0= ruleEInt ) ) | ( (lv_bool_8_0= ruleEBool ) ) )
            {
            // InternalDrn.g:4123:2: ( (otherlv_0= 'attribute' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( ( (otherlv_3= RULE_ID ) ) otherlv_4= '.' ( (otherlv_5= RULE_ID ) ) ) ) | ( (lv_mode_6_0= ruleMode ) ) | ( (lv_int_7_0= ruleEInt ) ) | ( (lv_bool_8_0= ruleEBool ) ) )
            int alt38=4;
            switch ( input.LA(1) ) {
            case 60:
                {
                alt38=1;
                }
                break;
            case 75:
            case 76:
                {
                alt38=2;
                }
                break;
            case RULE_INT:
            case 69:
                {
                alt38=3;
                }
                break;
            case 77:
            case 78:
                {
                alt38=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }

            switch (alt38) {
                case 1 :
                    // InternalDrn.g:4124:3: (otherlv_0= 'attribute' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( ( (otherlv_3= RULE_ID ) ) otherlv_4= '.' ( (otherlv_5= RULE_ID ) ) ) )
                    {
                    // InternalDrn.g:4124:3: (otherlv_0= 'attribute' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( ( (otherlv_3= RULE_ID ) ) otherlv_4= '.' ( (otherlv_5= RULE_ID ) ) ) )
                    // InternalDrn.g:4125:4: otherlv_0= 'attribute' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( ( (otherlv_3= RULE_ID ) ) otherlv_4= '.' ( (otherlv_5= RULE_ID ) ) )
                    {
                    otherlv_0=(Token)match(input,60,FOLLOW_5); 

                    				newLeafNode(otherlv_0, grammarAccess.getAttributAccess().getAttributeKeyword_0_0());
                    			
                    // InternalDrn.g:4129:4: ( (lv_name_1_0= RULE_ID ) )
                    // InternalDrn.g:4130:5: (lv_name_1_0= RULE_ID )
                    {
                    // InternalDrn.g:4130:5: (lv_name_1_0= RULE_ID )
                    // InternalDrn.g:4131:6: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_7); 

                    						newLeafNode(lv_name_1_0, grammarAccess.getAttributAccess().getNameIDTerminalRuleCall_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAttributRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_1_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    otherlv_2=(Token)match(input,15,FOLLOW_5); 

                    				newLeafNode(otherlv_2, grammarAccess.getAttributAccess().getEqualsSignKeyword_0_2());
                    			
                    // InternalDrn.g:4151:4: ( ( (otherlv_3= RULE_ID ) ) otherlv_4= '.' ( (otherlv_5= RULE_ID ) ) )
                    // InternalDrn.g:4152:5: ( (otherlv_3= RULE_ID ) ) otherlv_4= '.' ( (otherlv_5= RULE_ID ) )
                    {
                    // InternalDrn.g:4152:5: ( (otherlv_3= RULE_ID ) )
                    // InternalDrn.g:4153:6: (otherlv_3= RULE_ID )
                    {
                    // InternalDrn.g:4153:6: (otherlv_3= RULE_ID )
                    // InternalDrn.g:4154:7: otherlv_3= RULE_ID
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getAttributRule());
                    							}
                    						
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_22); 

                    							newLeafNode(otherlv_3, grammarAccess.getAttributAccess().getTypeTypeGenericCrossReference_0_3_0_0());
                    						

                    }


                    }

                    otherlv_4=(Token)match(input,31,FOLLOW_5); 

                    					newLeafNode(otherlv_4, grammarAccess.getAttributAccess().getFullStopKeyword_0_3_1());
                    				
                    // InternalDrn.g:4169:5: ( (otherlv_5= RULE_ID ) )
                    // InternalDrn.g:4170:6: (otherlv_5= RULE_ID )
                    {
                    // InternalDrn.g:4170:6: (otherlv_5= RULE_ID )
                    // InternalDrn.g:4171:7: otherlv_5= RULE_ID
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getAttributRule());
                    							}
                    						
                    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_2); 

                    							newLeafNode(otherlv_5, grammarAccess.getAttributAccess().getElmtElementCrossReference_0_3_2_0());
                    						

                    }


                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDrn.g:4185:3: ( (lv_mode_6_0= ruleMode ) )
                    {
                    // InternalDrn.g:4185:3: ( (lv_mode_6_0= ruleMode ) )
                    // InternalDrn.g:4186:4: (lv_mode_6_0= ruleMode )
                    {
                    // InternalDrn.g:4186:4: (lv_mode_6_0= ruleMode )
                    // InternalDrn.g:4187:5: lv_mode_6_0= ruleMode
                    {

                    					newCompositeNode(grammarAccess.getAttributAccess().getModeModeEnumRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_mode_6_0=ruleMode();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getAttributRule());
                    					}
                    					set(
                    						current,
                    						"mode",
                    						lv_mode_6_0,
                    						"sar.drone.Drn.Mode");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalDrn.g:4205:3: ( (lv_int_7_0= ruleEInt ) )
                    {
                    // InternalDrn.g:4205:3: ( (lv_int_7_0= ruleEInt ) )
                    // InternalDrn.g:4206:4: (lv_int_7_0= ruleEInt )
                    {
                    // InternalDrn.g:4206:4: (lv_int_7_0= ruleEInt )
                    // InternalDrn.g:4207:5: lv_int_7_0= ruleEInt
                    {

                    					newCompositeNode(grammarAccess.getAttributAccess().getIntEIntParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_int_7_0=ruleEInt();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getAttributRule());
                    					}
                    					set(
                    						current,
                    						"int",
                    						lv_int_7_0,
                    						"sar.drone.Drn.EInt");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalDrn.g:4225:3: ( (lv_bool_8_0= ruleEBool ) )
                    {
                    // InternalDrn.g:4225:3: ( (lv_bool_8_0= ruleEBool ) )
                    // InternalDrn.g:4226:4: (lv_bool_8_0= ruleEBool )
                    {
                    // InternalDrn.g:4226:4: (lv_bool_8_0= ruleEBool )
                    // InternalDrn.g:4227:5: lv_bool_8_0= ruleEBool
                    {

                    					newCompositeNode(grammarAccess.getAttributAccess().getBoolEBoolEnumRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_bool_8_0=ruleEBool();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getAttributRule());
                    					}
                    					set(
                    						current,
                    						"bool",
                    						lv_bool_8_0,
                    						"sar.drone.Drn.EBool");
                    					afterParserOrEnumRuleCall();
                    				

                    }


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
    // $ANTLR end "ruleAttribut"


    // $ANTLR start "entryRuleLed_Impl"
    // InternalDrn.g:4248:1: entryRuleLed_Impl returns [EObject current=null] : iv_ruleLed_Impl= ruleLed_Impl EOF ;
    public final EObject entryRuleLed_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLed_Impl = null;


        try {
            // InternalDrn.g:4248:49: (iv_ruleLed_Impl= ruleLed_Impl EOF )
            // InternalDrn.g:4249:2: iv_ruleLed_Impl= ruleLed_Impl EOF
            {
             newCompositeNode(grammarAccess.getLed_ImplRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLed_Impl=ruleLed_Impl();

            state._fsp--;

             current =iv_ruleLed_Impl; 
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
    // $ANTLR end "entryRuleLed_Impl"


    // $ANTLR start "ruleLed_Impl"
    // InternalDrn.g:4255:1: ruleLed_Impl returns [EObject current=null] : ( ( (lv_name_0_0= 'led' ) ) otherlv_1= '(' otherlv_2= 'mode' otherlv_3= '=' ( (lv_mode_4_0= ruleMode ) ) otherlv_5= 'color' otherlv_6= '=' ( (lv_color_7_0= ruleColorLed ) ) otherlv_8= ')' ) ;
    public final EObject ruleLed_Impl() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Enumerator lv_mode_4_0 = null;

        Enumerator lv_color_7_0 = null;



        	enterRule();

        try {
            // InternalDrn.g:4261:2: ( ( ( (lv_name_0_0= 'led' ) ) otherlv_1= '(' otherlv_2= 'mode' otherlv_3= '=' ( (lv_mode_4_0= ruleMode ) ) otherlv_5= 'color' otherlv_6= '=' ( (lv_color_7_0= ruleColorLed ) ) otherlv_8= ')' ) )
            // InternalDrn.g:4262:2: ( ( (lv_name_0_0= 'led' ) ) otherlv_1= '(' otherlv_2= 'mode' otherlv_3= '=' ( (lv_mode_4_0= ruleMode ) ) otherlv_5= 'color' otherlv_6= '=' ( (lv_color_7_0= ruleColorLed ) ) otherlv_8= ')' )
            {
            // InternalDrn.g:4262:2: ( ( (lv_name_0_0= 'led' ) ) otherlv_1= '(' otherlv_2= 'mode' otherlv_3= '=' ( (lv_mode_4_0= ruleMode ) ) otherlv_5= 'color' otherlv_6= '=' ( (lv_color_7_0= ruleColorLed ) ) otherlv_8= ')' )
            // InternalDrn.g:4263:3: ( (lv_name_0_0= 'led' ) ) otherlv_1= '(' otherlv_2= 'mode' otherlv_3= '=' ( (lv_mode_4_0= ruleMode ) ) otherlv_5= 'color' otherlv_6= '=' ( (lv_color_7_0= ruleColorLed ) ) otherlv_8= ')'
            {
            // InternalDrn.g:4263:3: ( (lv_name_0_0= 'led' ) )
            // InternalDrn.g:4264:4: (lv_name_0_0= 'led' )
            {
            // InternalDrn.g:4264:4: (lv_name_0_0= 'led' )
            // InternalDrn.g:4265:5: lv_name_0_0= 'led'
            {
            lv_name_0_0=(Token)match(input,61,FOLLOW_23); 

            					newLeafNode(lv_name_0_0, grammarAccess.getLed_ImplAccess().getNameLedKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLed_ImplRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "led");
            				

            }


            }

            otherlv_1=(Token)match(input,28,FOLLOW_38); 

            			newLeafNode(otherlv_1, grammarAccess.getLed_ImplAccess().getLeftParenthesisKeyword_1());
            		
            otherlv_2=(Token)match(input,59,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getLed_ImplAccess().getModeKeyword_2());
            		
            otherlv_3=(Token)match(input,15,FOLLOW_39); 

            			newLeafNode(otherlv_3, grammarAccess.getLed_ImplAccess().getEqualsSignKeyword_3());
            		
            // InternalDrn.g:4289:3: ( (lv_mode_4_0= ruleMode ) )
            // InternalDrn.g:4290:4: (lv_mode_4_0= ruleMode )
            {
            // InternalDrn.g:4290:4: (lv_mode_4_0= ruleMode )
            // InternalDrn.g:4291:5: lv_mode_4_0= ruleMode
            {

            					newCompositeNode(grammarAccess.getLed_ImplAccess().getModeModeEnumRuleCall_4_0());
            				
            pushFollow(FOLLOW_40);
            lv_mode_4_0=ruleMode();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLed_ImplRule());
            					}
            					set(
            						current,
            						"mode",
            						lv_mode_4_0,
            						"sar.drone.Drn.Mode");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,62,FOLLOW_7); 

            			newLeafNode(otherlv_5, grammarAccess.getLed_ImplAccess().getColorKeyword_5());
            		
            otherlv_6=(Token)match(input,15,FOLLOW_41); 

            			newLeafNode(otherlv_6, grammarAccess.getLed_ImplAccess().getEqualsSignKeyword_6());
            		
            // InternalDrn.g:4316:3: ( (lv_color_7_0= ruleColorLed ) )
            // InternalDrn.g:4317:4: (lv_color_7_0= ruleColorLed )
            {
            // InternalDrn.g:4317:4: (lv_color_7_0= ruleColorLed )
            // InternalDrn.g:4318:5: lv_color_7_0= ruleColorLed
            {

            					newCompositeNode(grammarAccess.getLed_ImplAccess().getColorColorLedEnumRuleCall_7_0());
            				
            pushFollow(FOLLOW_29);
            lv_color_7_0=ruleColorLed();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLed_ImplRule());
            					}
            					set(
            						current,
            						"color",
            						lv_color_7_0,
            						"sar.drone.Drn.ColorLed");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,30,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getLed_ImplAccess().getRightParenthesisKeyword_8());
            		

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
    // $ANTLR end "ruleLed_Impl"


    // $ANTLR start "entryRuleLedBlink"
    // InternalDrn.g:4343:1: entryRuleLedBlink returns [EObject current=null] : iv_ruleLedBlink= ruleLedBlink EOF ;
    public final EObject entryRuleLedBlink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLedBlink = null;


        try {
            // InternalDrn.g:4343:49: (iv_ruleLedBlink= ruleLedBlink EOF )
            // InternalDrn.g:4344:2: iv_ruleLedBlink= ruleLedBlink EOF
            {
             newCompositeNode(grammarAccess.getLedBlinkRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLedBlink=ruleLedBlink();

            state._fsp--;

             current =iv_ruleLedBlink; 
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
    // $ANTLR end "entryRuleLedBlink"


    // $ANTLR start "ruleLedBlink"
    // InternalDrn.g:4350:1: ruleLedBlink returns [EObject current=null] : ( ( (lv_name_0_0= 'ledBlink' ) ) otherlv_1= '(' otherlv_2= 'mode' otherlv_3= '=' ( (lv_mode_4_0= ruleMode ) ) (otherlv_5= 'color' otherlv_6= '=' ( (lv_color_7_0= ruleColorLed ) ) ) (otherlv_8= 'blink_per_sec' otherlv_9= '=' ( (lv_blink_per_secCST_10_0= RULE_INT ) ) ) ( (lv_attributs_11_0= ruleAttribut ) )* otherlv_12= ')' ) ;
    public final EObject ruleLedBlink() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token lv_blink_per_secCST_10_0=null;
        Token otherlv_12=null;
        Enumerator lv_mode_4_0 = null;

        Enumerator lv_color_7_0 = null;

        EObject lv_attributs_11_0 = null;



        	enterRule();

        try {
            // InternalDrn.g:4356:2: ( ( ( (lv_name_0_0= 'ledBlink' ) ) otherlv_1= '(' otherlv_2= 'mode' otherlv_3= '=' ( (lv_mode_4_0= ruleMode ) ) (otherlv_5= 'color' otherlv_6= '=' ( (lv_color_7_0= ruleColorLed ) ) ) (otherlv_8= 'blink_per_sec' otherlv_9= '=' ( (lv_blink_per_secCST_10_0= RULE_INT ) ) ) ( (lv_attributs_11_0= ruleAttribut ) )* otherlv_12= ')' ) )
            // InternalDrn.g:4357:2: ( ( (lv_name_0_0= 'ledBlink' ) ) otherlv_1= '(' otherlv_2= 'mode' otherlv_3= '=' ( (lv_mode_4_0= ruleMode ) ) (otherlv_5= 'color' otherlv_6= '=' ( (lv_color_7_0= ruleColorLed ) ) ) (otherlv_8= 'blink_per_sec' otherlv_9= '=' ( (lv_blink_per_secCST_10_0= RULE_INT ) ) ) ( (lv_attributs_11_0= ruleAttribut ) )* otherlv_12= ')' )
            {
            // InternalDrn.g:4357:2: ( ( (lv_name_0_0= 'ledBlink' ) ) otherlv_1= '(' otherlv_2= 'mode' otherlv_3= '=' ( (lv_mode_4_0= ruleMode ) ) (otherlv_5= 'color' otherlv_6= '=' ( (lv_color_7_0= ruleColorLed ) ) ) (otherlv_8= 'blink_per_sec' otherlv_9= '=' ( (lv_blink_per_secCST_10_0= RULE_INT ) ) ) ( (lv_attributs_11_0= ruleAttribut ) )* otherlv_12= ')' )
            // InternalDrn.g:4358:3: ( (lv_name_0_0= 'ledBlink' ) ) otherlv_1= '(' otherlv_2= 'mode' otherlv_3= '=' ( (lv_mode_4_0= ruleMode ) ) (otherlv_5= 'color' otherlv_6= '=' ( (lv_color_7_0= ruleColorLed ) ) ) (otherlv_8= 'blink_per_sec' otherlv_9= '=' ( (lv_blink_per_secCST_10_0= RULE_INT ) ) ) ( (lv_attributs_11_0= ruleAttribut ) )* otherlv_12= ')'
            {
            // InternalDrn.g:4358:3: ( (lv_name_0_0= 'ledBlink' ) )
            // InternalDrn.g:4359:4: (lv_name_0_0= 'ledBlink' )
            {
            // InternalDrn.g:4359:4: (lv_name_0_0= 'ledBlink' )
            // InternalDrn.g:4360:5: lv_name_0_0= 'ledBlink'
            {
            lv_name_0_0=(Token)match(input,63,FOLLOW_23); 

            					newLeafNode(lv_name_0_0, grammarAccess.getLedBlinkAccess().getNameLedBlinkKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLedBlinkRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "ledBlink");
            				

            }


            }

            otherlv_1=(Token)match(input,28,FOLLOW_38); 

            			newLeafNode(otherlv_1, grammarAccess.getLedBlinkAccess().getLeftParenthesisKeyword_1());
            		
            otherlv_2=(Token)match(input,59,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getLedBlinkAccess().getModeKeyword_2());
            		
            otherlv_3=(Token)match(input,15,FOLLOW_39); 

            			newLeafNode(otherlv_3, grammarAccess.getLedBlinkAccess().getEqualsSignKeyword_3());
            		
            // InternalDrn.g:4384:3: ( (lv_mode_4_0= ruleMode ) )
            // InternalDrn.g:4385:4: (lv_mode_4_0= ruleMode )
            {
            // InternalDrn.g:4385:4: (lv_mode_4_0= ruleMode )
            // InternalDrn.g:4386:5: lv_mode_4_0= ruleMode
            {

            					newCompositeNode(grammarAccess.getLedBlinkAccess().getModeModeEnumRuleCall_4_0());
            				
            pushFollow(FOLLOW_40);
            lv_mode_4_0=ruleMode();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLedBlinkRule());
            					}
            					set(
            						current,
            						"mode",
            						lv_mode_4_0,
            						"sar.drone.Drn.Mode");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDrn.g:4403:3: (otherlv_5= 'color' otherlv_6= '=' ( (lv_color_7_0= ruleColorLed ) ) )
            // InternalDrn.g:4404:4: otherlv_5= 'color' otherlv_6= '=' ( (lv_color_7_0= ruleColorLed ) )
            {
            otherlv_5=(Token)match(input,62,FOLLOW_7); 

            				newLeafNode(otherlv_5, grammarAccess.getLedBlinkAccess().getColorKeyword_5_0());
            			
            otherlv_6=(Token)match(input,15,FOLLOW_41); 

            				newLeafNode(otherlv_6, grammarAccess.getLedBlinkAccess().getEqualsSignKeyword_5_1());
            			
            // InternalDrn.g:4412:4: ( (lv_color_7_0= ruleColorLed ) )
            // InternalDrn.g:4413:5: (lv_color_7_0= ruleColorLed )
            {
            // InternalDrn.g:4413:5: (lv_color_7_0= ruleColorLed )
            // InternalDrn.g:4414:6: lv_color_7_0= ruleColorLed
            {

            						newCompositeNode(grammarAccess.getLedBlinkAccess().getColorColorLedEnumRuleCall_5_2_0());
            					
            pushFollow(FOLLOW_42);
            lv_color_7_0=ruleColorLed();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getLedBlinkRule());
            						}
            						set(
            							current,
            							"color",
            							lv_color_7_0,
            							"sar.drone.Drn.ColorLed");
            						afterParserOrEnumRuleCall();
            					

            }


            }


            }

            // InternalDrn.g:4432:3: (otherlv_8= 'blink_per_sec' otherlv_9= '=' ( (lv_blink_per_secCST_10_0= RULE_INT ) ) )
            // InternalDrn.g:4433:4: otherlv_8= 'blink_per_sec' otherlv_9= '=' ( (lv_blink_per_secCST_10_0= RULE_INT ) )
            {
            otherlv_8=(Token)match(input,64,FOLLOW_7); 

            				newLeafNode(otherlv_8, grammarAccess.getLedBlinkAccess().getBlink_per_secKeyword_6_0());
            			
            otherlv_9=(Token)match(input,15,FOLLOW_14); 

            				newLeafNode(otherlv_9, grammarAccess.getLedBlinkAccess().getEqualsSignKeyword_6_1());
            			
            // InternalDrn.g:4441:4: ( (lv_blink_per_secCST_10_0= RULE_INT ) )
            // InternalDrn.g:4442:5: (lv_blink_per_secCST_10_0= RULE_INT )
            {
            // InternalDrn.g:4442:5: (lv_blink_per_secCST_10_0= RULE_INT )
            // InternalDrn.g:4443:6: lv_blink_per_secCST_10_0= RULE_INT
            {
            lv_blink_per_secCST_10_0=(Token)match(input,RULE_INT,FOLLOW_43); 

            						newLeafNode(lv_blink_per_secCST_10_0, grammarAccess.getLedBlinkAccess().getBlink_per_secCSTINTTerminalRuleCall_6_2_0());
            					

            						if (current==null) {
            							current = createModelElement(grammarAccess.getLedBlinkRule());
            						}
            						setWithLastConsumed(
            							current,
            							"blink_per_secCST",
            							lv_blink_per_secCST_10_0,
            							"org.eclipse.xtext.common.Terminals.INT");
            					

            }


            }


            }

            // InternalDrn.g:4460:3: ( (lv_attributs_11_0= ruleAttribut ) )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==RULE_INT||LA39_0==60||LA39_0==69||(LA39_0>=75 && LA39_0<=78)) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalDrn.g:4461:4: (lv_attributs_11_0= ruleAttribut )
            	    {
            	    // InternalDrn.g:4461:4: (lv_attributs_11_0= ruleAttribut )
            	    // InternalDrn.g:4462:5: lv_attributs_11_0= ruleAttribut
            	    {

            	    					newCompositeNode(grammarAccess.getLedBlinkAccess().getAttributsAttributParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_43);
            	    lv_attributs_11_0=ruleAttribut();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getLedBlinkRule());
            	    					}
            	    					add(
            	    						current,
            	    						"attributs",
            	    						lv_attributs_11_0,
            	    						"sar.drone.Drn.Attribut");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);

            otherlv_12=(Token)match(input,30,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getLedBlinkAccess().getRightParenthesisKeyword_8());
            		

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
    // $ANTLR end "ruleLedBlink"


    // $ANTLR start "entryRuleCamera"
    // InternalDrn.g:4487:1: entryRuleCamera returns [EObject current=null] : iv_ruleCamera= ruleCamera EOF ;
    public final EObject entryRuleCamera() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCamera = null;


        try {
            // InternalDrn.g:4487:47: (iv_ruleCamera= ruleCamera EOF )
            // InternalDrn.g:4488:2: iv_ruleCamera= ruleCamera EOF
            {
             newCompositeNode(grammarAccess.getCameraRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCamera=ruleCamera();

            state._fsp--;

             current =iv_ruleCamera; 
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
    // $ANTLR end "entryRuleCamera"


    // $ANTLR start "ruleCamera"
    // InternalDrn.g:4494:1: ruleCamera returns [EObject current=null] : ( ( (lv_name_0_0= 'camera' ) ) otherlv_1= '(' otherlv_2= 'id' otherlv_3= '=' ( (lv_id_4_0= RULE_INT ) ) otherlv_5= 'mode' otherlv_6= '=' ( (lv_mode_7_0= ruleMode ) ) ( (lv_attributs_8_0= ruleAttribut ) )* otherlv_9= ')' ) ;
    public final EObject ruleCamera() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_id_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_9=null;
        Enumerator lv_mode_7_0 = null;

        EObject lv_attributs_8_0 = null;



        	enterRule();

        try {
            // InternalDrn.g:4500:2: ( ( ( (lv_name_0_0= 'camera' ) ) otherlv_1= '(' otherlv_2= 'id' otherlv_3= '=' ( (lv_id_4_0= RULE_INT ) ) otherlv_5= 'mode' otherlv_6= '=' ( (lv_mode_7_0= ruleMode ) ) ( (lv_attributs_8_0= ruleAttribut ) )* otherlv_9= ')' ) )
            // InternalDrn.g:4501:2: ( ( (lv_name_0_0= 'camera' ) ) otherlv_1= '(' otherlv_2= 'id' otherlv_3= '=' ( (lv_id_4_0= RULE_INT ) ) otherlv_5= 'mode' otherlv_6= '=' ( (lv_mode_7_0= ruleMode ) ) ( (lv_attributs_8_0= ruleAttribut ) )* otherlv_9= ')' )
            {
            // InternalDrn.g:4501:2: ( ( (lv_name_0_0= 'camera' ) ) otherlv_1= '(' otherlv_2= 'id' otherlv_3= '=' ( (lv_id_4_0= RULE_INT ) ) otherlv_5= 'mode' otherlv_6= '=' ( (lv_mode_7_0= ruleMode ) ) ( (lv_attributs_8_0= ruleAttribut ) )* otherlv_9= ')' )
            // InternalDrn.g:4502:3: ( (lv_name_0_0= 'camera' ) ) otherlv_1= '(' otherlv_2= 'id' otherlv_3= '=' ( (lv_id_4_0= RULE_INT ) ) otherlv_5= 'mode' otherlv_6= '=' ( (lv_mode_7_0= ruleMode ) ) ( (lv_attributs_8_0= ruleAttribut ) )* otherlv_9= ')'
            {
            // InternalDrn.g:4502:3: ( (lv_name_0_0= 'camera' ) )
            // InternalDrn.g:4503:4: (lv_name_0_0= 'camera' )
            {
            // InternalDrn.g:4503:4: (lv_name_0_0= 'camera' )
            // InternalDrn.g:4504:5: lv_name_0_0= 'camera'
            {
            lv_name_0_0=(Token)match(input,65,FOLLOW_23); 

            					newLeafNode(lv_name_0_0, grammarAccess.getCameraAccess().getNameCameraKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCameraRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "camera");
            				

            }


            }

            otherlv_1=(Token)match(input,28,FOLLOW_44); 

            			newLeafNode(otherlv_1, grammarAccess.getCameraAccess().getLeftParenthesisKeyword_1());
            		
            otherlv_2=(Token)match(input,66,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getCameraAccess().getIdKeyword_2());
            		
            otherlv_3=(Token)match(input,15,FOLLOW_14); 

            			newLeafNode(otherlv_3, grammarAccess.getCameraAccess().getEqualsSignKeyword_3());
            		
            // InternalDrn.g:4528:3: ( (lv_id_4_0= RULE_INT ) )
            // InternalDrn.g:4529:4: (lv_id_4_0= RULE_INT )
            {
            // InternalDrn.g:4529:4: (lv_id_4_0= RULE_INT )
            // InternalDrn.g:4530:5: lv_id_4_0= RULE_INT
            {
            lv_id_4_0=(Token)match(input,RULE_INT,FOLLOW_38); 

            					newLeafNode(lv_id_4_0, grammarAccess.getCameraAccess().getIdINTTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCameraRule());
            					}
            					setWithLastConsumed(
            						current,
            						"id",
            						lv_id_4_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_5=(Token)match(input,59,FOLLOW_7); 

            			newLeafNode(otherlv_5, grammarAccess.getCameraAccess().getModeKeyword_5());
            		
            otherlv_6=(Token)match(input,15,FOLLOW_39); 

            			newLeafNode(otherlv_6, grammarAccess.getCameraAccess().getEqualsSignKeyword_6());
            		
            // InternalDrn.g:4554:3: ( (lv_mode_7_0= ruleMode ) )
            // InternalDrn.g:4555:4: (lv_mode_7_0= ruleMode )
            {
            // InternalDrn.g:4555:4: (lv_mode_7_0= ruleMode )
            // InternalDrn.g:4556:5: lv_mode_7_0= ruleMode
            {

            					newCompositeNode(grammarAccess.getCameraAccess().getModeModeEnumRuleCall_7_0());
            				
            pushFollow(FOLLOW_43);
            lv_mode_7_0=ruleMode();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCameraRule());
            					}
            					set(
            						current,
            						"mode",
            						lv_mode_7_0,
            						"sar.drone.Drn.Mode");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDrn.g:4573:3: ( (lv_attributs_8_0= ruleAttribut ) )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==RULE_INT||LA40_0==60||LA40_0==69||(LA40_0>=75 && LA40_0<=78)) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalDrn.g:4574:4: (lv_attributs_8_0= ruleAttribut )
            	    {
            	    // InternalDrn.g:4574:4: (lv_attributs_8_0= ruleAttribut )
            	    // InternalDrn.g:4575:5: lv_attributs_8_0= ruleAttribut
            	    {

            	    					newCompositeNode(grammarAccess.getCameraAccess().getAttributsAttributParserRuleCall_8_0());
            	    				
            	    pushFollow(FOLLOW_43);
            	    lv_attributs_8_0=ruleAttribut();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getCameraRule());
            	    					}
            	    					add(
            	    						current,
            	    						"attributs",
            	    						lv_attributs_8_0,
            	    						"sar.drone.Drn.Attribut");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);

            otherlv_9=(Token)match(input,30,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getCameraAccess().getRightParenthesisKeyword_9());
            		

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
    // $ANTLR end "ruleCamera"


    // $ANTLR start "entryRuleTypeGeneric"
    // InternalDrn.g:4600:1: entryRuleTypeGeneric returns [EObject current=null] : iv_ruleTypeGeneric= ruleTypeGeneric EOF ;
    public final EObject entryRuleTypeGeneric() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeGeneric = null;


        try {
            // InternalDrn.g:4600:52: (iv_ruleTypeGeneric= ruleTypeGeneric EOF )
            // InternalDrn.g:4601:2: iv_ruleTypeGeneric= ruleTypeGeneric EOF
            {
             newCompositeNode(grammarAccess.getTypeGenericRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTypeGeneric=ruleTypeGeneric();

            state._fsp--;

             current =iv_ruleTypeGeneric; 
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
    // $ANTLR end "entryRuleTypeGeneric"


    // $ANTLR start "ruleTypeGeneric"
    // InternalDrn.g:4607:1: ruleTypeGeneric returns [EObject current=null] : (otherlv_0= 'Type' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleElement ) ) (otherlv_4= ';' ( (lv_elements_5_0= ruleElement ) ) )* otherlv_6= '}' ) ;
    public final EObject ruleTypeGeneric() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_elements_3_0 = null;

        EObject lv_elements_5_0 = null;



        	enterRule();

        try {
            // InternalDrn.g:4613:2: ( (otherlv_0= 'Type' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleElement ) ) (otherlv_4= ';' ( (lv_elements_5_0= ruleElement ) ) )* otherlv_6= '}' ) )
            // InternalDrn.g:4614:2: (otherlv_0= 'Type' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleElement ) ) (otherlv_4= ';' ( (lv_elements_5_0= ruleElement ) ) )* otherlv_6= '}' )
            {
            // InternalDrn.g:4614:2: (otherlv_0= 'Type' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleElement ) ) (otherlv_4= ';' ( (lv_elements_5_0= ruleElement ) ) )* otherlv_6= '}' )
            // InternalDrn.g:4615:3: otherlv_0= 'Type' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleElement ) ) (otherlv_4= ';' ( (lv_elements_5_0= ruleElement ) ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,67,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getTypeGenericAccess().getTypeKeyword_0());
            		
            // InternalDrn.g:4619:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDrn.g:4620:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDrn.g:4620:4: (lv_name_1_0= RULE_ID )
            // InternalDrn.g:4621:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(lv_name_1_0, grammarAccess.getTypeGenericAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTypeGenericRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_45); 

            			newLeafNode(otherlv_2, grammarAccess.getTypeGenericAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalDrn.g:4641:3: ( (lv_elements_3_0= ruleElement ) )
            // InternalDrn.g:4642:4: (lv_elements_3_0= ruleElement )
            {
            // InternalDrn.g:4642:4: (lv_elements_3_0= ruleElement )
            // InternalDrn.g:4643:5: lv_elements_3_0= ruleElement
            {

            					newCompositeNode(grammarAccess.getTypeGenericAccess().getElementsElementParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_35);
            lv_elements_3_0=ruleElement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTypeGenericRule());
            					}
            					add(
            						current,
            						"elements",
            						lv_elements_3_0,
            						"sar.drone.Drn.Element");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDrn.g:4660:3: (otherlv_4= ';' ( (lv_elements_5_0= ruleElement ) ) )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==16) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalDrn.g:4661:4: otherlv_4= ';' ( (lv_elements_5_0= ruleElement ) )
            	    {
            	    otherlv_4=(Token)match(input,16,FOLLOW_45); 

            	    				newLeafNode(otherlv_4, grammarAccess.getTypeGenericAccess().getSemicolonKeyword_4_0());
            	    			
            	    // InternalDrn.g:4665:4: ( (lv_elements_5_0= ruleElement ) )
            	    // InternalDrn.g:4666:5: (lv_elements_5_0= ruleElement )
            	    {
            	    // InternalDrn.g:4666:5: (lv_elements_5_0= ruleElement )
            	    // InternalDrn.g:4667:6: lv_elements_5_0= ruleElement
            	    {

            	    						newCompositeNode(grammarAccess.getTypeGenericAccess().getElementsElementParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_35);
            	    lv_elements_5_0=ruleElement();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getTypeGenericRule());
            	    						}
            	    						add(
            	    							current,
            	    							"elements",
            	    							lv_elements_5_0,
            	    							"sar.drone.Drn.Element");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);

            otherlv_6=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getTypeGenericAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleTypeGeneric"


    // $ANTLR start "entryRuleElement"
    // InternalDrn.g:4693:1: entryRuleElement returns [EObject current=null] : iv_ruleElement= ruleElement EOF ;
    public final EObject entryRuleElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElement = null;


        try {
            // InternalDrn.g:4693:48: (iv_ruleElement= ruleElement EOF )
            // InternalDrn.g:4694:2: iv_ruleElement= ruleElement EOF
            {
             newCompositeNode(grammarAccess.getElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleElement=ruleElement();

            state._fsp--;

             current =iv_ruleElement; 
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
    // $ANTLR end "entryRuleElement"


    // $ANTLR start "ruleElement"
    // InternalDrn.g:4700:1: ruleElement returns [EObject current=null] : (otherlv_0= 'element' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalDrn.g:4706:2: ( (otherlv_0= 'element' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalDrn.g:4707:2: (otherlv_0= 'element' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalDrn.g:4707:2: (otherlv_0= 'element' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalDrn.g:4708:3: otherlv_0= 'element' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,68,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getElementAccess().getElementKeyword_0());
            		
            // InternalDrn.g:4712:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDrn.g:4713:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDrn.g:4713:4: (lv_name_1_0= RULE_ID )
            // InternalDrn.g:4714:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getElementAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getElementRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

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
    // $ANTLR end "ruleElement"


    // $ANTLR start "entryRuleEInt"
    // InternalDrn.g:4734:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalDrn.g:4734:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalDrn.g:4735:2: iv_ruleEInt= ruleEInt EOF
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
    // InternalDrn.g:4741:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalDrn.g:4747:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalDrn.g:4748:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalDrn.g:4748:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalDrn.g:4749:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalDrn.g:4749:3: (kw= '-' )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==69) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalDrn.g:4750:4: kw= '-'
                    {
                    kw=(Token)match(input,69,FOLLOW_14); 

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


    // $ANTLR start "ruleColorLed"
    // InternalDrn.g:4767:1: ruleColorLed returns [Enumerator current=null] : ( (enumLiteral_0= 'BLUE' ) | (enumLiteral_1= 'RED' ) | (enumLiteral_2= 'YELLOW' ) | (enumLiteral_3= 'GREEN' ) | (enumLiteral_4= 'WHITE' ) ) ;
    public final Enumerator ruleColorLed() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalDrn.g:4773:2: ( ( (enumLiteral_0= 'BLUE' ) | (enumLiteral_1= 'RED' ) | (enumLiteral_2= 'YELLOW' ) | (enumLiteral_3= 'GREEN' ) | (enumLiteral_4= 'WHITE' ) ) )
            // InternalDrn.g:4774:2: ( (enumLiteral_0= 'BLUE' ) | (enumLiteral_1= 'RED' ) | (enumLiteral_2= 'YELLOW' ) | (enumLiteral_3= 'GREEN' ) | (enumLiteral_4= 'WHITE' ) )
            {
            // InternalDrn.g:4774:2: ( (enumLiteral_0= 'BLUE' ) | (enumLiteral_1= 'RED' ) | (enumLiteral_2= 'YELLOW' ) | (enumLiteral_3= 'GREEN' ) | (enumLiteral_4= 'WHITE' ) )
            int alt43=5;
            switch ( input.LA(1) ) {
            case 70:
                {
                alt43=1;
                }
                break;
            case 71:
                {
                alt43=2;
                }
                break;
            case 72:
                {
                alt43=3;
                }
                break;
            case 73:
                {
                alt43=4;
                }
                break;
            case 74:
                {
                alt43=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }

            switch (alt43) {
                case 1 :
                    // InternalDrn.g:4775:3: (enumLiteral_0= 'BLUE' )
                    {
                    // InternalDrn.g:4775:3: (enumLiteral_0= 'BLUE' )
                    // InternalDrn.g:4776:4: enumLiteral_0= 'BLUE'
                    {
                    enumLiteral_0=(Token)match(input,70,FOLLOW_2); 

                    				current = grammarAccess.getColorLedAccess().getBLUEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getColorLedAccess().getBLUEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDrn.g:4783:3: (enumLiteral_1= 'RED' )
                    {
                    // InternalDrn.g:4783:3: (enumLiteral_1= 'RED' )
                    // InternalDrn.g:4784:4: enumLiteral_1= 'RED'
                    {
                    enumLiteral_1=(Token)match(input,71,FOLLOW_2); 

                    				current = grammarAccess.getColorLedAccess().getREDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getColorLedAccess().getREDEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalDrn.g:4791:3: (enumLiteral_2= 'YELLOW' )
                    {
                    // InternalDrn.g:4791:3: (enumLiteral_2= 'YELLOW' )
                    // InternalDrn.g:4792:4: enumLiteral_2= 'YELLOW'
                    {
                    enumLiteral_2=(Token)match(input,72,FOLLOW_2); 

                    				current = grammarAccess.getColorLedAccess().getYELLOWEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getColorLedAccess().getYELLOWEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalDrn.g:4799:3: (enumLiteral_3= 'GREEN' )
                    {
                    // InternalDrn.g:4799:3: (enumLiteral_3= 'GREEN' )
                    // InternalDrn.g:4800:4: enumLiteral_3= 'GREEN'
                    {
                    enumLiteral_3=(Token)match(input,73,FOLLOW_2); 

                    				current = grammarAccess.getColorLedAccess().getGREENEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getColorLedAccess().getGREENEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalDrn.g:4807:3: (enumLiteral_4= 'WHITE' )
                    {
                    // InternalDrn.g:4807:3: (enumLiteral_4= 'WHITE' )
                    // InternalDrn.g:4808:4: enumLiteral_4= 'WHITE'
                    {
                    enumLiteral_4=(Token)match(input,74,FOLLOW_2); 

                    				current = grammarAccess.getColorLedAccess().getWHITEEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getColorLedAccess().getWHITEEnumLiteralDeclaration_4());
                    			

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
    // $ANTLR end "ruleColorLed"


    // $ANTLR start "ruleMode"
    // InternalDrn.g:4818:1: ruleMode returns [Enumerator current=null] : ( (enumLiteral_0= 'OFF' ) | (enumLiteral_1= 'ON' ) ) ;
    public final Enumerator ruleMode() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalDrn.g:4824:2: ( ( (enumLiteral_0= 'OFF' ) | (enumLiteral_1= 'ON' ) ) )
            // InternalDrn.g:4825:2: ( (enumLiteral_0= 'OFF' ) | (enumLiteral_1= 'ON' ) )
            {
            // InternalDrn.g:4825:2: ( (enumLiteral_0= 'OFF' ) | (enumLiteral_1= 'ON' ) )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==75) ) {
                alt44=1;
            }
            else if ( (LA44_0==76) ) {
                alt44=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }
            switch (alt44) {
                case 1 :
                    // InternalDrn.g:4826:3: (enumLiteral_0= 'OFF' )
                    {
                    // InternalDrn.g:4826:3: (enumLiteral_0= 'OFF' )
                    // InternalDrn.g:4827:4: enumLiteral_0= 'OFF'
                    {
                    enumLiteral_0=(Token)match(input,75,FOLLOW_2); 

                    				current = grammarAccess.getModeAccess().getOFFEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getModeAccess().getOFFEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDrn.g:4834:3: (enumLiteral_1= 'ON' )
                    {
                    // InternalDrn.g:4834:3: (enumLiteral_1= 'ON' )
                    // InternalDrn.g:4835:4: enumLiteral_1= 'ON'
                    {
                    enumLiteral_1=(Token)match(input,76,FOLLOW_2); 

                    				current = grammarAccess.getModeAccess().getONEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getModeAccess().getONEnumLiteralDeclaration_1());
                    			

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
    // $ANTLR end "ruleMode"


    // $ANTLR start "ruleEBool"
    // InternalDrn.g:4845:1: ruleEBool returns [Enumerator current=null] : ( (enumLiteral_0= 'TRUE' ) | (enumLiteral_1= 'FALSE' ) ) ;
    public final Enumerator ruleEBool() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalDrn.g:4851:2: ( ( (enumLiteral_0= 'TRUE' ) | (enumLiteral_1= 'FALSE' ) ) )
            // InternalDrn.g:4852:2: ( (enumLiteral_0= 'TRUE' ) | (enumLiteral_1= 'FALSE' ) )
            {
            // InternalDrn.g:4852:2: ( (enumLiteral_0= 'TRUE' ) | (enumLiteral_1= 'FALSE' ) )
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==77) ) {
                alt45=1;
            }
            else if ( (LA45_0==78) ) {
                alt45=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }
            switch (alt45) {
                case 1 :
                    // InternalDrn.g:4853:3: (enumLiteral_0= 'TRUE' )
                    {
                    // InternalDrn.g:4853:3: (enumLiteral_0= 'TRUE' )
                    // InternalDrn.g:4854:4: enumLiteral_0= 'TRUE'
                    {
                    enumLiteral_0=(Token)match(input,77,FOLLOW_2); 

                    				current = grammarAccess.getEBoolAccess().getTRUEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getEBoolAccess().getTRUEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDrn.g:4861:3: (enumLiteral_1= 'FALSE' )
                    {
                    // InternalDrn.g:4861:3: (enumLiteral_1= 'FALSE' )
                    // InternalDrn.g:4862:4: enumLiteral_1= 'FALSE'
                    {
                    enumLiteral_1=(Token)match(input,78,FOLLOW_2); 

                    				current = grammarAccess.getEBoolAccess().getFALSEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getEBoolAccess().getFALSEEnumLiteralDeclaration_1());
                    			

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
    // $ANTLR end "ruleEBool"


    // $ANTLR start "ruleDirectionType"
    // InternalDrn.g:4872:1: ruleDirectionType returns [Enumerator current=null] : ( (enumLiteral_0= 'FRONT' ) | (enumLiteral_1= 'BEHIND' ) | (enumLiteral_2= 'LEFT' ) | (enumLiteral_3= 'RIGHT' ) ) ;
    public final Enumerator ruleDirectionType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalDrn.g:4878:2: ( ( (enumLiteral_0= 'FRONT' ) | (enumLiteral_1= 'BEHIND' ) | (enumLiteral_2= 'LEFT' ) | (enumLiteral_3= 'RIGHT' ) ) )
            // InternalDrn.g:4879:2: ( (enumLiteral_0= 'FRONT' ) | (enumLiteral_1= 'BEHIND' ) | (enumLiteral_2= 'LEFT' ) | (enumLiteral_3= 'RIGHT' ) )
            {
            // InternalDrn.g:4879:2: ( (enumLiteral_0= 'FRONT' ) | (enumLiteral_1= 'BEHIND' ) | (enumLiteral_2= 'LEFT' ) | (enumLiteral_3= 'RIGHT' ) )
            int alt46=4;
            switch ( input.LA(1) ) {
            case 79:
                {
                alt46=1;
                }
                break;
            case 80:
                {
                alt46=2;
                }
                break;
            case 81:
                {
                alt46=3;
                }
                break;
            case 82:
                {
                alt46=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }

            switch (alt46) {
                case 1 :
                    // InternalDrn.g:4880:3: (enumLiteral_0= 'FRONT' )
                    {
                    // InternalDrn.g:4880:3: (enumLiteral_0= 'FRONT' )
                    // InternalDrn.g:4881:4: enumLiteral_0= 'FRONT'
                    {
                    enumLiteral_0=(Token)match(input,79,FOLLOW_2); 

                    				current = grammarAccess.getDirectionTypeAccess().getFRONTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getDirectionTypeAccess().getFRONTEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDrn.g:4888:3: (enumLiteral_1= 'BEHIND' )
                    {
                    // InternalDrn.g:4888:3: (enumLiteral_1= 'BEHIND' )
                    // InternalDrn.g:4889:4: enumLiteral_1= 'BEHIND'
                    {
                    enumLiteral_1=(Token)match(input,80,FOLLOW_2); 

                    				current = grammarAccess.getDirectionTypeAccess().getBEHINDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getDirectionTypeAccess().getBEHINDEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalDrn.g:4896:3: (enumLiteral_2= 'LEFT' )
                    {
                    // InternalDrn.g:4896:3: (enumLiteral_2= 'LEFT' )
                    // InternalDrn.g:4897:4: enumLiteral_2= 'LEFT'
                    {
                    enumLiteral_2=(Token)match(input,81,FOLLOW_2); 

                    				current = grammarAccess.getDirectionTypeAccess().getLEFTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getDirectionTypeAccess().getLEFTEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalDrn.g:4904:3: (enumLiteral_3= 'RIGHT' )
                    {
                    // InternalDrn.g:4904:3: (enumLiteral_3= 'RIGHT' )
                    // InternalDrn.g:4905:4: enumLiteral_3= 'RIGHT'
                    {
                    enumLiteral_3=(Token)match(input,82,FOLLOW_2); 

                    				current = grammarAccess.getDirectionTypeAccess().getRIGHTEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getDirectionTypeAccess().getRIGHTEnumLiteralDeclaration_3());
                    			

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
    // $ANTLR end "ruleDirectionType"

    // Delegated rules


    protected DFA23 dfa23 = new DFA23(this);
    static final String dfa_1s = "\20\uffff";
    static final String dfa_2s = "\2\uffff\1\17\15\uffff";
    static final String dfa_3s = "\1\4\1\uffff\1\20\15\uffff";
    static final String dfa_4s = "\1\67\1\uffff\1\72\15\uffff";
    static final String dfa_5s = "\1\uffff\1\1\1\uffff\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\3\1\2";
    static final String dfa_6s = "\20\uffff}>";
    static final String[] dfa_7s = {
            "\1\2\33\uffff\1\1\1\uffff\1\4\2\uffff\1\4\2\3\2\5\1\6\1\uffff\1\6\1\uffff\2\10\2\7\1\11\1\14\1\uffff\1\13\1\12\1\15",
            "",
            "\1\17\12\uffff\1\17\1\uffff\2\17\1\16\32\uffff\1\17",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA23 extends DFA {

        public DFA23(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 23;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "1363:2: (this_And_0= ruleAnd | this_RefPart_1= ruleRefPart | this_RefPartLib_2= ruleRefPartLib | this_DepX_Impl_3= ruleDepX_Impl | this_DepY_Impl_4= ruleDepY_Impl | this_DepZ_Impl_5= ruleDepZ_Impl | this_DepXY_IMPL_6= ruleDepXY_IMPL | this_DepXZ_IMPL_7= ruleDepXZ_IMPL | this_DepYZ_IMPL_8= ruleDepYZ_IMPL | this_DepXYZ_IMPL_9= ruleDepXYZ_IMPL | this_TakeOff_10= ruleTakeOff | this_Wait_11= ruleWait | this_Rotate_12= ruleRotate | this_Land_13= ruleLand )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0100000000082010L,0x0000000000000008L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0100000000086010L,0x0000000000000008L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x01000000000A2010L,0x0000000000000008L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000007F00000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000007F20000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000000L,0x0000000000078000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x00EFD7E510000010L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x00EFD7E510020010L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0400000008000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x00EFD7E500000010L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x000BD7E400000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000240000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000000020L,0x0000000000000020L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0xA000000000000010L,0x0000000000000002L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001800L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000000000L,0x00000000000007C0L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x1000000040000020L,0x0000000000007820L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});

}