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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'MODEL'", "'{'", "'start'", "'='", "';'", "'}'", "'CONTEXT'", "'initialDirection'", "'positionX'", "'positionY'", "'maxLength'", "'maxWidth'", "'maxSpeed'", "'maxHeigth'", "'X'", "'('", "'then'", "')'", "'merge'", "','", "'forward'", "'distance'", "'temps'", "'backward'", "'left'", "'right'", "'up'", "'down'", "'depXY'", "'cercleXY'", "'rayon'", "'carreXY'", "'cote'", "'depYZ'", "'cercleYZ'", "'carreYZ'", "'depXZ'", "'depXYZ'", "'flip'", "'rotate'", "'angle'", "'wait'", "'takeoff'", "'land'", "'DEVICE'", "'type'", "'with'", "'mode'", "'attribute'", "'.'", "'led'", "'color'", "'ledBlink'", "'blink_per_sec'", "'camera'", "'id'", "'Type'", "'element'", "'-'", "'BLUE'", "'RED'", "'YELLOW'", "'GREEN'", "'WHITE'", "'OFF'", "'ON'", "'TRUE'", "'FALSE'", "'FRONT'", "'BEHIND'", "'LEFT'", "'RIGHT'"
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
    public static final int RULE_INT=4;
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
        	return "Model";
       	}

       	@Override
       	protected DrnGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalDrn.g:65:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalDrn.g:65:46: (iv_ruleModel= ruleModel EOF )
            // InternalDrn.g:66:2: iv_ruleModel= ruleModel EOF
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
    // InternalDrn.g:72:1: ruleModel returns [EObject current=null] : (otherlv_0= 'MODEL' otherlv_1= '{' ( (lv_context_2_0= ruleContext ) )? ( (lv_types_3_0= ruleTypeGeneric ) )* ( (lv_devices_4_0= ruleDevice ) )* ( (lv_assignement_5_0= ruleAssignement ) ) ( (lv_assignement_6_0= ruleAssignement ) )* otherlv_7= 'start' otherlv_8= '=' ( (lv_main_9_0= ruleRefPart ) ) otherlv_10= ';' otherlv_11= '}' ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        EObject lv_context_2_0 = null;

        EObject lv_types_3_0 = null;

        EObject lv_devices_4_0 = null;

        EObject lv_assignement_5_0 = null;

        EObject lv_assignement_6_0 = null;

        EObject lv_main_9_0 = null;



        	enterRule();

        try {
            // InternalDrn.g:78:2: ( (otherlv_0= 'MODEL' otherlv_1= '{' ( (lv_context_2_0= ruleContext ) )? ( (lv_types_3_0= ruleTypeGeneric ) )* ( (lv_devices_4_0= ruleDevice ) )* ( (lv_assignement_5_0= ruleAssignement ) ) ( (lv_assignement_6_0= ruleAssignement ) )* otherlv_7= 'start' otherlv_8= '=' ( (lv_main_9_0= ruleRefPart ) ) otherlv_10= ';' otherlv_11= '}' ) )
            // InternalDrn.g:79:2: (otherlv_0= 'MODEL' otherlv_1= '{' ( (lv_context_2_0= ruleContext ) )? ( (lv_types_3_0= ruleTypeGeneric ) )* ( (lv_devices_4_0= ruleDevice ) )* ( (lv_assignement_5_0= ruleAssignement ) ) ( (lv_assignement_6_0= ruleAssignement ) )* otherlv_7= 'start' otherlv_8= '=' ( (lv_main_9_0= ruleRefPart ) ) otherlv_10= ';' otherlv_11= '}' )
            {
            // InternalDrn.g:79:2: (otherlv_0= 'MODEL' otherlv_1= '{' ( (lv_context_2_0= ruleContext ) )? ( (lv_types_3_0= ruleTypeGeneric ) )* ( (lv_devices_4_0= ruleDevice ) )* ( (lv_assignement_5_0= ruleAssignement ) ) ( (lv_assignement_6_0= ruleAssignement ) )* otherlv_7= 'start' otherlv_8= '=' ( (lv_main_9_0= ruleRefPart ) ) otherlv_10= ';' otherlv_11= '}' )
            // InternalDrn.g:80:3: otherlv_0= 'MODEL' otherlv_1= '{' ( (lv_context_2_0= ruleContext ) )? ( (lv_types_3_0= ruleTypeGeneric ) )* ( (lv_devices_4_0= ruleDevice ) )* ( (lv_assignement_5_0= ruleAssignement ) ) ( (lv_assignement_6_0= ruleAssignement ) )* otherlv_7= 'start' otherlv_8= '=' ( (lv_main_9_0= ruleRefPart ) ) otherlv_10= ';' otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getModelAccess().getMODELKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalDrn.g:88:3: ( (lv_context_2_0= ruleContext ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==17) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalDrn.g:89:4: (lv_context_2_0= ruleContext )
                    {
                    // InternalDrn.g:89:4: (lv_context_2_0= ruleContext )
                    // InternalDrn.g:90:5: lv_context_2_0= ruleContext
                    {

                    					newCompositeNode(grammarAccess.getModelAccess().getContextContextParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_4);
                    lv_context_2_0=ruleContext();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getModelRule());
                    					}
                    					set(
                    						current,
                    						"context",
                    						lv_context_2_0,
                    						"sar.drone.Drn.Context");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalDrn.g:107:3: ( (lv_types_3_0= ruleTypeGeneric ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==67) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalDrn.g:108:4: (lv_types_3_0= ruleTypeGeneric )
            	    {
            	    // InternalDrn.g:108:4: (lv_types_3_0= ruleTypeGeneric )
            	    // InternalDrn.g:109:5: lv_types_3_0= ruleTypeGeneric
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getTypesTypeGenericParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_types_3_0=ruleTypeGeneric();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"types",
            	    						lv_types_3_0,
            	    						"sar.drone.Drn.TypeGeneric");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // InternalDrn.g:126:3: ( (lv_devices_4_0= ruleDevice ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==55) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalDrn.g:127:4: (lv_devices_4_0= ruleDevice )
            	    {
            	    // InternalDrn.g:127:4: (lv_devices_4_0= ruleDevice )
            	    // InternalDrn.g:128:5: lv_devices_4_0= ruleDevice
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getDevicesDeviceParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_devices_4_0=ruleDevice();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"devices",
            	    						lv_devices_4_0,
            	    						"sar.drone.Drn.Device");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // InternalDrn.g:145:3: ( (lv_assignement_5_0= ruleAssignement ) )
            // InternalDrn.g:146:4: (lv_assignement_5_0= ruleAssignement )
            {
            // InternalDrn.g:146:4: (lv_assignement_5_0= ruleAssignement )
            // InternalDrn.g:147:5: lv_assignement_5_0= ruleAssignement
            {

            					newCompositeNode(grammarAccess.getModelAccess().getAssignementAssignementParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_5);
            lv_assignement_5_0=ruleAssignement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModelRule());
            					}
            					add(
            						current,
            						"assignement",
            						lv_assignement_5_0,
            						"sar.drone.Drn.Assignement");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDrn.g:164:3: ( (lv_assignement_6_0= ruleAssignement ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalDrn.g:165:4: (lv_assignement_6_0= ruleAssignement )
            	    {
            	    // InternalDrn.g:165:4: (lv_assignement_6_0= ruleAssignement )
            	    // InternalDrn.g:166:5: lv_assignement_6_0= ruleAssignement
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getAssignementAssignementParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_assignement_6_0=ruleAssignement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"assignement",
            	    						lv_assignement_6_0,
            	    						"sar.drone.Drn.Assignement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_7=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_7, grammarAccess.getModelAccess().getStartKeyword_7());
            		
            otherlv_8=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_8, grammarAccess.getModelAccess().getEqualsSignKeyword_8());
            		
            // InternalDrn.g:191:3: ( (lv_main_9_0= ruleRefPart ) )
            // InternalDrn.g:192:4: (lv_main_9_0= ruleRefPart )
            {
            // InternalDrn.g:192:4: (lv_main_9_0= ruleRefPart )
            // InternalDrn.g:193:5: lv_main_9_0= ruleRefPart
            {

            					newCompositeNode(grammarAccess.getModelAccess().getMainRefPartParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_8);
            lv_main_9_0=ruleRefPart();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModelRule());
            					}
            					set(
            						current,
            						"main",
            						lv_main_9_0,
            						"sar.drone.Drn.RefPart");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_10=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_10, grammarAccess.getModelAccess().getSemicolonKeyword_10());
            		
            otherlv_11=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getModelAccess().getRightCurlyBracketKeyword_11());
            		

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


    // $ANTLR start "entryRuleContext"
    // InternalDrn.g:222:1: entryRuleContext returns [EObject current=null] : iv_ruleContext= ruleContext EOF ;
    public final EObject entryRuleContext() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContext = null;


        try {
            // InternalDrn.g:222:48: (iv_ruleContext= ruleContext EOF )
            // InternalDrn.g:223:2: iv_ruleContext= ruleContext EOF
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
    // InternalDrn.g:229:1: ruleContext returns [EObject current=null] : ( ( (lv_name_0_0= 'CONTEXT' ) ) otherlv_1= '{' ( (lv_limit_2_0= ruleLimit ) ) otherlv_3= ';' ( ( (lv_limit_4_0= ruleLimit ) ) otherlv_5= ';' )* otherlv_6= '}' ) ;
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
            // InternalDrn.g:235:2: ( ( ( (lv_name_0_0= 'CONTEXT' ) ) otherlv_1= '{' ( (lv_limit_2_0= ruleLimit ) ) otherlv_3= ';' ( ( (lv_limit_4_0= ruleLimit ) ) otherlv_5= ';' )* otherlv_6= '}' ) )
            // InternalDrn.g:236:2: ( ( (lv_name_0_0= 'CONTEXT' ) ) otherlv_1= '{' ( (lv_limit_2_0= ruleLimit ) ) otherlv_3= ';' ( ( (lv_limit_4_0= ruleLimit ) ) otherlv_5= ';' )* otherlv_6= '}' )
            {
            // InternalDrn.g:236:2: ( ( (lv_name_0_0= 'CONTEXT' ) ) otherlv_1= '{' ( (lv_limit_2_0= ruleLimit ) ) otherlv_3= ';' ( ( (lv_limit_4_0= ruleLimit ) ) otherlv_5= ';' )* otherlv_6= '}' )
            // InternalDrn.g:237:3: ( (lv_name_0_0= 'CONTEXT' ) ) otherlv_1= '{' ( (lv_limit_2_0= ruleLimit ) ) otherlv_3= ';' ( ( (lv_limit_4_0= ruleLimit ) ) otherlv_5= ';' )* otherlv_6= '}'
            {
            // InternalDrn.g:237:3: ( (lv_name_0_0= 'CONTEXT' ) )
            // InternalDrn.g:238:4: (lv_name_0_0= 'CONTEXT' )
            {
            // InternalDrn.g:238:4: (lv_name_0_0= 'CONTEXT' )
            // InternalDrn.g:239:5: lv_name_0_0= 'CONTEXT'
            {
            lv_name_0_0=(Token)match(input,17,FOLLOW_3); 

            					newLeafNode(lv_name_0_0, grammarAccess.getContextAccess().getNameCONTEXTKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getContextRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "CONTEXT");
            				

            }


            }

            otherlv_1=(Token)match(input,12,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getContextAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalDrn.g:255:3: ( (lv_limit_2_0= ruleLimit ) )
            // InternalDrn.g:256:4: (lv_limit_2_0= ruleLimit )
            {
            // InternalDrn.g:256:4: (lv_limit_2_0= ruleLimit )
            // InternalDrn.g:257:5: lv_limit_2_0= ruleLimit
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

            otherlv_3=(Token)match(input,15,FOLLOW_11); 

            			newLeafNode(otherlv_3, grammarAccess.getContextAccess().getSemicolonKeyword_3());
            		
            // InternalDrn.g:278:3: ( ( (lv_limit_4_0= ruleLimit ) ) otherlv_5= ';' )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=18 && LA5_0<=24)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalDrn.g:279:4: ( (lv_limit_4_0= ruleLimit ) ) otherlv_5= ';'
            	    {
            	    // InternalDrn.g:279:4: ( (lv_limit_4_0= ruleLimit ) )
            	    // InternalDrn.g:280:5: (lv_limit_4_0= ruleLimit )
            	    {
            	    // InternalDrn.g:280:5: (lv_limit_4_0= ruleLimit )
            	    // InternalDrn.g:281:6: lv_limit_4_0= ruleLimit
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

            	    otherlv_5=(Token)match(input,15,FOLLOW_11); 

            	    				newLeafNode(otherlv_5, grammarAccess.getContextAccess().getSemicolonKeyword_4_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_6=(Token)match(input,16,FOLLOW_2); 

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
    // InternalDrn.g:311:1: entryRuleLimit returns [EObject current=null] : iv_ruleLimit= ruleLimit EOF ;
    public final EObject entryRuleLimit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLimit = null;


        try {
            // InternalDrn.g:311:46: (iv_ruleLimit= ruleLimit EOF )
            // InternalDrn.g:312:2: iv_ruleLimit= ruleLimit EOF
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
    // InternalDrn.g:318:1: ruleLimit returns [EObject current=null] : (this_MaxSpeed_0= ruleMaxSpeed | this_Surface_1= ruleSurface | this_InitialPosition_2= ruleInitialPosition ) ;
    public final EObject ruleLimit() throws RecognitionException {
        EObject current = null;

        EObject this_MaxSpeed_0 = null;

        EObject this_Surface_1 = null;

        EObject this_InitialPosition_2 = null;



        	enterRule();

        try {
            // InternalDrn.g:324:2: ( (this_MaxSpeed_0= ruleMaxSpeed | this_Surface_1= ruleSurface | this_InitialPosition_2= ruleInitialPosition ) )
            // InternalDrn.g:325:2: (this_MaxSpeed_0= ruleMaxSpeed | this_Surface_1= ruleSurface | this_InitialPosition_2= ruleInitialPosition )
            {
            // InternalDrn.g:325:2: (this_MaxSpeed_0= ruleMaxSpeed | this_Surface_1= ruleSurface | this_InitialPosition_2= ruleInitialPosition )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt6=1;
                }
                break;
            case 21:
            case 22:
            case 24:
                {
                alt6=2;
                }
                break;
            case 18:
            case 19:
            case 20:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalDrn.g:326:3: this_MaxSpeed_0= ruleMaxSpeed
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
                    // InternalDrn.g:335:3: this_Surface_1= ruleSurface
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
                    // InternalDrn.g:344:3: this_InitialPosition_2= ruleInitialPosition
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
    // InternalDrn.g:356:1: entryRuleSurface returns [EObject current=null] : iv_ruleSurface= ruleSurface EOF ;
    public final EObject entryRuleSurface() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSurface = null;


        try {
            // InternalDrn.g:356:48: (iv_ruleSurface= ruleSurface EOF )
            // InternalDrn.g:357:2: iv_ruleSurface= ruleSurface EOF
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
    // InternalDrn.g:363:1: ruleSurface returns [EObject current=null] : (this_MaxHeigth_0= ruleMaxHeigth | this_MaxLength_1= ruleMaxLength | this_MaxWidth_2= ruleMaxWidth ) ;
    public final EObject ruleSurface() throws RecognitionException {
        EObject current = null;

        EObject this_MaxHeigth_0 = null;

        EObject this_MaxLength_1 = null;

        EObject this_MaxWidth_2 = null;



        	enterRule();

        try {
            // InternalDrn.g:369:2: ( (this_MaxHeigth_0= ruleMaxHeigth | this_MaxLength_1= ruleMaxLength | this_MaxWidth_2= ruleMaxWidth ) )
            // InternalDrn.g:370:2: (this_MaxHeigth_0= ruleMaxHeigth | this_MaxLength_1= ruleMaxLength | this_MaxWidth_2= ruleMaxWidth )
            {
            // InternalDrn.g:370:2: (this_MaxHeigth_0= ruleMaxHeigth | this_MaxLength_1= ruleMaxLength | this_MaxWidth_2= ruleMaxWidth )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt7=1;
                }
                break;
            case 21:
                {
                alt7=2;
                }
                break;
            case 22:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalDrn.g:371:3: this_MaxHeigth_0= ruleMaxHeigth
                    {

                    			newCompositeNode(grammarAccess.getSurfaceAccess().getMaxHeigthParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_MaxHeigth_0=ruleMaxHeigth();

                    state._fsp--;


                    			current = this_MaxHeigth_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDrn.g:380:3: this_MaxLength_1= ruleMaxLength
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
                    // InternalDrn.g:389:3: this_MaxWidth_2= ruleMaxWidth
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
    // InternalDrn.g:401:1: entryRuleInitialPosition returns [EObject current=null] : iv_ruleInitialPosition= ruleInitialPosition EOF ;
    public final EObject entryRuleInitialPosition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInitialPosition = null;


        try {
            // InternalDrn.g:401:56: (iv_ruleInitialPosition= ruleInitialPosition EOF )
            // InternalDrn.g:402:2: iv_ruleInitialPosition= ruleInitialPosition EOF
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
    // InternalDrn.g:408:1: ruleInitialPosition returns [EObject current=null] : (this_InitialPositionX_0= ruleInitialPositionX | this_InitialPositionY_1= ruleInitialPositionY | this_InitialDirection_2= ruleInitialDirection ) ;
    public final EObject ruleInitialPosition() throws RecognitionException {
        EObject current = null;

        EObject this_InitialPositionX_0 = null;

        EObject this_InitialPositionY_1 = null;

        EObject this_InitialDirection_2 = null;



        	enterRule();

        try {
            // InternalDrn.g:414:2: ( (this_InitialPositionX_0= ruleInitialPositionX | this_InitialPositionY_1= ruleInitialPositionY | this_InitialDirection_2= ruleInitialDirection ) )
            // InternalDrn.g:415:2: (this_InitialPositionX_0= ruleInitialPositionX | this_InitialPositionY_1= ruleInitialPositionY | this_InitialDirection_2= ruleInitialDirection )
            {
            // InternalDrn.g:415:2: (this_InitialPositionX_0= ruleInitialPositionX | this_InitialPositionY_1= ruleInitialPositionY | this_InitialDirection_2= ruleInitialDirection )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt8=1;
                }
                break;
            case 20:
                {
                alt8=2;
                }
                break;
            case 18:
                {
                alt8=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalDrn.g:416:3: this_InitialPositionX_0= ruleInitialPositionX
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
                    // InternalDrn.g:425:3: this_InitialPositionY_1= ruleInitialPositionY
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
                    // InternalDrn.g:434:3: this_InitialDirection_2= ruleInitialDirection
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
    // InternalDrn.g:446:1: entryRuleInitialDirection returns [EObject current=null] : iv_ruleInitialDirection= ruleInitialDirection EOF ;
    public final EObject entryRuleInitialDirection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInitialDirection = null;


        try {
            // InternalDrn.g:446:57: (iv_ruleInitialDirection= ruleInitialDirection EOF )
            // InternalDrn.g:447:2: iv_ruleInitialDirection= ruleInitialDirection EOF
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
    // InternalDrn.g:453:1: ruleInitialDirection returns [EObject current=null] : ( ( (lv_name_0_0= 'initialDirection' ) ) otherlv_1= '=' ( (lv_value_2_0= ruleDirectionType ) ) ) ;
    public final EObject ruleInitialDirection() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Enumerator lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalDrn.g:459:2: ( ( ( (lv_name_0_0= 'initialDirection' ) ) otherlv_1= '=' ( (lv_value_2_0= ruleDirectionType ) ) ) )
            // InternalDrn.g:460:2: ( ( (lv_name_0_0= 'initialDirection' ) ) otherlv_1= '=' ( (lv_value_2_0= ruleDirectionType ) ) )
            {
            // InternalDrn.g:460:2: ( ( (lv_name_0_0= 'initialDirection' ) ) otherlv_1= '=' ( (lv_value_2_0= ruleDirectionType ) ) )
            // InternalDrn.g:461:3: ( (lv_name_0_0= 'initialDirection' ) ) otherlv_1= '=' ( (lv_value_2_0= ruleDirectionType ) )
            {
            // InternalDrn.g:461:3: ( (lv_name_0_0= 'initialDirection' ) )
            // InternalDrn.g:462:4: (lv_name_0_0= 'initialDirection' )
            {
            // InternalDrn.g:462:4: (lv_name_0_0= 'initialDirection' )
            // InternalDrn.g:463:5: lv_name_0_0= 'initialDirection'
            {
            lv_name_0_0=(Token)match(input,18,FOLLOW_6); 

            					newLeafNode(lv_name_0_0, grammarAccess.getInitialDirectionAccess().getNameInitialDirectionKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInitialDirectionRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "initialDirection");
            				

            }


            }

            otherlv_1=(Token)match(input,14,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getInitialDirectionAccess().getEqualsSignKeyword_1());
            		
            // InternalDrn.g:479:3: ( (lv_value_2_0= ruleDirectionType ) )
            // InternalDrn.g:480:4: (lv_value_2_0= ruleDirectionType )
            {
            // InternalDrn.g:480:4: (lv_value_2_0= ruleDirectionType )
            // InternalDrn.g:481:5: lv_value_2_0= ruleDirectionType
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
    // InternalDrn.g:502:1: entryRuleInitialPositionX returns [EObject current=null] : iv_ruleInitialPositionX= ruleInitialPositionX EOF ;
    public final EObject entryRuleInitialPositionX() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInitialPositionX = null;


        try {
            // InternalDrn.g:502:57: (iv_ruleInitialPositionX= ruleInitialPositionX EOF )
            // InternalDrn.g:503:2: iv_ruleInitialPositionX= ruleInitialPositionX EOF
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
    // InternalDrn.g:509:1: ruleInitialPositionX returns [EObject current=null] : ( ( (lv_name_0_0= 'positionX' ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_INT ) ) ) ;
    public final EObject ruleInitialPositionX() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;


        	enterRule();

        try {
            // InternalDrn.g:515:2: ( ( ( (lv_name_0_0= 'positionX' ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_INT ) ) ) )
            // InternalDrn.g:516:2: ( ( (lv_name_0_0= 'positionX' ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_INT ) ) )
            {
            // InternalDrn.g:516:2: ( ( (lv_name_0_0= 'positionX' ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_INT ) ) )
            // InternalDrn.g:517:3: ( (lv_name_0_0= 'positionX' ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_INT ) )
            {
            // InternalDrn.g:517:3: ( (lv_name_0_0= 'positionX' ) )
            // InternalDrn.g:518:4: (lv_name_0_0= 'positionX' )
            {
            // InternalDrn.g:518:4: (lv_name_0_0= 'positionX' )
            // InternalDrn.g:519:5: lv_name_0_0= 'positionX'
            {
            lv_name_0_0=(Token)match(input,19,FOLLOW_6); 

            					newLeafNode(lv_name_0_0, grammarAccess.getInitialPositionXAccess().getNamePositionXKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInitialPositionXRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "positionX");
            				

            }


            }

            otherlv_1=(Token)match(input,14,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getInitialPositionXAccess().getEqualsSignKeyword_1());
            		
            // InternalDrn.g:535:3: ( (lv_value_2_0= RULE_INT ) )
            // InternalDrn.g:536:4: (lv_value_2_0= RULE_INT )
            {
            // InternalDrn.g:536:4: (lv_value_2_0= RULE_INT )
            // InternalDrn.g:537:5: lv_value_2_0= RULE_INT
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
    // InternalDrn.g:557:1: entryRuleInitialPositionY returns [EObject current=null] : iv_ruleInitialPositionY= ruleInitialPositionY EOF ;
    public final EObject entryRuleInitialPositionY() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInitialPositionY = null;


        try {
            // InternalDrn.g:557:57: (iv_ruleInitialPositionY= ruleInitialPositionY EOF )
            // InternalDrn.g:558:2: iv_ruleInitialPositionY= ruleInitialPositionY EOF
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
    // InternalDrn.g:564:1: ruleInitialPositionY returns [EObject current=null] : ( ( (lv_name_0_0= 'positionY' ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_INT ) ) ) ;
    public final EObject ruleInitialPositionY() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;


        	enterRule();

        try {
            // InternalDrn.g:570:2: ( ( ( (lv_name_0_0= 'positionY' ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_INT ) ) ) )
            // InternalDrn.g:571:2: ( ( (lv_name_0_0= 'positionY' ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_INT ) ) )
            {
            // InternalDrn.g:571:2: ( ( (lv_name_0_0= 'positionY' ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_INT ) ) )
            // InternalDrn.g:572:3: ( (lv_name_0_0= 'positionY' ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_INT ) )
            {
            // InternalDrn.g:572:3: ( (lv_name_0_0= 'positionY' ) )
            // InternalDrn.g:573:4: (lv_name_0_0= 'positionY' )
            {
            // InternalDrn.g:573:4: (lv_name_0_0= 'positionY' )
            // InternalDrn.g:574:5: lv_name_0_0= 'positionY'
            {
            lv_name_0_0=(Token)match(input,20,FOLLOW_6); 

            					newLeafNode(lv_name_0_0, grammarAccess.getInitialPositionYAccess().getNamePositionYKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInitialPositionYRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "positionY");
            				

            }


            }

            otherlv_1=(Token)match(input,14,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getInitialPositionYAccess().getEqualsSignKeyword_1());
            		
            // InternalDrn.g:590:3: ( (lv_value_2_0= RULE_INT ) )
            // InternalDrn.g:591:4: (lv_value_2_0= RULE_INT )
            {
            // InternalDrn.g:591:4: (lv_value_2_0= RULE_INT )
            // InternalDrn.g:592:5: lv_value_2_0= RULE_INT
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
    // InternalDrn.g:612:1: entryRuleMaxLength returns [EObject current=null] : iv_ruleMaxLength= ruleMaxLength EOF ;
    public final EObject entryRuleMaxLength() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMaxLength = null;


        try {
            // InternalDrn.g:612:50: (iv_ruleMaxLength= ruleMaxLength EOF )
            // InternalDrn.g:613:2: iv_ruleMaxLength= ruleMaxLength EOF
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
    // InternalDrn.g:619:1: ruleMaxLength returns [EObject current=null] : ( ( (lv_name_0_0= 'maxLength' ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_INT ) ) ) ;
    public final EObject ruleMaxLength() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;


        	enterRule();

        try {
            // InternalDrn.g:625:2: ( ( ( (lv_name_0_0= 'maxLength' ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_INT ) ) ) )
            // InternalDrn.g:626:2: ( ( (lv_name_0_0= 'maxLength' ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_INT ) ) )
            {
            // InternalDrn.g:626:2: ( ( (lv_name_0_0= 'maxLength' ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_INT ) ) )
            // InternalDrn.g:627:3: ( (lv_name_0_0= 'maxLength' ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_INT ) )
            {
            // InternalDrn.g:627:3: ( (lv_name_0_0= 'maxLength' ) )
            // InternalDrn.g:628:4: (lv_name_0_0= 'maxLength' )
            {
            // InternalDrn.g:628:4: (lv_name_0_0= 'maxLength' )
            // InternalDrn.g:629:5: lv_name_0_0= 'maxLength'
            {
            lv_name_0_0=(Token)match(input,21,FOLLOW_6); 

            					newLeafNode(lv_name_0_0, grammarAccess.getMaxLengthAccess().getNameMaxLengthKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMaxLengthRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "maxLength");
            				

            }


            }

            otherlv_1=(Token)match(input,14,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getMaxLengthAccess().getEqualsSignKeyword_1());
            		
            // InternalDrn.g:645:3: ( (lv_value_2_0= RULE_INT ) )
            // InternalDrn.g:646:4: (lv_value_2_0= RULE_INT )
            {
            // InternalDrn.g:646:4: (lv_value_2_0= RULE_INT )
            // InternalDrn.g:647:5: lv_value_2_0= RULE_INT
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
    // InternalDrn.g:667:1: entryRuleMaxWidth returns [EObject current=null] : iv_ruleMaxWidth= ruleMaxWidth EOF ;
    public final EObject entryRuleMaxWidth() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMaxWidth = null;


        try {
            // InternalDrn.g:667:49: (iv_ruleMaxWidth= ruleMaxWidth EOF )
            // InternalDrn.g:668:2: iv_ruleMaxWidth= ruleMaxWidth EOF
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
    // InternalDrn.g:674:1: ruleMaxWidth returns [EObject current=null] : ( ( (lv_name_0_0= 'maxWidth' ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_INT ) ) ) ;
    public final EObject ruleMaxWidth() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;


        	enterRule();

        try {
            // InternalDrn.g:680:2: ( ( ( (lv_name_0_0= 'maxWidth' ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_INT ) ) ) )
            // InternalDrn.g:681:2: ( ( (lv_name_0_0= 'maxWidth' ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_INT ) ) )
            {
            // InternalDrn.g:681:2: ( ( (lv_name_0_0= 'maxWidth' ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_INT ) ) )
            // InternalDrn.g:682:3: ( (lv_name_0_0= 'maxWidth' ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_INT ) )
            {
            // InternalDrn.g:682:3: ( (lv_name_0_0= 'maxWidth' ) )
            // InternalDrn.g:683:4: (lv_name_0_0= 'maxWidth' )
            {
            // InternalDrn.g:683:4: (lv_name_0_0= 'maxWidth' )
            // InternalDrn.g:684:5: lv_name_0_0= 'maxWidth'
            {
            lv_name_0_0=(Token)match(input,22,FOLLOW_6); 

            					newLeafNode(lv_name_0_0, grammarAccess.getMaxWidthAccess().getNameMaxWidthKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMaxWidthRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "maxWidth");
            				

            }


            }

            otherlv_1=(Token)match(input,14,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getMaxWidthAccess().getEqualsSignKeyword_1());
            		
            // InternalDrn.g:700:3: ( (lv_value_2_0= RULE_INT ) )
            // InternalDrn.g:701:4: (lv_value_2_0= RULE_INT )
            {
            // InternalDrn.g:701:4: (lv_value_2_0= RULE_INT )
            // InternalDrn.g:702:5: lv_value_2_0= RULE_INT
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
    // InternalDrn.g:722:1: entryRuleMaxSpeed returns [EObject current=null] : iv_ruleMaxSpeed= ruleMaxSpeed EOF ;
    public final EObject entryRuleMaxSpeed() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMaxSpeed = null;


        try {
            // InternalDrn.g:722:49: (iv_ruleMaxSpeed= ruleMaxSpeed EOF )
            // InternalDrn.g:723:2: iv_ruleMaxSpeed= ruleMaxSpeed EOF
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
    // InternalDrn.g:729:1: ruleMaxSpeed returns [EObject current=null] : ( ( (lv_name_0_0= 'maxSpeed' ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_INT ) ) ) ;
    public final EObject ruleMaxSpeed() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;


        	enterRule();

        try {
            // InternalDrn.g:735:2: ( ( ( (lv_name_0_0= 'maxSpeed' ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_INT ) ) ) )
            // InternalDrn.g:736:2: ( ( (lv_name_0_0= 'maxSpeed' ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_INT ) ) )
            {
            // InternalDrn.g:736:2: ( ( (lv_name_0_0= 'maxSpeed' ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_INT ) ) )
            // InternalDrn.g:737:3: ( (lv_name_0_0= 'maxSpeed' ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_INT ) )
            {
            // InternalDrn.g:737:3: ( (lv_name_0_0= 'maxSpeed' ) )
            // InternalDrn.g:738:4: (lv_name_0_0= 'maxSpeed' )
            {
            // InternalDrn.g:738:4: (lv_name_0_0= 'maxSpeed' )
            // InternalDrn.g:739:5: lv_name_0_0= 'maxSpeed'
            {
            lv_name_0_0=(Token)match(input,23,FOLLOW_6); 

            					newLeafNode(lv_name_0_0, grammarAccess.getMaxSpeedAccess().getNameMaxSpeedKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMaxSpeedRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "maxSpeed");
            				

            }


            }

            otherlv_1=(Token)match(input,14,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getMaxSpeedAccess().getEqualsSignKeyword_1());
            		
            // InternalDrn.g:755:3: ( (lv_value_2_0= RULE_INT ) )
            // InternalDrn.g:756:4: (lv_value_2_0= RULE_INT )
            {
            // InternalDrn.g:756:4: (lv_value_2_0= RULE_INT )
            // InternalDrn.g:757:5: lv_value_2_0= RULE_INT
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


    // $ANTLR start "entryRuleMaxHeigth"
    // InternalDrn.g:777:1: entryRuleMaxHeigth returns [EObject current=null] : iv_ruleMaxHeigth= ruleMaxHeigth EOF ;
    public final EObject entryRuleMaxHeigth() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMaxHeigth = null;


        try {
            // InternalDrn.g:777:50: (iv_ruleMaxHeigth= ruleMaxHeigth EOF )
            // InternalDrn.g:778:2: iv_ruleMaxHeigth= ruleMaxHeigth EOF
            {
             newCompositeNode(grammarAccess.getMaxHeigthRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMaxHeigth=ruleMaxHeigth();

            state._fsp--;

             current =iv_ruleMaxHeigth; 
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
    // $ANTLR end "entryRuleMaxHeigth"


    // $ANTLR start "ruleMaxHeigth"
    // InternalDrn.g:784:1: ruleMaxHeigth returns [EObject current=null] : ( ( (lv_name_0_0= 'maxHeigth' ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_INT ) ) ) ;
    public final EObject ruleMaxHeigth() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;


        	enterRule();

        try {
            // InternalDrn.g:790:2: ( ( ( (lv_name_0_0= 'maxHeigth' ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_INT ) ) ) )
            // InternalDrn.g:791:2: ( ( (lv_name_0_0= 'maxHeigth' ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_INT ) ) )
            {
            // InternalDrn.g:791:2: ( ( (lv_name_0_0= 'maxHeigth' ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_INT ) ) )
            // InternalDrn.g:792:3: ( (lv_name_0_0= 'maxHeigth' ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_INT ) )
            {
            // InternalDrn.g:792:3: ( (lv_name_0_0= 'maxHeigth' ) )
            // InternalDrn.g:793:4: (lv_name_0_0= 'maxHeigth' )
            {
            // InternalDrn.g:793:4: (lv_name_0_0= 'maxHeigth' )
            // InternalDrn.g:794:5: lv_name_0_0= 'maxHeigth'
            {
            lv_name_0_0=(Token)match(input,24,FOLLOW_6); 

            					newLeafNode(lv_name_0_0, grammarAccess.getMaxHeigthAccess().getNameMaxHeigthKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMaxHeigthRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "maxHeigth");
            				

            }


            }

            otherlv_1=(Token)match(input,14,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getMaxHeigthAccess().getEqualsSignKeyword_1());
            		
            // InternalDrn.g:810:3: ( (lv_value_2_0= RULE_INT ) )
            // InternalDrn.g:811:4: (lv_value_2_0= RULE_INT )
            {
            // InternalDrn.g:811:4: (lv_value_2_0= RULE_INT )
            // InternalDrn.g:812:5: lv_value_2_0= RULE_INT
            {
            lv_value_2_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_value_2_0, grammarAccess.getMaxHeigthAccess().getValueINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMaxHeigthRule());
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
    // $ANTLR end "ruleMaxHeigth"


    // $ANTLR start "entryRuleAssignement"
    // InternalDrn.g:832:1: entryRuleAssignement returns [EObject current=null] : iv_ruleAssignement= ruleAssignement EOF ;
    public final EObject entryRuleAssignement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignement = null;


        try {
            // InternalDrn.g:832:52: (iv_ruleAssignement= ruleAssignement EOF )
            // InternalDrn.g:833:2: iv_ruleAssignement= ruleAssignement EOF
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
    // InternalDrn.g:839:1: ruleAssignement returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_operandes_2_0= ruleExpression ) ) otherlv_3= ';' ( ( (lv_operandes_4_0= ruleExpression ) ) otherlv_5= ';' )* otherlv_6= '}' ) ;
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
            // InternalDrn.g:845:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_operandes_2_0= ruleExpression ) ) otherlv_3= ';' ( ( (lv_operandes_4_0= ruleExpression ) ) otherlv_5= ';' )* otherlv_6= '}' ) )
            // InternalDrn.g:846:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_operandes_2_0= ruleExpression ) ) otherlv_3= ';' ( ( (lv_operandes_4_0= ruleExpression ) ) otherlv_5= ';' )* otherlv_6= '}' )
            {
            // InternalDrn.g:846:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_operandes_2_0= ruleExpression ) ) otherlv_3= ';' ( ( (lv_operandes_4_0= ruleExpression ) ) otherlv_5= ';' )* otherlv_6= '}' )
            // InternalDrn.g:847:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_operandes_2_0= ruleExpression ) ) otherlv_3= ';' ( ( (lv_operandes_4_0= ruleExpression ) ) otherlv_5= ';' )* otherlv_6= '}'
            {
            // InternalDrn.g:847:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalDrn.g:848:4: (lv_name_0_0= RULE_ID )
            {
            // InternalDrn.g:848:4: (lv_name_0_0= RULE_ID )
            // InternalDrn.g:849:5: lv_name_0_0= RULE_ID
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

            otherlv_1=(Token)match(input,12,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getAssignementAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalDrn.g:869:3: ( (lv_operandes_2_0= ruleExpression ) )
            // InternalDrn.g:870:4: (lv_operandes_2_0= ruleExpression )
            {
            // InternalDrn.g:870:4: (lv_operandes_2_0= ruleExpression )
            // InternalDrn.g:871:5: lv_operandes_2_0= ruleExpression
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

            otherlv_3=(Token)match(input,15,FOLLOW_15); 

            			newLeafNode(otherlv_3, grammarAccess.getAssignementAccess().getSemicolonKeyword_3());
            		
            // InternalDrn.g:892:3: ( ( (lv_operandes_4_0= ruleExpression ) ) otherlv_5= ';' )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID||LA9_0==26||LA9_0==29||LA9_0==31||(LA9_0>=34 && LA9_0<=40)||LA9_0==42||(LA9_0>=44 && LA9_0<=50)||(LA9_0>=52 && LA9_0<=54)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalDrn.g:893:4: ( (lv_operandes_4_0= ruleExpression ) ) otherlv_5= ';'
            	    {
            	    // InternalDrn.g:893:4: ( (lv_operandes_4_0= ruleExpression ) )
            	    // InternalDrn.g:894:5: (lv_operandes_4_0= ruleExpression )
            	    {
            	    // InternalDrn.g:894:5: (lv_operandes_4_0= ruleExpression )
            	    // InternalDrn.g:895:6: lv_operandes_4_0= ruleExpression
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

            	    otherlv_5=(Token)match(input,15,FOLLOW_15); 

            	    				newLeafNode(otherlv_5, grammarAccess.getAssignementAccess().getSemicolonKeyword_4_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_6=(Token)match(input,16,FOLLOW_2); 

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
    // InternalDrn.g:925:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalDrn.g:925:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalDrn.g:926:2: iv_ruleExpression= ruleExpression EOF
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
    // InternalDrn.g:932:1: ruleExpression returns [EObject current=null] : ( ( ( (lv_move_0_0= ruleMovement ) ) (otherlv_1= 'X' ( ( (lv_repeatCST_2_0= RULE_INT ) ) | ( (otherlv_3= RULE_ID ) ) ) )? ( (lv_with_4_0= ruleWith ) )? ) | (otherlv_5= '(' ( (lv_move_6_0= ruleMovement ) ) (otherlv_7= 'then' ( (lv_then_8_0= ruleExpression ) ) ) (otherlv_9= 'then' ( (lv_then_10_0= ruleExpression ) ) )* otherlv_11= ')' (otherlv_12= 'X' ( ( (lv_repeatCST_13_0= RULE_INT ) ) | ( (otherlv_14= RULE_ID ) ) ) )? ( (lv_with_15_0= ruleWith ) )? ) ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_repeatCST_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token lv_repeatCST_13_0=null;
        Token otherlv_14=null;
        EObject lv_move_0_0 = null;

        EObject lv_with_4_0 = null;

        EObject lv_move_6_0 = null;

        EObject lv_then_8_0 = null;

        EObject lv_then_10_0 = null;

        EObject lv_with_15_0 = null;



        	enterRule();

        try {
            // InternalDrn.g:938:2: ( ( ( ( (lv_move_0_0= ruleMovement ) ) (otherlv_1= 'X' ( ( (lv_repeatCST_2_0= RULE_INT ) ) | ( (otherlv_3= RULE_ID ) ) ) )? ( (lv_with_4_0= ruleWith ) )? ) | (otherlv_5= '(' ( (lv_move_6_0= ruleMovement ) ) (otherlv_7= 'then' ( (lv_then_8_0= ruleExpression ) ) ) (otherlv_9= 'then' ( (lv_then_10_0= ruleExpression ) ) )* otherlv_11= ')' (otherlv_12= 'X' ( ( (lv_repeatCST_13_0= RULE_INT ) ) | ( (otherlv_14= RULE_ID ) ) ) )? ( (lv_with_15_0= ruleWith ) )? ) ) )
            // InternalDrn.g:939:2: ( ( ( (lv_move_0_0= ruleMovement ) ) (otherlv_1= 'X' ( ( (lv_repeatCST_2_0= RULE_INT ) ) | ( (otherlv_3= RULE_ID ) ) ) )? ( (lv_with_4_0= ruleWith ) )? ) | (otherlv_5= '(' ( (lv_move_6_0= ruleMovement ) ) (otherlv_7= 'then' ( (lv_then_8_0= ruleExpression ) ) ) (otherlv_9= 'then' ( (lv_then_10_0= ruleExpression ) ) )* otherlv_11= ')' (otherlv_12= 'X' ( ( (lv_repeatCST_13_0= RULE_INT ) ) | ( (otherlv_14= RULE_ID ) ) ) )? ( (lv_with_15_0= ruleWith ) )? ) )
            {
            // InternalDrn.g:939:2: ( ( ( (lv_move_0_0= ruleMovement ) ) (otherlv_1= 'X' ( ( (lv_repeatCST_2_0= RULE_INT ) ) | ( (otherlv_3= RULE_ID ) ) ) )? ( (lv_with_4_0= ruleWith ) )? ) | (otherlv_5= '(' ( (lv_move_6_0= ruleMovement ) ) (otherlv_7= 'then' ( (lv_then_8_0= ruleExpression ) ) ) (otherlv_9= 'then' ( (lv_then_10_0= ruleExpression ) ) )* otherlv_11= ')' (otherlv_12= 'X' ( ( (lv_repeatCST_13_0= RULE_INT ) ) | ( (otherlv_14= RULE_ID ) ) ) )? ( (lv_with_15_0= ruleWith ) )? ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_ID||LA17_0==29||LA17_0==31||(LA17_0>=34 && LA17_0<=40)||LA17_0==42||(LA17_0>=44 && LA17_0<=50)||(LA17_0>=52 && LA17_0<=54)) ) {
                alt17=1;
            }
            else if ( (LA17_0==26) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalDrn.g:940:3: ( ( (lv_move_0_0= ruleMovement ) ) (otherlv_1= 'X' ( ( (lv_repeatCST_2_0= RULE_INT ) ) | ( (otherlv_3= RULE_ID ) ) ) )? ( (lv_with_4_0= ruleWith ) )? )
                    {
                    // InternalDrn.g:940:3: ( ( (lv_move_0_0= ruleMovement ) ) (otherlv_1= 'X' ( ( (lv_repeatCST_2_0= RULE_INT ) ) | ( (otherlv_3= RULE_ID ) ) ) )? ( (lv_with_4_0= ruleWith ) )? )
                    // InternalDrn.g:941:4: ( (lv_move_0_0= ruleMovement ) ) (otherlv_1= 'X' ( ( (lv_repeatCST_2_0= RULE_INT ) ) | ( (otherlv_3= RULE_ID ) ) ) )? ( (lv_with_4_0= ruleWith ) )?
                    {
                    // InternalDrn.g:941:4: ( (lv_move_0_0= ruleMovement ) )
                    // InternalDrn.g:942:5: (lv_move_0_0= ruleMovement )
                    {
                    // InternalDrn.g:942:5: (lv_move_0_0= ruleMovement )
                    // InternalDrn.g:943:6: lv_move_0_0= ruleMovement
                    {

                    						newCompositeNode(grammarAccess.getExpressionAccess().getMoveMovementParserRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_16);
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

                    // InternalDrn.g:960:4: (otherlv_1= 'X' ( ( (lv_repeatCST_2_0= RULE_INT ) ) | ( (otherlv_3= RULE_ID ) ) ) )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==25) ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // InternalDrn.g:961:5: otherlv_1= 'X' ( ( (lv_repeatCST_2_0= RULE_INT ) ) | ( (otherlv_3= RULE_ID ) ) )
                            {
                            otherlv_1=(Token)match(input,25,FOLLOW_17); 

                            					newLeafNode(otherlv_1, grammarAccess.getExpressionAccess().getXKeyword_0_1_0());
                            				
                            // InternalDrn.g:965:5: ( ( (lv_repeatCST_2_0= RULE_INT ) ) | ( (otherlv_3= RULE_ID ) ) )
                            int alt10=2;
                            int LA10_0 = input.LA(1);

                            if ( (LA10_0==RULE_INT) ) {
                                alt10=1;
                            }
                            else if ( (LA10_0==RULE_ID) ) {
                                alt10=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 10, 0, input);

                                throw nvae;
                            }
                            switch (alt10) {
                                case 1 :
                                    // InternalDrn.g:966:6: ( (lv_repeatCST_2_0= RULE_INT ) )
                                    {
                                    // InternalDrn.g:966:6: ( (lv_repeatCST_2_0= RULE_INT ) )
                                    // InternalDrn.g:967:7: (lv_repeatCST_2_0= RULE_INT )
                                    {
                                    // InternalDrn.g:967:7: (lv_repeatCST_2_0= RULE_INT )
                                    // InternalDrn.g:968:8: lv_repeatCST_2_0= RULE_INT
                                    {
                                    lv_repeatCST_2_0=(Token)match(input,RULE_INT,FOLLOW_18); 

                                    								newLeafNode(lv_repeatCST_2_0, grammarAccess.getExpressionAccess().getRepeatCSTINTTerminalRuleCall_0_1_1_0_0());
                                    							

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
                                case 2 :
                                    // InternalDrn.g:985:6: ( (otherlv_3= RULE_ID ) )
                                    {
                                    // InternalDrn.g:985:6: ( (otherlv_3= RULE_ID ) )
                                    // InternalDrn.g:986:7: (otherlv_3= RULE_ID )
                                    {
                                    // InternalDrn.g:986:7: (otherlv_3= RULE_ID )
                                    // InternalDrn.g:987:8: otherlv_3= RULE_ID
                                    {

                                    								if (current==null) {
                                    									current = createModelElement(grammarAccess.getExpressionRule());
                                    								}
                                    							
                                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_18); 

                                    								newLeafNode(otherlv_3, grammarAccess.getExpressionAccess().getRepeatVARParametreCrossReference_0_1_1_1_0());
                                    							

                                    }


                                    }


                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    // InternalDrn.g:1000:4: ( (lv_with_4_0= ruleWith ) )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==57) ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // InternalDrn.g:1001:5: (lv_with_4_0= ruleWith )
                            {
                            // InternalDrn.g:1001:5: (lv_with_4_0= ruleWith )
                            // InternalDrn.g:1002:6: lv_with_4_0= ruleWith
                            {

                            						newCompositeNode(grammarAccess.getExpressionAccess().getWithWithParserRuleCall_0_2_0());
                            					
                            pushFollow(FOLLOW_2);
                            lv_with_4_0=ruleWith();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getExpressionRule());
                            						}
                            						add(
                            							current,
                            							"with",
                            							lv_with_4_0,
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
                    // InternalDrn.g:1021:3: (otherlv_5= '(' ( (lv_move_6_0= ruleMovement ) ) (otherlv_7= 'then' ( (lv_then_8_0= ruleExpression ) ) ) (otherlv_9= 'then' ( (lv_then_10_0= ruleExpression ) ) )* otherlv_11= ')' (otherlv_12= 'X' ( ( (lv_repeatCST_13_0= RULE_INT ) ) | ( (otherlv_14= RULE_ID ) ) ) )? ( (lv_with_15_0= ruleWith ) )? )
                    {
                    // InternalDrn.g:1021:3: (otherlv_5= '(' ( (lv_move_6_0= ruleMovement ) ) (otherlv_7= 'then' ( (lv_then_8_0= ruleExpression ) ) ) (otherlv_9= 'then' ( (lv_then_10_0= ruleExpression ) ) )* otherlv_11= ')' (otherlv_12= 'X' ( ( (lv_repeatCST_13_0= RULE_INT ) ) | ( (otherlv_14= RULE_ID ) ) ) )? ( (lv_with_15_0= ruleWith ) )? )
                    // InternalDrn.g:1022:4: otherlv_5= '(' ( (lv_move_6_0= ruleMovement ) ) (otherlv_7= 'then' ( (lv_then_8_0= ruleExpression ) ) ) (otherlv_9= 'then' ( (lv_then_10_0= ruleExpression ) ) )* otherlv_11= ')' (otherlv_12= 'X' ( ( (lv_repeatCST_13_0= RULE_INT ) ) | ( (otherlv_14= RULE_ID ) ) ) )? ( (lv_with_15_0= ruleWith ) )?
                    {
                    otherlv_5=(Token)match(input,26,FOLLOW_19); 

                    				newLeafNode(otherlv_5, grammarAccess.getExpressionAccess().getLeftParenthesisKeyword_1_0());
                    			
                    // InternalDrn.g:1026:4: ( (lv_move_6_0= ruleMovement ) )
                    // InternalDrn.g:1027:5: (lv_move_6_0= ruleMovement )
                    {
                    // InternalDrn.g:1027:5: (lv_move_6_0= ruleMovement )
                    // InternalDrn.g:1028:6: lv_move_6_0= ruleMovement
                    {

                    						newCompositeNode(grammarAccess.getExpressionAccess().getMoveMovementParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_20);
                    lv_move_6_0=ruleMovement();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExpressionRule());
                    						}
                    						set(
                    							current,
                    							"move",
                    							lv_move_6_0,
                    							"sar.drone.Drn.Movement");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDrn.g:1045:4: (otherlv_7= 'then' ( (lv_then_8_0= ruleExpression ) ) )
                    // InternalDrn.g:1046:5: otherlv_7= 'then' ( (lv_then_8_0= ruleExpression ) )
                    {
                    otherlv_7=(Token)match(input,27,FOLLOW_14); 

                    					newLeafNode(otherlv_7, grammarAccess.getExpressionAccess().getThenKeyword_1_2_0());
                    				
                    // InternalDrn.g:1050:5: ( (lv_then_8_0= ruleExpression ) )
                    // InternalDrn.g:1051:6: (lv_then_8_0= ruleExpression )
                    {
                    // InternalDrn.g:1051:6: (lv_then_8_0= ruleExpression )
                    // InternalDrn.g:1052:7: lv_then_8_0= ruleExpression
                    {

                    							newCompositeNode(grammarAccess.getExpressionAccess().getThenExpressionParserRuleCall_1_2_1_0());
                    						
                    pushFollow(FOLLOW_21);
                    lv_then_8_0=ruleExpression();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getExpressionRule());
                    							}
                    							add(
                    								current,
                    								"then",
                    								lv_then_8_0,
                    								"sar.drone.Drn.Expression");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }

                    // InternalDrn.g:1070:4: (otherlv_9= 'then' ( (lv_then_10_0= ruleExpression ) ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==27) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalDrn.g:1071:5: otherlv_9= 'then' ( (lv_then_10_0= ruleExpression ) )
                    	    {
                    	    otherlv_9=(Token)match(input,27,FOLLOW_14); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getExpressionAccess().getThenKeyword_1_3_0());
                    	    				
                    	    // InternalDrn.g:1075:5: ( (lv_then_10_0= ruleExpression ) )
                    	    // InternalDrn.g:1076:6: (lv_then_10_0= ruleExpression )
                    	    {
                    	    // InternalDrn.g:1076:6: (lv_then_10_0= ruleExpression )
                    	    // InternalDrn.g:1077:7: lv_then_10_0= ruleExpression
                    	    {

                    	    							newCompositeNode(grammarAccess.getExpressionAccess().getThenExpressionParserRuleCall_1_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_21);
                    	    lv_then_10_0=ruleExpression();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getExpressionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"then",
                    	    								lv_then_10_0,
                    	    								"sar.drone.Drn.Expression");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,28,FOLLOW_16); 

                    				newLeafNode(otherlv_11, grammarAccess.getExpressionAccess().getRightParenthesisKeyword_1_4());
                    			
                    // InternalDrn.g:1099:4: (otherlv_12= 'X' ( ( (lv_repeatCST_13_0= RULE_INT ) ) | ( (otherlv_14= RULE_ID ) ) ) )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==25) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // InternalDrn.g:1100:5: otherlv_12= 'X' ( ( (lv_repeatCST_13_0= RULE_INT ) ) | ( (otherlv_14= RULE_ID ) ) )
                            {
                            otherlv_12=(Token)match(input,25,FOLLOW_17); 

                            					newLeafNode(otherlv_12, grammarAccess.getExpressionAccess().getXKeyword_1_5_0());
                            				
                            // InternalDrn.g:1104:5: ( ( (lv_repeatCST_13_0= RULE_INT ) ) | ( (otherlv_14= RULE_ID ) ) )
                            int alt14=2;
                            int LA14_0 = input.LA(1);

                            if ( (LA14_0==RULE_INT) ) {
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
                                    // InternalDrn.g:1105:6: ( (lv_repeatCST_13_0= RULE_INT ) )
                                    {
                                    // InternalDrn.g:1105:6: ( (lv_repeatCST_13_0= RULE_INT ) )
                                    // InternalDrn.g:1106:7: (lv_repeatCST_13_0= RULE_INT )
                                    {
                                    // InternalDrn.g:1106:7: (lv_repeatCST_13_0= RULE_INT )
                                    // InternalDrn.g:1107:8: lv_repeatCST_13_0= RULE_INT
                                    {
                                    lv_repeatCST_13_0=(Token)match(input,RULE_INT,FOLLOW_18); 

                                    								newLeafNode(lv_repeatCST_13_0, grammarAccess.getExpressionAccess().getRepeatCSTINTTerminalRuleCall_1_5_1_0_0());
                                    							

                                    								if (current==null) {
                                    									current = createModelElement(grammarAccess.getExpressionRule());
                                    								}
                                    								setWithLastConsumed(
                                    									current,
                                    									"repeatCST",
                                    									lv_repeatCST_13_0,
                                    									"org.eclipse.xtext.common.Terminals.INT");
                                    							

                                    }


                                    }


                                    }
                                    break;
                                case 2 :
                                    // InternalDrn.g:1124:6: ( (otherlv_14= RULE_ID ) )
                                    {
                                    // InternalDrn.g:1124:6: ( (otherlv_14= RULE_ID ) )
                                    // InternalDrn.g:1125:7: (otherlv_14= RULE_ID )
                                    {
                                    // InternalDrn.g:1125:7: (otherlv_14= RULE_ID )
                                    // InternalDrn.g:1126:8: otherlv_14= RULE_ID
                                    {

                                    								if (current==null) {
                                    									current = createModelElement(grammarAccess.getExpressionRule());
                                    								}
                                    							
                                    otherlv_14=(Token)match(input,RULE_ID,FOLLOW_18); 

                                    								newLeafNode(otherlv_14, grammarAccess.getExpressionAccess().getRepeatVARParametreCrossReference_1_5_1_1_0());
                                    							

                                    }


                                    }


                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    // InternalDrn.g:1139:4: ( (lv_with_15_0= ruleWith ) )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==57) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // InternalDrn.g:1140:5: (lv_with_15_0= ruleWith )
                            {
                            // InternalDrn.g:1140:5: (lv_with_15_0= ruleWith )
                            // InternalDrn.g:1141:6: lv_with_15_0= ruleWith
                            {

                            						newCompositeNode(grammarAccess.getExpressionAccess().getWithWithParserRuleCall_1_6_0());
                            					
                            pushFollow(FOLLOW_2);
                            lv_with_15_0=ruleWith();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getExpressionRule());
                            						}
                            						add(
                            							current,
                            							"with",
                            							lv_with_15_0,
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
    // InternalDrn.g:1163:1: entryRuleMovement returns [EObject current=null] : iv_ruleMovement= ruleMovement EOF ;
    public final EObject entryRuleMovement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMovement = null;


        try {
            // InternalDrn.g:1163:49: (iv_ruleMovement= ruleMovement EOF )
            // InternalDrn.g:1164:2: iv_ruleMovement= ruleMovement EOF
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
    // InternalDrn.g:1170:1: ruleMovement returns [EObject current=null] : (this_And_0= ruleAnd | this_RefPart_1= ruleRefPart | this_DepX_Impl_2= ruleDepX_Impl | this_DepY_Impl_3= ruleDepY_Impl | this_DepZ_Impl_4= ruleDepZ_Impl | this_DepXY_IMPL_5= ruleDepXY_IMPL | this_DepXZ_IMPL_6= ruleDepXZ_IMPL | this_DepYZ_IMPL_7= ruleDepYZ_IMPL | this_DepXYZ_IMPL_8= ruleDepXYZ_IMPL | this_TakeOff_9= ruleTakeOff | this_Wait_10= ruleWait | this_Rotate_11= ruleRotate | this_Land_12= ruleLand ) ;
    public final EObject ruleMovement() throws RecognitionException {
        EObject current = null;

        EObject this_And_0 = null;

        EObject this_RefPart_1 = null;

        EObject this_DepX_Impl_2 = null;

        EObject this_DepY_Impl_3 = null;

        EObject this_DepZ_Impl_4 = null;

        EObject this_DepXY_IMPL_5 = null;

        EObject this_DepXZ_IMPL_6 = null;

        EObject this_DepYZ_IMPL_7 = null;

        EObject this_DepXYZ_IMPL_8 = null;

        EObject this_TakeOff_9 = null;

        EObject this_Wait_10 = null;

        EObject this_Rotate_11 = null;

        EObject this_Land_12 = null;



        	enterRule();

        try {
            // InternalDrn.g:1176:2: ( (this_And_0= ruleAnd | this_RefPart_1= ruleRefPart | this_DepX_Impl_2= ruleDepX_Impl | this_DepY_Impl_3= ruleDepY_Impl | this_DepZ_Impl_4= ruleDepZ_Impl | this_DepXY_IMPL_5= ruleDepXY_IMPL | this_DepXZ_IMPL_6= ruleDepXZ_IMPL | this_DepYZ_IMPL_7= ruleDepYZ_IMPL | this_DepXYZ_IMPL_8= ruleDepXYZ_IMPL | this_TakeOff_9= ruleTakeOff | this_Wait_10= ruleWait | this_Rotate_11= ruleRotate | this_Land_12= ruleLand ) )
            // InternalDrn.g:1177:2: (this_And_0= ruleAnd | this_RefPart_1= ruleRefPart | this_DepX_Impl_2= ruleDepX_Impl | this_DepY_Impl_3= ruleDepY_Impl | this_DepZ_Impl_4= ruleDepZ_Impl | this_DepXY_IMPL_5= ruleDepXY_IMPL | this_DepXZ_IMPL_6= ruleDepXZ_IMPL | this_DepYZ_IMPL_7= ruleDepYZ_IMPL | this_DepXYZ_IMPL_8= ruleDepXYZ_IMPL | this_TakeOff_9= ruleTakeOff | this_Wait_10= ruleWait | this_Rotate_11= ruleRotate | this_Land_12= ruleLand )
            {
            // InternalDrn.g:1177:2: (this_And_0= ruleAnd | this_RefPart_1= ruleRefPart | this_DepX_Impl_2= ruleDepX_Impl | this_DepY_Impl_3= ruleDepY_Impl | this_DepZ_Impl_4= ruleDepZ_Impl | this_DepXY_IMPL_5= ruleDepXY_IMPL | this_DepXZ_IMPL_6= ruleDepXZ_IMPL | this_DepYZ_IMPL_7= ruleDepYZ_IMPL | this_DepXYZ_IMPL_8= ruleDepXYZ_IMPL | this_TakeOff_9= ruleTakeOff | this_Wait_10= ruleWait | this_Rotate_11= ruleRotate | this_Land_12= ruleLand )
            int alt18=13;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt18=1;
                }
                break;
            case RULE_ID:
                {
                alt18=2;
                }
                break;
            case 35:
            case 36:
                {
                alt18=3;
                }
                break;
            case 31:
            case 34:
                {
                alt18=4;
                }
                break;
            case 37:
            case 38:
                {
                alt18=5;
                }
                break;
            case 39:
            case 40:
            case 42:
                {
                alt18=6;
                }
                break;
            case 47:
                {
                alt18=7;
                }
                break;
            case 44:
            case 45:
            case 46:
                {
                alt18=8;
                }
                break;
            case 48:
            case 49:
                {
                alt18=9;
                }
                break;
            case 53:
                {
                alt18=10;
                }
                break;
            case 52:
                {
                alt18=11;
                }
                break;
            case 50:
                {
                alt18=12;
                }
                break;
            case 54:
                {
                alt18=13;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // InternalDrn.g:1178:3: this_And_0= ruleAnd
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
                    // InternalDrn.g:1187:3: this_RefPart_1= ruleRefPart
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
                    // InternalDrn.g:1196:3: this_DepX_Impl_2= ruleDepX_Impl
                    {

                    			newCompositeNode(grammarAccess.getMovementAccess().getDepX_ImplParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_DepX_Impl_2=ruleDepX_Impl();

                    state._fsp--;


                    			current = this_DepX_Impl_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalDrn.g:1205:3: this_DepY_Impl_3= ruleDepY_Impl
                    {

                    			newCompositeNode(grammarAccess.getMovementAccess().getDepY_ImplParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_DepY_Impl_3=ruleDepY_Impl();

                    state._fsp--;


                    			current = this_DepY_Impl_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalDrn.g:1214:3: this_DepZ_Impl_4= ruleDepZ_Impl
                    {

                    			newCompositeNode(grammarAccess.getMovementAccess().getDepZ_ImplParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_DepZ_Impl_4=ruleDepZ_Impl();

                    state._fsp--;


                    			current = this_DepZ_Impl_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalDrn.g:1223:3: this_DepXY_IMPL_5= ruleDepXY_IMPL
                    {

                    			newCompositeNode(grammarAccess.getMovementAccess().getDepXY_IMPLParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_DepXY_IMPL_5=ruleDepXY_IMPL();

                    state._fsp--;


                    			current = this_DepXY_IMPL_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalDrn.g:1232:3: this_DepXZ_IMPL_6= ruleDepXZ_IMPL
                    {

                    			newCompositeNode(grammarAccess.getMovementAccess().getDepXZ_IMPLParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_DepXZ_IMPL_6=ruleDepXZ_IMPL();

                    state._fsp--;


                    			current = this_DepXZ_IMPL_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalDrn.g:1241:3: this_DepYZ_IMPL_7= ruleDepYZ_IMPL
                    {

                    			newCompositeNode(grammarAccess.getMovementAccess().getDepYZ_IMPLParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_DepYZ_IMPL_7=ruleDepYZ_IMPL();

                    state._fsp--;


                    			current = this_DepYZ_IMPL_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalDrn.g:1250:3: this_DepXYZ_IMPL_8= ruleDepXYZ_IMPL
                    {

                    			newCompositeNode(grammarAccess.getMovementAccess().getDepXYZ_IMPLParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_DepXYZ_IMPL_8=ruleDepXYZ_IMPL();

                    state._fsp--;


                    			current = this_DepXYZ_IMPL_8;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 10 :
                    // InternalDrn.g:1259:3: this_TakeOff_9= ruleTakeOff
                    {

                    			newCompositeNode(grammarAccess.getMovementAccess().getTakeOffParserRuleCall_9());
                    		
                    pushFollow(FOLLOW_2);
                    this_TakeOff_9=ruleTakeOff();

                    state._fsp--;


                    			current = this_TakeOff_9;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 11 :
                    // InternalDrn.g:1268:3: this_Wait_10= ruleWait
                    {

                    			newCompositeNode(grammarAccess.getMovementAccess().getWaitParserRuleCall_10());
                    		
                    pushFollow(FOLLOW_2);
                    this_Wait_10=ruleWait();

                    state._fsp--;


                    			current = this_Wait_10;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 12 :
                    // InternalDrn.g:1277:3: this_Rotate_11= ruleRotate
                    {

                    			newCompositeNode(grammarAccess.getMovementAccess().getRotateParserRuleCall_11());
                    		
                    pushFollow(FOLLOW_2);
                    this_Rotate_11=ruleRotate();

                    state._fsp--;


                    			current = this_Rotate_11;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 13 :
                    // InternalDrn.g:1286:3: this_Land_12= ruleLand
                    {

                    			newCompositeNode(grammarAccess.getMovementAccess().getLandParserRuleCall_12());
                    		
                    pushFollow(FOLLOW_2);
                    this_Land_12=ruleLand();

                    state._fsp--;


                    			current = this_Land_12;
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
    // InternalDrn.g:1298:1: entryRuleRefPart returns [EObject current=null] : iv_ruleRefPart= ruleRefPart EOF ;
    public final EObject entryRuleRefPart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRefPart = null;


        try {
            // InternalDrn.g:1298:48: (iv_ruleRefPart= ruleRefPart EOF )
            // InternalDrn.g:1299:2: iv_ruleRefPart= ruleRefPart EOF
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
    // InternalDrn.g:1305:1: ruleRefPart returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleRefPart() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalDrn.g:1311:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalDrn.g:1312:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalDrn.g:1312:2: ( (otherlv_0= RULE_ID ) )
            // InternalDrn.g:1313:3: (otherlv_0= RULE_ID )
            {
            // InternalDrn.g:1313:3: (otherlv_0= RULE_ID )
            // InternalDrn.g:1314:4: otherlv_0= RULE_ID
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


    // $ANTLR start "entryRuleAnd"
    // InternalDrn.g:1328:1: entryRuleAnd returns [EObject current=null] : iv_ruleAnd= ruleAnd EOF ;
    public final EObject entryRuleAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnd = null;


        try {
            // InternalDrn.g:1328:44: (iv_ruleAnd= ruleAnd EOF )
            // InternalDrn.g:1329:2: iv_ruleAnd= ruleAnd EOF
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
    // InternalDrn.g:1335:1: ruleAnd returns [EObject current=null] : ( () ( (lv_name_1_0= 'merge' ) ) otherlv_2= '(' ( ( (lv_rotate_3_0= ruleRotate ) ) | ( (lv_depx_4_0= ruleDepX_Impl ) ) | ( (lv_depy_5_0= ruleDepY_Impl ) ) | ( (lv_depxz_6_0= ruleDepXZ_IMPL ) ) | ( (lv_depxy_7_0= ruleDepXY_IMPL ) ) | ( (lv_depz_8_0= ruleDepZ_Impl ) ) ) otherlv_9= ',' ( ( (lv_rotate_10_0= ruleRotate ) ) | ( (lv_depx_11_0= ruleDepX_Impl ) ) | ( (lv_depy_12_0= ruleDepY_Impl ) ) | ( (lv_depxz_13_0= ruleDepXZ_IMPL ) ) | ( (lv_depxy_14_0= ruleDepXY_IMPL ) ) | ( (lv_depz_15_0= ruleDepZ_Impl ) ) ) (otherlv_16= ',' ( ( (lv_rotate_17_0= ruleRotate ) ) | ( (lv_depx_18_0= ruleDepX_Impl ) ) | ( (lv_depy_19_0= ruleDepY_Impl ) ) | ( (lv_depxz_20_0= ruleDepXZ_IMPL ) ) | ( (lv_depxy_21_0= ruleDepXY_IMPL ) ) | ( (lv_depz_22_0= ruleDepZ_Impl ) ) ) )* otherlv_23= ')' ) ;
    public final EObject ruleAnd() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_9=null;
        Token otherlv_16=null;
        Token otherlv_23=null;
        EObject lv_rotate_3_0 = null;

        EObject lv_depx_4_0 = null;

        EObject lv_depy_5_0 = null;

        EObject lv_depxz_6_0 = null;

        EObject lv_depxy_7_0 = null;

        EObject lv_depz_8_0 = null;

        EObject lv_rotate_10_0 = null;

        EObject lv_depx_11_0 = null;

        EObject lv_depy_12_0 = null;

        EObject lv_depxz_13_0 = null;

        EObject lv_depxy_14_0 = null;

        EObject lv_depz_15_0 = null;

        EObject lv_rotate_17_0 = null;

        EObject lv_depx_18_0 = null;

        EObject lv_depy_19_0 = null;

        EObject lv_depxz_20_0 = null;

        EObject lv_depxy_21_0 = null;

        EObject lv_depz_22_0 = null;



        	enterRule();

        try {
            // InternalDrn.g:1341:2: ( ( () ( (lv_name_1_0= 'merge' ) ) otherlv_2= '(' ( ( (lv_rotate_3_0= ruleRotate ) ) | ( (lv_depx_4_0= ruleDepX_Impl ) ) | ( (lv_depy_5_0= ruleDepY_Impl ) ) | ( (lv_depxz_6_0= ruleDepXZ_IMPL ) ) | ( (lv_depxy_7_0= ruleDepXY_IMPL ) ) | ( (lv_depz_8_0= ruleDepZ_Impl ) ) ) otherlv_9= ',' ( ( (lv_rotate_10_0= ruleRotate ) ) | ( (lv_depx_11_0= ruleDepX_Impl ) ) | ( (lv_depy_12_0= ruleDepY_Impl ) ) | ( (lv_depxz_13_0= ruleDepXZ_IMPL ) ) | ( (lv_depxy_14_0= ruleDepXY_IMPL ) ) | ( (lv_depz_15_0= ruleDepZ_Impl ) ) ) (otherlv_16= ',' ( ( (lv_rotate_17_0= ruleRotate ) ) | ( (lv_depx_18_0= ruleDepX_Impl ) ) | ( (lv_depy_19_0= ruleDepY_Impl ) ) | ( (lv_depxz_20_0= ruleDepXZ_IMPL ) ) | ( (lv_depxy_21_0= ruleDepXY_IMPL ) ) | ( (lv_depz_22_0= ruleDepZ_Impl ) ) ) )* otherlv_23= ')' ) )
            // InternalDrn.g:1342:2: ( () ( (lv_name_1_0= 'merge' ) ) otherlv_2= '(' ( ( (lv_rotate_3_0= ruleRotate ) ) | ( (lv_depx_4_0= ruleDepX_Impl ) ) | ( (lv_depy_5_0= ruleDepY_Impl ) ) | ( (lv_depxz_6_0= ruleDepXZ_IMPL ) ) | ( (lv_depxy_7_0= ruleDepXY_IMPL ) ) | ( (lv_depz_8_0= ruleDepZ_Impl ) ) ) otherlv_9= ',' ( ( (lv_rotate_10_0= ruleRotate ) ) | ( (lv_depx_11_0= ruleDepX_Impl ) ) | ( (lv_depy_12_0= ruleDepY_Impl ) ) | ( (lv_depxz_13_0= ruleDepXZ_IMPL ) ) | ( (lv_depxy_14_0= ruleDepXY_IMPL ) ) | ( (lv_depz_15_0= ruleDepZ_Impl ) ) ) (otherlv_16= ',' ( ( (lv_rotate_17_0= ruleRotate ) ) | ( (lv_depx_18_0= ruleDepX_Impl ) ) | ( (lv_depy_19_0= ruleDepY_Impl ) ) | ( (lv_depxz_20_0= ruleDepXZ_IMPL ) ) | ( (lv_depxy_21_0= ruleDepXY_IMPL ) ) | ( (lv_depz_22_0= ruleDepZ_Impl ) ) ) )* otherlv_23= ')' )
            {
            // InternalDrn.g:1342:2: ( () ( (lv_name_1_0= 'merge' ) ) otherlv_2= '(' ( ( (lv_rotate_3_0= ruleRotate ) ) | ( (lv_depx_4_0= ruleDepX_Impl ) ) | ( (lv_depy_5_0= ruleDepY_Impl ) ) | ( (lv_depxz_6_0= ruleDepXZ_IMPL ) ) | ( (lv_depxy_7_0= ruleDepXY_IMPL ) ) | ( (lv_depz_8_0= ruleDepZ_Impl ) ) ) otherlv_9= ',' ( ( (lv_rotate_10_0= ruleRotate ) ) | ( (lv_depx_11_0= ruleDepX_Impl ) ) | ( (lv_depy_12_0= ruleDepY_Impl ) ) | ( (lv_depxz_13_0= ruleDepXZ_IMPL ) ) | ( (lv_depxy_14_0= ruleDepXY_IMPL ) ) | ( (lv_depz_15_0= ruleDepZ_Impl ) ) ) (otherlv_16= ',' ( ( (lv_rotate_17_0= ruleRotate ) ) | ( (lv_depx_18_0= ruleDepX_Impl ) ) | ( (lv_depy_19_0= ruleDepY_Impl ) ) | ( (lv_depxz_20_0= ruleDepXZ_IMPL ) ) | ( (lv_depxy_21_0= ruleDepXY_IMPL ) ) | ( (lv_depz_22_0= ruleDepZ_Impl ) ) ) )* otherlv_23= ')' )
            // InternalDrn.g:1343:3: () ( (lv_name_1_0= 'merge' ) ) otherlv_2= '(' ( ( (lv_rotate_3_0= ruleRotate ) ) | ( (lv_depx_4_0= ruleDepX_Impl ) ) | ( (lv_depy_5_0= ruleDepY_Impl ) ) | ( (lv_depxz_6_0= ruleDepXZ_IMPL ) ) | ( (lv_depxy_7_0= ruleDepXY_IMPL ) ) | ( (lv_depz_8_0= ruleDepZ_Impl ) ) ) otherlv_9= ',' ( ( (lv_rotate_10_0= ruleRotate ) ) | ( (lv_depx_11_0= ruleDepX_Impl ) ) | ( (lv_depy_12_0= ruleDepY_Impl ) ) | ( (lv_depxz_13_0= ruleDepXZ_IMPL ) ) | ( (lv_depxy_14_0= ruleDepXY_IMPL ) ) | ( (lv_depz_15_0= ruleDepZ_Impl ) ) ) (otherlv_16= ',' ( ( (lv_rotate_17_0= ruleRotate ) ) | ( (lv_depx_18_0= ruleDepX_Impl ) ) | ( (lv_depy_19_0= ruleDepY_Impl ) ) | ( (lv_depxz_20_0= ruleDepXZ_IMPL ) ) | ( (lv_depxy_21_0= ruleDepXY_IMPL ) ) | ( (lv_depz_22_0= ruleDepZ_Impl ) ) ) )* otherlv_23= ')'
            {
            // InternalDrn.g:1343:3: ()
            // InternalDrn.g:1344:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAndAccess().getAndAction_0(),
            					current);
            			

            }

            // InternalDrn.g:1350:3: ( (lv_name_1_0= 'merge' ) )
            // InternalDrn.g:1351:4: (lv_name_1_0= 'merge' )
            {
            // InternalDrn.g:1351:4: (lv_name_1_0= 'merge' )
            // InternalDrn.g:1352:5: lv_name_1_0= 'merge'
            {
            lv_name_1_0=(Token)match(input,29,FOLLOW_22); 

            					newLeafNode(lv_name_1_0, grammarAccess.getAndAccess().getNameMergeKeyword_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAndRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_1_0, "merge");
            				

            }


            }

            otherlv_2=(Token)match(input,26,FOLLOW_23); 

            			newLeafNode(otherlv_2, grammarAccess.getAndAccess().getLeftParenthesisKeyword_2());
            		
            // InternalDrn.g:1368:3: ( ( (lv_rotate_3_0= ruleRotate ) ) | ( (lv_depx_4_0= ruleDepX_Impl ) ) | ( (lv_depy_5_0= ruleDepY_Impl ) ) | ( (lv_depxz_6_0= ruleDepXZ_IMPL ) ) | ( (lv_depxy_7_0= ruleDepXY_IMPL ) ) | ( (lv_depz_8_0= ruleDepZ_Impl ) ) )
            int alt19=6;
            switch ( input.LA(1) ) {
            case 50:
                {
                alt19=1;
                }
                break;
            case 35:
            case 36:
                {
                alt19=2;
                }
                break;
            case 31:
            case 34:
                {
                alt19=3;
                }
                break;
            case 47:
                {
                alt19=4;
                }
                break;
            case 39:
            case 40:
            case 42:
                {
                alt19=5;
                }
                break;
            case 37:
            case 38:
                {
                alt19=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // InternalDrn.g:1369:4: ( (lv_rotate_3_0= ruleRotate ) )
                    {
                    // InternalDrn.g:1369:4: ( (lv_rotate_3_0= ruleRotate ) )
                    // InternalDrn.g:1370:5: (lv_rotate_3_0= ruleRotate )
                    {
                    // InternalDrn.g:1370:5: (lv_rotate_3_0= ruleRotate )
                    // InternalDrn.g:1371:6: lv_rotate_3_0= ruleRotate
                    {

                    						newCompositeNode(grammarAccess.getAndAccess().getRotateRotateParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_24);
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
                    // InternalDrn.g:1389:4: ( (lv_depx_4_0= ruleDepX_Impl ) )
                    {
                    // InternalDrn.g:1389:4: ( (lv_depx_4_0= ruleDepX_Impl ) )
                    // InternalDrn.g:1390:5: (lv_depx_4_0= ruleDepX_Impl )
                    {
                    // InternalDrn.g:1390:5: (lv_depx_4_0= ruleDepX_Impl )
                    // InternalDrn.g:1391:6: lv_depx_4_0= ruleDepX_Impl
                    {

                    						newCompositeNode(grammarAccess.getAndAccess().getDepxDepX_ImplParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_24);
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
                    // InternalDrn.g:1409:4: ( (lv_depy_5_0= ruleDepY_Impl ) )
                    {
                    // InternalDrn.g:1409:4: ( (lv_depy_5_0= ruleDepY_Impl ) )
                    // InternalDrn.g:1410:5: (lv_depy_5_0= ruleDepY_Impl )
                    {
                    // InternalDrn.g:1410:5: (lv_depy_5_0= ruleDepY_Impl )
                    // InternalDrn.g:1411:6: lv_depy_5_0= ruleDepY_Impl
                    {

                    						newCompositeNode(grammarAccess.getAndAccess().getDepyDepY_ImplParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_24);
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
                    // InternalDrn.g:1429:4: ( (lv_depxz_6_0= ruleDepXZ_IMPL ) )
                    {
                    // InternalDrn.g:1429:4: ( (lv_depxz_6_0= ruleDepXZ_IMPL ) )
                    // InternalDrn.g:1430:5: (lv_depxz_6_0= ruleDepXZ_IMPL )
                    {
                    // InternalDrn.g:1430:5: (lv_depxz_6_0= ruleDepXZ_IMPL )
                    // InternalDrn.g:1431:6: lv_depxz_6_0= ruleDepXZ_IMPL
                    {

                    						newCompositeNode(grammarAccess.getAndAccess().getDepxzDepXZ_IMPLParserRuleCall_3_3_0());
                    					
                    pushFollow(FOLLOW_24);
                    lv_depxz_6_0=ruleDepXZ_IMPL();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAndRule());
                    						}
                    						add(
                    							current,
                    							"depxz",
                    							lv_depxz_6_0,
                    							"sar.drone.Drn.DepXZ_IMPL");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalDrn.g:1449:4: ( (lv_depxy_7_0= ruleDepXY_IMPL ) )
                    {
                    // InternalDrn.g:1449:4: ( (lv_depxy_7_0= ruleDepXY_IMPL ) )
                    // InternalDrn.g:1450:5: (lv_depxy_7_0= ruleDepXY_IMPL )
                    {
                    // InternalDrn.g:1450:5: (lv_depxy_7_0= ruleDepXY_IMPL )
                    // InternalDrn.g:1451:6: lv_depxy_7_0= ruleDepXY_IMPL
                    {

                    						newCompositeNode(grammarAccess.getAndAccess().getDepxyDepXY_IMPLParserRuleCall_3_4_0());
                    					
                    pushFollow(FOLLOW_24);
                    lv_depxy_7_0=ruleDepXY_IMPL();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAndRule());
                    						}
                    						add(
                    							current,
                    							"depxy",
                    							lv_depxy_7_0,
                    							"sar.drone.Drn.DepXY_IMPL");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalDrn.g:1469:4: ( (lv_depz_8_0= ruleDepZ_Impl ) )
                    {
                    // InternalDrn.g:1469:4: ( (lv_depz_8_0= ruleDepZ_Impl ) )
                    // InternalDrn.g:1470:5: (lv_depz_8_0= ruleDepZ_Impl )
                    {
                    // InternalDrn.g:1470:5: (lv_depz_8_0= ruleDepZ_Impl )
                    // InternalDrn.g:1471:6: lv_depz_8_0= ruleDepZ_Impl
                    {

                    						newCompositeNode(grammarAccess.getAndAccess().getDepzDepZ_ImplParserRuleCall_3_5_0());
                    					
                    pushFollow(FOLLOW_24);
                    lv_depz_8_0=ruleDepZ_Impl();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAndRule());
                    						}
                    						add(
                    							current,
                    							"depz",
                    							lv_depz_8_0,
                    							"sar.drone.Drn.DepZ_Impl");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,30,FOLLOW_23); 

            			newLeafNode(otherlv_9, grammarAccess.getAndAccess().getCommaKeyword_4());
            		
            // InternalDrn.g:1493:3: ( ( (lv_rotate_10_0= ruleRotate ) ) | ( (lv_depx_11_0= ruleDepX_Impl ) ) | ( (lv_depy_12_0= ruleDepY_Impl ) ) | ( (lv_depxz_13_0= ruleDepXZ_IMPL ) ) | ( (lv_depxy_14_0= ruleDepXY_IMPL ) ) | ( (lv_depz_15_0= ruleDepZ_Impl ) ) )
            int alt20=6;
            switch ( input.LA(1) ) {
            case 50:
                {
                alt20=1;
                }
                break;
            case 35:
            case 36:
                {
                alt20=2;
                }
                break;
            case 31:
            case 34:
                {
                alt20=3;
                }
                break;
            case 47:
                {
                alt20=4;
                }
                break;
            case 39:
            case 40:
            case 42:
                {
                alt20=5;
                }
                break;
            case 37:
            case 38:
                {
                alt20=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // InternalDrn.g:1494:4: ( (lv_rotate_10_0= ruleRotate ) )
                    {
                    // InternalDrn.g:1494:4: ( (lv_rotate_10_0= ruleRotate ) )
                    // InternalDrn.g:1495:5: (lv_rotate_10_0= ruleRotate )
                    {
                    // InternalDrn.g:1495:5: (lv_rotate_10_0= ruleRotate )
                    // InternalDrn.g:1496:6: lv_rotate_10_0= ruleRotate
                    {

                    						newCompositeNode(grammarAccess.getAndAccess().getRotateRotateParserRuleCall_5_0_0());
                    					
                    pushFollow(FOLLOW_25);
                    lv_rotate_10_0=ruleRotate();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAndRule());
                    						}
                    						add(
                    							current,
                    							"rotate",
                    							lv_rotate_10_0,
                    							"sar.drone.Drn.Rotate");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDrn.g:1514:4: ( (lv_depx_11_0= ruleDepX_Impl ) )
                    {
                    // InternalDrn.g:1514:4: ( (lv_depx_11_0= ruleDepX_Impl ) )
                    // InternalDrn.g:1515:5: (lv_depx_11_0= ruleDepX_Impl )
                    {
                    // InternalDrn.g:1515:5: (lv_depx_11_0= ruleDepX_Impl )
                    // InternalDrn.g:1516:6: lv_depx_11_0= ruleDepX_Impl
                    {

                    						newCompositeNode(grammarAccess.getAndAccess().getDepxDepX_ImplParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_25);
                    lv_depx_11_0=ruleDepX_Impl();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAndRule());
                    						}
                    						add(
                    							current,
                    							"depx",
                    							lv_depx_11_0,
                    							"sar.drone.Drn.DepX_Impl");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalDrn.g:1534:4: ( (lv_depy_12_0= ruleDepY_Impl ) )
                    {
                    // InternalDrn.g:1534:4: ( (lv_depy_12_0= ruleDepY_Impl ) )
                    // InternalDrn.g:1535:5: (lv_depy_12_0= ruleDepY_Impl )
                    {
                    // InternalDrn.g:1535:5: (lv_depy_12_0= ruleDepY_Impl )
                    // InternalDrn.g:1536:6: lv_depy_12_0= ruleDepY_Impl
                    {

                    						newCompositeNode(grammarAccess.getAndAccess().getDepyDepY_ImplParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_25);
                    lv_depy_12_0=ruleDepY_Impl();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAndRule());
                    						}
                    						add(
                    							current,
                    							"depy",
                    							lv_depy_12_0,
                    							"sar.drone.Drn.DepY_Impl");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalDrn.g:1554:4: ( (lv_depxz_13_0= ruleDepXZ_IMPL ) )
                    {
                    // InternalDrn.g:1554:4: ( (lv_depxz_13_0= ruleDepXZ_IMPL ) )
                    // InternalDrn.g:1555:5: (lv_depxz_13_0= ruleDepXZ_IMPL )
                    {
                    // InternalDrn.g:1555:5: (lv_depxz_13_0= ruleDepXZ_IMPL )
                    // InternalDrn.g:1556:6: lv_depxz_13_0= ruleDepXZ_IMPL
                    {

                    						newCompositeNode(grammarAccess.getAndAccess().getDepxzDepXZ_IMPLParserRuleCall_5_3_0());
                    					
                    pushFollow(FOLLOW_25);
                    lv_depxz_13_0=ruleDepXZ_IMPL();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAndRule());
                    						}
                    						add(
                    							current,
                    							"depxz",
                    							lv_depxz_13_0,
                    							"sar.drone.Drn.DepXZ_IMPL");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalDrn.g:1574:4: ( (lv_depxy_14_0= ruleDepXY_IMPL ) )
                    {
                    // InternalDrn.g:1574:4: ( (lv_depxy_14_0= ruleDepXY_IMPL ) )
                    // InternalDrn.g:1575:5: (lv_depxy_14_0= ruleDepXY_IMPL )
                    {
                    // InternalDrn.g:1575:5: (lv_depxy_14_0= ruleDepXY_IMPL )
                    // InternalDrn.g:1576:6: lv_depxy_14_0= ruleDepXY_IMPL
                    {

                    						newCompositeNode(grammarAccess.getAndAccess().getDepxyDepXY_IMPLParserRuleCall_5_4_0());
                    					
                    pushFollow(FOLLOW_25);
                    lv_depxy_14_0=ruleDepXY_IMPL();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAndRule());
                    						}
                    						add(
                    							current,
                    							"depxy",
                    							lv_depxy_14_0,
                    							"sar.drone.Drn.DepXY_IMPL");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalDrn.g:1594:4: ( (lv_depz_15_0= ruleDepZ_Impl ) )
                    {
                    // InternalDrn.g:1594:4: ( (lv_depz_15_0= ruleDepZ_Impl ) )
                    // InternalDrn.g:1595:5: (lv_depz_15_0= ruleDepZ_Impl )
                    {
                    // InternalDrn.g:1595:5: (lv_depz_15_0= ruleDepZ_Impl )
                    // InternalDrn.g:1596:6: lv_depz_15_0= ruleDepZ_Impl
                    {

                    						newCompositeNode(grammarAccess.getAndAccess().getDepzDepZ_ImplParserRuleCall_5_5_0());
                    					
                    pushFollow(FOLLOW_25);
                    lv_depz_15_0=ruleDepZ_Impl();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAndRule());
                    						}
                    						add(
                    							current,
                    							"depz",
                    							lv_depz_15_0,
                    							"sar.drone.Drn.DepZ_Impl");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDrn.g:1614:3: (otherlv_16= ',' ( ( (lv_rotate_17_0= ruleRotate ) ) | ( (lv_depx_18_0= ruleDepX_Impl ) ) | ( (lv_depy_19_0= ruleDepY_Impl ) ) | ( (lv_depxz_20_0= ruleDepXZ_IMPL ) ) | ( (lv_depxy_21_0= ruleDepXY_IMPL ) ) | ( (lv_depz_22_0= ruleDepZ_Impl ) ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==30) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalDrn.g:1615:4: otherlv_16= ',' ( ( (lv_rotate_17_0= ruleRotate ) ) | ( (lv_depx_18_0= ruleDepX_Impl ) ) | ( (lv_depy_19_0= ruleDepY_Impl ) ) | ( (lv_depxz_20_0= ruleDepXZ_IMPL ) ) | ( (lv_depxy_21_0= ruleDepXY_IMPL ) ) | ( (lv_depz_22_0= ruleDepZ_Impl ) ) )
            	    {
            	    otherlv_16=(Token)match(input,30,FOLLOW_23); 

            	    				newLeafNode(otherlv_16, grammarAccess.getAndAccess().getCommaKeyword_6_0());
            	    			
            	    // InternalDrn.g:1619:4: ( ( (lv_rotate_17_0= ruleRotate ) ) | ( (lv_depx_18_0= ruleDepX_Impl ) ) | ( (lv_depy_19_0= ruleDepY_Impl ) ) | ( (lv_depxz_20_0= ruleDepXZ_IMPL ) ) | ( (lv_depxy_21_0= ruleDepXY_IMPL ) ) | ( (lv_depz_22_0= ruleDepZ_Impl ) ) )
            	    int alt21=6;
            	    switch ( input.LA(1) ) {
            	    case 50:
            	        {
            	        alt21=1;
            	        }
            	        break;
            	    case 35:
            	    case 36:
            	        {
            	        alt21=2;
            	        }
            	        break;
            	    case 31:
            	    case 34:
            	        {
            	        alt21=3;
            	        }
            	        break;
            	    case 47:
            	        {
            	        alt21=4;
            	        }
            	        break;
            	    case 39:
            	    case 40:
            	    case 42:
            	        {
            	        alt21=5;
            	        }
            	        break;
            	    case 37:
            	    case 38:
            	        {
            	        alt21=6;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 21, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt21) {
            	        case 1 :
            	            // InternalDrn.g:1620:5: ( (lv_rotate_17_0= ruleRotate ) )
            	            {
            	            // InternalDrn.g:1620:5: ( (lv_rotate_17_0= ruleRotate ) )
            	            // InternalDrn.g:1621:6: (lv_rotate_17_0= ruleRotate )
            	            {
            	            // InternalDrn.g:1621:6: (lv_rotate_17_0= ruleRotate )
            	            // InternalDrn.g:1622:7: lv_rotate_17_0= ruleRotate
            	            {

            	            							newCompositeNode(grammarAccess.getAndAccess().getRotateRotateParserRuleCall_6_1_0_0());
            	            						
            	            pushFollow(FOLLOW_25);
            	            lv_rotate_17_0=ruleRotate();

            	            state._fsp--;


            	            							if (current==null) {
            	            								current = createModelElementForParent(grammarAccess.getAndRule());
            	            							}
            	            							add(
            	            								current,
            	            								"rotate",
            	            								lv_rotate_17_0,
            	            								"sar.drone.Drn.Rotate");
            	            							afterParserOrEnumRuleCall();
            	            						

            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalDrn.g:1640:5: ( (lv_depx_18_0= ruleDepX_Impl ) )
            	            {
            	            // InternalDrn.g:1640:5: ( (lv_depx_18_0= ruleDepX_Impl ) )
            	            // InternalDrn.g:1641:6: (lv_depx_18_0= ruleDepX_Impl )
            	            {
            	            // InternalDrn.g:1641:6: (lv_depx_18_0= ruleDepX_Impl )
            	            // InternalDrn.g:1642:7: lv_depx_18_0= ruleDepX_Impl
            	            {

            	            							newCompositeNode(grammarAccess.getAndAccess().getDepxDepX_ImplParserRuleCall_6_1_1_0());
            	            						
            	            pushFollow(FOLLOW_25);
            	            lv_depx_18_0=ruleDepX_Impl();

            	            state._fsp--;


            	            							if (current==null) {
            	            								current = createModelElementForParent(grammarAccess.getAndRule());
            	            							}
            	            							add(
            	            								current,
            	            								"depx",
            	            								lv_depx_18_0,
            	            								"sar.drone.Drn.DepX_Impl");
            	            							afterParserOrEnumRuleCall();
            	            						

            	            }


            	            }


            	            }
            	            break;
            	        case 3 :
            	            // InternalDrn.g:1660:5: ( (lv_depy_19_0= ruleDepY_Impl ) )
            	            {
            	            // InternalDrn.g:1660:5: ( (lv_depy_19_0= ruleDepY_Impl ) )
            	            // InternalDrn.g:1661:6: (lv_depy_19_0= ruleDepY_Impl )
            	            {
            	            // InternalDrn.g:1661:6: (lv_depy_19_0= ruleDepY_Impl )
            	            // InternalDrn.g:1662:7: lv_depy_19_0= ruleDepY_Impl
            	            {

            	            							newCompositeNode(grammarAccess.getAndAccess().getDepyDepY_ImplParserRuleCall_6_1_2_0());
            	            						
            	            pushFollow(FOLLOW_25);
            	            lv_depy_19_0=ruleDepY_Impl();

            	            state._fsp--;


            	            							if (current==null) {
            	            								current = createModelElementForParent(grammarAccess.getAndRule());
            	            							}
            	            							add(
            	            								current,
            	            								"depy",
            	            								lv_depy_19_0,
            	            								"sar.drone.Drn.DepY_Impl");
            	            							afterParserOrEnumRuleCall();
            	            						

            	            }


            	            }


            	            }
            	            break;
            	        case 4 :
            	            // InternalDrn.g:1680:5: ( (lv_depxz_20_0= ruleDepXZ_IMPL ) )
            	            {
            	            // InternalDrn.g:1680:5: ( (lv_depxz_20_0= ruleDepXZ_IMPL ) )
            	            // InternalDrn.g:1681:6: (lv_depxz_20_0= ruleDepXZ_IMPL )
            	            {
            	            // InternalDrn.g:1681:6: (lv_depxz_20_0= ruleDepXZ_IMPL )
            	            // InternalDrn.g:1682:7: lv_depxz_20_0= ruleDepXZ_IMPL
            	            {

            	            							newCompositeNode(grammarAccess.getAndAccess().getDepxzDepXZ_IMPLParserRuleCall_6_1_3_0());
            	            						
            	            pushFollow(FOLLOW_25);
            	            lv_depxz_20_0=ruleDepXZ_IMPL();

            	            state._fsp--;


            	            							if (current==null) {
            	            								current = createModelElementForParent(grammarAccess.getAndRule());
            	            							}
            	            							add(
            	            								current,
            	            								"depxz",
            	            								lv_depxz_20_0,
            	            								"sar.drone.Drn.DepXZ_IMPL");
            	            							afterParserOrEnumRuleCall();
            	            						

            	            }


            	            }


            	            }
            	            break;
            	        case 5 :
            	            // InternalDrn.g:1700:5: ( (lv_depxy_21_0= ruleDepXY_IMPL ) )
            	            {
            	            // InternalDrn.g:1700:5: ( (lv_depxy_21_0= ruleDepXY_IMPL ) )
            	            // InternalDrn.g:1701:6: (lv_depxy_21_0= ruleDepXY_IMPL )
            	            {
            	            // InternalDrn.g:1701:6: (lv_depxy_21_0= ruleDepXY_IMPL )
            	            // InternalDrn.g:1702:7: lv_depxy_21_0= ruleDepXY_IMPL
            	            {

            	            							newCompositeNode(grammarAccess.getAndAccess().getDepxyDepXY_IMPLParserRuleCall_6_1_4_0());
            	            						
            	            pushFollow(FOLLOW_25);
            	            lv_depxy_21_0=ruleDepXY_IMPL();

            	            state._fsp--;


            	            							if (current==null) {
            	            								current = createModelElementForParent(grammarAccess.getAndRule());
            	            							}
            	            							add(
            	            								current,
            	            								"depxy",
            	            								lv_depxy_21_0,
            	            								"sar.drone.Drn.DepXY_IMPL");
            	            							afterParserOrEnumRuleCall();
            	            						

            	            }


            	            }


            	            }
            	            break;
            	        case 6 :
            	            // InternalDrn.g:1720:5: ( (lv_depz_22_0= ruleDepZ_Impl ) )
            	            {
            	            // InternalDrn.g:1720:5: ( (lv_depz_22_0= ruleDepZ_Impl ) )
            	            // InternalDrn.g:1721:6: (lv_depz_22_0= ruleDepZ_Impl )
            	            {
            	            // InternalDrn.g:1721:6: (lv_depz_22_0= ruleDepZ_Impl )
            	            // InternalDrn.g:1722:7: lv_depz_22_0= ruleDepZ_Impl
            	            {

            	            							newCompositeNode(grammarAccess.getAndAccess().getDepzDepZ_ImplParserRuleCall_6_1_5_0());
            	            						
            	            pushFollow(FOLLOW_25);
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

            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            otherlv_23=(Token)match(input,28,FOLLOW_2); 

            			newLeafNode(otherlv_23, grammarAccess.getAndAccess().getRightParenthesisKeyword_7());
            		

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
    // InternalDrn.g:1749:1: entryRuleDepY_Impl returns [EObject current=null] : iv_ruleDepY_Impl= ruleDepY_Impl EOF ;
    public final EObject entryRuleDepY_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDepY_Impl = null;


        try {
            // InternalDrn.g:1749:50: (iv_ruleDepY_Impl= ruleDepY_Impl EOF )
            // InternalDrn.g:1750:2: iv_ruleDepY_Impl= ruleDepY_Impl EOF
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
    // InternalDrn.g:1756:1: ruleDepY_Impl returns [EObject current=null] : (this_FORWARD_0= ruleFORWARD | this_BACKWARD_1= ruleBACKWARD ) ;
    public final EObject ruleDepY_Impl() throws RecognitionException {
        EObject current = null;

        EObject this_FORWARD_0 = null;

        EObject this_BACKWARD_1 = null;



        	enterRule();

        try {
            // InternalDrn.g:1762:2: ( (this_FORWARD_0= ruleFORWARD | this_BACKWARD_1= ruleBACKWARD ) )
            // InternalDrn.g:1763:2: (this_FORWARD_0= ruleFORWARD | this_BACKWARD_1= ruleBACKWARD )
            {
            // InternalDrn.g:1763:2: (this_FORWARD_0= ruleFORWARD | this_BACKWARD_1= ruleBACKWARD )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==31) ) {
                alt23=1;
            }
            else if ( (LA23_0==34) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // InternalDrn.g:1764:3: this_FORWARD_0= ruleFORWARD
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
                    // InternalDrn.g:1773:3: this_BACKWARD_1= ruleBACKWARD
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
    // InternalDrn.g:1785:1: entryRuleFORWARD returns [EObject current=null] : iv_ruleFORWARD= ruleFORWARD EOF ;
    public final EObject entryRuleFORWARD() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFORWARD = null;


        try {
            // InternalDrn.g:1785:48: (iv_ruleFORWARD= ruleFORWARD EOF )
            // InternalDrn.g:1786:2: iv_ruleFORWARD= ruleFORWARD EOF
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
    // InternalDrn.g:1792:1: ruleFORWARD returns [EObject current=null] : ( ( (lv_name_0_0= 'forward' ) ) otherlv_1= '(' otherlv_2= 'distance' otherlv_3= '=' ( (lv_distanceCST_4_0= RULE_INT ) ) otherlv_5= 'temps' otherlv_6= '=' ( (lv_tempsCST_7_0= RULE_INT ) ) otherlv_8= ')' ) ;
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
            // InternalDrn.g:1798:2: ( ( ( (lv_name_0_0= 'forward' ) ) otherlv_1= '(' otherlv_2= 'distance' otherlv_3= '=' ( (lv_distanceCST_4_0= RULE_INT ) ) otherlv_5= 'temps' otherlv_6= '=' ( (lv_tempsCST_7_0= RULE_INT ) ) otherlv_8= ')' ) )
            // InternalDrn.g:1799:2: ( ( (lv_name_0_0= 'forward' ) ) otherlv_1= '(' otherlv_2= 'distance' otherlv_3= '=' ( (lv_distanceCST_4_0= RULE_INT ) ) otherlv_5= 'temps' otherlv_6= '=' ( (lv_tempsCST_7_0= RULE_INT ) ) otherlv_8= ')' )
            {
            // InternalDrn.g:1799:2: ( ( (lv_name_0_0= 'forward' ) ) otherlv_1= '(' otherlv_2= 'distance' otherlv_3= '=' ( (lv_distanceCST_4_0= RULE_INT ) ) otherlv_5= 'temps' otherlv_6= '=' ( (lv_tempsCST_7_0= RULE_INT ) ) otherlv_8= ')' )
            // InternalDrn.g:1800:3: ( (lv_name_0_0= 'forward' ) ) otherlv_1= '(' otherlv_2= 'distance' otherlv_3= '=' ( (lv_distanceCST_4_0= RULE_INT ) ) otherlv_5= 'temps' otherlv_6= '=' ( (lv_tempsCST_7_0= RULE_INT ) ) otherlv_8= ')'
            {
            // InternalDrn.g:1800:3: ( (lv_name_0_0= 'forward' ) )
            // InternalDrn.g:1801:4: (lv_name_0_0= 'forward' )
            {
            // InternalDrn.g:1801:4: (lv_name_0_0= 'forward' )
            // InternalDrn.g:1802:5: lv_name_0_0= 'forward'
            {
            lv_name_0_0=(Token)match(input,31,FOLLOW_22); 

            					newLeafNode(lv_name_0_0, grammarAccess.getFORWARDAccess().getNameForwardKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFORWARDRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "forward");
            				

            }


            }

            otherlv_1=(Token)match(input,26,FOLLOW_26); 

            			newLeafNode(otherlv_1, grammarAccess.getFORWARDAccess().getLeftParenthesisKeyword_1());
            		
            otherlv_2=(Token)match(input,32,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getFORWARDAccess().getDistanceKeyword_2());
            		
            otherlv_3=(Token)match(input,14,FOLLOW_13); 

            			newLeafNode(otherlv_3, grammarAccess.getFORWARDAccess().getEqualsSignKeyword_3());
            		
            // InternalDrn.g:1826:3: ( (lv_distanceCST_4_0= RULE_INT ) )
            // InternalDrn.g:1827:4: (lv_distanceCST_4_0= RULE_INT )
            {
            // InternalDrn.g:1827:4: (lv_distanceCST_4_0= RULE_INT )
            // InternalDrn.g:1828:5: lv_distanceCST_4_0= RULE_INT
            {
            lv_distanceCST_4_0=(Token)match(input,RULE_INT,FOLLOW_27); 

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

            otherlv_5=(Token)match(input,33,FOLLOW_6); 

            			newLeafNode(otherlv_5, grammarAccess.getFORWARDAccess().getTempsKeyword_5());
            		
            otherlv_6=(Token)match(input,14,FOLLOW_13); 

            			newLeafNode(otherlv_6, grammarAccess.getFORWARDAccess().getEqualsSignKeyword_6());
            		
            // InternalDrn.g:1852:3: ( (lv_tempsCST_7_0= RULE_INT ) )
            // InternalDrn.g:1853:4: (lv_tempsCST_7_0= RULE_INT )
            {
            // InternalDrn.g:1853:4: (lv_tempsCST_7_0= RULE_INT )
            // InternalDrn.g:1854:5: lv_tempsCST_7_0= RULE_INT
            {
            lv_tempsCST_7_0=(Token)match(input,RULE_INT,FOLLOW_28); 

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

            otherlv_8=(Token)match(input,28,FOLLOW_2); 

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
    // InternalDrn.g:1878:1: entryRuleBACKWARD returns [EObject current=null] : iv_ruleBACKWARD= ruleBACKWARD EOF ;
    public final EObject entryRuleBACKWARD() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBACKWARD = null;


        try {
            // InternalDrn.g:1878:49: (iv_ruleBACKWARD= ruleBACKWARD EOF )
            // InternalDrn.g:1879:2: iv_ruleBACKWARD= ruleBACKWARD EOF
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
    // InternalDrn.g:1885:1: ruleBACKWARD returns [EObject current=null] : ( ( (lv_name_0_0= 'backward' ) ) otherlv_1= '(' otherlv_2= 'distance' otherlv_3= '=' ( (lv_distanceCST_4_0= RULE_INT ) ) otherlv_5= 'temps' otherlv_6= '=' ( (lv_tempsCST_7_0= RULE_INT ) ) otherlv_8= ')' ) ;
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
            // InternalDrn.g:1891:2: ( ( ( (lv_name_0_0= 'backward' ) ) otherlv_1= '(' otherlv_2= 'distance' otherlv_3= '=' ( (lv_distanceCST_4_0= RULE_INT ) ) otherlv_5= 'temps' otherlv_6= '=' ( (lv_tempsCST_7_0= RULE_INT ) ) otherlv_8= ')' ) )
            // InternalDrn.g:1892:2: ( ( (lv_name_0_0= 'backward' ) ) otherlv_1= '(' otherlv_2= 'distance' otherlv_3= '=' ( (lv_distanceCST_4_0= RULE_INT ) ) otherlv_5= 'temps' otherlv_6= '=' ( (lv_tempsCST_7_0= RULE_INT ) ) otherlv_8= ')' )
            {
            // InternalDrn.g:1892:2: ( ( (lv_name_0_0= 'backward' ) ) otherlv_1= '(' otherlv_2= 'distance' otherlv_3= '=' ( (lv_distanceCST_4_0= RULE_INT ) ) otherlv_5= 'temps' otherlv_6= '=' ( (lv_tempsCST_7_0= RULE_INT ) ) otherlv_8= ')' )
            // InternalDrn.g:1893:3: ( (lv_name_0_0= 'backward' ) ) otherlv_1= '(' otherlv_2= 'distance' otherlv_3= '=' ( (lv_distanceCST_4_0= RULE_INT ) ) otherlv_5= 'temps' otherlv_6= '=' ( (lv_tempsCST_7_0= RULE_INT ) ) otherlv_8= ')'
            {
            // InternalDrn.g:1893:3: ( (lv_name_0_0= 'backward' ) )
            // InternalDrn.g:1894:4: (lv_name_0_0= 'backward' )
            {
            // InternalDrn.g:1894:4: (lv_name_0_0= 'backward' )
            // InternalDrn.g:1895:5: lv_name_0_0= 'backward'
            {
            lv_name_0_0=(Token)match(input,34,FOLLOW_22); 

            					newLeafNode(lv_name_0_0, grammarAccess.getBACKWARDAccess().getNameBackwardKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBACKWARDRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "backward");
            				

            }


            }

            otherlv_1=(Token)match(input,26,FOLLOW_26); 

            			newLeafNode(otherlv_1, grammarAccess.getBACKWARDAccess().getLeftParenthesisKeyword_1());
            		
            otherlv_2=(Token)match(input,32,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getBACKWARDAccess().getDistanceKeyword_2());
            		
            otherlv_3=(Token)match(input,14,FOLLOW_13); 

            			newLeafNode(otherlv_3, grammarAccess.getBACKWARDAccess().getEqualsSignKeyword_3());
            		
            // InternalDrn.g:1919:3: ( (lv_distanceCST_4_0= RULE_INT ) )
            // InternalDrn.g:1920:4: (lv_distanceCST_4_0= RULE_INT )
            {
            // InternalDrn.g:1920:4: (lv_distanceCST_4_0= RULE_INT )
            // InternalDrn.g:1921:5: lv_distanceCST_4_0= RULE_INT
            {
            lv_distanceCST_4_0=(Token)match(input,RULE_INT,FOLLOW_27); 

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

            otherlv_5=(Token)match(input,33,FOLLOW_6); 

            			newLeafNode(otherlv_5, grammarAccess.getBACKWARDAccess().getTempsKeyword_5());
            		
            otherlv_6=(Token)match(input,14,FOLLOW_13); 

            			newLeafNode(otherlv_6, grammarAccess.getBACKWARDAccess().getEqualsSignKeyword_6());
            		
            // InternalDrn.g:1945:3: ( (lv_tempsCST_7_0= RULE_INT ) )
            // InternalDrn.g:1946:4: (lv_tempsCST_7_0= RULE_INT )
            {
            // InternalDrn.g:1946:4: (lv_tempsCST_7_0= RULE_INT )
            // InternalDrn.g:1947:5: lv_tempsCST_7_0= RULE_INT
            {
            lv_tempsCST_7_0=(Token)match(input,RULE_INT,FOLLOW_28); 

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

            otherlv_8=(Token)match(input,28,FOLLOW_2); 

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
    // InternalDrn.g:1971:1: entryRuleDepX_Impl returns [EObject current=null] : iv_ruleDepX_Impl= ruleDepX_Impl EOF ;
    public final EObject entryRuleDepX_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDepX_Impl = null;


        try {
            // InternalDrn.g:1971:50: (iv_ruleDepX_Impl= ruleDepX_Impl EOF )
            // InternalDrn.g:1972:2: iv_ruleDepX_Impl= ruleDepX_Impl EOF
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
    // InternalDrn.g:1978:1: ruleDepX_Impl returns [EObject current=null] : (this_LEFT_0= ruleLEFT | this_RIGHT_1= ruleRIGHT ) ;
    public final EObject ruleDepX_Impl() throws RecognitionException {
        EObject current = null;

        EObject this_LEFT_0 = null;

        EObject this_RIGHT_1 = null;



        	enterRule();

        try {
            // InternalDrn.g:1984:2: ( (this_LEFT_0= ruleLEFT | this_RIGHT_1= ruleRIGHT ) )
            // InternalDrn.g:1985:2: (this_LEFT_0= ruleLEFT | this_RIGHT_1= ruleRIGHT )
            {
            // InternalDrn.g:1985:2: (this_LEFT_0= ruleLEFT | this_RIGHT_1= ruleRIGHT )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==35) ) {
                alt24=1;
            }
            else if ( (LA24_0==36) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // InternalDrn.g:1986:3: this_LEFT_0= ruleLEFT
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
                    // InternalDrn.g:1995:3: this_RIGHT_1= ruleRIGHT
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
    // InternalDrn.g:2007:1: entryRuleLEFT returns [EObject current=null] : iv_ruleLEFT= ruleLEFT EOF ;
    public final EObject entryRuleLEFT() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLEFT = null;


        try {
            // InternalDrn.g:2007:45: (iv_ruleLEFT= ruleLEFT EOF )
            // InternalDrn.g:2008:2: iv_ruleLEFT= ruleLEFT EOF
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
    // InternalDrn.g:2014:1: ruleLEFT returns [EObject current=null] : ( ( (lv_name_0_0= 'left' ) ) otherlv_1= '(' otherlv_2= 'distance' otherlv_3= '=' ( (lv_distanceCST_4_0= RULE_INT ) ) otherlv_5= 'temps' otherlv_6= '=' ( (lv_tempsCST_7_0= RULE_INT ) ) otherlv_8= ')' ) ;
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
            // InternalDrn.g:2020:2: ( ( ( (lv_name_0_0= 'left' ) ) otherlv_1= '(' otherlv_2= 'distance' otherlv_3= '=' ( (lv_distanceCST_4_0= RULE_INT ) ) otherlv_5= 'temps' otherlv_6= '=' ( (lv_tempsCST_7_0= RULE_INT ) ) otherlv_8= ')' ) )
            // InternalDrn.g:2021:2: ( ( (lv_name_0_0= 'left' ) ) otherlv_1= '(' otherlv_2= 'distance' otherlv_3= '=' ( (lv_distanceCST_4_0= RULE_INT ) ) otherlv_5= 'temps' otherlv_6= '=' ( (lv_tempsCST_7_0= RULE_INT ) ) otherlv_8= ')' )
            {
            // InternalDrn.g:2021:2: ( ( (lv_name_0_0= 'left' ) ) otherlv_1= '(' otherlv_2= 'distance' otherlv_3= '=' ( (lv_distanceCST_4_0= RULE_INT ) ) otherlv_5= 'temps' otherlv_6= '=' ( (lv_tempsCST_7_0= RULE_INT ) ) otherlv_8= ')' )
            // InternalDrn.g:2022:3: ( (lv_name_0_0= 'left' ) ) otherlv_1= '(' otherlv_2= 'distance' otherlv_3= '=' ( (lv_distanceCST_4_0= RULE_INT ) ) otherlv_5= 'temps' otherlv_6= '=' ( (lv_tempsCST_7_0= RULE_INT ) ) otherlv_8= ')'
            {
            // InternalDrn.g:2022:3: ( (lv_name_0_0= 'left' ) )
            // InternalDrn.g:2023:4: (lv_name_0_0= 'left' )
            {
            // InternalDrn.g:2023:4: (lv_name_0_0= 'left' )
            // InternalDrn.g:2024:5: lv_name_0_0= 'left'
            {
            lv_name_0_0=(Token)match(input,35,FOLLOW_22); 

            					newLeafNode(lv_name_0_0, grammarAccess.getLEFTAccess().getNameLeftKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLEFTRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "left");
            				

            }


            }

            otherlv_1=(Token)match(input,26,FOLLOW_26); 

            			newLeafNode(otherlv_1, grammarAccess.getLEFTAccess().getLeftParenthesisKeyword_1());
            		
            otherlv_2=(Token)match(input,32,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getLEFTAccess().getDistanceKeyword_2());
            		
            otherlv_3=(Token)match(input,14,FOLLOW_13); 

            			newLeafNode(otherlv_3, grammarAccess.getLEFTAccess().getEqualsSignKeyword_3());
            		
            // InternalDrn.g:2048:3: ( (lv_distanceCST_4_0= RULE_INT ) )
            // InternalDrn.g:2049:4: (lv_distanceCST_4_0= RULE_INT )
            {
            // InternalDrn.g:2049:4: (lv_distanceCST_4_0= RULE_INT )
            // InternalDrn.g:2050:5: lv_distanceCST_4_0= RULE_INT
            {
            lv_distanceCST_4_0=(Token)match(input,RULE_INT,FOLLOW_27); 

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

            otherlv_5=(Token)match(input,33,FOLLOW_6); 

            			newLeafNode(otherlv_5, grammarAccess.getLEFTAccess().getTempsKeyword_5());
            		
            otherlv_6=(Token)match(input,14,FOLLOW_13); 

            			newLeafNode(otherlv_6, grammarAccess.getLEFTAccess().getEqualsSignKeyword_6());
            		
            // InternalDrn.g:2074:3: ( (lv_tempsCST_7_0= RULE_INT ) )
            // InternalDrn.g:2075:4: (lv_tempsCST_7_0= RULE_INT )
            {
            // InternalDrn.g:2075:4: (lv_tempsCST_7_0= RULE_INT )
            // InternalDrn.g:2076:5: lv_tempsCST_7_0= RULE_INT
            {
            lv_tempsCST_7_0=(Token)match(input,RULE_INT,FOLLOW_28); 

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

            otherlv_8=(Token)match(input,28,FOLLOW_2); 

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
    // InternalDrn.g:2100:1: entryRuleRIGHT returns [EObject current=null] : iv_ruleRIGHT= ruleRIGHT EOF ;
    public final EObject entryRuleRIGHT() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRIGHT = null;


        try {
            // InternalDrn.g:2100:46: (iv_ruleRIGHT= ruleRIGHT EOF )
            // InternalDrn.g:2101:2: iv_ruleRIGHT= ruleRIGHT EOF
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
    // InternalDrn.g:2107:1: ruleRIGHT returns [EObject current=null] : ( ( (lv_name_0_0= 'right' ) ) otherlv_1= '(' otherlv_2= 'distance' otherlv_3= '=' ( (lv_distanceCST_4_0= RULE_INT ) ) otherlv_5= 'temps' otherlv_6= '=' ( (lv_tempsCST_7_0= RULE_INT ) ) otherlv_8= ')' ) ;
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
            // InternalDrn.g:2113:2: ( ( ( (lv_name_0_0= 'right' ) ) otherlv_1= '(' otherlv_2= 'distance' otherlv_3= '=' ( (lv_distanceCST_4_0= RULE_INT ) ) otherlv_5= 'temps' otherlv_6= '=' ( (lv_tempsCST_7_0= RULE_INT ) ) otherlv_8= ')' ) )
            // InternalDrn.g:2114:2: ( ( (lv_name_0_0= 'right' ) ) otherlv_1= '(' otherlv_2= 'distance' otherlv_3= '=' ( (lv_distanceCST_4_0= RULE_INT ) ) otherlv_5= 'temps' otherlv_6= '=' ( (lv_tempsCST_7_0= RULE_INT ) ) otherlv_8= ')' )
            {
            // InternalDrn.g:2114:2: ( ( (lv_name_0_0= 'right' ) ) otherlv_1= '(' otherlv_2= 'distance' otherlv_3= '=' ( (lv_distanceCST_4_0= RULE_INT ) ) otherlv_5= 'temps' otherlv_6= '=' ( (lv_tempsCST_7_0= RULE_INT ) ) otherlv_8= ')' )
            // InternalDrn.g:2115:3: ( (lv_name_0_0= 'right' ) ) otherlv_1= '(' otherlv_2= 'distance' otherlv_3= '=' ( (lv_distanceCST_4_0= RULE_INT ) ) otherlv_5= 'temps' otherlv_6= '=' ( (lv_tempsCST_7_0= RULE_INT ) ) otherlv_8= ')'
            {
            // InternalDrn.g:2115:3: ( (lv_name_0_0= 'right' ) )
            // InternalDrn.g:2116:4: (lv_name_0_0= 'right' )
            {
            // InternalDrn.g:2116:4: (lv_name_0_0= 'right' )
            // InternalDrn.g:2117:5: lv_name_0_0= 'right'
            {
            lv_name_0_0=(Token)match(input,36,FOLLOW_22); 

            					newLeafNode(lv_name_0_0, grammarAccess.getRIGHTAccess().getNameRightKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRIGHTRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "right");
            				

            }


            }

            otherlv_1=(Token)match(input,26,FOLLOW_26); 

            			newLeafNode(otherlv_1, grammarAccess.getRIGHTAccess().getLeftParenthesisKeyword_1());
            		
            otherlv_2=(Token)match(input,32,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getRIGHTAccess().getDistanceKeyword_2());
            		
            otherlv_3=(Token)match(input,14,FOLLOW_13); 

            			newLeafNode(otherlv_3, grammarAccess.getRIGHTAccess().getEqualsSignKeyword_3());
            		
            // InternalDrn.g:2141:3: ( (lv_distanceCST_4_0= RULE_INT ) )
            // InternalDrn.g:2142:4: (lv_distanceCST_4_0= RULE_INT )
            {
            // InternalDrn.g:2142:4: (lv_distanceCST_4_0= RULE_INT )
            // InternalDrn.g:2143:5: lv_distanceCST_4_0= RULE_INT
            {
            lv_distanceCST_4_0=(Token)match(input,RULE_INT,FOLLOW_27); 

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

            otherlv_5=(Token)match(input,33,FOLLOW_6); 

            			newLeafNode(otherlv_5, grammarAccess.getRIGHTAccess().getTempsKeyword_5());
            		
            otherlv_6=(Token)match(input,14,FOLLOW_13); 

            			newLeafNode(otherlv_6, grammarAccess.getRIGHTAccess().getEqualsSignKeyword_6());
            		
            // InternalDrn.g:2167:3: ( (lv_tempsCST_7_0= RULE_INT ) )
            // InternalDrn.g:2168:4: (lv_tempsCST_7_0= RULE_INT )
            {
            // InternalDrn.g:2168:4: (lv_tempsCST_7_0= RULE_INT )
            // InternalDrn.g:2169:5: lv_tempsCST_7_0= RULE_INT
            {
            lv_tempsCST_7_0=(Token)match(input,RULE_INT,FOLLOW_28); 

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

            otherlv_8=(Token)match(input,28,FOLLOW_2); 

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
    // InternalDrn.g:2193:1: entryRuleDepZ_Impl returns [EObject current=null] : iv_ruleDepZ_Impl= ruleDepZ_Impl EOF ;
    public final EObject entryRuleDepZ_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDepZ_Impl = null;


        try {
            // InternalDrn.g:2193:50: (iv_ruleDepZ_Impl= ruleDepZ_Impl EOF )
            // InternalDrn.g:2194:2: iv_ruleDepZ_Impl= ruleDepZ_Impl EOF
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
    // InternalDrn.g:2200:1: ruleDepZ_Impl returns [EObject current=null] : (this_UP_0= ruleUP | this_DOWN_1= ruleDOWN ) ;
    public final EObject ruleDepZ_Impl() throws RecognitionException {
        EObject current = null;

        EObject this_UP_0 = null;

        EObject this_DOWN_1 = null;



        	enterRule();

        try {
            // InternalDrn.g:2206:2: ( (this_UP_0= ruleUP | this_DOWN_1= ruleDOWN ) )
            // InternalDrn.g:2207:2: (this_UP_0= ruleUP | this_DOWN_1= ruleDOWN )
            {
            // InternalDrn.g:2207:2: (this_UP_0= ruleUP | this_DOWN_1= ruleDOWN )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==37) ) {
                alt25=1;
            }
            else if ( (LA25_0==38) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // InternalDrn.g:2208:3: this_UP_0= ruleUP
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
                    // InternalDrn.g:2217:3: this_DOWN_1= ruleDOWN
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
    // InternalDrn.g:2229:1: entryRuleUP returns [EObject current=null] : iv_ruleUP= ruleUP EOF ;
    public final EObject entryRuleUP() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUP = null;


        try {
            // InternalDrn.g:2229:43: (iv_ruleUP= ruleUP EOF )
            // InternalDrn.g:2230:2: iv_ruleUP= ruleUP EOF
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
    // InternalDrn.g:2236:1: ruleUP returns [EObject current=null] : ( ( (lv_name_0_0= 'up' ) ) otherlv_1= '(' otherlv_2= 'distance' otherlv_3= '=' ( (lv_distanceCST_4_0= RULE_INT ) ) otherlv_5= 'temps' otherlv_6= '=' ( (lv_tempsCST_7_0= RULE_INT ) ) otherlv_8= ')' ) ;
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
            // InternalDrn.g:2242:2: ( ( ( (lv_name_0_0= 'up' ) ) otherlv_1= '(' otherlv_2= 'distance' otherlv_3= '=' ( (lv_distanceCST_4_0= RULE_INT ) ) otherlv_5= 'temps' otherlv_6= '=' ( (lv_tempsCST_7_0= RULE_INT ) ) otherlv_8= ')' ) )
            // InternalDrn.g:2243:2: ( ( (lv_name_0_0= 'up' ) ) otherlv_1= '(' otherlv_2= 'distance' otherlv_3= '=' ( (lv_distanceCST_4_0= RULE_INT ) ) otherlv_5= 'temps' otherlv_6= '=' ( (lv_tempsCST_7_0= RULE_INT ) ) otherlv_8= ')' )
            {
            // InternalDrn.g:2243:2: ( ( (lv_name_0_0= 'up' ) ) otherlv_1= '(' otherlv_2= 'distance' otherlv_3= '=' ( (lv_distanceCST_4_0= RULE_INT ) ) otherlv_5= 'temps' otherlv_6= '=' ( (lv_tempsCST_7_0= RULE_INT ) ) otherlv_8= ')' )
            // InternalDrn.g:2244:3: ( (lv_name_0_0= 'up' ) ) otherlv_1= '(' otherlv_2= 'distance' otherlv_3= '=' ( (lv_distanceCST_4_0= RULE_INT ) ) otherlv_5= 'temps' otherlv_6= '=' ( (lv_tempsCST_7_0= RULE_INT ) ) otherlv_8= ')'
            {
            // InternalDrn.g:2244:3: ( (lv_name_0_0= 'up' ) )
            // InternalDrn.g:2245:4: (lv_name_0_0= 'up' )
            {
            // InternalDrn.g:2245:4: (lv_name_0_0= 'up' )
            // InternalDrn.g:2246:5: lv_name_0_0= 'up'
            {
            lv_name_0_0=(Token)match(input,37,FOLLOW_22); 

            					newLeafNode(lv_name_0_0, grammarAccess.getUPAccess().getNameUpKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUPRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "up");
            				

            }


            }

            otherlv_1=(Token)match(input,26,FOLLOW_26); 

            			newLeafNode(otherlv_1, grammarAccess.getUPAccess().getLeftParenthesisKeyword_1());
            		
            otherlv_2=(Token)match(input,32,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getUPAccess().getDistanceKeyword_2());
            		
            otherlv_3=(Token)match(input,14,FOLLOW_13); 

            			newLeafNode(otherlv_3, grammarAccess.getUPAccess().getEqualsSignKeyword_3());
            		
            // InternalDrn.g:2270:3: ( (lv_distanceCST_4_0= RULE_INT ) )
            // InternalDrn.g:2271:4: (lv_distanceCST_4_0= RULE_INT )
            {
            // InternalDrn.g:2271:4: (lv_distanceCST_4_0= RULE_INT )
            // InternalDrn.g:2272:5: lv_distanceCST_4_0= RULE_INT
            {
            lv_distanceCST_4_0=(Token)match(input,RULE_INT,FOLLOW_27); 

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

            otherlv_5=(Token)match(input,33,FOLLOW_6); 

            			newLeafNode(otherlv_5, grammarAccess.getUPAccess().getTempsKeyword_5());
            		
            otherlv_6=(Token)match(input,14,FOLLOW_13); 

            			newLeafNode(otherlv_6, grammarAccess.getUPAccess().getEqualsSignKeyword_6());
            		
            // InternalDrn.g:2296:3: ( (lv_tempsCST_7_0= RULE_INT ) )
            // InternalDrn.g:2297:4: (lv_tempsCST_7_0= RULE_INT )
            {
            // InternalDrn.g:2297:4: (lv_tempsCST_7_0= RULE_INT )
            // InternalDrn.g:2298:5: lv_tempsCST_7_0= RULE_INT
            {
            lv_tempsCST_7_0=(Token)match(input,RULE_INT,FOLLOW_28); 

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

            otherlv_8=(Token)match(input,28,FOLLOW_2); 

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
    // InternalDrn.g:2322:1: entryRuleDOWN returns [EObject current=null] : iv_ruleDOWN= ruleDOWN EOF ;
    public final EObject entryRuleDOWN() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDOWN = null;


        try {
            // InternalDrn.g:2322:45: (iv_ruleDOWN= ruleDOWN EOF )
            // InternalDrn.g:2323:2: iv_ruleDOWN= ruleDOWN EOF
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
    // InternalDrn.g:2329:1: ruleDOWN returns [EObject current=null] : ( ( (lv_name_0_0= 'down' ) ) otherlv_1= '(' otherlv_2= 'distance' otherlv_3= '=' ( (lv_distanceCST_4_0= RULE_INT ) ) otherlv_5= 'temps' otherlv_6= '=' ( (lv_tempsCST_7_0= RULE_INT ) ) otherlv_8= ')' ) ;
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
            // InternalDrn.g:2335:2: ( ( ( (lv_name_0_0= 'down' ) ) otherlv_1= '(' otherlv_2= 'distance' otherlv_3= '=' ( (lv_distanceCST_4_0= RULE_INT ) ) otherlv_5= 'temps' otherlv_6= '=' ( (lv_tempsCST_7_0= RULE_INT ) ) otherlv_8= ')' ) )
            // InternalDrn.g:2336:2: ( ( (lv_name_0_0= 'down' ) ) otherlv_1= '(' otherlv_2= 'distance' otherlv_3= '=' ( (lv_distanceCST_4_0= RULE_INT ) ) otherlv_5= 'temps' otherlv_6= '=' ( (lv_tempsCST_7_0= RULE_INT ) ) otherlv_8= ')' )
            {
            // InternalDrn.g:2336:2: ( ( (lv_name_0_0= 'down' ) ) otherlv_1= '(' otherlv_2= 'distance' otherlv_3= '=' ( (lv_distanceCST_4_0= RULE_INT ) ) otherlv_5= 'temps' otherlv_6= '=' ( (lv_tempsCST_7_0= RULE_INT ) ) otherlv_8= ')' )
            // InternalDrn.g:2337:3: ( (lv_name_0_0= 'down' ) ) otherlv_1= '(' otherlv_2= 'distance' otherlv_3= '=' ( (lv_distanceCST_4_0= RULE_INT ) ) otherlv_5= 'temps' otherlv_6= '=' ( (lv_tempsCST_7_0= RULE_INT ) ) otherlv_8= ')'
            {
            // InternalDrn.g:2337:3: ( (lv_name_0_0= 'down' ) )
            // InternalDrn.g:2338:4: (lv_name_0_0= 'down' )
            {
            // InternalDrn.g:2338:4: (lv_name_0_0= 'down' )
            // InternalDrn.g:2339:5: lv_name_0_0= 'down'
            {
            lv_name_0_0=(Token)match(input,38,FOLLOW_22); 

            					newLeafNode(lv_name_0_0, grammarAccess.getDOWNAccess().getNameDownKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDOWNRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "down");
            				

            }


            }

            otherlv_1=(Token)match(input,26,FOLLOW_26); 

            			newLeafNode(otherlv_1, grammarAccess.getDOWNAccess().getLeftParenthesisKeyword_1());
            		
            otherlv_2=(Token)match(input,32,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getDOWNAccess().getDistanceKeyword_2());
            		
            otherlv_3=(Token)match(input,14,FOLLOW_13); 

            			newLeafNode(otherlv_3, grammarAccess.getDOWNAccess().getEqualsSignKeyword_3());
            		
            // InternalDrn.g:2363:3: ( (lv_distanceCST_4_0= RULE_INT ) )
            // InternalDrn.g:2364:4: (lv_distanceCST_4_0= RULE_INT )
            {
            // InternalDrn.g:2364:4: (lv_distanceCST_4_0= RULE_INT )
            // InternalDrn.g:2365:5: lv_distanceCST_4_0= RULE_INT
            {
            lv_distanceCST_4_0=(Token)match(input,RULE_INT,FOLLOW_27); 

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

            otherlv_5=(Token)match(input,33,FOLLOW_6); 

            			newLeafNode(otherlv_5, grammarAccess.getDOWNAccess().getTempsKeyword_5());
            		
            otherlv_6=(Token)match(input,14,FOLLOW_13); 

            			newLeafNode(otherlv_6, grammarAccess.getDOWNAccess().getEqualsSignKeyword_6());
            		
            // InternalDrn.g:2389:3: ( (lv_tempsCST_7_0= RULE_INT ) )
            // InternalDrn.g:2390:4: (lv_tempsCST_7_0= RULE_INT )
            {
            // InternalDrn.g:2390:4: (lv_tempsCST_7_0= RULE_INT )
            // InternalDrn.g:2391:5: lv_tempsCST_7_0= RULE_INT
            {
            lv_tempsCST_7_0=(Token)match(input,RULE_INT,FOLLOW_28); 

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

            otherlv_8=(Token)match(input,28,FOLLOW_2); 

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
    // InternalDrn.g:2415:1: entryRuleDepXY_IMPL returns [EObject current=null] : iv_ruleDepXY_IMPL= ruleDepXY_IMPL EOF ;
    public final EObject entryRuleDepXY_IMPL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDepXY_IMPL = null;


        try {
            // InternalDrn.g:2415:51: (iv_ruleDepXY_IMPL= ruleDepXY_IMPL EOF )
            // InternalDrn.g:2416:2: iv_ruleDepXY_IMPL= ruleDepXY_IMPL EOF
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
    // InternalDrn.g:2422:1: ruleDepXY_IMPL returns [EObject current=null] : (this_DepXY_0= ruleDepXY | this_CERCLEXY_1= ruleCERCLEXY | this_CARREXY_2= ruleCARREXY ) ;
    public final EObject ruleDepXY_IMPL() throws RecognitionException {
        EObject current = null;

        EObject this_DepXY_0 = null;

        EObject this_CERCLEXY_1 = null;

        EObject this_CARREXY_2 = null;



        	enterRule();

        try {
            // InternalDrn.g:2428:2: ( (this_DepXY_0= ruleDepXY | this_CERCLEXY_1= ruleCERCLEXY | this_CARREXY_2= ruleCARREXY ) )
            // InternalDrn.g:2429:2: (this_DepXY_0= ruleDepXY | this_CERCLEXY_1= ruleCERCLEXY | this_CARREXY_2= ruleCARREXY )
            {
            // InternalDrn.g:2429:2: (this_DepXY_0= ruleDepXY | this_CERCLEXY_1= ruleCERCLEXY | this_CARREXY_2= ruleCARREXY )
            int alt26=3;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt26=1;
                }
                break;
            case 40:
                {
                alt26=2;
                }
                break;
            case 42:
                {
                alt26=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // InternalDrn.g:2430:3: this_DepXY_0= ruleDepXY
                    {

                    			newCompositeNode(grammarAccess.getDepXY_IMPLAccess().getDepXYParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_DepXY_0=ruleDepXY();

                    state._fsp--;


                    			current = this_DepXY_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDrn.g:2439:3: this_CERCLEXY_1= ruleCERCLEXY
                    {

                    			newCompositeNode(grammarAccess.getDepXY_IMPLAccess().getCERCLEXYParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_CERCLEXY_1=ruleCERCLEXY();

                    state._fsp--;


                    			current = this_CERCLEXY_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalDrn.g:2448:3: this_CARREXY_2= ruleCARREXY
                    {

                    			newCompositeNode(grammarAccess.getDepXY_IMPLAccess().getCARREXYParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_CARREXY_2=ruleCARREXY();

                    state._fsp--;


                    			current = this_CARREXY_2;
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


    // $ANTLR start "entryRuleDepXY"
    // InternalDrn.g:2460:1: entryRuleDepXY returns [EObject current=null] : iv_ruleDepXY= ruleDepXY EOF ;
    public final EObject entryRuleDepXY() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDepXY = null;


        try {
            // InternalDrn.g:2460:46: (iv_ruleDepXY= ruleDepXY EOF )
            // InternalDrn.g:2461:2: iv_ruleDepXY= ruleDepXY EOF
            {
             newCompositeNode(grammarAccess.getDepXYRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDepXY=ruleDepXY();

            state._fsp--;

             current =iv_ruleDepXY; 
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
    // $ANTLR end "entryRuleDepXY"


    // $ANTLR start "ruleDepXY"
    // InternalDrn.g:2467:1: ruleDepXY returns [EObject current=null] : ( ( (lv_name_0_0= 'depXY' ) ) otherlv_1= '(' otherlv_2= 'distance' otherlv_3= '=' ( (lv_distanceCST_4_0= RULE_INT ) ) otherlv_5= 'temps' otherlv_6= '=' ( (lv_tempsCST_7_0= RULE_INT ) ) otherlv_8= ')' ) ;
    public final EObject ruleDepXY() throws RecognitionException {
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
            // InternalDrn.g:2473:2: ( ( ( (lv_name_0_0= 'depXY' ) ) otherlv_1= '(' otherlv_2= 'distance' otherlv_3= '=' ( (lv_distanceCST_4_0= RULE_INT ) ) otherlv_5= 'temps' otherlv_6= '=' ( (lv_tempsCST_7_0= RULE_INT ) ) otherlv_8= ')' ) )
            // InternalDrn.g:2474:2: ( ( (lv_name_0_0= 'depXY' ) ) otherlv_1= '(' otherlv_2= 'distance' otherlv_3= '=' ( (lv_distanceCST_4_0= RULE_INT ) ) otherlv_5= 'temps' otherlv_6= '=' ( (lv_tempsCST_7_0= RULE_INT ) ) otherlv_8= ')' )
            {
            // InternalDrn.g:2474:2: ( ( (lv_name_0_0= 'depXY' ) ) otherlv_1= '(' otherlv_2= 'distance' otherlv_3= '=' ( (lv_distanceCST_4_0= RULE_INT ) ) otherlv_5= 'temps' otherlv_6= '=' ( (lv_tempsCST_7_0= RULE_INT ) ) otherlv_8= ')' )
            // InternalDrn.g:2475:3: ( (lv_name_0_0= 'depXY' ) ) otherlv_1= '(' otherlv_2= 'distance' otherlv_3= '=' ( (lv_distanceCST_4_0= RULE_INT ) ) otherlv_5= 'temps' otherlv_6= '=' ( (lv_tempsCST_7_0= RULE_INT ) ) otherlv_8= ')'
            {
            // InternalDrn.g:2475:3: ( (lv_name_0_0= 'depXY' ) )
            // InternalDrn.g:2476:4: (lv_name_0_0= 'depXY' )
            {
            // InternalDrn.g:2476:4: (lv_name_0_0= 'depXY' )
            // InternalDrn.g:2477:5: lv_name_0_0= 'depXY'
            {
            lv_name_0_0=(Token)match(input,39,FOLLOW_22); 

            					newLeafNode(lv_name_0_0, grammarAccess.getDepXYAccess().getNameDepXYKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDepXYRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "depXY");
            				

            }


            }

            otherlv_1=(Token)match(input,26,FOLLOW_26); 

            			newLeafNode(otherlv_1, grammarAccess.getDepXYAccess().getLeftParenthesisKeyword_1());
            		
            otherlv_2=(Token)match(input,32,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getDepXYAccess().getDistanceKeyword_2());
            		
            otherlv_3=(Token)match(input,14,FOLLOW_13); 

            			newLeafNode(otherlv_3, grammarAccess.getDepXYAccess().getEqualsSignKeyword_3());
            		
            // InternalDrn.g:2501:3: ( (lv_distanceCST_4_0= RULE_INT ) )
            // InternalDrn.g:2502:4: (lv_distanceCST_4_0= RULE_INT )
            {
            // InternalDrn.g:2502:4: (lv_distanceCST_4_0= RULE_INT )
            // InternalDrn.g:2503:5: lv_distanceCST_4_0= RULE_INT
            {
            lv_distanceCST_4_0=(Token)match(input,RULE_INT,FOLLOW_27); 

            					newLeafNode(lv_distanceCST_4_0, grammarAccess.getDepXYAccess().getDistanceCSTINTTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDepXYRule());
            					}
            					setWithLastConsumed(
            						current,
            						"distanceCST",
            						lv_distanceCST_4_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_5=(Token)match(input,33,FOLLOW_6); 

            			newLeafNode(otherlv_5, grammarAccess.getDepXYAccess().getTempsKeyword_5());
            		
            otherlv_6=(Token)match(input,14,FOLLOW_13); 

            			newLeafNode(otherlv_6, grammarAccess.getDepXYAccess().getEqualsSignKeyword_6());
            		
            // InternalDrn.g:2527:3: ( (lv_tempsCST_7_0= RULE_INT ) )
            // InternalDrn.g:2528:4: (lv_tempsCST_7_0= RULE_INT )
            {
            // InternalDrn.g:2528:4: (lv_tempsCST_7_0= RULE_INT )
            // InternalDrn.g:2529:5: lv_tempsCST_7_0= RULE_INT
            {
            lv_tempsCST_7_0=(Token)match(input,RULE_INT,FOLLOW_28); 

            					newLeafNode(lv_tempsCST_7_0, grammarAccess.getDepXYAccess().getTempsCSTINTTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDepXYRule());
            					}
            					setWithLastConsumed(
            						current,
            						"tempsCST",
            						lv_tempsCST_7_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_8=(Token)match(input,28,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getDepXYAccess().getRightParenthesisKeyword_8());
            		

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
    // $ANTLR end "ruleDepXY"


    // $ANTLR start "entryRuleCERCLEXY"
    // InternalDrn.g:2553:1: entryRuleCERCLEXY returns [EObject current=null] : iv_ruleCERCLEXY= ruleCERCLEXY EOF ;
    public final EObject entryRuleCERCLEXY() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCERCLEXY = null;


        try {
            // InternalDrn.g:2553:49: (iv_ruleCERCLEXY= ruleCERCLEXY EOF )
            // InternalDrn.g:2554:2: iv_ruleCERCLEXY= ruleCERCLEXY EOF
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
    // InternalDrn.g:2560:1: ruleCERCLEXY returns [EObject current=null] : ( ( (lv_name_0_0= 'cercleXY' ) ) otherlv_1= '(' otherlv_2= 'rayon' otherlv_3= '=' ( (lv_rayonCST_4_0= RULE_INT ) ) otherlv_5= 'temps' otherlv_6= '=' ( (lv_tempsCST_7_0= RULE_INT ) ) otherlv_8= ')' ) ;
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
            // InternalDrn.g:2566:2: ( ( ( (lv_name_0_0= 'cercleXY' ) ) otherlv_1= '(' otherlv_2= 'rayon' otherlv_3= '=' ( (lv_rayonCST_4_0= RULE_INT ) ) otherlv_5= 'temps' otherlv_6= '=' ( (lv_tempsCST_7_0= RULE_INT ) ) otherlv_8= ')' ) )
            // InternalDrn.g:2567:2: ( ( (lv_name_0_0= 'cercleXY' ) ) otherlv_1= '(' otherlv_2= 'rayon' otherlv_3= '=' ( (lv_rayonCST_4_0= RULE_INT ) ) otherlv_5= 'temps' otherlv_6= '=' ( (lv_tempsCST_7_0= RULE_INT ) ) otherlv_8= ')' )
            {
            // InternalDrn.g:2567:2: ( ( (lv_name_0_0= 'cercleXY' ) ) otherlv_1= '(' otherlv_2= 'rayon' otherlv_3= '=' ( (lv_rayonCST_4_0= RULE_INT ) ) otherlv_5= 'temps' otherlv_6= '=' ( (lv_tempsCST_7_0= RULE_INT ) ) otherlv_8= ')' )
            // InternalDrn.g:2568:3: ( (lv_name_0_0= 'cercleXY' ) ) otherlv_1= '(' otherlv_2= 'rayon' otherlv_3= '=' ( (lv_rayonCST_4_0= RULE_INT ) ) otherlv_5= 'temps' otherlv_6= '=' ( (lv_tempsCST_7_0= RULE_INT ) ) otherlv_8= ')'
            {
            // InternalDrn.g:2568:3: ( (lv_name_0_0= 'cercleXY' ) )
            // InternalDrn.g:2569:4: (lv_name_0_0= 'cercleXY' )
            {
            // InternalDrn.g:2569:4: (lv_name_0_0= 'cercleXY' )
            // InternalDrn.g:2570:5: lv_name_0_0= 'cercleXY'
            {
            lv_name_0_0=(Token)match(input,40,FOLLOW_22); 

            					newLeafNode(lv_name_0_0, grammarAccess.getCERCLEXYAccess().getNameCercleXYKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCERCLEXYRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "cercleXY");
            				

            }


            }

            otherlv_1=(Token)match(input,26,FOLLOW_29); 

            			newLeafNode(otherlv_1, grammarAccess.getCERCLEXYAccess().getLeftParenthesisKeyword_1());
            		
            otherlv_2=(Token)match(input,41,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getCERCLEXYAccess().getRayonKeyword_2());
            		
            otherlv_3=(Token)match(input,14,FOLLOW_13); 

            			newLeafNode(otherlv_3, grammarAccess.getCERCLEXYAccess().getEqualsSignKeyword_3());
            		
            // InternalDrn.g:2594:3: ( (lv_rayonCST_4_0= RULE_INT ) )
            // InternalDrn.g:2595:4: (lv_rayonCST_4_0= RULE_INT )
            {
            // InternalDrn.g:2595:4: (lv_rayonCST_4_0= RULE_INT )
            // InternalDrn.g:2596:5: lv_rayonCST_4_0= RULE_INT
            {
            lv_rayonCST_4_0=(Token)match(input,RULE_INT,FOLLOW_27); 

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

            otherlv_5=(Token)match(input,33,FOLLOW_6); 

            			newLeafNode(otherlv_5, grammarAccess.getCERCLEXYAccess().getTempsKeyword_5());
            		
            otherlv_6=(Token)match(input,14,FOLLOW_13); 

            			newLeafNode(otherlv_6, grammarAccess.getCERCLEXYAccess().getEqualsSignKeyword_6());
            		
            // InternalDrn.g:2620:3: ( (lv_tempsCST_7_0= RULE_INT ) )
            // InternalDrn.g:2621:4: (lv_tempsCST_7_0= RULE_INT )
            {
            // InternalDrn.g:2621:4: (lv_tempsCST_7_0= RULE_INT )
            // InternalDrn.g:2622:5: lv_tempsCST_7_0= RULE_INT
            {
            lv_tempsCST_7_0=(Token)match(input,RULE_INT,FOLLOW_28); 

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

            otherlv_8=(Token)match(input,28,FOLLOW_2); 

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
    // InternalDrn.g:2646:1: entryRuleCARREXY returns [EObject current=null] : iv_ruleCARREXY= ruleCARREXY EOF ;
    public final EObject entryRuleCARREXY() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCARREXY = null;


        try {
            // InternalDrn.g:2646:48: (iv_ruleCARREXY= ruleCARREXY EOF )
            // InternalDrn.g:2647:2: iv_ruleCARREXY= ruleCARREXY EOF
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
    // InternalDrn.g:2653:1: ruleCARREXY returns [EObject current=null] : ( ( (lv_name_0_0= 'carreXY' ) ) otherlv_1= '(' otherlv_2= 'cote' otherlv_3= '=' ( (lv_coteCST_4_0= RULE_INT ) ) otherlv_5= 'temps' otherlv_6= '=' ( (lv_tempsCST_7_0= RULE_INT ) ) otherlv_8= ')' ) ;
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
            // InternalDrn.g:2659:2: ( ( ( (lv_name_0_0= 'carreXY' ) ) otherlv_1= '(' otherlv_2= 'cote' otherlv_3= '=' ( (lv_coteCST_4_0= RULE_INT ) ) otherlv_5= 'temps' otherlv_6= '=' ( (lv_tempsCST_7_0= RULE_INT ) ) otherlv_8= ')' ) )
            // InternalDrn.g:2660:2: ( ( (lv_name_0_0= 'carreXY' ) ) otherlv_1= '(' otherlv_2= 'cote' otherlv_3= '=' ( (lv_coteCST_4_0= RULE_INT ) ) otherlv_5= 'temps' otherlv_6= '=' ( (lv_tempsCST_7_0= RULE_INT ) ) otherlv_8= ')' )
            {
            // InternalDrn.g:2660:2: ( ( (lv_name_0_0= 'carreXY' ) ) otherlv_1= '(' otherlv_2= 'cote' otherlv_3= '=' ( (lv_coteCST_4_0= RULE_INT ) ) otherlv_5= 'temps' otherlv_6= '=' ( (lv_tempsCST_7_0= RULE_INT ) ) otherlv_8= ')' )
            // InternalDrn.g:2661:3: ( (lv_name_0_0= 'carreXY' ) ) otherlv_1= '(' otherlv_2= 'cote' otherlv_3= '=' ( (lv_coteCST_4_0= RULE_INT ) ) otherlv_5= 'temps' otherlv_6= '=' ( (lv_tempsCST_7_0= RULE_INT ) ) otherlv_8= ')'
            {
            // InternalDrn.g:2661:3: ( (lv_name_0_0= 'carreXY' ) )
            // InternalDrn.g:2662:4: (lv_name_0_0= 'carreXY' )
            {
            // InternalDrn.g:2662:4: (lv_name_0_0= 'carreXY' )
            // InternalDrn.g:2663:5: lv_name_0_0= 'carreXY'
            {
            lv_name_0_0=(Token)match(input,42,FOLLOW_22); 

            					newLeafNode(lv_name_0_0, grammarAccess.getCARREXYAccess().getNameCarreXYKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCARREXYRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "carreXY");
            				

            }


            }

            otherlv_1=(Token)match(input,26,FOLLOW_30); 

            			newLeafNode(otherlv_1, grammarAccess.getCARREXYAccess().getLeftParenthesisKeyword_1());
            		
            otherlv_2=(Token)match(input,43,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getCARREXYAccess().getCoteKeyword_2());
            		
            otherlv_3=(Token)match(input,14,FOLLOW_13); 

            			newLeafNode(otherlv_3, grammarAccess.getCARREXYAccess().getEqualsSignKeyword_3());
            		
            // InternalDrn.g:2687:3: ( (lv_coteCST_4_0= RULE_INT ) )
            // InternalDrn.g:2688:4: (lv_coteCST_4_0= RULE_INT )
            {
            // InternalDrn.g:2688:4: (lv_coteCST_4_0= RULE_INT )
            // InternalDrn.g:2689:5: lv_coteCST_4_0= RULE_INT
            {
            lv_coteCST_4_0=(Token)match(input,RULE_INT,FOLLOW_27); 

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

            otherlv_5=(Token)match(input,33,FOLLOW_6); 

            			newLeafNode(otherlv_5, grammarAccess.getCARREXYAccess().getTempsKeyword_5());
            		
            otherlv_6=(Token)match(input,14,FOLLOW_13); 

            			newLeafNode(otherlv_6, grammarAccess.getCARREXYAccess().getEqualsSignKeyword_6());
            		
            // InternalDrn.g:2713:3: ( (lv_tempsCST_7_0= RULE_INT ) )
            // InternalDrn.g:2714:4: (lv_tempsCST_7_0= RULE_INT )
            {
            // InternalDrn.g:2714:4: (lv_tempsCST_7_0= RULE_INT )
            // InternalDrn.g:2715:5: lv_tempsCST_7_0= RULE_INT
            {
            lv_tempsCST_7_0=(Token)match(input,RULE_INT,FOLLOW_28); 

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

            otherlv_8=(Token)match(input,28,FOLLOW_2); 

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
    // InternalDrn.g:2739:1: entryRuleDepYZ_IMPL returns [EObject current=null] : iv_ruleDepYZ_IMPL= ruleDepYZ_IMPL EOF ;
    public final EObject entryRuleDepYZ_IMPL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDepYZ_IMPL = null;


        try {
            // InternalDrn.g:2739:51: (iv_ruleDepYZ_IMPL= ruleDepYZ_IMPL EOF )
            // InternalDrn.g:2740:2: iv_ruleDepYZ_IMPL= ruleDepYZ_IMPL EOF
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
    // InternalDrn.g:2746:1: ruleDepYZ_IMPL returns [EObject current=null] : (this_DepYZ_0= ruleDepYZ | this_CERCLEYZ_1= ruleCERCLEYZ | this_CARREYZ_2= ruleCARREYZ ) ;
    public final EObject ruleDepYZ_IMPL() throws RecognitionException {
        EObject current = null;

        EObject this_DepYZ_0 = null;

        EObject this_CERCLEYZ_1 = null;

        EObject this_CARREYZ_2 = null;



        	enterRule();

        try {
            // InternalDrn.g:2752:2: ( (this_DepYZ_0= ruleDepYZ | this_CERCLEYZ_1= ruleCERCLEYZ | this_CARREYZ_2= ruleCARREYZ ) )
            // InternalDrn.g:2753:2: (this_DepYZ_0= ruleDepYZ | this_CERCLEYZ_1= ruleCERCLEYZ | this_CARREYZ_2= ruleCARREYZ )
            {
            // InternalDrn.g:2753:2: (this_DepYZ_0= ruleDepYZ | this_CERCLEYZ_1= ruleCERCLEYZ | this_CARREYZ_2= ruleCARREYZ )
            int alt27=3;
            switch ( input.LA(1) ) {
            case 44:
                {
                alt27=1;
                }
                break;
            case 45:
                {
                alt27=2;
                }
                break;
            case 46:
                {
                alt27=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // InternalDrn.g:2754:3: this_DepYZ_0= ruleDepYZ
                    {

                    			newCompositeNode(grammarAccess.getDepYZ_IMPLAccess().getDepYZParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_DepYZ_0=ruleDepYZ();

                    state._fsp--;


                    			current = this_DepYZ_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDrn.g:2763:3: this_CERCLEYZ_1= ruleCERCLEYZ
                    {

                    			newCompositeNode(grammarAccess.getDepYZ_IMPLAccess().getCERCLEYZParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_CERCLEYZ_1=ruleCERCLEYZ();

                    state._fsp--;


                    			current = this_CERCLEYZ_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalDrn.g:2772:3: this_CARREYZ_2= ruleCARREYZ
                    {

                    			newCompositeNode(grammarAccess.getDepYZ_IMPLAccess().getCARREYZParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_CARREYZ_2=ruleCARREYZ();

                    state._fsp--;


                    			current = this_CARREYZ_2;
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


    // $ANTLR start "entryRuleDepYZ"
    // InternalDrn.g:2784:1: entryRuleDepYZ returns [EObject current=null] : iv_ruleDepYZ= ruleDepYZ EOF ;
    public final EObject entryRuleDepYZ() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDepYZ = null;


        try {
            // InternalDrn.g:2784:46: (iv_ruleDepYZ= ruleDepYZ EOF )
            // InternalDrn.g:2785:2: iv_ruleDepYZ= ruleDepYZ EOF
            {
             newCompositeNode(grammarAccess.getDepYZRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDepYZ=ruleDepYZ();

            state._fsp--;

             current =iv_ruleDepYZ; 
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
    // $ANTLR end "entryRuleDepYZ"


    // $ANTLR start "ruleDepYZ"
    // InternalDrn.g:2791:1: ruleDepYZ returns [EObject current=null] : ( ( (lv_name_0_0= 'depYZ' ) ) otherlv_1= '(' otherlv_2= 'distance' otherlv_3= '=' ( (lv_distanceCST_4_0= RULE_INT ) ) otherlv_5= 'temps' otherlv_6= '=' ( (lv_tempsCST_7_0= RULE_INT ) ) otherlv_8= ')' ) ;
    public final EObject ruleDepYZ() throws RecognitionException {
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
            // InternalDrn.g:2797:2: ( ( ( (lv_name_0_0= 'depYZ' ) ) otherlv_1= '(' otherlv_2= 'distance' otherlv_3= '=' ( (lv_distanceCST_4_0= RULE_INT ) ) otherlv_5= 'temps' otherlv_6= '=' ( (lv_tempsCST_7_0= RULE_INT ) ) otherlv_8= ')' ) )
            // InternalDrn.g:2798:2: ( ( (lv_name_0_0= 'depYZ' ) ) otherlv_1= '(' otherlv_2= 'distance' otherlv_3= '=' ( (lv_distanceCST_4_0= RULE_INT ) ) otherlv_5= 'temps' otherlv_6= '=' ( (lv_tempsCST_7_0= RULE_INT ) ) otherlv_8= ')' )
            {
            // InternalDrn.g:2798:2: ( ( (lv_name_0_0= 'depYZ' ) ) otherlv_1= '(' otherlv_2= 'distance' otherlv_3= '=' ( (lv_distanceCST_4_0= RULE_INT ) ) otherlv_5= 'temps' otherlv_6= '=' ( (lv_tempsCST_7_0= RULE_INT ) ) otherlv_8= ')' )
            // InternalDrn.g:2799:3: ( (lv_name_0_0= 'depYZ' ) ) otherlv_1= '(' otherlv_2= 'distance' otherlv_3= '=' ( (lv_distanceCST_4_0= RULE_INT ) ) otherlv_5= 'temps' otherlv_6= '=' ( (lv_tempsCST_7_0= RULE_INT ) ) otherlv_8= ')'
            {
            // InternalDrn.g:2799:3: ( (lv_name_0_0= 'depYZ' ) )
            // InternalDrn.g:2800:4: (lv_name_0_0= 'depYZ' )
            {
            // InternalDrn.g:2800:4: (lv_name_0_0= 'depYZ' )
            // InternalDrn.g:2801:5: lv_name_0_0= 'depYZ'
            {
            lv_name_0_0=(Token)match(input,44,FOLLOW_22); 

            					newLeafNode(lv_name_0_0, grammarAccess.getDepYZAccess().getNameDepYZKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDepYZRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "depYZ");
            				

            }


            }

            otherlv_1=(Token)match(input,26,FOLLOW_26); 

            			newLeafNode(otherlv_1, grammarAccess.getDepYZAccess().getLeftParenthesisKeyword_1());
            		
            otherlv_2=(Token)match(input,32,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getDepYZAccess().getDistanceKeyword_2());
            		
            otherlv_3=(Token)match(input,14,FOLLOW_13); 

            			newLeafNode(otherlv_3, grammarAccess.getDepYZAccess().getEqualsSignKeyword_3());
            		
            // InternalDrn.g:2825:3: ( (lv_distanceCST_4_0= RULE_INT ) )
            // InternalDrn.g:2826:4: (lv_distanceCST_4_0= RULE_INT )
            {
            // InternalDrn.g:2826:4: (lv_distanceCST_4_0= RULE_INT )
            // InternalDrn.g:2827:5: lv_distanceCST_4_0= RULE_INT
            {
            lv_distanceCST_4_0=(Token)match(input,RULE_INT,FOLLOW_27); 

            					newLeafNode(lv_distanceCST_4_0, grammarAccess.getDepYZAccess().getDistanceCSTINTTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDepYZRule());
            					}
            					setWithLastConsumed(
            						current,
            						"distanceCST",
            						lv_distanceCST_4_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_5=(Token)match(input,33,FOLLOW_6); 

            			newLeafNode(otherlv_5, grammarAccess.getDepYZAccess().getTempsKeyword_5());
            		
            otherlv_6=(Token)match(input,14,FOLLOW_13); 

            			newLeafNode(otherlv_6, grammarAccess.getDepYZAccess().getEqualsSignKeyword_6());
            		
            // InternalDrn.g:2851:3: ( (lv_tempsCST_7_0= RULE_INT ) )
            // InternalDrn.g:2852:4: (lv_tempsCST_7_0= RULE_INT )
            {
            // InternalDrn.g:2852:4: (lv_tempsCST_7_0= RULE_INT )
            // InternalDrn.g:2853:5: lv_tempsCST_7_0= RULE_INT
            {
            lv_tempsCST_7_0=(Token)match(input,RULE_INT,FOLLOW_28); 

            					newLeafNode(lv_tempsCST_7_0, grammarAccess.getDepYZAccess().getTempsCSTINTTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDepYZRule());
            					}
            					setWithLastConsumed(
            						current,
            						"tempsCST",
            						lv_tempsCST_7_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_8=(Token)match(input,28,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getDepYZAccess().getRightParenthesisKeyword_8());
            		

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
    // $ANTLR end "ruleDepYZ"


    // $ANTLR start "entryRuleCERCLEYZ"
    // InternalDrn.g:2877:1: entryRuleCERCLEYZ returns [EObject current=null] : iv_ruleCERCLEYZ= ruleCERCLEYZ EOF ;
    public final EObject entryRuleCERCLEYZ() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCERCLEYZ = null;


        try {
            // InternalDrn.g:2877:49: (iv_ruleCERCLEYZ= ruleCERCLEYZ EOF )
            // InternalDrn.g:2878:2: iv_ruleCERCLEYZ= ruleCERCLEYZ EOF
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
    // InternalDrn.g:2884:1: ruleCERCLEYZ returns [EObject current=null] : ( ( (lv_name_0_0= 'cercleYZ' ) ) otherlv_1= '(' otherlv_2= 'rayon' otherlv_3= '=' ( (lv_rayonCST_4_0= RULE_INT ) ) otherlv_5= 'temps' otherlv_6= '=' ( (lv_tempsCST_7_0= RULE_INT ) ) otherlv_8= ')' ) ;
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
            // InternalDrn.g:2890:2: ( ( ( (lv_name_0_0= 'cercleYZ' ) ) otherlv_1= '(' otherlv_2= 'rayon' otherlv_3= '=' ( (lv_rayonCST_4_0= RULE_INT ) ) otherlv_5= 'temps' otherlv_6= '=' ( (lv_tempsCST_7_0= RULE_INT ) ) otherlv_8= ')' ) )
            // InternalDrn.g:2891:2: ( ( (lv_name_0_0= 'cercleYZ' ) ) otherlv_1= '(' otherlv_2= 'rayon' otherlv_3= '=' ( (lv_rayonCST_4_0= RULE_INT ) ) otherlv_5= 'temps' otherlv_6= '=' ( (lv_tempsCST_7_0= RULE_INT ) ) otherlv_8= ')' )
            {
            // InternalDrn.g:2891:2: ( ( (lv_name_0_0= 'cercleYZ' ) ) otherlv_1= '(' otherlv_2= 'rayon' otherlv_3= '=' ( (lv_rayonCST_4_0= RULE_INT ) ) otherlv_5= 'temps' otherlv_6= '=' ( (lv_tempsCST_7_0= RULE_INT ) ) otherlv_8= ')' )
            // InternalDrn.g:2892:3: ( (lv_name_0_0= 'cercleYZ' ) ) otherlv_1= '(' otherlv_2= 'rayon' otherlv_3= '=' ( (lv_rayonCST_4_0= RULE_INT ) ) otherlv_5= 'temps' otherlv_6= '=' ( (lv_tempsCST_7_0= RULE_INT ) ) otherlv_8= ')'
            {
            // InternalDrn.g:2892:3: ( (lv_name_0_0= 'cercleYZ' ) )
            // InternalDrn.g:2893:4: (lv_name_0_0= 'cercleYZ' )
            {
            // InternalDrn.g:2893:4: (lv_name_0_0= 'cercleYZ' )
            // InternalDrn.g:2894:5: lv_name_0_0= 'cercleYZ'
            {
            lv_name_0_0=(Token)match(input,45,FOLLOW_22); 

            					newLeafNode(lv_name_0_0, grammarAccess.getCERCLEYZAccess().getNameCercleYZKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCERCLEYZRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "cercleYZ");
            				

            }


            }

            otherlv_1=(Token)match(input,26,FOLLOW_29); 

            			newLeafNode(otherlv_1, grammarAccess.getCERCLEYZAccess().getLeftParenthesisKeyword_1());
            		
            otherlv_2=(Token)match(input,41,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getCERCLEYZAccess().getRayonKeyword_2());
            		
            otherlv_3=(Token)match(input,14,FOLLOW_13); 

            			newLeafNode(otherlv_3, grammarAccess.getCERCLEYZAccess().getEqualsSignKeyword_3());
            		
            // InternalDrn.g:2918:3: ( (lv_rayonCST_4_0= RULE_INT ) )
            // InternalDrn.g:2919:4: (lv_rayonCST_4_0= RULE_INT )
            {
            // InternalDrn.g:2919:4: (lv_rayonCST_4_0= RULE_INT )
            // InternalDrn.g:2920:5: lv_rayonCST_4_0= RULE_INT
            {
            lv_rayonCST_4_0=(Token)match(input,RULE_INT,FOLLOW_27); 

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

            otherlv_5=(Token)match(input,33,FOLLOW_6); 

            			newLeafNode(otherlv_5, grammarAccess.getCERCLEYZAccess().getTempsKeyword_5());
            		
            otherlv_6=(Token)match(input,14,FOLLOW_13); 

            			newLeafNode(otherlv_6, grammarAccess.getCERCLEYZAccess().getEqualsSignKeyword_6());
            		
            // InternalDrn.g:2944:3: ( (lv_tempsCST_7_0= RULE_INT ) )
            // InternalDrn.g:2945:4: (lv_tempsCST_7_0= RULE_INT )
            {
            // InternalDrn.g:2945:4: (lv_tempsCST_7_0= RULE_INT )
            // InternalDrn.g:2946:5: lv_tempsCST_7_0= RULE_INT
            {
            lv_tempsCST_7_0=(Token)match(input,RULE_INT,FOLLOW_28); 

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

            otherlv_8=(Token)match(input,28,FOLLOW_2); 

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
    // InternalDrn.g:2970:1: entryRuleCARREYZ returns [EObject current=null] : iv_ruleCARREYZ= ruleCARREYZ EOF ;
    public final EObject entryRuleCARREYZ() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCARREYZ = null;


        try {
            // InternalDrn.g:2970:48: (iv_ruleCARREYZ= ruleCARREYZ EOF )
            // InternalDrn.g:2971:2: iv_ruleCARREYZ= ruleCARREYZ EOF
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
    // InternalDrn.g:2977:1: ruleCARREYZ returns [EObject current=null] : ( ( (lv_name_0_0= 'carreYZ' ) ) otherlv_1= '(' otherlv_2= 'cote' otherlv_3= '=' ( (lv_coteCST_4_0= RULE_INT ) ) otherlv_5= 'temps' otherlv_6= '=' ( (lv_tempsCST_7_0= RULE_INT ) ) otherlv_8= ')' ) ;
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
            // InternalDrn.g:2983:2: ( ( ( (lv_name_0_0= 'carreYZ' ) ) otherlv_1= '(' otherlv_2= 'cote' otherlv_3= '=' ( (lv_coteCST_4_0= RULE_INT ) ) otherlv_5= 'temps' otherlv_6= '=' ( (lv_tempsCST_7_0= RULE_INT ) ) otherlv_8= ')' ) )
            // InternalDrn.g:2984:2: ( ( (lv_name_0_0= 'carreYZ' ) ) otherlv_1= '(' otherlv_2= 'cote' otherlv_3= '=' ( (lv_coteCST_4_0= RULE_INT ) ) otherlv_5= 'temps' otherlv_6= '=' ( (lv_tempsCST_7_0= RULE_INT ) ) otherlv_8= ')' )
            {
            // InternalDrn.g:2984:2: ( ( (lv_name_0_0= 'carreYZ' ) ) otherlv_1= '(' otherlv_2= 'cote' otherlv_3= '=' ( (lv_coteCST_4_0= RULE_INT ) ) otherlv_5= 'temps' otherlv_6= '=' ( (lv_tempsCST_7_0= RULE_INT ) ) otherlv_8= ')' )
            // InternalDrn.g:2985:3: ( (lv_name_0_0= 'carreYZ' ) ) otherlv_1= '(' otherlv_2= 'cote' otherlv_3= '=' ( (lv_coteCST_4_0= RULE_INT ) ) otherlv_5= 'temps' otherlv_6= '=' ( (lv_tempsCST_7_0= RULE_INT ) ) otherlv_8= ')'
            {
            // InternalDrn.g:2985:3: ( (lv_name_0_0= 'carreYZ' ) )
            // InternalDrn.g:2986:4: (lv_name_0_0= 'carreYZ' )
            {
            // InternalDrn.g:2986:4: (lv_name_0_0= 'carreYZ' )
            // InternalDrn.g:2987:5: lv_name_0_0= 'carreYZ'
            {
            lv_name_0_0=(Token)match(input,46,FOLLOW_22); 

            					newLeafNode(lv_name_0_0, grammarAccess.getCARREYZAccess().getNameCarreYZKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCARREYZRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "carreYZ");
            				

            }


            }

            otherlv_1=(Token)match(input,26,FOLLOW_30); 

            			newLeafNode(otherlv_1, grammarAccess.getCARREYZAccess().getLeftParenthesisKeyword_1());
            		
            otherlv_2=(Token)match(input,43,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getCARREYZAccess().getCoteKeyword_2());
            		
            otherlv_3=(Token)match(input,14,FOLLOW_13); 

            			newLeafNode(otherlv_3, grammarAccess.getCARREYZAccess().getEqualsSignKeyword_3());
            		
            // InternalDrn.g:3011:3: ( (lv_coteCST_4_0= RULE_INT ) )
            // InternalDrn.g:3012:4: (lv_coteCST_4_0= RULE_INT )
            {
            // InternalDrn.g:3012:4: (lv_coteCST_4_0= RULE_INT )
            // InternalDrn.g:3013:5: lv_coteCST_4_0= RULE_INT
            {
            lv_coteCST_4_0=(Token)match(input,RULE_INT,FOLLOW_27); 

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

            otherlv_5=(Token)match(input,33,FOLLOW_6); 

            			newLeafNode(otherlv_5, grammarAccess.getCARREYZAccess().getTempsKeyword_5());
            		
            otherlv_6=(Token)match(input,14,FOLLOW_13); 

            			newLeafNode(otherlv_6, grammarAccess.getCARREYZAccess().getEqualsSignKeyword_6());
            		
            // InternalDrn.g:3037:3: ( (lv_tempsCST_7_0= RULE_INT ) )
            // InternalDrn.g:3038:4: (lv_tempsCST_7_0= RULE_INT )
            {
            // InternalDrn.g:3038:4: (lv_tempsCST_7_0= RULE_INT )
            // InternalDrn.g:3039:5: lv_tempsCST_7_0= RULE_INT
            {
            lv_tempsCST_7_0=(Token)match(input,RULE_INT,FOLLOW_28); 

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

            otherlv_8=(Token)match(input,28,FOLLOW_2); 

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
    // InternalDrn.g:3063:1: entryRuleDepXZ_IMPL returns [EObject current=null] : iv_ruleDepXZ_IMPL= ruleDepXZ_IMPL EOF ;
    public final EObject entryRuleDepXZ_IMPL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDepXZ_IMPL = null;


        try {
            // InternalDrn.g:3063:51: (iv_ruleDepXZ_IMPL= ruleDepXZ_IMPL EOF )
            // InternalDrn.g:3064:2: iv_ruleDepXZ_IMPL= ruleDepXZ_IMPL EOF
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
    // InternalDrn.g:3070:1: ruleDepXZ_IMPL returns [EObject current=null] : this_DepXZ_0= ruleDepXZ ;
    public final EObject ruleDepXZ_IMPL() throws RecognitionException {
        EObject current = null;

        EObject this_DepXZ_0 = null;



        	enterRule();

        try {
            // InternalDrn.g:3076:2: (this_DepXZ_0= ruleDepXZ )
            // InternalDrn.g:3077:2: this_DepXZ_0= ruleDepXZ
            {

            		newCompositeNode(grammarAccess.getDepXZ_IMPLAccess().getDepXZParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_DepXZ_0=ruleDepXZ();

            state._fsp--;


            		current = this_DepXZ_0;
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
    // $ANTLR end "ruleDepXZ_IMPL"


    // $ANTLR start "entryRuleDepXZ"
    // InternalDrn.g:3088:1: entryRuleDepXZ returns [EObject current=null] : iv_ruleDepXZ= ruleDepXZ EOF ;
    public final EObject entryRuleDepXZ() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDepXZ = null;


        try {
            // InternalDrn.g:3088:46: (iv_ruleDepXZ= ruleDepXZ EOF )
            // InternalDrn.g:3089:2: iv_ruleDepXZ= ruleDepXZ EOF
            {
             newCompositeNode(grammarAccess.getDepXZRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDepXZ=ruleDepXZ();

            state._fsp--;

             current =iv_ruleDepXZ; 
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
    // $ANTLR end "entryRuleDepXZ"


    // $ANTLR start "ruleDepXZ"
    // InternalDrn.g:3095:1: ruleDepXZ returns [EObject current=null] : ( ( (lv_name_0_0= 'depXZ' ) ) otherlv_1= '(' otherlv_2= 'distance' otherlv_3= '=' ( (lv_distanceCST_4_0= RULE_INT ) ) otherlv_5= 'temps' otherlv_6= '=' ( (lv_tempsCST_7_0= RULE_INT ) ) otherlv_8= ')' ) ;
    public final EObject ruleDepXZ() throws RecognitionException {
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
            // InternalDrn.g:3101:2: ( ( ( (lv_name_0_0= 'depXZ' ) ) otherlv_1= '(' otherlv_2= 'distance' otherlv_3= '=' ( (lv_distanceCST_4_0= RULE_INT ) ) otherlv_5= 'temps' otherlv_6= '=' ( (lv_tempsCST_7_0= RULE_INT ) ) otherlv_8= ')' ) )
            // InternalDrn.g:3102:2: ( ( (lv_name_0_0= 'depXZ' ) ) otherlv_1= '(' otherlv_2= 'distance' otherlv_3= '=' ( (lv_distanceCST_4_0= RULE_INT ) ) otherlv_5= 'temps' otherlv_6= '=' ( (lv_tempsCST_7_0= RULE_INT ) ) otherlv_8= ')' )
            {
            // InternalDrn.g:3102:2: ( ( (lv_name_0_0= 'depXZ' ) ) otherlv_1= '(' otherlv_2= 'distance' otherlv_3= '=' ( (lv_distanceCST_4_0= RULE_INT ) ) otherlv_5= 'temps' otherlv_6= '=' ( (lv_tempsCST_7_0= RULE_INT ) ) otherlv_8= ')' )
            // InternalDrn.g:3103:3: ( (lv_name_0_0= 'depXZ' ) ) otherlv_1= '(' otherlv_2= 'distance' otherlv_3= '=' ( (lv_distanceCST_4_0= RULE_INT ) ) otherlv_5= 'temps' otherlv_6= '=' ( (lv_tempsCST_7_0= RULE_INT ) ) otherlv_8= ')'
            {
            // InternalDrn.g:3103:3: ( (lv_name_0_0= 'depXZ' ) )
            // InternalDrn.g:3104:4: (lv_name_0_0= 'depXZ' )
            {
            // InternalDrn.g:3104:4: (lv_name_0_0= 'depXZ' )
            // InternalDrn.g:3105:5: lv_name_0_0= 'depXZ'
            {
            lv_name_0_0=(Token)match(input,47,FOLLOW_22); 

            					newLeafNode(lv_name_0_0, grammarAccess.getDepXZAccess().getNameDepXZKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDepXZRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "depXZ");
            				

            }


            }

            otherlv_1=(Token)match(input,26,FOLLOW_26); 

            			newLeafNode(otherlv_1, grammarAccess.getDepXZAccess().getLeftParenthesisKeyword_1());
            		
            otherlv_2=(Token)match(input,32,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getDepXZAccess().getDistanceKeyword_2());
            		
            otherlv_3=(Token)match(input,14,FOLLOW_13); 

            			newLeafNode(otherlv_3, grammarAccess.getDepXZAccess().getEqualsSignKeyword_3());
            		
            // InternalDrn.g:3129:3: ( (lv_distanceCST_4_0= RULE_INT ) )
            // InternalDrn.g:3130:4: (lv_distanceCST_4_0= RULE_INT )
            {
            // InternalDrn.g:3130:4: (lv_distanceCST_4_0= RULE_INT )
            // InternalDrn.g:3131:5: lv_distanceCST_4_0= RULE_INT
            {
            lv_distanceCST_4_0=(Token)match(input,RULE_INT,FOLLOW_27); 

            					newLeafNode(lv_distanceCST_4_0, grammarAccess.getDepXZAccess().getDistanceCSTINTTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDepXZRule());
            					}
            					setWithLastConsumed(
            						current,
            						"distanceCST",
            						lv_distanceCST_4_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_5=(Token)match(input,33,FOLLOW_6); 

            			newLeafNode(otherlv_5, grammarAccess.getDepXZAccess().getTempsKeyword_5());
            		
            otherlv_6=(Token)match(input,14,FOLLOW_13); 

            			newLeafNode(otherlv_6, grammarAccess.getDepXZAccess().getEqualsSignKeyword_6());
            		
            // InternalDrn.g:3155:3: ( (lv_tempsCST_7_0= RULE_INT ) )
            // InternalDrn.g:3156:4: (lv_tempsCST_7_0= RULE_INT )
            {
            // InternalDrn.g:3156:4: (lv_tempsCST_7_0= RULE_INT )
            // InternalDrn.g:3157:5: lv_tempsCST_7_0= RULE_INT
            {
            lv_tempsCST_7_0=(Token)match(input,RULE_INT,FOLLOW_28); 

            					newLeafNode(lv_tempsCST_7_0, grammarAccess.getDepXZAccess().getTempsCSTINTTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDepXZRule());
            					}
            					setWithLastConsumed(
            						current,
            						"tempsCST",
            						lv_tempsCST_7_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_8=(Token)match(input,28,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getDepXZAccess().getRightParenthesisKeyword_8());
            		

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
    // $ANTLR end "ruleDepXZ"


    // $ANTLR start "entryRuleDepXYZ_IMPL"
    // InternalDrn.g:3181:1: entryRuleDepXYZ_IMPL returns [EObject current=null] : iv_ruleDepXYZ_IMPL= ruleDepXYZ_IMPL EOF ;
    public final EObject entryRuleDepXYZ_IMPL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDepXYZ_IMPL = null;


        try {
            // InternalDrn.g:3181:52: (iv_ruleDepXYZ_IMPL= ruleDepXYZ_IMPL EOF )
            // InternalDrn.g:3182:2: iv_ruleDepXYZ_IMPL= ruleDepXYZ_IMPL EOF
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
    // InternalDrn.g:3188:1: ruleDepXYZ_IMPL returns [EObject current=null] : (this_DepXYZ_0= ruleDepXYZ | this_Flip_1= ruleFlip ) ;
    public final EObject ruleDepXYZ_IMPL() throws RecognitionException {
        EObject current = null;

        EObject this_DepXYZ_0 = null;

        EObject this_Flip_1 = null;



        	enterRule();

        try {
            // InternalDrn.g:3194:2: ( (this_DepXYZ_0= ruleDepXYZ | this_Flip_1= ruleFlip ) )
            // InternalDrn.g:3195:2: (this_DepXYZ_0= ruleDepXYZ | this_Flip_1= ruleFlip )
            {
            // InternalDrn.g:3195:2: (this_DepXYZ_0= ruleDepXYZ | this_Flip_1= ruleFlip )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==48) ) {
                alt28=1;
            }
            else if ( (LA28_0==49) ) {
                alt28=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // InternalDrn.g:3196:3: this_DepXYZ_0= ruleDepXYZ
                    {

                    			newCompositeNode(grammarAccess.getDepXYZ_IMPLAccess().getDepXYZParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_DepXYZ_0=ruleDepXYZ();

                    state._fsp--;


                    			current = this_DepXYZ_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDrn.g:3205:3: this_Flip_1= ruleFlip
                    {

                    			newCompositeNode(grammarAccess.getDepXYZ_IMPLAccess().getFlipParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Flip_1=ruleFlip();

                    state._fsp--;


                    			current = this_Flip_1;
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
    // $ANTLR end "ruleDepXYZ_IMPL"


    // $ANTLR start "entryRuleDepXYZ"
    // InternalDrn.g:3217:1: entryRuleDepXYZ returns [EObject current=null] : iv_ruleDepXYZ= ruleDepXYZ EOF ;
    public final EObject entryRuleDepXYZ() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDepXYZ = null;


        try {
            // InternalDrn.g:3217:47: (iv_ruleDepXYZ= ruleDepXYZ EOF )
            // InternalDrn.g:3218:2: iv_ruleDepXYZ= ruleDepXYZ EOF
            {
             newCompositeNode(grammarAccess.getDepXYZRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDepXYZ=ruleDepXYZ();

            state._fsp--;

             current =iv_ruleDepXYZ; 
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
    // $ANTLR end "entryRuleDepXYZ"


    // $ANTLR start "ruleDepXYZ"
    // InternalDrn.g:3224:1: ruleDepXYZ returns [EObject current=null] : ( ( (lv_name_0_0= 'depXYZ' ) ) otherlv_1= '(' otherlv_2= 'distance' otherlv_3= '=' ( (lv_distanceCST_4_0= RULE_INT ) ) otherlv_5= 'temps' otherlv_6= '=' ( (lv_tempsCST_7_0= RULE_INT ) ) otherlv_8= ')' ) ;
    public final EObject ruleDepXYZ() throws RecognitionException {
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
            // InternalDrn.g:3230:2: ( ( ( (lv_name_0_0= 'depXYZ' ) ) otherlv_1= '(' otherlv_2= 'distance' otherlv_3= '=' ( (lv_distanceCST_4_0= RULE_INT ) ) otherlv_5= 'temps' otherlv_6= '=' ( (lv_tempsCST_7_0= RULE_INT ) ) otherlv_8= ')' ) )
            // InternalDrn.g:3231:2: ( ( (lv_name_0_0= 'depXYZ' ) ) otherlv_1= '(' otherlv_2= 'distance' otherlv_3= '=' ( (lv_distanceCST_4_0= RULE_INT ) ) otherlv_5= 'temps' otherlv_6= '=' ( (lv_tempsCST_7_0= RULE_INT ) ) otherlv_8= ')' )
            {
            // InternalDrn.g:3231:2: ( ( (lv_name_0_0= 'depXYZ' ) ) otherlv_1= '(' otherlv_2= 'distance' otherlv_3= '=' ( (lv_distanceCST_4_0= RULE_INT ) ) otherlv_5= 'temps' otherlv_6= '=' ( (lv_tempsCST_7_0= RULE_INT ) ) otherlv_8= ')' )
            // InternalDrn.g:3232:3: ( (lv_name_0_0= 'depXYZ' ) ) otherlv_1= '(' otherlv_2= 'distance' otherlv_3= '=' ( (lv_distanceCST_4_0= RULE_INT ) ) otherlv_5= 'temps' otherlv_6= '=' ( (lv_tempsCST_7_0= RULE_INT ) ) otherlv_8= ')'
            {
            // InternalDrn.g:3232:3: ( (lv_name_0_0= 'depXYZ' ) )
            // InternalDrn.g:3233:4: (lv_name_0_0= 'depXYZ' )
            {
            // InternalDrn.g:3233:4: (lv_name_0_0= 'depXYZ' )
            // InternalDrn.g:3234:5: lv_name_0_0= 'depXYZ'
            {
            lv_name_0_0=(Token)match(input,48,FOLLOW_22); 

            					newLeafNode(lv_name_0_0, grammarAccess.getDepXYZAccess().getNameDepXYZKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDepXYZRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "depXYZ");
            				

            }


            }

            otherlv_1=(Token)match(input,26,FOLLOW_26); 

            			newLeafNode(otherlv_1, grammarAccess.getDepXYZAccess().getLeftParenthesisKeyword_1());
            		
            otherlv_2=(Token)match(input,32,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getDepXYZAccess().getDistanceKeyword_2());
            		
            otherlv_3=(Token)match(input,14,FOLLOW_13); 

            			newLeafNode(otherlv_3, grammarAccess.getDepXYZAccess().getEqualsSignKeyword_3());
            		
            // InternalDrn.g:3258:3: ( (lv_distanceCST_4_0= RULE_INT ) )
            // InternalDrn.g:3259:4: (lv_distanceCST_4_0= RULE_INT )
            {
            // InternalDrn.g:3259:4: (lv_distanceCST_4_0= RULE_INT )
            // InternalDrn.g:3260:5: lv_distanceCST_4_0= RULE_INT
            {
            lv_distanceCST_4_0=(Token)match(input,RULE_INT,FOLLOW_27); 

            					newLeafNode(lv_distanceCST_4_0, grammarAccess.getDepXYZAccess().getDistanceCSTINTTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDepXYZRule());
            					}
            					setWithLastConsumed(
            						current,
            						"distanceCST",
            						lv_distanceCST_4_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_5=(Token)match(input,33,FOLLOW_6); 

            			newLeafNode(otherlv_5, grammarAccess.getDepXYZAccess().getTempsKeyword_5());
            		
            otherlv_6=(Token)match(input,14,FOLLOW_13); 

            			newLeafNode(otherlv_6, grammarAccess.getDepXYZAccess().getEqualsSignKeyword_6());
            		
            // InternalDrn.g:3284:3: ( (lv_tempsCST_7_0= RULE_INT ) )
            // InternalDrn.g:3285:4: (lv_tempsCST_7_0= RULE_INT )
            {
            // InternalDrn.g:3285:4: (lv_tempsCST_7_0= RULE_INT )
            // InternalDrn.g:3286:5: lv_tempsCST_7_0= RULE_INT
            {
            lv_tempsCST_7_0=(Token)match(input,RULE_INT,FOLLOW_28); 

            					newLeafNode(lv_tempsCST_7_0, grammarAccess.getDepXYZAccess().getTempsCSTINTTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDepXYZRule());
            					}
            					setWithLastConsumed(
            						current,
            						"tempsCST",
            						lv_tempsCST_7_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_8=(Token)match(input,28,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getDepXYZAccess().getRightParenthesisKeyword_8());
            		

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
    // $ANTLR end "ruleDepXYZ"


    // $ANTLR start "entryRuleFlip"
    // InternalDrn.g:3310:1: entryRuleFlip returns [EObject current=null] : iv_ruleFlip= ruleFlip EOF ;
    public final EObject entryRuleFlip() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFlip = null;


        try {
            // InternalDrn.g:3310:45: (iv_ruleFlip= ruleFlip EOF )
            // InternalDrn.g:3311:2: iv_ruleFlip= ruleFlip EOF
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
    // InternalDrn.g:3317:1: ruleFlip returns [EObject current=null] : ( ( (lv_name_0_0= 'flip' ) ) otherlv_1= '(' otherlv_2= ')' ) ;
    public final EObject ruleFlip() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalDrn.g:3323:2: ( ( ( (lv_name_0_0= 'flip' ) ) otherlv_1= '(' otherlv_2= ')' ) )
            // InternalDrn.g:3324:2: ( ( (lv_name_0_0= 'flip' ) ) otherlv_1= '(' otherlv_2= ')' )
            {
            // InternalDrn.g:3324:2: ( ( (lv_name_0_0= 'flip' ) ) otherlv_1= '(' otherlv_2= ')' )
            // InternalDrn.g:3325:3: ( (lv_name_0_0= 'flip' ) ) otherlv_1= '(' otherlv_2= ')'
            {
            // InternalDrn.g:3325:3: ( (lv_name_0_0= 'flip' ) )
            // InternalDrn.g:3326:4: (lv_name_0_0= 'flip' )
            {
            // InternalDrn.g:3326:4: (lv_name_0_0= 'flip' )
            // InternalDrn.g:3327:5: lv_name_0_0= 'flip'
            {
            lv_name_0_0=(Token)match(input,49,FOLLOW_22); 

            					newLeafNode(lv_name_0_0, grammarAccess.getFlipAccess().getNameFlipKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFlipRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "flip");
            				

            }


            }

            otherlv_1=(Token)match(input,26,FOLLOW_28); 

            			newLeafNode(otherlv_1, grammarAccess.getFlipAccess().getLeftParenthesisKeyword_1());
            		
            otherlv_2=(Token)match(input,28,FOLLOW_2); 

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
    // InternalDrn.g:3351:1: entryRuleRotate returns [EObject current=null] : iv_ruleRotate= ruleRotate EOF ;
    public final EObject entryRuleRotate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRotate = null;


        try {
            // InternalDrn.g:3351:47: (iv_ruleRotate= ruleRotate EOF )
            // InternalDrn.g:3352:2: iv_ruleRotate= ruleRotate EOF
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
    // InternalDrn.g:3358:1: ruleRotate returns [EObject current=null] : ( ( (lv_name_0_0= 'rotate' ) ) otherlv_1= '(' otherlv_2= 'angle' otherlv_3= '=' ( (lv_angleCST_4_0= ruleEInt ) ) otherlv_5= 'temps' otherlv_6= '=' ( (lv_tempsCST_7_0= RULE_INT ) ) otherlv_8= ')' ) ;
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
            // InternalDrn.g:3364:2: ( ( ( (lv_name_0_0= 'rotate' ) ) otherlv_1= '(' otherlv_2= 'angle' otherlv_3= '=' ( (lv_angleCST_4_0= ruleEInt ) ) otherlv_5= 'temps' otherlv_6= '=' ( (lv_tempsCST_7_0= RULE_INT ) ) otherlv_8= ')' ) )
            // InternalDrn.g:3365:2: ( ( (lv_name_0_0= 'rotate' ) ) otherlv_1= '(' otherlv_2= 'angle' otherlv_3= '=' ( (lv_angleCST_4_0= ruleEInt ) ) otherlv_5= 'temps' otherlv_6= '=' ( (lv_tempsCST_7_0= RULE_INT ) ) otherlv_8= ')' )
            {
            // InternalDrn.g:3365:2: ( ( (lv_name_0_0= 'rotate' ) ) otherlv_1= '(' otherlv_2= 'angle' otherlv_3= '=' ( (lv_angleCST_4_0= ruleEInt ) ) otherlv_5= 'temps' otherlv_6= '=' ( (lv_tempsCST_7_0= RULE_INT ) ) otherlv_8= ')' )
            // InternalDrn.g:3366:3: ( (lv_name_0_0= 'rotate' ) ) otherlv_1= '(' otherlv_2= 'angle' otherlv_3= '=' ( (lv_angleCST_4_0= ruleEInt ) ) otherlv_5= 'temps' otherlv_6= '=' ( (lv_tempsCST_7_0= RULE_INT ) ) otherlv_8= ')'
            {
            // InternalDrn.g:3366:3: ( (lv_name_0_0= 'rotate' ) )
            // InternalDrn.g:3367:4: (lv_name_0_0= 'rotate' )
            {
            // InternalDrn.g:3367:4: (lv_name_0_0= 'rotate' )
            // InternalDrn.g:3368:5: lv_name_0_0= 'rotate'
            {
            lv_name_0_0=(Token)match(input,50,FOLLOW_22); 

            					newLeafNode(lv_name_0_0, grammarAccess.getRotateAccess().getNameRotateKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRotateRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "rotate");
            				

            }


            }

            otherlv_1=(Token)match(input,26,FOLLOW_31); 

            			newLeafNode(otherlv_1, grammarAccess.getRotateAccess().getLeftParenthesisKeyword_1());
            		
            otherlv_2=(Token)match(input,51,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getRotateAccess().getAngleKeyword_2());
            		
            otherlv_3=(Token)match(input,14,FOLLOW_32); 

            			newLeafNode(otherlv_3, grammarAccess.getRotateAccess().getEqualsSignKeyword_3());
            		
            // InternalDrn.g:3392:3: ( (lv_angleCST_4_0= ruleEInt ) )
            // InternalDrn.g:3393:4: (lv_angleCST_4_0= ruleEInt )
            {
            // InternalDrn.g:3393:4: (lv_angleCST_4_0= ruleEInt )
            // InternalDrn.g:3394:5: lv_angleCST_4_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getRotateAccess().getAngleCSTEIntParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_27);
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

            otherlv_5=(Token)match(input,33,FOLLOW_6); 

            			newLeafNode(otherlv_5, grammarAccess.getRotateAccess().getTempsKeyword_5());
            		
            otherlv_6=(Token)match(input,14,FOLLOW_13); 

            			newLeafNode(otherlv_6, grammarAccess.getRotateAccess().getEqualsSignKeyword_6());
            		
            // InternalDrn.g:3419:3: ( (lv_tempsCST_7_0= RULE_INT ) )
            // InternalDrn.g:3420:4: (lv_tempsCST_7_0= RULE_INT )
            {
            // InternalDrn.g:3420:4: (lv_tempsCST_7_0= RULE_INT )
            // InternalDrn.g:3421:5: lv_tempsCST_7_0= RULE_INT
            {
            lv_tempsCST_7_0=(Token)match(input,RULE_INT,FOLLOW_28); 

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

            otherlv_8=(Token)match(input,28,FOLLOW_2); 

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
    // InternalDrn.g:3445:1: entryRuleWait returns [EObject current=null] : iv_ruleWait= ruleWait EOF ;
    public final EObject entryRuleWait() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWait = null;


        try {
            // InternalDrn.g:3445:45: (iv_ruleWait= ruleWait EOF )
            // InternalDrn.g:3446:2: iv_ruleWait= ruleWait EOF
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
    // InternalDrn.g:3452:1: ruleWait returns [EObject current=null] : ( ( (lv_name_0_0= 'wait' ) ) otherlv_1= '(' otherlv_2= 'temps' otherlv_3= '=' ( (lv_tempsCST_4_0= RULE_INT ) ) otherlv_5= ')' ) ;
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
            // InternalDrn.g:3458:2: ( ( ( (lv_name_0_0= 'wait' ) ) otherlv_1= '(' otherlv_2= 'temps' otherlv_3= '=' ( (lv_tempsCST_4_0= RULE_INT ) ) otherlv_5= ')' ) )
            // InternalDrn.g:3459:2: ( ( (lv_name_0_0= 'wait' ) ) otherlv_1= '(' otherlv_2= 'temps' otherlv_3= '=' ( (lv_tempsCST_4_0= RULE_INT ) ) otherlv_5= ')' )
            {
            // InternalDrn.g:3459:2: ( ( (lv_name_0_0= 'wait' ) ) otherlv_1= '(' otherlv_2= 'temps' otherlv_3= '=' ( (lv_tempsCST_4_0= RULE_INT ) ) otherlv_5= ')' )
            // InternalDrn.g:3460:3: ( (lv_name_0_0= 'wait' ) ) otherlv_1= '(' otherlv_2= 'temps' otherlv_3= '=' ( (lv_tempsCST_4_0= RULE_INT ) ) otherlv_5= ')'
            {
            // InternalDrn.g:3460:3: ( (lv_name_0_0= 'wait' ) )
            // InternalDrn.g:3461:4: (lv_name_0_0= 'wait' )
            {
            // InternalDrn.g:3461:4: (lv_name_0_0= 'wait' )
            // InternalDrn.g:3462:5: lv_name_0_0= 'wait'
            {
            lv_name_0_0=(Token)match(input,52,FOLLOW_22); 

            					newLeafNode(lv_name_0_0, grammarAccess.getWaitAccess().getNameWaitKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getWaitRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "wait");
            				

            }


            }

            otherlv_1=(Token)match(input,26,FOLLOW_27); 

            			newLeafNode(otherlv_1, grammarAccess.getWaitAccess().getLeftParenthesisKeyword_1());
            		
            otherlv_2=(Token)match(input,33,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getWaitAccess().getTempsKeyword_2());
            		
            otherlv_3=(Token)match(input,14,FOLLOW_13); 

            			newLeafNode(otherlv_3, grammarAccess.getWaitAccess().getEqualsSignKeyword_3());
            		
            // InternalDrn.g:3486:3: ( (lv_tempsCST_4_0= RULE_INT ) )
            // InternalDrn.g:3487:4: (lv_tempsCST_4_0= RULE_INT )
            {
            // InternalDrn.g:3487:4: (lv_tempsCST_4_0= RULE_INT )
            // InternalDrn.g:3488:5: lv_tempsCST_4_0= RULE_INT
            {
            lv_tempsCST_4_0=(Token)match(input,RULE_INT,FOLLOW_28); 

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

            otherlv_5=(Token)match(input,28,FOLLOW_2); 

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
    // InternalDrn.g:3512:1: entryRuleTakeOff returns [EObject current=null] : iv_ruleTakeOff= ruleTakeOff EOF ;
    public final EObject entryRuleTakeOff() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTakeOff = null;


        try {
            // InternalDrn.g:3512:48: (iv_ruleTakeOff= ruleTakeOff EOF )
            // InternalDrn.g:3513:2: iv_ruleTakeOff= ruleTakeOff EOF
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
    // InternalDrn.g:3519:1: ruleTakeOff returns [EObject current=null] : ( ( (lv_name_0_0= 'takeoff' ) ) otherlv_1= '(' otherlv_2= ')' ) ;
    public final EObject ruleTakeOff() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalDrn.g:3525:2: ( ( ( (lv_name_0_0= 'takeoff' ) ) otherlv_1= '(' otherlv_2= ')' ) )
            // InternalDrn.g:3526:2: ( ( (lv_name_0_0= 'takeoff' ) ) otherlv_1= '(' otherlv_2= ')' )
            {
            // InternalDrn.g:3526:2: ( ( (lv_name_0_0= 'takeoff' ) ) otherlv_1= '(' otherlv_2= ')' )
            // InternalDrn.g:3527:3: ( (lv_name_0_0= 'takeoff' ) ) otherlv_1= '(' otherlv_2= ')'
            {
            // InternalDrn.g:3527:3: ( (lv_name_0_0= 'takeoff' ) )
            // InternalDrn.g:3528:4: (lv_name_0_0= 'takeoff' )
            {
            // InternalDrn.g:3528:4: (lv_name_0_0= 'takeoff' )
            // InternalDrn.g:3529:5: lv_name_0_0= 'takeoff'
            {
            lv_name_0_0=(Token)match(input,53,FOLLOW_22); 

            					newLeafNode(lv_name_0_0, grammarAccess.getTakeOffAccess().getNameTakeoffKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTakeOffRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "takeoff");
            				

            }


            }

            otherlv_1=(Token)match(input,26,FOLLOW_28); 

            			newLeafNode(otherlv_1, grammarAccess.getTakeOffAccess().getLeftParenthesisKeyword_1());
            		
            otherlv_2=(Token)match(input,28,FOLLOW_2); 

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
    // InternalDrn.g:3553:1: entryRuleLand returns [EObject current=null] : iv_ruleLand= ruleLand EOF ;
    public final EObject entryRuleLand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLand = null;


        try {
            // InternalDrn.g:3553:45: (iv_ruleLand= ruleLand EOF )
            // InternalDrn.g:3554:2: iv_ruleLand= ruleLand EOF
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
    // InternalDrn.g:3560:1: ruleLand returns [EObject current=null] : ( ( (lv_name_0_0= 'land' ) ) otherlv_1= '(' otherlv_2= ')' ) ;
    public final EObject ruleLand() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalDrn.g:3566:2: ( ( ( (lv_name_0_0= 'land' ) ) otherlv_1= '(' otherlv_2= ')' ) )
            // InternalDrn.g:3567:2: ( ( (lv_name_0_0= 'land' ) ) otherlv_1= '(' otherlv_2= ')' )
            {
            // InternalDrn.g:3567:2: ( ( (lv_name_0_0= 'land' ) ) otherlv_1= '(' otherlv_2= ')' )
            // InternalDrn.g:3568:3: ( (lv_name_0_0= 'land' ) ) otherlv_1= '(' otherlv_2= ')'
            {
            // InternalDrn.g:3568:3: ( (lv_name_0_0= 'land' ) )
            // InternalDrn.g:3569:4: (lv_name_0_0= 'land' )
            {
            // InternalDrn.g:3569:4: (lv_name_0_0= 'land' )
            // InternalDrn.g:3570:5: lv_name_0_0= 'land'
            {
            lv_name_0_0=(Token)match(input,54,FOLLOW_22); 

            					newLeafNode(lv_name_0_0, grammarAccess.getLandAccess().getNameLandKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLandRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "land");
            				

            }


            }

            otherlv_1=(Token)match(input,26,FOLLOW_28); 

            			newLeafNode(otherlv_1, grammarAccess.getLandAccess().getLeftParenthesisKeyword_1());
            		
            otherlv_2=(Token)match(input,28,FOLLOW_2); 

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
    // InternalDrn.g:3594:1: entryRuleDevice returns [EObject current=null] : iv_ruleDevice= ruleDevice EOF ;
    public final EObject entryRuleDevice() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDevice = null;


        try {
            // InternalDrn.g:3594:47: (iv_ruleDevice= ruleDevice EOF )
            // InternalDrn.g:3595:2: iv_ruleDevice= ruleDevice EOF
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
    // InternalDrn.g:3601:1: ruleDevice returns [EObject current=null] : (otherlv_0= 'DEVICE' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_declarations_3_0= ruleDeclaration ) ) (otherlv_4= ';' ( (lv_declarations_5_0= ruleDeclaration ) ) )* otherlv_6= '}' ) ;
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
            // InternalDrn.g:3607:2: ( (otherlv_0= 'DEVICE' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_declarations_3_0= ruleDeclaration ) ) (otherlv_4= ';' ( (lv_declarations_5_0= ruleDeclaration ) ) )* otherlv_6= '}' ) )
            // InternalDrn.g:3608:2: (otherlv_0= 'DEVICE' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_declarations_3_0= ruleDeclaration ) ) (otherlv_4= ';' ( (lv_declarations_5_0= ruleDeclaration ) ) )* otherlv_6= '}' )
            {
            // InternalDrn.g:3608:2: (otherlv_0= 'DEVICE' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_declarations_3_0= ruleDeclaration ) ) (otherlv_4= ';' ( (lv_declarations_5_0= ruleDeclaration ) ) )* otherlv_6= '}' )
            // InternalDrn.g:3609:3: otherlv_0= 'DEVICE' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_declarations_3_0= ruleDeclaration ) ) (otherlv_4= ';' ( (lv_declarations_5_0= ruleDeclaration ) ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,55,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getDeviceAccess().getDEVICEKeyword_0());
            		
            // InternalDrn.g:3613:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDrn.g:3614:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDrn.g:3614:4: (lv_name_1_0= RULE_ID )
            // InternalDrn.g:3615:5: lv_name_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,12,FOLLOW_33); 

            			newLeafNode(otherlv_2, grammarAccess.getDeviceAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalDrn.g:3635:3: ( (lv_declarations_3_0= ruleDeclaration ) )
            // InternalDrn.g:3636:4: (lv_declarations_3_0= ruleDeclaration )
            {
            // InternalDrn.g:3636:4: (lv_declarations_3_0= ruleDeclaration )
            // InternalDrn.g:3637:5: lv_declarations_3_0= ruleDeclaration
            {

            					newCompositeNode(grammarAccess.getDeviceAccess().getDeclarationsDeclarationParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_34);
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

            // InternalDrn.g:3654:3: (otherlv_4= ';' ( (lv_declarations_5_0= ruleDeclaration ) ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==15) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalDrn.g:3655:4: otherlv_4= ';' ( (lv_declarations_5_0= ruleDeclaration ) )
            	    {
            	    otherlv_4=(Token)match(input,15,FOLLOW_33); 

            	    				newLeafNode(otherlv_4, grammarAccess.getDeviceAccess().getSemicolonKeyword_4_0());
            	    			
            	    // InternalDrn.g:3659:4: ( (lv_declarations_5_0= ruleDeclaration ) )
            	    // InternalDrn.g:3660:5: (lv_declarations_5_0= ruleDeclaration )
            	    {
            	    // InternalDrn.g:3660:5: (lv_declarations_5_0= ruleDeclaration )
            	    // InternalDrn.g:3661:6: lv_declarations_5_0= ruleDeclaration
            	    {

            	    						newCompositeNode(grammarAccess.getDeviceAccess().getDeclarationsDeclarationParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_34);
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
            	    break loop29;
                }
            } while (true);

            otherlv_6=(Token)match(input,16,FOLLOW_2); 

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
    // InternalDrn.g:3687:1: entryRuleDeclaration returns [EObject current=null] : iv_ruleDeclaration= ruleDeclaration EOF ;
    public final EObject entryRuleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaration = null;


        try {
            // InternalDrn.g:3687:52: (iv_ruleDeclaration= ruleDeclaration EOF )
            // InternalDrn.g:3688:2: iv_ruleDeclaration= ruleDeclaration EOF
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
    // InternalDrn.g:3694:1: ruleDeclaration returns [EObject current=null] : (otherlv_0= 'type' ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;


        	enterRule();

        try {
            // InternalDrn.g:3700:2: ( (otherlv_0= 'type' ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) ) )
            // InternalDrn.g:3701:2: (otherlv_0= 'type' ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) )
            {
            // InternalDrn.g:3701:2: (otherlv_0= 'type' ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) )
            // InternalDrn.g:3702:3: otherlv_0= 'type' ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,56,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getDeclarationAccess().getTypeKeyword_0());
            		
            // InternalDrn.g:3706:3: ( (otherlv_1= RULE_ID ) )
            // InternalDrn.g:3707:4: (otherlv_1= RULE_ID )
            {
            // InternalDrn.g:3707:4: (otherlv_1= RULE_ID )
            // InternalDrn.g:3708:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDeclarationRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(otherlv_1, grammarAccess.getDeclarationAccess().getTypeTypeGenericCrossReference_1_0());
            				

            }


            }

            // InternalDrn.g:3719:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalDrn.g:3720:4: (lv_name_2_0= RULE_ID )
            {
            // InternalDrn.g:3720:4: (lv_name_2_0= RULE_ID )
            // InternalDrn.g:3721:5: lv_name_2_0= RULE_ID
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
    // InternalDrn.g:3741:1: entryRuleDefinition returns [EObject current=null] : iv_ruleDefinition= ruleDefinition EOF ;
    public final EObject entryRuleDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefinition = null;


        try {
            // InternalDrn.g:3741:51: (iv_ruleDefinition= ruleDefinition EOF )
            // InternalDrn.g:3742:2: iv_ruleDefinition= ruleDefinition EOF
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
    // InternalDrn.g:3748:1: ruleDefinition returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalDrn.g:3754:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (otherlv_2= RULE_ID ) ) ) )
            // InternalDrn.g:3755:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (otherlv_2= RULE_ID ) ) )
            {
            // InternalDrn.g:3755:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (otherlv_2= RULE_ID ) ) )
            // InternalDrn.g:3756:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (otherlv_2= RULE_ID ) )
            {
            // InternalDrn.g:3756:3: ( (otherlv_0= RULE_ID ) )
            // InternalDrn.g:3757:4: (otherlv_0= RULE_ID )
            {
            // InternalDrn.g:3757:4: (otherlv_0= RULE_ID )
            // InternalDrn.g:3758:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDefinitionRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(otherlv_0, grammarAccess.getDefinitionAccess().getLeftDeclarationCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getDefinitionAccess().getEqualsSignKeyword_1());
            		
            // InternalDrn.g:3773:3: ( (otherlv_2= RULE_ID ) )
            // InternalDrn.g:3774:4: (otherlv_2= RULE_ID )
            {
            // InternalDrn.g:3774:4: (otherlv_2= RULE_ID )
            // InternalDrn.g:3775:5: otherlv_2= RULE_ID
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
    // InternalDrn.g:3790:1: entryRuleWith returns [EObject current=null] : iv_ruleWith= ruleWith EOF ;
    public final EObject entryRuleWith() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWith = null;


        try {
            // InternalDrn.g:3790:45: (iv_ruleWith= ruleWith EOF )
            // InternalDrn.g:3791:2: iv_ruleWith= ruleWith EOF
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
    // InternalDrn.g:3797:1: ruleWith returns [EObject current=null] : ( ( (lv_name_0_0= 'with' ) ) ( (lv_option_1_0= ruleOption ) ) (otherlv_2= ',' ( (lv_option_3_0= ruleOption ) ) )* ) ;
    public final EObject ruleWith() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_2=null;
        EObject lv_option_1_0 = null;

        EObject lv_option_3_0 = null;



        	enterRule();

        try {
            // InternalDrn.g:3803:2: ( ( ( (lv_name_0_0= 'with' ) ) ( (lv_option_1_0= ruleOption ) ) (otherlv_2= ',' ( (lv_option_3_0= ruleOption ) ) )* ) )
            // InternalDrn.g:3804:2: ( ( (lv_name_0_0= 'with' ) ) ( (lv_option_1_0= ruleOption ) ) (otherlv_2= ',' ( (lv_option_3_0= ruleOption ) ) )* )
            {
            // InternalDrn.g:3804:2: ( ( (lv_name_0_0= 'with' ) ) ( (lv_option_1_0= ruleOption ) ) (otherlv_2= ',' ( (lv_option_3_0= ruleOption ) ) )* )
            // InternalDrn.g:3805:3: ( (lv_name_0_0= 'with' ) ) ( (lv_option_1_0= ruleOption ) ) (otherlv_2= ',' ( (lv_option_3_0= ruleOption ) ) )*
            {
            // InternalDrn.g:3805:3: ( (lv_name_0_0= 'with' ) )
            // InternalDrn.g:3806:4: (lv_name_0_0= 'with' )
            {
            // InternalDrn.g:3806:4: (lv_name_0_0= 'with' )
            // InternalDrn.g:3807:5: lv_name_0_0= 'with'
            {
            lv_name_0_0=(Token)match(input,57,FOLLOW_35); 

            					newLeafNode(lv_name_0_0, grammarAccess.getWithAccess().getNameWithKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getWithRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "with");
            				

            }


            }

            // InternalDrn.g:3819:3: ( (lv_option_1_0= ruleOption ) )
            // InternalDrn.g:3820:4: (lv_option_1_0= ruleOption )
            {
            // InternalDrn.g:3820:4: (lv_option_1_0= ruleOption )
            // InternalDrn.g:3821:5: lv_option_1_0= ruleOption
            {

            					newCompositeNode(grammarAccess.getWithAccess().getOptionOptionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_36);
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

            // InternalDrn.g:3838:3: (otherlv_2= ',' ( (lv_option_3_0= ruleOption ) ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==30) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalDrn.g:3839:4: otherlv_2= ',' ( (lv_option_3_0= ruleOption ) )
            	    {
            	    otherlv_2=(Token)match(input,30,FOLLOW_35); 

            	    				newLeafNode(otherlv_2, grammarAccess.getWithAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalDrn.g:3843:4: ( (lv_option_3_0= ruleOption ) )
            	    // InternalDrn.g:3844:5: (lv_option_3_0= ruleOption )
            	    {
            	    // InternalDrn.g:3844:5: (lv_option_3_0= ruleOption )
            	    // InternalDrn.g:3845:6: lv_option_3_0= ruleOption
            	    {

            	    						newCompositeNode(grammarAccess.getWithAccess().getOptionOptionParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_36);
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
            	    break loop30;
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
    // InternalDrn.g:3867:1: entryRuleOption returns [EObject current=null] : iv_ruleOption= ruleOption EOF ;
    public final EObject entryRuleOption() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOption = null;


        try {
            // InternalDrn.g:3867:47: (iv_ruleOption= ruleOption EOF )
            // InternalDrn.g:3868:2: iv_ruleOption= ruleOption EOF
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
    // InternalDrn.g:3874:1: ruleOption returns [EObject current=null] : (this_Led_Impl_0= ruleLed_Impl | this_LedBlink_1= ruleLedBlink | this_Camera_2= ruleCamera | this_RefDevice_3= ruleRefDevice ) ;
    public final EObject ruleOption() throws RecognitionException {
        EObject current = null;

        EObject this_Led_Impl_0 = null;

        EObject this_LedBlink_1 = null;

        EObject this_Camera_2 = null;

        EObject this_RefDevice_3 = null;



        	enterRule();

        try {
            // InternalDrn.g:3880:2: ( (this_Led_Impl_0= ruleLed_Impl | this_LedBlink_1= ruleLedBlink | this_Camera_2= ruleCamera | this_RefDevice_3= ruleRefDevice ) )
            // InternalDrn.g:3881:2: (this_Led_Impl_0= ruleLed_Impl | this_LedBlink_1= ruleLedBlink | this_Camera_2= ruleCamera | this_RefDevice_3= ruleRefDevice )
            {
            // InternalDrn.g:3881:2: (this_Led_Impl_0= ruleLed_Impl | this_LedBlink_1= ruleLedBlink | this_Camera_2= ruleCamera | this_RefDevice_3= ruleRefDevice )
            int alt31=4;
            switch ( input.LA(1) ) {
            case 61:
                {
                alt31=1;
                }
                break;
            case 63:
                {
                alt31=2;
                }
                break;
            case 65:
                {
                alt31=3;
                }
                break;
            case RULE_ID:
                {
                alt31=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }

            switch (alt31) {
                case 1 :
                    // InternalDrn.g:3882:3: this_Led_Impl_0= ruleLed_Impl
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
                    // InternalDrn.g:3891:3: this_LedBlink_1= ruleLedBlink
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
                    // InternalDrn.g:3900:3: this_Camera_2= ruleCamera
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
                    // InternalDrn.g:3909:3: this_RefDevice_3= ruleRefDevice
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
    // InternalDrn.g:3921:1: entryRuleRefDevice returns [EObject current=null] : iv_ruleRefDevice= ruleRefDevice EOF ;
    public final EObject entryRuleRefDevice() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRefDevice = null;


        try {
            // InternalDrn.g:3921:50: (iv_ruleRefDevice= ruleRefDevice EOF )
            // InternalDrn.g:3922:2: iv_ruleRefDevice= ruleRefDevice EOF
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
    // InternalDrn.g:3928:1: ruleRefDevice returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' otherlv_2= 'mode' ( (lv_mode_3_0= ruleMode ) ) (otherlv_4= ',' ( (lv_definitions_5_0= ruleDefinition ) ) )* otherlv_6= ')' ) ;
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
            // InternalDrn.g:3934:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' otherlv_2= 'mode' ( (lv_mode_3_0= ruleMode ) ) (otherlv_4= ',' ( (lv_definitions_5_0= ruleDefinition ) ) )* otherlv_6= ')' ) )
            // InternalDrn.g:3935:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' otherlv_2= 'mode' ( (lv_mode_3_0= ruleMode ) ) (otherlv_4= ',' ( (lv_definitions_5_0= ruleDefinition ) ) )* otherlv_6= ')' )
            {
            // InternalDrn.g:3935:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' otherlv_2= 'mode' ( (lv_mode_3_0= ruleMode ) ) (otherlv_4= ',' ( (lv_definitions_5_0= ruleDefinition ) ) )* otherlv_6= ')' )
            // InternalDrn.g:3936:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' otherlv_2= 'mode' ( (lv_mode_3_0= ruleMode ) ) (otherlv_4= ',' ( (lv_definitions_5_0= ruleDefinition ) ) )* otherlv_6= ')'
            {
            // InternalDrn.g:3936:3: ( (otherlv_0= RULE_ID ) )
            // InternalDrn.g:3937:4: (otherlv_0= RULE_ID )
            {
            // InternalDrn.g:3937:4: (otherlv_0= RULE_ID )
            // InternalDrn.g:3938:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRefDeviceRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_22); 

            					newLeafNode(otherlv_0, grammarAccess.getRefDeviceAccess().getDevDeviceCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,26,FOLLOW_37); 

            			newLeafNode(otherlv_1, grammarAccess.getRefDeviceAccess().getLeftParenthesisKeyword_1());
            		
            otherlv_2=(Token)match(input,58,FOLLOW_38); 

            			newLeafNode(otherlv_2, grammarAccess.getRefDeviceAccess().getModeKeyword_2());
            		
            // InternalDrn.g:3957:3: ( (lv_mode_3_0= ruleMode ) )
            // InternalDrn.g:3958:4: (lv_mode_3_0= ruleMode )
            {
            // InternalDrn.g:3958:4: (lv_mode_3_0= ruleMode )
            // InternalDrn.g:3959:5: lv_mode_3_0= ruleMode
            {

            					newCompositeNode(grammarAccess.getRefDeviceAccess().getModeModeEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_25);
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

            // InternalDrn.g:3976:3: (otherlv_4= ',' ( (lv_definitions_5_0= ruleDefinition ) ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==30) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalDrn.g:3977:4: otherlv_4= ',' ( (lv_definitions_5_0= ruleDefinition ) )
            	    {
            	    otherlv_4=(Token)match(input,30,FOLLOW_7); 

            	    				newLeafNode(otherlv_4, grammarAccess.getRefDeviceAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalDrn.g:3981:4: ( (lv_definitions_5_0= ruleDefinition ) )
            	    // InternalDrn.g:3982:5: (lv_definitions_5_0= ruleDefinition )
            	    {
            	    // InternalDrn.g:3982:5: (lv_definitions_5_0= ruleDefinition )
            	    // InternalDrn.g:3983:6: lv_definitions_5_0= ruleDefinition
            	    {

            	    						newCompositeNode(grammarAccess.getRefDeviceAccess().getDefinitionsDefinitionParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_25);
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
            	    break loop32;
                }
            } while (true);

            otherlv_6=(Token)match(input,28,FOLLOW_2); 

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
    // InternalDrn.g:4009:1: entryRuleAttribut returns [EObject current=null] : iv_ruleAttribut= ruleAttribut EOF ;
    public final EObject entryRuleAttribut() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribut = null;


        try {
            // InternalDrn.g:4009:49: (iv_ruleAttribut= ruleAttribut EOF )
            // InternalDrn.g:4010:2: iv_ruleAttribut= ruleAttribut EOF
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
    // InternalDrn.g:4016:1: ruleAttribut returns [EObject current=null] : ( (otherlv_0= 'attribute' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( ( (otherlv_3= RULE_ID ) ) otherlv_4= '.' ( (otherlv_5= RULE_ID ) ) ) ) | ( (lv_mode_6_0= ruleMode ) ) | ( (lv_int_7_0= ruleEInt ) ) | ( (lv_bool_8_0= ruleEBool ) ) ) ;
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
            // InternalDrn.g:4022:2: ( ( (otherlv_0= 'attribute' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( ( (otherlv_3= RULE_ID ) ) otherlv_4= '.' ( (otherlv_5= RULE_ID ) ) ) ) | ( (lv_mode_6_0= ruleMode ) ) | ( (lv_int_7_0= ruleEInt ) ) | ( (lv_bool_8_0= ruleEBool ) ) ) )
            // InternalDrn.g:4023:2: ( (otherlv_0= 'attribute' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( ( (otherlv_3= RULE_ID ) ) otherlv_4= '.' ( (otherlv_5= RULE_ID ) ) ) ) | ( (lv_mode_6_0= ruleMode ) ) | ( (lv_int_7_0= ruleEInt ) ) | ( (lv_bool_8_0= ruleEBool ) ) )
            {
            // InternalDrn.g:4023:2: ( (otherlv_0= 'attribute' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( ( (otherlv_3= RULE_ID ) ) otherlv_4= '.' ( (otherlv_5= RULE_ID ) ) ) ) | ( (lv_mode_6_0= ruleMode ) ) | ( (lv_int_7_0= ruleEInt ) ) | ( (lv_bool_8_0= ruleEBool ) ) )
            int alt33=4;
            switch ( input.LA(1) ) {
            case 59:
                {
                alt33=1;
                }
                break;
            case 75:
            case 76:
                {
                alt33=2;
                }
                break;
            case RULE_INT:
            case 69:
                {
                alt33=3;
                }
                break;
            case 77:
            case 78:
                {
                alt33=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }

            switch (alt33) {
                case 1 :
                    // InternalDrn.g:4024:3: (otherlv_0= 'attribute' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( ( (otherlv_3= RULE_ID ) ) otherlv_4= '.' ( (otherlv_5= RULE_ID ) ) ) )
                    {
                    // InternalDrn.g:4024:3: (otherlv_0= 'attribute' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( ( (otherlv_3= RULE_ID ) ) otherlv_4= '.' ( (otherlv_5= RULE_ID ) ) ) )
                    // InternalDrn.g:4025:4: otherlv_0= 'attribute' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( ( (otherlv_3= RULE_ID ) ) otherlv_4= '.' ( (otherlv_5= RULE_ID ) ) )
                    {
                    otherlv_0=(Token)match(input,59,FOLLOW_7); 

                    				newLeafNode(otherlv_0, grammarAccess.getAttributAccess().getAttributeKeyword_0_0());
                    			
                    // InternalDrn.g:4029:4: ( (lv_name_1_0= RULE_ID ) )
                    // InternalDrn.g:4030:5: (lv_name_1_0= RULE_ID )
                    {
                    // InternalDrn.g:4030:5: (lv_name_1_0= RULE_ID )
                    // InternalDrn.g:4031:6: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

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

                    otherlv_2=(Token)match(input,14,FOLLOW_7); 

                    				newLeafNode(otherlv_2, grammarAccess.getAttributAccess().getEqualsSignKeyword_0_2());
                    			
                    // InternalDrn.g:4051:4: ( ( (otherlv_3= RULE_ID ) ) otherlv_4= '.' ( (otherlv_5= RULE_ID ) ) )
                    // InternalDrn.g:4052:5: ( (otherlv_3= RULE_ID ) ) otherlv_4= '.' ( (otherlv_5= RULE_ID ) )
                    {
                    // InternalDrn.g:4052:5: ( (otherlv_3= RULE_ID ) )
                    // InternalDrn.g:4053:6: (otherlv_3= RULE_ID )
                    {
                    // InternalDrn.g:4053:6: (otherlv_3= RULE_ID )
                    // InternalDrn.g:4054:7: otherlv_3= RULE_ID
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getAttributRule());
                    							}
                    						
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_39); 

                    							newLeafNode(otherlv_3, grammarAccess.getAttributAccess().getTypeTypeGenericCrossReference_0_3_0_0());
                    						

                    }


                    }

                    otherlv_4=(Token)match(input,60,FOLLOW_7); 

                    					newLeafNode(otherlv_4, grammarAccess.getAttributAccess().getFullStopKeyword_0_3_1());
                    				
                    // InternalDrn.g:4069:5: ( (otherlv_5= RULE_ID ) )
                    // InternalDrn.g:4070:6: (otherlv_5= RULE_ID )
                    {
                    // InternalDrn.g:4070:6: (otherlv_5= RULE_ID )
                    // InternalDrn.g:4071:7: otherlv_5= RULE_ID
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
                    // InternalDrn.g:4085:3: ( (lv_mode_6_0= ruleMode ) )
                    {
                    // InternalDrn.g:4085:3: ( (lv_mode_6_0= ruleMode ) )
                    // InternalDrn.g:4086:4: (lv_mode_6_0= ruleMode )
                    {
                    // InternalDrn.g:4086:4: (lv_mode_6_0= ruleMode )
                    // InternalDrn.g:4087:5: lv_mode_6_0= ruleMode
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
                    // InternalDrn.g:4105:3: ( (lv_int_7_0= ruleEInt ) )
                    {
                    // InternalDrn.g:4105:3: ( (lv_int_7_0= ruleEInt ) )
                    // InternalDrn.g:4106:4: (lv_int_7_0= ruleEInt )
                    {
                    // InternalDrn.g:4106:4: (lv_int_7_0= ruleEInt )
                    // InternalDrn.g:4107:5: lv_int_7_0= ruleEInt
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
                    // InternalDrn.g:4125:3: ( (lv_bool_8_0= ruleEBool ) )
                    {
                    // InternalDrn.g:4125:3: ( (lv_bool_8_0= ruleEBool ) )
                    // InternalDrn.g:4126:4: (lv_bool_8_0= ruleEBool )
                    {
                    // InternalDrn.g:4126:4: (lv_bool_8_0= ruleEBool )
                    // InternalDrn.g:4127:5: lv_bool_8_0= ruleEBool
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
    // InternalDrn.g:4148:1: entryRuleLed_Impl returns [EObject current=null] : iv_ruleLed_Impl= ruleLed_Impl EOF ;
    public final EObject entryRuleLed_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLed_Impl = null;


        try {
            // InternalDrn.g:4148:49: (iv_ruleLed_Impl= ruleLed_Impl EOF )
            // InternalDrn.g:4149:2: iv_ruleLed_Impl= ruleLed_Impl EOF
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
    // InternalDrn.g:4155:1: ruleLed_Impl returns [EObject current=null] : ( ( (lv_name_0_0= 'led' ) ) otherlv_1= '(' otherlv_2= 'mode' otherlv_3= '=' ( (lv_mode_4_0= ruleMode ) ) otherlv_5= 'color' otherlv_6= '=' ( (lv_color_7_0= ruleColorLed ) ) otherlv_8= ')' ) ;
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
            // InternalDrn.g:4161:2: ( ( ( (lv_name_0_0= 'led' ) ) otherlv_1= '(' otherlv_2= 'mode' otherlv_3= '=' ( (lv_mode_4_0= ruleMode ) ) otherlv_5= 'color' otherlv_6= '=' ( (lv_color_7_0= ruleColorLed ) ) otherlv_8= ')' ) )
            // InternalDrn.g:4162:2: ( ( (lv_name_0_0= 'led' ) ) otherlv_1= '(' otherlv_2= 'mode' otherlv_3= '=' ( (lv_mode_4_0= ruleMode ) ) otherlv_5= 'color' otherlv_6= '=' ( (lv_color_7_0= ruleColorLed ) ) otherlv_8= ')' )
            {
            // InternalDrn.g:4162:2: ( ( (lv_name_0_0= 'led' ) ) otherlv_1= '(' otherlv_2= 'mode' otherlv_3= '=' ( (lv_mode_4_0= ruleMode ) ) otherlv_5= 'color' otherlv_6= '=' ( (lv_color_7_0= ruleColorLed ) ) otherlv_8= ')' )
            // InternalDrn.g:4163:3: ( (lv_name_0_0= 'led' ) ) otherlv_1= '(' otherlv_2= 'mode' otherlv_3= '=' ( (lv_mode_4_0= ruleMode ) ) otherlv_5= 'color' otherlv_6= '=' ( (lv_color_7_0= ruleColorLed ) ) otherlv_8= ')'
            {
            // InternalDrn.g:4163:3: ( (lv_name_0_0= 'led' ) )
            // InternalDrn.g:4164:4: (lv_name_0_0= 'led' )
            {
            // InternalDrn.g:4164:4: (lv_name_0_0= 'led' )
            // InternalDrn.g:4165:5: lv_name_0_0= 'led'
            {
            lv_name_0_0=(Token)match(input,61,FOLLOW_22); 

            					newLeafNode(lv_name_0_0, grammarAccess.getLed_ImplAccess().getNameLedKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLed_ImplRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "led");
            				

            }


            }

            otherlv_1=(Token)match(input,26,FOLLOW_37); 

            			newLeafNode(otherlv_1, grammarAccess.getLed_ImplAccess().getLeftParenthesisKeyword_1());
            		
            otherlv_2=(Token)match(input,58,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getLed_ImplAccess().getModeKeyword_2());
            		
            otherlv_3=(Token)match(input,14,FOLLOW_38); 

            			newLeafNode(otherlv_3, grammarAccess.getLed_ImplAccess().getEqualsSignKeyword_3());
            		
            // InternalDrn.g:4189:3: ( (lv_mode_4_0= ruleMode ) )
            // InternalDrn.g:4190:4: (lv_mode_4_0= ruleMode )
            {
            // InternalDrn.g:4190:4: (lv_mode_4_0= ruleMode )
            // InternalDrn.g:4191:5: lv_mode_4_0= ruleMode
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

            otherlv_5=(Token)match(input,62,FOLLOW_6); 

            			newLeafNode(otherlv_5, grammarAccess.getLed_ImplAccess().getColorKeyword_5());
            		
            otherlv_6=(Token)match(input,14,FOLLOW_41); 

            			newLeafNode(otherlv_6, grammarAccess.getLed_ImplAccess().getEqualsSignKeyword_6());
            		
            // InternalDrn.g:4216:3: ( (lv_color_7_0= ruleColorLed ) )
            // InternalDrn.g:4217:4: (lv_color_7_0= ruleColorLed )
            {
            // InternalDrn.g:4217:4: (lv_color_7_0= ruleColorLed )
            // InternalDrn.g:4218:5: lv_color_7_0= ruleColorLed
            {

            					newCompositeNode(grammarAccess.getLed_ImplAccess().getColorColorLedEnumRuleCall_7_0());
            				
            pushFollow(FOLLOW_28);
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

            otherlv_8=(Token)match(input,28,FOLLOW_2); 

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
    // InternalDrn.g:4243:1: entryRuleLedBlink returns [EObject current=null] : iv_ruleLedBlink= ruleLedBlink EOF ;
    public final EObject entryRuleLedBlink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLedBlink = null;


        try {
            // InternalDrn.g:4243:49: (iv_ruleLedBlink= ruleLedBlink EOF )
            // InternalDrn.g:4244:2: iv_ruleLedBlink= ruleLedBlink EOF
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
    // InternalDrn.g:4250:1: ruleLedBlink returns [EObject current=null] : ( ( (lv_name_0_0= 'ledBlink' ) ) otherlv_1= '(' otherlv_2= 'mode' otherlv_3= '=' ( (lv_mode_4_0= ruleMode ) ) (otherlv_5= 'color' otherlv_6= '=' ( (lv_color_7_0= ruleColorLed ) ) ) (otherlv_8= 'blink_per_sec' otherlv_9= '=' ( (lv_blink_per_secCST_10_0= RULE_INT ) ) ) ( (lv_attributs_11_0= ruleAttribut ) )* otherlv_12= ')' ) ;
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
            // InternalDrn.g:4256:2: ( ( ( (lv_name_0_0= 'ledBlink' ) ) otherlv_1= '(' otherlv_2= 'mode' otherlv_3= '=' ( (lv_mode_4_0= ruleMode ) ) (otherlv_5= 'color' otherlv_6= '=' ( (lv_color_7_0= ruleColorLed ) ) ) (otherlv_8= 'blink_per_sec' otherlv_9= '=' ( (lv_blink_per_secCST_10_0= RULE_INT ) ) ) ( (lv_attributs_11_0= ruleAttribut ) )* otherlv_12= ')' ) )
            // InternalDrn.g:4257:2: ( ( (lv_name_0_0= 'ledBlink' ) ) otherlv_1= '(' otherlv_2= 'mode' otherlv_3= '=' ( (lv_mode_4_0= ruleMode ) ) (otherlv_5= 'color' otherlv_6= '=' ( (lv_color_7_0= ruleColorLed ) ) ) (otherlv_8= 'blink_per_sec' otherlv_9= '=' ( (lv_blink_per_secCST_10_0= RULE_INT ) ) ) ( (lv_attributs_11_0= ruleAttribut ) )* otherlv_12= ')' )
            {
            // InternalDrn.g:4257:2: ( ( (lv_name_0_0= 'ledBlink' ) ) otherlv_1= '(' otherlv_2= 'mode' otherlv_3= '=' ( (lv_mode_4_0= ruleMode ) ) (otherlv_5= 'color' otherlv_6= '=' ( (lv_color_7_0= ruleColorLed ) ) ) (otherlv_8= 'blink_per_sec' otherlv_9= '=' ( (lv_blink_per_secCST_10_0= RULE_INT ) ) ) ( (lv_attributs_11_0= ruleAttribut ) )* otherlv_12= ')' )
            // InternalDrn.g:4258:3: ( (lv_name_0_0= 'ledBlink' ) ) otherlv_1= '(' otherlv_2= 'mode' otherlv_3= '=' ( (lv_mode_4_0= ruleMode ) ) (otherlv_5= 'color' otherlv_6= '=' ( (lv_color_7_0= ruleColorLed ) ) ) (otherlv_8= 'blink_per_sec' otherlv_9= '=' ( (lv_blink_per_secCST_10_0= RULE_INT ) ) ) ( (lv_attributs_11_0= ruleAttribut ) )* otherlv_12= ')'
            {
            // InternalDrn.g:4258:3: ( (lv_name_0_0= 'ledBlink' ) )
            // InternalDrn.g:4259:4: (lv_name_0_0= 'ledBlink' )
            {
            // InternalDrn.g:4259:4: (lv_name_0_0= 'ledBlink' )
            // InternalDrn.g:4260:5: lv_name_0_0= 'ledBlink'
            {
            lv_name_0_0=(Token)match(input,63,FOLLOW_22); 

            					newLeafNode(lv_name_0_0, grammarAccess.getLedBlinkAccess().getNameLedBlinkKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLedBlinkRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "ledBlink");
            				

            }


            }

            otherlv_1=(Token)match(input,26,FOLLOW_37); 

            			newLeafNode(otherlv_1, grammarAccess.getLedBlinkAccess().getLeftParenthesisKeyword_1());
            		
            otherlv_2=(Token)match(input,58,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getLedBlinkAccess().getModeKeyword_2());
            		
            otherlv_3=(Token)match(input,14,FOLLOW_38); 

            			newLeafNode(otherlv_3, grammarAccess.getLedBlinkAccess().getEqualsSignKeyword_3());
            		
            // InternalDrn.g:4284:3: ( (lv_mode_4_0= ruleMode ) )
            // InternalDrn.g:4285:4: (lv_mode_4_0= ruleMode )
            {
            // InternalDrn.g:4285:4: (lv_mode_4_0= ruleMode )
            // InternalDrn.g:4286:5: lv_mode_4_0= ruleMode
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

            // InternalDrn.g:4303:3: (otherlv_5= 'color' otherlv_6= '=' ( (lv_color_7_0= ruleColorLed ) ) )
            // InternalDrn.g:4304:4: otherlv_5= 'color' otherlv_6= '=' ( (lv_color_7_0= ruleColorLed ) )
            {
            otherlv_5=(Token)match(input,62,FOLLOW_6); 

            				newLeafNode(otherlv_5, grammarAccess.getLedBlinkAccess().getColorKeyword_5_0());
            			
            otherlv_6=(Token)match(input,14,FOLLOW_41); 

            				newLeafNode(otherlv_6, grammarAccess.getLedBlinkAccess().getEqualsSignKeyword_5_1());
            			
            // InternalDrn.g:4312:4: ( (lv_color_7_0= ruleColorLed ) )
            // InternalDrn.g:4313:5: (lv_color_7_0= ruleColorLed )
            {
            // InternalDrn.g:4313:5: (lv_color_7_0= ruleColorLed )
            // InternalDrn.g:4314:6: lv_color_7_0= ruleColorLed
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

            // InternalDrn.g:4332:3: (otherlv_8= 'blink_per_sec' otherlv_9= '=' ( (lv_blink_per_secCST_10_0= RULE_INT ) ) )
            // InternalDrn.g:4333:4: otherlv_8= 'blink_per_sec' otherlv_9= '=' ( (lv_blink_per_secCST_10_0= RULE_INT ) )
            {
            otherlv_8=(Token)match(input,64,FOLLOW_6); 

            				newLeafNode(otherlv_8, grammarAccess.getLedBlinkAccess().getBlink_per_secKeyword_6_0());
            			
            otherlv_9=(Token)match(input,14,FOLLOW_13); 

            				newLeafNode(otherlv_9, grammarAccess.getLedBlinkAccess().getEqualsSignKeyword_6_1());
            			
            // InternalDrn.g:4341:4: ( (lv_blink_per_secCST_10_0= RULE_INT ) )
            // InternalDrn.g:4342:5: (lv_blink_per_secCST_10_0= RULE_INT )
            {
            // InternalDrn.g:4342:5: (lv_blink_per_secCST_10_0= RULE_INT )
            // InternalDrn.g:4343:6: lv_blink_per_secCST_10_0= RULE_INT
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

            // InternalDrn.g:4360:3: ( (lv_attributs_11_0= ruleAttribut ) )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==RULE_INT||LA34_0==59||LA34_0==69||(LA34_0>=75 && LA34_0<=78)) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalDrn.g:4361:4: (lv_attributs_11_0= ruleAttribut )
            	    {
            	    // InternalDrn.g:4361:4: (lv_attributs_11_0= ruleAttribut )
            	    // InternalDrn.g:4362:5: lv_attributs_11_0= ruleAttribut
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
            	    break loop34;
                }
            } while (true);

            otherlv_12=(Token)match(input,28,FOLLOW_2); 

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
    // InternalDrn.g:4387:1: entryRuleCamera returns [EObject current=null] : iv_ruleCamera= ruleCamera EOF ;
    public final EObject entryRuleCamera() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCamera = null;


        try {
            // InternalDrn.g:4387:47: (iv_ruleCamera= ruleCamera EOF )
            // InternalDrn.g:4388:2: iv_ruleCamera= ruleCamera EOF
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
    // InternalDrn.g:4394:1: ruleCamera returns [EObject current=null] : ( ( (lv_name_0_0= 'camera' ) ) otherlv_1= '(' otherlv_2= 'id' otherlv_3= '=' ( (lv_id_4_0= RULE_INT ) ) otherlv_5= 'mode' otherlv_6= '=' ( (lv_mode_7_0= ruleMode ) ) ( (lv_attributs_8_0= ruleAttribut ) )* otherlv_9= ')' ) ;
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
            // InternalDrn.g:4400:2: ( ( ( (lv_name_0_0= 'camera' ) ) otherlv_1= '(' otherlv_2= 'id' otherlv_3= '=' ( (lv_id_4_0= RULE_INT ) ) otherlv_5= 'mode' otherlv_6= '=' ( (lv_mode_7_0= ruleMode ) ) ( (lv_attributs_8_0= ruleAttribut ) )* otherlv_9= ')' ) )
            // InternalDrn.g:4401:2: ( ( (lv_name_0_0= 'camera' ) ) otherlv_1= '(' otherlv_2= 'id' otherlv_3= '=' ( (lv_id_4_0= RULE_INT ) ) otherlv_5= 'mode' otherlv_6= '=' ( (lv_mode_7_0= ruleMode ) ) ( (lv_attributs_8_0= ruleAttribut ) )* otherlv_9= ')' )
            {
            // InternalDrn.g:4401:2: ( ( (lv_name_0_0= 'camera' ) ) otherlv_1= '(' otherlv_2= 'id' otherlv_3= '=' ( (lv_id_4_0= RULE_INT ) ) otherlv_5= 'mode' otherlv_6= '=' ( (lv_mode_7_0= ruleMode ) ) ( (lv_attributs_8_0= ruleAttribut ) )* otherlv_9= ')' )
            // InternalDrn.g:4402:3: ( (lv_name_0_0= 'camera' ) ) otherlv_1= '(' otherlv_2= 'id' otherlv_3= '=' ( (lv_id_4_0= RULE_INT ) ) otherlv_5= 'mode' otherlv_6= '=' ( (lv_mode_7_0= ruleMode ) ) ( (lv_attributs_8_0= ruleAttribut ) )* otherlv_9= ')'
            {
            // InternalDrn.g:4402:3: ( (lv_name_0_0= 'camera' ) )
            // InternalDrn.g:4403:4: (lv_name_0_0= 'camera' )
            {
            // InternalDrn.g:4403:4: (lv_name_0_0= 'camera' )
            // InternalDrn.g:4404:5: lv_name_0_0= 'camera'
            {
            lv_name_0_0=(Token)match(input,65,FOLLOW_22); 

            					newLeafNode(lv_name_0_0, grammarAccess.getCameraAccess().getNameCameraKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCameraRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "camera");
            				

            }


            }

            otherlv_1=(Token)match(input,26,FOLLOW_44); 

            			newLeafNode(otherlv_1, grammarAccess.getCameraAccess().getLeftParenthesisKeyword_1());
            		
            otherlv_2=(Token)match(input,66,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getCameraAccess().getIdKeyword_2());
            		
            otherlv_3=(Token)match(input,14,FOLLOW_13); 

            			newLeafNode(otherlv_3, grammarAccess.getCameraAccess().getEqualsSignKeyword_3());
            		
            // InternalDrn.g:4428:3: ( (lv_id_4_0= RULE_INT ) )
            // InternalDrn.g:4429:4: (lv_id_4_0= RULE_INT )
            {
            // InternalDrn.g:4429:4: (lv_id_4_0= RULE_INT )
            // InternalDrn.g:4430:5: lv_id_4_0= RULE_INT
            {
            lv_id_4_0=(Token)match(input,RULE_INT,FOLLOW_37); 

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

            otherlv_5=(Token)match(input,58,FOLLOW_6); 

            			newLeafNode(otherlv_5, grammarAccess.getCameraAccess().getModeKeyword_5());
            		
            otherlv_6=(Token)match(input,14,FOLLOW_38); 

            			newLeafNode(otherlv_6, grammarAccess.getCameraAccess().getEqualsSignKeyword_6());
            		
            // InternalDrn.g:4454:3: ( (lv_mode_7_0= ruleMode ) )
            // InternalDrn.g:4455:4: (lv_mode_7_0= ruleMode )
            {
            // InternalDrn.g:4455:4: (lv_mode_7_0= ruleMode )
            // InternalDrn.g:4456:5: lv_mode_7_0= ruleMode
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

            // InternalDrn.g:4473:3: ( (lv_attributs_8_0= ruleAttribut ) )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==RULE_INT||LA35_0==59||LA35_0==69||(LA35_0>=75 && LA35_0<=78)) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalDrn.g:4474:4: (lv_attributs_8_0= ruleAttribut )
            	    {
            	    // InternalDrn.g:4474:4: (lv_attributs_8_0= ruleAttribut )
            	    // InternalDrn.g:4475:5: lv_attributs_8_0= ruleAttribut
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
            	    break loop35;
                }
            } while (true);

            otherlv_9=(Token)match(input,28,FOLLOW_2); 

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
    // InternalDrn.g:4500:1: entryRuleTypeGeneric returns [EObject current=null] : iv_ruleTypeGeneric= ruleTypeGeneric EOF ;
    public final EObject entryRuleTypeGeneric() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeGeneric = null;


        try {
            // InternalDrn.g:4500:52: (iv_ruleTypeGeneric= ruleTypeGeneric EOF )
            // InternalDrn.g:4501:2: iv_ruleTypeGeneric= ruleTypeGeneric EOF
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
    // InternalDrn.g:4507:1: ruleTypeGeneric returns [EObject current=null] : (otherlv_0= 'Type' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleElement ) ) (otherlv_4= ';' ( (lv_elements_5_0= ruleElement ) ) )* otherlv_6= '}' ) ;
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
            // InternalDrn.g:4513:2: ( (otherlv_0= 'Type' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleElement ) ) (otherlv_4= ';' ( (lv_elements_5_0= ruleElement ) ) )* otherlv_6= '}' ) )
            // InternalDrn.g:4514:2: (otherlv_0= 'Type' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleElement ) ) (otherlv_4= ';' ( (lv_elements_5_0= ruleElement ) ) )* otherlv_6= '}' )
            {
            // InternalDrn.g:4514:2: (otherlv_0= 'Type' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleElement ) ) (otherlv_4= ';' ( (lv_elements_5_0= ruleElement ) ) )* otherlv_6= '}' )
            // InternalDrn.g:4515:3: otherlv_0= 'Type' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleElement ) ) (otherlv_4= ';' ( (lv_elements_5_0= ruleElement ) ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,67,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getTypeGenericAccess().getTypeKeyword_0());
            		
            // InternalDrn.g:4519:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDrn.g:4520:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDrn.g:4520:4: (lv_name_1_0= RULE_ID )
            // InternalDrn.g:4521:5: lv_name_1_0= RULE_ID
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
            		
            // InternalDrn.g:4541:3: ( (lv_elements_3_0= ruleElement ) )
            // InternalDrn.g:4542:4: (lv_elements_3_0= ruleElement )
            {
            // InternalDrn.g:4542:4: (lv_elements_3_0= ruleElement )
            // InternalDrn.g:4543:5: lv_elements_3_0= ruleElement
            {

            					newCompositeNode(grammarAccess.getTypeGenericAccess().getElementsElementParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_34);
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

            // InternalDrn.g:4560:3: (otherlv_4= ';' ( (lv_elements_5_0= ruleElement ) ) )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==15) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalDrn.g:4561:4: otherlv_4= ';' ( (lv_elements_5_0= ruleElement ) )
            	    {
            	    otherlv_4=(Token)match(input,15,FOLLOW_45); 

            	    				newLeafNode(otherlv_4, grammarAccess.getTypeGenericAccess().getSemicolonKeyword_4_0());
            	    			
            	    // InternalDrn.g:4565:4: ( (lv_elements_5_0= ruleElement ) )
            	    // InternalDrn.g:4566:5: (lv_elements_5_0= ruleElement )
            	    {
            	    // InternalDrn.g:4566:5: (lv_elements_5_0= ruleElement )
            	    // InternalDrn.g:4567:6: lv_elements_5_0= ruleElement
            	    {

            	    						newCompositeNode(grammarAccess.getTypeGenericAccess().getElementsElementParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_34);
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
            	    break loop36;
                }
            } while (true);

            otherlv_6=(Token)match(input,16,FOLLOW_2); 

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
    // InternalDrn.g:4593:1: entryRuleElement returns [EObject current=null] : iv_ruleElement= ruleElement EOF ;
    public final EObject entryRuleElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElement = null;


        try {
            // InternalDrn.g:4593:48: (iv_ruleElement= ruleElement EOF )
            // InternalDrn.g:4594:2: iv_ruleElement= ruleElement EOF
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
    // InternalDrn.g:4600:1: ruleElement returns [EObject current=null] : (otherlv_0= 'element' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalDrn.g:4606:2: ( (otherlv_0= 'element' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalDrn.g:4607:2: (otherlv_0= 'element' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalDrn.g:4607:2: (otherlv_0= 'element' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalDrn.g:4608:3: otherlv_0= 'element' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,68,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getElementAccess().getElementKeyword_0());
            		
            // InternalDrn.g:4612:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDrn.g:4613:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDrn.g:4613:4: (lv_name_1_0= RULE_ID )
            // InternalDrn.g:4614:5: lv_name_1_0= RULE_ID
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
    // InternalDrn.g:4634:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalDrn.g:4634:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalDrn.g:4635:2: iv_ruleEInt= ruleEInt EOF
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
    // InternalDrn.g:4641:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalDrn.g:4647:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalDrn.g:4648:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalDrn.g:4648:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalDrn.g:4649:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalDrn.g:4649:3: (kw= '-' )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==69) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalDrn.g:4650:4: kw= '-'
                    {
                    kw=(Token)match(input,69,FOLLOW_13); 

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
    // InternalDrn.g:4667:1: ruleColorLed returns [Enumerator current=null] : ( (enumLiteral_0= 'BLUE' ) | (enumLiteral_1= 'RED' ) | (enumLiteral_2= 'YELLOW' ) | (enumLiteral_3= 'GREEN' ) | (enumLiteral_4= 'WHITE' ) ) ;
    public final Enumerator ruleColorLed() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalDrn.g:4673:2: ( ( (enumLiteral_0= 'BLUE' ) | (enumLiteral_1= 'RED' ) | (enumLiteral_2= 'YELLOW' ) | (enumLiteral_3= 'GREEN' ) | (enumLiteral_4= 'WHITE' ) ) )
            // InternalDrn.g:4674:2: ( (enumLiteral_0= 'BLUE' ) | (enumLiteral_1= 'RED' ) | (enumLiteral_2= 'YELLOW' ) | (enumLiteral_3= 'GREEN' ) | (enumLiteral_4= 'WHITE' ) )
            {
            // InternalDrn.g:4674:2: ( (enumLiteral_0= 'BLUE' ) | (enumLiteral_1= 'RED' ) | (enumLiteral_2= 'YELLOW' ) | (enumLiteral_3= 'GREEN' ) | (enumLiteral_4= 'WHITE' ) )
            int alt38=5;
            switch ( input.LA(1) ) {
            case 70:
                {
                alt38=1;
                }
                break;
            case 71:
                {
                alt38=2;
                }
                break;
            case 72:
                {
                alt38=3;
                }
                break;
            case 73:
                {
                alt38=4;
                }
                break;
            case 74:
                {
                alt38=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }

            switch (alt38) {
                case 1 :
                    // InternalDrn.g:4675:3: (enumLiteral_0= 'BLUE' )
                    {
                    // InternalDrn.g:4675:3: (enumLiteral_0= 'BLUE' )
                    // InternalDrn.g:4676:4: enumLiteral_0= 'BLUE'
                    {
                    enumLiteral_0=(Token)match(input,70,FOLLOW_2); 

                    				current = grammarAccess.getColorLedAccess().getBLUEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getColorLedAccess().getBLUEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDrn.g:4683:3: (enumLiteral_1= 'RED' )
                    {
                    // InternalDrn.g:4683:3: (enumLiteral_1= 'RED' )
                    // InternalDrn.g:4684:4: enumLiteral_1= 'RED'
                    {
                    enumLiteral_1=(Token)match(input,71,FOLLOW_2); 

                    				current = grammarAccess.getColorLedAccess().getREDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getColorLedAccess().getREDEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalDrn.g:4691:3: (enumLiteral_2= 'YELLOW' )
                    {
                    // InternalDrn.g:4691:3: (enumLiteral_2= 'YELLOW' )
                    // InternalDrn.g:4692:4: enumLiteral_2= 'YELLOW'
                    {
                    enumLiteral_2=(Token)match(input,72,FOLLOW_2); 

                    				current = grammarAccess.getColorLedAccess().getYELLOWEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getColorLedAccess().getYELLOWEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalDrn.g:4699:3: (enumLiteral_3= 'GREEN' )
                    {
                    // InternalDrn.g:4699:3: (enumLiteral_3= 'GREEN' )
                    // InternalDrn.g:4700:4: enumLiteral_3= 'GREEN'
                    {
                    enumLiteral_3=(Token)match(input,73,FOLLOW_2); 

                    				current = grammarAccess.getColorLedAccess().getGREENEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getColorLedAccess().getGREENEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalDrn.g:4707:3: (enumLiteral_4= 'WHITE' )
                    {
                    // InternalDrn.g:4707:3: (enumLiteral_4= 'WHITE' )
                    // InternalDrn.g:4708:4: enumLiteral_4= 'WHITE'
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
    // InternalDrn.g:4718:1: ruleMode returns [Enumerator current=null] : ( (enumLiteral_0= 'OFF' ) | (enumLiteral_1= 'ON' ) ) ;
    public final Enumerator ruleMode() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalDrn.g:4724:2: ( ( (enumLiteral_0= 'OFF' ) | (enumLiteral_1= 'ON' ) ) )
            // InternalDrn.g:4725:2: ( (enumLiteral_0= 'OFF' ) | (enumLiteral_1= 'ON' ) )
            {
            // InternalDrn.g:4725:2: ( (enumLiteral_0= 'OFF' ) | (enumLiteral_1= 'ON' ) )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==75) ) {
                alt39=1;
            }
            else if ( (LA39_0==76) ) {
                alt39=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }
            switch (alt39) {
                case 1 :
                    // InternalDrn.g:4726:3: (enumLiteral_0= 'OFF' )
                    {
                    // InternalDrn.g:4726:3: (enumLiteral_0= 'OFF' )
                    // InternalDrn.g:4727:4: enumLiteral_0= 'OFF'
                    {
                    enumLiteral_0=(Token)match(input,75,FOLLOW_2); 

                    				current = grammarAccess.getModeAccess().getOFFEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getModeAccess().getOFFEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDrn.g:4734:3: (enumLiteral_1= 'ON' )
                    {
                    // InternalDrn.g:4734:3: (enumLiteral_1= 'ON' )
                    // InternalDrn.g:4735:4: enumLiteral_1= 'ON'
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
    // InternalDrn.g:4745:1: ruleEBool returns [Enumerator current=null] : ( (enumLiteral_0= 'TRUE' ) | (enumLiteral_1= 'FALSE' ) ) ;
    public final Enumerator ruleEBool() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalDrn.g:4751:2: ( ( (enumLiteral_0= 'TRUE' ) | (enumLiteral_1= 'FALSE' ) ) )
            // InternalDrn.g:4752:2: ( (enumLiteral_0= 'TRUE' ) | (enumLiteral_1= 'FALSE' ) )
            {
            // InternalDrn.g:4752:2: ( (enumLiteral_0= 'TRUE' ) | (enumLiteral_1= 'FALSE' ) )
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==77) ) {
                alt40=1;
            }
            else if ( (LA40_0==78) ) {
                alt40=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }
            switch (alt40) {
                case 1 :
                    // InternalDrn.g:4753:3: (enumLiteral_0= 'TRUE' )
                    {
                    // InternalDrn.g:4753:3: (enumLiteral_0= 'TRUE' )
                    // InternalDrn.g:4754:4: enumLiteral_0= 'TRUE'
                    {
                    enumLiteral_0=(Token)match(input,77,FOLLOW_2); 

                    				current = grammarAccess.getEBoolAccess().getTRUEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getEBoolAccess().getTRUEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDrn.g:4761:3: (enumLiteral_1= 'FALSE' )
                    {
                    // InternalDrn.g:4761:3: (enumLiteral_1= 'FALSE' )
                    // InternalDrn.g:4762:4: enumLiteral_1= 'FALSE'
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
    // InternalDrn.g:4772:1: ruleDirectionType returns [Enumerator current=null] : ( (enumLiteral_0= 'FRONT' ) | (enumLiteral_1= 'BEHIND' ) | (enumLiteral_2= 'LEFT' ) | (enumLiteral_3= 'RIGHT' ) ) ;
    public final Enumerator ruleDirectionType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalDrn.g:4778:2: ( ( (enumLiteral_0= 'FRONT' ) | (enumLiteral_1= 'BEHIND' ) | (enumLiteral_2= 'LEFT' ) | (enumLiteral_3= 'RIGHT' ) ) )
            // InternalDrn.g:4779:2: ( (enumLiteral_0= 'FRONT' ) | (enumLiteral_1= 'BEHIND' ) | (enumLiteral_2= 'LEFT' ) | (enumLiteral_3= 'RIGHT' ) )
            {
            // InternalDrn.g:4779:2: ( (enumLiteral_0= 'FRONT' ) | (enumLiteral_1= 'BEHIND' ) | (enumLiteral_2= 'LEFT' ) | (enumLiteral_3= 'RIGHT' ) )
            int alt41=4;
            switch ( input.LA(1) ) {
            case 79:
                {
                alt41=1;
                }
                break;
            case 80:
                {
                alt41=2;
                }
                break;
            case 81:
                {
                alt41=3;
                }
                break;
            case 82:
                {
                alt41=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }

            switch (alt41) {
                case 1 :
                    // InternalDrn.g:4780:3: (enumLiteral_0= 'FRONT' )
                    {
                    // InternalDrn.g:4780:3: (enumLiteral_0= 'FRONT' )
                    // InternalDrn.g:4781:4: enumLiteral_0= 'FRONT'
                    {
                    enumLiteral_0=(Token)match(input,79,FOLLOW_2); 

                    				current = grammarAccess.getDirectionTypeAccess().getFRONTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getDirectionTypeAccess().getFRONTEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDrn.g:4788:3: (enumLiteral_1= 'BEHIND' )
                    {
                    // InternalDrn.g:4788:3: (enumLiteral_1= 'BEHIND' )
                    // InternalDrn.g:4789:4: enumLiteral_1= 'BEHIND'
                    {
                    enumLiteral_1=(Token)match(input,80,FOLLOW_2); 

                    				current = grammarAccess.getDirectionTypeAccess().getBEHINDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getDirectionTypeAccess().getBEHINDEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalDrn.g:4796:3: (enumLiteral_2= 'LEFT' )
                    {
                    // InternalDrn.g:4796:3: (enumLiteral_2= 'LEFT' )
                    // InternalDrn.g:4797:4: enumLiteral_2= 'LEFT'
                    {
                    enumLiteral_2=(Token)match(input,81,FOLLOW_2); 

                    				current = grammarAccess.getDirectionTypeAccess().getLEFTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getDirectionTypeAccess().getLEFTEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalDrn.g:4804:3: (enumLiteral_3= 'RIGHT' )
                    {
                    // InternalDrn.g:4804:3: (enumLiteral_3= 'RIGHT' )
                    // InternalDrn.g:4805:4: enumLiteral_3= 'RIGHT'
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


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0080000000020020L,0x0000000000000008L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0080000000022020L,0x0000000000000008L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000001FC0000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000001FD0000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000000L,0x0000000000078000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0077F5FCA4000020L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0077F5FCA4010020L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0200000002000002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0077F5FCA0000020L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x000485FC80000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000050000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000020L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0xA000000000000020L,0x0000000000000002L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001800L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000000000L,0x00000000000007C0L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0800000010000010L,0x0000000000007820L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});

}