package android.support.v4.media;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;

public final class MediaDescriptionCompat$a
{
  private String a;
  private CharSequence b;
  private CharSequence c;
  private CharSequence d;
  private Bitmap e;
  private Uri f;
  private Bundle g;
  private Uri h;
  
  public a a(Bitmap paramBitmap)
  {
    this.e = paramBitmap;
    return this;
  }
  
  public a a(Uri paramUri)
  {
    this.f = paramUri;
    return this;
  }
  
  public a a(Bundle paramBundle)
  {
    this.g = paramBundle;
    return this;
  }
  
  public a a(CharSequence paramCharSequence)
  {
    this.b = paramCharSequence;
    return this;
  }
  
  public a a(String paramString)
  {
    this.a = paramString;
    return this;
  }
  
  public MediaDescriptionCompat a()
  {
    MediaDescriptionCompat localMediaDescriptionCompat = new android/support/v4/media/MediaDescriptionCompat;
    String str = this.a;
    CharSequence localCharSequence1 = this.b;
    CharSequence localCharSequence2 = this.c;
    CharSequence localCharSequence3 = this.d;
    Bitmap localBitmap = this.e;
    Uri localUri1 = this.f;
    Bundle localBundle = this.g;
    Uri localUri2 = this.h;
    localMediaDescriptionCompat.<init>(str, localCharSequence1, localCharSequence2, localCharSequence3, localBitmap, localUri1, localBundle, localUri2);
    return localMediaDescriptionCompat;
  }
  
  public a b(Uri paramUri)
  {
    this.h = paramUri;
    return this;
  }
  
  public a b(CharSequence paramCharSequence)
  {
    this.c = paramCharSequence;
    return this;
  }
  
  public a c(CharSequence paramCharSequence)
  {
    this.d = paramCharSequence;
    return this;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\media\MediaDescriptionCompat$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */