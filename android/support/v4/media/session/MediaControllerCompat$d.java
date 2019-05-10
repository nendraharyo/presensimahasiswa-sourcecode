package android.support.v4.media.session;

import android.content.Context;

class MediaControllerCompat$d
  extends MediaControllerCompat.c
{
  public MediaControllerCompat$d(Context paramContext, MediaSessionCompat.Token paramToken)
  {
    super(paramContext, paramToken);
  }
  
  public MediaControllerCompat.g a()
  {
    Object localObject1 = this.a;
    Object localObject2 = c.a(localObject1);
    if (localObject2 != null)
    {
      localObject1 = new android/support/v4/media/session/MediaControllerCompat$j;
      ((MediaControllerCompat.j)localObject1).<init>(localObject2);
    }
    for (;;)
    {
      return (MediaControllerCompat.g)localObject1;
      localObject1 = null;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\media\session\MediaControllerCompat$d.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */