package com.bumptech.glide.util.pool;

class StateVerifier$DefaultStateVerifier
  extends StateVerifier
{
  private volatile boolean isReleased;
  
  StateVerifier$DefaultStateVerifier()
  {
    super(null);
  }
  
  public void setRecycled(boolean paramBoolean)
  {
    this.isReleased = paramBoolean;
  }
  
  public void throwIfRecycled()
  {
    boolean bool = this.isReleased;
    if (bool)
    {
      IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
      localIllegalStateException.<init>("Already released");
      throw localIllegalStateException;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glid\\util\pool\StateVerifier$DefaultStateVerifier.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */