package android.support.v7.app;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.h;
import android.support.v7.media.MediaRouteSelector;

public class MediaRouteChooserDialogFragment
  extends h
{
  private final String ARGUMENT_SELECTOR = "selector";
  private MediaRouteSelector mSelector;
  
  public MediaRouteChooserDialogFragment()
  {
    setCancelable(true);
  }
  
  private void ensureRouteSelector()
  {
    Object localObject = this.mSelector;
    if (localObject == null)
    {
      localObject = getArguments();
      if (localObject != null)
      {
        String str = "selector";
        localObject = MediaRouteSelector.fromBundle(((Bundle)localObject).getBundle(str));
        this.mSelector = ((MediaRouteSelector)localObject);
      }
      localObject = this.mSelector;
      if (localObject == null)
      {
        localObject = MediaRouteSelector.EMPTY;
        this.mSelector = ((MediaRouteSelector)localObject);
      }
    }
  }
  
  public MediaRouteSelector getRouteSelector()
  {
    ensureRouteSelector();
    return this.mSelector;
  }
  
  public MediaRouteChooserDialog onCreateChooserDialog(Context paramContext, Bundle paramBundle)
  {
    MediaRouteChooserDialog localMediaRouteChooserDialog = new android/support/v7/app/MediaRouteChooserDialog;
    localMediaRouteChooserDialog.<init>(paramContext);
    return localMediaRouteChooserDialog;
  }
  
  public Dialog onCreateDialog(Bundle paramBundle)
  {
    Object localObject = getActivity();
    localObject = onCreateChooserDialog((Context)localObject, paramBundle);
    MediaRouteSelector localMediaRouteSelector = getRouteSelector();
    ((MediaRouteChooserDialog)localObject).setRouteSelector(localMediaRouteSelector);
    return (Dialog)localObject;
  }
  
  public void setRouteSelector(MediaRouteSelector paramMediaRouteSelector)
  {
    if (paramMediaRouteSelector == null)
    {
      localObject = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject).<init>("selector must not be null");
      throw ((Throwable)localObject);
    }
    ensureRouteSelector();
    Object localObject = this.mSelector;
    boolean bool = ((MediaRouteSelector)localObject).equals(paramMediaRouteSelector);
    if (!bool)
    {
      this.mSelector = paramMediaRouteSelector;
      localObject = getArguments();
      if (localObject == null)
      {
        localObject = new android/os/Bundle;
        ((Bundle)localObject).<init>();
      }
      String str = "selector";
      Bundle localBundle = paramMediaRouteSelector.asBundle();
      ((Bundle)localObject).putBundle(str, localBundle);
      setArguments((Bundle)localObject);
      localObject = (MediaRouteChooserDialog)getDialog();
      if (localObject != null) {
        ((MediaRouteChooserDialog)localObject).setRouteSelector(paramMediaRouteSelector);
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\app\MediaRouteChooserDialogFragment.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */