package com.bumptech.glide.load;

import com.bumptech.glide.load.engine.Resource;

public abstract interface ResourceDecoder
{
  public abstract Resource decode(Object paramObject, int paramInt1, int paramInt2, Options paramOptions);
  
  public abstract boolean handles(Object paramObject, Options paramOptions);
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\ResourceDecoder.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */