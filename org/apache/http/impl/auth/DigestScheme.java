package org.apache.http.impl.auth;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.Principal;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpRequest;
import org.apache.http.NameValuePair;
import org.apache.http.RequestLine;
import org.apache.http.auth.AuthenticationException;
import org.apache.http.auth.ChallengeState;
import org.apache.http.auth.Credentials;
import org.apache.http.message.BasicHeaderValueFormatter;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.message.BufferedHeader;
import org.apache.http.protocol.BasicHttpContext;
import org.apache.http.protocol.HttpContext;
import org.apache.http.util.Args;
import org.apache.http.util.CharArrayBuffer;
import org.apache.http.util.EncodingUtils;

public class DigestScheme
  extends RFC2617Scheme
{
  private static final char[] HEXADECIMAL;
  private static final int QOP_AUTH = 2;
  private static final int QOP_AUTH_INT = 1;
  private static final int QOP_MISSING = 0;
  private static final int QOP_UNKNOWN = 255;
  private String a1;
  private String a2;
  private String cnonce;
  private boolean complete;
  private String lastNonce;
  private long nounceCount;
  
  static
  {
    char[] arrayOfChar = new char[16];
    arrayOfChar[0] = 48;
    arrayOfChar[1] = 49;
    arrayOfChar[2] = 50;
    arrayOfChar[3] = 51;
    arrayOfChar[4] = 52;
    arrayOfChar[5] = 53;
    arrayOfChar[6] = 54;
    arrayOfChar[7] = 55;
    arrayOfChar[8] = 56;
    arrayOfChar[9] = 57;
    arrayOfChar[10] = 97;
    arrayOfChar[11] = 98;
    arrayOfChar[12] = 99;
    arrayOfChar[13] = 100;
    arrayOfChar[14] = 101;
    arrayOfChar[15] = 102;
    HEXADECIMAL = arrayOfChar;
  }
  
  public DigestScheme()
  {
    this(localCharset);
  }
  
  public DigestScheme(Charset paramCharset)
  {
    super(paramCharset);
    this.complete = false;
  }
  
  public DigestScheme(ChallengeState paramChallengeState)
  {
    super(paramChallengeState);
  }
  
  public static String createCnonce()
  {
    SecureRandom localSecureRandom = new java/security/SecureRandom;
    localSecureRandom.<init>();
    byte[] arrayOfByte = new byte[8];
    localSecureRandom.nextBytes(arrayOfByte);
    return encode(arrayOfByte);
  }
  
  private Header createDigestHeader(Credentials paramCredentials, HttpRequest paramHttpRequest)
  {
    Object localObject1 = this;
    Object localObject2 = getParameter("uri");
    Object localObject3 = getParameter("realm");
    String str1 = getParameter("nonce");
    String str2 = getParameter("opaque");
    Object localObject4 = getParameter("methodname");
    Object localObject5 = getParameter("algorithm");
    if (localObject5 == null) {
      localObject5 = "MD5";
    }
    Object localObject6 = new java/util/HashSet;
    ((HashSet)localObject6).<init>(8);
    int i = -1;
    Object localObject7 = "qop";
    localObject1 = this;
    Object localObject8 = getParameter((String)localObject7);
    Object localObject9;
    Object localObject10;
    int j;
    if (localObject8 != null)
    {
      localObject7 = new java/util/StringTokenizer;
      localObject9 = ",";
      ((StringTokenizer)localObject7).<init>((String)localObject8, (String)localObject9);
      for (;;)
      {
        boolean bool1 = ((StringTokenizer)localObject7).hasMoreTokens();
        if (!bool1) {
          break;
        }
        localObject9 = ((StringTokenizer)localObject7).nextToken().trim();
        localObject10 = Locale.ENGLISH;
        localObject9 = ((String)localObject9).toLowerCase((Locale)localObject10);
        ((Set)localObject6).add(localObject9);
      }
      localObject1 = paramHttpRequest;
      j = paramHttpRequest instanceof HttpEntityEnclosingRequest;
      if (j != 0)
      {
        localObject7 = "auth-int";
        j = ((Set)localObject6).contains(localObject7);
        if (j != 0)
        {
          i = 1;
          j = i;
        }
      }
    }
    int k;
    for (;;)
    {
      i = -1;
      if (j != i) {
        break label287;
      }
      localObject5 = new org/apache/http/auth/AuthenticationException;
      localObject11 = new java/lang/StringBuilder;
      ((StringBuilder)localObject11).<init>();
      localObject11 = "None of the qop methods is supported: " + (String)localObject8;
      ((AuthenticationException)localObject5).<init>((String)localObject11);
      throw ((Throwable)localObject5);
      localObject7 = "auth";
      k = ((Set)localObject6).contains(localObject7);
      if (k == 0) {
        break;
      }
      i = 2;
      break;
      k = 0;
      localObject7 = null;
    }
    label287:
    localObject1 = this;
    Object localObject11 = getParameter("charset");
    if (localObject11 == null) {
      localObject11 = "ISO-8859-1";
    }
    localObject8 = "MD5-sess";
    boolean bool3 = ((String)localObject5).equalsIgnoreCase((String)localObject8);
    if (bool3) {}
    label1514:
    label1594:
    label1924:
    label2054:
    label2069:
    label2076:
    label2085:
    BufferedHeader localBufferedHeader;
    for (localObject8 = "MD5";; localObject8 = localBufferedHeader)
    {
      for (;;)
      {
        long l1;
        Object localObject13;
        boolean bool2;
        AuthenticationException localAuthenticationException;
        try
        {
          localObject9 = createMessageDigest((String)localObject8);
          localObject10 = paramCredentials.getUserPrincipal().getName();
          localObject8 = paramCredentials.getPassword();
          localObject1 = this;
          localObject12 = this.lastNonce;
          bool5 = str1.equals(localObject12);
          if (bool5)
          {
            l1 = this.nounceCount;
            long l2 = 1L;
            l1 += l2;
            this.nounceCount = l1;
            localObject12 = new java/lang/StringBuilder;
            int i2 = 256;
            ((StringBuilder)localObject12).<init>(i2);
            localObject13 = new java/util/Formatter;
            localObject14 = Locale.US;
            localObject1 = localObject14;
            ((Formatter)localObject13).<init>((Appendable)localObject12, (Locale)localObject14);
            c1 = '\001';
            c2 = c1;
            Object[] arrayOfObject = new Object[c1];
            localObject1 = this;
            long l3 = this.nounceCount;
            Long localLong = Long.valueOf(l3);
            arrayOfObject[0] = localLong;
            ((Formatter)localObject13).format("%08x", arrayOfObject);
            ((Formatter)localObject13).close();
            localObject13 = ((StringBuilder)localObject12).toString();
            localObject1 = this.cnonce;
            localObject14 = localObject1;
            if (localObject1 == null)
            {
              localObject14 = createCnonce();
              localObject1 = localObject14;
              this.cnonce = ((String)localObject14);
            }
            this.a1 = null;
            c2 = '\000';
            this.a2 = null;
            localObject14 = "MD5-sess";
            localObject1 = localObject14;
            boolean bool7 = ((String)localObject5).equalsIgnoreCase((String)localObject14);
            if (!bool7) {
              break label1514;
            }
            ((StringBuilder)localObject12).setLength(0);
            localObject14 = ((StringBuilder)localObject12).append((String)localObject10).append(':');
            localObject1 = localObject14;
            localObject14 = ((StringBuilder)localObject14).append((String)localObject3);
            c1 = ':';
            localObject14 = ((StringBuilder)localObject14).append(c1);
            localObject1 = localObject14;
            ((StringBuilder)localObject14).append((String)localObject8);
            localObject8 = EncodingUtils.getBytes(((StringBuilder)localObject12).toString(), (String)localObject11);
            localObject8 = encode(((MessageDigest)localObject9).digest((byte[])localObject8));
            ((StringBuilder)localObject12).setLength(0);
            localObject8 = ((StringBuilder)localObject12).append((String)localObject8);
            c2 = ':';
            localObject8 = ((StringBuilder)localObject8).append(c2).append(str1);
            c3 = ':';
            c2 = c3;
            localObject8 = ((StringBuilder)localObject8).append(c3);
            localObject1 = this;
            localObject1 = this.cnonce;
            localObject14 = localObject1;
            ((StringBuilder)localObject8).append((String)localObject1);
            localObject8 = ((StringBuilder)localObject12).toString();
            localObject1 = this;
            this.a1 = ((String)localObject8);
            localObject1 = this;
            localObject8 = EncodingUtils.getBytes(this.a1, (String)localObject11);
            localObject8 = ((MessageDigest)localObject9).digest((byte[])localObject8);
            localObject14 = encode((byte[])localObject8);
            int i1 = 2;
            if (k != i1) {
              break label1594;
            }
            localObject8 = new java/lang/StringBuilder;
            ((StringBuilder)localObject8).<init>();
            localObject8 = ((StringBuilder)localObject8).append((String)localObject4);
            char c4 = ':';
            localObject8 = c4 + (String)localObject2;
            this.a2 = ((String)localObject8);
            localObject1 = this;
            localObject11 = EncodingUtils.getBytes(this.a2, (String)localObject11);
            localObject11 = ((MessageDigest)localObject9).digest((byte[])localObject11);
            localObject8 = encode((byte[])localObject11);
            if (k != 0) {
              break label1924;
            }
            i = 0;
            ((StringBuilder)localObject12).setLength(0);
            localObject1 = localObject14;
            localObject11 = ((StringBuilder)localObject12).append((String)localObject14).append(':').append(str1);
            c4 = ':';
            ((StringBuilder)localObject11).append(c4).append((String)localObject8);
            localObject11 = ((StringBuilder)localObject12).toString();
            localObject11 = EncodingUtils.getAsciiBytes((String)localObject11);
            localObject11 = encode(((MessageDigest)localObject9).digest((byte[])localObject11));
            localObject8 = new org/apache/http/util/CharArrayBuffer;
            ((CharArrayBuffer)localObject8).<init>(128);
            boolean bool8 = isProxy();
            if (!bool8) {
              break label2054;
            }
            localObject4 = "Proxy-Authorization";
            ((CharArrayBuffer)localObject8).append((String)localObject4);
            ((CharArrayBuffer)localObject8).append(": Digest ");
            localObject4 = new java/util/ArrayList;
            int i4 = 20;
            ((ArrayList)localObject4).<init>(i4);
            localObject6 = new org/apache/http/message/BasicNameValuePair;
            ((BasicNameValuePair)localObject6).<init>("username", (String)localObject10);
            ((List)localObject4).add(localObject6);
            localObject6 = new org/apache/http/message/BasicNameValuePair;
            localObject9 = "realm";
            ((BasicNameValuePair)localObject6).<init>((String)localObject9, (String)localObject3);
            ((List)localObject4).add(localObject6);
            localObject3 = new org/apache/http/message/BasicNameValuePair;
            localObject6 = "nonce";
            ((BasicNameValuePair)localObject3).<init>((String)localObject6, str1);
            ((List)localObject4).add(localObject3);
            localObject3 = new org/apache/http/message/BasicNameValuePair;
            str1 = "uri";
            ((BasicNameValuePair)localObject3).<init>(str1, (String)localObject2);
            ((List)localObject4).add(localObject3);
            localObject2 = new org/apache/http/message/BasicNameValuePair;
            localObject3 = "response";
            ((BasicNameValuePair)localObject2).<init>((String)localObject3, (String)localObject11);
            ((List)localObject4).add(localObject2);
            if (k != 0)
            {
              localObject2 = new org/apache/http/message/BasicNameValuePair;
              localObject3 = "qop";
              i = 1;
              if (k != i) {
                break label2069;
              }
              localObject11 = "auth-int";
              ((BasicNameValuePair)localObject2).<init>((String)localObject3, (String)localObject11);
              ((List)localObject4).add(localObject2);
              localObject11 = new org/apache/http/message/BasicNameValuePair;
              ((BasicNameValuePair)localObject11).<init>("nc", (String)localObject13);
              ((List)localObject4).add(localObject11);
              localObject11 = new org/apache/http/message/BasicNameValuePair;
              localObject7 = "cnonce";
              localObject1 = this;
              localObject2 = this.cnonce;
              ((BasicNameValuePair)localObject11).<init>((String)localObject7, (String)localObject2);
              ((List)localObject4).add(localObject11);
            }
            localObject11 = new org/apache/http/message/BasicNameValuePair;
            localObject7 = "algorithm";
            ((BasicNameValuePair)localObject11).<init>((String)localObject7, (String)localObject5);
            ((List)localObject4).add(localObject11);
            if (str2 != null)
            {
              localObject5 = new org/apache/http/message/BasicNameValuePair;
              localObject11 = "opaque";
              ((BasicNameValuePair)localObject5).<init>((String)localObject11, str2);
              ((List)localObject4).add(localObject5);
            }
            int i5 = 0;
            localObject5 = null;
            i = 0;
            localObject11 = null;
            i5 = ((List)localObject4).size();
            if (i >= i5) {
              break;
            }
            localObject5 = (BasicNameValuePair)((List)localObject4).get(i);
            if (i > 0)
            {
              localObject7 = ", ";
              ((CharArrayBuffer)localObject8).append((String)localObject7);
            }
            localObject7 = ((BasicNameValuePair)localObject5).getName();
            localObject2 = "nc";
            boolean bool9 = ((String)localObject2).equals(localObject7);
            if (!bool9)
            {
              localObject2 = "qop";
              bool9 = ((String)localObject2).equals(localObject7);
              if (!bool9)
              {
                localObject2 = "algorithm";
                bool2 = ((String)localObject2).equals(localObject7);
                if (!bool2) {
                  break label2076;
                }
              }
            }
            bool2 = true;
            localObject2 = BasicHeaderValueFormatter.INSTANCE;
            if (bool2) {
              break label2085;
            }
            bool2 = true;
            ((BasicHeaderValueFormatter)localObject2).formatNameValuePair((CharArrayBuffer)localObject8, (NameValuePair)localObject5, bool2);
            int i6 = i + 1;
            i = i6;
            continue;
          }
          l1 = 1L;
        }
        catch (UnsupportedDigestAlgorithmException localUnsupportedDigestAlgorithmException)
        {
          localAuthenticationException = new org/apache/http/auth/AuthenticationException;
          localObject11 = new java/lang/StringBuilder;
          ((StringBuilder)localObject11).<init>();
          localObject11 = "Unsuppported digest algorithm: " + (String)localObject8;
          localAuthenticationException.<init>((String)localObject11);
          throw localAuthenticationException;
        }
        this.nounceCount = l1;
        boolean bool5 = false;
        Object localObject12 = null;
        this.cnonce = null;
        this.lastNonce = str1;
        continue;
        char c3 = '\000';
        char c2 = '\000';
        ((StringBuilder)localObject12).setLength(0);
        Object localObject14 = ((StringBuilder)localObject12).append((String)localObject10).append(':');
        localObject1 = localObject14;
        localObject14 = ((StringBuilder)localObject14).append((String)localObject3);
        char c1 = ':';
        localObject14 = ((StringBuilder)localObject14).append(c1);
        localObject1 = localObject14;
        ((StringBuilder)localObject14).append((String)localObject8);
        localObject8 = ((StringBuilder)localObject12).toString();
        localObject1 = this;
        this.a1 = ((String)localObject8);
        continue;
        boolean bool4 = true;
        int m;
        char c5;
        if (bool2 == bool4)
        {
          bool4 = false;
          localObject8 = null;
          localObject1 = paramHttpRequest;
          int i3 = paramHttpRequest instanceof HttpEntityEnclosingRequest;
          c1 = i3;
          if (i3 != 0)
          {
            paramHttpRequest = (HttpEntityEnclosingRequest)paramHttpRequest;
            localObject8 = paramHttpRequest.getEntity();
          }
          if (localObject8 != null)
          {
            boolean bool6 = ((HttpEntity)localObject8).isRepeatable();
            if (!bool6)
            {
              localObject7 = "auth";
              bool2 = ((Set)localObject6).contains(localObject7);
              if (bool2)
              {
                m = 2;
                localObject8 = new java/lang/StringBuilder;
                ((StringBuilder)localObject8).<init>();
                localObject8 = ((StringBuilder)localObject8).append((String)localObject4);
                c5 = ':';
                localObject8 = c5 + (String)localObject2;
                localObject1 = this;
                this.a2 = ((String)localObject8);
                continue;
              }
              localAuthenticationException = new org/apache/http/auth/AuthenticationException;
              localAuthenticationException.<init>("Qop auth-int cannot be used with a non-repeatable entity");
              throw localAuthenticationException;
            }
          }
          localObject6 = new org/apache/http/impl/auth/HttpEntityDigester;
          ((HttpEntityDigester)localObject6).<init>((MessageDigest)localObject9);
          if (localObject8 != null) {}
          try
          {
            ((HttpEntity)localObject8).writeTo((OutputStream)localObject6);
            ((HttpEntityDigester)localObject6).close();
            localObject8 = new java/lang/StringBuilder;
            ((StringBuilder)localObject8).<init>();
            localObject8 = ((StringBuilder)localObject8).append((String)localObject4).append(':').append((String)localObject2);
            c5 = ':';
            localObject8 = ((StringBuilder)localObject8).append(c5);
            localObject4 = encode(((HttpEntityDigester)localObject6).getDigest());
            localObject8 = (String)localObject4;
            localObject1 = this;
            this.a2 = ((String)localObject8);
          }
          catch (IOException localIOException)
          {
            localObject11 = new org/apache/http/auth/AuthenticationException;
            ((AuthenticationException)localObject11).<init>("I/O error reading entity content", localIOException);
            throw ((Throwable)localObject11);
          }
        }
        else
        {
          localObject8 = new java/lang/StringBuilder;
          ((StringBuilder)localObject8).<init>();
          localObject8 = ((StringBuilder)localObject8).append((String)localObject4);
          c5 = ':';
          localObject8 = c5 + (String)localObject2;
          this.a2 = ((String)localObject8);
          continue;
          ((StringBuilder)localObject12).setLength(0);
          localObject1 = localObject14;
          localObject11 = ((StringBuilder)localObject12).append((String)localObject14).append(':').append(str1).append(':').append((String)localObject13).append(':');
          localObject1 = this;
          localObject4 = this.cnonce;
          localObject11 = ((StringBuilder)localObject11).append((String)localObject4);
          c5 = ':';
          localObject4 = ((StringBuilder)localObject11).append(c5);
          i = 1;
          if (m == i) {}
          for (localObject11 = "auth-int";; localObject11 = "auth")
          {
            localObject11 = ((StringBuilder)localObject4).append((String)localObject11);
            c5 = ':';
            ((StringBuilder)localObject11).append(c5).append((String)localObject8);
            localObject11 = ((StringBuilder)localObject12).toString();
            break;
          }
          localObject4 = "Authorization";
          ((CharArrayBuffer)localObject8).append((String)localObject4);
          continue;
          localObject11 = "auth";
          continue;
          int n = 0;
          localObject7 = null;
          continue;
          n = 0;
          localObject7 = null;
        }
      }
      localBufferedHeader = new org/apache/http/message/BufferedHeader;
      localBufferedHeader.<init>((CharArrayBuffer)localObject8);
      return localBufferedHeader;
    }
  }
  
  private static MessageDigest createMessageDigest(String paramString)
  {
    try
    {
      return MessageDigest.getInstance(paramString);
    }
    catch (Exception localException)
    {
      UnsupportedDigestAlgorithmException localUnsupportedDigestAlgorithmException = new org/apache/http/impl/auth/UnsupportedDigestAlgorithmException;
      Object localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = "Unsupported algorithm in HTTP Digest authentication: " + paramString;
      localUnsupportedDigestAlgorithmException.<init>((String)localObject);
      throw localUnsupportedDigestAlgorithmException;
    }
  }
  
  static String encode(byte[] paramArrayOfByte)
  {
    int i = paramArrayOfByte.length;
    char[] arrayOfChar1 = new char[i * 2];
    int j = 0;
    String str = null;
    while (j < i)
    {
      int k = paramArrayOfByte[j] & 0xF;
      int m = (paramArrayOfByte[j] & 0xF0) >> 4;
      int n = j * 2;
      char[] arrayOfChar2 = HEXADECIMAL;
      m = arrayOfChar2[m];
      arrayOfChar1[n] = m;
      m = j * 2 + 1;
      char[] arrayOfChar3 = HEXADECIMAL;
      k = arrayOfChar3[k];
      arrayOfChar1[m] = k;
      j += 1;
    }
    str = new java/lang/String;
    str.<init>(arrayOfChar1);
    return str;
  }
  
  public Header authenticate(Credentials paramCredentials, HttpRequest paramHttpRequest)
  {
    BasicHttpContext localBasicHttpContext = new org/apache/http/protocol/BasicHttpContext;
    localBasicHttpContext.<init>();
    return authenticate(paramCredentials, paramHttpRequest, localBasicHttpContext);
  }
  
  public Header authenticate(Credentials paramCredentials, HttpRequest paramHttpRequest, HttpContext paramHttpContext)
  {
    Args.notNull(paramCredentials, "Credentials");
    Args.notNull(paramHttpRequest, "HTTP request");
    Object localObject = getParameter("realm");
    if (localObject == null)
    {
      localObject = new org/apache/http/auth/AuthenticationException;
      ((AuthenticationException)localObject).<init>("missing realm in challenge");
      throw ((Throwable)localObject);
    }
    localObject = getParameter("nonce");
    if (localObject == null)
    {
      localObject = new org/apache/http/auth/AuthenticationException;
      ((AuthenticationException)localObject).<init>("missing nonce in challenge");
      throw ((Throwable)localObject);
    }
    localObject = getParameters();
    String str1 = paramHttpRequest.getRequestLine().getMethod();
    ((Map)localObject).put("methodname", str1);
    localObject = getParameters();
    String str2 = "uri";
    str1 = paramHttpRequest.getRequestLine().getUri();
    ((Map)localObject).put(str2, str1);
    localObject = getParameter("charset");
    if (localObject == null)
    {
      localObject = getParameters();
      str2 = "charset";
      str1 = getCredentialsCharset(paramHttpRequest);
      ((Map)localObject).put(str2, str1);
    }
    return createDigestHeader(paramCredentials, paramHttpRequest);
  }
  
  String getA1()
  {
    return this.a1;
  }
  
  String getA2()
  {
    return this.a2;
  }
  
  String getCnonce()
  {
    return this.cnonce;
  }
  
  public String getSchemeName()
  {
    return "digest";
  }
  
  public boolean isComplete()
  {
    String str1 = getParameter("stale");
    String str2 = "true";
    boolean bool = str2.equalsIgnoreCase(str1);
    if (bool)
    {
      bool = false;
      str1 = null;
    }
    for (;;)
    {
      return bool;
      bool = this.complete;
    }
  }
  
  public boolean isConnectionBased()
  {
    return false;
  }
  
  public void overrideParamter(String paramString1, String paramString2)
  {
    getParameters().put(paramString1, paramString2);
  }
  
  public void processChallenge(Header paramHeader)
  {
    super.processChallenge(paramHeader);
    this.complete = true;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder1 = new java/lang/StringBuilder;
    localStringBuilder1.<init>();
    StringBuilder localStringBuilder2 = localStringBuilder1.append("DIGEST [complete=");
    boolean bool = this.complete;
    localStringBuilder2 = localStringBuilder2.append(bool).append(", nonce=");
    String str = this.lastNonce;
    localStringBuilder2 = localStringBuilder2.append(str).append(", nc=");
    long l = this.nounceCount;
    localStringBuilder2.append(l).append("]");
    return localStringBuilder1.toString();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\impl\auth\DigestScheme.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */