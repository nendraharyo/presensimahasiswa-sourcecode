package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzd
  implements Parcelable.Creator
{
  static void zza(DocumentSection paramDocumentSection, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    Object localObject = paramDocumentSection.zzTO;
    zzb.zza(paramParcel, 1, (String)localObject, false);
    int j = paramDocumentSection.mVersionCode;
    zzb.zzc(paramParcel, 1000, j);
    localObject = paramDocumentSection.zzTP;
    zzb.zza(paramParcel, 3, (Parcelable)localObject, paramInt, false);
    j = paramDocumentSection.zzTQ;
    zzb.zzc(paramParcel, 4, j);
    localObject = paramDocumentSection.zzTR;
    zzb.zza(paramParcel, 5, (byte[])localObject, false);
    zzb.zzI(paramParcel, i);
  }
  
  public DocumentSection[] zzak(int paramInt)
  {
    return new DocumentSection[paramInt];
  }
  
  public DocumentSection zzt(Parcel paramParcel)
  {
    byte[] arrayOfByte = null;
    int i = zza.zzau(paramParcel);
    int j = 0;
    Object localObject1 = null;
    int k = -1;
    Object localObject2 = null;
    String str = null;
    for (;;)
    {
      m = paramParcel.dataPosition();
      if (m >= i) {
        break;
      }
      m = zza.zzat(paramParcel);
      int n = zza.zzca(m);
      switch (n)
      {
      default: 
        zza.zzb(paramParcel, m);
        break;
      case 1: 
        str = zza.zzp(paramParcel, m);
        break;
      case 1000: 
        j = zza.zzg(paramParcel, m);
        break;
      case 3: 
        localObject2 = RegisterSectionInfo.CREATOR;
        localObject3 = (RegisterSectionInfo)zza.zza(paramParcel, m, (Parcelable.Creator)localObject2);
        localObject2 = localObject3;
        break;
      case 4: 
        k = zza.zzg(paramParcel, m);
        break;
      case 5: 
        arrayOfByte = zza.zzs(paramParcel, m);
      }
    }
    int m = paramParcel.dataPosition();
    if (m != i)
    {
      localObject3 = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject1 = "Overread allowed size end=" + i;
      ((zza.zza)localObject3).<init>((String)localObject1, paramParcel);
      throw ((Throwable)localObject3);
    }
    Object localObject3 = new com/google/android/gms/appdatasearch/DocumentSection;
    ((DocumentSection)localObject3).<init>(j, str, (RegisterSectionInfo)localObject2, k, arrayOfByte);
    return (DocumentSection)localObject3;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\appdatasearch\zzd.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */