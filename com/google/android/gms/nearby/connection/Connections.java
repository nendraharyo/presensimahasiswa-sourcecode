package com.google.android.gms.nearby.connection;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.internal.zzmr;
import java.util.List;

public abstract interface Connections
{
  public static final long DURATION_INDEFINITE = 0L;
  public static final int MAX_RELIABLE_MESSAGE_LEN = 4096;
  public static final int MAX_UNRELIABLE_MESSAGE_LEN = 1168;
  public static final List zzbba;
  
  static
  {
    Integer localInteger1 = Integer.valueOf(1);
    Integer localInteger2 = Integer.valueOf(2);
    zzbba = zzmr.zzc(localInteger1, localInteger2);
  }
  
  public abstract PendingResult acceptConnectionRequest(GoogleApiClient paramGoogleApiClient, String paramString, byte[] paramArrayOfByte, Connections.MessageListener paramMessageListener);
  
  public abstract void disconnectFromEndpoint(GoogleApiClient paramGoogleApiClient, String paramString);
  
  public abstract String getLocalDeviceId(GoogleApiClient paramGoogleApiClient);
  
  public abstract String getLocalEndpointId(GoogleApiClient paramGoogleApiClient);
  
  public abstract PendingResult rejectConnectionRequest(GoogleApiClient paramGoogleApiClient, String paramString);
  
  public abstract PendingResult sendConnectionRequest(GoogleApiClient paramGoogleApiClient, String paramString1, String paramString2, byte[] paramArrayOfByte, Connections.ConnectionResponseCallback paramConnectionResponseCallback, Connections.MessageListener paramMessageListener);
  
  public abstract void sendReliableMessage(GoogleApiClient paramGoogleApiClient, String paramString, byte[] paramArrayOfByte);
  
  public abstract void sendReliableMessage(GoogleApiClient paramGoogleApiClient, List paramList, byte[] paramArrayOfByte);
  
  public abstract void sendUnreliableMessage(GoogleApiClient paramGoogleApiClient, String paramString, byte[] paramArrayOfByte);
  
  public abstract void sendUnreliableMessage(GoogleApiClient paramGoogleApiClient, List paramList, byte[] paramArrayOfByte);
  
  public abstract PendingResult startAdvertising(GoogleApiClient paramGoogleApiClient, String paramString, AppMetadata paramAppMetadata, long paramLong, Connections.ConnectionRequestListener paramConnectionRequestListener);
  
  public abstract PendingResult startDiscovery(GoogleApiClient paramGoogleApiClient, String paramString, long paramLong, Connections.EndpointDiscoveryListener paramEndpointDiscoveryListener);
  
  public abstract void stopAdvertising(GoogleApiClient paramGoogleApiClient);
  
  public abstract void stopAllEndpoints(GoogleApiClient paramGoogleApiClient);
  
  public abstract void stopDiscovery(GoogleApiClient paramGoogleApiClient, String paramString);
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\nearby\connection\Connections.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */