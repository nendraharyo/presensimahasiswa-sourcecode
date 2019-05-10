package com.google.android.gms.games.request;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import java.util.ArrayList;
import java.util.List;

public abstract interface Requests
{
  public static final String EXTRA_REQUESTS = "requests";
  public static final int MAX_REQUEST_RECIPIENTS = 8;
  public static final int REQUEST_DEFAULT_LIFETIME_DAYS = 255;
  public static final int REQUEST_DIRECTION_INBOUND = 0;
  public static final int REQUEST_DIRECTION_OUTBOUND = 1;
  public static final int REQUEST_UPDATE_OUTCOME_FAIL = 1;
  public static final int REQUEST_UPDATE_OUTCOME_RETRY = 2;
  public static final int REQUEST_UPDATE_OUTCOME_SUCCESS = 0;
  public static final int REQUEST_UPDATE_TYPE_ACCEPT = 0;
  public static final int REQUEST_UPDATE_TYPE_DISMISS = 1;
  public static final int SORT_ORDER_EXPIRING_SOON_FIRST = 0;
  public static final int SORT_ORDER_SOCIAL_AGGREGATION = 1;
  
  public abstract PendingResult acceptRequest(GoogleApiClient paramGoogleApiClient, String paramString);
  
  public abstract PendingResult acceptRequests(GoogleApiClient paramGoogleApiClient, List paramList);
  
  public abstract PendingResult dismissRequest(GoogleApiClient paramGoogleApiClient, String paramString);
  
  public abstract PendingResult dismissRequests(GoogleApiClient paramGoogleApiClient, List paramList);
  
  public abstract ArrayList getGameRequestsFromBundle(Bundle paramBundle);
  
  public abstract ArrayList getGameRequestsFromInboxResponse(Intent paramIntent);
  
  public abstract Intent getInboxIntent(GoogleApiClient paramGoogleApiClient);
  
  public abstract int getMaxLifetimeDays(GoogleApiClient paramGoogleApiClient);
  
  public abstract int getMaxPayloadSize(GoogleApiClient paramGoogleApiClient);
  
  public abstract Intent getSendIntent(GoogleApiClient paramGoogleApiClient, int paramInt1, byte[] paramArrayOfByte, int paramInt2, Bitmap paramBitmap, String paramString);
  
  public abstract PendingResult loadRequests(GoogleApiClient paramGoogleApiClient, int paramInt1, int paramInt2, int paramInt3);
  
  public abstract void registerRequestListener(GoogleApiClient paramGoogleApiClient, OnRequestReceivedListener paramOnRequestReceivedListener);
  
  public abstract void unregisterRequestListener(GoogleApiClient paramGoogleApiClient);
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\request\Requests.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */