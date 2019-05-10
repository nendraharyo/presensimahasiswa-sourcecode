package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzx;

public class DocumentSection
  implements SafeParcelable
{
  public static final zzd CREATOR;
  public static final int zzTM = Integer.parseInt("-1");
  private static final RegisterSectionInfo zzTN;
  final int mVersionCode;
  public final String zzTO;
  final RegisterSectionInfo zzTP;
  public final int zzTQ;
  public final byte[] zzTR;
  
  static
  {
    Object localObject = new com/google/android/gms/appdatasearch/zzd;
    ((zzd)localObject).<init>();
    CREATOR = (zzd)localObject;
    localObject = new com/google/android/gms/appdatasearch/RegisterSectionInfo$zza;
    ((RegisterSectionInfo.zza)localObject).<init>("SsbContext");
    zzTN = ((RegisterSectionInfo.zza)localObject).zzM(true).zzbB("blob").zzmh();
  }
  
  DocumentSection(int paramInt1, String paramString, RegisterSectionInfo paramRegisterSectionInfo, int paramInt2, byte[] paramArrayOfByte)
  {
    int i = zzTM;
    String str1;
    if (paramInt2 != i)
    {
      str1 = zzh.zzao(paramInt2);
      if (str1 == null) {}
    }
    else
    {
      i = 1;
    }
    for (;;)
    {
      Object localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      String str2 = "Invalid section type ";
      localObject = str2 + paramInt2;
      zzx.zzb(i, localObject);
      this.mVersionCode = paramInt1;
      this.zzTO = paramString;
      this.zzTP = paramRegisterSectionInfo;
      this.zzTQ = paramInt2;
      this.zzTR = paramArrayOfByte;
      str1 = zzmf();
      if (str1 == null) {
        break;
      }
      localObject = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject).<init>(str1);
      throw ((Throwable)localObject);
      i = 0;
      str1 = null;
    }
  }
  
  public DocumentSection(String paramString, RegisterSectionInfo paramRegisterSectionInfo)
  {
    this(1, paramString, paramRegisterSectionInfo, i, null);
  }
  
  public DocumentSection(String paramString1, RegisterSectionInfo paramRegisterSectionInfo, String paramString2)
  {
    this(1, paramString1, paramRegisterSectionInfo, i, null);
  }
  
  public DocumentSection(byte[] paramArrayOfByte, RegisterSectionInfo paramRegisterSectionInfo)
  {
    this(1, null, paramRegisterSectionInfo, i, paramArrayOfByte);
  }
  
  public static DocumentSection zzh(byte[] paramArrayOfByte)
  {
    DocumentSection localDocumentSection = new com/google/android/gms/appdatasearch/DocumentSection;
    RegisterSectionInfo localRegisterSectionInfo = zzTN;
    localDocumentSection.<init>(paramArrayOfByte, localRegisterSectionInfo);
    return localDocumentSection;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzd.zza(this, paramParcel, paramInt);
  }
  
  public String zzmf()
  {
    int i = this.zzTQ;
    int j = zzTM;
    Object localObject;
    if (i != j)
    {
      i = this.zzTQ;
      localObject = zzh.zzao(i);
      if (localObject == null)
      {
        localObject = new java/lang/StringBuilder;
        ((StringBuilder)localObject).<init>();
        String str = "Invalid section type ";
        localObject = ((StringBuilder)localObject).append(str);
        j = this.zzTQ;
        localObject = j;
      }
    }
    for (;;)
    {
      return (String)localObject;
      localObject = this.zzTO;
      if (localObject != null)
      {
        localObject = this.zzTR;
        if (localObject != null)
        {
          localObject = "Both content and blobContent set";
          continue;
        }
      }
      i = 0;
      localObject = null;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\appdatasearch\DocumentSection.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */