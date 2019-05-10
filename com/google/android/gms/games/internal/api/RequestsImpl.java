package com.google.android.gms.games.internal.api;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.internal.zzq;
import com.google.android.gms.games.Games;
import com.google.android.gms.games.internal.GamesClientImpl;
import com.google.android.gms.games.request.GameRequest;
import com.google.android.gms.games.request.OnRequestReceivedListener;
import com.google.android.gms.games.request.Requests;
import java.util.ArrayList;
import java.util.List;

public final class RequestsImpl
  implements Requests
{
  public PendingResult acceptRequest(GoogleApiClient paramGoogleApiClient, String paramString)
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    localArrayList.add(paramString);
    return acceptRequests(paramGoogleApiClient, localArrayList);
  }
  
  public PendingResult acceptRequests(GoogleApiClient paramGoogleApiClient, List paramList)
  {
    int i;
    if (paramList == null) {
      i = 0;
    }
    for (String[] arrayOfString = null;; arrayOfString = (String[])paramList.toArray(arrayOfString))
    {
      RequestsImpl.1 local1 = new com/google/android/gms/games/internal/api/RequestsImpl$1;
      local1.<init>(this, paramGoogleApiClient, arrayOfString);
      return paramGoogleApiClient.zzb(local1);
      i = paramList.size();
      arrayOfString = new String[i];
    }
  }
  
  public PendingResult dismissRequest(GoogleApiClient paramGoogleApiClient, String paramString)
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    localArrayList.add(paramString);
    return dismissRequests(paramGoogleApiClient, localArrayList);
  }
  
  public PendingResult dismissRequests(GoogleApiClient paramGoogleApiClient, List paramList)
  {
    int i;
    if (paramList == null) {
      i = 0;
    }
    for (String[] arrayOfString = null;; arrayOfString = (String[])paramList.toArray(arrayOfString))
    {
      RequestsImpl.2 local2 = new com/google/android/gms/games/internal/api/RequestsImpl$2;
      local2.<init>(this, paramGoogleApiClient, arrayOfString);
      return paramGoogleApiClient.zzb(local2);
      i = paramList.size();
      arrayOfString = new String[i];
    }
  }
  
  public ArrayList getGameRequestsFromBundle(Bundle paramBundle)
  {
    Object localObject;
    if (paramBundle != null)
    {
      localObject = "requests";
      boolean bool = paramBundle.containsKey((String)localObject);
      if (bool) {}
    }
    else
    {
      localObject = new java/util/ArrayList;
      ((ArrayList)localObject).<init>();
    }
    for (;;)
    {
      return (ArrayList)localObject;
      localObject = (ArrayList)paramBundle.get("requests");
      ArrayList localArrayList = new java/util/ArrayList;
      localArrayList.<init>();
      int i = 0;
      GameRequest localGameRequest = null;
      int j = ((ArrayList)localObject).size();
      for (int k = 0; k < j; k = i)
      {
        localGameRequest = (GameRequest)((ArrayList)localObject).get(k);
        localArrayList.add(localGameRequest);
        i = k + 1;
      }
      localObject = localArrayList;
    }
  }
  
  public ArrayList getGameRequestsFromInboxResponse(Intent paramIntent)
  {
    Object localObject;
    if (paramIntent == null)
    {
      localObject = new java/util/ArrayList;
      ((ArrayList)localObject).<init>();
    }
    for (;;)
    {
      return (ArrayList)localObject;
      localObject = paramIntent.getExtras();
      localObject = getGameRequestsFromBundle((Bundle)localObject);
    }
  }
  
  public Intent getInboxIntent(GoogleApiClient paramGoogleApiClient)
  {
    return Games.zzh(paramGoogleApiClient).zzwM();
  }
  
  public int getMaxLifetimeDays(GoogleApiClient paramGoogleApiClient)
  {
    return Games.zzh(paramGoogleApiClient).zzwO();
  }
  
  public int getMaxPayloadSize(GoogleApiClient paramGoogleApiClient)
  {
    return Games.zzh(paramGoogleApiClient).zzwN();
  }
  
  public Intent getSendIntent(GoogleApiClient paramGoogleApiClient, int paramInt1, byte[] paramArrayOfByte, int paramInt2, Bitmap paramBitmap, String paramString)
  {
    return Games.zzh(paramGoogleApiClient).zza(paramInt1, paramArrayOfByte, paramInt2, paramBitmap, paramString);
  }
  
  public PendingResult loadRequests(GoogleApiClient paramGoogleApiClient, int paramInt1, int paramInt2, int paramInt3)
  {
    RequestsImpl.3 local3 = new com/google/android/gms/games/internal/api/RequestsImpl$3;
    local3.<init>(this, paramGoogleApiClient, paramInt1, paramInt2, paramInt3);
    return paramGoogleApiClient.zza(local3);
  }
  
  public void registerRequestListener(GoogleApiClient paramGoogleApiClient, OnRequestReceivedListener paramOnRequestReceivedListener)
  {
    GamesClientImpl localGamesClientImpl = Games.zzb(paramGoogleApiClient, false);
    if (localGamesClientImpl != null)
    {
      zzq localzzq = paramGoogleApiClient.zzr(paramOnRequestReceivedListener);
      localGamesClientImpl.zzd(localzzq);
    }
  }
  
  public void unregisterRequestListener(GoogleApiClient paramGoogleApiClient)
  {
    GamesClientImpl localGamesClientImpl = Games.zzb(paramGoogleApiClient, false);
    if (localGamesClientImpl != null) {
      localGamesClientImpl.zzwG();
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\internal\api\RequestsImpl.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */