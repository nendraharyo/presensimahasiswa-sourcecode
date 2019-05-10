package org.apache.http.impl.cookie;

import java.util.Date;
import org.apache.http.cookie.SetCookie2;

public class BasicClientCookie2
  extends BasicClientCookie
  implements SetCookie2
{
  private static final long serialVersionUID = -7744598295706617057L;
  private String commentURL;
  private boolean discard;
  private int[] ports;
  
  public BasicClientCookie2(String paramString1, String paramString2)
  {
    super(paramString1, paramString2);
  }
  
  public Object clone()
  {
    BasicClientCookie2 localBasicClientCookie2 = (BasicClientCookie2)super.clone();
    int[] arrayOfInt = this.ports;
    if (arrayOfInt != null)
    {
      arrayOfInt = (int[])this.ports.clone();
      localBasicClientCookie2.ports = arrayOfInt;
    }
    return localBasicClientCookie2;
  }
  
  public String getCommentURL()
  {
    return this.commentURL;
  }
  
  public int[] getPorts()
  {
    return this.ports;
  }
  
  public boolean isExpired(Date paramDate)
  {
    boolean bool = this.discard;
    if (!bool)
    {
      bool = super.isExpired(paramDate);
      if (!bool) {
        break label23;
      }
    }
    label23:
    for (bool = true;; bool = false) {
      return bool;
    }
  }
  
  public boolean isPersistent()
  {
    boolean bool = this.discard;
    if (!bool)
    {
      bool = super.isPersistent();
      if (!bool) {}
    }
    for (bool = true;; bool = false) {
      return bool;
    }
  }
  
  public void setCommentURL(String paramString)
  {
    this.commentURL = paramString;
  }
  
  public void setDiscard(boolean paramBoolean)
  {
    this.discard = paramBoolean;
  }
  
  public void setPorts(int[] paramArrayOfInt)
  {
    this.ports = paramArrayOfInt;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\impl\cookie\BasicClientCookie2.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */