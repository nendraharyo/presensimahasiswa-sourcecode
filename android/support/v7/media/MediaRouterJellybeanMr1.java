package android.support.v7.media;

final class MediaRouterJellybeanMr1
{
  private static final String TAG = "MediaRouterJellybeanMr1";
  
  public static Object createCallback(MediaRouterJellybeanMr1.Callback paramCallback)
  {
    MediaRouterJellybeanMr1.CallbackProxy localCallbackProxy = new android/support/v7/media/MediaRouterJellybeanMr1$CallbackProxy;
    localCallbackProxy.<init>(paramCallback);
    return localCallbackProxy;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\media\MediaRouterJellybeanMr1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */