package com.google.gson.internal.bind;

import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

class TypeAdapters$35$1
  extends TypeAdapter
{
  TypeAdapters$35$1(TypeAdapters.35 param35, Class paramClass) {}
  
  public Object read(JsonReader paramJsonReader)
  {
    Object localObject1 = this.this$0.val$typeAdapter.read(paramJsonReader);
    if (localObject1 != null)
    {
      Object localObject2 = this.val$requestedType;
      boolean bool = ((Class)localObject2).isInstance(localObject1);
      if (!bool)
      {
        localObject2 = new com/google/gson/JsonSyntaxException;
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>();
        localStringBuilder = localStringBuilder.append("Expected a ");
        String str = this.val$requestedType.getName();
        localStringBuilder = localStringBuilder.append(str).append(" but was ");
        localObject1 = localObject1.getClass().getName();
        localObject1 = (String)localObject1;
        ((JsonSyntaxException)localObject2).<init>((String)localObject1);
        throw ((Throwable)localObject2);
      }
    }
    return localObject1;
  }
  
  public void write(JsonWriter paramJsonWriter, Object paramObject)
  {
    this.this$0.val$typeAdapter.write(paramJsonWriter, paramObject);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\gson\internal\bind\TypeAdapters$35$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */