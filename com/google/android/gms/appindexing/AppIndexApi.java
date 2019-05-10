package com.google.android.gms.appindexing;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import java.util.List;

public abstract interface AppIndexApi
{
  public abstract AppIndexApi.ActionResult action(GoogleApiClient paramGoogleApiClient, Action paramAction);
  
  public abstract PendingResult end(GoogleApiClient paramGoogleApiClient, Action paramAction);
  
  public abstract PendingResult start(GoogleApiClient paramGoogleApiClient, Action paramAction);
  
  public abstract PendingResult view(GoogleApiClient paramGoogleApiClient, Activity paramActivity, Intent paramIntent, String paramString, Uri paramUri, List paramList);
  
  public abstract PendingResult view(GoogleApiClient paramGoogleApiClient, Activity paramActivity, Uri paramUri1, String paramString, Uri paramUri2, List paramList);
  
  public abstract PendingResult viewEnd(GoogleApiClient paramGoogleApiClient, Activity paramActivity, Intent paramIntent);
  
  public abstract PendingResult viewEnd(GoogleApiClient paramGoogleApiClient, Activity paramActivity, Uri paramUri);
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\appindexing\AppIndexApi.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */