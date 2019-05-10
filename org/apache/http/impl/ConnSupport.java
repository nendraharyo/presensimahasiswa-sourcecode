package org.apache.http.impl;

import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import org.apache.http.config.ConnectionConfig;

public final class ConnSupport
{
  public static CharsetDecoder createDecoder(ConnectionConfig paramConnectionConfig)
  {
    CharsetDecoder localCharsetDecoder = null;
    Object localObject;
    if (paramConnectionConfig == null) {
      localObject = null;
    }
    for (;;)
    {
      return (CharsetDecoder)localObject;
      Charset localCharset = paramConnectionConfig.getCharset();
      localObject = paramConnectionConfig.getMalformedInputAction();
      CodingErrorAction localCodingErrorAction = paramConnectionConfig.getUnmappableInputAction();
      if (localCharset != null)
      {
        localCharsetDecoder = localCharset.newDecoder();
        if (localObject != null)
        {
          label39:
          localCharsetDecoder = localCharsetDecoder.onMalformedInput((CodingErrorAction)localObject);
          if (localCodingErrorAction == null) {
            break label69;
          }
        }
        label69:
        for (localObject = localCodingErrorAction;; localObject = CodingErrorAction.REPORT)
        {
          localObject = localCharsetDecoder.onUnmappableCharacter((CodingErrorAction)localObject);
          break;
          localObject = CodingErrorAction.REPORT;
          break label39;
        }
      }
      localObject = null;
    }
  }
  
  public static CharsetEncoder createEncoder(ConnectionConfig paramConnectionConfig)
  {
    Object localObject1 = null;
    if (paramConnectionConfig == null) {}
    do
    {
      return (CharsetEncoder)localObject1;
      localObject2 = paramConnectionConfig.getCharset();
    } while (localObject2 == null);
    localObject1 = paramConnectionConfig.getMalformedInputAction();
    CodingErrorAction localCodingErrorAction = paramConnectionConfig.getUnmappableInputAction();
    Object localObject2 = ((Charset)localObject2).newEncoder();
    if (localObject1 != null)
    {
      label36:
      localObject2 = ((CharsetEncoder)localObject2).onMalformedInput((CodingErrorAction)localObject1);
      if (localCodingErrorAction == null) {
        break label64;
      }
    }
    label64:
    for (localObject1 = localCodingErrorAction;; localObject1 = CodingErrorAction.REPORT)
    {
      localObject1 = ((CharsetEncoder)localObject2).onUnmappableCharacter((CodingErrorAction)localObject1);
      break;
      localObject1 = CodingErrorAction.REPORT;
      break label36;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\impl\ConnSupport.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */