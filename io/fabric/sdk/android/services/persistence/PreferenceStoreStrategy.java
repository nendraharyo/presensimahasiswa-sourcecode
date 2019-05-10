package io.fabric.sdk.android.services.persistence;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;

public class PreferenceStoreStrategy
  implements PersistenceStrategy
{
  private final String key;
  private final SerializationStrategy serializer;
  private final PreferenceStore store;
  
  public PreferenceStoreStrategy(PreferenceStore paramPreferenceStore, SerializationStrategy paramSerializationStrategy, String paramString)
  {
    this.store = paramPreferenceStore;
    this.serializer = paramSerializationStrategy;
    this.key = paramString;
  }
  
  public void clear()
  {
    SharedPreferences.Editor localEditor = this.store.edit();
    String str = this.key;
    localEditor.remove(str).commit();
  }
  
  public Object restore()
  {
    Object localObject = this.store.get();
    SerializationStrategy localSerializationStrategy = this.serializer;
    String str = this.key;
    localObject = ((SharedPreferences)localObject).getString(str, null);
    return localSerializationStrategy.deserialize((String)localObject);
  }
  
  public void save(Object paramObject)
  {
    PreferenceStore localPreferenceStore = this.store;
    SharedPreferences.Editor localEditor = this.store.edit();
    String str1 = this.key;
    String str2 = this.serializer.serialize(paramObject);
    localEditor = localEditor.putString(str1, str2);
    localPreferenceStore.save(localEditor);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\io\fabric\sdk\android\services\persistence\PreferenceStoreStrategy.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */