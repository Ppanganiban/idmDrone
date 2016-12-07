/*
 * generated by Xtext 2.10.0
 */
package sar.drone.ide.contentassist.antlr;

import com.google.inject.Inject;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import sar.drone.ide.contentassist.antlr.internal.InternalDrnParser;
import sar.drone.services.DrnGrammarAccess;

public class DrnParser extends AbstractContentAssistParser {

	@Inject
	private DrnGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalDrnParser createParser() {
		InternalDrnParser result = new InternalDrnParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getLimitAccess().getAlternatives(), "rule__Limit__Alternatives");
					put(grammarAccess.getSurfaceAccess().getAlternatives(), "rule__Surface__Alternatives");
					put(grammarAccess.getInitialPositionAccess().getAlternatives(), "rule__InitialPosition__Alternatives");
					put(grammarAccess.getExpressionAccess().getAlternatives(), "rule__Expression__Alternatives");
					put(grammarAccess.getMovementAccess().getAlternatives(), "rule__Movement__Alternatives");
					put(grammarAccess.getAndAccess().getAlternatives_3(), "rule__And__Alternatives_3");
					put(grammarAccess.getAndAccess().getAlternatives_5(), "rule__And__Alternatives_5");
					put(grammarAccess.getAndAccess().getAlternatives_6_1(), "rule__And__Alternatives_6_1");
					put(grammarAccess.getDepY_ImplAccess().getAlternatives(), "rule__DepY_Impl__Alternatives");
					put(grammarAccess.getDepX_ImplAccess().getAlternatives(), "rule__DepX_Impl__Alternatives");
					put(grammarAccess.getDepZ_ImplAccess().getAlternatives(), "rule__DepZ_Impl__Alternatives");
					put(grammarAccess.getDepXY_IMPLAccess().getAlternatives(), "rule__DepXY_IMPL__Alternatives");
					put(grammarAccess.getDepYZ_IMPLAccess().getAlternatives(), "rule__DepYZ_IMPL__Alternatives");
					put(grammarAccess.getDepXZ_IMPLAccess().getAlternatives(), "rule__DepXZ_IMPL__Alternatives");
					put(grammarAccess.getOptionAccess().getAlternatives(), "rule__Option__Alternatives");
					put(grammarAccess.getAttributAccess().getAlternatives(), "rule__Attribut__Alternatives");
					put(grammarAccess.getColorLedAccess().getAlternatives(), "rule__ColorLed__Alternatives");
					put(grammarAccess.getModeAccess().getAlternatives(), "rule__Mode__Alternatives");
					put(grammarAccess.getEBoolAccess().getAlternatives(), "rule__EBool__Alternatives");
					put(grammarAccess.getDirectionTypeAccess().getAlternatives(), "rule__DirectionType__Alternatives");
					put(grammarAccess.getModelAccess().getGroup(), "rule__Model__Group__0");
					put(grammarAccess.getContextAccess().getGroup(), "rule__Context__Group__0");
					put(grammarAccess.getContextAccess().getGroup_4(), "rule__Context__Group_4__0");
					put(grammarAccess.getInitialDirectionAccess().getGroup(), "rule__InitialDirection__Group__0");
					put(grammarAccess.getInitialPositionXAccess().getGroup(), "rule__InitialPositionX__Group__0");
					put(grammarAccess.getInitialPositionYAccess().getGroup(), "rule__InitialPositionY__Group__0");
					put(grammarAccess.getMaxLengthAccess().getGroup(), "rule__MaxLength__Group__0");
					put(grammarAccess.getMaxWidthAccess().getGroup(), "rule__MaxWidth__Group__0");
					put(grammarAccess.getMaxSpeedAccess().getGroup(), "rule__MaxSpeed__Group__0");
					put(grammarAccess.getMaxHeightAccess().getGroup(), "rule__MaxHeight__Group__0");
					put(grammarAccess.getAssignementAccess().getGroup(), "rule__Assignement__Group__0");
					put(grammarAccess.getAssignementAccess().getGroup_4(), "rule__Assignement__Group_4__0");
					put(grammarAccess.getExpressionAccess().getGroup_0(), "rule__Expression__Group_0__0");
					put(grammarAccess.getExpressionAccess().getGroup_0_1(), "rule__Expression__Group_0_1__0");
					put(grammarAccess.getExpressionAccess().getGroup_1(), "rule__Expression__Group_1__0");
					put(grammarAccess.getExpressionAccess().getGroup_1_2(), "rule__Expression__Group_1_2__0");
					put(grammarAccess.getExpressionAccess().getGroup_1_3(), "rule__Expression__Group_1_3__0");
					put(grammarAccess.getExpressionAccess().getGroup_1_5(), "rule__Expression__Group_1_5__0");
					put(grammarAccess.getAndAccess().getGroup(), "rule__And__Group__0");
					put(grammarAccess.getAndAccess().getGroup_6(), "rule__And__Group_6__0");
					put(grammarAccess.getFORWARDAccess().getGroup(), "rule__FORWARD__Group__0");
					put(grammarAccess.getBACKWARDAccess().getGroup(), "rule__BACKWARD__Group__0");
					put(grammarAccess.getLEFTAccess().getGroup(), "rule__LEFT__Group__0");
					put(grammarAccess.getRIGHTAccess().getGroup(), "rule__RIGHT__Group__0");
					put(grammarAccess.getUPAccess().getGroup(), "rule__UP__Group__0");
					put(grammarAccess.getDOWNAccess().getGroup(), "rule__DOWN__Group__0");
					put(grammarAccess.getCERCLEXYAccess().getGroup(), "rule__CERCLEXY__Group__0");
					put(grammarAccess.getCARREXYAccess().getGroup(), "rule__CARREXY__Group__0");
					put(grammarAccess.getCERCLEYZAccess().getGroup(), "rule__CERCLEYZ__Group__0");
					put(grammarAccess.getCARREYZAccess().getGroup(), "rule__CARREYZ__Group__0");
					put(grammarAccess.getCERCLEXZAccess().getGroup(), "rule__CERCLEXZ__Group__0");
					put(grammarAccess.getCARREXZAccess().getGroup(), "rule__CARREXZ__Group__0");
					put(grammarAccess.getFlipAccess().getGroup(), "rule__Flip__Group__0");
					put(grammarAccess.getRotateAccess().getGroup(), "rule__Rotate__Group__0");
					put(grammarAccess.getWaitAccess().getGroup(), "rule__Wait__Group__0");
					put(grammarAccess.getTakeOffAccess().getGroup(), "rule__TakeOff__Group__0");
					put(grammarAccess.getLandAccess().getGroup(), "rule__Land__Group__0");
					put(grammarAccess.getDeviceAccess().getGroup(), "rule__Device__Group__0");
					put(grammarAccess.getDeviceAccess().getGroup_4(), "rule__Device__Group_4__0");
					put(grammarAccess.getDeclarationAccess().getGroup(), "rule__Declaration__Group__0");
					put(grammarAccess.getDefinitionAccess().getGroup(), "rule__Definition__Group__0");
					put(grammarAccess.getWithAccess().getGroup(), "rule__With__Group__0");
					put(grammarAccess.getWithAccess().getGroup_2(), "rule__With__Group_2__0");
					put(grammarAccess.getRefDeviceAccess().getGroup(), "rule__RefDevice__Group__0");
					put(grammarAccess.getRefDeviceAccess().getGroup_4(), "rule__RefDevice__Group_4__0");
					put(grammarAccess.getAttributAccess().getGroup_0(), "rule__Attribut__Group_0__0");
					put(grammarAccess.getAttributAccess().getGroup_0_3(), "rule__Attribut__Group_0_3__0");
					put(grammarAccess.getLed_ImplAccess().getGroup(), "rule__Led_Impl__Group__0");
					put(grammarAccess.getLedBlinkAccess().getGroup(), "rule__LedBlink__Group__0");
					put(grammarAccess.getLedBlinkAccess().getGroup_5(), "rule__LedBlink__Group_5__0");
					put(grammarAccess.getLedBlinkAccess().getGroup_6(), "rule__LedBlink__Group_6__0");
					put(grammarAccess.getCameraAccess().getGroup(), "rule__Camera__Group__0");
					put(grammarAccess.getTypeGenericAccess().getGroup(), "rule__TypeGeneric__Group__0");
					put(grammarAccess.getTypeGenericAccess().getGroup_4(), "rule__TypeGeneric__Group_4__0");
					put(grammarAccess.getElementAccess().getGroup(), "rule__Element__Group__0");
					put(grammarAccess.getEIntAccess().getGroup(), "rule__EInt__Group__0");
					put(grammarAccess.getModelAccess().getContextAssignment_2(), "rule__Model__ContextAssignment_2");
					put(grammarAccess.getModelAccess().getTypesAssignment_3(), "rule__Model__TypesAssignment_3");
					put(grammarAccess.getModelAccess().getDevicesAssignment_4(), "rule__Model__DevicesAssignment_4");
					put(grammarAccess.getModelAccess().getAssignementAssignment_5(), "rule__Model__AssignementAssignment_5");
					put(grammarAccess.getModelAccess().getAssignementAssignment_6(), "rule__Model__AssignementAssignment_6");
					put(grammarAccess.getModelAccess().getMainAssignment_9(), "rule__Model__MainAssignment_9");
					put(grammarAccess.getContextAccess().getNameAssignment_0(), "rule__Context__NameAssignment_0");
					put(grammarAccess.getContextAccess().getLimitAssignment_2(), "rule__Context__LimitAssignment_2");
					put(grammarAccess.getContextAccess().getLimitAssignment_4_0(), "rule__Context__LimitAssignment_4_0");
					put(grammarAccess.getInitialDirectionAccess().getNameAssignment_0(), "rule__InitialDirection__NameAssignment_0");
					put(grammarAccess.getInitialDirectionAccess().getValueAssignment_2(), "rule__InitialDirection__ValueAssignment_2");
					put(grammarAccess.getInitialPositionXAccess().getNameAssignment_0(), "rule__InitialPositionX__NameAssignment_0");
					put(grammarAccess.getInitialPositionXAccess().getValueAssignment_2(), "rule__InitialPositionX__ValueAssignment_2");
					put(grammarAccess.getInitialPositionYAccess().getNameAssignment_0(), "rule__InitialPositionY__NameAssignment_0");
					put(grammarAccess.getInitialPositionYAccess().getValueAssignment_2(), "rule__InitialPositionY__ValueAssignment_2");
					put(grammarAccess.getMaxLengthAccess().getNameAssignment_0(), "rule__MaxLength__NameAssignment_0");
					put(grammarAccess.getMaxLengthAccess().getValueAssignment_2(), "rule__MaxLength__ValueAssignment_2");
					put(grammarAccess.getMaxWidthAccess().getNameAssignment_0(), "rule__MaxWidth__NameAssignment_0");
					put(grammarAccess.getMaxWidthAccess().getValueAssignment_2(), "rule__MaxWidth__ValueAssignment_2");
					put(grammarAccess.getMaxSpeedAccess().getNameAssignment_0(), "rule__MaxSpeed__NameAssignment_0");
					put(grammarAccess.getMaxSpeedAccess().getValueAssignment_2(), "rule__MaxSpeed__ValueAssignment_2");
					put(grammarAccess.getMaxHeightAccess().getNameAssignment_0(), "rule__MaxHeight__NameAssignment_0");
					put(grammarAccess.getMaxHeightAccess().getValueAssignment_2(), "rule__MaxHeight__ValueAssignment_2");
					put(grammarAccess.getAssignementAccess().getNameAssignment_0(), "rule__Assignement__NameAssignment_0");
					put(grammarAccess.getAssignementAccess().getOperandesAssignment_2(), "rule__Assignement__OperandesAssignment_2");
					put(grammarAccess.getAssignementAccess().getOperandesAssignment_4_0(), "rule__Assignement__OperandesAssignment_4_0");
					put(grammarAccess.getExpressionAccess().getMoveAssignment_0_0(), "rule__Expression__MoveAssignment_0_0");
					put(grammarAccess.getExpressionAccess().getRepeatCSTAssignment_0_1_1(), "rule__Expression__RepeatCSTAssignment_0_1_1");
					put(grammarAccess.getExpressionAccess().getWithAssignment_0_2(), "rule__Expression__WithAssignment_0_2");
					put(grammarAccess.getExpressionAccess().getMoveAssignment_1_1(), "rule__Expression__MoveAssignment_1_1");
					put(grammarAccess.getExpressionAccess().getThenAssignment_1_2_1(), "rule__Expression__ThenAssignment_1_2_1");
					put(grammarAccess.getExpressionAccess().getThenAssignment_1_3_1(), "rule__Expression__ThenAssignment_1_3_1");
					put(grammarAccess.getExpressionAccess().getRepeatCSTAssignment_1_5_1(), "rule__Expression__RepeatCSTAssignment_1_5_1");
					put(grammarAccess.getExpressionAccess().getWithAssignment_1_6(), "rule__Expression__WithAssignment_1_6");
					put(grammarAccess.getRefPartAccess().getVariable_partieAssignment(), "rule__RefPart__Variable_partieAssignment");
					put(grammarAccess.getAndAccess().getNameAssignment_1(), "rule__And__NameAssignment_1");
					put(grammarAccess.getAndAccess().getRotateAssignment_3_0(), "rule__And__RotateAssignment_3_0");
					put(grammarAccess.getAndAccess().getDepxAssignment_3_1(), "rule__And__DepxAssignment_3_1");
					put(grammarAccess.getAndAccess().getDepyAssignment_3_2(), "rule__And__DepyAssignment_3_2");
					put(grammarAccess.getAndAccess().getDepzAssignment_3_3(), "rule__And__DepzAssignment_3_3");
					put(grammarAccess.getAndAccess().getDepxzAssignment_3_4(), "rule__And__DepxzAssignment_3_4");
					put(grammarAccess.getAndAccess().getDepxyAssignment_3_5(), "rule__And__DepxyAssignment_3_5");
					put(grammarAccess.getAndAccess().getDepyzAssignment_3_6(), "rule__And__DepyzAssignment_3_6");
					put(grammarAccess.getAndAccess().getRotateAssignment_5_0(), "rule__And__RotateAssignment_5_0");
					put(grammarAccess.getAndAccess().getDepxAssignment_5_1(), "rule__And__DepxAssignment_5_1");
					put(grammarAccess.getAndAccess().getDepyAssignment_5_2(), "rule__And__DepyAssignment_5_2");
					put(grammarAccess.getAndAccess().getDepzAssignment_5_3(), "rule__And__DepzAssignment_5_3");
					put(grammarAccess.getAndAccess().getDepxzAssignment_5_4(), "rule__And__DepxzAssignment_5_4");
					put(grammarAccess.getAndAccess().getDepxyAssignment_5_5(), "rule__And__DepxyAssignment_5_5");
					put(grammarAccess.getAndAccess().getDepyzAssignment_5_6(), "rule__And__DepyzAssignment_5_6");
					put(grammarAccess.getAndAccess().getRotateAssignment_6_1_0(), "rule__And__RotateAssignment_6_1_0");
					put(grammarAccess.getAndAccess().getDepxAssignment_6_1_1(), "rule__And__DepxAssignment_6_1_1");
					put(grammarAccess.getAndAccess().getDepyAssignment_6_1_2(), "rule__And__DepyAssignment_6_1_2");
					put(grammarAccess.getAndAccess().getDepzAssignment_6_1_3(), "rule__And__DepzAssignment_6_1_3");
					put(grammarAccess.getAndAccess().getDepxzAssignment_6_1_4(), "rule__And__DepxzAssignment_6_1_4");
					put(grammarAccess.getAndAccess().getDepxyAssignment_6_1_5(), "rule__And__DepxyAssignment_6_1_5");
					put(grammarAccess.getAndAccess().getDepyzAssignment_6_1_6(), "rule__And__DepyzAssignment_6_1_6");
					put(grammarAccess.getFORWARDAccess().getNameAssignment_0(), "rule__FORWARD__NameAssignment_0");
					put(grammarAccess.getFORWARDAccess().getDistanceCSTAssignment_4(), "rule__FORWARD__DistanceCSTAssignment_4");
					put(grammarAccess.getFORWARDAccess().getTempsCSTAssignment_7(), "rule__FORWARD__TempsCSTAssignment_7");
					put(grammarAccess.getBACKWARDAccess().getNameAssignment_0(), "rule__BACKWARD__NameAssignment_0");
					put(grammarAccess.getBACKWARDAccess().getDistanceCSTAssignment_4(), "rule__BACKWARD__DistanceCSTAssignment_4");
					put(grammarAccess.getBACKWARDAccess().getTempsCSTAssignment_7(), "rule__BACKWARD__TempsCSTAssignment_7");
					put(grammarAccess.getLEFTAccess().getNameAssignment_0(), "rule__LEFT__NameAssignment_0");
					put(grammarAccess.getLEFTAccess().getDistanceCSTAssignment_4(), "rule__LEFT__DistanceCSTAssignment_4");
					put(grammarAccess.getLEFTAccess().getTempsCSTAssignment_7(), "rule__LEFT__TempsCSTAssignment_7");
					put(grammarAccess.getRIGHTAccess().getNameAssignment_0(), "rule__RIGHT__NameAssignment_0");
					put(grammarAccess.getRIGHTAccess().getDistanceCSTAssignment_4(), "rule__RIGHT__DistanceCSTAssignment_4");
					put(grammarAccess.getRIGHTAccess().getTempsCSTAssignment_7(), "rule__RIGHT__TempsCSTAssignment_7");
					put(grammarAccess.getUPAccess().getNameAssignment_0(), "rule__UP__NameAssignment_0");
					put(grammarAccess.getUPAccess().getDistanceCSTAssignment_4(), "rule__UP__DistanceCSTAssignment_4");
					put(grammarAccess.getUPAccess().getTempsCSTAssignment_7(), "rule__UP__TempsCSTAssignment_7");
					put(grammarAccess.getDOWNAccess().getNameAssignment_0(), "rule__DOWN__NameAssignment_0");
					put(grammarAccess.getDOWNAccess().getDistanceCSTAssignment_4(), "rule__DOWN__DistanceCSTAssignment_4");
					put(grammarAccess.getDOWNAccess().getTempsCSTAssignment_7(), "rule__DOWN__TempsCSTAssignment_7");
					put(grammarAccess.getCERCLEXYAccess().getNameAssignment_0(), "rule__CERCLEXY__NameAssignment_0");
					put(grammarAccess.getCERCLEXYAccess().getRayonCSTAssignment_4(), "rule__CERCLEXY__RayonCSTAssignment_4");
					put(grammarAccess.getCERCLEXYAccess().getTempsCSTAssignment_7(), "rule__CERCLEXY__TempsCSTAssignment_7");
					put(grammarAccess.getCARREXYAccess().getNameAssignment_0(), "rule__CARREXY__NameAssignment_0");
					put(grammarAccess.getCARREXYAccess().getCoteCSTAssignment_4(), "rule__CARREXY__CoteCSTAssignment_4");
					put(grammarAccess.getCARREXYAccess().getTempsCSTAssignment_7(), "rule__CARREXY__TempsCSTAssignment_7");
					put(grammarAccess.getCERCLEYZAccess().getNameAssignment_0(), "rule__CERCLEYZ__NameAssignment_0");
					put(grammarAccess.getCERCLEYZAccess().getRayonCSTAssignment_4(), "rule__CERCLEYZ__RayonCSTAssignment_4");
					put(grammarAccess.getCERCLEYZAccess().getTempsCSTAssignment_7(), "rule__CERCLEYZ__TempsCSTAssignment_7");
					put(grammarAccess.getCARREYZAccess().getNameAssignment_0(), "rule__CARREYZ__NameAssignment_0");
					put(grammarAccess.getCARREYZAccess().getCoteCSTAssignment_4(), "rule__CARREYZ__CoteCSTAssignment_4");
					put(grammarAccess.getCARREYZAccess().getTempsCSTAssignment_7(), "rule__CARREYZ__TempsCSTAssignment_7");
					put(grammarAccess.getCERCLEXZAccess().getNameAssignment_0(), "rule__CERCLEXZ__NameAssignment_0");
					put(grammarAccess.getCERCLEXZAccess().getRayonCSTAssignment_4(), "rule__CERCLEXZ__RayonCSTAssignment_4");
					put(grammarAccess.getCERCLEXZAccess().getTempsCSTAssignment_7(), "rule__CERCLEXZ__TempsCSTAssignment_7");
					put(grammarAccess.getCARREXZAccess().getNameAssignment_0(), "rule__CARREXZ__NameAssignment_0");
					put(grammarAccess.getCARREXZAccess().getCoteCSTAssignment_4(), "rule__CARREXZ__CoteCSTAssignment_4");
					put(grammarAccess.getCARREXZAccess().getTempsCSTAssignment_7(), "rule__CARREXZ__TempsCSTAssignment_7");
					put(grammarAccess.getFlipAccess().getNameAssignment_0(), "rule__Flip__NameAssignment_0");
					put(grammarAccess.getRotateAccess().getNameAssignment_0(), "rule__Rotate__NameAssignment_0");
					put(grammarAccess.getRotateAccess().getAngleCSTAssignment_4(), "rule__Rotate__AngleCSTAssignment_4");
					put(grammarAccess.getRotateAccess().getTempsCSTAssignment_7(), "rule__Rotate__TempsCSTAssignment_7");
					put(grammarAccess.getWaitAccess().getNameAssignment_0(), "rule__Wait__NameAssignment_0");
					put(grammarAccess.getWaitAccess().getTempsCSTAssignment_4(), "rule__Wait__TempsCSTAssignment_4");
					put(grammarAccess.getTakeOffAccess().getNameAssignment_0(), "rule__TakeOff__NameAssignment_0");
					put(grammarAccess.getLandAccess().getNameAssignment_0(), "rule__Land__NameAssignment_0");
					put(grammarAccess.getDeviceAccess().getNameAssignment_1(), "rule__Device__NameAssignment_1");
					put(grammarAccess.getDeviceAccess().getDeclarationsAssignment_3(), "rule__Device__DeclarationsAssignment_3");
					put(grammarAccess.getDeviceAccess().getDeclarationsAssignment_4_1(), "rule__Device__DeclarationsAssignment_4_1");
					put(grammarAccess.getDeclarationAccess().getTypeAssignment_1(), "rule__Declaration__TypeAssignment_1");
					put(grammarAccess.getDeclarationAccess().getNameAssignment_2(), "rule__Declaration__NameAssignment_2");
					put(grammarAccess.getDefinitionAccess().getLeftAssignment_0(), "rule__Definition__LeftAssignment_0");
					put(grammarAccess.getDefinitionAccess().getRightAssignment_2(), "rule__Definition__RightAssignment_2");
					put(grammarAccess.getWithAccess().getNameAssignment_0(), "rule__With__NameAssignment_0");
					put(grammarAccess.getWithAccess().getOptionAssignment_1(), "rule__With__OptionAssignment_1");
					put(grammarAccess.getWithAccess().getOptionAssignment_2_1(), "rule__With__OptionAssignment_2_1");
					put(grammarAccess.getRefDeviceAccess().getDevAssignment_0(), "rule__RefDevice__DevAssignment_0");
					put(grammarAccess.getRefDeviceAccess().getModeAssignment_3(), "rule__RefDevice__ModeAssignment_3");
					put(grammarAccess.getRefDeviceAccess().getDefinitionsAssignment_4_1(), "rule__RefDevice__DefinitionsAssignment_4_1");
					put(grammarAccess.getAttributAccess().getNameAssignment_0_1(), "rule__Attribut__NameAssignment_0_1");
					put(grammarAccess.getAttributAccess().getTypeAssignment_0_3_0(), "rule__Attribut__TypeAssignment_0_3_0");
					put(grammarAccess.getAttributAccess().getElmtAssignment_0_3_2(), "rule__Attribut__ElmtAssignment_0_3_2");
					put(grammarAccess.getAttributAccess().getModeAssignment_1(), "rule__Attribut__ModeAssignment_1");
					put(grammarAccess.getAttributAccess().getIntAssignment_2(), "rule__Attribut__IntAssignment_2");
					put(grammarAccess.getAttributAccess().getBoolAssignment_3(), "rule__Attribut__BoolAssignment_3");
					put(grammarAccess.getLed_ImplAccess().getNameAssignment_0(), "rule__Led_Impl__NameAssignment_0");
					put(grammarAccess.getLed_ImplAccess().getModeAssignment_4(), "rule__Led_Impl__ModeAssignment_4");
					put(grammarAccess.getLed_ImplAccess().getColorAssignment_7(), "rule__Led_Impl__ColorAssignment_7");
					put(grammarAccess.getLedBlinkAccess().getNameAssignment_0(), "rule__LedBlink__NameAssignment_0");
					put(grammarAccess.getLedBlinkAccess().getModeAssignment_4(), "rule__LedBlink__ModeAssignment_4");
					put(grammarAccess.getLedBlinkAccess().getColorAssignment_5_2(), "rule__LedBlink__ColorAssignment_5_2");
					put(grammarAccess.getLedBlinkAccess().getBlink_per_secCSTAssignment_6_2(), "rule__LedBlink__Blink_per_secCSTAssignment_6_2");
					put(grammarAccess.getLedBlinkAccess().getAttributsAssignment_7(), "rule__LedBlink__AttributsAssignment_7");
					put(grammarAccess.getCameraAccess().getNameAssignment_0(), "rule__Camera__NameAssignment_0");
					put(grammarAccess.getCameraAccess().getIdAssignment_4(), "rule__Camera__IdAssignment_4");
					put(grammarAccess.getCameraAccess().getModeAssignment_7(), "rule__Camera__ModeAssignment_7");
					put(grammarAccess.getCameraAccess().getAttributsAssignment_8(), "rule__Camera__AttributsAssignment_8");
					put(grammarAccess.getTypeGenericAccess().getNameAssignment_1(), "rule__TypeGeneric__NameAssignment_1");
					put(grammarAccess.getTypeGenericAccess().getElementsAssignment_3(), "rule__TypeGeneric__ElementsAssignment_3");
					put(grammarAccess.getTypeGenericAccess().getElementsAssignment_4_1(), "rule__TypeGeneric__ElementsAssignment_4_1");
					put(grammarAccess.getElementAccess().getNameAssignment_1(), "rule__Element__NameAssignment_1");
				}
			};
		}
		return nameMappings.get(element);
	}

	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			InternalDrnParser typedParser = (InternalDrnParser) parser;
			typedParser.entryRuleModel();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public DrnGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(DrnGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
