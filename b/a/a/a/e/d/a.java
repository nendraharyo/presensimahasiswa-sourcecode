package b.a.a.a.e.d;

import b.a.a.a.h.b;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.StringTokenizer;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.security.auth.x500.X500Principal;

public abstract class a
  implements l
{
  private static final String[] b;
  public b a;
  
  static
  {
    String[] arrayOfString = new String[14];
    arrayOfString[0] = "ac";
    arrayOfString[1] = "co";
    arrayOfString[2] = "com";
    arrayOfString[3] = "ed";
    arrayOfString[4] = "edu";
    arrayOfString[5] = "go";
    arrayOfString[6] = "gouv";
    arrayOfString[7] = "gov";
    arrayOfString[8] = "info";
    arrayOfString[9] = "lg";
    arrayOfString[10] = "ne";
    arrayOfString[11] = "net";
    arrayOfString[12] = "or";
    arrayOfString[13] = "org";
    b = arrayOfString;
    Arrays.sort(b);
  }
  
  public a()
  {
    b localb = new b/a/a/a/h/b;
    Class localClass = getClass();
    localb.<init>(localClass);
    this.a = localb;
  }
  
  public static String[] a(X509Certificate paramX509Certificate)
  {
    Object localObject1 = paramX509Certificate.getSubjectX500Principal().toString();
    try
    {
      localObject1 = b((String)localObject1);
    }
    catch (SSLException localSSLException)
    {
      for (;;)
      {
        Object localObject2 = null;
      }
    }
    return (String[])localObject1;
  }
  
  private static String[] a(X509Certificate paramX509Certificate, String paramString)
  {
    boolean bool1 = d(paramString);
    int i;
    if (bool1) {
      i = 7;
    }
    LinkedList localLinkedList;
    for (int m = i;; m = j)
    {
      localLinkedList = new java/util/LinkedList;
      localLinkedList.<init>();
      try
      {
        localObject = paramX509Certificate.getSubjectAlternativeNames();
      }
      catch (CertificateParsingException localCertificateParsingException)
      {
        for (;;)
        {
          Object localObject;
          Iterator localIterator;
          int j = 0;
          arrayOfString = null;
        }
        boolean bool3 = localLinkedList.isEmpty();
        if (bool3) {
          break label172;
        }
      }
      if (localObject == null) {
        break;
      }
      localIterator = ((Collection)localObject).iterator();
      for (;;)
      {
        boolean bool2 = localIterator.hasNext();
        if (!bool2) {
          break;
        }
        localObject = (List)localIterator.next();
        Integer localInteger = (Integer)((List)localObject).get(0);
        int n = localInteger.intValue();
        if (n == m)
        {
          n = 1;
          localObject = (String)((List)localObject).get(n);
          localLinkedList.add(localObject);
        }
      }
      j = 2;
    }
    int k = localLinkedList.size();
    String[] arrayOfString = new String[k];
    localLinkedList.toArray(arrayOfString);
    for (;;)
    {
      return arrayOfString;
      label172:
      k = 0;
      arrayOfString = null;
    }
  }
  
  static String[] b(String paramString)
  {
    int i = 0;
    String[] arrayOfString = null;
    if (paramString == null) {}
    for (;;)
    {
      return arrayOfString;
      LinkedList localLinkedList = new java/util/LinkedList;
      localLinkedList.<init>();
      StringTokenizer localStringTokenizer = new java/util/StringTokenizer;
      String str1 = ",";
      localStringTokenizer.<init>(paramString, str1);
      for (;;)
      {
        boolean bool1 = localStringTokenizer.hasMoreTokens();
        if (!bool1) {
          break;
        }
        str1 = localStringTokenizer.nextToken();
        String str2 = "CN=";
        int j = str1.indexOf(str2);
        if (j >= 0)
        {
          j += 3;
          str1 = str1.substring(j);
          localLinkedList.add(str1);
        }
      }
      boolean bool2 = localLinkedList.isEmpty();
      if (!bool2)
      {
        i = localLinkedList.size();
        arrayOfString = new String[i];
        localLinkedList.toArray(arrayOfString);
      }
    }
  }
  
  public static int c(String paramString)
  {
    int i = 0;
    int j = 0;
    for (;;)
    {
      int k = paramString.length();
      if (i >= k) {
        break;
      }
      k = paramString.charAt(i);
      int m = 46;
      if (k == m) {
        j += 1;
      }
      i += 1;
    }
    return j;
  }
  
  private static boolean d(String paramString)
  {
    if (paramString != null)
    {
      bool = b.a.a.a.e.e.a.a(paramString);
      if (!bool)
      {
        bool = b.a.a.a.e.e.a.d(paramString);
        if (!bool) {
          break label26;
        }
      }
    }
    label26:
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  private String e(String paramString)
  {
    if (paramString != null)
    {
      boolean bool = b.a.a.a.e.e.a.d(paramString);
      if (bool) {
        break label15;
      }
    }
    for (;;)
    {
      return paramString;
      try
      {
        label15:
        InetAddress localInetAddress = InetAddress.getByName(paramString);
        paramString = localInetAddress.getHostAddress();
      }
      catch (UnknownHostException localUnknownHostException)
      {
        b localb = this.a;
        Object localObject = new java/lang/StringBuilder;
        ((StringBuilder)localObject).<init>();
        String str = "Unexpected error converting ";
        localObject = str + paramString;
        localb.b(localObject, localUnknownHostException);
      }
    }
  }
  
  public final void a(String paramString, X509Certificate paramX509Certificate)
  {
    String[] arrayOfString1 = a(paramX509Certificate);
    String[] arrayOfString2 = a(paramX509Certificate, paramString);
    a(paramString, arrayOfString1, arrayOfString2);
  }
  
  public final void a(String paramString, SSLSocket paramSSLSocket)
  {
    if (paramString == null)
    {
      localObject = new java/lang/NullPointerException;
      ((NullPointerException)localObject).<init>("host to verify is null");
      throw ((Throwable)localObject);
    }
    Object localObject = paramSSLSocket.getSession();
    if (localObject == null)
    {
      paramSSLSocket.getInputStream().available();
      localObject = paramSSLSocket.getSession();
      if (localObject == null)
      {
        paramSSLSocket.startHandshake();
        localObject = paramSSLSocket.getSession();
      }
    }
    localObject = (X509Certificate)localObject.getPeerCertificates()[0];
    a(paramString, (X509Certificate)localObject);
  }
  
  public final void a(String paramString, String[] paramArrayOfString1, String[] paramArrayOfString2, boolean paramBoolean)
  {
    int i = 1;
    Object localObject1 = null;
    Object localObject2 = new java/util/LinkedList;
    ((LinkedList)localObject2).<init>();
    int j;
    if (paramArrayOfString1 != null)
    {
      j = paramArrayOfString1.length;
      if (j > 0)
      {
        localObject3 = paramArrayOfString1[0];
        if (localObject3 != null)
        {
          localObject3 = paramArrayOfString1[0];
          ((LinkedList)localObject2).add(localObject3);
        }
      }
    }
    if (paramArrayOfString2 != null)
    {
      int i1 = paramArrayOfString2.length;
      j = 0;
      localObject3 = null;
      while (j < i1)
      {
        localObject4 = paramArrayOfString2[j];
        if (localObject4 != null) {
          ((LinkedList)localObject2).add(localObject4);
        }
        j += 1;
      }
    }
    boolean bool1 = ((LinkedList)localObject2).isEmpty();
    if (bool1)
    {
      localObject3 = new java/lang/StringBuilder;
      ((StringBuilder)localObject3).<init>();
      localObject3 = "Certificate for <" + paramString + "> doesn't contain CN or DNS subjectAlt";
      localObject1 = new javax/net/ssl/SSLException;
      ((SSLException)localObject1).<init>((String)localObject3);
      throw ((Throwable)localObject1);
    }
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    Object localObject3 = paramString.trim();
    Object localObject4 = Locale.ENGLISH;
    localObject3 = ((String)localObject3).toLowerCase((Locale)localObject4);
    localObject4 = e((String)localObject3);
    localObject2 = ((LinkedList)localObject2).iterator();
    bool1 = false;
    localObject3 = null;
    label497:
    label595:
    label604:
    label613:
    label634:
    label643:
    label661:
    for (;;)
    {
      boolean bool5 = ((Iterator)localObject2).hasNext();
      Object localObject5;
      int n;
      if (bool5)
      {
        localObject3 = (String)((Iterator)localObject2).next();
        localObject5 = Locale.ENGLISH;
        localObject5 = ((String)localObject3).toLowerCase((Locale)localObject5);
        localObject3 = " <";
        localStringBuilder.append((String)localObject3);
        localStringBuilder.append((String)localObject5);
        localStringBuilder.append('>');
        bool1 = ((Iterator)localObject2).hasNext();
        if (bool1)
        {
          localObject3 = " OR";
          localStringBuilder.append((String)localObject3);
        }
        localObject3 = "\\.";
        Object localObject6 = ((String)localObject5).split((String)localObject3);
        int k = localObject6.length;
        int i3 = 3;
        if (k < i3) {
          break label595;
        }
        localObject3 = localObject6[0];
        String str = "*";
        boolean bool2 = ((String)localObject3).endsWith(str);
        if (!bool2) {
          break label595;
        }
        bool2 = a((String)localObject5);
        if (!bool2) {
          break label595;
        }
        bool2 = d(paramString);
        if (bool2) {
          break label595;
        }
        bool2 = i;
        if (!bool2) {
          break label643;
        }
        localObject3 = localObject6[0];
        int i4 = ((String)localObject3).length();
        if (i4 <= i) {
          break label613;
        }
        i4 = ((String)localObject3).length() + -1;
        localObject6 = ((String)localObject3).substring(0, i4);
        int m = ((String)localObject3).length();
        localObject3 = ((String)localObject5).substring(m);
        i3 = ((String)localObject6).length();
        str = ((String)localObject4).substring(i3);
        boolean bool6 = ((String)localObject4).startsWith((String)localObject6);
        if (!bool6) {
          break label604;
        }
        boolean bool3 = str.endsWith((String)localObject3);
        if (!bool3) {
          break label604;
        }
        bool3 = i;
        if ((bool3) && (paramBoolean))
        {
          n = c((String)localObject4);
          int i2 = c((String)localObject5);
          if (n != i2) {
            break label634;
          }
          n = i;
        }
      }
      for (;;)
      {
        if (n == 0) {
          break label661;
        }
        if (n != 0) {
          return;
        }
        localObject3 = new javax/net/ssl/SSLException;
        localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>();
        localObject1 = "hostname in certificate didn't match: <" + paramString + "> !=" + localStringBuilder;
        ((SSLException)localObject3).<init>((String)localObject1);
        throw ((Throwable)localObject3);
        n = 0;
        localObject3 = null;
        break;
        n = 0;
        localObject3 = null;
        break label497;
        localObject3 = ((String)localObject5).substring(i);
        boolean bool4 = ((String)localObject4).endsWith((String)localObject3);
        break label497;
        bool4 = false;
        localObject3 = null;
        continue;
        localObject3 = e((String)localObject5);
        bool4 = ((String)localObject4).equals(localObject3);
      }
    }
  }
  
  boolean a(String paramString)
  {
    int i = 2;
    boolean bool = true;
    Object localObject = paramString.split("\\.");
    int j = localObject.length;
    int k = 3;
    String[] arrayOfString;
    if (j == k)
    {
      arrayOfString = localObject[i];
      j = arrayOfString.length();
      if (j == i) {
        break label49;
      }
    }
    for (;;)
    {
      return bool;
      label49:
      arrayOfString = b;
      localObject = localObject[bool];
      int m = Arrays.binarySearch(arrayOfString, localObject);
      if (m >= 0) {
        bool = false;
      }
    }
  }
  
  public final boolean verify(String paramString, SSLSession paramSSLSession)
  {
    try
    {
      Object localObject1 = paramSSLSession.getPeerCertificates();
      localObject1 = localObject1[0];
      localObject1 = (X509Certificate)localObject1;
      a(paramString, (X509Certificate)localObject1);
      bool = true;
    }
    catch (SSLException localSSLException)
    {
      for (;;)
      {
        boolean bool = false;
        Object localObject2 = null;
      }
    }
    return bool;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\b\a\a\a\e\d\a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */