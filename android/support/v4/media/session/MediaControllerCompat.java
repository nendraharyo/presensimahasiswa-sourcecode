package android.support.v4.media.session;

import android.content.Context;
import android.os.Build.VERSION;
import android.os.Handler;
import android.support.v4.media.MediaMetadataCompat;
import java.util.HashSet;

public final class MediaControllerCompat
{
  private final MediaControllerCompat.b a;
  private final MediaSessionCompat.Token b;
  private final HashSet c;
  
  public MediaControllerCompat(Context paramContext, MediaSessionCompat.Token paramToken)
  {
    Object localObject = new java/util/HashSet;
    ((HashSet)localObject).<init>();
    this.c = ((HashSet)localObject);
    if (paramToken == null)
    {
      localObject = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject).<init>("sessionToken must not be null");
      throw ((Throwable)localObject);
    }
    this.b = paramToken;
    int i = Build.VERSION.SDK_INT;
    int j = 24;
    if (i >= j)
    {
      localObject = new android/support/v4/media/session/MediaControllerCompat$d;
      ((MediaControllerCompat.d)localObject).<init>(paramContext, paramToken);
      this.a = ((MediaControllerCompat.b)localObject);
    }
    for (;;)
    {
      return;
      i = Build.VERSION.SDK_INT;
      j = 23;
      if (i >= j)
      {
        localObject = new android/support/v4/media/session/MediaControllerCompat$c;
        ((MediaControllerCompat.c)localObject).<init>(paramContext, paramToken);
        this.a = ((MediaControllerCompat.b)localObject);
      }
      else
      {
        i = Build.VERSION.SDK_INT;
        j = 21;
        if (i >= j)
        {
          localObject = new android/support/v4/media/session/MediaControllerCompat$MediaControllerImplApi21;
          ((MediaControllerCompat.MediaControllerImplApi21)localObject).<init>(paramContext, paramToken);
          this.a = ((MediaControllerCompat.b)localObject);
        }
        else
        {
          localObject = new android/support/v4/media/session/MediaControllerCompat$e;
          MediaSessionCompat.Token localToken = this.b;
          ((MediaControllerCompat.e)localObject).<init>(localToken);
          this.a = ((MediaControllerCompat.b)localObject);
        }
      }
    }
  }
  
  public MediaControllerCompat.g a()
  {
    return this.a.a();
  }
  
  public void a(MediaControllerCompat.a parama)
  {
    a(parama, null);
  }
  
  public void a(MediaControllerCompat.a parama, Handler paramHandler)
  {
    if (parama == null)
    {
      IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localIllegalArgumentException.<init>("callback must not be null");
      throw localIllegalArgumentException;
    }
    if (paramHandler == null)
    {
      paramHandler = new android/os/Handler;
      paramHandler.<init>();
    }
    parama.setHandler(paramHandler);
    this.a.a(parama, paramHandler);
    this.c.add(parama);
  }
  
  public PlaybackStateCompat b()
  {
    return this.a.b();
  }
  
  public void b(MediaControllerCompat.a parama)
  {
    Object localObject1;
    if (parama == null)
    {
      localObject1 = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject1).<init>("callback must not be null");
      throw ((Throwable)localObject1);
    }
    try
    {
      localObject1 = this.c;
      ((HashSet)localObject1).remove(parama);
      localObject1 = this.a;
      ((MediaControllerCompat.b)localObject1).a(parama);
      return;
    }
    finally
    {
      parama.setHandler(null);
    }
  }
  
  public MediaMetadataCompat c()
  {
    return this.a.c();
  }
  
  public MediaSessionCompat.Token d()
  {
    return this.b;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\media\session\MediaControllerCompat.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */