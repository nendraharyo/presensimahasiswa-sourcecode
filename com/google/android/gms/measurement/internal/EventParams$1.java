package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.Iterator;
import java.util.Set;

class EventParams$1
  implements Iterator
{
  Iterator zzaVT;
  
  EventParams$1(EventParams paramEventParams)
  {
    Iterator localIterator = EventParams.zza(this.zzaVU).keySet().iterator();
    this.zzaVT = localIterator;
  }
  
  public boolean hasNext()
  {
    return this.zzaVT.hasNext();
  }
  
  public String next()
  {
    return (String)this.zzaVT.next();
  }
  
  public void remove()
  {
    UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
    localUnsupportedOperationException.<init>("Remove not supported");
    throw localUnsupportedOperationException;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\measurement\internal\EventParams$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */