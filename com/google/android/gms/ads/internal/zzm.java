package com.google.android.gms.ads.internal;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.gms.internal.zzch;
import com.google.android.gms.internal.zzch.zza;
import com.google.android.gms.internal.zzdf;
import com.google.android.gms.internal.zzen;
import com.google.android.gms.internal.zzes;
import com.google.android.gms.internal.zzey;
import com.google.android.gms.internal.zzfb;
import com.google.android.gms.internal.zzfc;
import com.google.android.gms.internal.zzif;
import com.google.android.gms.internal.zzin;
import com.google.android.gms.internal.zzjp;
import com.google.android.gms.internal.zzjq;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import org.json.JSONObject;

public class zzm
{
  private static com.google.android.gms.ads.internal.formats.zzd zza(zzfb paramzzfb)
  {
    com.google.android.gms.ads.internal.formats.zzd localzzd = new com/google/android/gms/ads/internal/formats/zzd;
    String str1 = paramzzfb.getHeadline();
    List localList = paramzzfb.getImages();
    String str2 = paramzzfb.getBody();
    zzch localzzch = paramzzfb.zzdK();
    String str3 = paramzzfb.getCallToAction();
    double d = paramzzfb.getStarRating();
    String str4 = paramzzfb.getStore();
    String str5 = paramzzfb.getPrice();
    Bundle localBundle = paramzzfb.getExtras();
    localzzd.<init>(str1, localList, str2, localzzch, str3, d, str4, str5, null, localBundle);
    return localzzd;
  }
  
  private static com.google.android.gms.ads.internal.formats.zze zza(zzfc paramzzfc)
  {
    com.google.android.gms.ads.internal.formats.zze localzze = new com/google/android/gms/ads/internal/formats/zze;
    String str1 = paramzzfc.getHeadline();
    List localList = paramzzfc.getImages();
    String str2 = paramzzfc.getBody();
    zzch localzzch = paramzzfc.zzdO();
    String str3 = paramzzfc.getCallToAction();
    String str4 = paramzzfc.getAdvertiser();
    Bundle localBundle = paramzzfc.getExtras();
    localzze.<init>(str1, localList, str2, localzzch, str3, str4, null, localBundle);
    return localzze;
  }
  
  static zzdf zza(zzfb paramzzfb, zzfc paramzzfc, zzf.zza paramzza)
  {
    zzm.5 local5 = new com/google/android/gms/ads/internal/zzm$5;
    local5.<init>(paramzzfb, paramzza, paramzzfc);
    return local5;
  }
  
  static zzdf zza(CountDownLatch paramCountDownLatch)
  {
    zzm.3 local3 = new com/google/android/gms/ads/internal/zzm$3;
    local3.<init>(paramCountDownLatch);
    return local3;
  }
  
  private static String zza(Bitmap paramBitmap)
  {
    Object localObject1 = new java/io/ByteArrayOutputStream;
    ((ByteArrayOutputStream)localObject1).<init>();
    if (paramBitmap == null) {
      zzin.zzaK("Bitmap is null. Returning empty string");
    }
    Object localObject2;
    for (localObject1 = "";; localObject1 = (String)localObject1)
    {
      return (String)localObject1;
      localObject2 = Bitmap.CompressFormat.PNG;
      int i = 100;
      paramBitmap.compress((Bitmap.CompressFormat)localObject2, i, (OutputStream)localObject1);
      localObject1 = Base64.encodeToString(((ByteArrayOutputStream)localObject1).toByteArray(), 0);
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      String str = "data:image/png;base64,";
      localObject2 = ((StringBuilder)localObject2).append(str);
    }
  }
  
  static String zza(zzch paramzzch)
  {
    Object localObject;
    if (paramzzch == null)
    {
      zzin.zzaK("Image is null. Returning empty string");
      localObject = "";
    }
    for (;;)
    {
      return (String)localObject;
      try
      {
        localObject = paramzzch.getUri();
        if (localObject != null) {
          localObject = ((Uri)localObject).toString();
        }
      }
      catch (RemoteException localRemoteException)
      {
        String str = "Unable to get image uri. Trying data uri next";
        zzin.zzaK(str);
        str = zzb(paramzzch);
      }
    }
  }
  
  private static JSONObject zza(Bundle paramBundle, String paramString)
  {
    JSONObject localJSONObject1 = new org/json/JSONObject;
    localJSONObject1.<init>();
    boolean bool1;
    if (paramBundle != null)
    {
      bool1 = TextUtils.isEmpty(paramString);
      if (!bool1) {
        break label27;
      }
    }
    for (Object localObject1 = localJSONObject1;; localObject1 = localJSONObject1)
    {
      return (JSONObject)localObject1;
      label27:
      JSONObject localJSONObject2 = new org/json/JSONObject;
      localJSONObject2.<init>(paramString);
      Iterator localIterator = localJSONObject2.keys();
      for (;;)
      {
        bool1 = localIterator.hasNext();
        if (!bool1) {
          break;
        }
        localObject1 = (String)localIterator.next();
        boolean bool2 = paramBundle.containsKey((String)localObject1);
        if (bool2)
        {
          Object localObject2 = localJSONObject2.getString((String)localObject1);
          String str = "image";
          bool2 = str.equals(localObject2);
          if (bool2)
          {
            localObject2 = paramBundle.get((String)localObject1);
            boolean bool3 = localObject2 instanceof Bitmap;
            if (bool3)
            {
              localObject2 = zza((Bitmap)localObject2);
              localJSONObject1.put((String)localObject1, localObject2);
            }
            else
            {
              localObject1 = "Invalid type. An image type extra should return a bitmap";
              zzin.zzaK((String)localObject1);
            }
          }
          else
          {
            localObject2 = paramBundle.get((String)localObject1);
            bool2 = localObject2 instanceof Bitmap;
            if (bool2)
            {
              localObject1 = "Invalid asset type. Bitmap should be returned only for image type";
              zzin.zzaK((String)localObject1);
            }
            else
            {
              localObject2 = String.valueOf(paramBundle.get((String)localObject1));
              localJSONObject1.put((String)localObject1, localObject2);
            }
          }
        }
      }
    }
  }
  
  public static void zza(zzif paramzzif, zzf.zza paramzza)
  {
    boolean bool1 = zzg(paramzzif);
    Object localObject1;
    Object localObject3;
    if (bool1)
    {
      localObject1 = paramzzif.zzED;
      localObject3 = ((zzjp)localObject1).getView();
      if (localObject3 != null) {
        break label35;
      }
      localObject1 = "AdWebView is null";
      zzin.zzaK((String)localObject1);
    }
    for (;;)
    {
      return;
      label35:
      Object localObject4;
      try
      {
        localObject4 = paramzzif.zzCp;
        localObject4 = ((zzen)localObject4).zzBM;
        if (localObject4 != null)
        {
          boolean bool2 = ((List)localObject4).isEmpty();
          if (!bool2) {
            break label91;
          }
        }
        localObject1 = "No template ids present in mediation response";
        zzin.zzaK((String)localObject1);
      }
      catch (RemoteException localRemoteException)
      {
        localObject3 = "Error occurred while recording impression and registering for clicks";
        zzin.zzd((String)localObject3, localRemoteException);
      }
      continue;
      label91:
      Object localObject5 = paramzzif.zzCq;
      localObject5 = ((zzey)localObject5).zzeF();
      Object localObject6 = paramzzif.zzCq;
      localObject6 = ((zzey)localObject6).zzeG();
      String str = "2";
      boolean bool3 = ((List)localObject4).contains(str);
      boolean bool4;
      Object localObject2;
      boolean bool5;
      if ((bool3) && (localObject5 != null))
      {
        localObject3 = com.google.android.gms.dynamic.zze.zzC(localObject3);
        ((zzfb)localObject5).zzd((com.google.android.gms.dynamic.zzd)localObject3);
        bool4 = ((zzfb)localObject5).getOverrideImpressionRecording();
        if (!bool4) {
          ((zzfb)localObject5).recordImpression();
        }
        localObject2 = localRemoteException.zzhU();
        localObject3 = "/nativeExpressViewClicked";
        bool5 = false;
        localObject4 = null;
        localObject4 = zza((zzfb)localObject5, null, paramzza);
        ((zzjq)localObject2).zza((String)localObject3, (zzdf)localObject4);
      }
      else
      {
        localObject5 = "1";
        bool5 = ((List)localObject4).contains(localObject5);
        if ((bool5) && (localObject6 != null))
        {
          localObject3 = com.google.android.gms.dynamic.zze.zzC(localObject3);
          ((zzfc)localObject6).zzd((com.google.android.gms.dynamic.zzd)localObject3);
          bool4 = ((zzfc)localObject6).getOverrideImpressionRecording();
          if (!bool4) {
            ((zzfc)localObject6).recordImpression();
          }
          localObject2 = ((zzjp)localObject2).zzhU();
          localObject3 = "/nativeExpressViewClicked";
          bool5 = false;
          localObject4 = null;
          localObject4 = zza(null, (zzfc)localObject6, paramzza);
          ((zzjq)localObject2).zza((String)localObject3, (zzdf)localObject4);
        }
        else
        {
          localObject2 = "No matching template id and mapper";
          zzin.zzaK((String)localObject2);
        }
      }
    }
  }
  
  private static void zza(zzjp paramzzjp)
  {
    View.OnClickListener localOnClickListener = paramzzjp.zzif();
    if (localOnClickListener != null)
    {
      View localView = paramzzjp.getView();
      localOnClickListener.onClick(localView);
    }
  }
  
  private static void zza(zzjp paramzzjp, com.google.android.gms.ads.internal.formats.zzd paramzzd, String paramString)
  {
    zzjq localzzjq = paramzzjp.zzhU();
    zzm.1 local1 = new com/google/android/gms/ads/internal/zzm$1;
    local1.<init>(paramzzd, paramString, paramzzjp);
    localzzjq.zza(local1);
  }
  
  private static void zza(zzjp paramzzjp, com.google.android.gms.ads.internal.formats.zze paramzze, String paramString)
  {
    zzjq localzzjq = paramzzjp.zzhU();
    zzm.2 local2 = new com/google/android/gms/ads/internal/zzm$2;
    local2.<init>(paramzze, paramString, paramzzjp);
    localzzjq.zza(local2);
  }
  
  private static void zza(zzjp paramzzjp, CountDownLatch paramCountDownLatch)
  {
    zzjq localzzjq = paramzzjp.zzhU();
    zzdf localzzdf = zza(paramCountDownLatch);
    localzzjq.zza("/nativeExpressAssetsLoaded", localzzdf);
    localzzjq = paramzzjp.zzhU();
    localzzdf = zzb(paramCountDownLatch);
    localzzjq.zza("/nativeExpressAssetsLoadingFailed", localzzdf);
  }
  
  public static boolean zza(zzjp paramzzjp, zzes paramzzes, CountDownLatch paramCountDownLatch)
  {
    boolean bool = false;
    Object localObject = null;
    try
    {
      bool = zzb(paramzzjp, paramzzes, paramCountDownLatch);
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        String str = "Unable to invoke load assets";
        zzin.zzd(str, localRemoteException);
      }
    }
    catch (RuntimeException localRuntimeException)
    {
      paramCountDownLatch.countDown();
      throw localRuntimeException;
    }
    if (!bool) {
      paramCountDownLatch.countDown();
    }
    return bool;
  }
  
  static zzdf zzb(CountDownLatch paramCountDownLatch)
  {
    zzm.4 local4 = new com/google/android/gms/ads/internal/zzm$4;
    local4.<init>(paramCountDownLatch);
    return local4;
  }
  
  private static String zzb(zzch paramzzch)
  {
    for (;;)
    {
      try
      {
        localObject = paramzzch.zzdJ();
        if (localObject != null) {
          continue;
        }
        localObject = "Drawable is null. Returning empty string";
        zzin.zzaK((String)localObject);
        localObject = "";
      }
      catch (RemoteException localRemoteException)
      {
        Object localObject;
        boolean bool;
        zzin.zzaK("Unable to get drawable. Returning empty string");
        String str = "";
        continue;
        str = zza(((BitmapDrawable)str).getBitmap());
        continue;
      }
      return (String)localObject;
      localObject = com.google.android.gms.dynamic.zze.zzp((com.google.android.gms.dynamic.zzd)localObject);
      localObject = (Drawable)localObject;
      bool = localObject instanceof BitmapDrawable;
      if (bool) {
        continue;
      }
      zzin.zzaK("Drawable is not an instance of BitmapDrawable. Returning empty string");
      localObject = "";
    }
  }
  
  private static boolean zzb(zzjp paramzzjp, zzes paramzzes, CountDownLatch paramCountDownLatch)
  {
    boolean bool1 = false;
    Object localObject1 = null;
    Object localObject2 = paramzzjp.getView();
    if (localObject2 == null)
    {
      localObject2 = "AdWebView is null";
      zzin.zzaK((String)localObject2);
    }
    for (;;)
    {
      return bool1;
      int i = 4;
      ((View)localObject2).setVisibility(i);
      localObject2 = paramzzes.zzCp.zzBM;
      if (localObject2 != null)
      {
        boolean bool2 = ((List)localObject2).isEmpty();
        if (!bool2) {
          break;
        }
      }
      localObject2 = "No template ids present in mediation response";
      zzin.zzaK((String)localObject2);
    }
    zza(paramzzjp, paramCountDownLatch);
    Object localObject3 = paramzzes.zzCq.zzeF();
    Object localObject4 = paramzzes.zzCq.zzeG();
    String str = "2";
    boolean bool3 = ((List)localObject2).contains(str);
    if ((bool3) && (localObject3 != null))
    {
      localObject1 = zza((zzfb)localObject3);
      localObject2 = paramzzes.zzCp.zzBL;
      zza(paramzzjp, (com.google.android.gms.ads.internal.formats.zzd)localObject1, (String)localObject2);
      label156:
      localObject3 = paramzzes.zzCp.zzBJ;
      localObject1 = paramzzes.zzCp;
      localObject2 = ((zzen)localObject1).zzBK;
      if (localObject2 == null) {
        break label282;
      }
      localObject4 = "text/html";
      str = "UTF-8";
      localObject1 = paramzzjp;
      paramzzjp.loadDataWithBaseURL((String)localObject2, (String)localObject3, (String)localObject4, str, null);
    }
    for (;;)
    {
      bool1 = true;
      break;
      localObject3 = "1";
      boolean bool4 = ((List)localObject2).contains(localObject3);
      if ((bool4) && (localObject4 != null))
      {
        localObject1 = zza((zzfc)localObject4);
        localObject2 = paramzzes.zzCp.zzBL;
        zza(paramzzjp, (com.google.android.gms.ads.internal.formats.zze)localObject1, (String)localObject2);
        break label156;
      }
      localObject2 = "No matching template id and mapper";
      zzin.zzaK((String)localObject2);
      break;
      label282:
      localObject1 = "text/html";
      localObject2 = "UTF-8";
      paramzzjp.loadData((String)localObject3, (String)localObject1, (String)localObject2);
    }
  }
  
  private static zzch zzc(Object paramObject)
  {
    boolean bool = paramObject instanceof IBinder;
    if (bool) {
      paramObject = (IBinder)paramObject;
    }
    for (zzch localzzch = zzch.zza.zzt((IBinder)paramObject);; localzzch = null)
    {
      return localzzch;
      bool = false;
    }
  }
  
  public static View zzf(zzif paramzzif)
  {
    boolean bool;
    Object localObject1;
    if (paramzzif == null)
    {
      zzin.e("AdState is null");
      bool = false;
      localObject1 = null;
    }
    for (;;)
    {
      return (View)localObject1;
      bool = zzg(paramzzif);
      if (bool) {
        localObject1 = paramzzif.zzED.getView();
      } else {
        try
        {
          localObject1 = paramzzif.zzCq;
          localObject1 = ((zzey)localObject1).getView();
          if (localObject1 == null)
          {
            localObject1 = "View in mediation adapter is null.";
            zzin.zzaK((String)localObject1);
            bool = false;
            localObject1 = null;
          }
          else
          {
            localObject1 = com.google.android.gms.dynamic.zze.zzp((com.google.android.gms.dynamic.zzd)localObject1);
            localObject1 = (View)localObject1;
          }
        }
        catch (RemoteException localRemoteException)
        {
          String str = "Could not get View from mediation adapter.";
          zzin.zzd(str, localRemoteException);
          bool = false;
          Object localObject2 = null;
        }
      }
    }
  }
  
  public static boolean zzg(zzif paramzzif)
  {
    boolean bool;
    Object localObject;
    if (paramzzif != null)
    {
      bool = paramzzif.zzHT;
      if (bool)
      {
        localObject = paramzzif.zzCp;
        if (localObject != null)
        {
          localObject = paramzzif.zzCp.zzBJ;
          if (localObject != null) {
            bool = true;
          }
        }
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      localObject = null;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\ads\internal\zzm.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */