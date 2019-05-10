package com.bumptech.glide;

import com.bumptech.glide.manager.RequestManagerRetriever.RequestManagerFactory;
import com.bumptech.glide.module.AppGlideModule;
import java.util.Set;

abstract class GeneratedAppGlideModule
  extends AppGlideModule
{
  abstract Set getExcludedModuleClasses();
  
  RequestManagerRetriever.RequestManagerFactory getRequestManagerFactory()
  {
    return null;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\GeneratedAppGlideModule.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */