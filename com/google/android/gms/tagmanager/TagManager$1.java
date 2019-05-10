package com.google.android.gms.tagmanager;

import java.util.Map;

class TagManager$1
  implements DataLayer.zzb
{
  TagManager$1(TagManager paramTagManager) {}
  
  public void zzQ(Map paramMap)
  {
    Object localObject = paramMap.get("event");
    if (localObject != null)
    {
      TagManager localTagManager = this.zzbln;
      localObject = localObject.toString();
      TagManager.zza(localTagManager, (String)localObject);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\tagmanager\TagManager$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */