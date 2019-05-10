package com.google.android.gms.plus.internal;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.zzq;
import com.google.android.gms.common.server.FavaDiagnosticsEntity;
import com.google.android.gms.common.server.response.SafeParcelResponse;
import com.google.android.gms.common.server.response.zze;
import com.google.android.gms.common.server.zza;
import java.util.List;

public abstract class zzd$zza
  extends Binder
  implements zzd
{
  public static zzd zzdR(IBinder paramIBinder)
  {
    Object localObject;
    if (paramIBinder == null) {
      localObject = null;
    }
    for (;;)
    {
      return (zzd)localObject;
      localObject = paramIBinder.queryLocalInterface("com.google.android.gms.plus.internal.IPlusService");
      if (localObject != null)
      {
        boolean bool = localObject instanceof zzd;
        if (bool)
        {
          localObject = (zzd)localObject;
          continue;
        }
      }
      localObject = new com/google/android/gms/plus/internal/zzd$zza$zza;
      ((zzd.zza.zza)localObject).<init>(paramIBinder);
    }
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    Object localObject1 = null;
    int i = 1;
    Object localObject4;
    label509:
    label560:
    int i1;
    switch (paramInt1)
    {
    default: 
      i = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902: 
    case 1: 
    case 2: 
    case 3: 
    case 4: 
    case 5: 
    case 6: 
    case 8: 
    case 9: 
    case 14: 
    case 16: 
    case 17: 
    case 18: 
    case 19: 
    case 34: 
    case 40: 
    case 41: 
    case 42: 
    case 43: 
    case 44: 
    case 45: 
      for (;;)
      {
        return i;
        localObject2 = "com.google.android.gms.plus.internal.IPlusService";
        paramParcel2.writeString((String)localObject2);
        continue;
        paramParcel1.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
        localObject2 = zzb.zza.zzdP(paramParcel1.readStrongBinder());
        localObject3 = paramParcel1.readString();
        zza((zzb)localObject2, (String)localObject3);
        paramParcel2.writeNoException();
        continue;
        paramParcel1.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
        localObject2 = zzb.zza.zzdP(paramParcel1.readStrongBinder());
        localObject3 = paramParcel1.readString();
        localObject4 = paramParcel1.readString();
        zza((zzb)localObject2, (String)localObject3, (String)localObject4);
        paramParcel2.writeNoException();
        continue;
        paramParcel1.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
        localObject2 = zzb.zza.zzdP(paramParcel1.readStrongBinder());
        localObject3 = paramParcel1.readString();
        zzb((zzb)localObject2, (String)localObject3);
        paramParcel2.writeNoException();
        continue;
        localObject2 = "com.google.android.gms.plus.internal.IPlusService";
        paramParcel1.enforceInterface((String)localObject2);
        int j = paramParcel1.readInt();
        if (j != 0) {}
        for (localObject2 = SafeParcelResponse.CREATOR.zzaE(paramParcel1);; localObject2 = null)
        {
          zza((SafeParcelResponse)localObject2);
          paramParcel2.writeNoException();
          break;
          j = 0;
        }
        paramParcel1.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
        localObject2 = getAccountName();
        paramParcel2.writeNoException();
        paramParcel2.writeString((String)localObject2);
        continue;
        localObject2 = "com.google.android.gms.plus.internal.IPlusService";
        paramParcel1.enforceInterface((String)localObject2);
        zzEY();
        paramParcel2.writeNoException();
        continue;
        paramParcel1.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
        localObject2 = zzb.zza.zzdP(paramParcel1.readStrongBinder());
        zza((zzb)localObject2);
        paramParcel2.writeNoException();
        continue;
        paramParcel1.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
        localObject2 = paramParcel1.readStrongBinder();
        localObject4 = zzb.zza.zzdP((IBinder)localObject2);
        j = paramParcel1.readInt();
        if (j != 0)
        {
          localObject2 = (Uri)Uri.CREATOR.createFromParcel(paramParcel1);
          localObject3 = localObject2;
          j = paramParcel1.readInt();
          if (j == 0) {
            break label560;
          }
        }
        for (localObject2 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);; localObject2 = null)
        {
          zza((zzb)localObject4, (Uri)localObject3, (Bundle)localObject2);
          paramParcel2.writeNoException();
          break;
          n = 0;
          localObject3 = null;
          break label509;
          j = 0;
        }
        paramParcel1.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
        localObject2 = paramParcel1.readStrongBinder();
        localObject3 = zzb.zza.zzdP((IBinder)localObject2);
        i1 = paramParcel1.readInt();
        String str1 = paramParcel1.readString();
        j = paramParcel1.readInt();
        if (j != 0) {
          localObject2 = (Uri)Uri.CREATOR.createFromParcel(paramParcel1);
        }
        for (Object localObject5 = localObject2;; localObject5 = null)
        {
          str2 = paramParcel1.readString();
          localObject1 = paramParcel1.readString();
          localObject2 = this;
          zza((zzb)localObject3, i1, str1, (Uri)localObject5, str2, (String)localObject1);
          paramParcel2.writeNoException();
          break;
          i2 = 0;
        }
        paramParcel1.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
        localObject3 = zzb.zza.zzdP(paramParcel1.readStrongBinder());
        i1 = paramParcel1.readInt();
        int i3 = paramParcel1.readInt();
        int i2 = paramParcel1.readInt();
        String str2 = paramParcel1.readString();
        localObject2 = this;
        localObject2 = zza((zzb)localObject3, i1, i3, i2, str2);
        paramParcel2.writeNoException();
        if (localObject2 != null) {
          localObject1 = ((zzq)localObject2).asBinder();
        }
        paramParcel2.writeStrongBinder((IBinder)localObject1);
        continue;
        paramParcel1.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
        localObject2 = paramParcel1.readString();
        zzfG((String)localObject2);
        paramParcel2.writeNoException();
        continue;
        paramParcel1.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
        localObject2 = zzb.zza.zzdP(paramParcel1.readStrongBinder());
        localObject3 = paramParcel1.readString();
        zzc((zzb)localObject2, (String)localObject3);
        paramParcel2.writeNoException();
        continue;
        paramParcel1.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
        localObject2 = zzb.zza.zzdP(paramParcel1.readStrongBinder());
        zzb((zzb)localObject2);
        paramParcel2.writeNoException();
        continue;
        paramParcel1.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
        localObject2 = zzb.zza.zzdP(paramParcel1.readStrongBinder());
        localObject3 = paramParcel1.createStringArrayList();
        zza((zzb)localObject2, (List)localObject3);
        paramParcel2.writeNoException();
        continue;
        paramParcel1.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
        localObject2 = zzb.zza.zzdP(paramParcel1.readStrongBinder());
        localObject3 = paramParcel1.readString();
        zzd((zzb)localObject2, (String)localObject3);
        paramParcel2.writeNoException();
        continue;
        paramParcel1.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
        localObject2 = getAuthCode();
        paramParcel2.writeNoException();
        paramParcel2.writeString((String)localObject2);
        continue;
        localObject2 = "com.google.android.gms.plus.internal.IPlusService";
        paramParcel1.enforceInterface((String)localObject2);
        int k = zzEZ();
        paramParcel2.writeNoException();
        if (k != 0) {
          k = i;
        }
        for (;;)
        {
          paramParcel2.writeInt(k);
          break;
          m = 0;
          localObject2 = null;
        }
        paramParcel1.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
        localObject2 = zzmR();
        paramParcel2.writeNoException();
        paramParcel2.writeString((String)localObject2);
        continue;
        paramParcel1.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
        localObject2 = zzb.zza.zzdP(paramParcel1.readStrongBinder());
        localObject3 = paramParcel1.readString();
        zze((zzb)localObject2, (String)localObject3);
        paramParcel2.writeNoException();
        continue;
        paramParcel1.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
        localObject2 = zzb.zza.zzdP(paramParcel1.readStrongBinder());
        int n = paramParcel1.readInt();
        if (n != 0)
        {
          localObject3 = SafeParcelResponse.CREATOR;
          localObject1 = ((zze)localObject3).zzaE(paramParcel1);
        }
        zza((zzb)localObject2, (SafeParcelResponse)localObject1);
        paramParcel2.writeNoException();
      }
    }
    Object localObject2 = "com.google.android.gms.plus.internal.IPlusService";
    paramParcel1.enforceInterface((String)localObject2);
    Object localObject3 = paramParcel1.readString();
    int m = paramParcel1.readInt();
    if (m != 0) {}
    for (localObject2 = FavaDiagnosticsEntity.CREATOR.zzaw(paramParcel1);; localObject2 = null)
    {
      i1 = paramParcel1.readInt();
      if (i1 != 0)
      {
        localObject4 = FavaDiagnosticsEntity.CREATOR;
        localObject1 = ((zza)localObject4).zzaw(paramParcel1);
      }
      zza((String)localObject3, (FavaDiagnosticsEntity)localObject2, (FavaDiagnosticsEntity)localObject1);
      paramParcel2.writeNoException();
      break;
      m = 0;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\plus\internal\zzd$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */