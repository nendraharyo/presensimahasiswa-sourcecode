package com.loopj.android.http;

import java.io.File;
import java.io.Serializable;

public class RequestParams$FileWrapper
  implements Serializable
{
  public final String contentType;
  public final String customFileName;
  public final File file;
  
  public RequestParams$FileWrapper(File paramFile, String paramString1, String paramString2)
  {
    this.file = paramFile;
    this.contentType = paramString1;
    this.customFileName = paramString2;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\loopj\android\http\RequestParams$FileWrapper.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */