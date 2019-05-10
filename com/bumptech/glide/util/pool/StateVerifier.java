package com.bumptech.glide.util.pool;

public abstract class StateVerifier
{
  private static final boolean DEBUG;
  
  public static StateVerifier newInstance()
  {
    StateVerifier.DefaultStateVerifier localDefaultStateVerifier = new com/bumptech/glide/util/pool/StateVerifier$DefaultStateVerifier;
    localDefaultStateVerifier.<init>();
    return localDefaultStateVerifier;
  }
  
  abstract void setRecycled(boolean paramBoolean);
  
  public abstract void throwIfRecycled();
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glid\\util\pool\StateVerifier.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */