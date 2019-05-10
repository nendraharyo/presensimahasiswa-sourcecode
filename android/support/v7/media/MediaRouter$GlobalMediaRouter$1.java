package android.support.v7.media;

import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.MediaSessionCompat.b;

class MediaRouter$GlobalMediaRouter$1
  implements MediaSessionCompat.b
{
  MediaRouter$GlobalMediaRouter$1(MediaRouter.GlobalMediaRouter paramGlobalMediaRouter) {}
  
  public void onActiveChanged()
  {
    Object localObject1 = MediaRouter.GlobalMediaRouter.access$300(this.this$0);
    Object localObject2;
    if (localObject1 != null)
    {
      localObject1 = MediaRouter.GlobalMediaRouter.access$300(this.this$0);
      boolean bool = ((MediaSessionCompat)localObject1).a();
      if (!bool) {
        break label51;
      }
      localObject1 = this.this$0;
      localObject2 = MediaRouter.GlobalMediaRouter.access$300(this.this$0).d();
      ((MediaRouter.GlobalMediaRouter)localObject1).addRemoteControlClient(localObject2);
    }
    for (;;)
    {
      return;
      label51:
      localObject1 = this.this$0;
      localObject2 = MediaRouter.GlobalMediaRouter.access$300(this.this$0).d();
      ((MediaRouter.GlobalMediaRouter)localObject1).removeRemoteControlClient(localObject2);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\media\MediaRouter$GlobalMediaRouter$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */