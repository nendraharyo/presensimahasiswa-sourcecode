package io.fabric.sdk.android.services.settings;

public class PromptSettingsData
{
  public final String alwaysSendButtonTitle;
  public final String cancelButtonTitle;
  public final String message;
  public final String sendButtonTitle;
  public final boolean showAlwaysSendButton;
  public final boolean showCancelButton;
  public final String title;
  
  public PromptSettingsData(String paramString1, String paramString2, String paramString3, boolean paramBoolean1, String paramString4, boolean paramBoolean2, String paramString5)
  {
    this.title = paramString1;
    this.message = paramString2;
    this.sendButtonTitle = paramString3;
    this.showCancelButton = paramBoolean1;
    this.cancelButtonTitle = paramString4;
    this.showAlwaysSendButton = paramBoolean2;
    this.alwaysSendButtonTitle = paramString5;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\io\fabric\sdk\android\services\settings\PromptSettingsData.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */