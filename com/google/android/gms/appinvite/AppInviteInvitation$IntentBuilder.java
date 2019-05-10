package com.google.android.gms.appinvite;

import android.accounts.Account;
import android.content.Intent;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.zzx;
import java.util.Map;

public final class AppInviteInvitation$IntentBuilder
{
  public static final int MAX_CALL_TO_ACTION_TEXT_LENGTH = 20;
  public static final int MAX_EMAIL_HTML_CONTENT = 512000;
  public static final int MAX_MESSAGE_LENGTH = 100;
  public static final int MIN_CALL_TO_ACTION_TEXT_LENGTH = 2;
  private final Intent mIntent;
  private String zzUL;
  private String zzUM;
  
  public AppInviteInvitation$IntentBuilder(CharSequence paramCharSequence)
  {
    zzx.zzz(paramCharSequence);
    Intent localIntent = new android/content/Intent;
    localIntent.<init>("com.google.android.gms.appinvite.ACTION_APP_INVITE");
    this.mIntent = localIntent;
    this.mIntent.putExtra("com.google.android.gms.appinvite.TITLE", paramCharSequence);
    this.mIntent.setPackage("com.google.android.gms");
  }
  
  public Intent build()
  {
    Object localObject = this.zzUL;
    boolean bool = TextUtils.isEmpty((CharSequence)localObject);
    if (!bool)
    {
      localObject = this.zzUM;
      String str1 = "Email html content must be set when email subject is set.";
      zzx.zzh((String)localObject, str1);
      localObject = this.mIntent.getData();
      if (localObject == null)
      {
        bool = true;
        zzx.zzb(bool, "Custom image must not be set when email html content is set.");
        bool = TextUtils.isEmpty(this.mIntent.getCharSequenceExtra("com.google.android.gms.appinvite.BUTTON_TEXT"));
        zzx.zzb(bool, "Call to action text must not be set when email html content is set.");
        localObject = this.mIntent;
        String str2 = this.zzUL;
        ((Intent)localObject).putExtra("com.google.android.gms.appinvite.EMAIL_SUBJECT", str2);
        localObject = this.mIntent;
        str1 = "com.google.android.gms.appinvite.EMAIL_CONTENT";
        str2 = this.zzUM;
        ((Intent)localObject).putExtra(str1, str2);
      }
    }
    do
    {
      return this.mIntent;
      bool = false;
      localObject = null;
      break;
      localObject = this.zzUM;
      bool = TextUtils.isEmpty((CharSequence)localObject);
    } while (bool);
    localObject = new java/lang/IllegalArgumentException;
    ((IllegalArgumentException)localObject).<init>("Email subject must be set when email html content is set.");
    throw ((Throwable)localObject);
  }
  
  public IntentBuilder setAccount(Account paramAccount)
  {
    Object localObject;
    String str;
    if (paramAccount != null)
    {
      localObject = "com.google";
      str = paramAccount.type;
      boolean bool = ((String)localObject).equals(str);
      if (bool)
      {
        localObject = this.mIntent;
        str = "com.google.android.gms.appinvite.ACCOUNT_NAME";
        ((Intent)localObject).putExtra(str, paramAccount);
      }
    }
    for (;;)
    {
      return this;
      localObject = this.mIntent;
      str = "com.google.android.gms.appinvite.ACCOUNT_NAME";
      ((Intent)localObject).removeExtra(str);
    }
  }
  
  public IntentBuilder setAdditionalReferralParameters(Map paramMap)
  {
    Intent localIntent;
    String str;
    if (paramMap != null)
    {
      localIntent = this.mIntent;
      str = "com.google.android.gms.appinvite.REFERRAL_PARAMETERS_URI";
      Bundle localBundle = AppInviteInvitation.zzK(paramMap);
      localIntent.putExtra(str, localBundle);
    }
    for (;;)
    {
      return this;
      localIntent = this.mIntent;
      str = "com.google.android.gms.appinvite.REFERRAL_PARAMETERS_URI";
      localIntent.removeExtra(str);
    }
  }
  
  public IntentBuilder setAndroidMinimumVersionCode(int paramInt)
  {
    this.mIntent.putExtra("com.google.android.gms.appinvite.appMinimumVersionCode", paramInt);
    return this;
  }
  
  public IntentBuilder setCallToActionText(CharSequence paramCharSequence)
  {
    int i = 20;
    int j = 2;
    if (paramCharSequence != null)
    {
      int k = paramCharSequence.length();
      if (k >= j)
      {
        k = paramCharSequence.length();
        if (k <= i) {
          break label91;
        }
      }
    }
    IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
    Object[] arrayOfObject = new Object[j];
    Integer localInteger = Integer.valueOf(j);
    arrayOfObject[0] = localInteger;
    localInteger = Integer.valueOf(i);
    arrayOfObject[1] = localInteger;
    String str = String.format("Text must be between %d and %d chars in length.", arrayOfObject);
    localIllegalArgumentException.<init>(str);
    throw localIllegalArgumentException;
    label91:
    this.mIntent.putExtra("com.google.android.gms.appinvite.BUTTON_TEXT", paramCharSequence);
    return this;
  }
  
  public IntentBuilder setCustomImage(Uri paramUri)
  {
    boolean bool1 = false;
    Object localObject1 = null;
    boolean bool2 = false;
    Intent localIntent = null;
    int j = 1;
    zzx.zzz(paramUri);
    boolean bool3 = paramUri.isAbsolute();
    String str1 = "Image uri is not an absolute uri. Did you forget to add a scheme to the Uri?";
    zzx.zzb(bool3, str1);
    String str2 = paramUri.getScheme().toLowerCase();
    Object localObject2 = "android.resource";
    bool3 = str2.equals(localObject2);
    if (!bool3)
    {
      localObject2 = "content";
      bool3 = str2.equals(localObject2);
      if (!bool3)
      {
        localObject2 = "file";
        bool3 = str2.equals(localObject2);
        if (!bool3) {
          break label328;
        }
      }
    }
    int k = j;
    if (k == 0)
    {
      localObject2 = "http";
      bool3 = str2.equals(localObject2);
      if (!bool3)
      {
        localObject2 = "https";
        bool3 = str2.equals(localObject2);
        if (!bool3) {
          break label337;
        }
      }
    }
    bool3 = j;
    label147:
    String str3 = "Image uri must be a content URI with scheme \"android.resource\", \"content\" or \"file\", or a network url with scheme \"http\" or \"https\".";
    zzx.zzb(bool3, str3);
    int m;
    int n;
    if (k == 0)
    {
      localObject2 = paramUri.toString();
      str3 = "/";
      m = ((String)localObject2).lastIndexOf(str3) + 1;
      n = ((String)localObject2).length();
      localObject2 = ((String)localObject2).substring(m, n);
      if (localObject2 != null) {
        break label346;
      }
      bool3 = false;
      localObject2 = null;
    }
    for (;;)
    {
      bool1 = TextUtils.isEmpty((CharSequence)localObject2);
      if (!bool1)
      {
        bool1 = AppInviteInvitation.zzbF((String)localObject2);
        if (!bool1) {}
      }
      else
      {
        bool2 = j;
      }
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject2 = ((StringBuilder)localObject1).append((String)localObject2).append(" images are not supported. Only jpg, jpeg, or png images are");
      localObject1 = " supported.";
      localObject2 = (String)localObject1;
      zzx.zzb(bool2, localObject2);
      localObject2 = paramUri.buildUpon().scheme(str2).build();
      localIntent = this.mIntent;
      localIntent.setData((Uri)localObject2);
      if (k != 0)
      {
        localObject2 = this.mIntent;
        ((Intent)localObject2).addFlags(j);
      }
      return this;
      label328:
      k = 0;
      str1 = null;
      break;
      label337:
      bool3 = false;
      localObject2 = null;
      break label147;
      label346:
      str3 = ".";
      m = ((String)localObject2).lastIndexOf(str3);
      n = -1;
      if (m == n)
      {
        bool3 = false;
        localObject2 = null;
      }
      else
      {
        localObject1 = ".";
        int i = ((String)localObject2).lastIndexOf((String)localObject1) + 1;
        m = ((String)localObject2).length();
        localObject2 = ((String)localObject2).substring(i, m).toLowerCase();
      }
    }
  }
  
  public IntentBuilder setDeepLink(Uri paramUri)
  {
    Intent localIntent;
    String str;
    if (paramUri != null)
    {
      localIntent = this.mIntent;
      str = "com.google.android.gms.appinvite.DEEP_LINK_URL";
      localIntent.putExtra(str, paramUri);
    }
    for (;;)
    {
      return this;
      localIntent = this.mIntent;
      str = "com.google.android.gms.appinvite.DEEP_LINK_URL";
      localIntent.removeExtra(str);
    }
  }
  
  public IntentBuilder setEmailHtmlContent(String paramString)
  {
    int i = 512000;
    if (paramString != null)
    {
      Object localObject = paramString.getBytes();
      int j = localObject.length;
      if (j > i)
      {
        localObject = new java/lang/IllegalArgumentException;
        Object[] arrayOfObject = new Object[1];
        Integer localInteger = Integer.valueOf(i);
        arrayOfObject[0] = localInteger;
        String str = String.format("Email html content must be %d bytes or less.", arrayOfObject);
        ((IllegalArgumentException)localObject).<init>(str);
        throw ((Throwable)localObject);
      }
    }
    this.zzUM = paramString;
    return this;
  }
  
  public IntentBuilder setEmailSubject(String paramString)
  {
    this.zzUL = paramString;
    return this;
  }
  
  public IntentBuilder setGoogleAnalyticsTrackingId(String paramString)
  {
    this.mIntent.putExtra("com.google.android.gms.appinvite.GOOGLE_ANALYTICS_TRACKING_ID", paramString);
    return this;
  }
  
  public IntentBuilder setMessage(CharSequence paramCharSequence)
  {
    int i = 100;
    if (paramCharSequence != null)
    {
      int j = paramCharSequence.length();
      if (j > i)
      {
        IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
        Object[] arrayOfObject = new Object[1];
        Integer localInteger = Integer.valueOf(i);
        arrayOfObject[0] = localInteger;
        String str = String.format("Message must be %d chars or less.", arrayOfObject);
        localIllegalArgumentException.<init>(str);
        throw localIllegalArgumentException;
      }
    }
    this.mIntent.putExtra("com.google.android.gms.appinvite.MESSAGE", paramCharSequence);
    return this;
  }
  
  public IntentBuilder setOtherPlatformsTargetApplication(int paramInt, String paramString)
  {
    Object localObject;
    String str;
    switch (paramInt)
    {
    default: 
      localObject = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject).<init>("targetPlatform must be either PROJECT_PLATFORM_IOS or PROJECT_PLATFORM_ANDROID.");
      throw ((Throwable)localObject);
    case 1: 
      localObject = this.mIntent;
      str = "com.google.android.gms.appinvite.iosTargetApplication";
      ((Intent)localObject).putExtra(str, paramString);
    }
    for (;;)
    {
      return this;
      localObject = this.mIntent;
      str = "com.google.android.gms.appinvite.androidTargetApplication";
      ((Intent)localObject).putExtra(str, paramString);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\appinvite\AppInviteInvitation$IntentBuilder.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */