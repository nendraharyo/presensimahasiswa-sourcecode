package com.google.android.gms.internal;

import com.google.android.gms.cast.internal.zzl;
import com.google.android.gms.cast.internal.zzo;
import org.json.JSONObject;

class zzli$2
  extends zzli.zza
{
  zzli$2(zzli paramzzli, int paramInt, String paramString, JSONObject paramJSONObject)
  {
    super(paramzzli);
  }
  
  public void execute()
  {
    int i = zzll.zzbh(this.zzacP);
    Object localObject2;
    Object localObject3;
    JSONObject localJSONObject;
    Object localObject4;
    if (i == 0)
    {
      Object localObject1 = zznW();
      long l = -1;
      int j = 2001;
      ((zzo)localObject1).zza(l, j, null);
      localObject1 = zzli.zznV();
      localObject2 = "sendPlayerRequest for unsupported playerState: %d";
      int k = 1;
      localObject3 = new Object[k];
      localJSONObject = null;
      int m = this.zzacP;
      localObject4 = Integer.valueOf(m);
      localObject3[0] = localObject4;
      ((zzl)localObject1).zzf((String)localObject2, (Object[])localObject3);
    }
    for (;;)
    {
      return;
      localObject2 = this.zzacN;
      localObject3 = this.zzacQ;
      localJSONObject = this.zzacR;
      localObject4 = zznW();
      zzli.zza((zzli)localObject2, (String)localObject3, i, localJSONObject, (zzo)localObject4);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzli$2.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */