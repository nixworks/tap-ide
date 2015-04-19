package hms.ctap.idea.plugin.action.snippet;

import hms.ctap.idea.plugin.file.templates.snippet.CodeSnippetUtil;
import hms.ctap.idea.plugin.util.IconUtil;
import hms.ctap.idea.plugin.util.MessageUtil;

/**
 * Created by isuru on 4/19/15.
 */
public class SmsFieldGeneratorAction extends CodeSnippetGeneratorAction {

    public SmsFieldGeneratorAction() {
        super(MessageUtil.message("ctap.snippet.sms.client.generate.text"), MessageUtil.message("ctap.snippet.sms.client.generate.description"), IconUtil.ServiceClassIcon.SMS_MO);
    }

    @Override
    public CodeSnippetUtil codeSnippetUtil() {
        return CodeSnippetUtil.SMS;
    }
}
