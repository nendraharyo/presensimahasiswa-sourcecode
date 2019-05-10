package org.apache.http.entity;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import org.apache.http.util.Args;

public class SerializableEntity
  extends AbstractHttpEntity
{
  private Serializable objRef;
  private byte[] objSer;
  
  public SerializableEntity(Serializable paramSerializable)
  {
    Args.notNull(paramSerializable, "Source object");
    this.objRef = paramSerializable;
  }
  
  public SerializableEntity(Serializable paramSerializable, boolean paramBoolean)
  {
    String str = "Source object";
    Args.notNull(paramSerializable, str);
    if (paramBoolean) {
      createBytes(paramSerializable);
    }
    for (;;)
    {
      return;
      this.objRef = paramSerializable;
    }
  }
  
  private void createBytes(Serializable paramSerializable)
  {
    Object localObject = new java/io/ByteArrayOutputStream;
    ((ByteArrayOutputStream)localObject).<init>();
    ObjectOutputStream localObjectOutputStream = new java/io/ObjectOutputStream;
    localObjectOutputStream.<init>((OutputStream)localObject);
    localObjectOutputStream.writeObject(paramSerializable);
    localObjectOutputStream.flush();
    localObject = ((ByteArrayOutputStream)localObject).toByteArray();
    this.objSer = ((byte[])localObject);
  }
  
  public InputStream getContent()
  {
    Object localObject = this.objSer;
    if (localObject == null)
    {
      localObject = this.objRef;
      createBytes((Serializable)localObject);
    }
    localObject = new java/io/ByteArrayInputStream;
    byte[] arrayOfByte = this.objSer;
    ((ByteArrayInputStream)localObject).<init>(arrayOfByte);
    return (InputStream)localObject;
  }
  
  public long getContentLength()
  {
    byte[] arrayOfByte = this.objSer;
    if (arrayOfByte == null) {}
    int i;
    for (long l = -1;; l = i)
    {
      return l;
      arrayOfByte = this.objSer;
      i = arrayOfByte.length;
    }
  }
  
  public boolean isRepeatable()
  {
    return true;
  }
  
  public boolean isStreaming()
  {
    byte[] arrayOfByte = this.objSer;
    boolean bool;
    if (arrayOfByte == null) {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      arrayOfByte = null;
    }
  }
  
  public void writeTo(OutputStream paramOutputStream)
  {
    Args.notNull(paramOutputStream, "Output stream");
    Object localObject = this.objSer;
    if (localObject == null)
    {
      localObject = new java/io/ObjectOutputStream;
      ((ObjectOutputStream)localObject).<init>(paramOutputStream);
      Serializable localSerializable = this.objRef;
      ((ObjectOutputStream)localObject).writeObject(localSerializable);
      ((ObjectOutputStream)localObject).flush();
    }
    for (;;)
    {
      return;
      localObject = this.objSer;
      paramOutputStream.write((byte[])localObject);
      paramOutputStream.flush();
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\entity\SerializableEntity.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */