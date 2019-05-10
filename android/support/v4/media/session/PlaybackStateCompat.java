package android.support.v4.media.session;

import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class PlaybackStateCompat
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR;
  final int a;
  final long b;
  final long c;
  final float d;
  final long e;
  final int f;
  final CharSequence g;
  final long h;
  List i;
  final long j;
  final Bundle k;
  private Object l;
  
  static
  {
    PlaybackStateCompat.1 local1 = new android/support/v4/media/session/PlaybackStateCompat$1;
    local1.<init>();
    CREATOR = local1;
  }
  
  PlaybackStateCompat(int paramInt1, long paramLong1, long paramLong2, float paramFloat, long paramLong3, int paramInt2, CharSequence paramCharSequence, long paramLong4, List paramList, long paramLong5, Bundle paramBundle)
  {
    this.a = paramInt1;
    this.b = paramLong1;
    this.c = paramLong2;
    this.d = paramFloat;
    this.e = paramLong3;
    this.f = paramInt2;
    this.g = paramCharSequence;
    this.h = paramLong4;
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>(paramList);
    this.i = localArrayList;
    this.j = paramLong5;
    this.k = paramBundle;
  }
  
  PlaybackStateCompat(Parcel paramParcel)
  {
    int m = paramParcel.readInt();
    this.a = m;
    long l1 = paramParcel.readLong();
    this.b = l1;
    float f1 = paramParcel.readFloat();
    this.d = f1;
    l1 = paramParcel.readLong();
    this.h = l1;
    l1 = paramParcel.readLong();
    this.c = l1;
    l1 = paramParcel.readLong();
    this.e = l1;
    Object localObject = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(paramParcel);
    this.g = ((CharSequence)localObject);
    localObject = PlaybackStateCompat.CustomAction.CREATOR;
    localObject = paramParcel.createTypedArrayList((Parcelable.Creator)localObject);
    this.i = ((List)localObject);
    l1 = paramParcel.readLong();
    this.j = l1;
    localObject = paramParcel.readBundle();
    this.k = ((Bundle)localObject);
    m = paramParcel.readInt();
    this.f = m;
  }
  
  public static PlaybackStateCompat a(Object paramObject)
  {
    int m;
    Object localObject;
    Bundle localBundle;
    if (paramObject != null)
    {
      m = Build.VERSION.SDK_INT;
      int n = 21;
      if (m >= n)
      {
        localObject = e.h(paramObject);
        ArrayList localArrayList = null;
        if (localObject != null)
        {
          localArrayList = new java/util/ArrayList;
          n = ((List)localObject).size();
          localArrayList.<init>(n);
          localObject = ((List)localObject).iterator();
          for (;;)
          {
            boolean bool = ((Iterator)localObject).hasNext();
            if (!bool) {
              break;
            }
            PlaybackStateCompat.CustomAction localCustomAction = PlaybackStateCompat.CustomAction.a(((Iterator)localObject).next());
            localArrayList.add(localCustomAction);
          }
        }
        m = Build.VERSION.SDK_INT;
        int i1 = 22;
        if (m >= i1)
        {
          localBundle = f.a(paramObject);
          localObject = new android/support/v4/media/session/PlaybackStateCompat;
          i1 = e.a(paramObject);
          long l1 = e.b(paramObject);
          long l2 = e.c(paramObject);
          float f1 = e.d(paramObject);
          long l3 = e.e(paramObject);
          CharSequence localCharSequence = e.f(paramObject);
          long l4 = e.g(paramObject);
          long l5 = e.i(paramObject);
          ((PlaybackStateCompat)localObject).<init>(i1, l1, l2, f1, l3, 0, localCharSequence, l4, localArrayList, l5, localBundle);
          ((PlaybackStateCompat)localObject).l = paramObject;
        }
      }
    }
    for (;;)
    {
      return (PlaybackStateCompat)localObject;
      localBundle = null;
      break;
      m = 0;
      localObject = null;
    }
  }
  
  public int a()
  {
    return this.a;
  }
  
  public long b()
  {
    return this.e;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder1 = new java/lang/StringBuilder;
    localStringBuilder1.<init>("PlaybackState {");
    StringBuilder localStringBuilder2 = localStringBuilder1.append("state=");
    int m = this.a;
    localStringBuilder2.append(m);
    localStringBuilder2 = localStringBuilder1.append(", position=");
    long l1 = this.b;
    localStringBuilder2.append(l1);
    localStringBuilder2 = localStringBuilder1.append(", buffered position=");
    l1 = this.c;
    localStringBuilder2.append(l1);
    localStringBuilder2 = localStringBuilder1.append(", speed=");
    float f1 = this.d;
    localStringBuilder2.append(f1);
    localStringBuilder2 = localStringBuilder1.append(", updated=");
    l1 = this.h;
    localStringBuilder2.append(l1);
    localStringBuilder2 = localStringBuilder1.append(", actions=");
    l1 = this.e;
    localStringBuilder2.append(l1);
    localStringBuilder2 = localStringBuilder1.append(", error code=");
    m = this.f;
    localStringBuilder2.append(m);
    localStringBuilder2 = localStringBuilder1.append(", error message=");
    Object localObject = this.g;
    localStringBuilder2.append((CharSequence)localObject);
    localStringBuilder2 = localStringBuilder1.append(", custom actions=");
    localObject = this.i;
    localStringBuilder2.append(localObject);
    localStringBuilder2 = localStringBuilder1.append(", active item id=");
    l1 = this.j;
    localStringBuilder2.append(l1);
    localStringBuilder1.append("}");
    return localStringBuilder1.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int m = this.a;
    paramParcel.writeInt(m);
    long l1 = this.b;
    paramParcel.writeLong(l1);
    float f1 = this.d;
    paramParcel.writeFloat(f1);
    l1 = this.h;
    paramParcel.writeLong(l1);
    l1 = this.c;
    paramParcel.writeLong(l1);
    l1 = this.e;
    paramParcel.writeLong(l1);
    TextUtils.writeToParcel(this.g, paramParcel, paramInt);
    Object localObject = this.i;
    paramParcel.writeTypedList((List)localObject);
    l1 = this.j;
    paramParcel.writeLong(l1);
    localObject = this.k;
    paramParcel.writeBundle((Bundle)localObject);
    m = this.f;
    paramParcel.writeInt(m);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\media\session\PlaybackStateCompat.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */