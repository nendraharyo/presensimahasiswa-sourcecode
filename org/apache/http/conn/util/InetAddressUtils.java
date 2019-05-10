package org.apache.http.conn.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InetAddressUtils
{
  private static final char COLON_CHAR = ':';
  private static final String IPV4_BASIC_PATTERN_STRING = "(([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])\\.){3}([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])";
  private static final Pattern IPV4_MAPPED_IPV6_PATTERN;
  private static final Pattern IPV4_PATTERN = Pattern.compile("^(([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])\\.){3}([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])$");
  private static final Pattern IPV6_HEX_COMPRESSED_PATTERN = Pattern.compile("^(([0-9A-Fa-f]{1,4}(:[0-9A-Fa-f]{1,4}){0,5})?)::(([0-9A-Fa-f]{1,4}(:[0-9A-Fa-f]{1,4}){0,5})?)$");
  private static final Pattern IPV6_STD_PATTERN;
  private static final int MAX_COLON_COUNT = 7;
  
  static
  {
    IPV4_MAPPED_IPV6_PATTERN = Pattern.compile("^::[fF]{4}:(([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])\\.){3}([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])$");
    IPV6_STD_PATTERN = Pattern.compile("^[0-9a-fA-F]{1,4}(:[0-9a-fA-F]{1,4}){7}$");
  }
  
  public static boolean isIPv4Address(String paramString)
  {
    return IPV4_PATTERN.matcher(paramString).matches();
  }
  
  public static boolean isIPv4MappedIPv64Address(String paramString)
  {
    return IPV4_MAPPED_IPV6_PATTERN.matcher(paramString).matches();
  }
  
  public static boolean isIPv6Address(String paramString)
  {
    boolean bool = isIPv6StdAddress(paramString);
    if (!bool)
    {
      bool = isIPv6HexCompressedAddress(paramString);
      if (!bool) {
        break label22;
      }
    }
    label22:
    for (bool = true;; bool = false) {
      return bool;
    }
  }
  
  public static boolean isIPv6HexCompressedAddress(String paramString)
  {
    boolean bool1 = false;
    int i = 0;
    Matcher localMatcher = null;
    int j = 0;
    for (;;)
    {
      int k = paramString.length();
      if (i >= k) {
        break;
      }
      k = paramString.charAt(i);
      int m = 58;
      if (k == m) {
        j += 1;
      }
      i += 1;
    }
    i = 7;
    if (j <= i)
    {
      localMatcher = IPV6_HEX_COMPRESSED_PATTERN.matcher(paramString);
      boolean bool2 = localMatcher.matches();
      if (bool2) {
        bool1 = true;
      }
    }
    return bool1;
  }
  
  public static boolean isIPv6StdAddress(String paramString)
  {
    return IPV6_STD_PATTERN.matcher(paramString).matches();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\con\\util\InetAddressUtils.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */