package com.google.android.gms.ads.internal.client;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import java.util.ArrayList;
import java.util.List;

public class zzg
  implements Parcelable.Creator
{
  static void zza(AdRequestParcel paramAdRequestParcel, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    int j = paramAdRequestParcel.versionCode;
    zzb.zzc(paramParcel, 1, j);
    long l = paramAdRequestParcel.zztC;
    zzb.zza(paramParcel, 2, l);
    Object localObject = paramAdRequestParcel.extras;
    zzb.zza(paramParcel, 3, (Bundle)localObject, false);
    j = paramAdRequestParcel.zztD;
    zzb.zzc(paramParcel, 4, j);
    localObject = paramAdRequestParcel.zztE;
    zzb.zzb(paramParcel, 5, (List)localObject, false);
    boolean bool1 = paramAdRequestParcel.zztF;
    zzb.zza(paramParcel, 6, bool1);
    int k = paramAdRequestParcel.zztG;
    zzb.zzc(paramParcel, 7, k);
    boolean bool2 = paramAdRequestParcel.zztH;
    zzb.zza(paramParcel, 8, bool2);
    localObject = paramAdRequestParcel.zztI;
    zzb.zza(paramParcel, 9, (String)localObject, false);
    localObject = paramAdRequestParcel.zztJ;
    zzb.zza(paramParcel, 10, (Parcelable)localObject, paramInt, false);
    localObject = paramAdRequestParcel.zztK;
    zzb.zza(paramParcel, 11, (Parcelable)localObject, paramInt, false);
    localObject = paramAdRequestParcel.zztL;
    zzb.zza(paramParcel, 12, (String)localObject, false);
    localObject = paramAdRequestParcel.zztM;
    zzb.zza(paramParcel, 13, (Bundle)localObject, false);
    localObject = paramAdRequestParcel.zztN;
    zzb.zza(paramParcel, 14, (Bundle)localObject, false);
    localObject = paramAdRequestParcel.zztO;
    zzb.zzb(paramParcel, 15, (List)localObject, false);
    localObject = paramAdRequestParcel.zztQ;
    zzb.zza(paramParcel, 17, (String)localObject, false);
    localObject = paramAdRequestParcel.zztP;
    zzb.zza(paramParcel, 16, (String)localObject, false);
    bool2 = paramAdRequestParcel.zztR;
    zzb.zza(paramParcel, 18, bool2);
    zzb.zzI(paramParcel, i);
  }
  
  public AdRequestParcel zzb(Parcel paramParcel)
  {
    int i = zza.zzau(paramParcel);
    int j = 0;
    Object localObject1 = null;
    long l = 0L;
    Bundle localBundle1 = null;
    int k = 0;
    ArrayList localArrayList1 = null;
    boolean bool1 = false;
    int m = 0;
    boolean bool2 = false;
    String str1 = null;
    Object localObject2 = null;
    Object localObject3 = null;
    String str2 = null;
    Bundle localBundle2 = null;
    Bundle localBundle3 = null;
    ArrayList localArrayList2 = null;
    String str3 = null;
    String str4 = null;
    boolean bool3 = false;
    for (;;)
    {
      n = paramParcel.dataPosition();
      if (n >= i) {
        break;
      }
      n = zza.zzat(paramParcel);
      int i1 = zza.zzca(n);
      switch (i1)
      {
      default: 
        zza.zzb(paramParcel, n);
        break;
      case 1: 
        j = zza.zzg(paramParcel, n);
        break;
      case 2: 
        l = zza.zzi(paramParcel, n);
        break;
      case 3: 
        localBundle1 = zza.zzr(paramParcel, n);
        break;
      case 4: 
        k = zza.zzg(paramParcel, n);
        break;
      case 5: 
        localArrayList1 = zza.zzD(paramParcel, n);
        break;
      case 6: 
        bool1 = zza.zzc(paramParcel, n);
        break;
      case 7: 
        m = zza.zzg(paramParcel, n);
        break;
      case 8: 
        bool2 = zza.zzc(paramParcel, n);
        break;
      case 9: 
        str1 = zza.zzp(paramParcel, n);
        break;
      case 10: 
        localObject2 = SearchAdRequestParcel.CREATOR;
        localObject4 = (SearchAdRequestParcel)zza.zza(paramParcel, n, (Parcelable.Creator)localObject2);
        localObject2 = localObject4;
        break;
      case 11: 
        localObject3 = Location.CREATOR;
        localObject4 = (Location)zza.zza(paramParcel, n, (Parcelable.Creator)localObject3);
        localObject3 = localObject4;
        break;
      case 12: 
        str2 = zza.zzp(paramParcel, n);
        break;
      case 13: 
        localBundle2 = zza.zzr(paramParcel, n);
        break;
      case 14: 
        localBundle3 = zza.zzr(paramParcel, n);
        break;
      case 15: 
        localArrayList2 = zza.zzD(paramParcel, n);
        break;
      case 17: 
        str4 = zza.zzp(paramParcel, n);
        break;
      case 16: 
        str3 = zza.zzp(paramParcel, n);
        break;
      case 18: 
        bool3 = zza.zzc(paramParcel, n);
      }
    }
    int n = paramParcel.dataPosition();
    if (n != i)
    {
      localObject4 = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject1 = "Overread allowed size end=" + i;
      ((zza.zza)localObject4).<init>((String)localObject1, paramParcel);
      throw ((Throwable)localObject4);
    }
    Object localObject4 = new com/google/android/gms/ads/internal/client/AdRequestParcel;
    ((AdRequestParcel)localObject4).<init>(j, l, localBundle1, k, localArrayList1, bool1, m, bool2, str1, (SearchAdRequestParcel)localObject2, (Location)localObject3, str2, localBundle2, localBundle3, localArrayList2, str3, str4, bool3);
    return (AdRequestParcel)localObject4;
  }
  
  public AdRequestParcel[] zzl(int paramInt)
  {
    return new AdRequestParcel[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\ads\internal\client\zzg.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */