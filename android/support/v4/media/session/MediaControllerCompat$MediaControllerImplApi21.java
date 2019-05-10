package android.support.v4.media.session;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.support.v4.media.MediaMetadataCompat;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

class MediaControllerCompat$MediaControllerImplApi21
  implements MediaControllerCompat.b
{
  protected final Object a;
  private final List b;
  private b c;
  private HashMap d;
  
  public MediaControllerCompat$MediaControllerImplApi21(Context paramContext, MediaSessionCompat.Token paramToken)
  {
    Object localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    this.b = ((List)localObject);
    localObject = new java/util/HashMap;
    ((HashMap)localObject).<init>();
    this.d = ((HashMap)localObject);
    localObject = paramToken.a();
    localObject = c.a(paramContext, localObject);
    this.a = localObject;
    localObject = this.a;
    if (localObject == null)
    {
      localObject = new android/os/RemoteException;
      ((RemoteException)localObject).<init>();
      throw ((Throwable)localObject);
    }
    localObject = paramToken.b();
    this.c = ((b)localObject);
    localObject = this.c;
    if (localObject == null) {
      d();
    }
  }
  
  private void d()
  {
    MediaControllerCompat.MediaControllerImplApi21.ExtraBinderRequestResultReceiver localExtraBinderRequestResultReceiver = new android/support/v4/media/session/MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver;
    Handler localHandler = new android/os/Handler;
    localHandler.<init>();
    localExtraBinderRequestResultReceiver.<init>(this, localHandler);
    a("android.support.v4.media.session.command.GET_EXTRA_BINDER", null, localExtraBinderRequestResultReceiver);
  }
  
  private void e()
  {
    Object localObject1 = this.c;
    if (localObject1 == null) {}
    for (;;)
    {
      return;
      Object localObject3;
      Object localObject4;
      Object localObject5;
      synchronized (this.b)
      {
        localObject1 = this.b;
        localObject3 = ((List)localObject1).iterator();
        boolean bool1 = ((Iterator)localObject3).hasNext();
        if (bool1)
        {
          localObject1 = ((Iterator)localObject3).next();
          localObject1 = (MediaControllerCompat.a)localObject1;
          localObject4 = new android/support/v4/media/session/MediaControllerCompat$MediaControllerImplApi21$a;
          ((MediaControllerCompat.MediaControllerImplApi21.a)localObject4).<init>((MediaControllerCompat.a)localObject1);
          localObject5 = this.d;
          ((HashMap)localObject5).put(localObject1, localObject4);
          boolean bool2 = true;
          ((MediaControllerCompat.a)localObject1).mHasExtraCallback = bool2;
        }
      }
      List localList1 = this.b;
      localList1.clear();
    }
  }
  
  public MediaControllerCompat.g a()
  {
    Object localObject1 = this.a;
    Object localObject2 = c.a(localObject1);
    if (localObject2 != null)
    {
      localObject1 = new android/support/v4/media/session/MediaControllerCompat$h;
      ((MediaControllerCompat.h)localObject1).<init>(localObject2);
    }
    for (;;)
    {
      return (MediaControllerCompat.g)localObject1;
      localObject1 = null;
    }
  }
  
  public final void a(MediaControllerCompat.a parama)
  {
    Object localObject1 = this.a;
    ??? = MediaControllerCompat.a.access$000(parama);
    c.a(localObject1, ???);
    localObject1 = this.c;
    if (localObject1 != null) {}
    for (;;)
    {
      try
      {
        localObject1 = this.d;
        localObject1 = ((HashMap)localObject1).remove(parama);
        localObject1 = (MediaControllerCompat.MediaControllerImplApi21.a)localObject1;
        if (localObject1 != null)
        {
          ??? = null;
          parama.mHasExtraCallback = false;
          ??? = this.c;
          ((b)???).b((a)localObject1);
        }
        return;
      }
      catch (RemoteException localRemoteException)
      {
        ??? = "MediaControllerCompat";
        String str = "Dead object in unregisterCallback.";
        Log.e((String)???, str, localRemoteException);
        continue;
      }
      synchronized (this.b)
      {
        List localList = this.b;
        localList.remove(parama);
      }
    }
  }
  
  public final void a(MediaControllerCompat.a parama, Handler paramHandler)
  {
    Object localObject1 = this.a;
    Object localObject3 = MediaControllerCompat.a.access$000(parama);
    c.a(localObject1, localObject3, paramHandler);
    localObject1 = this.c;
    if (localObject1 != null)
    {
      localObject1 = new android/support/v4/media/session/MediaControllerCompat$MediaControllerImplApi21$a;
      ((MediaControllerCompat.MediaControllerImplApi21.a)localObject1).<init>(parama);
      localObject3 = this.d;
      ((HashMap)localObject3).put(parama, localObject1);
      boolean bool = true;
      parama.mHasExtraCallback = bool;
    }
    for (;;)
    {
      try
      {
        localObject3 = this.c;
        ((b)localObject3).a((a)localObject1);
        return;
      }
      catch (RemoteException localRemoteException)
      {
        localObject3 = "MediaControllerCompat";
        String str = "Dead object in registerCallback.";
        Log.e((String)localObject3, str, localRemoteException);
        continue;
      }
      localObject3 = this.b;
      List localList = null;
      try
      {
        parama.mHasExtraCallback = false;
        localList = this.b;
        localList.add(parama);
      }
      finally {}
    }
  }
  
  public void a(String paramString, Bundle paramBundle, ResultReceiver paramResultReceiver)
  {
    c.a(this.a, paramString, paramBundle, paramResultReceiver);
  }
  
  public PlaybackStateCompat b()
  {
    Object localObject1 = this.c;
    if (localObject1 != null) {}
    for (;;)
    {
      try
      {
        localObject1 = this.c;
        localObject1 = ((b)localObject1).h();
        return (PlaybackStateCompat)localObject1;
      }
      catch (RemoteException localRemoteException)
      {
        String str1 = "MediaControllerCompat";
        String str2 = "Dead object in getPlaybackState.";
        Log.e(str1, str2, localRemoteException);
      }
      Object localObject2 = c.b(this.a);
      if (localObject2 != null) {
        localObject2 = PlaybackStateCompat.a(localObject2);
      } else {
        localObject2 = null;
      }
    }
  }
  
  public MediaMetadataCompat c()
  {
    Object localObject = c.c(this.a);
    if (localObject != null) {}
    for (localObject = MediaMetadataCompat.a(localObject);; localObject = null) {
      return (MediaMetadataCompat)localObject;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\media\session\MediaControllerCompat$MediaControllerImplApi21.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */