package com.google.android.gms.plus;

import android.net.Uri;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.plus.model.moments.Moment;

public abstract interface Moments
{
  public abstract PendingResult load(GoogleApiClient paramGoogleApiClient);
  
  public abstract PendingResult load(GoogleApiClient paramGoogleApiClient, int paramInt, String paramString1, Uri paramUri, String paramString2, String paramString3);
  
  public abstract PendingResult remove(GoogleApiClient paramGoogleApiClient, String paramString);
  
  public abstract PendingResult write(GoogleApiClient paramGoogleApiClient, Moment paramMoment);
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\plus\Moments.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */