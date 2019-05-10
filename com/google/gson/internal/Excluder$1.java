package com.google.gson.internal;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

class Excluder$1
  extends TypeAdapter
{
  private TypeAdapter delegate;
  
  Excluder$1(Excluder paramExcluder, boolean paramBoolean1, boolean paramBoolean2, Gson paramGson, TypeToken paramTypeToken) {}
  
  private TypeAdapter delegate()
  {
    Object localObject = this.delegate;
    if (localObject != null) {}
    for (;;)
    {
      return (TypeAdapter)localObject;
      localObject = this.val$gson;
      Excluder localExcluder = this.this$0;
      TypeToken localTypeToken = this.val$type;
      localObject = ((Gson)localObject).getDelegateAdapter(localExcluder, localTypeToken);
      this.delegate = ((TypeAdapter)localObject);
    }
  }
  
  public Object read(JsonReader paramJsonReader)
  {
    boolean bool = this.val$skipDeserialize;
    if (bool)
    {
      paramJsonReader.skipValue();
      bool = false;
    }
    for (Object localObject = null;; localObject = delegate().read(paramJsonReader)) {
      return localObject;
    }
  }
  
  public void write(JsonWriter paramJsonWriter, Object paramObject)
  {
    boolean bool = this.val$skipSerialize;
    if (bool) {
      paramJsonWriter.nullValue();
    }
    for (;;)
    {
      return;
      TypeAdapter localTypeAdapter = delegate();
      localTypeAdapter.write(paramJsonWriter, paramObject);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\gson\internal\Excluder$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */