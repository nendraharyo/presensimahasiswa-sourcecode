package com.google.android.gms.wearable;

import android.net.Uri;
import android.util.Log;
import com.google.android.gms.internal.zzsi;
import com.google.android.gms.internal.zzsi.zza;
import com.google.android.gms.internal.zzsu;
import java.util.List;

public class PutDataMapRequest
{
  private final DataMap zzbrd;
  private final PutDataRequest zzbre;
  
  private PutDataMapRequest(PutDataRequest paramPutDataRequest, DataMap paramDataMap)
  {
    this.zzbre = paramPutDataRequest;
    DataMap localDataMap = new com/google/android/gms/wearable/DataMap;
    localDataMap.<init>();
    this.zzbrd = localDataMap;
    if (paramDataMap != null)
    {
      localDataMap = this.zzbrd;
      localDataMap.putAll(paramDataMap);
    }
  }
  
  public static PutDataMapRequest create(String paramString)
  {
    PutDataMapRequest localPutDataMapRequest = new com/google/android/gms/wearable/PutDataMapRequest;
    PutDataRequest localPutDataRequest = PutDataRequest.create(paramString);
    localPutDataMapRequest.<init>(localPutDataRequest, null);
    return localPutDataMapRequest;
  }
  
  public static PutDataMapRequest createFromDataMapItem(DataMapItem paramDataMapItem)
  {
    PutDataMapRequest localPutDataMapRequest = new com/google/android/gms/wearable/PutDataMapRequest;
    PutDataRequest localPutDataRequest = PutDataRequest.zzr(paramDataMapItem.getUri());
    DataMap localDataMap = paramDataMapItem.getDataMap();
    localPutDataMapRequest.<init>(localPutDataRequest, localDataMap);
    return localPutDataMapRequest;
  }
  
  public static PutDataMapRequest createWithAutoAppendedId(String paramString)
  {
    PutDataMapRequest localPutDataMapRequest = new com/google/android/gms/wearable/PutDataMapRequest;
    PutDataRequest localPutDataRequest = PutDataRequest.createWithAutoAppendedId(paramString);
    localPutDataMapRequest.<init>(localPutDataRequest, null);
    return localPutDataMapRequest;
  }
  
  public PutDataRequest asPutDataRequest()
  {
    Object localObject1 = zzsi.zza(this.zzbrd);
    Object localObject2 = this.zzbre;
    Object localObject3 = zzsu.toByteArray(((zzsi.zza)localObject1).zzbty);
    ((PutDataRequest)localObject2).setData((byte[])localObject3);
    int i = ((zzsi.zza)localObject1).zzbtz.size();
    int j = 0;
    localObject2 = null;
    int k = 0;
    localObject3 = null;
    while (k < i)
    {
      String str1 = Integer.toString(k);
      localObject2 = (Asset)((zzsi.zza)localObject1).zzbtz.get(k);
      if (str1 == null)
      {
        localObject3 = new java/lang/IllegalStateException;
        localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>();
        localObject2 = "asset key cannot be null: " + localObject2;
        ((IllegalStateException)localObject3).<init>((String)localObject2);
        throw ((Throwable)localObject3);
      }
      if (localObject2 == null)
      {
        localObject2 = new java/lang/IllegalStateException;
        localObject3 = new java/lang/StringBuilder;
        ((StringBuilder)localObject3).<init>();
        localObject3 = "asset cannot be null: key=" + str1;
        ((IllegalStateException)localObject2).<init>((String)localObject3);
        throw ((Throwable)localObject2);
      }
      Object localObject4 = "DataMap";
      int m = 3;
      boolean bool = Log.isLoggable((String)localObject4, m);
      if (bool)
      {
        localObject4 = "DataMap";
        Object localObject5 = new java/lang/StringBuilder;
        ((StringBuilder)localObject5).<init>();
        localObject5 = ((StringBuilder)localObject5).append("asPutDataRequest: adding asset: ").append(str1);
        String str2 = " ";
        localObject5 = str2 + localObject2;
        Log.d((String)localObject4, (String)localObject5);
      }
      localObject4 = this.zzbre;
      ((PutDataRequest)localObject4).putAsset(str1, (Asset)localObject2);
      j = k + 1;
      k = j;
    }
    return this.zzbre;
  }
  
  public DataMap getDataMap()
  {
    return this.zzbrd;
  }
  
  public Uri getUri()
  {
    return this.zzbre.getUri();
  }
  
  public boolean isUrgent()
  {
    return this.zzbre.isUrgent();
  }
  
  public PutDataMapRequest setUrgent()
  {
    this.zzbre.setUrgent();
    return this;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\wearable\PutDataMapRequest.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */