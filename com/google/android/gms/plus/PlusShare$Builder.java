package com.google.android.gms.plus;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.plus.model.people.Person;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PlusShare$Builder
{
  private final Context mContext;
  private final Intent mIntent;
  private boolean zzbeg;
  private ArrayList zzbeh;
  
  public PlusShare$Builder(Activity paramActivity)
  {
    this.mContext = paramActivity;
    Object localObject = new android/content/Intent;
    ((Intent)localObject).<init>();
    String str = "android.intent.action.SEND";
    localObject = ((Intent)localObject).setAction(str);
    this.mIntent = ((Intent)localObject);
    localObject = this.mIntent;
    int i = 524288;
    ((Intent)localObject).addFlags(i);
    if (paramActivity != null)
    {
      localObject = paramActivity.getComponentName();
      if (localObject != null)
      {
        boolean bool = true;
        this.zzbeg = bool;
      }
    }
  }
  
  public PlusShare$Builder(Context paramContext)
  {
    this.mContext = paramContext;
    Intent localIntent = new android/content/Intent;
    localIntent.<init>();
    localIntent = localIntent.setAction("android.intent.action.SEND");
    this.mIntent = localIntent;
  }
  
  public Builder addCallToAction(String paramString1, Uri paramUri, String paramString2)
  {
    boolean bool1 = true;
    boolean bool2 = this.zzbeg;
    String str1 = "Must include the launching activity with PlusShare.Builder constructor before setting call-to-action";
    zzx.zza(bool2, str1);
    Object localObject;
    if (paramUri != null)
    {
      localObject = paramUri.toString();
      bool2 = TextUtils.isEmpty((CharSequence)localObject);
      if (!bool2) {
        bool2 = bool1;
      }
    }
    for (;;)
    {
      str1 = "Must provide a call to action URL";
      zzx.zzb(bool2, str1);
      localObject = new android/os/Bundle;
      ((Bundle)localObject).<init>();
      boolean bool3 = TextUtils.isEmpty(paramString1);
      if (!bool3)
      {
        str1 = "label";
        ((Bundle)localObject).putString(str1, paramString1);
      }
      str1 = "url";
      String str2 = paramUri.toString();
      ((Bundle)localObject).putString(str1, str2);
      bool3 = TextUtils.isEmpty(paramString2);
      if (!bool3)
      {
        bool3 = PlusShare.zzfD(paramString2);
        str2 = "The specified deep-link ID was malformed.";
        zzx.zza(bool3, str2);
        str1 = "deepLinkId";
        ((Bundle)localObject).putString(str1, paramString2);
      }
      this.mIntent.putExtra("com.google.android.apps.plus.CALL_TO_ACTION", (Bundle)localObject);
      this.mIntent.putExtra("com.google.android.apps.plus.GOOGLE_INTERACTIVE_POST", bool1);
      this.mIntent.setType("text/plain");
      return this;
      bool2 = false;
      localObject = null;
    }
  }
  
  public Builder addStream(Uri paramUri)
  {
    Object localObject1 = this.mIntent;
    Object localObject2 = "android.intent.extra.STREAM";
    localObject1 = (Uri)((Intent)localObject1).getParcelableExtra((String)localObject2);
    if (localObject1 == null) {
      this = setStream(paramUri);
    }
    for (;;)
    {
      return this;
      localObject2 = this.zzbeh;
      if (localObject2 == null)
      {
        localObject2 = new java/util/ArrayList;
        ((ArrayList)localObject2).<init>();
        this.zzbeh = ((ArrayList)localObject2);
      }
      localObject2 = this.zzbeh;
      ((ArrayList)localObject2).add(localObject1);
      localObject1 = this.zzbeh;
      ((ArrayList)localObject1).add(paramUri);
    }
  }
  
  public Intent getIntent()
  {
    int i = 1;
    Object localObject1 = null;
    Object localObject2 = this.zzbeh;
    Object localObject3;
    label84:
    boolean bool3;
    label127:
    label191:
    Object localObject4;
    if (localObject2 != null)
    {
      localObject2 = this.zzbeh;
      int j = ((ArrayList)localObject2).size();
      if (j > i)
      {
        j = i;
        String str1 = this.mIntent.getAction();
        boolean bool1 = "android.intent.action.SEND_MULTIPLE".equals(str1);
        localObject3 = this.mIntent;
        String str2 = "com.google.android.apps.plus.GOOGLE_INTERACTIVE_POST";
        boolean bool2 = ((Intent)localObject3).getBooleanExtra(str2, false);
        if ((j != 0) && (bool2)) {
          break label475;
        }
        int m = i;
        String str3 = "Call-to-action buttons are only available for URLs.";
        zzx.zza(m, str3);
        if (bool2)
        {
          localObject3 = this.mIntent;
          str3 = "com.google.android.apps.plus.CONTENT_URL";
          bool3 = ((Intent)localObject3).hasExtra(str3);
          if (!bool3) {
            break label484;
          }
        }
        bool3 = i;
        str3 = "The content URL is required for interactive posts.";
        zzx.zza(bool3, str3);
        if (bool2)
        {
          localObject3 = this.mIntent;
          str2 = "com.google.android.apps.plus.CONTENT_URL";
          bool3 = ((Intent)localObject3).hasExtra(str2);
          if (!bool3)
          {
            localObject3 = this.mIntent;
            str2 = "com.google.android.apps.plus.CONTENT_DEEP_LINK_ID";
            bool3 = ((Intent)localObject3).hasExtra(str2);
            if (!bool3) {
              break label493;
            }
          }
        }
        zzx.zza(i, "Must set content URL or content deep-link ID to use a call-to-action button.");
        localObject4 = this.mIntent;
        localObject3 = "com.google.android.apps.plus.CONTENT_DEEP_LINK_ID";
        i = ((Intent)localObject4).hasExtra((String)localObject3);
        if (i != 0)
        {
          localObject4 = this.mIntent.getStringExtra("com.google.android.apps.plus.CONTENT_DEEP_LINK_ID");
          i = PlusShare.zzfD((String)localObject4);
          localObject3 = "The specified deep-link ID was malformed.";
          zzx.zza(i, localObject3);
        }
        if ((j == 0) && (bool1))
        {
          localObject4 = this.mIntent;
          localObject3 = "android.intent.action.SEND";
          ((Intent)localObject4).setAction((String)localObject3);
          localObject4 = this.zzbeh;
          if (localObject4 == null) {
            break label501;
          }
          localObject4 = this.zzbeh;
          i = ((ArrayList)localObject4).isEmpty();
          if (i != 0) {
            break label501;
          }
          localObject3 = this.mIntent;
          str2 = "android.intent.extra.STREAM";
          localObject4 = (Parcelable)this.zzbeh.get(0);
          ((Intent)localObject3).putExtra(str2, (Parcelable)localObject4);
          label334:
          i = 0;
          localObject4 = null;
          this.zzbeh = null;
        }
        if ((j != 0) && (!bool1))
        {
          localObject4 = this.mIntent;
          localObject2 = "android.intent.action.SEND_MULTIPLE";
          ((Intent)localObject4).setAction((String)localObject2);
          localObject4 = this.zzbeh;
          if (localObject4 == null) {
            break label519;
          }
          localObject4 = this.zzbeh;
          i = ((ArrayList)localObject4).isEmpty();
          if (i != 0) {
            break label519;
          }
          localObject4 = this.mIntent;
          localObject2 = "android.intent.extra.STREAM";
          localObject1 = this.zzbeh;
          ((Intent)localObject4).putParcelableArrayListExtra((String)localObject2, (ArrayList)localObject1);
        }
        label419:
        localObject4 = "com.google.android.gms.plus.action.SHARE_INTERNAL_GOOGLE";
        localObject2 = this.mIntent.getAction();
        i = ((String)localObject4).equals(localObject2);
        if (i == 0) {
          break label537;
        }
        localObject4 = this.mIntent;
        localObject2 = "com.google.android.gms";
        ((Intent)localObject4).setPackage((String)localObject2);
        localObject4 = this.mIntent;
      }
    }
    for (;;)
    {
      return (Intent)localObject4;
      int k = 0;
      localObject2 = null;
      break;
      label475:
      bool3 = false;
      localObject3 = null;
      break label84;
      label484:
      bool3 = false;
      localObject3 = null;
      break label127;
      label493:
      i = 0;
      localObject4 = null;
      break label191;
      label501:
      localObject4 = this.mIntent;
      localObject1 = "android.intent.extra.STREAM";
      ((Intent)localObject4).removeExtra((String)localObject1);
      break label334;
      label519:
      localObject4 = this.mIntent;
      localObject2 = "android.intent.extra.STREAM";
      ((Intent)localObject4).removeExtra((String)localObject2);
      break label419;
      label537:
      localObject4 = this.mIntent;
      localObject2 = "android.intent.extra.STREAM";
      i = ((Intent)localObject4).hasExtra((String)localObject2);
      if (i == 0)
      {
        this.mIntent.setAction("com.google.android.gms.plus.action.SHARE_GOOGLE");
        localObject4 = this.mIntent;
        localObject2 = "com.google.android.gms";
        ((Intent)localObject4).setPackage((String)localObject2);
        localObject4 = this.mIntent;
      }
      else
      {
        localObject4 = this.mIntent;
        localObject2 = "com.google.android.apps.plus";
        ((Intent)localObject4).setPackage((String)localObject2);
        localObject4 = this.mIntent;
      }
    }
  }
  
  public Builder setContentDeepLinkId(String paramString)
  {
    return setContentDeepLinkId(paramString, null, null, null);
  }
  
  public Builder setContentDeepLinkId(String paramString1, String paramString2, String paramString3, Uri paramUri)
  {
    boolean bool = this.zzbeg;
    String str = "Must include the launching activity with PlusShare.Builder constructor before setting deep links";
    zzx.zzb(bool, str);
    bool = TextUtils.isEmpty(paramString1);
    if (!bool) {
      bool = true;
    }
    for (;;)
    {
      zzx.zzb(bool, "The deepLinkId parameter is required.");
      Bundle localBundle = PlusShare.zza(paramString2, paramString3, paramUri);
      this.mIntent.putExtra("com.google.android.apps.plus.CONTENT_DEEP_LINK_ID", paramString1);
      this.mIntent.putExtra("com.google.android.apps.plus.CONTENT_DEEP_LINK_METADATA", localBundle);
      this.mIntent.setType("text/plain");
      return this;
      bool = false;
      localBundle = null;
    }
  }
  
  public Builder setContentUrl(Uri paramUri)
  {
    Object localObject1 = null;
    if (paramUri != null) {
      localObject1 = paramUri.toString();
    }
    boolean bool = TextUtils.isEmpty((CharSequence)localObject1);
    Object localObject2;
    if (bool)
    {
      localObject1 = this.mIntent;
      localObject2 = "com.google.android.apps.plus.CONTENT_URL";
      ((Intent)localObject1).removeExtra((String)localObject2);
    }
    for (;;)
    {
      return this;
      localObject2 = this.mIntent;
      String str = "com.google.android.apps.plus.CONTENT_URL";
      ((Intent)localObject2).putExtra(str, (String)localObject1);
    }
  }
  
  public Builder setRecipients(Person paramPerson, List paramList)
  {
    Object localObject1 = this.mIntent;
    Object localObject2 = "com.google.android.apps.plus.SENDER_ID";
    Object localObject3;
    int i;
    if (paramPerson != null)
    {
      localObject3 = paramPerson.getId();
      ((Intent)localObject1).putExtra((String)localObject2, (String)localObject3);
      if (paramList == null) {
        break label80;
      }
      i = paramList.size();
      label42:
      if (i != 0) {
        break label89;
      }
      this.mIntent.removeExtra("com.google.android.apps.plus.RECIPIENT_IDS");
      localObject3 = this.mIntent;
      localObject1 = "com.google.android.apps.plus.RECIPIENT_DISPLAY_NAMES";
      ((Intent)localObject3).removeExtra((String)localObject1);
    }
    for (;;)
    {
      return this;
      localObject3 = "0";
      break;
      label80:
      i = 0;
      localObject3 = null;
      break label42;
      label89:
      localObject1 = new java/util/ArrayList;
      ((ArrayList)localObject1).<init>(i);
      localObject2 = new java/util/ArrayList;
      ((ArrayList)localObject2).<init>(i);
      Object localObject4 = paramList.iterator();
      for (;;)
      {
        boolean bool = ((Iterator)localObject4).hasNext();
        if (!bool) {
          break;
        }
        localObject3 = (Person)((Iterator)localObject4).next();
        String str = ((Person)localObject3).getId();
        ((ArrayList)localObject1).add(str);
        localObject3 = ((Person)localObject3).getDisplayName();
        ((ArrayList)localObject2).add(localObject3);
      }
      localObject3 = this.mIntent;
      localObject4 = "com.google.android.apps.plus.RECIPIENT_IDS";
      ((Intent)localObject3).putStringArrayListExtra((String)localObject4, (ArrayList)localObject1);
      localObject3 = this.mIntent;
      localObject1 = "com.google.android.apps.plus.RECIPIENT_DISPLAY_NAMES";
      ((Intent)localObject3).putStringArrayListExtra((String)localObject1, (ArrayList)localObject2);
    }
  }
  
  public Builder setStream(Uri paramUri)
  {
    this.zzbeh = null;
    this.mIntent.putExtra("android.intent.extra.STREAM", paramUri);
    return this;
  }
  
  public Builder setText(CharSequence paramCharSequence)
  {
    this.mIntent.putExtra("android.intent.extra.TEXT", paramCharSequence);
    return this;
  }
  
  public Builder setType(String paramString)
  {
    this.mIntent.setType(paramString);
    return this;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\plus\PlusShare$Builder.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */