package com.google.android.gms.appdatasearch;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;

public class zzb
  implements Parcelable.Creator
{
  static void zza(DocumentContents paramDocumentContents, Parcel paramParcel, int paramInt)
  {
    int i = com.google.android.gms.common.internal.safeparcel.zzb.zzav(paramParcel);
    Object localObject = paramDocumentContents.zzTC;
    com.google.android.gms.common.internal.safeparcel.zzb.zza(paramParcel, 1, (Parcelable[])localObject, paramInt, false);
    int j = paramDocumentContents.mVersionCode;
    com.google.android.gms.common.internal.safeparcel.zzb.zzc(paramParcel, 1000, j);
    localObject = paramDocumentContents.zzTD;
    com.google.android.gms.common.internal.safeparcel.zzb.zza(paramParcel, 2, (String)localObject, false);
    boolean bool = paramDocumentContents.zzTE;
    com.google.android.gms.common.internal.safeparcel.zzb.zza(paramParcel, 3, bool);
    localObject = paramDocumentContents.account;
    com.google.android.gms.common.internal.safeparcel.zzb.zza(paramParcel, 4, (Parcelable)localObject, paramInt, false);
    com.google.android.gms.common.internal.safeparcel.zzb.zzI(paramParcel, i);
  }
  
  public DocumentContents[] zzai(int paramInt)
  {
    return new DocumentContents[paramInt];
  }
  
  public DocumentContents zzr(Parcel paramParcel)
  {
    boolean bool = false;
    Object localObject1 = null;
    int i = zza.zzau(paramParcel);
    String str = null;
    Object localObject2 = null;
    int j = 0;
    Object localObject3 = null;
    for (;;)
    {
      k = paramParcel.dataPosition();
      if (k >= i) {
        break;
      }
      k = zza.zzat(paramParcel);
      int m = zza.zzca(k);
      switch (m)
      {
      default: 
        zza.zzb(paramParcel, k);
        break;
      case 1: 
        localObject2 = DocumentSection.CREATOR;
        localObject4 = (DocumentSection[])zza.zzb(paramParcel, k, (Parcelable.Creator)localObject2);
        localObject2 = localObject4;
        break;
      case 1000: 
        j = zza.zzg(paramParcel, k);
        break;
      case 2: 
        str = zza.zzp(paramParcel, k);
        break;
      case 3: 
        bool = zza.zzc(paramParcel, k);
        break;
      case 4: 
        localObject1 = Account.CREATOR;
        localObject4 = (Account)zza.zza(paramParcel, k, (Parcelable.Creator)localObject1);
        localObject1 = localObject4;
      }
    }
    int k = paramParcel.dataPosition();
    if (k != i)
    {
      localObject4 = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localObject3 = new java/lang/StringBuilder;
      ((StringBuilder)localObject3).<init>();
      localObject3 = "Overread allowed size end=" + i;
      ((zza.zza)localObject4).<init>((String)localObject3, paramParcel);
      throw ((Throwable)localObject4);
    }
    Object localObject4 = new com/google/android/gms/appdatasearch/DocumentContents;
    ((DocumentContents)localObject4).<init>(j, (DocumentSection[])localObject2, str, bool, (Account)localObject1);
    return (DocumentContents)localObject4;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\appdatasearch\zzb.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */