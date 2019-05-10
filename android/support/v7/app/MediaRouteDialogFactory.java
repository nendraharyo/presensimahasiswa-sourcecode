package android.support.v7.app;

public class MediaRouteDialogFactory
{
  private static final MediaRouteDialogFactory sDefault;
  
  static
  {
    MediaRouteDialogFactory localMediaRouteDialogFactory = new android/support/v7/app/MediaRouteDialogFactory;
    localMediaRouteDialogFactory.<init>();
    sDefault = localMediaRouteDialogFactory;
  }
  
  public static MediaRouteDialogFactory getDefault()
  {
    return sDefault;
  }
  
  public MediaRouteChooserDialogFragment onCreateChooserDialogFragment()
  {
    MediaRouteChooserDialogFragment localMediaRouteChooserDialogFragment = new android/support/v7/app/MediaRouteChooserDialogFragment;
    localMediaRouteChooserDialogFragment.<init>();
    return localMediaRouteChooserDialogFragment;
  }
  
  public MediaRouteControllerDialogFragment onCreateControllerDialogFragment()
  {
    MediaRouteControllerDialogFragment localMediaRouteControllerDialogFragment = new android/support/v7/app/MediaRouteControllerDialogFragment;
    localMediaRouteControllerDialogFragment.<init>();
    return localMediaRouteControllerDialogFragment;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\app\MediaRouteDialogFactory.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */