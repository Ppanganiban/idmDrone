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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'MODEL'", "'{'", "'start'", "'='", "';'", "'}'", "'CONTEXT'", "'initialDirection'", "'positionX'", "'positionY'", "'maxLength'", "'maxWidth'", "'maxSpeed'", "'maxHeigth'", "'('", "','", "')'", "'X'", "'then'", "'merge'", "'forward'", "'distance'", "'temps'", "'backward'", "'left'", "'right'", "'up'", "'down'", "'depXY'", "'cercleXY'", "'rayon'", "'carreXY'", "'cote'", "'depYZ'", "'cercleYZ'", "'carreYZ'", "'depXZ'", "'depXYZ'", "'flip'", "'rotate'", "'angle'", "'wait'", "'takeoff'", "'land'", "'DEVICE'", "'type'", "'with'", "'mode'", "'attribute'", "'.'", "'led'", "'color'", "'ledBlink'", "'blink_per_sec'", "'camera'", "'Type'", "'element'", "'-'", "'BLUE'", "'RED'", "'YELLOW'", "'GREEN'", "'WHITE'", "'OFF'", "'ON'", "'FRONT'", "'BEHIND'", "'LEFT'", "'RIGHT'"
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

                if ( (LA2_0==66) ) {
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
    // InternalDrn.g:509:1: ruleInitialPositionX returns [EObject current=null] : ( ( (lv_name_0_0= 'positionX' ) ) otherlv_1= '=' ( (lv_value_2_0= ruleEInt ) ) ) ;
    public final EObject ruleInitialPositionX() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalDrn.g:515:2: ( ( ( (lv_name_0_0= 'positionX' ) ) otherlv_1= '=' ( (lv_value_2_0= ruleEInt ) ) ) )
            // InternalDrn.g:516:2: ( ( (lv_name_0_0= 'positionX' ) ) otherlv_1= '=' ( (lv_value_2_0= ruleEInt ) ) )
            {
            // InternalDrn.g:516:2: ( ( (lv_name_0_0= 'positionX' ) ) otherlv_1= '=' ( (lv_value_2_0= ruleEInt ) ) )
            // InternalDrn.g:517:3: ( (lv_name_0_0= 'positionX' ) ) otherlv_1= '=' ( (lv_value_2_0= ruleEInt ) )
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
            		
            // InternalDrn.g:535:3: ( (lv_value_2_0= ruleEInt ) )
            // InternalDrn.g:536:4: (lv_value_2_0= ruleEInt )
            {
            // InternalDrn.g:536:4: (lv_value_2_0= ruleEInt )
            // InternalDrn.g:537:5: lv_value_2_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getInitialPositionXAccess().getValueEIntParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_2_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInitialPositionXRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_2_0,
            						"sar.drone.Drn.EInt");
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
    // $ANTLR end "ruleInitialPositionX"


    // $ANTLR start "entryRuleInitialPositionY"
    // InternalDrn.g:558:1: entryRuleInitialPositionY returns [EObject current=null] : iv_ruleInitialPositionY= ruleInitialPositionY EOF ;
    public final EObject entryRuleInitialPositionY() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInitialPositionY = null;


        try {
            // InternalDrn.g:558:57: (iv_ruleInitialPositionY= ruleInitialPositionY EOF )
            // InternalDrn.g:559:2: iv_ruleInitialPositionY= ruleInitialPositionY EOF
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
    // InternalDrn.g:565:1: ruleInitialPositionY returns [EObject current=null] : ( ( (lv_name_0_0= 'positionY' ) ) otherlv_1= '=' ( (lv_value_2_0= ruleEInt ) ) ) ;
    public final EObject ruleInitialPositionY() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalDrn.g:571:2: ( ( ( (lv_name_0_0= 'positionY' ) ) otherlv_1= '=' ( (lv_value_2_0= ruleEInt ) ) ) )
            // InternalDrn.g:572:2: ( ( (lv_name_0_0= 'positionY' ) ) otherlv_1= '=' ( (lv_value_2_0= ruleEInt ) ) )
            {
            // InternalDrn.g:572:2: ( ( (lv_name_0_0= 'positionY' ) ) otherlv_1= '=' ( (lv_value_2_0= ruleEInt ) ) )
            // InternalDrn.g:573:3: ( (lv_name_0_0= 'positionY' ) ) otherlv_1= '=' ( (lv_value_2_0= ruleEInt ) )
            {
            // InternalDrn.g:573:3: ( (lv_name_0_0= 'positionY' ) )
            // InternalDrn.g:574:4: (lv_name_0_0= 'positionY' )
            {
            // InternalDrn.g:574:4: (lv_name_0_0= 'positionY' )
            // InternalDrn.g:575:5: lv_name_0_0= 'positionY'
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
            		
            // InternalDrn.g:591:3: ( (lv_value_2_0= ruleEInt ) )
            // InternalDrn.g:592:4: (lv_value_2_0= ruleEInt )
            {
            // InternalDrn.g:592:4: (lv_value_2_0= ruleEInt )
            // InternalDrn.g:593:5: lv_value_2_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getInitialPositionYAccess().getValueEIntParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_2_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInitialPositionYRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_2_0,
            						"sar.drone.Drn.EInt");
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
    // $ANTLR end "ruleInitialPositionY"


    // $ANTLR start "entryRuleMaxLength"
    // InternalDrn.g:614:1: entryRuleMaxLength returns [EObject current=null] : iv_ruleMaxLength= ruleMaxLength EOF ;
    public final EObject entryRuleMaxLength() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMaxLength = null;


        try {
            // InternalDrn.g:614:50: (iv_ruleMaxLength= ruleMaxLength EOF )
            // InternalDrn.g:615:2: iv_ruleMaxLength= ruleMaxLength EOF
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
    // InternalDrn.g:621:1: ruleMaxLength returns [EObject current=null] : ( ( (lv_name_0_0= 'maxLength' ) ) otherlv_1= '=' ( (lv_value_2_0= ruleEInt ) ) ) ;
    public final EObject ruleMaxLength() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalDrn.g:627:2: ( ( ( (lv_name_0_0= 'maxLength' ) ) otherlv_1= '=' ( (lv_value_2_0= ruleEInt ) ) ) )
            // InternalDrn.g:628:2: ( ( (lv_name_0_0= 'maxLength' ) ) otherlv_1= '=' ( (lv_value_2_0= ruleEInt ) ) )
            {
            // InternalDrn.g:628:2: ( ( (lv_name_0_0= 'maxLength' ) ) otherlv_1= '=' ( (lv_value_2_0= ruleEInt ) ) )
            // InternalDrn.g:629:3: ( (lv_name_0_0= 'maxLength' ) ) otherlv_1= '=' ( (lv_value_2_0= ruleEInt ) )
            {
            // InternalDrn.g:629:3: ( (lv_name_0_0= 'maxLength' ) )
            // InternalDrn.g:630:4: (lv_name_0_0= 'maxLength' )
            {
            // InternalDrn.g:630:4: (lv_name_0_0= 'maxLength' )
            // InternalDrn.g:631:5: lv_name_0_0= 'maxLength'
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
            		
            // InternalDrn.g:647:3: ( (lv_value_2_0= ruleEInt ) )
            // InternalDrn.g:648:4: (lv_value_2_0= ruleEInt )
            {
            // InternalDrn.g:648:4: (lv_value_2_0= ruleEInt )
            // InternalDrn.g:649:5: lv_value_2_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getMaxLengthAccess().getValueEIntParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_2_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMaxLengthRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_2_0,
            						"sar.drone.Drn.EInt");
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
    // $ANTLR end "ruleMaxLength"


    // $ANTLR start "entryRuleMaxWidth"
    // InternalDrn.g:670:1: entryRuleMaxWidth returns [EObject current=null] : iv_ruleMaxWidth= ruleMaxWidth EOF ;
    public final EObject entryRuleMaxWidth() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMaxWidth = null;


        try {
            // InternalDrn.g:670:49: (iv_ruleMaxWidth= ruleMaxWidth EOF )
            // InternalDrn.g:671:2: iv_ruleMaxWidth= ruleMaxWidth EOF
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
    // InternalDrn.g:677:1: ruleMaxWidth returns [EObject current=null] : ( ( (lv_name_0_0= 'maxWidth' ) ) otherlv_1= '=' ( (lv_value_2_0= ruleEInt ) ) ) ;
    public final EObject ruleMaxWidth() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalDrn.g:683:2: ( ( ( (lv_name_0_0= 'maxWidth' ) ) otherlv_1= '=' ( (lv_value_2_0= ruleEInt ) ) ) )
            // InternalDrn.g:684:2: ( ( (lv_name_0_0= 'maxWidth' ) ) otherlv_1= '=' ( (lv_value_2_0= ruleEInt ) ) )
            {
            // InternalDrn.g:684:2: ( ( (lv_name_0_0= 'maxWidth' ) ) otherlv_1= '=' ( (lv_value_2_0= ruleEInt ) ) )
            // InternalDrn.g:685:3: ( (lv_name_0_0= 'maxWidth' ) ) otherlv_1= '=' ( (lv_value_2_0= ruleEInt ) )
            {
            // InternalDrn.g:685:3: ( (lv_name_0_0= 'maxWidth' ) )
            // InternalDrn.g:686:4: (lv_name_0_0= 'maxWidth' )
            {
            // InternalDrn.g:686:4: (lv_name_0_0= 'maxWidth' )
            // InternalDrn.g:687:5: lv_name_0_0= 'maxWidth'
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
            		
            // InternalDrn.g:703:3: ( (lv_value_2_0= ruleEInt ) )
            // InternalDrn.g:704:4: (lv_value_2_0= ruleEInt )
            {
            // InternalDrn.g:704:4: (lv_value_2_0= ruleEInt )
            // InternalDrn.g:705:5: lv_value_2_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getMaxWidthAccess().getValueEIntParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_2_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMaxWidthRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_2_0,
            						"sar.drone.Drn.EInt");
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
    // $ANTLR end "ruleMaxWidth"


    // $ANTLR start "entryRuleMaxSpeed"
    // InternalDrn.g:726:1: entryRuleMaxSpeed returns [EObject current=null] : iv_ruleMaxSpeed= ruleMaxSpeed EOF ;
    public final EObject entryRuleMaxSpeed() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMaxSpeed = null;


        try {
            // InternalDrn.g:726:49: (iv_ruleMaxSpeed= ruleMaxSpeed EOF )
            // InternalDrn.g:727:2: iv_ruleMaxSpeed= ruleMaxSpeed EOF
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
    // InternalDrn.g:733:1: ruleMaxSpeed returns [EObject current=null] : ( ( (lv_name_0_0= 'maxSpeed' ) ) otherlv_1= '=' ( (lv_value_2_0= ruleEInt ) ) ) ;
    public final EObject ruleMaxSpeed() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalDrn.g:739:2: ( ( ( (lv_name_0_0= 'maxSpeed' ) ) otherlv_1= '=' ( (lv_value_2_0= ruleEInt ) ) ) )
            // InternalDrn.g:740:2: ( ( (lv_name_0_0= 'maxSpeed' ) ) otherlv_1= '=' ( (lv_value_2_0= ruleEInt ) ) )
            {
            // InternalDrn.g:740:2: ( ( (lv_name_0_0= 'maxSpeed' ) ) otherlv_1= '=' ( (lv_value_2_0= ruleEInt ) ) )
            // InternalDrn.g:741:3: ( (lv_name_0_0= 'maxSpeed' ) ) otherlv_1= '=' ( (lv_value_2_0= ruleEInt ) )
            {
            // InternalDrn.g:741:3: ( (lv_name_0_0= 'maxSpeed' ) )
            // InternalDrn.g:742:4: (lv_name_0_0= 'maxSpeed' )
            {
            // InternalDrn.g:742:4: (lv_name_0_0= 'maxSpeed' )
            // InternalDrn.g:743:5: lv_name_0_0= 'maxSpeed'
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
            		
            // InternalDrn.g:759:3: ( (lv_value_2_0= ruleEInt ) )
            // InternalDrn.g:760:4: (lv_value_2_0= ruleEInt )
            {
            // InternalDrn.g:760:4: (lv_value_2_0= ruleEInt )
            // InternalDrn.g:761:5: lv_value_2_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getMaxSpeedAccess().getValueEIntParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_2_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMaxSpeedRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_2_0,
            						"sar.drone.Drn.EInt");
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
    // $ANTLR end "ruleMaxSpeed"


    // $ANTLR start "entryRuleMaxHeigth"
    // InternalDrn.g:782:1: entryRuleMaxHeigth returns [EObject current=null] : iv_ruleMaxHeigth= ruleMaxHeigth EOF ;
    public final EObject entryRuleMaxHeigth() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMaxHeigth = null;


        try {
            // InternalDrn.g:782:50: (iv_ruleMaxHeigth= ruleMaxHeigth EOF )
            // InternalDrn.g:783:2: iv_ruleMaxHeigth= ruleMaxHeigth EOF
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
    // InternalDrn.g:789:1: ruleMaxHeigth returns [EObject current=null] : ( ( (lv_name_0_0= 'maxHeigth' ) ) otherlv_1= '=' ( (lv_value_2_0= ruleEInt ) ) ) ;
    public final EObject ruleMaxHeigth() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalDrn.g:795:2: ( ( ( (lv_name_0_0= 'maxHeigth' ) ) otherlv_1= '=' ( (lv_value_2_0= ruleEInt ) ) ) )
            // InternalDrn.g:796:2: ( ( (lv_name_0_0= 'maxHeigth' ) ) otherlv_1= '=' ( (lv_value_2_0= ruleEInt ) ) )
            {
            // InternalDrn.g:796:2: ( ( (lv_name_0_0= 'maxHeigth' ) ) otherlv_1= '=' ( (lv_value_2_0= ruleEInt ) ) )
            // InternalDrn.g:797:3: ( (lv_name_0_0= 'maxHeigth' ) ) otherlv_1= '=' ( (lv_value_2_0= ruleEInt ) )
            {
            // InternalDrn.g:797:3: ( (lv_name_0_0= 'maxHeigth' ) )
            // InternalDrn.g:798:4: (lv_name_0_0= 'maxHeigth' )
            {
            // InternalDrn.g:798:4: (lv_name_0_0= 'maxHeigth' )
            // InternalDrn.g:799:5: lv_name_0_0= 'maxHeigth'
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
            		
            // InternalDrn.g:815:3: ( (lv_value_2_0= ruleEInt ) )
            // InternalDrn.g:816:4: (lv_value_2_0= ruleEInt )
            {
            // InternalDrn.g:816:4: (lv_value_2_0= ruleEInt )
            // InternalDrn.g:817:5: lv_value_2_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getMaxHeigthAccess().getValueEIntParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_2_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMaxHeigthRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_2_0,
            						"sar.drone.Drn.EInt");
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
    // $ANTLR end "ruleMaxHeigth"


    // $ANTLR start "entryRuleAssignement"
    // InternalDrn.g:838:1: entryRuleAssignement returns [EObject current=null] : iv_ruleAssignement= ruleAssignement EOF ;
    public final EObject entryRuleAssignement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignement = null;


        try {
            // InternalDrn.g:838:52: (iv_ruleAssignement= ruleAssignement EOF )
            // InternalDrn.g:839:2: iv_ruleAssignement= ruleAssignement EOF
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
    // InternalDrn.g:845:1: ruleAssignement returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_parametre_2_0= ruleParametre ) ) (otherlv_3= ',' ( (lv_parametre_4_0= ruleParametre ) ) )* )? otherlv_5= ')' otherlv_6= '{' ( (lv_operandes_7_0= ruleExpression ) ) otherlv_8= ';' ( ( (lv_operandes_9_0= ruleExpression ) ) otherlv_10= ';' )* otherlv_11= '}' ) ;
    public final EObject ruleAssignement() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        EObject lv_parametre_2_0 = null;

        EObject lv_parametre_4_0 = null;

        EObject lv_operandes_7_0 = null;

        EObject lv_operandes_9_0 = null;



        	enterRule();

        try {
            // InternalDrn.g:851:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_parametre_2_0= ruleParametre ) ) (otherlv_3= ',' ( (lv_parametre_4_0= ruleParametre ) ) )* )? otherlv_5= ')' otherlv_6= '{' ( (lv_operandes_7_0= ruleExpression ) ) otherlv_8= ';' ( ( (lv_operandes_9_0= ruleExpression ) ) otherlv_10= ';' )* otherlv_11= '}' ) )
            // InternalDrn.g:852:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_parametre_2_0= ruleParametre ) ) (otherlv_3= ',' ( (lv_parametre_4_0= ruleParametre ) ) )* )? otherlv_5= ')' otherlv_6= '{' ( (lv_operandes_7_0= ruleExpression ) ) otherlv_8= ';' ( ( (lv_operandes_9_0= ruleExpression ) ) otherlv_10= ';' )* otherlv_11= '}' )
            {
            // InternalDrn.g:852:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_parametre_2_0= ruleParametre ) ) (otherlv_3= ',' ( (lv_parametre_4_0= ruleParametre ) ) )* )? otherlv_5= ')' otherlv_6= '{' ( (lv_operandes_7_0= ruleExpression ) ) otherlv_8= ';' ( ( (lv_operandes_9_0= ruleExpression ) ) otherlv_10= ';' )* otherlv_11= '}' )
            // InternalDrn.g:853:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_parametre_2_0= ruleParametre ) ) (otherlv_3= ',' ( (lv_parametre_4_0= ruleParametre ) ) )* )? otherlv_5= ')' otherlv_6= '{' ( (lv_operandes_7_0= ruleExpression ) ) otherlv_8= ';' ( ( (lv_operandes_9_0= ruleExpression ) ) otherlv_10= ';' )* otherlv_11= '}'
            {
            // InternalDrn.g:853:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalDrn.g:854:4: (lv_name_0_0= RULE_ID )
            {
            // InternalDrn.g:854:4: (lv_name_0_0= RULE_ID )
            // InternalDrn.g:855:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_14); 

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

            otherlv_1=(Token)match(input,25,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getAssignementAccess().getLeftParenthesisKeyword_1());
            		
            // InternalDrn.g:875:3: ( ( (lv_parametre_2_0= ruleParametre ) ) (otherlv_3= ',' ( (lv_parametre_4_0= ruleParametre ) ) )* )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalDrn.g:876:4: ( (lv_parametre_2_0= ruleParametre ) ) (otherlv_3= ',' ( (lv_parametre_4_0= ruleParametre ) ) )*
                    {
                    // InternalDrn.g:876:4: ( (lv_parametre_2_0= ruleParametre ) )
                    // InternalDrn.g:877:5: (lv_parametre_2_0= ruleParametre )
                    {
                    // InternalDrn.g:877:5: (lv_parametre_2_0= ruleParametre )
                    // InternalDrn.g:878:6: lv_parametre_2_0= ruleParametre
                    {

                    						newCompositeNode(grammarAccess.getAssignementAccess().getParametreParametreParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_parametre_2_0=ruleParametre();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAssignementRule());
                    						}
                    						add(
                    							current,
                    							"parametre",
                    							lv_parametre_2_0,
                    							"sar.drone.Drn.Parametre");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDrn.g:895:4: (otherlv_3= ',' ( (lv_parametre_4_0= ruleParametre ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==26) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalDrn.g:896:5: otherlv_3= ',' ( (lv_parametre_4_0= ruleParametre ) )
                    	    {
                    	    otherlv_3=(Token)match(input,26,FOLLOW_7); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getAssignementAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalDrn.g:900:5: ( (lv_parametre_4_0= ruleParametre ) )
                    	    // InternalDrn.g:901:6: (lv_parametre_4_0= ruleParametre )
                    	    {
                    	    // InternalDrn.g:901:6: (lv_parametre_4_0= ruleParametre )
                    	    // InternalDrn.g:902:7: lv_parametre_4_0= ruleParametre
                    	    {

                    	    							newCompositeNode(grammarAccess.getAssignementAccess().getParametreParametreParserRuleCall_2_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_16);
                    	    lv_parametre_4_0=ruleParametre();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getAssignementRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parametre",
                    	    								lv_parametre_4_0,
                    	    								"sar.drone.Drn.Parametre");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,27,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getAssignementAccess().getRightParenthesisKeyword_3());
            		
            otherlv_6=(Token)match(input,12,FOLLOW_17); 

            			newLeafNode(otherlv_6, grammarAccess.getAssignementAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalDrn.g:929:3: ( (lv_operandes_7_0= ruleExpression ) )
            // InternalDrn.g:930:4: (lv_operandes_7_0= ruleExpression )
            {
            // InternalDrn.g:930:4: (lv_operandes_7_0= ruleExpression )
            // InternalDrn.g:931:5: lv_operandes_7_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getAssignementAccess().getOperandesExpressionParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_8);
            lv_operandes_7_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAssignementRule());
            					}
            					add(
            						current,
            						"operandes",
            						lv_operandes_7_0,
            						"sar.drone.Drn.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,15,FOLLOW_18); 

            			newLeafNode(otherlv_8, grammarAccess.getAssignementAccess().getSemicolonKeyword_6());
            		
            // InternalDrn.g:952:3: ( ( (lv_operandes_9_0= ruleExpression ) ) otherlv_10= ';' )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID||LA11_0==25||(LA11_0>=30 && LA11_0<=31)||(LA11_0>=34 && LA11_0<=40)||LA11_0==42||(LA11_0>=44 && LA11_0<=50)||(LA11_0>=52 && LA11_0<=54)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalDrn.g:953:4: ( (lv_operandes_9_0= ruleExpression ) ) otherlv_10= ';'
            	    {
            	    // InternalDrn.g:953:4: ( (lv_operandes_9_0= ruleExpression ) )
            	    // InternalDrn.g:954:5: (lv_operandes_9_0= ruleExpression )
            	    {
            	    // InternalDrn.g:954:5: (lv_operandes_9_0= ruleExpression )
            	    // InternalDrn.g:955:6: lv_operandes_9_0= ruleExpression
            	    {

            	    						newCompositeNode(grammarAccess.getAssignementAccess().getOperandesExpressionParserRuleCall_7_0_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_operandes_9_0=ruleExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAssignementRule());
            	    						}
            	    						add(
            	    							current,
            	    							"operandes",
            	    							lv_operandes_9_0,
            	    							"sar.drone.Drn.Expression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_10=(Token)match(input,15,FOLLOW_18); 

            	    				newLeafNode(otherlv_10, grammarAccess.getAssignementAccess().getSemicolonKeyword_7_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            otherlv_11=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getAssignementAccess().getRightCurlyBracketKeyword_8());
            		

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


    // $ANTLR start "entryRuleParametre"
    // InternalDrn.g:985:1: entryRuleParametre returns [EObject current=null] : iv_ruleParametre= ruleParametre EOF ;
    public final EObject entryRuleParametre() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParametre = null;


        try {
            // InternalDrn.g:985:50: (iv_ruleParametre= ruleParametre EOF )
            // InternalDrn.g:986:2: iv_ruleParametre= ruleParametre EOF
            {
             newCompositeNode(grammarAccess.getParametreRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParametre=ruleParametre();

            state._fsp--;

             current =iv_ruleParametre; 
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
    // $ANTLR end "entryRuleParametre"


    // $ANTLR start "ruleParametre"
    // InternalDrn.g:992:1: ruleParametre returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleParametre() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalDrn.g:998:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalDrn.g:999:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalDrn.g:999:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalDrn.g:1000:3: (lv_name_0_0= RULE_ID )
            {
            // InternalDrn.g:1000:3: (lv_name_0_0= RULE_ID )
            // InternalDrn.g:1001:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getParametreAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getParametreRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

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
    // $ANTLR end "ruleParametre"


    // $ANTLR start "entryRuleExpression"
    // InternalDrn.g:1020:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalDrn.g:1020:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalDrn.g:1021:2: iv_ruleExpression= ruleExpression EOF
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
    // InternalDrn.g:1027:1: ruleExpression returns [EObject current=null] : ( ( (this_And_0= ruleAnd | this_RefPart_1= ruleRefPart | this_DepX_Impl_2= ruleDepX_Impl | this_DepY_Impl_3= ruleDepY_Impl | this_DepZ_Impl_4= ruleDepZ_Impl | this_DepXY_IMPL_5= ruleDepXY_IMPL | this_DepXZ_IMPL_6= ruleDepXZ_IMPL | this_DepYZ_IMPL_7= ruleDepYZ_IMPL | this_DepXYZ_IMPL_8= ruleDepXYZ_IMPL | this_TakeOff_9= ruleTakeOff | this_Wait_10= ruleWait | this_Rotate_11= ruleRotate | this_Land_12= ruleLand ) (otherlv_13= 'X' ( ( (lv_repeatCST_14_0= ruleEInt ) ) | ( (otherlv_15= RULE_ID ) ) ) )? ( (lv_with_16_0= ruleWith ) )? ) | (otherlv_17= '(' (this_And_18= ruleAnd | this_RefPart_19= ruleRefPart | this_DepX_Impl_20= ruleDepX_Impl | this_DepY_Impl_21= ruleDepY_Impl | this_DepZ_Impl_22= ruleDepZ_Impl | this_DepXY_IMPL_23= ruleDepXY_IMPL | this_DepXZ_IMPL_24= ruleDepXZ_IMPL | this_DepYZ_IMPL_25= ruleDepYZ_IMPL | this_DepXYZ_IMPL_26= ruleDepXYZ_IMPL | this_TakeOff_27= ruleTakeOff | this_Wait_28= ruleWait | this_Rotate_29= ruleRotate | this_Land_30= ruleLand ) (otherlv_31= 'then' ( (lv_then_32_0= ruleExpression ) ) ) (otherlv_33= 'then' ( (lv_then_34_0= ruleExpression ) ) )* otherlv_35= ')' (otherlv_36= 'X' ( ( (lv_repeatCST_37_0= ruleEInt ) ) | ( (otherlv_38= RULE_ID ) ) ) )? ( (lv_with_39_0= ruleWith ) )? ) ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_31=null;
        Token otherlv_33=null;
        Token otherlv_35=null;
        Token otherlv_36=null;
        Token otherlv_38=null;
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

        AntlrDatatypeRuleToken lv_repeatCST_14_0 = null;

        EObject lv_with_16_0 = null;

        EObject this_And_18 = null;

        EObject this_RefPart_19 = null;

        EObject this_DepX_Impl_20 = null;

        EObject this_DepY_Impl_21 = null;

        EObject this_DepZ_Impl_22 = null;

        EObject this_DepXY_IMPL_23 = null;

        EObject this_DepXZ_IMPL_24 = null;

        EObject this_DepYZ_IMPL_25 = null;

        EObject this_DepXYZ_IMPL_26 = null;

        EObject this_TakeOff_27 = null;

        EObject this_Wait_28 = null;

        EObject this_Rotate_29 = null;

        EObject this_Land_30 = null;

        EObject lv_then_32_0 = null;

        EObject lv_then_34_0 = null;

        AntlrDatatypeRuleToken lv_repeatCST_37_0 = null;

        EObject lv_with_39_0 = null;



        	enterRule();

        try {
            // InternalDrn.g:1033:2: ( ( ( (this_And_0= ruleAnd | this_RefPart_1= ruleRefPart | this_DepX_Impl_2= ruleDepX_Impl | this_DepY_Impl_3= ruleDepY_Impl | this_DepZ_Impl_4= ruleDepZ_Impl | this_DepXY_IMPL_5= ruleDepXY_IMPL | this_DepXZ_IMPL_6= ruleDepXZ_IMPL | this_DepYZ_IMPL_7= ruleDepYZ_IMPL | this_DepXYZ_IMPL_8= ruleDepXYZ_IMPL | this_TakeOff_9= ruleTakeOff | this_Wait_10= ruleWait | this_Rotate_11= ruleRotate | this_Land_12= ruleLand ) (otherlv_13= 'X' ( ( (lv_repeatCST_14_0= ruleEInt ) ) | ( (otherlv_15= RULE_ID ) ) ) )? ( (lv_with_16_0= ruleWith ) )? ) | (otherlv_17= '(' (this_And_18= ruleAnd | this_RefPart_19= ruleRefPart | this_DepX_Impl_20= ruleDepX_Impl | this_DepY_Impl_21= ruleDepY_Impl | this_DepZ_Impl_22= ruleDepZ_Impl | this_DepXY_IMPL_23= ruleDepXY_IMPL | this_DepXZ_IMPL_24= ruleDepXZ_IMPL | this_DepYZ_IMPL_25= ruleDepYZ_IMPL | this_DepXYZ_IMPL_26= ruleDepXYZ_IMPL | this_TakeOff_27= ruleTakeOff | this_Wait_28= ruleWait | this_Rotate_29= ruleRotate | this_Land_30= ruleLand ) (otherlv_31= 'then' ( (lv_then_32_0= ruleExpression ) ) ) (otherlv_33= 'then' ( (lv_then_34_0= ruleExpression ) ) )* otherlv_35= ')' (otherlv_36= 'X' ( ( (lv_repeatCST_37_0= ruleEInt ) ) | ( (otherlv_38= RULE_ID ) ) ) )? ( (lv_with_39_0= ruleWith ) )? ) ) )
            // InternalDrn.g:1034:2: ( ( (this_And_0= ruleAnd | this_RefPart_1= ruleRefPart | this_DepX_Impl_2= ruleDepX_Impl | this_DepY_Impl_3= ruleDepY_Impl | this_DepZ_Impl_4= ruleDepZ_Impl | this_DepXY_IMPL_5= ruleDepXY_IMPL | this_DepXZ_IMPL_6= ruleDepXZ_IMPL | this_DepYZ_IMPL_7= ruleDepYZ_IMPL | this_DepXYZ_IMPL_8= ruleDepXYZ_IMPL | this_TakeOff_9= ruleTakeOff | this_Wait_10= ruleWait | this_Rotate_11= ruleRotate | this_Land_12= ruleLand ) (otherlv_13= 'X' ( ( (lv_repeatCST_14_0= ruleEInt ) ) | ( (otherlv_15= RULE_ID ) ) ) )? ( (lv_with_16_0= ruleWith ) )? ) | (otherlv_17= '(' (this_And_18= ruleAnd | this_RefPart_19= ruleRefPart | this_DepX_Impl_20= ruleDepX_Impl | this_DepY_Impl_21= ruleDepY_Impl | this_DepZ_Impl_22= ruleDepZ_Impl | this_DepXY_IMPL_23= ruleDepXY_IMPL | this_DepXZ_IMPL_24= ruleDepXZ_IMPL | this_DepYZ_IMPL_25= ruleDepYZ_IMPL | this_DepXYZ_IMPL_26= ruleDepXYZ_IMPL | this_TakeOff_27= ruleTakeOff | this_Wait_28= ruleWait | this_Rotate_29= ruleRotate | this_Land_30= ruleLand ) (otherlv_31= 'then' ( (lv_then_32_0= ruleExpression ) ) ) (otherlv_33= 'then' ( (lv_then_34_0= ruleExpression ) ) )* otherlv_35= ')' (otherlv_36= 'X' ( ( (lv_repeatCST_37_0= ruleEInt ) ) | ( (otherlv_38= RULE_ID ) ) ) )? ( (lv_with_39_0= ruleWith ) )? ) )
            {
            // InternalDrn.g:1034:2: ( ( (this_And_0= ruleAnd | this_RefPart_1= ruleRefPart | this_DepX_Impl_2= ruleDepX_Impl | this_DepY_Impl_3= ruleDepY_Impl | this_DepZ_Impl_4= ruleDepZ_Impl | this_DepXY_IMPL_5= ruleDepXY_IMPL | this_DepXZ_IMPL_6= ruleDepXZ_IMPL | this_DepYZ_IMPL_7= ruleDepYZ_IMPL | this_DepXYZ_IMPL_8= ruleDepXYZ_IMPL | this_TakeOff_9= ruleTakeOff | this_Wait_10= ruleWait | this_Rotate_11= ruleRotate | this_Land_12= ruleLand ) (otherlv_13= 'X' ( ( (lv_repeatCST_14_0= ruleEInt ) ) | ( (otherlv_15= RULE_ID ) ) ) )? ( (lv_with_16_0= ruleWith ) )? ) | (otherlv_17= '(' (this_And_18= ruleAnd | this_RefPart_19= ruleRefPart | this_DepX_Impl_20= ruleDepX_Impl | this_DepY_Impl_21= ruleDepY_Impl | this_DepZ_Impl_22= ruleDepZ_Impl | this_DepXY_IMPL_23= ruleDepXY_IMPL | this_DepXZ_IMPL_24= ruleDepXZ_IMPL | this_DepYZ_IMPL_25= ruleDepYZ_IMPL | this_DepXYZ_IMPL_26= ruleDepXYZ_IMPL | this_TakeOff_27= ruleTakeOff | this_Wait_28= ruleWait | this_Rotate_29= ruleRotate | this_Land_30= ruleLand ) (otherlv_31= 'then' ( (lv_then_32_0= ruleExpression ) ) ) (otherlv_33= 'then' ( (lv_then_34_0= ruleExpression ) ) )* otherlv_35= ')' (otherlv_36= 'X' ( ( (lv_repeatCST_37_0= ruleEInt ) ) | ( (otherlv_38= RULE_ID ) ) ) )? ( (lv_with_39_0= ruleWith ) )? ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_ID||(LA21_0>=30 && LA21_0<=31)||(LA21_0>=34 && LA21_0<=40)||LA21_0==42||(LA21_0>=44 && LA21_0<=50)||(LA21_0>=52 && LA21_0<=54)) ) {
                alt21=1;
            }
            else if ( (LA21_0==25) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalDrn.g:1035:3: ( (this_And_0= ruleAnd | this_RefPart_1= ruleRefPart | this_DepX_Impl_2= ruleDepX_Impl | this_DepY_Impl_3= ruleDepY_Impl | this_DepZ_Impl_4= ruleDepZ_Impl | this_DepXY_IMPL_5= ruleDepXY_IMPL | this_DepXZ_IMPL_6= ruleDepXZ_IMPL | this_DepYZ_IMPL_7= ruleDepYZ_IMPL | this_DepXYZ_IMPL_8= ruleDepXYZ_IMPL | this_TakeOff_9= ruleTakeOff | this_Wait_10= ruleWait | this_Rotate_11= ruleRotate | this_Land_12= ruleLand ) (otherlv_13= 'X' ( ( (lv_repeatCST_14_0= ruleEInt ) ) | ( (otherlv_15= RULE_ID ) ) ) )? ( (lv_with_16_0= ruleWith ) )? )
                    {
                    // InternalDrn.g:1035:3: ( (this_And_0= ruleAnd | this_RefPart_1= ruleRefPart | this_DepX_Impl_2= ruleDepX_Impl | this_DepY_Impl_3= ruleDepY_Impl | this_DepZ_Impl_4= ruleDepZ_Impl | this_DepXY_IMPL_5= ruleDepXY_IMPL | this_DepXZ_IMPL_6= ruleDepXZ_IMPL | this_DepYZ_IMPL_7= ruleDepYZ_IMPL | this_DepXYZ_IMPL_8= ruleDepXYZ_IMPL | this_TakeOff_9= ruleTakeOff | this_Wait_10= ruleWait | this_Rotate_11= ruleRotate | this_Land_12= ruleLand ) (otherlv_13= 'X' ( ( (lv_repeatCST_14_0= ruleEInt ) ) | ( (otherlv_15= RULE_ID ) ) ) )? ( (lv_with_16_0= ruleWith ) )? )
                    // InternalDrn.g:1036:4: (this_And_0= ruleAnd | this_RefPart_1= ruleRefPart | this_DepX_Impl_2= ruleDepX_Impl | this_DepY_Impl_3= ruleDepY_Impl | this_DepZ_Impl_4= ruleDepZ_Impl | this_DepXY_IMPL_5= ruleDepXY_IMPL | this_DepXZ_IMPL_6= ruleDepXZ_IMPL | this_DepYZ_IMPL_7= ruleDepYZ_IMPL | this_DepXYZ_IMPL_8= ruleDepXYZ_IMPL | this_TakeOff_9= ruleTakeOff | this_Wait_10= ruleWait | this_Rotate_11= ruleRotate | this_Land_12= ruleLand ) (otherlv_13= 'X' ( ( (lv_repeatCST_14_0= ruleEInt ) ) | ( (otherlv_15= RULE_ID ) ) ) )? ( (lv_with_16_0= ruleWith ) )?
                    {
                    // InternalDrn.g:1036:4: (this_And_0= ruleAnd | this_RefPart_1= ruleRefPart | this_DepX_Impl_2= ruleDepX_Impl | this_DepY_Impl_3= ruleDepY_Impl | this_DepZ_Impl_4= ruleDepZ_Impl | this_DepXY_IMPL_5= ruleDepXY_IMPL | this_DepXZ_IMPL_6= ruleDepXZ_IMPL | this_DepYZ_IMPL_7= ruleDepYZ_IMPL | this_DepXYZ_IMPL_8= ruleDepXYZ_IMPL | this_TakeOff_9= ruleTakeOff | this_Wait_10= ruleWait | this_Rotate_11= ruleRotate | this_Land_12= ruleLand )
                    int alt12=13;
                    switch ( input.LA(1) ) {
                    case 30:
                        {
                        alt12=1;
                        }
                        break;
                    case RULE_ID:
                        {
                        alt12=2;
                        }
                        break;
                    case 35:
                    case 36:
                        {
                        alt12=3;
                        }
                        break;
                    case 31:
                    case 34:
                        {
                        alt12=4;
                        }
                        break;
                    case 37:
                    case 38:
                        {
                        alt12=5;
                        }
                        break;
                    case 39:
                    case 40:
                    case 42:
                        {
                        alt12=6;
                        }
                        break;
                    case 47:
                        {
                        alt12=7;
                        }
                        break;
                    case 44:
                    case 45:
                    case 46:
                        {
                        alt12=8;
                        }
                        break;
                    case 48:
                    case 49:
                        {
                        alt12=9;
                        }
                        break;
                    case 53:
                        {
                        alt12=10;
                        }
                        break;
                    case 52:
                        {
                        alt12=11;
                        }
                        break;
                    case 50:
                        {
                        alt12=12;
                        }
                        break;
                    case 54:
                        {
                        alt12=13;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 12, 0, input);

                        throw nvae;
                    }

                    switch (alt12) {
                        case 1 :
                            // InternalDrn.g:1037:5: this_And_0= ruleAnd
                            {

                            					newCompositeNode(grammarAccess.getExpressionAccess().getAndParserRuleCall_0_0_0());
                            				
                            pushFollow(FOLLOW_19);
                            this_And_0=ruleAnd();

                            state._fsp--;


                            					current = this_And_0;
                            					afterParserOrEnumRuleCall();
                            				

                            }
                            break;
                        case 2 :
                            // InternalDrn.g:1046:5: this_RefPart_1= ruleRefPart
                            {

                            					newCompositeNode(grammarAccess.getExpressionAccess().getRefPartParserRuleCall_0_0_1());
                            				
                            pushFollow(FOLLOW_19);
                            this_RefPart_1=ruleRefPart();

                            state._fsp--;


                            					current = this_RefPart_1;
                            					afterParserOrEnumRuleCall();
                            				

                            }
                            break;
                        case 3 :
                            // InternalDrn.g:1055:5: this_DepX_Impl_2= ruleDepX_Impl
                            {

                            					newCompositeNode(grammarAccess.getExpressionAccess().getDepX_ImplParserRuleCall_0_0_2());
                            				
                            pushFollow(FOLLOW_19);
                            this_DepX_Impl_2=ruleDepX_Impl();

                            state._fsp--;


                            					current = this_DepX_Impl_2;
                            					afterParserOrEnumRuleCall();
                            				

                            }
                            break;
                        case 4 :
                            // InternalDrn.g:1064:5: this_DepY_Impl_3= ruleDepY_Impl
                            {

                            					newCompositeNode(grammarAccess.getExpressionAccess().getDepY_ImplParserRuleCall_0_0_3());
                            				
                            pushFollow(FOLLOW_19);
                            this_DepY_Impl_3=ruleDepY_Impl();

                            state._fsp--;


                            					current = this_DepY_Impl_3;
                            					afterParserOrEnumRuleCall();
                            				

                            }
                            break;
                        case 5 :
                            // InternalDrn.g:1073:5: this_DepZ_Impl_4= ruleDepZ_Impl
                            {

                            					newCompositeNode(grammarAccess.getExpressionAccess().getDepZ_ImplParserRuleCall_0_0_4());
                            				
                            pushFollow(FOLLOW_19);
                            this_DepZ_Impl_4=ruleDepZ_Impl();

                            state._fsp--;


                            					current = this_DepZ_Impl_4;
                            					afterParserOrEnumRuleCall();
                            				

                            }
                            break;
                        case 6 :
                            // InternalDrn.g:1082:5: this_DepXY_IMPL_5= ruleDepXY_IMPL
                            {

                            					newCompositeNode(grammarAccess.getExpressionAccess().getDepXY_IMPLParserRuleCall_0_0_5());
                            				
                            pushFollow(FOLLOW_19);
                            this_DepXY_IMPL_5=ruleDepXY_IMPL();

                            state._fsp--;


                            					current = this_DepXY_IMPL_5;
                            					afterParserOrEnumRuleCall();
                            				

                            }
                            break;
                        case 7 :
                            // InternalDrn.g:1091:5: this_DepXZ_IMPL_6= ruleDepXZ_IMPL
                            {

                            					newCompositeNode(grammarAccess.getExpressionAccess().getDepXZ_IMPLParserRuleCall_0_0_6());
                            				
                            pushFollow(FOLLOW_19);
                            this_DepXZ_IMPL_6=ruleDepXZ_IMPL();

                            state._fsp--;


                            					current = this_DepXZ_IMPL_6;
                            					afterParserOrEnumRuleCall();
                            				

                            }
                            break;
                        case 8 :
                            // InternalDrn.g:1100:5: this_DepYZ_IMPL_7= ruleDepYZ_IMPL
                            {

                            					newCompositeNode(grammarAccess.getExpressionAccess().getDepYZ_IMPLParserRuleCall_0_0_7());
                            				
                            pushFollow(FOLLOW_19);
                            this_DepYZ_IMPL_7=ruleDepYZ_IMPL();

                            state._fsp--;


                            					current = this_DepYZ_IMPL_7;
                            					afterParserOrEnumRuleCall();
                            				

                            }
                            break;
                        case 9 :
                            // InternalDrn.g:1109:5: this_DepXYZ_IMPL_8= ruleDepXYZ_IMPL
                            {

                            					newCompositeNode(grammarAccess.getExpressionAccess().getDepXYZ_IMPLParserRuleCall_0_0_8());
                            				
                            pushFollow(FOLLOW_19);
                            this_DepXYZ_IMPL_8=ruleDepXYZ_IMPL();

                            state._fsp--;


                            					current = this_DepXYZ_IMPL_8;
                            					afterParserOrEnumRuleCall();
                            				

                            }
                            break;
                        case 10 :
                            // InternalDrn.g:1118:5: this_TakeOff_9= ruleTakeOff
                            {

                            					newCompositeNode(grammarAccess.getExpressionAccess().getTakeOffParserRuleCall_0_0_9());
                            				
                            pushFollow(FOLLOW_19);
                            this_TakeOff_9=ruleTakeOff();

                            state._fsp--;


                            					current = this_TakeOff_9;
                            					afterParserOrEnumRuleCall();
                            				

                            }
                            break;
                        case 11 :
                            // InternalDrn.g:1127:5: this_Wait_10= ruleWait
                            {

                            					newCompositeNode(grammarAccess.getExpressionAccess().getWaitParserRuleCall_0_0_10());
                            				
                            pushFollow(FOLLOW_19);
                            this_Wait_10=ruleWait();

                            state._fsp--;


                            					current = this_Wait_10;
                            					afterParserOrEnumRuleCall();
                            				

                            }
                            break;
                        case 12 :
                            // InternalDrn.g:1136:5: this_Rotate_11= ruleRotate
                            {

                            					newCompositeNode(grammarAccess.getExpressionAccess().getRotateParserRuleCall_0_0_11());
                            				
                            pushFollow(FOLLOW_19);
                            this_Rotate_11=ruleRotate();

                            state._fsp--;


                            					current = this_Rotate_11;
                            					afterParserOrEnumRuleCall();
                            				

                            }
                            break;
                        case 13 :
                            // InternalDrn.g:1145:5: this_Land_12= ruleLand
                            {

                            					newCompositeNode(grammarAccess.getExpressionAccess().getLandParserRuleCall_0_0_12());
                            				
                            pushFollow(FOLLOW_19);
                            this_Land_12=ruleLand();

                            state._fsp--;


                            					current = this_Land_12;
                            					afterParserOrEnumRuleCall();
                            				

                            }
                            break;

                    }

                    // InternalDrn.g:1154:4: (otherlv_13= 'X' ( ( (lv_repeatCST_14_0= ruleEInt ) ) | ( (otherlv_15= RULE_ID ) ) ) )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==28) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // InternalDrn.g:1155:5: otherlv_13= 'X' ( ( (lv_repeatCST_14_0= ruleEInt ) ) | ( (otherlv_15= RULE_ID ) ) )
                            {
                            otherlv_13=(Token)match(input,28,FOLLOW_20); 

                            					newLeafNode(otherlv_13, grammarAccess.getExpressionAccess().getXKeyword_0_1_0());
                            				
                            // InternalDrn.g:1159:5: ( ( (lv_repeatCST_14_0= ruleEInt ) ) | ( (otherlv_15= RULE_ID ) ) )
                            int alt13=2;
                            int LA13_0 = input.LA(1);

                            if ( (LA13_0==RULE_INT||LA13_0==68) ) {
                                alt13=1;
                            }
                            else if ( (LA13_0==RULE_ID) ) {
                                alt13=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 13, 0, input);

                                throw nvae;
                            }
                            switch (alt13) {
                                case 1 :
                                    // InternalDrn.g:1160:6: ( (lv_repeatCST_14_0= ruleEInt ) )
                                    {
                                    // InternalDrn.g:1160:6: ( (lv_repeatCST_14_0= ruleEInt ) )
                                    // InternalDrn.g:1161:7: (lv_repeatCST_14_0= ruleEInt )
                                    {
                                    // InternalDrn.g:1161:7: (lv_repeatCST_14_0= ruleEInt )
                                    // InternalDrn.g:1162:8: lv_repeatCST_14_0= ruleEInt
                                    {

                                    								newCompositeNode(grammarAccess.getExpressionAccess().getRepeatCSTEIntParserRuleCall_0_1_1_0_0());
                                    							
                                    pushFollow(FOLLOW_21);
                                    lv_repeatCST_14_0=ruleEInt();

                                    state._fsp--;


                                    								if (current==null) {
                                    									current = createModelElementForParent(grammarAccess.getExpressionRule());
                                    								}
                                    								set(
                                    									current,
                                    									"repeatCST",
                                    									lv_repeatCST_14_0,
                                    									"sar.drone.Drn.EInt");
                                    								afterParserOrEnumRuleCall();
                                    							

                                    }


                                    }


                                    }
                                    break;
                                case 2 :
                                    // InternalDrn.g:1180:6: ( (otherlv_15= RULE_ID ) )
                                    {
                                    // InternalDrn.g:1180:6: ( (otherlv_15= RULE_ID ) )
                                    // InternalDrn.g:1181:7: (otherlv_15= RULE_ID )
                                    {
                                    // InternalDrn.g:1181:7: (otherlv_15= RULE_ID )
                                    // InternalDrn.g:1182:8: otherlv_15= RULE_ID
                                    {

                                    								if (current==null) {
                                    									current = createModelElement(grammarAccess.getExpressionRule());
                                    								}
                                    							
                                    otherlv_15=(Token)match(input,RULE_ID,FOLLOW_21); 

                                    								newLeafNode(otherlv_15, grammarAccess.getExpressionAccess().getRepeatVARParametreCrossReference_0_1_1_1_0());
                                    							

                                    }


                                    }


                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    // InternalDrn.g:1195:4: ( (lv_with_16_0= ruleWith ) )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==57) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // InternalDrn.g:1196:5: (lv_with_16_0= ruleWith )
                            {
                            // InternalDrn.g:1196:5: (lv_with_16_0= ruleWith )
                            // InternalDrn.g:1197:6: lv_with_16_0= ruleWith
                            {

                            						newCompositeNode(grammarAccess.getExpressionAccess().getWithWithParserRuleCall_0_2_0());
                            					
                            pushFollow(FOLLOW_2);
                            lv_with_16_0=ruleWith();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getExpressionRule());
                            						}
                            						add(
                            							current,
                            							"with",
                            							lv_with_16_0,
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
                    // InternalDrn.g:1216:3: (otherlv_17= '(' (this_And_18= ruleAnd | this_RefPart_19= ruleRefPart | this_DepX_Impl_20= ruleDepX_Impl | this_DepY_Impl_21= ruleDepY_Impl | this_DepZ_Impl_22= ruleDepZ_Impl | this_DepXY_IMPL_23= ruleDepXY_IMPL | this_DepXZ_IMPL_24= ruleDepXZ_IMPL | this_DepYZ_IMPL_25= ruleDepYZ_IMPL | this_DepXYZ_IMPL_26= ruleDepXYZ_IMPL | this_TakeOff_27= ruleTakeOff | this_Wait_28= ruleWait | this_Rotate_29= ruleRotate | this_Land_30= ruleLand ) (otherlv_31= 'then' ( (lv_then_32_0= ruleExpression ) ) ) (otherlv_33= 'then' ( (lv_then_34_0= ruleExpression ) ) )* otherlv_35= ')' (otherlv_36= 'X' ( ( (lv_repeatCST_37_0= ruleEInt ) ) | ( (otherlv_38= RULE_ID ) ) ) )? ( (lv_with_39_0= ruleWith ) )? )
                    {
                    // InternalDrn.g:1216:3: (otherlv_17= '(' (this_And_18= ruleAnd | this_RefPart_19= ruleRefPart | this_DepX_Impl_20= ruleDepX_Impl | this_DepY_Impl_21= ruleDepY_Impl | this_DepZ_Impl_22= ruleDepZ_Impl | this_DepXY_IMPL_23= ruleDepXY_IMPL | this_DepXZ_IMPL_24= ruleDepXZ_IMPL | this_DepYZ_IMPL_25= ruleDepYZ_IMPL | this_DepXYZ_IMPL_26= ruleDepXYZ_IMPL | this_TakeOff_27= ruleTakeOff | this_Wait_28= ruleWait | this_Rotate_29= ruleRotate | this_Land_30= ruleLand ) (otherlv_31= 'then' ( (lv_then_32_0= ruleExpression ) ) ) (otherlv_33= 'then' ( (lv_then_34_0= ruleExpression ) ) )* otherlv_35= ')' (otherlv_36= 'X' ( ( (lv_repeatCST_37_0= ruleEInt ) ) | ( (otherlv_38= RULE_ID ) ) ) )? ( (lv_with_39_0= ruleWith ) )? )
                    // InternalDrn.g:1217:4: otherlv_17= '(' (this_And_18= ruleAnd | this_RefPart_19= ruleRefPart | this_DepX_Impl_20= ruleDepX_Impl | this_DepY_Impl_21= ruleDepY_Impl | this_DepZ_Impl_22= ruleDepZ_Impl | this_DepXY_IMPL_23= ruleDepXY_IMPL | this_DepXZ_IMPL_24= ruleDepXZ_IMPL | this_DepYZ_IMPL_25= ruleDepYZ_IMPL | this_DepXYZ_IMPL_26= ruleDepXYZ_IMPL | this_TakeOff_27= ruleTakeOff | this_Wait_28= ruleWait | this_Rotate_29= ruleRotate | this_Land_30= ruleLand ) (otherlv_31= 'then' ( (lv_then_32_0= ruleExpression ) ) ) (otherlv_33= 'then' ( (lv_then_34_0= ruleExpression ) ) )* otherlv_35= ')' (otherlv_36= 'X' ( ( (lv_repeatCST_37_0= ruleEInt ) ) | ( (otherlv_38= RULE_ID ) ) ) )? ( (lv_with_39_0= ruleWith ) )?
                    {
                    otherlv_17=(Token)match(input,25,FOLLOW_22); 

                    				newLeafNode(otherlv_17, grammarAccess.getExpressionAccess().getLeftParenthesisKeyword_1_0());
                    			
                    // InternalDrn.g:1221:4: (this_And_18= ruleAnd | this_RefPart_19= ruleRefPart | this_DepX_Impl_20= ruleDepX_Impl | this_DepY_Impl_21= ruleDepY_Impl | this_DepZ_Impl_22= ruleDepZ_Impl | this_DepXY_IMPL_23= ruleDepXY_IMPL | this_DepXZ_IMPL_24= ruleDepXZ_IMPL | this_DepYZ_IMPL_25= ruleDepYZ_IMPL | this_DepXYZ_IMPL_26= ruleDepXYZ_IMPL | this_TakeOff_27= ruleTakeOff | this_Wait_28= ruleWait | this_Rotate_29= ruleRotate | this_Land_30= ruleLand )
                    int alt16=13;
                    switch ( input.LA(1) ) {
                    case 30:
                        {
                        alt16=1;
                        }
                        break;
                    case RULE_ID:
                        {
                        alt16=2;
                        }
                        break;
                    case 35:
                    case 36:
                        {
                        alt16=3;
                        }
                        break;
                    case 31:
                    case 34:
                        {
                        alt16=4;
                        }
                        break;
                    case 37:
                    case 38:
                        {
                        alt16=5;
                        }
                        break;
                    case 39:
                    case 40:
                    case 42:
                        {
                        alt16=6;
                        }
                        break;
                    case 47:
                        {
                        alt16=7;
                        }
                        break;
                    case 44:
                    case 45:
                    case 46:
                        {
                        alt16=8;
                        }
                        break;
                    case 48:
                    case 49:
                        {
                        alt16=9;
                        }
                        break;
                    case 53:
                        {
                        alt16=10;
                        }
                        break;
                    case 52:
                        {
                        alt16=11;
                        }
                        break;
                    case 50:
                        {
                        alt16=12;
                        }
                        break;
                    case 54:
                        {
                        alt16=13;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 16, 0, input);

                        throw nvae;
                    }

                    switch (alt16) {
                        case 1 :
                            // InternalDrn.g:1222:5: this_And_18= ruleAnd
                            {

                            					newCompositeNode(grammarAccess.getExpressionAccess().getAndParserRuleCall_1_1_0());
                            				
                            pushFollow(FOLLOW_23);
                            this_And_18=ruleAnd();

                            state._fsp--;


                            					current = this_And_18;
                            					afterParserOrEnumRuleCall();
                            				

                            }
                            break;
                        case 2 :
                            // InternalDrn.g:1231:5: this_RefPart_19= ruleRefPart
                            {

                            					newCompositeNode(grammarAccess.getExpressionAccess().getRefPartParserRuleCall_1_1_1());
                            				
                            pushFollow(FOLLOW_23);
                            this_RefPart_19=ruleRefPart();

                            state._fsp--;


                            					current = this_RefPart_19;
                            					afterParserOrEnumRuleCall();
                            				

                            }
                            break;
                        case 3 :
                            // InternalDrn.g:1240:5: this_DepX_Impl_20= ruleDepX_Impl
                            {

                            					newCompositeNode(grammarAccess.getExpressionAccess().getDepX_ImplParserRuleCall_1_1_2());
                            				
                            pushFollow(FOLLOW_23);
                            this_DepX_Impl_20=ruleDepX_Impl();

                            state._fsp--;


                            					current = this_DepX_Impl_20;
                            					afterParserOrEnumRuleCall();
                            				

                            }
                            break;
                        case 4 :
                            // InternalDrn.g:1249:5: this_DepY_Impl_21= ruleDepY_Impl
                            {

                            					newCompositeNode(grammarAccess.getExpressionAccess().getDepY_ImplParserRuleCall_1_1_3());
                            				
                            pushFollow(FOLLOW_23);
                            this_DepY_Impl_21=ruleDepY_Impl();

                            state._fsp--;


                            					current = this_DepY_Impl_21;
                            					afterParserOrEnumRuleCall();
                            				

                            }
                            break;
                        case 5 :
                            // InternalDrn.g:1258:5: this_DepZ_Impl_22= ruleDepZ_Impl
                            {

                            					newCompositeNode(grammarAccess.getExpressionAccess().getDepZ_ImplParserRuleCall_1_1_4());
                            				
                            pushFollow(FOLLOW_23);
                            this_DepZ_Impl_22=ruleDepZ_Impl();

                            state._fsp--;


                            					current = this_DepZ_Impl_22;
                            					afterParserOrEnumRuleCall();
                            				

                            }
                            break;
                        case 6 :
                            // InternalDrn.g:1267:5: this_DepXY_IMPL_23= ruleDepXY_IMPL
                            {

                            					newCompositeNode(grammarAccess.getExpressionAccess().getDepXY_IMPLParserRuleCall_1_1_5());
                            				
                            pushFollow(FOLLOW_23);
                            this_DepXY_IMPL_23=ruleDepXY_IMPL();

                            state._fsp--;


                            					current = this_DepXY_IMPL_23;
                            					afterParserOrEnumRuleCall();
                            				

                            }
                            break;
                        case 7 :
                            // InternalDrn.g:1276:5: this_DepXZ_IMPL_24= ruleDepXZ_IMPL
                            {

                            					newCompositeNode(grammarAccess.getExpressionAccess().getDepXZ_IMPLParserRuleCall_1_1_6());
                            				
                            pushFollow(FOLLOW_23);
                            this_DepXZ_IMPL_24=ruleDepXZ_IMPL();

                            state._fsp--;


                            					current = this_DepXZ_IMPL_24;
                            					afterParserOrEnumRuleCall();
                            				

                            }
                            break;
                        case 8 :
                            // InternalDrn.g:1285:5: this_DepYZ_IMPL_25= ruleDepYZ_IMPL
                            {

                            					newCompositeNode(grammarAccess.getExpressionAccess().getDepYZ_IMPLParserRuleCall_1_1_7());
                            				
                            pushFollow(FOLLOW_23);
                            this_DepYZ_IMPL_25=ruleDepYZ_IMPL();

                            state._fsp--;


                            					current = this_DepYZ_IMPL_25;
                            					afterParserOrEnumRuleCall();
                            				

                            }
                            break;
                        case 9 :
                            // InternalDrn.g:1294:5: this_DepXYZ_IMPL_26= ruleDepXYZ_IMPL
                            {

                            					newCompositeNode(grammarAccess.getExpressionAccess().getDepXYZ_IMPLParserRuleCall_1_1_8());
                            				
                            pushFollow(FOLLOW_23);
                            this_DepXYZ_IMPL_26=ruleDepXYZ_IMPL();

                            state._fsp--;


                            					current = this_DepXYZ_IMPL_26;
                            					afterParserOrEnumRuleCall();
                            				

                            }
                            break;
                        case 10 :
                            // InternalDrn.g:1303:5: this_TakeOff_27= ruleTakeOff
                            {

                            					newCompositeNode(grammarAccess.getExpressionAccess().getTakeOffParserRuleCall_1_1_9());
                            				
                            pushFollow(FOLLOW_23);
                            this_TakeOff_27=ruleTakeOff();

                            state._fsp--;


                            					current = this_TakeOff_27;
                            					afterParserOrEnumRuleCall();
                            				

                            }
                            break;
                        case 11 :
                            // InternalDrn.g:1312:5: this_Wait_28= ruleWait
                            {

                            					newCompositeNode(grammarAccess.getExpressionAccess().getWaitParserRuleCall_1_1_10());
                            				
                            pushFollow(FOLLOW_23);
                            this_Wait_28=ruleWait();

                            state._fsp--;


                            					current = this_Wait_28;
                            					afterParserOrEnumRuleCall();
                            				

                            }
                            break;
                        case 12 :
                            // InternalDrn.g:1321:5: this_Rotate_29= ruleRotate
                            {

                            					newCompositeNode(grammarAccess.getExpressionAccess().getRotateParserRuleCall_1_1_11());
                            				
                            pushFollow(FOLLOW_23);
                            this_Rotate_29=ruleRotate();

                            state._fsp--;


                            					current = this_Rotate_29;
                            					afterParserOrEnumRuleCall();
                            				

                            }
                            break;
                        case 13 :
                            // InternalDrn.g:1330:5: this_Land_30= ruleLand
                            {

                            					newCompositeNode(grammarAccess.getExpressionAccess().getLandParserRuleCall_1_1_12());
                            				
                            pushFollow(FOLLOW_23);
                            this_Land_30=ruleLand();

                            state._fsp--;


                            					current = this_Land_30;
                            					afterParserOrEnumRuleCall();
                            				

                            }
                            break;

                    }

                    // InternalDrn.g:1339:4: (otherlv_31= 'then' ( (lv_then_32_0= ruleExpression ) ) )
                    // InternalDrn.g:1340:5: otherlv_31= 'then' ( (lv_then_32_0= ruleExpression ) )
                    {
                    otherlv_31=(Token)match(input,29,FOLLOW_17); 

                    					newLeafNode(otherlv_31, grammarAccess.getExpressionAccess().getThenKeyword_1_2_0());
                    				
                    // InternalDrn.g:1344:5: ( (lv_then_32_0= ruleExpression ) )
                    // InternalDrn.g:1345:6: (lv_then_32_0= ruleExpression )
                    {
                    // InternalDrn.g:1345:6: (lv_then_32_0= ruleExpression )
                    // InternalDrn.g:1346:7: lv_then_32_0= ruleExpression
                    {

                    							newCompositeNode(grammarAccess.getExpressionAccess().getThenExpressionParserRuleCall_1_2_1_0());
                    						
                    pushFollow(FOLLOW_24);
                    lv_then_32_0=ruleExpression();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getExpressionRule());
                    							}
                    							add(
                    								current,
                    								"then",
                    								lv_then_32_0,
                    								"sar.drone.Drn.Expression");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }

                    // InternalDrn.g:1364:4: (otherlv_33= 'then' ( (lv_then_34_0= ruleExpression ) ) )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==29) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // InternalDrn.g:1365:5: otherlv_33= 'then' ( (lv_then_34_0= ruleExpression ) )
                    	    {
                    	    otherlv_33=(Token)match(input,29,FOLLOW_17); 

                    	    					newLeafNode(otherlv_33, grammarAccess.getExpressionAccess().getThenKeyword_1_3_0());
                    	    				
                    	    // InternalDrn.g:1369:5: ( (lv_then_34_0= ruleExpression ) )
                    	    // InternalDrn.g:1370:6: (lv_then_34_0= ruleExpression )
                    	    {
                    	    // InternalDrn.g:1370:6: (lv_then_34_0= ruleExpression )
                    	    // InternalDrn.g:1371:7: lv_then_34_0= ruleExpression
                    	    {

                    	    							newCompositeNode(grammarAccess.getExpressionAccess().getThenExpressionParserRuleCall_1_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_24);
                    	    lv_then_34_0=ruleExpression();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getExpressionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"then",
                    	    								lv_then_34_0,
                    	    								"sar.drone.Drn.Expression");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);

                    otherlv_35=(Token)match(input,27,FOLLOW_19); 

                    				newLeafNode(otherlv_35, grammarAccess.getExpressionAccess().getRightParenthesisKeyword_1_4());
                    			
                    // InternalDrn.g:1393:4: (otherlv_36= 'X' ( ( (lv_repeatCST_37_0= ruleEInt ) ) | ( (otherlv_38= RULE_ID ) ) ) )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==28) ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // InternalDrn.g:1394:5: otherlv_36= 'X' ( ( (lv_repeatCST_37_0= ruleEInt ) ) | ( (otherlv_38= RULE_ID ) ) )
                            {
                            otherlv_36=(Token)match(input,28,FOLLOW_20); 

                            					newLeafNode(otherlv_36, grammarAccess.getExpressionAccess().getXKeyword_1_5_0());
                            				
                            // InternalDrn.g:1398:5: ( ( (lv_repeatCST_37_0= ruleEInt ) ) | ( (otherlv_38= RULE_ID ) ) )
                            int alt18=2;
                            int LA18_0 = input.LA(1);

                            if ( (LA18_0==RULE_INT||LA18_0==68) ) {
                                alt18=1;
                            }
                            else if ( (LA18_0==RULE_ID) ) {
                                alt18=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 18, 0, input);

                                throw nvae;
                            }
                            switch (alt18) {
                                case 1 :
                                    // InternalDrn.g:1399:6: ( (lv_repeatCST_37_0= ruleEInt ) )
                                    {
                                    // InternalDrn.g:1399:6: ( (lv_repeatCST_37_0= ruleEInt ) )
                                    // InternalDrn.g:1400:7: (lv_repeatCST_37_0= ruleEInt )
                                    {
                                    // InternalDrn.g:1400:7: (lv_repeatCST_37_0= ruleEInt )
                                    // InternalDrn.g:1401:8: lv_repeatCST_37_0= ruleEInt
                                    {

                                    								newCompositeNode(grammarAccess.getExpressionAccess().getRepeatCSTEIntParserRuleCall_1_5_1_0_0());
                                    							
                                    pushFollow(FOLLOW_21);
                                    lv_repeatCST_37_0=ruleEInt();

                                    state._fsp--;


                                    								if (current==null) {
                                    									current = createModelElementForParent(grammarAccess.getExpressionRule());
                                    								}
                                    								set(
                                    									current,
                                    									"repeatCST",
                                    									lv_repeatCST_37_0,
                                    									"sar.drone.Drn.EInt");
                                    								afterParserOrEnumRuleCall();
                                    							

                                    }


                                    }


                                    }
                                    break;
                                case 2 :
                                    // InternalDrn.g:1419:6: ( (otherlv_38= RULE_ID ) )
                                    {
                                    // InternalDrn.g:1419:6: ( (otherlv_38= RULE_ID ) )
                                    // InternalDrn.g:1420:7: (otherlv_38= RULE_ID )
                                    {
                                    // InternalDrn.g:1420:7: (otherlv_38= RULE_ID )
                                    // InternalDrn.g:1421:8: otherlv_38= RULE_ID
                                    {

                                    								if (current==null) {
                                    									current = createModelElement(grammarAccess.getExpressionRule());
                                    								}
                                    							
                                    otherlv_38=(Token)match(input,RULE_ID,FOLLOW_21); 

                                    								newLeafNode(otherlv_38, grammarAccess.getExpressionAccess().getRepeatVARParametreCrossReference_1_5_1_1_0());
                                    							

                                    }


                                    }


                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    // InternalDrn.g:1434:4: ( (lv_with_39_0= ruleWith ) )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==57) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // InternalDrn.g:1435:5: (lv_with_39_0= ruleWith )
                            {
                            // InternalDrn.g:1435:5: (lv_with_39_0= ruleWith )
                            // InternalDrn.g:1436:6: lv_with_39_0= ruleWith
                            {

                            						newCompositeNode(grammarAccess.getExpressionAccess().getWithWithParserRuleCall_1_6_0());
                            					
                            pushFollow(FOLLOW_2);
                            lv_with_39_0=ruleWith();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getExpressionRule());
                            						}
                            						add(
                            							current,
                            							"with",
                            							lv_with_39_0,
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


    // $ANTLR start "entryRuleRefPart"
    // InternalDrn.g:1458:1: entryRuleRefPart returns [EObject current=null] : iv_ruleRefPart= ruleRefPart EOF ;
    public final EObject entryRuleRefPart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRefPart = null;


        try {
            // InternalDrn.g:1458:48: (iv_ruleRefPart= ruleRefPart EOF )
            // InternalDrn.g:1459:2: iv_ruleRefPart= ruleRefPart EOF
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
    // InternalDrn.g:1465:1: ruleRefPart returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_params_2_0= ruleEInt ) ) otherlv_3= ',' )* otherlv_4= ')' ) ;
    public final EObject ruleRefPart() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_params_2_0 = null;



        	enterRule();

        try {
            // InternalDrn.g:1471:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_params_2_0= ruleEInt ) ) otherlv_3= ',' )* otherlv_4= ')' ) )
            // InternalDrn.g:1472:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_params_2_0= ruleEInt ) ) otherlv_3= ',' )* otherlv_4= ')' )
            {
            // InternalDrn.g:1472:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_params_2_0= ruleEInt ) ) otherlv_3= ',' )* otherlv_4= ')' )
            // InternalDrn.g:1473:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_params_2_0= ruleEInt ) ) otherlv_3= ',' )* otherlv_4= ')'
            {
            // InternalDrn.g:1473:3: ( (otherlv_0= RULE_ID ) )
            // InternalDrn.g:1474:4: (otherlv_0= RULE_ID )
            {
            // InternalDrn.g:1474:4: (otherlv_0= RULE_ID )
            // InternalDrn.g:1475:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRefPartRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(otherlv_0, grammarAccess.getRefPartAccess().getVariable_partieAssignementCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,25,FOLLOW_25); 

            			newLeafNode(otherlv_1, grammarAccess.getRefPartAccess().getLeftParenthesisKeyword_1());
            		
            // InternalDrn.g:1490:3: ( ( (lv_params_2_0= ruleEInt ) ) otherlv_3= ',' )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RULE_INT||LA22_0==68) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalDrn.g:1491:4: ( (lv_params_2_0= ruleEInt ) ) otherlv_3= ','
            	    {
            	    // InternalDrn.g:1491:4: ( (lv_params_2_0= ruleEInt ) )
            	    // InternalDrn.g:1492:5: (lv_params_2_0= ruleEInt )
            	    {
            	    // InternalDrn.g:1492:5: (lv_params_2_0= ruleEInt )
            	    // InternalDrn.g:1493:6: lv_params_2_0= ruleEInt
            	    {

            	    						newCompositeNode(grammarAccess.getRefPartAccess().getParamsEIntParserRuleCall_2_0_0());
            	    					
            	    pushFollow(FOLLOW_26);
            	    lv_params_2_0=ruleEInt();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getRefPartRule());
            	    						}
            	    						add(
            	    							current,
            	    							"params",
            	    							lv_params_2_0,
            	    							"sar.drone.Drn.EInt");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_3=(Token)match(input,26,FOLLOW_25); 

            	    				newLeafNode(otherlv_3, grammarAccess.getRefPartAccess().getCommaKeyword_2_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            otherlv_4=(Token)match(input,27,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getRefPartAccess().getRightParenthesisKeyword_3());
            		

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
    // InternalDrn.g:1523:1: entryRuleAnd returns [EObject current=null] : iv_ruleAnd= ruleAnd EOF ;
    public final EObject entryRuleAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnd = null;


        try {
            // InternalDrn.g:1523:44: (iv_ruleAnd= ruleAnd EOF )
            // InternalDrn.g:1524:2: iv_ruleAnd= ruleAnd EOF
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
    // InternalDrn.g:1530:1: ruleAnd returns [EObject current=null] : ( () ( (lv_name_1_0= 'merge' ) ) otherlv_2= '(' ( ( (lv_rotate_3_0= ruleRotate ) ) | ( (lv_depx_4_0= ruleDepX_Impl ) ) | ( (lv_depy_5_0= ruleDepY_Impl ) ) | ( (lv_depxz_6_0= ruleDepXZ_IMPL ) ) | ( (lv_depxy_7_0= ruleDepXY_IMPL ) ) | ( (lv_depz_8_0= ruleDepZ_Impl ) ) ) otherlv_9= ',' ( ( (lv_rotate_10_0= ruleRotate ) ) | ( (lv_depx_11_0= ruleDepX_Impl ) ) | ( (lv_depy_12_0= ruleDepY_Impl ) ) | ( (lv_depxz_13_0= ruleDepXZ_IMPL ) ) | ( (lv_depxy_14_0= ruleDepXY_IMPL ) ) | ( (lv_depz_15_0= ruleDepZ_Impl ) ) ) (otherlv_16= ',' ( ( (lv_rotate_17_0= ruleRotate ) ) | ( (lv_depx_18_0= ruleDepX_Impl ) ) | ( (lv_depy_19_0= ruleDepY_Impl ) ) | ( (lv_depxz_20_0= ruleDepXZ_IMPL ) ) | ( (lv_depxy_21_0= ruleDepXY_IMPL ) ) | ( (lv_depz_22_0= ruleDepZ_Impl ) ) ) )* otherlv_23= ')' ) ;
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
            // InternalDrn.g:1536:2: ( ( () ( (lv_name_1_0= 'merge' ) ) otherlv_2= '(' ( ( (lv_rotate_3_0= ruleRotate ) ) | ( (lv_depx_4_0= ruleDepX_Impl ) ) | ( (lv_depy_5_0= ruleDepY_Impl ) ) | ( (lv_depxz_6_0= ruleDepXZ_IMPL ) ) | ( (lv_depxy_7_0= ruleDepXY_IMPL ) ) | ( (lv_depz_8_0= ruleDepZ_Impl ) ) ) otherlv_9= ',' ( ( (lv_rotate_10_0= ruleRotate ) ) | ( (lv_depx_11_0= ruleDepX_Impl ) ) | ( (lv_depy_12_0= ruleDepY_Impl ) ) | ( (lv_depxz_13_0= ruleDepXZ_IMPL ) ) | ( (lv_depxy_14_0= ruleDepXY_IMPL ) ) | ( (lv_depz_15_0= ruleDepZ_Impl ) ) ) (otherlv_16= ',' ( ( (lv_rotate_17_0= ruleRotate ) ) | ( (lv_depx_18_0= ruleDepX_Impl ) ) | ( (lv_depy_19_0= ruleDepY_Impl ) ) | ( (lv_depxz_20_0= ruleDepXZ_IMPL ) ) | ( (lv_depxy_21_0= ruleDepXY_IMPL ) ) | ( (lv_depz_22_0= ruleDepZ_Impl ) ) ) )* otherlv_23= ')' ) )
            // InternalDrn.g:1537:2: ( () ( (lv_name_1_0= 'merge' ) ) otherlv_2= '(' ( ( (lv_rotate_3_0= ruleRotate ) ) | ( (lv_depx_4_0= ruleDepX_Impl ) ) | ( (lv_depy_5_0= ruleDepY_Impl ) ) | ( (lv_depxz_6_0= ruleDepXZ_IMPL ) ) | ( (lv_depxy_7_0= ruleDepXY_IMPL ) ) | ( (lv_depz_8_0= ruleDepZ_Impl ) ) ) otherlv_9= ',' ( ( (lv_rotate_10_0= ruleRotate ) ) | ( (lv_depx_11_0= ruleDepX_Impl ) ) | ( (lv_depy_12_0= ruleDepY_Impl ) ) | ( (lv_depxz_13_0= ruleDepXZ_IMPL ) ) | ( (lv_depxy_14_0= ruleDepXY_IMPL ) ) | ( (lv_depz_15_0= ruleDepZ_Impl ) ) ) (otherlv_16= ',' ( ( (lv_rotate_17_0= ruleRotate ) ) | ( (lv_depx_18_0= ruleDepX_Impl ) ) | ( (lv_depy_19_0= ruleDepY_Impl ) ) | ( (lv_depxz_20_0= ruleDepXZ_IMPL ) ) | ( (lv_depxy_21_0= ruleDepXY_IMPL ) ) | ( (lv_depz_22_0= ruleDepZ_Impl ) ) ) )* otherlv_23= ')' )
            {
            // InternalDrn.g:1537:2: ( () ( (lv_name_1_0= 'merge' ) ) otherlv_2= '(' ( ( (lv_rotate_3_0= ruleRotate ) ) | ( (lv_depx_4_0= ruleDepX_Impl ) ) | ( (lv_depy_5_0= ruleDepY_Impl ) ) | ( (lv_depxz_6_0= ruleDepXZ_IMPL ) ) | ( (lv_depxy_7_0= ruleDepXY_IMPL ) ) | ( (lv_depz_8_0= ruleDepZ_Impl ) ) ) otherlv_9= ',' ( ( (lv_rotate_10_0= ruleRotate ) ) | ( (lv_depx_11_0= ruleDepX_Impl ) ) | ( (lv_depy_12_0= ruleDepY_Impl ) ) | ( (lv_depxz_13_0= ruleDepXZ_IMPL ) ) | ( (lv_depxy_14_0= ruleDepXY_IMPL ) ) | ( (lv_depz_15_0= ruleDepZ_Impl ) ) ) (otherlv_16= ',' ( ( (lv_rotate_17_0= ruleRotate ) ) | ( (lv_depx_18_0= ruleDepX_Impl ) ) | ( (lv_depy_19_0= ruleDepY_Impl ) ) | ( (lv_depxz_20_0= ruleDepXZ_IMPL ) ) | ( (lv_depxy_21_0= ruleDepXY_IMPL ) ) | ( (lv_depz_22_0= ruleDepZ_Impl ) ) ) )* otherlv_23= ')' )
            // InternalDrn.g:1538:3: () ( (lv_name_1_0= 'merge' ) ) otherlv_2= '(' ( ( (lv_rotate_3_0= ruleRotate ) ) | ( (lv_depx_4_0= ruleDepX_Impl ) ) | ( (lv_depy_5_0= ruleDepY_Impl ) ) | ( (lv_depxz_6_0= ruleDepXZ_IMPL ) ) | ( (lv_depxy_7_0= ruleDepXY_IMPL ) ) | ( (lv_depz_8_0= ruleDepZ_Impl ) ) ) otherlv_9= ',' ( ( (lv_rotate_10_0= ruleRotate ) ) | ( (lv_depx_11_0= ruleDepX_Impl ) ) | ( (lv_depy_12_0= ruleDepY_Impl ) ) | ( (lv_depxz_13_0= ruleDepXZ_IMPL ) ) | ( (lv_depxy_14_0= ruleDepXY_IMPL ) ) | ( (lv_depz_15_0= ruleDepZ_Impl ) ) ) (otherlv_16= ',' ( ( (lv_rotate_17_0= ruleRotate ) ) | ( (lv_depx_18_0= ruleDepX_Impl ) ) | ( (lv_depy_19_0= ruleDepY_Impl ) ) | ( (lv_depxz_20_0= ruleDepXZ_IMPL ) ) | ( (lv_depxy_21_0= ruleDepXY_IMPL ) ) | ( (lv_depz_22_0= ruleDepZ_Impl ) ) ) )* otherlv_23= ')'
            {
            // InternalDrn.g:1538:3: ()
            // InternalDrn.g:1539:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAndAccess().getAndAction_0(),
            					current);
            			

            }

            // InternalDrn.g:1545:3: ( (lv_name_1_0= 'merge' ) )
            // InternalDrn.g:1546:4: (lv_name_1_0= 'merge' )
            {
            // InternalDrn.g:1546:4: (lv_name_1_0= 'merge' )
            // InternalDrn.g:1547:5: lv_name_1_0= 'merge'
            {
            lv_name_1_0=(Token)match(input,30,FOLLOW_14); 

            					newLeafNode(lv_name_1_0, grammarAccess.getAndAccess().getNameMergeKeyword_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAndRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_1_0, "merge");
            				

            }


            }

            otherlv_2=(Token)match(input,25,FOLLOW_27); 

            			newLeafNode(otherlv_2, grammarAccess.getAndAccess().getLeftParenthesisKeyword_2());
            		
            // InternalDrn.g:1563:3: ( ( (lv_rotate_3_0= ruleRotate ) ) | ( (lv_depx_4_0= ruleDepX_Impl ) ) | ( (lv_depy_5_0= ruleDepY_Impl ) ) | ( (lv_depxz_6_0= ruleDepXZ_IMPL ) ) | ( (lv_depxy_7_0= ruleDepXY_IMPL ) ) | ( (lv_depz_8_0= ruleDepZ_Impl ) ) )
            int alt23=6;
            switch ( input.LA(1) ) {
            case 50:
                {
                alt23=1;
                }
                break;
            case 35:
            case 36:
                {
                alt23=2;
                }
                break;
            case 31:
            case 34:
                {
                alt23=3;
                }
                break;
            case 47:
                {
                alt23=4;
                }
                break;
            case 39:
            case 40:
            case 42:
                {
                alt23=5;
                }
                break;
            case 37:
            case 38:
                {
                alt23=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // InternalDrn.g:1564:4: ( (lv_rotate_3_0= ruleRotate ) )
                    {
                    // InternalDrn.g:1564:4: ( (lv_rotate_3_0= ruleRotate ) )
                    // InternalDrn.g:1565:5: (lv_rotate_3_0= ruleRotate )
                    {
                    // InternalDrn.g:1565:5: (lv_rotate_3_0= ruleRotate )
                    // InternalDrn.g:1566:6: lv_rotate_3_0= ruleRotate
                    {

                    						newCompositeNode(grammarAccess.getAndAccess().getRotateRotateParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_26);
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
                    // InternalDrn.g:1584:4: ( (lv_depx_4_0= ruleDepX_Impl ) )
                    {
                    // InternalDrn.g:1584:4: ( (lv_depx_4_0= ruleDepX_Impl ) )
                    // InternalDrn.g:1585:5: (lv_depx_4_0= ruleDepX_Impl )
                    {
                    // InternalDrn.g:1585:5: (lv_depx_4_0= ruleDepX_Impl )
                    // InternalDrn.g:1586:6: lv_depx_4_0= ruleDepX_Impl
                    {

                    						newCompositeNode(grammarAccess.getAndAccess().getDepxDepX_ImplParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_26);
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
                    // InternalDrn.g:1604:4: ( (lv_depy_5_0= ruleDepY_Impl ) )
                    {
                    // InternalDrn.g:1604:4: ( (lv_depy_5_0= ruleDepY_Impl ) )
                    // InternalDrn.g:1605:5: (lv_depy_5_0= ruleDepY_Impl )
                    {
                    // InternalDrn.g:1605:5: (lv_depy_5_0= ruleDepY_Impl )
                    // InternalDrn.g:1606:6: lv_depy_5_0= ruleDepY_Impl
                    {

                    						newCompositeNode(grammarAccess.getAndAccess().getDepyDepY_ImplParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_26);
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
                    // InternalDrn.g:1624:4: ( (lv_depxz_6_0= ruleDepXZ_IMPL ) )
                    {
                    // InternalDrn.g:1624:4: ( (lv_depxz_6_0= ruleDepXZ_IMPL ) )
                    // InternalDrn.g:1625:5: (lv_depxz_6_0= ruleDepXZ_IMPL )
                    {
                    // InternalDrn.g:1625:5: (lv_depxz_6_0= ruleDepXZ_IMPL )
                    // InternalDrn.g:1626:6: lv_depxz_6_0= ruleDepXZ_IMPL
                    {

                    						newCompositeNode(grammarAccess.getAndAccess().getDepxzDepXZ_IMPLParserRuleCall_3_3_0());
                    					
                    pushFollow(FOLLOW_26);
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
                    // InternalDrn.g:1644:4: ( (lv_depxy_7_0= ruleDepXY_IMPL ) )
                    {
                    // InternalDrn.g:1644:4: ( (lv_depxy_7_0= ruleDepXY_IMPL ) )
                    // InternalDrn.g:1645:5: (lv_depxy_7_0= ruleDepXY_IMPL )
                    {
                    // InternalDrn.g:1645:5: (lv_depxy_7_0= ruleDepXY_IMPL )
                    // InternalDrn.g:1646:6: lv_depxy_7_0= ruleDepXY_IMPL
                    {

                    						newCompositeNode(grammarAccess.getAndAccess().getDepxyDepXY_IMPLParserRuleCall_3_4_0());
                    					
                    pushFollow(FOLLOW_26);
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
                    // InternalDrn.g:1664:4: ( (lv_depz_8_0= ruleDepZ_Impl ) )
                    {
                    // InternalDrn.g:1664:4: ( (lv_depz_8_0= ruleDepZ_Impl ) )
                    // InternalDrn.g:1665:5: (lv_depz_8_0= ruleDepZ_Impl )
                    {
                    // InternalDrn.g:1665:5: (lv_depz_8_0= ruleDepZ_Impl )
                    // InternalDrn.g:1666:6: lv_depz_8_0= ruleDepZ_Impl
                    {

                    						newCompositeNode(grammarAccess.getAndAccess().getDepzDepZ_ImplParserRuleCall_3_5_0());
                    					
                    pushFollow(FOLLOW_26);
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

            otherlv_9=(Token)match(input,26,FOLLOW_27); 

            			newLeafNode(otherlv_9, grammarAccess.getAndAccess().getCommaKeyword_4());
            		
            // InternalDrn.g:1688:3: ( ( (lv_rotate_10_0= ruleRotate ) ) | ( (lv_depx_11_0= ruleDepX_Impl ) ) | ( (lv_depy_12_0= ruleDepY_Impl ) ) | ( (lv_depxz_13_0= ruleDepXZ_IMPL ) ) | ( (lv_depxy_14_0= ruleDepXY_IMPL ) ) | ( (lv_depz_15_0= ruleDepZ_Impl ) ) )
            int alt24=6;
            switch ( input.LA(1) ) {
            case 50:
                {
                alt24=1;
                }
                break;
            case 35:
            case 36:
                {
                alt24=2;
                }
                break;
            case 31:
            case 34:
                {
                alt24=3;
                }
                break;
            case 47:
                {
                alt24=4;
                }
                break;
            case 39:
            case 40:
            case 42:
                {
                alt24=5;
                }
                break;
            case 37:
            case 38:
                {
                alt24=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // InternalDrn.g:1689:4: ( (lv_rotate_10_0= ruleRotate ) )
                    {
                    // InternalDrn.g:1689:4: ( (lv_rotate_10_0= ruleRotate ) )
                    // InternalDrn.g:1690:5: (lv_rotate_10_0= ruleRotate )
                    {
                    // InternalDrn.g:1690:5: (lv_rotate_10_0= ruleRotate )
                    // InternalDrn.g:1691:6: lv_rotate_10_0= ruleRotate
                    {

                    						newCompositeNode(grammarAccess.getAndAccess().getRotateRotateParserRuleCall_5_0_0());
                    					
                    pushFollow(FOLLOW_16);
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
                    // InternalDrn.g:1709:4: ( (lv_depx_11_0= ruleDepX_Impl ) )
                    {
                    // InternalDrn.g:1709:4: ( (lv_depx_11_0= ruleDepX_Impl ) )
                    // InternalDrn.g:1710:5: (lv_depx_11_0= ruleDepX_Impl )
                    {
                    // InternalDrn.g:1710:5: (lv_depx_11_0= ruleDepX_Impl )
                    // InternalDrn.g:1711:6: lv_depx_11_0= ruleDepX_Impl
                    {

                    						newCompositeNode(grammarAccess.getAndAccess().getDepxDepX_ImplParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_16);
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
                    // InternalDrn.g:1729:4: ( (lv_depy_12_0= ruleDepY_Impl ) )
                    {
                    // InternalDrn.g:1729:4: ( (lv_depy_12_0= ruleDepY_Impl ) )
                    // InternalDrn.g:1730:5: (lv_depy_12_0= ruleDepY_Impl )
                    {
                    // InternalDrn.g:1730:5: (lv_depy_12_0= ruleDepY_Impl )
                    // InternalDrn.g:1731:6: lv_depy_12_0= ruleDepY_Impl
                    {

                    						newCompositeNode(grammarAccess.getAndAccess().getDepyDepY_ImplParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_16);
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
                    // InternalDrn.g:1749:4: ( (lv_depxz_13_0= ruleDepXZ_IMPL ) )
                    {
                    // InternalDrn.g:1749:4: ( (lv_depxz_13_0= ruleDepXZ_IMPL ) )
                    // InternalDrn.g:1750:5: (lv_depxz_13_0= ruleDepXZ_IMPL )
                    {
                    // InternalDrn.g:1750:5: (lv_depxz_13_0= ruleDepXZ_IMPL )
                    // InternalDrn.g:1751:6: lv_depxz_13_0= ruleDepXZ_IMPL
                    {

                    						newCompositeNode(grammarAccess.getAndAccess().getDepxzDepXZ_IMPLParserRuleCall_5_3_0());
                    					
                    pushFollow(FOLLOW_16);
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
                    // InternalDrn.g:1769:4: ( (lv_depxy_14_0= ruleDepXY_IMPL ) )
                    {
                    // InternalDrn.g:1769:4: ( (lv_depxy_14_0= ruleDepXY_IMPL ) )
                    // InternalDrn.g:1770:5: (lv_depxy_14_0= ruleDepXY_IMPL )
                    {
                    // InternalDrn.g:1770:5: (lv_depxy_14_0= ruleDepXY_IMPL )
                    // InternalDrn.g:1771:6: lv_depxy_14_0= ruleDepXY_IMPL
                    {

                    						newCompositeNode(grammarAccess.getAndAccess().getDepxyDepXY_IMPLParserRuleCall_5_4_0());
                    					
                    pushFollow(FOLLOW_16);
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
                    // InternalDrn.g:1789:4: ( (lv_depz_15_0= ruleDepZ_Impl ) )
                    {
                    // InternalDrn.g:1789:4: ( (lv_depz_15_0= ruleDepZ_Impl ) )
                    // InternalDrn.g:1790:5: (lv_depz_15_0= ruleDepZ_Impl )
                    {
                    // InternalDrn.g:1790:5: (lv_depz_15_0= ruleDepZ_Impl )
                    // InternalDrn.g:1791:6: lv_depz_15_0= ruleDepZ_Impl
                    {

                    						newCompositeNode(grammarAccess.getAndAccess().getDepzDepZ_ImplParserRuleCall_5_5_0());
                    					
                    pushFollow(FOLLOW_16);
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

            // InternalDrn.g:1809:3: (otherlv_16= ',' ( ( (lv_rotate_17_0= ruleRotate ) ) | ( (lv_depx_18_0= ruleDepX_Impl ) ) | ( (lv_depy_19_0= ruleDepY_Impl ) ) | ( (lv_depxz_20_0= ruleDepXZ_IMPL ) ) | ( (lv_depxy_21_0= ruleDepXY_IMPL ) ) | ( (lv_depz_22_0= ruleDepZ_Impl ) ) ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==26) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalDrn.g:1810:4: otherlv_16= ',' ( ( (lv_rotate_17_0= ruleRotate ) ) | ( (lv_depx_18_0= ruleDepX_Impl ) ) | ( (lv_depy_19_0= ruleDepY_Impl ) ) | ( (lv_depxz_20_0= ruleDepXZ_IMPL ) ) | ( (lv_depxy_21_0= ruleDepXY_IMPL ) ) | ( (lv_depz_22_0= ruleDepZ_Impl ) ) )
            	    {
            	    otherlv_16=(Token)match(input,26,FOLLOW_27); 

            	    				newLeafNode(otherlv_16, grammarAccess.getAndAccess().getCommaKeyword_6_0());
            	    			
            	    // InternalDrn.g:1814:4: ( ( (lv_rotate_17_0= ruleRotate ) ) | ( (lv_depx_18_0= ruleDepX_Impl ) ) | ( (lv_depy_19_0= ruleDepY_Impl ) ) | ( (lv_depxz_20_0= ruleDepXZ_IMPL ) ) | ( (lv_depxy_21_0= ruleDepXY_IMPL ) ) | ( (lv_depz_22_0= ruleDepZ_Impl ) ) )
            	    int alt25=6;
            	    switch ( input.LA(1) ) {
            	    case 50:
            	        {
            	        alt25=1;
            	        }
            	        break;
            	    case 35:
            	    case 36:
            	        {
            	        alt25=2;
            	        }
            	        break;
            	    case 31:
            	    case 34:
            	        {
            	        alt25=3;
            	        }
            	        break;
            	    case 47:
            	        {
            	        alt25=4;
            	        }
            	        break;
            	    case 39:
            	    case 40:
            	    case 42:
            	        {
            	        alt25=5;
            	        }
            	        break;
            	    case 37:
            	    case 38:
            	        {
            	        alt25=6;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 25, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt25) {
            	        case 1 :
            	            // InternalDrn.g:1815:5: ( (lv_rotate_17_0= ruleRotate ) )
            	            {
            	            // InternalDrn.g:1815:5: ( (lv_rotate_17_0= ruleRotate ) )
            	            // InternalDrn.g:1816:6: (lv_rotate_17_0= ruleRotate )
            	            {
            	            // InternalDrn.g:1816:6: (lv_rotate_17_0= ruleRotate )
            	            // InternalDrn.g:1817:7: lv_rotate_17_0= ruleRotate
            	            {

            	            							newCompositeNode(grammarAccess.getAndAccess().getRotateRotateParserRuleCall_6_1_0_0());
            	            						
            	            pushFollow(FOLLOW_16);
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
            	            // InternalDrn.g:1835:5: ( (lv_depx_18_0= ruleDepX_Impl ) )
            	            {
            	            // InternalDrn.g:1835:5: ( (lv_depx_18_0= ruleDepX_Impl ) )
            	            // InternalDrn.g:1836:6: (lv_depx_18_0= ruleDepX_Impl )
            	            {
            	            // InternalDrn.g:1836:6: (lv_depx_18_0= ruleDepX_Impl )
            	            // InternalDrn.g:1837:7: lv_depx_18_0= ruleDepX_Impl
            	            {

            	            							newCompositeNode(grammarAccess.getAndAccess().getDepxDepX_ImplParserRuleCall_6_1_1_0());
            	            						
            	            pushFollow(FOLLOW_16);
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
            	            // InternalDrn.g:1855:5: ( (lv_depy_19_0= ruleDepY_Impl ) )
            	            {
            	            // InternalDrn.g:1855:5: ( (lv_depy_19_0= ruleDepY_Impl ) )
            	            // InternalDrn.g:1856:6: (lv_depy_19_0= ruleDepY_Impl )
            	            {
            	            // InternalDrn.g:1856:6: (lv_depy_19_0= ruleDepY_Impl )
            	            // InternalDrn.g:1857:7: lv_depy_19_0= ruleDepY_Impl
            	            {

            	            							newCompositeNode(grammarAccess.getAndAccess().getDepyDepY_ImplParserRuleCall_6_1_2_0());
            	            						
            	            pushFollow(FOLLOW_16);
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
            	            // InternalDrn.g:1875:5: ( (lv_depxz_20_0= ruleDepXZ_IMPL ) )
            	            {
            	            // InternalDrn.g:1875:5: ( (lv_depxz_20_0= ruleDepXZ_IMPL ) )
            	            // InternalDrn.g:1876:6: (lv_depxz_20_0= ruleDepXZ_IMPL )
            	            {
            	            // InternalDrn.g:1876:6: (lv_depxz_20_0= ruleDepXZ_IMPL )
            	            // InternalDrn.g:1877:7: lv_depxz_20_0= ruleDepXZ_IMPL
            	            {

            	            							newCompositeNode(grammarAccess.getAndAccess().getDepxzDepXZ_IMPLParserRuleCall_6_1_3_0());
            	            						
            	            pushFollow(FOLLOW_16);
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
            	            // InternalDrn.g:1895:5: ( (lv_depxy_21_0= ruleDepXY_IMPL ) )
            	            {
            	            // InternalDrn.g:1895:5: ( (lv_depxy_21_0= ruleDepXY_IMPL ) )
            	            // InternalDrn.g:1896:6: (lv_depxy_21_0= ruleDepXY_IMPL )
            	            {
            	            // InternalDrn.g:1896:6: (lv_depxy_21_0= ruleDepXY_IMPL )
            	            // InternalDrn.g:1897:7: lv_depxy_21_0= ruleDepXY_IMPL
            	            {

            	            							newCompositeNode(grammarAccess.getAndAccess().getDepxyDepXY_IMPLParserRuleCall_6_1_4_0());
            	            						
            	            pushFollow(FOLLOW_16);
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
            	            // InternalDrn.g:1915:5: ( (lv_depz_22_0= ruleDepZ_Impl ) )
            	            {
            	            // InternalDrn.g:1915:5: ( (lv_depz_22_0= ruleDepZ_Impl ) )
            	            // InternalDrn.g:1916:6: (lv_depz_22_0= ruleDepZ_Impl )
            	            {
            	            // InternalDrn.g:1916:6: (lv_depz_22_0= ruleDepZ_Impl )
            	            // InternalDrn.g:1917:7: lv_depz_22_0= ruleDepZ_Impl
            	            {

            	            							newCompositeNode(grammarAccess.getAndAccess().getDepzDepZ_ImplParserRuleCall_6_1_5_0());
            	            						
            	            pushFollow(FOLLOW_16);
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
            	    break loop26;
                }
            } while (true);

            otherlv_23=(Token)match(input,27,FOLLOW_2); 

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
    // InternalDrn.g:1944:1: entryRuleDepY_Impl returns [EObject current=null] : iv_ruleDepY_Impl= ruleDepY_Impl EOF ;
    public final EObject entryRuleDepY_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDepY_Impl = null;


        try {
            // InternalDrn.g:1944:50: (iv_ruleDepY_Impl= ruleDepY_Impl EOF )
            // InternalDrn.g:1945:2: iv_ruleDepY_Impl= ruleDepY_Impl EOF
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
    // InternalDrn.g:1951:1: ruleDepY_Impl returns [EObject current=null] : (this_FORWARD_0= ruleFORWARD | this_BACKWARD_1= ruleBACKWARD ) ;
    public final EObject ruleDepY_Impl() throws RecognitionException {
        EObject current = null;

        EObject this_FORWARD_0 = null;

        EObject this_BACKWARD_1 = null;



        	enterRule();

        try {
            // InternalDrn.g:1957:2: ( (this_FORWARD_0= ruleFORWARD | this_BACKWARD_1= ruleBACKWARD ) )
            // InternalDrn.g:1958:2: (this_FORWARD_0= ruleFORWARD | this_BACKWARD_1= ruleBACKWARD )
            {
            // InternalDrn.g:1958:2: (this_FORWARD_0= ruleFORWARD | this_BACKWARD_1= ruleBACKWARD )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==31) ) {
                alt27=1;
            }
            else if ( (LA27_0==34) ) {
                alt27=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // InternalDrn.g:1959:3: this_FORWARD_0= ruleFORWARD
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
                    // InternalDrn.g:1968:3: this_BACKWARD_1= ruleBACKWARD
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
    // InternalDrn.g:1980:1: entryRuleFORWARD returns [EObject current=null] : iv_ruleFORWARD= ruleFORWARD EOF ;
    public final EObject entryRuleFORWARD() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFORWARD = null;


        try {
            // InternalDrn.g:1980:48: (iv_ruleFORWARD= ruleFORWARD EOF )
            // InternalDrn.g:1981:2: iv_ruleFORWARD= ruleFORWARD EOF
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
    // InternalDrn.g:1987:1: ruleFORWARD returns [EObject current=null] : ( ( (lv_name_0_0= 'forward' ) ) otherlv_1= '(' otherlv_2= 'distance' otherlv_3= '=' ( ( (otherlv_4= RULE_ID ) ) | ( (lv_distanceCST_5_0= ruleEInt ) ) ) otherlv_6= 'temps' otherlv_7= '=' ( ( (lv_tempsCST_8_0= ruleEInt ) ) | ( (otherlv_9= RULE_ID ) ) ) otherlv_10= ')' ) ;
    public final EObject ruleFORWARD() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_distanceCST_5_0 = null;

        AntlrDatatypeRuleToken lv_tempsCST_8_0 = null;



        	enterRule();

        try {
            // InternalDrn.g:1993:2: ( ( ( (lv_name_0_0= 'forward' ) ) otherlv_1= '(' otherlv_2= 'distance' otherlv_3= '=' ( ( (otherlv_4= RULE_ID ) ) | ( (lv_distanceCST_5_0= ruleEInt ) ) ) otherlv_6= 'temps' otherlv_7= '=' ( ( (lv_tempsCST_8_0= ruleEInt ) ) | ( (otherlv_9= RULE_ID ) ) ) otherlv_10= ')' ) )
            // InternalDrn.g:1994:2: ( ( (lv_name_0_0= 'forward' ) ) otherlv_1= '(' otherlv_2= 'distance' otherlv_3= '=' ( ( (otherlv_4= RULE_ID ) ) | ( (lv_distanceCST_5_0= ruleEInt ) ) ) otherlv_6= 'temps' otherlv_7= '=' ( ( (lv_tempsCST_8_0= ruleEInt ) ) | ( (otherlv_9= RULE_ID ) ) ) otherlv_10= ')' )
            {
            // InternalDrn.g:1994:2: ( ( (lv_name_0_0= 'forward' ) ) otherlv_1= '(' otherlv_2= 'distance' otherlv_3= '=' ( ( (otherlv_4= RULE_ID ) ) | ( (lv_distanceCST_5_0= ruleEInt ) ) ) otherlv_6= 'temps' otherlv_7= '=' ( ( (lv_tempsCST_8_0= ruleEInt ) ) | ( (otherlv_9= RULE_ID ) ) ) otherlv_10= ')' )
            // InternalDrn.g:1995:3: ( (lv_name_0_0= 'forward' ) ) otherlv_1= '(' otherlv_2= 'distance' otherlv_3= '=' ( ( (otherlv_4= RULE_ID ) ) | ( (lv_distanceCST_5_0= ruleEInt ) ) ) otherlv_6= 'temps' otherlv_7= '=' ( ( (lv_tempsCST_8_0= ruleEInt ) ) | ( (otherlv_9= RULE_ID ) ) ) otherlv_10= ')'
            {
            // InternalDrn.g:1995:3: ( (lv_name_0_0= 'forward' ) )
            // InternalDrn.g:1996:4: (lv_name_0_0= 'forward' )
            {
            // InternalDrn.g:1996:4: (lv_name_0_0= 'forward' )
            // InternalDrn.g:1997:5: lv_name_0_0= 'forward'
            {
            lv_name_0_0=(Token)match(input,31,FOLLOW_14); 

            					newLeafNode(lv_name_0_0, grammarAccess.getFORWARDAccess().getNameForwardKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFORWARDRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "forward");
            				

            }


            }

            otherlv_1=(Token)match(input,25,FOLLOW_28); 

            			newLeafNode(otherlv_1, grammarAccess.getFORWARDAccess().getLeftParenthesisKeyword_1());
            		
            otherlv_2=(Token)match(input,32,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getFORWARDAccess().getDistanceKeyword_2());
            		
            otherlv_3=(Token)match(input,14,FOLLOW_20); 

            			newLeafNode(otherlv_3, grammarAccess.getFORWARDAccess().getEqualsSignKeyword_3());
            		
            // InternalDrn.g:2021:3: ( ( (otherlv_4= RULE_ID ) ) | ( (lv_distanceCST_5_0= ruleEInt ) ) )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_ID) ) {
                alt28=1;
            }
            else if ( (LA28_0==RULE_INT||LA28_0==68) ) {
                alt28=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // InternalDrn.g:2022:4: ( (otherlv_4= RULE_ID ) )
                    {
                    // InternalDrn.g:2022:4: ( (otherlv_4= RULE_ID ) )
                    // InternalDrn.g:2023:5: (otherlv_4= RULE_ID )
                    {
                    // InternalDrn.g:2023:5: (otherlv_4= RULE_ID )
                    // InternalDrn.g:2024:6: otherlv_4= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFORWARDRule());
                    						}
                    					
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_29); 

                    						newLeafNode(otherlv_4, grammarAccess.getFORWARDAccess().getDistanceVarParametreCrossReference_4_0_0());
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDrn.g:2036:4: ( (lv_distanceCST_5_0= ruleEInt ) )
                    {
                    // InternalDrn.g:2036:4: ( (lv_distanceCST_5_0= ruleEInt ) )
                    // InternalDrn.g:2037:5: (lv_distanceCST_5_0= ruleEInt )
                    {
                    // InternalDrn.g:2037:5: (lv_distanceCST_5_0= ruleEInt )
                    // InternalDrn.g:2038:6: lv_distanceCST_5_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getFORWARDAccess().getDistanceCSTEIntParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_29);
                    lv_distanceCST_5_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFORWARDRule());
                    						}
                    						set(
                    							current,
                    							"distanceCST",
                    							lv_distanceCST_5_0,
                    							"sar.drone.Drn.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,33,FOLLOW_6); 

            			newLeafNode(otherlv_6, grammarAccess.getFORWARDAccess().getTempsKeyword_5());
            		
            otherlv_7=(Token)match(input,14,FOLLOW_20); 

            			newLeafNode(otherlv_7, grammarAccess.getFORWARDAccess().getEqualsSignKeyword_6());
            		
            // InternalDrn.g:2064:3: ( ( (lv_tempsCST_8_0= ruleEInt ) ) | ( (otherlv_9= RULE_ID ) ) )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_INT||LA29_0==68) ) {
                alt29=1;
            }
            else if ( (LA29_0==RULE_ID) ) {
                alt29=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // InternalDrn.g:2065:4: ( (lv_tempsCST_8_0= ruleEInt ) )
                    {
                    // InternalDrn.g:2065:4: ( (lv_tempsCST_8_0= ruleEInt ) )
                    // InternalDrn.g:2066:5: (lv_tempsCST_8_0= ruleEInt )
                    {
                    // InternalDrn.g:2066:5: (lv_tempsCST_8_0= ruleEInt )
                    // InternalDrn.g:2067:6: lv_tempsCST_8_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getFORWARDAccess().getTempsCSTEIntParserRuleCall_7_0_0());
                    					
                    pushFollow(FOLLOW_30);
                    lv_tempsCST_8_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFORWARDRule());
                    						}
                    						set(
                    							current,
                    							"tempsCST",
                    							lv_tempsCST_8_0,
                    							"sar.drone.Drn.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDrn.g:2085:4: ( (otherlv_9= RULE_ID ) )
                    {
                    // InternalDrn.g:2085:4: ( (otherlv_9= RULE_ID ) )
                    // InternalDrn.g:2086:5: (otherlv_9= RULE_ID )
                    {
                    // InternalDrn.g:2086:5: (otherlv_9= RULE_ID )
                    // InternalDrn.g:2087:6: otherlv_9= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFORWARDRule());
                    						}
                    					
                    otherlv_9=(Token)match(input,RULE_ID,FOLLOW_30); 

                    						newLeafNode(otherlv_9, grammarAccess.getFORWARDAccess().getTempsVARParametreCrossReference_7_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,27,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getFORWARDAccess().getRightParenthesisKeyword_8());
            		

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
    // InternalDrn.g:2107:1: entryRuleBACKWARD returns [EObject current=null] : iv_ruleBACKWARD= ruleBACKWARD EOF ;
    public final EObject entryRuleBACKWARD() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBACKWARD = null;


        try {
            // InternalDrn.g:2107:49: (iv_ruleBACKWARD= ruleBACKWARD EOF )
            // InternalDrn.g:2108:2: iv_ruleBACKWARD= ruleBACKWARD EOF
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
    // InternalDrn.g:2114:1: ruleBACKWARD returns [EObject current=null] : ( ( (lv_name_0_0= 'backward' ) ) otherlv_1= '(' otherlv_2= 'distance' otherlv_3= '=' ( ( (lv_distanceCST_4_0= ruleEInt ) ) | ( (otherlv_5= RULE_ID ) ) ) otherlv_6= 'temps' otherlv_7= '=' ( ( (lv_tempsCST_8_0= ruleEInt ) ) | ( (otherlv_9= RULE_ID ) ) ) otherlv_10= ')' ) ;
    public final EObject ruleBACKWARD() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_distanceCST_4_0 = null;

        AntlrDatatypeRuleToken lv_tempsCST_8_0 = null;



        	enterRule();

        try {
            // InternalDrn.g:2120:2: ( ( ( (lv_name_0_0= 'backward' ) ) otherlv_1= '(' otherlv_2= 'distance' otherlv_3= '=' ( ( (lv_distanceCST_4_0= ruleEInt ) ) | ( (otherlv_5= RULE_ID ) ) ) otherlv_6= 'temps' otherlv_7= '=' ( ( (lv_tempsCST_8_0= ruleEInt ) ) | ( (otherlv_9= RULE_ID ) ) ) otherlv_10= ')' ) )
            // InternalDrn.g:2121:2: ( ( (lv_name_0_0= 'backward' ) ) otherlv_1= '(' otherlv_2= 'distance' otherlv_3= '=' ( ( (lv_distanceCST_4_0= ruleEInt ) ) | ( (otherlv_5= RULE_ID ) ) ) otherlv_6= 'temps' otherlv_7= '=' ( ( (lv_tempsCST_8_0= ruleEInt ) ) | ( (otherlv_9= RULE_ID ) ) ) otherlv_10= ')' )
            {
            // InternalDrn.g:2121:2: ( ( (lv_name_0_0= 'backward' ) ) otherlv_1= '(' otherlv_2= 'distance' otherlv_3= '=' ( ( (lv_distanceCST_4_0= ruleEInt ) ) | ( (otherlv_5= RULE_ID ) ) ) otherlv_6= 'temps' otherlv_7= '=' ( ( (lv_tempsCST_8_0= ruleEInt ) ) | ( (otherlv_9= RULE_ID ) ) ) otherlv_10= ')' )
            // InternalDrn.g:2122:3: ( (lv_name_0_0= 'backward' ) ) otherlv_1= '(' otherlv_2= 'distance' otherlv_3= '=' ( ( (lv_distanceCST_4_0= ruleEInt ) ) | ( (otherlv_5= RULE_ID ) ) ) otherlv_6= 'temps' otherlv_7= '=' ( ( (lv_tempsCST_8_0= ruleEInt ) ) | ( (otherlv_9= RULE_ID ) ) ) otherlv_10= ')'
            {
            // InternalDrn.g:2122:3: ( (lv_name_0_0= 'backward' ) )
            // InternalDrn.g:2123:4: (lv_name_0_0= 'backward' )
            {
            // InternalDrn.g:2123:4: (lv_name_0_0= 'backward' )
            // InternalDrn.g:2124:5: lv_name_0_0= 'backward'
            {
            lv_name_0_0=(Token)match(input,34,FOLLOW_14); 

            					newLeafNode(lv_name_0_0, grammarAccess.getBACKWARDAccess().getNameBackwardKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBACKWARDRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "backward");
            				

            }


            }

            otherlv_1=(Token)match(input,25,FOLLOW_28); 

            			newLeafNode(otherlv_1, grammarAccess.getBACKWARDAccess().getLeftParenthesisKeyword_1());
            		
            otherlv_2=(Token)match(input,32,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getBACKWARDAccess().getDistanceKeyword_2());
            		
            otherlv_3=(Token)match(input,14,FOLLOW_20); 

            			newLeafNode(otherlv_3, grammarAccess.getBACKWARDAccess().getEqualsSignKeyword_3());
            		
            // InternalDrn.g:2148:3: ( ( (lv_distanceCST_4_0= ruleEInt ) ) | ( (otherlv_5= RULE_ID ) ) )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_INT||LA30_0==68) ) {
                alt30=1;
            }
            else if ( (LA30_0==RULE_ID) ) {
                alt30=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // InternalDrn.g:2149:4: ( (lv_distanceCST_4_0= ruleEInt ) )
                    {
                    // InternalDrn.g:2149:4: ( (lv_distanceCST_4_0= ruleEInt ) )
                    // InternalDrn.g:2150:5: (lv_distanceCST_4_0= ruleEInt )
                    {
                    // InternalDrn.g:2150:5: (lv_distanceCST_4_0= ruleEInt )
                    // InternalDrn.g:2151:6: lv_distanceCST_4_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getBACKWARDAccess().getDistanceCSTEIntParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_29);
                    lv_distanceCST_4_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBACKWARDRule());
                    						}
                    						set(
                    							current,
                    							"distanceCST",
                    							lv_distanceCST_4_0,
                    							"sar.drone.Drn.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDrn.g:2169:4: ( (otherlv_5= RULE_ID ) )
                    {
                    // InternalDrn.g:2169:4: ( (otherlv_5= RULE_ID ) )
                    // InternalDrn.g:2170:5: (otherlv_5= RULE_ID )
                    {
                    // InternalDrn.g:2170:5: (otherlv_5= RULE_ID )
                    // InternalDrn.g:2171:6: otherlv_5= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getBACKWARDRule());
                    						}
                    					
                    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_29); 

                    						newLeafNode(otherlv_5, grammarAccess.getBACKWARDAccess().getDistanceVarParametreCrossReference_4_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,33,FOLLOW_6); 

            			newLeafNode(otherlv_6, grammarAccess.getBACKWARDAccess().getTempsKeyword_5());
            		
            otherlv_7=(Token)match(input,14,FOLLOW_20); 

            			newLeafNode(otherlv_7, grammarAccess.getBACKWARDAccess().getEqualsSignKeyword_6());
            		
            // InternalDrn.g:2191:3: ( ( (lv_tempsCST_8_0= ruleEInt ) ) | ( (otherlv_9= RULE_ID ) ) )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==RULE_INT||LA31_0==68) ) {
                alt31=1;
            }
            else if ( (LA31_0==RULE_ID) ) {
                alt31=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // InternalDrn.g:2192:4: ( (lv_tempsCST_8_0= ruleEInt ) )
                    {
                    // InternalDrn.g:2192:4: ( (lv_tempsCST_8_0= ruleEInt ) )
                    // InternalDrn.g:2193:5: (lv_tempsCST_8_0= ruleEInt )
                    {
                    // InternalDrn.g:2193:5: (lv_tempsCST_8_0= ruleEInt )
                    // InternalDrn.g:2194:6: lv_tempsCST_8_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getBACKWARDAccess().getTempsCSTEIntParserRuleCall_7_0_0());
                    					
                    pushFollow(FOLLOW_30);
                    lv_tempsCST_8_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBACKWARDRule());
                    						}
                    						set(
                    							current,
                    							"tempsCST",
                    							lv_tempsCST_8_0,
                    							"sar.drone.Drn.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDrn.g:2212:4: ( (otherlv_9= RULE_ID ) )
                    {
                    // InternalDrn.g:2212:4: ( (otherlv_9= RULE_ID ) )
                    // InternalDrn.g:2213:5: (otherlv_9= RULE_ID )
                    {
                    // InternalDrn.g:2213:5: (otherlv_9= RULE_ID )
                    // InternalDrn.g:2214:6: otherlv_9= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getBACKWARDRule());
                    						}
                    					
                    otherlv_9=(Token)match(input,RULE_ID,FOLLOW_30); 

                    						newLeafNode(otherlv_9, grammarAccess.getBACKWARDAccess().getTempsVARParametreCrossReference_7_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,27,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getBACKWARDAccess().getRightParenthesisKeyword_8());
            		

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
    // InternalDrn.g:2234:1: entryRuleDepX_Impl returns [EObject current=null] : iv_ruleDepX_Impl= ruleDepX_Impl EOF ;
    public final EObject entryRuleDepX_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDepX_Impl = null;


        try {
            // InternalDrn.g:2234:50: (iv_ruleDepX_Impl= ruleDepX_Impl EOF )
            // InternalDrn.g:2235:2: iv_ruleDepX_Impl= ruleDepX_Impl EOF
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
    // InternalDrn.g:2241:1: ruleDepX_Impl returns [EObject current=null] : (this_LEFT_0= ruleLEFT | this_RIGHT_1= ruleRIGHT ) ;
    public final EObject ruleDepX_Impl() throws RecognitionException {
        EObject current = null;

        EObject this_LEFT_0 = null;

        EObject this_RIGHT_1 = null;



        	enterRule();

        try {
            // InternalDrn.g:2247:2: ( (this_LEFT_0= ruleLEFT | this_RIGHT_1= ruleRIGHT ) )
            // InternalDrn.g:2248:2: (this_LEFT_0= ruleLEFT | this_RIGHT_1= ruleRIGHT )
            {
            // InternalDrn.g:2248:2: (this_LEFT_0= ruleLEFT | this_RIGHT_1= ruleRIGHT )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==35) ) {
                alt32=1;
            }
            else if ( (LA32_0==36) ) {
                alt32=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // InternalDrn.g:2249:3: this_LEFT_0= ruleLEFT
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
                    // InternalDrn.g:2258:3: this_RIGHT_1= ruleRIGHT
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
    // InternalDrn.g:2270:1: entryRuleLEFT returns [EObject current=null] : iv_ruleLEFT= ruleLEFT EOF ;
    public final EObject entryRuleLEFT() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLEFT = null;


        try {
            // InternalDrn.g:2270:45: (iv_ruleLEFT= ruleLEFT EOF )
            // InternalDrn.g:2271:2: iv_ruleLEFT= ruleLEFT EOF
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
    // InternalDrn.g:2277:1: ruleLEFT returns [EObject current=null] : ( ( (lv_name_0_0= 'left' ) ) otherlv_1= '(' otherlv_2= 'distance' otherlv_3= '=' ( ( (lv_distanceCST_4_0= ruleEInt ) ) | ( (otherlv_5= RULE_ID ) ) ) otherlv_6= 'temps' otherlv_7= '=' ( ( (lv_tempsCST_8_0= ruleEInt ) ) | ( (otherlv_9= RULE_ID ) ) ) otherlv_10= ')' ) ;
    public final EObject ruleLEFT() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_distanceCST_4_0 = null;

        AntlrDatatypeRuleToken lv_tempsCST_8_0 = null;



        	enterRule();

        try {
            // InternalDrn.g:2283:2: ( ( ( (lv_name_0_0= 'left' ) ) otherlv_1= '(' otherlv_2= 'distance' otherlv_3= '=' ( ( (lv_distanceCST_4_0= ruleEInt ) ) | ( (otherlv_5= RULE_ID ) ) ) otherlv_6= 'temps' otherlv_7= '=' ( ( (lv_tempsCST_8_0= ruleEInt ) ) | ( (otherlv_9= RULE_ID ) ) ) otherlv_10= ')' ) )
            // InternalDrn.g:2284:2: ( ( (lv_name_0_0= 'left' ) ) otherlv_1= '(' otherlv_2= 'distance' otherlv_3= '=' ( ( (lv_distanceCST_4_0= ruleEInt ) ) | ( (otherlv_5= RULE_ID ) ) ) otherlv_6= 'temps' otherlv_7= '=' ( ( (lv_tempsCST_8_0= ruleEInt ) ) | ( (otherlv_9= RULE_ID ) ) ) otherlv_10= ')' )
            {
            // InternalDrn.g:2284:2: ( ( (lv_name_0_0= 'left' ) ) otherlv_1= '(' otherlv_2= 'distance' otherlv_3= '=' ( ( (lv_distanceCST_4_0= ruleEInt ) ) | ( (otherlv_5= RULE_ID ) ) ) otherlv_6= 'temps' otherlv_7= '=' ( ( (lv_tempsCST_8_0= ruleEInt ) ) | ( (otherlv_9= RULE_ID ) ) ) otherlv_10= ')' )
            // InternalDrn.g:2285:3: ( (lv_name_0_0= 'left' ) ) otherlv_1= '(' otherlv_2= 'distance' otherlv_3= '=' ( ( (lv_distanceCST_4_0= ruleEInt ) ) | ( (otherlv_5= RULE_ID ) ) ) otherlv_6= 'temps' otherlv_7= '=' ( ( (lv_tempsCST_8_0= ruleEInt ) ) | ( (otherlv_9= RULE_ID ) ) ) otherlv_10= ')'
            {
            // InternalDrn.g:2285:3: ( (lv_name_0_0= 'left' ) )
            // InternalDrn.g:2286:4: (lv_name_0_0= 'left' )
            {
            // InternalDrn.g:2286:4: (lv_name_0_0= 'left' )
            // InternalDrn.g:2287:5: lv_name_0_0= 'left'
            {
            lv_name_0_0=(Token)match(input,35,FOLLOW_14); 

            					newLeafNode(lv_name_0_0, grammarAccess.getLEFTAccess().getNameLeftKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLEFTRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "left");
            				

            }


            }

            otherlv_1=(Token)match(input,25,FOLLOW_28); 

            			newLeafNode(otherlv_1, grammarAccess.getLEFTAccess().getLeftParenthesisKeyword_1());
            		
            otherlv_2=(Token)match(input,32,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getLEFTAccess().getDistanceKeyword_2());
            		
            otherlv_3=(Token)match(input,14,FOLLOW_20); 

            			newLeafNode(otherlv_3, grammarAccess.getLEFTAccess().getEqualsSignKeyword_3());
            		
            // InternalDrn.g:2311:3: ( ( (lv_distanceCST_4_0= ruleEInt ) ) | ( (otherlv_5= RULE_ID ) ) )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==RULE_INT||LA33_0==68) ) {
                alt33=1;
            }
            else if ( (LA33_0==RULE_ID) ) {
                alt33=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // InternalDrn.g:2312:4: ( (lv_distanceCST_4_0= ruleEInt ) )
                    {
                    // InternalDrn.g:2312:4: ( (lv_distanceCST_4_0= ruleEInt ) )
                    // InternalDrn.g:2313:5: (lv_distanceCST_4_0= ruleEInt )
                    {
                    // InternalDrn.g:2313:5: (lv_distanceCST_4_0= ruleEInt )
                    // InternalDrn.g:2314:6: lv_distanceCST_4_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getLEFTAccess().getDistanceCSTEIntParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_29);
                    lv_distanceCST_4_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLEFTRule());
                    						}
                    						set(
                    							current,
                    							"distanceCST",
                    							lv_distanceCST_4_0,
                    							"sar.drone.Drn.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDrn.g:2332:4: ( (otherlv_5= RULE_ID ) )
                    {
                    // InternalDrn.g:2332:4: ( (otherlv_5= RULE_ID ) )
                    // InternalDrn.g:2333:5: (otherlv_5= RULE_ID )
                    {
                    // InternalDrn.g:2333:5: (otherlv_5= RULE_ID )
                    // InternalDrn.g:2334:6: otherlv_5= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLEFTRule());
                    						}
                    					
                    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_29); 

                    						newLeafNode(otherlv_5, grammarAccess.getLEFTAccess().getDistanceVarParametreCrossReference_4_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,33,FOLLOW_6); 

            			newLeafNode(otherlv_6, grammarAccess.getLEFTAccess().getTempsKeyword_5());
            		
            otherlv_7=(Token)match(input,14,FOLLOW_20); 

            			newLeafNode(otherlv_7, grammarAccess.getLEFTAccess().getEqualsSignKeyword_6());
            		
            // InternalDrn.g:2354:3: ( ( (lv_tempsCST_8_0= ruleEInt ) ) | ( (otherlv_9= RULE_ID ) ) )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==RULE_INT||LA34_0==68) ) {
                alt34=1;
            }
            else if ( (LA34_0==RULE_ID) ) {
                alt34=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // InternalDrn.g:2355:4: ( (lv_tempsCST_8_0= ruleEInt ) )
                    {
                    // InternalDrn.g:2355:4: ( (lv_tempsCST_8_0= ruleEInt ) )
                    // InternalDrn.g:2356:5: (lv_tempsCST_8_0= ruleEInt )
                    {
                    // InternalDrn.g:2356:5: (lv_tempsCST_8_0= ruleEInt )
                    // InternalDrn.g:2357:6: lv_tempsCST_8_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getLEFTAccess().getTempsCSTEIntParserRuleCall_7_0_0());
                    					
                    pushFollow(FOLLOW_30);
                    lv_tempsCST_8_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLEFTRule());
                    						}
                    						set(
                    							current,
                    							"tempsCST",
                    							lv_tempsCST_8_0,
                    							"sar.drone.Drn.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDrn.g:2375:4: ( (otherlv_9= RULE_ID ) )
                    {
                    // InternalDrn.g:2375:4: ( (otherlv_9= RULE_ID ) )
                    // InternalDrn.g:2376:5: (otherlv_9= RULE_ID )
                    {
                    // InternalDrn.g:2376:5: (otherlv_9= RULE_ID )
                    // InternalDrn.g:2377:6: otherlv_9= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLEFTRule());
                    						}
                    					
                    otherlv_9=(Token)match(input,RULE_ID,FOLLOW_30); 

                    						newLeafNode(otherlv_9, grammarAccess.getLEFTAccess().getTempsVARParametreCrossReference_7_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,27,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getLEFTAccess().getRightParenthesisKeyword_8());
            		

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
    // InternalDrn.g:2397:1: entryRuleRIGHT returns [EObject current=null] : iv_ruleRIGHT= ruleRIGHT EOF ;
    public final EObject entryRuleRIGHT() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRIGHT = null;


        try {
            // InternalDrn.g:2397:46: (iv_ruleRIGHT= ruleRIGHT EOF )
            // InternalDrn.g:2398:2: iv_ruleRIGHT= ruleRIGHT EOF
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
    // InternalDrn.g:2404:1: ruleRIGHT returns [EObject current=null] : ( ( (lv_name_0_0= 'right' ) ) otherlv_1= '(' otherlv_2= 'distance' otherlv_3= '=' ( ( (lv_distanceCST_4_0= ruleEInt ) ) | ( (otherlv_5= RULE_ID ) ) ) otherlv_6= 'temps' otherlv_7= '=' ( ( (lv_tempsCST_8_0= ruleEInt ) ) | ( (otherlv_9= RULE_ID ) ) ) otherlv_10= ')' ) ;
    public final EObject ruleRIGHT() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_distanceCST_4_0 = null;

        AntlrDatatypeRuleToken lv_tempsCST_8_0 = null;



        	enterRule();

        try {
            // InternalDrn.g:2410:2: ( ( ( (lv_name_0_0= 'right' ) ) otherlv_1= '(' otherlv_2= 'distance' otherlv_3= '=' ( ( (lv_distanceCST_4_0= ruleEInt ) ) | ( (otherlv_5= RULE_ID ) ) ) otherlv_6= 'temps' otherlv_7= '=' ( ( (lv_tempsCST_8_0= ruleEInt ) ) | ( (otherlv_9= RULE_ID ) ) ) otherlv_10= ')' ) )
            // InternalDrn.g:2411:2: ( ( (lv_name_0_0= 'right' ) ) otherlv_1= '(' otherlv_2= 'distance' otherlv_3= '=' ( ( (lv_distanceCST_4_0= ruleEInt ) ) | ( (otherlv_5= RULE_ID ) ) ) otherlv_6= 'temps' otherlv_7= '=' ( ( (lv_tempsCST_8_0= ruleEInt ) ) | ( (otherlv_9= RULE_ID ) ) ) otherlv_10= ')' )
            {
            // InternalDrn.g:2411:2: ( ( (lv_name_0_0= 'right' ) ) otherlv_1= '(' otherlv_2= 'distance' otherlv_3= '=' ( ( (lv_distanceCST_4_0= ruleEInt ) ) | ( (otherlv_5= RULE_ID ) ) ) otherlv_6= 'temps' otherlv_7= '=' ( ( (lv_tempsCST_8_0= ruleEInt ) ) | ( (otherlv_9= RULE_ID ) ) ) otherlv_10= ')' )
            // InternalDrn.g:2412:3: ( (lv_name_0_0= 'right' ) ) otherlv_1= '(' otherlv_2= 'distance' otherlv_3= '=' ( ( (lv_distanceCST_4_0= ruleEInt ) ) | ( (otherlv_5= RULE_ID ) ) ) otherlv_6= 'temps' otherlv_7= '=' ( ( (lv_tempsCST_8_0= ruleEInt ) ) | ( (otherlv_9= RULE_ID ) ) ) otherlv_10= ')'
            {
            // InternalDrn.g:2412:3: ( (lv_name_0_0= 'right' ) )
            // InternalDrn.g:2413:4: (lv_name_0_0= 'right' )
            {
            // InternalDrn.g:2413:4: (lv_name_0_0= 'right' )
            // InternalDrn.g:2414:5: lv_name_0_0= 'right'
            {
            lv_name_0_0=(Token)match(input,36,FOLLOW_14); 

            					newLeafNode(lv_name_0_0, grammarAccess.getRIGHTAccess().getNameRightKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRIGHTRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "right");
            				

            }


            }

            otherlv_1=(Token)match(input,25,FOLLOW_28); 

            			newLeafNode(otherlv_1, grammarAccess.getRIGHTAccess().getLeftParenthesisKeyword_1());
            		
            otherlv_2=(Token)match(input,32,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getRIGHTAccess().getDistanceKeyword_2());
            		
            otherlv_3=(Token)match(input,14,FOLLOW_20); 

            			newLeafNode(otherlv_3, grammarAccess.getRIGHTAccess().getEqualsSignKeyword_3());
            		
            // InternalDrn.g:2438:3: ( ( (lv_distanceCST_4_0= ruleEInt ) ) | ( (otherlv_5= RULE_ID ) ) )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==RULE_INT||LA35_0==68) ) {
                alt35=1;
            }
            else if ( (LA35_0==RULE_ID) ) {
                alt35=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // InternalDrn.g:2439:4: ( (lv_distanceCST_4_0= ruleEInt ) )
                    {
                    // InternalDrn.g:2439:4: ( (lv_distanceCST_4_0= ruleEInt ) )
                    // InternalDrn.g:2440:5: (lv_distanceCST_4_0= ruleEInt )
                    {
                    // InternalDrn.g:2440:5: (lv_distanceCST_4_0= ruleEInt )
                    // InternalDrn.g:2441:6: lv_distanceCST_4_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getRIGHTAccess().getDistanceCSTEIntParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_29);
                    lv_distanceCST_4_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRIGHTRule());
                    						}
                    						set(
                    							current,
                    							"distanceCST",
                    							lv_distanceCST_4_0,
                    							"sar.drone.Drn.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDrn.g:2459:4: ( (otherlv_5= RULE_ID ) )
                    {
                    // InternalDrn.g:2459:4: ( (otherlv_5= RULE_ID ) )
                    // InternalDrn.g:2460:5: (otherlv_5= RULE_ID )
                    {
                    // InternalDrn.g:2460:5: (otherlv_5= RULE_ID )
                    // InternalDrn.g:2461:6: otherlv_5= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRIGHTRule());
                    						}
                    					
                    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_29); 

                    						newLeafNode(otherlv_5, grammarAccess.getRIGHTAccess().getDistanceVarParametreCrossReference_4_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,33,FOLLOW_6); 

            			newLeafNode(otherlv_6, grammarAccess.getRIGHTAccess().getTempsKeyword_5());
            		
            otherlv_7=(Token)match(input,14,FOLLOW_20); 

            			newLeafNode(otherlv_7, grammarAccess.getRIGHTAccess().getEqualsSignKeyword_6());
            		
            // InternalDrn.g:2481:3: ( ( (lv_tempsCST_8_0= ruleEInt ) ) | ( (otherlv_9= RULE_ID ) ) )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==RULE_INT||LA36_0==68) ) {
                alt36=1;
            }
            else if ( (LA36_0==RULE_ID) ) {
                alt36=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }
            switch (alt36) {
                case 1 :
                    // InternalDrn.g:2482:4: ( (lv_tempsCST_8_0= ruleEInt ) )
                    {
                    // InternalDrn.g:2482:4: ( (lv_tempsCST_8_0= ruleEInt ) )
                    // InternalDrn.g:2483:5: (lv_tempsCST_8_0= ruleEInt )
                    {
                    // InternalDrn.g:2483:5: (lv_tempsCST_8_0= ruleEInt )
                    // InternalDrn.g:2484:6: lv_tempsCST_8_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getRIGHTAccess().getTempsCSTEIntParserRuleCall_7_0_0());
                    					
                    pushFollow(FOLLOW_30);
                    lv_tempsCST_8_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRIGHTRule());
                    						}
                    						set(
                    							current,
                    							"tempsCST",
                    							lv_tempsCST_8_0,
                    							"sar.drone.Drn.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDrn.g:2502:4: ( (otherlv_9= RULE_ID ) )
                    {
                    // InternalDrn.g:2502:4: ( (otherlv_9= RULE_ID ) )
                    // InternalDrn.g:2503:5: (otherlv_9= RULE_ID )
                    {
                    // InternalDrn.g:2503:5: (otherlv_9= RULE_ID )
                    // InternalDrn.g:2504:6: otherlv_9= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRIGHTRule());
                    						}
                    					
                    otherlv_9=(Token)match(input,RULE_ID,FOLLOW_30); 

                    						newLeafNode(otherlv_9, grammarAccess.getRIGHTAccess().getTempsVARParametreCrossReference_7_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,27,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getRIGHTAccess().getRightParenthesisKeyword_8());
            		

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
    // InternalDrn.g:2524:1: entryRuleDepZ_Impl returns [EObject current=null] : iv_ruleDepZ_Impl= ruleDepZ_Impl EOF ;
    public final EObject entryRuleDepZ_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDepZ_Impl = null;


        try {
            // InternalDrn.g:2524:50: (iv_ruleDepZ_Impl= ruleDepZ_Impl EOF )
            // InternalDrn.g:2525:2: iv_ruleDepZ_Impl= ruleDepZ_Impl EOF
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
    // InternalDrn.g:2531:1: ruleDepZ_Impl returns [EObject current=null] : (this_UP_0= ruleUP | this_DOWN_1= ruleDOWN ) ;
    public final EObject ruleDepZ_Impl() throws RecognitionException {
        EObject current = null;

        EObject this_UP_0 = null;

        EObject this_DOWN_1 = null;



        	enterRule();

        try {
            // InternalDrn.g:2537:2: ( (this_UP_0= ruleUP | this_DOWN_1= ruleDOWN ) )
            // InternalDrn.g:2538:2: (this_UP_0= ruleUP | this_DOWN_1= ruleDOWN )
            {
            // InternalDrn.g:2538:2: (this_UP_0= ruleUP | this_DOWN_1= ruleDOWN )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==37) ) {
                alt37=1;
            }
            else if ( (LA37_0==38) ) {
                alt37=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }
            switch (alt37) {
                case 1 :
                    // InternalDrn.g:2539:3: this_UP_0= ruleUP
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
                    // InternalDrn.g:2548:3: this_DOWN_1= ruleDOWN
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
    // InternalDrn.g:2560:1: entryRuleUP returns [EObject current=null] : iv_ruleUP= ruleUP EOF ;
    public final EObject entryRuleUP() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUP = null;


        try {
            // InternalDrn.g:2560:43: (iv_ruleUP= ruleUP EOF )
            // InternalDrn.g:2561:2: iv_ruleUP= ruleUP EOF
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
    // InternalDrn.g:2567:1: ruleUP returns [EObject current=null] : ( ( (lv_name_0_0= 'up' ) ) otherlv_1= '(' otherlv_2= 'distance' otherlv_3= '=' ( ( (lv_distanceCST_4_0= ruleEInt ) ) | ( (otherlv_5= RULE_ID ) ) ) otherlv_6= 'temps' otherlv_7= '=' ( ( (lv_tempsCST_8_0= ruleEInt ) ) | ( (otherlv_9= RULE_ID ) ) ) otherlv_10= ')' ) ;
    public final EObject ruleUP() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_distanceCST_4_0 = null;

        AntlrDatatypeRuleToken lv_tempsCST_8_0 = null;



        	enterRule();

        try {
            // InternalDrn.g:2573:2: ( ( ( (lv_name_0_0= 'up' ) ) otherlv_1= '(' otherlv_2= 'distance' otherlv_3= '=' ( ( (lv_distanceCST_4_0= ruleEInt ) ) | ( (otherlv_5= RULE_ID ) ) ) otherlv_6= 'temps' otherlv_7= '=' ( ( (lv_tempsCST_8_0= ruleEInt ) ) | ( (otherlv_9= RULE_ID ) ) ) otherlv_10= ')' ) )
            // InternalDrn.g:2574:2: ( ( (lv_name_0_0= 'up' ) ) otherlv_1= '(' otherlv_2= 'distance' otherlv_3= '=' ( ( (lv_distanceCST_4_0= ruleEInt ) ) | ( (otherlv_5= RULE_ID ) ) ) otherlv_6= 'temps' otherlv_7= '=' ( ( (lv_tempsCST_8_0= ruleEInt ) ) | ( (otherlv_9= RULE_ID ) ) ) otherlv_10= ')' )
            {
            // InternalDrn.g:2574:2: ( ( (lv_name_0_0= 'up' ) ) otherlv_1= '(' otherlv_2= 'distance' otherlv_3= '=' ( ( (lv_distanceCST_4_0= ruleEInt ) ) | ( (otherlv_5= RULE_ID ) ) ) otherlv_6= 'temps' otherlv_7= '=' ( ( (lv_tempsCST_8_0= ruleEInt ) ) | ( (otherlv_9= RULE_ID ) ) ) otherlv_10= ')' )
            // InternalDrn.g:2575:3: ( (lv_name_0_0= 'up' ) ) otherlv_1= '(' otherlv_2= 'distance' otherlv_3= '=' ( ( (lv_distanceCST_4_0= ruleEInt ) ) | ( (otherlv_5= RULE_ID ) ) ) otherlv_6= 'temps' otherlv_7= '=' ( ( (lv_tempsCST_8_0= ruleEInt ) ) | ( (otherlv_9= RULE_ID ) ) ) otherlv_10= ')'
            {
            // InternalDrn.g:2575:3: ( (lv_name_0_0= 'up' ) )
            // InternalDrn.g:2576:4: (lv_name_0_0= 'up' )
            {
            // InternalDrn.g:2576:4: (lv_name_0_0= 'up' )
            // InternalDrn.g:2577:5: lv_name_0_0= 'up'
            {
            lv_name_0_0=(Token)match(input,37,FOLLOW_14); 

            					newLeafNode(lv_name_0_0, grammarAccess.getUPAccess().getNameUpKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUPRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "up");
            				

            }


            }

            otherlv_1=(Token)match(input,25,FOLLOW_28); 

            			newLeafNode(otherlv_1, grammarAccess.getUPAccess().getLeftParenthesisKeyword_1());
            		
            otherlv_2=(Token)match(input,32,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getUPAccess().getDistanceKeyword_2());
            		
            otherlv_3=(Token)match(input,14,FOLLOW_20); 

            			newLeafNode(otherlv_3, grammarAccess.getUPAccess().getEqualsSignKeyword_3());
            		
            // InternalDrn.g:2601:3: ( ( (lv_distanceCST_4_0= ruleEInt ) ) | ( (otherlv_5= RULE_ID ) ) )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==RULE_INT||LA38_0==68) ) {
                alt38=1;
            }
            else if ( (LA38_0==RULE_ID) ) {
                alt38=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // InternalDrn.g:2602:4: ( (lv_distanceCST_4_0= ruleEInt ) )
                    {
                    // InternalDrn.g:2602:4: ( (lv_distanceCST_4_0= ruleEInt ) )
                    // InternalDrn.g:2603:5: (lv_distanceCST_4_0= ruleEInt )
                    {
                    // InternalDrn.g:2603:5: (lv_distanceCST_4_0= ruleEInt )
                    // InternalDrn.g:2604:6: lv_distanceCST_4_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getUPAccess().getDistanceCSTEIntParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_29);
                    lv_distanceCST_4_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getUPRule());
                    						}
                    						set(
                    							current,
                    							"distanceCST",
                    							lv_distanceCST_4_0,
                    							"sar.drone.Drn.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDrn.g:2622:4: ( (otherlv_5= RULE_ID ) )
                    {
                    // InternalDrn.g:2622:4: ( (otherlv_5= RULE_ID ) )
                    // InternalDrn.g:2623:5: (otherlv_5= RULE_ID )
                    {
                    // InternalDrn.g:2623:5: (otherlv_5= RULE_ID )
                    // InternalDrn.g:2624:6: otherlv_5= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getUPRule());
                    						}
                    					
                    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_29); 

                    						newLeafNode(otherlv_5, grammarAccess.getUPAccess().getDistanceVarParametreCrossReference_4_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,33,FOLLOW_6); 

            			newLeafNode(otherlv_6, grammarAccess.getUPAccess().getTempsKeyword_5());
            		
            otherlv_7=(Token)match(input,14,FOLLOW_20); 

            			newLeafNode(otherlv_7, grammarAccess.getUPAccess().getEqualsSignKeyword_6());
            		
            // InternalDrn.g:2644:3: ( ( (lv_tempsCST_8_0= ruleEInt ) ) | ( (otherlv_9= RULE_ID ) ) )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==RULE_INT||LA39_0==68) ) {
                alt39=1;
            }
            else if ( (LA39_0==RULE_ID) ) {
                alt39=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }
            switch (alt39) {
                case 1 :
                    // InternalDrn.g:2645:4: ( (lv_tempsCST_8_0= ruleEInt ) )
                    {
                    // InternalDrn.g:2645:4: ( (lv_tempsCST_8_0= ruleEInt ) )
                    // InternalDrn.g:2646:5: (lv_tempsCST_8_0= ruleEInt )
                    {
                    // InternalDrn.g:2646:5: (lv_tempsCST_8_0= ruleEInt )
                    // InternalDrn.g:2647:6: lv_tempsCST_8_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getUPAccess().getTempsCSTEIntParserRuleCall_7_0_0());
                    					
                    pushFollow(FOLLOW_30);
                    lv_tempsCST_8_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getUPRule());
                    						}
                    						set(
                    							current,
                    							"tempsCST",
                    							lv_tempsCST_8_0,
                    							"sar.drone.Drn.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDrn.g:2665:4: ( (otherlv_9= RULE_ID ) )
                    {
                    // InternalDrn.g:2665:4: ( (otherlv_9= RULE_ID ) )
                    // InternalDrn.g:2666:5: (otherlv_9= RULE_ID )
                    {
                    // InternalDrn.g:2666:5: (otherlv_9= RULE_ID )
                    // InternalDrn.g:2667:6: otherlv_9= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getUPRule());
                    						}
                    					
                    otherlv_9=(Token)match(input,RULE_ID,FOLLOW_30); 

                    						newLeafNode(otherlv_9, grammarAccess.getUPAccess().getTempsVARParametreCrossReference_7_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,27,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getUPAccess().getRightParenthesisKeyword_8());
            		

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
    // InternalDrn.g:2687:1: entryRuleDOWN returns [EObject current=null] : iv_ruleDOWN= ruleDOWN EOF ;
    public final EObject entryRuleDOWN() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDOWN = null;


        try {
            // InternalDrn.g:2687:45: (iv_ruleDOWN= ruleDOWN EOF )
            // InternalDrn.g:2688:2: iv_ruleDOWN= ruleDOWN EOF
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
    // InternalDrn.g:2694:1: ruleDOWN returns [EObject current=null] : ( ( (lv_name_0_0= 'down' ) ) otherlv_1= '(' otherlv_2= 'distance' otherlv_3= '=' ( ( (lv_distanceCST_4_0= ruleEInt ) ) | ( (otherlv_5= RULE_ID ) ) ) otherlv_6= 'temps' otherlv_7= '=' ( ( (lv_tempsCST_8_0= ruleEInt ) ) | ( (otherlv_9= RULE_ID ) ) ) otherlv_10= ')' ) ;
    public final EObject ruleDOWN() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_distanceCST_4_0 = null;

        AntlrDatatypeRuleToken lv_tempsCST_8_0 = null;



        	enterRule();

        try {
            // InternalDrn.g:2700:2: ( ( ( (lv_name_0_0= 'down' ) ) otherlv_1= '(' otherlv_2= 'distance' otherlv_3= '=' ( ( (lv_distanceCST_4_0= ruleEInt ) ) | ( (otherlv_5= RULE_ID ) ) ) otherlv_6= 'temps' otherlv_7= '=' ( ( (lv_tempsCST_8_0= ruleEInt ) ) | ( (otherlv_9= RULE_ID ) ) ) otherlv_10= ')' ) )
            // InternalDrn.g:2701:2: ( ( (lv_name_0_0= 'down' ) ) otherlv_1= '(' otherlv_2= 'distance' otherlv_3= '=' ( ( (lv_distanceCST_4_0= ruleEInt ) ) | ( (otherlv_5= RULE_ID ) ) ) otherlv_6= 'temps' otherlv_7= '=' ( ( (lv_tempsCST_8_0= ruleEInt ) ) | ( (otherlv_9= RULE_ID ) ) ) otherlv_10= ')' )
            {
            // InternalDrn.g:2701:2: ( ( (lv_name_0_0= 'down' ) ) otherlv_1= '(' otherlv_2= 'distance' otherlv_3= '=' ( ( (lv_distanceCST_4_0= ruleEInt ) ) | ( (otherlv_5= RULE_ID ) ) ) otherlv_6= 'temps' otherlv_7= '=' ( ( (lv_tempsCST_8_0= ruleEInt ) ) | ( (otherlv_9= RULE_ID ) ) ) otherlv_10= ')' )
            // InternalDrn.g:2702:3: ( (lv_name_0_0= 'down' ) ) otherlv_1= '(' otherlv_2= 'distance' otherlv_3= '=' ( ( (lv_distanceCST_4_0= ruleEInt ) ) | ( (otherlv_5= RULE_ID ) ) ) otherlv_6= 'temps' otherlv_7= '=' ( ( (lv_tempsCST_8_0= ruleEInt ) ) | ( (otherlv_9= RULE_ID ) ) ) otherlv_10= ')'
            {
            // InternalDrn.g:2702:3: ( (lv_name_0_0= 'down' ) )
            // InternalDrn.g:2703:4: (lv_name_0_0= 'down' )
            {
            // InternalDrn.g:2703:4: (lv_name_0_0= 'down' )
            // InternalDrn.g:2704:5: lv_name_0_0= 'down'
            {
            lv_name_0_0=(Token)match(input,38,FOLLOW_14); 

            					newLeafNode(lv_name_0_0, grammarAccess.getDOWNAccess().getNameDownKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDOWNRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "down");
            				

            }


            }

            otherlv_1=(Token)match(input,25,FOLLOW_28); 

            			newLeafNode(otherlv_1, grammarAccess.getDOWNAccess().getLeftParenthesisKeyword_1());
            		
            otherlv_2=(Token)match(input,32,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getDOWNAccess().getDistanceKeyword_2());
            		
            otherlv_3=(Token)match(input,14,FOLLOW_20); 

            			newLeafNode(otherlv_3, grammarAccess.getDOWNAccess().getEqualsSignKeyword_3());
            		
            // InternalDrn.g:2728:3: ( ( (lv_distanceCST_4_0= ruleEInt ) ) | ( (otherlv_5= RULE_ID ) ) )
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==RULE_INT||LA40_0==68) ) {
                alt40=1;
            }
            else if ( (LA40_0==RULE_ID) ) {
                alt40=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }
            switch (alt40) {
                case 1 :
                    // InternalDrn.g:2729:4: ( (lv_distanceCST_4_0= ruleEInt ) )
                    {
                    // InternalDrn.g:2729:4: ( (lv_distanceCST_4_0= ruleEInt ) )
                    // InternalDrn.g:2730:5: (lv_distanceCST_4_0= ruleEInt )
                    {
                    // InternalDrn.g:2730:5: (lv_distanceCST_4_0= ruleEInt )
                    // InternalDrn.g:2731:6: lv_distanceCST_4_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getDOWNAccess().getDistanceCSTEIntParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_29);
                    lv_distanceCST_4_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDOWNRule());
                    						}
                    						set(
                    							current,
                    							"distanceCST",
                    							lv_distanceCST_4_0,
                    							"sar.drone.Drn.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDrn.g:2749:4: ( (otherlv_5= RULE_ID ) )
                    {
                    // InternalDrn.g:2749:4: ( (otherlv_5= RULE_ID ) )
                    // InternalDrn.g:2750:5: (otherlv_5= RULE_ID )
                    {
                    // InternalDrn.g:2750:5: (otherlv_5= RULE_ID )
                    // InternalDrn.g:2751:6: otherlv_5= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDOWNRule());
                    						}
                    					
                    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_29); 

                    						newLeafNode(otherlv_5, grammarAccess.getDOWNAccess().getDistanceVarParametreCrossReference_4_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,33,FOLLOW_6); 

            			newLeafNode(otherlv_6, grammarAccess.getDOWNAccess().getTempsKeyword_5());
            		
            otherlv_7=(Token)match(input,14,FOLLOW_20); 

            			newLeafNode(otherlv_7, grammarAccess.getDOWNAccess().getEqualsSignKeyword_6());
            		
            // InternalDrn.g:2771:3: ( ( (lv_tempsCST_8_0= ruleEInt ) ) | ( (otherlv_9= RULE_ID ) ) )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==RULE_INT||LA41_0==68) ) {
                alt41=1;
            }
            else if ( (LA41_0==RULE_ID) ) {
                alt41=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }
            switch (alt41) {
                case 1 :
                    // InternalDrn.g:2772:4: ( (lv_tempsCST_8_0= ruleEInt ) )
                    {
                    // InternalDrn.g:2772:4: ( (lv_tempsCST_8_0= ruleEInt ) )
                    // InternalDrn.g:2773:5: (lv_tempsCST_8_0= ruleEInt )
                    {
                    // InternalDrn.g:2773:5: (lv_tempsCST_8_0= ruleEInt )
                    // InternalDrn.g:2774:6: lv_tempsCST_8_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getDOWNAccess().getTempsCSTEIntParserRuleCall_7_0_0());
                    					
                    pushFollow(FOLLOW_30);
                    lv_tempsCST_8_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDOWNRule());
                    						}
                    						set(
                    							current,
                    							"tempsCST",
                    							lv_tempsCST_8_0,
                    							"sar.drone.Drn.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDrn.g:2792:4: ( (otherlv_9= RULE_ID ) )
                    {
                    // InternalDrn.g:2792:4: ( (otherlv_9= RULE_ID ) )
                    // InternalDrn.g:2793:5: (otherlv_9= RULE_ID )
                    {
                    // InternalDrn.g:2793:5: (otherlv_9= RULE_ID )
                    // InternalDrn.g:2794:6: otherlv_9= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDOWNRule());
                    						}
                    					
                    otherlv_9=(Token)match(input,RULE_ID,FOLLOW_30); 

                    						newLeafNode(otherlv_9, grammarAccess.getDOWNAccess().getTempsVARParametreCrossReference_7_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,27,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getDOWNAccess().getRightParenthesisKeyword_8());
            		

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
    // InternalDrn.g:2814:1: entryRuleDepXY_IMPL returns [EObject current=null] : iv_ruleDepXY_IMPL= ruleDepXY_IMPL EOF ;
    public final EObject entryRuleDepXY_IMPL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDepXY_IMPL = null;


        try {
            // InternalDrn.g:2814:51: (iv_ruleDepXY_IMPL= ruleDepXY_IMPL EOF )
            // InternalDrn.g:2815:2: iv_ruleDepXY_IMPL= ruleDepXY_IMPL EOF
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
    // InternalDrn.g:2821:1: ruleDepXY_IMPL returns [EObject current=null] : (this_DepXY_0= ruleDepXY | this_CERCLEXY_1= ruleCERCLEXY | this_CARREXY_2= ruleCARREXY ) ;
    public final EObject ruleDepXY_IMPL() throws RecognitionException {
        EObject current = null;

        EObject this_DepXY_0 = null;

        EObject this_CERCLEXY_1 = null;

        EObject this_CARREXY_2 = null;



        	enterRule();

        try {
            // InternalDrn.g:2827:2: ( (this_DepXY_0= ruleDepXY | this_CERCLEXY_1= ruleCERCLEXY | this_CARREXY_2= ruleCARREXY ) )
            // InternalDrn.g:2828:2: (this_DepXY_0= ruleDepXY | this_CERCLEXY_1= ruleCERCLEXY | this_CARREXY_2= ruleCARREXY )
            {
            // InternalDrn.g:2828:2: (this_DepXY_0= ruleDepXY | this_CERCLEXY_1= ruleCERCLEXY | this_CARREXY_2= ruleCARREXY )
            int alt42=3;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt42=1;
                }
                break;
            case 40:
                {
                alt42=2;
                }
                break;
            case 42:
                {
                alt42=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }

            switch (alt42) {
                case 1 :
                    // InternalDrn.g:2829:3: this_DepXY_0= ruleDepXY
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
                    // InternalDrn.g:2838:3: this_CERCLEXY_1= ruleCERCLEXY
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
                    // InternalDrn.g:2847:3: this_CARREXY_2= ruleCARREXY
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
    // InternalDrn.g:2859:1: entryRuleDepXY returns [EObject current=null] : iv_ruleDepXY= ruleDepXY EOF ;
    public final EObject entryRuleDepXY() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDepXY = null;


        try {
            // InternalDrn.g:2859:46: (iv_ruleDepXY= ruleDepXY EOF )
            // InternalDrn.g:2860:2: iv_ruleDepXY= ruleDepXY EOF
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
    // InternalDrn.g:2866:1: ruleDepXY returns [EObject current=null] : ( ( (lv_name_0_0= 'depXY' ) ) otherlv_1= '(' otherlv_2= 'distance' otherlv_3= '=' ( ( (lv_distanceCST_4_0= ruleEInt ) ) | ( (otherlv_5= RULE_ID ) ) ) otherlv_6= 'temps' otherlv_7= '=' ( ( (lv_tempsCST_8_0= ruleEInt ) ) | ( (otherlv_9= RULE_ID ) ) ) otherlv_10= ')' ) ;
    public final EObject ruleDepXY() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_distanceCST_4_0 = null;

        AntlrDatatypeRuleToken lv_tempsCST_8_0 = null;



        	enterRule();

        try {
            // InternalDrn.g:2872:2: ( ( ( (lv_name_0_0= 'depXY' ) ) otherlv_1= '(' otherlv_2= 'distance' otherlv_3= '=' ( ( (lv_distanceCST_4_0= ruleEInt ) ) | ( (otherlv_5= RULE_ID ) ) ) otherlv_6= 'temps' otherlv_7= '=' ( ( (lv_tempsCST_8_0= ruleEInt ) ) | ( (otherlv_9= RULE_ID ) ) ) otherlv_10= ')' ) )
            // InternalDrn.g:2873:2: ( ( (lv_name_0_0= 'depXY' ) ) otherlv_1= '(' otherlv_2= 'distance' otherlv_3= '=' ( ( (lv_distanceCST_4_0= ruleEInt ) ) | ( (otherlv_5= RULE_ID ) ) ) otherlv_6= 'temps' otherlv_7= '=' ( ( (lv_tempsCST_8_0= ruleEInt ) ) | ( (otherlv_9= RULE_ID ) ) ) otherlv_10= ')' )
            {
            // InternalDrn.g:2873:2: ( ( (lv_name_0_0= 'depXY' ) ) otherlv_1= '(' otherlv_2= 'distance' otherlv_3= '=' ( ( (lv_distanceCST_4_0= ruleEInt ) ) | ( (otherlv_5= RULE_ID ) ) ) otherlv_6= 'temps' otherlv_7= '=' ( ( (lv_tempsCST_8_0= ruleEInt ) ) | ( (otherlv_9= RULE_ID ) ) ) otherlv_10= ')' )
            // InternalDrn.g:2874:3: ( (lv_name_0_0= 'depXY' ) ) otherlv_1= '(' otherlv_2= 'distance' otherlv_3= '=' ( ( (lv_distanceCST_4_0= ruleEInt ) ) | ( (otherlv_5= RULE_ID ) ) ) otherlv_6= 'temps' otherlv_7= '=' ( ( (lv_tempsCST_8_0= ruleEInt ) ) | ( (otherlv_9= RULE_ID ) ) ) otherlv_10= ')'
            {
            // InternalDrn.g:2874:3: ( (lv_name_0_0= 'depXY' ) )
            // InternalDrn.g:2875:4: (lv_name_0_0= 'depXY' )
            {
            // InternalDrn.g:2875:4: (lv_name_0_0= 'depXY' )
            // InternalDrn.g:2876:5: lv_name_0_0= 'depXY'
            {
            lv_name_0_0=(Token)match(input,39,FOLLOW_14); 

            					newLeafNode(lv_name_0_0, grammarAccess.getDepXYAccess().getNameDepXYKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDepXYRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "depXY");
            				

            }


            }

            otherlv_1=(Token)match(input,25,FOLLOW_28); 

            			newLeafNode(otherlv_1, grammarAccess.getDepXYAccess().getLeftParenthesisKeyword_1());
            		
            otherlv_2=(Token)match(input,32,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getDepXYAccess().getDistanceKeyword_2());
            		
            otherlv_3=(Token)match(input,14,FOLLOW_20); 

            			newLeafNode(otherlv_3, grammarAccess.getDepXYAccess().getEqualsSignKeyword_3());
            		
            // InternalDrn.g:2900:3: ( ( (lv_distanceCST_4_0= ruleEInt ) ) | ( (otherlv_5= RULE_ID ) ) )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==RULE_INT||LA43_0==68) ) {
                alt43=1;
            }
            else if ( (LA43_0==RULE_ID) ) {
                alt43=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }
            switch (alt43) {
                case 1 :
                    // InternalDrn.g:2901:4: ( (lv_distanceCST_4_0= ruleEInt ) )
                    {
                    // InternalDrn.g:2901:4: ( (lv_distanceCST_4_0= ruleEInt ) )
                    // InternalDrn.g:2902:5: (lv_distanceCST_4_0= ruleEInt )
                    {
                    // InternalDrn.g:2902:5: (lv_distanceCST_4_0= ruleEInt )
                    // InternalDrn.g:2903:6: lv_distanceCST_4_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getDepXYAccess().getDistanceCSTEIntParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_29);
                    lv_distanceCST_4_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDepXYRule());
                    						}
                    						set(
                    							current,
                    							"distanceCST",
                    							lv_distanceCST_4_0,
                    							"sar.drone.Drn.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDrn.g:2921:4: ( (otherlv_5= RULE_ID ) )
                    {
                    // InternalDrn.g:2921:4: ( (otherlv_5= RULE_ID ) )
                    // InternalDrn.g:2922:5: (otherlv_5= RULE_ID )
                    {
                    // InternalDrn.g:2922:5: (otherlv_5= RULE_ID )
                    // InternalDrn.g:2923:6: otherlv_5= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDepXYRule());
                    						}
                    					
                    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_29); 

                    						newLeafNode(otherlv_5, grammarAccess.getDepXYAccess().getDistanceVarParametreCrossReference_4_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,33,FOLLOW_6); 

            			newLeafNode(otherlv_6, grammarAccess.getDepXYAccess().getTempsKeyword_5());
            		
            otherlv_7=(Token)match(input,14,FOLLOW_20); 

            			newLeafNode(otherlv_7, grammarAccess.getDepXYAccess().getEqualsSignKeyword_6());
            		
            // InternalDrn.g:2943:3: ( ( (lv_tempsCST_8_0= ruleEInt ) ) | ( (otherlv_9= RULE_ID ) ) )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==RULE_INT||LA44_0==68) ) {
                alt44=1;
            }
            else if ( (LA44_0==RULE_ID) ) {
                alt44=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }
            switch (alt44) {
                case 1 :
                    // InternalDrn.g:2944:4: ( (lv_tempsCST_8_0= ruleEInt ) )
                    {
                    // InternalDrn.g:2944:4: ( (lv_tempsCST_8_0= ruleEInt ) )
                    // InternalDrn.g:2945:5: (lv_tempsCST_8_0= ruleEInt )
                    {
                    // InternalDrn.g:2945:5: (lv_tempsCST_8_0= ruleEInt )
                    // InternalDrn.g:2946:6: lv_tempsCST_8_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getDepXYAccess().getTempsCSTEIntParserRuleCall_7_0_0());
                    					
                    pushFollow(FOLLOW_30);
                    lv_tempsCST_8_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDepXYRule());
                    						}
                    						set(
                    							current,
                    							"tempsCST",
                    							lv_tempsCST_8_0,
                    							"sar.drone.Drn.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDrn.g:2964:4: ( (otherlv_9= RULE_ID ) )
                    {
                    // InternalDrn.g:2964:4: ( (otherlv_9= RULE_ID ) )
                    // InternalDrn.g:2965:5: (otherlv_9= RULE_ID )
                    {
                    // InternalDrn.g:2965:5: (otherlv_9= RULE_ID )
                    // InternalDrn.g:2966:6: otherlv_9= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDepXYRule());
                    						}
                    					
                    otherlv_9=(Token)match(input,RULE_ID,FOLLOW_30); 

                    						newLeafNode(otherlv_9, grammarAccess.getDepXYAccess().getTempsVARParametreCrossReference_7_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,27,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getDepXYAccess().getRightParenthesisKeyword_8());
            		

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
    // InternalDrn.g:2986:1: entryRuleCERCLEXY returns [EObject current=null] : iv_ruleCERCLEXY= ruleCERCLEXY EOF ;
    public final EObject entryRuleCERCLEXY() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCERCLEXY = null;


        try {
            // InternalDrn.g:2986:49: (iv_ruleCERCLEXY= ruleCERCLEXY EOF )
            // InternalDrn.g:2987:2: iv_ruleCERCLEXY= ruleCERCLEXY EOF
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
    // InternalDrn.g:2993:1: ruleCERCLEXY returns [EObject current=null] : ( ( (lv_name_0_0= 'cercleXY' ) ) otherlv_1= '(' otherlv_2= 'rayon' otherlv_3= '=' ( ( (lv_rayonCST_4_0= ruleEInt ) ) | ( (otherlv_5= RULE_ID ) ) ) otherlv_6= 'temps' otherlv_7= '=' ( ( (lv_tempsCST_8_0= ruleEInt ) ) | ( (otherlv_9= RULE_ID ) ) ) otherlv_10= ')' ) ;
    public final EObject ruleCERCLEXY() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_rayonCST_4_0 = null;

        AntlrDatatypeRuleToken lv_tempsCST_8_0 = null;



        	enterRule();

        try {
            // InternalDrn.g:2999:2: ( ( ( (lv_name_0_0= 'cercleXY' ) ) otherlv_1= '(' otherlv_2= 'rayon' otherlv_3= '=' ( ( (lv_rayonCST_4_0= ruleEInt ) ) | ( (otherlv_5= RULE_ID ) ) ) otherlv_6= 'temps' otherlv_7= '=' ( ( (lv_tempsCST_8_0= ruleEInt ) ) | ( (otherlv_9= RULE_ID ) ) ) otherlv_10= ')' ) )
            // InternalDrn.g:3000:2: ( ( (lv_name_0_0= 'cercleXY' ) ) otherlv_1= '(' otherlv_2= 'rayon' otherlv_3= '=' ( ( (lv_rayonCST_4_0= ruleEInt ) ) | ( (otherlv_5= RULE_ID ) ) ) otherlv_6= 'temps' otherlv_7= '=' ( ( (lv_tempsCST_8_0= ruleEInt ) ) | ( (otherlv_9= RULE_ID ) ) ) otherlv_10= ')' )
            {
            // InternalDrn.g:3000:2: ( ( (lv_name_0_0= 'cercleXY' ) ) otherlv_1= '(' otherlv_2= 'rayon' otherlv_3= '=' ( ( (lv_rayonCST_4_0= ruleEInt ) ) | ( (otherlv_5= RULE_ID ) ) ) otherlv_6= 'temps' otherlv_7= '=' ( ( (lv_tempsCST_8_0= ruleEInt ) ) | ( (otherlv_9= RULE_ID ) ) ) otherlv_10= ')' )
            // InternalDrn.g:3001:3: ( (lv_name_0_0= 'cercleXY' ) ) otherlv_1= '(' otherlv_2= 'rayon' otherlv_3= '=' ( ( (lv_rayonCST_4_0= ruleEInt ) ) | ( (otherlv_5= RULE_ID ) ) ) otherlv_6= 'temps' otherlv_7= '=' ( ( (lv_tempsCST_8_0= ruleEInt ) ) | ( (otherlv_9= RULE_ID ) ) ) otherlv_10= ')'
            {
            // InternalDrn.g:3001:3: ( (lv_name_0_0= 'cercleXY' ) )
            // InternalDrn.g:3002:4: (lv_name_0_0= 'cercleXY' )
            {
            // InternalDrn.g:3002:4: (lv_name_0_0= 'cercleXY' )
            // InternalDrn.g:3003:5: lv_name_0_0= 'cercleXY'
            {
            lv_name_0_0=(Token)match(input,40,FOLLOW_14); 

            					newLeafNode(lv_name_0_0, grammarAccess.getCERCLEXYAccess().getNameCercleXYKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCERCLEXYRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "cercleXY");
            				

            }


            }

            otherlv_1=(Token)match(input,25,FOLLOW_31); 

            			newLeafNode(otherlv_1, grammarAccess.getCERCLEXYAccess().getLeftParenthesisKeyword_1());
            		
            otherlv_2=(Token)match(input,41,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getCERCLEXYAccess().getRayonKeyword_2());
            		
            otherlv_3=(Token)match(input,14,FOLLOW_20); 

            			newLeafNode(otherlv_3, grammarAccess.getCERCLEXYAccess().getEqualsSignKeyword_3());
            		
            // InternalDrn.g:3027:3: ( ( (lv_rayonCST_4_0= ruleEInt ) ) | ( (otherlv_5= RULE_ID ) ) )
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==RULE_INT||LA45_0==68) ) {
                alt45=1;
            }
            else if ( (LA45_0==RULE_ID) ) {
                alt45=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }
            switch (alt45) {
                case 1 :
                    // InternalDrn.g:3028:4: ( (lv_rayonCST_4_0= ruleEInt ) )
                    {
                    // InternalDrn.g:3028:4: ( (lv_rayonCST_4_0= ruleEInt ) )
                    // InternalDrn.g:3029:5: (lv_rayonCST_4_0= ruleEInt )
                    {
                    // InternalDrn.g:3029:5: (lv_rayonCST_4_0= ruleEInt )
                    // InternalDrn.g:3030:6: lv_rayonCST_4_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getCERCLEXYAccess().getRayonCSTEIntParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_29);
                    lv_rayonCST_4_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCERCLEXYRule());
                    						}
                    						set(
                    							current,
                    							"rayonCST",
                    							lv_rayonCST_4_0,
                    							"sar.drone.Drn.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDrn.g:3048:4: ( (otherlv_5= RULE_ID ) )
                    {
                    // InternalDrn.g:3048:4: ( (otherlv_5= RULE_ID ) )
                    // InternalDrn.g:3049:5: (otherlv_5= RULE_ID )
                    {
                    // InternalDrn.g:3049:5: (otherlv_5= RULE_ID )
                    // InternalDrn.g:3050:6: otherlv_5= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCERCLEXYRule());
                    						}
                    					
                    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_29); 

                    						newLeafNode(otherlv_5, grammarAccess.getCERCLEXYAccess().getRayonVarParametreCrossReference_4_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,33,FOLLOW_6); 

            			newLeafNode(otherlv_6, grammarAccess.getCERCLEXYAccess().getTempsKeyword_5());
            		
            otherlv_7=(Token)match(input,14,FOLLOW_20); 

            			newLeafNode(otherlv_7, grammarAccess.getCERCLEXYAccess().getEqualsSignKeyword_6());
            		
            // InternalDrn.g:3070:3: ( ( (lv_tempsCST_8_0= ruleEInt ) ) | ( (otherlv_9= RULE_ID ) ) )
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==RULE_INT||LA46_0==68) ) {
                alt46=1;
            }
            else if ( (LA46_0==RULE_ID) ) {
                alt46=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }
            switch (alt46) {
                case 1 :
                    // InternalDrn.g:3071:4: ( (lv_tempsCST_8_0= ruleEInt ) )
                    {
                    // InternalDrn.g:3071:4: ( (lv_tempsCST_8_0= ruleEInt ) )
                    // InternalDrn.g:3072:5: (lv_tempsCST_8_0= ruleEInt )
                    {
                    // InternalDrn.g:3072:5: (lv_tempsCST_8_0= ruleEInt )
                    // InternalDrn.g:3073:6: lv_tempsCST_8_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getCERCLEXYAccess().getTempsCSTEIntParserRuleCall_7_0_0());
                    					
                    pushFollow(FOLLOW_30);
                    lv_tempsCST_8_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCERCLEXYRule());
                    						}
                    						set(
                    							current,
                    							"tempsCST",
                    							lv_tempsCST_8_0,
                    							"sar.drone.Drn.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDrn.g:3091:4: ( (otherlv_9= RULE_ID ) )
                    {
                    // InternalDrn.g:3091:4: ( (otherlv_9= RULE_ID ) )
                    // InternalDrn.g:3092:5: (otherlv_9= RULE_ID )
                    {
                    // InternalDrn.g:3092:5: (otherlv_9= RULE_ID )
                    // InternalDrn.g:3093:6: otherlv_9= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCERCLEXYRule());
                    						}
                    					
                    otherlv_9=(Token)match(input,RULE_ID,FOLLOW_30); 

                    						newLeafNode(otherlv_9, grammarAccess.getCERCLEXYAccess().getTempsVARParametreCrossReference_7_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,27,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getCERCLEXYAccess().getRightParenthesisKeyword_8());
            		

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
    // InternalDrn.g:3113:1: entryRuleCARREXY returns [EObject current=null] : iv_ruleCARREXY= ruleCARREXY EOF ;
    public final EObject entryRuleCARREXY() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCARREXY = null;


        try {
            // InternalDrn.g:3113:48: (iv_ruleCARREXY= ruleCARREXY EOF )
            // InternalDrn.g:3114:2: iv_ruleCARREXY= ruleCARREXY EOF
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
    // InternalDrn.g:3120:1: ruleCARREXY returns [EObject current=null] : ( ( (lv_name_0_0= 'carreXY' ) ) otherlv_1= '(' otherlv_2= 'cote' otherlv_3= '=' ( ( (lv_coteCST_4_0= ruleEInt ) ) | ( (otherlv_5= RULE_ID ) ) ) otherlv_6= 'temps' otherlv_7= '=' ( ( (lv_tempsCST_8_0= ruleEInt ) ) | ( (otherlv_9= RULE_ID ) ) ) otherlv_10= ')' ) ;
    public final EObject ruleCARREXY() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_coteCST_4_0 = null;

        AntlrDatatypeRuleToken lv_tempsCST_8_0 = null;



        	enterRule();

        try {
            // InternalDrn.g:3126:2: ( ( ( (lv_name_0_0= 'carreXY' ) ) otherlv_1= '(' otherlv_2= 'cote' otherlv_3= '=' ( ( (lv_coteCST_4_0= ruleEInt ) ) | ( (otherlv_5= RULE_ID ) ) ) otherlv_6= 'temps' otherlv_7= '=' ( ( (lv_tempsCST_8_0= ruleEInt ) ) | ( (otherlv_9= RULE_ID ) ) ) otherlv_10= ')' ) )
            // InternalDrn.g:3127:2: ( ( (lv_name_0_0= 'carreXY' ) ) otherlv_1= '(' otherlv_2= 'cote' otherlv_3= '=' ( ( (lv_coteCST_4_0= ruleEInt ) ) | ( (otherlv_5= RULE_ID ) ) ) otherlv_6= 'temps' otherlv_7= '=' ( ( (lv_tempsCST_8_0= ruleEInt ) ) | ( (otherlv_9= RULE_ID ) ) ) otherlv_10= ')' )
            {
            // InternalDrn.g:3127:2: ( ( (lv_name_0_0= 'carreXY' ) ) otherlv_1= '(' otherlv_2= 'cote' otherlv_3= '=' ( ( (lv_coteCST_4_0= ruleEInt ) ) | ( (otherlv_5= RULE_ID ) ) ) otherlv_6= 'temps' otherlv_7= '=' ( ( (lv_tempsCST_8_0= ruleEInt ) ) | ( (otherlv_9= RULE_ID ) ) ) otherlv_10= ')' )
            // InternalDrn.g:3128:3: ( (lv_name_0_0= 'carreXY' ) ) otherlv_1= '(' otherlv_2= 'cote' otherlv_3= '=' ( ( (lv_coteCST_4_0= ruleEInt ) ) | ( (otherlv_5= RULE_ID ) ) ) otherlv_6= 'temps' otherlv_7= '=' ( ( (lv_tempsCST_8_0= ruleEInt ) ) | ( (otherlv_9= RULE_ID ) ) ) otherlv_10= ')'
            {
            // InternalDrn.g:3128:3: ( (lv_name_0_0= 'carreXY' ) )
            // InternalDrn.g:3129:4: (lv_name_0_0= 'carreXY' )
            {
            // InternalDrn.g:3129:4: (lv_name_0_0= 'carreXY' )
            // InternalDrn.g:3130:5: lv_name_0_0= 'carreXY'
            {
            lv_name_0_0=(Token)match(input,42,FOLLOW_14); 

            					newLeafNode(lv_name_0_0, grammarAccess.getCARREXYAccess().getNameCarreXYKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCARREXYRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "carreXY");
            				

            }


            }

            otherlv_1=(Token)match(input,25,FOLLOW_32); 

            			newLeafNode(otherlv_1, grammarAccess.getCARREXYAccess().getLeftParenthesisKeyword_1());
            		
            otherlv_2=(Token)match(input,43,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getCARREXYAccess().getCoteKeyword_2());
            		
            otherlv_3=(Token)match(input,14,FOLLOW_20); 

            			newLeafNode(otherlv_3, grammarAccess.getCARREXYAccess().getEqualsSignKeyword_3());
            		
            // InternalDrn.g:3154:3: ( ( (lv_coteCST_4_0= ruleEInt ) ) | ( (otherlv_5= RULE_ID ) ) )
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==RULE_INT||LA47_0==68) ) {
                alt47=1;
            }
            else if ( (LA47_0==RULE_ID) ) {
                alt47=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }
            switch (alt47) {
                case 1 :
                    // InternalDrn.g:3155:4: ( (lv_coteCST_4_0= ruleEInt ) )
                    {
                    // InternalDrn.g:3155:4: ( (lv_coteCST_4_0= ruleEInt ) )
                    // InternalDrn.g:3156:5: (lv_coteCST_4_0= ruleEInt )
                    {
                    // InternalDrn.g:3156:5: (lv_coteCST_4_0= ruleEInt )
                    // InternalDrn.g:3157:6: lv_coteCST_4_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getCARREXYAccess().getCoteCSTEIntParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_29);
                    lv_coteCST_4_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCARREXYRule());
                    						}
                    						set(
                    							current,
                    							"coteCST",
                    							lv_coteCST_4_0,
                    							"sar.drone.Drn.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDrn.g:3175:4: ( (otherlv_5= RULE_ID ) )
                    {
                    // InternalDrn.g:3175:4: ( (otherlv_5= RULE_ID ) )
                    // InternalDrn.g:3176:5: (otherlv_5= RULE_ID )
                    {
                    // InternalDrn.g:3176:5: (otherlv_5= RULE_ID )
                    // InternalDrn.g:3177:6: otherlv_5= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCARREXYRule());
                    						}
                    					
                    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_29); 

                    						newLeafNode(otherlv_5, grammarAccess.getCARREXYAccess().getCoteVARParametreCrossReference_4_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,33,FOLLOW_6); 

            			newLeafNode(otherlv_6, grammarAccess.getCARREXYAccess().getTempsKeyword_5());
            		
            otherlv_7=(Token)match(input,14,FOLLOW_20); 

            			newLeafNode(otherlv_7, grammarAccess.getCARREXYAccess().getEqualsSignKeyword_6());
            		
            // InternalDrn.g:3197:3: ( ( (lv_tempsCST_8_0= ruleEInt ) ) | ( (otherlv_9= RULE_ID ) ) )
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==RULE_INT||LA48_0==68) ) {
                alt48=1;
            }
            else if ( (LA48_0==RULE_ID) ) {
                alt48=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }
            switch (alt48) {
                case 1 :
                    // InternalDrn.g:3198:4: ( (lv_tempsCST_8_0= ruleEInt ) )
                    {
                    // InternalDrn.g:3198:4: ( (lv_tempsCST_8_0= ruleEInt ) )
                    // InternalDrn.g:3199:5: (lv_tempsCST_8_0= ruleEInt )
                    {
                    // InternalDrn.g:3199:5: (lv_tempsCST_8_0= ruleEInt )
                    // InternalDrn.g:3200:6: lv_tempsCST_8_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getCARREXYAccess().getTempsCSTEIntParserRuleCall_7_0_0());
                    					
                    pushFollow(FOLLOW_30);
                    lv_tempsCST_8_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCARREXYRule());
                    						}
                    						set(
                    							current,
                    							"tempsCST",
                    							lv_tempsCST_8_0,
                    							"sar.drone.Drn.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDrn.g:3218:4: ( (otherlv_9= RULE_ID ) )
                    {
                    // InternalDrn.g:3218:4: ( (otherlv_9= RULE_ID ) )
                    // InternalDrn.g:3219:5: (otherlv_9= RULE_ID )
                    {
                    // InternalDrn.g:3219:5: (otherlv_9= RULE_ID )
                    // InternalDrn.g:3220:6: otherlv_9= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCARREXYRule());
                    						}
                    					
                    otherlv_9=(Token)match(input,RULE_ID,FOLLOW_30); 

                    						newLeafNode(otherlv_9, grammarAccess.getCARREXYAccess().getTempsVARParametreCrossReference_7_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,27,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getCARREXYAccess().getRightParenthesisKeyword_8());
            		

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
    // InternalDrn.g:3240:1: entryRuleDepYZ_IMPL returns [EObject current=null] : iv_ruleDepYZ_IMPL= ruleDepYZ_IMPL EOF ;
    public final EObject entryRuleDepYZ_IMPL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDepYZ_IMPL = null;


        try {
            // InternalDrn.g:3240:51: (iv_ruleDepYZ_IMPL= ruleDepYZ_IMPL EOF )
            // InternalDrn.g:3241:2: iv_ruleDepYZ_IMPL= ruleDepYZ_IMPL EOF
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
    // InternalDrn.g:3247:1: ruleDepYZ_IMPL returns [EObject current=null] : (this_DepYZ_0= ruleDepYZ | this_CERCLEYZ_1= ruleCERCLEYZ | this_CARREYZ_2= ruleCARREYZ ) ;
    public final EObject ruleDepYZ_IMPL() throws RecognitionException {
        EObject current = null;

        EObject this_DepYZ_0 = null;

        EObject this_CERCLEYZ_1 = null;

        EObject this_CARREYZ_2 = null;



        	enterRule();

        try {
            // InternalDrn.g:3253:2: ( (this_DepYZ_0= ruleDepYZ | this_CERCLEYZ_1= ruleCERCLEYZ | this_CARREYZ_2= ruleCARREYZ ) )
            // InternalDrn.g:3254:2: (this_DepYZ_0= ruleDepYZ | this_CERCLEYZ_1= ruleCERCLEYZ | this_CARREYZ_2= ruleCARREYZ )
            {
            // InternalDrn.g:3254:2: (this_DepYZ_0= ruleDepYZ | this_CERCLEYZ_1= ruleCERCLEYZ | this_CARREYZ_2= ruleCARREYZ )
            int alt49=3;
            switch ( input.LA(1) ) {
            case 44:
                {
                alt49=1;
                }
                break;
            case 45:
                {
                alt49=2;
                }
                break;
            case 46:
                {
                alt49=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }

            switch (alt49) {
                case 1 :
                    // InternalDrn.g:3255:3: this_DepYZ_0= ruleDepYZ
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
                    // InternalDrn.g:3264:3: this_CERCLEYZ_1= ruleCERCLEYZ
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
                    // InternalDrn.g:3273:3: this_CARREYZ_2= ruleCARREYZ
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
    // InternalDrn.g:3285:1: entryRuleDepYZ returns [EObject current=null] : iv_ruleDepYZ= ruleDepYZ EOF ;
    public final EObject entryRuleDepYZ() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDepYZ = null;


        try {
            // InternalDrn.g:3285:46: (iv_ruleDepYZ= ruleDepYZ EOF )
            // InternalDrn.g:3286:2: iv_ruleDepYZ= ruleDepYZ EOF
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
    // InternalDrn.g:3292:1: ruleDepYZ returns [EObject current=null] : ( ( (lv_name_0_0= 'depYZ' ) ) otherlv_1= '(' otherlv_2= 'distance' otherlv_3= '=' ( ( (lv_distanceCST_4_0= ruleEInt ) ) | ( (otherlv_5= RULE_ID ) ) ) otherlv_6= 'temps' otherlv_7= '=' ( ( (lv_tempsCST_8_0= ruleEInt ) ) | ( (otherlv_9= RULE_ID ) ) ) otherlv_10= ')' ) ;
    public final EObject ruleDepYZ() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_distanceCST_4_0 = null;

        AntlrDatatypeRuleToken lv_tempsCST_8_0 = null;



        	enterRule();

        try {
            // InternalDrn.g:3298:2: ( ( ( (lv_name_0_0= 'depYZ' ) ) otherlv_1= '(' otherlv_2= 'distance' otherlv_3= '=' ( ( (lv_distanceCST_4_0= ruleEInt ) ) | ( (otherlv_5= RULE_ID ) ) ) otherlv_6= 'temps' otherlv_7= '=' ( ( (lv_tempsCST_8_0= ruleEInt ) ) | ( (otherlv_9= RULE_ID ) ) ) otherlv_10= ')' ) )
            // InternalDrn.g:3299:2: ( ( (lv_name_0_0= 'depYZ' ) ) otherlv_1= '(' otherlv_2= 'distance' otherlv_3= '=' ( ( (lv_distanceCST_4_0= ruleEInt ) ) | ( (otherlv_5= RULE_ID ) ) ) otherlv_6= 'temps' otherlv_7= '=' ( ( (lv_tempsCST_8_0= ruleEInt ) ) | ( (otherlv_9= RULE_ID ) ) ) otherlv_10= ')' )
            {
            // InternalDrn.g:3299:2: ( ( (lv_name_0_0= 'depYZ' ) ) otherlv_1= '(' otherlv_2= 'distance' otherlv_3= '=' ( ( (lv_distanceCST_4_0= ruleEInt ) ) | ( (otherlv_5= RULE_ID ) ) ) otherlv_6= 'temps' otherlv_7= '=' ( ( (lv_tempsCST_8_0= ruleEInt ) ) | ( (otherlv_9= RULE_ID ) ) ) otherlv_10= ')' )
            // InternalDrn.g:3300:3: ( (lv_name_0_0= 'depYZ' ) ) otherlv_1= '(' otherlv_2= 'distance' otherlv_3= '=' ( ( (lv_distanceCST_4_0= ruleEInt ) ) | ( (otherlv_5= RULE_ID ) ) ) otherlv_6= 'temps' otherlv_7= '=' ( ( (lv_tempsCST_8_0= ruleEInt ) ) | ( (otherlv_9= RULE_ID ) ) ) otherlv_10= ')'
            {
            // InternalDrn.g:3300:3: ( (lv_name_0_0= 'depYZ' ) )
            // InternalDrn.g:3301:4: (lv_name_0_0= 'depYZ' )
            {
            // InternalDrn.g:3301:4: (lv_name_0_0= 'depYZ' )
            // InternalDrn.g:3302:5: lv_name_0_0= 'depYZ'
            {
            lv_name_0_0=(Token)match(input,44,FOLLOW_14); 

            					newLeafNode(lv_name_0_0, grammarAccess.getDepYZAccess().getNameDepYZKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDepYZRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "depYZ");
            				

            }


            }

            otherlv_1=(Token)match(input,25,FOLLOW_28); 

            			newLeafNode(otherlv_1, grammarAccess.getDepYZAccess().getLeftParenthesisKeyword_1());
            		
            otherlv_2=(Token)match(input,32,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getDepYZAccess().getDistanceKeyword_2());
            		
            otherlv_3=(Token)match(input,14,FOLLOW_20); 

            			newLeafNode(otherlv_3, grammarAccess.getDepYZAccess().getEqualsSignKeyword_3());
            		
            // InternalDrn.g:3326:3: ( ( (lv_distanceCST_4_0= ruleEInt ) ) | ( (otherlv_5= RULE_ID ) ) )
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==RULE_INT||LA50_0==68) ) {
                alt50=1;
            }
            else if ( (LA50_0==RULE_ID) ) {
                alt50=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }
            switch (alt50) {
                case 1 :
                    // InternalDrn.g:3327:4: ( (lv_distanceCST_4_0= ruleEInt ) )
                    {
                    // InternalDrn.g:3327:4: ( (lv_distanceCST_4_0= ruleEInt ) )
                    // InternalDrn.g:3328:5: (lv_distanceCST_4_0= ruleEInt )
                    {
                    // InternalDrn.g:3328:5: (lv_distanceCST_4_0= ruleEInt )
                    // InternalDrn.g:3329:6: lv_distanceCST_4_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getDepYZAccess().getDistanceCSTEIntParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_29);
                    lv_distanceCST_4_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDepYZRule());
                    						}
                    						set(
                    							current,
                    							"distanceCST",
                    							lv_distanceCST_4_0,
                    							"sar.drone.Drn.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDrn.g:3347:4: ( (otherlv_5= RULE_ID ) )
                    {
                    // InternalDrn.g:3347:4: ( (otherlv_5= RULE_ID ) )
                    // InternalDrn.g:3348:5: (otherlv_5= RULE_ID )
                    {
                    // InternalDrn.g:3348:5: (otherlv_5= RULE_ID )
                    // InternalDrn.g:3349:6: otherlv_5= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDepYZRule());
                    						}
                    					
                    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_29); 

                    						newLeafNode(otherlv_5, grammarAccess.getDepYZAccess().getDistanceVarParametreCrossReference_4_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,33,FOLLOW_6); 

            			newLeafNode(otherlv_6, grammarAccess.getDepYZAccess().getTempsKeyword_5());
            		
            otherlv_7=(Token)match(input,14,FOLLOW_20); 

            			newLeafNode(otherlv_7, grammarAccess.getDepYZAccess().getEqualsSignKeyword_6());
            		
            // InternalDrn.g:3369:3: ( ( (lv_tempsCST_8_0= ruleEInt ) ) | ( (otherlv_9= RULE_ID ) ) )
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==RULE_INT||LA51_0==68) ) {
                alt51=1;
            }
            else if ( (LA51_0==RULE_ID) ) {
                alt51=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }
            switch (alt51) {
                case 1 :
                    // InternalDrn.g:3370:4: ( (lv_tempsCST_8_0= ruleEInt ) )
                    {
                    // InternalDrn.g:3370:4: ( (lv_tempsCST_8_0= ruleEInt ) )
                    // InternalDrn.g:3371:5: (lv_tempsCST_8_0= ruleEInt )
                    {
                    // InternalDrn.g:3371:5: (lv_tempsCST_8_0= ruleEInt )
                    // InternalDrn.g:3372:6: lv_tempsCST_8_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getDepYZAccess().getTempsCSTEIntParserRuleCall_7_0_0());
                    					
                    pushFollow(FOLLOW_30);
                    lv_tempsCST_8_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDepYZRule());
                    						}
                    						set(
                    							current,
                    							"tempsCST",
                    							lv_tempsCST_8_0,
                    							"sar.drone.Drn.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDrn.g:3390:4: ( (otherlv_9= RULE_ID ) )
                    {
                    // InternalDrn.g:3390:4: ( (otherlv_9= RULE_ID ) )
                    // InternalDrn.g:3391:5: (otherlv_9= RULE_ID )
                    {
                    // InternalDrn.g:3391:5: (otherlv_9= RULE_ID )
                    // InternalDrn.g:3392:6: otherlv_9= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDepYZRule());
                    						}
                    					
                    otherlv_9=(Token)match(input,RULE_ID,FOLLOW_30); 

                    						newLeafNode(otherlv_9, grammarAccess.getDepYZAccess().getTempsVARParametreCrossReference_7_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,27,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getDepYZAccess().getRightParenthesisKeyword_8());
            		

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
    // InternalDrn.g:3412:1: entryRuleCERCLEYZ returns [EObject current=null] : iv_ruleCERCLEYZ= ruleCERCLEYZ EOF ;
    public final EObject entryRuleCERCLEYZ() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCERCLEYZ = null;


        try {
            // InternalDrn.g:3412:49: (iv_ruleCERCLEYZ= ruleCERCLEYZ EOF )
            // InternalDrn.g:3413:2: iv_ruleCERCLEYZ= ruleCERCLEYZ EOF
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
    // InternalDrn.g:3419:1: ruleCERCLEYZ returns [EObject current=null] : ( ( (lv_name_0_0= 'cercleYZ' ) ) otherlv_1= '(' otherlv_2= 'rayon' otherlv_3= '=' ( ( (lv_rayonCST_4_0= ruleEInt ) ) | ( (otherlv_5= RULE_ID ) ) ) otherlv_6= 'temps' otherlv_7= '=' ( ( (lv_tempsCST_8_0= ruleEInt ) ) | ( (otherlv_9= RULE_ID ) ) ) otherlv_10= ')' ) ;
    public final EObject ruleCERCLEYZ() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_rayonCST_4_0 = null;

        AntlrDatatypeRuleToken lv_tempsCST_8_0 = null;



        	enterRule();

        try {
            // InternalDrn.g:3425:2: ( ( ( (lv_name_0_0= 'cercleYZ' ) ) otherlv_1= '(' otherlv_2= 'rayon' otherlv_3= '=' ( ( (lv_rayonCST_4_0= ruleEInt ) ) | ( (otherlv_5= RULE_ID ) ) ) otherlv_6= 'temps' otherlv_7= '=' ( ( (lv_tempsCST_8_0= ruleEInt ) ) | ( (otherlv_9= RULE_ID ) ) ) otherlv_10= ')' ) )
            // InternalDrn.g:3426:2: ( ( (lv_name_0_0= 'cercleYZ' ) ) otherlv_1= '(' otherlv_2= 'rayon' otherlv_3= '=' ( ( (lv_rayonCST_4_0= ruleEInt ) ) | ( (otherlv_5= RULE_ID ) ) ) otherlv_6= 'temps' otherlv_7= '=' ( ( (lv_tempsCST_8_0= ruleEInt ) ) | ( (otherlv_9= RULE_ID ) ) ) otherlv_10= ')' )
            {
            // InternalDrn.g:3426:2: ( ( (lv_name_0_0= 'cercleYZ' ) ) otherlv_1= '(' otherlv_2= 'rayon' otherlv_3= '=' ( ( (lv_rayonCST_4_0= ruleEInt ) ) | ( (otherlv_5= RULE_ID ) ) ) otherlv_6= 'temps' otherlv_7= '=' ( ( (lv_tempsCST_8_0= ruleEInt ) ) | ( (otherlv_9= RULE_ID ) ) ) otherlv_10= ')' )
            // InternalDrn.g:3427:3: ( (lv_name_0_0= 'cercleYZ' ) ) otherlv_1= '(' otherlv_2= 'rayon' otherlv_3= '=' ( ( (lv_rayonCST_4_0= ruleEInt ) ) | ( (otherlv_5= RULE_ID ) ) ) otherlv_6= 'temps' otherlv_7= '=' ( ( (lv_tempsCST_8_0= ruleEInt ) ) | ( (otherlv_9= RULE_ID ) ) ) otherlv_10= ')'
            {
            // InternalDrn.g:3427:3: ( (lv_name_0_0= 'cercleYZ' ) )
            // InternalDrn.g:3428:4: (lv_name_0_0= 'cercleYZ' )
            {
            // InternalDrn.g:3428:4: (lv_name_0_0= 'cercleYZ' )
            // InternalDrn.g:3429:5: lv_name_0_0= 'cercleYZ'
            {
            lv_name_0_0=(Token)match(input,45,FOLLOW_14); 

            					newLeafNode(lv_name_0_0, grammarAccess.getCERCLEYZAccess().getNameCercleYZKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCERCLEYZRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "cercleYZ");
            				

            }


            }

            otherlv_1=(Token)match(input,25,FOLLOW_31); 

            			newLeafNode(otherlv_1, grammarAccess.getCERCLEYZAccess().getLeftParenthesisKeyword_1());
            		
            otherlv_2=(Token)match(input,41,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getCERCLEYZAccess().getRayonKeyword_2());
            		
            otherlv_3=(Token)match(input,14,FOLLOW_20); 

            			newLeafNode(otherlv_3, grammarAccess.getCERCLEYZAccess().getEqualsSignKeyword_3());
            		
            // InternalDrn.g:3453:3: ( ( (lv_rayonCST_4_0= ruleEInt ) ) | ( (otherlv_5= RULE_ID ) ) )
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==RULE_INT||LA52_0==68) ) {
                alt52=1;
            }
            else if ( (LA52_0==RULE_ID) ) {
                alt52=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }
            switch (alt52) {
                case 1 :
                    // InternalDrn.g:3454:4: ( (lv_rayonCST_4_0= ruleEInt ) )
                    {
                    // InternalDrn.g:3454:4: ( (lv_rayonCST_4_0= ruleEInt ) )
                    // InternalDrn.g:3455:5: (lv_rayonCST_4_0= ruleEInt )
                    {
                    // InternalDrn.g:3455:5: (lv_rayonCST_4_0= ruleEInt )
                    // InternalDrn.g:3456:6: lv_rayonCST_4_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getCERCLEYZAccess().getRayonCSTEIntParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_29);
                    lv_rayonCST_4_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCERCLEYZRule());
                    						}
                    						set(
                    							current,
                    							"rayonCST",
                    							lv_rayonCST_4_0,
                    							"sar.drone.Drn.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDrn.g:3474:4: ( (otherlv_5= RULE_ID ) )
                    {
                    // InternalDrn.g:3474:4: ( (otherlv_5= RULE_ID ) )
                    // InternalDrn.g:3475:5: (otherlv_5= RULE_ID )
                    {
                    // InternalDrn.g:3475:5: (otherlv_5= RULE_ID )
                    // InternalDrn.g:3476:6: otherlv_5= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCERCLEYZRule());
                    						}
                    					
                    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_29); 

                    						newLeafNode(otherlv_5, grammarAccess.getCERCLEYZAccess().getRayonVarParametreCrossReference_4_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,33,FOLLOW_6); 

            			newLeafNode(otherlv_6, grammarAccess.getCERCLEYZAccess().getTempsKeyword_5());
            		
            otherlv_7=(Token)match(input,14,FOLLOW_20); 

            			newLeafNode(otherlv_7, grammarAccess.getCERCLEYZAccess().getEqualsSignKeyword_6());
            		
            // InternalDrn.g:3496:3: ( ( (lv_tempsCST_8_0= ruleEInt ) ) | ( (otherlv_9= RULE_ID ) ) )
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==RULE_INT||LA53_0==68) ) {
                alt53=1;
            }
            else if ( (LA53_0==RULE_ID) ) {
                alt53=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }
            switch (alt53) {
                case 1 :
                    // InternalDrn.g:3497:4: ( (lv_tempsCST_8_0= ruleEInt ) )
                    {
                    // InternalDrn.g:3497:4: ( (lv_tempsCST_8_0= ruleEInt ) )
                    // InternalDrn.g:3498:5: (lv_tempsCST_8_0= ruleEInt )
                    {
                    // InternalDrn.g:3498:5: (lv_tempsCST_8_0= ruleEInt )
                    // InternalDrn.g:3499:6: lv_tempsCST_8_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getCERCLEYZAccess().getTempsCSTEIntParserRuleCall_7_0_0());
                    					
                    pushFollow(FOLLOW_30);
                    lv_tempsCST_8_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCERCLEYZRule());
                    						}
                    						set(
                    							current,
                    							"tempsCST",
                    							lv_tempsCST_8_0,
                    							"sar.drone.Drn.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDrn.g:3517:4: ( (otherlv_9= RULE_ID ) )
                    {
                    // InternalDrn.g:3517:4: ( (otherlv_9= RULE_ID ) )
                    // InternalDrn.g:3518:5: (otherlv_9= RULE_ID )
                    {
                    // InternalDrn.g:3518:5: (otherlv_9= RULE_ID )
                    // InternalDrn.g:3519:6: otherlv_9= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCERCLEYZRule());
                    						}
                    					
                    otherlv_9=(Token)match(input,RULE_ID,FOLLOW_30); 

                    						newLeafNode(otherlv_9, grammarAccess.getCERCLEYZAccess().getTempsVARParametreCrossReference_7_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,27,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getCERCLEYZAccess().getRightParenthesisKeyword_8());
            		

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
    // InternalDrn.g:3539:1: entryRuleCARREYZ returns [EObject current=null] : iv_ruleCARREYZ= ruleCARREYZ EOF ;
    public final EObject entryRuleCARREYZ() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCARREYZ = null;


        try {
            // InternalDrn.g:3539:48: (iv_ruleCARREYZ= ruleCARREYZ EOF )
            // InternalDrn.g:3540:2: iv_ruleCARREYZ= ruleCARREYZ EOF
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
    // InternalDrn.g:3546:1: ruleCARREYZ returns [EObject current=null] : ( ( (lv_name_0_0= 'carreYZ' ) ) otherlv_1= '(' otherlv_2= 'cote' otherlv_3= '=' ( ( (lv_coteCST_4_0= ruleEInt ) ) | ( (otherlv_5= RULE_ID ) ) ) otherlv_6= 'temps' otherlv_7= '=' ( ( (lv_tempsCST_8_0= ruleEInt ) ) | ( (otherlv_9= RULE_ID ) ) ) otherlv_10= ')' ) ;
    public final EObject ruleCARREYZ() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_coteCST_4_0 = null;

        AntlrDatatypeRuleToken lv_tempsCST_8_0 = null;



        	enterRule();

        try {
            // InternalDrn.g:3552:2: ( ( ( (lv_name_0_0= 'carreYZ' ) ) otherlv_1= '(' otherlv_2= 'cote' otherlv_3= '=' ( ( (lv_coteCST_4_0= ruleEInt ) ) | ( (otherlv_5= RULE_ID ) ) ) otherlv_6= 'temps' otherlv_7= '=' ( ( (lv_tempsCST_8_0= ruleEInt ) ) | ( (otherlv_9= RULE_ID ) ) ) otherlv_10= ')' ) )
            // InternalDrn.g:3553:2: ( ( (lv_name_0_0= 'carreYZ' ) ) otherlv_1= '(' otherlv_2= 'cote' otherlv_3= '=' ( ( (lv_coteCST_4_0= ruleEInt ) ) | ( (otherlv_5= RULE_ID ) ) ) otherlv_6= 'temps' otherlv_7= '=' ( ( (lv_tempsCST_8_0= ruleEInt ) ) | ( (otherlv_9= RULE_ID ) ) ) otherlv_10= ')' )
            {
            // InternalDrn.g:3553:2: ( ( (lv_name_0_0= 'carreYZ' ) ) otherlv_1= '(' otherlv_2= 'cote' otherlv_3= '=' ( ( (lv_coteCST_4_0= ruleEInt ) ) | ( (otherlv_5= RULE_ID ) ) ) otherlv_6= 'temps' otherlv_7= '=' ( ( (lv_tempsCST_8_0= ruleEInt ) ) | ( (otherlv_9= RULE_ID ) ) ) otherlv_10= ')' )
            // InternalDrn.g:3554:3: ( (lv_name_0_0= 'carreYZ' ) ) otherlv_1= '(' otherlv_2= 'cote' otherlv_3= '=' ( ( (lv_coteCST_4_0= ruleEInt ) ) | ( (otherlv_5= RULE_ID ) ) ) otherlv_6= 'temps' otherlv_7= '=' ( ( (lv_tempsCST_8_0= ruleEInt ) ) | ( (otherlv_9= RULE_ID ) ) ) otherlv_10= ')'
            {
            // InternalDrn.g:3554:3: ( (lv_name_0_0= 'carreYZ' ) )
            // InternalDrn.g:3555:4: (lv_name_0_0= 'carreYZ' )
            {
            // InternalDrn.g:3555:4: (lv_name_0_0= 'carreYZ' )
            // InternalDrn.g:3556:5: lv_name_0_0= 'carreYZ'
            {
            lv_name_0_0=(Token)match(input,46,FOLLOW_14); 

            					newLeafNode(lv_name_0_0, grammarAccess.getCARREYZAccess().getNameCarreYZKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCARREYZRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "carreYZ");
            				

            }


            }

            otherlv_1=(Token)match(input,25,FOLLOW_32); 

            			newLeafNode(otherlv_1, grammarAccess.getCARREYZAccess().getLeftParenthesisKeyword_1());
            		
            otherlv_2=(Token)match(input,43,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getCARREYZAccess().getCoteKeyword_2());
            		
            otherlv_3=(Token)match(input,14,FOLLOW_20); 

            			newLeafNode(otherlv_3, grammarAccess.getCARREYZAccess().getEqualsSignKeyword_3());
            		
            // InternalDrn.g:3580:3: ( ( (lv_coteCST_4_0= ruleEInt ) ) | ( (otherlv_5= RULE_ID ) ) )
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==RULE_INT||LA54_0==68) ) {
                alt54=1;
            }
            else if ( (LA54_0==RULE_ID) ) {
                alt54=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;
            }
            switch (alt54) {
                case 1 :
                    // InternalDrn.g:3581:4: ( (lv_coteCST_4_0= ruleEInt ) )
                    {
                    // InternalDrn.g:3581:4: ( (lv_coteCST_4_0= ruleEInt ) )
                    // InternalDrn.g:3582:5: (lv_coteCST_4_0= ruleEInt )
                    {
                    // InternalDrn.g:3582:5: (lv_coteCST_4_0= ruleEInt )
                    // InternalDrn.g:3583:6: lv_coteCST_4_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getCARREYZAccess().getCoteCSTEIntParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_29);
                    lv_coteCST_4_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCARREYZRule());
                    						}
                    						set(
                    							current,
                    							"coteCST",
                    							lv_coteCST_4_0,
                    							"sar.drone.Drn.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDrn.g:3601:4: ( (otherlv_5= RULE_ID ) )
                    {
                    // InternalDrn.g:3601:4: ( (otherlv_5= RULE_ID ) )
                    // InternalDrn.g:3602:5: (otherlv_5= RULE_ID )
                    {
                    // InternalDrn.g:3602:5: (otherlv_5= RULE_ID )
                    // InternalDrn.g:3603:6: otherlv_5= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCARREYZRule());
                    						}
                    					
                    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_29); 

                    						newLeafNode(otherlv_5, grammarAccess.getCARREYZAccess().getCoteVARParametreCrossReference_4_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,33,FOLLOW_6); 

            			newLeafNode(otherlv_6, grammarAccess.getCARREYZAccess().getTempsKeyword_5());
            		
            otherlv_7=(Token)match(input,14,FOLLOW_20); 

            			newLeafNode(otherlv_7, grammarAccess.getCARREYZAccess().getEqualsSignKeyword_6());
            		
            // InternalDrn.g:3623:3: ( ( (lv_tempsCST_8_0= ruleEInt ) ) | ( (otherlv_9= RULE_ID ) ) )
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==RULE_INT||LA55_0==68) ) {
                alt55=1;
            }
            else if ( (LA55_0==RULE_ID) ) {
                alt55=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;
            }
            switch (alt55) {
                case 1 :
                    // InternalDrn.g:3624:4: ( (lv_tempsCST_8_0= ruleEInt ) )
                    {
                    // InternalDrn.g:3624:4: ( (lv_tempsCST_8_0= ruleEInt ) )
                    // InternalDrn.g:3625:5: (lv_tempsCST_8_0= ruleEInt )
                    {
                    // InternalDrn.g:3625:5: (lv_tempsCST_8_0= ruleEInt )
                    // InternalDrn.g:3626:6: lv_tempsCST_8_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getCARREYZAccess().getTempsCSTEIntParserRuleCall_7_0_0());
                    					
                    pushFollow(FOLLOW_30);
                    lv_tempsCST_8_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCARREYZRule());
                    						}
                    						set(
                    							current,
                    							"tempsCST",
                    							lv_tempsCST_8_0,
                    							"sar.drone.Drn.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDrn.g:3644:4: ( (otherlv_9= RULE_ID ) )
                    {
                    // InternalDrn.g:3644:4: ( (otherlv_9= RULE_ID ) )
                    // InternalDrn.g:3645:5: (otherlv_9= RULE_ID )
                    {
                    // InternalDrn.g:3645:5: (otherlv_9= RULE_ID )
                    // InternalDrn.g:3646:6: otherlv_9= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCARREYZRule());
                    						}
                    					
                    otherlv_9=(Token)match(input,RULE_ID,FOLLOW_30); 

                    						newLeafNode(otherlv_9, grammarAccess.getCARREYZAccess().getTempsVARParametreCrossReference_7_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,27,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getCARREYZAccess().getRightParenthesisKeyword_8());
            		

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
    // InternalDrn.g:3666:1: entryRuleDepXZ_IMPL returns [EObject current=null] : iv_ruleDepXZ_IMPL= ruleDepXZ_IMPL EOF ;
    public final EObject entryRuleDepXZ_IMPL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDepXZ_IMPL = null;


        try {
            // InternalDrn.g:3666:51: (iv_ruleDepXZ_IMPL= ruleDepXZ_IMPL EOF )
            // InternalDrn.g:3667:2: iv_ruleDepXZ_IMPL= ruleDepXZ_IMPL EOF
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
    // InternalDrn.g:3673:1: ruleDepXZ_IMPL returns [EObject current=null] : this_DepXZ_0= ruleDepXZ ;
    public final EObject ruleDepXZ_IMPL() throws RecognitionException {
        EObject current = null;

        EObject this_DepXZ_0 = null;



        	enterRule();

        try {
            // InternalDrn.g:3679:2: (this_DepXZ_0= ruleDepXZ )
            // InternalDrn.g:3680:2: this_DepXZ_0= ruleDepXZ
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
    // InternalDrn.g:3691:1: entryRuleDepXZ returns [EObject current=null] : iv_ruleDepXZ= ruleDepXZ EOF ;
    public final EObject entryRuleDepXZ() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDepXZ = null;


        try {
            // InternalDrn.g:3691:46: (iv_ruleDepXZ= ruleDepXZ EOF )
            // InternalDrn.g:3692:2: iv_ruleDepXZ= ruleDepXZ EOF
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
    // InternalDrn.g:3698:1: ruleDepXZ returns [EObject current=null] : ( ( (lv_name_0_0= 'depXZ' ) ) otherlv_1= '(' otherlv_2= 'distance' otherlv_3= '=' ( ( (lv_distanceCST_4_0= ruleEInt ) ) | ( (otherlv_5= RULE_ID ) ) ) otherlv_6= 'temps' otherlv_7= '=' ( ( (lv_tempsCST_8_0= ruleEInt ) ) | ( (otherlv_9= RULE_ID ) ) ) otherlv_10= ')' ) ;
    public final EObject ruleDepXZ() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_distanceCST_4_0 = null;

        AntlrDatatypeRuleToken lv_tempsCST_8_0 = null;



        	enterRule();

        try {
            // InternalDrn.g:3704:2: ( ( ( (lv_name_0_0= 'depXZ' ) ) otherlv_1= '(' otherlv_2= 'distance' otherlv_3= '=' ( ( (lv_distanceCST_4_0= ruleEInt ) ) | ( (otherlv_5= RULE_ID ) ) ) otherlv_6= 'temps' otherlv_7= '=' ( ( (lv_tempsCST_8_0= ruleEInt ) ) | ( (otherlv_9= RULE_ID ) ) ) otherlv_10= ')' ) )
            // InternalDrn.g:3705:2: ( ( (lv_name_0_0= 'depXZ' ) ) otherlv_1= '(' otherlv_2= 'distance' otherlv_3= '=' ( ( (lv_distanceCST_4_0= ruleEInt ) ) | ( (otherlv_5= RULE_ID ) ) ) otherlv_6= 'temps' otherlv_7= '=' ( ( (lv_tempsCST_8_0= ruleEInt ) ) | ( (otherlv_9= RULE_ID ) ) ) otherlv_10= ')' )
            {
            // InternalDrn.g:3705:2: ( ( (lv_name_0_0= 'depXZ' ) ) otherlv_1= '(' otherlv_2= 'distance' otherlv_3= '=' ( ( (lv_distanceCST_4_0= ruleEInt ) ) | ( (otherlv_5= RULE_ID ) ) ) otherlv_6= 'temps' otherlv_7= '=' ( ( (lv_tempsCST_8_0= ruleEInt ) ) | ( (otherlv_9= RULE_ID ) ) ) otherlv_10= ')' )
            // InternalDrn.g:3706:3: ( (lv_name_0_0= 'depXZ' ) ) otherlv_1= '(' otherlv_2= 'distance' otherlv_3= '=' ( ( (lv_distanceCST_4_0= ruleEInt ) ) | ( (otherlv_5= RULE_ID ) ) ) otherlv_6= 'temps' otherlv_7= '=' ( ( (lv_tempsCST_8_0= ruleEInt ) ) | ( (otherlv_9= RULE_ID ) ) ) otherlv_10= ')'
            {
            // InternalDrn.g:3706:3: ( (lv_name_0_0= 'depXZ' ) )
            // InternalDrn.g:3707:4: (lv_name_0_0= 'depXZ' )
            {
            // InternalDrn.g:3707:4: (lv_name_0_0= 'depXZ' )
            // InternalDrn.g:3708:5: lv_name_0_0= 'depXZ'
            {
            lv_name_0_0=(Token)match(input,47,FOLLOW_14); 

            					newLeafNode(lv_name_0_0, grammarAccess.getDepXZAccess().getNameDepXZKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDepXZRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "depXZ");
            				

            }


            }

            otherlv_1=(Token)match(input,25,FOLLOW_28); 

            			newLeafNode(otherlv_1, grammarAccess.getDepXZAccess().getLeftParenthesisKeyword_1());
            		
            otherlv_2=(Token)match(input,32,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getDepXZAccess().getDistanceKeyword_2());
            		
            otherlv_3=(Token)match(input,14,FOLLOW_20); 

            			newLeafNode(otherlv_3, grammarAccess.getDepXZAccess().getEqualsSignKeyword_3());
            		
            // InternalDrn.g:3732:3: ( ( (lv_distanceCST_4_0= ruleEInt ) ) | ( (otherlv_5= RULE_ID ) ) )
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==RULE_INT||LA56_0==68) ) {
                alt56=1;
            }
            else if ( (LA56_0==RULE_ID) ) {
                alt56=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }
            switch (alt56) {
                case 1 :
                    // InternalDrn.g:3733:4: ( (lv_distanceCST_4_0= ruleEInt ) )
                    {
                    // InternalDrn.g:3733:4: ( (lv_distanceCST_4_0= ruleEInt ) )
                    // InternalDrn.g:3734:5: (lv_distanceCST_4_0= ruleEInt )
                    {
                    // InternalDrn.g:3734:5: (lv_distanceCST_4_0= ruleEInt )
                    // InternalDrn.g:3735:6: lv_distanceCST_4_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getDepXZAccess().getDistanceCSTEIntParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_29);
                    lv_distanceCST_4_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDepXZRule());
                    						}
                    						set(
                    							current,
                    							"distanceCST",
                    							lv_distanceCST_4_0,
                    							"sar.drone.Drn.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDrn.g:3753:4: ( (otherlv_5= RULE_ID ) )
                    {
                    // InternalDrn.g:3753:4: ( (otherlv_5= RULE_ID ) )
                    // InternalDrn.g:3754:5: (otherlv_5= RULE_ID )
                    {
                    // InternalDrn.g:3754:5: (otherlv_5= RULE_ID )
                    // InternalDrn.g:3755:6: otherlv_5= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDepXZRule());
                    						}
                    					
                    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_29); 

                    						newLeafNode(otherlv_5, grammarAccess.getDepXZAccess().getDistanceVarParametreCrossReference_4_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,33,FOLLOW_6); 

            			newLeafNode(otherlv_6, grammarAccess.getDepXZAccess().getTempsKeyword_5());
            		
            otherlv_7=(Token)match(input,14,FOLLOW_20); 

            			newLeafNode(otherlv_7, grammarAccess.getDepXZAccess().getEqualsSignKeyword_6());
            		
            // InternalDrn.g:3775:3: ( ( (lv_tempsCST_8_0= ruleEInt ) ) | ( (otherlv_9= RULE_ID ) ) )
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==RULE_INT||LA57_0==68) ) {
                alt57=1;
            }
            else if ( (LA57_0==RULE_ID) ) {
                alt57=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }
            switch (alt57) {
                case 1 :
                    // InternalDrn.g:3776:4: ( (lv_tempsCST_8_0= ruleEInt ) )
                    {
                    // InternalDrn.g:3776:4: ( (lv_tempsCST_8_0= ruleEInt ) )
                    // InternalDrn.g:3777:5: (lv_tempsCST_8_0= ruleEInt )
                    {
                    // InternalDrn.g:3777:5: (lv_tempsCST_8_0= ruleEInt )
                    // InternalDrn.g:3778:6: lv_tempsCST_8_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getDepXZAccess().getTempsCSTEIntParserRuleCall_7_0_0());
                    					
                    pushFollow(FOLLOW_30);
                    lv_tempsCST_8_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDepXZRule());
                    						}
                    						set(
                    							current,
                    							"tempsCST",
                    							lv_tempsCST_8_0,
                    							"sar.drone.Drn.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDrn.g:3796:4: ( (otherlv_9= RULE_ID ) )
                    {
                    // InternalDrn.g:3796:4: ( (otherlv_9= RULE_ID ) )
                    // InternalDrn.g:3797:5: (otherlv_9= RULE_ID )
                    {
                    // InternalDrn.g:3797:5: (otherlv_9= RULE_ID )
                    // InternalDrn.g:3798:6: otherlv_9= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDepXZRule());
                    						}
                    					
                    otherlv_9=(Token)match(input,RULE_ID,FOLLOW_30); 

                    						newLeafNode(otherlv_9, grammarAccess.getDepXZAccess().getTempsVARParametreCrossReference_7_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,27,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getDepXZAccess().getRightParenthesisKeyword_8());
            		

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
    // InternalDrn.g:3818:1: entryRuleDepXYZ_IMPL returns [EObject current=null] : iv_ruleDepXYZ_IMPL= ruleDepXYZ_IMPL EOF ;
    public final EObject entryRuleDepXYZ_IMPL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDepXYZ_IMPL = null;


        try {
            // InternalDrn.g:3818:52: (iv_ruleDepXYZ_IMPL= ruleDepXYZ_IMPL EOF )
            // InternalDrn.g:3819:2: iv_ruleDepXYZ_IMPL= ruleDepXYZ_IMPL EOF
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
    // InternalDrn.g:3825:1: ruleDepXYZ_IMPL returns [EObject current=null] : (this_DepXYZ_0= ruleDepXYZ | this_Flip_1= ruleFlip ) ;
    public final EObject ruleDepXYZ_IMPL() throws RecognitionException {
        EObject current = null;

        EObject this_DepXYZ_0 = null;

        EObject this_Flip_1 = null;



        	enterRule();

        try {
            // InternalDrn.g:3831:2: ( (this_DepXYZ_0= ruleDepXYZ | this_Flip_1= ruleFlip ) )
            // InternalDrn.g:3832:2: (this_DepXYZ_0= ruleDepXYZ | this_Flip_1= ruleFlip )
            {
            // InternalDrn.g:3832:2: (this_DepXYZ_0= ruleDepXYZ | this_Flip_1= ruleFlip )
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==48) ) {
                alt58=1;
            }
            else if ( (LA58_0==49) ) {
                alt58=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                throw nvae;
            }
            switch (alt58) {
                case 1 :
                    // InternalDrn.g:3833:3: this_DepXYZ_0= ruleDepXYZ
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
                    // InternalDrn.g:3842:3: this_Flip_1= ruleFlip
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
    // InternalDrn.g:3854:1: entryRuleDepXYZ returns [EObject current=null] : iv_ruleDepXYZ= ruleDepXYZ EOF ;
    public final EObject entryRuleDepXYZ() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDepXYZ = null;


        try {
            // InternalDrn.g:3854:47: (iv_ruleDepXYZ= ruleDepXYZ EOF )
            // InternalDrn.g:3855:2: iv_ruleDepXYZ= ruleDepXYZ EOF
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
    // InternalDrn.g:3861:1: ruleDepXYZ returns [EObject current=null] : ( ( (lv_name_0_0= 'depXYZ' ) ) otherlv_1= '(' otherlv_2= 'distance' otherlv_3= '=' ( ( (lv_distanceCST_4_0= ruleEInt ) ) | ( (otherlv_5= RULE_ID ) ) ) otherlv_6= 'temps' otherlv_7= '=' ( ( (lv_tempsCST_8_0= ruleEInt ) ) | ( (otherlv_9= RULE_ID ) ) ) otherlv_10= ')' ) ;
    public final EObject ruleDepXYZ() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_distanceCST_4_0 = null;

        AntlrDatatypeRuleToken lv_tempsCST_8_0 = null;



        	enterRule();

        try {
            // InternalDrn.g:3867:2: ( ( ( (lv_name_0_0= 'depXYZ' ) ) otherlv_1= '(' otherlv_2= 'distance' otherlv_3= '=' ( ( (lv_distanceCST_4_0= ruleEInt ) ) | ( (otherlv_5= RULE_ID ) ) ) otherlv_6= 'temps' otherlv_7= '=' ( ( (lv_tempsCST_8_0= ruleEInt ) ) | ( (otherlv_9= RULE_ID ) ) ) otherlv_10= ')' ) )
            // InternalDrn.g:3868:2: ( ( (lv_name_0_0= 'depXYZ' ) ) otherlv_1= '(' otherlv_2= 'distance' otherlv_3= '=' ( ( (lv_distanceCST_4_0= ruleEInt ) ) | ( (otherlv_5= RULE_ID ) ) ) otherlv_6= 'temps' otherlv_7= '=' ( ( (lv_tempsCST_8_0= ruleEInt ) ) | ( (otherlv_9= RULE_ID ) ) ) otherlv_10= ')' )
            {
            // InternalDrn.g:3868:2: ( ( (lv_name_0_0= 'depXYZ' ) ) otherlv_1= '(' otherlv_2= 'distance' otherlv_3= '=' ( ( (lv_distanceCST_4_0= ruleEInt ) ) | ( (otherlv_5= RULE_ID ) ) ) otherlv_6= 'temps' otherlv_7= '=' ( ( (lv_tempsCST_8_0= ruleEInt ) ) | ( (otherlv_9= RULE_ID ) ) ) otherlv_10= ')' )
            // InternalDrn.g:3869:3: ( (lv_name_0_0= 'depXYZ' ) ) otherlv_1= '(' otherlv_2= 'distance' otherlv_3= '=' ( ( (lv_distanceCST_4_0= ruleEInt ) ) | ( (otherlv_5= RULE_ID ) ) ) otherlv_6= 'temps' otherlv_7= '=' ( ( (lv_tempsCST_8_0= ruleEInt ) ) | ( (otherlv_9= RULE_ID ) ) ) otherlv_10= ')'
            {
            // InternalDrn.g:3869:3: ( (lv_name_0_0= 'depXYZ' ) )
            // InternalDrn.g:3870:4: (lv_name_0_0= 'depXYZ' )
            {
            // InternalDrn.g:3870:4: (lv_name_0_0= 'depXYZ' )
            // InternalDrn.g:3871:5: lv_name_0_0= 'depXYZ'
            {
            lv_name_0_0=(Token)match(input,48,FOLLOW_14); 

            					newLeafNode(lv_name_0_0, grammarAccess.getDepXYZAccess().getNameDepXYZKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDepXYZRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "depXYZ");
            				

            }


            }

            otherlv_1=(Token)match(input,25,FOLLOW_28); 

            			newLeafNode(otherlv_1, grammarAccess.getDepXYZAccess().getLeftParenthesisKeyword_1());
            		
            otherlv_2=(Token)match(input,32,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getDepXYZAccess().getDistanceKeyword_2());
            		
            otherlv_3=(Token)match(input,14,FOLLOW_20); 

            			newLeafNode(otherlv_3, grammarAccess.getDepXYZAccess().getEqualsSignKeyword_3());
            		
            // InternalDrn.g:3895:3: ( ( (lv_distanceCST_4_0= ruleEInt ) ) | ( (otherlv_5= RULE_ID ) ) )
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==RULE_INT||LA59_0==68) ) {
                alt59=1;
            }
            else if ( (LA59_0==RULE_ID) ) {
                alt59=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;
            }
            switch (alt59) {
                case 1 :
                    // InternalDrn.g:3896:4: ( (lv_distanceCST_4_0= ruleEInt ) )
                    {
                    // InternalDrn.g:3896:4: ( (lv_distanceCST_4_0= ruleEInt ) )
                    // InternalDrn.g:3897:5: (lv_distanceCST_4_0= ruleEInt )
                    {
                    // InternalDrn.g:3897:5: (lv_distanceCST_4_0= ruleEInt )
                    // InternalDrn.g:3898:6: lv_distanceCST_4_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getDepXYZAccess().getDistanceCSTEIntParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_29);
                    lv_distanceCST_4_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDepXYZRule());
                    						}
                    						set(
                    							current,
                    							"distanceCST",
                    							lv_distanceCST_4_0,
                    							"sar.drone.Drn.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDrn.g:3916:4: ( (otherlv_5= RULE_ID ) )
                    {
                    // InternalDrn.g:3916:4: ( (otherlv_5= RULE_ID ) )
                    // InternalDrn.g:3917:5: (otherlv_5= RULE_ID )
                    {
                    // InternalDrn.g:3917:5: (otherlv_5= RULE_ID )
                    // InternalDrn.g:3918:6: otherlv_5= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDepXYZRule());
                    						}
                    					
                    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_29); 

                    						newLeafNode(otherlv_5, grammarAccess.getDepXYZAccess().getDistanceVarParametreCrossReference_4_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,33,FOLLOW_6); 

            			newLeafNode(otherlv_6, grammarAccess.getDepXYZAccess().getTempsKeyword_5());
            		
            otherlv_7=(Token)match(input,14,FOLLOW_20); 

            			newLeafNode(otherlv_7, grammarAccess.getDepXYZAccess().getEqualsSignKeyword_6());
            		
            // InternalDrn.g:3938:3: ( ( (lv_tempsCST_8_0= ruleEInt ) ) | ( (otherlv_9= RULE_ID ) ) )
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==RULE_INT||LA60_0==68) ) {
                alt60=1;
            }
            else if ( (LA60_0==RULE_ID) ) {
                alt60=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 0, input);

                throw nvae;
            }
            switch (alt60) {
                case 1 :
                    // InternalDrn.g:3939:4: ( (lv_tempsCST_8_0= ruleEInt ) )
                    {
                    // InternalDrn.g:3939:4: ( (lv_tempsCST_8_0= ruleEInt ) )
                    // InternalDrn.g:3940:5: (lv_tempsCST_8_0= ruleEInt )
                    {
                    // InternalDrn.g:3940:5: (lv_tempsCST_8_0= ruleEInt )
                    // InternalDrn.g:3941:6: lv_tempsCST_8_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getDepXYZAccess().getTempsCSTEIntParserRuleCall_7_0_0());
                    					
                    pushFollow(FOLLOW_30);
                    lv_tempsCST_8_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDepXYZRule());
                    						}
                    						set(
                    							current,
                    							"tempsCST",
                    							lv_tempsCST_8_0,
                    							"sar.drone.Drn.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDrn.g:3959:4: ( (otherlv_9= RULE_ID ) )
                    {
                    // InternalDrn.g:3959:4: ( (otherlv_9= RULE_ID ) )
                    // InternalDrn.g:3960:5: (otherlv_9= RULE_ID )
                    {
                    // InternalDrn.g:3960:5: (otherlv_9= RULE_ID )
                    // InternalDrn.g:3961:6: otherlv_9= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDepXYZRule());
                    						}
                    					
                    otherlv_9=(Token)match(input,RULE_ID,FOLLOW_30); 

                    						newLeafNode(otherlv_9, grammarAccess.getDepXYZAccess().getTempsVARParametreCrossReference_7_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,27,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getDepXYZAccess().getRightParenthesisKeyword_8());
            		

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
    // InternalDrn.g:3981:1: entryRuleFlip returns [EObject current=null] : iv_ruleFlip= ruleFlip EOF ;
    public final EObject entryRuleFlip() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFlip = null;


        try {
            // InternalDrn.g:3981:45: (iv_ruleFlip= ruleFlip EOF )
            // InternalDrn.g:3982:2: iv_ruleFlip= ruleFlip EOF
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
    // InternalDrn.g:3988:1: ruleFlip returns [EObject current=null] : ( ( (lv_name_0_0= 'flip' ) ) otherlv_1= '(' otherlv_2= ')' ) ;
    public final EObject ruleFlip() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalDrn.g:3994:2: ( ( ( (lv_name_0_0= 'flip' ) ) otherlv_1= '(' otherlv_2= ')' ) )
            // InternalDrn.g:3995:2: ( ( (lv_name_0_0= 'flip' ) ) otherlv_1= '(' otherlv_2= ')' )
            {
            // InternalDrn.g:3995:2: ( ( (lv_name_0_0= 'flip' ) ) otherlv_1= '(' otherlv_2= ')' )
            // InternalDrn.g:3996:3: ( (lv_name_0_0= 'flip' ) ) otherlv_1= '(' otherlv_2= ')'
            {
            // InternalDrn.g:3996:3: ( (lv_name_0_0= 'flip' ) )
            // InternalDrn.g:3997:4: (lv_name_0_0= 'flip' )
            {
            // InternalDrn.g:3997:4: (lv_name_0_0= 'flip' )
            // InternalDrn.g:3998:5: lv_name_0_0= 'flip'
            {
            lv_name_0_0=(Token)match(input,49,FOLLOW_14); 

            					newLeafNode(lv_name_0_0, grammarAccess.getFlipAccess().getNameFlipKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFlipRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "flip");
            				

            }


            }

            otherlv_1=(Token)match(input,25,FOLLOW_30); 

            			newLeafNode(otherlv_1, grammarAccess.getFlipAccess().getLeftParenthesisKeyword_1());
            		
            otherlv_2=(Token)match(input,27,FOLLOW_2); 

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
    // InternalDrn.g:4022:1: entryRuleRotate returns [EObject current=null] : iv_ruleRotate= ruleRotate EOF ;
    public final EObject entryRuleRotate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRotate = null;


        try {
            // InternalDrn.g:4022:47: (iv_ruleRotate= ruleRotate EOF )
            // InternalDrn.g:4023:2: iv_ruleRotate= ruleRotate EOF
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
    // InternalDrn.g:4029:1: ruleRotate returns [EObject current=null] : ( ( (lv_name_0_0= 'rotate' ) ) otherlv_1= '(' otherlv_2= 'angle' otherlv_3= '=' ( ( (lv_angleCST_4_0= ruleEInt ) ) | ( (otherlv_5= RULE_ID ) ) ) otherlv_6= 'temps' otherlv_7= '=' ( ( (lv_tempsCST_8_0= ruleEInt ) ) | ( (otherlv_9= RULE_ID ) ) ) otherlv_10= ')' ) ;
    public final EObject ruleRotate() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_angleCST_4_0 = null;

        AntlrDatatypeRuleToken lv_tempsCST_8_0 = null;



        	enterRule();

        try {
            // InternalDrn.g:4035:2: ( ( ( (lv_name_0_0= 'rotate' ) ) otherlv_1= '(' otherlv_2= 'angle' otherlv_3= '=' ( ( (lv_angleCST_4_0= ruleEInt ) ) | ( (otherlv_5= RULE_ID ) ) ) otherlv_6= 'temps' otherlv_7= '=' ( ( (lv_tempsCST_8_0= ruleEInt ) ) | ( (otherlv_9= RULE_ID ) ) ) otherlv_10= ')' ) )
            // InternalDrn.g:4036:2: ( ( (lv_name_0_0= 'rotate' ) ) otherlv_1= '(' otherlv_2= 'angle' otherlv_3= '=' ( ( (lv_angleCST_4_0= ruleEInt ) ) | ( (otherlv_5= RULE_ID ) ) ) otherlv_6= 'temps' otherlv_7= '=' ( ( (lv_tempsCST_8_0= ruleEInt ) ) | ( (otherlv_9= RULE_ID ) ) ) otherlv_10= ')' )
            {
            // InternalDrn.g:4036:2: ( ( (lv_name_0_0= 'rotate' ) ) otherlv_1= '(' otherlv_2= 'angle' otherlv_3= '=' ( ( (lv_angleCST_4_0= ruleEInt ) ) | ( (otherlv_5= RULE_ID ) ) ) otherlv_6= 'temps' otherlv_7= '=' ( ( (lv_tempsCST_8_0= ruleEInt ) ) | ( (otherlv_9= RULE_ID ) ) ) otherlv_10= ')' )
            // InternalDrn.g:4037:3: ( (lv_name_0_0= 'rotate' ) ) otherlv_1= '(' otherlv_2= 'angle' otherlv_3= '=' ( ( (lv_angleCST_4_0= ruleEInt ) ) | ( (otherlv_5= RULE_ID ) ) ) otherlv_6= 'temps' otherlv_7= '=' ( ( (lv_tempsCST_8_0= ruleEInt ) ) | ( (otherlv_9= RULE_ID ) ) ) otherlv_10= ')'
            {
            // InternalDrn.g:4037:3: ( (lv_name_0_0= 'rotate' ) )
            // InternalDrn.g:4038:4: (lv_name_0_0= 'rotate' )
            {
            // InternalDrn.g:4038:4: (lv_name_0_0= 'rotate' )
            // InternalDrn.g:4039:5: lv_name_0_0= 'rotate'
            {
            lv_name_0_0=(Token)match(input,50,FOLLOW_14); 

            					newLeafNode(lv_name_0_0, grammarAccess.getRotateAccess().getNameRotateKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRotateRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "rotate");
            				

            }


            }

            otherlv_1=(Token)match(input,25,FOLLOW_33); 

            			newLeafNode(otherlv_1, grammarAccess.getRotateAccess().getLeftParenthesisKeyword_1());
            		
            otherlv_2=(Token)match(input,51,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getRotateAccess().getAngleKeyword_2());
            		
            otherlv_3=(Token)match(input,14,FOLLOW_20); 

            			newLeafNode(otherlv_3, grammarAccess.getRotateAccess().getEqualsSignKeyword_3());
            		
            // InternalDrn.g:4063:3: ( ( (lv_angleCST_4_0= ruleEInt ) ) | ( (otherlv_5= RULE_ID ) ) )
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==RULE_INT||LA61_0==68) ) {
                alt61=1;
            }
            else if ( (LA61_0==RULE_ID) ) {
                alt61=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 61, 0, input);

                throw nvae;
            }
            switch (alt61) {
                case 1 :
                    // InternalDrn.g:4064:4: ( (lv_angleCST_4_0= ruleEInt ) )
                    {
                    // InternalDrn.g:4064:4: ( (lv_angleCST_4_0= ruleEInt ) )
                    // InternalDrn.g:4065:5: (lv_angleCST_4_0= ruleEInt )
                    {
                    // InternalDrn.g:4065:5: (lv_angleCST_4_0= ruleEInt )
                    // InternalDrn.g:4066:6: lv_angleCST_4_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getRotateAccess().getAngleCSTEIntParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_29);
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


                    }
                    break;
                case 2 :
                    // InternalDrn.g:4084:4: ( (otherlv_5= RULE_ID ) )
                    {
                    // InternalDrn.g:4084:4: ( (otherlv_5= RULE_ID ) )
                    // InternalDrn.g:4085:5: (otherlv_5= RULE_ID )
                    {
                    // InternalDrn.g:4085:5: (otherlv_5= RULE_ID )
                    // InternalDrn.g:4086:6: otherlv_5= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRotateRule());
                    						}
                    					
                    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_29); 

                    						newLeafNode(otherlv_5, grammarAccess.getRotateAccess().getAngleVARParametreCrossReference_4_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,33,FOLLOW_6); 

            			newLeafNode(otherlv_6, grammarAccess.getRotateAccess().getTempsKeyword_5());
            		
            otherlv_7=(Token)match(input,14,FOLLOW_20); 

            			newLeafNode(otherlv_7, grammarAccess.getRotateAccess().getEqualsSignKeyword_6());
            		
            // InternalDrn.g:4106:3: ( ( (lv_tempsCST_8_0= ruleEInt ) ) | ( (otherlv_9= RULE_ID ) ) )
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==RULE_INT||LA62_0==68) ) {
                alt62=1;
            }
            else if ( (LA62_0==RULE_ID) ) {
                alt62=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 62, 0, input);

                throw nvae;
            }
            switch (alt62) {
                case 1 :
                    // InternalDrn.g:4107:4: ( (lv_tempsCST_8_0= ruleEInt ) )
                    {
                    // InternalDrn.g:4107:4: ( (lv_tempsCST_8_0= ruleEInt ) )
                    // InternalDrn.g:4108:5: (lv_tempsCST_8_0= ruleEInt )
                    {
                    // InternalDrn.g:4108:5: (lv_tempsCST_8_0= ruleEInt )
                    // InternalDrn.g:4109:6: lv_tempsCST_8_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getRotateAccess().getTempsCSTEIntParserRuleCall_7_0_0());
                    					
                    pushFollow(FOLLOW_30);
                    lv_tempsCST_8_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRotateRule());
                    						}
                    						set(
                    							current,
                    							"tempsCST",
                    							lv_tempsCST_8_0,
                    							"sar.drone.Drn.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDrn.g:4127:4: ( (otherlv_9= RULE_ID ) )
                    {
                    // InternalDrn.g:4127:4: ( (otherlv_9= RULE_ID ) )
                    // InternalDrn.g:4128:5: (otherlv_9= RULE_ID )
                    {
                    // InternalDrn.g:4128:5: (otherlv_9= RULE_ID )
                    // InternalDrn.g:4129:6: otherlv_9= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRotateRule());
                    						}
                    					
                    otherlv_9=(Token)match(input,RULE_ID,FOLLOW_30); 

                    						newLeafNode(otherlv_9, grammarAccess.getRotateAccess().getTempsVARParametreCrossReference_7_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,27,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getRotateAccess().getRightParenthesisKeyword_8());
            		

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
    // InternalDrn.g:4149:1: entryRuleWait returns [EObject current=null] : iv_ruleWait= ruleWait EOF ;
    public final EObject entryRuleWait() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWait = null;


        try {
            // InternalDrn.g:4149:45: (iv_ruleWait= ruleWait EOF )
            // InternalDrn.g:4150:2: iv_ruleWait= ruleWait EOF
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
    // InternalDrn.g:4156:1: ruleWait returns [EObject current=null] : ( ( (lv_name_0_0= 'wait' ) ) otherlv_1= '(' otherlv_2= 'temps' otherlv_3= '=' ( ( (lv_tempsCST_4_0= ruleEInt ) ) | ( (otherlv_5= RULE_ID ) ) ) otherlv_6= ')' ) ;
    public final EObject ruleWait() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_tempsCST_4_0 = null;



        	enterRule();

        try {
            // InternalDrn.g:4162:2: ( ( ( (lv_name_0_0= 'wait' ) ) otherlv_1= '(' otherlv_2= 'temps' otherlv_3= '=' ( ( (lv_tempsCST_4_0= ruleEInt ) ) | ( (otherlv_5= RULE_ID ) ) ) otherlv_6= ')' ) )
            // InternalDrn.g:4163:2: ( ( (lv_name_0_0= 'wait' ) ) otherlv_1= '(' otherlv_2= 'temps' otherlv_3= '=' ( ( (lv_tempsCST_4_0= ruleEInt ) ) | ( (otherlv_5= RULE_ID ) ) ) otherlv_6= ')' )
            {
            // InternalDrn.g:4163:2: ( ( (lv_name_0_0= 'wait' ) ) otherlv_1= '(' otherlv_2= 'temps' otherlv_3= '=' ( ( (lv_tempsCST_4_0= ruleEInt ) ) | ( (otherlv_5= RULE_ID ) ) ) otherlv_6= ')' )
            // InternalDrn.g:4164:3: ( (lv_name_0_0= 'wait' ) ) otherlv_1= '(' otherlv_2= 'temps' otherlv_3= '=' ( ( (lv_tempsCST_4_0= ruleEInt ) ) | ( (otherlv_5= RULE_ID ) ) ) otherlv_6= ')'
            {
            // InternalDrn.g:4164:3: ( (lv_name_0_0= 'wait' ) )
            // InternalDrn.g:4165:4: (lv_name_0_0= 'wait' )
            {
            // InternalDrn.g:4165:4: (lv_name_0_0= 'wait' )
            // InternalDrn.g:4166:5: lv_name_0_0= 'wait'
            {
            lv_name_0_0=(Token)match(input,52,FOLLOW_14); 

            					newLeafNode(lv_name_0_0, grammarAccess.getWaitAccess().getNameWaitKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getWaitRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "wait");
            				

            }


            }

            otherlv_1=(Token)match(input,25,FOLLOW_29); 

            			newLeafNode(otherlv_1, grammarAccess.getWaitAccess().getLeftParenthesisKeyword_1());
            		
            otherlv_2=(Token)match(input,33,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getWaitAccess().getTempsKeyword_2());
            		
            otherlv_3=(Token)match(input,14,FOLLOW_20); 

            			newLeafNode(otherlv_3, grammarAccess.getWaitAccess().getEqualsSignKeyword_3());
            		
            // InternalDrn.g:4190:3: ( ( (lv_tempsCST_4_0= ruleEInt ) ) | ( (otherlv_5= RULE_ID ) ) )
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==RULE_INT||LA63_0==68) ) {
                alt63=1;
            }
            else if ( (LA63_0==RULE_ID) ) {
                alt63=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 63, 0, input);

                throw nvae;
            }
            switch (alt63) {
                case 1 :
                    // InternalDrn.g:4191:4: ( (lv_tempsCST_4_0= ruleEInt ) )
                    {
                    // InternalDrn.g:4191:4: ( (lv_tempsCST_4_0= ruleEInt ) )
                    // InternalDrn.g:4192:5: (lv_tempsCST_4_0= ruleEInt )
                    {
                    // InternalDrn.g:4192:5: (lv_tempsCST_4_0= ruleEInt )
                    // InternalDrn.g:4193:6: lv_tempsCST_4_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getWaitAccess().getTempsCSTEIntParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_30);
                    lv_tempsCST_4_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getWaitRule());
                    						}
                    						set(
                    							current,
                    							"tempsCST",
                    							lv_tempsCST_4_0,
                    							"sar.drone.Drn.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDrn.g:4211:4: ( (otherlv_5= RULE_ID ) )
                    {
                    // InternalDrn.g:4211:4: ( (otherlv_5= RULE_ID ) )
                    // InternalDrn.g:4212:5: (otherlv_5= RULE_ID )
                    {
                    // InternalDrn.g:4212:5: (otherlv_5= RULE_ID )
                    // InternalDrn.g:4213:6: otherlv_5= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getWaitRule());
                    						}
                    					
                    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_30); 

                    						newLeafNode(otherlv_5, grammarAccess.getWaitAccess().getTempsVARParametreCrossReference_4_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,27,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getWaitAccess().getRightParenthesisKeyword_5());
            		

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
    // InternalDrn.g:4233:1: entryRuleTakeOff returns [EObject current=null] : iv_ruleTakeOff= ruleTakeOff EOF ;
    public final EObject entryRuleTakeOff() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTakeOff = null;


        try {
            // InternalDrn.g:4233:48: (iv_ruleTakeOff= ruleTakeOff EOF )
            // InternalDrn.g:4234:2: iv_ruleTakeOff= ruleTakeOff EOF
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
    // InternalDrn.g:4240:1: ruleTakeOff returns [EObject current=null] : ( ( (lv_name_0_0= 'takeoff' ) ) otherlv_1= '(' otherlv_2= ')' ) ;
    public final EObject ruleTakeOff() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalDrn.g:4246:2: ( ( ( (lv_name_0_0= 'takeoff' ) ) otherlv_1= '(' otherlv_2= ')' ) )
            // InternalDrn.g:4247:2: ( ( (lv_name_0_0= 'takeoff' ) ) otherlv_1= '(' otherlv_2= ')' )
            {
            // InternalDrn.g:4247:2: ( ( (lv_name_0_0= 'takeoff' ) ) otherlv_1= '(' otherlv_2= ')' )
            // InternalDrn.g:4248:3: ( (lv_name_0_0= 'takeoff' ) ) otherlv_1= '(' otherlv_2= ')'
            {
            // InternalDrn.g:4248:3: ( (lv_name_0_0= 'takeoff' ) )
            // InternalDrn.g:4249:4: (lv_name_0_0= 'takeoff' )
            {
            // InternalDrn.g:4249:4: (lv_name_0_0= 'takeoff' )
            // InternalDrn.g:4250:5: lv_name_0_0= 'takeoff'
            {
            lv_name_0_0=(Token)match(input,53,FOLLOW_14); 

            					newLeafNode(lv_name_0_0, grammarAccess.getTakeOffAccess().getNameTakeoffKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTakeOffRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "takeoff");
            				

            }


            }

            otherlv_1=(Token)match(input,25,FOLLOW_30); 

            			newLeafNode(otherlv_1, grammarAccess.getTakeOffAccess().getLeftParenthesisKeyword_1());
            		
            otherlv_2=(Token)match(input,27,FOLLOW_2); 

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
    // InternalDrn.g:4274:1: entryRuleLand returns [EObject current=null] : iv_ruleLand= ruleLand EOF ;
    public final EObject entryRuleLand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLand = null;


        try {
            // InternalDrn.g:4274:45: (iv_ruleLand= ruleLand EOF )
            // InternalDrn.g:4275:2: iv_ruleLand= ruleLand EOF
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
    // InternalDrn.g:4281:1: ruleLand returns [EObject current=null] : ( ( (lv_name_0_0= 'land' ) ) otherlv_1= '(' otherlv_2= ')' ) ;
    public final EObject ruleLand() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalDrn.g:4287:2: ( ( ( (lv_name_0_0= 'land' ) ) otherlv_1= '(' otherlv_2= ')' ) )
            // InternalDrn.g:4288:2: ( ( (lv_name_0_0= 'land' ) ) otherlv_1= '(' otherlv_2= ')' )
            {
            // InternalDrn.g:4288:2: ( ( (lv_name_0_0= 'land' ) ) otherlv_1= '(' otherlv_2= ')' )
            // InternalDrn.g:4289:3: ( (lv_name_0_0= 'land' ) ) otherlv_1= '(' otherlv_2= ')'
            {
            // InternalDrn.g:4289:3: ( (lv_name_0_0= 'land' ) )
            // InternalDrn.g:4290:4: (lv_name_0_0= 'land' )
            {
            // InternalDrn.g:4290:4: (lv_name_0_0= 'land' )
            // InternalDrn.g:4291:5: lv_name_0_0= 'land'
            {
            lv_name_0_0=(Token)match(input,54,FOLLOW_14); 

            					newLeafNode(lv_name_0_0, grammarAccess.getLandAccess().getNameLandKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLandRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "land");
            				

            }


            }

            otherlv_1=(Token)match(input,25,FOLLOW_30); 

            			newLeafNode(otherlv_1, grammarAccess.getLandAccess().getLeftParenthesisKeyword_1());
            		
            otherlv_2=(Token)match(input,27,FOLLOW_2); 

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
    // InternalDrn.g:4315:1: entryRuleDevice returns [EObject current=null] : iv_ruleDevice= ruleDevice EOF ;
    public final EObject entryRuleDevice() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDevice = null;


        try {
            // InternalDrn.g:4315:47: (iv_ruleDevice= ruleDevice EOF )
            // InternalDrn.g:4316:2: iv_ruleDevice= ruleDevice EOF
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
    // InternalDrn.g:4322:1: ruleDevice returns [EObject current=null] : (otherlv_0= 'DEVICE' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_declarations_3_0= ruleDeclaration ) ) (otherlv_4= ';' ( (lv_declarations_5_0= ruleDeclaration ) ) )* otherlv_6= '}' ) ;
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
            // InternalDrn.g:4328:2: ( (otherlv_0= 'DEVICE' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_declarations_3_0= ruleDeclaration ) ) (otherlv_4= ';' ( (lv_declarations_5_0= ruleDeclaration ) ) )* otherlv_6= '}' ) )
            // InternalDrn.g:4329:2: (otherlv_0= 'DEVICE' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_declarations_3_0= ruleDeclaration ) ) (otherlv_4= ';' ( (lv_declarations_5_0= ruleDeclaration ) ) )* otherlv_6= '}' )
            {
            // InternalDrn.g:4329:2: (otherlv_0= 'DEVICE' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_declarations_3_0= ruleDeclaration ) ) (otherlv_4= ';' ( (lv_declarations_5_0= ruleDeclaration ) ) )* otherlv_6= '}' )
            // InternalDrn.g:4330:3: otherlv_0= 'DEVICE' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_declarations_3_0= ruleDeclaration ) ) (otherlv_4= ';' ( (lv_declarations_5_0= ruleDeclaration ) ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,55,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getDeviceAccess().getDEVICEKeyword_0());
            		
            // InternalDrn.g:4334:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDrn.g:4335:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDrn.g:4335:4: (lv_name_1_0= RULE_ID )
            // InternalDrn.g:4336:5: lv_name_1_0= RULE_ID
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
            		
            // InternalDrn.g:4356:3: ( (lv_declarations_3_0= ruleDeclaration ) )
            // InternalDrn.g:4357:4: (lv_declarations_3_0= ruleDeclaration )
            {
            // InternalDrn.g:4357:4: (lv_declarations_3_0= ruleDeclaration )
            // InternalDrn.g:4358:5: lv_declarations_3_0= ruleDeclaration
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

            // InternalDrn.g:4375:3: (otherlv_4= ';' ( (lv_declarations_5_0= ruleDeclaration ) ) )*
            loop64:
            do {
                int alt64=2;
                int LA64_0 = input.LA(1);

                if ( (LA64_0==15) ) {
                    alt64=1;
                }


                switch (alt64) {
            	case 1 :
            	    // InternalDrn.g:4376:4: otherlv_4= ';' ( (lv_declarations_5_0= ruleDeclaration ) )
            	    {
            	    otherlv_4=(Token)match(input,15,FOLLOW_34); 

            	    				newLeafNode(otherlv_4, grammarAccess.getDeviceAccess().getSemicolonKeyword_4_0());
            	    			
            	    // InternalDrn.g:4380:4: ( (lv_declarations_5_0= ruleDeclaration ) )
            	    // InternalDrn.g:4381:5: (lv_declarations_5_0= ruleDeclaration )
            	    {
            	    // InternalDrn.g:4381:5: (lv_declarations_5_0= ruleDeclaration )
            	    // InternalDrn.g:4382:6: lv_declarations_5_0= ruleDeclaration
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
            	    break loop64;
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
    // InternalDrn.g:4408:1: entryRuleDeclaration returns [EObject current=null] : iv_ruleDeclaration= ruleDeclaration EOF ;
    public final EObject entryRuleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaration = null;


        try {
            // InternalDrn.g:4408:52: (iv_ruleDeclaration= ruleDeclaration EOF )
            // InternalDrn.g:4409:2: iv_ruleDeclaration= ruleDeclaration EOF
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
    // InternalDrn.g:4415:1: ruleDeclaration returns [EObject current=null] : (otherlv_0= 'type' ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;


        	enterRule();

        try {
            // InternalDrn.g:4421:2: ( (otherlv_0= 'type' ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) ) )
            // InternalDrn.g:4422:2: (otherlv_0= 'type' ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) )
            {
            // InternalDrn.g:4422:2: (otherlv_0= 'type' ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) )
            // InternalDrn.g:4423:3: otherlv_0= 'type' ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,56,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getDeclarationAccess().getTypeKeyword_0());
            		
            // InternalDrn.g:4427:3: ( (otherlv_1= RULE_ID ) )
            // InternalDrn.g:4428:4: (otherlv_1= RULE_ID )
            {
            // InternalDrn.g:4428:4: (otherlv_1= RULE_ID )
            // InternalDrn.g:4429:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDeclarationRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(otherlv_1, grammarAccess.getDeclarationAccess().getTypeTypeGenericCrossReference_1_0());
            				

            }


            }

            // InternalDrn.g:4440:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalDrn.g:4441:4: (lv_name_2_0= RULE_ID )
            {
            // InternalDrn.g:4441:4: (lv_name_2_0= RULE_ID )
            // InternalDrn.g:4442:5: lv_name_2_0= RULE_ID
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
    // InternalDrn.g:4462:1: entryRuleDefinition returns [EObject current=null] : iv_ruleDefinition= ruleDefinition EOF ;
    public final EObject entryRuleDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefinition = null;


        try {
            // InternalDrn.g:4462:51: (iv_ruleDefinition= ruleDefinition EOF )
            // InternalDrn.g:4463:2: iv_ruleDefinition= ruleDefinition EOF
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
    // InternalDrn.g:4469:1: ruleDefinition returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalDrn.g:4475:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (otherlv_2= RULE_ID ) ) ) )
            // InternalDrn.g:4476:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (otherlv_2= RULE_ID ) ) )
            {
            // InternalDrn.g:4476:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (otherlv_2= RULE_ID ) ) )
            // InternalDrn.g:4477:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (otherlv_2= RULE_ID ) )
            {
            // InternalDrn.g:4477:3: ( (otherlv_0= RULE_ID ) )
            // InternalDrn.g:4478:4: (otherlv_0= RULE_ID )
            {
            // InternalDrn.g:4478:4: (otherlv_0= RULE_ID )
            // InternalDrn.g:4479:5: otherlv_0= RULE_ID
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
            		
            // InternalDrn.g:4494:3: ( (otherlv_2= RULE_ID ) )
            // InternalDrn.g:4495:4: (otherlv_2= RULE_ID )
            {
            // InternalDrn.g:4495:4: (otherlv_2= RULE_ID )
            // InternalDrn.g:4496:5: otherlv_2= RULE_ID
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
    // InternalDrn.g:4511:1: entryRuleWith returns [EObject current=null] : iv_ruleWith= ruleWith EOF ;
    public final EObject entryRuleWith() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWith = null;


        try {
            // InternalDrn.g:4511:45: (iv_ruleWith= ruleWith EOF )
            // InternalDrn.g:4512:2: iv_ruleWith= ruleWith EOF
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
    // InternalDrn.g:4518:1: ruleWith returns [EObject current=null] : ( ( (lv_name_0_0= 'with' ) ) ( (lv_option_1_0= ruleOption ) ) (otherlv_2= ',' ( (lv_option_3_0= ruleOption ) ) )* ) ;
    public final EObject ruleWith() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_2=null;
        EObject lv_option_1_0 = null;

        EObject lv_option_3_0 = null;



        	enterRule();

        try {
            // InternalDrn.g:4524:2: ( ( ( (lv_name_0_0= 'with' ) ) ( (lv_option_1_0= ruleOption ) ) (otherlv_2= ',' ( (lv_option_3_0= ruleOption ) ) )* ) )
            // InternalDrn.g:4525:2: ( ( (lv_name_0_0= 'with' ) ) ( (lv_option_1_0= ruleOption ) ) (otherlv_2= ',' ( (lv_option_3_0= ruleOption ) ) )* )
            {
            // InternalDrn.g:4525:2: ( ( (lv_name_0_0= 'with' ) ) ( (lv_option_1_0= ruleOption ) ) (otherlv_2= ',' ( (lv_option_3_0= ruleOption ) ) )* )
            // InternalDrn.g:4526:3: ( (lv_name_0_0= 'with' ) ) ( (lv_option_1_0= ruleOption ) ) (otherlv_2= ',' ( (lv_option_3_0= ruleOption ) ) )*
            {
            // InternalDrn.g:4526:3: ( (lv_name_0_0= 'with' ) )
            // InternalDrn.g:4527:4: (lv_name_0_0= 'with' )
            {
            // InternalDrn.g:4527:4: (lv_name_0_0= 'with' )
            // InternalDrn.g:4528:5: lv_name_0_0= 'with'
            {
            lv_name_0_0=(Token)match(input,57,FOLLOW_36); 

            					newLeafNode(lv_name_0_0, grammarAccess.getWithAccess().getNameWithKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getWithRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "with");
            				

            }


            }

            // InternalDrn.g:4540:3: ( (lv_option_1_0= ruleOption ) )
            // InternalDrn.g:4541:4: (lv_option_1_0= ruleOption )
            {
            // InternalDrn.g:4541:4: (lv_option_1_0= ruleOption )
            // InternalDrn.g:4542:5: lv_option_1_0= ruleOption
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

            // InternalDrn.g:4559:3: (otherlv_2= ',' ( (lv_option_3_0= ruleOption ) ) )*
            loop65:
            do {
                int alt65=2;
                int LA65_0 = input.LA(1);

                if ( (LA65_0==26) ) {
                    alt65=1;
                }


                switch (alt65) {
            	case 1 :
            	    // InternalDrn.g:4560:4: otherlv_2= ',' ( (lv_option_3_0= ruleOption ) )
            	    {
            	    otherlv_2=(Token)match(input,26,FOLLOW_36); 

            	    				newLeafNode(otherlv_2, grammarAccess.getWithAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalDrn.g:4564:4: ( (lv_option_3_0= ruleOption ) )
            	    // InternalDrn.g:4565:5: (lv_option_3_0= ruleOption )
            	    {
            	    // InternalDrn.g:4565:5: (lv_option_3_0= ruleOption )
            	    // InternalDrn.g:4566:6: lv_option_3_0= ruleOption
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
            	    break loop65;
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
    // InternalDrn.g:4588:1: entryRuleOption returns [EObject current=null] : iv_ruleOption= ruleOption EOF ;
    public final EObject entryRuleOption() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOption = null;


        try {
            // InternalDrn.g:4588:47: (iv_ruleOption= ruleOption EOF )
            // InternalDrn.g:4589:2: iv_ruleOption= ruleOption EOF
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
    // InternalDrn.g:4595:1: ruleOption returns [EObject current=null] : (this_Led_Impl_0= ruleLed_Impl | this_LedBlink_1= ruleLedBlink | this_Camera_2= ruleCamera | this_RefDevice_3= ruleRefDevice ) ;
    public final EObject ruleOption() throws RecognitionException {
        EObject current = null;

        EObject this_Led_Impl_0 = null;

        EObject this_LedBlink_1 = null;

        EObject this_Camera_2 = null;

        EObject this_RefDevice_3 = null;



        	enterRule();

        try {
            // InternalDrn.g:4601:2: ( (this_Led_Impl_0= ruleLed_Impl | this_LedBlink_1= ruleLedBlink | this_Camera_2= ruleCamera | this_RefDevice_3= ruleRefDevice ) )
            // InternalDrn.g:4602:2: (this_Led_Impl_0= ruleLed_Impl | this_LedBlink_1= ruleLedBlink | this_Camera_2= ruleCamera | this_RefDevice_3= ruleRefDevice )
            {
            // InternalDrn.g:4602:2: (this_Led_Impl_0= ruleLed_Impl | this_LedBlink_1= ruleLedBlink | this_Camera_2= ruleCamera | this_RefDevice_3= ruleRefDevice )
            int alt66=4;
            switch ( input.LA(1) ) {
            case 61:
                {
                alt66=1;
                }
                break;
            case 63:
                {
                alt66=2;
                }
                break;
            case 65:
                {
                alt66=3;
                }
                break;
            case RULE_ID:
                {
                alt66=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 66, 0, input);

                throw nvae;
            }

            switch (alt66) {
                case 1 :
                    // InternalDrn.g:4603:3: this_Led_Impl_0= ruleLed_Impl
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
                    // InternalDrn.g:4612:3: this_LedBlink_1= ruleLedBlink
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
                    // InternalDrn.g:4621:3: this_Camera_2= ruleCamera
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
                    // InternalDrn.g:4630:3: this_RefDevice_3= ruleRefDevice
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
    // InternalDrn.g:4642:1: entryRuleRefDevice returns [EObject current=null] : iv_ruleRefDevice= ruleRefDevice EOF ;
    public final EObject entryRuleRefDevice() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRefDevice = null;


        try {
            // InternalDrn.g:4642:50: (iv_ruleRefDevice= ruleRefDevice EOF )
            // InternalDrn.g:4643:2: iv_ruleRefDevice= ruleRefDevice EOF
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
    // InternalDrn.g:4649:1: ruleRefDevice returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' otherlv_2= 'mode' ( (lv_mode_3_0= ruleMode ) ) (otherlv_4= ',' ( (lv_definitions_5_0= ruleDefinition ) ) )* otherlv_6= ')' ) ;
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
            // InternalDrn.g:4655:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' otherlv_2= 'mode' ( (lv_mode_3_0= ruleMode ) ) (otherlv_4= ',' ( (lv_definitions_5_0= ruleDefinition ) ) )* otherlv_6= ')' ) )
            // InternalDrn.g:4656:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' otherlv_2= 'mode' ( (lv_mode_3_0= ruleMode ) ) (otherlv_4= ',' ( (lv_definitions_5_0= ruleDefinition ) ) )* otherlv_6= ')' )
            {
            // InternalDrn.g:4656:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' otherlv_2= 'mode' ( (lv_mode_3_0= ruleMode ) ) (otherlv_4= ',' ( (lv_definitions_5_0= ruleDefinition ) ) )* otherlv_6= ')' )
            // InternalDrn.g:4657:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' otherlv_2= 'mode' ( (lv_mode_3_0= ruleMode ) ) (otherlv_4= ',' ( (lv_definitions_5_0= ruleDefinition ) ) )* otherlv_6= ')'
            {
            // InternalDrn.g:4657:3: ( (otherlv_0= RULE_ID ) )
            // InternalDrn.g:4658:4: (otherlv_0= RULE_ID )
            {
            // InternalDrn.g:4658:4: (otherlv_0= RULE_ID )
            // InternalDrn.g:4659:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRefDeviceRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(otherlv_0, grammarAccess.getRefDeviceAccess().getDevDeviceCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,25,FOLLOW_38); 

            			newLeafNode(otherlv_1, grammarAccess.getRefDeviceAccess().getLeftParenthesisKeyword_1());
            		
            otherlv_2=(Token)match(input,58,FOLLOW_39); 

            			newLeafNode(otherlv_2, grammarAccess.getRefDeviceAccess().getModeKeyword_2());
            		
            // InternalDrn.g:4678:3: ( (lv_mode_3_0= ruleMode ) )
            // InternalDrn.g:4679:4: (lv_mode_3_0= ruleMode )
            {
            // InternalDrn.g:4679:4: (lv_mode_3_0= ruleMode )
            // InternalDrn.g:4680:5: lv_mode_3_0= ruleMode
            {

            					newCompositeNode(grammarAccess.getRefDeviceAccess().getModeModeEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_16);
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

            // InternalDrn.g:4697:3: (otherlv_4= ',' ( (lv_definitions_5_0= ruleDefinition ) ) )*
            loop67:
            do {
                int alt67=2;
                int LA67_0 = input.LA(1);

                if ( (LA67_0==26) ) {
                    alt67=1;
                }


                switch (alt67) {
            	case 1 :
            	    // InternalDrn.g:4698:4: otherlv_4= ',' ( (lv_definitions_5_0= ruleDefinition ) )
            	    {
            	    otherlv_4=(Token)match(input,26,FOLLOW_7); 

            	    				newLeafNode(otherlv_4, grammarAccess.getRefDeviceAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalDrn.g:4702:4: ( (lv_definitions_5_0= ruleDefinition ) )
            	    // InternalDrn.g:4703:5: (lv_definitions_5_0= ruleDefinition )
            	    {
            	    // InternalDrn.g:4703:5: (lv_definitions_5_0= ruleDefinition )
            	    // InternalDrn.g:4704:6: lv_definitions_5_0= ruleDefinition
            	    {

            	    						newCompositeNode(grammarAccess.getRefDeviceAccess().getDefinitionsDefinitionParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_16);
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
            	    break loop67;
                }
            } while (true);

            otherlv_6=(Token)match(input,27,FOLLOW_2); 

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
    // InternalDrn.g:4730:1: entryRuleAttribut returns [EObject current=null] : iv_ruleAttribut= ruleAttribut EOF ;
    public final EObject entryRuleAttribut() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribut = null;


        try {
            // InternalDrn.g:4730:49: (iv_ruleAttribut= ruleAttribut EOF )
            // InternalDrn.g:4731:2: iv_ruleAttribut= ruleAttribut EOF
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
    // InternalDrn.g:4737:1: ruleAttribut returns [EObject current=null] : (otherlv_0= 'attribute' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (otherlv_3= RULE_ID ) ) otherlv_4= '.' ( (otherlv_5= RULE_ID ) ) ) ;
    public final EObject ruleAttribut() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalDrn.g:4743:2: ( (otherlv_0= 'attribute' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (otherlv_3= RULE_ID ) ) otherlv_4= '.' ( (otherlv_5= RULE_ID ) ) ) )
            // InternalDrn.g:4744:2: (otherlv_0= 'attribute' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (otherlv_3= RULE_ID ) ) otherlv_4= '.' ( (otherlv_5= RULE_ID ) ) )
            {
            // InternalDrn.g:4744:2: (otherlv_0= 'attribute' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (otherlv_3= RULE_ID ) ) otherlv_4= '.' ( (otherlv_5= RULE_ID ) ) )
            // InternalDrn.g:4745:3: otherlv_0= 'attribute' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (otherlv_3= RULE_ID ) ) otherlv_4= '.' ( (otherlv_5= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,59,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getAttributAccess().getAttributeKeyword_0());
            		
            // InternalDrn.g:4749:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDrn.g:4750:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDrn.g:4750:4: (lv_name_1_0= RULE_ID )
            // InternalDrn.g:4751:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_1_0, grammarAccess.getAttributAccess().getNameIDTerminalRuleCall_1_0());
            				

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

            			newLeafNode(otherlv_2, grammarAccess.getAttributAccess().getEqualsSignKeyword_2());
            		
            // InternalDrn.g:4771:3: ( (otherlv_3= RULE_ID ) )
            // InternalDrn.g:4772:4: (otherlv_3= RULE_ID )
            {
            // InternalDrn.g:4772:4: (otherlv_3= RULE_ID )
            // InternalDrn.g:4773:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAttributRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_40); 

            					newLeafNode(otherlv_3, grammarAccess.getAttributAccess().getTypeTypeGenericCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,60,FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getAttributAccess().getFullStopKeyword_4());
            		
            // InternalDrn.g:4788:3: ( (otherlv_5= RULE_ID ) )
            // InternalDrn.g:4789:4: (otherlv_5= RULE_ID )
            {
            // InternalDrn.g:4789:4: (otherlv_5= RULE_ID )
            // InternalDrn.g:4790:5: otherlv_5= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAttributRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_5, grammarAccess.getAttributAccess().getElmtElementCrossReference_5_0());
            				

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
    // $ANTLR end "ruleAttribut"


    // $ANTLR start "entryRuleLed_Impl"
    // InternalDrn.g:4805:1: entryRuleLed_Impl returns [EObject current=null] : iv_ruleLed_Impl= ruleLed_Impl EOF ;
    public final EObject entryRuleLed_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLed_Impl = null;


        try {
            // InternalDrn.g:4805:49: (iv_ruleLed_Impl= ruleLed_Impl EOF )
            // InternalDrn.g:4806:2: iv_ruleLed_Impl= ruleLed_Impl EOF
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
    // InternalDrn.g:4812:1: ruleLed_Impl returns [EObject current=null] : ( ( (lv_name_0_0= 'led' ) ) otherlv_1= '(' otherlv_2= 'mode' otherlv_3= '=' ( (lv_mode_4_0= ruleMode ) ) otherlv_5= 'color' otherlv_6= '=' ( (lv_color_7_0= ruleColorLed ) ) otherlv_8= ')' ) ;
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
            // InternalDrn.g:4818:2: ( ( ( (lv_name_0_0= 'led' ) ) otherlv_1= '(' otherlv_2= 'mode' otherlv_3= '=' ( (lv_mode_4_0= ruleMode ) ) otherlv_5= 'color' otherlv_6= '=' ( (lv_color_7_0= ruleColorLed ) ) otherlv_8= ')' ) )
            // InternalDrn.g:4819:2: ( ( (lv_name_0_0= 'led' ) ) otherlv_1= '(' otherlv_2= 'mode' otherlv_3= '=' ( (lv_mode_4_0= ruleMode ) ) otherlv_5= 'color' otherlv_6= '=' ( (lv_color_7_0= ruleColorLed ) ) otherlv_8= ')' )
            {
            // InternalDrn.g:4819:2: ( ( (lv_name_0_0= 'led' ) ) otherlv_1= '(' otherlv_2= 'mode' otherlv_3= '=' ( (lv_mode_4_0= ruleMode ) ) otherlv_5= 'color' otherlv_6= '=' ( (lv_color_7_0= ruleColorLed ) ) otherlv_8= ')' )
            // InternalDrn.g:4820:3: ( (lv_name_0_0= 'led' ) ) otherlv_1= '(' otherlv_2= 'mode' otherlv_3= '=' ( (lv_mode_4_0= ruleMode ) ) otherlv_5= 'color' otherlv_6= '=' ( (lv_color_7_0= ruleColorLed ) ) otherlv_8= ')'
            {
            // InternalDrn.g:4820:3: ( (lv_name_0_0= 'led' ) )
            // InternalDrn.g:4821:4: (lv_name_0_0= 'led' )
            {
            // InternalDrn.g:4821:4: (lv_name_0_0= 'led' )
            // InternalDrn.g:4822:5: lv_name_0_0= 'led'
            {
            lv_name_0_0=(Token)match(input,61,FOLLOW_14); 

            					newLeafNode(lv_name_0_0, grammarAccess.getLed_ImplAccess().getNameLedKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLed_ImplRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "led");
            				

            }


            }

            otherlv_1=(Token)match(input,25,FOLLOW_38); 

            			newLeafNode(otherlv_1, grammarAccess.getLed_ImplAccess().getLeftParenthesisKeyword_1());
            		
            otherlv_2=(Token)match(input,58,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getLed_ImplAccess().getModeKeyword_2());
            		
            otherlv_3=(Token)match(input,14,FOLLOW_39); 

            			newLeafNode(otherlv_3, grammarAccess.getLed_ImplAccess().getEqualsSignKeyword_3());
            		
            // InternalDrn.g:4846:3: ( (lv_mode_4_0= ruleMode ) )
            // InternalDrn.g:4847:4: (lv_mode_4_0= ruleMode )
            {
            // InternalDrn.g:4847:4: (lv_mode_4_0= ruleMode )
            // InternalDrn.g:4848:5: lv_mode_4_0= ruleMode
            {

            					newCompositeNode(grammarAccess.getLed_ImplAccess().getModeModeEnumRuleCall_4_0());
            				
            pushFollow(FOLLOW_41);
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
            		
            otherlv_6=(Token)match(input,14,FOLLOW_42); 

            			newLeafNode(otherlv_6, grammarAccess.getLed_ImplAccess().getEqualsSignKeyword_6());
            		
            // InternalDrn.g:4873:3: ( (lv_color_7_0= ruleColorLed ) )
            // InternalDrn.g:4874:4: (lv_color_7_0= ruleColorLed )
            {
            // InternalDrn.g:4874:4: (lv_color_7_0= ruleColorLed )
            // InternalDrn.g:4875:5: lv_color_7_0= ruleColorLed
            {

            					newCompositeNode(grammarAccess.getLed_ImplAccess().getColorColorLedEnumRuleCall_7_0());
            				
            pushFollow(FOLLOW_30);
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

            otherlv_8=(Token)match(input,27,FOLLOW_2); 

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
    // InternalDrn.g:4900:1: entryRuleLedBlink returns [EObject current=null] : iv_ruleLedBlink= ruleLedBlink EOF ;
    public final EObject entryRuleLedBlink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLedBlink = null;


        try {
            // InternalDrn.g:4900:49: (iv_ruleLedBlink= ruleLedBlink EOF )
            // InternalDrn.g:4901:2: iv_ruleLedBlink= ruleLedBlink EOF
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
    // InternalDrn.g:4907:1: ruleLedBlink returns [EObject current=null] : ( ( (lv_name_0_0= 'ledBlink' ) ) otherlv_1= '(' otherlv_2= 'mode' otherlv_3= '=' ( (lv_mode_4_0= ruleMode ) ) (otherlv_5= 'color' otherlv_6= '=' ( (lv_color_7_0= ruleColorLed ) ) ) (otherlv_8= 'blink_per_sec' otherlv_9= '=' ( ( (lv_blink_per_secCST_10_0= ruleEInt ) ) | ( (otherlv_11= RULE_ID ) ) ) ) ( (lv_attributs_12_0= ruleAttribut ) )* otherlv_13= ')' ) ;
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
        Token otherlv_11=null;
        Token otherlv_13=null;
        Enumerator lv_mode_4_0 = null;

        Enumerator lv_color_7_0 = null;

        AntlrDatatypeRuleToken lv_blink_per_secCST_10_0 = null;

        EObject lv_attributs_12_0 = null;



        	enterRule();

        try {
            // InternalDrn.g:4913:2: ( ( ( (lv_name_0_0= 'ledBlink' ) ) otherlv_1= '(' otherlv_2= 'mode' otherlv_3= '=' ( (lv_mode_4_0= ruleMode ) ) (otherlv_5= 'color' otherlv_6= '=' ( (lv_color_7_0= ruleColorLed ) ) ) (otherlv_8= 'blink_per_sec' otherlv_9= '=' ( ( (lv_blink_per_secCST_10_0= ruleEInt ) ) | ( (otherlv_11= RULE_ID ) ) ) ) ( (lv_attributs_12_0= ruleAttribut ) )* otherlv_13= ')' ) )
            // InternalDrn.g:4914:2: ( ( (lv_name_0_0= 'ledBlink' ) ) otherlv_1= '(' otherlv_2= 'mode' otherlv_3= '=' ( (lv_mode_4_0= ruleMode ) ) (otherlv_5= 'color' otherlv_6= '=' ( (lv_color_7_0= ruleColorLed ) ) ) (otherlv_8= 'blink_per_sec' otherlv_9= '=' ( ( (lv_blink_per_secCST_10_0= ruleEInt ) ) | ( (otherlv_11= RULE_ID ) ) ) ) ( (lv_attributs_12_0= ruleAttribut ) )* otherlv_13= ')' )
            {
            // InternalDrn.g:4914:2: ( ( (lv_name_0_0= 'ledBlink' ) ) otherlv_1= '(' otherlv_2= 'mode' otherlv_3= '=' ( (lv_mode_4_0= ruleMode ) ) (otherlv_5= 'color' otherlv_6= '=' ( (lv_color_7_0= ruleColorLed ) ) ) (otherlv_8= 'blink_per_sec' otherlv_9= '=' ( ( (lv_blink_per_secCST_10_0= ruleEInt ) ) | ( (otherlv_11= RULE_ID ) ) ) ) ( (lv_attributs_12_0= ruleAttribut ) )* otherlv_13= ')' )
            // InternalDrn.g:4915:3: ( (lv_name_0_0= 'ledBlink' ) ) otherlv_1= '(' otherlv_2= 'mode' otherlv_3= '=' ( (lv_mode_4_0= ruleMode ) ) (otherlv_5= 'color' otherlv_6= '=' ( (lv_color_7_0= ruleColorLed ) ) ) (otherlv_8= 'blink_per_sec' otherlv_9= '=' ( ( (lv_blink_per_secCST_10_0= ruleEInt ) ) | ( (otherlv_11= RULE_ID ) ) ) ) ( (lv_attributs_12_0= ruleAttribut ) )* otherlv_13= ')'
            {
            // InternalDrn.g:4915:3: ( (lv_name_0_0= 'ledBlink' ) )
            // InternalDrn.g:4916:4: (lv_name_0_0= 'ledBlink' )
            {
            // InternalDrn.g:4916:4: (lv_name_0_0= 'ledBlink' )
            // InternalDrn.g:4917:5: lv_name_0_0= 'ledBlink'
            {
            lv_name_0_0=(Token)match(input,63,FOLLOW_14); 

            					newLeafNode(lv_name_0_0, grammarAccess.getLedBlinkAccess().getNameLedBlinkKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLedBlinkRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "ledBlink");
            				

            }


            }

            otherlv_1=(Token)match(input,25,FOLLOW_38); 

            			newLeafNode(otherlv_1, grammarAccess.getLedBlinkAccess().getLeftParenthesisKeyword_1());
            		
            otherlv_2=(Token)match(input,58,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getLedBlinkAccess().getModeKeyword_2());
            		
            otherlv_3=(Token)match(input,14,FOLLOW_39); 

            			newLeafNode(otherlv_3, grammarAccess.getLedBlinkAccess().getEqualsSignKeyword_3());
            		
            // InternalDrn.g:4941:3: ( (lv_mode_4_0= ruleMode ) )
            // InternalDrn.g:4942:4: (lv_mode_4_0= ruleMode )
            {
            // InternalDrn.g:4942:4: (lv_mode_4_0= ruleMode )
            // InternalDrn.g:4943:5: lv_mode_4_0= ruleMode
            {

            					newCompositeNode(grammarAccess.getLedBlinkAccess().getModeModeEnumRuleCall_4_0());
            				
            pushFollow(FOLLOW_41);
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

            // InternalDrn.g:4960:3: (otherlv_5= 'color' otherlv_6= '=' ( (lv_color_7_0= ruleColorLed ) ) )
            // InternalDrn.g:4961:4: otherlv_5= 'color' otherlv_6= '=' ( (lv_color_7_0= ruleColorLed ) )
            {
            otherlv_5=(Token)match(input,62,FOLLOW_6); 

            				newLeafNode(otherlv_5, grammarAccess.getLedBlinkAccess().getColorKeyword_5_0());
            			
            otherlv_6=(Token)match(input,14,FOLLOW_42); 

            				newLeafNode(otherlv_6, grammarAccess.getLedBlinkAccess().getEqualsSignKeyword_5_1());
            			
            // InternalDrn.g:4969:4: ( (lv_color_7_0= ruleColorLed ) )
            // InternalDrn.g:4970:5: (lv_color_7_0= ruleColorLed )
            {
            // InternalDrn.g:4970:5: (lv_color_7_0= ruleColorLed )
            // InternalDrn.g:4971:6: lv_color_7_0= ruleColorLed
            {

            						newCompositeNode(grammarAccess.getLedBlinkAccess().getColorColorLedEnumRuleCall_5_2_0());
            					
            pushFollow(FOLLOW_43);
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

            // InternalDrn.g:4989:3: (otherlv_8= 'blink_per_sec' otherlv_9= '=' ( ( (lv_blink_per_secCST_10_0= ruleEInt ) ) | ( (otherlv_11= RULE_ID ) ) ) )
            // InternalDrn.g:4990:4: otherlv_8= 'blink_per_sec' otherlv_9= '=' ( ( (lv_blink_per_secCST_10_0= ruleEInt ) ) | ( (otherlv_11= RULE_ID ) ) )
            {
            otherlv_8=(Token)match(input,64,FOLLOW_6); 

            				newLeafNode(otherlv_8, grammarAccess.getLedBlinkAccess().getBlink_per_secKeyword_6_0());
            			
            otherlv_9=(Token)match(input,14,FOLLOW_20); 

            				newLeafNode(otherlv_9, grammarAccess.getLedBlinkAccess().getEqualsSignKeyword_6_1());
            			
            // InternalDrn.g:4998:4: ( ( (lv_blink_per_secCST_10_0= ruleEInt ) ) | ( (otherlv_11= RULE_ID ) ) )
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==RULE_INT||LA68_0==68) ) {
                alt68=1;
            }
            else if ( (LA68_0==RULE_ID) ) {
                alt68=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 68, 0, input);

                throw nvae;
            }
            switch (alt68) {
                case 1 :
                    // InternalDrn.g:4999:5: ( (lv_blink_per_secCST_10_0= ruleEInt ) )
                    {
                    // InternalDrn.g:4999:5: ( (lv_blink_per_secCST_10_0= ruleEInt ) )
                    // InternalDrn.g:5000:6: (lv_blink_per_secCST_10_0= ruleEInt )
                    {
                    // InternalDrn.g:5000:6: (lv_blink_per_secCST_10_0= ruleEInt )
                    // InternalDrn.g:5001:7: lv_blink_per_secCST_10_0= ruleEInt
                    {

                    							newCompositeNode(grammarAccess.getLedBlinkAccess().getBlink_per_secCSTEIntParserRuleCall_6_2_0_0());
                    						
                    pushFollow(FOLLOW_44);
                    lv_blink_per_secCST_10_0=ruleEInt();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getLedBlinkRule());
                    							}
                    							set(
                    								current,
                    								"blink_per_secCST",
                    								lv_blink_per_secCST_10_0,
                    								"sar.drone.Drn.EInt");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDrn.g:5019:5: ( (otherlv_11= RULE_ID ) )
                    {
                    // InternalDrn.g:5019:5: ( (otherlv_11= RULE_ID ) )
                    // InternalDrn.g:5020:6: (otherlv_11= RULE_ID )
                    {
                    // InternalDrn.g:5020:6: (otherlv_11= RULE_ID )
                    // InternalDrn.g:5021:7: otherlv_11= RULE_ID
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getLedBlinkRule());
                    							}
                    						
                    otherlv_11=(Token)match(input,RULE_ID,FOLLOW_44); 

                    							newLeafNode(otherlv_11, grammarAccess.getLedBlinkAccess().getBlink_per_secVARParametreCrossReference_6_2_1_0());
                    						

                    }


                    }


                    }
                    break;

            }


            }

            // InternalDrn.g:5034:3: ( (lv_attributs_12_0= ruleAttribut ) )*
            loop69:
            do {
                int alt69=2;
                int LA69_0 = input.LA(1);

                if ( (LA69_0==59) ) {
                    alt69=1;
                }


                switch (alt69) {
            	case 1 :
            	    // InternalDrn.g:5035:4: (lv_attributs_12_0= ruleAttribut )
            	    {
            	    // InternalDrn.g:5035:4: (lv_attributs_12_0= ruleAttribut )
            	    // InternalDrn.g:5036:5: lv_attributs_12_0= ruleAttribut
            	    {

            	    					newCompositeNode(grammarAccess.getLedBlinkAccess().getAttributsAttributParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_44);
            	    lv_attributs_12_0=ruleAttribut();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getLedBlinkRule());
            	    					}
            	    					add(
            	    						current,
            	    						"attributs",
            	    						lv_attributs_12_0,
            	    						"sar.drone.Drn.Attribut");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop69;
                }
            } while (true);

            otherlv_13=(Token)match(input,27,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getLedBlinkAccess().getRightParenthesisKeyword_8());
            		

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
    // InternalDrn.g:5061:1: entryRuleCamera returns [EObject current=null] : iv_ruleCamera= ruleCamera EOF ;
    public final EObject entryRuleCamera() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCamera = null;


        try {
            // InternalDrn.g:5061:47: (iv_ruleCamera= ruleCamera EOF )
            // InternalDrn.g:5062:2: iv_ruleCamera= ruleCamera EOF
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
    // InternalDrn.g:5068:1: ruleCamera returns [EObject current=null] : ( ( (lv_name_0_0= 'camera' ) ) otherlv_1= '(' otherlv_2= 'mode' otherlv_3= '=' ( (lv_mode_4_0= ruleMode ) ) ( (lv_attributs_5_0= ruleAttribut ) )* otherlv_6= ')' ) ;
    public final EObject ruleCamera() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        Enumerator lv_mode_4_0 = null;

        EObject lv_attributs_5_0 = null;



        	enterRule();

        try {
            // InternalDrn.g:5074:2: ( ( ( (lv_name_0_0= 'camera' ) ) otherlv_1= '(' otherlv_2= 'mode' otherlv_3= '=' ( (lv_mode_4_0= ruleMode ) ) ( (lv_attributs_5_0= ruleAttribut ) )* otherlv_6= ')' ) )
            // InternalDrn.g:5075:2: ( ( (lv_name_0_0= 'camera' ) ) otherlv_1= '(' otherlv_2= 'mode' otherlv_3= '=' ( (lv_mode_4_0= ruleMode ) ) ( (lv_attributs_5_0= ruleAttribut ) )* otherlv_6= ')' )
            {
            // InternalDrn.g:5075:2: ( ( (lv_name_0_0= 'camera' ) ) otherlv_1= '(' otherlv_2= 'mode' otherlv_3= '=' ( (lv_mode_4_0= ruleMode ) ) ( (lv_attributs_5_0= ruleAttribut ) )* otherlv_6= ')' )
            // InternalDrn.g:5076:3: ( (lv_name_0_0= 'camera' ) ) otherlv_1= '(' otherlv_2= 'mode' otherlv_3= '=' ( (lv_mode_4_0= ruleMode ) ) ( (lv_attributs_5_0= ruleAttribut ) )* otherlv_6= ')'
            {
            // InternalDrn.g:5076:3: ( (lv_name_0_0= 'camera' ) )
            // InternalDrn.g:5077:4: (lv_name_0_0= 'camera' )
            {
            // InternalDrn.g:5077:4: (lv_name_0_0= 'camera' )
            // InternalDrn.g:5078:5: lv_name_0_0= 'camera'
            {
            lv_name_0_0=(Token)match(input,65,FOLLOW_14); 

            					newLeafNode(lv_name_0_0, grammarAccess.getCameraAccess().getNameCameraKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCameraRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "camera");
            				

            }


            }

            otherlv_1=(Token)match(input,25,FOLLOW_38); 

            			newLeafNode(otherlv_1, grammarAccess.getCameraAccess().getLeftParenthesisKeyword_1());
            		
            otherlv_2=(Token)match(input,58,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getCameraAccess().getModeKeyword_2());
            		
            otherlv_3=(Token)match(input,14,FOLLOW_39); 

            			newLeafNode(otherlv_3, grammarAccess.getCameraAccess().getEqualsSignKeyword_3());
            		
            // InternalDrn.g:5102:3: ( (lv_mode_4_0= ruleMode ) )
            // InternalDrn.g:5103:4: (lv_mode_4_0= ruleMode )
            {
            // InternalDrn.g:5103:4: (lv_mode_4_0= ruleMode )
            // InternalDrn.g:5104:5: lv_mode_4_0= ruleMode
            {

            					newCompositeNode(grammarAccess.getCameraAccess().getModeModeEnumRuleCall_4_0());
            				
            pushFollow(FOLLOW_44);
            lv_mode_4_0=ruleMode();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCameraRule());
            					}
            					set(
            						current,
            						"mode",
            						lv_mode_4_0,
            						"sar.drone.Drn.Mode");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDrn.g:5121:3: ( (lv_attributs_5_0= ruleAttribut ) )*
            loop70:
            do {
                int alt70=2;
                int LA70_0 = input.LA(1);

                if ( (LA70_0==59) ) {
                    alt70=1;
                }


                switch (alt70) {
            	case 1 :
            	    // InternalDrn.g:5122:4: (lv_attributs_5_0= ruleAttribut )
            	    {
            	    // InternalDrn.g:5122:4: (lv_attributs_5_0= ruleAttribut )
            	    // InternalDrn.g:5123:5: lv_attributs_5_0= ruleAttribut
            	    {

            	    					newCompositeNode(grammarAccess.getCameraAccess().getAttributsAttributParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_44);
            	    lv_attributs_5_0=ruleAttribut();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getCameraRule());
            	    					}
            	    					add(
            	    						current,
            	    						"attributs",
            	    						lv_attributs_5_0,
            	    						"sar.drone.Drn.Attribut");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop70;
                }
            } while (true);

            otherlv_6=(Token)match(input,27,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getCameraAccess().getRightParenthesisKeyword_6());
            		

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
    // InternalDrn.g:5148:1: entryRuleTypeGeneric returns [EObject current=null] : iv_ruleTypeGeneric= ruleTypeGeneric EOF ;
    public final EObject entryRuleTypeGeneric() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeGeneric = null;


        try {
            // InternalDrn.g:5148:52: (iv_ruleTypeGeneric= ruleTypeGeneric EOF )
            // InternalDrn.g:5149:2: iv_ruleTypeGeneric= ruleTypeGeneric EOF
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
    // InternalDrn.g:5155:1: ruleTypeGeneric returns [EObject current=null] : (otherlv_0= 'Type' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleElement ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleElement ) ) )* otherlv_6= '}' ) ;
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
            // InternalDrn.g:5161:2: ( (otherlv_0= 'Type' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleElement ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleElement ) ) )* otherlv_6= '}' ) )
            // InternalDrn.g:5162:2: (otherlv_0= 'Type' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleElement ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleElement ) ) )* otherlv_6= '}' )
            {
            // InternalDrn.g:5162:2: (otherlv_0= 'Type' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleElement ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleElement ) ) )* otherlv_6= '}' )
            // InternalDrn.g:5163:3: otherlv_0= 'Type' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleElement ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleElement ) ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,66,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getTypeGenericAccess().getTypeKeyword_0());
            		
            // InternalDrn.g:5167:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDrn.g:5168:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDrn.g:5168:4: (lv_name_1_0= RULE_ID )
            // InternalDrn.g:5169:5: lv_name_1_0= RULE_ID
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
            		
            // InternalDrn.g:5189:3: ( (lv_elements_3_0= ruleElement ) )
            // InternalDrn.g:5190:4: (lv_elements_3_0= ruleElement )
            {
            // InternalDrn.g:5190:4: (lv_elements_3_0= ruleElement )
            // InternalDrn.g:5191:5: lv_elements_3_0= ruleElement
            {

            					newCompositeNode(grammarAccess.getTypeGenericAccess().getElementsElementParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_46);
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

            // InternalDrn.g:5208:3: (otherlv_4= ',' ( (lv_elements_5_0= ruleElement ) ) )*
            loop71:
            do {
                int alt71=2;
                int LA71_0 = input.LA(1);

                if ( (LA71_0==26) ) {
                    alt71=1;
                }


                switch (alt71) {
            	case 1 :
            	    // InternalDrn.g:5209:4: otherlv_4= ',' ( (lv_elements_5_0= ruleElement ) )
            	    {
            	    otherlv_4=(Token)match(input,26,FOLLOW_45); 

            	    				newLeafNode(otherlv_4, grammarAccess.getTypeGenericAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalDrn.g:5213:4: ( (lv_elements_5_0= ruleElement ) )
            	    // InternalDrn.g:5214:5: (lv_elements_5_0= ruleElement )
            	    {
            	    // InternalDrn.g:5214:5: (lv_elements_5_0= ruleElement )
            	    // InternalDrn.g:5215:6: lv_elements_5_0= ruleElement
            	    {

            	    						newCompositeNode(grammarAccess.getTypeGenericAccess().getElementsElementParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_46);
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
            	    break loop71;
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
    // InternalDrn.g:5241:1: entryRuleElement returns [EObject current=null] : iv_ruleElement= ruleElement EOF ;
    public final EObject entryRuleElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElement = null;


        try {
            // InternalDrn.g:5241:48: (iv_ruleElement= ruleElement EOF )
            // InternalDrn.g:5242:2: iv_ruleElement= ruleElement EOF
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
    // InternalDrn.g:5248:1: ruleElement returns [EObject current=null] : (otherlv_0= 'element' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalDrn.g:5254:2: ( (otherlv_0= 'element' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalDrn.g:5255:2: (otherlv_0= 'element' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalDrn.g:5255:2: (otherlv_0= 'element' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalDrn.g:5256:3: otherlv_0= 'element' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,67,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getElementAccess().getElementKeyword_0());
            		
            // InternalDrn.g:5260:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDrn.g:5261:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDrn.g:5261:4: (lv_name_1_0= RULE_ID )
            // InternalDrn.g:5262:5: lv_name_1_0= RULE_ID
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
    // InternalDrn.g:5282:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalDrn.g:5282:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalDrn.g:5283:2: iv_ruleEInt= ruleEInt EOF
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
    // InternalDrn.g:5289:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalDrn.g:5295:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalDrn.g:5296:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalDrn.g:5296:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalDrn.g:5297:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalDrn.g:5297:3: (kw= '-' )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==68) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // InternalDrn.g:5298:4: kw= '-'
                    {
                    kw=(Token)match(input,68,FOLLOW_47); 

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
    // InternalDrn.g:5315:1: ruleColorLed returns [Enumerator current=null] : ( (enumLiteral_0= 'BLUE' ) | (enumLiteral_1= 'RED' ) | (enumLiteral_2= 'YELLOW' ) | (enumLiteral_3= 'GREEN' ) | (enumLiteral_4= 'WHITE' ) ) ;
    public final Enumerator ruleColorLed() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalDrn.g:5321:2: ( ( (enumLiteral_0= 'BLUE' ) | (enumLiteral_1= 'RED' ) | (enumLiteral_2= 'YELLOW' ) | (enumLiteral_3= 'GREEN' ) | (enumLiteral_4= 'WHITE' ) ) )
            // InternalDrn.g:5322:2: ( (enumLiteral_0= 'BLUE' ) | (enumLiteral_1= 'RED' ) | (enumLiteral_2= 'YELLOW' ) | (enumLiteral_3= 'GREEN' ) | (enumLiteral_4= 'WHITE' ) )
            {
            // InternalDrn.g:5322:2: ( (enumLiteral_0= 'BLUE' ) | (enumLiteral_1= 'RED' ) | (enumLiteral_2= 'YELLOW' ) | (enumLiteral_3= 'GREEN' ) | (enumLiteral_4= 'WHITE' ) )
            int alt73=5;
            switch ( input.LA(1) ) {
            case 69:
                {
                alt73=1;
                }
                break;
            case 70:
                {
                alt73=2;
                }
                break;
            case 71:
                {
                alt73=3;
                }
                break;
            case 72:
                {
                alt73=4;
                }
                break;
            case 73:
                {
                alt73=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 73, 0, input);

                throw nvae;
            }

            switch (alt73) {
                case 1 :
                    // InternalDrn.g:5323:3: (enumLiteral_0= 'BLUE' )
                    {
                    // InternalDrn.g:5323:3: (enumLiteral_0= 'BLUE' )
                    // InternalDrn.g:5324:4: enumLiteral_0= 'BLUE'
                    {
                    enumLiteral_0=(Token)match(input,69,FOLLOW_2); 

                    				current = grammarAccess.getColorLedAccess().getBLUEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getColorLedAccess().getBLUEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDrn.g:5331:3: (enumLiteral_1= 'RED' )
                    {
                    // InternalDrn.g:5331:3: (enumLiteral_1= 'RED' )
                    // InternalDrn.g:5332:4: enumLiteral_1= 'RED'
                    {
                    enumLiteral_1=(Token)match(input,70,FOLLOW_2); 

                    				current = grammarAccess.getColorLedAccess().getREDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getColorLedAccess().getREDEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalDrn.g:5339:3: (enumLiteral_2= 'YELLOW' )
                    {
                    // InternalDrn.g:5339:3: (enumLiteral_2= 'YELLOW' )
                    // InternalDrn.g:5340:4: enumLiteral_2= 'YELLOW'
                    {
                    enumLiteral_2=(Token)match(input,71,FOLLOW_2); 

                    				current = grammarAccess.getColorLedAccess().getYELLOWEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getColorLedAccess().getYELLOWEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalDrn.g:5347:3: (enumLiteral_3= 'GREEN' )
                    {
                    // InternalDrn.g:5347:3: (enumLiteral_3= 'GREEN' )
                    // InternalDrn.g:5348:4: enumLiteral_3= 'GREEN'
                    {
                    enumLiteral_3=(Token)match(input,72,FOLLOW_2); 

                    				current = grammarAccess.getColorLedAccess().getGREENEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getColorLedAccess().getGREENEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalDrn.g:5355:3: (enumLiteral_4= 'WHITE' )
                    {
                    // InternalDrn.g:5355:3: (enumLiteral_4= 'WHITE' )
                    // InternalDrn.g:5356:4: enumLiteral_4= 'WHITE'
                    {
                    enumLiteral_4=(Token)match(input,73,FOLLOW_2); 

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
    // InternalDrn.g:5366:1: ruleMode returns [Enumerator current=null] : ( (enumLiteral_0= 'OFF' ) | (enumLiteral_1= 'ON' ) ) ;
    public final Enumerator ruleMode() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalDrn.g:5372:2: ( ( (enumLiteral_0= 'OFF' ) | (enumLiteral_1= 'ON' ) ) )
            // InternalDrn.g:5373:2: ( (enumLiteral_0= 'OFF' ) | (enumLiteral_1= 'ON' ) )
            {
            // InternalDrn.g:5373:2: ( (enumLiteral_0= 'OFF' ) | (enumLiteral_1= 'ON' ) )
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==74) ) {
                alt74=1;
            }
            else if ( (LA74_0==75) ) {
                alt74=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 74, 0, input);

                throw nvae;
            }
            switch (alt74) {
                case 1 :
                    // InternalDrn.g:5374:3: (enumLiteral_0= 'OFF' )
                    {
                    // InternalDrn.g:5374:3: (enumLiteral_0= 'OFF' )
                    // InternalDrn.g:5375:4: enumLiteral_0= 'OFF'
                    {
                    enumLiteral_0=(Token)match(input,74,FOLLOW_2); 

                    				current = grammarAccess.getModeAccess().getOFFEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getModeAccess().getOFFEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDrn.g:5382:3: (enumLiteral_1= 'ON' )
                    {
                    // InternalDrn.g:5382:3: (enumLiteral_1= 'ON' )
                    // InternalDrn.g:5383:4: enumLiteral_1= 'ON'
                    {
                    enumLiteral_1=(Token)match(input,75,FOLLOW_2); 

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


    // $ANTLR start "ruleDirectionType"
    // InternalDrn.g:5393:1: ruleDirectionType returns [Enumerator current=null] : ( (enumLiteral_0= 'FRONT' ) | (enumLiteral_1= 'BEHIND' ) | (enumLiteral_2= 'LEFT' ) | (enumLiteral_3= 'RIGHT' ) ) ;
    public final Enumerator ruleDirectionType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalDrn.g:5399:2: ( ( (enumLiteral_0= 'FRONT' ) | (enumLiteral_1= 'BEHIND' ) | (enumLiteral_2= 'LEFT' ) | (enumLiteral_3= 'RIGHT' ) ) )
            // InternalDrn.g:5400:2: ( (enumLiteral_0= 'FRONT' ) | (enumLiteral_1= 'BEHIND' ) | (enumLiteral_2= 'LEFT' ) | (enumLiteral_3= 'RIGHT' ) )
            {
            // InternalDrn.g:5400:2: ( (enumLiteral_0= 'FRONT' ) | (enumLiteral_1= 'BEHIND' ) | (enumLiteral_2= 'LEFT' ) | (enumLiteral_3= 'RIGHT' ) )
            int alt75=4;
            switch ( input.LA(1) ) {
            case 76:
                {
                alt75=1;
                }
                break;
            case 77:
                {
                alt75=2;
                }
                break;
            case 78:
                {
                alt75=3;
                }
                break;
            case 79:
                {
                alt75=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 75, 0, input);

                throw nvae;
            }

            switch (alt75) {
                case 1 :
                    // InternalDrn.g:5401:3: (enumLiteral_0= 'FRONT' )
                    {
                    // InternalDrn.g:5401:3: (enumLiteral_0= 'FRONT' )
                    // InternalDrn.g:5402:4: enumLiteral_0= 'FRONT'
                    {
                    enumLiteral_0=(Token)match(input,76,FOLLOW_2); 

                    				current = grammarAccess.getDirectionTypeAccess().getFRONTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getDirectionTypeAccess().getFRONTEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDrn.g:5409:3: (enumLiteral_1= 'BEHIND' )
                    {
                    // InternalDrn.g:5409:3: (enumLiteral_1= 'BEHIND' )
                    // InternalDrn.g:5410:4: enumLiteral_1= 'BEHIND'
                    {
                    enumLiteral_1=(Token)match(input,77,FOLLOW_2); 

                    				current = grammarAccess.getDirectionTypeAccess().getBEHINDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getDirectionTypeAccess().getBEHINDEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalDrn.g:5417:3: (enumLiteral_2= 'LEFT' )
                    {
                    // InternalDrn.g:5417:3: (enumLiteral_2= 'LEFT' )
                    // InternalDrn.g:5418:4: enumLiteral_2= 'LEFT'
                    {
                    enumLiteral_2=(Token)match(input,78,FOLLOW_2); 

                    				current = grammarAccess.getDirectionTypeAccess().getLEFTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getDirectionTypeAccess().getLEFTEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalDrn.g:5425:3: (enumLiteral_3= 'RIGHT' )
                    {
                    // InternalDrn.g:5425:3: (enumLiteral_3= 'RIGHT' )
                    // InternalDrn.g:5426:4: enumLiteral_3= 'RIGHT'
                    {
                    enumLiteral_3=(Token)match(input,79,FOLLOW_2); 

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
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0080000000020010L,0x0000000000000004L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0080000000022010L,0x0000000000000004L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000001FC0000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000001FD0000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000000L,0x000000000000F000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000020L,0x0000000000000010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000008000010L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0077F5FCC2000010L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0077F5FCC2010010L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0200000010000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000030L,0x0000000000000010L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0077F5FCC0000010L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000028000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000008000020L,0x0000000000000010L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x000485FC80000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0xA000000000000010L,0x0000000000000002L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000000000L,0x00000000000003E0L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0800000008000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000004010000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000000020L});

}