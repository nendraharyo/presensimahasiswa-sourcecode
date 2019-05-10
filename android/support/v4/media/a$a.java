package android.support.v4.media;

import android.graphics.Bitmap;
import android.media.MediaDescription.Builder;
import android.net.Uri;
import android.os.Bundle;

class a$a
{
  public static Object a()
  {
    MediaDescription.Builder localBuilder = new android/media/MediaDescription$Builder;
    localBuilder.<init>();
    return localBuilder;
  }
  
  public static Object a(Object paramObject)
  {
    return ((MediaDescription.Builder)paramObject).build();
  }
  
  public static void a(Object paramObject, Bitmap paramBitmap)
  {
    ((MediaDescription.Builder)paramObject).setIconBitmap(paramBitmap);
  }
  
  public static void a(Object paramObject, Uri paramUri)
  {
    ((MediaDescription.Builder)paramObject).setIconUri(paramUri);
  }
  
  public static void a(Object paramObject, Bundle paramBundle)
  {
    ((MediaDescription.Builder)paramObject).setExtras(paramBundle);
  }
  
  public static void a(Object paramObject, CharSequence paramCharSequence)
  {
    ((MediaDescription.Builder)paramObject).setTitle(paramCharSequence);
  }
  
  public static void a(Object paramObject, String paramString)
  {
    ((MediaDescription.Builder)paramObject).setMediaId(paramString);
  }
  
  public static void b(Object paramObject, CharSequence paramCharSequence)
  {
    ((MediaDescription.Builder)paramObject).setSubtitle(paramCharSequence);
  }
  
  public static void c(Object paramObject, CharSequence paramCharSequence)
  {
    ((MediaDescription.Builder)paramObject).setDescription(paramCharSequence);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\media\a$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */