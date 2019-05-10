package com.google.android.gms.appdatasearch;

import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.appindexing.AppIndexApi.AppIndexingLink;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.zzpm.zza;
import com.google.android.gms.internal.zzpm.zza.zza;
import com.google.android.gms.internal.zzsu;
import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.zip.CRC32;

public class UsageInfo
  implements SafeParcelable
{
  public static final zzj CREATOR;
  final int mVersionCode;
  final DocumentId zzUs;
  final long zzUt;
  int zzUu;
  final DocumentContents zzUv;
  final boolean zzUw;
  int zzUx;
  int zzUy;
  public final String zzvp;
  
  static
  {
    zzj localzzj = new com/google/android/gms/appdatasearch/zzj;
    localzzj.<init>();
    CREATOR = localzzj;
  }
  
  UsageInfo(int paramInt1, DocumentId paramDocumentId, long paramLong, int paramInt2, String paramString, DocumentContents paramDocumentContents, boolean paramBoolean, int paramInt3, int paramInt4)
  {
    this.mVersionCode = paramInt1;
    this.zzUs = paramDocumentId;
    this.zzUt = paramLong;
    this.zzUu = paramInt2;
    this.zzvp = paramString;
    this.zzUv = paramDocumentContents;
    this.zzUw = paramBoolean;
    this.zzUx = paramInt3;
    this.zzUy = paramInt4;
  }
  
  private UsageInfo(DocumentId paramDocumentId, long paramLong, int paramInt1, String paramString, DocumentContents paramDocumentContents, boolean paramBoolean, int paramInt2, int paramInt3)
  {
    this(1, paramDocumentId, paramLong, paramInt1, paramString, paramDocumentContents, paramBoolean, paramInt2, paramInt3);
  }
  
  public UsageInfo(String paramString1, Intent paramIntent, String paramString2, Uri paramUri, String paramString3, List paramList, int paramInt)
  {
    this(1, localDocumentId, l, 0, null, localDocumentContents, false, -1, paramInt);
  }
  
  public static DocumentContents.zza zza(Intent paramIntent, String paramString1, Uri paramUri, String paramString2, List paramList)
  {
    DocumentContents.zza localzza = new com/google/android/gms/appdatasearch/DocumentContents$zza;
    localzza.<init>();
    Object localObject = zzbD(paramString1);
    localzza.zza((DocumentSection)localObject);
    if (paramUri != null)
    {
      localObject = zzi(paramUri);
      localzza.zza((DocumentSection)localObject);
    }
    if (paramList != null)
    {
      localObject = zzs(paramList);
      localzza.zza((DocumentSection)localObject);
    }
    localObject = paramIntent.getAction();
    String str;
    if (localObject != null)
    {
      str = "intent_action";
      localObject = zzo(str, (String)localObject);
      localzza.zza((DocumentSection)localObject);
    }
    localObject = paramIntent.getDataString();
    if (localObject != null)
    {
      str = "intent_data";
      localObject = zzo(str, (String)localObject);
      localzza.zza((DocumentSection)localObject);
    }
    localObject = paramIntent.getComponent();
    if (localObject != null)
    {
      str = "intent_activity";
      localObject = ((ComponentName)localObject).getClassName();
      localObject = zzo(str, (String)localObject);
      localzza.zza((DocumentSection)localObject);
    }
    localObject = paramIntent.getExtras();
    if (localObject != null)
    {
      str = "intent_extra_data_key";
      localObject = ((Bundle)localObject).getString(str);
      if (localObject != null)
      {
        str = "intent_extra_data";
        localObject = zzo(str, (String)localObject);
        localzza.zza((DocumentSection)localObject);
      }
    }
    return localzza.zzbz(paramString2).zzL(true);
  }
  
  public static DocumentId zza(String paramString, Intent paramIntent)
  {
    String str = zzg(paramIntent);
    return zzn(paramString, str);
  }
  
  private static DocumentSection zzbD(String paramString)
  {
    int i = 1;
    DocumentSection localDocumentSection = new com/google/android/gms/appdatasearch/DocumentSection;
    Object localObject = new com/google/android/gms/appdatasearch/RegisterSectionInfo$zza;
    ((RegisterSectionInfo.zza)localObject).<init>("title");
    localObject = ((RegisterSectionInfo.zza)localObject).zzap(i).zzN(i).zzbC("name").zzmh();
    localDocumentSection.<init>(paramString, (RegisterSectionInfo)localObject, "text1");
    return localDocumentSection;
  }
  
  private static String zzg(Intent paramIntent)
  {
    int i = 1;
    Object localObject1 = paramIntent.toUri(i);
    Object localObject2 = new java/util/zip/CRC32;
    ((CRC32)localObject2).<init>();
    String str = "UTF-8";
    try
    {
      localObject1 = ((String)localObject1).getBytes(str);
      ((CRC32)localObject2).update((byte[])localObject1);
      return Long.toHexString(((CRC32)localObject2).getValue());
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      localObject2 = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject2).<init>(localUnsupportedEncodingException);
      throw ((Throwable)localObject2);
    }
  }
  
  private static DocumentSection zzi(Uri paramUri)
  {
    DocumentSection localDocumentSection = new com/google/android/gms/appdatasearch/DocumentSection;
    String str = paramUri.toString();
    Object localObject = new com/google/android/gms/appdatasearch/RegisterSectionInfo$zza;
    ((RegisterSectionInfo.zza)localObject).<init>("web_url");
    localObject = ((RegisterSectionInfo.zza)localObject).zzap(4).zzM(true).zzbC("url").zzmh();
    localDocumentSection.<init>(str, (RegisterSectionInfo)localObject);
    return localDocumentSection;
  }
  
  private static DocumentId zzn(String paramString1, String paramString2)
  {
    DocumentId localDocumentId = new com/google/android/gms/appdatasearch/DocumentId;
    localDocumentId.<init>(paramString1, "", paramString2);
    return localDocumentId;
  }
  
  private static DocumentSection zzo(String paramString1, String paramString2)
  {
    DocumentSection localDocumentSection = new com/google/android/gms/appdatasearch/DocumentSection;
    Object localObject = new com/google/android/gms/appdatasearch/RegisterSectionInfo$zza;
    ((RegisterSectionInfo.zza)localObject).<init>(paramString1);
    localObject = ((RegisterSectionInfo.zza)localObject).zzM(true).zzmh();
    localDocumentSection.<init>(paramString2, (RegisterSectionInfo)localObject, paramString1);
    return localDocumentSection;
  }
  
  private static DocumentSection zzs(List paramList)
  {
    Object localObject1 = new com/google/android/gms/internal/zzpm$zza;
    ((zzpm.zza)localObject1).<init>();
    zzpm.zza.zza[] arrayOfzza = new zzpm.zza.zza[paramList.size()];
    int i = 0;
    Object localObject2 = null;
    int j = 0;
    byte[] arrayOfByte = null;
    for (;;)
    {
      i = arrayOfzza.length;
      if (j >= i) {
        break;
      }
      localObject2 = new com/google/android/gms/internal/zzpm$zza$zza;
      ((zzpm.zza.zza)localObject2).<init>();
      arrayOfzza[j] = localObject2;
      localObject2 = (AppIndexApi.AppIndexingLink)paramList.get(j);
      Object localObject3 = arrayOfzza[j];
      String str = ((AppIndexApi.AppIndexingLink)localObject2).appIndexingUrl.toString();
      ((zzpm.zza.zza)localObject3).zzaMq = str;
      localObject3 = arrayOfzza[j];
      int k = ((AppIndexApi.AppIndexingLink)localObject2).viewId;
      ((zzpm.zza.zza)localObject3).viewId = k;
      localObject3 = ((AppIndexApi.AppIndexingLink)localObject2).webUrl;
      if (localObject3 != null)
      {
        localObject3 = arrayOfzza[j];
        localObject2 = ((AppIndexApi.AppIndexingLink)localObject2).webUrl.toString();
        ((zzpm.zza.zza)localObject3).zzaMr = ((String)localObject2);
      }
      i = j + 1;
      j = i;
    }
    ((zzpm.zza)localObject1).zzaMo = arrayOfzza;
    localObject2 = new com/google/android/gms/appdatasearch/DocumentSection;
    arrayOfByte = zzsu.toByteArray((zzsu)localObject1);
    localObject1 = new com/google/android/gms/appdatasearch/RegisterSectionInfo$zza;
    ((RegisterSectionInfo.zza)localObject1).<init>("outlinks");
    localObject1 = ((RegisterSectionInfo.zza)localObject1).zzM(true).zzbC(".private:outLinks").zzbB("blob").zzmh();
    ((DocumentSection)localObject2).<init>(arrayOfByte, (RegisterSectionInfo)localObject1);
    return (DocumentSection)localObject2;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public String toString()
  {
    Object[] arrayOfObject = new Object[4];
    Object localObject = this.zzUs;
    arrayOfObject[0] = localObject;
    localObject = Long.valueOf(this.zzUt);
    arrayOfObject[1] = localObject;
    localObject = Integer.valueOf(this.zzUu);
    arrayOfObject[2] = localObject;
    localObject = Integer.valueOf(this.zzUy);
    arrayOfObject[3] = localObject;
    return String.format("UsageInfo[documentId=%s, timestamp=%d, usageType=%d, status=%d]", arrayOfObject);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzj.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\appdatasearch\UsageInfo.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */