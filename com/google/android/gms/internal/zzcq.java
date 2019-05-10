package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.ads.formats.NativeAd.Image;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd;
import com.google.android.gms.ads.internal.util.client.zzb;
import java.util.List;

public class zzcq
  implements NativeCustomTemplateAd
{
  private final zzcp zzyR;
  
  public zzcq(zzcp paramzzcp)
  {
    this.zzyR = paramzzcp;
  }
  
  public List getAvailableAssetNames()
  {
    try
    {
      localObject1 = this.zzyR;
      localObject1 = ((zzcp)localObject1).getAvailableAssetNames();
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        Object localObject1;
        String str = "Failed to get available asset names.";
        zzb.zzb(str, localRemoteException);
        Object localObject2 = null;
      }
    }
    return (List)localObject1;
  }
  
  public String getCustomTemplateId()
  {
    try
    {
      localObject1 = this.zzyR;
      localObject1 = ((zzcp)localObject1).getCustomTemplateId();
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        Object localObject1;
        String str = "Failed to get custom template id.";
        zzb.zzb(str, localRemoteException);
        Object localObject2 = null;
      }
    }
    return (String)localObject1;
  }
  
  public NativeAd.Image getImage(String paramString)
  {
    try
    {
      localObject1 = this.zzyR;
      localObject3 = ((zzcp)localObject1).zzP(paramString);
      if (localObject3 == null) {
        break label37;
      }
      localObject1 = new com/google/android/gms/internal/zzci;
      ((zzci)localObject1).<init>((zzch)localObject3);
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        Object localObject1;
        Object localObject3 = "Failed to get image.";
        zzb.zzb((String)localObject3, localRemoteException);
        label37:
        Object localObject2 = null;
      }
    }
    return (NativeAd.Image)localObject1;
  }
  
  public CharSequence getText(String paramString)
  {
    try
    {
      localObject1 = this.zzyR;
      localObject1 = ((zzcp)localObject1).zzO(paramString);
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        Object localObject1;
        String str = "Failed to get string.";
        zzb.zzb(str, localRemoteException);
        Object localObject2 = null;
      }
    }
    return (CharSequence)localObject1;
  }
  
  public void performClick(String paramString)
  {
    try
    {
      zzcp localzzcp = this.zzyR;
      localzzcp.performClick(paramString);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        String str = "Failed to perform click.";
        zzb.zzb(str, localRemoteException);
      }
    }
  }
  
  public void recordImpression()
  {
    try
    {
      zzcp localzzcp = this.zzyR;
      localzzcp.recordImpression();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        String str = "Failed to record impression.";
        zzb.zzb(str, localRemoteException);
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzcq.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */