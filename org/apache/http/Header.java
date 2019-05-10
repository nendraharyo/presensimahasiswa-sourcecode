package org.apache.http;

public abstract interface Header
{
  public abstract HeaderElement[] getElements();
  
  public abstract String getName();
  
  public abstract String getValue();
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\Header.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */