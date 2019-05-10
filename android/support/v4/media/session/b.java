package android.support.v4.media.session;

import android.app.PendingIntent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IInterface;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.view.KeyEvent;
import java.util.List;

public abstract interface b
  extends IInterface
{
  public abstract void a(int paramInt);
  
  public abstract void a(int paramInt1, int paramInt2, String paramString);
  
  public abstract void a(long paramLong);
  
  public abstract void a(Uri paramUri, Bundle paramBundle);
  
  public abstract void a(MediaDescriptionCompat paramMediaDescriptionCompat);
  
  public abstract void a(MediaDescriptionCompat paramMediaDescriptionCompat, int paramInt);
  
  public abstract void a(RatingCompat paramRatingCompat);
  
  public abstract void a(RatingCompat paramRatingCompat, Bundle paramBundle);
  
  public abstract void a(a parama);
  
  public abstract void a(String paramString, Bundle paramBundle);
  
  public abstract void a(String paramString, Bundle paramBundle, MediaSessionCompat.ResultReceiverWrapper paramResultReceiverWrapper);
  
  public abstract void a(boolean paramBoolean);
  
  public abstract boolean a();
  
  public abstract boolean a(KeyEvent paramKeyEvent);
  
  public abstract String b();
  
  public abstract void b(int paramInt);
  
  public abstract void b(int paramInt1, int paramInt2, String paramString);
  
  public abstract void b(long paramLong);
  
  public abstract void b(Uri paramUri, Bundle paramBundle);
  
  public abstract void b(MediaDescriptionCompat paramMediaDescriptionCompat);
  
  public abstract void b(a parama);
  
  public abstract void b(String paramString, Bundle paramBundle);
  
  public abstract void b(boolean paramBoolean);
  
  public abstract String c();
  
  public abstract void c(int paramInt);
  
  public abstract void c(String paramString, Bundle paramBundle);
  
  public abstract PendingIntent d();
  
  public abstract void d(String paramString, Bundle paramBundle);
  
  public abstract long e();
  
  public abstract void e(String paramString, Bundle paramBundle);
  
  public abstract ParcelableVolumeInfo f();
  
  public abstract MediaMetadataCompat g();
  
  public abstract PlaybackStateCompat h();
  
  public abstract List i();
  
  public abstract CharSequence j();
  
  public abstract Bundle k();
  
  public abstract int l();
  
  public abstract boolean m();
  
  public abstract int n();
  
  public abstract boolean o();
  
  public abstract int p();
  
  public abstract void q();
  
  public abstract void r();
  
  public abstract void s();
  
  public abstract void t();
  
  public abstract void u();
  
  public abstract void v();
  
  public abstract void w();
  
  public abstract void x();
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\media\session\b.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */