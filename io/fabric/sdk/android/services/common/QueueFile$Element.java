package io.fabric.sdk.android.services.common;

class QueueFile$Element
{
  static final int HEADER_LENGTH = 4;
  static final Element NULL;
  final int length;
  final int position;
  
  static
  {
    Element localElement = new io/fabric/sdk/android/services/common/QueueFile$Element;
    localElement.<init>(0, 0);
    NULL = localElement;
  }
  
  QueueFile$Element(int paramInt1, int paramInt2)
  {
    this.position = paramInt1;
    this.length = paramInt2;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    String str = getClass().getSimpleName();
    localStringBuilder = localStringBuilder.append(str).append("[position = ");
    int i = this.position;
    localStringBuilder = localStringBuilder.append(i).append(", length = ");
    i = this.length;
    return i + "]";
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\io\fabric\sdk\android\services\common\QueueFile$Element.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */