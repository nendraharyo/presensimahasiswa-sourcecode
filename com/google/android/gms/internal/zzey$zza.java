package com.google.android.gms.internal;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.client.zzg;
import com.google.android.gms.ads.internal.client.zzi;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.ads.internal.formats.zzj;
import com.google.android.gms.ads.internal.reward.mediation.client.zza;
import com.google.android.gms.ads.internal.reward.mediation.client.zza.zza;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.dynamic.zzd.zza;
import java.util.ArrayList;

public abstract class zzey$zza
  extends Binder
  implements zzey
{
  public zzey$zza()
  {
    attachInterface(this, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
  }
  
  public static zzey zzF(IBinder paramIBinder)
  {
    Object localObject;
    if (paramIBinder == null) {
      localObject = null;
    }
    for (;;)
    {
      return (zzey)localObject;
      localObject = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
      if (localObject != null)
      {
        boolean bool = localObject instanceof zzey;
        if (bool)
        {
          localObject = (zzey)localObject;
          continue;
        }
      }
      localObject = new com/google/android/gms/internal/zzey$zza$zza;
      ((zzey.zza.zza)localObject).<init>(paramIBinder);
    }
  }
  
  public IBinder asBinder()
  {
    return this;
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    int i = 0;
    Object localObject1 = null;
    int j = 0;
    Object localObject2 = null;
    int m = 1;
    switch (paramInt1)
    {
    default: 
      m = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    }
    for (;;)
    {
      return m;
      localObject2 = "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter";
      paramParcel2.writeString((String)localObject2);
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
      localObject1 = zzd.zza.zzbs(paramParcel1.readStrongBinder());
      int n = paramParcel1.readInt();
      label258:
      int i1;
      if (n != 0)
      {
        localObject3 = AdSizeParcel.CREATOR.zzc(paramParcel1);
        i1 = paramParcel1.readInt();
        if (i1 == 0) {
          break label330;
        }
        localObject2 = AdRequestParcel.CREATOR;
      }
      Object localObject5;
      Object localObject6;
      for (Object localObject4 = ((zzg)localObject2).zzb(paramParcel1);; localObject4 = null)
      {
        localObject5 = paramParcel1.readString();
        localObject6 = zzez.zza.zzG(paramParcel1.readStrongBinder());
        localObject2 = this;
        zza((zzd)localObject1, (AdSizeParcel)localObject3, (AdRequestParcel)localObject4, (String)localObject5, (zzez)localObject6);
        paramParcel2.writeNoException();
        break;
        n = 0;
        localObject3 = null;
        break label258;
        label330:
        i1 = 0;
      }
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
      localObject1 = getView();
      paramParcel2.writeNoException();
      if (localObject1 != null) {
        localObject2 = ((zzd)localObject1).asBinder();
      }
      paramParcel2.writeStrongBinder((IBinder)localObject2);
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
      localObject1 = zzd.zza.zzbs(paramParcel1.readStrongBinder());
      n = paramParcel1.readInt();
      if (n != 0) {
        localObject2 = AdRequestParcel.CREATOR.zzb(paramParcel1);
      }
      Object localObject3 = paramParcel1.readString();
      localObject4 = zzez.zza.zzG(paramParcel1.readStrongBinder());
      zza((zzd)localObject1, (AdRequestParcel)localObject2, (String)localObject3, (zzez)localObject4);
      paramParcel2.writeNoException();
      continue;
      localObject2 = "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter";
      paramParcel1.enforceInterface((String)localObject2);
      showInterstitial();
      paramParcel2.writeNoException();
      continue;
      localObject2 = "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter";
      paramParcel1.enforceInterface((String)localObject2);
      destroy();
      paramParcel2.writeNoException();
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
      localObject1 = zzd.zza.zzbs(paramParcel1.readStrongBinder());
      n = paramParcel1.readInt();
      if (n != 0)
      {
        localObject3 = AdSizeParcel.CREATOR.zzc(paramParcel1);
        label524:
        i1 = paramParcel1.readInt();
        if (i1 == 0) {
          break label604;
        }
        localObject2 = AdRequestParcel.CREATOR;
      }
      for (localObject4 = ((zzg)localObject2).zzb(paramParcel1);; localObject4 = null)
      {
        localObject5 = paramParcel1.readString();
        localObject6 = paramParcel1.readString();
        localObject7 = zzez.zza.zzG(paramParcel1.readStrongBinder());
        localObject2 = this;
        zza((zzd)localObject1, (AdSizeParcel)localObject3, (AdRequestParcel)localObject4, (String)localObject5, (String)localObject6, (zzez)localObject7);
        paramParcel2.writeNoException();
        break;
        n = 0;
        localObject3 = null;
        break label524;
        label604:
        i1 = 0;
      }
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
      localObject1 = zzd.zza.zzbs(paramParcel1.readStrongBinder());
      n = paramParcel1.readInt();
      if (n != 0) {
        localObject2 = AdRequestParcel.CREATOR;
      }
      for (localObject3 = ((zzg)localObject2).zzb(paramParcel1);; localObject3 = null)
      {
        localObject4 = paramParcel1.readString();
        localObject5 = paramParcel1.readString();
        localObject6 = zzez.zza.zzG(paramParcel1.readStrongBinder());
        localObject2 = this;
        zza((zzd)localObject1, (AdRequestParcel)localObject3, (String)localObject4, (String)localObject5, (zzez)localObject6);
        paramParcel2.writeNoException();
        break;
        n = 0;
      }
      localObject2 = "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter";
      paramParcel1.enforceInterface((String)localObject2);
      pause();
      paramParcel2.writeNoException();
      continue;
      localObject2 = "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter";
      paramParcel1.enforceInterface((String)localObject2);
      resume();
      paramParcel2.writeNoException();
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
      localObject1 = zzd.zza.zzbs(paramParcel1.readStrongBinder());
      n = paramParcel1.readInt();
      if (n != 0) {
        localObject2 = AdRequestParcel.CREATOR;
      }
      for (localObject3 = ((zzg)localObject2).zzb(paramParcel1);; localObject3 = null)
      {
        localObject4 = paramParcel1.readString();
        localObject5 = zza.zza.zzae(paramParcel1.readStrongBinder());
        localObject6 = paramParcel1.readString();
        localObject2 = this;
        zza((zzd)localObject1, (AdRequestParcel)localObject3, (String)localObject4, (zza)localObject5, (String)localObject6);
        paramParcel2.writeNoException();
        break;
        n = 0;
      }
      localObject1 = "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter";
      paramParcel1.enforceInterface((String)localObject1);
      i = paramParcel1.readInt();
      if (i != 0) {
        localObject2 = AdRequestParcel.CREATOR.zzb(paramParcel1);
      }
      localObject1 = paramParcel1.readString();
      zzb((AdRequestParcel)localObject2, (String)localObject1);
      paramParcel2.writeNoException();
      continue;
      localObject2 = "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter";
      paramParcel1.enforceInterface((String)localObject2);
      showVideo();
      paramParcel2.writeNoException();
      continue;
      localObject2 = "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter";
      paramParcel1.enforceInterface((String)localObject2);
      j = isInitialized();
      paramParcel2.writeNoException();
      if (j != 0) {
        j = m;
      }
      for (;;)
      {
        paramParcel2.writeInt(j);
        break;
        int k = 0;
        localObject2 = null;
      }
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
      localObject1 = zzd.zza.zzbs(paramParcel1.readStrongBinder());
      n = paramParcel1.readInt();
      label995:
      int i2;
      if (n != 0)
      {
        localObject3 = AdRequestParcel.CREATOR.zzb(paramParcel1);
        localObject4 = paramParcel1.readString();
        localObject5 = paramParcel1.readString();
        localObject6 = zzez.zza.zzG(paramParcel1.readStrongBinder());
        i2 = paramParcel1.readInt();
        if (i2 == 0) {
          break label1083;
        }
        localObject2 = NativeAdOptionsParcel.CREATOR;
      }
      for (Object localObject7 = ((zzj)localObject2).zze(paramParcel1);; localObject7 = null)
      {
        ArrayList localArrayList = paramParcel1.createStringArrayList();
        localObject2 = this;
        zza((zzd)localObject1, (AdRequestParcel)localObject3, (String)localObject4, (String)localObject5, (zzez)localObject6, (NativeAdOptionsParcel)localObject7, localArrayList);
        paramParcel2.writeNoException();
        break;
        n = 0;
        localObject3 = null;
        break label995;
        label1083:
        i2 = 0;
      }
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
      localObject1 = zzeF();
      paramParcel2.writeNoException();
      if (localObject1 != null) {
        localObject2 = ((zzfb)localObject1).asBinder();
      }
      paramParcel2.writeStrongBinder((IBinder)localObject2);
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
      localObject1 = zzeG();
      paramParcel2.writeNoException();
      if (localObject1 != null) {
        localObject2 = ((zzfc)localObject1).asBinder();
      }
      paramParcel2.writeStrongBinder((IBinder)localObject2);
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
      localObject2 = zzeH();
      paramParcel2.writeNoException();
      if (localObject2 != null)
      {
        paramParcel2.writeInt(m);
        ((Bundle)localObject2).writeToParcel(paramParcel2, m);
      }
      else
      {
        paramParcel2.writeInt(0);
        continue;
        paramParcel1.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
        localObject2 = getInterstitialAdapterInfo();
        paramParcel2.writeNoException();
        if (localObject2 != null)
        {
          paramParcel2.writeInt(m);
          ((Bundle)localObject2).writeToParcel(paramParcel2, m);
        }
        else
        {
          paramParcel2.writeInt(0);
          continue;
          paramParcel1.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
          localObject2 = zzeI();
          paramParcel2.writeNoException();
          if (localObject2 != null)
          {
            paramParcel2.writeInt(m);
            ((Bundle)localObject2).writeToParcel(paramParcel2, m);
          }
          else
          {
            paramParcel2.writeInt(0);
            continue;
            localObject1 = "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter";
            paramParcel1.enforceInterface((String)localObject1);
            i = paramParcel1.readInt();
            if (i != 0) {
              localObject2 = AdRequestParcel.CREATOR.zzb(paramParcel1);
            }
            localObject1 = paramParcel1.readString();
            localObject3 = paramParcel1.readString();
            zza((AdRequestParcel)localObject2, (String)localObject1, (String)localObject3);
            paramParcel2.writeNoException();
          }
        }
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzey$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */