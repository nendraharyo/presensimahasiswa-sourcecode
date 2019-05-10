package com.google.android.gms.common.api.internal;

import android.os.Handler;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import java.io.FileDescriptor;
import java.io.PrintWriter;

class zzw$zza
  implements GoogleApiClient.OnConnectionFailedListener
{
  public final int zzaiF;
  public final GoogleApiClient zzaiG;
  public final GoogleApiClient.OnConnectionFailedListener zzaiH;
  
  public zzw$zza(zzw paramzzw, int paramInt, GoogleApiClient paramGoogleApiClient, GoogleApiClient.OnConnectionFailedListener paramOnConnectionFailedListener)
  {
    this.zzaiF = paramInt;
    this.zzaiG = paramGoogleApiClient;
    this.zzaiH = paramOnConnectionFailedListener;
    paramGoogleApiClient.registerConnectionFailedListener(this);
  }
  
  public void dump(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
    Object localObject1 = paramPrintWriter.append(paramString).append("GoogleApiClient #");
    int i = this.zzaiF;
    ((PrintWriter)localObject1).print(i);
    paramPrintWriter.println(":");
    localObject1 = this.zzaiG;
    Object localObject2 = new java/lang/StringBuilder;
    ((StringBuilder)localObject2).<init>();
    localObject2 = paramString + "  ";
    ((GoogleApiClient)localObject1).dump((String)localObject2, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
  }
  
  public void onConnectionFailed(ConnectionResult paramConnectionResult)
  {
    Handler localHandler = zzw.zzc(this.zzaiI);
    zzw.zzb localzzb = new com/google/android/gms/common/api/internal/zzw$zzb;
    zzw localzzw = this.zzaiI;
    int i = this.zzaiF;
    localzzb.<init>(localzzw, i, paramConnectionResult);
    localHandler.post(localzzb);
  }
  
  public void zzpR()
  {
    this.zzaiG.unregisterConnectionFailedListener(this);
    this.zzaiG.disconnect();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\common\api\internal\zzw$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */