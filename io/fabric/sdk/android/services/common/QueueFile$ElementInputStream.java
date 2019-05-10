package io.fabric.sdk.android.services.common;

import java.io.InputStream;
import java.io.RandomAccessFile;

final class QueueFile$ElementInputStream
  extends InputStream
{
  private int position;
  private int remaining;
  
  private QueueFile$ElementInputStream(QueueFile paramQueueFile, QueueFile.Element paramElement)
  {
    int i = paramElement.position + 4;
    i = QueueFile.access$100(paramQueueFile, i);
    this.position = i;
    i = paramElement.length;
    this.remaining = i;
  }
  
  public int read()
  {
    int i = this.remaining;
    if (i == 0) {
      i = -1;
    }
    for (;;)
    {
      return i;
      RandomAccessFile localRandomAccessFile = QueueFile.access$400(this.this$0);
      long l = this.position;
      localRandomAccessFile.seek(l);
      localRandomAccessFile = QueueFile.access$400(this.this$0);
      i = localRandomAccessFile.read();
      QueueFile localQueueFile = this.this$0;
      int j = this.position + 1;
      int k = QueueFile.access$100(localQueueFile, j);
      this.position = k;
      k = this.remaining + -1;
      this.remaining = k;
    }
  }
  
  public int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    Object localObject = "buffer";
    QueueFile.access$200(paramArrayOfByte, (String)localObject);
    int i = paramInt1 | paramInt2;
    if (i >= 0)
    {
      i = paramArrayOfByte.length - paramInt1;
      if (paramInt2 <= i) {}
    }
    else
    {
      localObject = new java/lang/ArrayIndexOutOfBoundsException;
      ((ArrayIndexOutOfBoundsException)localObject).<init>();
      throw ((Throwable)localObject);
    }
    i = this.remaining;
    if (i > 0)
    {
      i = this.remaining;
      if (paramInt2 > i) {
        paramInt2 = this.remaining;
      }
      localObject = this.this$0;
      int j = this.position;
      QueueFile.access$300((QueueFile)localObject, j, paramArrayOfByte, paramInt1, paramInt2);
      localObject = this.this$0;
      j = this.position + paramInt2;
      i = QueueFile.access$100((QueueFile)localObject, j);
      this.position = i;
      i = this.remaining - paramInt2;
      this.remaining = i;
    }
    for (;;)
    {
      return paramInt2;
      paramInt2 = -1;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\io\fabric\sdk\android\services\common\QueueFile$ElementInputStream.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */