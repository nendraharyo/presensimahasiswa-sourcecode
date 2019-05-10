package com.google.android.gms.wearable;

import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.wearable.internal.DataItemAssetParcelable;
import java.security.SecureRandom;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class PutDataRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  public static final String WEAR_URI_SCHEME = "wear";
  private static final long zzbrf;
  private static final Random zzbrg;
  private final Uri mUri;
  final int mVersionCode;
  private byte[] zzaKm;
  private final Bundle zzbrh;
  private long zzbri;
  
  static
  {
    Object localObject = new com/google/android/gms/wearable/zzh;
    ((zzh)localObject).<init>();
    CREATOR = (Parcelable.Creator)localObject;
    zzbrf = TimeUnit.MINUTES.toMillis(30);
    localObject = new java/security/SecureRandom;
    ((SecureRandom)localObject).<init>();
    zzbrg = (Random)localObject;
  }
  
  private PutDataRequest(int paramInt, Uri paramUri)
  {
    this(paramInt, paramUri, localBundle, null, l);
  }
  
  PutDataRequest(int paramInt, Uri paramUri, Bundle paramBundle, byte[] paramArrayOfByte, long paramLong)
  {
    this.mVersionCode = paramInt;
    this.mUri = paramUri;
    this.zzbrh = paramBundle;
    Bundle localBundle = this.zzbrh;
    ClassLoader localClassLoader = DataItemAssetParcelable.class.getClassLoader();
    localBundle.setClassLoader(localClassLoader);
    this.zzaKm = paramArrayOfByte;
    this.zzbri = paramLong;
  }
  
  public static PutDataRequest create(String paramString)
  {
    return zzr(zzgL(paramString));
  }
  
  public static PutDataRequest createFromDataItem(DataItem paramDataItem)
  {
    Object localObject1 = zzr(paramDataItem.getUri());
    Object localObject2 = paramDataItem.getAssets().entrySet();
    Iterator localIterator = ((Set)localObject2).iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localObject2 = (Map.Entry)localIterator.next();
      Object localObject3 = ((DataItemAsset)((Map.Entry)localObject2).getValue()).getId();
      if (localObject3 == null)
      {
        localObject3 = new java/lang/IllegalStateException;
        localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>();
        localObject1 = ((StringBuilder)localObject1).append("Cannot create an asset for a put request without a digest: ");
        localObject2 = (String)((Map.Entry)localObject2).getKey();
        localObject2 = (String)localObject2;
        ((IllegalStateException)localObject3).<init>((String)localObject2);
        throw ((Throwable)localObject3);
      }
      localObject3 = (String)((Map.Entry)localObject2).getKey();
      localObject2 = Asset.createFromRef(((DataItemAsset)((Map.Entry)localObject2).getValue()).getId());
      ((PutDataRequest)localObject1).putAsset((String)localObject3, (Asset)localObject2);
    }
    localObject2 = paramDataItem.getData();
    ((PutDataRequest)localObject1).setData((byte[])localObject2);
    return (PutDataRequest)localObject1;
  }
  
  public static PutDataRequest createWithAutoAppendedId(String paramString)
  {
    Object localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>(paramString);
    Object localObject2 = "/";
    boolean bool = paramString.endsWith((String)localObject2);
    if (!bool)
    {
      localObject2 = "/";
      ((StringBuilder)localObject1).append((String)localObject2);
    }
    localObject2 = ((StringBuilder)localObject1).append("PN");
    long l = zzbrg.nextLong();
    ((StringBuilder)localObject2).append(l);
    localObject1 = zzgL(((StringBuilder)localObject1).toString());
    localObject2 = new com/google/android/gms/wearable/PutDataRequest;
    ((PutDataRequest)localObject2).<init>(2, (Uri)localObject1);
    return (PutDataRequest)localObject2;
  }
  
  private static Uri zzgL(String paramString)
  {
    boolean bool = TextUtils.isEmpty(paramString);
    if (bool)
    {
      localObject = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject).<init>("An empty path was supplied.");
      throw ((Throwable)localObject);
    }
    Object localObject = "/";
    bool = paramString.startsWith((String)localObject);
    if (!bool)
    {
      localObject = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject).<init>("A path must start with a single / .");
      throw ((Throwable)localObject);
    }
    localObject = "//";
    bool = paramString.startsWith((String)localObject);
    if (bool)
    {
      localObject = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject).<init>("A path must start with a single / .");
      throw ((Throwable)localObject);
    }
    localObject = new android/net/Uri$Builder;
    ((Uri.Builder)localObject).<init>();
    return ((Uri.Builder)localObject).scheme("wear").path(paramString).build();
  }
  
  public static PutDataRequest zzr(Uri paramUri)
  {
    PutDataRequest localPutDataRequest = new com/google/android/gms/wearable/PutDataRequest;
    localPutDataRequest.<init>(2, paramUri);
    return localPutDataRequest;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public Asset getAsset(String paramString)
  {
    return (Asset)this.zzbrh.getParcelable(paramString);
  }
  
  public Map getAssets()
  {
    HashMap localHashMap = new java/util/HashMap;
    localHashMap.<init>();
    Object localObject = this.zzbrh.keySet();
    Iterator localIterator = ((Set)localObject).iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localObject = (String)localIterator.next();
      Asset localAsset = (Asset)this.zzbrh.getParcelable((String)localObject);
      localHashMap.put(localObject, localAsset);
    }
    return Collections.unmodifiableMap(localHashMap);
  }
  
  public byte[] getData()
  {
    return this.zzaKm;
  }
  
  public Uri getUri()
  {
    return this.mUri;
  }
  
  public boolean hasAsset(String paramString)
  {
    return this.zzbrh.containsKey(paramString);
  }
  
  public boolean isUrgent()
  {
    long l1 = this.zzbri;
    long l2 = 0L;
    boolean bool = l1 < l2;
    if (!bool) {}
    for (bool = true;; bool = false) {
      return bool;
    }
  }
  
  public PutDataRequest putAsset(String paramString, Asset paramAsset)
  {
    zzx.zzz(paramString);
    zzx.zzz(paramAsset);
    this.zzbrh.putParcelable(paramString, paramAsset);
    return this;
  }
  
  public PutDataRequest removeAsset(String paramString)
  {
    this.zzbrh.remove(paramString);
    return this;
  }
  
  public PutDataRequest setData(byte[] paramArrayOfByte)
  {
    this.zzaKm = paramArrayOfByte;
    return this;
  }
  
  public PutDataRequest setUrgent()
  {
    this.zzbri = 0L;
    return this;
  }
  
  public String toString()
  {
    boolean bool = Log.isLoggable("DataMap", 3);
    return toString(bool);
  }
  
  public String toString(boolean paramBoolean)
  {
    StringBuilder localStringBuilder1 = new java/lang/StringBuilder;
    localStringBuilder1.<init>("PutDataRequest[");
    Object localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    Object localObject2 = ((StringBuilder)localObject1).append("dataSz=");
    localObject1 = this.zzaKm;
    if (localObject1 == null)
    {
      localObject1 = "null";
      localObject1 = localObject1;
      localStringBuilder1.append((String)localObject1);
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject1 = ((StringBuilder)localObject1).append(", numAssets=");
      int i = this.zzbrh.size();
      localObject1 = i;
      localStringBuilder1.append((String)localObject1);
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject1 = ((StringBuilder)localObject1).append(", uri=");
      localObject2 = this.mUri;
      localObject1 = localObject2;
      localStringBuilder1.append((String)localObject1);
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject2 = ", syncDeadline=";
      localObject1 = ((StringBuilder)localObject1).append((String)localObject2);
      long l = this.zzbri;
      localObject1 = l;
      localStringBuilder1.append((String)localObject1);
      if (paramBoolean) {
        break label213;
      }
      localStringBuilder1.append("]");
    }
    for (localObject1 = localStringBuilder1.toString();; localObject1 = localStringBuilder1.toString())
    {
      return (String)localObject1;
      int j = this.zzaKm.length;
      localObject1 = Integer.valueOf(j);
      break;
      label213:
      localStringBuilder1.append("]\n  assets: ");
      localObject1 = this.zzbrh.keySet();
      localObject2 = ((Set)localObject1).iterator();
      for (;;)
      {
        boolean bool = ((Iterator)localObject2).hasNext();
        if (!bool) {
          break;
        }
        localObject1 = (String)((Iterator)localObject2).next();
        StringBuilder localStringBuilder2 = new java/lang/StringBuilder;
        localStringBuilder2.<init>();
        localStringBuilder2 = localStringBuilder2.append("\n    ").append((String)localObject1).append(": ");
        Bundle localBundle = this.zzbrh;
        localObject1 = localBundle.getParcelable((String)localObject1);
        localObject1 = localObject1;
        localStringBuilder1.append((String)localObject1);
      }
      localStringBuilder1.append("\n  ]");
    }
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzh.zza(this, paramParcel, paramInt);
  }
  
  public Bundle zzIv()
  {
    return this.zzbrh;
  }
  
  public long zzIw()
  {
    return this.zzbri;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\wearable\PutDataRequest.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */