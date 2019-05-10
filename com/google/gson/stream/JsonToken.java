package com.google.gson.stream;

public enum JsonToken
{
  static
  {
    int i = 4;
    int j = 3;
    int k = 2;
    int m = 1;
    Object localObject = new com/google/gson/stream/JsonToken;
    ((JsonToken)localObject).<init>("BEGIN_ARRAY", 0);
    BEGIN_ARRAY = (JsonToken)localObject;
    localObject = new com/google/gson/stream/JsonToken;
    ((JsonToken)localObject).<init>("END_ARRAY", m);
    END_ARRAY = (JsonToken)localObject;
    localObject = new com/google/gson/stream/JsonToken;
    ((JsonToken)localObject).<init>("BEGIN_OBJECT", k);
    BEGIN_OBJECT = (JsonToken)localObject;
    localObject = new com/google/gson/stream/JsonToken;
    ((JsonToken)localObject).<init>("END_OBJECT", j);
    END_OBJECT = (JsonToken)localObject;
    localObject = new com/google/gson/stream/JsonToken;
    ((JsonToken)localObject).<init>("NAME", i);
    NAME = (JsonToken)localObject;
    localObject = new com/google/gson/stream/JsonToken;
    ((JsonToken)localObject).<init>("STRING", 5);
    STRING = (JsonToken)localObject;
    localObject = new com/google/gson/stream/JsonToken;
    ((JsonToken)localObject).<init>("NUMBER", 6);
    NUMBER = (JsonToken)localObject;
    localObject = new com/google/gson/stream/JsonToken;
    ((JsonToken)localObject).<init>("BOOLEAN", 7);
    BOOLEAN = (JsonToken)localObject;
    localObject = new com/google/gson/stream/JsonToken;
    ((JsonToken)localObject).<init>("NULL", 8);
    NULL = (JsonToken)localObject;
    localObject = new com/google/gson/stream/JsonToken;
    ((JsonToken)localObject).<init>("END_DOCUMENT", 9);
    END_DOCUMENT = (JsonToken)localObject;
    localObject = new JsonToken[10];
    JsonToken localJsonToken1 = BEGIN_ARRAY;
    localObject[0] = localJsonToken1;
    localJsonToken1 = END_ARRAY;
    localObject[m] = localJsonToken1;
    localJsonToken1 = BEGIN_OBJECT;
    localObject[k] = localJsonToken1;
    localJsonToken1 = END_OBJECT;
    localObject[j] = localJsonToken1;
    localJsonToken1 = NAME;
    localObject[i] = localJsonToken1;
    JsonToken localJsonToken2 = STRING;
    localObject[5] = localJsonToken2;
    localJsonToken2 = NUMBER;
    localObject[6] = localJsonToken2;
    localJsonToken2 = BOOLEAN;
    localObject[7] = localJsonToken2;
    localJsonToken2 = NULL;
    localObject[8] = localJsonToken2;
    localJsonToken2 = END_DOCUMENT;
    localObject[9] = localJsonToken2;
    $VALUES = (JsonToken[])localObject;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\gson\stream\JsonToken.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */