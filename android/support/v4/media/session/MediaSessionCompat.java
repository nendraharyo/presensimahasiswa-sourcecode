package android.support.v4.media.session;

import android.support.v4.media.d;
import java.util.ArrayList;

public class MediaSessionCompat
{
  private final MediaSessionCompat.a a;
  private final ArrayList b;
  
  public void a(int paramInt)
  {
    this.a.a(paramInt);
  }
  
  public void a(d paramd)
  {
    if (paramd == null)
    {
      IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localIllegalArgumentException.<init>("volumeProvider may not be null!");
      throw localIllegalArgumentException;
    }
    this.a.a(paramd);
  }
  
  public void a(MediaSessionCompat.b paramb)
  {
    if (paramb == null)
    {
      IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localIllegalArgumentException.<init>("Listener may not be null");
      throw localIllegalArgumentException;
    }
    this.b.add(paramb);
  }
  
  public boolean a()
  {
    return this.a.a();
  }
  
  public MediaSessionCompat.Token b()
  {
    return this.a.b();
  }
  
  public void b(MediaSessionCompat.b paramb)
  {
    if (paramb == null)
    {
      IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localIllegalArgumentException.<init>("Listener may not be null");
      throw localIllegalArgumentException;
    }
    this.b.remove(paramb);
  }
  
  public Object c()
  {
    return this.a.c();
  }
  
  public Object d()
  {
    return this.a.d();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\media\session\MediaSessionCompat.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */