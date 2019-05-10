package com.crashlytics.android.core;

import io.fabric.sdk.android.services.common.QueueFile.ElementReader;
import java.io.InputStream;

class QueueFileLogStore$1
  implements QueueFile.ElementReader
{
  QueueFileLogStore$1(QueueFileLogStore paramQueueFileLogStore, byte[] paramArrayOfByte, int[] paramArrayOfInt) {}
  
  public void read(InputStream paramInputStream, int paramInt)
  {
    try
    {
      Object localObject1 = this.val$logBytes;
      int[] arrayOfInt = this.val$offsetHolder;
      int i = 0;
      int j = arrayOfInt[0];
      paramInputStream.read((byte[])localObject1, j, paramInt);
      localObject1 = this.val$offsetHolder;
      j = 0;
      arrayOfInt = null;
      i = localObject1[0] + paramInt;
      localObject1[0] = i;
      return;
    }
    finally
    {
      paramInputStream.close();
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\crashlytics\android\core\QueueFileLogStore$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */