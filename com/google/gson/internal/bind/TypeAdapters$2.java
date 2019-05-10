package com.google.gson.internal.bind;

import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.util.BitSet;

final class TypeAdapters$2
  extends TypeAdapter
{
  public BitSet read(JsonReader paramJsonReader)
  {
    int i = 1;
    StringBuilder localStringBuilder = null;
    Object localObject1 = paramJsonReader.peek();
    Object localObject2 = JsonToken.NULL;
    int j;
    if (localObject1 == localObject2)
    {
      paramJsonReader.nextNull();
      j = 0;
    }
    BitSet localBitSet;
    for (localObject1 = null;; localObject1 = localBitSet)
    {
      return (BitSet)localObject1;
      localBitSet = new java/util/BitSet;
      localBitSet.<init>();
      paramJsonReader.beginArray();
      localObject1 = paramJsonReader.peek();
      int m = 0;
      localObject2 = null;
      Object localObject3 = JsonToken.END_ARRAY;
      if (localObject1 != localObject3)
      {
        localObject3 = TypeAdapters.36.$SwitchMap$com$google$gson$stream$JsonToken;
        int n = ((JsonToken)localObject1).ordinal();
        int i1 = localObject3[n];
        switch (i1)
        {
        default: 
          localObject2 = new com/google/gson/JsonSyntaxException;
          localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>();
          localObject1 = "Invalid bitset value type: " + localObject1;
          ((JsonSyntaxException)localObject2).<init>((String)localObject1);
          throw ((Throwable)localObject2);
        case 1: 
          j = paramJsonReader.nextInt();
          if (j != 0) {
            j = i;
          }
          break;
        }
        for (;;)
        {
          if (j != 0) {
            localBitSet.set(m);
          }
          m += 1;
          localObject1 = paramJsonReader.peek();
          break;
          j = 0;
          localObject1 = null;
          continue;
          boolean bool = paramJsonReader.nextBoolean();
          continue;
          localObject1 = paramJsonReader.nextString();
          try
          {
            int k = Integer.parseInt((String)localObject1);
            if (k != 0)
            {
              k = i;
            }
            else
            {
              k = 0;
              localObject1 = null;
            }
          }
          catch (NumberFormatException localNumberFormatException)
          {
            JsonSyntaxException localJsonSyntaxException = new com/google/gson/JsonSyntaxException;
            localStringBuilder = new java/lang/StringBuilder;
            localStringBuilder.<init>();
            localObject1 = "Error: Expecting: bitset number value (1, 0), Found: " + (String)localObject1;
            localJsonSyntaxException.<init>((String)localObject1);
            throw localJsonSyntaxException;
          }
        }
      }
      paramJsonReader.endArray();
    }
  }
  
  public void write(JsonWriter paramJsonWriter, BitSet paramBitSet)
  {
    if (paramBitSet == null) {
      paramJsonWriter.nullValue();
    }
    for (;;)
    {
      return;
      paramJsonWriter.beginArray();
      int i = 0;
      int j = paramBitSet.length();
      if (i < j)
      {
        boolean bool = paramBitSet.get(i);
        if (bool) {}
        for (bool = true;; bool = false)
        {
          long l = bool;
          paramJsonWriter.value(l);
          i += 1;
          break;
        }
      }
      paramJsonWriter.endArray();
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\gson\internal\bind\TypeAdapters$2.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */