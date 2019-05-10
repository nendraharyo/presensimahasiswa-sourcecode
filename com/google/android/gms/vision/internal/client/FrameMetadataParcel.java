package com.google.android.gms.vision.internal.client;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.vision.Frame;
import com.google.android.gms.vision.Frame.Metadata;

public class FrameMetadataParcel
  implements SafeParcelable
{
  public static final zza CREATOR;
  public int height;
  public int id;
  public int rotation;
  final int versionCode;
  public int width;
  public long zzboe;
  
  static
  {
    zza localzza = new com/google/android/gms/vision/internal/client/zza;
    localzza.<init>();
    CREATOR = localzza;
  }
  
  public FrameMetadataParcel()
  {
    this.versionCode = 1;
  }
  
  public FrameMetadataParcel(int paramInt1, int paramInt2, int paramInt3, int paramInt4, long paramLong, int paramInt5)
  {
    this.versionCode = paramInt1;
    this.width = paramInt2;
    this.height = paramInt3;
    this.id = paramInt4;
    this.zzboe = paramLong;
    this.rotation = paramInt5;
  }
  
  public static FrameMetadataParcel zzc(Frame paramFrame)
  {
    FrameMetadataParcel localFrameMetadataParcel = new com/google/android/gms/vision/internal/client/FrameMetadataParcel;
    localFrameMetadataParcel.<init>();
    int i = paramFrame.getMetadata().getWidth();
    localFrameMetadataParcel.width = i;
    i = paramFrame.getMetadata().getHeight();
    localFrameMetadataParcel.height = i;
    i = paramFrame.getMetadata().getRotation();
    localFrameMetadataParcel.rotation = i;
    i = paramFrame.getMetadata().getId();
    localFrameMetadataParcel.id = i;
    long l = paramFrame.getMetadata().getTimestampMillis();
    localFrameMetadataParcel.zzboe = l;
    return localFrameMetadataParcel;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zza.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\vision\internal\client\FrameMetadataParcel.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */