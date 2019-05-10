package io.fabric.sdk.android;

public abstract interface InitializationCallback
{
  public static final InitializationCallback EMPTY;
  
  static
  {
    InitializationCallback.Empty localEmpty = new io/fabric/sdk/android/InitializationCallback$Empty;
    localEmpty.<init>(null);
    EMPTY = localEmpty;
  }
  
  public abstract void failure(Exception paramException);
  
  public abstract void success(Object paramObject);
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\io\fabric\sdk\android\InitializationCallback.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */