package io.fabric.sdk.android.services.persistence;

public abstract interface SerializationStrategy
{
  public abstract Object deserialize(String paramString);
  
  public abstract String serialize(Object paramObject);
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\io\fabric\sdk\android\services\persistence\SerializationStrategy.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */