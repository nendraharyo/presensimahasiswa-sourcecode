package com.google.android.gms.internal;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.zza;
import com.google.android.gms.common.api.Api.zzc;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.internal.zzq;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.nearby.Nearby;
import com.google.android.gms.nearby.connection.AppMetadata;
import com.google.android.gms.nearby.connection.Connections;
import com.google.android.gms.nearby.connection.Connections.ConnectionRequestListener;
import com.google.android.gms.nearby.connection.Connections.ConnectionResponseCallback;
import com.google.android.gms.nearby.connection.Connections.EndpointDiscoveryListener;
import com.google.android.gms.nearby.connection.Connections.MessageListener;
import java.util.List;

public final class zzql
  implements Connections
{
  public static final Api.zzc zzUI;
  public static final Api.zza zzUJ;
  
  static
  {
    Object localObject = new com/google/android/gms/common/api/Api$zzc;
    ((Api.zzc)localObject).<init>();
    zzUI = (Api.zzc)localObject;
    localObject = new com/google/android/gms/internal/zzql$1;
    ((zzql.1)localObject).<init>();
    zzUJ = (Api.zza)localObject;
  }
  
  public static zzqk zzd(GoogleApiClient paramGoogleApiClient, boolean paramBoolean)
  {
    if (paramGoogleApiClient != null) {}
    for (boolean bool = true;; bool = false)
    {
      zzx.zzb(bool, "GoogleApiClient parameter is required.");
      zzx.zza(paramGoogleApiClient.isConnected(), "GoogleApiClient must be connected.");
      return zze(paramGoogleApiClient, paramBoolean);
    }
  }
  
  public static zzqk zze(GoogleApiClient paramGoogleApiClient, boolean paramBoolean)
  {
    Object localObject = Nearby.CONNECTIONS_API;
    boolean bool = paramGoogleApiClient.zza((Api)localObject);
    String str = "GoogleApiClient is not configured to use the Nearby Connections Api. Pass Nearby.CONNECTIONS_API into GoogleApiClient.Builder#addApi() to use this feature.";
    zzx.zza(bool, str);
    localObject = Nearby.CONNECTIONS_API;
    bool = paramGoogleApiClient.hasConnectedApi((Api)localObject);
    if ((paramBoolean) && (!bool))
    {
      localObject = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject).<init>("GoogleApiClient has an optional Nearby.CONNECTIONS_API and is not connected to Nearby Connections. Use GoogleApiClient.hasConnectedApi(Nearby.CONNECTIONS_API) to guard this call.");
      throw ((Throwable)localObject);
    }
    if (bool) {
      localObject = zzUI;
    }
    for (localObject = (zzqk)paramGoogleApiClient.zza((Api.zzc)localObject);; localObject = null)
    {
      return (zzqk)localObject;
      bool = false;
    }
  }
  
  public PendingResult acceptConnectionRequest(GoogleApiClient paramGoogleApiClient, String paramString, byte[] paramArrayOfByte, Connections.MessageListener paramMessageListener)
  {
    zzq localzzq = paramGoogleApiClient.zzr(paramMessageListener);
    zzql.5 local5 = new com/google/android/gms/internal/zzql$5;
    local5.<init>(this, paramGoogleApiClient, paramString, paramArrayOfByte, localzzq);
    return paramGoogleApiClient.zzb(local5);
  }
  
  public void disconnectFromEndpoint(GoogleApiClient paramGoogleApiClient, String paramString)
  {
    zzd(paramGoogleApiClient, false).zzfA(paramString);
  }
  
  public String getLocalDeviceId(GoogleApiClient paramGoogleApiClient)
  {
    return zzd(paramGoogleApiClient, true).zzEk();
  }
  
  public String getLocalEndpointId(GoogleApiClient paramGoogleApiClient)
  {
    return zzd(paramGoogleApiClient, true).zzEj();
  }
  
  public PendingResult rejectConnectionRequest(GoogleApiClient paramGoogleApiClient, String paramString)
  {
    zzql.6 local6 = new com/google/android/gms/internal/zzql$6;
    local6.<init>(this, paramGoogleApiClient, paramString);
    return paramGoogleApiClient.zzb(local6);
  }
  
  public PendingResult sendConnectionRequest(GoogleApiClient paramGoogleApiClient, String paramString1, String paramString2, byte[] paramArrayOfByte, Connections.ConnectionResponseCallback paramConnectionResponseCallback, Connections.MessageListener paramMessageListener)
  {
    zzq localzzq1 = paramGoogleApiClient.zzr(paramConnectionResponseCallback);
    zzq localzzq2 = paramGoogleApiClient.zzr(paramMessageListener);
    zzql.4 local4 = new com/google/android/gms/internal/zzql$4;
    local4.<init>(this, paramGoogleApiClient, paramString1, paramString2, paramArrayOfByte, localzzq1, localzzq2);
    return paramGoogleApiClient.zzb(local4);
  }
  
  public void sendReliableMessage(GoogleApiClient paramGoogleApiClient, String paramString, byte[] paramArrayOfByte)
  {
    zzqk localzzqk = zzd(paramGoogleApiClient, false);
    String[] arrayOfString = new String[1];
    arrayOfString[0] = paramString;
    localzzqk.zza(arrayOfString, paramArrayOfByte);
  }
  
  public void sendReliableMessage(GoogleApiClient paramGoogleApiClient, List paramList, byte[] paramArrayOfByte)
  {
    zzqk localzzqk = zzd(paramGoogleApiClient, false);
    String[] arrayOfString = new String[paramList.size()];
    arrayOfString = (String[])paramList.toArray(arrayOfString);
    localzzqk.zza(arrayOfString, paramArrayOfByte);
  }
  
  public void sendUnreliableMessage(GoogleApiClient paramGoogleApiClient, String paramString, byte[] paramArrayOfByte)
  {
    zzqk localzzqk = zzd(paramGoogleApiClient, false);
    String[] arrayOfString = new String[1];
    arrayOfString[0] = paramString;
    localzzqk.zzb(arrayOfString, paramArrayOfByte);
  }
  
  public void sendUnreliableMessage(GoogleApiClient paramGoogleApiClient, List paramList, byte[] paramArrayOfByte)
  {
    zzqk localzzqk = zzd(paramGoogleApiClient, false);
    String[] arrayOfString = new String[paramList.size()];
    arrayOfString = (String[])paramList.toArray(arrayOfString);
    localzzqk.zzb(arrayOfString, paramArrayOfByte);
  }
  
  public PendingResult startAdvertising(GoogleApiClient paramGoogleApiClient, String paramString, AppMetadata paramAppMetadata, long paramLong, Connections.ConnectionRequestListener paramConnectionRequestListener)
  {
    zzq localzzq = paramGoogleApiClient.zzr(paramConnectionRequestListener);
    zzql.2 local2 = new com/google/android/gms/internal/zzql$2;
    local2.<init>(this, paramGoogleApiClient, paramString, paramAppMetadata, paramLong, localzzq);
    return paramGoogleApiClient.zzb(local2);
  }
  
  public PendingResult startDiscovery(GoogleApiClient paramGoogleApiClient, String paramString, long paramLong, Connections.EndpointDiscoveryListener paramEndpointDiscoveryListener)
  {
    zzq localzzq = paramGoogleApiClient.zzr(paramEndpointDiscoveryListener);
    zzql.3 local3 = new com/google/android/gms/internal/zzql$3;
    local3.<init>(this, paramGoogleApiClient, paramString, paramLong, localzzq);
    return paramGoogleApiClient.zzb(local3);
  }
  
  public void stopAdvertising(GoogleApiClient paramGoogleApiClient)
  {
    zzd(paramGoogleApiClient, false).zzEl();
  }
  
  public void stopAllEndpoints(GoogleApiClient paramGoogleApiClient)
  {
    zzd(paramGoogleApiClient, false).zzEm();
  }
  
  public void stopDiscovery(GoogleApiClient paramGoogleApiClient, String paramString)
  {
    zzd(paramGoogleApiClient, false).zzfz(paramString);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzql.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */