package com.google.android.gms.internal;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.app.DownloadManager.Request;
import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.net.Uri;
import android.os.Environment;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.google.android.gms.R.string;
import com.google.android.gms.ads.internal.zzr;
import java.util.Map;

public class zzfp
  extends zzfs
{
  private final Context mContext;
  private final Map zzxA;
  
  public zzfp(zzjp paramzzjp, Map paramMap)
  {
    super(paramzzjp, "storePicture");
    this.zzxA = paramMap;
    Activity localActivity = paramzzjp.zzhP();
    this.mContext = localActivity;
  }
  
  public void execute()
  {
    Object localObject1 = this.mContext;
    if (localObject1 == null)
    {
      localObject1 = "Activity context is not available";
      zzam((String)localObject1);
    }
    for (;;)
    {
      return;
      localObject1 = zzr.zzbC();
      Object localObject2 = this.mContext;
      localObject1 = ((zzir)localObject1).zzM((Context)localObject2);
      boolean bool1 = ((zzbl)localObject1).zzdl();
      if (!bool1)
      {
        localObject1 = "Feature is not supported by the device.";
        zzam((String)localObject1);
      }
      else
      {
        localObject1 = this.zzxA;
        localObject2 = "iurl";
        localObject1 = (String)((Map)localObject1).get(localObject2);
        boolean bool2 = TextUtils.isEmpty((CharSequence)localObject1);
        if (bool2)
        {
          localObject1 = "Image url cannot be empty.";
          zzam((String)localObject1);
        }
        else
        {
          bool2 = URLUtil.isValidUrl((String)localObject1);
          Object localObject3;
          if (!bool2)
          {
            localObject2 = new java/lang/StringBuilder;
            ((StringBuilder)localObject2).<init>();
            localObject3 = "Invalid image url: ";
            localObject2 = ((StringBuilder)localObject2).append((String)localObject3);
            localObject1 = (String)localObject1;
            zzam((String)localObject1);
          }
          else
          {
            localObject2 = zzal((String)localObject1);
            localObject3 = zzr.zzbC();
            boolean bool3 = ((zzir)localObject3).zzaE((String)localObject2);
            if (!bool3)
            {
              localObject1 = new java/lang/StringBuilder;
              ((StringBuilder)localObject1).<init>();
              localObject3 = "Image type not recognized: ";
              localObject1 = (String)localObject3 + (String)localObject2;
              zzam((String)localObject1);
            }
            else
            {
              localObject3 = zzr.zzbC();
              Object localObject4 = this.mContext;
              localObject3 = ((zzir)localObject3).zzL((Context)localObject4);
              localObject4 = zzr.zzbF();
              int j = R.string.store_picture_title;
              localObject4 = ((zzih)localObject4).zzd(j, "Save image");
              ((AlertDialog.Builder)localObject3).setTitle((CharSequence)localObject4);
              localObject4 = zzr.zzbF();
              j = R.string.store_picture_message;
              localObject4 = ((zzih)localObject4).zzd(j, "Allow Ad to store image in Picture gallery?");
              ((AlertDialog.Builder)localObject3).setMessage((CharSequence)localObject4);
              localObject4 = zzr.zzbF();
              j = R.string.accept;
              String str = "Accept";
              localObject4 = ((zzih)localObject4).zzd(j, str);
              zzfp.1 local1 = new com/google/android/gms/internal/zzfp$1;
              local1.<init>(this, (String)localObject1, (String)localObject2);
              ((AlertDialog.Builder)localObject3).setPositiveButton((CharSequence)localObject4, local1);
              localObject1 = zzr.zzbF();
              int i = R.string.decline;
              localObject4 = "Decline";
              localObject1 = ((zzih)localObject1).zzd(i, (String)localObject4);
              localObject2 = new com/google/android/gms/internal/zzfp$2;
              ((zzfp.2)localObject2).<init>(this);
              ((AlertDialog.Builder)localObject3).setNegativeButton((CharSequence)localObject1, (DialogInterface.OnClickListener)localObject2);
              localObject1 = ((AlertDialog.Builder)localObject3).create();
              ((AlertDialog)localObject1).show();
            }
          }
        }
      }
    }
  }
  
  String zzal(String paramString)
  {
    return Uri.parse(paramString).getLastPathSegment();
  }
  
  DownloadManager.Request zzf(String paramString1, String paramString2)
  {
    DownloadManager.Request localRequest = new android/app/DownloadManager$Request;
    Object localObject = Uri.parse(paramString1);
    localRequest.<init>((Uri)localObject);
    localObject = Environment.DIRECTORY_PICTURES;
    localRequest.setDestinationInExternalPublicDir((String)localObject, paramString2);
    zzr.zzbE().zza(localRequest);
    return localRequest;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzfp.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */