package com.google.ads;

public enum AdRequest$ErrorCode
{
  private final String description;
  
  static
  {
    int i = 3;
    int j = 2;
    int k = 1;
    Object localObject = new com/google/ads/AdRequest$ErrorCode;
    ((ErrorCode)localObject).<init>("INVALID_REQUEST", 0, "Invalid Ad request.");
    INVALID_REQUEST = (ErrorCode)localObject;
    localObject = new com/google/ads/AdRequest$ErrorCode;
    ((ErrorCode)localObject).<init>("NO_FILL", k, "Ad request successful, but no ad returned due to lack of ad inventory.");
    NO_FILL = (ErrorCode)localObject;
    localObject = new com/google/ads/AdRequest$ErrorCode;
    ((ErrorCode)localObject).<init>("NETWORK_ERROR", j, "A network error occurred.");
    NETWORK_ERROR = (ErrorCode)localObject;
    localObject = new com/google/ads/AdRequest$ErrorCode;
    ((ErrorCode)localObject).<init>("INTERNAL_ERROR", i, "There was an internal error.");
    INTERNAL_ERROR = (ErrorCode)localObject;
    localObject = new ErrorCode[4];
    ErrorCode localErrorCode = INVALID_REQUEST;
    localObject[0] = localErrorCode;
    localErrorCode = NO_FILL;
    localObject[k] = localErrorCode;
    localErrorCode = NETWORK_ERROR;
    localObject[j] = localErrorCode;
    localErrorCode = INTERNAL_ERROR;
    localObject[i] = localErrorCode;
    zzaH = (ErrorCode[])localObject;
  }
  
  private AdRequest$ErrorCode(String paramString1)
  {
    this.description = paramString1;
  }
  
  public String toString()
  {
    return this.description;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\ads\AdRequest$ErrorCode.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */