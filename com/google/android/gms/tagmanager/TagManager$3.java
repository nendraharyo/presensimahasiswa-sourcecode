package com.google.android.gms.tagmanager;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;

class TagManager$3
  implements ComponentCallbacks2
{
  TagManager$3(TagManager paramTagManager) {}
  
  public void onConfigurationChanged(Configuration paramConfiguration) {}
  
  public void onLowMemory() {}
  
  public void onTrimMemory(int paramInt)
  {
    int i = 20;
    if (paramInt == i)
    {
      TagManager localTagManager = this.zzbln;
      localTagManager.dispatch();
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\tagmanager\TagManager$3.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */