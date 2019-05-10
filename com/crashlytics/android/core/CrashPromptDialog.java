package com.crashlytics.android.core;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.content.DialogInterface.OnClickListener;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.ScrollView;
import android.widget.TextView;
import io.fabric.sdk.android.services.settings.PromptSettingsData;

class CrashPromptDialog
{
  private final AlertDialog.Builder dialog;
  private final CrashPromptDialog.OptInLatch latch;
  
  private CrashPromptDialog(AlertDialog.Builder paramBuilder, CrashPromptDialog.OptInLatch paramOptInLatch)
  {
    this.latch = paramOptInLatch;
    this.dialog = paramBuilder;
  }
  
  public static CrashPromptDialog create(Activity paramActivity, PromptSettingsData paramPromptSettingsData, CrashPromptDialog.AlwaysSendCallback paramAlwaysSendCallback)
  {
    CrashPromptDialog.OptInLatch localOptInLatch = new com/crashlytics/android/core/CrashPromptDialog$OptInLatch;
    localOptInLatch.<init>(null);
    Object localObject1 = new com/crashlytics/android/core/DialogStringResolver;
    ((DialogStringResolver)localObject1).<init>(paramActivity, paramPromptSettingsData);
    AlertDialog.Builder localBuilder = new android/app/AlertDialog$Builder;
    localBuilder.<init>(paramActivity);
    Object localObject2 = ((DialogStringResolver)localObject1).getMessage();
    localObject2 = createDialogView(paramActivity, (String)localObject2);
    Object localObject3 = new com/crashlytics/android/core/CrashPromptDialog$1;
    ((CrashPromptDialog.1)localObject3).<init>(localOptInLatch);
    localObject2 = localBuilder.setView((View)localObject2);
    String str = ((DialogStringResolver)localObject1).getTitle();
    localObject2 = ((AlertDialog.Builder)localObject2).setTitle(str).setCancelable(false);
    str = ((DialogStringResolver)localObject1).getSendButtonTitle();
    ((AlertDialog.Builder)localObject2).setNeutralButton(str, (DialogInterface.OnClickListener)localObject3);
    boolean bool = paramPromptSettingsData.showCancelButton;
    if (bool)
    {
      localObject2 = new com/crashlytics/android/core/CrashPromptDialog$2;
      ((CrashPromptDialog.2)localObject2).<init>(localOptInLatch);
      localObject3 = ((DialogStringResolver)localObject1).getCancelButtonTitle();
      localBuilder.setNegativeButton((CharSequence)localObject3, (DialogInterface.OnClickListener)localObject2);
    }
    bool = paramPromptSettingsData.showAlwaysSendButton;
    if (bool)
    {
      localObject2 = new com/crashlytics/android/core/CrashPromptDialog$3;
      ((CrashPromptDialog.3)localObject2).<init>(paramAlwaysSendCallback, localOptInLatch);
      localObject1 = ((DialogStringResolver)localObject1).getAlwaysSendButtonTitle();
      localBuilder.setPositiveButton((CharSequence)localObject1, (DialogInterface.OnClickListener)localObject2);
    }
    localObject1 = new com/crashlytics/android/core/CrashPromptDialog;
    ((CrashPromptDialog)localObject1).<init>(localBuilder, localOptInLatch);
    return (CrashPromptDialog)localObject1;
  }
  
  private static ScrollView createDialogView(Activity paramActivity, String paramString)
  {
    float f = paramActivity.getResources().getDisplayMetrics().density;
    int i = dipsToPixels(f, 5);
    TextView localTextView = new android/widget/TextView;
    localTextView.<init>(paramActivity);
    localTextView.setAutoLinkMask(15);
    localTextView.setText(paramString);
    localTextView.setTextAppearance(paramActivity, 16973892);
    localTextView.setPadding(i, i, i, i);
    localTextView.setFocusable(false);
    ScrollView localScrollView = new android/widget/ScrollView;
    localScrollView.<init>(paramActivity);
    int j = dipsToPixels(f, 14);
    int k = dipsToPixels(f, 2);
    int m = dipsToPixels(f, 10);
    int n = dipsToPixels(f, 12);
    localScrollView.setPadding(j, k, m, n);
    localScrollView.addView(localTextView);
    return localScrollView;
  }
  
  private static int dipsToPixels(float paramFloat, int paramInt)
  {
    return (int)(paramInt * paramFloat);
  }
  
  public void await()
  {
    this.latch.await();
  }
  
  public boolean getOptIn()
  {
    return this.latch.getOptIn();
  }
  
  public void show()
  {
    this.dialog.show();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\crashlytics\android\core\CrashPromptDialog.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */