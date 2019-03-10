package com.common.util.SMS;

import java.util.Map;

/**
 * 短信发送请求参数
 */
public class SMSSendReqInfo {

	private String phoneNumbers;

	private String signName;

	private Map<String, Object> templateParam;

	private String outId;

	private SMSTemplate smsTemplate;

	public SMSSendReqInfo() {
	}

	public SMSSendReqInfo(String phoneNumbers, String signName, Map<String, Object> templateParam, String outId, SMSTemplate smsTemplate) {
		this.phoneNumbers = phoneNumbers;
		this.signName = signName;
		this.templateParam = templateParam;
		this.outId = outId;
		this.smsTemplate = smsTemplate;
	}

	public String getPhoneNumbers() {
		return phoneNumbers;
	}

	public void setPhoneNumbers(String phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}

	public String getSignName() {
		return signName;
	}

	public void setSignName(String signName) {
		this.signName = signName;
	}

	public Map<String, Object> getTemplateParam() {
		return templateParam;
	}

	public void setTemplateParam(Map<String, Object> templateParam) {
		this.templateParam = templateParam;
	}

	public String getOutId() {
		return outId;
	}

	public void setOutId(String outId) {
		this.outId = outId;
	}

	public SMSTemplate getSmsTemplate() {
		return smsTemplate;
	}

	public void setSmsTemplate(SMSTemplate smsTemplate) {
		this.smsTemplate = smsTemplate;
	}
}
