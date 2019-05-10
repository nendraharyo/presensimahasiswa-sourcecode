package com.google.android.gms.wearable;

import android.net.Uri;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;

public class Asset
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  final int mVersionCode;
  public Uri uri;
  private byte[] zzaKm;
  private String zzbqU;
  public ParcelFileDescriptor zzbqV;
  
  static
  {
    zze localzze = new com/google/android/gms/wearable/zze;
    localzze.<init>();
    CREATOR = localzze;
  }
  
  Asset(int paramInt, byte[] paramArrayOfByte, String paramString, ParcelFileDescriptor paramParcelFileDescriptor, Uri paramUri)
  {
    this.mVersionCode = paramInt;
    this.zzaKm = paramArrayOfByte;
    this.zzbqU = paramString;
    this.zzbqV = paramParcelFileDescriptor;
    this.uri = paramUri;
  }
  
  public static Asset createFromBytes(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte == null)
    {
      localObject = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject).<init>("Asset data cannot be null");
      throw ((Throwable)localObject);
    }
    Object localObject = new com/google/android/gms/wearable/Asset;
    ((Asset)localObject).<init>(1, paramArrayOfByte, null, null, null);
    return (Asset)localObject;
  }
  
  public static Asset createFromFd(ParcelFileDescriptor paramParcelFileDescriptor)
  {
    if (paramParcelFileDescriptor == null)
    {
      localObject = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject).<init>("Asset fd cannot be null");
      throw ((Throwable)localObject);
    }
    Object localObject = new com/google/android/gms/wearable/Asset;
    ((Asset)localObject).<init>(1, null, null, paramParcelFileDescriptor, null);
    return (Asset)localObject;
  }
  
  public static Asset createFromRef(String paramString)
  {
    if (paramString == null)
    {
      localObject = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject).<init>("Asset digest cannot be null");
      throw ((Throwable)localObject);
    }
    Object localObject = new com/google/android/gms/wearable/Asset;
    ((Asset)localObject).<init>(1, null, paramString, null, null);
    return (Asset)localObject;
  }
  
  public static Asset createFromUri(Uri paramUri)
  {
    if (paramUri == null)
    {
      localObject = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject).<init>("Asset uri cannot be null");
      throw ((Throwable)localObject);
    }
    Object localObject = new com/google/android/gms/wearable/Asset;
    ((Asset)localObject).<init>(1, null, null, null, paramUri);
    return (Asset)localObject;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = true;
    if (this == paramObject) {}
    for (;;)
    {
      return bool1;
      boolean bool2 = paramObject instanceof Asset;
      if (!bool2)
      {
        bool1 = false;
      }
      else
      {
        paramObject = (Asset)paramObject;
        Object localObject1 = this.zzaKm;
        Object localObject2 = ((Asset)paramObject).zzaKm;
        bool2 = zzw.equal(localObject1, localObject2);
        if (bool2)
        {
          localObject1 = this.zzbqU;
          localObject2 = ((Asset)paramObject).zzbqU;
          bool2 = zzw.equal(localObject1, localObject2);
          if (bool2)
          {
            localObject1 = this.zzbqV;
            localObject2 = ((Asset)paramObject).zzbqV;
            bool2 = zzw.equal(localObject1, localObject2);
            if (bool2)
            {
              localObject1 = this.uri;
              localObject2 = ((Asset)paramObject).uri;
              bool2 = zzw.equal(localObject1, localObject2);
              if (bool2) {
                continue;
              }
            }
          }
        }
        bool1 = false;
      }
    }
  }
  
  public byte[] getData()
  {
    return this.zzaKm;
  }
  
  public String getDigest()
  {
    return this.zzbqU;
  }
  
  public ParcelFileDescriptor getFd()
  {
    return this.zzbqV;
  }
  
  public Uri getUri()
  {
    return this.uri;
  }
  
  public int hashCode()
  {
    Object[] arrayOfObject = new Object[4];
    Object localObject = this.zzaKm;
    arrayOfObject[0] = localObject;
    localObject = this.zzbqU;
    arrayOfObject[1] = localObject;
    localObject = this.zzbqV;
    arrayOfObject[2] = localObject;
    localObject = this.uri;
    arrayOfObject[3] = localObject;
    return zzw.hashCode(arrayOfObject);
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder.append("Asset[@");
    int i = hashCode();
    Object localObject = Integer.toHexString(i);
    localStringBuilder.append((String)localObject);
    localObject = this.zzbqU;
    if (localObject == null)
    {
      localObject = ", nodigest";
      localStringBuilder.append((String)localObject);
    }
    for (;;)
    {
      localObject = this.zzaKm;
      if (localObject != null)
      {
        localStringBuilder.append(", size=");
        localObject = this.zzaKm;
        i = localObject.length;
        localStringBuilder.append(i);
      }
      localObject = this.zzbqV;
      if (localObject != null)
      {
        localStringBuilder.append(", fd=");
        localObject = this.zzbqV;
        localStringBuilder.append(localObject);
      }
      localObject = this.uri;
      if (localObject != null)
      {
        localStringBuilder.append(", uri=");
        localObject = this.uri;
        localStringBuilder.append(localObject);
      }
      localStringBuilder.append("]");
      return localStringBuilder.toString();
      localStringBuilder.append(", ");
      localObject = this.zzbqU;
      localStringBuilder.append((String)localObject);
    }
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = paramInt | 0x1;
    zze.zza(this, paramParcel, i);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\wearable\Asset.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */