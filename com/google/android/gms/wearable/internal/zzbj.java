package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.wearable.Channel;
import com.google.android.gms.wearable.ChannelApi.ChannelListener;

final class zzbj
  implements ChannelApi.ChannelListener
{
  private final String zzVo;
  private final ChannelApi.ChannelListener zzbtb;
  
  zzbj(String paramString, ChannelApi.ChannelListener paramChannelListener)
  {
    Object localObject = (String)zzx.zzz(paramString);
    this.zzVo = ((String)localObject);
    localObject = (ChannelApi.ChannelListener)zzx.zzz(paramChannelListener);
    this.zzbtb = ((ChannelApi.ChannelListener)localObject);
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = true;
    if (this == paramObject) {}
    for (;;)
    {
      return bool1;
      boolean bool2 = paramObject instanceof zzbj;
      if (!bool2)
      {
        bool1 = false;
      }
      else
      {
        paramObject = (zzbj)paramObject;
        Object localObject1 = this.zzbtb;
        Object localObject2 = ((zzbj)paramObject).zzbtb;
        bool2 = localObject1.equals(localObject2);
        if (bool2)
        {
          localObject1 = this.zzVo;
          localObject2 = ((zzbj)paramObject).zzVo;
          bool2 = ((String)localObject1).equals(localObject2);
          if (bool2) {}
        }
        else
        {
          bool1 = false;
        }
      }
    }
  }
  
  public int hashCode()
  {
    int i = this.zzVo.hashCode() * 31;
    int j = this.zzbtb.hashCode();
    return i + j;
  }
  
  public void onChannelClosed(Channel paramChannel, int paramInt1, int paramInt2)
  {
    this.zzbtb.onChannelClosed(paramChannel, paramInt1, paramInt2);
  }
  
  public void onChannelOpened(Channel paramChannel)
  {
    this.zzbtb.onChannelOpened(paramChannel);
  }
  
  public void onInputClosed(Channel paramChannel, int paramInt1, int paramInt2)
  {
    this.zzbtb.onInputClosed(paramChannel, paramInt1, paramInt2);
  }
  
  public void onOutputClosed(Channel paramChannel, int paramInt1, int paramInt2)
  {
    this.zzbtb.onOutputClosed(paramChannel, paramInt1, paramInt2);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\wearable\internal\zzbj.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */