package com.bumptech.glide.load.engine;

class DecodeJob$ReleaseManager
{
  private boolean isEncodeComplete;
  private boolean isFailed;
  private boolean isReleased;
  
  private boolean isComplete(boolean paramBoolean)
  {
    boolean bool = this.isFailed;
    if ((!bool) && (!paramBoolean))
    {
      bool = this.isEncodeComplete;
      if (!bool) {}
    }
    else
    {
      bool = this.isReleased;
      if (!bool) {}
    }
    for (bool = true;; bool = false) {
      return bool;
    }
  }
  
  boolean onEncodeComplete()
  {
    boolean bool = true;
    try
    {
      this.isEncodeComplete = bool;
      bool = false;
      Object localObject1 = null;
      bool = isComplete(false);
      return bool;
    }
    finally {}
  }
  
  boolean onFailed()
  {
    boolean bool = true;
    try
    {
      this.isFailed = bool;
      bool = false;
      Object localObject1 = null;
      bool = isComplete(false);
      return bool;
    }
    finally {}
  }
  
  boolean release(boolean paramBoolean)
  {
    boolean bool = true;
    try
    {
      this.isReleased = bool;
      bool = isComplete(paramBoolean);
      return bool;
    }
    finally {}
  }
  
  void reset()
  {
    Object localObject1 = null;
    try
    {
      this.isEncodeComplete = false;
      localObject1 = null;
      this.isReleased = false;
      localObject1 = null;
      this.isFailed = false;
      return;
    }
    finally {}
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\engine\DecodeJob$ReleaseManager.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */