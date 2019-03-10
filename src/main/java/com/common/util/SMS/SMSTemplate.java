package com.common.util.SMS;

/**
 * 短信模板详情,必须是在阿里大鱼“管理中心-配置管理”中的短信模板相一致
 */
public enum SMSTemplate {

	TEMPLATE_01("验证码", "用户认证", "SMS_24925361", "验证码${code}，您正在认证成为${product}用户，感谢您的支持！");

	private String templateType = ""; // 模板类型
	private String templateName = ""; // 模板名称
	private String templateID = ""; // 模板ID
	private String templateContent = ""; // 模板内容

	SMSTemplate(String templateType, String templateName, String templateID, String templateContent) {
		this.templateType = templateType;
		this.templateName = templateName;
		this.templateID = templateID;
		this.templateContent = templateContent;
	}

	public String getTemplateType() {
		return this.templateType;
	}

	public String getTemplateName() {
		return this.templateName;
	}

	public String getTemplateID() {
		return this.templateID;
	}

	public String getTemplateContent() {
		return this.templateContent;
	}
}
