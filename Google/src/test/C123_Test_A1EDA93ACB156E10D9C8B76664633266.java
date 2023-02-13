/**@generated
 * WARNING � Changes you make to this file may be lost.
 *           File is generated and may be re-generated without warning.
 * @RPT-Core-generated Version 8.6
 */
/******************************************************************
* Licensed Materials - Property of IBM and/or HCL
* Copyright IBM Corporation 2013, 2017. All Rights Reserved.
* Copyright HCL Technologies Ltd. 2017, 2020.  All Rights Reserved.
* 
* U.S. Government Users Restricted Rights - Use, duplication or 
* disclosure restricted by GSA ADP Schedule Contract with IBM Corp.
******************************************************************/
/* TestScript.template - Suitable for collaborative code generation */
package test;

import com.ibm.rational.test.lt.datacorrelation.execution.action.VariableAction;
import com.ibm.rational.test.lt.datacorrelation.execution.harvest.DataCorrelationVar;
import com.ibm.rational.test.lt.datacorrelation.execution.harvest.DataVar;
import com.ibm.rational.test.lt.datacorrelation.execution.harvest.IDCCoreVar;
import com.ibm.rational.test.lt.datacorrelation.execution.harvest.IDataCorrelationVar;
import com.ibm.rational.test.lt.datacorrelation.execution.proto.ProtoAdapterHandler;
import com.ibm.rational.test.lt.execution.core.impl.LTTestScript;
import com.ibm.rational.test.lt.execution.moeb.action.EndMoebStepBatchAction;
import com.ibm.rational.test.lt.execution.moeb.action.MoebStepBatchAction;
import com.ibm.rational.test.lt.execution.moeb.services.*;
import com.ibm.rational.test.lt.execution.moeb.services.MoebActionFailedEvent;
import com.ibm.rational.test.lt.execution.moeb.services.MoebFatalErrorEvent;
import com.ibm.rational.test.lt.kernel.IDataArea;
import com.ibm.rational.test.lt.kernel.action.IContainer;
import com.ibm.rational.test.lt.kernel.action.impl.KThrow;
import com.ibm.rational.test.lt.kernel.services.*;
import com.ibm.rational.test.lt.kernel.services.RPTEventStructure;

@SuppressWarnings("all")
public class C123_Test_A1EDA93ACB156E10D9C8B76664633266 extends LTTestScript  {

    static ProtoAdapterHandler pa = new ProtoAdapterHandler();
    static {           
        pa.addPA("com.ibm.rational.test.lt.datacorrelation.execution.protocol.core.CoreProtoAdapter", "coreAdapter");
pa.addPA("com.ibm.rational.test.lt.execution.moeb.dc.MoebDataAdapter", "com.ibm.rational.test.lt.execution.moeb.action.MoebStepBatchAction");
    }
	
	private DataVar[] vars = new DataVar[1];
	
    
    
	
	public C123_Test_A1EDA93ACB156E10D9C8B76664633266(IContainer container, String invocationId) {
		super(container, "123", invocationId, "A1EDA93ACB156E10D9C8B76664633266");
		setArmEnabled(false);
		stopAtYourConvenience=false;
		
	}

    public void execute() {
    	try {
			
	    		if (!isScheduleRun()) setThinkMax(2000);
	
	if (!isScheduleRun()){
this.addEventBehavior(new RPTEventStructure(new RPTFailVPEvent(), new RPTContinueEvent("Content Verification Point failed"), 1, "Content Verification Point failed"));
	this.addEventBehavior(new RPTEventStructure(new RPTConnectEvent(), new RPTContinueEvent("Connection failed"), 1, "Connection failed"));
	this.addEventBehavior(new RPTEventStructure(new RPTAuthenticationEvent(), new RPTContinueEvent("Authentication failed"), 1, "Authentication failed"));
	this.addEventBehavior(new RPTEventStructure(new RPTDataPoolEOFEvent(), new RPTStopUserEvent("End of dataset reached"), 1, "End of dataset reached"));
	this.addEventBehavior(new RPTEventStructure(new RPTReferenceEvent(), new RPTContinueEvent("Failed to extract reference"), 1, "Failed to extract reference"));
	this.addEventBehavior(new RPTEventStructure(new RPTSubstitutionEvent(), new RPTContinueEvent("Substitution failed"), 1, "Substitution failed"));
	this.addEventBehavior(new RPTEventStructure(new RPTServerTimeoutEvent(), new RPTContinueEvent("Timeout"), 1, "Timeout"));
	this.addEventBehavior(new RPTEventStructure(new RPTCustomCodeVPFailureEvent(), new RPTContinueEvent("Custom Verification Point failed"), 1, "Custom Verification Point failed"));
	this.addEventBehavior(new RPTEventStructure(new RPTCustomCodeAlertEvent(), new RPTContinueEvent("Custom Code reported an Alert"), 0, "Custom Code reported an Alert"));
	this.addEventBehavior(new RPTEventStructure(new RPTCustomCodeExceptionEvent(), new RPTStopUserEvent("Custom Code reported an unhandled exception"), 1, "Custom Code reported an unhandled exception"));
	this.addEventBehavior(new RPTEventStructure(new MoebActionFailedEvent(), new RPTContinueEvent("Playback of UI Action failed"), 0, "Playback of UI Action failed"));
	this.addEventBehavior(new RPTEventStructure(new MoebFatalErrorEvent(), new RPTStopUserEvent("Playback of UI step has a fatal error"), 0, "Playback of UI step has a fatal error"));
	}
	
	
	        	this.add(varAction_1(this));
	this.add(applicationContext_1(this));
	this.add(applicationContext_2(this));
	this.add(applicationContext_3(this));
	this.add(applicationContext_4(this));
			this.addFinally(new EndMoebStepBatchAction(this));

	    } catch (Throwable e) {
		     log("Test Execution: C123_Test_A1EDA93ACB156E10D9C8B76664633266 ",e);
	    } finally {
	        super.execute();
		}	    
    }
    
	public void preFinish() {
		
		super.preFinish();
	}
	
	public void stop() {
		
		super.stop();
	}	
	
	private VariableAction varAction_1(final IContainer parent) {

	VariableAction vc = new VariableAction(parent, "", "A1EDA93ACD18B820D9C8B76664633266");	
			vars[0] = new DataVar("RTW_WebUI_Browser_Selection", "Chrome", IDataArea.VIRTUALUSER, "IGNORE", false, false);

		
	vc.add(vars);
	return vc;
	
}
	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_1(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Start www.google.com",
												  "A1EDA93ACD958940D9C8B76664633266",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"description\":\"Start <b>www.google.com<\\/b>\",\"to_overriden\":true,\"application_uid\":\"31c38063-a774-465f-9e7a-de5bd1fd97c7\",\"timeout\":25,\"uid\":\"A1EDA93ACD958940D9C8B76664633266\",\"application_package\":\"com.ibm.rational.test.mobile.android.browser\",\"application_name\":\"www.google.com\",\"application_os\":\"WebUI\",\"isWeb\":false,\"action\":{\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"start\",\"parameters\":[{\"name\":\"activity\",\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"com.ibm.rational.test.mobile.android.browser.BrowserMainActivity\"},{\"name\":\"rmot_kind_of_launch\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"playback\"},{\"name\":\"starting_url\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"https:\\/\\/www.google.com\\/search?q=test&source=hp&ei=_DHmY8ChCeak5NoP3pudsAs&iflsig=AK50M_UAAAAAY-ZADCn7NzAb1AbQL_bwMbVys2VsGQ6m&ved=0ahUKEwjAj9eB9Ir9AhVmElkFHd5NB7YQ4dUDCAo&uact=5&oq=test&gs_lcp=Cgdnd3Mtd2l6EAMyCwgAEIAEELEDEIMBMggIABCABBCxAzIFCAAQgAQyCAgAEIAEELEDMgUIABCABDILCC4QgAQQxwEQrwEyCwgAEIAEELEDEIMBMgsIABCABBCxAxCDATIICAAQgAQQsQMyCwgAEIAEELEDEIMBOg4ILhCPARDqAhCMAxDlAjoOCAAQjwEQ6gIQjAMQ5QI6DgguEIAEELEDEMcBENEDOggIABCxAxCDAToLCC4QgAQQsQMQgwE6EQguEIAEELEDEIMBEMcBENEDOggILhCxAxCDAToLCC4QgAQQxwEQ0QM6CAguEIAEELEDUKQGWNgJYLIMaAFwAHgAgAFkiAHnAZIBAzMuMZgBAKABAbABCg&sclient=gws-wiz\"}]},\"sync_policy\":\"DEFAULT\",\"id\":\"1\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceHWActionStep\"}],\"timeout\":10}",
												  "/Google/Tests/123.testsuite",
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_2(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Enter value 'Test' in Edit text - www.google.com",
												  "A1EDA93B0BCF1A07D9C8B76664633266",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"uid\":\"A1EDA93B0BCF1A07D9C8B76664633266\",\"preferredThinktime\":0,\"thinktime\":2000,\"isWeb\":false,\"description\":\"Think <i>2,000<\\/i> ms\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"application_uid\":\"31c38063-a774-465f-9e7a-de5bd1fd97c7\",\"timeout\":0},{\"revealPref\":\"true\",\"description\":\"Enter value '<b>Test<\\/b>' in <b>Edit text<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"31c38063-a774-465f-9e7a-de5bd1fd97c7\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"uid\":\"A1EDA93B0BCF1A07D9C8B76664633266\",\"isWeb\":true,\"action\":{\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"oninput\",\"parameters\":[{\"name\":\"newtext\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Test\"}]},\"sync_policy\":\"DEFAULT\",\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"propList\":\"{\\n    \\\"<reachable>\\\": true,\\n    \\\"<visible>\\\": true,\\n    \\\"Coordinates$array$\\\": \\\"top:43;left:390;bottom:106;right:896\\\",\\n    \\\"Style$array$\\\": \\\"background-color:rgba(0, 0, 0, 0);background-repeat:repeat;color:rgba(0, 0, 0, 0.87);font-family:arial, sans-serif;font-size:16px;font-style:normal;font-weight:400;line-height:39px;margin-bottom:0px;margin-left:0px;margin-right:0px;margin-top:-42px;opacity:1;padding-bottom:3px;padding-left:0px;padding-right:0px;padding-top:0px;text-align:start;text-decoration:none solid rgba(0, 0, 0, 0.87);visibility:visible;z-index:auto;\\\",\\n    \\\"aria-autocomplete\\\": \\\"both\\\",\\n    \\\"aria-haspopup\\\": \\\"false\\\",\\n    \\\"aria-label\\\": \\\"Search\\\",\\n    \\\"autocapitalize\\\": \\\"off\\\",\\n    \\\"autocomplete\\\": \\\"off\\\",\\n    \\\"autocorrect\\\": \\\"off\\\",\\n    \\\"background-color\\\": \\\"00000000\\\",\\n    \\\"background-repeat\\\": \\\"repeat\\\",\\n    \\\"bottom\\\": 106,\\n    \\\"class\\\": \\\"gLFyf\\\",\\n    \\\"color\\\": \\\"000000DE\\\",\\n    \\\"content\\\": \\\"test\\\",\\n    \\\"data-ved\\\": \\\"0ahUKEwiRz8SD9Ir9AhXKFlkFHYC4Cv8Q39UDCAw\\\",\\n    \\\"domainName\\\": \\\"html\\\",\\n    \\\"enabled\\\": true,\\n    \\\"font-family\\\": \\\"arial, sans-serif\\\",\\n    \\\"font-size\\\": 16,\\n    \\\"font-style\\\": \\\"normal\\\",\\n    \\\"font-weight\\\": \\\"400\\\",\\n    \\\"jsaction\\\": \\\"paste:puy29d; mouseenter:MJEKMe; mouseleave:iFHZnf;\\\",\\n    \\\"left\\\": 390,\\n    \\\"line-height\\\": \\\"39\\\",\\n    \\\"margin-bottom\\\": 0,\\n    \\\"margin-left\\\": 0,\\n    \\\"margin-right\\\": 0,\\n    \\\"margin-top\\\": -42,\\n    \\\"maxlength\\\": \\\"2048\\\",\\n    \\\"name\\\": \\\"q\\\",\\n    \\\"opacity\\\": \\\"1\\\",\\n    \\\"padding-bottom\\\": 3,\\n    \\\"padding-left\\\": 0,\\n    \\\"padding-right\\\": 0,\\n    \\\"padding-top\\\": 0,\\n    \\\"proxyClass\\\": \\\"HtmlTextInputProxy\\\",\\n    \\\"proxyName\\\": \\\"inputtext\\\",\\n    \\\"right\\\": 896,\\n    \\\"role\\\": \\\"combobox\\\",\\n    \\\"spellcheck\\\": \\\"false\\\",\\n    \\\"tagname\\\": \\\"input\\\",\\n    \\\"text-align\\\": \\\"start\\\",\\n    \\\"text-decoration\\\": \\\"none solid rgba(0, 0, 0, 0.87)\\\",\\n    \\\"top\\\": 43,\\n    \\\"type\\\": \\\"text\\\",\\n    \\\"value\\\": \\\"test\\\",\\n    \\\"visibility\\\": \\\"visible\\\",\\n    \\\"visible\\\": true,\\n    \\\"xpath\\\": \\\"2286\\\",\\n    \\\"xpathProp\\\": \\\"\\\\\\/\\\\\\/form[@id='tsf']\\\\\\/div\\\\\\/div\\\\\\/div[2]\\\\\\/div\\\\\\/div[2]\\\\\\/input\\\",\\n    \\\"z-index\\\": \\\"auto\\\"\\n}\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.inputtext\"}}],\"timeout\":10}",
												  "/Google/Tests/123.testsuite",
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_3(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Press Enter in Edit text whose Content is test - www.google.com",
												  "A1EDA93ACDC4AF91D9C8B76664633266",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"revealPref\":\"true\",\"description\":\"Press <b>Enter<\\/b> in <b>Edit text<\\/b> whose <b>Content<\\/b> is <b>test<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"31c38063-a774-465f-9e7a-de5bd1fd97c7\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"uid\":\"A1EDA93ACDC4AF91D9C8B76664633266\",\"isWeb\":true,\"action\":{\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"onkeypress\",\"parameters\":[{\"name\":\"enableasyncaction\",\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TBoolean\",\"value\":\"false\"}]},\"sync_policy\":\"DEFAULT\",\"id\":\"1\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"identifier\":{\"parameter\":{\"name\":\"content\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"test\"},\"name\":\"content\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"propList\":\"{ \\\"Coordinates$array$\\\": \\\"top:43;left:390;bottom:106;right:896\\\", \\\"Geometry\\\": { \\\"height\\\": 63, \\\"width\\\": 506, \\\"x\\\": 390, \\\"y\\\": 43 }, \\\"Style$array$\\\": \\\"background-color:rgba(0, 0, 0, 0);background-repeat:repeat;color:rgba(0, 0, 0, 0.87);font-family:arial, sans-serif;font-size:16px;font-style:normal;font-weight:400;line-height:39px;margin-bottom:0px;margin-left:0px;margin-right:0px;margin-top:-42px;opacity:1;padding-bottom:3px;padding-left:0px;padding-right:0px;padding-top:0px;text-align:start;text-decoration:none solid rgba(0, 0, 0, 0.87);visibility:visible;z-index:auto;\\\", \\\"aria-autocomplete\\\": \\\"both\\\", \\\"aria-haspopup\\\": \\\"false\\\", \\\"aria-label\\\": \\\"Search\\\", \\\"autocapitalize\\\": \\\"off\\\", \\\"autocomplete\\\": \\\"off\\\", \\\"autocorrect\\\": \\\"off\\\", \\\"background-color\\\": \\\"00000000\\\", \\\"background-repeat\\\": \\\"repeat\\\", \\\"bottom\\\": 106, \\\"class\\\": \\\"gLFyf\\\", \\\"color\\\": \\\"000000DE\\\", \\\"content\\\": \\\"test\\\", \\\"data-ved\\\": \\\"0ahUKEwiRz8SD9Ir9AhXKFlkFHYC4Cv8Q39UDCAw\\\", \\\"domainName\\\": \\\"html\\\", \\\"enabled\\\": true, \\\"font-family\\\": \\\"arial, sans-serif\\\", \\\"font-size\\\": 16, \\\"font-style\\\": \\\"normal\\\", \\\"font-weight\\\": \\\"400\\\", \\\"jsaction\\\": \\\"paste:puy29d; mouseenter:MJEKMe; mouseleave:iFHZnf;\\\", \\\"left\\\": 390, \\\"line-height\\\": \\\"39\\\", \\\"margin-bottom\\\": 0, \\\"margin-left\\\": 0, \\\"margin-right\\\": 0, \\\"margin-top\\\": -42, \\\"maxlength\\\": \\\"2048\\\", \\\"name\\\": \\\"q\\\", \\\"opacity\\\": \\\"1\\\", \\\"padding-bottom\\\": 3, \\\"padding-left\\\": 0, \\\"padding-right\\\": 0, \\\"padding-top\\\": 0, \\\"proxyClass\\\": \\\"HtmlTextInputProxy\\\", \\\"proxyName\\\": \\\"inputtext\\\", \\\"right\\\": 896, \\\"role\\\": \\\"combobox\\\", \\\"spellcheck\\\": \\\"false\\\", \\\"tagname\\\": \\\"input\\\", \\\"text-align\\\": \\\"start\\\", \\\"text-decoration\\\": \\\"none solid rgba(0, 0, 0, 0.87)\\\", \\\"top\\\": 43, \\\"type\\\": \\\"text\\\", \\\"value\\\": \\\"test\\\", \\\"visibility\\\": \\\"visible\\\", \\\"visible\\\": true, \\\"xpath\\\": \\\"2286\\\", \\\"xpathProp\\\": \\\"\\\\\\/\\\\\\/form[@id='tsf']\\\\\\/div\\\\\\/div\\\\\\/div[2]\\\\\\/div\\\\\\/div[2]\\\\\\/input\\\", \\\"z-index\\\": \\\"auto\\\" }\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.inputtext\"}}],\"timeout\":10}",
												  "/Google/Tests/123.testsuite",
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_4(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Click on Heading H3 whose Content is Test.com: Home - www.google.com",
												  "A1EDA93ACEDE0ED4D9C8B76664633266",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"uid\":\"A1EDA93ACEDE0ED4D9C8B76664633266\",\"preferredThinktime\":0,\"thinktime\":1529,\"isWeb\":false,\"description\":\"Think <i>1,529<\\/i> ms\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"application_uid\":\"31c38063-a774-465f-9e7a-de5bd1fd97c7\",\"timeout\":0},{\"revealPref\":\"true\",\"description\":\"Click on <b>Heading H3<\\/b> whose <b>Content<\\/b> is <b>Test.com: Home<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"31c38063-a774-465f-9e7a-de5bd1fd97c7\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"uid\":\"A1EDA93ACEDE0ED4D9C8B76664633266\",\"isWeb\":true,\"action\":{\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"onclick\",\"parameters\":[{\"name\":\"enableasyncaction\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TBoolean\",\"value\":\"false\"}]},\"sync_policy\":\"DEFAULT\",\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"identifier\":{\"parameter\":{\"name\":\"content\",\"id\":\"7\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Test.com: Home\"},\"name\":\"content\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"propList\":\"{ \\\"Coordinates$array$\\\": \\\"top:303;left:161;bottom:349;right:381\\\", \\\"Geometry\\\": { \\\"height\\\": 46, \\\"width\\\": 220, \\\"x\\\": 161, \\\"y\\\": 303 }, \\\"Style$array$\\\": \\\"background-color:rgba(0, 0, 0, 0);background-repeat:repeat;color:rgb(26, 13, 171);font-family:Roboto, arial, sans-serif;font-size:20px;font-style:normal;font-weight:400;line-height:26px;margin-bottom:3px;margin-left:0px;margin-right:0px;margin-top:0px;opacity:1;padding-bottom:0px;padding-left:0px;padding-right:0px;padding-top:5px;text-align:left;text-decoration:underline solid rgb(26, 13, 171);visibility:visible;z-index:auto;\\\", \\\"background-color\\\": \\\"00000000\\\", \\\"background-repeat\\\": \\\"repeat\\\", \\\"bottom\\\": 349, \\\"class\\\": \\\"LC20lb MBeuO DKV0Md\\\", \\\"color\\\": \\\"1A0DABFF\\\", \\\"content\\\": \\\"Test.com: Home\\\", \\\"domainName\\\": \\\"html\\\", \\\"enabled\\\": true, \\\"font-family\\\": \\\"Roboto, arial, sans-serif\\\", \\\"font-size\\\": 20, \\\"font-style\\\": \\\"normal\\\", \\\"font-weight\\\": \\\"400\\\", \\\"left\\\": 161, \\\"line-height\\\": \\\"26\\\", \\\"margin-bottom\\\": 3, \\\"margin-left\\\": 0, \\\"margin-right\\\": 0, \\\"margin-top\\\": 0, \\\"opacity\\\": \\\"1\\\", \\\"padding-bottom\\\": 0, \\\"padding-left\\\": 0, \\\"padding-right\\\": 0, \\\"padding-top\\\": 5, \\\"proxyClass\\\": \\\"HtmlElementProxy\\\", \\\"proxyName\\\": \\\"h3\\\", \\\"right\\\": 381, \\\"tagname\\\": \\\"h3\\\", \\\"text-align\\\": \\\"left\\\", \\\"text-decoration\\\": \\\"underline solid rgb(26, 13, 171)\\\", \\\"top\\\": 303, \\\"visibility\\\": \\\"visible\\\", \\\"visible\\\": true, \\\"xpath\\\": \\\"1316\\\", \\\"xpathProp\\\": \\\"\\\\\\/\\\\\\/div[@id='rso']\\\\\\/div\\\\\\/div\\\\\\/div\\\\\\/div\\\\\\/div\\\\\\/a\\\\\\/h3\\\", \\\"z-index\\\": \\\"auto\\\" }\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.h3\"}}],\"timeout\":10}",
												  "/Google/Tests/123.testsuite",
												  null,
												  "<default>");



		return stepBatch;
	}

}
