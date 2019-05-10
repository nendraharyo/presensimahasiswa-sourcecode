package com.google.android.gms.internal;

import com.google.android.gms.cast.Cast.CastApi;
import com.google.android.gms.cast.games.GameManagerClient;
import com.google.android.gms.cast.internal.zzo;
import com.google.android.gms.common.api.GoogleApiClient;
import java.io.IOException;

class zzli$1
  extends zzli.zzc
{
  zzli$1(zzli paramzzli, GameManagerClient paramGameManagerClient)
  {
    super(paramzzli, paramGameManagerClient);
  }
  
  public void execute()
  {
    try
    {
      Object localObject1 = this.zzacN;
      localObject1 = zzli.zzc((zzli)localObject1);
      Object localObject2 = this.zzacN;
      localObject2 = zzli.zzb((zzli)localObject2);
      Object localObject3 = this.zzacN;
      localObject3 = ((zzli)localObject3).getNamespace();
      zzli.1.1 local1 = new com/google/android/gms/internal/zzli$1$1;
      local1.<init>(this);
      ((Cast.CastApi)localObject1).setMessageReceivedCallbacks((GoogleApiClient)localObject2, (String)localObject3, local1);
      zzli.zzd(this.zzacN);
      zzli.zze(this.zzacN);
      localObject1 = this.zzacN;
      i = 1100;
      localObject3 = zznW();
      zzli.zza((zzli)localObject1, null, i, null, (zzo)localObject3);
      return;
    }
    catch (IllegalStateException localIllegalStateException)
    {
      for (;;)
      {
        zzo localzzo = zznW();
        long l = -1;
        int i = 8;
        localzzo.zza(l, i, null);
      }
    }
    catch (IOException localIOException)
    {
      for (;;) {}
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzli$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */