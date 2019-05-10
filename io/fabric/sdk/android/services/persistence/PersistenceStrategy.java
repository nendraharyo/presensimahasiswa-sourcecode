package io.fabric.sdk.android.services.persistence;

public abstract interface PersistenceStrategy
{
  public abstract void clear();
  
  public abstract Object restore();
  
  public abstract void save(Object paramObject);
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\io\fabric\sdk\android\services\persistence\PersistenceStrategy.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */