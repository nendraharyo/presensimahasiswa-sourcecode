package com.google.android.gms.tagmanager;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;

public class PreviewActivity
  extends Activity
{
  private void zzm(String paramString1, String paramString2, String paramString3)
  {
    Object localObject = new android/app/AlertDialog$Builder;
    ((AlertDialog.Builder)localObject).<init>(this);
    localObject = ((AlertDialog.Builder)localObject).create();
    ((AlertDialog)localObject).setTitle(paramString1);
    ((AlertDialog)localObject).setMessage(paramString2);
    PreviewActivity.1 local1 = new com/google/android/gms/tagmanager/PreviewActivity$1;
    local1.<init>(this);
    ((AlertDialog)localObject).setButton(-1, paramString3, local1);
    ((AlertDialog)localObject).show();
  }
  
  public void onCreate(Bundle paramBundle)
  {
    for (;;)
    {
      try
      {
        super.onCreate(paramBundle);
        localObject1 = "Preview activity";
        zzbg.zzaJ((String)localObject1);
        localObject1 = getIntent();
        localObject1 = ((Intent)localObject1).getData();
        localObject2 = TagManager.getInstance(this);
        boolean bool = ((TagManager)localObject2).zzp((Uri)localObject1);
        if (!bool)
        {
          localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>();
          str2 = "Cannot preview the app with the uri: ";
          localObject2 = ((StringBuilder)localObject2).append(str2);
          localObject1 = ((StringBuilder)localObject2).append(localObject1);
          localObject2 = ". Launching current version instead.";
          localObject1 = ((StringBuilder)localObject1).append((String)localObject2);
          localObject1 = ((StringBuilder)localObject1).toString();
          zzbg.zzaK((String)localObject1);
          localObject2 = "Preview failure";
          str2 = "Continue";
          zzm((String)localObject2, (String)localObject1, str2);
        }
        localObject1 = getPackageManager();
        localObject2 = getPackageName();
        localObject1 = ((PackageManager)localObject1).getLaunchIntentForPackage((String)localObject2);
        if (localObject1 != null)
        {
          localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>();
          str2 = "Invoke the launch activity for package name: ";
          localObject2 = ((StringBuilder)localObject2).append(str2);
          str2 = getPackageName();
          localObject2 = ((StringBuilder)localObject2).append(str2);
          localObject2 = ((StringBuilder)localObject2).toString();
          zzbg.zzaJ((String)localObject2);
          startActivity((Intent)localObject1);
          return;
        }
      }
      catch (Exception localException)
      {
        Object localObject1;
        Object localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        String str2 = "Calling preview threw an exception: ";
        localObject2 = ((StringBuilder)localObject2).append(str2);
        String str1 = localException.getMessage();
        str1 = str1;
        zzbg.e(str1);
        continue;
      }
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject2 = "No launch activity found for package name: ";
      localObject1 = ((StringBuilder)localObject1).append((String)localObject2);
      localObject2 = getPackageName();
      localObject1 = ((StringBuilder)localObject1).append((String)localObject2);
      localObject1 = ((StringBuilder)localObject1).toString();
      zzbg.zzaJ((String)localObject1);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\tagmanager\PreviewActivity.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */