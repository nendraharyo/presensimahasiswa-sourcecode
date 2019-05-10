package com.crashlytics.android.core;

final class ByteString$CodedBuilder
{
  private final byte[] buffer;
  private final CodedOutputStream output;
  
  private ByteString$CodedBuilder(int paramInt)
  {
    Object localObject = new byte[paramInt];
    this.buffer = ((byte[])localObject);
    localObject = CodedOutputStream.newInstance(this.buffer);
    this.output = ((CodedOutputStream)localObject);
  }
  
  public ByteString build()
  {
    this.output.checkNoSpaceLeft();
    ByteString localByteString = new com/crashlytics/android/core/ByteString;
    byte[] arrayOfByte = this.buffer;
    localByteString.<init>(arrayOfByte, null);
    return localByteString;
  }
  
  public CodedOutputStream getCodedOutput()
  {
    return this.output;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\crashlytics\android\core\ByteString$CodedBuilder.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */