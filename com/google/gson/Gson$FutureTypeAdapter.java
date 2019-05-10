package com.google.gson;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

class Gson$FutureTypeAdapter
  extends TypeAdapter
{
  private TypeAdapter delegate;
  
  public Object read(JsonReader paramJsonReader)
  {
    Object localObject = this.delegate;
    if (localObject == null)
    {
      localObject = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject).<init>();
      throw ((Throwable)localObject);
    }
    return this.delegate.read(paramJsonReader);
  }
  
  public void setDelegate(TypeAdapter paramTypeAdapter)
  {
    Object localObject = this.delegate;
    if (localObject != null)
    {
      localObject = new java/lang/AssertionError;
      ((AssertionError)localObject).<init>();
      throw ((Throwable)localObject);
    }
    this.delegate = paramTypeAdapter;
  }
  
  public void write(JsonWriter paramJsonWriter, Object paramObject)
  {
    Object localObject = this.delegate;
    if (localObject == null)
    {
      localObject = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject).<init>();
      throw ((Throwable)localObject);
    }
    this.delegate.write(paramJsonWriter, paramObject);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\gson\Gson$FutureTypeAdapter.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */