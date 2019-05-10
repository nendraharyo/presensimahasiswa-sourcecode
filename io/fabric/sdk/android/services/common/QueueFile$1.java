package io.fabric.sdk.android.services.common;

import java.io.InputStream;

class QueueFile$1
  implements QueueFile.ElementReader
{
  boolean first = true;
  
  QueueFile$1(QueueFile paramQueueFile, StringBuilder paramStringBuilder) {}
  
  public void read(InputStream paramInputStream, int paramInt)
  {
    boolean bool = this.first;
    StringBuilder localStringBuilder;
    if (bool)
    {
      bool = false;
      localStringBuilder = null;
      this.first = false;
    }
    for (;;)
    {
      this.val$builder.append(paramInt);
      return;
      localStringBuilder = this.val$builder;
      String str = ", ";
      localStringBuilder.append(str);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\io\fabric\sdk\android\services\common\QueueFile$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */