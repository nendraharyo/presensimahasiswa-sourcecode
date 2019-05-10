package android.support.v7.app;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.h;
import android.support.v4.app.i;

public class MediaRouteControllerDialogFragment
  extends h
{
  public MediaRouteControllerDialogFragment()
  {
    setCancelable(true);
  }
  
  public MediaRouteControllerDialog onCreateControllerDialog(Context paramContext, Bundle paramBundle)
  {
    MediaRouteControllerDialog localMediaRouteControllerDialog = new android/support/v7/app/MediaRouteControllerDialog;
    localMediaRouteControllerDialog.<init>(paramContext);
    return localMediaRouteControllerDialog;
  }
  
  public Dialog onCreateDialog(Bundle paramBundle)
  {
    i locali = getActivity();
    return onCreateControllerDialog(locali, paramBundle);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\app\MediaRouteControllerDialogFragment.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */