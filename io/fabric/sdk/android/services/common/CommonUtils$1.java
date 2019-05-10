package io.fabric.sdk.android.services.common;

import java.io.File;
import java.util.Comparator;

final class CommonUtils$1
  implements Comparator
{
  public int compare(File paramFile1, File paramFile2)
  {
    long l1 = paramFile1.lastModified();
    long l2 = paramFile2.lastModified();
    return (int)(l1 - l2);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\io\fabric\sdk\android\services\common\CommonUtils$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */