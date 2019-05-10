package android.support.v4.media;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;

public final class MediaDescriptionCompat
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR;
  private final String a;
  private final CharSequence b;
  private final CharSequence c;
  private final CharSequence d;
  private final Bitmap e;
  private final Uri f;
  private final Bundle g;
  private final Uri h;
  private Object i;
  
  static
  {
    MediaDescriptionCompat.1 local1 = new android/support/v4/media/MediaDescriptionCompat$1;
    local1.<init>();
    CREATOR = local1;
  }
  
  MediaDescriptionCompat(Parcel paramParcel)
  {
    Object localObject = paramParcel.readString();
    this.a = ((String)localObject);
    localObject = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(paramParcel);
    this.b = ((CharSequence)localObject);
    localObject = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(paramParcel);
    this.c = ((CharSequence)localObject);
    localObject = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(paramParcel);
    this.d = ((CharSequence)localObject);
    localObject = (Bitmap)paramParcel.readParcelable(null);
    this.e = ((Bitmap)localObject);
    localObject = (Uri)paramParcel.readParcelable(null);
    this.f = ((Uri)localObject);
    localObject = paramParcel.readBundle();
    this.g = ((Bundle)localObject);
    localObject = (Uri)paramParcel.readParcelable(null);
    this.h = ((Uri)localObject);
  }
  
  MediaDescriptionCompat(String paramString, CharSequence paramCharSequence1, CharSequence paramCharSequence2, CharSequence paramCharSequence3, Bitmap paramBitmap, Uri paramUri1, Bundle paramBundle, Uri paramUri2)
  {
    this.a = paramString;
    this.b = paramCharSequence1;
    this.c = paramCharSequence2;
    this.d = paramCharSequence3;
    this.e = paramBitmap;
    this.f = paramUri1;
    this.g = paramBundle;
    this.h = paramUri2;
  }
  
  public static MediaDescriptionCompat a(Object paramObject)
  {
    int j = 0;
    MediaDescriptionCompat localMediaDescriptionCompat = null;
    MediaDescriptionCompat.a locala;
    Object localObject1;
    Bundle localBundle;
    Object localObject2;
    int m;
    if (paramObject != null)
    {
      int k = Build.VERSION.SDK_INT;
      int n = 21;
      if (k >= n)
      {
        locala = new android/support/v4/media/MediaDescriptionCompat$a;
        locala.<init>();
        localObject1 = a.a(paramObject);
        locala.a((String)localObject1);
        localObject1 = a.b(paramObject);
        locala.a((CharSequence)localObject1);
        localObject1 = a.c(paramObject);
        locala.b((CharSequence)localObject1);
        localObject1 = a.d(paramObject);
        locala.c((CharSequence)localObject1);
        localObject1 = a.e(paramObject);
        locala.a((Bitmap)localObject1);
        localObject1 = a.f(paramObject);
        locala.a((Uri)localObject1);
        localBundle = a.g(paramObject);
        if (localBundle != null) {
          break label205;
        }
        localObject2 = null;
        if (localObject2 == null) {
          break label242;
        }
        localObject1 = "android.support.v4.media.description.NULL_BUNDLE_FLAG";
        boolean bool = localBundle.containsKey((String)localObject1);
        if (!bool) {
          break label224;
        }
        m = localBundle.size();
        int i1 = 2;
        if (m != i1) {
          break label224;
        }
        m = 0;
        localObject1 = null;
        label171:
        locala.a((Bundle)localObject1);
        if (localObject2 == null) {
          break label249;
        }
        locala.b((Uri)localObject2);
      }
    }
    for (;;)
    {
      localMediaDescriptionCompat = locala.a();
      localMediaDescriptionCompat.i = paramObject;
      return localMediaDescriptionCompat;
      label205:
      localObject1 = (Uri)localBundle.getParcelable("android.support.v4.media.description.MEDIA_URI");
      localObject2 = localObject1;
      break;
      label224:
      localBundle.remove("android.support.v4.media.description.MEDIA_URI");
      localObject1 = "android.support.v4.media.description.NULL_BUNDLE_FLAG";
      localBundle.remove((String)localObject1);
      label242:
      localObject1 = localBundle;
      break label171;
      label249:
      m = Build.VERSION.SDK_INT;
      j = 23;
      if (m >= j)
      {
        localObject1 = b.h(paramObject);
        locala.b((Uri)localObject1);
      }
    }
  }
  
  public CharSequence a()
  {
    return this.b;
  }
  
  public CharSequence b()
  {
    return this.c;
  }
  
  public Bitmap c()
  {
    return this.e;
  }
  
  public Uri d()
  {
    return this.f;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public Object e()
  {
    int j = 23;
    Object localObject1 = this.i;
    int k;
    if (localObject1 == null)
    {
      k = Build.VERSION.SDK_INT;
      int m = 21;
      if (k >= m) {
        break label33;
      }
    }
    for (localObject1 = this.i;; localObject1 = this.i)
    {
      return localObject1;
      label33:
      Object localObject2 = a.a.a();
      localObject1 = this.a;
      a.a.a(localObject2, (String)localObject1);
      localObject1 = this.b;
      a.a.a(localObject2, (CharSequence)localObject1);
      localObject1 = this.c;
      a.a.b(localObject2, (CharSequence)localObject1);
      localObject1 = this.d;
      a.a.c(localObject2, (CharSequence)localObject1);
      localObject1 = this.e;
      a.a.a(localObject2, (Bitmap)localObject1);
      localObject1 = this.f;
      a.a.a(localObject2, (Uri)localObject1);
      localObject1 = this.g;
      int n = Build.VERSION.SDK_INT;
      if (n < j)
      {
        Object localObject3 = this.h;
        if (localObject3 != null)
        {
          if (localObject1 == null)
          {
            localObject1 = new android/os/Bundle;
            ((Bundle)localObject1).<init>();
            localObject3 = "android.support.v4.media.description.NULL_BUNDLE_FLAG";
            boolean bool = true;
            ((Bundle)localObject1).putBoolean((String)localObject3, bool);
          }
          localObject3 = "android.support.v4.media.description.MEDIA_URI";
          Uri localUri = this.h;
          ((Bundle)localObject1).putParcelable((String)localObject3, localUri);
        }
      }
      a.a.a(localObject2, (Bundle)localObject1);
      k = Build.VERSION.SDK_INT;
      if (k >= j)
      {
        localObject1 = this.h;
        b.a.b(localObject2, (Uri)localObject1);
      }
      localObject1 = a.a.a(localObject2);
      this.i = localObject1;
    }
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    CharSequence localCharSequence = this.b;
    localStringBuilder = localStringBuilder.append(localCharSequence).append(", ");
    localCharSequence = this.c;
    localStringBuilder = localStringBuilder.append(localCharSequence).append(", ");
    localCharSequence = this.d;
    return localCharSequence;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int j = Build.VERSION.SDK_INT;
    int k = 21;
    Object localObject;
    if (j < k)
    {
      localObject = this.a;
      paramParcel.writeString((String)localObject);
      TextUtils.writeToParcel(this.b, paramParcel, paramInt);
      TextUtils.writeToParcel(this.c, paramParcel, paramInt);
      TextUtils.writeToParcel(this.d, paramParcel, paramInt);
      localObject = this.e;
      paramParcel.writeParcelable((Parcelable)localObject, paramInt);
      localObject = this.f;
      paramParcel.writeParcelable((Parcelable)localObject, paramInt);
      localObject = this.g;
      paramParcel.writeBundle((Bundle)localObject);
      localObject = this.h;
      paramParcel.writeParcelable((Parcelable)localObject, paramInt);
    }
    for (;;)
    {
      return;
      localObject = e();
      a.a(localObject, paramParcel, paramInt);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\media\MediaDescriptionCompat.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */