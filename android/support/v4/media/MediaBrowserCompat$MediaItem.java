package android.support.v4.media;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class MediaBrowserCompat$MediaItem
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR;
  private final int a;
  private final MediaDescriptionCompat b;
  
  static
  {
    MediaBrowserCompat.MediaItem.1 local1 = new android/support/v4/media/MediaBrowserCompat$MediaItem$1;
    local1.<init>();
    CREATOR = local1;
  }
  
  MediaBrowserCompat$MediaItem(Parcel paramParcel)
  {
    int i = paramParcel.readInt();
    this.a = i;
    MediaDescriptionCompat localMediaDescriptionCompat = (MediaDescriptionCompat)MediaDescriptionCompat.CREATOR.createFromParcel(paramParcel);
    this.b = localMediaDescriptionCompat;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder1 = new java/lang/StringBuilder;
    localStringBuilder1.<init>("MediaItem{");
    StringBuilder localStringBuilder2 = localStringBuilder1.append("mFlags=");
    int i = this.a;
    localStringBuilder2.append(i);
    localStringBuilder2 = localStringBuilder1.append(", mDescription=");
    MediaDescriptionCompat localMediaDescriptionCompat = this.b;
    localStringBuilder2.append(localMediaDescriptionCompat);
    localStringBuilder1.append('}');
    return localStringBuilder1.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = this.a;
    paramParcel.writeInt(i);
    this.b.writeToParcel(paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\media\MediaBrowserCompat$MediaItem.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */