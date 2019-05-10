package android.support.v4.media;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.v4.h.a;
import android.text.TextUtils;
import android.util.Log;

public final class MediaMetadataCompat
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR;
  static final a a;
  private static final String[] c;
  private static final String[] d;
  private static final String[] e;
  final Bundle b;
  private Object f;
  private MediaDescriptionCompat g;
  
  static
  {
    int i = 3;
    int j = 2;
    int k = 1;
    Object localObject = new android/support/v4/h/a;
    ((a)localObject).<init>();
    a = (a)localObject;
    localObject = a;
    Integer localInteger = Integer.valueOf(k);
    ((a)localObject).put("android.media.metadata.TITLE", localInteger);
    localObject = a;
    localInteger = Integer.valueOf(k);
    ((a)localObject).put("android.media.metadata.ARTIST", localInteger);
    localObject = a;
    localInteger = Integer.valueOf(0);
    ((a)localObject).put("android.media.metadata.DURATION", localInteger);
    localObject = a;
    localInteger = Integer.valueOf(k);
    ((a)localObject).put("android.media.metadata.ALBUM", localInteger);
    localObject = a;
    localInteger = Integer.valueOf(k);
    ((a)localObject).put("android.media.metadata.AUTHOR", localInteger);
    localObject = a;
    localInteger = Integer.valueOf(k);
    ((a)localObject).put("android.media.metadata.WRITER", localInteger);
    localObject = a;
    localInteger = Integer.valueOf(k);
    ((a)localObject).put("android.media.metadata.COMPOSER", localInteger);
    localObject = a;
    localInteger = Integer.valueOf(k);
    ((a)localObject).put("android.media.metadata.COMPILATION", localInteger);
    localObject = a;
    localInteger = Integer.valueOf(k);
    ((a)localObject).put("android.media.metadata.DATE", localInteger);
    localObject = a;
    localInteger = Integer.valueOf(0);
    ((a)localObject).put("android.media.metadata.YEAR", localInteger);
    localObject = a;
    localInteger = Integer.valueOf(k);
    ((a)localObject).put("android.media.metadata.GENRE", localInteger);
    localObject = a;
    localInteger = Integer.valueOf(0);
    ((a)localObject).put("android.media.metadata.TRACK_NUMBER", localInteger);
    localObject = a;
    localInteger = Integer.valueOf(0);
    ((a)localObject).put("android.media.metadata.NUM_TRACKS", localInteger);
    localObject = a;
    localInteger = Integer.valueOf(0);
    ((a)localObject).put("android.media.metadata.DISC_NUMBER", localInteger);
    localObject = a;
    localInteger = Integer.valueOf(k);
    ((a)localObject).put("android.media.metadata.ALBUM_ARTIST", localInteger);
    localObject = a;
    localInteger = Integer.valueOf(j);
    ((a)localObject).put("android.media.metadata.ART", localInteger);
    localObject = a;
    localInteger = Integer.valueOf(k);
    ((a)localObject).put("android.media.metadata.ART_URI", localInteger);
    localObject = a;
    localInteger = Integer.valueOf(j);
    ((a)localObject).put("android.media.metadata.ALBUM_ART", localInteger);
    localObject = a;
    localInteger = Integer.valueOf(k);
    ((a)localObject).put("android.media.metadata.ALBUM_ART_URI", localInteger);
    localObject = a;
    localInteger = Integer.valueOf(i);
    ((a)localObject).put("android.media.metadata.USER_RATING", localInteger);
    localObject = a;
    localInteger = Integer.valueOf(i);
    ((a)localObject).put("android.media.metadata.RATING", localInteger);
    localObject = a;
    localInteger = Integer.valueOf(k);
    ((a)localObject).put("android.media.metadata.DISPLAY_TITLE", localInteger);
    localObject = a;
    localInteger = Integer.valueOf(k);
    ((a)localObject).put("android.media.metadata.DISPLAY_SUBTITLE", localInteger);
    localObject = a;
    localInteger = Integer.valueOf(k);
    ((a)localObject).put("android.media.metadata.DISPLAY_DESCRIPTION", localInteger);
    localObject = a;
    localInteger = Integer.valueOf(j);
    ((a)localObject).put("android.media.metadata.DISPLAY_ICON", localInteger);
    localObject = a;
    localInteger = Integer.valueOf(k);
    ((a)localObject).put("android.media.metadata.DISPLAY_ICON_URI", localInteger);
    localObject = a;
    localInteger = Integer.valueOf(k);
    ((a)localObject).put("android.media.metadata.MEDIA_ID", localInteger);
    localObject = a;
    localInteger = Integer.valueOf(0);
    ((a)localObject).put("android.media.metadata.BT_FOLDER_TYPE", localInteger);
    localObject = a;
    localInteger = Integer.valueOf(k);
    ((a)localObject).put("android.media.metadata.MEDIA_URI", localInteger);
    localObject = a;
    localInteger = Integer.valueOf(0);
    ((a)localObject).put("android.media.metadata.ADVERTISEMENT", localInteger);
    localObject = a;
    localInteger = Integer.valueOf(0);
    ((a)localObject).put("android.media.metadata.DOWNLOAD_STATUS", localInteger);
    localObject = new String[7];
    localObject[0] = "android.media.metadata.TITLE";
    localObject[k] = "android.media.metadata.ARTIST";
    localObject[j] = "android.media.metadata.ALBUM";
    localObject[i] = "android.media.metadata.ALBUM_ARTIST";
    localObject[4] = "android.media.metadata.WRITER";
    localObject[5] = "android.media.metadata.AUTHOR";
    localObject[6] = "android.media.metadata.COMPOSER";
    c = (String[])localObject;
    localObject = new String[i];
    localObject[0] = "android.media.metadata.DISPLAY_ICON";
    localObject[k] = "android.media.metadata.ART";
    localObject[j] = "android.media.metadata.ALBUM_ART";
    d = (String[])localObject;
    localObject = new String[i];
    localObject[0] = "android.media.metadata.DISPLAY_ICON_URI";
    localObject[k] = "android.media.metadata.ART_URI";
    localObject[j] = "android.media.metadata.ALBUM_ART_URI";
    e = (String[])localObject;
    localObject = new android/support/v4/media/MediaMetadataCompat$1;
    ((MediaMetadataCompat.1)localObject).<init>();
    CREATOR = (Parcelable.Creator)localObject;
  }
  
  MediaMetadataCompat(Parcel paramParcel)
  {
    Bundle localBundle = paramParcel.readBundle();
    this.b = localBundle;
    localBundle = this.b;
    ClassLoader localClassLoader = MediaMetadataCompat.class.getClassLoader();
    localBundle.setClassLoader(localClassLoader);
  }
  
  public static MediaMetadataCompat a(Object paramObject)
  {
    int i;
    MediaMetadataCompat localMediaMetadataCompat;
    if (paramObject != null)
    {
      i = Build.VERSION.SDK_INT;
      int j = 21;
      if (i >= j)
      {
        Parcel localParcel = Parcel.obtain();
        c.a(paramObject, localParcel, 0);
        localParcel.setDataPosition(0);
        localMediaMetadataCompat = (MediaMetadataCompat)CREATOR.createFromParcel(localParcel);
        localParcel.recycle();
        localMediaMetadataCompat.f = paramObject;
      }
    }
    for (;;)
    {
      return localMediaMetadataCompat;
      i = 0;
      localMediaMetadataCompat = null;
    }
  }
  
  public MediaDescriptionCompat a()
  {
    int i = 2;
    int j = 1;
    Uri localUri = null;
    boolean bool1 = false;
    Object localObject1 = null;
    Object localObject2 = this.g;
    if (localObject2 != null)
    {
      localObject2 = this.g;
      return (MediaDescriptionCompat)localObject2;
    }
    String str = b("android.media.metadata.MEDIA_ID");
    int k = 3;
    CharSequence[] arrayOfCharSequence = new CharSequence[k];
    localObject2 = a("android.media.metadata.DISPLAY_TITLE");
    boolean bool3 = TextUtils.isEmpty((CharSequence)localObject2);
    if (!bool3)
    {
      arrayOfCharSequence[0] = localObject2;
      localObject2 = a("android.media.metadata.DISPLAY_SUBTITLE");
      arrayOfCharSequence[j] = localObject2;
      localObject2 = a("android.media.metadata.DISPLAY_DESCRIPTION");
      arrayOfCharSequence[i] = localObject2;
    }
    Object localObject3;
    label152:
    label158:
    int i1;
    label210:
    label481:
    do
    {
      do
      {
        k = 0;
        localObject2 = null;
        localObject3 = d;
        n = localObject3.length;
        if (k >= n) {
          break label599;
        }
        localObject3 = d[k];
        localObject3 = d((String)localObject3);
        if (localObject3 == null) {
          break label572;
        }
        localObject2 = localObject3;
        n = 0;
        localObject3 = null;
        Object localObject4 = e;
        i1 = localObject4.length;
        if (n >= i1) {
          break label590;
        }
        localObject4 = e[n];
        localObject4 = b((String)localObject4);
        boolean bool4 = TextUtils.isEmpty((CharSequence)localObject4);
        if (bool4) {
          break label581;
        }
        localObject3 = Uri.parse((String)localObject4);
        localObject4 = b("android.media.metadata.MEDIA_URI");
        bool4 = TextUtils.isEmpty((CharSequence)localObject4);
        if (!bool4) {
          localUri = Uri.parse((String)localObject4);
        }
        localObject4 = new android/support/v4/media/MediaDescriptionCompat$a;
        ((MediaDescriptionCompat.a)localObject4).<init>();
        ((MediaDescriptionCompat.a)localObject4).a(str);
        localObject1 = arrayOfCharSequence[0];
        ((MediaDescriptionCompat.a)localObject4).a((CharSequence)localObject1);
        localObject1 = arrayOfCharSequence[j];
        ((MediaDescriptionCompat.a)localObject4).b((CharSequence)localObject1);
        localObject1 = arrayOfCharSequence[i];
        ((MediaDescriptionCompat.a)localObject4).c((CharSequence)localObject1);
        ((MediaDescriptionCompat.a)localObject4).a((Bitmap)localObject2);
        ((MediaDescriptionCompat.a)localObject4).a((Uri)localObject3);
        ((MediaDescriptionCompat.a)localObject4).b(localUri);
        localObject2 = new android/os/Bundle;
        ((Bundle)localObject2).<init>();
        localObject1 = this.b;
        localObject3 = "android.media.metadata.BT_FOLDER_TYPE";
        bool1 = ((Bundle)localObject1).containsKey((String)localObject3);
        long l;
        if (bool1)
        {
          localObject1 = "android.media.extra.BT_FOLDER_TYPE";
          localObject3 = "android.media.metadata.BT_FOLDER_TYPE";
          l = c((String)localObject3);
          ((Bundle)localObject2).putLong((String)localObject1, l);
        }
        localObject1 = this.b;
        localObject3 = "android.media.metadata.DOWNLOAD_STATUS";
        bool1 = ((Bundle)localObject1).containsKey((String)localObject3);
        if (bool1)
        {
          localObject1 = "android.media.extra.DOWNLOAD_STATUS";
          localObject3 = "android.media.metadata.DOWNLOAD_STATUS";
          l = c((String)localObject3);
          ((Bundle)localObject2).putLong((String)localObject1, l);
        }
        bool1 = ((Bundle)localObject2).isEmpty();
        if (!bool1) {
          ((MediaDescriptionCompat.a)localObject4).a((Bundle)localObject2);
        }
        localObject2 = ((MediaDescriptionCompat.a)localObject4).a();
        this.g = ((MediaDescriptionCompat)localObject2);
        localObject2 = this.g;
        break;
        k = 0;
        localObject2 = null;
        i1 = 0;
        localObject4 = null;
        n = arrayOfCharSequence.length;
      } while (i1 >= n);
      localObject3 = c;
      n = localObject3.length;
    } while (k >= n);
    Object localObject5 = c;
    int n = k + 1;
    localObject2 = localObject5[k];
    localObject5 = a((String)localObject2);
    boolean bool2 = TextUtils.isEmpty((CharSequence)localObject5);
    int m;
    if (!bool2)
    {
      m = i1 + 1;
      arrayOfCharSequence[i1] = localObject5;
    }
    for (;;)
    {
      i1 = m;
      m = n;
      break label481;
      label572:
      m += 1;
      break;
      label581:
      n += 1;
      break label158;
      label590:
      n = 0;
      localObject3 = null;
      break label210;
      label599:
      m = 0;
      localObject2 = null;
      break label152;
      m = i1;
    }
  }
  
  public CharSequence a(String paramString)
  {
    return this.b.getCharSequence(paramString);
  }
  
  public String b(String paramString)
  {
    Object localObject = this.b.getCharSequence(paramString);
    if (localObject != null) {}
    for (localObject = ((CharSequence)localObject).toString();; localObject = null) {
      return (String)localObject;
    }
  }
  
  public long c(String paramString)
  {
    return this.b.getLong(paramString, 0L);
  }
  
  public Bitmap d(String paramString)
  {
    try
    {
      localObject1 = this.b;
      localObject1 = ((Bundle)localObject1).getParcelable(paramString);
      localObject1 = (Bitmap)localObject1;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        Object localObject1;
        String str1 = "MediaMetadata";
        String str2 = "Failed to retrieve a key as Bitmap.";
        Log.w(str1, str2, localException);
        Object localObject2 = null;
      }
    }
    return (Bitmap)localObject1;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    Bundle localBundle = this.b;
    paramParcel.writeBundle(localBundle);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\media\MediaMetadataCompat.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */