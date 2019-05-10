package com.crashlytics.android.core;

import android.content.Context;
import io.fabric.sdk.android.services.common.CommonUtils;
import io.fabric.sdk.android.services.settings.PromptSettingsData;

class DialogStringResolver
{
  private static final String PROMPT_MESSAGE_RES_NAME = "com.crashlytics.CrashSubmissionPromptMessage";
  private static final String PROMPT_TITLE_RES_NAME = "com.crashlytics.CrashSubmissionPromptTitle";
  private static final String SUBMISSION_ALWAYS_SEND_RES_NAME = "com.crashlytics.CrashSubmissionAlwaysSendTitle";
  private static final String SUBMISSION_CANCEL_RES_NAME = "com.crashlytics.CrashSubmissionCancelTitle";
  private static final String SUBMISSION_SEND_RES_NAME = "com.crashlytics.CrashSubmissionSendTitle";
  private final Context context;
  private final PromptSettingsData promptData;
  
  public DialogStringResolver(Context paramContext, PromptSettingsData paramPromptSettingsData)
  {
    this.context = paramContext;
    this.promptData = paramPromptSettingsData;
  }
  
  private boolean isNullOrEmpty(String paramString)
  {
    if (paramString != null)
    {
      i = paramString.length();
      if (i != 0) {
        break label17;
      }
    }
    label17:
    int j;
    for (int i = 1;; j = 0) {
      return i;
    }
  }
  
  private String resourceOrFallbackValue(String paramString1, String paramString2)
  {
    String str = CommonUtils.getStringsFileValue(this.context, paramString1);
    return stringOrFallback(str, paramString2);
  }
  
  private String stringOrFallback(String paramString1, String paramString2)
  {
    boolean bool = isNullOrEmpty(paramString1);
    if (bool) {}
    for (;;)
    {
      return paramString2;
      paramString2 = paramString1;
    }
  }
  
  public String getAlwaysSendButtonTitle()
  {
    String str = this.promptData.alwaysSendButtonTitle;
    return resourceOrFallbackValue("com.crashlytics.CrashSubmissionAlwaysSendTitle", str);
  }
  
  public String getCancelButtonTitle()
  {
    String str = this.promptData.cancelButtonTitle;
    return resourceOrFallbackValue("com.crashlytics.CrashSubmissionCancelTitle", str);
  }
  
  public String getMessage()
  {
    String str = this.promptData.message;
    return resourceOrFallbackValue("com.crashlytics.CrashSubmissionPromptMessage", str);
  }
  
  public String getSendButtonTitle()
  {
    String str = this.promptData.sendButtonTitle;
    return resourceOrFallbackValue("com.crashlytics.CrashSubmissionSendTitle", str);
  }
  
  public String getTitle()
  {
    String str = this.promptData.title;
    return resourceOrFallbackValue("com.crashlytics.CrashSubmissionPromptTitle", str);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\crashlytics\android\core\DialogStringResolver.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */