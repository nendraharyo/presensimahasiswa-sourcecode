package com.google.gson.stream;

import com.google.gson.internal.JsonReaderInternalAccess;
import com.google.gson.internal.bind.JsonTreeReader;

final class JsonReader$1
  extends JsonReaderInternalAccess
{
  public void promoteNameToValue(JsonReader paramJsonReader)
  {
    boolean bool = paramJsonReader instanceof JsonTreeReader;
    if (bool)
    {
      paramJsonReader = (JsonTreeReader)paramJsonReader;
      paramJsonReader.promoteNameToValue();
    }
    for (;;)
    {
      return;
      int i = paramJsonReader.peeked;
      if (i == 0) {
        i = paramJsonReader.doPeek();
      }
      int j = 13;
      if (i == j)
      {
        i = 9;
        paramJsonReader.peeked = i;
      }
      else
      {
        j = 12;
        if (i == j)
        {
          i = 8;
          paramJsonReader.peeked = i;
        }
        else
        {
          j = 14;
          if (i != j) {
            break;
          }
          i = 10;
          paramJsonReader.peeked = i;
        }
      }
    }
    IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
    Object localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    localObject1 = ((StringBuilder)localObject1).append("Expected a name but was ");
    Object localObject2 = paramJsonReader.peek();
    localObject1 = ((StringBuilder)localObject1).append(localObject2).append(" ").append(" at line ");
    int k = paramJsonReader.getLineNumber();
    localObject1 = ((StringBuilder)localObject1).append(k).append(" column ");
    k = paramJsonReader.getColumnNumber();
    localObject1 = ((StringBuilder)localObject1).append(k).append(" path ");
    localObject2 = paramJsonReader.getPath();
    localObject1 = (String)localObject2;
    localIllegalStateException.<init>((String)localObject1);
    throw localIllegalStateException;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\gson\stream\JsonReader$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */