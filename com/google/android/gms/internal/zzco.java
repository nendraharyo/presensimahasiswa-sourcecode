package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.NativeAd.Image;
import com.google.android.gms.ads.formats.NativeContentAd;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.dynamic.zzd;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class zzco
  extends NativeContentAd
{
  private final List zzyN;
  private final zzcn zzyP;
  private final zzci zzyQ;
  
  public zzco(zzcn paramzzcn)
  {
    Object localObject1 = new java/util/ArrayList;
    ((ArrayList)localObject1).<init>();
    this.zzyN = ((List)localObject1);
    this.zzyP = paramzzcn;
    try
    {
      localObject1 = this.zzyP;
      localObject1 = ((zzcn)localObject1).getImages();
      boolean bool;
      Object localObject4;
      Object localObject5;
      if (localObject1 != null)
      {
        localObject1 = ((List)localObject1).iterator();
        for (;;)
        {
          bool = ((Iterator)localObject1).hasNext();
          if (!bool) {
            break;
          }
          localObject4 = ((Iterator)localObject1).next();
          localObject4 = zzc(localObject4);
          if (localObject4 != null)
          {
            localObject5 = this.zzyN;
            zzci localzzci = new com/google/android/gms/internal/zzci;
            localzzci.<init>((zzch)localObject4);
            ((List)localObject5).add(localzzci);
          }
        }
      }
      try
      {
        localObject2 = this.zzyP;
        localObject5 = ((zzcn)localObject2).zzdO();
        if (localObject5 == null) {
          break label169;
        }
        localObject2 = new com/google/android/gms/internal/zzci;
        ((zzci)localObject2).<init>((zzch)localObject5);
      }
      catch (RemoteException localRemoteException2)
      {
        for (;;)
        {
          Object localObject2;
          localObject5 = "Failed to get icon.";
          zzb.zzb((String)localObject5, localRemoteException2);
          Object localObject3 = null;
        }
      }
    }
    catch (RemoteException localRemoteException1)
    {
      localObject4 = "Failed to get image.";
      zzb.zzb((String)localObject4, localRemoteException1);
      bool = false;
      localObject4 = null;
    }
    this.zzyQ = ((zzci)localObject2);
  }
  
  public void destroy()
  {
    try
    {
      zzcn localzzcn = this.zzyP;
      localzzcn.destroy();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        String str = "Failed to destroy";
        zzb.zzb(str, localRemoteException);
      }
    }
  }
  
  public CharSequence getAdvertiser()
  {
    try
    {
      localObject1 = this.zzyP;
      localObject1 = ((zzcn)localObject1).getAdvertiser();
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        Object localObject1;
        String str = "Failed to get attribution.";
        zzb.zzb(str, localRemoteException);
        Object localObject2 = null;
      }
    }
    return (CharSequence)localObject1;
  }
  
  public CharSequence getBody()
  {
    try
    {
      localObject1 = this.zzyP;
      localObject1 = ((zzcn)localObject1).getBody();
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        Object localObject1;
        String str = "Failed to get body.";
        zzb.zzb(str, localRemoteException);
        Object localObject2 = null;
      }
    }
    return (CharSequence)localObject1;
  }
  
  public CharSequence getCallToAction()
  {
    try
    {
      localObject1 = this.zzyP;
      localObject1 = ((zzcn)localObject1).getCallToAction();
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        Object localObject1;
        String str = "Failed to get call to action.";
        zzb.zzb(str, localRemoteException);
        Object localObject2 = null;
      }
    }
    return (CharSequence)localObject1;
  }
  
  public Bundle getExtras()
  {
    try
    {
      localObject1 = this.zzyP;
      localObject1 = ((zzcn)localObject1).getExtras();
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        Object localObject1;
        String str = "Failed to get extras";
        zzb.zzd(str, localRemoteException);
        Object localObject2 = null;
      }
    }
    return (Bundle)localObject1;
  }
  
  public CharSequence getHeadline()
  {
    try
    {
      localObject1 = this.zzyP;
      localObject1 = ((zzcn)localObject1).getHeadline();
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        Object localObject1;
        String str = "Failed to get headline.";
        zzb.zzb(str, localRemoteException);
        Object localObject2 = null;
      }
    }
    return (CharSequence)localObject1;
  }
  
  public List getImages()
  {
    return this.zzyN;
  }
  
  public NativeAd.Image getLogo()
  {
    return this.zzyQ;
  }
  
  zzch zzc(Object paramObject)
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
  
  protected zzd zzdL()
  {
    try
    {
      localObject1 = this.zzyP;
      localObject1 = ((zzcn)localObject1).zzdL();
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        Object localObject1;
        String str = "Failed to retrieve native ad engine.";
        zzb.zzb(str, localRemoteException);
        Object localObject2 = null;
      }
    }
    return (zzd)localObject1;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzco.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */