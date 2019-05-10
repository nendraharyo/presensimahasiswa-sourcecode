package com.bumptech.glide.util.pool;

class StateVerifier$DebugStateVerifier
  extends StateVerifier
{
  private volatile RuntimeException recycledAtStackTraceException;
  
  StateVerifier$DebugStateVerifier()
  {
    super(null);
  }
  
  void setRecycled(boolean paramBoolean)
  {
    RuntimeException localRuntimeException;
    if (paramBoolean)
    {
      localRuntimeException = new java/lang/RuntimeException;
      String str = "Released";
      localRuntimeException.<init>(str);
    }
    for (this.recycledAtStackTraceException = localRuntimeException;; this.recycledAtStackTraceException = null)
    {
      return;
      localRuntimeException = null;
    }
  }
  
  public void throwIfRecycled()
  {
    Object localObject = this.recycledAtStackTraceException;
    if (localObject != null)
    {
      localObject = new java/lang/IllegalStateException;
      RuntimeException localRuntimeException = this.recycledAtStackTraceException;
      ((IllegalStateException)localObject).<init>("Already released", localRuntimeException);
      throw ((Throwable)localObject);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glid\\util\pool\StateVerifier$DebugStateVerifier.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */