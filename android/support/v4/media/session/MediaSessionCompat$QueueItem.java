package android.support.v4.media.session;

import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.v4.media.MediaDescriptionCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class MediaSessionCompat$QueueItem
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR;
  private final MediaDescriptionCompat a;
  private final long b;
  private Object c;
  
  static
  {
    MediaSessionCompat.QueueItem.1 local1 = new android/support/v4/media/session/MediaSessionCompat$QueueItem$1;
    local1.<init>();
    CREATOR = local1;
  }
  
  MediaSessionCompat$QueueItem(Parcel paramParcel)
  {
    MediaDescriptionCompat localMediaDescriptionCompat = (MediaDescriptionCompat)MediaDescriptionCompat.CREATOR.createFromParcel(paramParcel);
    this.a = localMediaDescriptionCompat;
    long l = paramParcel.readLong();
    this.b = l;
  }
  
  private MediaSessionCompat$QueueItem(Object paramObject, MediaDescriptionCompat paramMediaDescriptionCompat, long paramLong)
  {
    IllegalArgumentException localIllegalArgumentException;
    if (paramMediaDescriptionCompat == null)
    {
      localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localIllegalArgumentException.<init>("Description cannot be null.");
      throw localIllegalArgumentException;
    }
    long l = -1;
    boolean bool = paramLong < l;
    if (!bool)
    {
      localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localIllegalArgumentException.<init>("Id cannot be QueueItem.UNKNOWN_ID");
      throw localIllegalArgumentException;
    }
    this.a = paramMediaDescriptionCompat;
    this.b = paramLong;
    this.c = paramObject;
  }
  
  public static QueueItem a(Object paramObject)
  {
    int i;
    QueueItem localQueueItem;
    if (paramObject != null)
    {
      i = Build.VERSION.SDK_INT;
      int j = 21;
      if (i >= j) {}
    }
    else
    {
      i = 0;
      localQueueItem = null;
    }
    for (;;)
    {
      return localQueueItem;
      MediaDescriptionCompat localMediaDescriptionCompat = MediaDescriptionCompat.a(d.a.a(paramObject));
      long l = d.a.b(paramObject);
      localQueueItem = new android/support/v4/media/session/MediaSessionCompat$QueueItem;
      localQueueItem.<init>(paramObject, localMediaDescriptionCompat, l);
    }
  }
  
  public static List a(List paramList)
  {
    int i;
    if (paramList != null)
    {
      i = Build.VERSION.SDK_INT;
      int j = 21;
      if (i >= j) {}
    }
    else
    {
      i = 0;
      localObject = null;
      return (List)localObject;
    }
    Object localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    Iterator localIterator = paramList.iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      QueueItem localQueueItem = a(localIterator.next());
      ((List)localObject).add(localQueueItem);
    }
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder = localStringBuilder.append("MediaSession.QueueItem {Description=");
    MediaDescriptionCompat localMediaDescriptionCompat = this.a;
    localStringBuilder = localStringBuilder.append(localMediaDescriptionCompat).append(", Id=");
    long l = this.b;
    return l + " }";
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    this.a.writeToParcel(paramParcel, paramInt);
    long l = this.b;
    paramParcel.writeLong(l);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\media\session\MediaSessionCompat$QueueItem.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */