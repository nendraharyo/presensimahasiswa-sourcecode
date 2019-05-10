package org.apache.http.pool;

public class PoolStats
{
  private final int available;
  private final int leased;
  private final int max;
  private final int pending;
  
  public PoolStats(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.leased = paramInt1;
    this.pending = paramInt2;
    this.available = paramInt3;
    this.max = paramInt4;
  }
  
  public int getAvailable()
  {
    return this.available;
  }
  
  public int getLeased()
  {
    return this.leased;
  }
  
  public int getMax()
  {
    return this.max;
  }
  
  public int getPending()
  {
    return this.pending;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder.append("[leased: ");
    int i = this.leased;
    localStringBuilder.append(i);
    localStringBuilder.append("; pending: ");
    i = this.pending;
    localStringBuilder.append(i);
    localStringBuilder.append("; available: ");
    i = this.available;
    localStringBuilder.append(i);
    localStringBuilder.append("; max: ");
    i = this.max;
    localStringBuilder.append(i);
    localStringBuilder.append("]");
    return localStringBuilder.toString();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\pool\PoolStats.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */