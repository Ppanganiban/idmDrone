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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'MODEL'", "'{'", "'start'", "'='", "';'", "'}'", "'CONTEXT'", "'vmax'", "'hmax'", "'('", "','", "')'", "'X'", "'then'", "'merge'", "'forward'", "'distance'", "'temps'", "'backward'", "'left'", "'right'", "'up'", "'down'", "'depXY'", "'cercleXY'", "'rayon'", "'carreXY'", "'cote'", "'depYZ'", "'cercleYZ'", "'carreYZ'", "'depXZ'", "'depXYZ'", "'flip'", "'rotate'", "'angle'", "'wait'", "'takeoff'", "'land'", "'with'", "'led'", "'color'", "'ledBlink'", "'blink_per_sec'", "'cameraFront'", "'mode='", "'cameraBottom'", "'-'", "'BLUE'", "'RED'", "'YELLOW'", "'GREEN'", "'WHITE'", "'OFF'", "'ON'"
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
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
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
    // InternalDrn.g:72:1: ruleModel returns [EObject current=null] : (otherlv_0= 'MODEL' otherlv_1= '{' ( (lv_context_2_0= ruleContext ) )? ( (lv_assignement_3_0= ruleAssignement ) ) ( (lv_assignement_4_0= ruleAssignement ) )* otherlv_5= 'start' otherlv_6= '=' ( (lv_main_7_0= ruleRefPart ) ) otherlv_8= ';' otherlv_9= '}' ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_context_2_0 = null;

        EObject lv_assignement_3_0 = null;

        EObject lv_assignement_4_0 = null;

        EObject lv_main_7_0 = null;



        	enterRule();

        try {
            // InternalDrn.g:78:2: ( (otherlv_0= 'MODEL' otherlv_1= '{' ( (lv_context_2_0= ruleContext ) )? ( (lv_assignement_3_0= ruleAssignement ) ) ( (lv_assignement_4_0= ruleAssignement ) )* otherlv_5= 'start' otherlv_6= '=' ( (lv_main_7_0= ruleRefPart ) ) otherlv_8= ';' otherlv_9= '}' ) )
            // InternalDrn.g:79:2: (otherlv_0= 'MODEL' otherlv_1= '{' ( (lv_context_2_0= ruleContext ) )? ( (lv_assignement_3_0= ruleAssignement ) ) ( (lv_assignement_4_0= ruleAssignement ) )* otherlv_5= 'start' otherlv_6= '=' ( (lv_main_7_0= ruleRefPart ) ) otherlv_8= ';' otherlv_9= '}' )
            {
            // InternalDrn.g:79:2: (otherlv_0= 'MODEL' otherlv_1= '{' ( (lv_context_2_0= ruleContext ) )? ( (lv_assignement_3_0= ruleAssignement ) ) ( (lv_assignement_4_0= ruleAssignement ) )* otherlv_5= 'start' otherlv_6= '=' ( (lv_main_7_0= ruleRefPart ) ) otherlv_8= ';' otherlv_9= '}' )
            // InternalDrn.g:80:3: otherlv_0= 'MODEL' otherlv_1= '{' ( (lv_context_2_0= ruleContext ) )? ( (lv_assignement_3_0= ruleAssignement ) ) ( (lv_assignement_4_0= ruleAssignement ) )* otherlv_5= 'start' otherlv_6= '=' ( (lv_main_7_0= ruleRefPart ) ) otherlv_8= ';' otherlv_9= '}'
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

            // InternalDrn.g:107:3: ( (lv_assignement_3_0= ruleAssignement ) )
            // InternalDrn.g:108:4: (lv_assignement_3_0= ruleAssignement )
            {
            // InternalDrn.g:108:4: (lv_assignement_3_0= ruleAssignement )
            // InternalDrn.g:109:5: lv_assignement_3_0= ruleAssignement
            {

            					newCompositeNode(grammarAccess.getModelAccess().getAssignementAssignementParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_5);
            lv_assignement_3_0=ruleAssignement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModelRule());
            					}
            					add(
            						current,
            						"assignement",
            						lv_assignement_3_0,
            						"sar.drone.Drn.Assignement");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDrn.g:126:3: ( (lv_assignement_4_0= ruleAssignement ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalDrn.g:127:4: (lv_assignement_4_0= ruleAssignement )
            	    {
            	    // InternalDrn.g:127:4: (lv_assignement_4_0= ruleAssignement )
            	    // InternalDrn.g:128:5: lv_assignement_4_0= ruleAssignement
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getAssignementAssignementParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_assignement_4_0=ruleAssignement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"assignement",
            	    						lv_assignement_4_0,
            	    						"sar.drone.Drn.Assignement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_5=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_5, grammarAccess.getModelAccess().getStartKeyword_5());
            		
            otherlv_6=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_6, grammarAccess.getModelAccess().getEqualsSignKeyword_6());
            		
            // InternalDrn.g:153:3: ( (lv_main_7_0= ruleRefPart ) )
            // InternalDrn.g:154:4: (lv_main_7_0= ruleRefPart )
            {
            // InternalDrn.g:154:4: (lv_main_7_0= ruleRefPart )
            // InternalDrn.g:155:5: lv_main_7_0= ruleRefPart
            {

            					newCompositeNode(grammarAccess.getModelAccess().getMainRefPartParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_8);
            lv_main_7_0=ruleRefPart();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModelRule());
            					}
            					set(
            						current,
            						"main",
            						lv_main_7_0,
            						"sar.drone.Drn.RefPart");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_8, grammarAccess.getModelAccess().getSemicolonKeyword_8());
            		
            otherlv_9=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getModelAccess().getRightCurlyBracketKeyword_9());
            		

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
    // InternalDrn.g:184:1: entryRuleContext returns [EObject current=null] : iv_ruleContext= ruleContext EOF ;
    public final EObject entryRuleContext() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContext = null;


        try {
            // InternalDrn.g:184:48: (iv_ruleContext= ruleContext EOF )
            // InternalDrn.g:185:2: iv_ruleContext= ruleContext EOF
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
    // InternalDrn.g:191:1: ruleContext returns [EObject current=null] : (otherlv_0= 'CONTEXT' otherlv_1= '{' ( (lv_limit_2_0= ruleLimit ) ) otherlv_3= ';' ( ( (lv_limit_4_0= ruleLimit ) ) otherlv_5= ';' )* otherlv_6= '}' ) ;
    public final EObject ruleContext() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        EObject lv_limit_2_0 = null;

        EObject lv_limit_4_0 = null;



        	enterRule();

        try {
            // InternalDrn.g:197:2: ( (otherlv_0= 'CONTEXT' otherlv_1= '{' ( (lv_limit_2_0= ruleLimit ) ) otherlv_3= ';' ( ( (lv_limit_4_0= ruleLimit ) ) otherlv_5= ';' )* otherlv_6= '}' ) )
            // InternalDrn.g:198:2: (otherlv_0= 'CONTEXT' otherlv_1= '{' ( (lv_limit_2_0= ruleLimit ) ) otherlv_3= ';' ( ( (lv_limit_4_0= ruleLimit ) ) otherlv_5= ';' )* otherlv_6= '}' )
            {
            // InternalDrn.g:198:2: (otherlv_0= 'CONTEXT' otherlv_1= '{' ( (lv_limit_2_0= ruleLimit ) ) otherlv_3= ';' ( ( (lv_limit_4_0= ruleLimit ) ) otherlv_5= ';' )* otherlv_6= '}' )
            // InternalDrn.g:199:3: otherlv_0= 'CONTEXT' otherlv_1= '{' ( (lv_limit_2_0= ruleLimit ) ) otherlv_3= ';' ( ( (lv_limit_4_0= ruleLimit ) ) otherlv_5= ';' )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getContextAccess().getCONTEXTKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getContextAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalDrn.g:207:3: ( (lv_limit_2_0= ruleLimit ) )
            // InternalDrn.g:208:4: (lv_limit_2_0= ruleLimit )
            {
            // InternalDrn.g:208:4: (lv_limit_2_0= ruleLimit )
            // InternalDrn.g:209:5: lv_limit_2_0= ruleLimit
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
            		
            // InternalDrn.g:230:3: ( ( (lv_limit_4_0= ruleLimit ) ) otherlv_5= ';' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=18 && LA3_0<=19)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalDrn.g:231:4: ( (lv_limit_4_0= ruleLimit ) ) otherlv_5= ';'
            	    {
            	    // InternalDrn.g:231:4: ( (lv_limit_4_0= ruleLimit ) )
            	    // InternalDrn.g:232:5: (lv_limit_4_0= ruleLimit )
            	    {
            	    // InternalDrn.g:232:5: (lv_limit_4_0= ruleLimit )
            	    // InternalDrn.g:233:6: lv_limit_4_0= ruleLimit
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
            	    break loop3;
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
    // InternalDrn.g:263:1: entryRuleLimit returns [EObject current=null] : iv_ruleLimit= ruleLimit EOF ;
    public final EObject entryRuleLimit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLimit = null;


        try {
            // InternalDrn.g:263:46: (iv_ruleLimit= ruleLimit EOF )
            // InternalDrn.g:264:2: iv_ruleLimit= ruleLimit EOF
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
    // InternalDrn.g:270:1: ruleLimit returns [EObject current=null] : (this_Vmax_0= ruleVmax | this_Hmax_1= ruleHmax ) ;
    public final EObject ruleLimit() throws RecognitionException {
        EObject current = null;

        EObject this_Vmax_0 = null;

        EObject this_Hmax_1 = null;



        	enterRule();

        try {
            // InternalDrn.g:276:2: ( (this_Vmax_0= ruleVmax | this_Hmax_1= ruleHmax ) )
            // InternalDrn.g:277:2: (this_Vmax_0= ruleVmax | this_Hmax_1= ruleHmax )
            {
            // InternalDrn.g:277:2: (this_Vmax_0= ruleVmax | this_Hmax_1= ruleHmax )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==18) ) {
                alt4=1;
            }
            else if ( (LA4_0==19) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalDrn.g:278:3: this_Vmax_0= ruleVmax
                    {

                    			newCompositeNode(grammarAccess.getLimitAccess().getVmaxParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Vmax_0=ruleVmax();

                    state._fsp--;


                    			current = this_Vmax_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDrn.g:287:3: this_Hmax_1= ruleHmax
                    {

                    			newCompositeNode(grammarAccess.getLimitAccess().getHmaxParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Hmax_1=ruleHmax();

                    state._fsp--;


                    			current = this_Hmax_1;
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


    // $ANTLR start "entryRuleVmax"
    // InternalDrn.g:299:1: entryRuleVmax returns [EObject current=null] : iv_ruleVmax= ruleVmax EOF ;
    public final EObject entryRuleVmax() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVmax = null;


        try {
            // InternalDrn.g:299:45: (iv_ruleVmax= ruleVmax EOF )
            // InternalDrn.g:300:2: iv_ruleVmax= ruleVmax EOF
            {
             newCompositeNode(grammarAccess.getVmaxRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVmax=ruleVmax();

            state._fsp--;

             current =iv_ruleVmax; 
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
    // $ANTLR end "entryRuleVmax"


    // $ANTLR start "ruleVmax"
    // InternalDrn.g:306:1: ruleVmax returns [EObject current=null] : ( ( (lv_name_0_0= 'vmax' ) ) otherlv_1= '=' ( (lv_value_2_0= ruleEInt ) ) ) ;
    public final EObject ruleVmax() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalDrn.g:312:2: ( ( ( (lv_name_0_0= 'vmax' ) ) otherlv_1= '=' ( (lv_value_2_0= ruleEInt ) ) ) )
            // InternalDrn.g:313:2: ( ( (lv_name_0_0= 'vmax' ) ) otherlv_1= '=' ( (lv_value_2_0= ruleEInt ) ) )
            {
            // InternalDrn.g:313:2: ( ( (lv_name_0_0= 'vmax' ) ) otherlv_1= '=' ( (lv_value_2_0= ruleEInt ) ) )
            // InternalDrn.g:314:3: ( (lv_name_0_0= 'vmax' ) ) otherlv_1= '=' ( (lv_value_2_0= ruleEInt ) )
            {
            // InternalDrn.g:314:3: ( (lv_name_0_0= 'vmax' ) )
            // InternalDrn.g:315:4: (lv_name_0_0= 'vmax' )
            {
            // InternalDrn.g:315:4: (lv_name_0_0= 'vmax' )
            // InternalDrn.g:316:5: lv_name_0_0= 'vmax'
            {
            lv_name_0_0=(Token)match(input,18,FOLLOW_6); 

            					newLeafNode(lv_name_0_0, grammarAccess.getVmaxAccess().getNameVmaxKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVmaxRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "vmax");
            				

            }


            }

            otherlv_1=(Token)match(input,14,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getVmaxAccess().getEqualsSignKeyword_1());
            		
            // InternalDrn.g:332:3: ( (lv_value_2_0= ruleEInt ) )
            // InternalDrn.g:333:4: (lv_value_2_0= ruleEInt )
            {
            // InternalDrn.g:333:4: (lv_value_2_0= ruleEInt )
            // InternalDrn.g:334:5: lv_value_2_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getVmaxAccess().getValueEIntParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_2_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVmaxRule());
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
    // $ANTLR end "ruleVmax"


    // $ANTLR start "entryRuleHmax"
    // InternalDrn.g:355:1: entryRuleHmax returns [EObject current=null] : iv_ruleHmax= ruleHmax EOF ;
    public final EObject entryRuleHmax() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHmax = null;


        try {
            // InternalDrn.g:355:45: (iv_ruleHmax= ruleHmax EOF )
            // InternalDrn.g:356:2: iv_ruleHmax= ruleHmax EOF
            {
             newCompositeNode(grammarAccess.getHmaxRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleHmax=ruleHmax();

            state._fsp--;

             current =iv_ruleHmax; 
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
    // $ANTLR end "entryRuleHmax"


    // $ANTLR start "ruleHmax"
    // InternalDrn.g:362:1: ruleHmax returns [EObject current=null] : ( ( (lv_name_0_0= 'hmax' ) ) otherlv_1= '=' ( (lv_value_2_0= ruleEInt ) ) ) ;
    public final EObject ruleHmax() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalDrn.g:368:2: ( ( ( (lv_name_0_0= 'hmax' ) ) otherlv_1= '=' ( (lv_value_2_0= ruleEInt ) ) ) )
            // InternalDrn.g:369:2: ( ( (lv_name_0_0= 'hmax' ) ) otherlv_1= '=' ( (lv_value_2_0= ruleEInt ) ) )
            {
            // InternalDrn.g:369:2: ( ( (lv_name_0_0= 'hmax' ) ) otherlv_1= '=' ( (lv_value_2_0= ruleEInt ) ) )
            // InternalDrn.g:370:3: ( (lv_name_0_0= 'hmax' ) ) otherlv_1= '=' ( (lv_value_2_0= ruleEInt ) )
            {
            // InternalDrn.g:370:3: ( (lv_name_0_0= 'hmax' ) )
            // InternalDrn.g:371:4: (lv_name_0_0= 'hmax' )
            {
            // InternalDrn.g:371:4: (lv_name_0_0= 'hmax' )
            // InternalDrn.g:372:5: lv_name_0_0= 'hmax'
            {
            lv_name_0_0=(Token)match(input,19,FOLLOW_6); 

            					newLeafNode(lv_name_0_0, grammarAccess.getHmaxAccess().getNameHmaxKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getHmaxRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "hmax");
            				

            }


            }

            otherlv_1=(Token)match(input,14,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getHmaxAccess().getEqualsSignKeyword_1());
            		
            // InternalDrn.g:388:3: ( (lv_value_2_0= ruleEInt ) )
            // InternalDrn.g:389:4: (lv_value_2_0= ruleEInt )
            {
            // InternalDrn.g:389:4: (lv_value_2_0= ruleEInt )
            // InternalDrn.g:390:5: lv_value_2_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getHmaxAccess().getValueEIntParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_2_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getHmaxRule());
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
    // $ANTLR end "ruleHmax"


    // $ANTLR start "entryRuleAssignement"
    // InternalDrn.g:411:1: entryRuleAssignement returns [EObject current=null] : iv_ruleAssignement= ruleAssignement EOF ;
    public final EObject entryRuleAssignement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignement = null;


        try {
            // InternalDrn.g:411:52: (iv_ruleAssignement= ruleAssignement EOF )
            // InternalDrn.g:412:2: iv_ruleAssignement= ruleAssignement EOF
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
    // InternalDrn.g:418:1: ruleAssignement returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_parametre_2_0= ruleParametre ) ) (otherlv_3= ',' ( (lv_parametre_4_0= ruleParametre ) ) )* )? otherlv_5= ')' otherlv_6= '{' ( (lv_operandes_7_0= ruleExpression ) ) otherlv_8= ';' ( ( (lv_operandes_9_0= ruleExpression ) ) otherlv_10= ';' )* otherlv_11= '}' ) ;
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
            // InternalDrn.g:424:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_parametre_2_0= ruleParametre ) ) (otherlv_3= ',' ( (lv_parametre_4_0= ruleParametre ) ) )* )? otherlv_5= ')' otherlv_6= '{' ( (lv_operandes_7_0= ruleExpression ) ) otherlv_8= ';' ( ( (lv_operandes_9_0= ruleExpression ) ) otherlv_10= ';' )* otherlv_11= '}' ) )
            // InternalDrn.g:425:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_parametre_2_0= ruleParametre ) ) (otherlv_3= ',' ( (lv_parametre_4_0= ruleParametre ) ) )* )? otherlv_5= ')' otherlv_6= '{' ( (lv_operandes_7_0= ruleExpression ) ) otherlv_8= ';' ( ( (lv_operandes_9_0= ruleExpression ) ) otherlv_10= ';' )* otherlv_11= '}' )
            {
            // InternalDrn.g:425:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_parametre_2_0= ruleParametre ) ) (otherlv_3= ',' ( (lv_parametre_4_0= ruleParametre ) ) )* )? otherlv_5= ')' otherlv_6= '{' ( (lv_operandes_7_0= ruleExpression ) ) otherlv_8= ';' ( ( (lv_operandes_9_0= ruleExpression ) ) otherlv_10= ';' )* otherlv_11= '}' )
            // InternalDrn.g:426:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_parametre_2_0= ruleParametre ) ) (otherlv_3= ',' ( (lv_parametre_4_0= ruleParametre ) ) )* )? otherlv_5= ')' otherlv_6= '{' ( (lv_operandes_7_0= ruleExpression ) ) otherlv_8= ';' ( ( (lv_operandes_9_0= ruleExpression ) ) otherlv_10= ';' )* otherlv_11= '}'
            {
            // InternalDrn.g:426:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalDrn.g:427:4: (lv_name_0_0= RULE_ID )
            {
            // InternalDrn.g:427:4: (lv_name_0_0= RULE_ID )
            // InternalDrn.g:428:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_13); 

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

            otherlv_1=(Token)match(input,20,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getAssignementAccess().getLeftParenthesisKeyword_1());
            		
            // InternalDrn.g:448:3: ( ( (lv_parametre_2_0= ruleParametre ) ) (otherlv_3= ',' ( (lv_parametre_4_0= ruleParametre ) ) )* )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalDrn.g:449:4: ( (lv_parametre_2_0= ruleParametre ) ) (otherlv_3= ',' ( (lv_parametre_4_0= ruleParametre ) ) )*
                    {
                    // InternalDrn.g:449:4: ( (lv_parametre_2_0= ruleParametre ) )
                    // InternalDrn.g:450:5: (lv_parametre_2_0= ruleParametre )
                    {
                    // InternalDrn.g:450:5: (lv_parametre_2_0= ruleParametre )
                    // InternalDrn.g:451:6: lv_parametre_2_0= ruleParametre
                    {

                    						newCompositeNode(grammarAccess.getAssignementAccess().getParametreParametreParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_15);
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

                    // InternalDrn.g:468:4: (otherlv_3= ',' ( (lv_parametre_4_0= ruleParametre ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==21) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalDrn.g:469:5: otherlv_3= ',' ( (lv_parametre_4_0= ruleParametre ) )
                    	    {
                    	    otherlv_3=(Token)match(input,21,FOLLOW_7); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getAssignementAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalDrn.g:473:5: ( (lv_parametre_4_0= ruleParametre ) )
                    	    // InternalDrn.g:474:6: (lv_parametre_4_0= ruleParametre )
                    	    {
                    	    // InternalDrn.g:474:6: (lv_parametre_4_0= ruleParametre )
                    	    // InternalDrn.g:475:7: lv_parametre_4_0= ruleParametre
                    	    {

                    	    							newCompositeNode(grammarAccess.getAssignementAccess().getParametreParametreParserRuleCall_2_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_15);
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
                    	    break loop5;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getAssignementAccess().getRightParenthesisKeyword_3());
            		
            otherlv_6=(Token)match(input,12,FOLLOW_16); 

            			newLeafNode(otherlv_6, grammarAccess.getAssignementAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalDrn.g:502:3: ( (lv_operandes_7_0= ruleExpression ) )
            // InternalDrn.g:503:4: (lv_operandes_7_0= ruleExpression )
            {
            // InternalDrn.g:503:4: (lv_operandes_7_0= ruleExpression )
            // InternalDrn.g:504:5: lv_operandes_7_0= ruleExpression
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

            otherlv_8=(Token)match(input,15,FOLLOW_17); 

            			newLeafNode(otherlv_8, grammarAccess.getAssignementAccess().getSemicolonKeyword_6());
            		
            // InternalDrn.g:525:3: ( ( (lv_operandes_9_0= ruleExpression ) ) otherlv_10= ';' )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID||LA7_0==20||(LA7_0>=25 && LA7_0<=26)||(LA7_0>=29 && LA7_0<=35)||LA7_0==37||(LA7_0>=39 && LA7_0<=45)||(LA7_0>=47 && LA7_0<=49)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalDrn.g:526:4: ( (lv_operandes_9_0= ruleExpression ) ) otherlv_10= ';'
            	    {
            	    // InternalDrn.g:526:4: ( (lv_operandes_9_0= ruleExpression ) )
            	    // InternalDrn.g:527:5: (lv_operandes_9_0= ruleExpression )
            	    {
            	    // InternalDrn.g:527:5: (lv_operandes_9_0= ruleExpression )
            	    // InternalDrn.g:528:6: lv_operandes_9_0= ruleExpression
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

            	    otherlv_10=(Token)match(input,15,FOLLOW_17); 

            	    				newLeafNode(otherlv_10, grammarAccess.getAssignementAccess().getSemicolonKeyword_7_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop7;
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
    // InternalDrn.g:558:1: entryRuleParametre returns [EObject current=null] : iv_ruleParametre= ruleParametre EOF ;
    public final EObject entryRuleParametre() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParametre = null;


        try {
            // InternalDrn.g:558:50: (iv_ruleParametre= ruleParametre EOF )
            // InternalDrn.g:559:2: iv_ruleParametre= ruleParametre EOF
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
    // InternalDrn.g:565:1: ruleParametre returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleParametre() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalDrn.g:571:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalDrn.g:572:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalDrn.g:572:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalDrn.g:573:3: (lv_name_0_0= RULE_ID )
            {
            // InternalDrn.g:573:3: (lv_name_0_0= RULE_ID )
            // InternalDrn.g:574:4: lv_name_0_0= RULE_ID
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
    // InternalDrn.g:593:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalDrn.g:593:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalDrn.g:594:2: iv_ruleExpression= ruleExpression EOF
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
    // InternalDrn.g:600:1: ruleExpression returns [EObject current=null] : ( ( (this_And_0= ruleAnd | this_RefPart_1= ruleRefPart | this_DepX_Impl_2= ruleDepX_Impl | this_DepY_Impl_3= ruleDepY_Impl | this_DepZ_Impl_4= ruleDepZ_Impl | this_DepXY_IMPL_5= ruleDepXY_IMPL | this_DepXZ_IMPL_6= ruleDepXZ_IMPL | this_DepYZ_IMPL_7= ruleDepYZ_IMPL | this_DepXYZ_IMPL_8= ruleDepXYZ_IMPL | this_TakeOff_9= ruleTakeOff | this_Wait_10= ruleWait | this_Rotate_11= ruleRotate | this_Land_12= ruleLand ) (otherlv_13= 'X' ( ( (lv_repeatCST_14_0= ruleEInt ) ) | ( (otherlv_15= RULE_ID ) ) ) )? ( (lv_with_16_0= ruleWith ) )? ) | (otherlv_17= '(' (this_And_18= ruleAnd | this_RefPart_19= ruleRefPart | this_DepX_Impl_20= ruleDepX_Impl | this_DepY_Impl_21= ruleDepY_Impl | this_DepZ_Impl_22= ruleDepZ_Impl | this_DepXY_IMPL_23= ruleDepXY_IMPL | this_DepXZ_IMPL_24= ruleDepXZ_IMPL | this_DepYZ_IMPL_25= ruleDepYZ_IMPL | this_DepXYZ_IMPL_26= ruleDepXYZ_IMPL | this_TakeOff_27= ruleTakeOff | this_Wait_28= ruleWait | this_Rotate_29= ruleRotate | this_Land_30= ruleLand ) (otherlv_31= 'then' ( (lv_then_32_0= ruleExpression ) ) ) (otherlv_33= 'then' ( (lv_then_34_0= ruleExpression ) ) )* otherlv_35= ')' (otherlv_36= 'X' ( ( (lv_repeatCST_37_0= ruleEInt ) ) | ( (otherlv_38= RULE_ID ) ) ) )? ( (lv_with_39_0= ruleWith ) )? ) ) ;
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
            // InternalDrn.g:606:2: ( ( ( (this_And_0= ruleAnd | this_RefPart_1= ruleRefPart | this_DepX_Impl_2= ruleDepX_Impl | this_DepY_Impl_3= ruleDepY_Impl | this_DepZ_Impl_4= ruleDepZ_Impl | this_DepXY_IMPL_5= ruleDepXY_IMPL | this_DepXZ_IMPL_6= ruleDepXZ_IMPL | this_DepYZ_IMPL_7= ruleDepYZ_IMPL | this_DepXYZ_IMPL_8= ruleDepXYZ_IMPL | this_TakeOff_9= ruleTakeOff | this_Wait_10= ruleWait | this_Rotate_11= ruleRotate | this_Land_12= ruleLand ) (otherlv_13= 'X' ( ( (lv_repeatCST_14_0= ruleEInt ) ) | ( (otherlv_15= RULE_ID ) ) ) )? ( (lv_with_16_0= ruleWith ) )? ) | (otherlv_17= '(' (this_And_18= ruleAnd | this_RefPart_19= ruleRefPart | this_DepX_Impl_20= ruleDepX_Impl | this_DepY_Impl_21= ruleDepY_Impl | this_DepZ_Impl_22= ruleDepZ_Impl | this_DepXY_IMPL_23= ruleDepXY_IMPL | this_DepXZ_IMPL_24= ruleDepXZ_IMPL | this_DepYZ_IMPL_25= ruleDepYZ_IMPL | this_DepXYZ_IMPL_26= ruleDepXYZ_IMPL | this_TakeOff_27= ruleTakeOff | this_Wait_28= ruleWait | this_Rotate_29= ruleRotate | this_Land_30= ruleLand ) (otherlv_31= 'then' ( (lv_then_32_0= ruleExpression ) ) ) (otherlv_33= 'then' ( (lv_then_34_0= ruleExpression ) ) )* otherlv_35= ')' (otherlv_36= 'X' ( ( (lv_repeatCST_37_0= ruleEInt ) ) | ( (otherlv_38= RULE_ID ) ) ) )? ( (lv_with_39_0= ruleWith ) )? ) ) )
            // InternalDrn.g:607:2: ( ( (this_And_0= ruleAnd | this_RefPart_1= ruleRefPart | this_DepX_Impl_2= ruleDepX_Impl | this_DepY_Impl_3= ruleDepY_Impl | this_DepZ_Impl_4= ruleDepZ_Impl | this_DepXY_IMPL_5= ruleDepXY_IMPL | this_DepXZ_IMPL_6= ruleDepXZ_IMPL | this_DepYZ_IMPL_7= ruleDepYZ_IMPL | this_DepXYZ_IMPL_8= ruleDepXYZ_IMPL | this_TakeOff_9= ruleTakeOff | this_Wait_10= ruleWait | this_Rotate_11= ruleRotate | this_Land_12= ruleLand ) (otherlv_13= 'X' ( ( (lv_repeatCST_14_0= ruleEInt ) ) | ( (otherlv_15= RULE_ID ) ) ) )? ( (lv_with_16_0= ruleWith ) )? ) | (otherlv_17= '(' (this_And_18= ruleAnd | this_RefPart_19= ruleRefPart | this_DepX_Impl_20= ruleDepX_Impl | this_DepY_Impl_21= ruleDepY_Impl | this_DepZ_Impl_22= ruleDepZ_Impl | this_DepXY_IMPL_23= ruleDepXY_IMPL | this_DepXZ_IMPL_24= ruleDepXZ_IMPL | this_DepYZ_IMPL_25= ruleDepYZ_IMPL | this_DepXYZ_IMPL_26= ruleDepXYZ_IMPL | this_TakeOff_27= ruleTakeOff | this_Wait_28= ruleWait | this_Rotate_29= ruleRotate | this_Land_30= ruleLand ) (otherlv_31= 'then' ( (lv_then_32_0= ruleExpression ) ) ) (otherlv_33= 'then' ( (lv_then_34_0= ruleExpression ) ) )* otherlv_35= ')' (otherlv_36= 'X' ( ( (lv_repeatCST_37_0= ruleEInt ) ) | ( (otherlv_38= RULE_ID ) ) ) )? ( (lv_with_39_0= ruleWith ) )? ) )
            {
            // InternalDrn.g:607:2: ( ( (this_And_0= ruleAnd | this_RefPart_1= ruleRefPart | this_DepX_Impl_2= ruleDepX_Impl | this_DepY_Impl_3= ruleDepY_Impl | this_DepZ_Impl_4= ruleDepZ_Impl | this_DepXY_IMPL_5= ruleDepXY_IMPL | this_DepXZ_IMPL_6= ruleDepXZ_IMPL | this_DepYZ_IMPL_7= ruleDepYZ_IMPL | this_DepXYZ_IMPL_8= ruleDepXYZ_IMPL | this_TakeOff_9= ruleTakeOff | this_Wait_10= ruleWait | this_Rotate_11= ruleRotate | this_Land_12= ruleLand ) (otherlv_13= 'X' ( ( (lv_repeatCST_14_0= ruleEInt ) ) | ( (otherlv_15= RULE_ID ) ) ) )? ( (lv_with_16_0= ruleWith ) )? ) | (otherlv_17= '(' (this_And_18= ruleAnd | this_RefPart_19= ruleRefPart | this_DepX_Impl_20= ruleDepX_Impl | this_DepY_Impl_21= ruleDepY_Impl | this_DepZ_Impl_22= ruleDepZ_Impl | this_DepXY_IMPL_23= ruleDepXY_IMPL | this_DepXZ_IMPL_24= ruleDepXZ_IMPL | this_DepYZ_IMPL_25= ruleDepYZ_IMPL | this_DepXYZ_IMPL_26= ruleDepXYZ_IMPL | this_TakeOff_27= ruleTakeOff | this_Wait_28= ruleWait | this_Rotate_29= ruleRotate | this_Land_30= ruleLand ) (otherlv_31= 'then' ( (lv_then_32_0= ruleExpression ) ) ) (otherlv_33= 'then' ( (lv_then_34_0= ruleExpression ) ) )* otherlv_35= ')' (otherlv_36= 'X' ( ( (lv_repeatCST_37_0= ruleEInt ) ) | ( (otherlv_38= RULE_ID ) ) ) )? ( (lv_with_39_0= ruleWith ) )? ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_ID||(LA17_0>=25 && LA17_0<=26)||(LA17_0>=29 && LA17_0<=35)||LA17_0==37||(LA17_0>=39 && LA17_0<=45)||(LA17_0>=47 && LA17_0<=49)) ) {
                alt17=1;
            }
            else if ( (LA17_0==20) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalDrn.g:608:3: ( (this_And_0= ruleAnd | this_RefPart_1= ruleRefPart | this_DepX_Impl_2= ruleDepX_Impl | this_DepY_Impl_3= ruleDepY_Impl | this_DepZ_Impl_4= ruleDepZ_Impl | this_DepXY_IMPL_5= ruleDepXY_IMPL | this_DepXZ_IMPL_6= ruleDepXZ_IMPL | this_DepYZ_IMPL_7= ruleDepYZ_IMPL | this_DepXYZ_IMPL_8= ruleDepXYZ_IMPL | this_TakeOff_9= ruleTakeOff | this_Wait_10= ruleWait | this_Rotate_11= ruleRotate | this_Land_12= ruleLand ) (otherlv_13= 'X' ( ( (lv_repeatCST_14_0= ruleEInt ) ) | ( (otherlv_15= RULE_ID ) ) ) )? ( (lv_with_16_0= ruleWith ) )? )
                    {
                    // InternalDrn.g:608:3: ( (this_And_0= ruleAnd | this_RefPart_1= ruleRefPart | this_DepX_Impl_2= ruleDepX_Impl | this_DepY_Impl_3= ruleDepY_Impl | this_DepZ_Impl_4= ruleDepZ_Impl | this_DepXY_IMPL_5= ruleDepXY_IMPL | this_DepXZ_IMPL_6= ruleDepXZ_IMPL | this_DepYZ_IMPL_7= ruleDepYZ_IMPL | this_DepXYZ_IMPL_8= ruleDepXYZ_IMPL | this_TakeOff_9= ruleTakeOff | this_Wait_10= ruleWait | this_Rotate_11= ruleRotate | this_Land_12= ruleLand ) (otherlv_13= 'X' ( ( (lv_repeatCST_14_0= ruleEInt ) ) | ( (otherlv_15= RULE_ID ) ) ) )? ( (lv_with_16_0= ruleWith ) )? )
                    // InternalDrn.g:609:4: (this_And_0= ruleAnd | this_RefPart_1= ruleRefPart | this_DepX_Impl_2= ruleDepX_Impl | this_DepY_Impl_3= ruleDepY_Impl | this_DepZ_Impl_4= ruleDepZ_Impl | this_DepXY_IMPL_5= ruleDepXY_IMPL | this_DepXZ_IMPL_6= ruleDepXZ_IMPL | this_DepYZ_IMPL_7= ruleDepYZ_IMPL | this_DepXYZ_IMPL_8= ruleDepXYZ_IMPL | this_TakeOff_9= ruleTakeOff | this_Wait_10= ruleWait | this_Rotate_11= ruleRotate | this_Land_12= ruleLand ) (otherlv_13= 'X' ( ( (lv_repeatCST_14_0= ruleEInt ) ) | ( (otherlv_15= RULE_ID ) ) ) )? ( (lv_with_16_0= ruleWith ) )?
                    {
                    // InternalDrn.g:609:4: (this_And_0= ruleAnd | this_RefPart_1= ruleRefPart | this_DepX_Impl_2= ruleDepX_Impl | this_DepY_Impl_3= ruleDepY_Impl | this_DepZ_Impl_4= ruleDepZ_Impl | this_DepXY_IMPL_5= ruleDepXY_IMPL | this_DepXZ_IMPL_6= ruleDepXZ_IMPL | this_DepYZ_IMPL_7= ruleDepYZ_IMPL | this_DepXYZ_IMPL_8= ruleDepXYZ_IMPL | this_TakeOff_9= ruleTakeOff | this_Wait_10= ruleWait | this_Rotate_11= ruleRotate | this_Land_12= ruleLand )
                    int alt8=13;
                    switch ( input.LA(1) ) {
                    case 25:
                        {
                        alt8=1;
                        }
                        break;
                    case RULE_ID:
                        {
                        alt8=2;
                        }
                        break;
                    case 30:
                    case 31:
                        {
                        alt8=3;
                        }
                        break;
                    case 26:
                    case 29:
                        {
                        alt8=4;
                        }
                        break;
                    case 32:
                    case 33:
                        {
                        alt8=5;
                        }
                        break;
                    case 34:
                    case 35:
                    case 37:
                        {
                        alt8=6;
                        }
                        break;
                    case 42:
                        {
                        alt8=7;
                        }
                        break;
                    case 39:
                    case 40:
                    case 41:
                        {
                        alt8=8;
                        }
                        break;
                    case 43:
                    case 44:
                        {
                        alt8=9;
                        }
                        break;
                    case 48:
                        {
                        alt8=10;
                        }
                        break;
                    case 47:
                        {
                        alt8=11;
                        }
                        break;
                    case 45:
                        {
                        alt8=12;
                        }
                        break;
                    case 49:
                        {
                        alt8=13;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 8, 0, input);

                        throw nvae;
                    }

                    switch (alt8) {
                        case 1 :
                            // InternalDrn.g:610:5: this_And_0= ruleAnd
                            {

                            					newCompositeNode(grammarAccess.getExpressionAccess().getAndParserRuleCall_0_0_0());
                            				
                            pushFollow(FOLLOW_18);
                            this_And_0=ruleAnd();

                            state._fsp--;


                            					current = this_And_0;
                            					afterParserOrEnumRuleCall();
                            				

                            }
                            break;
                        case 2 :
                            // InternalDrn.g:619:5: this_RefPart_1= ruleRefPart
                            {

                            					newCompositeNode(grammarAccess.getExpressionAccess().getRefPartParserRuleCall_0_0_1());
                            				
                            pushFollow(FOLLOW_18);
                            this_RefPart_1=ruleRefPart();

                            state._fsp--;


                            					current = this_RefPart_1;
                            					afterParserOrEnumRuleCall();
                            				

                            }
                            break;
                        case 3 :
                            // InternalDrn.g:628:5: this_DepX_Impl_2= ruleDepX_Impl
                            {

                            					newCompositeNode(grammarAccess.getExpressionAccess().getDepX_ImplParserRuleCall_0_0_2());
                            				
                            pushFollow(FOLLOW_18);
                            this_DepX_Impl_2=ruleDepX_Impl();

                            state._fsp--;


                            					current = this_DepX_Impl_2;
                            					afterParserOrEnumRuleCall();
                            				

                            }
                            break;
                        case 4 :
                            // InternalDrn.g:637:5: this_DepY_Impl_3= ruleDepY_Impl
                            {

                            					newCompositeNode(grammarAccess.getExpressionAccess().getDepY_ImplParserRuleCall_0_0_3());
                            				
                            pushFollow(FOLLOW_18);
                            this_DepY_Impl_3=ruleDepY_Impl();

                            state._fsp--;


                            					current = this_DepY_Impl_3;
                            					afterParserOrEnumRuleCall();
                            				

                            }
                            break;
                        case 5 :
                            // InternalDrn.g:646:5: this_DepZ_Impl_4= ruleDepZ_Impl
                            {

                            					newCompositeNode(grammarAccess.getExpressionAccess().getDepZ_ImplParserRuleCall_0_0_4());
                            				
                            pushFollow(FOLLOW_18);
                            this_DepZ_Impl_4=ruleDepZ_Impl();

                            state._fsp--;


                            					current = this_DepZ_Impl_4;
                            					afterParserOrEnumRuleCall();
                            				

                            }
                            break;
                        case 6 :
                            // InternalDrn.g:655:5: this_DepXY_IMPL_5= ruleDepXY_IMPL
                            {

                            					newCompositeNode(grammarAccess.getExpressionAccess().getDepXY_IMPLParserRuleCall_0_0_5());
                            				
                            pushFollow(FOLLOW_18);
                            this_DepXY_IMPL_5=ruleDepXY_IMPL();

                            state._fsp--;


                            					current = this_DepXY_IMPL_5;
                            					afterParserOrEnumRuleCall();
                            				

                            }
                            break;
                        case 7 :
                            // InternalDrn.g:664:5: this_DepXZ_IMPL_6= ruleDepXZ_IMPL
                            {

                            					newCompositeNode(grammarAccess.getExpressionAccess().getDepXZ_IMPLParserRuleCall_0_0_6());
                            				
                            pushFollow(FOLLOW_18);
                            this_DepXZ_IMPL_6=ruleDepXZ_IMPL();

                            state._fsp--;


                            					current = this_DepXZ_IMPL_6;
                            					afterParserOrEnumRuleCall();
                            				

                            }
                            break;
                        case 8 :
                            // InternalDrn.g:673:5: this_DepYZ_IMPL_7= ruleDepYZ_IMPL
                            {

                            					newCompositeNode(grammarAccess.getExpressionAccess().getDepYZ_IMPLParserRuleCall_0_0_7());
                            				
                            pushFollow(FOLLOW_18);
                            this_DepYZ_IMPL_7=ruleDepYZ_IMPL();

                            state._fsp--;


                            					current = this_DepYZ_IMPL_7;
                            					afterParserOrEnumRuleCall();
                            				

                            }
                            break;
                        case 9 :
                            // InternalDrn.g:682:5: this_DepXYZ_IMPL_8= ruleDepXYZ_IMPL
                            {

                            					newCompositeNode(grammarAccess.getExpressionAccess().getDepXYZ_IMPLParserRuleCall_0_0_8());
                            				
                            pushFollow(FOLLOW_18);
                            this_DepXYZ_IMPL_8=ruleDepXYZ_IMPL();

                            state._fsp--;


                            					current = this_DepXYZ_IMPL_8;
                            					afterParserOrEnumRuleCall();
                            				

                            }
                            break;
                        case 10 :
                            // InternalDrn.g:691:5: this_TakeOff_9= ruleTakeOff
                            {

                            					newCompositeNode(grammarAccess.getExpressionAccess().getTakeOffParserRuleCall_0_0_9());
                            				
                            pushFollow(FOLLOW_18);
                            this_TakeOff_9=ruleTakeOff();

                            state._fsp--;


                            					current = this_TakeOff_9;
                            					afterParserOrEnumRuleCall();
                            				

                            }
                            break;
                        case 11 :
                            // InternalDrn.g:700:5: this_Wait_10= ruleWait
                            {

                            					newCompositeNode(grammarAccess.getExpressionAccess().getWaitParserRuleCall_0_0_10());
                            				
                            pushFollow(FOLLOW_18);
                            this_Wait_10=ruleWait();

                            state._fsp--;


                            					current = this_Wait_10;
                            					afterParserOrEnumRuleCall();
                            				

                            }
                            break;
                        case 12 :
                            // InternalDrn.g:709:5: this_Rotate_11= ruleRotate
                            {

                            					newCompositeNode(grammarAccess.getExpressionAccess().getRotateParserRuleCall_0_0_11());
                            				
                            pushFollow(FOLLOW_18);
                            this_Rotate_11=ruleRotate();

                            state._fsp--;


                            					current = this_Rotate_11;
                            					afterParserOrEnumRuleCall();
                            				

                            }
                            break;
                        case 13 :
                            // InternalDrn.g:718:5: this_Land_12= ruleLand
                            {

                            					newCompositeNode(grammarAccess.getExpressionAccess().getLandParserRuleCall_0_0_12());
                            				
                            pushFollow(FOLLOW_18);
                            this_Land_12=ruleLand();

                            state._fsp--;


                            					current = this_Land_12;
                            					afterParserOrEnumRuleCall();
                            				

                            }
                            break;

                    }

                    // InternalDrn.g:727:4: (otherlv_13= 'X' ( ( (lv_repeatCST_14_0= ruleEInt ) ) | ( (otherlv_15= RULE_ID ) ) ) )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==23) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // InternalDrn.g:728:5: otherlv_13= 'X' ( ( (lv_repeatCST_14_0= ruleEInt ) ) | ( (otherlv_15= RULE_ID ) ) )
                            {
                            otherlv_13=(Token)match(input,23,FOLLOW_19); 

                            					newLeafNode(otherlv_13, grammarAccess.getExpressionAccess().getXKeyword_0_1_0());
                            				
                            // InternalDrn.g:732:5: ( ( (lv_repeatCST_14_0= ruleEInt ) ) | ( (otherlv_15= RULE_ID ) ) )
                            int alt9=2;
                            int LA9_0 = input.LA(1);

                            if ( (LA9_0==RULE_INT||LA9_0==58) ) {
                                alt9=1;
                            }
                            else if ( (LA9_0==RULE_ID) ) {
                                alt9=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 9, 0, input);

                                throw nvae;
                            }
                            switch (alt9) {
                                case 1 :
                                    // InternalDrn.g:733:6: ( (lv_repeatCST_14_0= ruleEInt ) )
                                    {
                                    // InternalDrn.g:733:6: ( (lv_repeatCST_14_0= ruleEInt ) )
                                    // InternalDrn.g:734:7: (lv_repeatCST_14_0= ruleEInt )
                                    {
                                    // InternalDrn.g:734:7: (lv_repeatCST_14_0= ruleEInt )
                                    // InternalDrn.g:735:8: lv_repeatCST_14_0= ruleEInt
                                    {

                                    								newCompositeNode(grammarAccess.getExpressionAccess().getRepeatCSTEIntParserRuleCall_0_1_1_0_0());
                                    							
                                    pushFollow(FOLLOW_20);
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
                                    // InternalDrn.g:753:6: ( (otherlv_15= RULE_ID ) )
                                    {
                                    // InternalDrn.g:753:6: ( (otherlv_15= RULE_ID ) )
                                    // InternalDrn.g:754:7: (otherlv_15= RULE_ID )
                                    {
                                    // InternalDrn.g:754:7: (otherlv_15= RULE_ID )
                                    // InternalDrn.g:755:8: otherlv_15= RULE_ID
                                    {

                                    								if (current==null) {
                                    									current = createModelElement(grammarAccess.getExpressionRule());
                                    								}
                                    							
                                    otherlv_15=(Token)match(input,RULE_ID,FOLLOW_20); 

                                    								newLeafNode(otherlv_15, grammarAccess.getExpressionAccess().getRepeatVARParametreCrossReference_0_1_1_1_0());
                                    							

                                    }


                                    }


                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    // InternalDrn.g:768:4: ( (lv_with_16_0= ruleWith ) )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==50) ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // InternalDrn.g:769:5: (lv_with_16_0= ruleWith )
                            {
                            // InternalDrn.g:769:5: (lv_with_16_0= ruleWith )
                            // InternalDrn.g:770:6: lv_with_16_0= ruleWith
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
                    // InternalDrn.g:789:3: (otherlv_17= '(' (this_And_18= ruleAnd | this_RefPart_19= ruleRefPart | this_DepX_Impl_20= ruleDepX_Impl | this_DepY_Impl_21= ruleDepY_Impl | this_DepZ_Impl_22= ruleDepZ_Impl | this_DepXY_IMPL_23= ruleDepXY_IMPL | this_DepXZ_IMPL_24= ruleDepXZ_IMPL | this_DepYZ_IMPL_25= ruleDepYZ_IMPL | this_DepXYZ_IMPL_26= ruleDepXYZ_IMPL | this_TakeOff_27= ruleTakeOff | this_Wait_28= ruleWait | this_Rotate_29= ruleRotate | this_Land_30= ruleLand ) (otherlv_31= 'then' ( (lv_then_32_0= ruleExpression ) ) ) (otherlv_33= 'then' ( (lv_then_34_0= ruleExpression ) ) )* otherlv_35= ')' (otherlv_36= 'X' ( ( (lv_repeatCST_37_0= ruleEInt ) ) | ( (otherlv_38= RULE_ID ) ) ) )? ( (lv_with_39_0= ruleWith ) )? )
                    {
                    // InternalDrn.g:789:3: (otherlv_17= '(' (this_And_18= ruleAnd | this_RefPart_19= ruleRefPart | this_DepX_Impl_20= ruleDepX_Impl | this_DepY_Impl_21= ruleDepY_Impl | this_DepZ_Impl_22= ruleDepZ_Impl | this_DepXY_IMPL_23= ruleDepXY_IMPL | this_DepXZ_IMPL_24= ruleDepXZ_IMPL | this_DepYZ_IMPL_25= ruleDepYZ_IMPL | this_DepXYZ_IMPL_26= ruleDepXYZ_IMPL | this_TakeOff_27= ruleTakeOff | this_Wait_28= ruleWait | this_Rotate_29= ruleRotate | this_Land_30= ruleLand ) (otherlv_31= 'then' ( (lv_then_32_0= ruleExpression ) ) ) (otherlv_33= 'then' ( (lv_then_34_0= ruleExpression ) ) )* otherlv_35= ')' (otherlv_36= 'X' ( ( (lv_repeatCST_37_0= ruleEInt ) ) | ( (otherlv_38= RULE_ID ) ) ) )? ( (lv_with_39_0= ruleWith ) )? )
                    // InternalDrn.g:790:4: otherlv_17= '(' (this_And_18= ruleAnd | this_RefPart_19= ruleRefPart | this_DepX_Impl_20= ruleDepX_Impl | this_DepY_Impl_21= ruleDepY_Impl | this_DepZ_Impl_22= ruleDepZ_Impl | this_DepXY_IMPL_23= ruleDepXY_IMPL | this_DepXZ_IMPL_24= ruleDepXZ_IMPL | this_DepYZ_IMPL_25= ruleDepYZ_IMPL | this_DepXYZ_IMPL_26= ruleDepXYZ_IMPL | this_TakeOff_27= ruleTakeOff | this_Wait_28= ruleWait | this_Rotate_29= ruleRotate | this_Land_30= ruleLand ) (otherlv_31= 'then' ( (lv_then_32_0= ruleExpression ) ) ) (otherlv_33= 'then' ( (lv_then_34_0= ruleExpression ) ) )* otherlv_35= ')' (otherlv_36= 'X' ( ( (lv_repeatCST_37_0= ruleEInt ) ) | ( (otherlv_38= RULE_ID ) ) ) )? ( (lv_with_39_0= ruleWith ) )?
                    {
                    otherlv_17=(Token)match(input,20,FOLLOW_21); 

                    				newLeafNode(otherlv_17, grammarAccess.getExpressionAccess().getLeftParenthesisKeyword_1_0());
                    			
                    // InternalDrn.g:794:4: (this_And_18= ruleAnd | this_RefPart_19= ruleRefPart | this_DepX_Impl_20= ruleDepX_Impl | this_DepY_Impl_21= ruleDepY_Impl | this_DepZ_Impl_22= ruleDepZ_Impl | this_DepXY_IMPL_23= ruleDepXY_IMPL | this_DepXZ_IMPL_24= ruleDepXZ_IMPL | this_DepYZ_IMPL_25= ruleDepYZ_IMPL | this_DepXYZ_IMPL_26= ruleDepXYZ_IMPL | this_TakeOff_27= ruleTakeOff | this_Wait_28= ruleWait | this_Rotate_29= ruleRotate | this_Land_30= ruleLand )
                    int alt12=13;
                    switch ( input.LA(1) ) {
                    case 25:
                        {
                        alt12=1;
                        }
                        break;
                    case RULE_ID:
                        {
                        alt12=2;
                        }
                        break;
                    case 30:
                    case 31:
                        {
                        alt12=3;
                        }
                        break;
                    case 26:
                    case 29:
                        {
                        alt12=4;
                        }
                        break;
                    case 32:
                    case 33:
                        {
                        alt12=5;
                        }
                        break;
                    case 34:
                    case 35:
                    case 37:
                        {
                        alt12=6;
                        }
                        break;
                    case 42:
                        {
                        alt12=7;
                        }
                        break;
                    case 39:
                    case 40:
                    case 41:
                        {
                        alt12=8;
                        }
                        break;
                    case 43:
                    case 44:
                        {
                        alt12=9;
                        }
                        break;
                    case 48:
                        {
                        alt12=10;
                        }
                        break;
                    case 47:
                        {
                        alt12=11;
                        }
                        break;
                    case 45:
                        {
                        alt12=12;
                        }
                        break;
                    case 49:
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
                            // InternalDrn.g:795:5: this_And_18= ruleAnd
                            {

                            					newCompositeNode(grammarAccess.getExpressionAccess().getAndParserRuleCall_1_1_0());
                            				
                            pushFollow(FOLLOW_22);
                            this_And_18=ruleAnd();

                            state._fsp--;


                            					current = this_And_18;
                            					afterParserOrEnumRuleCall();
                            				

                            }
                            break;
                        case 2 :
                            // InternalDrn.g:804:5: this_RefPart_19= ruleRefPart
                            {

                            					newCompositeNode(grammarAccess.getExpressionAccess().getRefPartParserRuleCall_1_1_1());
                            				
                            pushFollow(FOLLOW_22);
                            this_RefPart_19=ruleRefPart();

                            state._fsp--;


                            					current = this_RefPart_19;
                            					afterParserOrEnumRuleCall();
                            				

                            }
                            break;
                        case 3 :
                            // InternalDrn.g:813:5: this_DepX_Impl_20= ruleDepX_Impl
                            {

                            					newCompositeNode(grammarAccess.getExpressionAccess().getDepX_ImplParserRuleCall_1_1_2());
                            				
                            pushFollow(FOLLOW_22);
                            this_DepX_Impl_20=ruleDepX_Impl();

                            state._fsp--;


                            					current = this_DepX_Impl_20;
                            					afterParserOrEnumRuleCall();
                            				

                            }
                            break;
                        case 4 :
                            // InternalDrn.g:822:5: this_DepY_Impl_21= ruleDepY_Impl
                            {

                            					newCompositeNode(grammarAccess.getExpressionAccess().getDepY_ImplParserRuleCall_1_1_3());
                            				
                            pushFollow(FOLLOW_22);
                            this_DepY_Impl_21=ruleDepY_Impl();

                            state._fsp--;


                            					current = this_DepY_Impl_21;
                            					afterParserOrEnumRuleCall();
                            				

                            }
                            break;
                        case 5 :
                            // InternalDrn.g:831:5: this_DepZ_Impl_22= ruleDepZ_Impl
                            {

                            					newCompositeNode(grammarAccess.getExpressionAccess().getDepZ_ImplParserRuleCall_1_1_4());
                            				
                            pushFollow(FOLLOW_22);
                            this_DepZ_Impl_22=ruleDepZ_Impl();

                            state._fsp--;


                            					current = this_DepZ_Impl_22;
                            					afterParserOrEnumRuleCall();
                            				

                            }
                            break;
                        case 6 :
                            // InternalDrn.g:840:5: this_DepXY_IMPL_23= ruleDepXY_IMPL
                            {

                            					newCompositeNode(grammarAccess.getExpressionAccess().getDepXY_IMPLParserRuleCall_1_1_5());
                            				
                            pushFollow(FOLLOW_22);
                            this_DepXY_IMPL_23=ruleDepXY_IMPL();

                            state._fsp--;


                            					current = this_DepXY_IMPL_23;
                            					afterParserOrEnumRuleCall();
                            				

                            }
                            break;
                        case 7 :
                            // InternalDrn.g:849:5: this_DepXZ_IMPL_24= ruleDepXZ_IMPL
                            {

                            					newCompositeNode(grammarAccess.getExpressionAccess().getDepXZ_IMPLParserRuleCall_1_1_6());
                            				
                            pushFollow(FOLLOW_22);
                            this_DepXZ_IMPL_24=ruleDepXZ_IMPL();

                            state._fsp--;


                            					current = this_DepXZ_IMPL_24;
                            					afterParserOrEnumRuleCall();
                            				

                            }
                            break;
                        case 8 :
                            // InternalDrn.g:858:5: this_DepYZ_IMPL_25= ruleDepYZ_IMPL
                            {

                            					newCompositeNode(grammarAccess.getExpressionAccess().getDepYZ_IMPLParserRuleCall_1_1_7());
                            				
                            pushFollow(FOLLOW_22);
                            this_DepYZ_IMPL_25=ruleDepYZ_IMPL();

                            state._fsp--;


                            					current = this_DepYZ_IMPL_25;
                            					afterParserOrEnumRuleCall();
                            				

                            }
                            break;
                        case 9 :
                            // InternalDrn.g:867:5: this_DepXYZ_IMPL_26= ruleDepXYZ_IMPL
                            {

                            					newCompositeNode(grammarAccess.getExpressionAccess().getDepXYZ_IMPLParserRuleCall_1_1_8());
                            				
                            pushFollow(FOLLOW_22);
                            this_DepXYZ_IMPL_26=ruleDepXYZ_IMPL();

                            state._fsp--;


                            					current = this_DepXYZ_IMPL_26;
                            					afterParserOrEnumRuleCall();
                            				

                            }
                            break;
                        case 10 :
                            // InternalDrn.g:876:5: this_TakeOff_27= ruleTakeOff
                            {

                            					newCompositeNode(grammarAccess.getExpressionAccess().getTakeOffParserRuleCall_1_1_9());
                            				
                            pushFollow(FOLLOW_22);
                            this_TakeOff_27=ruleTakeOff();

                            state._fsp--;


                            					current = this_TakeOff_27;
                            					afterParserOrEnumRuleCall();
                            				

                            }
                            break;
                        case 11 :
                            // InternalDrn.g:885:5: this_Wait_28= ruleWait
                            {

                            					newCompositeNode(grammarAccess.getExpressionAccess().getWaitParserRuleCall_1_1_10());
                            				
                            pushFollow(FOLLOW_22);
                            this_Wait_28=ruleWait();

                            state._fsp--;


                            					current = this_Wait_28;
                            					afterParserOrEnumRuleCall();
                            				

                            }
                            break;
                        case 12 :
                            // InternalDrn.g:894:5: this_Rotate_29= ruleRotate
                            {

                            					newCompositeNode(grammarAccess.getExpressionAccess().getRotateParserRuleCall_1_1_11());
                            				
                            pushFollow(FOLLOW_22);
                            this_Rotate_29=ruleRotate();

                            state._fsp--;


                            					current = this_Rotate_29;
                            					afterParserOrEnumRuleCall();
                            				

                            }
                            break;
                        case 13 :
                            // InternalDrn.g:903:5: this_Land_30= ruleLand
                            {

                            					newCompositeNode(grammarAccess.getExpressionAccess().getLandParserRuleCall_1_1_12());
                            				
                            pushFollow(FOLLOW_22);
                            this_Land_30=ruleLand();

                            state._fsp--;


                            					current = this_Land_30;
                            					afterParserOrEnumRuleCall();
                            				

                            }
                            break;

                    }

                    // InternalDrn.g:912:4: (otherlv_31= 'then' ( (lv_then_32_0= ruleExpression ) ) )
                    // InternalDrn.g:913:5: otherlv_31= 'then' ( (lv_then_32_0= ruleExpression ) )
                    {
                    otherlv_31=(Token)match(input,24,FOLLOW_16); 

                    					newLeafNode(otherlv_31, grammarAccess.getExpressionAccess().getThenKeyword_1_2_0());
                    				
                    // InternalDrn.g:917:5: ( (lv_then_32_0= ruleExpression ) )
                    // InternalDrn.g:918:6: (lv_then_32_0= ruleExpression )
                    {
                    // InternalDrn.g:918:6: (lv_then_32_0= ruleExpression )
                    // InternalDrn.g:919:7: lv_then_32_0= ruleExpression
                    {

                    							newCompositeNode(grammarAccess.getExpressionAccess().getThenExpressionParserRuleCall_1_2_1_0());
                    						
                    pushFollow(FOLLOW_23);
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

                    // InternalDrn.g:937:4: (otherlv_33= 'then' ( (lv_then_34_0= ruleExpression ) ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==24) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalDrn.g:938:5: otherlv_33= 'then' ( (lv_then_34_0= ruleExpression ) )
                    	    {
                    	    otherlv_33=(Token)match(input,24,FOLLOW_16); 

                    	    					newLeafNode(otherlv_33, grammarAccess.getExpressionAccess().getThenKeyword_1_3_0());
                    	    				
                    	    // InternalDrn.g:942:5: ( (lv_then_34_0= ruleExpression ) )
                    	    // InternalDrn.g:943:6: (lv_then_34_0= ruleExpression )
                    	    {
                    	    // InternalDrn.g:943:6: (lv_then_34_0= ruleExpression )
                    	    // InternalDrn.g:944:7: lv_then_34_0= ruleExpression
                    	    {

                    	    							newCompositeNode(grammarAccess.getExpressionAccess().getThenExpressionParserRuleCall_1_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_23);
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
                    	    break loop13;
                        }
                    } while (true);

                    otherlv_35=(Token)match(input,22,FOLLOW_18); 

                    				newLeafNode(otherlv_35, grammarAccess.getExpressionAccess().getRightParenthesisKeyword_1_4());
                    			
                    // InternalDrn.g:966:4: (otherlv_36= 'X' ( ( (lv_repeatCST_37_0= ruleEInt ) ) | ( (otherlv_38= RULE_ID ) ) ) )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==23) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // InternalDrn.g:967:5: otherlv_36= 'X' ( ( (lv_repeatCST_37_0= ruleEInt ) ) | ( (otherlv_38= RULE_ID ) ) )
                            {
                            otherlv_36=(Token)match(input,23,FOLLOW_19); 

                            					newLeafNode(otherlv_36, grammarAccess.getExpressionAccess().getXKeyword_1_5_0());
                            				
                            // InternalDrn.g:971:5: ( ( (lv_repeatCST_37_0= ruleEInt ) ) | ( (otherlv_38= RULE_ID ) ) )
                            int alt14=2;
                            int LA14_0 = input.LA(1);

                            if ( (LA14_0==RULE_INT||LA14_0==58) ) {
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
                                    // InternalDrn.g:972:6: ( (lv_repeatCST_37_0= ruleEInt ) )
                                    {
                                    // InternalDrn.g:972:6: ( (lv_repeatCST_37_0= ruleEInt ) )
                                    // InternalDrn.g:973:7: (lv_repeatCST_37_0= ruleEInt )
                                    {
                                    // InternalDrn.g:973:7: (lv_repeatCST_37_0= ruleEInt )
                                    // InternalDrn.g:974:8: lv_repeatCST_37_0= ruleEInt
                                    {

                                    								newCompositeNode(grammarAccess.getExpressionAccess().getRepeatCSTEIntParserRuleCall_1_5_1_0_0());
                                    							
                                    pushFollow(FOLLOW_20);
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
                                    // InternalDrn.g:992:6: ( (otherlv_38= RULE_ID ) )
                                    {
                                    // InternalDrn.g:992:6: ( (otherlv_38= RULE_ID ) )
                                    // InternalDrn.g:993:7: (otherlv_38= RULE_ID )
                                    {
                                    // InternalDrn.g:993:7: (otherlv_38= RULE_ID )
                                    // InternalDrn.g:994:8: otherlv_38= RULE_ID
                                    {

                                    								if (current==null) {
                                    									current = createModelElement(grammarAccess.getExpressionRule());
                                    								}
                                    							
                                    otherlv_38=(Token)match(input,RULE_ID,FOLLOW_20); 

                                    								newLeafNode(otherlv_38, grammarAccess.getExpressionAccess().getRepeatVARParametreCrossReference_1_5_1_1_0());
                                    							

                                    }


                                    }


                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    // InternalDrn.g:1007:4: ( (lv_with_39_0= ruleWith ) )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==50) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // InternalDrn.g:1008:5: (lv_with_39_0= ruleWith )
                            {
                            // InternalDrn.g:1008:5: (lv_with_39_0= ruleWith )
                            // InternalDrn.g:1009:6: lv_with_39_0= ruleWith
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
    // InternalDrn.g:1031:1: entryRuleRefPart returns [EObject current=null] : iv_ruleRefPart= ruleRefPart EOF ;
    public final EObject entryRuleRefPart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRefPart = null;


        try {
            // InternalDrn.g:1031:48: (iv_ruleRefPart= ruleRefPart EOF )
            // InternalDrn.g:1032:2: iv_ruleRefPart= ruleRefPart EOF
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
    // InternalDrn.g:1038:1: ruleRefPart returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_params_2_0= ruleEInt ) ) otherlv_3= ',' )* otherlv_4= ')' ) ;
    public final EObject ruleRefPart() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_params_2_0 = null;



        	enterRule();

        try {
            // InternalDrn.g:1044:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_params_2_0= ruleEInt ) ) otherlv_3= ',' )* otherlv_4= ')' ) )
            // InternalDrn.g:1045:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_params_2_0= ruleEInt ) ) otherlv_3= ',' )* otherlv_4= ')' )
            {
            // InternalDrn.g:1045:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_params_2_0= ruleEInt ) ) otherlv_3= ',' )* otherlv_4= ')' )
            // InternalDrn.g:1046:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_params_2_0= ruleEInt ) ) otherlv_3= ',' )* otherlv_4= ')'
            {
            // InternalDrn.g:1046:3: ( (otherlv_0= RULE_ID ) )
            // InternalDrn.g:1047:4: (otherlv_0= RULE_ID )
            {
            // InternalDrn.g:1047:4: (otherlv_0= RULE_ID )
            // InternalDrn.g:1048:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRefPartRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(otherlv_0, grammarAccess.getRefPartAccess().getVariable_partieAssignementCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,20,FOLLOW_24); 

            			newLeafNode(otherlv_1, grammarAccess.getRefPartAccess().getLeftParenthesisKeyword_1());
            		
            // InternalDrn.g:1063:3: ( ( (lv_params_2_0= ruleEInt ) ) otherlv_3= ',' )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_INT||LA18_0==58) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalDrn.g:1064:4: ( (lv_params_2_0= ruleEInt ) ) otherlv_3= ','
            	    {
            	    // InternalDrn.g:1064:4: ( (lv_params_2_0= ruleEInt ) )
            	    // InternalDrn.g:1065:5: (lv_params_2_0= ruleEInt )
            	    {
            	    // InternalDrn.g:1065:5: (lv_params_2_0= ruleEInt )
            	    // InternalDrn.g:1066:6: lv_params_2_0= ruleEInt
            	    {

            	    						newCompositeNode(grammarAccess.getRefPartAccess().getParamsEIntParserRuleCall_2_0_0());
            	    					
            	    pushFollow(FOLLOW_25);
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

            	    otherlv_3=(Token)match(input,21,FOLLOW_24); 

            	    				newLeafNode(otherlv_3, grammarAccess.getRefPartAccess().getCommaKeyword_2_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            otherlv_4=(Token)match(input,22,FOLLOW_2); 

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
    // InternalDrn.g:1096:1: entryRuleAnd returns [EObject current=null] : iv_ruleAnd= ruleAnd EOF ;
    public final EObject entryRuleAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnd = null;


        try {
            // InternalDrn.g:1096:44: (iv_ruleAnd= ruleAnd EOF )
            // InternalDrn.g:1097:2: iv_ruleAnd= ruleAnd EOF
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
    // InternalDrn.g:1103:1: ruleAnd returns [EObject current=null] : ( () ( (lv_name_1_0= 'merge' ) ) otherlv_2= '(' ( ( (lv_rotate_3_0= ruleRotate ) ) | ( (lv_depx_4_0= ruleDepX_Impl ) ) | ( (lv_depy_5_0= ruleDepY_Impl ) ) | ( (lv_depxz_6_0= ruleDepXZ_IMPL ) ) | ( (lv_depxy_7_0= ruleDepXY_IMPL ) ) | ( (lv_depz_8_0= ruleDepZ_Impl ) ) ) otherlv_9= ',' ( ( (lv_rotate_10_0= ruleRotate ) ) | ( (lv_depx_11_0= ruleDepX_Impl ) ) | ( (lv_depy_12_0= ruleDepY_Impl ) ) | ( (lv_depxz_13_0= ruleDepXZ_IMPL ) ) | ( (lv_depxy_14_0= ruleDepXY_IMPL ) ) | ( (lv_depz_15_0= ruleDepZ_Impl ) ) ) (otherlv_16= ',' ( ( (lv_rotate_17_0= ruleRotate ) ) | ( (lv_depx_18_0= ruleDepX_Impl ) ) | ( (lv_depy_19_0= ruleDepY_Impl ) ) | ( (lv_depxz_20_0= ruleDepXZ_IMPL ) ) | ( (lv_depxy_21_0= ruleDepXY_IMPL ) ) | ( (lv_depz_22_0= ruleDepZ_Impl ) ) ) )* otherlv_23= ')' ) ;
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
            // InternalDrn.g:1109:2: ( ( () ( (lv_name_1_0= 'merge' ) ) otherlv_2= '(' ( ( (lv_rotate_3_0= ruleRotate ) ) | ( (lv_depx_4_0= ruleDepX_Impl ) ) | ( (lv_depy_5_0= ruleDepY_Impl ) ) | ( (lv_depxz_6_0= ruleDepXZ_IMPL ) ) | ( (lv_depxy_7_0= ruleDepXY_IMPL ) ) | ( (lv_depz_8_0= ruleDepZ_Impl ) ) ) otherlv_9= ',' ( ( (lv_rotate_10_0= ruleRotate ) ) | ( (lv_depx_11_0= ruleDepX_Impl ) ) | ( (lv_depy_12_0= ruleDepY_Impl ) ) | ( (lv_depxz_13_0= ruleDepXZ_IMPL ) ) | ( (lv_depxy_14_0= ruleDepXY_IMPL ) ) | ( (lv_depz_15_0= ruleDepZ_Impl ) ) ) (otherlv_16= ',' ( ( (lv_rotate_17_0= ruleRotate ) ) | ( (lv_depx_18_0= ruleDepX_Impl ) ) | ( (lv_depy_19_0= ruleDepY_Impl ) ) | ( (lv_depxz_20_0= ruleDepXZ_IMPL ) ) | ( (lv_depxy_21_0= ruleDepXY_IMPL ) ) | ( (lv_depz_22_0= ruleDepZ_Impl ) ) ) )* otherlv_23= ')' ) )
            // InternalDrn.g:1110:2: ( () ( (lv_name_1_0= 'merge' ) ) otherlv_2= '(' ( ( (lv_rotate_3_0= ruleRotate ) ) | ( (lv_depx_4_0= ruleDepX_Impl ) ) | ( (lv_depy_5_0= ruleDepY_Impl ) ) | ( (lv_depxz_6_0= ruleDepXZ_IMPL ) ) | ( (lv_depxy_7_0= ruleDepXY_IMPL ) ) | ( (lv_depz_8_0= ruleDepZ_Impl ) ) ) otherlv_9= ',' ( ( (lv_rotate_10_0= ruleRotate ) ) | ( (lv_depx_11_0= ruleDepX_Impl ) ) | ( (lv_depy_12_0= ruleDepY_Impl ) ) | ( (lv_depxz_13_0= ruleDepXZ_IMPL ) ) | ( (lv_depxy_14_0= ruleDepXY_IMPL ) ) | ( (lv_depz_15_0= ruleDepZ_Impl ) ) ) (otherlv_16= ',' ( ( (lv_rotate_17_0= ruleRotate ) ) | ( (lv_depx_18_0= ruleDepX_Impl ) ) | ( (lv_depy_19_0= ruleDepY_Impl ) ) | ( (lv_depxz_20_0= ruleDepXZ_IMPL ) ) | ( (lv_depxy_21_0= ruleDepXY_IMPL ) ) | ( (lv_depz_22_0= ruleDepZ_Impl ) ) ) )* otherlv_23= ')' )
            {
            // InternalDrn.g:1110:2: ( () ( (lv_name_1_0= 'merge' ) ) otherlv_2= '(' ( ( (lv_rotate_3_0= ruleRotate ) ) | ( (lv_depx_4_0= ruleDepX_Impl ) ) | ( (lv_depy_5_0= ruleDepY_Impl ) ) | ( (lv_depxz_6_0= ruleDepXZ_IMPL ) ) | ( (lv_depxy_7_0= ruleDepXY_IMPL ) ) | ( (lv_depz_8_0= ruleDepZ_Impl ) ) ) otherlv_9= ',' ( ( (lv_rotate_10_0= ruleRotate ) ) | ( (lv_depx_11_0= ruleDepX_Impl ) ) | ( (lv_depy_12_0= ruleDepY_Impl ) ) | ( (lv_depxz_13_0= ruleDepXZ_IMPL ) ) | ( (lv_depxy_14_0= ruleDepXY_IMPL ) ) | ( (lv_depz_15_0= ruleDepZ_Impl ) ) ) (otherlv_16= ',' ( ( (lv_rotate_17_0= ruleRotate ) ) | ( (lv_depx_18_0= ruleDepX_Impl ) ) | ( (lv_depy_19_0= ruleDepY_Impl ) ) | ( (lv_depxz_20_0= ruleDepXZ_IMPL ) ) | ( (lv_depxy_21_0= ruleDepXY_IMPL ) ) | ( (lv_depz_22_0= ruleDepZ_Impl ) ) ) )* otherlv_23= ')' )
            // InternalDrn.g:1111:3: () ( (lv_name_1_0= 'merge' ) ) otherlv_2= '(' ( ( (lv_rotate_3_0= ruleRotate ) ) | ( (lv_depx_4_0= ruleDepX_Impl ) ) | ( (lv_depy_5_0= ruleDepY_Impl ) ) | ( (lv_depxz_6_0= ruleDepXZ_IMPL ) ) | ( (lv_depxy_7_0= ruleDepXY_IMPL ) ) | ( (lv_depz_8_0= ruleDepZ_Impl ) ) ) otherlv_9= ',' ( ( (lv_rotate_10_0= ruleRotate ) ) | ( (lv_depx_11_0= ruleDepX_Impl ) ) | ( (lv_depy_12_0= ruleDepY_Impl ) ) | ( (lv_depxz_13_0= ruleDepXZ_IMPL ) ) | ( (lv_depxy_14_0= ruleDepXY_IMPL ) ) | ( (lv_depz_15_0= ruleDepZ_Impl ) ) ) (otherlv_16= ',' ( ( (lv_rotate_17_0= ruleRotate ) ) | ( (lv_depx_18_0= ruleDepX_Impl ) ) | ( (lv_depy_19_0= ruleDepY_Impl ) ) | ( (lv_depxz_20_0= ruleDepXZ_IMPL ) ) | ( (lv_depxy_21_0= ruleDepXY_IMPL ) ) | ( (lv_depz_22_0= ruleDepZ_Impl ) ) ) )* otherlv_23= ')'
            {
            // InternalDrn.g:1111:3: ()
            // InternalDrn.g:1112:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAndAccess().getAndAction_0(),
            					current);
            			

            }

            // InternalDrn.g:1118:3: ( (lv_name_1_0= 'merge' ) )
            // InternalDrn.g:1119:4: (lv_name_1_0= 'merge' )
            {
            // InternalDrn.g:1119:4: (lv_name_1_0= 'merge' )
            // InternalDrn.g:1120:5: lv_name_1_0= 'merge'
            {
            lv_name_1_0=(Token)match(input,25,FOLLOW_13); 

            					newLeafNode(lv_name_1_0, grammarAccess.getAndAccess().getNameMergeKeyword_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAndRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_1_0, "merge");
            				

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_26); 

            			newLeafNode(otherlv_2, grammarAccess.getAndAccess().getLeftParenthesisKeyword_2());
            		
            // InternalDrn.g:1136:3: ( ( (lv_rotate_3_0= ruleRotate ) ) | ( (lv_depx_4_0= ruleDepX_Impl ) ) | ( (lv_depy_5_0= ruleDepY_Impl ) ) | ( (lv_depxz_6_0= ruleDepXZ_IMPL ) ) | ( (lv_depxy_7_0= ruleDepXY_IMPL ) ) | ( (lv_depz_8_0= ruleDepZ_Impl ) ) )
            int alt19=6;
            switch ( input.LA(1) ) {
            case 45:
                {
                alt19=1;
                }
                break;
            case 30:
            case 31:
                {
                alt19=2;
                }
                break;
            case 26:
            case 29:
                {
                alt19=3;
                }
                break;
            case 42:
                {
                alt19=4;
                }
                break;
            case 34:
            case 35:
            case 37:
                {
                alt19=5;
                }
                break;
            case 32:
            case 33:
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
                    // InternalDrn.g:1137:4: ( (lv_rotate_3_0= ruleRotate ) )
                    {
                    // InternalDrn.g:1137:4: ( (lv_rotate_3_0= ruleRotate ) )
                    // InternalDrn.g:1138:5: (lv_rotate_3_0= ruleRotate )
                    {
                    // InternalDrn.g:1138:5: (lv_rotate_3_0= ruleRotate )
                    // InternalDrn.g:1139:6: lv_rotate_3_0= ruleRotate
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
                    // InternalDrn.g:1157:4: ( (lv_depx_4_0= ruleDepX_Impl ) )
                    {
                    // InternalDrn.g:1157:4: ( (lv_depx_4_0= ruleDepX_Impl ) )
                    // InternalDrn.g:1158:5: (lv_depx_4_0= ruleDepX_Impl )
                    {
                    // InternalDrn.g:1158:5: (lv_depx_4_0= ruleDepX_Impl )
                    // InternalDrn.g:1159:6: lv_depx_4_0= ruleDepX_Impl
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
                    // InternalDrn.g:1177:4: ( (lv_depy_5_0= ruleDepY_Impl ) )
                    {
                    // InternalDrn.g:1177:4: ( (lv_depy_5_0= ruleDepY_Impl ) )
                    // InternalDrn.g:1178:5: (lv_depy_5_0= ruleDepY_Impl )
                    {
                    // InternalDrn.g:1178:5: (lv_depy_5_0= ruleDepY_Impl )
                    // InternalDrn.g:1179:6: lv_depy_5_0= ruleDepY_Impl
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
                    // InternalDrn.g:1197:4: ( (lv_depxz_6_0= ruleDepXZ_IMPL ) )
                    {
                    // InternalDrn.g:1197:4: ( (lv_depxz_6_0= ruleDepXZ_IMPL ) )
                    // InternalDrn.g:1198:5: (lv_depxz_6_0= ruleDepXZ_IMPL )
                    {
                    // InternalDrn.g:1198:5: (lv_depxz_6_0= ruleDepXZ_IMPL )
                    // InternalDrn.g:1199:6: lv_depxz_6_0= ruleDepXZ_IMPL
                    {

                    						newCompositeNode(grammarAccess.getAndAccess().getDepxzDepXZ_IMPLParserRuleCall_3_3_0());
                    					
                    pushFollow(FOLLOW_25);
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
                    // InternalDrn.g:1217:4: ( (lv_depxy_7_0= ruleDepXY_IMPL ) )
                    {
                    // InternalDrn.g:1217:4: ( (lv_depxy_7_0= ruleDepXY_IMPL ) )
                    // InternalDrn.g:1218:5: (lv_depxy_7_0= ruleDepXY_IMPL )
                    {
                    // InternalDrn.g:1218:5: (lv_depxy_7_0= ruleDepXY_IMPL )
                    // InternalDrn.g:1219:6: lv_depxy_7_0= ruleDepXY_IMPL
                    {

                    						newCompositeNode(grammarAccess.getAndAccess().getDepxyDepXY_IMPLParserRuleCall_3_4_0());
                    					
                    pushFollow(FOLLOW_25);
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
                    // InternalDrn.g:1237:4: ( (lv_depz_8_0= ruleDepZ_Impl ) )
                    {
                    // InternalDrn.g:1237:4: ( (lv_depz_8_0= ruleDepZ_Impl ) )
                    // InternalDrn.g:1238:5: (lv_depz_8_0= ruleDepZ_Impl )
                    {
                    // InternalDrn.g:1238:5: (lv_depz_8_0= ruleDepZ_Impl )
                    // InternalDrn.g:1239:6: lv_depz_8_0= ruleDepZ_Impl
                    {

                    						newCompositeNode(grammarAccess.getAndAccess().getDepzDepZ_ImplParserRuleCall_3_5_0());
                    					
                    pushFollow(FOLLOW_25);
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

            otherlv_9=(Token)match(input,21,FOLLOW_26); 

            			newLeafNode(otherlv_9, grammarAccess.getAndAccess().getCommaKeyword_4());
            		
            // InternalDrn.g:1261:3: ( ( (lv_rotate_10_0= ruleRotate ) ) | ( (lv_depx_11_0= ruleDepX_Impl ) ) | ( (lv_depy_12_0= ruleDepY_Impl ) ) | ( (lv_depxz_13_0= ruleDepXZ_IMPL ) ) | ( (lv_depxy_14_0= ruleDepXY_IMPL ) ) | ( (lv_depz_15_0= ruleDepZ_Impl ) ) )
            int alt20=6;
            switch ( input.LA(1) ) {
            case 45:
                {
                alt20=1;
                }
                break;
            case 30:
            case 31:
                {
                alt20=2;
                }
                break;
            case 26:
            case 29:
                {
                alt20=3;
                }
                break;
            case 42:
                {
                alt20=4;
                }
                break;
            case 34:
            case 35:
            case 37:
                {
                alt20=5;
                }
                break;
            case 32:
            case 33:
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
                    // InternalDrn.g:1262:4: ( (lv_rotate_10_0= ruleRotate ) )
                    {
                    // InternalDrn.g:1262:4: ( (lv_rotate_10_0= ruleRotate ) )
                    // InternalDrn.g:1263:5: (lv_rotate_10_0= ruleRotate )
                    {
                    // InternalDrn.g:1263:5: (lv_rotate_10_0= ruleRotate )
                    // InternalDrn.g:1264:6: lv_rotate_10_0= ruleRotate
                    {

                    						newCompositeNode(grammarAccess.getAndAccess().getRotateRotateParserRuleCall_5_0_0());
                    					
                    pushFollow(FOLLOW_15);
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
                    // InternalDrn.g:1282:4: ( (lv_depx_11_0= ruleDepX_Impl ) )
                    {
                    // InternalDrn.g:1282:4: ( (lv_depx_11_0= ruleDepX_Impl ) )
                    // InternalDrn.g:1283:5: (lv_depx_11_0= ruleDepX_Impl )
                    {
                    // InternalDrn.g:1283:5: (lv_depx_11_0= ruleDepX_Impl )
                    // InternalDrn.g:1284:6: lv_depx_11_0= ruleDepX_Impl
                    {

                    						newCompositeNode(grammarAccess.getAndAccess().getDepxDepX_ImplParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_15);
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
                    // InternalDrn.g:1302:4: ( (lv_depy_12_0= ruleDepY_Impl ) )
                    {
                    // InternalDrn.g:1302:4: ( (lv_depy_12_0= ruleDepY_Impl ) )
                    // InternalDrn.g:1303:5: (lv_depy_12_0= ruleDepY_Impl )
                    {
                    // InternalDrn.g:1303:5: (lv_depy_12_0= ruleDepY_Impl )
                    // InternalDrn.g:1304:6: lv_depy_12_0= ruleDepY_Impl
                    {

                    						newCompositeNode(grammarAccess.getAndAccess().getDepyDepY_ImplParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_15);
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
                    // InternalDrn.g:1322:4: ( (lv_depxz_13_0= ruleDepXZ_IMPL ) )
                    {
                    // InternalDrn.g:1322:4: ( (lv_depxz_13_0= ruleDepXZ_IMPL ) )
                    // InternalDrn.g:1323:5: (lv_depxz_13_0= ruleDepXZ_IMPL )
                    {
                    // InternalDrn.g:1323:5: (lv_depxz_13_0= ruleDepXZ_IMPL )
                    // InternalDrn.g:1324:6: lv_depxz_13_0= ruleDepXZ_IMPL
                    {

                    						newCompositeNode(grammarAccess.getAndAccess().getDepxzDepXZ_IMPLParserRuleCall_5_3_0());
                    					
                    pushFollow(FOLLOW_15);
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
                    // InternalDrn.g:1342:4: ( (lv_depxy_14_0= ruleDepXY_IMPL ) )
                    {
                    // InternalDrn.g:1342:4: ( (lv_depxy_14_0= ruleDepXY_IMPL ) )
                    // InternalDrn.g:1343:5: (lv_depxy_14_0= ruleDepXY_IMPL )
                    {
                    // InternalDrn.g:1343:5: (lv_depxy_14_0= ruleDepXY_IMPL )
                    // InternalDrn.g:1344:6: lv_depxy_14_0= ruleDepXY_IMPL
                    {

                    						newCompositeNode(grammarAccess.getAndAccess().getDepxyDepXY_IMPLParserRuleCall_5_4_0());
                    					
                    pushFollow(FOLLOW_15);
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
                    // InternalDrn.g:1362:4: ( (lv_depz_15_0= ruleDepZ_Impl ) )
                    {
                    // InternalDrn.g:1362:4: ( (lv_depz_15_0= ruleDepZ_Impl ) )
                    // InternalDrn.g:1363:5: (lv_depz_15_0= ruleDepZ_Impl )
                    {
                    // InternalDrn.g:1363:5: (lv_depz_15_0= ruleDepZ_Impl )
                    // InternalDrn.g:1364:6: lv_depz_15_0= ruleDepZ_Impl
                    {

                    						newCompositeNode(grammarAccess.getAndAccess().getDepzDepZ_ImplParserRuleCall_5_5_0());
                    					
                    pushFollow(FOLLOW_15);
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

            // InternalDrn.g:1382:3: (otherlv_16= ',' ( ( (lv_rotate_17_0= ruleRotate ) ) | ( (lv_depx_18_0= ruleDepX_Impl ) ) | ( (lv_depy_19_0= ruleDepY_Impl ) ) | ( (lv_depxz_20_0= ruleDepXZ_IMPL ) ) | ( (lv_depxy_21_0= ruleDepXY_IMPL ) ) | ( (lv_depz_22_0= ruleDepZ_Impl ) ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==21) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalDrn.g:1383:4: otherlv_16= ',' ( ( (lv_rotate_17_0= ruleRotate ) ) | ( (lv_depx_18_0= ruleDepX_Impl ) ) | ( (lv_depy_19_0= ruleDepY_Impl ) ) | ( (lv_depxz_20_0= ruleDepXZ_IMPL ) ) | ( (lv_depxy_21_0= ruleDepXY_IMPL ) ) | ( (lv_depz_22_0= ruleDepZ_Impl ) ) )
            	    {
            	    otherlv_16=(Token)match(input,21,FOLLOW_26); 

            	    				newLeafNode(otherlv_16, grammarAccess.getAndAccess().getCommaKeyword_6_0());
            	    			
            	    // InternalDrn.g:1387:4: ( ( (lv_rotate_17_0= ruleRotate ) ) | ( (lv_depx_18_0= ruleDepX_Impl ) ) | ( (lv_depy_19_0= ruleDepY_Impl ) ) | ( (lv_depxz_20_0= ruleDepXZ_IMPL ) ) | ( (lv_depxy_21_0= ruleDepXY_IMPL ) ) | ( (lv_depz_22_0= ruleDepZ_Impl ) ) )
            	    int alt21=6;
            	    switch ( input.LA(1) ) {
            	    case 45:
            	        {
            	        alt21=1;
            	        }
            	        break;
            	    case 30:
            	    case 31:
            	        {
            	        alt21=2;
            	        }
            	        break;
            	    case 26:
            	    case 29:
            	        {
            	        alt21=3;
            	        }
            	        break;
            	    case 42:
            	        {
            	        alt21=4;
            	        }
            	        break;
            	    case 34:
            	    case 35:
            	    case 37:
            	        {
            	        alt21=5;
            	        }
            	        break;
            	    case 32:
            	    case 33:
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
            	            // InternalDrn.g:1388:5: ( (lv_rotate_17_0= ruleRotate ) )
            	            {
            	            // InternalDrn.g:1388:5: ( (lv_rotate_17_0= ruleRotate ) )
            	            // InternalDrn.g:1389:6: (lv_rotate_17_0= ruleRotate )
            	            {
            	            // InternalDrn.g:1389:6: (lv_rotate_17_0= ruleRotate )
            	            // InternalDrn.g:1390:7: lv_rotate_17_0= ruleRotate
            	            {

            	            							newCompositeNode(grammarAccess.getAndAccess().getRotateRotateParserRuleCall_6_1_0_0());
            	            						
            	            pushFollow(FOLLOW_15);
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
            	            // InternalDrn.g:1408:5: ( (lv_depx_18_0= ruleDepX_Impl ) )
            	            {
            	            // InternalDrn.g:1408:5: ( (lv_depx_18_0= ruleDepX_Impl ) )
            	            // InternalDrn.g:1409:6: (lv_depx_18_0= ruleDepX_Impl )
            	            {
            	            // InternalDrn.g:1409:6: (lv_depx_18_0= ruleDepX_Impl )
            	            // InternalDrn.g:1410:7: lv_depx_18_0= ruleDepX_Impl
            	            {

            	            							newCompositeNode(grammarAccess.getAndAccess().getDepxDepX_ImplParserRuleCall_6_1_1_0());
            	            						
            	            pushFollow(FOLLOW_15);
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
            	            // InternalDrn.g:1428:5: ( (lv_depy_19_0= ruleDepY_Impl ) )
            	            {
            	            // InternalDrn.g:1428:5: ( (lv_depy_19_0= ruleDepY_Impl ) )
            	            // InternalDrn.g:1429:6: (lv_depy_19_0= ruleDepY_Impl )
            	            {
            	            // InternalDrn.g:1429:6: (lv_depy_19_0= ruleDepY_Impl )
            	            // InternalDrn.g:1430:7: lv_depy_19_0= ruleDepY_Impl
            	            {

            	            							newCompositeNode(grammarAccess.getAndAccess().getDepyDepY_ImplParserRuleCall_6_1_2_0());
            	            						
            	            pushFollow(FOLLOW_15);
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
            	            // InternalDrn.g:1448:5: ( (lv_depxz_20_0= ruleDepXZ_IMPL ) )
            	            {
            	            // InternalDrn.g:1448:5: ( (lv_depxz_20_0= ruleDepXZ_IMPL ) )
            	            // InternalDrn.g:1449:6: (lv_depxz_20_0= ruleDepXZ_IMPL )
            	            {
            	            // InternalDrn.g:1449:6: (lv_depxz_20_0= ruleDepXZ_IMPL )
            	            // InternalDrn.g:1450:7: lv_depxz_20_0= ruleDepXZ_IMPL
            	            {

            	            							newCompositeNode(grammarAccess.getAndAccess().getDepxzDepXZ_IMPLParserRuleCall_6_1_3_0());
            	            						
            	            pushFollow(FOLLOW_15);
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
            	            // InternalDrn.g:1468:5: ( (lv_depxy_21_0= ruleDepXY_IMPL ) )
            	            {
            	            // InternalDrn.g:1468:5: ( (lv_depxy_21_0= ruleDepXY_IMPL ) )
            	            // InternalDrn.g:1469:6: (lv_depxy_21_0= ruleDepXY_IMPL )
            	            {
            	            // InternalDrn.g:1469:6: (lv_depxy_21_0= ruleDepXY_IMPL )
            	            // InternalDrn.g:1470:7: lv_depxy_21_0= ruleDepXY_IMPL
            	            {

            	            							newCompositeNode(grammarAccess.getAndAccess().getDepxyDepXY_IMPLParserRuleCall_6_1_4_0());
            	            						
            	            pushFollow(FOLLOW_15);
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
            	            // InternalDrn.g:1488:5: ( (lv_depz_22_0= ruleDepZ_Impl ) )
            	            {
            	            // InternalDrn.g:1488:5: ( (lv_depz_22_0= ruleDepZ_Impl ) )
            	            // InternalDrn.g:1489:6: (lv_depz_22_0= ruleDepZ_Impl )
            	            {
            	            // InternalDrn.g:1489:6: (lv_depz_22_0= ruleDepZ_Impl )
            	            // InternalDrn.g:1490:7: lv_depz_22_0= ruleDepZ_Impl
            	            {

            	            							newCompositeNode(grammarAccess.getAndAccess().getDepzDepZ_ImplParserRuleCall_6_1_5_0());
            	            						
            	            pushFollow(FOLLOW_15);
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

            otherlv_23=(Token)match(input,22,FOLLOW_2); 

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
    // InternalDrn.g:1517:1: entryRuleDepY_Impl returns [EObject current=null] : iv_ruleDepY_Impl= ruleDepY_Impl EOF ;
    public final EObject entryRuleDepY_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDepY_Impl = null;


        try {
            // InternalDrn.g:1517:50: (iv_ruleDepY_Impl= ruleDepY_Impl EOF )
            // InternalDrn.g:1518:2: iv_ruleDepY_Impl= ruleDepY_Impl EOF
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
    // InternalDrn.g:1524:1: ruleDepY_Impl returns [EObject current=null] : (this_FORWARD_0= ruleFORWARD | this_BACKWARD_1= ruleBACKWARD ) ;
    public final EObject ruleDepY_Impl() throws RecognitionException {
        EObject current = null;

        EObject this_FORWARD_0 = null;

        EObject this_BACKWARD_1 = null;



        	enterRule();

        try {
            // InternalDrn.g:1530:2: ( (this_FORWARD_0= ruleFORWARD | this_BACKWARD_1= ruleBACKWARD ) )
            // InternalDrn.g:1531:2: (this_FORWARD_0= ruleFORWARD | this_BACKWARD_1= ruleBACKWARD )
            {
            // InternalDrn.g:1531:2: (this_FORWARD_0= ruleFORWARD | this_BACKWARD_1= ruleBACKWARD )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==26) ) {
                alt23=1;
            }
            else if ( (LA23_0==29) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // InternalDrn.g:1532:3: this_FORWARD_0= ruleFORWARD
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
                    // InternalDrn.g:1541:3: this_BACKWARD_1= ruleBACKWARD
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
    // InternalDrn.g:1553:1: entryRuleFORWARD returns [EObject current=null] : iv_ruleFORWARD= ruleFORWARD EOF ;
    public final EObject entryRuleFORWARD() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFORWARD = null;


        try {
            // InternalDrn.g:1553:48: (iv_ruleFORWARD= ruleFORWARD EOF )
            // InternalDrn.g:1554:2: iv_ruleFORWARD= ruleFORWARD EOF
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
    // InternalDrn.g:1560:1: ruleFORWARD returns [EObject current=null] : ( ( (lv_name_0_0= 'forward' ) ) otherlv_1= '(' otherlv_2= 'distance' otherlv_3= '=' ( ( (otherlv_4= RULE_ID ) ) | ( (lv_distanceCST_5_0= ruleEInt ) ) ) otherlv_6= 'temps' otherlv_7= '=' ( ( (lv_tempsCST_8_0= ruleEInt ) ) | ( (otherlv_9= RULE_ID ) ) ) otherlv_10= ')' ) ;
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
            // InternalDrn.g:1566:2: ( ( ( (lv_name_0_0= 'forward' ) ) otherlv_1= '(' otherlv_2= 'distance' otherlv_3= '=' ( ( (otherlv_4= RULE_ID ) ) | ( (lv_distanceCST_5_0= ruleEInt ) ) ) otherlv_6= 'temps' otherlv_7= '=' ( ( (lv_tempsCST_8_0= ruleEInt ) ) | ( (otherlv_9= RULE_ID ) ) ) otherlv_10= ')' ) )
            // InternalDrn.g:1567:2: ( ( (lv_name_0_0= 'forward' ) ) otherlv_1= '(' otherlv_2= 'distance' otherlv_3= '=' ( ( (otherlv_4= RULE_ID ) ) | ( (lv_distanceCST_5_0= ruleEInt ) ) ) otherlv_6= 'temps' otherlv_7= '=' ( ( (lv_tempsCST_8_0= ruleEInt ) ) | ( (otherlv_9= RULE_ID ) ) ) otherlv_10= ')' )
            {
            // InternalDrn.g:1567:2: ( ( (lv_name_0_0= 'forward' ) ) otherlv_1= '(' otherlv_2= 'distance' otherlv_3= '=' ( ( (otherlv_4= RULE_ID ) ) | ( (lv_distanceCST_5_0= ruleEInt ) ) ) otherlv_6= 'temps' otherlv_7= '=' ( ( (lv_tempsCST_8_0= ruleEInt ) ) | ( (otherlv_9= RULE_ID ) ) ) otherlv_10= ')' )
            // InternalDrn.g:1568:3: ( (lv_name_0_0= 'forward' ) ) otherlv_1= '(' otherlv_2= 'distance' otherlv_3= '=' ( ( (otherlv_4= RULE_ID ) ) | ( (lv_distanceCST_5_0= ruleEInt ) ) ) otherlv_6= 'temps' otherlv_7= '=' ( ( (lv_tempsCST_8_0= ruleEInt ) ) | ( (otherlv_9= RULE_ID ) ) ) otherlv_10= ')'
            {
            // InternalDrn.g:1568:3: ( (lv_name_0_0= 'forward' ) )
            // InternalDrn.g:1569:4: (lv_name_0_0= 'forward' )
            {
            // InternalDrn.g:1569:4: (lv_name_0_0= 'forward' )
            // InternalDrn.g:1570:5: lv_name_0_0= 'forward'
            {
            lv_name_0_0=(Token)match(input,26,FOLLOW_13); 

            					newLeafNode(lv_name_0_0, grammarAccess.getFORWARDAccess().getNameForwardKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFORWARDRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "forward");
            				

            }


            }

            otherlv_1=(Token)match(input,20,FOLLOW_27); 

            			newLeafNode(otherlv_1, grammarAccess.getFORWARDAccess().getLeftParenthesisKeyword_1());
            		
            otherlv_2=(Token)match(input,27,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getFORWARDAccess().getDistanceKeyword_2());
            		
            otherlv_3=(Token)match(input,14,FOLLOW_19); 

            			newLeafNode(otherlv_3, grammarAccess.getFORWARDAccess().getEqualsSignKeyword_3());
            		
            // InternalDrn.g:1594:3: ( ( (otherlv_4= RULE_ID ) ) | ( (lv_distanceCST_5_0= ruleEInt ) ) )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_ID) ) {
                alt24=1;
            }
            else if ( (LA24_0==RULE_INT||LA24_0==58) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // InternalDrn.g:1595:4: ( (otherlv_4= RULE_ID ) )
                    {
                    // InternalDrn.g:1595:4: ( (otherlv_4= RULE_ID ) )
                    // InternalDrn.g:1596:5: (otherlv_4= RULE_ID )
                    {
                    // InternalDrn.g:1596:5: (otherlv_4= RULE_ID )
                    // InternalDrn.g:1597:6: otherlv_4= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFORWARDRule());
                    						}
                    					
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_28); 

                    						newLeafNode(otherlv_4, grammarAccess.getFORWARDAccess().getDistanceVarParametreCrossReference_4_0_0());
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDrn.g:1609:4: ( (lv_distanceCST_5_0= ruleEInt ) )
                    {
                    // InternalDrn.g:1609:4: ( (lv_distanceCST_5_0= ruleEInt ) )
                    // InternalDrn.g:1610:5: (lv_distanceCST_5_0= ruleEInt )
                    {
                    // InternalDrn.g:1610:5: (lv_distanceCST_5_0= ruleEInt )
                    // InternalDrn.g:1611:6: lv_distanceCST_5_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getFORWARDAccess().getDistanceCSTEIntParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_28);
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

            otherlv_6=(Token)match(input,28,FOLLOW_6); 

            			newLeafNode(otherlv_6, grammarAccess.getFORWARDAccess().getTempsKeyword_5());
            		
            otherlv_7=(Token)match(input,14,FOLLOW_19); 

            			newLeafNode(otherlv_7, grammarAccess.getFORWARDAccess().getEqualsSignKeyword_6());
            		
            // InternalDrn.g:1637:3: ( ( (lv_tempsCST_8_0= ruleEInt ) ) | ( (otherlv_9= RULE_ID ) ) )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_INT||LA25_0==58) ) {
                alt25=1;
            }
            else if ( (LA25_0==RULE_ID) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // InternalDrn.g:1638:4: ( (lv_tempsCST_8_0= ruleEInt ) )
                    {
                    // InternalDrn.g:1638:4: ( (lv_tempsCST_8_0= ruleEInt ) )
                    // InternalDrn.g:1639:5: (lv_tempsCST_8_0= ruleEInt )
                    {
                    // InternalDrn.g:1639:5: (lv_tempsCST_8_0= ruleEInt )
                    // InternalDrn.g:1640:6: lv_tempsCST_8_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getFORWARDAccess().getTempsCSTEIntParserRuleCall_7_0_0());
                    					
                    pushFollow(FOLLOW_29);
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
                    // InternalDrn.g:1658:4: ( (otherlv_9= RULE_ID ) )
                    {
                    // InternalDrn.g:1658:4: ( (otherlv_9= RULE_ID ) )
                    // InternalDrn.g:1659:5: (otherlv_9= RULE_ID )
                    {
                    // InternalDrn.g:1659:5: (otherlv_9= RULE_ID )
                    // InternalDrn.g:1660:6: otherlv_9= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFORWARDRule());
                    						}
                    					
                    otherlv_9=(Token)match(input,RULE_ID,FOLLOW_29); 

                    						newLeafNode(otherlv_9, grammarAccess.getFORWARDAccess().getTempsVARParametreCrossReference_7_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,22,FOLLOW_2); 

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
    // InternalDrn.g:1680:1: entryRuleBACKWARD returns [EObject current=null] : iv_ruleBACKWARD= ruleBACKWARD EOF ;
    public final EObject entryRuleBACKWARD() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBACKWARD = null;


        try {
            // InternalDrn.g:1680:49: (iv_ruleBACKWARD= ruleBACKWARD EOF )
            // InternalDrn.g:1681:2: iv_ruleBACKWARD= ruleBACKWARD EOF
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
    // InternalDrn.g:1687:1: ruleBACKWARD returns [EObject current=null] : ( ( (lv_name_0_0= 'backward' ) ) otherlv_1= '(' otherlv_2= 'distance' otherlv_3= '=' ( ( (lv_distanceCST_4_0= ruleEInt ) ) | ( (otherlv_5= RULE_ID ) ) ) otherlv_6= 'temps' otherlv_7= '=' ( ( (lv_tempsCST_8_0= ruleEInt ) ) | ( (otherlv_9= RULE_ID ) ) ) otherlv_10= ')' ) ;
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
            // InternalDrn.g:1693:2: ( ( ( (lv_name_0_0= 'backward' ) ) otherlv_1= '(' otherlv_2= 'distance' otherlv_3= '=' ( ( (lv_distanceCST_4_0= ruleEInt ) ) | ( (otherlv_5= RULE_ID ) ) ) otherlv_6= 'temps' otherlv_7= '=' ( ( (lv_tempsCST_8_0= ruleEInt ) ) | ( (otherlv_9= RULE_ID ) ) ) otherlv_10= ')' ) )
            // InternalDrn.g:1694:2: ( ( (lv_name_0_0= 'backward' ) ) otherlv_1= '(' otherlv_2= 'distance' otherlv_3= '=' ( ( (lv_distanceCST_4_0= ruleEInt ) ) | ( (otherlv_5= RULE_ID ) ) ) otherlv_6= 'temps' otherlv_7= '=' ( ( (lv_tempsCST_8_0= ruleEInt ) ) | ( (otherlv_9= RULE_ID ) ) ) otherlv_10= ')' )
            {
            // InternalDrn.g:1694:2: ( ( (lv_name_0_0= 'backward' ) ) otherlv_1= '(' otherlv_2= 'distance' otherlv_3= '=' ( ( (lv_distanceCST_4_0= ruleEInt ) ) | ( (otherlv_5= RULE_ID ) ) ) otherlv_6= 'temps' otherlv_7= '=' ( ( (lv_tempsCST_8_0= ruleEInt ) ) | ( (otherlv_9= RULE_ID ) ) ) otherlv_10= ')' )
            // InternalDrn.g:1695:3: ( (lv_name_0_0= 'backward' ) ) otherlv_1= '(' otherlv_2= 'distance' otherlv_3= '=' ( ( (lv_distanceCST_4_0= ruleEInt ) ) | ( (otherlv_5= RULE_ID ) ) ) otherlv_6= 'temps' otherlv_7= '=' ( ( (lv_tempsCST_8_0= ruleEInt ) ) | ( (otherlv_9= RULE_ID ) ) ) otherlv_10= ')'
            {
            // InternalDrn.g:1695:3: ( (lv_name_0_0= 'backward' ) )
            // InternalDrn.g:1696:4: (lv_name_0_0= 'backward' )
            {
            // InternalDrn.g:1696:4: (lv_name_0_0= 'backward' )
            // InternalDrn.g:1697:5: lv_name_0_0= 'backward'
            {
            lv_name_0_0=(Token)match(input,29,FOLLOW_13); 

            					newLeafNode(lv_name_0_0, grammarAccess.getBACKWARDAccess().getNameBackwardKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBACKWARDRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "backward");
            				

            }


            }

            otherlv_1=(Token)match(input,20,FOLLOW_27); 

            			newLeafNode(otherlv_1, grammarAccess.getBACKWARDAccess().getLeftParenthesisKeyword_1());
            		
            otherlv_2=(Token)match(input,27,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getBACKWARDAccess().getDistanceKeyword_2());
            		
            otherlv_3=(Token)match(input,14,FOLLOW_19); 

            			newLeafNode(otherlv_3, grammarAccess.getBACKWARDAccess().getEqualsSignKeyword_3());
            		
            // InternalDrn.g:1721:3: ( ( (lv_distanceCST_4_0= ruleEInt ) ) | ( (otherlv_5= RULE_ID ) ) )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_INT||LA26_0==58) ) {
                alt26=1;
            }
            else if ( (LA26_0==RULE_ID) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // InternalDrn.g:1722:4: ( (lv_distanceCST_4_0= ruleEInt ) )
                    {
                    // InternalDrn.g:1722:4: ( (lv_distanceCST_4_0= ruleEInt ) )
                    // InternalDrn.g:1723:5: (lv_distanceCST_4_0= ruleEInt )
                    {
                    // InternalDrn.g:1723:5: (lv_distanceCST_4_0= ruleEInt )
                    // InternalDrn.g:1724:6: lv_distanceCST_4_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getBACKWARDAccess().getDistanceCSTEIntParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_28);
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
                    // InternalDrn.g:1742:4: ( (otherlv_5= RULE_ID ) )
                    {
                    // InternalDrn.g:1742:4: ( (otherlv_5= RULE_ID ) )
                    // InternalDrn.g:1743:5: (otherlv_5= RULE_ID )
                    {
                    // InternalDrn.g:1743:5: (otherlv_5= RULE_ID )
                    // InternalDrn.g:1744:6: otherlv_5= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getBACKWARDRule());
                    						}
                    					
                    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_28); 

                    						newLeafNode(otherlv_5, grammarAccess.getBACKWARDAccess().getDistanceVarParametreCrossReference_4_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,28,FOLLOW_6); 

            			newLeafNode(otherlv_6, grammarAccess.getBACKWARDAccess().getTempsKeyword_5());
            		
            otherlv_7=(Token)match(input,14,FOLLOW_19); 

            			newLeafNode(otherlv_7, grammarAccess.getBACKWARDAccess().getEqualsSignKeyword_6());
            		
            // InternalDrn.g:1764:3: ( ( (lv_tempsCST_8_0= ruleEInt ) ) | ( (otherlv_9= RULE_ID ) ) )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_INT||LA27_0==58) ) {
                alt27=1;
            }
            else if ( (LA27_0==RULE_ID) ) {
                alt27=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // InternalDrn.g:1765:4: ( (lv_tempsCST_8_0= ruleEInt ) )
                    {
                    // InternalDrn.g:1765:4: ( (lv_tempsCST_8_0= ruleEInt ) )
                    // InternalDrn.g:1766:5: (lv_tempsCST_8_0= ruleEInt )
                    {
                    // InternalDrn.g:1766:5: (lv_tempsCST_8_0= ruleEInt )
                    // InternalDrn.g:1767:6: lv_tempsCST_8_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getBACKWARDAccess().getTempsCSTEIntParserRuleCall_7_0_0());
                    					
                    pushFollow(FOLLOW_29);
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
                    // InternalDrn.g:1785:4: ( (otherlv_9= RULE_ID ) )
                    {
                    // InternalDrn.g:1785:4: ( (otherlv_9= RULE_ID ) )
                    // InternalDrn.g:1786:5: (otherlv_9= RULE_ID )
                    {
                    // InternalDrn.g:1786:5: (otherlv_9= RULE_ID )
                    // InternalDrn.g:1787:6: otherlv_9= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getBACKWARDRule());
                    						}
                    					
                    otherlv_9=(Token)match(input,RULE_ID,FOLLOW_29); 

                    						newLeafNode(otherlv_9, grammarAccess.getBACKWARDAccess().getTempsVARParametreCrossReference_7_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,22,FOLLOW_2); 

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
    // InternalDrn.g:1807:1: entryRuleDepX_Impl returns [EObject current=null] : iv_ruleDepX_Impl= ruleDepX_Impl EOF ;
    public final EObject entryRuleDepX_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDepX_Impl = null;


        try {
            // InternalDrn.g:1807:50: (iv_ruleDepX_Impl= ruleDepX_Impl EOF )
            // InternalDrn.g:1808:2: iv_ruleDepX_Impl= ruleDepX_Impl EOF
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
    // InternalDrn.g:1814:1: ruleDepX_Impl returns [EObject current=null] : (this_LEFT_0= ruleLEFT | this_RIGHT_1= ruleRIGHT ) ;
    public final EObject ruleDepX_Impl() throws RecognitionException {
        EObject current = null;

        EObject this_LEFT_0 = null;

        EObject this_RIGHT_1 = null;



        	enterRule();

        try {
            // InternalDrn.g:1820:2: ( (this_LEFT_0= ruleLEFT | this_RIGHT_1= ruleRIGHT ) )
            // InternalDrn.g:1821:2: (this_LEFT_0= ruleLEFT | this_RIGHT_1= ruleRIGHT )
            {
            // InternalDrn.g:1821:2: (this_LEFT_0= ruleLEFT | this_RIGHT_1= ruleRIGHT )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==30) ) {
                alt28=1;
            }
            else if ( (LA28_0==31) ) {
                alt28=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // InternalDrn.g:1822:3: this_LEFT_0= ruleLEFT
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
                    // InternalDrn.g:1831:3: this_RIGHT_1= ruleRIGHT
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
    // InternalDrn.g:1843:1: entryRuleLEFT returns [EObject current=null] : iv_ruleLEFT= ruleLEFT EOF ;
    public final EObject entryRuleLEFT() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLEFT = null;


        try {
            // InternalDrn.g:1843:45: (iv_ruleLEFT= ruleLEFT EOF )
            // InternalDrn.g:1844:2: iv_ruleLEFT= ruleLEFT EOF
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
    // InternalDrn.g:1850:1: ruleLEFT returns [EObject current=null] : ( ( (lv_name_0_0= 'left' ) ) otherlv_1= '(' otherlv_2= 'distance' otherlv_3= '=' ( ( (lv_distanceCST_4_0= ruleEInt ) ) | ( (otherlv_5= RULE_ID ) ) ) otherlv_6= 'temps' otherlv_7= '=' ( ( (lv_tempsCST_8_0= ruleEInt ) ) | ( (otherlv_9= RULE_ID ) ) ) otherlv_10= ')' ) ;
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
            // InternalDrn.g:1856:2: ( ( ( (lv_name_0_0= 'left' ) ) otherlv_1= '(' otherlv_2= 'distance' otherlv_3= '=' ( ( (lv_distanceCST_4_0= ruleEInt ) ) | ( (otherlv_5= RULE_ID ) ) ) otherlv_6= 'temps' otherlv_7= '=' ( ( (lv_tempsCST_8_0= ruleEInt ) ) | ( (otherlv_9= RULE_ID ) ) ) otherlv_10= ')' ) )
            // InternalDrn.g:1857:2: ( ( (lv_name_0_0= 'left' ) ) otherlv_1= '(' otherlv_2= 'distance' otherlv_3= '=' ( ( (lv_distanceCST_4_0= ruleEInt ) ) | ( (otherlv_5= RULE_ID ) ) ) otherlv_6= 'temps' otherlv_7= '=' ( ( (lv_tempsCST_8_0= ruleEInt ) ) | ( (otherlv_9= RULE_ID ) ) ) otherlv_10= ')' )
            {
            // InternalDrn.g:1857:2: ( ( (lv_name_0_0= 'left' ) ) otherlv_1= '(' otherlv_2= 'distance' otherlv_3= '=' ( ( (lv_distanceCST_4_0= ruleEInt ) ) | ( (otherlv_5= RULE_ID ) ) ) otherlv_6= 'temps' otherlv_7= '=' ( ( (lv_tempsCST_8_0= ruleEInt ) ) | ( (otherlv_9= RULE_ID ) ) ) otherlv_10= ')' )
            // InternalDrn.g:1858:3: ( (lv_name_0_0= 'left' ) ) otherlv_1= '(' otherlv_2= 'distance' otherlv_3= '=' ( ( (lv_distanceCST_4_0= ruleEInt ) ) | ( (otherlv_5= RULE_ID ) ) ) otherlv_6= 'temps' otherlv_7= '=' ( ( (lv_tempsCST_8_0= ruleEInt ) ) | ( (otherlv_9= RULE_ID ) ) ) otherlv_10= ')'
            {
            // InternalDrn.g:1858:3: ( (lv_name_0_0= 'left' ) )
            // InternalDrn.g:1859:4: (lv_name_0_0= 'left' )
            {
            // InternalDrn.g:1859:4: (lv_name_0_0= 'left' )
            // InternalDrn.g:1860:5: lv_name_0_0= 'left'
            {
            lv_name_0_0=(Token)match(input,30,FOLLOW_13); 

            					newLeafNode(lv_name_0_0, grammarAccess.getLEFTAccess().getNameLeftKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLEFTRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "left");
            				

            }


            }

            otherlv_1=(Token)match(input,20,FOLLOW_27); 

            			newLeafNode(otherlv_1, grammarAccess.getLEFTAccess().getLeftParenthesisKeyword_1());
            		
            otherlv_2=(Token)match(input,27,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getLEFTAccess().getDistanceKeyword_2());
            		
            otherlv_3=(Token)match(input,14,FOLLOW_19); 

            			newLeafNode(otherlv_3, grammarAccess.getLEFTAccess().getEqualsSignKeyword_3());
            		
            // InternalDrn.g:1884:3: ( ( (lv_distanceCST_4_0= ruleEInt ) ) | ( (otherlv_5= RULE_ID ) ) )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_INT||LA29_0==58) ) {
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
                    // InternalDrn.g:1885:4: ( (lv_distanceCST_4_0= ruleEInt ) )
                    {
                    // InternalDrn.g:1885:4: ( (lv_distanceCST_4_0= ruleEInt ) )
                    // InternalDrn.g:1886:5: (lv_distanceCST_4_0= ruleEInt )
                    {
                    // InternalDrn.g:1886:5: (lv_distanceCST_4_0= ruleEInt )
                    // InternalDrn.g:1887:6: lv_distanceCST_4_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getLEFTAccess().getDistanceCSTEIntParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_28);
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
                    // InternalDrn.g:1905:4: ( (otherlv_5= RULE_ID ) )
                    {
                    // InternalDrn.g:1905:4: ( (otherlv_5= RULE_ID ) )
                    // InternalDrn.g:1906:5: (otherlv_5= RULE_ID )
                    {
                    // InternalDrn.g:1906:5: (otherlv_5= RULE_ID )
                    // InternalDrn.g:1907:6: otherlv_5= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLEFTRule());
                    						}
                    					
                    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_28); 

                    						newLeafNode(otherlv_5, grammarAccess.getLEFTAccess().getDistanceVarParametreCrossReference_4_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,28,FOLLOW_6); 

            			newLeafNode(otherlv_6, grammarAccess.getLEFTAccess().getTempsKeyword_5());
            		
            otherlv_7=(Token)match(input,14,FOLLOW_19); 

            			newLeafNode(otherlv_7, grammarAccess.getLEFTAccess().getEqualsSignKeyword_6());
            		
            // InternalDrn.g:1927:3: ( ( (lv_tempsCST_8_0= ruleEInt ) ) | ( (otherlv_9= RULE_ID ) ) )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_INT||LA30_0==58) ) {
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
                    // InternalDrn.g:1928:4: ( (lv_tempsCST_8_0= ruleEInt ) )
                    {
                    // InternalDrn.g:1928:4: ( (lv_tempsCST_8_0= ruleEInt ) )
                    // InternalDrn.g:1929:5: (lv_tempsCST_8_0= ruleEInt )
                    {
                    // InternalDrn.g:1929:5: (lv_tempsCST_8_0= ruleEInt )
                    // InternalDrn.g:1930:6: lv_tempsCST_8_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getLEFTAccess().getTempsCSTEIntParserRuleCall_7_0_0());
                    					
                    pushFollow(FOLLOW_29);
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
                    // InternalDrn.g:1948:4: ( (otherlv_9= RULE_ID ) )
                    {
                    // InternalDrn.g:1948:4: ( (otherlv_9= RULE_ID ) )
                    // InternalDrn.g:1949:5: (otherlv_9= RULE_ID )
                    {
                    // InternalDrn.g:1949:5: (otherlv_9= RULE_ID )
                    // InternalDrn.g:1950:6: otherlv_9= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLEFTRule());
                    						}
                    					
                    otherlv_9=(Token)match(input,RULE_ID,FOLLOW_29); 

                    						newLeafNode(otherlv_9, grammarAccess.getLEFTAccess().getTempsVARParametreCrossReference_7_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,22,FOLLOW_2); 

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
    // InternalDrn.g:1970:1: entryRuleRIGHT returns [EObject current=null] : iv_ruleRIGHT= ruleRIGHT EOF ;
    public final EObject entryRuleRIGHT() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRIGHT = null;


        try {
            // InternalDrn.g:1970:46: (iv_ruleRIGHT= ruleRIGHT EOF )
            // InternalDrn.g:1971:2: iv_ruleRIGHT= ruleRIGHT EOF
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
    // InternalDrn.g:1977:1: ruleRIGHT returns [EObject current=null] : ( ( (lv_name_0_0= 'right' ) ) otherlv_1= '(' otherlv_2= 'distance' otherlv_3= '=' ( ( (lv_distanceCST_4_0= ruleEInt ) ) | ( (otherlv_5= RULE_ID ) ) ) otherlv_6= 'temps' otherlv_7= '=' ( ( (lv_tempsCST_8_0= ruleEInt ) ) | ( (otherlv_9= RULE_ID ) ) ) otherlv_10= ')' ) ;
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
            // InternalDrn.g:1983:2: ( ( ( (lv_name_0_0= 'right' ) ) otherlv_1= '(' otherlv_2= 'distance' otherlv_3= '=' ( ( (lv_distanceCST_4_0= ruleEInt ) ) | ( (otherlv_5= RULE_ID ) ) ) otherlv_6= 'temps' otherlv_7= '=' ( ( (lv_tempsCST_8_0= ruleEInt ) ) | ( (otherlv_9= RULE_ID ) ) ) otherlv_10= ')' ) )
            // InternalDrn.g:1984:2: ( ( (lv_name_0_0= 'right' ) ) otherlv_1= '(' otherlv_2= 'distance' otherlv_3= '=' ( ( (lv_distanceCST_4_0= ruleEInt ) ) | ( (otherlv_5= RULE_ID ) ) ) otherlv_6= 'temps' otherlv_7= '=' ( ( (lv_tempsCST_8_0= ruleEInt ) ) | ( (otherlv_9= RULE_ID ) ) ) otherlv_10= ')' )
            {
            // InternalDrn.g:1984:2: ( ( (lv_name_0_0= 'right' ) ) otherlv_1= '(' otherlv_2= 'distance' otherlv_3= '=' ( ( (lv_distanceCST_4_0= ruleEInt ) ) | ( (otherlv_5= RULE_ID ) ) ) otherlv_6= 'temps' otherlv_7= '=' ( ( (lv_tempsCST_8_0= ruleEInt ) ) | ( (otherlv_9= RULE_ID ) ) ) otherlv_10= ')' )
            // InternalDrn.g:1985:3: ( (lv_name_0_0= 'right' ) ) otherlv_1= '(' otherlv_2= 'distance' otherlv_3= '=' ( ( (lv_distanceCST_4_0= ruleEInt ) ) | ( (otherlv_5= RULE_ID ) ) ) otherlv_6= 'temps' otherlv_7= '=' ( ( (lv_tempsCST_8_0= ruleEInt ) ) | ( (otherlv_9= RULE_ID ) ) ) otherlv_10= ')'
            {
            // InternalDrn.g:1985:3: ( (lv_name_0_0= 'right' ) )
            // InternalDrn.g:1986:4: (lv_name_0_0= 'right' )
            {
            // InternalDrn.g:1986:4: (lv_name_0_0= 'right' )
            // InternalDrn.g:1987:5: lv_name_0_0= 'right'
            {
            lv_name_0_0=(Token)match(input,31,FOLLOW_13); 

            					newLeafNode(lv_name_0_0, grammarAccess.getRIGHTAccess().getNameRightKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRIGHTRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "right");
            				

            }


            }

            otherlv_1=(Token)match(input,20,FOLLOW_27); 

            			newLeafNode(otherlv_1, grammarAccess.getRIGHTAccess().getLeftParenthesisKeyword_1());
            		
            otherlv_2=(Token)match(input,27,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getRIGHTAccess().getDistanceKeyword_2());
            		
            otherlv_3=(Token)match(input,14,FOLLOW_19); 

            			newLeafNode(otherlv_3, grammarAccess.getRIGHTAccess().getEqualsSignKeyword_3());
            		
            // InternalDrn.g:2011:3: ( ( (lv_distanceCST_4_0= ruleEInt ) ) | ( (otherlv_5= RULE_ID ) ) )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==RULE_INT||LA31_0==58) ) {
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
                    // InternalDrn.g:2012:4: ( (lv_distanceCST_4_0= ruleEInt ) )
                    {
                    // InternalDrn.g:2012:4: ( (lv_distanceCST_4_0= ruleEInt ) )
                    // InternalDrn.g:2013:5: (lv_distanceCST_4_0= ruleEInt )
                    {
                    // InternalDrn.g:2013:5: (lv_distanceCST_4_0= ruleEInt )
                    // InternalDrn.g:2014:6: lv_distanceCST_4_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getRIGHTAccess().getDistanceCSTEIntParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_28);
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
                    // InternalDrn.g:2032:4: ( (otherlv_5= RULE_ID ) )
                    {
                    // InternalDrn.g:2032:4: ( (otherlv_5= RULE_ID ) )
                    // InternalDrn.g:2033:5: (otherlv_5= RULE_ID )
                    {
                    // InternalDrn.g:2033:5: (otherlv_5= RULE_ID )
                    // InternalDrn.g:2034:6: otherlv_5= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRIGHTRule());
                    						}
                    					
                    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_28); 

                    						newLeafNode(otherlv_5, grammarAccess.getRIGHTAccess().getDistanceVarParametreCrossReference_4_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,28,FOLLOW_6); 

            			newLeafNode(otherlv_6, grammarAccess.getRIGHTAccess().getTempsKeyword_5());
            		
            otherlv_7=(Token)match(input,14,FOLLOW_19); 

            			newLeafNode(otherlv_7, grammarAccess.getRIGHTAccess().getEqualsSignKeyword_6());
            		
            // InternalDrn.g:2054:3: ( ( (lv_tempsCST_8_0= ruleEInt ) ) | ( (otherlv_9= RULE_ID ) ) )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==RULE_INT||LA32_0==58) ) {
                alt32=1;
            }
            else if ( (LA32_0==RULE_ID) ) {
                alt32=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // InternalDrn.g:2055:4: ( (lv_tempsCST_8_0= ruleEInt ) )
                    {
                    // InternalDrn.g:2055:4: ( (lv_tempsCST_8_0= ruleEInt ) )
                    // InternalDrn.g:2056:5: (lv_tempsCST_8_0= ruleEInt )
                    {
                    // InternalDrn.g:2056:5: (lv_tempsCST_8_0= ruleEInt )
                    // InternalDrn.g:2057:6: lv_tempsCST_8_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getRIGHTAccess().getTempsCSTEIntParserRuleCall_7_0_0());
                    					
                    pushFollow(FOLLOW_29);
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
                    // InternalDrn.g:2075:4: ( (otherlv_9= RULE_ID ) )
                    {
                    // InternalDrn.g:2075:4: ( (otherlv_9= RULE_ID ) )
                    // InternalDrn.g:2076:5: (otherlv_9= RULE_ID )
                    {
                    // InternalDrn.g:2076:5: (otherlv_9= RULE_ID )
                    // InternalDrn.g:2077:6: otherlv_9= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRIGHTRule());
                    						}
                    					
                    otherlv_9=(Token)match(input,RULE_ID,FOLLOW_29); 

                    						newLeafNode(otherlv_9, grammarAccess.getRIGHTAccess().getTempsVARParametreCrossReference_7_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,22,FOLLOW_2); 

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
    // InternalDrn.g:2097:1: entryRuleDepZ_Impl returns [EObject current=null] : iv_ruleDepZ_Impl= ruleDepZ_Impl EOF ;
    public final EObject entryRuleDepZ_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDepZ_Impl = null;


        try {
            // InternalDrn.g:2097:50: (iv_ruleDepZ_Impl= ruleDepZ_Impl EOF )
            // InternalDrn.g:2098:2: iv_ruleDepZ_Impl= ruleDepZ_Impl EOF
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
    // InternalDrn.g:2104:1: ruleDepZ_Impl returns [EObject current=null] : (this_UP_0= ruleUP | this_DOWN_1= ruleDOWN ) ;
    public final EObject ruleDepZ_Impl() throws RecognitionException {
        EObject current = null;

        EObject this_UP_0 = null;

        EObject this_DOWN_1 = null;



        	enterRule();

        try {
            // InternalDrn.g:2110:2: ( (this_UP_0= ruleUP | this_DOWN_1= ruleDOWN ) )
            // InternalDrn.g:2111:2: (this_UP_0= ruleUP | this_DOWN_1= ruleDOWN )
            {
            // InternalDrn.g:2111:2: (this_UP_0= ruleUP | this_DOWN_1= ruleDOWN )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==32) ) {
                alt33=1;
            }
            else if ( (LA33_0==33) ) {
                alt33=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // InternalDrn.g:2112:3: this_UP_0= ruleUP
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
                    // InternalDrn.g:2121:3: this_DOWN_1= ruleDOWN
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
    // InternalDrn.g:2133:1: entryRuleUP returns [EObject current=null] : iv_ruleUP= ruleUP EOF ;
    public final EObject entryRuleUP() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUP = null;


        try {
            // InternalDrn.g:2133:43: (iv_ruleUP= ruleUP EOF )
            // InternalDrn.g:2134:2: iv_ruleUP= ruleUP EOF
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
    // InternalDrn.g:2140:1: ruleUP returns [EObject current=null] : ( ( (lv_name_0_0= 'up' ) ) otherlv_1= '(' otherlv_2= 'distance' otherlv_3= '=' ( ( (lv_distanceCST_4_0= ruleEInt ) ) | ( (otherlv_5= RULE_ID ) ) ) otherlv_6= 'temps' otherlv_7= '=' ( ( (lv_tempsCST_8_0= ruleEInt ) ) | ( (otherlv_9= RULE_ID ) ) ) otherlv_10= ')' ) ;
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
            // InternalDrn.g:2146:2: ( ( ( (lv_name_0_0= 'up' ) ) otherlv_1= '(' otherlv_2= 'distance' otherlv_3= '=' ( ( (lv_distanceCST_4_0= ruleEInt ) ) | ( (otherlv_5= RULE_ID ) ) ) otherlv_6= 'temps' otherlv_7= '=' ( ( (lv_tempsCST_8_0= ruleEInt ) ) | ( (otherlv_9= RULE_ID ) ) ) otherlv_10= ')' ) )
            // InternalDrn.g:2147:2: ( ( (lv_name_0_0= 'up' ) ) otherlv_1= '(' otherlv_2= 'distance' otherlv_3= '=' ( ( (lv_distanceCST_4_0= ruleEInt ) ) | ( (otherlv_5= RULE_ID ) ) ) otherlv_6= 'temps' otherlv_7= '=' ( ( (lv_tempsCST_8_0= ruleEInt ) ) | ( (otherlv_9= RULE_ID ) ) ) otherlv_10= ')' )
            {
            // InternalDrn.g:2147:2: ( ( (lv_name_0_0= 'up' ) ) otherlv_1= '(' otherlv_2= 'distance' otherlv_3= '=' ( ( (lv_distanceCST_4_0= ruleEInt ) ) | ( (otherlv_5= RULE_ID ) ) ) otherlv_6= 'temps' otherlv_7= '=' ( ( (lv_tempsCST_8_0= ruleEInt ) ) | ( (otherlv_9= RULE_ID ) ) ) otherlv_10= ')' )
            // InternalDrn.g:2148:3: ( (lv_name_0_0= 'up' ) ) otherlv_1= '(' otherlv_2= 'distance' otherlv_3= '=' ( ( (lv_distanceCST_4_0= ruleEInt ) ) | ( (otherlv_5= RULE_ID ) ) ) otherlv_6= 'temps' otherlv_7= '=' ( ( (lv_tempsCST_8_0= ruleEInt ) ) | ( (otherlv_9= RULE_ID ) ) ) otherlv_10= ')'
            {
            // InternalDrn.g:2148:3: ( (lv_name_0_0= 'up' ) )
            // InternalDrn.g:2149:4: (lv_name_0_0= 'up' )
            {
            // InternalDrn.g:2149:4: (lv_name_0_0= 'up' )
            // InternalDrn.g:2150:5: lv_name_0_0= 'up'
            {
            lv_name_0_0=(Token)match(input,32,FOLLOW_13); 

            					newLeafNode(lv_name_0_0, grammarAccess.getUPAccess().getNameUpKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUPRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "up");
            				

            }


            }

            otherlv_1=(Token)match(input,20,FOLLOW_27); 

            			newLeafNode(otherlv_1, grammarAccess.getUPAccess().getLeftParenthesisKeyword_1());
            		
            otherlv_2=(Token)match(input,27,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getUPAccess().getDistanceKeyword_2());
            		
            otherlv_3=(Token)match(input,14,FOLLOW_19); 

            			newLeafNode(otherlv_3, grammarAccess.getUPAccess().getEqualsSignKeyword_3());
            		
            // InternalDrn.g:2174:3: ( ( (lv_distanceCST_4_0= ruleEInt ) ) | ( (otherlv_5= RULE_ID ) ) )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==RULE_INT||LA34_0==58) ) {
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
                    // InternalDrn.g:2175:4: ( (lv_distanceCST_4_0= ruleEInt ) )
                    {
                    // InternalDrn.g:2175:4: ( (lv_distanceCST_4_0= ruleEInt ) )
                    // InternalDrn.g:2176:5: (lv_distanceCST_4_0= ruleEInt )
                    {
                    // InternalDrn.g:2176:5: (lv_distanceCST_4_0= ruleEInt )
                    // InternalDrn.g:2177:6: lv_distanceCST_4_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getUPAccess().getDistanceCSTEIntParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_28);
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
                    // InternalDrn.g:2195:4: ( (otherlv_5= RULE_ID ) )
                    {
                    // InternalDrn.g:2195:4: ( (otherlv_5= RULE_ID ) )
                    // InternalDrn.g:2196:5: (otherlv_5= RULE_ID )
                    {
                    // InternalDrn.g:2196:5: (otherlv_5= RULE_ID )
                    // InternalDrn.g:2197:6: otherlv_5= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getUPRule());
                    						}
                    					
                    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_28); 

                    						newLeafNode(otherlv_5, grammarAccess.getUPAccess().getDistanceVarParametreCrossReference_4_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,28,FOLLOW_6); 

            			newLeafNode(otherlv_6, grammarAccess.getUPAccess().getTempsKeyword_5());
            		
            otherlv_7=(Token)match(input,14,FOLLOW_19); 

            			newLeafNode(otherlv_7, grammarAccess.getUPAccess().getEqualsSignKeyword_6());
            		
            // InternalDrn.g:2217:3: ( ( (lv_tempsCST_8_0= ruleEInt ) ) | ( (otherlv_9= RULE_ID ) ) )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==RULE_INT||LA35_0==58) ) {
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
                    // InternalDrn.g:2218:4: ( (lv_tempsCST_8_0= ruleEInt ) )
                    {
                    // InternalDrn.g:2218:4: ( (lv_tempsCST_8_0= ruleEInt ) )
                    // InternalDrn.g:2219:5: (lv_tempsCST_8_0= ruleEInt )
                    {
                    // InternalDrn.g:2219:5: (lv_tempsCST_8_0= ruleEInt )
                    // InternalDrn.g:2220:6: lv_tempsCST_8_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getUPAccess().getTempsCSTEIntParserRuleCall_7_0_0());
                    					
                    pushFollow(FOLLOW_29);
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
                    // InternalDrn.g:2238:4: ( (otherlv_9= RULE_ID ) )
                    {
                    // InternalDrn.g:2238:4: ( (otherlv_9= RULE_ID ) )
                    // InternalDrn.g:2239:5: (otherlv_9= RULE_ID )
                    {
                    // InternalDrn.g:2239:5: (otherlv_9= RULE_ID )
                    // InternalDrn.g:2240:6: otherlv_9= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getUPRule());
                    						}
                    					
                    otherlv_9=(Token)match(input,RULE_ID,FOLLOW_29); 

                    						newLeafNode(otherlv_9, grammarAccess.getUPAccess().getTempsVARParametreCrossReference_7_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,22,FOLLOW_2); 

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
    // InternalDrn.g:2260:1: entryRuleDOWN returns [EObject current=null] : iv_ruleDOWN= ruleDOWN EOF ;
    public final EObject entryRuleDOWN() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDOWN = null;


        try {
            // InternalDrn.g:2260:45: (iv_ruleDOWN= ruleDOWN EOF )
            // InternalDrn.g:2261:2: iv_ruleDOWN= ruleDOWN EOF
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
    // InternalDrn.g:2267:1: ruleDOWN returns [EObject current=null] : ( ( (lv_name_0_0= 'down' ) ) otherlv_1= '(' otherlv_2= 'distance' otherlv_3= '=' ( ( (lv_distanceCST_4_0= ruleEInt ) ) | ( (otherlv_5= RULE_ID ) ) ) otherlv_6= 'temps' otherlv_7= '=' ( ( (lv_tempsCST_8_0= ruleEInt ) ) | ( (otherlv_9= RULE_ID ) ) ) otherlv_10= ')' ) ;
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
            // InternalDrn.g:2273:2: ( ( ( (lv_name_0_0= 'down' ) ) otherlv_1= '(' otherlv_2= 'distance' otherlv_3= '=' ( ( (lv_distanceCST_4_0= ruleEInt ) ) | ( (otherlv_5= RULE_ID ) ) ) otherlv_6= 'temps' otherlv_7= '=' ( ( (lv_tempsCST_8_0= ruleEInt ) ) | ( (otherlv_9= RULE_ID ) ) ) otherlv_10= ')' ) )
            // InternalDrn.g:2274:2: ( ( (lv_name_0_0= 'down' ) ) otherlv_1= '(' otherlv_2= 'distance' otherlv_3= '=' ( ( (lv_distanceCST_4_0= ruleEInt ) ) | ( (otherlv_5= RULE_ID ) ) ) otherlv_6= 'temps' otherlv_7= '=' ( ( (lv_tempsCST_8_0= ruleEInt ) ) | ( (otherlv_9= RULE_ID ) ) ) otherlv_10= ')' )
            {
            // InternalDrn.g:2274:2: ( ( (lv_name_0_0= 'down' ) ) otherlv_1= '(' otherlv_2= 'distance' otherlv_3= '=' ( ( (lv_distanceCST_4_0= ruleEInt ) ) | ( (otherlv_5= RULE_ID ) ) ) otherlv_6= 'temps' otherlv_7= '=' ( ( (lv_tempsCST_8_0= ruleEInt ) ) | ( (otherlv_9= RULE_ID ) ) ) otherlv_10= ')' )
            // InternalDrn.g:2275:3: ( (lv_name_0_0= 'down' ) ) otherlv_1= '(' otherlv_2= 'distance' otherlv_3= '=' ( ( (lv_distanceCST_4_0= ruleEInt ) ) | ( (otherlv_5= RULE_ID ) ) ) otherlv_6= 'temps' otherlv_7= '=' ( ( (lv_tempsCST_8_0= ruleEInt ) ) | ( (otherlv_9= RULE_ID ) ) ) otherlv_10= ')'
            {
            // InternalDrn.g:2275:3: ( (lv_name_0_0= 'down' ) )
            // InternalDrn.g:2276:4: (lv_name_0_0= 'down' )
            {
            // InternalDrn.g:2276:4: (lv_name_0_0= 'down' )
            // InternalDrn.g:2277:5: lv_name_0_0= 'down'
            {
            lv_name_0_0=(Token)match(input,33,FOLLOW_13); 

            					newLeafNode(lv_name_0_0, grammarAccess.getDOWNAccess().getNameDownKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDOWNRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "down");
            				

            }


            }

            otherlv_1=(Token)match(input,20,FOLLOW_27); 

            			newLeafNode(otherlv_1, grammarAccess.getDOWNAccess().getLeftParenthesisKeyword_1());
            		
            otherlv_2=(Token)match(input,27,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getDOWNAccess().getDistanceKeyword_2());
            		
            otherlv_3=(Token)match(input,14,FOLLOW_19); 

            			newLeafNode(otherlv_3, grammarAccess.getDOWNAccess().getEqualsSignKeyword_3());
            		
            // InternalDrn.g:2301:3: ( ( (lv_distanceCST_4_0= ruleEInt ) ) | ( (otherlv_5= RULE_ID ) ) )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==RULE_INT||LA36_0==58) ) {
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
                    // InternalDrn.g:2302:4: ( (lv_distanceCST_4_0= ruleEInt ) )
                    {
                    // InternalDrn.g:2302:4: ( (lv_distanceCST_4_0= ruleEInt ) )
                    // InternalDrn.g:2303:5: (lv_distanceCST_4_0= ruleEInt )
                    {
                    // InternalDrn.g:2303:5: (lv_distanceCST_4_0= ruleEInt )
                    // InternalDrn.g:2304:6: lv_distanceCST_4_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getDOWNAccess().getDistanceCSTEIntParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_28);
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
                    // InternalDrn.g:2322:4: ( (otherlv_5= RULE_ID ) )
                    {
                    // InternalDrn.g:2322:4: ( (otherlv_5= RULE_ID ) )
                    // InternalDrn.g:2323:5: (otherlv_5= RULE_ID )
                    {
                    // InternalDrn.g:2323:5: (otherlv_5= RULE_ID )
                    // InternalDrn.g:2324:6: otherlv_5= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDOWNRule());
                    						}
                    					
                    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_28); 

                    						newLeafNode(otherlv_5, grammarAccess.getDOWNAccess().getDistanceVarParametreCrossReference_4_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,28,FOLLOW_6); 

            			newLeafNode(otherlv_6, grammarAccess.getDOWNAccess().getTempsKeyword_5());
            		
            otherlv_7=(Token)match(input,14,FOLLOW_19); 

            			newLeafNode(otherlv_7, grammarAccess.getDOWNAccess().getEqualsSignKeyword_6());
            		
            // InternalDrn.g:2344:3: ( ( (lv_tempsCST_8_0= ruleEInt ) ) | ( (otherlv_9= RULE_ID ) ) )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==RULE_INT||LA37_0==58) ) {
                alt37=1;
            }
            else if ( (LA37_0==RULE_ID) ) {
                alt37=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }
            switch (alt37) {
                case 1 :
                    // InternalDrn.g:2345:4: ( (lv_tempsCST_8_0= ruleEInt ) )
                    {
                    // InternalDrn.g:2345:4: ( (lv_tempsCST_8_0= ruleEInt ) )
                    // InternalDrn.g:2346:5: (lv_tempsCST_8_0= ruleEInt )
                    {
                    // InternalDrn.g:2346:5: (lv_tempsCST_8_0= ruleEInt )
                    // InternalDrn.g:2347:6: lv_tempsCST_8_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getDOWNAccess().getTempsCSTEIntParserRuleCall_7_0_0());
                    					
                    pushFollow(FOLLOW_29);
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
                    // InternalDrn.g:2365:4: ( (otherlv_9= RULE_ID ) )
                    {
                    // InternalDrn.g:2365:4: ( (otherlv_9= RULE_ID ) )
                    // InternalDrn.g:2366:5: (otherlv_9= RULE_ID )
                    {
                    // InternalDrn.g:2366:5: (otherlv_9= RULE_ID )
                    // InternalDrn.g:2367:6: otherlv_9= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDOWNRule());
                    						}
                    					
                    otherlv_9=(Token)match(input,RULE_ID,FOLLOW_29); 

                    						newLeafNode(otherlv_9, grammarAccess.getDOWNAccess().getTempsVARParametreCrossReference_7_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,22,FOLLOW_2); 

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
    // InternalDrn.g:2387:1: entryRuleDepXY_IMPL returns [EObject current=null] : iv_ruleDepXY_IMPL= ruleDepXY_IMPL EOF ;
    public final EObject entryRuleDepXY_IMPL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDepXY_IMPL = null;


        try {
            // InternalDrn.g:2387:51: (iv_ruleDepXY_IMPL= ruleDepXY_IMPL EOF )
            // InternalDrn.g:2388:2: iv_ruleDepXY_IMPL= ruleDepXY_IMPL EOF
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
    // InternalDrn.g:2394:1: ruleDepXY_IMPL returns [EObject current=null] : (this_DepXY_0= ruleDepXY | this_CERCLEXY_1= ruleCERCLEXY | this_CARREXY_2= ruleCARREXY ) ;
    public final EObject ruleDepXY_IMPL() throws RecognitionException {
        EObject current = null;

        EObject this_DepXY_0 = null;

        EObject this_CERCLEXY_1 = null;

        EObject this_CARREXY_2 = null;



        	enterRule();

        try {
            // InternalDrn.g:2400:2: ( (this_DepXY_0= ruleDepXY | this_CERCLEXY_1= ruleCERCLEXY | this_CARREXY_2= ruleCARREXY ) )
            // InternalDrn.g:2401:2: (this_DepXY_0= ruleDepXY | this_CERCLEXY_1= ruleCERCLEXY | this_CARREXY_2= ruleCARREXY )
            {
            // InternalDrn.g:2401:2: (this_DepXY_0= ruleDepXY | this_CERCLEXY_1= ruleCERCLEXY | this_CARREXY_2= ruleCARREXY )
            int alt38=3;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt38=1;
                }
                break;
            case 35:
                {
                alt38=2;
                }
                break;
            case 37:
                {
                alt38=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }

            switch (alt38) {
                case 1 :
                    // InternalDrn.g:2402:3: this_DepXY_0= ruleDepXY
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
                    // InternalDrn.g:2411:3: this_CERCLEXY_1= ruleCERCLEXY
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
                    // InternalDrn.g:2420:3: this_CARREXY_2= ruleCARREXY
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
    // InternalDrn.g:2432:1: entryRuleDepXY returns [EObject current=null] : iv_ruleDepXY= ruleDepXY EOF ;
    public final EObject entryRuleDepXY() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDepXY = null;


        try {
            // InternalDrn.g:2432:46: (iv_ruleDepXY= ruleDepXY EOF )
            // InternalDrn.g:2433:2: iv_ruleDepXY= ruleDepXY EOF
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
    // InternalDrn.g:2439:1: ruleDepXY returns [EObject current=null] : ( ( (lv_name_0_0= 'depXY' ) ) otherlv_1= '(' otherlv_2= 'distance' otherlv_3= '=' ( ( (lv_distanceCST_4_0= ruleEInt ) ) | ( (otherlv_5= RULE_ID ) ) ) otherlv_6= 'temps' otherlv_7= '=' ( ( (lv_tempsCST_8_0= ruleEInt ) ) | ( (otherlv_9= RULE_ID ) ) ) otherlv_10= ')' ) ;
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
            // InternalDrn.g:2445:2: ( ( ( (lv_name_0_0= 'depXY' ) ) otherlv_1= '(' otherlv_2= 'distance' otherlv_3= '=' ( ( (lv_distanceCST_4_0= ruleEInt ) ) | ( (otherlv_5= RULE_ID ) ) ) otherlv_6= 'temps' otherlv_7= '=' ( ( (lv_tempsCST_8_0= ruleEInt ) ) | ( (otherlv_9= RULE_ID ) ) ) otherlv_10= ')' ) )
            // InternalDrn.g:2446:2: ( ( (lv_name_0_0= 'depXY' ) ) otherlv_1= '(' otherlv_2= 'distance' otherlv_3= '=' ( ( (lv_distanceCST_4_0= ruleEInt ) ) | ( (otherlv_5= RULE_ID ) ) ) otherlv_6= 'temps' otherlv_7= '=' ( ( (lv_tempsCST_8_0= ruleEInt ) ) | ( (otherlv_9= RULE_ID ) ) ) otherlv_10= ')' )
            {
            // InternalDrn.g:2446:2: ( ( (lv_name_0_0= 'depXY' ) ) otherlv_1= '(' otherlv_2= 'distance' otherlv_3= '=' ( ( (lv_distanceCST_4_0= ruleEInt ) ) | ( (otherlv_5= RULE_ID ) ) ) otherlv_6= 'temps' otherlv_7= '=' ( ( (lv_tempsCST_8_0= ruleEInt ) ) | ( (otherlv_9= RULE_ID ) ) ) otherlv_10= ')' )
            // InternalDrn.g:2447:3: ( (lv_name_0_0= 'depXY' ) ) otherlv_1= '(' otherlv_2= 'distance' otherlv_3= '=' ( ( (lv_distanceCST_4_0= ruleEInt ) ) | ( (otherlv_5= RULE_ID ) ) ) otherlv_6= 'temps' otherlv_7= '=' ( ( (lv_tempsCST_8_0= ruleEInt ) ) | ( (otherlv_9= RULE_ID ) ) ) otherlv_10= ')'
            {
            // InternalDrn.g:2447:3: ( (lv_name_0_0= 'depXY' ) )
            // InternalDrn.g:2448:4: (lv_name_0_0= 'depXY' )
            {
            // InternalDrn.g:2448:4: (lv_name_0_0= 'depXY' )
            // InternalDrn.g:2449:5: lv_name_0_0= 'depXY'
            {
            lv_name_0_0=(Token)match(input,34,FOLLOW_13); 

            					newLeafNode(lv_name_0_0, grammarAccess.getDepXYAccess().getNameDepXYKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDepXYRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "depXY");
            				

            }


            }

            otherlv_1=(Token)match(input,20,FOLLOW_27); 

            			newLeafNode(otherlv_1, grammarAccess.getDepXYAccess().getLeftParenthesisKeyword_1());
            		
            otherlv_2=(Token)match(input,27,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getDepXYAccess().getDistanceKeyword_2());
            		
            otherlv_3=(Token)match(input,14,FOLLOW_19); 

            			newLeafNode(otherlv_3, grammarAccess.getDepXYAccess().getEqualsSignKeyword_3());
            		
            // InternalDrn.g:2473:3: ( ( (lv_distanceCST_4_0= ruleEInt ) ) | ( (otherlv_5= RULE_ID ) ) )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==RULE_INT||LA39_0==58) ) {
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
                    // InternalDrn.g:2474:4: ( (lv_distanceCST_4_0= ruleEInt ) )
                    {
                    // InternalDrn.g:2474:4: ( (lv_distanceCST_4_0= ruleEInt ) )
                    // InternalDrn.g:2475:5: (lv_distanceCST_4_0= ruleEInt )
                    {
                    // InternalDrn.g:2475:5: (lv_distanceCST_4_0= ruleEInt )
                    // InternalDrn.g:2476:6: lv_distanceCST_4_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getDepXYAccess().getDistanceCSTEIntParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_28);
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
                    // InternalDrn.g:2494:4: ( (otherlv_5= RULE_ID ) )
                    {
                    // InternalDrn.g:2494:4: ( (otherlv_5= RULE_ID ) )
                    // InternalDrn.g:2495:5: (otherlv_5= RULE_ID )
                    {
                    // InternalDrn.g:2495:5: (otherlv_5= RULE_ID )
                    // InternalDrn.g:2496:6: otherlv_5= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDepXYRule());
                    						}
                    					
                    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_28); 

                    						newLeafNode(otherlv_5, grammarAccess.getDepXYAccess().getDistanceVarParametreCrossReference_4_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,28,FOLLOW_6); 

            			newLeafNode(otherlv_6, grammarAccess.getDepXYAccess().getTempsKeyword_5());
            		
            otherlv_7=(Token)match(input,14,FOLLOW_19); 

            			newLeafNode(otherlv_7, grammarAccess.getDepXYAccess().getEqualsSignKeyword_6());
            		
            // InternalDrn.g:2516:3: ( ( (lv_tempsCST_8_0= ruleEInt ) ) | ( (otherlv_9= RULE_ID ) ) )
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==RULE_INT||LA40_0==58) ) {
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
                    // InternalDrn.g:2517:4: ( (lv_tempsCST_8_0= ruleEInt ) )
                    {
                    // InternalDrn.g:2517:4: ( (lv_tempsCST_8_0= ruleEInt ) )
                    // InternalDrn.g:2518:5: (lv_tempsCST_8_0= ruleEInt )
                    {
                    // InternalDrn.g:2518:5: (lv_tempsCST_8_0= ruleEInt )
                    // InternalDrn.g:2519:6: lv_tempsCST_8_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getDepXYAccess().getTempsCSTEIntParserRuleCall_7_0_0());
                    					
                    pushFollow(FOLLOW_29);
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
                    // InternalDrn.g:2537:4: ( (otherlv_9= RULE_ID ) )
                    {
                    // InternalDrn.g:2537:4: ( (otherlv_9= RULE_ID ) )
                    // InternalDrn.g:2538:5: (otherlv_9= RULE_ID )
                    {
                    // InternalDrn.g:2538:5: (otherlv_9= RULE_ID )
                    // InternalDrn.g:2539:6: otherlv_9= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDepXYRule());
                    						}
                    					
                    otherlv_9=(Token)match(input,RULE_ID,FOLLOW_29); 

                    						newLeafNode(otherlv_9, grammarAccess.getDepXYAccess().getTempsVARParametreCrossReference_7_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,22,FOLLOW_2); 

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
    // InternalDrn.g:2559:1: entryRuleCERCLEXY returns [EObject current=null] : iv_ruleCERCLEXY= ruleCERCLEXY EOF ;
    public final EObject entryRuleCERCLEXY() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCERCLEXY = null;


        try {
            // InternalDrn.g:2559:49: (iv_ruleCERCLEXY= ruleCERCLEXY EOF )
            // InternalDrn.g:2560:2: iv_ruleCERCLEXY= ruleCERCLEXY EOF
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
    // InternalDrn.g:2566:1: ruleCERCLEXY returns [EObject current=null] : ( ( (lv_name_0_0= 'cercleXY' ) ) otherlv_1= '(' otherlv_2= 'rayon' otherlv_3= '=' ( ( (lv_rayonCST_4_0= ruleEInt ) ) | ( (otherlv_5= RULE_ID ) ) ) otherlv_6= 'temps' otherlv_7= '=' ( ( (lv_tempsCST_8_0= ruleEInt ) ) | ( (otherlv_9= RULE_ID ) ) ) otherlv_10= ')' ) ;
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
            // InternalDrn.g:2572:2: ( ( ( (lv_name_0_0= 'cercleXY' ) ) otherlv_1= '(' otherlv_2= 'rayon' otherlv_3= '=' ( ( (lv_rayonCST_4_0= ruleEInt ) ) | ( (otherlv_5= RULE_ID ) ) ) otherlv_6= 'temps' otherlv_7= '=' ( ( (lv_tempsCST_8_0= ruleEInt ) ) | ( (otherlv_9= RULE_ID ) ) ) otherlv_10= ')' ) )
            // InternalDrn.g:2573:2: ( ( (lv_name_0_0= 'cercleXY' ) ) otherlv_1= '(' otherlv_2= 'rayon' otherlv_3= '=' ( ( (lv_rayonCST_4_0= ruleEInt ) ) | ( (otherlv_5= RULE_ID ) ) ) otherlv_6= 'temps' otherlv_7= '=' ( ( (lv_tempsCST_8_0= ruleEInt ) ) | ( (otherlv_9= RULE_ID ) ) ) otherlv_10= ')' )
            {
            // InternalDrn.g:2573:2: ( ( (lv_name_0_0= 'cercleXY' ) ) otherlv_1= '(' otherlv_2= 'rayon' otherlv_3= '=' ( ( (lv_rayonCST_4_0= ruleEInt ) ) | ( (otherlv_5= RULE_ID ) ) ) otherlv_6= 'temps' otherlv_7= '=' ( ( (lv_tempsCST_8_0= ruleEInt ) ) | ( (otherlv_9= RULE_ID ) ) ) otherlv_10= ')' )
            // InternalDrn.g:2574:3: ( (lv_name_0_0= 'cercleXY' ) ) otherlv_1= '(' otherlv_2= 'rayon' otherlv_3= '=' ( ( (lv_rayonCST_4_0= ruleEInt ) ) | ( (otherlv_5= RULE_ID ) ) ) otherlv_6= 'temps' otherlv_7= '=' ( ( (lv_tempsCST_8_0= ruleEInt ) ) | ( (otherlv_9= RULE_ID ) ) ) otherlv_10= ')'
            {
            // InternalDrn.g:2574:3: ( (lv_name_0_0= 'cercleXY' ) )
            // InternalDrn.g:2575:4: (lv_name_0_0= 'cercleXY' )
            {
            // InternalDrn.g:2575:4: (lv_name_0_0= 'cercleXY' )
            // InternalDrn.g:2576:5: lv_name_0_0= 'cercleXY'
            {
            lv_name_0_0=(Token)match(input,35,FOLLOW_13); 

            					newLeafNode(lv_name_0_0, grammarAccess.getCERCLEXYAccess().getNameCercleXYKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCERCLEXYRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "cercleXY");
            				

            }


            }

            otherlv_1=(Token)match(input,20,FOLLOW_30); 

            			newLeafNode(otherlv_1, grammarAccess.getCERCLEXYAccess().getLeftParenthesisKeyword_1());
            		
            otherlv_2=(Token)match(input,36,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getCERCLEXYAccess().getRayonKeyword_2());
            		
            otherlv_3=(Token)match(input,14,FOLLOW_19); 

            			newLeafNode(otherlv_3, grammarAccess.getCERCLEXYAccess().getEqualsSignKeyword_3());
            		
            // InternalDrn.g:2600:3: ( ( (lv_rayonCST_4_0= ruleEInt ) ) | ( (otherlv_5= RULE_ID ) ) )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==RULE_INT||LA41_0==58) ) {
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
                    // InternalDrn.g:2601:4: ( (lv_rayonCST_4_0= ruleEInt ) )
                    {
                    // InternalDrn.g:2601:4: ( (lv_rayonCST_4_0= ruleEInt ) )
                    // InternalDrn.g:2602:5: (lv_rayonCST_4_0= ruleEInt )
                    {
                    // InternalDrn.g:2602:5: (lv_rayonCST_4_0= ruleEInt )
                    // InternalDrn.g:2603:6: lv_rayonCST_4_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getCERCLEXYAccess().getRayonCSTEIntParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_28);
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
                    // InternalDrn.g:2621:4: ( (otherlv_5= RULE_ID ) )
                    {
                    // InternalDrn.g:2621:4: ( (otherlv_5= RULE_ID ) )
                    // InternalDrn.g:2622:5: (otherlv_5= RULE_ID )
                    {
                    // InternalDrn.g:2622:5: (otherlv_5= RULE_ID )
                    // InternalDrn.g:2623:6: otherlv_5= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCERCLEXYRule());
                    						}
                    					
                    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_28); 

                    						newLeafNode(otherlv_5, grammarAccess.getCERCLEXYAccess().getRayonVarParametreCrossReference_4_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,28,FOLLOW_6); 

            			newLeafNode(otherlv_6, grammarAccess.getCERCLEXYAccess().getTempsKeyword_5());
            		
            otherlv_7=(Token)match(input,14,FOLLOW_19); 

            			newLeafNode(otherlv_7, grammarAccess.getCERCLEXYAccess().getEqualsSignKeyword_6());
            		
            // InternalDrn.g:2643:3: ( ( (lv_tempsCST_8_0= ruleEInt ) ) | ( (otherlv_9= RULE_ID ) ) )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==RULE_INT||LA42_0==58) ) {
                alt42=1;
            }
            else if ( (LA42_0==RULE_ID) ) {
                alt42=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }
            switch (alt42) {
                case 1 :
                    // InternalDrn.g:2644:4: ( (lv_tempsCST_8_0= ruleEInt ) )
                    {
                    // InternalDrn.g:2644:4: ( (lv_tempsCST_8_0= ruleEInt ) )
                    // InternalDrn.g:2645:5: (lv_tempsCST_8_0= ruleEInt )
                    {
                    // InternalDrn.g:2645:5: (lv_tempsCST_8_0= ruleEInt )
                    // InternalDrn.g:2646:6: lv_tempsCST_8_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getCERCLEXYAccess().getTempsCSTEIntParserRuleCall_7_0_0());
                    					
                    pushFollow(FOLLOW_29);
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
                    // InternalDrn.g:2664:4: ( (otherlv_9= RULE_ID ) )
                    {
                    // InternalDrn.g:2664:4: ( (otherlv_9= RULE_ID ) )
                    // InternalDrn.g:2665:5: (otherlv_9= RULE_ID )
                    {
                    // InternalDrn.g:2665:5: (otherlv_9= RULE_ID )
                    // InternalDrn.g:2666:6: otherlv_9= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCERCLEXYRule());
                    						}
                    					
                    otherlv_9=(Token)match(input,RULE_ID,FOLLOW_29); 

                    						newLeafNode(otherlv_9, grammarAccess.getCERCLEXYAccess().getTempsVARParametreCrossReference_7_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,22,FOLLOW_2); 

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
    // InternalDrn.g:2686:1: entryRuleCARREXY returns [EObject current=null] : iv_ruleCARREXY= ruleCARREXY EOF ;
    public final EObject entryRuleCARREXY() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCARREXY = null;


        try {
            // InternalDrn.g:2686:48: (iv_ruleCARREXY= ruleCARREXY EOF )
            // InternalDrn.g:2687:2: iv_ruleCARREXY= ruleCARREXY EOF
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
    // InternalDrn.g:2693:1: ruleCARREXY returns [EObject current=null] : ( ( (lv_name_0_0= 'carreXY' ) ) otherlv_1= '(' otherlv_2= 'cote' otherlv_3= '=' ( ( (lv_coteCST_4_0= ruleEInt ) ) | ( (otherlv_5= RULE_ID ) ) ) otherlv_6= 'temps' otherlv_7= '=' ( ( (lv_tempsCST_8_0= ruleEInt ) ) | ( (otherlv_9= RULE_ID ) ) ) otherlv_10= ')' ) ;
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
            // InternalDrn.g:2699:2: ( ( ( (lv_name_0_0= 'carreXY' ) ) otherlv_1= '(' otherlv_2= 'cote' otherlv_3= '=' ( ( (lv_coteCST_4_0= ruleEInt ) ) | ( (otherlv_5= RULE_ID ) ) ) otherlv_6= 'temps' otherlv_7= '=' ( ( (lv_tempsCST_8_0= ruleEInt ) ) | ( (otherlv_9= RULE_ID ) ) ) otherlv_10= ')' ) )
            // InternalDrn.g:2700:2: ( ( (lv_name_0_0= 'carreXY' ) ) otherlv_1= '(' otherlv_2= 'cote' otherlv_3= '=' ( ( (lv_coteCST_4_0= ruleEInt ) ) | ( (otherlv_5= RULE_ID ) ) ) otherlv_6= 'temps' otherlv_7= '=' ( ( (lv_tempsCST_8_0= ruleEInt ) ) | ( (otherlv_9= RULE_ID ) ) ) otherlv_10= ')' )
            {
            // InternalDrn.g:2700:2: ( ( (lv_name_0_0= 'carreXY' ) ) otherlv_1= '(' otherlv_2= 'cote' otherlv_3= '=' ( ( (lv_coteCST_4_0= ruleEInt ) ) | ( (otherlv_5= RULE_ID ) ) ) otherlv_6= 'temps' otherlv_7= '=' ( ( (lv_tempsCST_8_0= ruleEInt ) ) | ( (otherlv_9= RULE_ID ) ) ) otherlv_10= ')' )
            // InternalDrn.g:2701:3: ( (lv_name_0_0= 'carreXY' ) ) otherlv_1= '(' otherlv_2= 'cote' otherlv_3= '=' ( ( (lv_coteCST_4_0= ruleEInt ) ) | ( (otherlv_5= RULE_ID ) ) ) otherlv_6= 'temps' otherlv_7= '=' ( ( (lv_tempsCST_8_0= ruleEInt ) ) | ( (otherlv_9= RULE_ID ) ) ) otherlv_10= ')'
            {
            // InternalDrn.g:2701:3: ( (lv_name_0_0= 'carreXY' ) )
            // InternalDrn.g:2702:4: (lv_name_0_0= 'carreXY' )
            {
            // InternalDrn.g:2702:4: (lv_name_0_0= 'carreXY' )
            // InternalDrn.g:2703:5: lv_name_0_0= 'carreXY'
            {
            lv_name_0_0=(Token)match(input,37,FOLLOW_13); 

            					newLeafNode(lv_name_0_0, grammarAccess.getCARREXYAccess().getNameCarreXYKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCARREXYRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "carreXY");
            				

            }


            }

            otherlv_1=(Token)match(input,20,FOLLOW_31); 

            			newLeafNode(otherlv_1, grammarAccess.getCARREXYAccess().getLeftParenthesisKeyword_1());
            		
            otherlv_2=(Token)match(input,38,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getCARREXYAccess().getCoteKeyword_2());
            		
            otherlv_3=(Token)match(input,14,FOLLOW_19); 

            			newLeafNode(otherlv_3, grammarAccess.getCARREXYAccess().getEqualsSignKeyword_3());
            		
            // InternalDrn.g:2727:3: ( ( (lv_coteCST_4_0= ruleEInt ) ) | ( (otherlv_5= RULE_ID ) ) )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==RULE_INT||LA43_0==58) ) {
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
                    // InternalDrn.g:2728:4: ( (lv_coteCST_4_0= ruleEInt ) )
                    {
                    // InternalDrn.g:2728:4: ( (lv_coteCST_4_0= ruleEInt ) )
                    // InternalDrn.g:2729:5: (lv_coteCST_4_0= ruleEInt )
                    {
                    // InternalDrn.g:2729:5: (lv_coteCST_4_0= ruleEInt )
                    // InternalDrn.g:2730:6: lv_coteCST_4_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getCARREXYAccess().getCoteCSTEIntParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_28);
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
                    // InternalDrn.g:2748:4: ( (otherlv_5= RULE_ID ) )
                    {
                    // InternalDrn.g:2748:4: ( (otherlv_5= RULE_ID ) )
                    // InternalDrn.g:2749:5: (otherlv_5= RULE_ID )
                    {
                    // InternalDrn.g:2749:5: (otherlv_5= RULE_ID )
                    // InternalDrn.g:2750:6: otherlv_5= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCARREXYRule());
                    						}
                    					
                    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_28); 

                    						newLeafNode(otherlv_5, grammarAccess.getCARREXYAccess().getCoteVARParametreCrossReference_4_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,28,FOLLOW_6); 

            			newLeafNode(otherlv_6, grammarAccess.getCARREXYAccess().getTempsKeyword_5());
            		
            otherlv_7=(Token)match(input,14,FOLLOW_19); 

            			newLeafNode(otherlv_7, grammarAccess.getCARREXYAccess().getEqualsSignKeyword_6());
            		
            // InternalDrn.g:2770:3: ( ( (lv_tempsCST_8_0= ruleEInt ) ) | ( (otherlv_9= RULE_ID ) ) )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==RULE_INT||LA44_0==58) ) {
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
                    // InternalDrn.g:2771:4: ( (lv_tempsCST_8_0= ruleEInt ) )
                    {
                    // InternalDrn.g:2771:4: ( (lv_tempsCST_8_0= ruleEInt ) )
                    // InternalDrn.g:2772:5: (lv_tempsCST_8_0= ruleEInt )
                    {
                    // InternalDrn.g:2772:5: (lv_tempsCST_8_0= ruleEInt )
                    // InternalDrn.g:2773:6: lv_tempsCST_8_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getCARREXYAccess().getTempsCSTEIntParserRuleCall_7_0_0());
                    					
                    pushFollow(FOLLOW_29);
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
                    // InternalDrn.g:2791:4: ( (otherlv_9= RULE_ID ) )
                    {
                    // InternalDrn.g:2791:4: ( (otherlv_9= RULE_ID ) )
                    // InternalDrn.g:2792:5: (otherlv_9= RULE_ID )
                    {
                    // InternalDrn.g:2792:5: (otherlv_9= RULE_ID )
                    // InternalDrn.g:2793:6: otherlv_9= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCARREXYRule());
                    						}
                    					
                    otherlv_9=(Token)match(input,RULE_ID,FOLLOW_29); 

                    						newLeafNode(otherlv_9, grammarAccess.getCARREXYAccess().getTempsVARParametreCrossReference_7_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,22,FOLLOW_2); 

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
    // InternalDrn.g:2813:1: entryRuleDepYZ_IMPL returns [EObject current=null] : iv_ruleDepYZ_IMPL= ruleDepYZ_IMPL EOF ;
    public final EObject entryRuleDepYZ_IMPL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDepYZ_IMPL = null;


        try {
            // InternalDrn.g:2813:51: (iv_ruleDepYZ_IMPL= ruleDepYZ_IMPL EOF )
            // InternalDrn.g:2814:2: iv_ruleDepYZ_IMPL= ruleDepYZ_IMPL EOF
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
    // InternalDrn.g:2820:1: ruleDepYZ_IMPL returns [EObject current=null] : (this_DepYZ_0= ruleDepYZ | this_CERCLEYZ_1= ruleCERCLEYZ | this_CARREYZ_2= ruleCARREYZ ) ;
    public final EObject ruleDepYZ_IMPL() throws RecognitionException {
        EObject current = null;

        EObject this_DepYZ_0 = null;

        EObject this_CERCLEYZ_1 = null;

        EObject this_CARREYZ_2 = null;



        	enterRule();

        try {
            // InternalDrn.g:2826:2: ( (this_DepYZ_0= ruleDepYZ | this_CERCLEYZ_1= ruleCERCLEYZ | this_CARREYZ_2= ruleCARREYZ ) )
            // InternalDrn.g:2827:2: (this_DepYZ_0= ruleDepYZ | this_CERCLEYZ_1= ruleCERCLEYZ | this_CARREYZ_2= ruleCARREYZ )
            {
            // InternalDrn.g:2827:2: (this_DepYZ_0= ruleDepYZ | this_CERCLEYZ_1= ruleCERCLEYZ | this_CARREYZ_2= ruleCARREYZ )
            int alt45=3;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt45=1;
                }
                break;
            case 40:
                {
                alt45=2;
                }
                break;
            case 41:
                {
                alt45=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }

            switch (alt45) {
                case 1 :
                    // InternalDrn.g:2828:3: this_DepYZ_0= ruleDepYZ
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
                    // InternalDrn.g:2837:3: this_CERCLEYZ_1= ruleCERCLEYZ
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
                    // InternalDrn.g:2846:3: this_CARREYZ_2= ruleCARREYZ
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
    // InternalDrn.g:2858:1: entryRuleDepYZ returns [EObject current=null] : iv_ruleDepYZ= ruleDepYZ EOF ;
    public final EObject entryRuleDepYZ() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDepYZ = null;


        try {
            // InternalDrn.g:2858:46: (iv_ruleDepYZ= ruleDepYZ EOF )
            // InternalDrn.g:2859:2: iv_ruleDepYZ= ruleDepYZ EOF
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
    // InternalDrn.g:2865:1: ruleDepYZ returns [EObject current=null] : ( ( (lv_name_0_0= 'depYZ' ) ) otherlv_1= '(' otherlv_2= 'distance' otherlv_3= '=' ( ( (lv_distanceCST_4_0= ruleEInt ) ) | ( (otherlv_5= RULE_ID ) ) ) otherlv_6= 'temps' otherlv_7= '=' ( ( (lv_tempsCST_8_0= ruleEInt ) ) | ( (otherlv_9= RULE_ID ) ) ) otherlv_10= ')' ) ;
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
            // InternalDrn.g:2871:2: ( ( ( (lv_name_0_0= 'depYZ' ) ) otherlv_1= '(' otherlv_2= 'distance' otherlv_3= '=' ( ( (lv_distanceCST_4_0= ruleEInt ) ) | ( (otherlv_5= RULE_ID ) ) ) otherlv_6= 'temps' otherlv_7= '=' ( ( (lv_tempsCST_8_0= ruleEInt ) ) | ( (otherlv_9= RULE_ID ) ) ) otherlv_10= ')' ) )
            // InternalDrn.g:2872:2: ( ( (lv_name_0_0= 'depYZ' ) ) otherlv_1= '(' otherlv_2= 'distance' otherlv_3= '=' ( ( (lv_distanceCST_4_0= ruleEInt ) ) | ( (otherlv_5= RULE_ID ) ) ) otherlv_6= 'temps' otherlv_7= '=' ( ( (lv_tempsCST_8_0= ruleEInt ) ) | ( (otherlv_9= RULE_ID ) ) ) otherlv_10= ')' )
            {
            // InternalDrn.g:2872:2: ( ( (lv_name_0_0= 'depYZ' ) ) otherlv_1= '(' otherlv_2= 'distance' otherlv_3= '=' ( ( (lv_distanceCST_4_0= ruleEInt ) ) | ( (otherlv_5= RULE_ID ) ) ) otherlv_6= 'temps' otherlv_7= '=' ( ( (lv_tempsCST_8_0= ruleEInt ) ) | ( (otherlv_9= RULE_ID ) ) ) otherlv_10= ')' )
            // InternalDrn.g:2873:3: ( (lv_name_0_0= 'depYZ' ) ) otherlv_1= '(' otherlv_2= 'distance' otherlv_3= '=' ( ( (lv_distanceCST_4_0= ruleEInt ) ) | ( (otherlv_5= RULE_ID ) ) ) otherlv_6= 'temps' otherlv_7= '=' ( ( (lv_tempsCST_8_0= ruleEInt ) ) | ( (otherlv_9= RULE_ID ) ) ) otherlv_10= ')'
            {
            // InternalDrn.g:2873:3: ( (lv_name_0_0= 'depYZ' ) )
            // InternalDrn.g:2874:4: (lv_name_0_0= 'depYZ' )
            {
            // InternalDrn.g:2874:4: (lv_name_0_0= 'depYZ' )
            // InternalDrn.g:2875:5: lv_name_0_0= 'depYZ'
            {
            lv_name_0_0=(Token)match(input,39,FOLLOW_13); 

            					newLeafNode(lv_name_0_0, grammarAccess.getDepYZAccess().getNameDepYZKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDepYZRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "depYZ");
            				

            }


            }

            otherlv_1=(Token)match(input,20,FOLLOW_27); 

            			newLeafNode(otherlv_1, grammarAccess.getDepYZAccess().getLeftParenthesisKeyword_1());
            		
            otherlv_2=(Token)match(input,27,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getDepYZAccess().getDistanceKeyword_2());
            		
            otherlv_3=(Token)match(input,14,FOLLOW_19); 

            			newLeafNode(otherlv_3, grammarAccess.getDepYZAccess().getEqualsSignKeyword_3());
            		
            // InternalDrn.g:2899:3: ( ( (lv_distanceCST_4_0= ruleEInt ) ) | ( (otherlv_5= RULE_ID ) ) )
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==RULE_INT||LA46_0==58) ) {
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
                    // InternalDrn.g:2900:4: ( (lv_distanceCST_4_0= ruleEInt ) )
                    {
                    // InternalDrn.g:2900:4: ( (lv_distanceCST_4_0= ruleEInt ) )
                    // InternalDrn.g:2901:5: (lv_distanceCST_4_0= ruleEInt )
                    {
                    // InternalDrn.g:2901:5: (lv_distanceCST_4_0= ruleEInt )
                    // InternalDrn.g:2902:6: lv_distanceCST_4_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getDepYZAccess().getDistanceCSTEIntParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_28);
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
                    // InternalDrn.g:2920:4: ( (otherlv_5= RULE_ID ) )
                    {
                    // InternalDrn.g:2920:4: ( (otherlv_5= RULE_ID ) )
                    // InternalDrn.g:2921:5: (otherlv_5= RULE_ID )
                    {
                    // InternalDrn.g:2921:5: (otherlv_5= RULE_ID )
                    // InternalDrn.g:2922:6: otherlv_5= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDepYZRule());
                    						}
                    					
                    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_28); 

                    						newLeafNode(otherlv_5, grammarAccess.getDepYZAccess().getDistanceVarParametreCrossReference_4_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,28,FOLLOW_6); 

            			newLeafNode(otherlv_6, grammarAccess.getDepYZAccess().getTempsKeyword_5());
            		
            otherlv_7=(Token)match(input,14,FOLLOW_19); 

            			newLeafNode(otherlv_7, grammarAccess.getDepYZAccess().getEqualsSignKeyword_6());
            		
            // InternalDrn.g:2942:3: ( ( (lv_tempsCST_8_0= ruleEInt ) ) | ( (otherlv_9= RULE_ID ) ) )
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==RULE_INT||LA47_0==58) ) {
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
                    // InternalDrn.g:2943:4: ( (lv_tempsCST_8_0= ruleEInt ) )
                    {
                    // InternalDrn.g:2943:4: ( (lv_tempsCST_8_0= ruleEInt ) )
                    // InternalDrn.g:2944:5: (lv_tempsCST_8_0= ruleEInt )
                    {
                    // InternalDrn.g:2944:5: (lv_tempsCST_8_0= ruleEInt )
                    // InternalDrn.g:2945:6: lv_tempsCST_8_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getDepYZAccess().getTempsCSTEIntParserRuleCall_7_0_0());
                    					
                    pushFollow(FOLLOW_29);
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
                    // InternalDrn.g:2963:4: ( (otherlv_9= RULE_ID ) )
                    {
                    // InternalDrn.g:2963:4: ( (otherlv_9= RULE_ID ) )
                    // InternalDrn.g:2964:5: (otherlv_9= RULE_ID )
                    {
                    // InternalDrn.g:2964:5: (otherlv_9= RULE_ID )
                    // InternalDrn.g:2965:6: otherlv_9= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDepYZRule());
                    						}
                    					
                    otherlv_9=(Token)match(input,RULE_ID,FOLLOW_29); 

                    						newLeafNode(otherlv_9, grammarAccess.getDepYZAccess().getTempsVARParametreCrossReference_7_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,22,FOLLOW_2); 

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
    // InternalDrn.g:2985:1: entryRuleCERCLEYZ returns [EObject current=null] : iv_ruleCERCLEYZ= ruleCERCLEYZ EOF ;
    public final EObject entryRuleCERCLEYZ() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCERCLEYZ = null;


        try {
            // InternalDrn.g:2985:49: (iv_ruleCERCLEYZ= ruleCERCLEYZ EOF )
            // InternalDrn.g:2986:2: iv_ruleCERCLEYZ= ruleCERCLEYZ EOF
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
    // InternalDrn.g:2992:1: ruleCERCLEYZ returns [EObject current=null] : ( ( (lv_name_0_0= 'cercleYZ' ) ) otherlv_1= '(' otherlv_2= 'rayon' otherlv_3= '=' ( ( (lv_rayonCST_4_0= ruleEInt ) ) | ( (otherlv_5= RULE_ID ) ) ) otherlv_6= 'temps' otherlv_7= '=' ( ( (lv_tempsCST_8_0= ruleEInt ) ) | ( (otherlv_9= RULE_ID ) ) ) otherlv_10= ')' ) ;
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
            // InternalDrn.g:2998:2: ( ( ( (lv_name_0_0= 'cercleYZ' ) ) otherlv_1= '(' otherlv_2= 'rayon' otherlv_3= '=' ( ( (lv_rayonCST_4_0= ruleEInt ) ) | ( (otherlv_5= RULE_ID ) ) ) otherlv_6= 'temps' otherlv_7= '=' ( ( (lv_tempsCST_8_0= ruleEInt ) ) | ( (otherlv_9= RULE_ID ) ) ) otherlv_10= ')' ) )
            // InternalDrn.g:2999:2: ( ( (lv_name_0_0= 'cercleYZ' ) ) otherlv_1= '(' otherlv_2= 'rayon' otherlv_3= '=' ( ( (lv_rayonCST_4_0= ruleEInt ) ) | ( (otherlv_5= RULE_ID ) ) ) otherlv_6= 'temps' otherlv_7= '=' ( ( (lv_tempsCST_8_0= ruleEInt ) ) | ( (otherlv_9= RULE_ID ) ) ) otherlv_10= ')' )
            {
            // InternalDrn.g:2999:2: ( ( (lv_name_0_0= 'cercleYZ' ) ) otherlv_1= '(' otherlv_2= 'rayon' otherlv_3= '=' ( ( (lv_rayonCST_4_0= ruleEInt ) ) | ( (otherlv_5= RULE_ID ) ) ) otherlv_6= 'temps' otherlv_7= '=' ( ( (lv_tempsCST_8_0= ruleEInt ) ) | ( (otherlv_9= RULE_ID ) ) ) otherlv_10= ')' )
            // InternalDrn.g:3000:3: ( (lv_name_0_0= 'cercleYZ' ) ) otherlv_1= '(' otherlv_2= 'rayon' otherlv_3= '=' ( ( (lv_rayonCST_4_0= ruleEInt ) ) | ( (otherlv_5= RULE_ID ) ) ) otherlv_6= 'temps' otherlv_7= '=' ( ( (lv_tempsCST_8_0= ruleEInt ) ) | ( (otherlv_9= RULE_ID ) ) ) otherlv_10= ')'
            {
            // InternalDrn.g:3000:3: ( (lv_name_0_0= 'cercleYZ' ) )
            // InternalDrn.g:3001:4: (lv_name_0_0= 'cercleYZ' )
            {
            // InternalDrn.g:3001:4: (lv_name_0_0= 'cercleYZ' )
            // InternalDrn.g:3002:5: lv_name_0_0= 'cercleYZ'
            {
            lv_name_0_0=(Token)match(input,40,FOLLOW_13); 

            					newLeafNode(lv_name_0_0, grammarAccess.getCERCLEYZAccess().getNameCercleYZKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCERCLEYZRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "cercleYZ");
            				

            }


            }

            otherlv_1=(Token)match(input,20,FOLLOW_30); 

            			newLeafNode(otherlv_1, grammarAccess.getCERCLEYZAccess().getLeftParenthesisKeyword_1());
            		
            otherlv_2=(Token)match(input,36,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getCERCLEYZAccess().getRayonKeyword_2());
            		
            otherlv_3=(Token)match(input,14,FOLLOW_19); 

            			newLeafNode(otherlv_3, grammarAccess.getCERCLEYZAccess().getEqualsSignKeyword_3());
            		
            // InternalDrn.g:3026:3: ( ( (lv_rayonCST_4_0= ruleEInt ) ) | ( (otherlv_5= RULE_ID ) ) )
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==RULE_INT||LA48_0==58) ) {
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
                    // InternalDrn.g:3027:4: ( (lv_rayonCST_4_0= ruleEInt ) )
                    {
                    // InternalDrn.g:3027:4: ( (lv_rayonCST_4_0= ruleEInt ) )
                    // InternalDrn.g:3028:5: (lv_rayonCST_4_0= ruleEInt )
                    {
                    // InternalDrn.g:3028:5: (lv_rayonCST_4_0= ruleEInt )
                    // InternalDrn.g:3029:6: lv_rayonCST_4_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getCERCLEYZAccess().getRayonCSTEIntParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_28);
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
                    // InternalDrn.g:3047:4: ( (otherlv_5= RULE_ID ) )
                    {
                    // InternalDrn.g:3047:4: ( (otherlv_5= RULE_ID ) )
                    // InternalDrn.g:3048:5: (otherlv_5= RULE_ID )
                    {
                    // InternalDrn.g:3048:5: (otherlv_5= RULE_ID )
                    // InternalDrn.g:3049:6: otherlv_5= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCERCLEYZRule());
                    						}
                    					
                    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_28); 

                    						newLeafNode(otherlv_5, grammarAccess.getCERCLEYZAccess().getRayonVarParametreCrossReference_4_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,28,FOLLOW_6); 

            			newLeafNode(otherlv_6, grammarAccess.getCERCLEYZAccess().getTempsKeyword_5());
            		
            otherlv_7=(Token)match(input,14,FOLLOW_19); 

            			newLeafNode(otherlv_7, grammarAccess.getCERCLEYZAccess().getEqualsSignKeyword_6());
            		
            // InternalDrn.g:3069:3: ( ( (lv_tempsCST_8_0= ruleEInt ) ) | ( (otherlv_9= RULE_ID ) ) )
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==RULE_INT||LA49_0==58) ) {
                alt49=1;
            }
            else if ( (LA49_0==RULE_ID) ) {
                alt49=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }
            switch (alt49) {
                case 1 :
                    // InternalDrn.g:3070:4: ( (lv_tempsCST_8_0= ruleEInt ) )
                    {
                    // InternalDrn.g:3070:4: ( (lv_tempsCST_8_0= ruleEInt ) )
                    // InternalDrn.g:3071:5: (lv_tempsCST_8_0= ruleEInt )
                    {
                    // InternalDrn.g:3071:5: (lv_tempsCST_8_0= ruleEInt )
                    // InternalDrn.g:3072:6: lv_tempsCST_8_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getCERCLEYZAccess().getTempsCSTEIntParserRuleCall_7_0_0());
                    					
                    pushFollow(FOLLOW_29);
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
                    // InternalDrn.g:3090:4: ( (otherlv_9= RULE_ID ) )
                    {
                    // InternalDrn.g:3090:4: ( (otherlv_9= RULE_ID ) )
                    // InternalDrn.g:3091:5: (otherlv_9= RULE_ID )
                    {
                    // InternalDrn.g:3091:5: (otherlv_9= RULE_ID )
                    // InternalDrn.g:3092:6: otherlv_9= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCERCLEYZRule());
                    						}
                    					
                    otherlv_9=(Token)match(input,RULE_ID,FOLLOW_29); 

                    						newLeafNode(otherlv_9, grammarAccess.getCERCLEYZAccess().getTempsVARParametreCrossReference_7_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,22,FOLLOW_2); 

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
    // InternalDrn.g:3112:1: entryRuleCARREYZ returns [EObject current=null] : iv_ruleCARREYZ= ruleCARREYZ EOF ;
    public final EObject entryRuleCARREYZ() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCARREYZ = null;


        try {
            // InternalDrn.g:3112:48: (iv_ruleCARREYZ= ruleCARREYZ EOF )
            // InternalDrn.g:3113:2: iv_ruleCARREYZ= ruleCARREYZ EOF
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
    // InternalDrn.g:3119:1: ruleCARREYZ returns [EObject current=null] : ( ( (lv_name_0_0= 'carreYZ' ) ) otherlv_1= '(' otherlv_2= 'cote' otherlv_3= '=' ( ( (lv_coteCST_4_0= ruleEInt ) ) | ( (otherlv_5= RULE_ID ) ) ) otherlv_6= 'temps' otherlv_7= '=' ( ( (lv_tempsCST_8_0= ruleEInt ) ) | ( (otherlv_9= RULE_ID ) ) ) otherlv_10= ')' ) ;
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
            // InternalDrn.g:3125:2: ( ( ( (lv_name_0_0= 'carreYZ' ) ) otherlv_1= '(' otherlv_2= 'cote' otherlv_3= '=' ( ( (lv_coteCST_4_0= ruleEInt ) ) | ( (otherlv_5= RULE_ID ) ) ) otherlv_6= 'temps' otherlv_7= '=' ( ( (lv_tempsCST_8_0= ruleEInt ) ) | ( (otherlv_9= RULE_ID ) ) ) otherlv_10= ')' ) )
            // InternalDrn.g:3126:2: ( ( (lv_name_0_0= 'carreYZ' ) ) otherlv_1= '(' otherlv_2= 'cote' otherlv_3= '=' ( ( (lv_coteCST_4_0= ruleEInt ) ) | ( (otherlv_5= RULE_ID ) ) ) otherlv_6= 'temps' otherlv_7= '=' ( ( (lv_tempsCST_8_0= ruleEInt ) ) | ( (otherlv_9= RULE_ID ) ) ) otherlv_10= ')' )
            {
            // InternalDrn.g:3126:2: ( ( (lv_name_0_0= 'carreYZ' ) ) otherlv_1= '(' otherlv_2= 'cote' otherlv_3= '=' ( ( (lv_coteCST_4_0= ruleEInt ) ) | ( (otherlv_5= RULE_ID ) ) ) otherlv_6= 'temps' otherlv_7= '=' ( ( (lv_tempsCST_8_0= ruleEInt ) ) | ( (otherlv_9= RULE_ID ) ) ) otherlv_10= ')' )
            // InternalDrn.g:3127:3: ( (lv_name_0_0= 'carreYZ' ) ) otherlv_1= '(' otherlv_2= 'cote' otherlv_3= '=' ( ( (lv_coteCST_4_0= ruleEInt ) ) | ( (otherlv_5= RULE_ID ) ) ) otherlv_6= 'temps' otherlv_7= '=' ( ( (lv_tempsCST_8_0= ruleEInt ) ) | ( (otherlv_9= RULE_ID ) ) ) otherlv_10= ')'
            {
            // InternalDrn.g:3127:3: ( (lv_name_0_0= 'carreYZ' ) )
            // InternalDrn.g:3128:4: (lv_name_0_0= 'carreYZ' )
            {
            // InternalDrn.g:3128:4: (lv_name_0_0= 'carreYZ' )
            // InternalDrn.g:3129:5: lv_name_0_0= 'carreYZ'
            {
            lv_name_0_0=(Token)match(input,41,FOLLOW_13); 

            					newLeafNode(lv_name_0_0, grammarAccess.getCARREYZAccess().getNameCarreYZKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCARREYZRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "carreYZ");
            				

            }


            }

            otherlv_1=(Token)match(input,20,FOLLOW_31); 

            			newLeafNode(otherlv_1, grammarAccess.getCARREYZAccess().getLeftParenthesisKeyword_1());
            		
            otherlv_2=(Token)match(input,38,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getCARREYZAccess().getCoteKeyword_2());
            		
            otherlv_3=(Token)match(input,14,FOLLOW_19); 

            			newLeafNode(otherlv_3, grammarAccess.getCARREYZAccess().getEqualsSignKeyword_3());
            		
            // InternalDrn.g:3153:3: ( ( (lv_coteCST_4_0= ruleEInt ) ) | ( (otherlv_5= RULE_ID ) ) )
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==RULE_INT||LA50_0==58) ) {
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
                    // InternalDrn.g:3154:4: ( (lv_coteCST_4_0= ruleEInt ) )
                    {
                    // InternalDrn.g:3154:4: ( (lv_coteCST_4_0= ruleEInt ) )
                    // InternalDrn.g:3155:5: (lv_coteCST_4_0= ruleEInt )
                    {
                    // InternalDrn.g:3155:5: (lv_coteCST_4_0= ruleEInt )
                    // InternalDrn.g:3156:6: lv_coteCST_4_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getCARREYZAccess().getCoteCSTEIntParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_28);
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
                    // InternalDrn.g:3174:4: ( (otherlv_5= RULE_ID ) )
                    {
                    // InternalDrn.g:3174:4: ( (otherlv_5= RULE_ID ) )
                    // InternalDrn.g:3175:5: (otherlv_5= RULE_ID )
                    {
                    // InternalDrn.g:3175:5: (otherlv_5= RULE_ID )
                    // InternalDrn.g:3176:6: otherlv_5= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCARREYZRule());
                    						}
                    					
                    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_28); 

                    						newLeafNode(otherlv_5, grammarAccess.getCARREYZAccess().getCoteVARParametreCrossReference_4_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,28,FOLLOW_6); 

            			newLeafNode(otherlv_6, grammarAccess.getCARREYZAccess().getTempsKeyword_5());
            		
            otherlv_7=(Token)match(input,14,FOLLOW_19); 

            			newLeafNode(otherlv_7, grammarAccess.getCARREYZAccess().getEqualsSignKeyword_6());
            		
            // InternalDrn.g:3196:3: ( ( (lv_tempsCST_8_0= ruleEInt ) ) | ( (otherlv_9= RULE_ID ) ) )
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==RULE_INT||LA51_0==58) ) {
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
                    // InternalDrn.g:3197:4: ( (lv_tempsCST_8_0= ruleEInt ) )
                    {
                    // InternalDrn.g:3197:4: ( (lv_tempsCST_8_0= ruleEInt ) )
                    // InternalDrn.g:3198:5: (lv_tempsCST_8_0= ruleEInt )
                    {
                    // InternalDrn.g:3198:5: (lv_tempsCST_8_0= ruleEInt )
                    // InternalDrn.g:3199:6: lv_tempsCST_8_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getCARREYZAccess().getTempsCSTEIntParserRuleCall_7_0_0());
                    					
                    pushFollow(FOLLOW_29);
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
                    // InternalDrn.g:3217:4: ( (otherlv_9= RULE_ID ) )
                    {
                    // InternalDrn.g:3217:4: ( (otherlv_9= RULE_ID ) )
                    // InternalDrn.g:3218:5: (otherlv_9= RULE_ID )
                    {
                    // InternalDrn.g:3218:5: (otherlv_9= RULE_ID )
                    // InternalDrn.g:3219:6: otherlv_9= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCARREYZRule());
                    						}
                    					
                    otherlv_9=(Token)match(input,RULE_ID,FOLLOW_29); 

                    						newLeafNode(otherlv_9, grammarAccess.getCARREYZAccess().getTempsVARParametreCrossReference_7_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,22,FOLLOW_2); 

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
    // InternalDrn.g:3239:1: entryRuleDepXZ_IMPL returns [EObject current=null] : iv_ruleDepXZ_IMPL= ruleDepXZ_IMPL EOF ;
    public final EObject entryRuleDepXZ_IMPL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDepXZ_IMPL = null;


        try {
            // InternalDrn.g:3239:51: (iv_ruleDepXZ_IMPL= ruleDepXZ_IMPL EOF )
            // InternalDrn.g:3240:2: iv_ruleDepXZ_IMPL= ruleDepXZ_IMPL EOF
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
    // InternalDrn.g:3246:1: ruleDepXZ_IMPL returns [EObject current=null] : this_DepXZ_0= ruleDepXZ ;
    public final EObject ruleDepXZ_IMPL() throws RecognitionException {
        EObject current = null;

        EObject this_DepXZ_0 = null;



        	enterRule();

        try {
            // InternalDrn.g:3252:2: (this_DepXZ_0= ruleDepXZ )
            // InternalDrn.g:3253:2: this_DepXZ_0= ruleDepXZ
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
    // InternalDrn.g:3264:1: entryRuleDepXZ returns [EObject current=null] : iv_ruleDepXZ= ruleDepXZ EOF ;
    public final EObject entryRuleDepXZ() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDepXZ = null;


        try {
            // InternalDrn.g:3264:46: (iv_ruleDepXZ= ruleDepXZ EOF )
            // InternalDrn.g:3265:2: iv_ruleDepXZ= ruleDepXZ EOF
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
    // InternalDrn.g:3271:1: ruleDepXZ returns [EObject current=null] : ( ( (lv_name_0_0= 'depXZ' ) ) otherlv_1= '(' otherlv_2= 'distance' otherlv_3= '=' ( ( (lv_distanceCST_4_0= ruleEInt ) ) | ( (otherlv_5= RULE_ID ) ) ) otherlv_6= 'temps' otherlv_7= '=' ( ( (lv_tempsCST_8_0= ruleEInt ) ) | ( (otherlv_9= RULE_ID ) ) ) otherlv_10= ')' ) ;
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
            // InternalDrn.g:3277:2: ( ( ( (lv_name_0_0= 'depXZ' ) ) otherlv_1= '(' otherlv_2= 'distance' otherlv_3= '=' ( ( (lv_distanceCST_4_0= ruleEInt ) ) | ( (otherlv_5= RULE_ID ) ) ) otherlv_6= 'temps' otherlv_7= '=' ( ( (lv_tempsCST_8_0= ruleEInt ) ) | ( (otherlv_9= RULE_ID ) ) ) otherlv_10= ')' ) )
            // InternalDrn.g:3278:2: ( ( (lv_name_0_0= 'depXZ' ) ) otherlv_1= '(' otherlv_2= 'distance' otherlv_3= '=' ( ( (lv_distanceCST_4_0= ruleEInt ) ) | ( (otherlv_5= RULE_ID ) ) ) otherlv_6= 'temps' otherlv_7= '=' ( ( (lv_tempsCST_8_0= ruleEInt ) ) | ( (otherlv_9= RULE_ID ) ) ) otherlv_10= ')' )
            {
            // InternalDrn.g:3278:2: ( ( (lv_name_0_0= 'depXZ' ) ) otherlv_1= '(' otherlv_2= 'distance' otherlv_3= '=' ( ( (lv_distanceCST_4_0= ruleEInt ) ) | ( (otherlv_5= RULE_ID ) ) ) otherlv_6= 'temps' otherlv_7= '=' ( ( (lv_tempsCST_8_0= ruleEInt ) ) | ( (otherlv_9= RULE_ID ) ) ) otherlv_10= ')' )
            // InternalDrn.g:3279:3: ( (lv_name_0_0= 'depXZ' ) ) otherlv_1= '(' otherlv_2= 'distance' otherlv_3= '=' ( ( (lv_distanceCST_4_0= ruleEInt ) ) | ( (otherlv_5= RULE_ID ) ) ) otherlv_6= 'temps' otherlv_7= '=' ( ( (lv_tempsCST_8_0= ruleEInt ) ) | ( (otherlv_9= RULE_ID ) ) ) otherlv_10= ')'
            {
            // InternalDrn.g:3279:3: ( (lv_name_0_0= 'depXZ' ) )
            // InternalDrn.g:3280:4: (lv_name_0_0= 'depXZ' )
            {
            // InternalDrn.g:3280:4: (lv_name_0_0= 'depXZ' )
            // InternalDrn.g:3281:5: lv_name_0_0= 'depXZ'
            {
            lv_name_0_0=(Token)match(input,42,FOLLOW_13); 

            					newLeafNode(lv_name_0_0, grammarAccess.getDepXZAccess().getNameDepXZKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDepXZRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "depXZ");
            				

            }


            }

            otherlv_1=(Token)match(input,20,FOLLOW_27); 

            			newLeafNode(otherlv_1, grammarAccess.getDepXZAccess().getLeftParenthesisKeyword_1());
            		
            otherlv_2=(Token)match(input,27,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getDepXZAccess().getDistanceKeyword_2());
            		
            otherlv_3=(Token)match(input,14,FOLLOW_19); 

            			newLeafNode(otherlv_3, grammarAccess.getDepXZAccess().getEqualsSignKeyword_3());
            		
            // InternalDrn.g:3305:3: ( ( (lv_distanceCST_4_0= ruleEInt ) ) | ( (otherlv_5= RULE_ID ) ) )
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==RULE_INT||LA52_0==58) ) {
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
                    // InternalDrn.g:3306:4: ( (lv_distanceCST_4_0= ruleEInt ) )
                    {
                    // InternalDrn.g:3306:4: ( (lv_distanceCST_4_0= ruleEInt ) )
                    // InternalDrn.g:3307:5: (lv_distanceCST_4_0= ruleEInt )
                    {
                    // InternalDrn.g:3307:5: (lv_distanceCST_4_0= ruleEInt )
                    // InternalDrn.g:3308:6: lv_distanceCST_4_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getDepXZAccess().getDistanceCSTEIntParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_28);
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
                    // InternalDrn.g:3326:4: ( (otherlv_5= RULE_ID ) )
                    {
                    // InternalDrn.g:3326:4: ( (otherlv_5= RULE_ID ) )
                    // InternalDrn.g:3327:5: (otherlv_5= RULE_ID )
                    {
                    // InternalDrn.g:3327:5: (otherlv_5= RULE_ID )
                    // InternalDrn.g:3328:6: otherlv_5= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDepXZRule());
                    						}
                    					
                    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_28); 

                    						newLeafNode(otherlv_5, grammarAccess.getDepXZAccess().getDistanceVarParametreCrossReference_4_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,28,FOLLOW_6); 

            			newLeafNode(otherlv_6, grammarAccess.getDepXZAccess().getTempsKeyword_5());
            		
            otherlv_7=(Token)match(input,14,FOLLOW_19); 

            			newLeafNode(otherlv_7, grammarAccess.getDepXZAccess().getEqualsSignKeyword_6());
            		
            // InternalDrn.g:3348:3: ( ( (lv_tempsCST_8_0= ruleEInt ) ) | ( (otherlv_9= RULE_ID ) ) )
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==RULE_INT||LA53_0==58) ) {
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
                    // InternalDrn.g:3349:4: ( (lv_tempsCST_8_0= ruleEInt ) )
                    {
                    // InternalDrn.g:3349:4: ( (lv_tempsCST_8_0= ruleEInt ) )
                    // InternalDrn.g:3350:5: (lv_tempsCST_8_0= ruleEInt )
                    {
                    // InternalDrn.g:3350:5: (lv_tempsCST_8_0= ruleEInt )
                    // InternalDrn.g:3351:6: lv_tempsCST_8_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getDepXZAccess().getTempsCSTEIntParserRuleCall_7_0_0());
                    					
                    pushFollow(FOLLOW_29);
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
                    // InternalDrn.g:3369:4: ( (otherlv_9= RULE_ID ) )
                    {
                    // InternalDrn.g:3369:4: ( (otherlv_9= RULE_ID ) )
                    // InternalDrn.g:3370:5: (otherlv_9= RULE_ID )
                    {
                    // InternalDrn.g:3370:5: (otherlv_9= RULE_ID )
                    // InternalDrn.g:3371:6: otherlv_9= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDepXZRule());
                    						}
                    					
                    otherlv_9=(Token)match(input,RULE_ID,FOLLOW_29); 

                    						newLeafNode(otherlv_9, grammarAccess.getDepXZAccess().getTempsVARParametreCrossReference_7_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,22,FOLLOW_2); 

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
    // InternalDrn.g:3391:1: entryRuleDepXYZ_IMPL returns [EObject current=null] : iv_ruleDepXYZ_IMPL= ruleDepXYZ_IMPL EOF ;
    public final EObject entryRuleDepXYZ_IMPL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDepXYZ_IMPL = null;


        try {
            // InternalDrn.g:3391:52: (iv_ruleDepXYZ_IMPL= ruleDepXYZ_IMPL EOF )
            // InternalDrn.g:3392:2: iv_ruleDepXYZ_IMPL= ruleDepXYZ_IMPL EOF
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
    // InternalDrn.g:3398:1: ruleDepXYZ_IMPL returns [EObject current=null] : (this_DepXYZ_0= ruleDepXYZ | this_Flip_1= ruleFlip ) ;
    public final EObject ruleDepXYZ_IMPL() throws RecognitionException {
        EObject current = null;

        EObject this_DepXYZ_0 = null;

        EObject this_Flip_1 = null;



        	enterRule();

        try {
            // InternalDrn.g:3404:2: ( (this_DepXYZ_0= ruleDepXYZ | this_Flip_1= ruleFlip ) )
            // InternalDrn.g:3405:2: (this_DepXYZ_0= ruleDepXYZ | this_Flip_1= ruleFlip )
            {
            // InternalDrn.g:3405:2: (this_DepXYZ_0= ruleDepXYZ | this_Flip_1= ruleFlip )
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==43) ) {
                alt54=1;
            }
            else if ( (LA54_0==44) ) {
                alt54=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;
            }
            switch (alt54) {
                case 1 :
                    // InternalDrn.g:3406:3: this_DepXYZ_0= ruleDepXYZ
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
                    // InternalDrn.g:3415:3: this_Flip_1= ruleFlip
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
    // InternalDrn.g:3427:1: entryRuleDepXYZ returns [EObject current=null] : iv_ruleDepXYZ= ruleDepXYZ EOF ;
    public final EObject entryRuleDepXYZ() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDepXYZ = null;


        try {
            // InternalDrn.g:3427:47: (iv_ruleDepXYZ= ruleDepXYZ EOF )
            // InternalDrn.g:3428:2: iv_ruleDepXYZ= ruleDepXYZ EOF
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
    // InternalDrn.g:3434:1: ruleDepXYZ returns [EObject current=null] : ( ( (lv_name_0_0= 'depXYZ' ) ) otherlv_1= '(' otherlv_2= 'distance' otherlv_3= '=' ( ( (lv_distanceCST_4_0= ruleEInt ) ) | ( (otherlv_5= RULE_ID ) ) ) otherlv_6= 'temps' otherlv_7= '=' ( ( (lv_tempsCST_8_0= ruleEInt ) ) | ( (otherlv_9= RULE_ID ) ) ) otherlv_10= ')' ) ;
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
            // InternalDrn.g:3440:2: ( ( ( (lv_name_0_0= 'depXYZ' ) ) otherlv_1= '(' otherlv_2= 'distance' otherlv_3= '=' ( ( (lv_distanceCST_4_0= ruleEInt ) ) | ( (otherlv_5= RULE_ID ) ) ) otherlv_6= 'temps' otherlv_7= '=' ( ( (lv_tempsCST_8_0= ruleEInt ) ) | ( (otherlv_9= RULE_ID ) ) ) otherlv_10= ')' ) )
            // InternalDrn.g:3441:2: ( ( (lv_name_0_0= 'depXYZ' ) ) otherlv_1= '(' otherlv_2= 'distance' otherlv_3= '=' ( ( (lv_distanceCST_4_0= ruleEInt ) ) | ( (otherlv_5= RULE_ID ) ) ) otherlv_6= 'temps' otherlv_7= '=' ( ( (lv_tempsCST_8_0= ruleEInt ) ) | ( (otherlv_9= RULE_ID ) ) ) otherlv_10= ')' )
            {
            // InternalDrn.g:3441:2: ( ( (lv_name_0_0= 'depXYZ' ) ) otherlv_1= '(' otherlv_2= 'distance' otherlv_3= '=' ( ( (lv_distanceCST_4_0= ruleEInt ) ) | ( (otherlv_5= RULE_ID ) ) ) otherlv_6= 'temps' otherlv_7= '=' ( ( (lv_tempsCST_8_0= ruleEInt ) ) | ( (otherlv_9= RULE_ID ) ) ) otherlv_10= ')' )
            // InternalDrn.g:3442:3: ( (lv_name_0_0= 'depXYZ' ) ) otherlv_1= '(' otherlv_2= 'distance' otherlv_3= '=' ( ( (lv_distanceCST_4_0= ruleEInt ) ) | ( (otherlv_5= RULE_ID ) ) ) otherlv_6= 'temps' otherlv_7= '=' ( ( (lv_tempsCST_8_0= ruleEInt ) ) | ( (otherlv_9= RULE_ID ) ) ) otherlv_10= ')'
            {
            // InternalDrn.g:3442:3: ( (lv_name_0_0= 'depXYZ' ) )
            // InternalDrn.g:3443:4: (lv_name_0_0= 'depXYZ' )
            {
            // InternalDrn.g:3443:4: (lv_name_0_0= 'depXYZ' )
            // InternalDrn.g:3444:5: lv_name_0_0= 'depXYZ'
            {
            lv_name_0_0=(Token)match(input,43,FOLLOW_13); 

            					newLeafNode(lv_name_0_0, grammarAccess.getDepXYZAccess().getNameDepXYZKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDepXYZRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "depXYZ");
            				

            }


            }

            otherlv_1=(Token)match(input,20,FOLLOW_27); 

            			newLeafNode(otherlv_1, grammarAccess.getDepXYZAccess().getLeftParenthesisKeyword_1());
            		
            otherlv_2=(Token)match(input,27,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getDepXYZAccess().getDistanceKeyword_2());
            		
            otherlv_3=(Token)match(input,14,FOLLOW_19); 

            			newLeafNode(otherlv_3, grammarAccess.getDepXYZAccess().getEqualsSignKeyword_3());
            		
            // InternalDrn.g:3468:3: ( ( (lv_distanceCST_4_0= ruleEInt ) ) | ( (otherlv_5= RULE_ID ) ) )
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==RULE_INT||LA55_0==58) ) {
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
                    // InternalDrn.g:3469:4: ( (lv_distanceCST_4_0= ruleEInt ) )
                    {
                    // InternalDrn.g:3469:4: ( (lv_distanceCST_4_0= ruleEInt ) )
                    // InternalDrn.g:3470:5: (lv_distanceCST_4_0= ruleEInt )
                    {
                    // InternalDrn.g:3470:5: (lv_distanceCST_4_0= ruleEInt )
                    // InternalDrn.g:3471:6: lv_distanceCST_4_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getDepXYZAccess().getDistanceCSTEIntParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_28);
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
                    // InternalDrn.g:3489:4: ( (otherlv_5= RULE_ID ) )
                    {
                    // InternalDrn.g:3489:4: ( (otherlv_5= RULE_ID ) )
                    // InternalDrn.g:3490:5: (otherlv_5= RULE_ID )
                    {
                    // InternalDrn.g:3490:5: (otherlv_5= RULE_ID )
                    // InternalDrn.g:3491:6: otherlv_5= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDepXYZRule());
                    						}
                    					
                    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_28); 

                    						newLeafNode(otherlv_5, grammarAccess.getDepXYZAccess().getDistanceVarParametreCrossReference_4_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,28,FOLLOW_6); 

            			newLeafNode(otherlv_6, grammarAccess.getDepXYZAccess().getTempsKeyword_5());
            		
            otherlv_7=(Token)match(input,14,FOLLOW_19); 

            			newLeafNode(otherlv_7, grammarAccess.getDepXYZAccess().getEqualsSignKeyword_6());
            		
            // InternalDrn.g:3511:3: ( ( (lv_tempsCST_8_0= ruleEInt ) ) | ( (otherlv_9= RULE_ID ) ) )
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==RULE_INT||LA56_0==58) ) {
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
                    // InternalDrn.g:3512:4: ( (lv_tempsCST_8_0= ruleEInt ) )
                    {
                    // InternalDrn.g:3512:4: ( (lv_tempsCST_8_0= ruleEInt ) )
                    // InternalDrn.g:3513:5: (lv_tempsCST_8_0= ruleEInt )
                    {
                    // InternalDrn.g:3513:5: (lv_tempsCST_8_0= ruleEInt )
                    // InternalDrn.g:3514:6: lv_tempsCST_8_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getDepXYZAccess().getTempsCSTEIntParserRuleCall_7_0_0());
                    					
                    pushFollow(FOLLOW_29);
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
                    // InternalDrn.g:3532:4: ( (otherlv_9= RULE_ID ) )
                    {
                    // InternalDrn.g:3532:4: ( (otherlv_9= RULE_ID ) )
                    // InternalDrn.g:3533:5: (otherlv_9= RULE_ID )
                    {
                    // InternalDrn.g:3533:5: (otherlv_9= RULE_ID )
                    // InternalDrn.g:3534:6: otherlv_9= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDepXYZRule());
                    						}
                    					
                    otherlv_9=(Token)match(input,RULE_ID,FOLLOW_29); 

                    						newLeafNode(otherlv_9, grammarAccess.getDepXYZAccess().getTempsVARParametreCrossReference_7_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,22,FOLLOW_2); 

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
    // InternalDrn.g:3554:1: entryRuleFlip returns [EObject current=null] : iv_ruleFlip= ruleFlip EOF ;
    public final EObject entryRuleFlip() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFlip = null;


        try {
            // InternalDrn.g:3554:45: (iv_ruleFlip= ruleFlip EOF )
            // InternalDrn.g:3555:2: iv_ruleFlip= ruleFlip EOF
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
    // InternalDrn.g:3561:1: ruleFlip returns [EObject current=null] : ( ( (lv_name_0_0= 'flip' ) ) otherlv_1= '(' otherlv_2= ')' ) ;
    public final EObject ruleFlip() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalDrn.g:3567:2: ( ( ( (lv_name_0_0= 'flip' ) ) otherlv_1= '(' otherlv_2= ')' ) )
            // InternalDrn.g:3568:2: ( ( (lv_name_0_0= 'flip' ) ) otherlv_1= '(' otherlv_2= ')' )
            {
            // InternalDrn.g:3568:2: ( ( (lv_name_0_0= 'flip' ) ) otherlv_1= '(' otherlv_2= ')' )
            // InternalDrn.g:3569:3: ( (lv_name_0_0= 'flip' ) ) otherlv_1= '(' otherlv_2= ')'
            {
            // InternalDrn.g:3569:3: ( (lv_name_0_0= 'flip' ) )
            // InternalDrn.g:3570:4: (lv_name_0_0= 'flip' )
            {
            // InternalDrn.g:3570:4: (lv_name_0_0= 'flip' )
            // InternalDrn.g:3571:5: lv_name_0_0= 'flip'
            {
            lv_name_0_0=(Token)match(input,44,FOLLOW_13); 

            					newLeafNode(lv_name_0_0, grammarAccess.getFlipAccess().getNameFlipKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFlipRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "flip");
            				

            }


            }

            otherlv_1=(Token)match(input,20,FOLLOW_29); 

            			newLeafNode(otherlv_1, grammarAccess.getFlipAccess().getLeftParenthesisKeyword_1());
            		
            otherlv_2=(Token)match(input,22,FOLLOW_2); 

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
    // InternalDrn.g:3595:1: entryRuleRotate returns [EObject current=null] : iv_ruleRotate= ruleRotate EOF ;
    public final EObject entryRuleRotate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRotate = null;


        try {
            // InternalDrn.g:3595:47: (iv_ruleRotate= ruleRotate EOF )
            // InternalDrn.g:3596:2: iv_ruleRotate= ruleRotate EOF
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
    // InternalDrn.g:3602:1: ruleRotate returns [EObject current=null] : ( ( (lv_name_0_0= 'rotate' ) ) otherlv_1= '(' otherlv_2= 'angle' otherlv_3= '=' ( ( (lv_angleCST_4_0= ruleEInt ) ) | ( (otherlv_5= RULE_ID ) ) ) otherlv_6= 'temps' otherlv_7= '=' ( ( (lv_tempsCST_8_0= ruleEInt ) ) | ( (otherlv_9= RULE_ID ) ) ) otherlv_10= ')' ) ;
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
            // InternalDrn.g:3608:2: ( ( ( (lv_name_0_0= 'rotate' ) ) otherlv_1= '(' otherlv_2= 'angle' otherlv_3= '=' ( ( (lv_angleCST_4_0= ruleEInt ) ) | ( (otherlv_5= RULE_ID ) ) ) otherlv_6= 'temps' otherlv_7= '=' ( ( (lv_tempsCST_8_0= ruleEInt ) ) | ( (otherlv_9= RULE_ID ) ) ) otherlv_10= ')' ) )
            // InternalDrn.g:3609:2: ( ( (lv_name_0_0= 'rotate' ) ) otherlv_1= '(' otherlv_2= 'angle' otherlv_3= '=' ( ( (lv_angleCST_4_0= ruleEInt ) ) | ( (otherlv_5= RULE_ID ) ) ) otherlv_6= 'temps' otherlv_7= '=' ( ( (lv_tempsCST_8_0= ruleEInt ) ) | ( (otherlv_9= RULE_ID ) ) ) otherlv_10= ')' )
            {
            // InternalDrn.g:3609:2: ( ( (lv_name_0_0= 'rotate' ) ) otherlv_1= '(' otherlv_2= 'angle' otherlv_3= '=' ( ( (lv_angleCST_4_0= ruleEInt ) ) | ( (otherlv_5= RULE_ID ) ) ) otherlv_6= 'temps' otherlv_7= '=' ( ( (lv_tempsCST_8_0= ruleEInt ) ) | ( (otherlv_9= RULE_ID ) ) ) otherlv_10= ')' )
            // InternalDrn.g:3610:3: ( (lv_name_0_0= 'rotate' ) ) otherlv_1= '(' otherlv_2= 'angle' otherlv_3= '=' ( ( (lv_angleCST_4_0= ruleEInt ) ) | ( (otherlv_5= RULE_ID ) ) ) otherlv_6= 'temps' otherlv_7= '=' ( ( (lv_tempsCST_8_0= ruleEInt ) ) | ( (otherlv_9= RULE_ID ) ) ) otherlv_10= ')'
            {
            // InternalDrn.g:3610:3: ( (lv_name_0_0= 'rotate' ) )
            // InternalDrn.g:3611:4: (lv_name_0_0= 'rotate' )
            {
            // InternalDrn.g:3611:4: (lv_name_0_0= 'rotate' )
            // InternalDrn.g:3612:5: lv_name_0_0= 'rotate'
            {
            lv_name_0_0=(Token)match(input,45,FOLLOW_13); 

            					newLeafNode(lv_name_0_0, grammarAccess.getRotateAccess().getNameRotateKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRotateRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "rotate");
            				

            }


            }

            otherlv_1=(Token)match(input,20,FOLLOW_32); 

            			newLeafNode(otherlv_1, grammarAccess.getRotateAccess().getLeftParenthesisKeyword_1());
            		
            otherlv_2=(Token)match(input,46,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getRotateAccess().getAngleKeyword_2());
            		
            otherlv_3=(Token)match(input,14,FOLLOW_19); 

            			newLeafNode(otherlv_3, grammarAccess.getRotateAccess().getEqualsSignKeyword_3());
            		
            // InternalDrn.g:3636:3: ( ( (lv_angleCST_4_0= ruleEInt ) ) | ( (otherlv_5= RULE_ID ) ) )
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==RULE_INT||LA57_0==58) ) {
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
                    // InternalDrn.g:3637:4: ( (lv_angleCST_4_0= ruleEInt ) )
                    {
                    // InternalDrn.g:3637:4: ( (lv_angleCST_4_0= ruleEInt ) )
                    // InternalDrn.g:3638:5: (lv_angleCST_4_0= ruleEInt )
                    {
                    // InternalDrn.g:3638:5: (lv_angleCST_4_0= ruleEInt )
                    // InternalDrn.g:3639:6: lv_angleCST_4_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getRotateAccess().getAngleCSTEIntParserRuleCall_4_0_0());
                    					
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


                    }
                    break;
                case 2 :
                    // InternalDrn.g:3657:4: ( (otherlv_5= RULE_ID ) )
                    {
                    // InternalDrn.g:3657:4: ( (otherlv_5= RULE_ID ) )
                    // InternalDrn.g:3658:5: (otherlv_5= RULE_ID )
                    {
                    // InternalDrn.g:3658:5: (otherlv_5= RULE_ID )
                    // InternalDrn.g:3659:6: otherlv_5= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRotateRule());
                    						}
                    					
                    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_28); 

                    						newLeafNode(otherlv_5, grammarAccess.getRotateAccess().getAngleVARParametreCrossReference_4_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,28,FOLLOW_6); 

            			newLeafNode(otherlv_6, grammarAccess.getRotateAccess().getTempsKeyword_5());
            		
            otherlv_7=(Token)match(input,14,FOLLOW_19); 

            			newLeafNode(otherlv_7, grammarAccess.getRotateAccess().getEqualsSignKeyword_6());
            		
            // InternalDrn.g:3679:3: ( ( (lv_tempsCST_8_0= ruleEInt ) ) | ( (otherlv_9= RULE_ID ) ) )
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==RULE_INT||LA58_0==58) ) {
                alt58=1;
            }
            else if ( (LA58_0==RULE_ID) ) {
                alt58=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                throw nvae;
            }
            switch (alt58) {
                case 1 :
                    // InternalDrn.g:3680:4: ( (lv_tempsCST_8_0= ruleEInt ) )
                    {
                    // InternalDrn.g:3680:4: ( (lv_tempsCST_8_0= ruleEInt ) )
                    // InternalDrn.g:3681:5: (lv_tempsCST_8_0= ruleEInt )
                    {
                    // InternalDrn.g:3681:5: (lv_tempsCST_8_0= ruleEInt )
                    // InternalDrn.g:3682:6: lv_tempsCST_8_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getRotateAccess().getTempsCSTEIntParserRuleCall_7_0_0());
                    					
                    pushFollow(FOLLOW_29);
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
                    // InternalDrn.g:3700:4: ( (otherlv_9= RULE_ID ) )
                    {
                    // InternalDrn.g:3700:4: ( (otherlv_9= RULE_ID ) )
                    // InternalDrn.g:3701:5: (otherlv_9= RULE_ID )
                    {
                    // InternalDrn.g:3701:5: (otherlv_9= RULE_ID )
                    // InternalDrn.g:3702:6: otherlv_9= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRotateRule());
                    						}
                    					
                    otherlv_9=(Token)match(input,RULE_ID,FOLLOW_29); 

                    						newLeafNode(otherlv_9, grammarAccess.getRotateAccess().getTempsVARParametreCrossReference_7_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,22,FOLLOW_2); 

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
    // InternalDrn.g:3722:1: entryRuleWait returns [EObject current=null] : iv_ruleWait= ruleWait EOF ;
    public final EObject entryRuleWait() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWait = null;


        try {
            // InternalDrn.g:3722:45: (iv_ruleWait= ruleWait EOF )
            // InternalDrn.g:3723:2: iv_ruleWait= ruleWait EOF
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
    // InternalDrn.g:3729:1: ruleWait returns [EObject current=null] : ( ( (lv_name_0_0= 'wait' ) ) otherlv_1= '(' otherlv_2= 'temps' otherlv_3= '=' ( ( (lv_tempsCST_4_0= ruleEInt ) ) | ( (otherlv_5= RULE_ID ) ) ) otherlv_6= ')' ) ;
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
            // InternalDrn.g:3735:2: ( ( ( (lv_name_0_0= 'wait' ) ) otherlv_1= '(' otherlv_2= 'temps' otherlv_3= '=' ( ( (lv_tempsCST_4_0= ruleEInt ) ) | ( (otherlv_5= RULE_ID ) ) ) otherlv_6= ')' ) )
            // InternalDrn.g:3736:2: ( ( (lv_name_0_0= 'wait' ) ) otherlv_1= '(' otherlv_2= 'temps' otherlv_3= '=' ( ( (lv_tempsCST_4_0= ruleEInt ) ) | ( (otherlv_5= RULE_ID ) ) ) otherlv_6= ')' )
            {
            // InternalDrn.g:3736:2: ( ( (lv_name_0_0= 'wait' ) ) otherlv_1= '(' otherlv_2= 'temps' otherlv_3= '=' ( ( (lv_tempsCST_4_0= ruleEInt ) ) | ( (otherlv_5= RULE_ID ) ) ) otherlv_6= ')' )
            // InternalDrn.g:3737:3: ( (lv_name_0_0= 'wait' ) ) otherlv_1= '(' otherlv_2= 'temps' otherlv_3= '=' ( ( (lv_tempsCST_4_0= ruleEInt ) ) | ( (otherlv_5= RULE_ID ) ) ) otherlv_6= ')'
            {
            // InternalDrn.g:3737:3: ( (lv_name_0_0= 'wait' ) )
            // InternalDrn.g:3738:4: (lv_name_0_0= 'wait' )
            {
            // InternalDrn.g:3738:4: (lv_name_0_0= 'wait' )
            // InternalDrn.g:3739:5: lv_name_0_0= 'wait'
            {
            lv_name_0_0=(Token)match(input,47,FOLLOW_13); 

            					newLeafNode(lv_name_0_0, grammarAccess.getWaitAccess().getNameWaitKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getWaitRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "wait");
            				

            }


            }

            otherlv_1=(Token)match(input,20,FOLLOW_28); 

            			newLeafNode(otherlv_1, grammarAccess.getWaitAccess().getLeftParenthesisKeyword_1());
            		
            otherlv_2=(Token)match(input,28,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getWaitAccess().getTempsKeyword_2());
            		
            otherlv_3=(Token)match(input,14,FOLLOW_19); 

            			newLeafNode(otherlv_3, grammarAccess.getWaitAccess().getEqualsSignKeyword_3());
            		
            // InternalDrn.g:3763:3: ( ( (lv_tempsCST_4_0= ruleEInt ) ) | ( (otherlv_5= RULE_ID ) ) )
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==RULE_INT||LA59_0==58) ) {
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
                    // InternalDrn.g:3764:4: ( (lv_tempsCST_4_0= ruleEInt ) )
                    {
                    // InternalDrn.g:3764:4: ( (lv_tempsCST_4_0= ruleEInt ) )
                    // InternalDrn.g:3765:5: (lv_tempsCST_4_0= ruleEInt )
                    {
                    // InternalDrn.g:3765:5: (lv_tempsCST_4_0= ruleEInt )
                    // InternalDrn.g:3766:6: lv_tempsCST_4_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getWaitAccess().getTempsCSTEIntParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_29);
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
                    // InternalDrn.g:3784:4: ( (otherlv_5= RULE_ID ) )
                    {
                    // InternalDrn.g:3784:4: ( (otherlv_5= RULE_ID ) )
                    // InternalDrn.g:3785:5: (otherlv_5= RULE_ID )
                    {
                    // InternalDrn.g:3785:5: (otherlv_5= RULE_ID )
                    // InternalDrn.g:3786:6: otherlv_5= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getWaitRule());
                    						}
                    					
                    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_29); 

                    						newLeafNode(otherlv_5, grammarAccess.getWaitAccess().getTempsVARParametreCrossReference_4_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,22,FOLLOW_2); 

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
    // InternalDrn.g:3806:1: entryRuleTakeOff returns [EObject current=null] : iv_ruleTakeOff= ruleTakeOff EOF ;
    public final EObject entryRuleTakeOff() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTakeOff = null;


        try {
            // InternalDrn.g:3806:48: (iv_ruleTakeOff= ruleTakeOff EOF )
            // InternalDrn.g:3807:2: iv_ruleTakeOff= ruleTakeOff EOF
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
    // InternalDrn.g:3813:1: ruleTakeOff returns [EObject current=null] : ( ( (lv_name_0_0= 'takeoff' ) ) otherlv_1= '(' otherlv_2= ')' ) ;
    public final EObject ruleTakeOff() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalDrn.g:3819:2: ( ( ( (lv_name_0_0= 'takeoff' ) ) otherlv_1= '(' otherlv_2= ')' ) )
            // InternalDrn.g:3820:2: ( ( (lv_name_0_0= 'takeoff' ) ) otherlv_1= '(' otherlv_2= ')' )
            {
            // InternalDrn.g:3820:2: ( ( (lv_name_0_0= 'takeoff' ) ) otherlv_1= '(' otherlv_2= ')' )
            // InternalDrn.g:3821:3: ( (lv_name_0_0= 'takeoff' ) ) otherlv_1= '(' otherlv_2= ')'
            {
            // InternalDrn.g:3821:3: ( (lv_name_0_0= 'takeoff' ) )
            // InternalDrn.g:3822:4: (lv_name_0_0= 'takeoff' )
            {
            // InternalDrn.g:3822:4: (lv_name_0_0= 'takeoff' )
            // InternalDrn.g:3823:5: lv_name_0_0= 'takeoff'
            {
            lv_name_0_0=(Token)match(input,48,FOLLOW_13); 

            					newLeafNode(lv_name_0_0, grammarAccess.getTakeOffAccess().getNameTakeoffKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTakeOffRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "takeoff");
            				

            }


            }

            otherlv_1=(Token)match(input,20,FOLLOW_29); 

            			newLeafNode(otherlv_1, grammarAccess.getTakeOffAccess().getLeftParenthesisKeyword_1());
            		
            otherlv_2=(Token)match(input,22,FOLLOW_2); 

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
    // InternalDrn.g:3847:1: entryRuleLand returns [EObject current=null] : iv_ruleLand= ruleLand EOF ;
    public final EObject entryRuleLand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLand = null;


        try {
            // InternalDrn.g:3847:45: (iv_ruleLand= ruleLand EOF )
            // InternalDrn.g:3848:2: iv_ruleLand= ruleLand EOF
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
    // InternalDrn.g:3854:1: ruleLand returns [EObject current=null] : ( ( (lv_name_0_0= 'land' ) ) otherlv_1= '(' otherlv_2= ')' ) ;
    public final EObject ruleLand() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalDrn.g:3860:2: ( ( ( (lv_name_0_0= 'land' ) ) otherlv_1= '(' otherlv_2= ')' ) )
            // InternalDrn.g:3861:2: ( ( (lv_name_0_0= 'land' ) ) otherlv_1= '(' otherlv_2= ')' )
            {
            // InternalDrn.g:3861:2: ( ( (lv_name_0_0= 'land' ) ) otherlv_1= '(' otherlv_2= ')' )
            // InternalDrn.g:3862:3: ( (lv_name_0_0= 'land' ) ) otherlv_1= '(' otherlv_2= ')'
            {
            // InternalDrn.g:3862:3: ( (lv_name_0_0= 'land' ) )
            // InternalDrn.g:3863:4: (lv_name_0_0= 'land' )
            {
            // InternalDrn.g:3863:4: (lv_name_0_0= 'land' )
            // InternalDrn.g:3864:5: lv_name_0_0= 'land'
            {
            lv_name_0_0=(Token)match(input,49,FOLLOW_13); 

            					newLeafNode(lv_name_0_0, grammarAccess.getLandAccess().getNameLandKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLandRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "land");
            				

            }


            }

            otherlv_1=(Token)match(input,20,FOLLOW_29); 

            			newLeafNode(otherlv_1, grammarAccess.getLandAccess().getLeftParenthesisKeyword_1());
            		
            otherlv_2=(Token)match(input,22,FOLLOW_2); 

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


    // $ANTLR start "entryRuleWith"
    // InternalDrn.g:3888:1: entryRuleWith returns [EObject current=null] : iv_ruleWith= ruleWith EOF ;
    public final EObject entryRuleWith() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWith = null;


        try {
            // InternalDrn.g:3888:45: (iv_ruleWith= ruleWith EOF )
            // InternalDrn.g:3889:2: iv_ruleWith= ruleWith EOF
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
    // InternalDrn.g:3895:1: ruleWith returns [EObject current=null] : ( ( (lv_name_0_0= 'with' ) ) ( (lv_option_1_0= ruleOption ) ) (otherlv_2= ',' ( (lv_option_3_0= ruleOption ) ) )* ) ;
    public final EObject ruleWith() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_2=null;
        EObject lv_option_1_0 = null;

        EObject lv_option_3_0 = null;



        	enterRule();

        try {
            // InternalDrn.g:3901:2: ( ( ( (lv_name_0_0= 'with' ) ) ( (lv_option_1_0= ruleOption ) ) (otherlv_2= ',' ( (lv_option_3_0= ruleOption ) ) )* ) )
            // InternalDrn.g:3902:2: ( ( (lv_name_0_0= 'with' ) ) ( (lv_option_1_0= ruleOption ) ) (otherlv_2= ',' ( (lv_option_3_0= ruleOption ) ) )* )
            {
            // InternalDrn.g:3902:2: ( ( (lv_name_0_0= 'with' ) ) ( (lv_option_1_0= ruleOption ) ) (otherlv_2= ',' ( (lv_option_3_0= ruleOption ) ) )* )
            // InternalDrn.g:3903:3: ( (lv_name_0_0= 'with' ) ) ( (lv_option_1_0= ruleOption ) ) (otherlv_2= ',' ( (lv_option_3_0= ruleOption ) ) )*
            {
            // InternalDrn.g:3903:3: ( (lv_name_0_0= 'with' ) )
            // InternalDrn.g:3904:4: (lv_name_0_0= 'with' )
            {
            // InternalDrn.g:3904:4: (lv_name_0_0= 'with' )
            // InternalDrn.g:3905:5: lv_name_0_0= 'with'
            {
            lv_name_0_0=(Token)match(input,50,FOLLOW_33); 

            					newLeafNode(lv_name_0_0, grammarAccess.getWithAccess().getNameWithKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getWithRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "with");
            				

            }


            }

            // InternalDrn.g:3917:3: ( (lv_option_1_0= ruleOption ) )
            // InternalDrn.g:3918:4: (lv_option_1_0= ruleOption )
            {
            // InternalDrn.g:3918:4: (lv_option_1_0= ruleOption )
            // InternalDrn.g:3919:5: lv_option_1_0= ruleOption
            {

            					newCompositeNode(grammarAccess.getWithAccess().getOptionOptionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_34);
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

            // InternalDrn.g:3936:3: (otherlv_2= ',' ( (lv_option_3_0= ruleOption ) ) )*
            loop60:
            do {
                int alt60=2;
                int LA60_0 = input.LA(1);

                if ( (LA60_0==21) ) {
                    alt60=1;
                }


                switch (alt60) {
            	case 1 :
            	    // InternalDrn.g:3937:4: otherlv_2= ',' ( (lv_option_3_0= ruleOption ) )
            	    {
            	    otherlv_2=(Token)match(input,21,FOLLOW_33); 

            	    				newLeafNode(otherlv_2, grammarAccess.getWithAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalDrn.g:3941:4: ( (lv_option_3_0= ruleOption ) )
            	    // InternalDrn.g:3942:5: (lv_option_3_0= ruleOption )
            	    {
            	    // InternalDrn.g:3942:5: (lv_option_3_0= ruleOption )
            	    // InternalDrn.g:3943:6: lv_option_3_0= ruleOption
            	    {

            	    						newCompositeNode(grammarAccess.getWithAccess().getOptionOptionParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_34);
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
            	    break loop60;
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
    // InternalDrn.g:3965:1: entryRuleOption returns [EObject current=null] : iv_ruleOption= ruleOption EOF ;
    public final EObject entryRuleOption() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOption = null;


        try {
            // InternalDrn.g:3965:47: (iv_ruleOption= ruleOption EOF )
            // InternalDrn.g:3966:2: iv_ruleOption= ruleOption EOF
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
    // InternalDrn.g:3972:1: ruleOption returns [EObject current=null] : (this_Led_Impl_0= ruleLed_Impl | this_LedBlink_1= ruleLedBlink | this_CameraFront_2= ruleCameraFront | this_CameraBottom_3= ruleCameraBottom ) ;
    public final EObject ruleOption() throws RecognitionException {
        EObject current = null;

        EObject this_Led_Impl_0 = null;

        EObject this_LedBlink_1 = null;

        EObject this_CameraFront_2 = null;

        EObject this_CameraBottom_3 = null;



        	enterRule();

        try {
            // InternalDrn.g:3978:2: ( (this_Led_Impl_0= ruleLed_Impl | this_LedBlink_1= ruleLedBlink | this_CameraFront_2= ruleCameraFront | this_CameraBottom_3= ruleCameraBottom ) )
            // InternalDrn.g:3979:2: (this_Led_Impl_0= ruleLed_Impl | this_LedBlink_1= ruleLedBlink | this_CameraFront_2= ruleCameraFront | this_CameraBottom_3= ruleCameraBottom )
            {
            // InternalDrn.g:3979:2: (this_Led_Impl_0= ruleLed_Impl | this_LedBlink_1= ruleLedBlink | this_CameraFront_2= ruleCameraFront | this_CameraBottom_3= ruleCameraBottom )
            int alt61=4;
            switch ( input.LA(1) ) {
            case 51:
                {
                alt61=1;
                }
                break;
            case 53:
                {
                alt61=2;
                }
                break;
            case 55:
                {
                alt61=3;
                }
                break;
            case 57:
                {
                alt61=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 61, 0, input);

                throw nvae;
            }

            switch (alt61) {
                case 1 :
                    // InternalDrn.g:3980:3: this_Led_Impl_0= ruleLed_Impl
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
                    // InternalDrn.g:3989:3: this_LedBlink_1= ruleLedBlink
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
                    // InternalDrn.g:3998:3: this_CameraFront_2= ruleCameraFront
                    {

                    			newCompositeNode(grammarAccess.getOptionAccess().getCameraFrontParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_CameraFront_2=ruleCameraFront();

                    state._fsp--;


                    			current = this_CameraFront_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalDrn.g:4007:3: this_CameraBottom_3= ruleCameraBottom
                    {

                    			newCompositeNode(grammarAccess.getOptionAccess().getCameraBottomParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_CameraBottom_3=ruleCameraBottom();

                    state._fsp--;


                    			current = this_CameraBottom_3;
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


    // $ANTLR start "entryRuleLed_Impl"
    // InternalDrn.g:4019:1: entryRuleLed_Impl returns [EObject current=null] : iv_ruleLed_Impl= ruleLed_Impl EOF ;
    public final EObject entryRuleLed_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLed_Impl = null;


        try {
            // InternalDrn.g:4019:49: (iv_ruleLed_Impl= ruleLed_Impl EOF )
            // InternalDrn.g:4020:2: iv_ruleLed_Impl= ruleLed_Impl EOF
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
    // InternalDrn.g:4026:1: ruleLed_Impl returns [EObject current=null] : ( ( (lv_name_0_0= 'led' ) ) otherlv_1= '(' otherlv_2= 'color' otherlv_3= '=' ( (lv_color_4_0= ruleColorLed ) ) otherlv_5= ')' ) ;
    public final EObject ruleLed_Impl() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Enumerator lv_color_4_0 = null;



        	enterRule();

        try {
            // InternalDrn.g:4032:2: ( ( ( (lv_name_0_0= 'led' ) ) otherlv_1= '(' otherlv_2= 'color' otherlv_3= '=' ( (lv_color_4_0= ruleColorLed ) ) otherlv_5= ')' ) )
            // InternalDrn.g:4033:2: ( ( (lv_name_0_0= 'led' ) ) otherlv_1= '(' otherlv_2= 'color' otherlv_3= '=' ( (lv_color_4_0= ruleColorLed ) ) otherlv_5= ')' )
            {
            // InternalDrn.g:4033:2: ( ( (lv_name_0_0= 'led' ) ) otherlv_1= '(' otherlv_2= 'color' otherlv_3= '=' ( (lv_color_4_0= ruleColorLed ) ) otherlv_5= ')' )
            // InternalDrn.g:4034:3: ( (lv_name_0_0= 'led' ) ) otherlv_1= '(' otherlv_2= 'color' otherlv_3= '=' ( (lv_color_4_0= ruleColorLed ) ) otherlv_5= ')'
            {
            // InternalDrn.g:4034:3: ( (lv_name_0_0= 'led' ) )
            // InternalDrn.g:4035:4: (lv_name_0_0= 'led' )
            {
            // InternalDrn.g:4035:4: (lv_name_0_0= 'led' )
            // InternalDrn.g:4036:5: lv_name_0_0= 'led'
            {
            lv_name_0_0=(Token)match(input,51,FOLLOW_13); 

            					newLeafNode(lv_name_0_0, grammarAccess.getLed_ImplAccess().getNameLedKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLed_ImplRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "led");
            				

            }


            }

            otherlv_1=(Token)match(input,20,FOLLOW_35); 

            			newLeafNode(otherlv_1, grammarAccess.getLed_ImplAccess().getLeftParenthesisKeyword_1());
            		
            otherlv_2=(Token)match(input,52,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getLed_ImplAccess().getColorKeyword_2());
            		
            otherlv_3=(Token)match(input,14,FOLLOW_36); 

            			newLeafNode(otherlv_3, grammarAccess.getLed_ImplAccess().getEqualsSignKeyword_3());
            		
            // InternalDrn.g:4060:3: ( (lv_color_4_0= ruleColorLed ) )
            // InternalDrn.g:4061:4: (lv_color_4_0= ruleColorLed )
            {
            // InternalDrn.g:4061:4: (lv_color_4_0= ruleColorLed )
            // InternalDrn.g:4062:5: lv_color_4_0= ruleColorLed
            {

            					newCompositeNode(grammarAccess.getLed_ImplAccess().getColorColorLedEnumRuleCall_4_0());
            				
            pushFollow(FOLLOW_29);
            lv_color_4_0=ruleColorLed();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLed_ImplRule());
            					}
            					set(
            						current,
            						"color",
            						lv_color_4_0,
            						"sar.drone.Drn.ColorLed");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getLed_ImplAccess().getRightParenthesisKeyword_5());
            		

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
    // InternalDrn.g:4087:1: entryRuleLedBlink returns [EObject current=null] : iv_ruleLedBlink= ruleLedBlink EOF ;
    public final EObject entryRuleLedBlink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLedBlink = null;


        try {
            // InternalDrn.g:4087:49: (iv_ruleLedBlink= ruleLedBlink EOF )
            // InternalDrn.g:4088:2: iv_ruleLedBlink= ruleLedBlink EOF
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
    // InternalDrn.g:4094:1: ruleLedBlink returns [EObject current=null] : ( ( (lv_name_0_0= 'ledBlink' ) ) otherlv_1= '(' (otherlv_2= 'color' otherlv_3= '=' ( (lv_color_4_0= ruleColorLed ) ) ) (otherlv_5= 'blink_per_sec' otherlv_6= '=' ( ( (lv_blink_per_secCST_7_0= ruleEInt ) ) | ( (otherlv_8= RULE_ID ) ) ) ) otherlv_9= ')' ) ;
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
        Enumerator lv_color_4_0 = null;

        AntlrDatatypeRuleToken lv_blink_per_secCST_7_0 = null;



        	enterRule();

        try {
            // InternalDrn.g:4100:2: ( ( ( (lv_name_0_0= 'ledBlink' ) ) otherlv_1= '(' (otherlv_2= 'color' otherlv_3= '=' ( (lv_color_4_0= ruleColorLed ) ) ) (otherlv_5= 'blink_per_sec' otherlv_6= '=' ( ( (lv_blink_per_secCST_7_0= ruleEInt ) ) | ( (otherlv_8= RULE_ID ) ) ) ) otherlv_9= ')' ) )
            // InternalDrn.g:4101:2: ( ( (lv_name_0_0= 'ledBlink' ) ) otherlv_1= '(' (otherlv_2= 'color' otherlv_3= '=' ( (lv_color_4_0= ruleColorLed ) ) ) (otherlv_5= 'blink_per_sec' otherlv_6= '=' ( ( (lv_blink_per_secCST_7_0= ruleEInt ) ) | ( (otherlv_8= RULE_ID ) ) ) ) otherlv_9= ')' )
            {
            // InternalDrn.g:4101:2: ( ( (lv_name_0_0= 'ledBlink' ) ) otherlv_1= '(' (otherlv_2= 'color' otherlv_3= '=' ( (lv_color_4_0= ruleColorLed ) ) ) (otherlv_5= 'blink_per_sec' otherlv_6= '=' ( ( (lv_blink_per_secCST_7_0= ruleEInt ) ) | ( (otherlv_8= RULE_ID ) ) ) ) otherlv_9= ')' )
            // InternalDrn.g:4102:3: ( (lv_name_0_0= 'ledBlink' ) ) otherlv_1= '(' (otherlv_2= 'color' otherlv_3= '=' ( (lv_color_4_0= ruleColorLed ) ) ) (otherlv_5= 'blink_per_sec' otherlv_6= '=' ( ( (lv_blink_per_secCST_7_0= ruleEInt ) ) | ( (otherlv_8= RULE_ID ) ) ) ) otherlv_9= ')'
            {
            // InternalDrn.g:4102:3: ( (lv_name_0_0= 'ledBlink' ) )
            // InternalDrn.g:4103:4: (lv_name_0_0= 'ledBlink' )
            {
            // InternalDrn.g:4103:4: (lv_name_0_0= 'ledBlink' )
            // InternalDrn.g:4104:5: lv_name_0_0= 'ledBlink'
            {
            lv_name_0_0=(Token)match(input,53,FOLLOW_13); 

            					newLeafNode(lv_name_0_0, grammarAccess.getLedBlinkAccess().getNameLedBlinkKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLedBlinkRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "ledBlink");
            				

            }


            }

            otherlv_1=(Token)match(input,20,FOLLOW_35); 

            			newLeafNode(otherlv_1, grammarAccess.getLedBlinkAccess().getLeftParenthesisKeyword_1());
            		
            // InternalDrn.g:4120:3: (otherlv_2= 'color' otherlv_3= '=' ( (lv_color_4_0= ruleColorLed ) ) )
            // InternalDrn.g:4121:4: otherlv_2= 'color' otherlv_3= '=' ( (lv_color_4_0= ruleColorLed ) )
            {
            otherlv_2=(Token)match(input,52,FOLLOW_6); 

            				newLeafNode(otherlv_2, grammarAccess.getLedBlinkAccess().getColorKeyword_2_0());
            			
            otherlv_3=(Token)match(input,14,FOLLOW_36); 

            				newLeafNode(otherlv_3, grammarAccess.getLedBlinkAccess().getEqualsSignKeyword_2_1());
            			
            // InternalDrn.g:4129:4: ( (lv_color_4_0= ruleColorLed ) )
            // InternalDrn.g:4130:5: (lv_color_4_0= ruleColorLed )
            {
            // InternalDrn.g:4130:5: (lv_color_4_0= ruleColorLed )
            // InternalDrn.g:4131:6: lv_color_4_0= ruleColorLed
            {

            						newCompositeNode(grammarAccess.getLedBlinkAccess().getColorColorLedEnumRuleCall_2_2_0());
            					
            pushFollow(FOLLOW_37);
            lv_color_4_0=ruleColorLed();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getLedBlinkRule());
            						}
            						set(
            							current,
            							"color",
            							lv_color_4_0,
            							"sar.drone.Drn.ColorLed");
            						afterParserOrEnumRuleCall();
            					

            }


            }


            }

            // InternalDrn.g:4149:3: (otherlv_5= 'blink_per_sec' otherlv_6= '=' ( ( (lv_blink_per_secCST_7_0= ruleEInt ) ) | ( (otherlv_8= RULE_ID ) ) ) )
            // InternalDrn.g:4150:4: otherlv_5= 'blink_per_sec' otherlv_6= '=' ( ( (lv_blink_per_secCST_7_0= ruleEInt ) ) | ( (otherlv_8= RULE_ID ) ) )
            {
            otherlv_5=(Token)match(input,54,FOLLOW_6); 

            				newLeafNode(otherlv_5, grammarAccess.getLedBlinkAccess().getBlink_per_secKeyword_3_0());
            			
            otherlv_6=(Token)match(input,14,FOLLOW_19); 

            				newLeafNode(otherlv_6, grammarAccess.getLedBlinkAccess().getEqualsSignKeyword_3_1());
            			
            // InternalDrn.g:4158:4: ( ( (lv_blink_per_secCST_7_0= ruleEInt ) ) | ( (otherlv_8= RULE_ID ) ) )
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==RULE_INT||LA62_0==58) ) {
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
                    // InternalDrn.g:4159:5: ( (lv_blink_per_secCST_7_0= ruleEInt ) )
                    {
                    // InternalDrn.g:4159:5: ( (lv_blink_per_secCST_7_0= ruleEInt ) )
                    // InternalDrn.g:4160:6: (lv_blink_per_secCST_7_0= ruleEInt )
                    {
                    // InternalDrn.g:4160:6: (lv_blink_per_secCST_7_0= ruleEInt )
                    // InternalDrn.g:4161:7: lv_blink_per_secCST_7_0= ruleEInt
                    {

                    							newCompositeNode(grammarAccess.getLedBlinkAccess().getBlink_per_secCSTEIntParserRuleCall_3_2_0_0());
                    						
                    pushFollow(FOLLOW_29);
                    lv_blink_per_secCST_7_0=ruleEInt();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getLedBlinkRule());
                    							}
                    							set(
                    								current,
                    								"blink_per_secCST",
                    								lv_blink_per_secCST_7_0,
                    								"sar.drone.Drn.EInt");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDrn.g:4179:5: ( (otherlv_8= RULE_ID ) )
                    {
                    // InternalDrn.g:4179:5: ( (otherlv_8= RULE_ID ) )
                    // InternalDrn.g:4180:6: (otherlv_8= RULE_ID )
                    {
                    // InternalDrn.g:4180:6: (otherlv_8= RULE_ID )
                    // InternalDrn.g:4181:7: otherlv_8= RULE_ID
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getLedBlinkRule());
                    							}
                    						
                    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_29); 

                    							newLeafNode(otherlv_8, grammarAccess.getLedBlinkAccess().getBlink_per_secVARParametreCrossReference_3_2_1_0());
                    						

                    }


                    }


                    }
                    break;

            }


            }

            otherlv_9=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getLedBlinkAccess().getRightParenthesisKeyword_4());
            		

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


    // $ANTLR start "entryRuleCameraFront"
    // InternalDrn.g:4202:1: entryRuleCameraFront returns [EObject current=null] : iv_ruleCameraFront= ruleCameraFront EOF ;
    public final EObject entryRuleCameraFront() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCameraFront = null;


        try {
            // InternalDrn.g:4202:52: (iv_ruleCameraFront= ruleCameraFront EOF )
            // InternalDrn.g:4203:2: iv_ruleCameraFront= ruleCameraFront EOF
            {
             newCompositeNode(grammarAccess.getCameraFrontRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCameraFront=ruleCameraFront();

            state._fsp--;

             current =iv_ruleCameraFront; 
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
    // $ANTLR end "entryRuleCameraFront"


    // $ANTLR start "ruleCameraFront"
    // InternalDrn.g:4209:1: ruleCameraFront returns [EObject current=null] : ( ( (lv_name_0_0= 'cameraFront' ) ) otherlv_1= '(' otherlv_2= 'mode=' ( (lv_mode_3_0= ruleMode ) ) otherlv_4= ')' ) ;
    public final EObject ruleCameraFront() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Enumerator lv_mode_3_0 = null;



        	enterRule();

        try {
            // InternalDrn.g:4215:2: ( ( ( (lv_name_0_0= 'cameraFront' ) ) otherlv_1= '(' otherlv_2= 'mode=' ( (lv_mode_3_0= ruleMode ) ) otherlv_4= ')' ) )
            // InternalDrn.g:4216:2: ( ( (lv_name_0_0= 'cameraFront' ) ) otherlv_1= '(' otherlv_2= 'mode=' ( (lv_mode_3_0= ruleMode ) ) otherlv_4= ')' )
            {
            // InternalDrn.g:4216:2: ( ( (lv_name_0_0= 'cameraFront' ) ) otherlv_1= '(' otherlv_2= 'mode=' ( (lv_mode_3_0= ruleMode ) ) otherlv_4= ')' )
            // InternalDrn.g:4217:3: ( (lv_name_0_0= 'cameraFront' ) ) otherlv_1= '(' otherlv_2= 'mode=' ( (lv_mode_3_0= ruleMode ) ) otherlv_4= ')'
            {
            // InternalDrn.g:4217:3: ( (lv_name_0_0= 'cameraFront' ) )
            // InternalDrn.g:4218:4: (lv_name_0_0= 'cameraFront' )
            {
            // InternalDrn.g:4218:4: (lv_name_0_0= 'cameraFront' )
            // InternalDrn.g:4219:5: lv_name_0_0= 'cameraFront'
            {
            lv_name_0_0=(Token)match(input,55,FOLLOW_13); 

            					newLeafNode(lv_name_0_0, grammarAccess.getCameraFrontAccess().getNameCameraFrontKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCameraFrontRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "cameraFront");
            				

            }


            }

            otherlv_1=(Token)match(input,20,FOLLOW_38); 

            			newLeafNode(otherlv_1, grammarAccess.getCameraFrontAccess().getLeftParenthesisKeyword_1());
            		
            otherlv_2=(Token)match(input,56,FOLLOW_39); 

            			newLeafNode(otherlv_2, grammarAccess.getCameraFrontAccess().getModeKeyword_2());
            		
            // InternalDrn.g:4239:3: ( (lv_mode_3_0= ruleMode ) )
            // InternalDrn.g:4240:4: (lv_mode_3_0= ruleMode )
            {
            // InternalDrn.g:4240:4: (lv_mode_3_0= ruleMode )
            // InternalDrn.g:4241:5: lv_mode_3_0= ruleMode
            {

            					newCompositeNode(grammarAccess.getCameraFrontAccess().getModeModeEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_29);
            lv_mode_3_0=ruleMode();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCameraFrontRule());
            					}
            					set(
            						current,
            						"mode",
            						lv_mode_3_0,
            						"sar.drone.Drn.Mode");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getCameraFrontAccess().getRightParenthesisKeyword_4());
            		

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
    // $ANTLR end "ruleCameraFront"


    // $ANTLR start "entryRuleCameraBottom"
    // InternalDrn.g:4266:1: entryRuleCameraBottom returns [EObject current=null] : iv_ruleCameraBottom= ruleCameraBottom EOF ;
    public final EObject entryRuleCameraBottom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCameraBottom = null;


        try {
            // InternalDrn.g:4266:53: (iv_ruleCameraBottom= ruleCameraBottom EOF )
            // InternalDrn.g:4267:2: iv_ruleCameraBottom= ruleCameraBottom EOF
            {
             newCompositeNode(grammarAccess.getCameraBottomRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCameraBottom=ruleCameraBottom();

            state._fsp--;

             current =iv_ruleCameraBottom; 
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
    // $ANTLR end "entryRuleCameraBottom"


    // $ANTLR start "ruleCameraBottom"
    // InternalDrn.g:4273:1: ruleCameraBottom returns [EObject current=null] : ( ( (lv_name_0_0= 'cameraBottom' ) ) otherlv_1= '(' otherlv_2= 'mode=' ( (lv_mode_3_0= ruleMode ) ) otherlv_4= ')' ) ;
    public final EObject ruleCameraBottom() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Enumerator lv_mode_3_0 = null;



        	enterRule();

        try {
            // InternalDrn.g:4279:2: ( ( ( (lv_name_0_0= 'cameraBottom' ) ) otherlv_1= '(' otherlv_2= 'mode=' ( (lv_mode_3_0= ruleMode ) ) otherlv_4= ')' ) )
            // InternalDrn.g:4280:2: ( ( (lv_name_0_0= 'cameraBottom' ) ) otherlv_1= '(' otherlv_2= 'mode=' ( (lv_mode_3_0= ruleMode ) ) otherlv_4= ')' )
            {
            // InternalDrn.g:4280:2: ( ( (lv_name_0_0= 'cameraBottom' ) ) otherlv_1= '(' otherlv_2= 'mode=' ( (lv_mode_3_0= ruleMode ) ) otherlv_4= ')' )
            // InternalDrn.g:4281:3: ( (lv_name_0_0= 'cameraBottom' ) ) otherlv_1= '(' otherlv_2= 'mode=' ( (lv_mode_3_0= ruleMode ) ) otherlv_4= ')'
            {
            // InternalDrn.g:4281:3: ( (lv_name_0_0= 'cameraBottom' ) )
            // InternalDrn.g:4282:4: (lv_name_0_0= 'cameraBottom' )
            {
            // InternalDrn.g:4282:4: (lv_name_0_0= 'cameraBottom' )
            // InternalDrn.g:4283:5: lv_name_0_0= 'cameraBottom'
            {
            lv_name_0_0=(Token)match(input,57,FOLLOW_13); 

            					newLeafNode(lv_name_0_0, grammarAccess.getCameraBottomAccess().getNameCameraBottomKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCameraBottomRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "cameraBottom");
            				

            }


            }

            otherlv_1=(Token)match(input,20,FOLLOW_38); 

            			newLeafNode(otherlv_1, grammarAccess.getCameraBottomAccess().getLeftParenthesisKeyword_1());
            		
            otherlv_2=(Token)match(input,56,FOLLOW_39); 

            			newLeafNode(otherlv_2, grammarAccess.getCameraBottomAccess().getModeKeyword_2());
            		
            // InternalDrn.g:4303:3: ( (lv_mode_3_0= ruleMode ) )
            // InternalDrn.g:4304:4: (lv_mode_3_0= ruleMode )
            {
            // InternalDrn.g:4304:4: (lv_mode_3_0= ruleMode )
            // InternalDrn.g:4305:5: lv_mode_3_0= ruleMode
            {

            					newCompositeNode(grammarAccess.getCameraBottomAccess().getModeModeEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_29);
            lv_mode_3_0=ruleMode();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCameraBottomRule());
            					}
            					set(
            						current,
            						"mode",
            						lv_mode_3_0,
            						"sar.drone.Drn.Mode");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getCameraBottomAccess().getRightParenthesisKeyword_4());
            		

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
    // $ANTLR end "ruleCameraBottom"


    // $ANTLR start "entryRuleEInt"
    // InternalDrn.g:4330:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalDrn.g:4330:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalDrn.g:4331:2: iv_ruleEInt= ruleEInt EOF
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
    // InternalDrn.g:4337:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalDrn.g:4343:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalDrn.g:4344:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalDrn.g:4344:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalDrn.g:4345:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalDrn.g:4345:3: (kw= '-' )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==58) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // InternalDrn.g:4346:4: kw= '-'
                    {
                    kw=(Token)match(input,58,FOLLOW_40); 

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
    // InternalDrn.g:4363:1: ruleColorLed returns [Enumerator current=null] : ( (enumLiteral_0= 'BLUE' ) | (enumLiteral_1= 'RED' ) | (enumLiteral_2= 'YELLOW' ) | (enumLiteral_3= 'GREEN' ) | (enumLiteral_4= 'WHITE' ) ) ;
    public final Enumerator ruleColorLed() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalDrn.g:4369:2: ( ( (enumLiteral_0= 'BLUE' ) | (enumLiteral_1= 'RED' ) | (enumLiteral_2= 'YELLOW' ) | (enumLiteral_3= 'GREEN' ) | (enumLiteral_4= 'WHITE' ) ) )
            // InternalDrn.g:4370:2: ( (enumLiteral_0= 'BLUE' ) | (enumLiteral_1= 'RED' ) | (enumLiteral_2= 'YELLOW' ) | (enumLiteral_3= 'GREEN' ) | (enumLiteral_4= 'WHITE' ) )
            {
            // InternalDrn.g:4370:2: ( (enumLiteral_0= 'BLUE' ) | (enumLiteral_1= 'RED' ) | (enumLiteral_2= 'YELLOW' ) | (enumLiteral_3= 'GREEN' ) | (enumLiteral_4= 'WHITE' ) )
            int alt64=5;
            switch ( input.LA(1) ) {
            case 59:
                {
                alt64=1;
                }
                break;
            case 60:
                {
                alt64=2;
                }
                break;
            case 61:
                {
                alt64=3;
                }
                break;
            case 62:
                {
                alt64=4;
                }
                break;
            case 63:
                {
                alt64=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 64, 0, input);

                throw nvae;
            }

            switch (alt64) {
                case 1 :
                    // InternalDrn.g:4371:3: (enumLiteral_0= 'BLUE' )
                    {
                    // InternalDrn.g:4371:3: (enumLiteral_0= 'BLUE' )
                    // InternalDrn.g:4372:4: enumLiteral_0= 'BLUE'
                    {
                    enumLiteral_0=(Token)match(input,59,FOLLOW_2); 

                    				current = grammarAccess.getColorLedAccess().getBLUEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getColorLedAccess().getBLUEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDrn.g:4379:3: (enumLiteral_1= 'RED' )
                    {
                    // InternalDrn.g:4379:3: (enumLiteral_1= 'RED' )
                    // InternalDrn.g:4380:4: enumLiteral_1= 'RED'
                    {
                    enumLiteral_1=(Token)match(input,60,FOLLOW_2); 

                    				current = grammarAccess.getColorLedAccess().getREDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getColorLedAccess().getREDEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalDrn.g:4387:3: (enumLiteral_2= 'YELLOW' )
                    {
                    // InternalDrn.g:4387:3: (enumLiteral_2= 'YELLOW' )
                    // InternalDrn.g:4388:4: enumLiteral_2= 'YELLOW'
                    {
                    enumLiteral_2=(Token)match(input,61,FOLLOW_2); 

                    				current = grammarAccess.getColorLedAccess().getYELLOWEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getColorLedAccess().getYELLOWEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalDrn.g:4395:3: (enumLiteral_3= 'GREEN' )
                    {
                    // InternalDrn.g:4395:3: (enumLiteral_3= 'GREEN' )
                    // InternalDrn.g:4396:4: enumLiteral_3= 'GREEN'
                    {
                    enumLiteral_3=(Token)match(input,62,FOLLOW_2); 

                    				current = grammarAccess.getColorLedAccess().getGREENEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getColorLedAccess().getGREENEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalDrn.g:4403:3: (enumLiteral_4= 'WHITE' )
                    {
                    // InternalDrn.g:4403:3: (enumLiteral_4= 'WHITE' )
                    // InternalDrn.g:4404:4: enumLiteral_4= 'WHITE'
                    {
                    enumLiteral_4=(Token)match(input,63,FOLLOW_2); 

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
    // InternalDrn.g:4414:1: ruleMode returns [Enumerator current=null] : ( (enumLiteral_0= 'OFF' ) | (enumLiteral_1= 'ON' ) ) ;
    public final Enumerator ruleMode() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalDrn.g:4420:2: ( ( (enumLiteral_0= 'OFF' ) | (enumLiteral_1= 'ON' ) ) )
            // InternalDrn.g:4421:2: ( (enumLiteral_0= 'OFF' ) | (enumLiteral_1= 'ON' ) )
            {
            // InternalDrn.g:4421:2: ( (enumLiteral_0= 'OFF' ) | (enumLiteral_1= 'ON' ) )
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==64) ) {
                alt65=1;
            }
            else if ( (LA65_0==65) ) {
                alt65=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 65, 0, input);

                throw nvae;
            }
            switch (alt65) {
                case 1 :
                    // InternalDrn.g:4422:3: (enumLiteral_0= 'OFF' )
                    {
                    // InternalDrn.g:4422:3: (enumLiteral_0= 'OFF' )
                    // InternalDrn.g:4423:4: enumLiteral_0= 'OFF'
                    {
                    enumLiteral_0=(Token)match(input,64,FOLLOW_2); 

                    				current = grammarAccess.getModeAccess().getOFFEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getModeAccess().getOFFEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDrn.g:4430:3: (enumLiteral_1= 'ON' )
                    {
                    // InternalDrn.g:4430:3: (enumLiteral_1= 'ON' )
                    // InternalDrn.g:4431:4: enumLiteral_1= 'ON'
                    {
                    enumLiteral_1=(Token)match(input,65,FOLLOW_2); 

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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000022010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000000000D0000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0400000000000020L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000400010L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0003BFAFE6100010L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0003BFAFE6110010L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0004000000800002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0400000000000030L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0003BFAFE6000010L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000001400000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0400000000400020L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000242FE4000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x02A8000000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0xF800000000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000000020L});

}